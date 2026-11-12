package com.huawei.phoneservice.websurvey.widget;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.util.d;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.p;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.websurvey.R;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class NpsNoticeView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Button f21993a;
    private int aa;
    private final int[] ab;
    private final Runnable ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ImageView f21994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ProgressBar f21995c;
    protected TextView d;
    protected b e;
    protected View f;
    protected View g;
    private int h;
    private int i;
    private int j;
    private FaqConstants.FaqErrorCode k;
    private int l;
    private int m;
    private final Map<CharSequence, Integer> n;
    private int o;
    private float p;
    private float q;
    private int r;
    private String s;
    private int t;
    private int u;
    private final Map<FaqConstants.FaqErrorCode, Integer> v;
    private final Map<FaqConstants.FaqErrorCode, Integer> w;
    private final Map<FaqConstants.FaqErrorCode, Integer> x;
    private final Map<FaqConstants.FaqErrorCode, Integer> y;
    private boolean z;

    public enum b {
        ERROR,
        PROGRESS
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            this.k = FaqConstants.FaqErrorCode.DEFAULT;
        }
    }

    public void setNoticeImageViewSize(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21994b.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(i, i);
        } else {
            layoutParams.height = i;
            layoutParams.width = i;
        }
        this.f21994b.setLayoutParams(layoutParams);
    }

    public void setNoticeImageResource(int i) {
        this.f21994b.setImageResource(i);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        g.e("NpsNoticeView", "onWindowFocusChanged");
        super.onWindowFocusChanged(z);
        getLocationOnScreen(this.ab);
        g.e("NpsNoticeView", "onWindowFocusChanged location 0:" + this.ab[0] + "   location 1:" + this.ab[1]);
        setContentMarginTop(this.e == b.ERROR ? this.y.get(this.k).intValue() : this.u);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.p = motionEvent.getY();
            this.q = motionEvent.getX();
            this.r = motionEvent.getPointerId(0);
        } else if (action == 1) {
            this.r = -1;
        } else if (action == 2) {
            int i = this.r;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int x = (int) motionEvent.getX(iFindPointerIndex);
                int iAbs = Math.abs(y - ((int) this.p));
                int iAbs2 = Math.abs(x - ((int) this.q));
                int i2 = this.t;
                if (iAbs > i2 || iAbs2 > i2 || this.e == b.PROGRESS) {
                    motionEvent.setAction(3);
                }
            }
        } else if (action == 3) {
            this.r = -1;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        g.e("NpsNoticeView", "onSizeChanged");
        super.onSizeChanged(i, i2, i3, i4);
        getLocationOnScreen(this.ab);
        g.e("NpsNoticeView", "onSizeChanged location 0:" + this.ab[0] + "   location 1:" + this.ab[1]);
        boolean z = !(i4 == 0 || i2 == 0 || i2 - i4 <= this.o) || i4 == 0 || i2 == 0 || i4 - i2 <= this.o;
        g.e("NpsNoticeView", "onSizeChanged sizeEnough:" + z + "   contentSizeEnough:" + this.z);
        if (z != this.z) {
            removeCallbacks(this.ad);
            if (isAttachedToWindow()) {
                post(this.ad);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        g.e("NpsNoticeView", "onMeasure");
        super.onMeasure(i, i2);
        if (this.f21995c.getMeasuredHeight() > 0 && this.m == 0) {
            this.m = this.f21995c.getMeasuredWidth();
            int measuredHeight = this.f21995c.getMeasuredHeight();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21995c.getLayoutParams();
            int iMax = Math.max(measuredHeight, this.m);
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(iMax, iMax);
            } else {
                layoutParams.height = iMax;
                layoutParams.width = iMax;
            }
            g.e("NpsNoticeView", "onMeasure noticeProgressBar height:" + layoutParams.height + "   width:" + layoutParams.width);
            this.f21995c.setLayoutParams(layoutParams);
        }
        if (this.g.getMeasuredHeight() <= 0 || this.l != 0) {
            return;
        }
        this.l = this.f.getMeasuredHeight();
        g.e("NpsNoticeView", "onMeasure mBtnHeight:" + this.l);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g.e("NpsNoticeView", "onLayout changed:" + z);
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            removeCallbacks(this.ad);
            boolean zC = c();
            g.e("NpsNoticeView", "onLayout sizeEnough:" + zC + "contentSizeEnough:" + this.z);
            if (zC != this.z) {
                this.z = zC;
            }
            setContentMarginTop(this.e == b.ERROR ? this.y.get(this.k).intValue() : this.u);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.ad);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!q.b(view) && this.k == FaqConstants.FaqErrorCode.INTERNET_ERROR) {
            a(getContext());
        }
    }

    public int getMinContentMarginTop() {
        float dimension = getResources().getDimension(R.dimen.nps_sdk_ui_16_dip);
        if (this.f.getVisibility() == 0) {
            dimension = this.l + (getResources().getDimension(R.dimen.nps_sdk_ui_16_dip) * 2.0f);
        }
        b bVar = this.e;
        b bVar2 = b.ERROR;
        float fIntValue = bVar == bVar2 ? this.x.get(this.k).intValue() : getResources().getDimensionPixelSize(R.dimen.nps_sdk_loading_error_icon_size);
        this.j = (int) ((((getMeasuredHeight() - dimension) - a(this.d)) - getResources().getDimensionPixelSize(R.dimen.nps_sdk_notice_view_text_margin_top)) - fIntValue);
        g.e("NpsNoticeView", "getMinContentMarginTop noticeType：".concat(this.e == bVar2 ? Constants.LOG_ERROR : "PROGRESS"));
        g.e("NpsNoticeView", "getMinContentMarginTop contentMarginTop：" + Math.max(this.aa, this.j));
        g.e("NpsNoticeView", "getMinContentMarginTop contentImageOffset：" + fIntValue);
        g.e("NpsNoticeView", "getMinContentMarginTop getMeasuredHeight：" + getMeasuredHeight());
        g.e("NpsNoticeView", "getMinContentMarginTop buttonOffset：" + dimension + "    measureTextViewHeight:" + a(this.d));
        return Math.max(this.aa, this.j);
    }

    public void e(b bVar) {
        g.e("NpsNoticeView", "showNoticeType type:" + bVar);
        this.e = bVar;
        if (bVar == b.ERROR) {
            d(this.k);
            return;
        }
        this.f21994b.setVisibility(8);
        this.f21995c.setVisibility(0);
        this.f.setVisibility(4);
        this.d.setText(this.s);
        this.z = c();
        setContentMarginTop(this.u);
        setVisibility(0);
    }

    public void d(FaqConstants.FaqErrorCode faqErrorCode) {
        g.e("NpsNoticeView", "showErrorCode :" + faqErrorCode);
        this.f21994b.setVisibility(0);
        this.f21995c.setVisibility(8);
        int iIntValue = this.w.get(faqErrorCode).intValue();
        int iIntValue2 = this.v.get(faqErrorCode).intValue();
        setNoticeImageViewSize(this.x.get(faqErrorCode).intValue());
        setNoticeImageResource(iIntValue);
        e(iIntValue2);
        this.f.setVisibility(4);
        boolean z = (iIntValue == 0 && iIntValue2 == 0) ? false : true;
        if (faqErrorCode == FaqConstants.FaqErrorCode.INTERNET_ERROR && z) {
            this.f.setVisibility(0);
            this.f21993a.setText(getResources().getString(R.string.nps_sdk_common_set_network));
        }
        if (faqErrorCode != FaqConstants.FaqErrorCode.DEFAULT) {
            setVisibility(0);
        }
        this.k = faqErrorCode;
        this.e = b.ERROR;
        this.z = c();
        setContentMarginTop(this.y.get(faqErrorCode).intValue());
    }

    public void e(int i) {
        if (i == 0) {
            this.d.setVisibility(4);
        } else {
            this.d.setVisibility(0);
            this.d.setText(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentMarginTop(int i) {
        int iMax;
        g.e("NpsNoticeView", "setContentMarginTop param contentMarginTop:" + i);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        if (!this.z) {
            i = getMinContentMarginTop();
            g.e("NpsNoticeView", "setContentMarginTop getMinContentMarginTop:" + i);
        }
        e();
        b();
        if (getResources().getConfiguration().orientation == 2) {
            if (!this.z) {
                this.h = Math.min(i, this.h);
            }
            iMax = Math.max(this.h, 0);
        } else {
            iMax = this.i;
        }
        layoutParams.topMargin = iMax;
        if (this.z || this.j >= this.aa || this.f.getVisibility() != 0) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(4);
        }
        g.e("NpsNoticeView", "setContentMarginTop topMargin:" + layoutParams.topMargin);
        this.g.setLayoutParams(layoutParams);
    }

    private int getAutoFitContentSize() {
        b bVar = this.e;
        b bVar2 = b.ERROR;
        int iIntValue = bVar == bVar2 ? this.x.get(this.k).intValue() : getResources().getDimensionPixelSize(R.dimen.nps_sdk_loading_error_icon_size);
        float fA = a(this.d) + getResources().getDimensionPixelSize(R.dimen.nps_sdk_notice_view_text_margin_top);
        g.e("NpsNoticeView", "getAutoFitContentSize:   contentImageOffset:" + iIntValue + "   measureTextViewHeight(noticeTextView):" + a(this.d) + "   DimensionPixelSize" + getResources().getDimensionPixelSize(R.dimen.nps_sdk_notice_view_text_margin_top) + "   textView Height :" + this.d.getMeasuredHeight());
        int i = (int) (((float) iIntValue) + fA + 0.5f);
        return (this.e == bVar2 && this.k == FaqConstants.FaqErrorCode.INTERNET_ERROR) ? i + getResources().getDimensionPixelSize(R.dimen.nps_sdk_ui_28_dip) + this.l : i;
    }

    private void d(Context context) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.nps_sdk_notice_view_text_margin_top);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.nps_sdk_ui_108_dp);
        this.s = getResources().getString(R.string.nps_sdk_common_loading);
        this.u = getResources().getDimensionPixelOffset(R.dimen.nps_sdk_ui_108_dp);
        this.f21994b.setVisibility(8);
        this.f21995c.setVisibility(0);
        this.f.setVisibility(4);
        this.d.setText(this.s);
        b(dimensionPixelOffset, dimensionPixelOffset2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        g.e("NpsNoticeView", "checkContentSize mBtnHeight:" + this.l);
        if (this.l <= 0) {
            return true;
        }
        b bVar = this.e;
        b bVar2 = b.ERROR;
        float measuredHeight = (((getMeasuredHeight() - a(this.d)) - getResources().getDimensionPixelSize(R.dimen.nps_sdk_notice_view_text_margin_top)) - (this.e == bVar2 ? this.x.get(this.k).intValue() : getResources().getDimensionPixelSize(R.dimen.nps_sdk_loading_error_icon_size))) - (bVar == bVar2 ? this.y.get(this.k).intValue() : this.u);
        float dimension = this.f.getVisibility() == 0 ? this.l + (getResources().getDimension(R.dimen.nps_sdk_ui_16_dip) * 2.0f) : getResources().getDimension(R.dimen.nps_sdk_ui_16_dip);
        g.e("NpsNoticeView", "checkContentSize leftHeight:" + measuredHeight + "   btnHeight:" + dimension);
        return measuredHeight >= dimension;
    }

    private void a(Context context) {
        try {
            Intent intent = new Intent();
            if (d.b()) {
                intent.setAction("android.settings.WIRELESS_SETTINGS");
                intent.putExtra("use_emui_ui", true);
            } else {
                intent.setAction("android.settings.SETTINGS");
            }
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.settings.SETTINGS"));
            g.c("NpsNoticeView", "gotoNetworkSettingView error");
        }
    }

    private void b() {
        ((WindowManager) getContext().getSystemService(com.huawei.openalliance.ad.constant.Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getRealSize(new Point());
        int autoFitContentSize = getAutoFitContentSize();
        int height = (getHeight() - autoFitContentSize) / 2;
        g.e("NpsNoticeView", "calculatePortMarginTop getHeight:" + getHeight() + "   getAutoFitContentSize:" + autoFitContentSize + "   newCenterMarginTop:" + height);
        if (this.i != height) {
            g.e("NpsNoticeView", "calculatePortMarginTop portMarginTop30 != newPortMarginTop");
            this.i = height;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0055  */
    private Integer e(Context context) {
        Integer numValueOf;
        int identifier = Resources.getSystem().getIdentifier("navigationbar_emui_light", "color", "androidhwext");
        g.e("NpsNoticeView", "navigationbar_emui_light : " + identifier);
        if (identifier != 0) {
            int color = context.getResources().getColor(identifier);
            numValueOf = Integer.valueOf(color);
            String str = String.format("#%08X", numValueOf);
            int color2 = Color.parseColor("#00000000");
            g.e("NpsNoticeView", "navigationbarEmuiLight : " + str);
            numValueOf.getClass();
            if (color2 == color) {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorPrimary, typedValue, true);
        g.e("NpsNoticeView", "colorPrimary : " + typedValue.data + "  strColor: " + String.format("#%06X", Integer.valueOf(typedValue.data & ViewCompat.MEASURED_SIZE_MASK)));
        typedValue.data = context.getResources().getColor(Color.parseColor("#f0f0f0") == typedValue.data ? R.color.nps_sdk_notice_view_pad_background : R.color.nps_sdk_notice_view_background);
        return Integer.valueOf(typedValue.data);
    }

    private void d(Context context, AttributeSet attributeSet) {
        this.y.put(FaqConstants.FaqErrorCode.DEFAULT, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.nps_sdk_ui_28_dip)));
        this.x.put(FaqConstants.FaqErrorCode.DEFAULT, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.nps_sdk_loading_error_icon_size)));
        this.w.put(FaqConstants.FaqErrorCode.DEFAULT, Integer.valueOf(R.drawable.nps_sdk_ic_error_network));
        this.y.put(FaqConstants.FaqErrorCode.INTERNET_ERROR, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.nps_sdk_ui_90_dp)));
        this.w.put(FaqConstants.FaqErrorCode.INTERNET_ERROR, Integer.valueOf(R.drawable.nps_sdk_ic_error_network));
        this.x.put(FaqConstants.FaqErrorCode.INTERNET_ERROR, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.nps_sdk_error_icon_size)));
        this.v.put(FaqConstants.FaqErrorCode.INTERNET_ERROR, Integer.valueOf(R.string.nps_sdk_common_network_setting));
        this.y.put(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.nps_sdk_ui_108_dp)));
        this.x.put(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.nps_sdk_error_icon_size)));
        this.w.put(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR, Integer.valueOf(R.drawable.nps_sdk_ic_error_network));
        this.v.put(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR, Integer.valueOf(R.string.nps_sdk_common_server_disconnected));
        this.aa = getResources().getDimensionPixelOffset(R.dimen.nps_sdk_ui_16_dip);
        this.o = d.e(context) / 3;
        this.t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        LayoutInflater.from(context).inflate(R.layout.nps_sdk_widget_notice_view, this);
        this.f21994b = (ImageView) findViewById(R.id.notice_image_view);
        this.d = (TextView) findViewById(R.id.notice_text_view);
        this.f21995c = (ProgressBar) findViewById(R.id.notice_progress_view);
        this.g = findViewById(R.id.notice_view_container);
        this.f = findViewById(R.id.button_container);
        Button button = (Button) findViewById(R.id.error_button);
        this.f21993a = button;
        button.setOnClickListener(this);
        c(context);
        setBackgroundColor(e(context).intValue());
        d(context);
    }

    private void c(Context context) {
        this.f21993a.measure(0, 0);
        if (this.f21993a.getMeasuredWidth() < d.b(context)) {
            HwColumnSystem hwColumnSystem = new HwColumnSystem(context);
            hwColumnSystem.d(1);
            p.e(this.f21993a, hwColumnSystem.i());
        }
    }

    private void b(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin = i;
        this.d.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f21994b.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams2.height = -2;
            layoutParams2.width = -2;
        }
        this.f21994b.setLayoutParams(layoutParams2);
        setContentMarginTop(i2);
    }

    private void e() {
        ((WindowManager) getContext().getSystemService(com.huawei.openalliance.ad.constant.Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getRealSize(new Point());
        g.e("NpsNoticeView", "calculateCenterMarginTop location 0:" + this.ab[0] + "   location 1:" + this.ab[1]);
        int autoFitContentSize = getAutoFitContentSize();
        int height = (getHeight() - autoFitContentSize) / 2;
        g.e("NpsNoticeView", "calculateCenterMarginTop getHeight:" + getHeight() + "   getAutoFitContentSize:" + autoFitContentSize + "   newCenterMarginTop:" + height);
        if (this.h != height) {
            g.e("NpsNoticeView", "calculateCenterMarginTop centerMarginTop != newCenterMarginTop");
            this.h = height;
        }
    }

    private int e(TextView textView, String str, TextPaint textPaint) {
        StaticLayout staticLayout = new StaticLayout(str, textPaint, textView.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int maxLines = textView.getMaxLines();
        return staticLayout.getLineCount() > maxLines ? new StaticLayout(str.substring(0, staticLayout.getLineStart(maxLines) - 1), textPaint, textView.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false).getHeight() : staticLayout.getHeight();
    }

    private int a(TextView textView) {
        if (textView.getMeasuredWidth() == 0) {
            return 0;
        }
        String string = textView.getText().toString();
        if (this.n.containsKey(string)) {
            return this.n.get(string).intValue();
        }
        TextPaint paint = textView.getPaint();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = (fontMetrics.bottom - fontMetrics.top) - (fontMetrics.descent - fontMetrics.ascent);
        int i = (int) f;
        if (f > i) {
            i++;
        }
        int iE = e(textView, string, paint) + i;
        this.n.put(string, Integer.valueOf(iE));
        return iE;
    }

    class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            int iIntValue;
            NpsNoticeView npsNoticeView = NpsNoticeView.this;
            npsNoticeView.z = npsNoticeView.c();
            g.e("NpsNoticeView", "refreshAction contentSizeEnough:" + NpsNoticeView.this.z);
            NpsNoticeView npsNoticeView2 = NpsNoticeView.this;
            if (npsNoticeView2.e != b.ERROR) {
                iIntValue = npsNoticeView2.u;
            } else {
                iIntValue = ((Integer) npsNoticeView2.y.get(NpsNoticeView.this.k)).intValue();
            }
            npsNoticeView2.setContentMarginTop(iIntValue);
        }

        e() {
        }
    }

    public NpsNoticeView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    public NpsNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new HashMap();
        this.e = b.PROGRESS;
        this.l = 0;
        this.o = 0;
        this.r = -1;
        this.y = new HashMap();
        this.w = new HashMap();
        this.v = new HashMap();
        this.x = new HashMap();
        this.u = 0;
        this.z = true;
        this.ab = new int[2];
        this.ad = new e();
        d(context, attributeSet);
    }

    public NpsNoticeView(Context context) {
        super(context);
        this.n = new HashMap();
        this.e = b.PROGRESS;
        this.l = 0;
        this.o = 0;
        this.r = -1;
        this.y = new HashMap();
        this.w = new HashMap();
        this.v = new HashMap();
        this.x = new HashMap();
        this.u = 0;
        this.z = true;
        this.ab = new int[2];
        this.ad = new e();
        d(context, (AttributeSet) null);
    }
}
