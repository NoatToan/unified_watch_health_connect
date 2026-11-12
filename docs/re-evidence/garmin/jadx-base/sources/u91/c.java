package u91;

import android.app.AlertDialog;
import android.webkit.WebView;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p5.h0;
import p5.k0;
import vc0.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f169528b;

    public /* synthetic */ c(String str, int i14) {
        this.f169527a = i14;
        this.f169528b = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f169527a;
        String str = this.f169528b;
        switch (i14) {
            case 0:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                if (str != null) {
                    h0.n(k0Var, str);
                }
                return Unit.INSTANCE;
            case 1:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.n(k0Var2, str);
                return Unit.INSTANCE;
            case 2:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                if (str == null) {
                    str = "";
                }
                h0.n(k0Var3, str);
                return Unit.INSTANCE;
            case 3:
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                h0.n(k0Var4, str);
                return Unit.INSTANCE;
            case 4:
                k0 k0Var5 = (k0) obj;
                k0Var5.getClass();
                h0.n(k0Var5, str);
                return Unit.INSTANCE;
            case 5:
                k0 k0Var6 = (k0) obj;
                k0Var6.getClass();
                h0.n(k0Var6, str);
                return Unit.INSTANCE;
            case 6:
                k0 k0Var7 = (k0) obj;
                k0Var7.getClass();
                h0.n(k0Var7, str);
                return Unit.INSTANCE;
            case 7:
                k0 k0Var8 = (k0) obj;
                k0Var8.getClass();
                h0.n(k0Var8, str);
                return Unit.INSTANCE;
            case 8:
                k0 k0Var9 = (k0) obj;
                k0Var9.getClass();
                h0.n(k0Var9, str);
                return Unit.INSTANCE;
            case 9:
                k0 k0Var10 = (k0) obj;
                k0Var10.getClass();
                h0.n(k0Var10, str);
                return Unit.INSTANCE;
            case 10:
                k0 k0Var11 = (k0) obj;
                k0Var11.getClass();
                h0.n(k0Var11, str);
                return Unit.INSTANCE;
            case 11:
                Throwable th3 = (Throwable) obj;
                Logger logger = u.f177013l;
                th3.getClass();
                kh2.g.f104792a.getClass();
                kh2.g.a.b();
                u.f177013l.error("removeDevice: onFailure", th3);
                kh2.j jVar = u.f177014m;
                if (jVar != null) {
                    jVar.a(str);
                    return Unit.INSTANCE;
                }
                s.m("deviceRemovalOperationDelegate");
                throw null;
            case 12:
                k0 k0Var12 = (k0) obj;
                k0Var12.getClass();
                if (str != null) {
                    h0.n(k0Var12, str);
                }
                return Unit.INSTANCE;
            case 13:
                k0 k0Var13 = (k0) obj;
                k0Var13.getClass();
                h0.n(k0Var13, str);
                return Unit.INSTANCE;
            case 14:
                k0 k0Var14 = (k0) obj;
                k0Var14.getClass();
                h0.n(k0Var14, str);
                return Unit.INSTANCE;
            case 15:
                k0 k0Var15 = (k0) obj;
                k0Var15.getClass();
                h0.n(k0Var15, str);
                return Unit.INSTANCE;
            case 16:
                k0 k0Var16 = (k0) obj;
                k0Var16.getClass();
                h0.n(k0Var16, str);
                return Unit.INSTANCE;
            case 17:
                WebView webView = (WebView) obj;
                webView.getClass();
                webView.loadUrl(str);
                return Unit.INSTANCE;
            case 18:
                k0 k0Var17 = (k0) obj;
                k0Var17.getClass();
                h0.n(k0Var17, str);
                return Unit.INSTANCE;
            case 19:
                k0 k0Var18 = (k0) obj;
                int i15 = wt0.h.f187018c;
                k0Var18.getClass();
                h0.n(k0Var18, str);
                return Unit.INSTANCE;
            case 20:
                k0 k0Var19 = (k0) obj;
                int i16 = wt0.h.f187018c;
                k0Var19.getClass();
                h0.n(k0Var19, str);
                return Unit.INSTANCE;
            case 21:
                k0 k0Var20 = (k0) obj;
                k0Var20.getClass();
                h0.n(k0Var20, str);
                return Unit.INSTANCE;
            case 22:
                k0 k0Var21 = (k0) obj;
                k0Var21.getClass();
                h0.n(k0Var21, str);
                return Unit.INSTANCE;
            case 23:
                k0 k0Var22 = (k0) obj;
                k0Var22.getClass();
                h0.n(k0Var22, str);
                return Unit.INSTANCE;
            case 24:
                Throwable th4 = (Throwable) obj;
                Logger logger2 = xc0.l.f189932m;
                th4.getClass();
                ew2.e.f66901a.getClass();
                AlertDialog alertDialog = ew2.e.f66903c;
                if (alertDialog != null) {
                    alertDialog.cancel();
                }
                xc0.l.f189932m.error("removeDevice: onFailure", th4);
                ew2.f fVar = xc0.l.f189933n;
                if (fVar != null) {
                    fVar.a(str);
                    return Unit.INSTANCE;
                }
                s.m("deviceRemovalOperationDelegate");
                throw null;
            case 25:
                k0 k0Var23 = (k0) obj;
                k0Var23.getClass();
                h0.n(k0Var23, str);
                return Unit.INSTANCE;
            case 26:
                k0 k0Var24 = (k0) obj;
                k0Var24.getClass();
                h0.n(k0Var24, str);
                return Unit.INSTANCE;
            case 27:
                k0 k0Var25 = (k0) obj;
                k0Var25.getClass();
                h0.n(k0Var25, str);
                return Unit.INSTANCE;
            case 28:
                k0 k0Var26 = (k0) obj;
                k0Var26.getClass();
                h0.n(k0Var26, str);
                return Unit.INSTANCE;
            default:
                k0 k0Var27 = (k0) obj;
                k0Var27.getClass();
                h0.n(k0Var27, str);
                return Unit.INSTANCE;
        }
    }
}
