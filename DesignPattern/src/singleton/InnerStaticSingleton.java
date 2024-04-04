package singleton;

import java.io.Serializable;

public class InnerStaticSingleton implements Serializable {

    private InnerStaticSingleton() {
    }

    public static InnerStaticSingleton getInstance() {
        return InnerClass.instance;
    }

    public static class InnerClass {
        private static final InnerStaticSingleton instance = new InnerStaticSingleton();
    }
}

/**
 * 자바에서 라이브러리나 프레임워크 없이 가장 안전하게 싱글톤을 생성할 수 있는 방법
 * 이 방법을 사용하면 멀티스레드에 안전하고, Lazy loading을 지원하며, serialization에도 안전한 싱글톤을 만들 수 있다.
 */
