package androidx.p010navigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@Navigator.Name("NoOp")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NoOpNavigator extends Navigator<NavDestination> {
    @Override // androidx.p010navigation.Navigator
    @NonNull
    public NavDestination createDestination() {
        return new NavDestination(this);
    }

    @Override // androidx.p010navigation.Navigator
    @Nullable
    public NavDestination navigate(@NonNull NavDestination navDestination, @Nullable Bundle bundle, @Nullable NavOptions navOptions, @Nullable Navigator.Extras extras) {
        return navDestination;
    }

    @Override // androidx.p010navigation.Navigator
    public boolean popBackStack() {
        return true;
    }
}
