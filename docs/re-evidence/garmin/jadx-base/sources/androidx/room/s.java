package androidx.room;

import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/room/s;", "", "", "size", "<init>", "(I)V", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f10946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f10947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f10948d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f10950f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f10945a = new ReentrantLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReentrantLock f10949e = new ReentrantLock();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/s$a;", "", "<init>", "(Ljava/lang/String;I)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        NO_OP,
        ADD,
        REMOVE
    }

    public s(int i14) {
        this.f10946b = new long[i14];
        this.f10947c = new boolean[i14];
    }

    public final boolean a(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = this.f10945a;
        reentrantLock.lock();
        try {
            boolean z14 = false;
            for (int i14 : iArr) {
                long[] jArr = this.f10946b;
                long j8 = jArr[i14];
                jArr[i14] = 1 + j8;
                if (j8 == 0) {
                    this.f10948d = true;
                    z14 = true;
                }
            }
            return z14 || this.f10948d || this.f10950f;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = this.f10945a;
        reentrantLock.lock();
        try {
            boolean z14 = false;
            for (int i14 : iArr) {
                long[] jArr = this.f10946b;
                long j8 = jArr[i14];
                jArr[i14] = j8 - 1;
                if (j8 == 1) {
                    this.f10948d = true;
                    z14 = true;
                }
            }
            return z14 || this.f10948d || this.f10950f;
        } finally {
            reentrantLock.unlock();
        }
    }
}
