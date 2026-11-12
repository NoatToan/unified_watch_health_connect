package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogPreference f2726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f2727b;
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

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.h = i;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LifecycleOwner targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.f2727b = bundle.getCharSequence("PreferenceDialogFragment.title");
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
        this.f2726a = dialogPreference;
        this.f2727b = dialogPreference.k();
        this.c = this.f2726a.m();
        this.d = this.f2726a.l();
        this.e = this.f2726a.i();
        this.f = this.f2726a.h();
        Drawable drawableE = this.f2726a.e();
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

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.h = -2;
        androidx.appcompat.app.a.C0006a c0006aG = new androidx.appcompat.app.a.C0006a(requireContext()).setTitle(this.f2727b).d(this.g).i(this.c, this).g(this.d, this);
        View viewV = v(requireContext());
        if (viewV != null) {
            u(viewV);
            c0006aG.setView(viewV);
        } else {
            c0006aG.e(this.e);
        }
        x(c0006aG);
        androidx.appcompat.app.a aVarCreate = c0006aG.create();
        if (t()) {
            y(aVarCreate);
        }
        return aVarCreate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        w(this.h == -1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f2727b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f);
        BitmapDrawable bitmapDrawable = this.g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public DialogPreference s() {
        if (this.f2726a == null) {
            this.f2726a = (DialogPreference) ((DialogPreference.a) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.f2726a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean t() {
        return false;
    }

    public void u(View view) {
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

    public View v(Context context) {
        int i = this.f;
        if (i == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i, (ViewGroup) null);
    }

    public abstract void w(boolean z);

    public void x(androidx.appcompat.app.a.C0006a c0006a) {
    }

    public final void y(Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window);
        } else {
            z();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void z() {
    }
}
