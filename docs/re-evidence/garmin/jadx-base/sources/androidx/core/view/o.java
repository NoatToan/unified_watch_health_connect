package androidx.core.view;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public interface o {
    void addMenuProvider(s sVar);

    void addMenuProvider(s sVar, androidx.lifecycle.n0 n0Var);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(s sVar, androidx.lifecycle.n0 n0Var, androidx.lifecycle.b0.b bVar);

    void invalidateMenu();

    void removeMenuProvider(s sVar);
}
