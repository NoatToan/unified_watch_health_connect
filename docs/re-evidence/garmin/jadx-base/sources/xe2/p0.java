package xe2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190530b;

    public /* synthetic */ p0(com.garmin.android.library.mobileauth.ui.e eVar, int i14) {
        this.f190529a = i14;
        this.f190530b = eVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f190529a;
        com.garmin.android.library.mobileauth.ui.e eVar = this.f190530b;
        switch (i14) {
            case 0:
                com.garmin.android.library.mobileauth.ui.e.a aVar = com.garmin.android.library.mobileauth.ui.e.f50426m;
                androidx.lifecycle.n0 viewLifecycleOwner = eVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.i0 i0VarW = o53.f0.w(viewLifecycleOwner);
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(i0VarW, u53.o.f168762a, null, new q0(eVar, null, null), 2);
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.library.mobileauth.ui.b fragListener$mobile_auth_release = eVar.getFragListener$mobile_auth_release();
                com.garmin.android.library.mobileauth.ui.e.a.EnumC1005a enumC1005a = eVar.f50433e;
                if (enumC1005a != null) {
                    fragListener$mobile_auth_release.o0(enumC1005a);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("flow");
                throw null;
            default:
                androidx.lifecycle.n0 viewLifecycleOwner2 = eVar.getViewLifecycleOwner();
                viewLifecycleOwner2.getClass();
                androidx.lifecycle.i0 i0VarW2 = o53.f0.w(viewLifecycleOwner2);
                x53.c cVar2 = o53.s0.f129406a;
                ge1.b.T(i0VarW2, u53.o.f168762a, null, new r0.a(eVar, null), 2);
                return Unit.INSTANCE;
        }
    }
}
