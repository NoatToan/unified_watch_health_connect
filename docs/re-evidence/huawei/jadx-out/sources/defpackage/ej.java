package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ej {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ev> f33053c = new ArrayList();

    void e(ev evVar) {
        this.f33053c.add(evVar);
    }

    public void e(Path path) {
        for (int size = this.f33053c.size() - 1; size >= 0; size--) {
            je.c(path, this.f33053c.get(size));
        }
    }
}
