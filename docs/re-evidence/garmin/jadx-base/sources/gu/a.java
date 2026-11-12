package gu;

import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgu/a;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f79026a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f79027b = (c) KoinJavaComponent.get$default(c.class, null, null, 6, null);

    private a() {
    }

    public static boolean a(int i14, int i15) {
        Object next;
        Iterator<T> it = f79027b.c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((d) next).getProductNumber() != i14);
        d dVar = (d) next;
        if (dVar == null) {
            return false;
        }
        Integer fixedSoftwareVersion = dVar.getFixedSoftwareVersion();
        return fixedSoftwareVersion == null || i15 < fixedSoftwareVersion.intValue();
    }
}
