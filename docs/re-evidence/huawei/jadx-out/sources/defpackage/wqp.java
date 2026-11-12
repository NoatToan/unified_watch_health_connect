package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/* JADX INFO: loaded from: classes19.dex */
public class wqp {
    public static void b(FragmentManager fragmentManager, Fragment fragment, int i) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.replace(i, fragment);
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
    }
}
