package defpackage;

import android.graphics.Shader;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class bgh {
    public static List<Integer> e(VectorDrawableCompat vectorDrawableCompat, ColorResult colorResult) {
        return d(vectorDrawableCompat, colorResult.getAllColors(), colorResult.getAllGradients());
    }

    public static List<Integer> d(VectorDrawableCompat vectorDrawableCompat, List<Integer> list, List<Integer> list2) {
        a aVar = new a(list, list2);
        b(aVar, vectorDrawableCompat.a());
        return new ArrayList(aVar.e);
    }

    private static void b(a aVar, Object obj) {
        if (obj instanceof VectorDrawableCompat.b) {
            Iterator<VectorDrawableCompat.VObject> it = ((VectorDrawableCompat.b) obj).e().iterator();
            while (it.hasNext()) {
                b(aVar, it.next());
            }
        } else if (obj instanceof VectorDrawableCompat.a) {
            a(aVar, (VectorDrawableCompat.a) obj);
        }
    }

    private static void a(a aVar, VectorDrawableCompat.a aVar2) {
        if (aVar2.c()) {
            e(aVar, aVar2);
        } else {
            d(aVar, aVar2);
        }
    }

    private static void e(a aVar, VectorDrawableCompat.a aVar2) {
        Shader shaderA = aVar2.a();
        if (shaderA instanceof bgl) {
            bgl bglVar = (bgl) shaderA;
            if (bglVar.b().length >= 2) {
                int i = bglVar.b()[0];
                int i2 = bglVar.b()[1];
                if (aVar.d(i) && aVar.d(i2)) {
                    aVar2.a(new int[]{aVar.a(i), aVar.a(i2)});
                }
            }
        }
    }

    private static void d(a aVar, VectorDrawableCompat.a aVar2) {
        if (aVar.d(aVar2.d())) {
            aVar2.b(aVar.a(aVar2.d()));
        }
        if (aVar.d(aVar2.e())) {
            aVar2.e(aVar.a(aVar2.e()));
        }
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayMap<Integer, Integer> f1088c;
        private final Set<Integer> e;
        private static final List<Integer> d = Arrays.asList(1052688, 2105376, 3158064);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final List<Integer> f1087a = Arrays.asList(1118481, 2171169, 3223857);

        private static int c(int i) {
            return i & ViewCompat.MEASURED_SIZE_MASK;
        }

        private static int e(int i) {
            return i & (-16777216);
        }

        private a(List<Integer> list, List<Integer> list2) {
            this.f1088c = new ArrayMap<>();
            this.e = new HashSet();
            for (int i = 0; i < list.size(); i++) {
                List<Integer> list3 = d;
                if (i >= list3.size()) {
                    break;
                }
                this.f1088c.put(list3.get(i), list.get(i));
            }
            for (int i2 = 0; i2 < list2.size(); i2++) {
                List<Integer> list4 = f1087a;
                if (i2 >= list4.size()) {
                    return;
                }
                this.f1088c.put(list4.get(i2), list2.get(i2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(int i) {
            return this.f1088c.containsKey(Integer.valueOf(c(i)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a(int i) {
            int iC = c(i);
            int iE = e(i);
            if (this.f1088c.get(Integer.valueOf(iC)) == null) {
                return i;
            }
            this.e.add(this.f1088c.get(Integer.valueOf(iC)));
            return c(this.f1088c.getOrDefault(Integer.valueOf(iC), Integer.valueOf(iC)).intValue()) | iE;
        }
    }
}
