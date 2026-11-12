package miuix.os;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import defpackage.eci;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AsyncTaskWithProgress<Params, Result> extends AsyncTask<Params, Integer, Result> {
    public static final HashMap<String, AsyncTaskWithProgress<?, ?>> m = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentManager f26699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26700b;
    public int c;
    public CharSequence d;
    public int e;
    public CharSequence f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26701k;
    public volatile ProgressDialogFragment l;

    public static class ProgressDialogFragment extends DialogFragment {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AsyncTaskWithProgress<?, ?> f26702a;

        public static ProgressDialogFragment s(String str) {
            ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("task", str);
            progressDialogFragment.setArguments(bundle);
            return progressDialogFragment;
        }

        @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            AsyncTaskWithProgress<?, ?> asyncTaskWithProgress = this.f26702a;
            if (asyncTaskWithProgress == null || !asyncTaskWithProgress.g) {
                super.onCancel(dialogInterface);
            } else {
                AsyncTaskWithProgress.h(this.f26702a);
                throw null;
            }
        }

        @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            AsyncTaskWithProgress<?, ?> asyncTaskWithProgress = (AsyncTaskWithProgress) AsyncTaskWithProgress.m.get(getArguments().getString("task"));
            this.f26702a = asyncTaskWithProgress;
            if (asyncTaskWithProgress == null) {
                k kVarO = getFragmentManager().o();
                kVarO.v(this);
                kVarO.l();
            }
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            if (this.f26702a == null) {
                return super.onCreateDialog(bundle);
            }
            eci eciVar = new eci(getActivity(), this.f26702a.f26700b);
            if (this.f26702a.c != 0) {
                eciVar.setTitle(this.f26702a.c);
            } else {
                eciVar.setTitle(this.f26702a.d);
            }
            if (this.f26702a.e != 0) {
                eciVar.O(getActivity().getText(this.f26702a.e));
            } else {
                eciVar.O(this.f26702a.f);
            }
            eciVar.R(this.f26702a.j);
            eciVar.L(this.f26702a.h);
            if (!this.f26702a.h) {
                eciVar.N(this.f26702a.i);
                eciVar.P(this.f26702a.f26701k);
            }
            if (this.f26702a.g) {
                CharSequence text = eciVar.getContext().getText(R.string.cancel);
                AsyncTaskWithProgress.h(this.f26702a);
                eciVar.y(-2, text, null);
                eciVar.setCancelable(true);
            } else {
                eciVar.y(-2, null, null);
                eciVar.setCancelable(false);
            }
            return eciVar;
        }

        @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public void onStart() {
            super.onStart();
            AsyncTaskWithProgress<?, ?> asyncTaskWithProgress = this.f26702a;
            if (asyncTaskWithProgress != null) {
                asyncTaskWithProgress.l = this;
            }
        }

        @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public void onStop() {
            AsyncTaskWithProgress<?, ?> asyncTaskWithProgress = this.f26702a;
            if (asyncTaskWithProgress != null) {
                asyncTaskWithProgress.l = null;
            }
            super.onStop();
        }

        public void setProgress(int i) {
            Dialog dialog = getDialog();
            if (dialog instanceof eci) {
                ((eci) dialog).P(i);
            }
        }
    }

    public class a implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    }

    public static /* synthetic */ a h(AsyncTaskWithProgress asyncTaskWithProgress) {
        asyncTaskWithProgress.getClass();
        return null;
    }

    public final void n() {
        ProgressDialogFragment progressDialogFragment = (ProgressDialogFragment) this.f26699a.l0("AsyncTaskWithProgress@" + hashCode());
        if (progressDialogFragment != null) {
            progressDialogFragment.dismissAllowingStateLoss();
        } else if (this.l != null) {
            this.l.dismissAllowingStateLoss();
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate(numArr);
        this.f26701k = numArr[0].intValue();
        if (this.l != null) {
            this.l.setProgress(this.f26701k);
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        m.remove("AsyncTaskWithProgress@" + hashCode());
        n();
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Result result) {
        m.remove("AsyncTaskWithProgress@" + hashCode());
        n();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        String str = "AsyncTaskWithProgress@" + hashCode();
        m.put(str, this);
        if (this.f26699a != null) {
            this.l = ProgressDialogFragment.s(str);
            this.l.setCancelable(this.g);
            this.l.show(this.f26699a, str);
        }
    }
}
