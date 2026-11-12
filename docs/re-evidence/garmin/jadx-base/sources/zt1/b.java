package zt1;

import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.training.atp.create.edit.ATPEditActivity;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements q1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ATPEditActivity f206965b;

    public /* synthetic */ b(ATPEditActivity aTPEditActivity, int i14) {
        this.f206964a = i14;
        this.f206965b = aTPEditActivity;
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public final void g(boolean z14) {
        int i14 = this.f206964a;
        ATPEditActivity aTPEditActivity = this.f206965b;
        switch (i14) {
            case 0:
                f fVar = aTPEditActivity.f45204b;
                if (fVar != null) {
                    fVar.t(z14);
                    return;
                } else {
                    s.m("presenter");
                    throw null;
                }
            case 1:
                ATPEditActivity.a aVar = ATPEditActivity.f45202g;
                if (z14) {
                    aTPEditActivity.finish();
                    return;
                }
                return;
            default:
                f fVar2 = aTPEditActivity.f45204b;
                if (fVar2 != null) {
                    fVar2.v(z14);
                    return;
                } else {
                    s.m("presenter");
                    throw null;
                }
        }
    }
}
