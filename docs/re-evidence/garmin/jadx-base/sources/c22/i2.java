package c22;

import android.os.Bundle;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import java.util.concurrent.locks.ReentrantLock;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc22/i2;", "", "", "traceName", "eventName", "durationParameterName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DateTime f23091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReentrantLock f23092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Trace f23093f;

    public i2(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f23088a = str;
        this.f23089b = str2;
        this.f23090c = str3;
        this.f23092e = new ReentrantLock();
    }

    public final void a(DateTime dateTime, DateTime dateTime2) {
        ReentrantLock reentrantLock = this.f23092e;
        reentrantLock.lock();
        try {
            long millis = dateTime2.getMillis() - dateTime.getMillis();
            Bundle bundle = new Bundle();
            bundle.putLong(this.f23090c, millis);
            ht.a aVar = ht.a.f85464a;
            String str = this.f23089b;
            aVar.getClass();
            ht.a.a(bundle, str);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(DateTime dateTime) {
        ReentrantLock reentrantLock = this.f23092e;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            reentrantLock.unlock();
            DateTime dateTime2 = this.f23091d;
            if (dateTime2 != null && dateTime2.compareTo((ReadableInstant) dateTime) < 0) {
                a(dateTime2, dateTime);
                Trace trace = this.f23093f;
                if (trace != null) {
                    trace.stop();
                }
            }
            reentrantLock.lock();
            try {
                this.f23091d = null;
                reentrantLock.lock();
                try {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    this.f23093f = null;
                    reentrantLock.unlock();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    public final void c(DateTime dateTime) {
        ReentrantLock reentrantLock = this.f23092e;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            reentrantLock.unlock();
            this.f23091d = dateTime;
            Trace traceNewTrace = FirebasePerformance.getInstance().newTrace(this.f23088a);
            traceNewTrace.start();
            this.f23093f = traceNewTrace;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ i2(String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? "DurationMillis" : str3);
    }
}
