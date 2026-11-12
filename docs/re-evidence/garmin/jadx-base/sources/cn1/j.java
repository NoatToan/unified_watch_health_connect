package cn1;

import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28021c;

    public /* synthetic */ j(String str, String str2, int i14) {
        this.f28019a = i14;
        this.f28020b = str;
        this.f28021c = str2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f28019a;
        String str = this.f28021c;
        String str2 = this.f28020b;
        k0 k0Var = (k0) obj;
        switch (i14) {
            case 0:
                k0Var.getClass();
                h0.n(k0Var, str2 + StringUtils.SPACE + str);
                break;
            case 1:
                k0Var.getClass();
                h0.n(k0Var, str2 + StringUtils.SPACE + str);
                break;
            case 2:
                h0.n(k0Var, str2 + ", " + str);
                break;
            case 3:
                h0.n(k0Var, str2 + ", " + str);
                break;
            case 4:
                h0.n(k0Var, str2 + ", " + str);
                break;
            case 5:
                k0Var.getClass();
                h0.n(k0Var, str2 + StringUtils.SPACE + str);
                break;
            case 6:
                j21.c cVar = j21.c.f96639a;
                k0Var.getClass();
                h0.n(k0Var, str2 + ". " + str);
                break;
            case 7:
                k0Var.getClass();
                h0.n(k0Var, str2 + StringUtils.SPACE + str);
                break;
            case 8:
                k0Var.getClass();
                h0.n(k0Var, str2 + ", " + str + ".");
                break;
            case 9:
                k0Var.getClass();
                String strConcat = str2 != null ? str2.concat(", ") : "";
                if (str == null) {
                    str = "";
                }
                h0.n(k0Var, strConcat.concat(str));
                break;
            case 10:
                k0Var.getClass();
                if (str2 != null) {
                    str = str2;
                }
                h0.n(k0Var, str);
                break;
            case 11:
                k0Var.getClass();
                if (str2 != null) {
                    str = str2;
                }
                h0.n(k0Var, str);
                break;
            case 12:
                k0Var.getClass();
                h0.n(k0Var, str2 + StringUtils.SPACE + str);
                break;
            case 13:
                k0Var.getClass();
                if (str2 != null) {
                    str = str2;
                }
                h0.n(k0Var, str);
                break;
            case 14:
                k0Var.getClass();
                if (str2 != null) {
                    str = str2;
                }
                h0.n(k0Var, str);
                break;
            case 15:
                k0Var.getClass();
                h0.n(k0Var, str2 + StringUtils.SPACE + str);
                break;
            case 16:
                k0Var.getClass();
                h0.n(k0Var, str2 + StringUtils.SPACE + str);
                break;
            default:
                k0Var.getClass();
                h0.n(k0Var, str2 + ", " + str + ".");
                break;
        }
        return Unit.INSTANCE;
    }
}
