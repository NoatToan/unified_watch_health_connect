package ew2;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import iw2.w;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew2/f;", "", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f66904a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.baseviews.viewcoordinator.ViewCoordinatorUtility$Companion$removeDevice$1$onDeviceSuccessfullyRemoved$1", f = "ViewCoordinatorUtility.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66906b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f66906b = fragment;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f66906b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f66905a;
            if (i14 == 0) {
                r.b(obj);
                w wVar = w.f95547a;
                Context contextRequireContext = this.f66906b.requireContext();
                contextRequireContext.getClass();
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                long j8 = com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192449a;
                this.f66905a = 1;
                wVar.getClass();
                x53.c cVar = s0.f129406a;
                if (ge1.b.e0(x53.b.f189152a, new iw2.g(contextRequireContext, j8, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public f(Fragment fragment) {
        this.f66904a = fragment;
    }

    public final void a(String str) {
        e.a aVar = e.f66901a;
        m mVarRequireActivity = this.f66904a.requireActivity();
        mVarRequireActivity.getClass();
        e.a.d(aVar, mVarRequireActivity, str);
        g.f66908b.getClass();
    }

    public final void b() {
        g.f66908b.getClass();
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        u53.d dVar = com.garmin.realtimesettings.app.initialization.b.f52593e;
        Fragment fragment = this.f66904a;
        ge1.b.T(dVar, null, null, new a(fragment, null), 3);
        m activity = fragment.getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        m activity2 = fragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }
}
