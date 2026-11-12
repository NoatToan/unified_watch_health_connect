package defpackage;

import java.util.List;
import org.eclipse.californium.core.observe.ObserveRelation;

/* JADX INFO: loaded from: classes20.dex */
public class zxm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ObserveRelation> f54744c;

    public void b(ObserveRelation observeRelation) {
        this.f54744c.remove(observeRelation);
    }

    public void a() {
        for (ObserveRelation observeRelation : this.f54744c) {
            if (observeRelation.k()) {
                observeRelation.e();
            }
        }
    }

    public boolean e() {
        return this.f54744c.isEmpty();
    }
}
