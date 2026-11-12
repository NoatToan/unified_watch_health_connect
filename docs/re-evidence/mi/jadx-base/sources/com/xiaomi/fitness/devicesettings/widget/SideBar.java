package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.cji;
import defpackage.clb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SideBar extends View {
    public static String[] g = {"A", c.f13755a, "C", "D", "E", "F", "G", c.f13756b, "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f12032b;
    public List<String> c;
    public int d;
    public Paint e;
    public TextView f;

    public interface a {
        void a(String str);
    }

    public SideBar(Context context) {
        this(context, null);
        this.f12031a = context;
    }

    public final void a() {
        this.c = Arrays.asList(g);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.d;
        a aVar = this.f12032b;
        int height = ((int) (y - ((getHeight() - (this.c.size() * (getHeight() / 28))) / 2))) / (getHeight() / 28);
        if (action == 1) {
            TextView textView = this.f;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (i != height && height >= 0 && height < this.c.size()) {
            if (aVar != null) {
                clb.a(getContext());
                aVar.a(this.c.get(height));
            }
            TextView textView2 = this.f;
            if (textView2 != null) {
                textView2.setText(this.c.get(height));
                this.f.setVisibility(0);
            }
            this.d = height;
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        int i = height / 28;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            this.e.setColor(getResources().getColor(cji.common_btn_normal_text_color));
            this.e.setAntiAlias(true);
            this.e.setTextSize(30.0f);
            if (i2 == this.d) {
                this.e.setColor(Color.parseColor("#0099FF"));
                this.e.setFakeBoldText(true);
            }
            canvas.drawText(this.c.get(i2), (width / 2) - (this.e.measureText(this.c.get(i2)) / 2.0f), ((getHeight() - (this.c.size() * i)) / 2) + (i * i2) + (i / 2), this.e);
            this.e.reset();
        }
    }

    public void setIndexText(ArrayList<String> arrayList) {
        this.c = arrayList;
        invalidate();
    }

    public void setOnTouchingLetterChangedListener(a aVar) {
        this.f12032b = aVar;
    }

    public void setTextView(TextView textView) {
        this.f = textView;
    }

    public SideBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f12031a = context;
    }

    public SideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = -1;
        this.e = new Paint();
        this.f12031a = context;
        a();
    }
}
