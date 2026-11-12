package com.mapbox.maps.extension.compose.annotation;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import c2.q;
import c2.s;
import c2.u;
import c2.x2;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import e23.l;
import e23.p;
import f5.c0;
import f5.g0;
import f5.n0;
import g6.c;
import g6.o;
import h4.d;
import h4.r;
import h5.e0;
import h5.g;
import kotlin.a4;
import kotlin.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.g3;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p3.x3;
import z3.e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ViewAnnotationKt$ViewAnnotation$1$1$1 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ p<m, Integer, Unit> $content;
    final /* synthetic */ x3<ViewAnnotationOptions> $currentOptions;
    final /* synthetic */ r $modifier;
    final /* synthetic */ ComposeView $this_apply;
    final /* synthetic */ ViewAnnotationManager $viewAnnotationManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewAnnotationKt$ViewAnnotation$1$1$1(r rVar, ViewAnnotationManager viewAnnotationManager, ComposeView composeView, x3<ViewAnnotationOptions> x3Var, p<? super m, ? super Integer, Unit> pVar, int i14) {
        super(2);
        this.$modifier = rVar;
        this.$viewAnnotationManager = viewAnnotationManager;
        this.$this_apply = composeView;
        this.$currentOptions = x3Var;
        this.$content = pVar;
        this.$$dirty = i14;
    }

    public final void invoke(m mVar, int i14) {
        if ((i14 & 11) == 2 && mVar.b()) {
            mVar.e();
            return;
        }
        x1 x1Var = n.f135158a;
        r.a aVar = r.S;
        r rVar = this.$modifier;
        aVar.getClass();
        r rVarF = g0.f(x2.y(rVar, null, 1), new AnonymousClass1(this.$viewAnnotationManager, this.$this_apply, this.$currentOptions));
        p<m, Integer, Unit> pVar = this.$content;
        int i15 = this.$$dirty;
        mVar.L(733328855);
        d.f81522a.getClass();
        s sVarE = q.e(d.a.f81524b, mVar, 0);
        mVar.L(-1323940314);
        c cVar = (c) mVar.A(t1.f91490h);
        o oVar = (o) mVar.A(t1.f91496n);
        a4 a4Var = (a4) mVar.A(t1.f91502t);
        g.V.getClass();
        e0.a aVar2 = g.a.f81805b;
        e eVar = new e(-2123382363, true, new n0(rVarF));
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
        mVar.O();
        b4.c(g.a.f81810g, sVarE, mVar);
        b4.c(g.a.f81808e, cVar, mVar);
        b4.c(g.a.f81811h, oVar, mVar);
        b4.c(g.a.f81812i, a4Var, mVar);
        mVar.j();
        eVar.invoke(g3.a(mVar), mVar, 0);
        mVar.L(2058660585);
        mVar.L(-2137368960);
        u uVar = u.f22885a;
        pVar.invoke(mVar, Integer.valueOf((i15 >> 9) & 14));
        mVar.R();
        mVar.R();
        mVar.y();
        mVar.R();
        mVar.R();
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.annotation.ViewAnnotationKt$ViewAnnotation$1$1$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<c0, Unit> {
        final /* synthetic */ x3<ViewAnnotationOptions> $currentOptions;
        final /* synthetic */ ComposeView $this_apply;
        final /* synthetic */ ViewAnnotationManager $viewAnnotationManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewAnnotationManager viewAnnotationManager, ComposeView composeView, x3<ViewAnnotationOptions> x3Var) {
            super(1);
            this.$viewAnnotationManager = viewAnnotationManager;
            this.$this_apply = composeView;
            this.$currentOptions = x3Var;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(c0 c0Var) {
            int iDoubleValue;
            int iDoubleValue2;
            c0Var.getClass();
            ViewAnnotationManager viewAnnotationManager = this.$viewAnnotationManager;
            ComposeView composeView = this.$this_apply;
            ViewAnnotationOptions f182175a = this.$currentOptions.getF182175a();
            ViewAnnotationOptions.Builder builder = f182175a.toBuilder();
            Double height = f182175a.getHeight();
            if (height == null) {
                long jA = c0Var.a();
                g6.m.a aVar = g6.m.f76012b;
                height = Double.valueOf((int) (jA & 4294967295L));
            }
            ViewAnnotationOptions.Builder builderHeight = builder.height(height);
            Double width = f182175a.getWidth();
            if (width == null) {
                long jA2 = c0Var.a();
                g6.m.a aVar2 = g6.m.f76012b;
                width = Double.valueOf((int) (jA2 >> 32));
            }
            ViewAnnotationOptions viewAnnotationOptionsBuild = builderHeight.width(width).build();
            viewAnnotationOptionsBuild.getClass();
            viewAnnotationManager.updateViewAnnotation(composeView, viewAnnotationOptionsBuild);
            ViewGroup.LayoutParams layoutParams = this.$this_apply.getLayoutParams();
            x3<ViewAnnotationOptions> x3Var = this.$currentOptions;
            Double width2 = x3Var.getF182175a().getWidth();
            if (width2 != null) {
                iDoubleValue = (int) width2.doubleValue();
            } else {
                long jA3 = c0Var.a();
                g6.m.a aVar3 = g6.m.f76012b;
                iDoubleValue = (int) (jA3 >> 32);
            }
            layoutParams.width = iDoubleValue;
            Double height2 = x3Var.getF182175a().getHeight();
            if (height2 != null) {
                iDoubleValue2 = (int) height2.doubleValue();
            } else {
                long jA4 = c0Var.a();
                g6.m.a aVar4 = g6.m.f76012b;
                iDoubleValue2 = (int) (jA4 & 4294967295L);
            }
            layoutParams.height = iDoubleValue2;
            this.$this_apply.requestLayout();
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var) {
            invoke2(c0Var);
            return Unit.INSTANCE;
        }
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
