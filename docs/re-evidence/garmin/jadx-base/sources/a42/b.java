package a42;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p008y1.y0;
import p5.k0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f975c;

    public /* synthetic */ b(ic1.i iVar, Context context, String str) {
        this.f973a = 4;
        this.f975c = context;
        this.f974b = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f973a;
        int i15 = 25;
        Context context = this.f975c;
        String str = this.f974b;
        switch (i14) {
            case 0:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                p5.h0.n(k0Var, oi0.c.A(context, new a03.h(17), str));
                return Unit.INSTANCE;
            case 1:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                p5.h0.n(k0Var2, oi0.c.A(context, new a03.h(i15), str));
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.handalignment.e.f36611b.getClass();
                com.garmin.android.apps.connectmobile.handalignment.e.a.a(context, str);
                return Unit.INSTANCE;
            case 3:
                ha0.d.b bVar = (ha0.d.b) obj;
                bVar.getClass();
                return Boolean.valueOf(d53.w.z(bVar.f82629a.invoke(context), str, true));
            case 4:
                k0 k0Var3 = (k0) obj;
                ic1.i.a aVar = ic1.i.f92620g;
                k0Var3.getClass();
                oi0.b bVar2 = new oi0.b(new l22.a(context), str);
                bVar2.p();
                bVar2.w();
                p5.h0.n(k0Var3, bVar2.f132238b);
                return Unit.INSTANCE;
            case 5:
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                p5.h0.n(k0Var4, oi0.c.A(context, new ig2.d(23), str));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj).getClass();
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    break;
                } catch (ActivityNotFoundException unused) {
                }
                return Unit.INSTANCE;
            case 7:
                k0 k0Var5 = (k0) obj;
                k0Var5.getClass();
                p5.h0.n(k0Var5, oi0.c.A(context, new oe2.g(15), str));
                return Unit.INSTANCE;
            case 8:
                k0 k0Var6 = (k0) obj;
                k0Var6.getClass();
                p5.h0.n(k0Var6, oi0.c.A(context, new p40.h(29), str));
                return Unit.INSTANCE;
            case 9:
                k0 k0Var7 = (k0) obj;
                k0Var7.getClass();
                p5.h0.n(k0Var7, oi0.c.A(context, new p40.h(28), str));
                return Unit.INSTANCE;
            case 10:
                k0 k0Var8 = (k0) obj;
                k0Var8.getClass();
                String string = context.getString(R.string.lbl_current_streak, str);
                string.getClass();
                p5.h0.n(k0Var8, string);
                return Unit.INSTANCE;
            case 11:
                k0 k0Var9 = (k0) obj;
                k0Var9.getClass();
                String string2 = context.getString(R.string.lbl_longest_streak, str);
                string2.getClass();
                p5.h0.n(k0Var9, string2);
                return Unit.INSTANCE;
            case 12:
                k0 k0Var10 = (k0) obj;
                k0Var10.getClass();
                p5.h0.n(k0Var10, oi0.c.A(context, new qv1.l(25), str));
                return Unit.INSTANCE;
            case 13:
                k0 k0Var11 = (k0) obj;
                k0Var11.getClass();
                p5.h0.n(k0Var11, oi0.c.A(context, new qv1.l(24), str));
                return Unit.INSTANCE;
            case 14:
                k0 k0Var12 = (k0) obj;
                k0Var12.getClass();
                p5.h0.n(k0Var12, oi0.c.A(context, new qv1.l(23), str));
                return Unit.INSTANCE;
            case 15:
                k0 k0Var13 = (k0) obj;
                k0Var13.getClass();
                p5.h0.n(k0Var13, oi0.c.A(context, new qv1.l(26), str));
                return Unit.INSTANCE;
            case 16:
                k0 k0Var14 = (k0) obj;
                k0Var14.getClass();
                k42.b.f102880a.getClass();
                p5.h0.n(k0Var14, oi0.c.A(context, new t21.u(22), e5.g(str, StringUtils.SPACE, k42.b.q(context))));
                return Unit.INSTANCE;
            case 17:
                k0 k0Var15 = (k0) obj;
                k0Var15.getClass();
                str.getClass();
                context.getClass();
                p5.h0.n(k0Var15, xy2.b.O(context, str) + StringUtils.SPACE + context.getString(R.string.lbl_overall_stress));
                return Unit.INSTANCE;
            default:
                k0 k0Var16 = (k0) obj;
                k0Var16.getClass();
                p5.h0.n(k0Var16, oi0.c.A(context, new y0(16), str));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(Context context, String str, int i14) {
        this.f973a = i14;
        this.f975c = context;
        this.f974b = str;
    }

    public /* synthetic */ b(String str, Context context, int i14) {
        this.f973a = i14;
        this.f974b = str;
        this.f975c = context;
    }
}
