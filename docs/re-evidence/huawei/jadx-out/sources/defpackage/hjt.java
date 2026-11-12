package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.CommonUtils;

/* JADX INFO: loaded from: classes9.dex */
public class hjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36826a;
    private final Dialog e;

    private hjt(Activity activity) {
        this.f36826a = activity;
        this.e = new Dialog(activity, R.style.sugDialogStyle);
    }

    public static hjt d(Activity activity) {
        return new hjt(activity);
    }

    public hjt b(int i) {
        this.e.setContentView(i);
        this.e.setCanceledOnTouchOutside(true);
        return this;
    }

    public hjt e(int i) {
        this.e.setContentView(i);
        this.e.setCanceledOnTouchOutside(false);
        return this;
    }

    public Dialog a() {
        return this.e;
    }

    public hjt e(int i, View.OnClickListener onClickListener) {
        if (this.e.findViewById(i) != null) {
            this.e.findViewById(i).setOnClickListener(onClickListener);
        }
        return this;
    }

    public hjt e(int i, int i2) {
        if (this.e.findViewById(i) != null) {
            if (this.e.findViewById(i) instanceof HealthTextView) {
                ((HealthTextView) this.e.findViewById(i)).setText(i2);
                return this;
            }
            LogUtil.j("Suggestion_DialogHelper", "mDialog.findViewById(layoutId) not instanceof HealthTextView");
        }
        return this;
    }

    public hjt d(int i, int i2) {
        if (this.e.findViewById(i) != null) {
            if (this.e.findViewById(i) instanceof HealthButton) {
                ((HealthButton) this.e.findViewById(i)).setText(i2);
                return this;
            }
            LogUtil.j("Suggestion_DialogHelper", "mDialog.findViewById(layoutId) not instanceof HealthButton");
        }
        return this;
    }

    public hjt b(String str) {
        Context context = this.f36826a;
        if (context == null) {
            return e();
        }
        if ((context instanceof BaseActivity) && ((BaseActivity) context).isSupportFoldingModel()) {
            this.e.dismiss();
            WindowManager.LayoutParams attributes = this.e.getWindow().getAttributes();
            WindowManager windowManagerT = CommonUtils.t();
            if ("HORIZONTAL_FOLDING_MODE".equals(str) && windowManagerT != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManagerT.getDefaultDisplay().getMetrics(displayMetrics);
                attributes.y = displayMetrics.heightPixels / 4;
                this.e.getWindow().setAttributes(attributes);
            } else {
                attributes.y = 0;
                attributes.gravity = 17;
                this.e.getWindow().setAttributes(attributes);
            }
            this.e.show();
            return this;
        }
        return e();
    }

    public hjt e() {
        this.e.show();
        return this;
    }

    public hjt b() {
        this.e.dismiss();
        return this;
    }

    public boolean c() {
        return this.e.isShowing();
    }
}
