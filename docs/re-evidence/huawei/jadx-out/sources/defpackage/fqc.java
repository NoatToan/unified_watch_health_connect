package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fqc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<View.OnClickListener> f34402c;
    private int d;
    private List<String> e;

    public fqc(List<String> list, List<View.OnClickListener> list2, int i) {
        this.e = list;
        this.f34402c = list2;
        this.d = i;
    }

    public List<String> b() {
        return this.e;
    }

    public List<View.OnClickListener> e() {
        return this.f34402c;
    }

    public int a() {
        return this.d;
    }
}
