package com.amap.api.mapcore.util;

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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class fg extends ScrollView {
    public static final String a = fg.class.getSimpleName();
    public int b;
    private Context c;
    private LinearLayout d;
    private int e;
    private List<String> f;
    private int g;
    private int h;
    private Bitmap i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private Runnable p;
    private int q;
    private a r;

    public interface a {
        void a(int i);
    }

    public fg(Context context) {
        super(context);
        this.e = 0;
        this.g = -1;
        this.i = null;
        this.j = Color.parseColor("#eeffffff");
        this.k = Color.parseColor("#44383838");
        this.l = 4;
        this.m = 1;
        this.b = 1;
        this.q = 50;
        this.c = context;
        setVerticalScrollBarEnabled(false);
        try {
            if (this.i == null) {
                InputStream inputStreamOpen = el.a(context).open("map_indoor_select.png");
                this.i = BitmapFactory.decodeStream(inputStreamOpen);
                inputStreamOpen.close();
            }
        } catch (Throwable unused) {
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.d);
        this.p = new Runnable() { // from class: com.amap.api.mapcore.util.fg.1
            @Override // java.lang.Runnable
            public final void run() {
                if (fg.this.o - fg.this.getScrollY() != 0) {
                    fg fgVar = fg.this;
                    fgVar.o = fgVar.getScrollY();
                    fg fgVar2 = fg.this;
                    fgVar2.postDelayed(fgVar2.p, fg.this.q);
                    return;
                }
                if (fg.this.e == 0) {
                    return;
                }
                final int i = fg.this.o % fg.this.e;
                final int i2 = fg.this.o / fg.this.e;
                if (i == 0) {
                    fg fgVar3 = fg.this;
                    fgVar3.b = i2 + fgVar3.m;
                    fg.d(fg.this);
                } else if (i > fg.this.e / 2) {
                    fg.this.post(new Runnable() { // from class: com.amap.api.mapcore.util.fg.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            fg fgVar4 = fg.this;
                            fgVar4.smoothScrollTo(0, (fgVar4.o - i) + fg.this.e);
                            fg fgVar5 = fg.this;
                            fgVar5.b = i2 + fgVar5.m + 1;
                            fg.d(fg.this);
                        }
                    });
                } else {
                    fg.this.post(new Runnable() { // from class: com.amap.api.mapcore.util.fg.1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            fg fgVar4 = fg.this;
                            fgVar4.smoothScrollTo(0, fgVar4.o - i);
                            fg fgVar5 = fg.this;
                            fgVar5.b = i2 + fgVar5.m;
                            fg.d(fg.this);
                        }
                    });
                }
            }
        };
    }

    public static /* synthetic */ void d(fg fgVar) {
        a aVar = fgVar.r;
        if (aVar != null) {
            try {
                List<String> list = fgVar.f;
                int iMin = 0;
                if (list != null && list.size() != 0) {
                    iMin = Math.min(fgVar.f.size() - (fgVar.m * 2), Math.max(0, ((fgVar.f.size() - 1) - fgVar.b) - fgVar.m));
                }
                aVar.a(iMin);
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int[] i(fg fgVar) {
        int i = fgVar.e;
        int i2 = fgVar.m;
        return new int[]{i * i2, i * (i2 + 1)};
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        super.fling(i / 3);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a(i2);
        if (i2 > i4) {
            this.g = 1;
        } else {
            this.g = 0;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.h = i;
        try {
            setBackgroundDrawable(null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.o = getScrollY();
            postDelayed(this.p, this.q);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.j = i;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.h == 0) {
            try {
                WindowManager windowManager = (WindowManager) this.c.getSystemService("window");
                if (windowManager != null) {
                    this.h = windowManager.getDefaultDisplay().getWidth();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.setBackgroundDrawable(new Drawable() { // from class: com.amap.api.mapcore.util.fg.2
            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                try {
                    canvas.drawColor(fg.this.j);
                    Paint paint = new Paint();
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    rect.left = 0;
                    rect.top = 0;
                    rect.right = fg.this.i.getWidth() + 0;
                    rect.bottom = fg.this.i.getHeight() + 0;
                    rect2.left = 0;
                    rect2.top = fg.i(fg.this)[0];
                    rect2.right = fg.this.h + 0;
                    rect2.bottom = fg.i(fg.this)[1];
                    canvas.drawBitmap(fg.this.i, rect, rect2, paint);
                    Paint paint2 = new Paint();
                    Rect clipBounds = canvas.getClipBounds();
                    paint2.setColor(fg.this.k);
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(fg.this.l);
                    canvas.drawRect(clipBounds, paint2);
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
        });
    }

    private void c() {
        List<String> list = this.f;
        if (list == null || list.size() == 0) {
            return;
        }
        this.d.removeAllViews();
        this.n = (this.m * 2) + 1;
        for (int size = this.f.size() - 1; size >= 0; size--) {
            LinearLayout linearLayout = this.d;
            String str = this.f.get(size);
            TextView textView = new TextView(this.c);
            textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            textView.setSingleLine(true);
            textView.setTextSize(2, 16.0f);
            textView.setText(str);
            textView.setGravity(17);
            textView.getPaint().setFakeBoldText(true);
            int iA = a(this.c, 8.0f);
            int iA2 = a(this.c, 6.0f);
            textView.setPadding(iA, iA2, iA, iA2);
            if (this.e == 0) {
                textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
                this.e = textView.getMeasuredHeight();
                this.d.setLayoutParams(new FrameLayout.LayoutParams(-2, this.e * this.n));
                setLayoutParams(new LinearLayout.LayoutParams(-2, this.e * this.n));
            }
            linearLayout.addView(textView);
        }
        a(0);
    }

    public final boolean b() {
        return getVisibility() == 0;
    }

    private void a(int i) {
        int i2 = this.e;
        if (i2 == 0) {
            return;
        }
        int i3 = this.m;
        int i4 = (i / i2) + i3;
        int i5 = i % i2;
        int i6 = i / i2;
        if (i5 == 0) {
            i4 = i6 + i3;
        } else if (i5 > i2 / 2) {
            i4 = i6 + i3 + 1;
        }
        int childCount = this.d.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            TextView textView = (TextView) this.d.getChildAt(i7);
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

    public final void a(String[] strArr) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.clear();
        for (String str : strArr) {
            this.f.add(str);
        }
        for (int i = 0; i < this.m; i++) {
            this.f.add(0, "");
            this.f.add("");
        }
        c();
    }

    public final void a() {
        Bitmap bitmap = this.i;
        if (bitmap != null && !bitmap.isRecycled()) {
            er.c(this.i);
            this.i = null;
        }
        if (this.r != null) {
            this.r = null;
        }
    }

    public final void a(String str) {
        List<String> list = this.f;
        if (list == null || list.size() == 0) {
            return;
        }
        int iIndexOf = this.f.indexOf(str);
        int size = this.f.size();
        int i = this.m;
        final int i2 = ((size - i) - 1) - iIndexOf;
        this.b = i + i2;
        post(new Runnable() { // from class: com.amap.api.mapcore.util.fg.3
            @Override // java.lang.Runnable
            public final void run() {
                fg fgVar = fg.this;
                fgVar.smoothScrollTo(0, i2 * fgVar.e);
            }
        });
    }

    public final void a(a aVar) {
        this.r = aVar;
    }

    private static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void a(boolean z) {
        setVisibility(z ? 0 : 8);
    }
}
