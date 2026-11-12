package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.zls;
import defpackage.zns;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ek extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f6021b;
    public int c;
    public List<String> d;
    public int e;
    public int f;
    public Bitmap g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6022k;
    public int l;
    public int m;
    public int n;
    public Runnable o;
    public int p;
    public d q;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.amap.api.col.3sl.ek$a$a, reason: collision with other inner class name */
        public class RunnableC0125a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f6024a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f6025b;

            public RunnableC0125a(int i, int i2) {
                this.f6024a = i;
                this.f6025b = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ek ekVar = ek.this;
                ekVar.smoothScrollTo(0, (ekVar.n - this.f6024a) + ek.this.c);
                ek ekVar2 = ek.this;
                ekVar2.m = this.f6025b + ekVar2.f6022k + 1;
                ek.this.w();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f6026a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f6027b;

            public b(int i, int i2) {
                this.f6026a = i;
                this.f6027b = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ek ekVar = ek.this;
                ekVar.smoothScrollTo(0, ekVar.n - this.f6026a);
                ek ekVar2 = ek.this;
                ekVar2.m = this.f6027b + ekVar2.f6022k;
                ek.this.w();
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ek.this.n - ek.this.getScrollY() != 0) {
                ek ekVar = ek.this;
                ekVar.n = ekVar.getScrollY();
                ek ekVar2 = ek.this;
                ekVar2.postDelayed(ekVar2.o, ek.this.p);
                return;
            }
            if (ek.this.c == 0) {
                return;
            }
            int i = ek.this.n % ek.this.c;
            int i2 = ek.this.n / ek.this.c;
            if (i == 0) {
                ek ekVar3 = ek.this;
                ekVar3.m = i2 + ekVar3.f6022k;
                ek.this.w();
            } else if (i > ek.this.c / 2) {
                ek.this.post(new RunnableC0125a(i, i2));
            } else {
                ek.this.post(new b(i, i2));
            }
        }
    }

    public class b extends Drawable {
        public b() {
        }

        public final void a(Canvas canvas) {
            canvas.drawColor(ek.this.h);
        }

        public final void b(Canvas canvas) {
            Paint paint = new Paint();
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            rect.left = 0;
            rect.top = 0;
            rect.right = ek.this.g.getWidth();
            rect.bottom = ek.this.g.getHeight();
            rect2.left = 0;
            rect2.top = ek.this.u()[0];
            rect2.right = ek.this.f;
            rect2.bottom = ek.this.u()[1];
            canvas.drawBitmap(ek.this.g, rect, rect2, paint);
        }

        public final void c(Canvas canvas) {
            Paint paint = new Paint();
            Rect clipBounds = canvas.getClipBounds();
            paint.setColor(ek.this.i);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(ek.this.j);
            canvas.drawRect(clipBounds, paint);
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            try {
                a(canvas);
                b(canvas);
                c(canvas);
            } catch (Throwable unused) {
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6029a;

        public c(int i) {
            this.f6029a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ek ekVar = ek.this;
            ekVar.smoothScrollTo(0, this.f6029a * ekVar.c);
        }
    }

    public interface d {
        void a(int i);
    }

    public ek(Context context) {
        super(context);
        this.c = 0;
        this.e = -1;
        this.g = null;
        this.h = Color.parseColor("#eeffffff");
        this.i = Color.parseColor("#44383838");
        this.j = 4;
        this.f6022k = 1;
        this.m = 1;
        this.p = 50;
        g(context);
    }

    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(View view) {
        n(view);
        return view.getMeasuredHeight();
    }

    public static void n(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public final void e() {
        Bitmap bitmap = this.g;
        if (bitmap != null && !bitmap.isRecycled()) {
            zns.C(this.g);
            this.g = null;
        }
        if (this.q != null) {
            this.q = null;
        }
    }

    public final void f(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f6022k;
        int i4 = (i / i2) + i3;
        int i5 = i % i2;
        int i6 = i / i2;
        if (i5 == 0) {
            i4 = i6 + i3;
        } else if (i5 > i2 / 2) {
            i4 = i6 + i3 + 1;
        }
        int childCount = this.f6021b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            TextView textView = (TextView) this.f6021b.getChildAt(i7);
            if (textView == null) {
                return;
            }
            if (i4 == i7) {
                textView.setTextColor(Color.parseColor("#0288ce"));
            } else {
                textView.setTextColor(Color.parseColor("#bbbbbb"));
            }
        }
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        super.fling(i / 3);
    }

    public final void g(Context context) {
        this.f6020a = context;
        setVerticalScrollBarEnabled(false);
        try {
            if (this.g == null) {
                InputStream inputStreamOpen = zls.b(context).open("map_indoor_select.png");
                this.g = BitmapFactory.decodeStream(inputStreamOpen);
                inputStreamOpen.close();
            }
        } catch (Throwable unused) {
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f6021b = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.f6021b);
        this.o = new a();
    }

    public final void h(d dVar) {
        this.q = dVar;
    }

    public final void i(String str) {
        List<String> list = this.d;
        if (list == null || list.size() == 0) {
            return;
        }
        int iIndexOf = this.d.indexOf(str);
        int size = this.d.size();
        int i = this.f6022k;
        int i2 = ((size - i) - 1) - iIndexOf;
        this.m = i + i2;
        post(new c(i2));
    }

    public final void j(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public final void k(String[] strArr) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.clear();
        for (String str : strArr) {
            this.d.add(str);
        }
        for (int i = 0; i < this.f6022k; i++) {
            this.d.add(0, "");
            this.d.add("");
        }
        r();
    }

    public final TextView m(String str) {
        TextView textView = new TextView(this.f6020a);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView.setSingleLine(true);
        textView.setTextSize(2, 16.0f);
        textView.setText(str);
        textView.setGravity(17);
        textView.getPaint().setFakeBoldText(true);
        int iA = a(this.f6020a, 8.0f);
        int iA2 = a(this.f6020a, 6.0f);
        textView.setPadding(iA, iA2, iA, iA2);
        if (this.c == 0) {
            this.c = b(textView);
            this.f6021b.setLayoutParams(new FrameLayout.LayoutParams(-2, this.c * this.l));
            setLayoutParams(new LinearLayout.LayoutParams(-2, this.c * this.l));
        }
        return textView;
    }

    public final boolean o() {
        return getVisibility() == 0;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        f(i2);
        if (i2 > i4) {
            this.e = 1;
        } else {
            this.e = 0;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f = i;
        try {
            setBackgroundDrawable(null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            q();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void q() {
        this.n = getScrollY();
        postDelayed(this.o, this.p);
    }

    public final void r() {
        List<String> list = this.d;
        if (list == null || list.size() == 0) {
            return;
        }
        this.f6021b.removeAllViews();
        this.l = (this.f6022k * 2) + 1;
        for (int size = this.d.size() - 1; size >= 0; size--) {
            this.f6021b.addView(m(this.d.get(size)));
        }
        f(0);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.h = i;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f == 0) {
            try {
                WindowManager windowManager = (WindowManager) this.f6020a.getSystemService("window");
                if (windowManager != null) {
                    this.f = windowManager.getDefaultDisplay().getWidth();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.setBackgroundDrawable(new b());
    }

    public final int[] u() {
        int i = this.c;
        int i2 = this.f6022k;
        return new int[]{i * i2, i * (i2 + 1)};
    }

    public final void w() {
        d dVar = this.q;
        if (dVar != null) {
            try {
                dVar.a(x());
            } catch (Throwable unused) {
            }
        }
    }

    public final int x() {
        List<String> list = this.d;
        if (list == null || list.size() == 0) {
            return 0;
        }
        return Math.min(this.d.size() - (this.f6022k * 2), Math.max(0, ((this.d.size() - 1) - this.m) - this.f6022k));
    }
}
