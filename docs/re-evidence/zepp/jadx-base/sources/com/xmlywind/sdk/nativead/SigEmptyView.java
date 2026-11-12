package com.xmlywind.sdk.nativead;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes22.dex */
public class SigEmptyView extends View {
    private u a;
    private boolean b;
    private boolean c;
    private a d;
    private int e;
    private long f;
    private int g;
    private int h;
    private boolean i;

    public interface a {
        void a(boolean z);

        void f();

        void g();

        void h();

        void i();
    }

    public SigEmptyView(Context context) {
        this(context, null);
    }

    public SigEmptyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SigEmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        this.c = true;
        this.f = 0L;
        this.g = 0;
        this.h = -1;
        this.i = false;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    public void b() {
        boolean z;
        if (a() && e()) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int iA = a(viewGroup);
            int width = viewGroup.getWidth() * viewGroup.getHeight();
            if (width > 0) {
                if (iA >= width * (this.e / 100.0f)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (iA > 0) {
                this.i = true;
                this.d.i();
            } else {
                this.i = false;
                this.f = 0L;
                this.d.h();
            }
            if (iA <= 0) {
                a aVar = this.d;
                if (aVar == null || !this.i) {
                    return;
                }
                aVar.h();
                return;
            }
            if (z && this.i) {
                if (this.f == 0) {
                    this.f = System.currentTimeMillis();
                }
                boolean z2 = this.f > 0 && System.currentTimeMillis() - this.f >= ((long) (this.g * 1000));
                a aVar2 = this.d;
                if (aVar2 != null) {
                    aVar2.g();
                }
                a aVar3 = this.d;
                if (aVar3 != null) {
                    aVar3.a(z2);
                    return;
                }
                return;
            }
            a aVar4 = this.d;
            if (aVar4 != null) {
                aVar4.f();
            }
            a aVar5 = this.d;
            if (aVar5 != null) {
                aVar5.a(false);
            }
        } else {
            a aVar6 = this.d;
            if (aVar6 != null && this.i) {
                aVar6.h();
            }
            this.i = false;
        }
        this.f = 0L;
    }

    private void c() {
        f();
        this.a = null;
    }

    private void d() {
        u uVar = this.a;
        if (uVar == null || !uVar.b()) {
            return;
        }
        this.a.removeCallbacksAndMessages(null);
        this.a.a();
        this.a.a(false);
    }

    private boolean e() {
        return this.b && this.h == 0 && this.c;
    }

    private void f() {
        b();
        u uVar = this.a;
        if (uVar == null || uVar.b()) {
            return;
        }
        this.a.removeCallbacksAndMessages(null);
        this.a.a(true);
    }

    public int a(View view) {
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            return rect.height() * rect.width();
        }
        return 0;
    }

    public void a(int i, int i2, a aVar) {
        this.d = aVar;
        this.c = true;
        if (this.a != null) {
            c();
        }
        this.c = true;
        this.e = i;
        this.g = i2;
        this.a = new u(Looper.getMainLooper()) { // from class: com.xmlywind.sdk.nativead.SigEmptyView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (87108 != message.what || SigEmptyView.this.d == null) {
                    return;
                }
                SigEmptyView.this.b();
                a();
            }
        };
        d();
    }

    public boolean a() {
        return getVisibility() == 0 && getParent() != null;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = true;
        d();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        f();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.c = z;
        if (this.i) {
            b();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.h = i;
        if (i == 0) {
            d();
        } else {
            f();
        }
    }
}
