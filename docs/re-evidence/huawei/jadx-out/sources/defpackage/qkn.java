package defpackage;

import android.content.Context;
import android.graphics.Typeface;
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
public class qkn extends BaseAchieveDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f46393c;
    private String d;
    private String e;
    private HealthTextView f;
    private String g;
    private HealthTextView i;
    private HealthTextView j;

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public byte generateAllTextViewLayoutFlags() {
        return (byte) 15;
    }

    public qkn(Context context, AchieveDialogFactory.DialogType dialogType, DialogResourcesListener dialogResourcesListener, ThreeCircleShareCallback threeCircleShareCallback) {
        super(context, dialogType, dialogResourcesListener);
        this.mCallback = threeCircleShareCallback;
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void initCancelImageAndTipText() {
        this.mCancelImg = (ImageView) this.mRootView.findViewById(R.id.cancel_img);
        this.mCancelImg.setVisibility(0);
        this.mCancelImg.setOnClickListener(new View.OnClickListener() { // from class: qkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46390c.c(view);
            }
        });
        this.mGotoDetailText = (HealthTextView) this.mRootView.findViewById(R.id.goto_detail);
        this.mGotoDetailText.setText(R.string.IDS_hw_messagecenter_more_detail);
        this.mGotoDetailText.setVisibility(0);
    }

    /* synthetic */ void c(View view) {
        dismiss();
    }

    public qkn e(String str) {
        this.g = str;
        return this;
    }

    public qkn a(String str) {
        this.e = str;
        return this;
    }

    public qkn c(String str) {
        this.d = str;
        return this;
    }

    public qkn b(String str) {
        this.f46391a = str;
        return this;
    }

    public qkn c(int i) {
        this.f46392b = i;
        return this;
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void goToShare() {
        if (this.mCallback == null) {
            ReleaseLogUtil.a("BaseAchieveDialog", "mCallback is null in SingleCircleAchieveDialog");
        } else {
            this.mCallback.onCallback(false);
        }
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void onAnimSizeMeasured(int i, int i2) {
        float f = i2;
        int i3 = (int) ((f * 0.3333333f) / 2.0f);
        float f2 = (int) (0.6666667f * f);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.health_common_4dp);
        int i4 = R.string.textFontFamilyRegular;
        int i5 = R.string.textFontFamilyMedium;
        int i6 = R.dimen.textSizeHeadline8;
        int i7 = R.dimen.textSizeSubTitle2;
        int i8 = R.dimen.textSizeHeadline4;
        this.j = createTextViewAbove(R.id.single_circle_target_desc_id, R.id.achieve_text, i3 + ((int) (0.06666667f * f2)), getContext().getColor(R.color.textColorPrimaryInverse), this.f46391a, i7, i4);
        this.f46393c = createTextViewAbove(R.id.single_circle_desc_id, R.id.single_circle_target_desc_id, 0, getContext().getColor(R.color.textColorPrimaryInverse), this.d, i7, i4);
        this.f = createTextViewBelow(R.id.single_circle_title_id, 0, i3 + ((int) (f2 * this.mRingExtraTopMarginRatio)), getContext().getColor(R.color.textColorPrimaryInverse), this.g, i6, i5);
        HealthTextView healthTextViewCreateTextViewBelow = createTextViewBelow(R.id.single_circle_target_id, R.id.single_circle_title_id, dimensionPixelSize, getContext().getColor(this.f46392b), this.e, i8, i5);
        this.i = healthTextViewCreateTextViewBelow;
        healthTextViewCreateTextViewBelow.setScaleX(0.5f);
        this.i.setScaleY(0.5f);
        this.i.setTypeface(Typeface.createFromAsset(getContext().getResources().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf"));
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public void doTextAnimation() {
        if (!isAllTextViewsLayout() || hasDoTextAnimation()) {
            return;
        }
        FastOutSlowInInterpolator fastOutSlowInInterpolator = new FastOutSlowInInterpolator();
        HealthTextView healthTextView = this.f;
        if (healthTextView != null) {
            healthTextView.animate().alpha(1.0f).setDuration(this.mAnimationDuration).setInterpolator(fastOutSlowInInterpolator).start();
        }
        HealthTextView healthTextView2 = this.i;
        if (healthTextView2 != null) {
            healthTextView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(this.mAnimationDuration).setInterpolator(fastOutSlowInInterpolator).start();
        }
        HealthTextView healthTextView3 = this.j;
        if (healthTextView3 != null) {
            healthTextView3.animate().alpha(1.0f).setDuration(this.mAnimationDuration).setInterpolator(fastOutSlowInInterpolator).start();
        }
        HealthTextView healthTextView4 = this.f46393c;
        if (healthTextView4 != null) {
            healthTextView4.animate().alpha(1.0f).setDuration(this.mAnimationDuration).setInterpolator(fastOutSlowInInterpolator).start();
        }
        super.doTextAnimation();
    }

    @Override // com.huawei.ui.commonui.dialog.BaseAchieveDialog
    public String toString() {
        StringBuilder sb = new StringBuilder("SingleCircleAchieveDialog#");
        String str = this.g;
        if (str == null) {
            str = Constants.NULL;
        }
        sb.append(str);
        sb.append("#");
        sb.append(hashCode());
        return sb.toString();
    }
}
