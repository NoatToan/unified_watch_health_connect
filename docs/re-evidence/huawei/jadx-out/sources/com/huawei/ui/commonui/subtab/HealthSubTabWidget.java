package com.huawei.ui.commonui.subtab;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.uikit.hwsubtab.widget.HwSubTabViewContainer;
import com.huawei.uikit.phone.hwsubtab.widget.HwSubTabWidget;
import defpackage.qpj;
import defpackage.qrd;
import defpackage.xfz;

/* JADX INFO: loaded from: classes16.dex */
public class HealthSubTabWidget extends HwSubTabWidget {
    public HealthSubTabWidget(Context context) {
        super(context);
    }

    public HealthSubTabWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HealthSubTabWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void d(int i) {
        if (this.f29749c == null) {
            LogUtil.e("HealthSubTabWidget", "scrollTo tab at ", Integer.valueOf(i), " failed cause subTabContainer is null!");
            return;
        }
        HwSubTabViewContainer.SlidingTabStrip tabStrip = this.f29749c.getTabStrip();
        if (tabStrip == null) {
            return;
        }
        int width = tabStrip.getWidth();
        int width2 = getWidth();
        if (i < 0 || i >= tabStrip.getChildCount()) {
            LogUtil.e("HealthSubTabWidget", "scrollTo tab at ", Integer.valueOf(i), " failed and tab count is: ", Integer.valueOf(tabStrip.getChildCount()));
            return;
        }
        View childAt = tabStrip.getChildAt(i);
        if (childAt == null) {
            LogUtil.e("HealthSubTabWidget", "scrollTo tab at ", Integer.valueOf(i), " failed cause tab is null!");
        } else {
            this.f29749c.scrollTo(Math.min(childAt.getLeft(), width - width2), 0);
        }
    }

    public qpj b(String str, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        qpj qpjVar = new qpj(this, "");
        qpjVar.a(str);
        qpjVar.a(drawable);
        qpjVar.d(drawable2);
        qpjVar.c(drawable3);
        return qpjVar;
    }

    @Override // com.huawei.uikit.phone.hwsubtab.widget.HwSubTabWidget, com.huawei.uikit.hwsubtab.widget.HwSubTabWidget
    /* JADX INFO: renamed from: e */
    public HwSubTabWidget.SubTabView b(xfz xfzVar) {
        if (xfzVar instanceof qpj) {
            return new HealthImgSubTabView(getContext(), (qpj) xfzVar);
        }
        return super.b(xfzVar);
    }

    protected class HealthImgSubTabView extends HwSubTabWidget.SubTabView {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23905c;
        private float e;
        private int f;
        private int g;
        private int j;

        protected HealthImgSubTabView(Context context, final qpj qpjVar) {
            super(context, qpjVar);
            setVisibility(0);
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            this.e = (int) (fontMetrics.bottom - fontMetrics.top);
            post(new Runnable() { // from class: com.huawei.ui.commonui.subtab.HealthSubTabWidget.HealthImgSubTabView.2
                @Override // java.lang.Runnable
                public void run() {
                    int height = HealthImgSubTabView.this.getHeight();
                    HealthImgSubTabView.this.d(height, qpjVar.b());
                    HealthImgSubTabView.this.c(height, qpjVar.a());
                    HealthImgSubTabView.this.invalidate();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i, Drawable drawable) {
            if (drawable == null) {
                return;
            }
            float intrinsicWidth = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
            int i2 = (int) (i * 0.5f);
            this.f23905c = i2;
            this.g = (int) (i2 * intrinsicWidth);
            int iMeasureText = (int) (((double) this.g) / ((double) getPaint().measureText(" ")));
            StringBuilder sb = new StringBuilder(iMeasureText);
            for (int i3 = 0; i3 < iMeasureText; i3++) {
                sb.append(' ');
            }
            setText(sb.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i, Drawable drawable) {
            if (drawable == null) {
                return;
            }
            float intrinsicWidth = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
            int i2 = (int) (i * 0.2f);
            this.f = i2;
            this.j = (int) (i2 * intrinsicWidth);
        }

        @Override // android.widget.TextView, android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            xfz subTab = getSubTab();
            if (subTab instanceof qpj) {
                qpj qpjVar = (qpj) subTab;
                b(canvas, qpjVar);
                d(canvas, qpjVar);
            }
        }

        private void b(Canvas canvas, qpj qpjVar) {
            Drawable drawableE = HealthSubTabWidget.this.getSelectedSubTab() == qpjVar ? qpjVar.e() : null;
            if (drawableE == null) {
                drawableE = qpjVar.b();
            }
            if (drawableE instanceof BitmapDrawable) {
                int width = getWidth();
                int height = getHeight();
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                float f = (fontMetrics.bottom - fontMetrics.top) / this.e;
                int i = (int) (this.f23905c * f);
                int i2 = (int) (this.g * f);
                int i3 = (width / 2) - (i2 / 2);
                int i4 = ((height / 2) + (height / 12)) - (i / 2);
                drawableE.setBounds(i3, i4, i2 + i3, i + i4);
                drawableE.draw(canvas);
            }
        }

        private void d(Canvas canvas, qpj qpjVar) {
            Drawable drawableA = qpjVar.a();
            if (drawableA instanceof BitmapDrawable) {
                int width = getWidth() - this.j;
                TextPaint paint = getPaint();
                int height = ((int) (getHeight() - (paint.getFontMetrics().bottom - paint.getFontMetrics().top))) / 2;
                drawableA.setBounds(width, height, this.j + width, this.f + height);
                drawableA.draw(canvas);
            }
        }
    }

    public void d() {
        if (j()) {
            Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.health_subtab_headline_underline);
            HwSubTabViewContainer.SlidingTabStrip subTabContentView = getSubTabContentView();
            qrd.d(subTabContentView, qrd.c(Drawable.class, subTabContentView)[0], drawable);
        }
    }

    private static boolean j() {
        return Build.MANUFACTURER.equalsIgnoreCase("meizu");
    }
}
