package org.greenrobot.eventbus;

/* JADX INFO: loaded from: classes3.dex */
public class EventBusException extends RuntimeException {
    private static final long serialVersionUID = -2912559384646531479L;

    public EventBusException(String str) {
        super(str);
    }

    public EventBusException(Throwable th3) {
        super(th3);
    }

    public EventBusException(String str, Throwable th3) {
        super(str, th3);
    }
}
