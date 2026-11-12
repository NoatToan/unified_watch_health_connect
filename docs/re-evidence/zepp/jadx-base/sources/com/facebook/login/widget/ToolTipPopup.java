package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ToolTipPopup {
    public static final long DEFAULT_POPUP_DISPLAY_TIME = 6000;
    private final String a;
    private final WeakReference<View> b;
    private final Context c;
    private d d;
    private PopupWindow e;
    private Style f = Style.BLUE;
    private long g = DEFAULT_POPUP_DISPLAY_TIME;
    private final ViewTreeObserver.OnScrollChangedListener h = new a();

    public enum Style {
        BLUE,
        BLACK
    }

    public class a implements ViewTreeObserver.OnScrollChangedListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (ToolTipPopup.a(ToolTipPopup.this).get() == null || ToolTipPopup.b(ToolTipPopup.this) == null || !ToolTipPopup.b(ToolTipPopup.this).isShowing()) {
                return;
            }
            if (ToolTipPopup.b(ToolTipPopup.this).isAboveAnchor()) {
                ToolTipPopup.c(ToolTipPopup.this).f();
            } else {
                ToolTipPopup.c(ToolTipPopup.this).g();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                ToolTipPopup.this.dismiss();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                ToolTipPopup.this.dismiss();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public class d extends FrameLayout {
        private ImageView a;
        private ImageView b;
        private View c;
        private ImageView d;

        public d(Context context) {
            super(context);
            e();
        }

        private void e() {
            LayoutInflater.from(getContext()).inflate(R.layout.com_facebook_tooltip_bubble, this);
            this.a = (ImageView) findViewById(R.id.com_facebook_tooltip_bubble_view_top_pointer);
            this.b = (ImageView) findViewById(R.id.com_facebook_tooltip_bubble_view_bottom_pointer);
            this.c = findViewById(R.id.com_facebook_body_frame);
            this.d = (ImageView) findViewById(R.id.com_facebook_button_xout);
        }

        public void f() {
            this.a.setVisibility(4);
            this.b.setVisibility(0);
        }

        public void g() {
            this.a.setVisibility(0);
            this.b.setVisibility(4);
        }
    }

    public ToolTipPopup(String str, View view) {
        this.a = str;
        this.b = new WeakReference<>(view);
        this.c = view.getContext();
    }

    public static /* synthetic */ WeakReference a(ToolTipPopup toolTipPopup) {
        if (CrashShieldHandler.isObjectCrashing(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.b;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ToolTipPopup.class);
            return null;
        }
    }

    public static /* synthetic */ PopupWindow b(ToolTipPopup toolTipPopup) {
        if (CrashShieldHandler.isObjectCrashing(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.e;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ToolTipPopup.class);
            return null;
        }
    }

    public static /* synthetic */ d c(ToolTipPopup toolTipPopup) {
        if (CrashShieldHandler.isObjectCrashing(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.d;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ToolTipPopup.class);
            return null;
        }
    }

    private void d() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            e();
            if (this.b.get() != null) {
                this.b.get().getViewTreeObserver().addOnScrollChangedListener(this.h);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void e() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.b.get() != null) {
                this.b.get().getViewTreeObserver().removeOnScrollChangedListener(this.h);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void f() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            PopupWindow popupWindow = this.e;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            if (this.e.isAboveAnchor()) {
                this.d.f();
            } else {
                this.d.g();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void dismiss() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            e();
            PopupWindow popupWindow = this.e;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void setNuxDisplayTime(long j) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.g = j;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void setStyle(Style style) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.f = style;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void show() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.b.get() != null) {
                d dVar = new d(this.c);
                this.d = dVar;
                ((TextView) dVar.findViewById(R.id.com_facebook_tooltip_bubble_view_text_body)).setText(this.a);
                if (this.f == Style.BLUE) {
                    this.d.c.setBackgroundResource(R.drawable.com_facebook_tooltip_blue_background);
                    this.d.b.setImageResource(R.drawable.com_facebook_tooltip_blue_bottomnub);
                    this.d.a.setImageResource(R.drawable.com_facebook_tooltip_blue_topnub);
                    this.d.d.setImageResource(R.drawable.com_facebook_tooltip_blue_xout);
                } else {
                    this.d.c.setBackgroundResource(R.drawable.com_facebook_tooltip_black_background);
                    this.d.b.setImageResource(R.drawable.com_facebook_tooltip_black_bottomnub);
                    this.d.a.setImageResource(R.drawable.com_facebook_tooltip_black_topnub);
                    this.d.d.setImageResource(R.drawable.com_facebook_tooltip_black_xout);
                }
                View decorView = ((Activity) this.c).getWindow().getDecorView();
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                d();
                this.d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                d dVar2 = this.d;
                PopupWindow popupWindow = new PopupWindow(dVar2, dVar2.getMeasuredWidth(), this.d.getMeasuredHeight());
                this.e = popupWindow;
                popupWindow.showAsDropDown(this.b.get());
                f();
                if (this.g > 0) {
                    this.d.postDelayed(new b(), this.g);
                }
                this.e.setTouchable(true);
                this.d.setOnClickListener(new c());
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
