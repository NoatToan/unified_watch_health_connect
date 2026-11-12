package s01;

import c22.k;
import c22.s3;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.l;
import com.garmin.android.apps.connectmobile.l1;
import com.google.gson.Gson;
import gh2.i;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls01/g;", "Ls01/f;", "Le01/a;", "nutritionPreferences", "<init>", "(Le01/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e01.a f155447a;

    public g(e01.a aVar) {
        aVar.getClass();
        this.f155447a = aVar;
    }

    @Override // s01.f
    public final boolean a() {
        Boolean boolA = this.f155447a.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        bv.b.f21239a.getClass();
        bv.b.a();
        k1.f37122a.getClass();
        l.g().getClass();
        return i.f77458c.a().f77477b.c("nutrition_service_mealWindow_inMinutes");
    }

    @Override // s01.f
    public final boolean c() {
        Boolean boolC = this.f155447a.c();
        if (boolC != null) {
            return boolC.booleanValue();
        }
        bv.b.f21239a.getClass();
        bv.b.a();
        k1.f37122a.getClass();
        List list = (List) new Gson().fromJson(((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).e("nutrition_natural_language_logging_enabled"), new l1().getType());
        if (list == null) {
            return false;
        }
        if (list.contains("AnyUser")) {
            return true;
        }
        if (list.contains("DITester")) {
            s3.f23252a.getClass();
            if (s3.a("ROLE_DI_TESTER")) {
                return true;
            }
        }
        if (list.contains("MBTester")) {
            s3.f23252a.getClass();
            if (s3.a("ROLE_MBTESTER")) {
                return true;
            }
        }
        if (!list.contains("AssociateTester")) {
            return false;
        }
        s3.f23252a.getClass();
        return s3.a("ROLE_TESTER_ASSOCIATE");
    }

    @Override // s01.f
    public final boolean e() {
        Boolean boolE = this.f155447a.e();
        if (boolE != null) {
            return boolE.booleanValue();
        }
        bv.b.f21239a.getClass();
        bv.b.a();
        return k1.f37122a.z();
    }
}
