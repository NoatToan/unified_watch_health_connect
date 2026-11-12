package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.View;
import miuix.appcompat.internal.app.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes3.dex */
public class x08 extends le0 implements w08 {
    public boolean g;
    public String h;
    public String i;

    public x08(Context context, ActionMode.Callback callback) {
        super(context, callback);
        this.g = true;
    }

    @Override // defpackage.w08
    public void b(int i, CharSequence charSequence, int i2) {
        ((ActionBarContextView) this.f24958b.get()).Q(i, charSequence, i2);
    }

    @Override // defpackage.le0
    public boolean c() {
        boolean zC = super.c();
        if (this.g && zC) {
            g(i());
        }
        return zC;
    }

    @Override // defpackage.le0, android.view.ActionMode
    public void finish() {
        super.finish();
        if (this.g) {
            g(h());
        }
    }

    public void g(String str) {
        me0 me0Var = this.f24958b.get();
        if (me0Var instanceof ActionBarContextView) {
            ((ActionBarContextView) me0Var).announceForAccessibility(str);
        }
    }

    @Override // defpackage.le0, android.view.ActionMode
    public CharSequence getTitle() {
        return ((ActionBarContextView) this.f24958b.get()).getTitle();
    }

    public final String h() {
        return TextUtils.isEmpty(this.i) ? this.f24957a.getResources().getString(z1j.f) : this.i;
    }

    public final String i() {
        return TextUtils.isEmpty(this.h) ? this.f24957a.getResources().getString(z1j.h) : this.h;
    }

    @Override // defpackage.le0, android.view.ActionMode
    public void setCustomView(View view) {
    }

    @Override // defpackage.le0, android.view.ActionMode
    public void setSubtitle(int i) {
    }

    @Override // defpackage.le0, android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        ((ActionBarContextView) this.f24958b.get()).setTitle(charSequence);
    }

    @Override // defpackage.le0, android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // defpackage.le0, android.view.ActionMode
    public void setTitle(int i) {
        setTitle(this.f24957a.getResources().getString(i));
    }
}
