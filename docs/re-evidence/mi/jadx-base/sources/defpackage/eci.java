package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.text.NumberFormat;
import miuix.androidbasewidget.widget.ProgressBar;
import miuix.appcompat.app.c;

/* JADX INFO: loaded from: classes3.dex */
public class eci extends c {
    public ProgressBar h;
    public TextView i;
    public TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16495k;
    public String l;
    public NumberFormat m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16496r;
    public Drawable s;
    public Drawable t;
    public CharSequence u;
    public boolean v;
    public boolean w;
    public Handler x;

    public class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f16497a;

        public a(int i) {
            this.f16497a = i;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            eci.this.i.setText(eci.this.u);
            if (eci.this.m == null || eci.this.j == null) {
                return;
            }
            double max = ((double) eci.this.o) / ((double) eci.this.h.getMax());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str = eci.this.m.format(max);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f16497a), 0, str.length(), 34);
            eci.this.h.setProgress(eci.this.o);
            eci.this.j.setText(spannableStringBuilder);
        }
    }

    public eci(Context context) {
        super(context);
        this.f16495k = 0;
        J();
    }

    public static eci T(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        return U(context, charSequence, charSequence2, z, z2, null);
    }

    public static eci U(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        eci eciVar = new eci(context);
        eciVar.setTitle(charSequence);
        eciVar.O(charSequence2);
        eciVar.L(z);
        eciVar.setCancelable(z2);
        eciVar.setOnCancelListener(onCancelListener);
        eciVar.show();
        return eciVar;
    }

    public void H(int i) {
        ProgressBar progressBar = this.h;
        if (progressBar == null) {
            this.q += i;
        } else {
            progressBar.incrementProgressBy(i);
            K();
        }
    }

    public void I(int i) {
        ProgressBar progressBar = this.h;
        if (progressBar == null) {
            this.f16496r += i;
        } else {
            progressBar.incrementSecondaryProgressBy(i);
            K();
        }
    }

    public final void J() {
        this.l = "%1d/%2d";
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.m = percentInstance;
        percentInstance.setMaximumFractionDigits(0);
    }

    public final void K() {
        Handler handler;
        if (this.f16495k != 1 || (handler = this.x) == null || handler.hasMessages(0)) {
            return;
        }
        this.x.sendEmptyMessage(0);
    }

    public void L(boolean z) {
        ProgressBar progressBar = this.h;
        if (progressBar != null) {
            progressBar.setIndeterminate(z);
        } else {
            this.v = z;
        }
    }

    public void M(Drawable drawable) {
        ProgressBar progressBar = this.h;
        if (progressBar != null) {
            progressBar.setIndeterminateDrawable(drawable);
        } else {
            this.t = drawable;
        }
    }

    public void N(int i) {
        ProgressBar progressBar = this.h;
        if (progressBar == null) {
            this.n = i;
        } else {
            progressBar.setMax(i);
            K();
        }
    }

    public void O(CharSequence charSequence) {
        if (this.h == null) {
            this.u = charSequence;
            return;
        }
        if (this.f16495k == 1) {
            this.u = charSequence;
        }
        this.i.setText(charSequence);
    }

    public void P(int i) {
        this.o = i;
        if (this.w) {
            K();
        }
    }

    public void Q(Drawable drawable) {
        ProgressBar progressBar = this.h;
        if (progressBar != null) {
            progressBar.setProgressDrawable(drawable);
        } else {
            this.s = drawable;
        }
    }

    public void R(int i) {
        this.f16495k = i;
    }

    public void S(int i) {
        ProgressBar progressBar = this.h;
        if (progressBar == null) {
            this.p = i;
        } else {
            progressBar.setSecondaryProgress(i);
            K();
        }
    }

    @Override // miuix.appcompat.app.c, defpackage.if1, androidx.p004activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        View viewInflate;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, g5j.X, R.attr.alertDialogStyle, 0);
        TypedArray typedArrayObtainStyledAttributes2 = getContext().getTheme().obtainStyledAttributes(new int[]{zhi.z});
        int color = typedArrayObtainStyledAttributes2.getColor(0, getContext().getResources().getColor(rki.d));
        typedArrayObtainStyledAttributes2.recycle();
        boolean z = s6g.f(getContext()) == 2;
        if (this.f16495k == 1) {
            this.x = new a(color);
            viewInflate = layoutInflaterFrom.inflate(typedArrayObtainStyledAttributes.getResourceId(g5j.Y, z ? awi.t : awi.s), (ViewGroup) null);
            this.j = (TextView) viewInflate.findViewById(vsi.V);
        } else {
            viewInflate = layoutInflaterFrom.inflate(typedArrayObtainStyledAttributes.getResourceId(g5j.d0, awi.J), (ViewGroup) null);
        }
        this.h = (ProgressBar) viewInflate.findViewById(R.id.progress);
        this.i = (TextView) viewInflate.findViewById(vsi.M);
        A(viewInflate);
        typedArrayObtainStyledAttributes.recycle();
        int i = this.n;
        if (i > 0) {
            N(i);
        }
        int i2 = this.o;
        if (i2 > 0) {
            P(i2);
        }
        int i3 = this.p;
        if (i3 > 0) {
            S(i3);
        }
        int i4 = this.q;
        if (i4 > 0) {
            H(i4);
        }
        int i5 = this.f16496r;
        if (i5 > 0) {
            I(i5);
        }
        Drawable drawable = this.s;
        if (drawable != null) {
            Q(drawable);
        }
        Drawable drawable2 = this.t;
        if (drawable2 != null) {
            M(drawable2);
        }
        CharSequence charSequence = this.u;
        if (charSequence != null) {
            O(charSequence);
        }
        L(this.v);
        K();
        super.onCreate(bundle);
    }

    @Override // miuix.appcompat.app.c, androidx.p004activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.w = true;
    }

    @Override // miuix.appcompat.app.c, defpackage.if1, androidx.p004activity.ComponentDialog, android.app.Dialog
    public void onStop() {
        super.onStop();
        this.w = false;
    }

    public eci(Context context, int i) {
        super(context, i);
        this.f16495k = 0;
        J();
    }
}
