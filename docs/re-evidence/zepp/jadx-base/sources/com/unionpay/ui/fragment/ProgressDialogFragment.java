package com.unionpay.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.huami.watch.companion.nfc.unionpay.R;

/* JADX INFO: loaded from: classes18.dex */
public class ProgressDialogFragment extends DialogFragment {
    public static final int g = 100;
    private ProgressBar a;
    private TextView b;
    private TextView c;
    private int d;
    private String e;
    private String f;

    private void initView(View view) {
        this.a = (ProgressBar) view.findViewById(R.id.progress);
        this.b = (TextView) view.findViewById(R.id.title);
        this.c = (TextView) view.findViewById(R.id.dialog_msg);
        this.a.setProgress(this.d);
        this.b.setText(this.e);
        this.c.setText(this.f);
    }

    public int getProgress() {
        return this.d;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.BankDimPanel;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.wl_fragment_progress_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView(view);
    }

    public void setMessage(String str) {
        this.f = str;
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setProgress(int i) {
        this.d = i;
        ProgressBar progressBar = this.a;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }

    public void setTitle(String str) {
        this.e = str;
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
