package a03;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"La03/j;", "Lp3/h0;", "runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f108a;

    public j(l lVar) {
        this.f108a = lVar;
    }

    @Override // p3.h0
    public final void dispose() {
        l lVar = this.f108a;
        lVar.disposeComposition();
        lVar.setTag(R.id.view_tree_lifecycle_owner, null);
        lVar.setTag(R.id.view_tree_saved_state_registry_owner, null);
        lVar.f117b.getViewTreeObserver().removeOnGlobalLayoutListener(lVar);
        lVar.f119d.removeViewImmediate(lVar);
    }
}
