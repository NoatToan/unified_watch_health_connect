package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public class ie0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f21040b;
    public TextView c;
    public LinearLayout d;
    public boolean e = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f21041a;

        public a(LinearLayout linearLayout) {
            this.f21041a = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            Folme.useAt(this.f21041a).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, ITouchStyle.TouchType.DOWN).setAlpha(1.0f, ITouchStyle.TouchType.UP).handleTouchOf(this.f21041a, new AnimConfig[0]);
            Folme.useAt(this.f21041a).hover().setAlpha(1.0f, new IHoverStyle.HoverType[0]).setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this.f21041a, new AnimConfig[0]);
        }
    }

    public ie0(LinearLayout linearLayout) {
        this.d = linearLayout;
        Context context = linearLayout.getContext();
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        View.inflate(context, awi.m, linearLayout);
        this.f21040b = (ImageView) linearLayout.findViewById(vsi.q);
        this.c = (TextView) linearLayout.findViewById(vsi.f37190r);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f21040b.setForceDarkAllowed(false);
        }
        this.f21039a = context.getResources().getDisplayMetrics().densityDpi;
        linearLayout.post(new a(linearLayout));
    }

    public void a(Configuration configuration) {
        int i = configuration.densityDpi;
        if (i != this.f21039a) {
            this.f21039a = i;
            int iD = s6g.d(this.f21040b.getContext(), 28.0f);
            this.f21040b.setLayoutParams(new LinearLayout.LayoutParams(iD, iD));
            e(this.e);
        }
    }

    public void b(CharSequence charSequence) {
        if (charSequence == null || TextUtils.isEmpty(charSequence)) {
            this.d.setContentDescription(this.c.getText());
        } else {
            this.d.setContentDescription(charSequence);
        }
    }

    public void c(boolean z) {
        this.f21040b.setEnabled(z);
        this.c.setEnabled(z);
    }

    public void d(Drawable drawable) {
        if (this.f21040b.getDrawable() != drawable) {
            this.f21040b.setImageDrawable(drawable);
        }
    }

    public void e(boolean z) {
        this.e = z;
        if (z) {
            this.c.setTextSize(1, 16.0f);
        } else {
            this.c.setTextSize(1, 11.0f);
        }
    }

    public void f(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
