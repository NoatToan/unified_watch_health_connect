package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.AchieveDialogFactory;
import com.huawei.ui.commonui.dialog.BaseAchieveDialog;
import com.huawei.ui.commonui.dialog.DialogResourcesListener;
import com.huawei.ui.commonui.dialog.ThreeCircleShareCallback;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qkq extends BaseAchieveDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f46397a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SpannableString f46398c;
    private HealthTextView d;
    private String e;

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public byte generateAllTextViewLayoutFlags() {
        return (byte) 3;
    }

    public qkq(Context context, AchieveDialogFactory.DialogType dialogType, DialogResourcesListener dialogResourcesListener, ThreeCircleShareCallback threeCircleShareCallback) {
        super(context, dialogType, dialogResourcesListener);
        this.mCallback = threeCircleShareCallback;
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void initCancelImageAndTipText() {
        this.mCancelImg = (ImageView) this.mRootView.findViewById(R.id.cancel_img);
        this.mCancelImg.setVisibility(0);
        this.mCancelImg.setOnClickListener(new View.OnClickListener() { // from class: qkp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46396a.c(view);
            }
        });
        this.mGotoDetailText = (HealthTextView) this.mRootView.findViewById(R.id.goto_detail);
        this.mGotoDetailText.setText(R.string.IDS_achive_ok_check_text);
        this.mGotoDetailText.setVisibility(0);
    }

    /* synthetic */ void c(View view) {
        dismiss();
    }

    public qkq d(String str) {
        this.e = str;
        return this;
    }

    public qkq d(SpannableString spannableString) {
        this.f46398c = spannableString;
        return this;
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void goToShare() {
        if (this.mCallback == null) {
            ReleaseLogUtil.a("BaseAchieveDialog", "mCallback is null in StepAchieveDialog");
        } else {
            this.mCallback.onCallback(false);
        }
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void onAnimSizeMeasured(int i, int i2) {
        float f = i2;
        int i3 = R.string.textFontFamilyMedium;
        int i4 = R.dimen.textSizeHeadline8;
        HealthTextView healthTextViewCreateTextViewAbove = createTextViewAbove(R.id.single_circle_target_desc_id, R.id.achieve_text, (((int) ((f * 0.3333333f) / 2.0f)) + ((int) (((int) (0.6666667f * f)) * 0.06666667f))) * 3, getContext().getColor(R.color.textColorPrimaryInverse), "", i4, i3);
        this.f46397a = healthTextViewCreateTextViewAbove;
        healthTextViewCreateTextViewAbove.setText(this.f46398c);
        this.d = createTextViewAbove(R.id.single_circle_desc_id, R.id.single_circle_target_desc_id, 0, getContext().getColor(R.color.textColorPrimaryInverse), this.e, i4, i3);
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void doTextAnimation() {
        if (!isAllTextViewsLayout() || hasDoTextAnimation()) {
            return;
        }
        FastOutSlowInInterpolator fastOutSlowInInterpolator = new FastOutSlowInInterpolator();
        HealthTextView healthTextView = this.d;
        if (healthTextView != null) {
            healthTextView.animate().alpha(1.0f).setDuration(this.mAnimationDuration).setInterpolator(fastOutSlowInInterpolator).start();
        }
        HealthTextView healthTextView2 = this.f46397a;
        if (healthTextView2 != null) {
            healthTextView2.animate().alpha(1.0f).setDuration(this.mAnimationDuration).setInterpolator(fastOutSlowInInterpolator).start();
        }
        super.doTextAnimation();
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public String toString() {
        StringBuilder sb = new StringBuilder("StepAchieveDialog#");
        String str = this.e;
        if (str == null) {
            str = Constants.NULL;
        }
        sb.append(str);
        sb.append("#");
        sb.append(hashCode());
        return sb.toString();
    }
}
