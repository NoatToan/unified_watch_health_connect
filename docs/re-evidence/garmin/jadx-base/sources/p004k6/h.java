package p004k6;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p3.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk6/h;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f103079a;

    public h(x xVar) {
        this.f103079a = xVar;
    }

    @Override // p3.h0
    public final void dispose() {
        x xVar = this.f103079a;
        xVar.disposeComposition();
        xVar.setTag(R.id.view_tree_lifecycle_owner, null);
        xVar.f103129g.removeViewImmediate(xVar);
    }
}
