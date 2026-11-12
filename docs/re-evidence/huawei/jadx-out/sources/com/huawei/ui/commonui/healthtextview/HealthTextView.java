package com.huawei.ui.commonui.healthtextview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.R;
import com.huawei.uikit.phone.hwtextview.widget.HwTextView;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class HealthTextView extends HwTextView implements AutoRiseInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23536a;
    private String aa;
    private float ab;
    private int ac;
    private int ad;
    private Paint ae;
    private AnimationSet af;
    private ScaleAnimation ag;
    private Rect ah;
    private Paint ai;
    private int aj;
    private String ak;
    private int al;
    private float am;
    private TextPaint an;
    private int ao;
    private int ap;
    private Timer aq;
    private int ar;
    private TimerTask as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f23537b;
    private AlphaAnimation e;
    private int f;
    private float g;
    private long h;
    private String i;
    private Matrix j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private TextLineListener u;
    private boolean v;
    private LinearGradient w;
    private boolean x;
    private boolean y;
    private float z;
    private static final String d = System.lineSeparator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f23535c = qrs.d(BaseApplication.b(), 30.0f);

    /* JADX INFO: loaded from: classes16.dex */
    public interface TextLineListener {
        void onCallback();
    }

    static /* synthetic */ int c(HealthTextView healthTextView, int i) {
        int i2 = healthTextView.ac + i;
        healthTextView.ac = i2;
        return i2;
    }

    static /* synthetic */ int e(HealthTextView healthTextView, int i) {
        int i2 = healthTextView.ad + i;
        healthTextView.ad = i2;
        return i2;
    }

    public HealthTextView(Context context) {
        this(context, null);
        this.f23537b = context;
    }

    public HealthTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f23537b = context;
    }

    public HealthTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = false;
        this.r = true;
        this.am = 0.0f;
        this.g = 0.0f;
        this.s = false;
        this.ao = 0;
        this.ap = 0;
        this.o = true;
        this.an = new TextPaint();
        this.ad = 0;
        this.ac = 0;
        this.t = true;
        this.i = "";
        this.f23537b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.healthTextView);
        this.k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.healthTextView_control_zoom, false);
        this.n = typedArrayObtainStyledAttributes.getBoolean(R.styleable.healthTextView_auto_scale, false);
        this.l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.healthTextView_auto_text, false);
        this.x = typedArrayObtainStyledAttributes.getBoolean(R.styleable.healthTextView_share_text, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.healthTextView_scroll_text, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.k) {
            Paint paint = new Paint();
            this.ae = paint;
            paint.set(getPaint());
            float textSize = getTextSize();
            this.z = textSize;
            if (textSize <= c(15.0f)) {
                this.z = c(15.0f);
            }
            this.ab = c(7.0f);
        }
        if (this.q) {
            this.ah = new Rect();
            this.aq = new Timer("LastBottomBaseLineTextView");
            d dVar = new d();
            this.as = dVar;
            this.aq.schedule(dVar, 0L, 33L);
        }
        this.p = "V12".equals(CommonUtil.ab());
        this.m = Build.VERSION.SDK_INT == 29;
    }

    public void setSplitable(boolean z, int i, String str) {
        this.y = z;
        this.ar = i;
        if (str != null) {
            this.i = str;
        }
    }

    public void setSplittable(boolean z) {
        this.y = z;
    }

    public void setConnectionSymbol(boolean z) {
        this.r = z;
    }

    @Override // com.huawei.uikit.hwtextview.widget.HwTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.y && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            CharSequence charSequenceJ = j();
            if (!TextUtils.isEmpty(charSequenceJ)) {
                setText(charSequenceJ);
            }
        }
        if (this.x) {
            c(i, i2);
        }
    }

    private void c(int i, int i2) {
        int iMakeMeasureSpec;
        this.an.setTextSize(getResources().getDisplayMetrics().scaledDensity * getTextSize());
        if (qrs.e(this.f23537b, getTextSize()) < 20) {
            this.f = 4;
        } else if (qrs.e(this.f23537b, getTextSize()) < 40) {
            this.f = 6;
        } else {
            this.f = 8;
        }
        if (this.p && this.m) {
            this.f *= 2;
            if (qrs.e(this.f23537b, getTextSize()) > 20) {
                this.f += 4;
            }
        }
        float fMeasureText = getPaint().measureText(getText().toString());
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int iD = (int) (qrs.d(this.f23537b, this.f) + fMeasureText);
            if (size > iD) {
                size = iD;
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode);
        } else if (mode == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (qrs.d(this.f23537b, this.f) + fMeasureText), mode);
        } else {
            iMakeMeasureSpec = mode != 1073741824 ? 0 : View.MeasureSpec.makeMeasureSpec(size, mode);
        }
        setMeasuredDimension(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), View.MeasureSpec.getMode(i2)));
    }

    @Override // com.huawei.uikit.hwtextview.widget.HwTextView
    public void setAutoTextInfo(int i, int i2, int i3) {
        super.setAutoTextInfo(i, i2, i3);
    }

    private CharSequence j() {
        float f;
        String strReplaceAll;
        int i;
        int i2;
        CharSequence text = getText();
        String string = text.toString();
        String[] strArrSplit = string.split(d);
        TextPaint paint = getPaint();
        StringBuilder sb = new StringBuilder();
        float measureWidth = (getMeasureWidth() - getPaddingLeft()) - getPaddingRight();
        int length = strArrSplit.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str = strArrSplit[i3];
            if (i4 != 0 || (i2 = this.ar) == 0) {
                f = measureWidth;
                strReplaceAll = str;
            } else {
                f = measureWidth - i2;
                strReplaceAll = str.replaceAll(this.i, "");
            }
            if (paint.measureText(strReplaceAll) <= f) {
                sb.append(str);
            } else {
                if (!Pattern.compile(".*[a-zA-Z]+.*").matcher(strReplaceAll).matches()) {
                    return null;
                }
                if (i4 != 0 || this.ar == 0) {
                    i = 0;
                } else {
                    sb.append(this.i);
                    i = this.ar;
                }
                e(paint, f, i, strReplaceAll, sb);
            }
            sb.append(d);
            i4++;
            i3++;
            measureWidth = f;
        }
        if (!string.endsWith(d)) {
            sb.deleteCharAt(sb.length() - 1);
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        if (text instanceof Spanned) {
            TextUtils.copySpansFrom((Spanned) text, 0, text.length(), null, spannableString, 0);
        }
        return spannableString;
    }

    private void e(Paint paint, float f, int i, String str, StringBuilder sb) {
        int i2 = 0;
        if (paint.measureText(String.valueOf(str.charAt(0))) > f) {
            LogUtil.d("LastBottomBaseLineTextView", "a single character has no display space,return");
            return;
        }
        float f2 = f;
        float fMeasureText = 0.0f;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            fMeasureText += paint.measureText(String.valueOf(cCharAt));
            if (fMeasureText <= f2) {
                sb.append(cCharAt);
            } else {
                if (i != 0) {
                    f2 = f + i;
                }
                int i3 = i2 - 1;
                i2 -= 2;
                if (e(str, i3, i2)) {
                    sb.deleteCharAt(sb.length() - 1);
                    e(sb);
                } else {
                    sb.append(d);
                    i2 = i3;
                }
                fMeasureText = 0.0f;
            }
            i2++;
        }
    }

    private void e(StringBuilder sb) {
        if (this.r) {
            sb.append(Constants.LINK);
            sb.append(d);
        } else {
            sb.append(d);
            sb.append(Constants.LINK);
        }
    }

    private boolean e(String str, int i, int i2) {
        boolean z;
        boolean z2;
        if (i2 >= 0) {
            z2 = str.charAt(i2) == ' ' || str.charAt(i) == ' ';
            z = (str.charAt(i2) == '(' || str.charAt(i) == '(') || (str.charAt(i2) == ')' || str.charAt(i) == ')') || (str.charAt(i2) == 65288 || str.charAt(i) == 65288) || (str.charAt(i2) == 65289 || str.charAt(i) == 65289);
        } else {
            z = false;
            z2 = false;
        }
        if (this.ar != 0) {
            return c(Character.valueOf(str.charAt(i))) && c(Character.valueOf(str.charAt(i + 1)));
        }
        return (z2 || z) ? false : true;
    }

    private boolean c(Character ch) {
        return Character.isUpperCase(ch.charValue()) || Character.isLowerCase(ch.charValue());
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        Layout layout = getLayout();
        if (layout == null) {
            return super.getBaseline();
        }
        if (layout.getLineCount() > 0) {
            return (super.getBaseline() - layout.getLineBaseline(0)) + layout.getLineBaseline(layout.getLineCount() - 1);
        }
        return 0;
    }

    private void g() {
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.am, this.g);
        valueAnimatorOfFloat.setDuration(this.h);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ui.commonui.healthtextview.HealthTextView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (LanguageUtil.l(HealthTextView.this.getContext())) {
                    HealthTextView.this.setText(new DecimalFormat("##0.00").format(CommonUtil.f(valueAnimatorOfFloat.getAnimatedValue().toString())));
                } else {
                    HealthTextView.this.setText(UnitUtil.e(CommonUtil.f(valueAnimatorOfFloat.getAnimatedValue().toString()), 1, 2));
                }
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // com.huawei.ui.commonui.healthtextview.AutoRiseInterface
    public void start() {
        g();
    }

    @Override // com.huawei.ui.commonui.healthtextview.AutoRiseInterface
    public void setNumber(float f, float f2) {
        this.am = f;
        this.g = f2;
    }

    @Override // com.huawei.ui.commonui.healthtextview.AutoRiseInterface
    public void setDuration(long j) {
        this.h = j;
    }

    private void d(String str, int i) {
        if (i > 0) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            if (paddingLeft == 0) {
                LogUtil.j("LastBottomBaseLineTextView", "refitText actualTextWidth is zero");
                return;
            }
            if (!this.n) {
                this.ae.setTextSize(getTextSize());
                this.al = (int) Math.ceil(this.ae.measureText(str) / paddingLeft);
                d();
                return;
            }
            float f = paddingLeft;
            float f2 = this.z;
            this.ae.setTextSize(f2);
            float fMeasureText = this.ae.measureText(str);
            while (true) {
                float f3 = this.ab;
                if (f2 <= f3 || fMeasureText <= 2.8f * f) {
                    break;
                }
                f2 -= 1.0f;
                if (f2 <= f3) {
                    f2 = f3;
                    break;
                } else {
                    this.ae.setTextSize(f2);
                    fMeasureText = this.ae.measureText(str);
                }
            }
            this.al = (int) Math.ceil(fMeasureText / f);
            d();
            setTextSize(0, f2);
        }
    }

    private void d() {
        TextLineListener textLineListener;
        if (!this.v || (textLineListener = this.u) == null) {
            return;
        }
        this.v = false;
        textLineListener.onCallback();
    }

    public void c(TextLineListener textLineListener) {
        this.u = textLineListener;
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.k) {
            this.v = true;
            d(getText().toString(), getWidth());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.k && i != i3) {
            d(getText().toString(), i);
            return;
        }
        if (this.s && this.ao == 0) {
            int measuredWidth = getMeasuredWidth();
            this.ao = measuredWidth;
            if (measuredWidth > 0) {
                this.ai = getPaint();
                LinearGradient linearGradient = new LinearGradient(-this.ao, 0.0f, 0.0f, 0.0f, new int[]{Integer.MIN_VALUE, -1, Integer.MIN_VALUE}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
                this.w = linearGradient;
                this.ai.setShader(linearGradient);
                this.j = new Matrix();
            }
        }
    }

    private int c(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            LogUtil.e("LastBottomBaseLineTextView", "onDraw canvas == null");
            return;
        }
        if (this.s) {
            super.onDraw(canvas);
            h();
        } else if (this.l) {
            a(canvas);
        } else if (this.q) {
            c(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    private void c(Canvas canvas) {
        this.ak = getText().toString();
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        String str = this.ak;
        paint.getTextBounds(str, 0, str.length(), this.ah);
        float fDescent = (((-paint.ascent()) + paint.descent()) / 2.0f) - paint.descent();
        if (this.ah.width() < getWidth()) {
            canvas.drawText(this.ak, 0.0f, (getHeight() / 2.0f) + fDescent, paint);
        } else {
            canvas.drawText(this.ak, this.ad, (getHeight() / 2.0f) + fDescent, paint);
            canvas.drawText(this.ak, this.ac, (getHeight() / 2.0f) + fDescent, paint);
        }
    }

    private void a(Canvas canvas) {
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = fontMetrics.descent - fontMetrics.ascent;
        float f2 = f;
        for (String str : c(getText().toString(), paint, getWidth() - (paint.getTextSize() / 2.0f))) {
            canvas.drawText(str, 0.0f, f2, paint);
            f2 += fontMetrics.leading + f;
        }
    }

    private void h() {
        Matrix matrix;
        if (!this.o || (matrix = this.j) == null) {
            return;
        }
        int i = this.ap;
        int i2 = this.ao;
        int i3 = i + (i2 / 10);
        this.ap = i3;
        if (i3 > i2 * 2) {
            this.ap = -i2;
        }
        matrix.setTranslate(this.ap, 0.0f);
        this.w.setLocalMatrix(this.j);
        postInvalidateDelayed(50L);
    }

    private String[] c(String str, Paint paint, float f) {
        int length = str.length();
        float fMeasureText = paint.measureText(str);
        if (fMeasureText <= f) {
            return new String[]{str};
        }
        int iCeil = (int) Math.ceil(fMeasureText / f);
        String[] strArr = new String[iCeil];
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length && i3 < iCeil) {
            if (paint.measureText(str, i, i2) > f) {
                strArr[i3] = (String) str.subSequence(i, i2);
                i3++;
                i = i2;
            }
            if (i2 == length) {
                if (!(str.subSequence(i, i2) instanceof String)) {
                    break;
                }
                strArr[i3] = (String) str.subSequence(i, i2);
                return strArr;
            }
            i2++;
        }
        return strArr;
    }

    public void e(int i) {
        this.f23536a = i;
        a(i);
        this.e = new AlphaAnimation(0.0f, 1.0f);
        this.ag = new ScaleAnimation(10.0f, 1.0f, 10.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        d(300, 0, 400);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, final int i2, final int i3) {
        setAlpha(1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        this.af = animationSet;
        animationSet.addAnimation(this.e);
        this.af.addAnimation(this.ag);
        this.af.setDuration(i);
        this.af.setFillAfter(true);
        this.af.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.ui.commonui.healthtextview.HealthTextView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                HealthTextView.this.postDelayed(new Runnable() { // from class: com.huawei.ui.commonui.healthtextview.HealthTextView.4.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (i2 == 0) {
                            if (HealthTextView.this.f23536a == 0) {
                                HealthTextView.this.setAlpha(0.0f);
                                return;
                            }
                            HealthTextView.this.e = new AlphaAnimation(1.0f, 0.0f);
                            HealthTextView.this.ag = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                            HealthTextView.this.d(292, 1, 0);
                        }
                    }
                }, i3);
            }
        });
        startAnimation(this.af);
    }

    private void a(int i) {
        setAlpha(0.0f);
        this.aa = UnitUtil.e(i, 1, 0);
        if (i == 0) {
            this.aa = "GO";
            setTextSize(2, 150.0f);
        } else {
            setTextSize(2, 200.0f);
        }
        setTypeface(Typeface.createFromAsset(this.f23537b.getAssets(), "fonts/HarmonyOS_SansCondensedItalic_Bold.ttf"));
        setText(this.aa);
        setGravity(17);
        setTextColor(getResources().getColor(R.color.common_color_white));
        setLayerType(1, null);
        this.ag = new ScaleAnimation(1.0f, 10.0f, 1.0f, 10.0f, 1, 0.5f, 1, 0.5f);
        this.e = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        this.af = animationSet;
        animationSet.addAnimation(this.e);
        this.af.addAnimation(this.ag);
        this.af.setDuration(1L);
        this.af.setFillAfter(true);
        startAnimation(this.af);
    }

    public void setLockText(boolean z) {
        this.s = z;
    }

    public void e() {
        Timer timer = this.aq;
        if (timer != null) {
            timer.cancel();
        }
    }

    public void a() {
        this.as = new d();
        Timer timer = new Timer("LastBottomBaseLineTextView");
        this.aq = timer;
        timer.schedule(this.as, 0L, 33L);
    }

    public void c() {
        this.ad = 0;
        this.ac = 0;
        this.t = true;
    }

    public void setSpeed(int i) {
        this.aj = i;
    }

    /* JADX INFO: loaded from: classes16.dex */
    class d extends TimerTask {
        private d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (HealthTextView.this.ah.width() < HealthTextView.this.getWidth()) {
                return;
            }
            if (HealthTextView.this.aj < 0) {
                a();
            } else {
                b();
            }
            HealthTextView.this.postInvalidate();
        }

        private void b() {
            if (HealthTextView.this.ad > HealthTextView.this.ah.width() + HealthTextView.this.getPaddingStart()) {
                HealthTextView healthTextView = HealthTextView.this;
                healthTextView.ad = (-healthTextView.ah.width()) - HealthTextView.f23535c;
            }
            if (HealthTextView.this.ac > HealthTextView.this.ah.width() + HealthTextView.this.getPaddingStart()) {
                HealthTextView healthTextView2 = HealthTextView.this;
                healthTextView2.ac = (-healthTextView2.ah.width()) - HealthTextView.f23535c;
            }
            if (HealthTextView.this.ad > HealthTextView.this.ac) {
                HealthTextView.this.t = true;
            } else {
                HealthTextView.this.t = false;
            }
            if (HealthTextView.this.t) {
                HealthTextView healthTextView3 = HealthTextView.this;
                HealthTextView.e(healthTextView3, healthTextView3.aj);
                HealthTextView healthTextView4 = HealthTextView.this;
                healthTextView4.ac = (healthTextView4.ad - HealthTextView.f23535c) - HealthTextView.this.ah.width();
                return;
            }
            HealthTextView healthTextView5 = HealthTextView.this;
            HealthTextView.c(healthTextView5, healthTextView5.aj);
            HealthTextView healthTextView6 = HealthTextView.this;
            healthTextView6.ad = (healthTextView6.ac - HealthTextView.f23535c) - HealthTextView.this.ah.width();
        }

        private void a() {
            if (HealthTextView.this.ad < (-HealthTextView.this.ah.width()) - HealthTextView.this.getPaddingEnd()) {
                HealthTextView healthTextView = HealthTextView.this;
                healthTextView.ad = healthTextView.ah.width() + HealthTextView.this.getPaddingEnd();
            }
            if (HealthTextView.this.ac < (-HealthTextView.this.ah.width()) - HealthTextView.this.getPaddingEnd()) {
                HealthTextView healthTextView2 = HealthTextView.this;
                healthTextView2.ac = healthTextView2.ah.width() + HealthTextView.this.getPaddingEnd();
            }
            if (HealthTextView.this.ad < HealthTextView.this.ac) {
                HealthTextView.this.t = true;
            } else {
                HealthTextView.this.t = false;
            }
            if (HealthTextView.this.t) {
                HealthTextView healthTextView3 = HealthTextView.this;
                HealthTextView.e(healthTextView3, healthTextView3.aj);
                HealthTextView healthTextView4 = HealthTextView.this;
                healthTextView4.ac = healthTextView4.ad + HealthTextView.f23535c + HealthTextView.this.ah.width();
                return;
            }
            HealthTextView healthTextView5 = HealthTextView.this;
            HealthTextView.c(healthTextView5, healthTextView5.aj);
            HealthTextView healthTextView6 = HealthTextView.this;
            healthTextView6.ad = healthTextView6.ac + HealthTextView.f23535c + HealthTextView.this.ah.width();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TimerTask timerTask = this.as;
        if (timerTask != null) {
            timerTask.cancel();
            this.as = null;
        }
        Timer timer = this.aq;
        if (timer != null) {
            timer.cancel();
            this.aq = null;
        }
    }

    public int getTextLine() {
        return this.al;
    }

    public float getTextWidth() {
        TextPaint paint = getPaint();
        if (paint == null) {
            LogUtil.j("LastBottomBaseLineTextView", "getTextWidth textPaint is null");
            return 0.0f;
        }
        return paint.measureText(String.valueOf(getText()));
    }

    public float getMeasureWidth() {
        TextPaint paint = getPaint();
        if (paint == null) {
            LogUtil.j("LastBottomBaseLineTextView", "getMeasureWidth textPaint is null");
            return 0.0f;
        }
        return paint.measureText(String.valueOf(getText()));
    }

    public void setZoomSize(int i, float f) {
        if (f <= 0.0f) {
            ReleaseLogUtil.d("LastBottomBaseLineTextView", "setZoomSize zoomFactor ", Float.valueOf(f), " dimensionResourcesId ", Integer.valueOf(i));
            return;
        }
        int iB = qre.b(i);
        if (iB <= 0) {
            ReleaseLogUtil.d("LastBottomBaseLineTextView", "setZoomSize dimensionPixelSize ", Integer.valueOf(iB), " dimensionResourcesId ", Integer.valueOf(i), " zoomFactor ", Float.valueOf(f));
        } else {
            setTextSize(0, Math.min(getTextSize(), iB * f));
        }
    }
}
