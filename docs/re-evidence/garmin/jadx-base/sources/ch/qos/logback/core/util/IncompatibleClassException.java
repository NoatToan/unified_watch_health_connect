package ch.qos.logback.core.util;

/* JADX INFO: loaded from: classes7.dex */
public class IncompatibleClassException extends Exception {
    private static final long serialVersionUID = -5823372159561159549L;
    Class<?> obtainedClass;
    Class<?> requestedClass;

    public IncompatibleClassException(Class<?> cls, Class<?> cls2) {
        this.requestedClass = cls;
        this.obtainedClass = cls2;
    }
}
