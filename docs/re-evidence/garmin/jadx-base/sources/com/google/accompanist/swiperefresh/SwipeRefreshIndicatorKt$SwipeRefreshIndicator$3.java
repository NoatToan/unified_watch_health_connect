package com.google.accompanist.swiperefresh;

import a3.b1;
import c2.s;
import c2.u;
import c2.x2;
import e23.p;
import e23.q;
import f5.k0;
import h4.d;
import h4.g;
import h4.r;
import h5.e0;
import j23.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.g3;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import r1.m0;
import s1.l;
import u1.y0;
import v.h;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $arrowEnabled;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ boolean $fade;
    final /* synthetic */ float $indicatorRefreshTrigger;
    final /* synthetic */ SwipeRefreshIndicatorSizes $sizes;
    final /* synthetic */ Slingshot $slingshot;
    final /* synthetic */ SwipeRefreshState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3(SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes, boolean z14, SwipeRefreshState swipeRefreshState, long j8, boolean z15, float f14, Slingshot slingshot, int i14) {
        super(2);
        this.$sizes = swipeRefreshIndicatorSizes;
        this.$arrowEnabled = z14;
        this.$state = swipeRefreshState;
        this.$contentColor = j8;
        this.$fade = z15;
        this.$indicatorRefreshTrigger = f14;
        this.$slingshot = slingshot;
        this.$$dirty = i14;
    }

    public final void invoke(m mVar, int i14) {
        if ((i14 & 11) == 2 && mVar.b()) {
            mVar.e();
            return;
        }
        x1 x1Var = n.f135158a;
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new CircularProgressPainter();
            mVar.K(objQ);
        }
        mVar.R();
        CircularProgressPainter circularProgressPainter = (CircularProgressPainter) objQ;
        circularProgressPainter.m69setArcRadius0680j_4(this.$sizes.m84getArcRadiusD9Ej5fM());
        circularProgressPainter.m73setStrokeWidth0680j_4(this.$sizes.m88getStrokeWidthD9Ej5fM());
        circularProgressPainter.m71setArrowWidth0680j_4(this.$sizes.m86getArrowWidthD9Ej5fM());
        circularProgressPainter.m70setArrowHeight0680j_4(this.$sizes.m85getArrowHeightD9Ej5fM());
        circularProgressPainter.setArrowEnabled(this.$arrowEnabled && !this.$state.isRefreshing());
        circularProgressPainter.m72setColor8_81llA(this.$contentColor);
        circularProgressPainter.setAlpha(this.$fade ? t.d(this.$state.getIndicatorOffset() / this.$indicatorRefreshTrigger, 0.0f, 1.0f) : 1.0f);
        circularProgressPainter.setStartTrim(this.$slingshot.getStartTrim());
        circularProgressPainter.setEndTrim(this.$slingshot.getEndTrim());
        circularProgressPainter.setRotation(this.$slingshot.getRotation());
        circularProgressPainter.setArrowScale(this.$slingshot.getArrowScale());
        m0.a(Boolean.valueOf(this.$state.isRefreshing()), null, l.d(100, 0, null, 6), null, f.b(39176424, new AnonymousClass1(this.$sizes, this.$contentColor, this.$$dirty, circularProgressPainter), mVar), mVar, 24960, 10);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "refreshing", "", "invoke", "(ZLp3/m;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends w implements q<Boolean, m, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ CircularProgressPainter $painter;
        final /* synthetic */ SwipeRefreshIndicatorSizes $sizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes, long j8, int i14, CircularProgressPainter circularProgressPainter) {
            super(3);
            this.$sizes = swipeRefreshIndicatorSizes;
            this.$contentColor = j8;
            this.$$dirty = i14;
            this.$painter = circularProgressPainter;
        }

        public final void invoke(boolean z14, m mVar, int i14) {
            int i15;
            if ((i14 & 14) == 0) {
                i15 = i14 | (mVar.h(z14) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i15 & 91) == 18 && mVar.b()) {
                mVar.e();
                return;
            }
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarD = x2.d(aVar, 1.0f);
            d.f81522a.getClass();
            g gVar = d.a.f81528f;
            SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes = this.$sizes;
            long j8 = this.$contentColor;
            int i16 = this.$$dirty;
            CircularProgressPainter circularProgressPainter = this.$painter;
            mVar.L(733328855);
            s sVarE = c2.q.e(gVar, mVar, 6);
            mVar.L(-1323940314);
            int iP = mVar.P();
            i2 i2VarX = mVar.x();
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            e eVarC = k0.c(rVarD);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, sVarE, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iP))) {
                h.z(iP, mVar, iP, bVar);
            }
            eVarC.invoke(g3.a(mVar), mVar, 0);
            mVar.L(2058660585);
            u uVar = u.f22885a;
            if (z14) {
                mVar.L(-1527193583);
                float fM84getArcRadiusD9Ej5fM = swipeRefreshIndicatorSizes.m84getArcRadiusD9Ej5fM() + swipeRefreshIndicatorSizes.m88getStrokeWidthD9Ej5fM();
                g6.f.a aVar3 = g6.f.f75994b;
                b1.b(swipeRefreshIndicatorSizes.m88getStrokeWidthD9Ej5fM(), 0, (i16 >> 18) & 112, j8, 0L, x2.q(aVar, fM84getArcRadiusD9Ej5fM * 2), mVar);
                mVar.R();
            } else {
                mVar.L(-1527193245);
                y0.a(circularProgressPainter, "Refreshing", null, null, null, 0.0f, null, mVar, 56, 124);
                mVar.R();
            }
            mVar.R();
            mVar.y();
            mVar.R();
            mVar.R();
        }

        @Override // e23.q
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, m mVar, Integer num) {
            invoke(bool.booleanValue(), mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }
}
