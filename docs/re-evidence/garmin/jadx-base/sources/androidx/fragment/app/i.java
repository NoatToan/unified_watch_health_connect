package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.v.r;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class i extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private z0<androidx.lifecycle.n0> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar = i.this;
            iVar.mOnDismissListener.onDismiss(iVar.mDialog);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            i iVar = i.this;
            if (iVar.mDialog != null) {
                iVar.onCancel(iVar.mDialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            i iVar = i.this;
            if (iVar.mDialog != null) {
                iVar.onDismiss(iVar.mDialog);
            }
        }
    }

    public class d implements z0<androidx.lifecycle.n0> {
        public d() {
        }

        @Override // androidx.lifecycle.z0
        public final void onChanged(androidx.lifecycle.n0 n0Var) {
            if (n0Var != null) {
                i iVar = i.this;
                if (iVar.mShowsDialog) {
                    View viewRequireView = iVar.requireView();
                    if (viewRequireView.getParent() != null) {
                        vb.h.z("DialogFragment can not be attached to a container view");
                    } else if (iVar.mDialog != null) {
                        if (v.R(3)) {
                            toString();
                            Objects.toString(iVar.mDialog);
                        }
                        iVar.mDialog.setContentView(viewRequireView);
                    }
                }
            }
        }
    }

    public class e extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f7268a;

        public e(o oVar) {
            this.f7268a = oVar;
        }

        @Override // androidx.fragment.app.o
        public final View b(int i14) {
            o oVar = this.f7268a;
            return oVar.c() ? oVar.b(i14) : i.this.onFindViewById(i14);
        }

        @Override // androidx.fragment.app.o
        public final boolean c() {
            return this.f7268a.c() || i.this.onHasView();
        }
    }

    public i() {
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z14, boolean z15, boolean z16) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z15) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId < 0) {
            v parentFragmentManager = getParentFragmentManager();
            androidx.fragment.app.a aVarB = androidx.core.view.j.b(parentFragmentManager, parentFragmentManager);
            aVarB.f7250r = true;
            aVarB.k(this);
            if (z16) {
                aVarB.t();
                return;
            } else if (z14) {
                aVarB.s(true, true);
                return;
            } else {
                aVarB.e();
                return;
            }
        }
        if (z16) {
            v parentFragmentManager2 = getParentFragmentManager();
            int i14 = this.mBackStackId;
            if (i14 < 0) {
                parentFragmentManager2.getClass();
                vb.h.s(am.j.h(i14, "Bad id: "));
                return;
            }
            parentFragmentManager2.c0(i14, 1, null);
        } else {
            v parentFragmentManager3 = getParentFragmentManager();
            int i15 = this.mBackStackId;
            parentFragmentManager3.getClass();
            if (i15 < 0) {
                vb.h.s(am.j.h(i15, "Bad id: "));
                return;
            }
            parentFragmentManager3.y(parentFragmentManager3.new r(null, i15, 1), z14);
        }
        this.mBackStackId = -1;
    }

    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public o createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().g(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (v.R(3)) {
            toString();
        }
        return new b.i(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().k(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (v.R(3)) {
            toString();
        }
        dismissInternal(true, true, false);
    }

    public View onFindViewById(int i14) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i14);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (v.R(2)) {
                toString();
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (v.R(2)) {
            new StringBuilder("getting layout inflater for DialogFragment ").append(this);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i14 = this.mStyle;
        if (i14 != 0) {
            bundle.putInt(SAVED_STYLE, i14);
        }
        int i15 = this.mTheme;
        if (i15 != 0) {
            bundle.putInt(SAVED_THEME, i15);
        }
        boolean z14 = this.mCancelable;
        if (!z14) {
            bundle.putBoolean(SAVED_CANCELABLE, z14);
        }
        boolean z15 = this.mShowsDialog;
        if (!z15) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z15);
        }
        int i16 = this.mBackStackId;
        if (i16 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i16);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final b.i requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof b.i) {
            return (b.i) dialogRequireDialog;
        }
        androidx.core.view.j.t("DialogFragment ", this, " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is ", dialogRequireDialog);
        return null;
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        kg.f.o("DialogFragment ", this, " does not have a Dialog.");
        return null;
    }

    public void setCancelable(boolean z14) {
        this.mCancelable = z14;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z14);
        }
    }

    public void setShowsDialog(boolean z14) {
        this.mShowsDialog = z14;
    }

    public void setStyle(int i14, int i15) {
        if (v.R(2)) {
            toString();
        }
        this.mStyle = i14;
        if (i14 == 2 || i14 == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i15 != 0) {
            this.mTheme = i15;
        }
    }

    public void setupDialog(Dialog dialog, int i14) {
        if (i14 != 1 && i14 != 2) {
            if (i14 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(v vVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(vVar, vVar);
        aVarB.f7250r = true;
        aVarB.j(0, this, str, 1);
        aVarB.e();
    }

    public void showNow(v vVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(vVar, vVar);
        aVarB.f7250r = true;
        aVarB.j(0, this, str, 1);
        aVarB.t();
    }

    public int show(g0 g0Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        g0Var.j(0, this, str, 1);
        this.mViewDestroyed = false;
        int iE = g0Var.e();
        this.mBackStackId = iE;
        return iE;
    }

    public i(int i14) {
        super(i14);
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }
}
