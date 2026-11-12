package com.huawei.hms.hmsscankit;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.huawei.hms.scankit.R;

/* JADX INFO: loaded from: classes10.dex */
public class a implements DialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f13525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f13526c;
    private final String d;
    private final String e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;
    private final int k;
    private final DialogInterface.OnClickListener l;
    private final DialogInterface.OnClickListener m;
    private AlertDialog n;
    TextView o;
    TextView p;
    TextView q;
    TextView r;

    /* JADX INFO: renamed from: com.huawei.hms.hmsscankit.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0129a implements View.OnClickListener {
        ViewOnClickListenerC0129a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.m != null) {
                a.this.m.onClick(a.this, -2);
            }
            a.this.dismiss();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.l != null) {
                a.this.l.onClick(a.this, -1);
            }
            a.this.dismiss();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f13529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f13530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f13531c;
        private String d;
        private String e;
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j = true;
        private int k = 80;
        private DialogInterface.OnClickListener l;
        private DialogInterface.OnClickListener m;

        public c(Context context) {
            this.f13529a = context;
        }

        public c a(CharSequence charSequence) {
            this.f13531c = charSequence;
            return this;
        }

        public c b(CharSequence charSequence) {
            this.f13530b = charSequence;
            return this;
        }

        public c a(String str, DialogInterface.OnClickListener onClickListener) {
            this.d = str;
            this.m = onClickListener;
            return this;
        }

        public c b(String str, DialogInterface.OnClickListener onClickListener) {
            this.e = str;
            this.l = onClickListener;
            return this;
        }

        public a a() {
            return new a(this, null);
        }
    }

    /* synthetic */ a(c cVar, ViewOnClickListenerC0129a viewOnClickListenerC0129a) {
        this(cVar);
    }

    public void c() {
        AlertDialog alertDialog = this.n;
        if (alertDialog != null) {
            alertDialog.show();
        }
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        AlertDialog alertDialog = this.n;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        AlertDialog alertDialog = this.n;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.n.dismiss();
    }

    private a(c cVar) {
        this.f13524a = cVar.f13529a;
        this.f13525b = cVar.f13530b;
        this.f13526c = cVar.f13531c;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f = cVar.f;
        this.g = cVar.g;
        this.h = cVar.i;
        this.i = cVar.h;
        this.j = cVar.j;
        this.k = cVar.k;
        this.l = cVar.l;
        this.m = cVar.m;
        a();
    }

    private void a() {
        if (this.f13524a != null) {
            this.n = new AlertDialog.Builder(this.f13524a, R.style.BottomFullDialogStyle).create();
            View viewInflate = LayoutInflater.from(this.f13524a).inflate(R.layout.scankit_dialog_custom, (ViewGroup) null);
            Window window = this.n.getWindow();
            if (window != null) {
                window.setGravity(this.k);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.y = 16;
                window.setAttributes(attributes);
            }
            this.o = (TextView) viewInflate.findViewById(R.id.dialog_title);
            this.p = (TextView) viewInflate.findViewById(R.id.dialog_message);
            this.q = (TextView) viewInflate.findViewById(R.id.dialog_negative);
            this.r = (TextView) viewInflate.findViewById(R.id.dialog_positive);
            this.n.setView(viewInflate);
            CharSequence charSequence = this.f13525b;
            if (charSequence != null) {
                this.o.setText(charSequence);
            }
            this.n.setCanceledOnTouchOutside(false);
            this.o.setMovementMethod(LinkMovementMethod.getInstance());
            this.p.setMovementMethod(LinkMovementMethod.getInstance());
            this.p.setText(this.f13526c);
            b();
        }
    }

    private void b() {
        this.q.setText(this.e);
        int i = this.i;
        if (i != 0) {
            this.q.setTextColor(i);
        }
        this.q.setOnClickListener(new ViewOnClickListenerC0129a());
        if (TextUtils.isEmpty(this.e)) {
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
        }
        this.r.setText(this.d);
        int i2 = this.h;
        if (i2 != 0) {
            this.r.setTextColor(i2);
        }
        this.r.setOnClickListener(new b());
        if (TextUtils.isEmpty(this.d)) {
            this.r.setVisibility(8);
        } else {
            this.r.setVisibility(0);
        }
        this.n.setCancelable(this.j);
    }
}
