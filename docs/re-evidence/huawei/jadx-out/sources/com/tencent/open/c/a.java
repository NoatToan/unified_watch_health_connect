package com.tencent.open.c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes46.dex */
public class a extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f31049a = "com.tencent.open.c.a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f31050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31051c;
    private InterfaceC0308a d;

    /* JADX INFO: renamed from: com.tencent.open.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0308a {
        void a();

        void a(int i);
    }

    public a(Context context) {
        super(context);
        this.f31050b = null;
        this.f31051c = false;
        this.d = null;
        this.f31050b = new Rect();
    }

    public void a(InterfaceC0308a interfaceC0308a) {
        this.d = interfaceC0308a;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        Activity activity = (Activity) getContext();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.f31050b);
        int i3 = this.f31050b.top;
        int height = activity.getWindowManager().getDefaultDisplay().getHeight();
        InterfaceC0308a interfaceC0308a = this.d;
        if (interfaceC0308a != null && size != 0) {
            if ((height - i3) - size > 100) {
                interfaceC0308a.a((Math.abs(this.f31050b.height()) - getPaddingBottom()) - getPaddingTop());
            } else {
                interfaceC0308a.a();
            }
        }
        super.onMeasure(i, i2);
    }
}
