package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.huawei.ui.commonui.R;
import com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class sof {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BottomPlayerView f48456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private smp f48457b = smp.b();
    private Activity d;

    public sof(Activity activity) {
        this.d = activity;
    }

    public void b(ViewGroup viewGroup, gdy gdyVar) {
        LogUtil.a("TempMiniBarInjector", "showTempMiniBar begin.");
        if (qjb.c().b() instanceof BottomPlayerView) {
            LogUtil.a("TempMiniBarInjector", "MiniPlayer already exists, skip.");
            return;
        }
        this.f48456a = new BottomPlayerView(this.d);
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = this.d.getResources().getDimensionPixelSize(R.dimen.health_common_56dp);
            viewGroup.addView(this.f48456a, layoutParams);
            this.f48456a.bringToFront();
        } else {
            viewGroup.addView(this.f48456a, new ViewGroup.LayoutParams(-1, -2));
        }
        this.f48456a.setVisibility(8);
        qjb.c().c(this.f48456a);
        qjb.c().d(true);
        if (gdyVar != null) {
            LogUtil.a("TempMiniBarInjector", "External data refresh succeeded: " + gdyVar.o());
            this.f48456a.b(gdyVar, 3, 0.0f);
        } else {
            c();
        }
        LogUtil.a("TempMiniBarInjector", "Temp Minibar shown perfectly without container wrapper.");
    }

    public void b() {
        LogUtil.a("TempMiniBarInjector", "destroy temp minibar.");
        BottomPlayerView bottomPlayerView = this.f48456a;
        if (bottomPlayerView != null) {
            bottomPlayerView.e();
            ViewParent parent = this.f48456a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f48456a);
                LogUtil.a("TempMiniBarInjector", "mTempMiniBarView removed from parent successfully.");
            }
            this.f48456a = null;
        }
        qjb.c().d(false);
        qjb.c().c((View) null);
    }

    private void c() {
        smp smpVar;
        if (this.f48456a == null || (smpVar = this.f48457b) == null) {
            return;
        }
        try {
            gdy gdyVarJ = smpVar.j();
            int iQ = this.f48457b.q();
            float fK = this.f48457b.k();
            if (gdyVarJ != null) {
                LogUtil.a("TempMiniBarInjector", "currentAudioItem getTitle: " + gdyVarJ.o());
                this.f48456a.b(gdyVarJ, iQ, fK);
            }
        } catch (Exception e) {
            LogUtil.c("TempMiniBarInjector", "refreshMiniPlayerUi failed.", e);
        }
    }
}
