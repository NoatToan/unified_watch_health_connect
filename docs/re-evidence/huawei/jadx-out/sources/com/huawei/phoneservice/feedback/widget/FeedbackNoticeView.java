package com.huawei.phoneservice.feedback.widget;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
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
import com.huawei.hms.framework.common.Logger;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.l;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.photolibrary.internal.utils.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class FeedbackNoticeView extends FrameLayout implements View.OnClickListener {
    private static Map<CharSequence, Integer> h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ProgressBar f21784a;
    private Runnable aa;
    private int ab;
    private boolean ac;
    private b ad;
    private int ag;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected TextView f21785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ImageView f21786c;
    protected View d;
    protected c e;
    private int f;
    protected View g;
    protected Button i;
    private int j;
    private String k;
    private int l;
    private FaqConstants.FaqErrorCode m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private float r;
    private int s;
    private float t;
    private final Map<FaqConstants.FaqErrorCode, Integer> u;
    private final Map<FaqConstants.FaqErrorCode, Integer> v;
    private final Map<FaqConstants.FaqErrorCode, Integer> w;
    private int x;
    private final Map<FaqConstants.FaqErrorCode, Integer> y;
    private int[] z;

    public interface b {
        void a();
    }

    public enum c {
        ERROR,
        PROGRESS
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            this.m = FaqConstants.FaqErrorCode.DEFAULT;
        }
    }

    public void setShouldHideContactUsButton(boolean z) {
        b(this.e);
    }

    public void setProgressMarginTop(int i) {
        this.ab = i;
        b(this.e);
    }

    public void setNoticeLoadingText(String str) {
        this.k = str;
    }

    public void setNoticeImageViewSize(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21786c.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(i, i);
        } else {
            layoutParams.height = i;
            layoutParams.width = i;
        }
        this.f21786c.setLayoutParams(layoutParams);
    }

    public void setNoticeImageResource(int i) {
        this.f21786c.setImageResource(i);
    }

    public void setCallback(b bVar) {
        this.ad = bVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        g.e("FeedbackNoticeView", "onWindowFocusChanged");
        super.onWindowFocusChanged(z);
        getLocationOnScreen(this.z);
        g.e("FeedbackNoticeView", "onWindowFocusChanged location 0:" + this.z[0] + "   location 1:" + this.z[1]);
        setContentMarginTop(this.e == c.ERROR ? this.w.get(this.m).intValue() : this.ab);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.t = motionEvent.getY();
            this.r = motionEvent.getX();
            this.p = motionEvent.getPointerId(0);
        } else if (action == 1) {
            this.p = -1;
        } else if (action == 2) {
            int i = this.p;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int x = (int) motionEvent.getX(iFindPointerIndex);
                int iAbs = Math.abs(y - ((int) this.t));
                int iAbs2 = Math.abs(x - ((int) this.r));
                int i2 = this.x;
                if (iAbs > i2 || iAbs2 > i2 || this.e == c.PROGRESS) {
                    motionEvent.setAction(3);
                }
            }
        } else if (action == 3) {
            this.p = -1;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        g.e("FeedbackNoticeView", "onSizeChanged");
        super.onSizeChanged(i, i2, i3, i4);
        getLocationOnScreen(this.z);
        g.e("FeedbackNoticeView", "onSizeChanged location 0:" + this.z[0] + "   location 1:" + this.z[1]);
        boolean z = !(i4 == 0 || i2 == 0 || i2 - i4 <= this.s) || i4 == 0 || i2 == 0 || i4 - i2 <= this.s;
        g.e("FeedbackNoticeView", "onSizeChanged sizeEnough:" + z + "   contentSizeEnough:" + this.ac);
        if (z != this.ac) {
            removeCallbacks(this.aa);
            if (isAttachedToWindow()) {
                post(this.aa);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        g.e("FeedbackNoticeView", "onMeasure");
        super.onMeasure(i, i2);
        if (this.f21784a.getMeasuredHeight() > 0 && this.l == 0) {
            this.l = this.f21784a.getMeasuredWidth();
            int measuredHeight = this.f21784a.getMeasuredHeight();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21784a.getLayoutParams();
            int iMax = Math.max(measuredHeight, this.l);
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(iMax, iMax);
            } else {
                layoutParams.height = iMax;
                layoutParams.width = iMax;
            }
            g.e("FeedbackNoticeView", "onMeasure noticeProgressBar height:" + layoutParams.height + "   width:" + layoutParams.width);
            this.f21784a.setLayoutParams(layoutParams);
        }
        if (this.d.getMeasuredHeight() <= 0 || this.q != 0) {
            return;
        }
        this.q = this.g.getMeasuredHeight();
        g.e("FeedbackNoticeView", "onMeasure mBtnHeight:" + this.q);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g.e("FeedbackNoticeView", "onLayout changed:" + z);
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            removeCallbacks(this.aa);
            boolean zB = b();
            g.e("FeedbackNoticeView", "onLayout sizeEnough:" + zB + "   contentSizeEnough:" + this.ac);
            if (zB != this.ac) {
                this.ac = zB;
            }
            setContentMarginTop(this.e == c.ERROR ? this.w.get(this.m).intValue() : this.ab);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.aa);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar;
        if (q.b(view)) {
            return;
        }
        FaqConstants.FaqErrorCode faqErrorCode = this.m;
        if (faqErrorCode == FaqConstants.FaqErrorCode.INTERNET_ERROR) {
            e(getContext());
        } else {
            if (faqErrorCode != FaqConstants.FaqErrorCode.DIFFERENT_SITE || (bVar = this.ad) == null) {
                return;
            }
            bVar.a();
        }
    }

    public TextView getNoticeTextView() {
        return this.f21785b;
    }

    public int getMinContentMarginTop() {
        float dimension = getResources().getDimension(R.dimen.feedback_sdk_common_16_dip);
        if (this.g.getVisibility() == 0) {
            dimension = this.q + (getResources().getDimension(R.dimen.feedback_sdk_common_16_dip) * 2.0f);
        }
        c cVar = this.e;
        c cVar2 = c.ERROR;
        float fIntValue = cVar == cVar2 ? this.y.get(this.m).intValue() : this.f21784a.getHeight();
        this.f = (int) ((((getMeasuredHeight() - dimension) - d(this.f21785b)) - getResources().getDimensionPixelSize(R.dimen.feedback_sdk_notice_view_text_margin_top)) - fIntValue);
        g.e("FeedbackNoticeView", "getMinContentMarginTop noticeType：".concat(this.e == cVar2 ? Constants.LOG_ERROR : "PROGRESS"));
        g.e("FeedbackNoticeView", "getMinContentMarginTop contentMarginTop：" + Math.max(this.ag, this.f));
        g.e("FeedbackNoticeView", "getMinContentMarginTop contentImageOffset：" + fIntValue);
        g.e("FeedbackNoticeView", "getMinContentMarginTop getMeasuredHeight：" + getMeasuredHeight());
        g.e("FeedbackNoticeView", "getMinContentMarginTop buttonOffset：" + dimension + "    measureTextViewHeight:" + d(this.f21785b));
        return Math.max(this.ag, this.f);
    }

    public FaqConstants.FaqErrorCode getFaqErrorCode() {
        return this.m;
    }

    public int getColorPrimary() {
        Resources resources;
        int i;
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(android.R.attr.colorPrimary, typedValue, true);
        g.e("getColorPrimary", "colorPrimary : " + typedValue.data + "  strColor: " + String.format("#%06X", Integer.valueOf(typedValue.data & ViewCompat.MEASURED_SIZE_MASK)));
        if (Color.parseColor("#f0f0f0") == typedValue.data) {
            resources = getResources();
            i = R.color.feedback_sdk_notice_view_pad_background;
        } else {
            resources = getResources();
            i = R.color.feedback_sdk_notice_view_background;
        }
        typedValue.data = resources.getColor(i);
        return typedValue.data;
    }

    public void a(FaqConstants.FaqErrorCode faqErrorCode, int i) {
        this.y.put(faqErrorCode, Integer.valueOf(i));
        b(this.e);
    }

    public void c(int i) {
        if (i == 0) {
            this.f21785b.setVisibility(4);
        } else {
            this.f21785b.setVisibility(0);
            this.f21785b.setText(i);
        }
    }

    public void a(Throwable th) {
        Logger.d("FeedbackNoticeView", "dealWithHttpError error:%s", th);
        if (th != null) {
            if ((th instanceof FaqWebServiceException) && ((FaqWebServiceException) th).errorCode == 500002) {
                e(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR);
            } else {
                e();
            }
        }
    }

    public void b(c cVar) {
        g.e("FeedbackNoticeView", "showNoticeType type:" + cVar);
        this.e = cVar;
        if (cVar == c.ERROR) {
            e(this.m);
            return;
        }
        this.f21786c.setVisibility(8);
        this.f21784a.setVisibility(0);
        this.g.setVisibility(4);
        this.f21785b.setText(this.k);
        this.ac = b();
        setContentMarginTop(this.ab);
        setVisibility(0);
    }

    public void c(FaqConstants.FaqErrorCode faqErrorCode, int i) {
        this.v.put(faqErrorCode, Integer.valueOf(i));
        b(this.e);
    }

    public void e(FaqConstants.FaqErrorCode faqErrorCode) {
        g.e("FeedbackNoticeView", "showErrorCode errorCode:" + faqErrorCode);
        this.f21786c.setVisibility(0);
        this.f21784a.setVisibility(8);
        int iIntValue = this.v.get(faqErrorCode).intValue();
        int iIntValue2 = this.u.get(faqErrorCode).intValue();
        setNoticeImageViewSize(this.y.get(faqErrorCode).intValue());
        setNoticeImageResource(iIntValue);
        c(iIntValue2);
        this.g.setVisibility(4);
        d(faqErrorCode, iIntValue, iIntValue2);
        if (faqErrorCode != FaqConstants.FaqErrorCode.DEFAULT) {
            setVisibility(0);
        }
        this.m = faqErrorCode;
        this.e = c.ERROR;
        this.ac = b();
        setContentMarginTop(this.w.get(faqErrorCode).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentMarginTop(int i) {
        int i2;
        g.e("FeedbackNoticeView", "setContentMarginTop param contentMarginTop:" + i);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        if (!this.ac) {
            i = getMinContentMarginTop();
            g.e("FeedbackNoticeView", "setContentMarginTop getMinContentMarginTop:" + i);
        }
        a();
        c();
        if (getResources().getConfiguration().orientation == 2) {
            if (!this.ac) {
                this.j = Math.min(i, this.j);
            }
            i2 = this.j;
            if (i2 <= 0) {
                i2 = 0;
            }
        } else {
            i2 = this.o;
        }
        layoutParams.topMargin = i2;
        if (this.ac || this.f >= this.ag || this.g.getVisibility() != 0) {
            this.f21785b.setVisibility(0);
        } else {
            this.f21785b.setVisibility(4);
        }
        g.e("FeedbackNoticeView", "setContentMarginTop topMargin:" + layoutParams.topMargin);
        this.d.setLayoutParams(layoutParams);
    }

    private int getAutoFitContentSize() {
        int iIntValue = this.e == c.ERROR ? this.y.get(this.m).intValue() : this.f21784a.getHeight();
        float fD = d(this.f21785b) + getResources().getDimensionPixelSize(R.dimen.feedback_sdk_notice_view_text_margin_top);
        g.e("FeedbackNoticeView", "getAutoFitContentSize:   contentImageOffset:" + iIntValue + "   measureTextViewHeight(noticeTextView):" + d(this.f21785b) + "   DimensionPixelSize" + getResources().getDimensionPixelSize(R.dimen.feedback_sdk_notice_view_text_margin_top) + "   textView Height :" + this.f21785b.getMeasuredHeight());
        return (int) (((double) (iIntValue + fD)) + 0.5d);
    }

    private void e() {
        e(!com.huawei.phoneservice.faq.base.util.d.c(getContext()) ? FaqConstants.FaqErrorCode.INTERNET_ERROR : FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        g.e("FeedbackNoticeView", "checkContentSize mBtnHeight:" + this.q);
        if (this.q <= 0) {
            return true;
        }
        c cVar = this.e;
        c cVar2 = c.ERROR;
        float measuredHeight = (((getMeasuredHeight() - d(this.f21785b)) - getResources().getDimensionPixelSize(R.dimen.feedback_sdk_notice_view_text_margin_top)) - (this.e == cVar2 ? this.y.get(this.m).intValue() : this.f21784a.getHeight())) - (cVar == cVar2 ? this.w.get(this.m).intValue() : this.ab);
        float dimension = this.g.getVisibility() == 0 ? this.q + (getResources().getDimension(R.dimen.feedback_sdk_common_16_dip) * 2.0f) : getResources().getDimension(R.dimen.feedback_sdk_common_16_dip);
        g.e("FeedbackNoticeView", "checkContentSize leftHeight:" + measuredHeight + "   btnHeight:" + dimension);
        return measuredHeight >= dimension;
    }

    private void c(Context context) {
        this.i.measure(0, 0);
        if (this.i.getMeasuredWidth() < com.huawei.phoneservice.faq.base.util.d.b(context)) {
            e.a(context, this.i);
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        int color;
        int i;
        String string;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Drawable drawable2;
        int dimension = (int) context.getResources().getDimension(R.dimen.feedback_sdk_notice_view_text_size);
        int color2 = context.getResources().getColor(R.color.feedback_sdk_notice_view_default_text_color);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_notice_view_text_margin_top);
        int i2 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FeedbackNoticeView);
            drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FeedbackNoticeView_fbsdknoticeViewBackground);
            this.e = a(typedArrayObtainStyledAttributes.getInt(R.styleable.FeedbackNoticeView_fbsdknoticeViewType, 0));
            string = typedArrayObtainStyledAttributes.getString(R.styleable.FeedbackNoticeView_fbsdknoticeLoadingText);
            dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FeedbackNoticeView_fbsdknoticeTextSize, (int) context.getResources().getDimension(R.dimen.feedback_sdk_notice_view_text_size));
            color = typedArrayObtainStyledAttributes.getColor(R.styleable.FeedbackNoticeView_fbsdknoticeTextColor, context.getResources().getColor(R.color.feedback_sdk_notice_view_default_text_color));
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FeedbackNoticeView_fbsdknoticeTextMarginTop, context.getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_notice_view_text_margin_top));
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FeedbackNoticeView_fbsdknoticeContentMarginTop, getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_common_108_dp));
            drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FeedbackNoticeView_fbsdknoticeImage);
            int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FeedbackNoticeView_fbsdknoticeImageSize, -1);
            this.n = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FeedbackNoticeView_fbsdknoticeAutoFitCenterYInLandScape, false);
            typedArrayObtainStyledAttributes.recycle();
            i = dimensionPixelSize4;
            i2 = dimensionPixelSize3;
        } else {
            drawable = null;
            color = color2;
            i = -1;
            string = null;
            dimensionPixelSize = dimensionPixelOffset;
            dimensionPixelSize2 = dimension;
            drawable2 = null;
        }
        if (drawable2 != null) {
            setBackground(drawable2);
        }
        if (TextUtils.isEmpty(string)) {
            this.k = getResources().getString(R.string.feedback_sdk_common_loading);
        } else {
            this.k = string;
        }
        if (this.e == c.ERROR) {
            e(this.m);
        } else {
            this.ab = i2;
            this.f21786c.setVisibility(8);
            this.f21784a.setVisibility(0);
            this.g.setVisibility(4);
            this.f21785b.setText(this.k);
        }
        this.f21785b.setTextSize(0, dimensionPixelSize2);
        this.f21785b.setTextColor(color);
        b(i2, dimensionPixelSize, i, drawable);
    }

    public static void e(Context context) {
        try {
            Intent intent = new Intent();
            if (com.huawei.phoneservice.faq.base.util.d.b()) {
                intent.setAction("android.settings.WIRELESS_SETTINGS");
                intent.putExtra("use_emui_ui", true);
            } else {
                intent.setAction("android.settings.SETTINGS");
            }
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.settings.SETTINGS"));
            g.c("FeedbackNoticeView", "gotoNetworkSettingView ActivityNotFoundException...");
        }
    }

    private void c() {
        Point point = new Point();
        ((WindowManager) getContext().getSystemService(com.huawei.openalliance.ad.constant.Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getRealSize(point);
        int iMax = Math.max(point.x, point.y);
        g.e("FeedbackNoticeView", "calculatePortMarginTop location 0:" + this.z[0] + "   location 1:" + this.z[1]);
        int height = ((int) (((double) iMax) * 0.3d)) - this.z[1];
        int autoFitContentSize = getAutoFitContentSize();
        if (this.n || height < 0) {
            height = (getHeight() - autoFitContentSize) / 2;
        }
        g.e("FeedbackNoticeView", "calculatePortMarginTop getHeight:" + getHeight() + "   getAutoFitContentSize:" + autoFitContentSize + "   newCenterMarginTop:" + height);
        if (this.o != height) {
            g.e("FeedbackNoticeView", "calculatePortMarginTop portMarginTop30 != newPortMarginTop");
            this.o = height;
        }
    }

    private void d(FaqConstants.FaqErrorCode faqErrorCode, int i, int i2) {
        Context context;
        Resources resources;
        int i3;
        if (faqErrorCode == FaqConstants.FaqErrorCode.INTERNET_ERROR) {
            if (i != 0 || i2 != 0) {
                this.g.setVisibility(0);
                this.i.setText(getResources().getString(R.string.feedback_sdk_common_set_network));
            }
            if (this.m != faqErrorCode && (i != 0 || i2 != 0)) {
                return;
            }
            context = getContext();
            resources = getResources();
            i3 = R.string.feedback_sdk_no_network_toast;
        } else {
            if (faqErrorCode != FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR) {
                if (faqErrorCode == FaqConstants.FaqErrorCode.DIFFERENT_SITE) {
                    if (i == 0 && i2 == 0) {
                        return;
                    }
                    this.g.setVisibility(0);
                    this.i.setText(getResources().getString(R.string.feedback_sdk_back));
                    return;
                }
                return;
            }
            if (this.m != faqErrorCode && (i != 0 || i2 != 0)) {
                return;
            }
            context = getContext();
            resources = getResources();
            i3 = R.string.feedback_sdk_common_server_disconnected_toast;
        }
        l.e(context, resources.getString(i3));
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.w.put(FaqConstants.FaqErrorCode.DEFAULT, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_common_28_dp)));
        this.w.put(FaqConstants.FaqErrorCode.INTERNET_ERROR, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_common_90_dip)));
        this.w.put(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_common_108_dp)));
        this.w.put(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_common_108_dp)));
        this.w.put(FaqConstants.FaqErrorCode.DIFFERENT_SITE, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_common_108_dp)));
        this.y.put(FaqConstants.FaqErrorCode.DEFAULT, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_loading_error_icon_size)));
        this.y.put(FaqConstants.FaqErrorCode.INTERNET_ERROR, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_loading_error_icon_size)));
        this.y.put(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_loading_error_icon_size)));
        this.y.put(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_loading_empty_icon_size)));
        this.y.put(FaqConstants.FaqErrorCode.DIFFERENT_SITE, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_loading_empty_icon_size)));
        this.v.put(FaqConstants.FaqErrorCode.DEFAULT, Integer.valueOf(R.drawable.feedback_sdk_ic_no_pic_disable));
        this.v.put(FaqConstants.FaqErrorCode.INTERNET_ERROR, Integer.valueOf(R.drawable.feedback_sdk_ic_no_wifi_disable));
        this.v.put(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR, Integer.valueOf(R.drawable.feedback_sdk_ic_no_wifi_disable));
        this.v.put(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, Integer.valueOf(R.drawable.feedback_sdk_ic_no_search_result));
        this.v.put(FaqConstants.FaqErrorCode.DIFFERENT_SITE, Integer.valueOf(R.drawable.ic_icon_tips_disable));
        this.u.put(FaqConstants.FaqErrorCode.INTERNET_ERROR, Integer.valueOf(R.string.feedback_sdk_common_network_setting));
        this.u.put(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR, Integer.valueOf(R.string.faq_sdk_common_server_disconnected));
        this.u.put(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, Integer.valueOf(R.string.feedback_sdk_service_help_prepare));
        this.u.put(FaqConstants.FaqErrorCode.DIFFERENT_SITE, Integer.valueOf(R.string.feedback_sdk_inconsistent));
        this.ag = getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_common_16_dip);
        this.s = com.huawei.phoneservice.faq.base.util.d.e(context) / 3;
        this.x = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        LayoutInflater.from(context).inflate(R.layout.feedback_sdk_widget_notice_view, this);
        this.f21786c = (ImageView) findViewById(R.id.notice_image_view);
        this.f21785b = (TextView) findViewById(R.id.notice_text_view);
        this.f21784a = (ProgressBar) findViewById(R.id.notice_progress_view);
        this.d = findViewById(R.id.notice_view_container);
        this.g = findViewById(R.id.button_container);
        Button button = (Button) findViewById(R.id.error_button);
        this.i = button;
        button.setOnClickListener(this);
        c(context);
        setBackgroundColor(a(context).intValue());
        c(context, attributeSet);
    }

    private void b(int i, int i2, int i3, Drawable drawable) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21785b.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin = i2;
        this.f21785b.setLayoutParams(layoutParams);
        if (drawable != null) {
            this.f21786c.setImageDrawable(drawable);
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f21786c.getLayoutParams();
        if (i3 <= 0) {
            i3 = -2;
        }
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(i3, i3);
        } else {
            layoutParams2.height = i3;
            layoutParams2.width = i3;
        }
        this.f21786c.setLayoutParams(layoutParams2);
        setContentMarginTop(i);
    }

    private void a() {
        Point point = new Point();
        ((WindowManager) getContext().getSystemService(com.huawei.openalliance.ad.constant.Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getRealSize(point);
        int iMin = Math.min(point.x, point.y);
        g.e("FeedbackNoticeView", "calculateCenterMarginTop location 0:" + this.z[0] + "   location 1:" + this.z[1]);
        int autoFitContentSize = getAutoFitContentSize();
        int height = this.n ? (getHeight() - autoFitContentSize) / 2 : ((iMin / 2) - this.z[1]) - (autoFitContentSize / 2);
        g.e("FeedbackNoticeView", "calculateCenterMarginTop getHeight:" + getHeight() + "   getAutoFitContentSize:" + autoFitContentSize + "   newCenterMarginTop:" + height);
        if (this.j != height) {
            g.e("FeedbackNoticeView", "calculateCenterMarginTop centerMarginTop != newCenterMarginTop");
            this.j = height;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x005c  */
    public static Integer a(Context context) {
        Integer numValueOf;
        int identifier = Resources.getSystem().getIdentifier("navigationbar_emui_light", "color", "androidhwext");
        g.e("getColorPrimary", "navigationbar_emui_light : " + identifier);
        if (identifier != 0) {
            int color = context.getResources().getColor(identifier);
            numValueOf = Integer.valueOf(color);
            numValueOf.getClass();
            String str = String.format("#%08X", Integer.valueOf(color));
            int color2 = Color.parseColor("#00000000");
            g.e("getColorPrimary", "navigationbarEmuiLight : " + str);
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
        g.e("getColorPrimary", "colorPrimary : " + typedValue.data + "  strColor: " + String.format("#%06X", Integer.valueOf(typedValue.data & ViewCompat.MEASURED_SIZE_MASK)));
        typedValue.data = context.getResources().getColor(Color.parseColor("#f0f0f0") == typedValue.data ? R.color.feedback_sdk_notice_view_pad_background : R.color.feedback_sdk_notice_view_background);
        return Integer.valueOf(typedValue.data);
    }

    private c a(int i) {
        return i == 0 ? c.ERROR : c.PROGRESS;
    }

    public static int d(TextView textView) {
        if (textView.getMeasuredWidth() == 0) {
            return 0;
        }
        String string = textView.getText().toString();
        if (h.containsKey(string)) {
            return h.get(string).intValue();
        }
        TextPaint paint = textView.getPaint();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = (fontMetrics.bottom - fontMetrics.top) - (fontMetrics.descent - fontMetrics.ascent);
        int i = (int) f;
        if (f > i) {
            i++;
        }
        int i2 = i;
        StaticLayout staticLayout = new StaticLayout(string, paint, textView.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int[] iArr = new int[2];
        int maxLines = textView.getMaxLines();
        if (staticLayout.getLineCount() <= maxLines) {
            iArr[0] = -1;
            int height = staticLayout.getHeight();
            iArr[1] = height;
            h.put(string, Integer.valueOf(height + i2));
            return iArr[1] + i2;
        }
        int lineStart = staticLayout.getLineStart(maxLines) - 1;
        iArr[0] = lineStart;
        int height2 = new StaticLayout(string.substring(0, lineStart), paint, textView.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false).getHeight();
        iArr[1] = height2;
        h.put(string, Integer.valueOf(height2 + i2));
        return iArr[1] + i2;
    }

    public FeedbackNoticeView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            int iIntValue;
            FeedbackNoticeView feedbackNoticeView = FeedbackNoticeView.this;
            feedbackNoticeView.ac = feedbackNoticeView.b();
            g.e("FeedbackNoticeView", "refreshAction contentSizeEnough:" + FeedbackNoticeView.this.ac);
            FeedbackNoticeView feedbackNoticeView2 = FeedbackNoticeView.this;
            if (feedbackNoticeView2.e != c.ERROR) {
                iIntValue = feedbackNoticeView2.ab;
            } else {
                iIntValue = ((Integer) feedbackNoticeView2.w.get(FeedbackNoticeView.this.m)).intValue();
            }
            feedbackNoticeView2.setContentMarginTop(iIntValue);
        }

        d() {
        }
    }

    public FeedbackNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = 0;
        this.s = 0;
        this.p = -1;
        this.w = new HashMap();
        this.y = new HashMap();
        this.v = new HashMap();
        this.u = new HashMap();
        this.ab = 0;
        this.ac = true;
        this.z = new int[2];
        this.aa = new d();
        b(context, attributeSet);
    }

    public FeedbackNoticeView(Context context) {
        super(context);
        this.q = 0;
        this.s = 0;
        this.p = -1;
        this.w = new HashMap();
        this.y = new HashMap();
        this.v = new HashMap();
        this.u = new HashMap();
        this.ab = 0;
        this.ac = true;
        this.z = new int[2];
        this.aa = new d();
        b(context, null);
    }
}
