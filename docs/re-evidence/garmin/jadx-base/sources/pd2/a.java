package pd2;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f137393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f137394b = new AtomicLong(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f137391d = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeUnit f137392e = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f137390c = new a();

    private a() {
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(16, c.f137395b);
        int i14 = f137391d;
        this.f137393a = new ThreadPoolExecutor(i14 <= 16 ? i14 : 16, 16, 1L, f137392e, priorityBlockingQueue);
    }
}
