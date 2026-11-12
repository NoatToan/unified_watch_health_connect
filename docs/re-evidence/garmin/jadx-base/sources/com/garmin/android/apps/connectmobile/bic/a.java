package com.garmin.android.apps.connectmobile.bic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import c2.q;
import c2.u;
import c2.x2;
import ca0.q1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import dv.i;
import e23.l;
import f5.g0;
import f5.z0;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.WeakHashMap;
import kotlin.t1;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.m1;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import p3.z1;
import s1.f;
import u1.y0;
import v.h;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/a;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "", "animatedCenterPoint", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30723c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ComposeView f30724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f30725b = new z1(0.0f);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/bic/a$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f30726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f30727b;

        public b(View view2, a aVar) {
            this.f30726a = view2;
            this.f30727b = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            int[] iArr = new int[2];
            View view2 = this.f30726a;
            view2.getLocationOnScreen(iArr);
            int i14 = iArr[1];
            int height = view2.getHeight();
            float f14 = (height / 2) + i14;
            if (height > 0) {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                this.f30727b.f30725b.i(f14);
            }
            return true;
        }
    }

    static {
        new C0487a(null);
    }

    public final void ca(float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1024685957);
        int i16 = 2;
        int i17 = (o0VarE.i(f14) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            x3 x3VarB = f.b(f14, null, null, o0VarE, i17 & 14, 30);
            g6.c cVar = (g6.c) o0VarE.A(t1.f91490h);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = j.o(0.0f, o0VarE);
            }
            m1 m1Var = (m1) objQ;
            float floatValue = m1Var.getFloatValue() * 1.15f;
            float fD1 = cVar.d1(floatValue);
            boolean zI = o0VarE.i(((Number) x3VarB.getF182175a()).floatValue()) | o0VarE.i(m1Var.getFloatValue());
            Object objQ2 = o0VarE.q();
            if (zI || objQ2 == c2565a) {
                objQ2 = Float.valueOf(((Number) x3VarB.getF182175a()).floatValue() - (floatValue / 2));
                o0VarE.K(objQ2);
            }
            float fFloatValue = ((Number) objQ2).floatValue();
            float fD2 = cVar.d1(fFloatValue);
            r.a aVar = r.S;
            r rVarD = x2.d(aVar, 1.0f);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new q1(m1Var, i16);
                o0VarE.K(objQ3);
            }
            r rVarF = g0.f(rVarD, (l) objQ3);
            d.f81522a.getClass();
            z0 z0VarD = q.d(d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            t4.d dVarA = n5.c.a(R.drawable.device_setup_2_flashlight, o0VarE, 0);
            f5.k.f68985a.getClass();
            f5.k.a.C1427a c1427a = f5.k.a.f68987b;
            y0.a(dVarA, null, c2.l.v(x2.r(aVar, fD1, fD1), 0.0f, fD2, 1), null, c1427a, 0.0f, null, o0VarE, 24624, 104);
            y0.a(n5.c.a(R.drawable.device_setup_2_background, o0VarE, 0), null, l4.k.a(x2.d(aVar, 1.0f), 0.15f), null, c1427a, 0.0f, null, o0VarE, 25008, 104);
            r rVarD2 = x2.d(aVar, 1.0f);
            boolean zR = o0VarE.r(this) | o0VarE.i(floatValue) | o0VarE.i(fFloatValue);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new dv.j(this, floatValue, m1Var, fFloatValue);
                o0VarE.K(objQ4);
            }
            u1.n.b(rVarD2, (l) objQ4, o0VarE, 6);
            i15 = 1;
            o0VarE.g0(true);
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.f(this, f14, i14, i15);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final int inflateToolbar() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.toolbar_actionbar_stub);
        viewStub.setLayoutResource(R.layout.toolbar_bic);
        viewStub.inflate();
        return R.id.toolbar_actionbar;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, i.c, b.g, android.app.Activity
    public final void setContentView(int i14) {
        if (i14 == R.layout.gcm3_parallax_content_frame) {
            super.setNonCustomContentView(i14);
        } else {
            super.setNonCustomContentView(R.layout.gcm3_parallax_content_frame);
            LayoutInflater.from(this).inflate(i14, (ViewGroup) findViewById(R.id.content_frame), true);
        }
        this.mProgressOverlay = findViewById(R.id.content_frame_progress_overlay);
        View viewFindViewById = findViewById(R.id.setup_background);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        this.f30724a = composeView;
        composeView.setContent(new e(-1161134615, true, new dv.h(this, 0)));
        View viewFindViewById2 = findViewById(R.id.toolbar_container);
        ds.e0 e0Var = new ds.e0(1);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(viewFindViewById2, e0Var);
        getSupportFragmentManager().b(new i(this, 0));
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.bic.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/a$a;", "", "<init>", "()V", "", "FLASH_LIGHT_EXTRA_SCREEN_SPACE", "F", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0487a {
        public /* synthetic */ C0487a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0487a() {
        }
    }
}
