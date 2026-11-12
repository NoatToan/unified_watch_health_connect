package com.xiaomi.fitness.baseui;

import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.dvq;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Ldvq;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 0, 0})
public abstract class AbsViewModel extends dvq implements DefaultLifecycleObserver {
    public static /* synthetic */ void attach$default(AbsViewModel absViewModel, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attach");
        }
        if ((i & 1) != 0) {
            bundle = null;
        }
        absViewModel.attach(bundle);
    }

    public void attach(@Nullable Bundle savedInstanceState) {
    }
}
