package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class z3q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40850b;
    public final boolean c;
    public final long d;
    public final long e;
    public final c4q f;
    public final String[] g;
    public final String h;
    public final String i;
    public final z3q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<String, Integer> f40851k;
    public final HashMap<String, Integer> l;
    public List<z3q> m;

    public z3q(String str, String str2, long j, long j2, c4q c4qVar, String[] strArr, String str3, String str4, z3q z3qVar) {
        this.f40849a = str;
        this.f40850b = str2;
        this.i = str4;
        this.f = c4qVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        this.h = (String) rk1.e(str3);
        this.j = z3qVar;
        this.f40851k = new HashMap<>();
        this.l = new HashMap<>();
    }

    public static z3q c(String str, long j, long j2, c4q c4qVar, String[] strArr, String str2, String str3, z3q z3qVar) {
        return new z3q(str, null, j, j2, c4qVar, strArr, str2, str3, z3qVar);
    }

    public static z3q d(String str) {
        return new z3q(null, b4q.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder) {
        for (yy5 yy5Var : (yy5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), yy5.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(yy5Var), spannableStringBuilder.getSpanEnd(yy5Var), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public static SpannableStringBuilder k(String str, Map<String, h55.b> map) {
        if (!map.containsKey(str)) {
            h55.b bVar = new h55.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) rk1.e(map.get(str).e());
    }

    public void a(z3q z3qVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(z3qVar);
    }

    public final void b(Map<String, c4q> map, h55.b bVar, int i, int i2, int i3) {
        c4q c4qVarF = b4q.f(this.f, this.g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (c4qVarF != null) {
            b4q.a(spannableStringBuilder2, i, i2, c4qVarF, this.j, map, i3);
            if (FitnessFilePathUtils.TimeZoneConstant.POSITIVE.equals(this.f40849a)) {
                if (c4qVarF.k() != Float.MAX_VALUE) {
                    bVar.m((c4qVarF.k() * (-90.0f)) / 100.0f);
                }
                if (c4qVarF.m() != null) {
                    bVar.p(c4qVarF.m());
                }
                if (c4qVarF.h() != null) {
                    bVar.j(c4qVarF.h());
                }
            }
        }
    }

    public z3q f(int i) {
        List<z3q> list = this.m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<z3q> list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<h55> h(long j, Map<String, c4q> map, Map<String, a4q> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j, false, this.h, treeMap);
        o(j, map, map2, this.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                a4q a4qVar = (a4q) rk1.e(map2.get(pair.first));
                arrayList2.add(new h55.b().f(bitmapDecodeByteArray).k(a4qVar.f617b).l(0).h(a4qVar.c, 0).i(a4qVar.e).n(a4qVar.f).g(a4qVar.g).r(a4qVar.j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            a4q a4qVar2 = (a4q) rk1.e(map2.get(entry.getKey()));
            h55.b bVar = (h55.b) entry.getValue();
            e((SpannableStringBuilder) rk1.e(bVar.e()));
            bVar.h(a4qVar2.c, a4qVar2.d);
            bVar.i(a4qVar2.e);
            bVar.k(a4qVar2.f617b);
            bVar.n(a4qVar2.f);
            bVar.q(a4qVar2.i, a4qVar2.h);
            bVar.r(a4qVar2.j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public final void i(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = FitnessFilePathUtils.TimeZoneConstant.POSITIVE.equals(this.f40849a);
        boolean zEquals2 = "div".equals(this.f40849a);
        if (z || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            this.m.get(i).i(treeSet, z || zEquals);
        }
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public String[] l() {
        return this.g;
    }

    public boolean m(long j) {
        long j2 = this.d;
        return (j2 == -9223372036854775807L && this.e == -9223372036854775807L) || (j2 <= j && this.e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.e) || (j2 <= j && j < this.e));
    }

    public final void n(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (m(j) && "div".equals(this.f40849a) && this.i != null) {
            list.add(new Pair<>(str, this.i));
            return;
        }
        for (int i = 0; i < g(); i++) {
            f(i).n(j, str, list);
        }
    }

    public final void o(long j, Map<String, c4q> map, Map<String, a4q> map2, String str, Map<String, h55.b> map3) {
        int i;
        if (m(j)) {
            String str2 = "".equals(this.h) ? str : this.h;
            Iterator<Map.Entry<String, Integer>> it = this.l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f40851k.containsKey(key) ? this.f40851k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (h55.b) rk1.e(map3.get(key)), iIntValue, iIntValue2, ((a4q) rk1.e(map2.get(str2))).j);
                }
            }
            for (i = 0; i < g(); i++) {
                f(i).o(j, map, map2, str2, map3);
            }
        }
    }

    public final void p(long j, boolean z, String str, Map<String, h55.b> map) {
        this.f40851k.clear();
        this.l.clear();
        if ("metadata".equals(this.f40849a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (this.c && z) {
            k(str, map).append((CharSequence) rk1.e(this.f40850b));
            return;
        }
        if ("br".equals(this.f40849a) && z) {
            k(str, map).append('\n');
            return;
        }
        if (m(j)) {
            for (Map.Entry<String, h55.b> entry : map.entrySet()) {
                this.f40851k.put(entry.getKey(), Integer.valueOf(((CharSequence) rk1.e(entry.getValue().e())).length()));
            }
            boolean zEquals = FitnessFilePathUtils.TimeZoneConstant.POSITIVE.equals(this.f40849a);
            for (int i = 0; i < g(); i++) {
                f(i).p(j, z || zEquals, str, map);
            }
            if (zEquals) {
                b4q.c(k(str, map));
            }
            for (Map.Entry<String, h55.b> entry2 : map.entrySet()) {
                this.l.put(entry2.getKey(), Integer.valueOf(((CharSequence) rk1.e(entry2.getValue().e())).length()));
            }
        }
    }
}
