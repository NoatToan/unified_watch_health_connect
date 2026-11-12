package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.SkipPosition;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.jj;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class w extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21386a = "w";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21387b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21388c = 16;
    private static int d = 4;
    private static int e = 16;
    private static int f = 16;
    private static int g = 24;
    private static int h = 24;
    private Context i;
    private String j;
    private String k;
    private int l;
    private int m;
    private int n;
    private final String o;
    private jj p;
    private boolean q;
    private Resources r;
    private TextView s;
    private boolean t;
    private int u;
    private float v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    private int getSkipAdLeftMarginPx() {
        return 0;
    }

    public void setShowLeftTime(boolean z) {
        this.t = z;
    }

    public void setLinkedOnTouchListener(View.OnTouchListener onTouchListener) {
        setOnTouchListener(onTouchListener);
    }

    public void setAdMediator(jj jjVar) {
        this.p = jjVar;
    }

    public void a(int i) {
        if (this.t && !TextUtils.isEmpty(this.k)) {
            try {
                String str = String.format(Locale.getDefault(), this.k, Integer.valueOf(i));
                hw.a(f21386a, "updateLeftTime : %s", str);
                this.s.setText(str);
                return;
            } catch (IllegalFormatException unused) {
                hw.d(f21386a, "updateLeftTime IllegalFormatException");
            }
        }
        this.s.setText(this.j);
    }

    private int getVerticalSidePaddingDp() {
        return Math.min(a(false), this.n);
    }

    private int getVerticalSideMarginDp() {
        int iA = a(false);
        int i = this.n;
        if (iA < i) {
            return 0;
        }
        return iA - i;
    }

    private int getVerticalSideBottomMarginDp() {
        int iA = a(true);
        int i = this.n;
        if (iA < i) {
            return 0;
        }
        return iA - i;
    }

    private int getTopPaddingDp() {
        return Math.min(5 == this.m ? f : f21388c, this.n);
    }

    private int getSkipAdTopPaddingPx() {
        Context context;
        int topPaddingDp;
        if (SkipPosition.LOWER_RIGHT.equals(this.o)) {
            context = this.i;
            topPaddingDp = this.n;
        } else {
            context = this.i;
            topPaddingDp = getTopPaddingDp();
        }
        return as.a(context, topPaddingDp);
    }

    private int getSkipAdTopMarginPx() {
        if (SkipPosition.LOWER_RIGHT.equals(this.o)) {
            return 0;
        }
        return as.a(this.i, getVerticalSideMarginDp());
    }

    private int getSkipAdRightPaddingPx() {
        return as.a(this.i, getHorizontalSidePaddingDp());
    }

    private int getSkipAdRightMarginPx() {
        return as.a(this.i, getHorizontalSideMarginDp());
    }

    private int getSkipAdPaddingPx() {
        return this.r.getDimensionPixelOffset(R.dimen.hiad_margin_l);
    }

    private int getSkipAdLeftPaddingPx() {
        return this.r.getDimensionPixelOffset(R.dimen.hiad_margin_m);
    }

    private RelativeLayout.LayoutParams getSkipAdLayoutParams() {
        int iA;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(SkipPosition.LOWER_RIGHT.equals(this.o) ? 12 : 10);
        layoutParams.addRule(21);
        int skipAdLeftMarginPx = getSkipAdLeftMarginPx();
        int skipAdTopMarginPx = getSkipAdTopMarginPx();
        int skipAdRightMarginPx = getSkipAdRightMarginPx();
        int skipAdBottomMarginPx = getSkipAdBottomMarginPx();
        if (1 != this.l) {
            if (!this.x) {
                skipAdRightMarginPx += this.u;
            }
            skipAdRightMarginPx = this.y ? skipAdRightMarginPx + dk.f(this.i) : dk.f(this.i);
            if ("tr".equals(this.o)) {
                iA = as.a(this.i, 12.0f);
                skipAdTopMarginPx += iA;
            }
        } else if ("tr".equals(this.o)) {
            iA = this.u;
            skipAdTopMarginPx += iA;
        }
        layoutParams.setMargins(skipAdLeftMarginPx, skipAdTopMarginPx, skipAdRightMarginPx, skipAdBottomMarginPx);
        layoutParams.setMarginEnd(skipAdRightMarginPx);
        return layoutParams;
    }

    private int getSkipAdBottomPaddingPx() {
        Context context;
        int verticalSidePaddingDp;
        if (SkipPosition.LOWER_RIGHT.equals(this.o)) {
            context = this.i;
            verticalSidePaddingDp = getVerticalSidePaddingDp();
        } else {
            context = this.i;
            verticalSidePaddingDp = this.n;
        }
        return as.a(context, verticalSidePaddingDp);
    }

    private int getSkipAdBottomMarginPx() {
        if (!SkipPosition.LOWER_RIGHT.equals(this.o)) {
            return 0;
        }
        int iF = (this.l != 0 || 5 == this.m || com.huawei.openalliance.ad.utils.ab.q(this.i) || com.huawei.openalliance.ad.utils.ab.n(this.i)) ? this.q ? 0 : dk.f(this.i) : 0;
        if (!this.q && hw.a()) {
            hw.a(f21386a, "navigation bar h: %d", Integer.valueOf(iF));
        }
        return as.a(this.i, getVerticalSideBottomMarginDp()) + iF;
    }

    private int getHorizontalSidePaddingDp() {
        return Math.min(getHorizontalSideGapDpSize(), this.n);
    }

    private int getHorizontalSideMarginDp() {
        int horizontalSideGapDpSize = getHorizontalSideGapDpSize();
        int i = this.n;
        if (horizontalSideGapDpSize < i) {
            return 0;
        }
        return horizontalSideGapDpSize - i;
    }

    private int getHorizontalSideGapDpSize() {
        int i = f21387b;
        if (5 == this.m) {
            i = e;
        }
        return !this.y ? d : i;
    }

    private void d() {
        setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.w.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (motionEvent.getAction() == 0) {
                    if (hw.a()) {
                        hw.a(w.f21386a, "touch down skipAdButton x=%f, y=%f", Float.valueOf(rawX), Float.valueOf(rawY));
                    }
                    if (!w.this.z && w.this.p != null) {
                        w.this.z = true;
                        w.this.p.a((int) rawX, (int) rawY);
                    }
                }
                return true;
            }
        });
    }

    private void c() {
        inflate(getContext(), R.layout.hiad_view_skip_button, this);
        TextView textView = (TextView) findViewById(R.id.hiad_skip_text);
        this.s = textView;
        textView.setText(this.j);
        if (this.v > 0.0f) {
            if (as.n(this.i)) {
                this.s.setTextSize(1, 24.0f);
                if (this.w > 0) {
                    this.s.setHeight(as.a(this.i, 48.0f));
                }
            } else {
                this.s.setTextSize(2, this.v);
                int i = this.w;
                if (i > 0) {
                    this.s.setHeight(as.c(this.i, i));
                }
            }
        }
        this.s.setPadding(getSkipAdPaddingPx(), 0, getSkipAdPaddingPx(), 0);
        setPaddingRelative(getSkipAdLeftPaddingPx(), getSkipAdTopPaddingPx(), getSkipAdRightPaddingPx(), getSkipAdBottomPaddingPx());
        setClickable(true);
        setLayoutParams(getSkipAdLayoutParams());
    }

    private void b() {
        Context context;
        Resources resources = this.r;
        if (resources == null || (context = this.i) == null) {
            return;
        }
        f21387b = as.b(context, resources.getDimension(R.dimen.hiad_splash_skip_phone_margin));
        f21388c = as.b(this.i, this.r.getDimension(R.dimen.hiad_splash_skip_phone_margin_top));
        d = as.b(this.i, this.r.getDimension(R.dimen.hiad_splash_skip_third_margin));
        e = as.b(this.i, this.r.getDimension(R.dimen.hiad_splash_skip_tablet_margin));
        f = as.b(this.i, this.r.getDimension(R.dimen.hiad_splash_skip_tablet_margin_top));
        g = as.b(this.i, this.r.getDimension(R.dimen.hiad_splash_skip_phone_margin_bottom));
        h = as.b(this.i, this.r.getDimension(R.dimen.hiad_splash_skip_tablet_margin_bottom));
    }

    private String a(String str) {
        String strE = dg.e(str);
        return dg.b(strE) ? this.i.getString(R.string.hiad_default_skip_text_time) : strE;
    }

    private int a(boolean z) {
        int i = z ? g : f21388c;
        if (5 == this.m) {
            return z ? h : f;
        }
        return i;
    }

    public w(Context context, String str, int i, int i2, int i3, String str2, boolean z, int i4, float f2, int i5, boolean z2) {
        super(context);
        this.n = 0;
        this.t = false;
        this.x = false;
        this.y = true;
        this.z = false;
        this.i = context;
        this.r = context.getResources();
        b();
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.o = str2 == null ? "tr" : str2;
        this.j = context.getString(R.string.hiad_default_skip_text);
        this.k = a(str);
        this.q = z;
        this.u = i4;
        this.v = f2;
        this.w = i5;
        this.x = z2;
        this.y = cc.b(context);
        c();
        this.z = false;
        d();
    }
}
