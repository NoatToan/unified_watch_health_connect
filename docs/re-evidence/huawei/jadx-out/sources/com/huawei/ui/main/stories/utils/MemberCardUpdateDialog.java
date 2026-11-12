package com.huawei.ui.main.stories.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.datatype.RecommendCardBean;
import com.huawei.health.operationbundle.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqf;
import defpackage.qsp;

/* JADX INFO: loaded from: classes19.dex */
public class MemberCardUpdateDialog extends BaseDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f29080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f29081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f29082c;
    private HealthTextView d;
    private Context e;
    private HealthTextView h;

    public MemberCardUpdateDialog(Context context) {
        super(context, R.style.MemberCardDialogStyle);
        this.e = context;
        e();
    }

    private void e() {
        Context context = this.e;
        if (context == null) {
            LogUtil.j("MemberCardUpdateDialog", "mContext is null");
            return;
        }
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.member_open_weight_change_guide, (ViewGroup) null);
        setContentView(viewInflate);
        this.f29081b = (ImageView) viewInflate.findViewById(R.id.recommend_card_background);
        this.h = (HealthTextView) viewInflate.findViewById(R.id.card_title);
        this.f29082c = (HealthTextView) viewInflate.findViewById(R.id.card_subtitle);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.card_subtitle_data_part);
        this.f29080a = (HealthButton) viewInflate.findViewById(R.id.start_button);
        ((HealthButton) viewInflate.findViewById(R.id.light_weight_change_guide_button)).setOnClickListener(this);
    }

    public void d(Object obj) {
        if (obj instanceof RecommendCardBean) {
            RecommendCardBean recommendCardBean = (RecommendCardBean) obj;
            this.h.setTextColor(recommendCardBean.getTitleColor().intValue());
            this.h.setText(qsp.c(recommendCardBean.getTitle()));
            this.f29082c.setText(recommendCardBean.getSubtitle());
            this.d.setText(recommendCardBean.getSubtitleDataLine());
            this.f29080a.setText(recommendCardBean.getButtonText());
            this.f29080a.setBackground(c(recommendCardBean.getButtonColor().intValue()));
            if (recommendCardBean.getBackGround() != null) {
                this.f29081b.setImageDrawable(d(recommendCardBean.getBackGround()));
                return;
            }
            return;
        }
        if (obj instanceof Bitmap) {
            this.f29081b.setImageDrawable(d((Bitmap) obj));
        } else if (obj instanceof String) {
            this.h.setText((String) obj);
        } else {
            LogUtil.j("MemberCardUpdateDialog", "error data");
        }
    }

    private Drawable d(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(BaseApplication.b().getResources(), bitmap);
        if (bitmap == null || bitmap.isRecycled()) {
            LogUtil.j("MemberCardUpdateDialog", "bitmap is null or is recycled");
            return bitmapDrawable;
        }
        try {
            if (Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888) == null) {
                LogUtil.j("MemberCardUpdateDialog", "roundRectangleBitmap is null");
                return bitmapDrawable;
            }
            RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(BaseApplication.b().getResources(), bitmap);
            roundedBitmapDrawableCreate.setCornerRadius(qqf.d);
            roundedBitmapDrawableCreate.setAntiAlias(true);
            return roundedBitmapDrawableCreate;
        } catch (OutOfMemoryError unused) {
            LogUtil.e("MemberCardUpdateDialog", "outOfMemoryError");
            return bitmapDrawable;
        }
    }

    private GradientDrawable c(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(qqf.d);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        if (isShowing()) {
            return;
        }
        super.show();
        LogUtil.a("MemberCardUpdateDialog", "show dialog");
        Window window = getWindow();
        window.setDimAmount(0.8f);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setGravity(16);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("MemberCardUpdateDialog", "onClick, view is null");
        } else if (view.getId() == R.id.light_weight_change_guide_button || view.getId() == R.id.button_layout) {
            dismiss();
        }
    }
}
