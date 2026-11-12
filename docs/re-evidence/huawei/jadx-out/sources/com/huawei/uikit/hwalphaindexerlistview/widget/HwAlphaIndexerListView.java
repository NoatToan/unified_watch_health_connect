package com.huawei.uikit.hwalphaindexerlistview.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.huawei.uikit.hwalphaindexerlistview.R;
import defpackage.xcv;
import defpackage.xdo;
import defpackage.xds;
import defpackage.xei;
import defpackage.xet;
import defpackage.xfs;
import defpackage.xft;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class HwAlphaIndexerListView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f29245a;
    private e[] aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private Paint ah;
    private int ai;
    private String[] aj;
    private ValueAnimator ak;
    private boolean al;
    private String[] am;
    private String an;
    private String ao;
    private String ap;
    private boolean aq;
    private String ar;
    private String as;
    private int at;
    private int au;
    private int av;
    private List<String> aw;
    private int ax;
    private int ay;
    private float az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ListView f29246b;
    private int ba;
    private float bb;
    private int bc;
    private boolean bd;
    private boolean be;
    private boolean bf;
    private boolean bg;
    private boolean bh;
    private Context bi;
    private boolean bj;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f29247c;
    Runnable d;
    protected int e;
    protected int f;
    protected int g;
    private OnItemClickListener h;
    protected int i;
    protected float j;
    private TextView k;
    private PopupWindow l;
    private Paint m;
    private Drawable n;
    private int o;
    private int p;
    private Drawable q;
    private Handler r;
    private boolean s;
    private Map<String, String> t;
    private boolean u;
    private Drawable v;
    private boolean w;
    private Drawable x;
    private int y;
    private int z;

    public interface OnItemClickListener {
        void onItemClick(String str, int i);
    }

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            HwAlphaIndexerListView.this.ag = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            HwAlphaIndexerListView.this.invalidate();
        }
    }

    class b extends View.AccessibilityDelegate {
        private b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (view == null || accessibilityEvent == null) {
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            if (HwAlphaIndexerListView.this.ao == null) {
                return;
            }
            String str = (String) HwAlphaIndexerListView.this.t.get(HwAlphaIndexerListView.this.ao);
            accessibilityEvent.getText().add(HwAlphaIndexerListView.this.ao);
            accessibilityEvent.setContentDescription(str);
        }

        /* synthetic */ b(HwAlphaIndexerListView hwAlphaIndexerListView, c cVar) {
            this();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HwAlphaIndexerListView.this.l != null) {
                HwAlphaIndexerListView.this.l.dismiss();
            }
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29249b;

        d(int i) {
            this.f29249b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            HwAlphaIndexerListView.this.aa[this.f29249b].f29251b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            HwAlphaIndexerListView.this.invalidate();
        }
    }

    public HwAlphaIndexerListView(Context context) {
        this(context, null);
    }

    private int getHighlightPos() {
        if (this.ao == null) {
            return -1;
        }
        int size = this.f29247c.size();
        for (int i = 0; i < size; i++) {
            if (d(this.f29247c.get(i), this.ao, i)) {
                return i;
            }
        }
        return -1;
    }

    private int getSizeNum() {
        int i;
        if (this.f29245a == 0) {
            return 0;
        }
        int paddingBottom = (((this.au - (this.af * 2)) - getPaddingBottom()) - getPaddingTop()) / this.f29245a;
        int iFloor = (int) Math.floor(this.bg ? paddingBottom - 2 : paddingBottom - 1);
        if (iFloor >= 26) {
            return iFloor;
        }
        int[] iArr = {26, 18, 14, 10, 6};
        for (int i2 = 1; i2 < 5; i2++) {
            if (iFloor < iArr[i2 - 1] && iFloor >= (i = iArr[i2])) {
                iFloor = i;
                break;
            }
        }
        if (iFloor > 6) {
            return iFloor;
        }
        return 6;
    }

    protected void a(int i, Canvas canvas, int i2, int i3) {
        int i4;
        e[] eVarArr = this.aa;
        if (eVarArr == null || i >= eVarArr.length || (i4 = eVarArr[i].f29251b) == 0) {
            return;
        }
        this.ah.setAlpha(i4);
        int i5 = this.f29245a;
        RectF rectF = new RectF(i2, i3, i2 + i5, i3 + i5);
        float f = this.ac;
        canvas.drawRoundRect(rectF, f, f, this.ah);
    }

    protected void a(Canvas canvas, int i, int i2) {
        Drawable drawable = this.q;
        if (drawable == null || this.ag == 0) {
            return;
        }
        int i3 = this.af;
        int i4 = this.f;
        int i5 = this.f29245a;
        drawable.setBounds(i2 - i3, i4 - i3, i2 + i5 + i3, i4 + (i * i5) + i3);
        this.q.setAlpha(this.ag);
        this.q.draw(canvas);
    }

    public boolean a() {
        return this.bd;
    }

    public boolean a(int i) {
        if (!this.bg) {
            return false;
        }
        if (i != this.at || this.bd) {
            return i == (this.be ? this.f29247c.size() + (-2) : this.f29247c.size() - 1) && this.bd;
        }
        return true;
    }

    public void b() {
        a(this.ao);
    }

    protected void b(Canvas canvas, int i, int i2, int i3, int i4) {
        if (i == i2) {
            this.m.setColor(this.ba);
            this.m.setTypeface(Typeface.create(getResources().getString(R.string.hwalphaindexerlistview_text_medium), 0));
            if (isFocused() && hasWindowFocus()) {
                c(canvas, this.x, i3, i4);
            } else {
                c(canvas, this.v, i3, i4);
            }
        }
        int i5 = this.p;
        if (i5 == i && i5 != i2) {
            this.m.setTypeface(Typeface.create(getResources().getString(R.string.hwalphaindexerlistview_text_medium), 0));
        }
        if (i != i2) {
            a(i, canvas, i3, i4);
        }
    }

    protected void b(MotionEvent motionEvent, int i) {
        if (i >= 0 && i < this.f29247c.size()) {
            b(i);
        }
        if (isHapticFeedbackEnabled()) {
            this.az = motionEvent.getY();
        }
    }

    public boolean b(String str, String str2) {
        if (str == null || str2 == null) {
            Log.w("HwAlphaIndexerListView", "equalsChar: indexer or section is null!");
            return false;
        }
        if (str.length() != str2.length()) {
            return false;
        }
        Collator collator = Collator.getInstance();
        collator.setStrength(0);
        return collator.equals(str, str2);
    }

    protected void c(MotionEvent motionEvent, int i) {
        if (i < 0 || i >= this.f29247c.size()) {
            return;
        }
        b(i);
        if (isHapticFeedbackEnabled()) {
            String str = this.ap;
            if (str == null || !str.equals(this.as)) {
                xei.c(this, 7, 0);
                this.ap = this.as;
            }
        }
    }

    public void c(boolean z, boolean z2) {
        String[] strArr = (String[]) xds.e().j().toArray(new String[0]);
        String[] strArrB = b(strArr);
        String[] strArr2 = (String[]) xds.e().i().toArray(new String[0]);
        int sizeNum = getSizeNum();
        if (this.bg) {
            c(z, z2, sizeNum, strArr, strArr2);
        } else {
            if (sizeNum >= 26 && z && !this.s) {
                strArrB = strArr2;
            } else if (strArrB.length > sizeNum) {
                strArrB = (String[]) d(xds.a(sizeNum, Arrays.asList(strArrB))).toArray(new String[0]);
            }
            int length = strArrB.length;
            String[] strArr3 = new String[length + 1];
            this.am = strArr3;
            if (z2) {
                strArr3[length] = "#";
                System.arraycopy(strArrB, 0, strArr3, 0, strArrB.length);
            } else {
                strArr3[0] = "#";
                System.arraycopy(strArrB, 0, strArr3, 1, strArrB.length);
            }
        }
        if (!this.bg || this.bd) {
            this.f29247c = new ArrayList(Arrays.asList(this.am));
        } else {
            this.f29247c = new ArrayList(Arrays.asList(this.aj));
        }
        this.bh = z;
        f();
        invalidate();
    }

    public boolean c() {
        return this.aq;
    }

    public void d() {
        if (this.bj) {
            this.r.postDelayed(this.d, 800L);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        boolean z = ((float) this.f) > y || ((float) (getHeight() - this.e)) < y;
        if ((action == 0 || action == 2) && z) {
            return true;
        }
        int iB = b(y);
        if (action == 0) {
            b(motionEvent, iB);
        } else if (action == 1) {
            e(motionEvent, iB);
        } else if (action == 2) {
            c(motionEvent, iB);
        } else if (action == 3) {
            d();
            return false;
        }
        return true;
    }

    protected void e(MotionEvent motionEvent, int i) {
        d();
        this.av = -1;
        invalidate();
    }

    public Drawable getFocusDrawable() {
        return this.x;
    }

    public int getGravity() {
        return this.y;
    }

    public boolean getLabelShadowClip() {
        return this.w;
    }

    public int getLabelShadowColor() {
        return this.ad;
    }

    public int getLabelShadowSize() {
        return this.ab;
    }

    public int getLabelShadowStyle() {
        return this.z;
    }

    protected int getPopupGravity() {
        return this.g;
    }

    public int getPopupPosition() {
        return this.o;
    }

    public Drawable getPopupWindowBgDrawable() {
        return this.n;
    }

    protected int getPopupY() {
        return this.i;
    }

    public Object[] getSections() {
        ListView listView = this.f29246b;
        if (listView != null) {
            ListAdapter adapter = listView.getAdapter();
            if (adapter instanceof HwSortedTextListAdapter) {
                return ((HwSortedTextListAdapter) adapter).getSections();
            }
        }
        return new String[0];
    }

    public Drawable getSelectedDrawable() {
        return this.v;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PopupWindow popupWindow = this.l;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            Log.w("HwAlphaIndexerListView", "onDraw: canvas is null!");
            return;
        }
        super.onDraw(canvas);
        e();
        int size = this.f29247c.size();
        int highlightPos = this.av;
        if (highlightPos == -1) {
            highlightPos = getHighlightPos();
        }
        int width = (int) ((getWidth() - this.f29245a) / 2.0f);
        a(canvas, size, width);
        for (int i = 0; i < size; i++) {
            this.m.setColor(this.bc);
            this.m.setTypeface(Typeface.create(getResources().getString(R.string.hwalphaindexerlistview_text_regular), 0));
            int i2 = (this.f29245a * i) + this.f;
            b(canvas, i, highlightPos, width, i2);
            String strReplace = this.f29247c.get(i).replace("劃", "");
            float fMeasureText = (this.f29245a - this.m.measureText(strReplace)) / 2.0f;
            Paint.FontMetrics fontMetrics = this.m.getFontMetrics();
            float f = (fontMetrics.ascent + fontMetrics.descent) / 2.0f;
            this.j = f;
            canvas.drawText(strReplace, width + fMeasureText, (i2 + (this.f29245a / 2.0f)) - f, this.m);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            c(b(motionEvent.getY()));
        } else if (action == 10) {
            c(-1);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent == null || this.f29247c == null || this.f29246b == null) {
            return false;
        }
        Object[] sections = getSections();
        if (!(sections instanceof String[])) {
            return false;
        }
        String[] strArr = (String[]) sections;
        int highlightPos = this.av;
        if (highlightPos == -1) {
            highlightPos = getHighlightPos();
        }
        if (i == 19) {
            b(c(strArr, highlightPos));
        } else if (i == 20) {
            b(b(strArr, highlightPos));
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 20 || i == 19) {
            d();
            this.av = -1;
            invalidate();
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            size = this.ax;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.au = getMeasuredHeight();
        c(this.bh, this.be);
    }

    public void setFocusDrawable(Drawable drawable) {
        this.x = drawable;
    }

    public void setGravity(int i) {
        this.y = i;
    }

    public void setInactiveAlphaColor(int i) {
        this.bc = i;
    }

    public void setIsListViewScroll(boolean z) {
        this.aq = z;
    }

    public void setLabelShadowClip(boolean z) {
        this.w = z;
    }

    public void setLabelShadowColor(int i) {
        this.ad = i;
    }

    public void setLabelShadowEnabled(boolean z) {
        this.u = z;
    }

    public void setLabelShadowSize(int i) {
        this.ab = i;
    }

    public void setLabelShadowStyle(int i) {
        this.z = i;
    }

    public void setListViewAttachTo(ListView listView) {
        this.f29246b = listView;
        if (listView == null || this.bf) {
            return;
        }
        ListAdapter adapter = listView.getAdapter();
        if (adapter instanceof HwSortedTextListAdapter) {
            this.be = ((HwSortedTextListAdapter) adapter).isDigitLast();
        }
        c(this.bh, this.be);
        this.bf = true;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.h = onItemClickListener;
    }

    public void setOverLayInfo(String str) {
        if (str == null) {
            Log.w("HwAlphaIndexerListView", "setOverLayInfo: sectionName is null!");
            return;
        }
        if ("".equals(str)) {
            this.ao = "@";
            return;
        }
        if (str.equals(this.ao)) {
            this.ao = str;
        } else {
            this.ao = str;
            sendAccessibilityEvent(16384);
        }
        i();
    }

    protected void setPopupGravity(int i) {
        this.g = i;
    }

    public void setPopupPosition(int i) {
        this.o = i;
    }

    public void setPopupTextColor(int i) {
        this.ay = i;
    }

    public void setPopupWindowBgDrawable(Drawable drawable) {
        this.n = drawable;
    }

    public void setPopupY(int i) {
        this.i = i;
    }

    public void setSectionText(String str) {
        if (str == null) {
            Log.w("HwAlphaIndexerListView", "setSectionText: sectionName is null!");
        } else if ("".equals(str)) {
            this.ao = "@";
        } else {
            this.ao = str;
            i();
        }
    }

    public void setSelectedAlphaColor(int i) {
        this.ba = i;
    }

    public void setSelectedDrawable(Drawable drawable) {
        this.v = drawable;
    }

    public void setShowPopup(boolean z) {
        this.bj = z;
    }

    public void setSupportCompactMode(boolean z) {
        this.s = z;
    }

    class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29251b;
        ValueAnimator d;

        private e() {
            this.f29251b = 0;
        }

        /* synthetic */ e(HwAlphaIndexerListView hwAlphaIndexerListView, c cVar) {
            this();
        }
    }

    public HwAlphaIndexerListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwAlphaIndexerListViewStyle);
    }

    private void d(int i) {
        List<String> list;
        if (this.q == null || (list = this.f29247c) == null) {
            return;
        }
        boolean z = i >= 0 && i < list.size();
        if (z != this.al) {
            ValueAnimator valueAnimator = this.ak;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.ak.cancel();
            }
            this.al = z;
            ValueAnimator valueAnimatorB = xcv.b(this.ag, !z);
            this.ak = valueAnimatorB;
            valueAnimatorB.addUpdateListener(new a());
            this.ak.start();
        }
    }

    private void f() {
        int size = this.f29247c.size();
        this.aa = new e[size];
        for (int i = 0; i < size; i++) {
            this.aa[i] = new e(this, null);
        }
    }

    private void i() {
        if (this.bg) {
            if (j()) {
                if (this.bd) {
                    return;
                }
                e(false);
            } else if (this.bd) {
                e(true);
            }
        }
    }

    public void a(String str) {
        this.ap = this.as;
        this.as = str;
        if (this.bj) {
            this.r.removeCallbacks(this.d);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hwalphaindexerlistview_popup_height);
            if (this.l == null) {
                TextView textView = new TextView(getContext());
                this.k = textView;
                textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.hwalphaindexerlistview_popup_text_size));
                Drawable drawable = this.n;
                if (drawable != null) {
                    this.k.setBackground(drawable);
                }
                this.k.setTextColor(this.ay);
                this.k.setTypeface(Typeface.create(getResources().getString(R.string.hwalphaindexerlistview_text_medium), 0));
                this.k.setGravity(17);
                PopupWindow popupWindow = new PopupWindow(this.k, dimensionPixelSize, dimensionPixelSize);
                this.l = popupWindow;
                popupWindow.setAnimationStyle(R.style.Animation_Emui_HwAlphaIndexerListView_PopupWindow);
                if (Build.VERSION.SDK_INT >= 29) {
                    xet xetVar = new xet(this.bi, this.k, this.ab, this.z);
                    xetVar.c(this.u);
                    this.k.setOutlineSpotShadowColor(this.ad);
                    xetVar.d(this.w);
                }
            }
            int i = this.av;
            boolean z = i == -1 && str != null;
            boolean z2 = i != -1 && i < this.f29247c.size() && d(this.f29247c.get(this.av), str, this.av);
            if (z || z2) {
                this.k.setText(str);
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.hwalphaindexerlistview_popup_horizontal_offset);
                int[] iArr = new int[2];
                getLocationInWindow(iArr);
                int i2 = iArr[0];
                this.l.showAtLocation(getRootView(), getPopupGravity(), d(dimensionPixelSize, dimensionPixelSize2, i2, this.ax + i2), getPopupY());
            }
        }
    }

    public HwAlphaIndexerListView(Context context, AttributeSet attributeSet, int i) {
        super(e(context, i), attributeSet, i);
        this.f29247c = new ArrayList(10);
        this.j = 0.0f;
        this.g = 8388627;
        this.i = 0;
        this.d = new c();
        this.an = "A";
        this.ar = "Z";
        this.aw = new ArrayList(10);
        this.at = -1;
        this.av = -1;
        this.ay = -1;
        this.az = 0.0f;
        this.bh = false;
        this.bf = false;
        this.be = false;
        this.bj = true;
        this.m = new Paint();
        this.r = new Handler();
        this.t = new HashMap();
        this.p = -1;
        this.ai = 0;
        this.ae = 0;
        this.ah = new Paint();
        this.ag = 0;
        this.al = false;
        c(super.getContext(), attributeSet, i);
        setDefaultFocusHighlightEnabled(false);
    }

    private static Context e(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwAlphaIndexerListView);
    }

    private void c(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwAlphaIndexerListView, i, R.style.Widget_Emui_HwAlphaIndexerListView);
        this.ay = typedArrayObtainStyledAttributes.getColor(R.styleable.HwAlphaIndexerListView_hwPopupTextColor, -16777216);
        this.n = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwAlphaIndexerListView_hwPopupBgDrawable);
        this.o = typedArrayObtainStyledAttributes.getInt(R.styleable.HwAlphaIndexerListView_hwPopupPosition, 1);
        this.bc = typedArrayObtainStyledAttributes.getColor(R.styleable.HwAlphaIndexerListView_hwInactiveAlphaColor, -16777216);
        this.ba = typedArrayObtainStyledAttributes.getColor(R.styleable.HwAlphaIndexerListView_hwSelectedAlphaColor, -16776961);
        this.q = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwAlphaIndexerListView_hwHoveredBgDrawable);
        this.x = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwAlphaIndexerListView_hwFocusedDrawable);
        this.v = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwAlphaIndexerListView_hwSelectedDrawable);
        this.s = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwAlphaIndexerListView_hwSupportCompactMode, false);
        this.y = typedArrayObtainStyledAttributes.getInt(R.styleable.HwAlphaIndexerListView_android_gravity, 17);
        this.u = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwAlphaIndexerListView_hwLabelShadowEnabled, false);
        this.z = typedArrayObtainStyledAttributes.getInt(R.styleable.HwAlphaIndexerListView_hwWidgetStyle, 0);
        this.ab = typedArrayObtainStyledAttributes.getInt(R.styleable.HwAlphaIndexerListView_hwLabelShadowSize, 3);
        this.ad = typedArrayObtainStyledAttributes.getColor(R.styleable.HwAlphaIndexerListView_hwLabelShadowColor, -16777216);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.HwAlphaIndexerListView_hwHoveredDrawableColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.ah.setColor(color);
        this.ai = Color.alpha(color);
        try {
            this.ac = getResources().getDimensionPixelSize(R.dimen.hwalphaindexerlistview_text_bg_radius);
        } catch (Resources.NotFoundException unused) {
            Log.d("HwAlphaIndexerListView", "initHoverStatus: resource radius not found");
        }
        this.bi = context;
        Resources resources = context.getResources();
        this.bg = xdo.d().a(this.an) != 1;
        this.bh = resources.getConfiguration().orientation == 2;
        this.af = resources.getDimensionPixelSize(R.dimen.hwalphaindexerlistview_less_bottom_gap);
        this.ax = resources.getDimensionPixelSize(R.dimen.hwalphaindexerlistview_view_width);
        this.f29245a = resources.getDimensionPixelSize(R.dimen.hwalphaindexerlistview_text_gap);
        this.bb = resources.getDimensionPixelSize(R.dimen.hwalphaindexerlistview_text_size);
        this.m.setAntiAlias(true);
        this.m.setTextSize(this.bb);
        setContentDescription(getContext().getResources().getString(R.string.hwalphaindexerlistview_label));
        setAccessibilityDelegate(new b(this, null));
        for (String str : xds.a()) {
            this.t.put(str, str.toLowerCase(Locale.ENGLISH));
        }
    }

    private int c(String[] strArr, int i) {
        int i2;
        if (i == -1) {
            return -1;
        }
        for (int i3 = 1; i3 <= i; i3++) {
            for (int length = strArr.length - 1; length >= 0; length--) {
                int i4 = i - i3;
                if (this.f29247c.get(i4).equals(strArr[length]) || ("•".equals(this.f29247c.get(i4)) && (i2 = i4 - 1) >= 0 && this.f29247c.get(i2).compareTo(strArr[length]) < 0 && this.f29247c.get(i4 + 1).compareTo(strArr[length]) > 0)) {
                    return i4;
                }
            }
        }
        return -1;
    }

    public boolean d(String str, String str2, int i) {
        boolean z = str == null || str2 == null;
        boolean z2 = i < 0 || i >= this.f29247c.size();
        if (!z && !z2) {
            if (!str.equals("•")) {
                return b(str, str2);
            }
            this.aw.clear();
            if (!this.be) {
                this.aw.add("#");
            }
            List<String> listF = xds.e().f();
            xds.e();
            List<String> listA = xds.a();
            List<String> listD = xds.e().d();
            int sizeNum = getSizeNum();
            if (this.bg) {
                b(sizeNum, listF, listA, listD);
            } else if ((sizeNum >= 26 && this.bh) || sizeNum == 18) {
                this.aw.addAll(listD);
            } else {
                this.aw.addAll(xds.a(sizeNum, listF));
            }
            if (this.be) {
                this.aw.add("#");
            }
            for (String str3 : this.aw.get(i).split(" ")) {
                if (b(str3, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void b(int i) {
        List<String> list;
        if (this.h == null || (list = this.f29247c) == null || i < 0 || i >= list.size()) {
            return;
        }
        this.h.onItemClick(this.f29247c.get(i), i);
        invalidate();
    }

    public void setOverLayInfo(int i, String str) {
        this.av = i;
        setOverLayInfo(str);
    }

    private boolean j() {
        if (this.ao == null) {
            return false;
        }
        Object[] sections = getSections();
        String str = this.ao;
        if (sections != null && "#".equals(str)) {
            if (this.be) {
                return false;
            }
            if (sections.length > 1) {
                Object obj = sections[1];
                if (obj instanceof String) {
                    str = (String) obj;
                }
            }
        }
        return Collator.getInstance().compare(str, this.an) < 0;
    }

    private void c(boolean z, boolean z2, int i, String[] strArr, String[] strArr2) {
        String[] strArr3 = (String[]) xds.b().toArray(new String[0]);
        String[] strArr4 = (String[]) xds.a().toArray(new String[0]);
        String[] strArrB = b(strArr);
        String[] strArrB2 = b(strArr4);
        if (i < 26 || !z || this.s) {
            List<String> listA = xds.a(i, Arrays.asList(strArrB));
            List<String> listA2 = xds.a(i, Arrays.asList(strArrB2));
            String[] strArr5 = (String[]) d(listA).toArray(new String[0]);
            strArr3 = (String[]) d(listA2).toArray(new String[0]);
            strArr2 = i >= strArrB.length ? strArrB : strArr5;
            if (i >= strArrB2.length) {
                strArr3 = strArrB2;
            }
        }
        c(z2, strArr, strArr2, strArr3);
    }

    private void c(boolean z, String[] strArr, String[] strArr2, String[] strArr3) {
        int length = strArr2.length;
        String[] strArr4 = new String[length + 2];
        this.am = strArr4;
        int length2 = strArr3.length;
        String[] strArr5 = new String[length2 + 2];
        this.aj = strArr5;
        if (z) {
            strArr4[length + 1] = "#";
            strArr5[length2 + 1] = "#";
            System.arraycopy(strArr2, 0, strArr4, 0, strArr2.length);
            this.at = 0;
            String[] strArr6 = this.aj;
            strArr6[0] = strArr[0];
            System.arraycopy(strArr3, 0, strArr6, 1, strArr3.length);
            String[] strArr7 = this.am;
            int length3 = strArr7.length;
            String[] strArr8 = this.aj;
            strArr7[length3 - 2] = strArr8[strArr8.length - 2];
            return;
        }
        strArr4[0] = "#";
        strArr5[0] = "#";
        System.arraycopy(strArr2, 0, strArr4, 1, strArr2.length);
        this.at = 1;
        String[] strArr9 = this.aj;
        strArr9[1] = strArr[0];
        System.arraycopy(strArr3, 0, strArr9, 2, strArr3.length);
        String[] strArr10 = this.am;
        int length4 = strArr10.length;
        String[] strArr11 = this.aj;
        strArr10[length4 - 1] = strArr11[strArr11.length - 1];
    }

    private String[] b(String[] strArr) {
        Object[] sections = getSections();
        if (!this.s || !(sections instanceof String[])) {
            return strArr;
        }
        String[] strArr2 = (String[]) sections;
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < strArr.length; i++) {
            for (String str : strArr2) {
                if (strArr[i].equals(str)) {
                    arrayList.add(strArr[i]);
                }
            }
        }
        return arrayList.size() > 0 ? (String[]) arrayList.toArray(new String[0]) : strArr;
    }

    private List<String> d(List<String> list) {
        ArrayList arrayList = new ArrayList(10);
        for (String str : list) {
            if (str.split(" ").length > 1) {
                arrayList.add("•");
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private void c(Canvas canvas, Drawable drawable, int i, int i2) {
        if (drawable != null) {
            if (xft.d(this.bi) == 4) {
                if (c()) {
                    d();
                    this.av = -1;
                    this.ao = null;
                    this.m.setColor(this.bc);
                    this.m.setTypeface(Typeface.create(getResources().getString(R.string.hwalphaindexerlistview_text_regular), 0));
                    return;
                }
                int i3 = this.f29245a;
                drawable.setBounds(i, i2, i + i3, i3 + i2);
                drawable.draw(canvas);
                this.m.setColor(this.ba);
                this.m.setTypeface(Typeface.create(getResources().getString(R.string.hwalphaindexerlistview_text_medium), 0));
                return;
            }
            int i4 = this.f29245a;
            drawable.setBounds(i, i2, i + i4, i4 + i2);
            drawable.draw(canvas);
        }
    }

    private void e() {
        int size = this.f29247c.size();
        int i = this.au;
        int i2 = size * this.f29245a;
        if (i <= i2) {
            int i3 = this.af;
            this.f = i3;
            this.e = i3;
            return;
        }
        int i4 = this.y;
        if (i4 == 48) {
            int i5 = this.af;
            this.f = i5;
            this.e = (i - i2) - i5;
        } else if (i4 != 80) {
            int i6 = (int) ((i - i2) / 2.0f);
            this.e = i6;
            this.f = i6;
        } else {
            int i7 = this.af;
            this.e = i7;
            this.f = (i - i2) - i7;
        }
    }

    private int b(String[] strArr, int i) {
        int i2;
        if (i == -1) {
            return -1;
        }
        for (int i3 = 1; i3 < this.f29247c.size() - i; i3++) {
            for (int i4 = 0; i4 < strArr.length; i4++) {
                int i5 = i + i3;
                if (this.f29247c.get(i5).equals(strArr[i4]) || ("•".equals(this.f29247c.get(i5)) && (i2 = i5 + 1) < this.f29247c.size() && this.f29247c.get(i5 - 1).compareTo(strArr[i4]) < 0 && this.f29247c.get(i2).compareTo(strArr[i4]) > 0)) {
                    return i5;
                }
            }
        }
        return -1;
    }

    private void c(int i) {
        if (i != this.p) {
            c(i, this.ai);
            c(this.p, this.ae);
            this.p = i;
            d(i);
        }
    }

    private void c(int i, int i2) {
        e[] eVarArr;
        if (i < 0 || i >= this.f29247c.size() || (eVarArr = this.aa) == null || i >= eVarArr.length) {
            return;
        }
        ValueAnimator valueAnimator = eVarArr[i].d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorA = xcv.a(this.aa[i].f29251b, i2);
        valueAnimatorA.addUpdateListener(new d(i));
        this.aa[i].d = valueAnimatorA;
        valueAnimatorA.start();
    }

    private int b(float f) {
        int height = getHeight();
        int i = this.f;
        int i2 = (height - i) - this.e;
        if (i2 == 0) {
            return 0;
        }
        return (int) (((f - i) * this.f29247c.size()) / i2);
    }

    private void e(boolean z) {
        Animation animationLoadAnimation;
        this.f29247c.clear();
        this.f29247c = z ? new ArrayList(Arrays.asList(this.aj)) : new ArrayList(Arrays.asList(this.am));
        this.bd = !z;
        if (z) {
            animationLoadAnimation = AnimationUtils.loadAnimation(this.bi, R.anim.hwalphaindexerlistview_translate_bottom2top);
        } else {
            animationLoadAnimation = AnimationUtils.loadAnimation(this.bi, R.anim.hwalphaindexerlistview_translate_top2bottom);
        }
        setAnimation(animationLoadAnimation);
        e();
        startAnimation(animationLoadAnimation);
    }

    private int d(int i, int i2, int i3, int i4) {
        return (getParent().getLayoutDirection() != 1 ? this.o != 1 : this.o == 1) ? i4 + i2 : (i3 - i2) - i;
    }

    private void b(int i, List<String> list, List<String> list2, List<String> list3) {
        if (this.bd) {
            if ((i >= 26 && this.bh) || i == 18) {
                this.aw.addAll(list3);
            } else {
                this.aw.addAll(xds.a(i, list));
            }
            this.aw.add(this.ar);
            return;
        }
        int i2 = this.at;
        if (i2 >= 0) {
            String[] strArr = this.am;
            if (i2 < strArr.length) {
                this.aw.add(strArr[i2]);
            }
        }
        if (i >= 26 && this.bh) {
            this.aw.addAll(xds.c());
        } else if (i == 18) {
            this.aw.addAll(xds.c());
        } else {
            this.aw.addAll(xds.a(i, list2));
        }
    }
}
