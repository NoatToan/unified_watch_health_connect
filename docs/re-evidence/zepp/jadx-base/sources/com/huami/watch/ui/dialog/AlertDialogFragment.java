package com.huami.watch.ui.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import com.huami.watch.companionlib.R;

/* JADX INFO: loaded from: classes10.dex */
public class AlertDialogFragment extends DialogFragment implements View.OnClickListener {
    public static final int STYLE_LOADING = 1;
    private static final String w = "AlertDialogFragment";
    private static final String x = "style";
    private static final String y = "canceledOnTouchOutside";
    private static final int z = 14;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private View g;
    private ProgressBar h;
    private boolean i;
    private int k;
    private String l;
    private String m;
    private CharSequence n;
    private CharSequence o;
    private DialogInterface.OnClickListener p;
    private DialogInterface.OnClickListener q;
    private DialogInterface.OnDismissListener r;
    private DialogInterface.OnCancelListener s;
    private OnCreateViewListener t;
    private Fragment u;
    private MovementMethod v;
    private int a = 0;
    private boolean b = true;
    private int j = 100;

    public interface OnCreateViewListener {
        void onCreateView();
    }

    private void a(View view) {
        TextView textView = (TextView) view.findViewById(R.id.loading_msg);
        this.e = textView;
        textView.setText(this.o);
        if (this.i) {
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress);
            this.h = progressBar;
            progressBar.setVisibility(0);
            this.h.setMax(this.j);
            this.h.setProgress(this.k);
        }
    }

    private void b(View view) {
        View viewFindViewById = view.findViewById(R.id.title_layout);
        if (TextUtils.isEmpty(this.n)) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
            TextView textView = (TextView) view.findViewById(R.id.title);
            this.f = textView;
            textView.setText(this.n);
            this.f.setVisibility(0);
        }
        this.c = (TextView) view.findViewById(R.id.dialog_btn_cancel);
        this.d = (TextView) view.findViewById(R.id.dialog_btn_confirm);
        if (TextUtils.isEmpty(this.l)) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.m)) {
            this.d.setVisibility(8);
        } else {
            this.c.setVisibility(0);
        }
        this.c.setText(this.l);
        this.d.setText(this.m);
        if (this.u == null) {
            TextView textView2 = (TextView) view.findViewById(R.id.dialog_msg);
            this.e = textView2;
            MovementMethod movementMethod = this.v;
            if (movementMethod != null) {
                textView2.setMovementMethod(movementMethod);
            }
            this.e.setText(this.o);
            CharSequence charSequence = this.o;
            if (charSequence != null && charSequence.length() > 14 && !String.valueOf(this.o).contains("\n")) {
                this.e.setGravity(GravityCompat.START);
            }
        }
        View viewFindViewById2 = view.findViewById(R.id.dim_part);
        this.g = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        this.c.setOnClickListener(this);
        this.d.setOnClickListener(this);
    }

    @Override // android.app.DialogFragment
    public int getTheme() {
        return this.a != 1 ? R.style.DimPanel : super.getTheme();
    }

    public int getmProgress() {
        ProgressBar progressBar = this.h;
        return progressBar != null ? progressBar.getProgress() : this.k;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.u != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.add(R.id.dialog_content_msg, this.u);
            fragmentTransactionBeginTransaction.commit();
        }
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.s;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Dialog dialog = getDialog();
        int id = view.getId();
        if (id == R.id.dim_part) {
            if (dialog != null && isCancelable() && this.b) {
                dialog.cancel();
                return;
            }
            return;
        }
        if (id == R.id.dialog_btn_cancel) {
            DialogInterface.OnClickListener onClickListener = this.q;
            if (onClickListener != null) {
                onClickListener.onClick(dialog, -2);
            }
            dialog.dismiss();
            return;
        }
        if (id == R.id.dialog_btn_confirm) {
            DialogInterface.OnClickListener onClickListener2 = this.p;
            if (onClickListener2 != null) {
                onClickListener2.onClick(dialog, -1);
            }
            dialog.dismiss();
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("style", 0);
            this.b = bundle.getBoolean(y, true);
        }
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        View viewInflate;
        Dialog dialog = getDialog();
        Window window = dialog.getWindow();
        dialog.requestWindowFeature(1);
        if (this.a == 1) {
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_loading, viewGroup, false);
            a(viewInflate);
        } else {
            viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_alert, viewGroup, true);
            b(viewInflate);
        }
        if (window != null) {
            window.setSoftInputMode(34);
        }
        if (isCancelable()) {
            dialog.setCanceledOnTouchOutside(this.b);
        }
        OnCreateViewListener onCreateViewListener = this.t;
        if (onCreateViewListener != null) {
            onCreateViewListener.onCreateView();
        }
        return viewInflate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            int i = this.a;
            if (i != 0) {
                bundle.putInt("style", i);
            }
            if (this.b) {
                return;
            }
            bundle.putBoolean(y, false);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.a != 1) {
            try {
                getDialog().getWindow().setLayout(-1, getDialog().getWindow().getAttributes().height);
                getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
                WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
                attributes.gravity = 80;
                getDialog().getWindow().setAttributes(attributes);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z2) {
        this.b = z2;
    }

    public void setContent(Fragment fragment) {
        this.u = fragment;
    }

    public void setMessage(String str) {
        setMessage(str, null);
    }

    public void setNegativeButton(String str, DialogInterface.OnClickListener onClickListener) {
        this.l = str;
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
        this.q = onClickListener;
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.s = onCancelListener;
    }

    public void setOnCreateViewListener(OnCreateViewListener onCreateViewListener) {
        this.t = onCreateViewListener;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.r = onDismissListener;
    }

    public void setPositiveButton(String str, DialogInterface.OnClickListener onClickListener) {
        this.m = str;
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        }
        this.p = onClickListener;
    }

    public void setStyle(int i) {
        this.a = i;
    }

    public void setTitle(String str) {
        this.n = str;
    }

    public void setVisibityPb(boolean z2) {
        this.i = z2;
    }

    public void setmMax(int i) {
        this.j = i;
        ProgressBar progressBar = this.h;
        if (progressBar != null) {
            progressBar.setMax(i);
        }
    }

    public void setmProgress(int i) {
        this.k = i;
        ProgressBar progressBar = this.h;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }

    public void setMessage(String str, MovementMethod movementMethod) {
        this.o = str;
        this.v = movementMethod;
    }
}
