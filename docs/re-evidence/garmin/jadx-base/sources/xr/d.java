package xr;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import p005kotlin.Metadata;
import r22.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxr/d;", "Lcom/google/android/material/snackbar/BaseTransientBottomBar$BaseCallback;", "Lr22/q0;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends BaseTransientBottomBar.BaseCallback<q0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f191958a;

    public d(c cVar) {
        this.f191958a = cVar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
    public final void onDismissed(q0 q0Var, int i14) {
        super.onDismissed(q0Var, i14);
        this.f191958a.f191949b = null;
    }
}
