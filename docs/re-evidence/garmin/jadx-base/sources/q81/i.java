package q81;

import android.content.Context;
import android.view.View;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lq81/i;", "Lq81/m;", "Landroid/view/View;", "view", "Le32/l;", "Lo81/d;", "navigator", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/view/View;Le32/l;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f143325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tz.a<List<t71.a>> f143326j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View view2, e32.l<o81.d> lVar, LocalDate localDate, LocalDate localDate2) {
        super(view2, lVar, localDate);
        view2.getClass();
        lVar.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f143325i = 6;
        this.f143326j = new tz.a<>(this.f143353h, new t71.d(this.f143350e, localDate, localDate2, 6, 0.0f, 100.0f, 0, 64, null), new t71.h(this.f143353h, localDate, 6), new t71.c(this.f143353h), null, null, 48, null);
    }

    @Override // q81.m, e32.p
    /* JADX INFO: renamed from: d */
    public final void c(u81.b bVar) {
        super.c(bVar);
        if (bVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Map<LocalDate, Integer> map = bVar.f169474d;
        if (map != null) {
            arrayList.addAll(map.entrySet());
        }
        Collections.reverse(arrayList);
        this.f143348c.setContent(new z3.e(1355587639, true, new h(arrayList, this, 0)));
    }

    @Override // q81.m
    public final tz.a<List<t71.a>> f() {
        return this.f143326j;
    }

    @Override // q81.m
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF143325i() {
        return this.f143325i;
    }

    public final void h(Map.Entry<LocalDate, Integer> entry, r rVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(2093126985);
        int i15 = i14 | (o0VarE.r(entry) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            LocalDate key = entry.getKey();
            k.a aVar = k.f143328e;
            Integer value = entry.getValue();
            aVar.getClass();
            k kVarB = k.a.b(value);
            String strB = j0.b(key.toDateTimeAtStartOfDay(), "MMMM yyyy", null);
            String string = this.f143351f;
            if (strB == null) {
                strB = string;
            }
            Integer value2 = entry.getValue();
            Context context = this.f143350e;
            String string2 = value2 != null ? context.getString(R.string.lbl_value_avg, String.valueOf(entry.getValue())) : string;
            string2.getClass();
            if (kVarB != null) {
                string = context.getString(kVarB.f143337b);
            }
            String str = string;
            str.getClass();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new po2.o(24);
                o0VarE.K(objQ);
            }
            String strA = oi0.c.A(context, (e23.l) objQ, string2);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("value", strA);
            b92.a aVarB = c0235a.b();
            boolean zR = o0VarE.r(this) | o0VarE.r(key);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new p40.o0(23, this, key);
                o0VarE.K(objQ2);
            }
            int i16 = (i15 << 15) & 3670016;
            int i17 = b92.a.f16960b;
            l72.l.e(strB, null, string2, str, null, null, rVar, aVarB, false, (e23.a) objQ2, o0VarE, i16, 306);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pp.g(this, entry, rVar, i14, 3);
        }
    }
}
