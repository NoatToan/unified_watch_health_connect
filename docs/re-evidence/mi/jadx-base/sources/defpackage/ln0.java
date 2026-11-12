package defpackage;

import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.ActivityResultRegistry;
import androidx.p004activity.result.contract.ActivityResultContract;

/* JADX INFO: loaded from: classes.dex */
public interface ln0 {
    <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback);

    <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultRegistry activityResultRegistry, ActivityResultCallback<O> activityResultCallback);
}
