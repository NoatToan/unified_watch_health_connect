package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;

/* JADX INFO: loaded from: classes.dex */
public interface y {
    default CreationExtras getDefaultViewModelCreationExtras() {
        return CreationExtras.b.f8056c;
    }

    x1.c getDefaultViewModelProviderFactory();
}
