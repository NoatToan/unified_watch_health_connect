package mj2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmj2/d;", "", "<init>", "()V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f119092a = new d();

    private d() {
    }

    public static int a(Map map) {
        map.getClass();
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Boolean) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }
}
