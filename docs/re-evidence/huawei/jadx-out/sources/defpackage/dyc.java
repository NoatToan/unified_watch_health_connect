package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dyc {
    public static void c(dnj dnjVar, HealthTextView healthTextView, ImageView imageView) {
        if (dnjVar == null || imageView == null) {
            LogUtil.j("PluginDevice_HealthViewUtils", "setUserNameAndPhoto user or photoImage is null");
            return;
        }
        if (healthTextView != null) {
            healthTextView.setText(dnjVar.h());
        }
        imageView.setImageBitmap(null);
        imageView.setImageResource(0);
        if (!TextUtils.isEmpty(dnjVar.b())) {
            a(dnjVar.b(), imageView, dnjVar);
        } else if (dnjVar.k() == null) {
            imageView.setImageDrawable(qlo.b(BaseApplication.getContext().getResources(), new qlo.e(null, dnjVar.i(), true)));
        } else {
            imageView.setImageBitmap(qlo.d(dnjVar.k(), true));
        }
    }

    private static void a(String str, ImageView imageView, dnj dnjVar) {
        if (imageView == null || dnjVar == null) {
            LogUtil.j("PluginDevice_HealthViewUtils", "setUserPhoto photoImage or user is null");
            return;
        }
        if (!"default".equals(str)) {
            Bitmap bitmapA = qqf.a(BaseApplication.getContext(), str);
            if (bitmapA != null) {
                imageView.setImageBitmap(qlo.d(bitmapA, true));
                return;
            }
            return;
        }
        imageView.setImageDrawable(qlo.b(BaseApplication.getContext().getResources(), new qlo.e(null, dnjVar.i(), true)));
    }

    public static String b(double d, int i) {
        if (UnitUtil.f()) {
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_lb_string, etn.a(UnitUtil.h(d)), UnitUtil.e(UnitUtil.h(d), 1, i));
        }
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_kg_string, etn.a(d), UnitUtil.e(d, 1, i));
    }
}
