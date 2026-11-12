package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/y1;", "", "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8080a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f8080a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((u1) it.next()).clear$lifecycle_viewmodel();
        }
        linkedHashMap.clear();
    }
}
