package yt;

import androidx.compose.ui.platform.ComposeView;
import o53.m0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.player.AnnualReportPlayerFragment$checkLoadingBanner$1", f = "AnnualReportPlayerFragment.kt", l = {457, 458}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f199330b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.player.AnnualReportPlayerFragment$checkLoadingBanner$1$1", f = "AnnualReportPlayerFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f199331a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f199331a = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f199331a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = h.f199301x;
            h hVar = this.f199331a;
            if (hVar.w6().y4() == r.LOADING) {
                ut.a aVar2 = hVar.f199303b;
                if (aVar2 == null) {
                    p005kotlin.jvm.internal.s.m("binding");
                    throw null;
                }
                ComposeView composeView = aVar2.f172542b;
                composeView.getClass();
                if (composeView.getVisibility() != 0) {
                    ut.a aVar3 = hVar.f199303b;
                    if (aVar3 == null) {
                        p005kotlin.jvm.internal.s.m("binding");
                        throw null;
                    }
                    aVar3.f172542b.setContent(new z3.e(-2114562192, true, new c(hVar, 5)));
                    hVar.v6();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f199330b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f199330b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (ge1.b.e0(r7, r1, r6) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199329a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f199329a = 1;
            if (m0.b(3000L, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        x53.c cVar = s0.f129406a;
        t1 t1Var = u53.o.f168762a;
        a aVar2 = new a(this.f199330b, null);
        this.f199329a = 2;
    }
}
