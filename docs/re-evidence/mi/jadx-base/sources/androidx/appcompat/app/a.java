package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import defpackage.if1;
import defpackage.qii;

/* JADX INFO: loaded from: classes.dex */
public class a extends if1 implements DialogInterface {
    public final AlertController c;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0006a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.b f1451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1452b;

        public C0006a(Context context) {
            this(context, a.g(context, 0));
        }

        public C0006a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f1451a;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            return this;
        }

        public C0006a b(boolean z) {
            this.f1451a.f1413r = z;
            return this;
        }

        public C0006a c(View view) {
            this.f1451a.g = view;
            return this;
        }

        public a create() {
            a aVar = new a(this.f1451a.f1410a, this.f1452b);
            this.f1451a.a(aVar.c);
            aVar.setCancelable(this.f1451a.f1413r);
            if (this.f1451a.f1413r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f1451a.s);
            aVar.setOnDismissListener(this.f1451a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f1451a.u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public C0006a d(Drawable drawable) {
            this.f1451a.d = drawable;
            return this;
        }

        public C0006a e(CharSequence charSequence) {
            this.f1451a.h = charSequence;
            return this;
        }

        public C0006a f(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f1451a;
            bVar.v = charSequenceArr;
            bVar.J = onMultiChoiceClickListener;
            bVar.F = zArr;
            bVar.G = true;
            return this;
        }

        public C0006a g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f1451a;
            bVar.l = charSequence;
            bVar.n = onClickListener;
            return this;
        }

        public Context getContext() {
            return this.f1451a.f1410a;
        }

        public C0006a h(DialogInterface.OnKeyListener onKeyListener) {
            this.f1451a.u = onKeyListener;
            return this;
        }

        public C0006a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f1451a;
            bVar.i = charSequence;
            bVar.f1412k = onClickListener;
            return this;
        }

        public C0006a j(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f1451a;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.H = true;
            return this;
        }

        public C0006a k(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f1451a;
            bVar.v = charSequenceArr;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.H = true;
            return this;
        }

        public C0006a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f1451a;
            bVar.l = bVar.f1410a.getText(i);
            this.f1451a.n = onClickListener;
            return this;
        }

        public C0006a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f1451a;
            bVar.i = bVar.f1410a.getText(i);
            this.f1451a.f1412k = onClickListener;
            return this;
        }

        public C0006a setTitle(CharSequence charSequence) {
            this.f1451a.f = charSequence;
            return this;
        }

        public C0006a setView(View view) {
            AlertController.b bVar = this.f1451a;
            bVar.z = view;
            bVar.y = 0;
            bVar.E = false;
            return this;
        }

        public C0006a(Context context, int i) {
            this.f1451a = new AlertController.b(new ContextThemeWrapper(context, a.g(context, i)));
            this.f1452b = i;
        }
    }

    public a(Context context, int i) {
        super(context, g(context, i));
        this.c = new AlertController(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(qii.p, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView f() {
        return this.c.d();
    }

    @Override // defpackage.if1, androidx.p004activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.c.f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.c.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.if1, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.c.p(charSequence);
    }
}
