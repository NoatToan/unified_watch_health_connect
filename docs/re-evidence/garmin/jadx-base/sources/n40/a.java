package n40;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.google.android.material.slider.RangeSlider;
import cw1.u0;
import e23.p;
import h4.r;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final void a(com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2, p<? super com.garmin.android.apps.connectmobile.courses.model.b, ? super com.garmin.android.apps.connectmobile.courses.model.b, Unit> pVar, p3.m mVar, int i14) {
        bVar.getClass();
        bVar2.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(2067093131);
        int i15 = i14 | (o0VarE.k(bVar.ordinal()) ? 4 : 2) | (o0VarE.k(bVar2.ordinal()) ? 32 : 16) | (o0VarE.r(pVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarQ = p0.q(pVar, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = x.k(com.garmin.android.apps.connectmobile.courses.model.b.NONE, com.garmin.android.apps.connectmobile.courses.model.b.FOURTH_CATEGORY, com.garmin.android.apps.connectmobile.courses.model.b.THIRD_CATEGORY, com.garmin.android.apps.connectmobile.courses.model.b.SECOND_CATEGORY, com.garmin.android.apps.connectmobile.courses.model.b.FIRST_CATEGORY, com.garmin.android.apps.connectmobile.courses.model.b.HORS_CATEGORY);
                o0VarE.K(objQ);
            }
            List list = (List) objQ;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = o0VarE.B(context);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new l22.a(context);
                o0VarE.K(objQ2);
            }
            l22.a aVar = (l22.a) objQ2;
            boolean zB2 = o0VarE.B(aVar);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == c2565a) {
                objQ3 = new y30.a(aVar);
                o0VarE.K(objQ3);
            }
            y30.a aVar2 = (y30.a) objQ3;
            r rVarF = x2.f(r.S, 1.0f);
            boolean zB3 = o0VarE.B(p1VarQ) | o0VarE.r(list);
            Object objQ4 = o0VarE.q();
            if (zB3 || objQ4 == c2565a) {
                objQ4 = new u0(list, p1VarQ, 1);
                o0VarE.K(objQ4);
            }
            e23.l lVar = (e23.l) objQ4;
            boolean zR = ((i15 & 14) == 4) | o0VarE.r(list) | ((i15 & 112) == 32) | o0VarE.r(aVar) | o0VarE.r(aVar2);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                jv0.c cVar = new jv0.c(list, bVar, bVar2, aVar, aVar2, 8);
                o0VarE.K(cVar);
                objQ5 = cVar;
            }
            p002j6.c.b(lVar, rVarF, (e23.l) objQ5, o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(bVar, bVar2, pVar, i14, 5);
        }
    }

    /* JADX INFO: renamed from: n40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"n40/a$a", "Lcom/google/android/material/slider/RangeSlider$OnSliderTouchListener;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2319a implements RangeSlider.OnSliderTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<com.garmin.android.apps.connectmobile.courses.model.b> f123562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<p<com.garmin.android.apps.connectmobile.courses.model.b, com.garmin.android.apps.connectmobile.courses.model.b, Unit>> f123563b;

        /* JADX WARN: Multi-variable type inference failed */
        public C2319a(List<? extends com.garmin.android.apps.connectmobile.courses.model.b> list, x3<? extends p<? super com.garmin.android.apps.connectmobile.courses.model.b, ? super com.garmin.android.apps.connectmobile.courses.model.b, Unit>> x3Var) {
            this.f123562a = list;
            this.f123563b = x3Var;
        }

        @Override // com.google.android.material.slider.RangeSlider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
        public final void onStartTrackingTouch(RangeSlider rangeSlider) {
            rangeSlider.getClass();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.slider.RangeSlider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
        public final void onStopTrackingTouch(RangeSlider rangeSlider) {
            rangeSlider.getClass();
            List<Float> values = rangeSlider.getValues();
            values.getClass();
            p f182175a = this.f123563b.getF182175a();
            int iFloatValue = (int) values.get(0).floatValue();
            List<com.garmin.android.apps.connectmobile.courses.model.b> list = this.f123562a;
            f182175a.invoke(list.get(iFloatValue), list.get((int) values.get(1).floatValue()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.slider.RangeSlider.OnSliderTouchListener
        public final void onStartTrackingTouch(RangeSlider rangeSlider) {
            rangeSlider.getClass();
        }
    }
}
