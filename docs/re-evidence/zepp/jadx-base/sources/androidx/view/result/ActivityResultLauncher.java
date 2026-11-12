package androidx.view.result;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.view.result.contract.ActivityResultContract;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    @NonNull
    public abstract ActivityResultContract<I, ?> getContract();

    public void launch(@SuppressLint({"UnknownNullness"}) I input) {
        launch(input, null);
    }

    public abstract void launch(@SuppressLint({"UnknownNullness"}) I input, @Nullable ActivityOptionsCompat options);

    @MainThread
    public abstract void unregister();
}
