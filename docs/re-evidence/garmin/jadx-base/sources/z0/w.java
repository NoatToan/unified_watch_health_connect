package z0;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f200718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f200719c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f200720a = new HashMap();

    @AutoValue
    public static abstract class a {
        public abstract int a();

        public abstract u b();
    }

    static {
        HashMap map = new HashMap();
        f200718b = map;
        map.put(u.f200711d, Range.create(2160, 4319));
        map.put(u.f200710c, Range.create(1080, 1439));
        map.put(u.f200709b, Range.create(720, 1079));
        map.put(u.f200708a, Range.create(241, Integer.valueOf(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD)));
        HashMap map2 = new HashMap();
        f200719c = map2;
        map2.put(0, j0.a.f95902a);
        map2.put(1, j0.a.f95904c);
    }

    public w(List<Size> list, Map<u, Size> map) {
        HashMap map2;
        Integer num;
        u uVar;
        HashMap map3 = f200718b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = f200719c;
            if (!zHasNext) {
                break;
            }
            u uVar2 = (u) it.next();
            this.f200720a.put(new h(uVar2, -1), new ArrayList());
            Iterator it3 = map2.keySet().iterator();
            while (it3.hasNext()) {
                this.f200720a.put(new h(uVar2, ((Integer) it3.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry<u, Size> entry : map.entrySet()) {
            List list2 = (List) this.f200720a.get(new h(entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add(entry.getValue());
        }
        for (Size size : list) {
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    uVar = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains(Integer.valueOf(size.getHeight()))) {
                    uVar = (u) entry2.getKey();
                    break;
                }
            }
            if (uVar != null) {
                for (Map.Entry entry3 : map2.entrySet()) {
                    if (j0.a.a(size, (Rational) entry3.getValue(), q0.c.f141972b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.f200720a.get(new h(uVar, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.f200720a.entrySet()) {
            Size size2 = map.get(((a) entry4.getKey()).b());
            if (size2 != null) {
                Size size3 = q0.c.f141971a;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: z0.v
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        HashMap map4 = w.f200718b;
                        int iA = q0.c.a((Size) obj);
                        int i14 = height;
                        return Math.abs(iA - i14) - Math.abs(q0.c.a((Size) obj2) - i14);
                    }
                });
            }
        }
    }
}
