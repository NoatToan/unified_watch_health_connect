package fp2;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfp2/c;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f73188a = new c();

    private c() {
    }

    public static fj2.a a(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((fj2.a) next).f71863r) {
                return (fj2.a) next;
            }
        }
        next = null;
        return (fj2.a) next;
    }
}
