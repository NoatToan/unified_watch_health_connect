package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqf;
import defpackage.qrs;

/* JADX INFO: loaded from: classes33.dex */
public class UnlockSliderView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f11366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f11367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f11368c;
    private SliderListener d;
    private int e;
    private HealthTextView h;
    private float i;

    /* JADX INFO: loaded from: classes10.dex */
    public interface SliderListener {
        void siderRight();
    }

    public UnlockSliderView(Context context) {
        super(context);
        this.e = 0;
        a(context);
    }

    public UnlockSliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        a(context);
    }

    public UnlockSliderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 0;
        a(context);
    }

    public void setSliderListener(SliderListener sliderListener) {
        this.d = sliderListener;
    }

    private void a(Context context) {
        ImageView imageView = new ImageView(context);
        this.f11366a = imageView;
        imageView.setMinimumWidth(300);
        addView(this.f11366a);
        HealthTextView healthTextView = new HealthTextView(context);
        this.h = healthTextView;
        healthTextView.setText(getResources().getString(R.string.IDS_motiontrack_show_sporti_slider_unlock));
        this.h.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.h.setMaxLines(2);
        ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).setMarginStart(qrs.d(context, 8.0f));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setGravity(17);
        this.h.setAutoTextInfo(9, 1, 1);
        this.f11368c = new ImageView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        if (d()) {
            linearLayout.setGravity(8388629);
            this.h.setPadding(0, 0, qrs.d(context, 4.0f), 0);
        } else {
            linearLayout.setGravity(8388627);
            this.h.setPadding(qrs.d(context, 4.0f), 0, 0, 0);
        }
        this.f11368c.setImageDrawable(qqf.c(getResources().getDrawable(R.drawable.common_ui_arrow_right_3), getResources().getColor(R.color.colorSecondary)));
        ((ViewGroup.MarginLayoutParams) this.f11368c.getLayoutParams()).setMarginEnd(qrs.d(context, 8.0f));
        this.e = (int) this.f11368c.getX();
        c(linearLayout);
        if (getContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager) {
            Display defaultDisplay = ((WindowManager) getContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            linearLayout.setGravity(17);
            linearLayout.addView(this.f11368c);
            linearLayout.addView(this.h);
            linearLayout.setMinimumHeight(600);
            linearLayout.setMinimumWidth(i);
            addView(linearLayout);
        }
    }

    private void c(LinearLayout linearLayout) {
        linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.healthcloud.plugintrack.ui.view.UnlockSliderView.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    UnlockSliderView.this.i = motionEvent.getRawX();
                } else if (action == 1) {
                    if (UnlockSliderView.this.f11367b - UnlockSliderView.this.i >= 200.0f) {
                        UnlockSliderView.this.d.siderRight();
                    }
                    view.setX(UnlockSliderView.this.e);
                } else if (action == 2) {
                    UnlockSliderView.this.f11367b = motionEvent.getX();
                    UnlockSliderView unlockSliderView = UnlockSliderView.this;
                    unlockSliderView.a(view, motionEvent, unlockSliderView.i, UnlockSliderView.this.f11367b);
                }
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, MotionEvent motionEvent, float f, float f2) {
        if (Math.abs(f2 - f) <= 1.0E-6d || motionEvent.getRawX() > this.f11366a.getScrollX() + this.f11366a.getWidth() || motionEvent.getRawX() <= view.getWidth()) {
            return;
        }
        view.setX(motionEvent.getRawX() - view.getWidth());
    }

    private boolean d() {
        String language = getResources().getConfiguration().locale.getLanguage();
        return language.endsWith("iw") || language.endsWith("he") || language.endsWith("ar") || language.endsWith("fa") || language.endsWith(Constants.URDU_LANG);
    }
}
