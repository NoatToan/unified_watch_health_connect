package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class p5f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<o82<u2m, Path>> f30015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o82<Integer, Integer>> f30016b;
    public final List<Mask> c;

    public p5f(List<Mask> list) {
        this.c = list;
        this.f30015a = new ArrayList(list.size());
        this.f30016b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f30015a.add(list.get(i).b().a());
            this.f30016b.add(list.get(i).c().a());
        }
    }

    public List<o82<u2m, Path>> a() {
        return this.f30015a;
    }

    public List<Mask> b() {
        return this.c;
    }

    public List<o82<Integer, Integer>> c() {
        return this.f30016b;
    }
}
