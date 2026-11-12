package com.mapbox.maps.extension.compose.ornaments.attribution;

import a3.o;
import a3.o0;
import a3.s;
import a3.s1;
import a3.v;
import a3.y;
import c2.t2;
import com.google.android.exoplayer2.audio.WavUtil;
import e23.a;
import e23.q;
import e23.r;
import java.util.Locale;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;
import z3.f;

/* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.attribution.ComposableSingletons$MapAttributionScopeKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function0;", "", "onClick", "", "textResId", "invoke", "(Le23/a;ILp3/m;I)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class ComposableSingletons$MapAttributionScopeKt$lambda3$1 extends w implements r<a<? extends Unit>, Integer, m, Integer, Unit> {
    public static final ComposableSingletons$MapAttributionScopeKt$lambda3$1 INSTANCE = new ComposableSingletons$MapAttributionScopeKt$lambda3$1();

    public ComposableSingletons$MapAttributionScopeKt$lambda3$1() {
        super(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(a<Unit> aVar, int i14, m mVar, int i15) {
        int i16;
        aVar.getClass();
        if ((i15 & 14) == 0) {
            i16 = i15 | (mVar.B(aVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 112) == 0) {
            i16 |= mVar.k(i14) ? 32 : 16;
        }
        if ((i16 & 731) == 146 && mVar.b()) {
            mVar.e();
            return;
        }
        x1 x1Var = n.f135158a;
        h4.r.a aVar2 = h4.r.S;
        o0.f762a.getClass();
        k2.a aVar3 = o0.b(mVar).f671a;
        o.f757a.getClass();
        d0.f128823b.getClass();
        long j8 = d0.f128831j;
        long jA = o0.a(mVar).a();
        long j14 = ((d0) o0.a(mVar).f830k.getF182175a()).f128833a;
        v.f860a.getClass();
        s.a(aVar, aVar2, true, null, aVar3, new y(j8, jA, j8, d0.c(v.b(mVar, 6), j14, 14), null), o.f761e, f.b(739178000, new AnonymousClass1(i14, i16), mVar), mVar, (805306368 | (i16 & 14)) & 2147483646, 0);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.attribution.ComposableSingletons$MapAttributionScopeKt$lambda-3$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements q<t2, m, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $textResId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i14, int i15) {
            super(3);
            this.$textResId = i14;
            this.$$dirty = i15;
        }

        public final void invoke(t2 t2Var, m mVar, int i14) {
            t2Var.getClass();
            if ((i14 & 81) == 16 && mVar.b()) {
                mVar.e();
                return;
            }
            x1 x1Var = n.f135158a;
            String upperCase = gl1.y.Q(mVar, this.$textResId).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            s1.c(upperCase, null, 0L, 0L, null, 0L, 0L, 0, false, 0, null, null, mVar, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        }

        @Override // e23.q
        public /* bridge */ /* synthetic */ Unit invoke(t2 t2Var, m mVar, Integer num) {
            invoke(t2Var, mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Override // e23.r
    public /* bridge */ /* synthetic */ Unit invoke(a<? extends Unit> aVar, Integer num, m mVar, Integer num2) {
        invoke((a<Unit>) aVar, num.intValue(), mVar, num2.intValue());
        return Unit.INSTANCE;
    }
}
