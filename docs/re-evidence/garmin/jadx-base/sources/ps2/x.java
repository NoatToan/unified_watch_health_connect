package ps2;

import android.content.Context;
import android.content.SharedPreferences;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB%\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lps2/x;", "", "Lkotlin/Function1;", "", "Landroid/content/SharedPreferences;", "sharedPrefsFactory", "Les2/a;", "walletItemsDAO", "<init>", "(Le23/l;Les2/a;)V", "Landroid/content/Context;", "appContext", "(Landroid/content/Context;)V", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f140555e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<String, SharedPreferences> f140556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2.a f140557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f140558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f140559d;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(e23.l<? super String, ? extends SharedPreferences> lVar, es2.a aVar) {
        lVar.getClass();
        aVar.getClass();
        this.f140556a = lVar;
        this.f140557b = aVar;
        this.f140558c = o13.m.b(new ov1.u(this, 18));
        this.f140559d = new p(lVar);
    }

    public final void a() {
        p pVar = this.f140559d;
        synchronized (pVar.f140535c) {
            ((SharedPreferences) pVar.f140534b.getValue()).edit().clear().apply();
            Unit unit = Unit.INSTANCE;
        }
        ((SharedPreferences) this.f140558c.getValue()).edit().remove("KEY_USER_ID").remove("KEY_ENVIRONMENT").remove("KEY_IS_FIRST_RUN").apply();
        this.f140557b.deleteAll();
    }

    public final ArrayList b() {
        ArrayList arrayList;
        p pVar = this.f140559d;
        synchronized (pVar.f140535c) {
            try {
                Map<String, ?> all = ((SharedPreferences) pVar.f140534b.getValue()).getAll();
                all.getClass();
                arrayList = new ArrayList();
                Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
                while (it.hasNext()) {
                    hs2.a aVarA = p.a((String) it.next().getValue());
                    if (aVarA != null) {
                        p.f140532d.debug("Loading: " + aVarA);
                    } else {
                        aVarA = null;
                    }
                    if (aVarA != null) {
                        arrayList.add(aVarA);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return arrayList;
    }

    public final hs2.a c(long j8) {
        hs2.a aVarA;
        p pVar = this.f140559d;
        synchronized (pVar.f140535c) {
            aVarA = p.a(((SharedPreferences) pVar.f140534b.getValue()).getString(String.valueOf(j8), null));
        }
        return aVarA;
    }

    public final void d(long j8) {
        p pVar = this.f140559d;
        synchronized (pVar.f140535c) {
            ((SharedPreferences) pVar.f140534b.getValue()).edit().remove(String.valueOf(j8)).apply();
            Unit unit = Unit.INSTANCE;
        }
        this.f140557b.g(j8);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lps2/x$a;", "", "<init>", "()V", "", "WALLET_USER_PREFS_NAME", "Ljava/lang/String;", "KEY_USER_ID", "KEY_ENVIRONMENT", "KEY_IS_FIRST_RUN", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public x(Context context) {
        context.getClass();
        ot.c cVar = new ot.c(context, 5);
        GarminPayCoreDatabase.f52316a.getClass();
        this(cVar, GarminPayCoreDatabase.b.a(context).e());
    }
}
