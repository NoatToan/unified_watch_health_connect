package zo0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m0;
import r22.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzo0/t;", "Lzo0/p;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements p {
    static {
        new a(null);
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.g)) {
            return null;
        }
        n.g gVar = (n.g) nVar;
        return m0.a.c(m0.f149759e, gVar.f206177a, gVar.f206178b, R.string.lbl_ok, null, 0, null, 248);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        o13.p pVar;
        String strA4 = ((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).a().f178430a.A4("key_show_non_supported_dialog", "");
        List listW = strA4 != null ? d53.w.W(strA4, new String[]{","}) : null;
        if (listW == null || listW.isEmpty() || listW.size() < 2) {
            pVar = null;
        } else {
            String str = (String) listW.get(0);
            String str2 = (String) listW.get(1);
            if (str.length() == 0 || str2.length() == 0) {
                pVar = null;
            } else {
                pVar = new o13.p(str, str2);
            }
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "NonSupportedCountryGEOSDialogHandler", "requestDialogData messageContent[" + pVar + "]");
        if (pVar != null) {
            return new n.g((String) pVar.f128594a, (String) pVar.f128595b);
        }
        return null;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        ((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).a().r("", "");
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo0/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
