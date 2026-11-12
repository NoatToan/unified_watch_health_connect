package i70;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.l;
import l72.s;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b92.a f91953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f91954c;

    public /* synthetic */ a(b92.a aVar, String str, int i14) {
        this.f91952a = i14;
        this.f91953b = aVar;
        this.f91954c = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String strA;
        String strA2;
        String strA3;
        String strA4;
        String strA5;
        String strA6;
        String strA7;
        String strA8;
        String strA9;
        String strA10;
        int i14 = this.f91952a;
        String str = this.f91954c;
        b92.a aVar = this.f91953b;
        k0 k0Var = (k0) obj;
        switch (i14) {
            case 0:
                k0Var.getClass();
                if (aVar != null && (strA = aVar.a("title")) != null) {
                    str = strA;
                }
                h0.n(k0Var, str);
                break;
            case 1:
                k0Var.getClass();
                if (aVar != null && (strA2 = aVar.a("text")) != null) {
                    str = strA2;
                }
                h0.n(k0Var, str);
                break;
            case 2:
                k0Var.getClass();
                if (aVar != null && (strA3 = aVar.a("data")) != null) {
                    str = strA3;
                }
                h0.n(k0Var, str);
                break;
            case 3:
                k0Var.getClass();
                if (aVar != null && (strA4 = aVar.a(TtmlNode.TAG_METADATA)) != null) {
                    str = strA4;
                }
                h0.n(k0Var, str);
                break;
            case 4:
                k0Var.getClass();
                if (aVar != null && (strA5 = aVar.a("data")) != null) {
                    str = strA5;
                }
                h0.n(k0Var, str);
                break;
            case 5:
                k0Var.getClass();
                if (aVar != null && (strA6 = aVar.a("data")) != null) {
                    str = strA6;
                }
                h0.n(k0Var, str);
                break;
            case 6:
                s sVar = s.f111232a;
                k0Var.getClass();
                if (aVar != null && (strA7 = aVar.a("title")) != null) {
                    str = strA7;
                }
                h0.n(k0Var, str);
                break;
            case 7:
                k0Var.getClass();
                if (aVar != null && (strA8 = aVar.a("action")) != null) {
                    str = strA8;
                }
                h0.n(k0Var, str);
                break;
            case 8:
                k0Var.getClass();
                if (aVar != null && (strA9 = aVar.a("text")) != null) {
                    str = strA9;
                }
                h0.n(k0Var, str);
                break;
            default:
                k0Var.getClass();
                if (aVar != null && (strA10 = aVar.a("label_secondary")) != null) {
                    str = strA10;
                }
                h0.n(k0Var, str);
                break;
        }
        return Unit.INSTANCE;
    }
}
