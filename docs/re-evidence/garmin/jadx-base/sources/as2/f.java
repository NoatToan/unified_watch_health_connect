package as2;

import android.annotation.SuppressLint;
import androidx.room.a0;
import androidx.room.w0;
import com.google.common.base.Optional;
import java.lang.Number;
import java.util.concurrent.atomic.AtomicBoolean;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\nB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Las2/f;", "", "T", "", "Las2/i;", "balanceCache", "Las2/j;", "balanceFetcher", "<init>", "(Las2/i;Las2/j;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f<T extends Number> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f12699e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T> f12700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j<T> f12701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Optional<b<T>> f12702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12703d;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f12699e = gt2.b.f79005a.h("PAY#BalanceSynchronizer");
    }

    public f(i<T> iVar, j<T> jVar) {
        iVar.getClass();
        jVar.getClass();
        this.f12700a = iVar;
        this.f12701b = jVar;
        Optional<b<T>> optionalAbsent = Optional.absent();
        optionalAbsent.getClass();
        this.f12702c = optionalAbsent;
        this.f12703d = new AtomicBoolean(false);
    }

    public final e13.b a(String str, boolean z14, boolean z15) {
        str.getClass();
        c cVar = new c(z14, this, str, z15);
        int i14 = w03.b.f181178a;
        return new e13.b(cVar);
    }

    @SuppressLint({"CheckResult"})
    public final void b(String str) {
        str.getClass();
        if (!this.f12702c.isPresent() || DateTime.now().getMillis() - this.f12702c.get().getLastBalanceSyncTimeStamp() >= 30000) {
            e eVar = new e(true, str, 0, this);
            int i14 = w03.b.f181178a;
            new z03.d(eVar).k(l13.a.f108328c).i(new a73.j(new w0(5), 20), new a0(15));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Las2/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
