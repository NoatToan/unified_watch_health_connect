package is;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import ps.x0;
import qs.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lis/l;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f94879a = new l();

    private l() {
    }

    public static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (ar.h.b((x0) it.next()) != t.REST) {
                return false;
            }
        }
        return true;
    }
}
