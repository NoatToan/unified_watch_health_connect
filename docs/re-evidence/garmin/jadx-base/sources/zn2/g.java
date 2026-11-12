package zn2;

import android.content.Context;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzn2/g;", "", "Les2/a;", "walletItemsDAO", "<init>", "(Les2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2.a f205521a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g(es2.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
            Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            bVar.getClass();
            aVar = GarminPayCoreDatabase.b.a(contextC).e();
        }
        this(aVar);
    }

    public final void a(long j8, String str) {
        str.getClass();
        this.f205521a.o(j8, str);
    }

    public final List<fs2.a> b() {
        return this.f205521a.m("FITPAY");
    }

    public g(es2.a aVar) {
        aVar.getClass();
        this.f205521a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
