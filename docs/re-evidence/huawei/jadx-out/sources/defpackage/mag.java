package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<man> f41251c;
    private int e;

    public void d(int i) {
        this.e = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public List<man> e() {
        return (List) dym.d(this.f41251c);
    }

    public void e(List<man> list) {
        this.f41251c = (List) dym.d(list);
    }
}
