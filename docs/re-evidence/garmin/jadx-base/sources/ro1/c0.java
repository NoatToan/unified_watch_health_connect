package ro1;

import android.net.Uri;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.share.ShareImageActivity;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.File;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShareImageActivity f153922b;

    public /* synthetic */ c0(ShareImageActivity shareImageActivity, int i14) {
        this.f153921a = i14;
        this.f153922b = shareImageActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f153921a;
        ShareImageActivity shareImageActivity = this.f153922b;
        switch (i14) {
            case 0:
                ShareImageActivity.a aVar = ShareImageActivity.f44607f;
                int i15 = ShareImageActivity.b.f44613a[((g3) obj).f35300a.ordinal()];
                if (i15 == 1) {
                    androidx.fragment.app.v supportFragmentManager = shareImageActivity.getSupportFragmentManager();
                    androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                    com.garmin.android.apps.connectmobile.social.share.d.a aVar2 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                    ps.q qVar = shareImageActivity.f44610c;
                    if (qVar == null) {
                        p005kotlin.jvm.internal.s.m("activityStatsBrief");
                        throw null;
                    }
                    boolean z14 = shareImageActivity.f44608a;
                    aVar2.getClass();
                    com.garmin.android.apps.connectmobile.social.share.d dVar = new com.garmin.android.apps.connectmobile.social.share.d();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("activity_stats_brief", qVar);
                    bundle.putBoolean("arg_is_png", z14);
                    dVar.setArguments(bundle);
                    aVarB.l(R.id.content_frame, dVar, null);
                    aVarB.e();
                } else if (i15 == 2) {
                    shareImageActivity.displayFailedMessage();
                    shareImageActivity.finish();
                } else {
                    if (i15 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var, "ShareImageActivity", "registerObservers: Loading is not handled");
                }
                return Unit.INSTANCE;
            case 1:
                File file = (File) obj;
                ShareImageActivity.a aVar4 = ShareImageActivity.f44607f;
                ShareImageActivity shareImageActivity2 = this.f153922b;
                shareImageActivity2.hideProgressOverlay();
                if (file != null) {
                    Uri uriFromFile = Uri.fromFile(file);
                    UCropImageActivity.a aVar5 = UCropImageActivity.f44623o;
                    ds.n nVar = shareImageActivity2.f44609b;
                    shareImageActivity2.startActivityForResult(UCropImageActivity.a.a(aVar5, shareImageActivity2, uriFromFile, nVar.f61022f, nVar.f61023g, null, null, 0.0f, PsExtractor.VIDEO_STREAM_MASK), 2);
                } else {
                    shareImageActivity2.displayFailedMessage();
                    shareImageActivity2.finish();
                }
                return Unit.INSTANCE;
            default:
                ShareImageActivity.a aVar6 = ShareImageActivity.f44607f;
                if (!shareImageActivity.isFinishing()) {
                    shareImageActivity.finish();
                }
                return Unit.INSTANCE;
        }
    }
}
