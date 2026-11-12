package j20;

import androidx.fragment.app.Fragment;
import c2.h2;
import i3.b1;
import p005kotlin.Unit;
import p3.p0;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f96612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.r f96613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f96614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f96615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h2 f96616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f96617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f96618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x0 f96619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u1.u f96620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Fragment f96621k;

    public /* synthetic */ t(Fragment fragment, String str, h4.r rVar, boolean z14, b1 b1Var, h2 h2Var, e23.a aVar, long j8, x0 x0Var, u1.u uVar, int i14, int i15) {
        this.f96611a = i15;
        this.f96621k = fragment;
        this.f96612b = str;
        this.f96613c = rVar;
        this.f96614d = z14;
        this.f96615e = b1Var;
        this.f96616f = h2Var;
        this.f96617g = aVar;
        this.f96618h = j8;
        this.f96619i = x0Var;
        this.f96620j = uVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f96611a;
        Fragment fragment = this.f96621k;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                int iT = p0.t(1);
                ((com.garmin.android.apps.connectmobile.contacts.emergency.e) fragment).v6(this.f96612b, this.f96613c, this.f96614d, this.f96615e, this.f96616f, this.f96617g, this.f96618h, this.f96619i, this.f96620j, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.contacts.emergency.f.a aVar2 = com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b;
                int iT2 = p0.t(1);
                ((com.garmin.android.apps.connectmobile.contacts.emergency.f) fragment).v6(this.f96612b, this.f96613c, this.f96614d, this.f96615e, this.f96616f, this.f96617g, this.f96618h, this.f96619i, this.f96620j, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
