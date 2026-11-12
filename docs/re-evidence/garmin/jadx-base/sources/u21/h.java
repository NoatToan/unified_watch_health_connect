package u21;

import androidx.lifecycle.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu21/h;", "Landroidx/lifecycle/u1;", "Lq01/e;", "meal", "", "allMeals", "", "requiresTimeWindow", "Ls01/f;", "nutritionSettingsConfigProvider", "Lv01/n0;", "getMealNamesWithTranslationsUseCase", "<init>", "(Lq01/e;Ljava/util/List;ZLs01/f;Lv01/n0;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q01.e f167978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<q01.e> f167979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v01.n0 f167981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f167982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f167983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f167984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f167985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f167986i;

    public h(q01.e eVar, List<q01.e> list, boolean z14, s01.f fVar, v01.n0 n0Var) {
        eVar.getClass();
        list.getClass();
        fVar.getClass();
        n0Var.getClass();
        this.f167978a = eVar;
        this.f167979b = list;
        this.f167980c = z14;
        this.f167981d = n0Var;
        boolean zA = fVar.a();
        this.f167982e = zA;
        this.f167983f = o13.m.b(new b21.j(this, 2));
        this.f167984g = o13.m.b(new b21.j(this, 3));
        String str = eVar.f141995c;
        boolean z15 = eVar.f141998f;
        boolean z16 = eVar.f141996d;
        k01.d dVar = eVar.f142002j;
        Integer num = dVar != null ? dVar.f102022a : null;
        int i14 = eVar.f142003k;
        b63.v vVar = eVar.f141999g;
        p2 p2VarA = q2.a(new g(zA, str, z15, z14, z16, null, num, Integer.valueOf(i14), !z14 ? null : new i1(vVar, false, y4(v21.d.f175319w), eVar.f142000h, false, z4(vVar), null, 82, null), false, 544, null));
        this.f167985h = p2VarA;
        this.f167986i = r53.s.d(p2VarA);
    }

    public final void A4(b63.v vVar, b63.v vVar2) {
        b63.v vVar3;
        b63.v vVar4;
        i1 i1VarA;
        while (true) {
            p2 p2Var = this.f167985h;
            Object value = p2Var.getValue();
            g gVar = (g) value;
            i1 i1Var = gVar.f167969i;
            if (i1Var != null) {
                b63.v vVar5 = vVar;
                b63.v vVar6 = vVar2;
                i1VarA = i1.a(i1Var, vVar5, false, vVar6, false, z4(vVar), 68);
                vVar4 = vVar5;
                vVar3 = vVar6;
            } else {
                vVar3 = vVar2;
                vVar4 = vVar;
                i1VarA = null;
            }
            if (p2Var.b(value, g.a(gVar, null, null, null, null, i1VarA, 767))) {
                return;
            }
            vVar = vVar4;
            vVar2 = vVar3;
        }
    }

    public final d0 x4(String str) {
        boolean z14;
        ArrayList arrayListY0 = p13.h0.y0((List) this.f167983f.getValue(), this.f167978a.f141995c);
        boolean z15 = true;
        if (!arrayListY0.isEmpty()) {
            Iterator it = arrayListY0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = false;
                    break;
                }
                if (d53.u.q((String) it.next(), d53.w.i0(str).toString(), true)) {
                    z14 = true;
                    break;
                }
            }
        } else {
            z14 = false;
            break;
        }
        List list = (List) this.f167984g.getValue();
        if (list != null && list.isEmpty()) {
            z15 = false;
            break;
        }
        Iterator it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                z15 = false;
                break;
            }
        } while (!d53.u.q((String) it3.next(), d53.w.i0(str).toString(), true));
        if (d53.w.J(str)) {
            return d0.b.f167929b;
        }
        if (z14) {
            return d0.a.f167928b;
        }
        if (z15) {
            return new d0.c(str);
        }
        return null;
    }

    public final b63.v y4(b63.v vVar) {
        if (vVar == null) {
            return new b63.v(0, 0, 0, 0, 12, null);
        }
        if (this.f167982e) {
            v21.f.f175333a.getClass();
            return v21.f.t(vVar);
        }
        v21.f.f175333a.getClass();
        int hour = vVar.f16219a.getHour() - 1;
        if (hour < 0) {
            hour = 0;
        }
        return new b63.v(hour, 0, 0, 0);
    }

    public final b63.v z4(b63.v vVar) {
        if (vVar == null) {
            return new b63.v(0, 0, 0, 0, 12, null);
        }
        if (this.f167982e) {
            v21.f.f175333a.getClass();
            return v21.f.w(vVar);
        }
        v21.f.f175333a.getClass();
        return v21.f.u(vVar);
    }
}
