package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public enum hya {
    ;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RxThreadFactory f20606a = new RxThreadFactory("RxScheduledExecutorPool-");

    public static ScheduledExecutorService a() {
        yta<? extends ScheduledExecutorService> ytaVarA = p5l.a();
        return ytaVarA == null ? b() : ytaVarA.call();
    }

    public static ScheduledExecutorService b() {
        return Executors.newScheduledThreadPool(1, c());
    }

    public static ThreadFactory c() {
        return f20606a;
    }
}
