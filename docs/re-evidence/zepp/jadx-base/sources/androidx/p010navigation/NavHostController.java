package androidx.p010navigation;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.ViewModelStore;
import androidx.view.OnBackPressedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public class NavHostController extends NavController {
    public NavHostController(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.p010navigation.NavController
    public final void enableOnBackPressed(boolean z) {
        super.enableOnBackPressed(z);
    }

    @Override // androidx.p010navigation.NavController
    public final void setLifecycleOwner(@NonNull LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.p010navigation.NavController
    public final void setOnBackPressedDispatcher(@NonNull OnBackPressedDispatcher onBackPressedDispatcher) {
        super.setOnBackPressedDispatcher(onBackPressedDispatcher);
    }

    @Override // androidx.p010navigation.NavController
    public final void setViewModelStore(@NonNull ViewModelStore viewModelStore) {
        super.setViewModelStore(viewModelStore);
    }
}
