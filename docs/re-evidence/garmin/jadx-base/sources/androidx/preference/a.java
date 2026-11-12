package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.fragment.app.i;
import androidx.lifecycle.n0;
import ch.qos.logback.core.joran.action.Action;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends i implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogPreference f10184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f10185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f10186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f10187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f10188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BitmapDrawable f10190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10191h;

    /* JADX INFO: renamed from: androidx.preference.a$a, reason: collision with other inner class name */
    public static class C0140a {
        private C0140a() {
        }

        public static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        this.f10191h = i14;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n0 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            h.z("Target fragment must implement TargetFragment interface");
            return;
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = requireArguments().getString(Action.KEY_ATTRIBUTE);
        if (bundle != null) {
            this.f10185b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f10186c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f10187d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f10188e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f10189f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f10190g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.H0(string);
        this.f10184a = dialogPreference;
        this.f10185b = dialogPreference.K0;
        this.f10186c = dialogPreference.N0;
        this.f10187d = dialogPreference.O0;
        this.f10188e = dialogPreference.L0;
        this.f10189f = dialogPreference.P0;
        Drawable drawable = dialogPreference.M0;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f10190g = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f10190g = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        this.f10191h = -2;
        e.a negativeButton = new e.a(requireContext()).setTitle(this.f10185b).setIcon(this.f10190g).setPositiveButton(this.f10186c, this).setNegativeButton(this.f10187d, this);
        requireContext();
        int i14 = this.f10189f;
        View viewInflate = i14 != 0 ? getLayoutInflater().inflate(i14, (ViewGroup) null) : null;
        if (viewInflate != null) {
            v6(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.f10188e);
        }
        y6(negativeButton);
        e eVarCreate = negativeButton.create();
        if (this instanceof bd.a) {
            Window window = eVarCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C0140a.a(window);
                return eVarCreate;
            }
            bd.a aVar = (bd.a) this;
            aVar.f17471l = SystemClock.currentThreadTimeMillis();
            aVar.z6();
        }
        return eVarCreate;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        w6(this.f10191h == -1);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f10185b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f10186c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f10187d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f10188e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f10189f);
        BitmapDrawable bitmapDrawable = this.f10190g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public final DialogPreference u6() {
        if (this.f10184a == null) {
            this.f10184a = (DialogPreference) ((DialogPreference.a) getTargetFragment()).H0(requireArguments().getString(Action.KEY_ATTRIBUTE));
        }
        return this.f10184a;
    }

    public void v6(View view2) {
        int i14;
        View viewFindViewById = view2.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f10188e;
            if (TextUtils.isEmpty(charSequence)) {
                i14 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i14 = 0;
            }
            if (viewFindViewById.getVisibility() != i14) {
                viewFindViewById.setVisibility(i14);
            }
        }
    }

    public abstract void w6(boolean z14);

    public void y6(e.a aVar) {
    }
}
