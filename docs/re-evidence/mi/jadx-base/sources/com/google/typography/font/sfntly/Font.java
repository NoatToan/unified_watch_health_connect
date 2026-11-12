package com.google.typography.font.sfntly;

import com.google.typography.font.sfntly.table.core.FontHeaderTable;
import defpackage.a0a;
import defpackage.apr;
import defpackage.dzo;
import defpackage.jgj;
import defpackage.lac;
import defpackage.mac;
import defpackage.nac;
import defpackage.q9f;
import defpackage.rw9;
import defpackage.tie;
import defpackage.tzo;
import defpackage.ylb;
import defpackage.yz9;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public class Font {
    public static final Logger e = Logger.getLogger(Font.class.getCanonicalName());
    public static final List<Integer> f;
    public static final List<Integer> g;
    public static final int h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9782b;
    public long c;
    public Map<Integer, ? extends dzo> d;

    public enum MacintoshEncodingId {
        Unknown(-1),
        Roman(0),
        Japanese(1),
        ChineseTraditional(2),
        Korean(3),
        Arabic(4),
        Hebrew(5),
        Greek(6),
        Russian(7),
        RSymbol(8),
        Devanagari(9),
        Gurmukhi(10),
        Gujarati(11),
        Oriya(12),
        Bengali(13),
        Tamil(14),
        Telugu(15),
        Kannada(16),
        Malayalam(17),
        Sinhalese(18),
        Burmese(19),
        Khmer(20),
        Thai(21),
        Laotian(22),
        Georgian(23),
        Armenian(24),
        ChineseSimplified(25),
        Tibetan(26),
        Mongolian(27),
        Geez(28),
        Slavic(29),
        Vietnamese(30),
        Sindhi(31),
        Uninterpreted(32);

        private final int value;

        MacintoshEncodingId(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static MacintoshEncodingId valueOf(int i) {
            for (MacintoshEncodingId macintoshEncodingId : values()) {
                if (macintoshEncodingId.equals(i)) {
                    return macintoshEncodingId;
                }
            }
            return Unknown;
        }
    }

    public enum PlatformId {
        Unknown(-1),
        Unicode(0),
        Macintosh(1),
        ISO(2),
        Windows(3),
        Custom(4);

        private final int value;

        PlatformId(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static PlatformId valueOf(int i) {
            for (PlatformId platformId : values()) {
                if (platformId.equals(i)) {
                    return platformId;
                }
            }
            return Unknown;
        }
    }

    public enum UnicodeEncodingId {
        Unknown(-1),
        Unicode1_0(0),
        Unicode1_1(1),
        ISO10646(2),
        Unicode2_0_BMP(3),
        Unicode2_0(4),
        UnicodeVariationSequences(5);

        private final int value;

        UnicodeEncodingId(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static UnicodeEncodingId valueOf(int i) {
            for (UnicodeEncodingId unicodeEncodingId : values()) {
                if (unicodeEncodingId.equals(i)) {
                    return unicodeEncodingId;
                }
            }
            return Unknown;
        }
    }

    public enum WindowsEncodingId {
        Unknown(-1),
        Symbol(0),
        UnicodeUCS2(1),
        ShiftJIS(2),
        PRC(3),
        Big5(4),
        Wansung(5),
        Johab(6),
        UnicodeUCS4(10);

        private final int value;

        WindowsEncodingId(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static WindowsEncodingId valueOf(int i) {
            for (WindowsEncodingId windowsEncodingId : values()) {
                if (windowsEncodingId.equals(i)) {
                    return windowsEncodingId;
                }
            }
            return Unknown;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.google.typography.font.sfntly.a f9784b;
        public int d;
        public int e;
        public int f;
        public int g;
        public Map<ylb, apr> h;
        public byte[] i;
        public int c = Font.h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<Integer, dzo.a<? extends dzo>> f9783a = new HashMap();

        public b(com.google.typography.font.sfntly.a aVar) {
            this.f9784b = aVar;
        }

        public static Map<Integer, dzo> c(Font font, Map<Integer, dzo.a<? extends dzo>> map) {
            dzo dzoVarA;
            TreeMap treeMap = new TreeMap();
            h(map);
            long jI = 0;
            boolean zB = false;
            FontHeaderTable fontHeaderTableW = null;
            FontHeaderTable.b bVar = null;
            for (dzo.a<? extends dzo> aVar : map.values()) {
                if (tzo.d(aVar.u().f())) {
                    bVar = (FontHeaderTable.b) aVar;
                } else {
                    if (aVar.l()) {
                        zB |= aVar.b();
                        dzoVarA = aVar.a();
                    } else {
                        dzoVarA = null;
                    }
                    if (dzoVarA == null) {
                        throw new RuntimeException("Unable to build table - " + aVar);
                    }
                    jI += dzoVarA.i();
                    treeMap.put(Integer.valueOf(dzoVarA.j().f()), dzoVarA);
                }
            }
            if (bVar != null) {
                if (zB) {
                    bVar.B(jI);
                }
                if (bVar.l()) {
                    bVar.b();
                    fontHeaderTableW = bVar.a();
                }
                if (fontHeaderTableW == null) {
                    throw new RuntimeException("Unable to build table - " + bVar);
                }
                jI += fontHeaderTableW.i();
                treeMap.put(Integer.valueOf(fontHeaderTableW.j().f()), fontHeaderTableW);
            }
            font.c = jI & 4294967295L;
            return treeMap;
        }

        public static final b d(com.google.typography.font.sfntly.a aVar) {
            return new b(aVar);
        }

        public static final b e(com.google.typography.font.sfntly.a aVar, apr aprVar, int i) throws IOException {
            b bVar = new b(aVar);
            bVar.i(aprVar, i);
            return bVar;
        }

        public static void h(Map<Integer, dzo.a<? extends dzo>> map) {
            FontHeaderTable.b bVar = (FontHeaderTable.b) map.get(Integer.valueOf(tzo.c));
            mac.b bVar2 = (mac.b) map.get(Integer.valueOf(tzo.d));
            q9f.b bVar3 = (q9f.b) map.get(Integer.valueOf(tzo.f));
            tie.b bVar4 = (tie.b) map.get(Integer.valueOf(tzo.m));
            nac.b bVar5 = (nac.b) map.get(Integer.valueOf(tzo.e));
            lac.b bVar6 = (lac.b) map.get(Integer.valueOf(tzo.A));
            if (bVar5 != null) {
                if (bVar3 != null) {
                    bVar5.z(bVar3.z());
                }
                if (bVar2 != null) {
                    bVar5.A(bVar2.z());
                }
            }
            if (bVar4 != null) {
                if (bVar3 != null) {
                    bVar4.D(bVar3.z());
                }
                if (bVar != null) {
                    bVar4.B(bVar.z());
                }
            }
            if (bVar6 == null || bVar3 == null) {
                return;
            }
            bVar6.z(bVar3.z());
        }

        public Font a() {
            Font font = new Font(this.c, this.i);
            font.d = this.f9783a.size() > 0 ? c(font, this.f9783a) : null;
            this.f9783a = null;
            this.h = null;
            return font;
        }

        public final Map<Integer, dzo.a<? extends dzo>> b(Map<ylb, apr> map) {
            HashMap map2 = new HashMap();
            for (ylb ylbVar : map.keySet()) {
                map2.put(Integer.valueOf(ylbVar.f()), g(ylbVar, map.get(ylbVar)));
            }
            h(map2);
            return map2;
        }

        public dzo.a<? extends dzo> f(int i) {
            return this.f9783a.get(Integer.valueOf(i));
        }

        public final dzo.a<? extends dzo> g(ylb ylbVar, apr aprVar) {
            return dzo.a.t(ylbVar, aprVar);
        }

        public final void i(apr aprVar, int i) throws IOException {
            if (aprVar == null) {
                throw new IOException("No data for font.");
            }
            Map<ylb, apr> mapJ = j(m(aprVar, i), aprVar);
            this.h = mapJ;
            this.f9783a = b(mapJ);
        }

        public final Map<ylb, apr> j(SortedSet<ylb> sortedSet, apr aprVar) {
            HashMap map = new HashMap(sortedSet.size());
            Font.e.fine("########  Reading Table Data");
            for (ylb ylbVar : sortedSet) {
                map.put(ylbVar, aprVar.A(ylbVar.e(), ylbVar.d()));
            }
            return map;
        }

        public dzo.a<? extends dzo> k(int i) {
            ylb ylbVar = new ylb(i);
            dzo.a<? extends dzo> aVarT = dzo.a.t(ylbVar, null);
            this.f9783a.put(Integer.valueOf(ylbVar.f()), aVarT);
            return aVarT;
        }

        public dzo.a<? extends dzo> l(int i, jgj jgjVar) {
            apr aprVarC = apr.C(jgjVar.e());
            jgjVar.j(aprVarC);
            dzo.a<? extends dzo> aVarT = dzo.a.t(new ylb(i, aprVarC.e()), aprVarC);
            this.f9783a.put(Integer.valueOf(i), aVarT);
            return aVarT;
        }

        public final SortedSet<ylb> m(jgj jgjVar, int i) {
            TreeSet treeSet = new TreeSet(ylb.h);
            this.c = jgjVar.p(c.sfntVersion.f9787a + i);
            this.d = jgjVar.v(c.numTables.f9787a + i);
            this.e = jgjVar.v(c.searchRange.f9787a + i);
            this.f = jgjVar.v(c.entrySelector.f9787a + i);
            this.g = jgjVar.v(c.rangeShift.f9787a + i);
            int i2 = i + c.tableRecordBegin.f9787a;
            int i3 = 0;
            while (i3 < this.d) {
                treeSet.add(new ylb(jgjVar.u(c.tableTag.f9787a + i2), jgjVar.t(c.tableCheckSum.f9787a + i2), jgjVar.u(c.tableOffset.f9787a + i2), jgjVar.u(c.tableLength.f9787a + i2)));
                i3++;
                i2 += c.tableRecordSize.f9787a;
            }
            return treeSet;
        }
    }

    public enum c {
        sfntVersion(0),
        numTables(4),
        searchRange(6),
        entrySelector(8),
        rangeShift(10),
        tableRecordBegin(12),
        sfntHeaderSize(12),
        tableTag(0),
        tableCheckSum(4),
        tableOffset(8),
        tableLength(12),
        tableRecordSize(16);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9787a;

        c(int i) {
            this.f9787a = i;
        }
    }

    static {
        int i = tzo.c;
        Integer numValueOf = Integer.valueOf(i);
        int i2 = tzo.d;
        Integer numValueOf2 = Integer.valueOf(i2);
        int i3 = tzo.f;
        Integer numValueOf3 = Integer.valueOf(i3);
        int i4 = tzo.h;
        Integer numValueOf4 = Integer.valueOf(i4);
        int i5 = tzo.g;
        Integer numValueOf5 = Integer.valueOf(i5);
        int i6 = tzo.f35226b;
        Integer numValueOf6 = Integer.valueOf(i6);
        int i7 = tzo.i;
        Integer[] numArr = {numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, Integer.valueOf(i7), Integer.valueOf(tzo.o)};
        ArrayList arrayList = new ArrayList(8);
        Collections.addAll(arrayList, numArr);
        f = Collections.unmodifiableList(arrayList);
        Integer[] numArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(tzo.e), Integer.valueOf(tzo.C), Integer.valueOf(tzo.E), Integer.valueOf(tzo.A), Integer.valueOf(i6), Integer.valueOf(tzo.f35227k), Integer.valueOf(tzo.n), Integer.valueOf(tzo.j), Integer.valueOf(tzo.m), Integer.valueOf(tzo.l), Integer.valueOf(tzo.B), Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(tzo.z), Integer.valueOf(tzo.D), Integer.valueOf(tzo.y)};
        ArrayList arrayList2 = new ArrayList(20);
        Collections.addAll(arrayList2, numArr2);
        g = Collections.unmodifiableList(arrayList2);
        h = rw9.a(1, 0);
    }

    public final List<ylb> d(List<Integer> list) {
        List<Integer> listG = g(list);
        ArrayList arrayList = new ArrayList(k());
        int iK = c.tableRecordBegin.f9787a + (k() * c.tableRecordSize.f9787a);
        for (Integer num : listG) {
            dzo dzoVar = this.d.get(num);
            if (dzoVar != null) {
                arrayList.add(new ylb(num.intValue(), dzoVar.i(), iK, dzoVar.j().d()));
                iK += (dzoVar.e() + 3) & (-4);
            }
        }
        return arrayList;
    }

    public final List<Integer> e() {
        return i(tzo.o) ? f : g;
    }

    public byte[] f() {
        byte[] bArr = this.f9782b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final List<Integer> g(List<Integer> list) {
        ArrayList arrayList = new ArrayList(this.d.size());
        if (list == null) {
            list = e();
        }
        TreeSet treeSet = new TreeSet(this.d.keySet());
        for (Integer num : list) {
            if (i(num.intValue())) {
                arrayList.add(num);
                treeSet.remove(num);
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arrayList.add((Integer) it.next());
        }
        return arrayList;
    }

    public <T extends dzo> T h(int i) {
        return (T) this.d.get(Integer.valueOf(i));
    }

    public boolean i(int i) {
        return this.d.containsKey(Integer.valueOf(i));
    }

    public Iterator<? extends dzo> j() {
        return this.d.values().iterator();
    }

    public int k() {
        return this.d.size();
    }

    public void l(OutputStream outputStream, List<Integer> list) throws IOException {
        List<ylb> listD = d(g(list));
        a0a a0aVar = new a0a(outputStream);
        m(a0aVar, listD);
        n(a0aVar, listD);
    }

    public final void m(a0a a0aVar, List<ylb> list) throws IOException {
        a0aVar.a(this.f9781a);
        a0aVar.c(list.size());
        int iA = yz9.a(list.size());
        int i = 2 << (iA + 3);
        a0aVar.c(i);
        a0aVar.c(iA);
        a0aVar.c((list.size() * 16) - i);
        ArrayList<ylb> arrayList = new ArrayList(list);
        Collections.sort(arrayList, ylb.i);
        for (ylb ylbVar : arrayList) {
            a0aVar.b(ylbVar.f());
            a0aVar.b(ylbVar.c());
            a0aVar.b(ylbVar.e());
            a0aVar.b(ylbVar.d());
        }
    }

    public final void n(a0a a0aVar, List<ylb> list) throws IOException {
        Iterator<ylb> it = list.iterator();
        while (it.hasNext()) {
            dzo dzoVarH = h(it.next().f());
            if (dzoVarH == null) {
                throw new IOException("Table out of sync with font header.");
            }
            int iG = dzoVarH.g(a0aVar);
            int i = ((iG + 3) & (-4)) - iG;
            for (int i2 = 0; i2 < i; i2++) {
                a0aVar.write(0);
            }
        }
    }

    public int o() {
        return this.f9781a;
    }

    public Map<Integer, ? extends dzo> p() {
        return Collections.unmodifiableMap(this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("digest = ");
        byte[] bArrF = f();
        if (bArrF != null) {
            for (byte b2 : bArrF) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
        }
        sb.append("\n[");
        sb.append(rw9.d(this.f9781a));
        sb.append(", ");
        sb.append(k());
        sb.append("]\n");
        Iterator<? extends dzo> itJ = j();
        while (itJ.hasNext()) {
            dzo next = itJ.next();
            sb.append("\t");
            sb.append(next);
            sb.append("\n");
        }
        return sb.toString();
    }

    public Font(int i, byte[] bArr) {
        this.f9781a = i;
        this.f9782b = bArr;
    }
}
