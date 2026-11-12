package i03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i> f86963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f86964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f86965c = new HashSet(3);

    public p(List<i> list) {
        this.f86963a = list;
        this.f86964b = new ArrayList(list.size());
    }
}
