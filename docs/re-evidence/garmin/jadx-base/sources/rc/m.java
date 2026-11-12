package rc;

import android.os.Bundle;
import java.util.Map;
import lc.q0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrc/m;", "Lrc/a;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "", "", "Llc/q0;", "typeMap", "<init>", "(Landroid/os/Bundle;Ljava/util/Map;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f151854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, q0<?>> f151855b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Bundle bundle, Map<String, ? extends q0<?>> map) {
        bundle.getClass();
        map.getClass();
        this.f151854a = bundle;
        this.f151855b = map;
    }

    @Override // rc.a
    public final boolean a(String str) {
        str.getClass();
        Bundle bundle = this.f151854a;
        bundle.getClass();
        return bundle.containsKey(str);
    }

    @Override // rc.a
    public final Object b(String str) {
        str.getClass();
        q0<?> q0Var = this.f151855b.get(str);
        if (q0Var != null) {
            return q0Var.a(this.f151854a, str);
        }
        return null;
    }
}
