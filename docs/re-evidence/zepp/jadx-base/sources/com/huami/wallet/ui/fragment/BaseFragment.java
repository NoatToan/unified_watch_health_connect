package com.huami.wallet.ui.fragment;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes16.dex */
public class BaseFragment extends Fragment {
    private Context a;

    public Context b() {
        return this.a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.a = context;
    }
}
