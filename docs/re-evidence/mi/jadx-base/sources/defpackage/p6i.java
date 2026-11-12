package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceDialogFragmentCompat;
import miuix.appcompat.app.c;

/* JADX INFO: loaded from: classes3.dex */
public class p6i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jwc f30062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PreferenceDialogFragmentCompat f30063b;

    public p6i(jwc jwcVar, PreferenceDialogFragmentCompat preferenceDialogFragmentCompat) {
        this.f30062a = jwcVar;
        this.f30063b = preferenceDialogFragmentCompat;
    }

    public Dialog a(Bundle bundle) {
        Context context = this.f30063b.getContext();
        DialogPreference dialogPreferenceS = this.f30063b.s();
        c.a aVar = new c.a(context);
        if (dialogPreferenceS != null) {
            f63 f63Var = new f63(context, aVar);
            f63Var.setTitle(dialogPreferenceS.k());
            f63Var.d(dialogPreferenceS.e());
            f63Var.i(dialogPreferenceS.m(), this.f30063b);
            f63Var.g(dialogPreferenceS.l(), this.f30063b);
            View viewA = this.f30062a.a(context);
            if (viewA != null) {
                this.f30062a.b(viewA);
                f63Var.setView(viewA);
            } else {
                f63Var.e(dialogPreferenceS.i());
            }
            this.f30062a.c(aVar);
        }
        c cVarB = aVar.b();
        if (this.f30062a.d()) {
            b(cVarB);
        }
        return cVarB;
    }

    public final void b(Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }
}
