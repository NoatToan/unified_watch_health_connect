package defpackage;

import android.graphics.drawable.GradientDrawable;
import com.huawei.featureuserprofile.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes6.dex */
public class cvk {
    public static void d(HealthTextView healthTextView) {
        if (healthTextView == null) {
            LogUtil.j("AwardUtils", "setVipCornerShow: textView is null");
            return;
        }
        int iE = qre.e(R.color.vip_product_card_border_color_2);
        float fA = qre.a(R.dimen.health_common_4dp);
        int iB = qre.b(R.dimen.health_common_1dp);
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
            gradientDrawable.setStroke(iB, iE);
            healthTextView.setBackground(gradientDrawable);
        } catch (IllegalArgumentException e) {
            LogUtil.e("AwardUtils", "IllegalArgumentException in setVipCornerShow", e);
        }
        healthTextView.setText(BaseApplication.getContext().getString(R.string.IDS_vip_corner_mark_text));
        healthTextView.setTextColor(iE);
        healthTextView.setVisibility(0);
    }
}
