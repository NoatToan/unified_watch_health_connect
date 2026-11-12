package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.a;
import miuix.appcompat.app.c;

/* JADX INFO: loaded from: classes3.dex */
public class f63 extends a.C0006a {
    public c.a c;

    public f63(Context context, c.a aVar) {
        this(context, 0, aVar);
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        this.c.c(listAdapter, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a b(boolean z) {
        this.c.e(z);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a c(View view) {
        this.c.f(view);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a d(Drawable drawable) {
        this.c.j(drawable);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a e(CharSequence charSequence) {
        this.c.m(charSequence);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a f(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.c.n(charSequenceArr, zArr, onMultiChoiceClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.c.p(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a h(DialogInterface.OnKeyListener onKeyListener) {
        this.c.t(onKeyListener);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.c.v(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a j(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        this.c.w(listAdapter, i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a k(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        this.c.x(charSequenceArr, i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        this.c.o(i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        this.c.u(i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a setTitle(CharSequence charSequence) {
        this.c.z(charSequence);
        return this;
    }

    @Override // androidx.appcompat.app.a.C0006a
    public a.C0006a setView(View view) {
        this.c.A(view);
        return this;
    }

    public f63(Context context, int i, c.a aVar) {
        super(context, i);
        this.c = aVar;
    }
}
