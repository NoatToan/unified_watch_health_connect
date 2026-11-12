package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jpm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38800c = jhl.c(BaseApplication.getContext(), 16.0f);

    public static void e(View view, HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3) {
        if (view == null || healthTextView == null) {
            LogUtil.j("Track_AiPreSportViewUtils", "autoResize failed, mDataPanelStartView or mShowSportTimeText or mShowSportTimeText is null");
            return;
        }
        if (c(view) + c(healthTextView) > qrs.i(healthTextView.getContext()) - qrs.d(healthTextView.getContext(), 15.0f)) {
            if (healthTextView2 != null) {
                healthTextView2.setTextSize(0, healthTextView2.getTextSize() - qrs.d(healthTextView.getContext(), 2.0f));
            }
            if (healthTextView3 != null) {
                healthTextView3.setTextSize(0, healthTextView3.getTextSize() - qrs.d(healthTextView.getContext(), 1.0f));
            }
            healthTextView.setTextSize(0, healthTextView.getTextSize() - qrs.d(healthTextView.getContext(), 2.0f));
            e(view, healthTextView, healthTextView2, healthTextView3);
        }
    }

    private static int c(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredWidth();
    }

    public static void d(HealthTextView healthTextView, HealthTextView healthTextView2) {
        if (healthTextView == null || healthTextView2 == null) {
            LogUtil.j("Track_AiPreSportViewUtils", "autoResizeTipsText userTips == null || userTips2 == null");
        } else if (c(healthTextView) > (qrs.i(healthTextView.getContext()) - (qrs.d(healthTextView.getContext(), 24.0f) * 4)) - qrs.d(healthTextView.getContext(), 8.0f)) {
            healthTextView.setTextSize(0, healthTextView.getTextSize() - qrs.d(healthTextView.getContext(), 2.0f));
            healthTextView2.setTextSize(0, healthTextView2.getTextSize() - qrs.d(healthTextView.getContext(), 2.0f));
            d(healthTextView, healthTextView2);
        }
    }

    public static void d(ViewGroup viewGroup) {
        if (viewGroup != null) {
            HealthTextView healthTextView = (HealthTextView) viewGroup.findViewById(R.id.use_tips_1);
            healthTextView.setText(qre.f(R.string.IDS_track_skip_set_phone));
            HealthTextView healthTextView2 = (HealthTextView) viewGroup.findViewById(R.id.use_tips_2);
            healthTextView2.setText(qre.f(R.string.IDS_track_skip_body_into_screen));
            ((HealthTextView) viewGroup.findViewById(R.id.how_to_use_text)).setText(R.string.IDS_track_skip_use_type);
            float dimension = BaseApplication.getContext().getResources().getDimension(LanguageUtil.f(viewGroup.getContext()) ? R.dimen.textSizeHeadline5 : R.dimen.textSizeHeadline7);
            healthTextView.setTextSize(0, dimension);
            healthTextView2.setTextSize(0, dimension);
            d(healthTextView, healthTextView2);
            if (healthTextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) healthTextView.getLayoutParams();
                marginLayoutParams.topMargin = qrs.s(viewGroup.getContext());
                healthTextView.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void c(ImageButton imageButton, ViewGroup viewGroup) {
        Rect rect = new Rect();
        imageButton.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        viewGroup.getGlobalVisibleRect(rect2);
        if (rect.left == 0 && rect2.right == 0) {
            LogUtil.a("Track_AiPreSportViewUtils", "adjustSwitchCameraPreSportButton Rect 0");
            return;
        }
        if (rect.left - rect2.right < f38800c) {
            ViewGroup.LayoutParams layoutParams = imageButton.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).bottomMargin = (viewGroup.getHeight() + ((int) BaseApplication.getContext().getResources().getDimension(R.dimen.elementsMarginVerticalL))) * 2;
                imageButton.setLayoutParams(layoutParams);
            }
        }
    }
}
