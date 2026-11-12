package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class nit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Integer> f43066a;

    static {
        ArrayList arrayList = new ArrayList(14);
        f43066a = arrayList;
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
    }

    public static boolean a(int i) {
        return f43066a.contains(Integer.valueOf(i));
    }
}
