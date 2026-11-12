package androidx.work;

import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import t13.g;
import ue.d0;
import ue.k0;
import ue.n;

/* JADX INFO: loaded from: classes7.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f11426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f11427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f11429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f11430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ef.b f11431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f11432g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f11433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Uri> f11434b;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f11433a = list;
            this.f11434b = list;
        }
    }

    public WorkerParameters(UUID uuid, c cVar, Collection<String> collection, a aVar, int i14, int i15, Executor executor, g gVar, ef.b bVar, k0 k0Var, d0 d0Var, n nVar) {
        this.f11426a = uuid;
        this.f11427b = cVar;
        new HashSet(collection);
        this.f11428c = i14;
        this.f11429d = executor;
        this.f11430e = gVar;
        this.f11431f = bVar;
        this.f11432g = nVar;
    }
}
