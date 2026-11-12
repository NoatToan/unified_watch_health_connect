package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.view.ActionMode;
import androidx.p004activity.ComponentDialog;

/* JADX INFO: loaded from: classes.dex */
public class if1 extends ComponentDialog implements df1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatDelegate f21074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yzd.a f21075b;

    public if1(Context context, int i) {
        super(context, c(context, i));
        this.f21075b = new yzd.a() { // from class: hf1
            @Override // yzd.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f20002a.d(keyEvent);
            }
        };
        AppCompatDelegate appCompatDelegateB = b();
        appCompatDelegateB.K(c(context, i));
        appCompatDelegateB.t(null);
    }

    private static int c(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(qii.B, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.p004activity.ComponentDialog, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().d(view, layoutParams);
    }

    public AppCompatDelegate b() {
        if (this.f21074a == null) {
            this.f21074a = AppCompatDelegate.j(this, this);
        }
        return this.f21074a;
    }

    public boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        b().u();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return yzd.e(this.f21075b, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean e(int i) {
        return b().C(i);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) b().k(i);
    }

    @Override // android.app.Dialog
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        b().r();
    }

    @Override // androidx.p004activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        b().q();
        super.onCreate(bundle);
        b().t(bundle);
    }

    @Override // androidx.p004activity.ComponentDialog, android.app.Dialog
    public void onStop() {
        super.onStop();
        b().z();
    }

    @Override // defpackage.df1
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // defpackage.df1
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // defpackage.df1
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // androidx.p004activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        b().E(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().L(charSequence);
    }

    @Override // androidx.p004activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        b().F(view);
    }

    @Override // androidx.p004activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().G(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        b().L(getContext().getString(i));
    }
}
