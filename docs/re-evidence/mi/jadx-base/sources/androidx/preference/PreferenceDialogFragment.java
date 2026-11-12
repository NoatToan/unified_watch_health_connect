package androidx.preference;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class PreferenceDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogPreference f2724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f2725b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public int f;
    public BitmapDrawable g;
    public int h;

    @RequiresApi(30)
    public static class a {
        public static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    @Deprecated
    public PreferenceDialogFragment() {
    }

    @Deprecated
    public DialogPreference a() {
        if (this.f2724a == null) {
            this.f2724a = (DialogPreference) ((DialogPreference.a) getTargetFragment()).findPreference(getArguments().getString("key"));
        }
        return this.f2724a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean b() {
        return false;
    }

    @Deprecated
    public void c(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.e;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    @Deprecated
    public View d(Context context) {
        int i = this.f;
        if (i == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    @Deprecated
    public abstract void e(boolean z);

    @Deprecated
    public void f(AlertDialog.Builder builder) {
    }

    public final void g(Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window);
        } else {
            window.setSoftInputMode(5);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    @Deprecated
    public void onClick(DialogInterface dialogInterface, int i) {
        this.h = i;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = getArguments().getString("key");
        if (bundle != null) {
            this.f2725b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.findPreference(string);
        this.f2724a = dialogPreference;
        this.f2725b = dialogPreference.k();
        this.c = this.f2724a.m();
        this.d = this.f2724a.l();
        this.e = this.f2724a.i();
        this.f = this.f2724a.h();
        Drawable drawableE = this.f2724a.e();
        if (drawableE == null || (drawableE instanceof BitmapDrawable)) {
            this.g = (BitmapDrawable) drawableE;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableE.getIntrinsicWidth(), drawableE.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableE.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableE.draw(canvas);
        this.g = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.h = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f2725b).setIcon(this.g).setPositiveButton(this.c, this).setNegativeButton(this.d, this);
        View viewD = d(activity);
        if (viewD != null) {
            c(viewD);
            negativeButton.setView(viewD);
        } else {
            negativeButton.setMessage(this.e);
        }
        f(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (b()) {
            g(alertDialogCreate);
        }
        return alertDialogCreate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        e(this.h == -1);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f2725b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f);
        BitmapDrawable bitmapDrawable = this.g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
