package br2;

import androidx.fragment.app.Fragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbr2/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h extends Fragment {
    public hn2.c M() {
        return u6();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        v6();
    }

    public final hn2.c u6() {
        androidx.fragment.app.m activity = getActivity();
        activity.getClass();
        return (hn2.c) activity;
    }

    public void v6() {
    }
}
