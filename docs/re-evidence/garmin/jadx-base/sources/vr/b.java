package vr;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nr.q0;
import nr.r0;
import nr.s;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.w;
import p13.x;
import p13.y;
import ps.w0;
import r53.p2;
import sr.j;
import ss.k;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.jumps.ActivityDetailsJumpViewModel$initJumpsStateCollector$1", f = "ActivityDetailsJumpViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f179465a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f179465a = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f179465a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        c cVar = this.f179465a;
        List<w0> list = cVar.f179466a;
        List<w0> list2 = cVar.f179466a;
        j jVar = cVar.f179467b;
        Iterator<T> it = list.iterator();
        int i14 = 0;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Integer score = ((w0) next).getScore();
                int iIntValue = score != null ? score.intValue() : 0;
                do {
                    Object next2 = it.next();
                    Integer score2 = ((w0) next2).getScore();
                    int iIntValue2 = score2 != null ? score2.intValue() : 0;
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        w0 w0Var = (w0) next;
        p2 p2Var = cVar.f179468c;
        l22.b bVar = jVar.f160573a;
        List listC = w.c(new q0(x.k(new s(bVar.getString(R.string.mtb_jump_metrics_title), null, 2, null), new s(bVar.getString(R.string.lbl_score), null, 2, null), new s(bVar.getString(R.string.lbl_jump_metrics_distance), null, 2, null), new s(bVar.getString(R.string.lbl_jump_metrics_hangtime), null, 2, null), new s(bVar.getString(R.string.lbl_speed), null, 2, null)), R.color.transparent, r0.HEADER));
        ArrayList arrayList = new ArrayList(y.r(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            w0 w0Var2 = (w0) next3;
            String strValueOf = String.valueOf(i15);
            boolean zG = p005kotlin.jvm.internal.s.g(w0Var2, w0Var);
            jVar.getClass();
            List<w0> list3 = list2;
            Iterator it4 = it3;
            List listK = x.k(new s(strValueOf, zG ? Integer.valueOf(R.drawable.trophy) : null), new s(j.a(jVar, ls.e.TOTAL_JUMPS, w0Var2.getScore()), null, 2, null), new s(j.a(jVar, ls.e.AVERAGE_DISTANCE_PER_STROKE, w0Var2.getDistance()), null, 2, null), new s(j.a(jVar, ls.e.HANG_TIME, w0Var2.getHangTime()), null, 2, null), new s(j.a(jVar, ls.e.JUMP_SPEED, w0Var2.getSpeed()), null, 2, null));
            boolean zEquals = w0Var2.equals(w0Var);
            jVar.getClass();
            arrayList.add(new q0(listK, zEquals ? R.color.surface_3 : R.color.transparent, null, 4, null));
            list2 = list3;
            it3 = it4;
            i14 = i15;
        }
        List<w0> list4 = list2;
        ArrayList arrayListC0 = h0.C0(listC, arrayList);
        s sVar = new s(jVar.f160573a.getString(R.string.lbl_total), null, 2, null);
        s sVar2 = new s("", null, 2, null);
        list4.getClass();
        Iterator<T> it5 = list4.iterator();
        double dDoubleValue = 0.0d;
        while (it5.hasNext()) {
            Double distance = ((w0) it5.next()).getDistance();
            dDoubleValue += distance != null ? distance.doubleValue() : 0.0d;
        }
        s sVar3 = new s(j.a(jVar, ls.e.AVERAGE_DISTANCE_PER_STROKE, Double.valueOf(dDoubleValue)), null, 2, null);
        Iterator<T> it6 = list4.iterator();
        double dDoubleValue2 = 0.0d;
        while (it6.hasNext()) {
            Double hangTime = ((w0) it6.next()).getHangTime();
            dDoubleValue2 += hangTime != null ? hangTime.doubleValue() : 0.0d;
        }
        ls.e eVar = ls.e.HANG_TIME;
        Double dValueOf = Double.valueOf(dDoubleValue2);
        eVar.getClass();
        String strB = k.b(eVar, jVar.f160573a, dValueOf, 1);
        if (strB == null) {
            strB = "";
        }
        p2Var.k(null, h0.D0(arrayListC0, new q0(x.k(sVar, sVar2, sVar3, new s(strB, null, 2, null), new s("", null, 2, null)), R.color.transparent, null, 4, null)));
        return Unit.INSTANCE;
    }
}
