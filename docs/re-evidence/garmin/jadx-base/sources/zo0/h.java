package zo0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h<T> implements k7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f206149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f206150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f206151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t13.d<Boolean> f206152d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(g gVar, boolean z14, boolean z15, boolean z16, t13.d<? super Boolean> dVar) {
        this.f206149a = z14;
        this.f206150b = z15;
        this.f206151c = z16;
        this.f206152d = dVar;
    }

    @Override // k7.b
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String strH = com.airbnb.lottie.animation.keyframe.a.h("shouldUseSystemBonding: ", zBooleanValue);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "BLEUpgradeDialogHandler", strH);
        t13.d<Boolean> dVar = this.f206152d;
        if (zBooleanValue && this.f206149a && this.f206150b && !this.f206151c) {
            int i14 = o13.q.f128596b;
            dVar.resumeWith(Boolean.TRUE);
        } else {
            int i15 = o13.q.f128596b;
            dVar.resumeWith(Boolean.FALSE);
        }
    }
}
