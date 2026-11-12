package com.huawei.ui.commonui.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes16.dex */
public class VibrantLifeDialog extends QueueDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f23486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f23487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f23488c;
    private Context d;
    private final CountDownLatch e;
    private HealthTextView g;
    private View h;
    private HealthTextView i;
    private HealthTextView j;

    public VibrantLifeDialog(Context context) {
        super(context, R.style.CustomDialog);
        this.e = new CountDownLatch(2);
        this.d = context;
        c();
    }

    @Override // com.huawei.ui.commonui.dialog.QueueDialog
    protected boolean isDialogAbandoned() {
        Context context = this.d;
        return context == null || ((Activity) context).isFinishing();
    }

    public void a(String str) {
        this.g.setText(str);
    }

    public void d(String str) {
        this.j.setText(str);
    }

    public void d(View.OnClickListener onClickListener) {
        this.i.setOnClickListener(onClickListener);
        this.f23487b.setOnClickListener(onClickListener);
    }

    public void a(int i) {
        this.i.setText(i);
    }

    public void a(Drawable drawable) {
        this.f23487b.setImageDrawable(drawable);
    }

    private void c() {
        View viewInflate = ((LayoutInflater) this.d.getSystemService("layout_inflater")).inflate(R.layout.common_ui_vibrant_life, (ViewGroup) null);
        this.h = viewInflate;
        this.f23487b = (ImageView) viewInflate.findViewById(R.id.dialog_bg_image);
        this.g = (HealthTextView) this.h.findViewById(R.id.user_type_vibrant_life);
        this.j = (HealthTextView) this.h.findViewById(R.id.user_content_vibrant_life);
        this.i = (HealthTextView) this.h.findViewById(R.id.vibrant_life_view_now);
        this.f23488c = (HealthTextView) this.h.findViewById(R.id.vibrant_life_view_cancel);
        b(this.i);
        b(this.f23488c);
        this.f23486a = (LinearLayout) this.h.findViewById(R.id.icon_parent);
        this.f23488c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.VibrantLifeDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("VibrantLifeDialog", "onclick cancel");
                VibrantLifeDialog.this.dismiss();
            }
        });
        setContentView(this.h);
    }

    private void b(final View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.commonui.dialog.VibrantLifeDialog.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                VibrantLifeDialog.this.e.countDown();
                if (VibrantLifeDialog.this.e.getCount() <= 0) {
                    VibrantLifeDialog.this.a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HealthTextView[] healthTextViewArr = {this.f23488c, this.i};
        float f = 2.1474836E9f;
        for (int i = 0; i < 2; i++) {
            float textSize = healthTextViewArr[i].getTextSize();
            if (textSize < f) {
                f = textSize;
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            healthTextViewArr[i2].setAutoTextSize(0, f);
        }
    }
}
