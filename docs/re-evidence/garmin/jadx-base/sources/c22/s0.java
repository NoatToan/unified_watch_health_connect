package c22;

import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc22/s0;", "", "", "eventName", "durationParameterName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DateTime f23249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f23250d;

    public s0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f23247a = str;
        this.f23248b = str2;
        this.f23250d = new ReentrantLock();
    }

    public final void a(DateTime dateTime, DateTime dateTime2) {
        ReentrantLock reentrantLock = this.f23250d;
        reentrantLock.lock();
        try {
            long millis = dateTime2.getMillis() - dateTime.getMillis();
            Bundle bundle = new Bundle();
            bundle.putLong(this.f23248b, millis);
            ht.a aVar = ht.a.f85464a;
            String str = this.f23247a;
            aVar.getClass();
            ht.a.a(bundle, str);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ s0(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? "DurationMillis" : str2);
    }
}
