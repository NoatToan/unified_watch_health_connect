package ow0;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import pv0.d;
import pv0.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Low0/a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f134291a = new a();

    private a() {
    }

    public static boolean a(List list) {
        int i14;
        list.getClass();
        if (list.isEmpty()) {
            i14 = 0;
        } else {
            Iterator it = list.iterator();
            i14 = 0;
            while (it.hasNext()) {
                if (f.f((d) it.next()) && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        return i14 < 50;
    }
}
