package as;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import f5.c0;
import f5.d0;
import l72.i3;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f12626c;

    public /* synthetic */ d(Context context, p1 p1Var, int i14) {
        this.f12624a = i14;
        this.f12625b = context;
        this.f12626c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f12624a;
        p1 p1Var = this.f12626c;
        Context context = this.f12625b;
        switch (i14) {
            case 0:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                Resources resources = context.getResources();
                resources.getClass();
                n4.d dVarA = d0.a(c0Var);
                p1Var.setValue(g6.f.a(xy2.b.E(resources, (int) (dVarA.f123549c - dVarA.f123547a))));
                break;
            case 1:
                c0 c0Var2 = (c0) obj;
                c0Var2.getClass();
                Resources resources2 = context.getResources();
                resources2.getClass();
                n4.d dVarA2 = d0.a(c0Var2);
                p1Var.setValue(g6.f.a(xy2.b.E(resources2, (int) (dVarA2.f123549c - dVarA2.f123547a))));
                break;
            case 2:
                c0 c0Var3 = (c0) obj;
                c0Var3.getClass();
                Resources resources3 = context.getResources();
                resources3.getClass();
                n4.d dVarA3 = d0.a(c0Var3);
                float f14 = ((int) (dVarA3.f123549c - dVarA3.f123547a)) / resources3.getDisplayMetrics().density;
                g6.f.a aVar = g6.f.f75994b;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                p1Var.setValue(g6.f.a(f14 + j92.b.f97899b.f97917b));
                break;
            case 3:
                c0 c0Var4 = (c0) obj;
                c0Var4.getClass();
                Resources resources4 = context.getResources();
                resources4.getClass();
                n4.d dVarA4 = d0.a(c0Var4);
                p1Var.setValue(g6.f.a(xy2.b.E(resources4, (int) (dVarA4.f123549c - dVarA4.f123547a))));
                break;
            case 4:
                c0 c0Var5 = (c0) obj;
                c0Var5.getClass();
                Resources resources5 = context.getResources();
                resources5.getClass();
                n4.d dVarA5 = d0.a(c0Var5);
                p1Var.setValue(g6.f.a(xy2.b.E(resources5, (int) (dVarA5.f123549c - dVarA5.f123547a))));
                break;
            case 5:
                c0 c0Var6 = (c0) obj;
                c0Var6.getClass();
                Resources resources6 = context.getResources();
                resources6.getClass();
                n4.d dVarA6 = d0.a(c0Var6);
                p1Var.setValue(g6.f.a(((int) (dVarA6.f123549c - dVarA6.f123547a)) / resources6.getDisplayMetrics().density));
                break;
            case 6:
                c0 c0Var7 = (c0) obj;
                c0Var7.getClass();
                Resources resources7 = context.getResources();
                resources7.getClass();
                n4.d dVarA7 = d0.a(c0Var7);
                p1Var.setValue(g6.f.a(((int) (dVarA7.f123549c - dVarA7.f123547a)) / resources7.getDisplayMetrics().density));
                break;
            case 7:
                c0 c0Var8 = (c0) obj;
                c0Var8.getClass();
                Resources resources8 = context.getResources();
                resources8.getClass();
                n4.d dVarA8 = d0.a(c0Var8);
                p1Var.setValue(g6.f.a(xy2.b.E(resources8, (int) (dVarA8.f123549c - dVarA8.f123547a))));
                break;
            default:
                ((i3) obj).getClass();
                fe1.g.a aVar2 = fe1.g.f70543g;
                boolean zH = dh.b.H(((fe1.o) p1Var.getF182175a()).f70583e);
                aVar2.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("SHOW_RESPIRATION_AVERAGES_EXTRA", zH);
                HelpActivity.a aVar3 = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.RESPIRATION;
                aVar3.getClass();
                HelpActivity.a.d(context, lVar, null, bundle);
                break;
        }
        return Unit.INSTANCE;
    }
}
