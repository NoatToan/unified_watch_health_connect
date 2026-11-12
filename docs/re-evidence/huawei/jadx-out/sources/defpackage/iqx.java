package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.health.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.MagicBuild;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class iqx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f37977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f37978c;

    public iqx(Context context, ViewStub viewStub) {
        this.f37978c = context;
        b(context, viewStub);
    }

    private void b(Context context, ViewStub viewStub) {
        if (viewStub == null) {
            LogUtil.e("StartPageHelper", "init startPage failed, viewstub is null");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) viewStub.inflate();
        this.f37977b = linearLayout;
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.hw_copyrights);
        healthTextView.setText(wvi.b());
        HealthTextView healthTextView2 = (HealthTextView) this.f37977b.findViewById(R.id.slogan);
        HealthTextView healthTextView3 = (HealthTextView) this.f37977b.findViewById(R.id.appName);
        if (MagicBuild.f36615a) {
            LogUtil.b("StartPageHelper", "magic system detected");
            healthTextView.setVisibility(8);
            healthTextView3.setText(R.string.IDS_hw_app_name);
        }
        Activity activity = (Activity) context;
        a(activity);
        b();
        if (qrs.v()) {
            healthTextView2.setTextSize(1, 28.0f);
            healthTextView3.setTextSize(1, 42.0f);
            healthTextView.setTextSize(1, 21.0f);
        }
        if (activity.isInMultiWindowMode() && (healthTextView2.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            ((ConstraintLayout.LayoutParams) healthTextView2.getLayoutParams()).bottomMargin = context.getResources().getDimensionPixelOffset(R.dimen.health_common_44dp);
        }
    }

    public void d(int i) {
        ReleaseLogUtil.d("R_StartPageHelper", "changeVisibility, visibility:", Integer.valueOf(i));
        if (i == 0) {
            LogUtil.b("StartPageHelper", "show start page");
        } else {
            LogUtil.b("StartPageHelper", "dismiss start page");
        }
        LinearLayout linearLayout = this.f37977b;
        if (linearLayout == null) {
            LogUtil.e("StartPageHelper", "warning: view not inited");
        } else {
            linearLayout.setVisibility(i);
        }
    }

    private void a(Activity activity) {
        if (CommonUtil.ap() && CommonUtil.v(activity)) {
            ImageView imageView = (ImageView) activity.findViewById(R.id.betaDemoView);
            imageView.setVisibility(0);
            imageView.setImageResource(R.mipmap.ic_beta);
            LogUtil.b("StartPageHelper", "beta version and china rom");
            return;
        }
        if (CommonUtil.ca()) {
            ImageView imageView2 = (ImageView) activity.findViewById(R.id.betaDemoView);
            imageView2.setVisibility(0);
            imageView2.setImageResource(R.mipmap.ic_demo);
            LogUtil.b("StartPageHelper", "store demo version");
        }
    }

    public void b() {
        LinearLayout linearLayout = this.f37977b;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.f37977b.findViewById(R.id.hw_health_start_page).setBackgroundResource(R.drawable.splash_bg);
    }

    public void c() {
        LinearLayout linearLayout = this.f37977b;
        if (linearLayout != null) {
            HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.slogan);
            if (((Activity) this.f37978c).isInMultiWindowMode() && (healthTextView.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
                LogUtil.b("StartPageHelper", "multi window activated, adjust slogan...");
                ((ConstraintLayout.LayoutParams) healthTextView.getLayoutParams()).bottomMargin = this.f37978c.getResources().getDimensionPixelOffset(R.dimen.health_common_44dp);
            }
        }
    }
}
