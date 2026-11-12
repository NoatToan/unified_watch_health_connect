package ec;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import fa.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import yb.i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f63761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f63762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, g> f63763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, e> f63764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f63765e;

    public h(c cVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f63761a = cVar;
        this.f63764d = map2;
        this.f63765e = map3;
        this.f63763c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        cVar.getClass();
        TreeSet<Long> treeSet = new TreeSet<>();
        int i14 = 0;
        cVar.e(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i14] = it.next().longValue();
            i14++;
        }
        this.f63762b = jArr;
    }

    @Override // yb.i
    public final List<ea.a> getCues(long j8) {
        c cVar = this.f63761a;
        cVar.getClass();
        ArrayList<Pair> arrayList = new ArrayList();
        String str = cVar.f63712h;
        cVar.h(j8, str, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.j(j8, false, str, treeMap);
        Map<String, g> map = this.f63763c;
        Map<String, e> map2 = this.f63764d;
        cVar.i(j8, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str2 = this.f63765e.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = map2.get(pair.first);
                eVar.getClass();
                ea.a.b bVar = new ea.a.b();
                bVar.f63569b = bitmapDecodeByteArray;
                bVar.f63575h = eVar.f63733b;
                bVar.f63576i = 0;
                bVar.f63572e = eVar.f63734c;
                bVar.f63573f = 0;
                bVar.f63574g = eVar.f63736e;
                bVar.f63579l = eVar.f63737f;
                bVar.f63580m = eVar.f63738g;
                bVar.f63583p = eVar.f63741j;
                arrayList2.add(bVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = map2.get(entry.getKey());
            eVar2.getClass();
            ea.a.b bVar2 = (ea.a.b) entry.getValue();
            CharSequence charSequence = bVar2.f63568a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) "");
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length(); i14++) {
                if (spannableStringBuilder.charAt(i14) == ' ') {
                    int i15 = i14 + 1;
                    int i16 = i15;
                    while (i16 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i16) == ' ') {
                        i16++;
                    }
                    int i17 = i16 - i15;
                    if (i17 > 0) {
                        spannableStringBuilder.delete(i14, i17 + i14);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i18 = 0; i18 < spannableStringBuilder.length() - 1; i18++) {
                if (spannableStringBuilder.charAt(i18) == '\n') {
                    int i19 = i18 + 1;
                    if (spannableStringBuilder.charAt(i19) == ' ') {
                        spannableStringBuilder.delete(i19, i18 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i24 = 0; i24 < spannableStringBuilder.length() - 1; i24++) {
                if (spannableStringBuilder.charAt(i24) == ' ') {
                    int i25 = i24 + 1;
                    if (spannableStringBuilder.charAt(i25) == '\n') {
                        spannableStringBuilder.delete(i24, i25);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f14 = eVar2.f63734c;
            int i26 = eVar2.f63735d;
            bVar2.f63572e = f14;
            bVar2.f63573f = i26;
            bVar2.f63574g = eVar2.f63736e;
            bVar2.f63575h = eVar2.f63733b;
            bVar2.f63579l = eVar2.f63737f;
            float f15 = eVar2.f63740i;
            int i27 = eVar2.f63739h;
            bVar2.f63578k = f15;
            bVar2.f63577j = i27;
            bVar2.f63583p = eVar2.f63741j;
            arrayList2.add(bVar2.a());
        }
        return arrayList2;
    }

    @Override // yb.i
    public final long getEventTime(int i14) {
        return this.f63762b[i14];
    }

    @Override // yb.i
    public final int getEventTimeCount() {
        return this.f63762b.length;
    }

    @Override // yb.i
    public final int getNextEventTimeIndex(long j8) {
        long[] jArr = this.f63762b;
        int iA = z.a(jArr, j8, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }
}
