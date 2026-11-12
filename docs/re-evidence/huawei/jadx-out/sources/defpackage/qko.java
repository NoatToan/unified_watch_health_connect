package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.AchieveDialogFactory;
import com.huawei.ui.commonui.dialog.BaseAchieveDialog;
import com.huawei.ui.commonui.dialog.DialogResourcesListener;
import com.huawei.ui.commonui.dialog.ThreeCircleShareCallback;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qko extends BaseAchieveDialog {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f46394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f46395c;
    private HealthTextView d;

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public byte generateAllTextViewLayoutFlags() {
        return (byte) 7;
    }

    public qko(Context context, AchieveDialogFactory.DialogType dialogType, DialogResourcesListener dialogResourcesListener, ThreeCircleShareCallback threeCircleShareCallback) {
        super(context, dialogType, dialogResourcesListener);
        this.mCallback = threeCircleShareCallback;
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void initCancelImageAndTipText() {
        this.mCancelImg = (ImageView) this.mRootView.findViewById(R.id.cancel_img);
        this.mCancelImg.setVisibility(0);
        this.mCancelImg.setOnClickListener(new View.OnClickListener() { // from class: qks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(view);
            }
        });
        this.mGotoDetailText = (HealthTextView) this.mRootView.findViewById(R.id.goto_detail);
        this.mGotoDetailText.setText(R.string.IDS_hw_messagecenter_more_detail);
        this.mGotoDetailText.setVisibility(0);
    }

    /* synthetic */ void a(View view) {
        dismiss();
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void goToShare() {
        if (this.mCallback == null) {
            ReleaseLogUtil.a("BaseAchieveDialog", "mCallback is null in ThreeCircleAchieveDialog");
        } else {
            this.mCallback.onCallback(true);
        }
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void onAnimSizeMeasured(int i, int i2) {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.health_common_1dp);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.health_common_min_4dp);
        int i3 = R.string.textFontFamilyMedium;
        int i4 = R.dimen.textSizeHeadline7;
        this.f46394b = createTextViewAbove(R.id.three_circle_achieve_anim_walk_id, R.id.achieve_text, ((int) ((i2 * 0.3333333f) / 2.0f)) + dimensionPixelSize, getContext().getColor(R.color.heat_cal_color), this.mHeatText, i4, i3);
        this.d = createTextViewAbove(R.id.three_circle_achieve_anim_intensity_id, this.f46394b.getId(), dimensionPixelSize2, getContext().getColor(R.color.intensity_time_color), this.mIntensityTimeText, i4, i3);
        this.f46395c = createTextViewAbove(R.id.three_circle_achieve_anim_active_id, this.d.getId(), dimensionPixelSize2, getContext().getColor(R.color.active_time_color), this.mActiveHourText, i4, i3);
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void doTextAnimation() {
        if (!isAllTextViewsLayout() || hasDoTextAnimation()) {
            return;
        }
        FastOutSlowInInterpolator fastOutSlowInInterpolator = new FastOutSlowInInterpolator();
        HealthTextView healthTextView = this.f46394b;
        if (healthTextView != null) {
            healthTextView.animate().alpha(1.0f).setDuration(this.mAnimationDuration).setInterpolator(fastOutSlowInInterpolator).start();
        }
        HealthTextView healthTextView2 = this.d;
        if (healthTextView2 != null) {
            healthTextView2.animate().alpha(1.0f).setDuration(this.mAnimationDuration).setInterpolator(fastOutSlowInInterpolator).start();
        }
        HealthTextView healthTextView3 = this.f46395c;
        if (healthTextView3 != null) {
            healthTextView3.animate().alpha(1.0f).setDuration(this.mAnimationDuration).setInterpolator(fastOutSlowInInterpolator).start();
        }
        super.doTextAnimation();
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public String toString() {
        return "ThreeCircleAchieveDialog#" + hashCode();
    }
}
