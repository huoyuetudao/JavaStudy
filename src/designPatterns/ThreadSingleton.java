package designPatterns;

/**
 * 描述:线程安全单例
 *
 * @author: yangxiao2
 */
public class ThreadSingleton {
    //声明一个私有化的单例
    private volatile static ThreadSingleton threadSingleton = null;

    //私有化构造函数
    private ThreadSingleton(){

    }

    //提供一个获取实例的方法
    public  static ThreadSingleton getInstance(){
         //双重加锁
         if(threadSingleton == null) {
             synchronized (ThreadSingleton.class) {
                 if(threadSingleton == null) {
                     threadSingleton = new ThreadSingleton();
                 }
             }
         }
         return threadSingleton;
    }
}
