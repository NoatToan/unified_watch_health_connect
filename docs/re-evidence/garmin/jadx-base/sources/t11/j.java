package t11;

import android.content.Context;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import l72.y0;
import p005kotlin.Metadata;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lt11/j;", "Lh82/c;", "<init>", "()V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f161736f = 0;

    static {
        new a(null);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        h82.c.b bVar = new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1244161, true, new h(this, 0)), 4, null);
        String string = new l22.a(context).getString(R.string.nutrition_101);
        d.f161718a.getClass();
        h82.c.b bVar2 = new h82.c.b("NUTRITION_101", string, null, d.f161719b, 4, null);
        h82.c.b bVar3 = new h82.c.b("HOW_IT_WORKS", context.getString(R.string.common_how_it_works), null, d.f161720c, 4, null);
        h82.c.b bVar4 = new h82.c.b("RECOMMENDATIONS", context.getString(R.string.lbl_recommendations), null, d.f161721d, 4, null);
        h82.c.b bVar5 = new h82.c.b("AUTO_ADJUST_CALORIE_GOAL", context.getString(R.string.lbl_help), null, d.f161722e, 4, null);
        h82.c.b bVar6 = new h82.c.b("NUTRITION_MACRONUTRIENTS", context.getString(R.string.lbl_help), null, d.f161723f, 4, null);
        l22.a aVar = new l22.a(context);
        x0.f23314a.getClass();
        return x.k(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, new h82.c.b("NUTRITION_NUTRIENTS", dh.b.A(aVar.f109162a, g2.b(x0.f23678ve)), null, d.f161724g, 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(2107320805);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(-1170645639, new h(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(this, i14, 24);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lt11/j$a;", "", "<init>", "()V", "", "NUTRITION_101", "Ljava/lang/String;", "HOW_IT_WORKS", "RECOMMENDATIONS", "AUTO_ADJUST_CALORIE_GOAL", "MACRONUTRIENTS", "NUTRIENTS", "CLEVELAND_CLINIC_LINK", "PRODUCT_SUPPORT_LINK", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
