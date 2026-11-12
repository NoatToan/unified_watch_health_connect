package i;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class l extends b.i implements d {
    private e mDelegate;
    private final androidx.core.view.n mKeyDispatcher;

    public l(Context context, int i14) {
        super(context, getThemeResId(context, i14));
        this.mKeyDispatcher = new androidx.core.view.n() { // from class: i.k
            @Override // androidx.core.view.n
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f86638a.superDispatchKeyEvent(keyEvent);
            }
        };
        e delegate = getDelegate();
        delegate.A(getThemeResId(context, i14));
        delegate.n();
    }

    private static int getThemeResId(Context context, int i14) {
        if (i14 != 0) {
            return i14;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // b.i, android.app.Dialog
    public void addContentView(View view2, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().a(view2, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        androidx.core.view.n nVar = this.mKeyDispatcher;
        if (nVar == null) {
            return false;
        }
        return nVar.superDispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i14) {
        return (T) getDelegate().d(i14);
    }

    public e getDelegate() {
        if (this.mDelegate == null) {
            e.c cVar = e.f86561a;
            this.mDelegate = new f(this, this);
        }
        return this.mDelegate;
    }

    public a getSupportActionBar() {
        return getDelegate().i();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().k();
    }

    @Override // b.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().j();
        super.onCreate(bundle);
        getDelegate().n();
    }

    @Override // b.i, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().s();
    }

    @Override // i.d
    public void onSupportActionModeFinished(m.b bVar) {
    }

    @Override // i.d
    public void onSupportActionModeStarted(m.b bVar) {
    }

    @Override // i.d
    public m.b onWindowStartingSupportActionMode(m.b.a aVar) {
        return null;
    }

    @Override // b.i, android.app.Dialog
    public void setContentView(int i14) {
        initializeViewTreeOwners();
        getDelegate().v(i14);
    }

    @Override // android.app.Dialog
    public void setTitle(int i14) {
        super.setTitle(i14);
        getDelegate().B(getContext().getString(i14));
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i14) {
        return getDelegate().u(i14);
    }

    @Override // b.i, android.app.Dialog
    public void setContentView(View view2) {
        initializeViewTreeOwners();
        getDelegate().w(view2);
    }

    @Override // b.i, android.app.Dialog
    public void setContentView(View view2, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().x(view2, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().B(charSequence);
    }

    public l(Context context) {
        this(context, 0);
    }

    public l(Context context, boolean z14, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new androidx.core.view.n() { // from class: i.k
            @Override // androidx.core.view.n
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f86638a.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z14);
        setOnCancelListener(onCancelListener);
    }
}
