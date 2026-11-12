package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.bridge.ReactContext;
import defpackage.cm8;
import defpackage.fqi;
import defpackage.rvi;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class FpsView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f7276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.facebook.react.modules.debug.a f7277b;
    public final b c;

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7279b;
        public int c;

        public b() {
            this.f7278a = false;
            this.f7279b = 0;
            this.c = 0;
        }

        public void a() {
            this.f7278a = false;
            FpsView.this.post(this);
        }

        public void b() {
            this.f7278a = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7278a) {
                return;
            }
            this.f7279b += FpsView.this.f7277b.f() - FpsView.this.f7277b.j();
            this.c += FpsView.this.f7277b.e();
            FpsView fpsView = FpsView.this;
            fpsView.c(fpsView.f7277b.g(), FpsView.this.f7277b.i(), this.f7279b, this.c);
            FpsView.this.f7277b.m();
            FpsView.this.postDelayed(this, 500L);
        }
    }

    public FpsView(ReactContext reactContext) {
        super(reactContext);
        View.inflate(reactContext, rvi.f32948b, this);
        this.f7276a = (TextView) findViewById(fqi.g);
        this.f7277b = new com.facebook.react.modules.debug.a(reactContext);
        this.c = new b();
        c(0.0d, 0.0d, 0, 0);
    }

    public final void c(double d, double d2, int i, int i2) {
        String str = String.format(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", Double.valueOf(d), Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2));
        this.f7276a.setText(str);
        cm8.b("ReactNative", str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7277b.m();
        this.f7277b.n();
        this.c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7277b.p();
        this.c.b();
    }
}
