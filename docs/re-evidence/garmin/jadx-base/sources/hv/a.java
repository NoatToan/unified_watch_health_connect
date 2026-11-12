package hv;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f85742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f85743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f85744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Pair<Integer, Integer>> f85746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap<Pair<Integer, Integer>, Drawable> f85747f;

    public a(LinkedHashMap<jt2.a, String[]> linkedHashMap, Drawable drawable, List<Pair<Integer, Integer>> list, LinkedHashMap<Pair<Integer, Integer>, Drawable> linkedHashMap2) {
        this.f85743b = new ArrayList(linkedHashMap.keySet());
        this.f85744c = new ArrayList(linkedHashMap.values());
        this.f85745d = linkedHashMap.size();
        this.f85742a = drawable;
        this.f85746e = list;
        this.f85747f = linkedHashMap2;
    }

    public final Drawable a(int i14, int i15) {
        LinkedHashMap<Pair<Integer, Integer>, Drawable> linkedHashMap;
        Drawable drawable;
        return (i14 == -1 || i15 == -1 || (linkedHashMap = this.f85747f) == null || linkedHashMap.isEmpty() || (drawable = linkedHashMap.get(new Pair(Integer.valueOf(i14), Integer.valueOf(i15)))) == null) ? this.f85742a : drawable;
    }

    public final String b(int i14, int i15) {
        String[] strArr;
        if (i14 < 0) {
            return null;
        }
        ArrayList arrayList = this.f85744c;
        if (i14 >= arrayList.size() || (strArr = (String[]) arrayList.get(i14)) == null || i15 < 0 || i15 >= strArr.length) {
            return null;
        }
        return strArr[i15];
    }

    public final jt2.a c(int i14) {
        if (i14 < 0) {
            return null;
        }
        ArrayList arrayList = this.f85743b;
        if (i14 < arrayList.size()) {
            return (jt2.a) arrayList.get(i14);
        }
        return null;
    }

    public final boolean d(int i14, int i15) {
        List<Pair<Integer, Integer>> list = this.f85746e;
        if (list != null && !list.isEmpty()) {
            for (Pair<Integer, Integer> pair : list) {
                if (((Integer) pair.first).intValue() == i14 && ((Integer) pair.second).intValue() == i15) {
                    return false;
                }
            }
        }
        return true;
    }

    public a(LinkedHashMap<jt2.a, String[]> linkedHashMap, Drawable drawable) {
        this(linkedHashMap, drawable, null);
    }

    public a(LinkedHashMap<jt2.a, String[]> linkedHashMap, Drawable drawable, List<Pair<Integer, Integer>> list) {
        this(linkedHashMap, drawable, list, null);
    }

    public a(LinkedHashMap<jt2.a, String[]> linkedHashMap) {
        this(linkedHashMap, null);
    }
}
