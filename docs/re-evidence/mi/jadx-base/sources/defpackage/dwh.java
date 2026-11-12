package defpackage;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dwh<S> extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<r9h<S>> f15991a = new LinkedHashSet<>();

    public boolean s(r9h<S> r9hVar) {
        return this.f15991a.add(r9hVar);
    }

    public void t() {
        this.f15991a.clear();
    }
}
