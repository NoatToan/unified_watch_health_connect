package androidx.p004activity.result;

import android.annotation.SuppressLint;
import androidx.p004activity.result.contract.ActivityResultContract;
import defpackage.hn0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    public abstract ActivityResultContract<I, ?> getContract();

    public void launch(@SuppressLint({"UnknownNullness"}) I i) {
        launch(i, null);
    }

    public abstract void launch(@SuppressLint({"UnknownNullness"}) I i, hn0 hn0Var);

    public abstract void unregister();
}
