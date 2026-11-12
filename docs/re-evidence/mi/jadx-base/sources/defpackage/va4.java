package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class va4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d2q> f36653a = new ArrayList();

    public void a(d2q d2qVar) {
        this.f36653a.add(d2qVar);
    }

    public void b(Path path) {
        for (int size = this.f36653a.size() - 1; size >= 0; size--) {
            emq.b(path, this.f36653a.get(size));
        }
    }
}
