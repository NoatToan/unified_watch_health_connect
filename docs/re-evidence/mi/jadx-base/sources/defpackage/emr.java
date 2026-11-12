package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.data.FontData;
import com.google.typography.font.sfntly.table.core.FontHeaderTable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes5.dex */
public class emr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16822b = (FontData.DataSize.ULONG.size() * 9) + (FontData.DataSize.USHORT.size() * 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16823a = false;

    public static class b {
        public static final int e = FontData.DataSize.ULONG.size() * 5;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f16824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16825b;
        public long c;
        public byte[] d;

        public b() {
        }

        public int a() {
            return this.d.length;
        }

        public long b() {
            return this.f16825b;
        }

        public void c(byte[] bArr) {
            this.d = bArr;
        }

        public void d(long j) {
            this.c = j;
        }

        public void e(int i) {
            this.f16825b = i;
        }

        public void f(int i) {
            this.f16824a = i;
        }

        public int g(apr aprVar, int i, int i2) {
            int iO = i2 + aprVar.O(i2, this.f16824a);
            int iO2 = iO + aprVar.O(iO, i);
            int iO3 = iO2 + aprVar.O(iO2, this.d.length);
            aprVar.O(iO3 + aprVar.O(iO3, this.f16825b), this.c);
            return e;
        }

        public int h(apr aprVar, int i) {
            byte[] bArr = this.d;
            aprVar.I(i, bArr, 0, bArr.length);
            return a();
        }
    }

    public final int a(int i) {
        return (i + 3) & (-4);
    }

    public final int b(List<b> list) {
        return b.e * list.size();
    }

    public final int c(List<b> list) {
        FontData.DataSize dataSize = FontData.DataSize.ULONG;
        return dataSize.size() + (FontData.DataSize.USHORT.size() * 4) + (dataSize.size() * 4 * list.size());
    }

    public final int d(List<b> list) {
        Iterator<b> it = list.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA = a(iA + it.next().a());
        }
        return iA;
    }

    public final int e(List<b> list) {
        Iterator<b> it = list.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA = a((int) (((long) iA) + it.next().b()));
        }
        return iA;
    }

    public apr f(Font font) {
        List<b> listG = g(font);
        int iB = f16822b + b(listG) + d(listG);
        apr aprVarC = apr.C(iB);
        int iM = m(aprVarC, 0, listG, font.o(), iB, h(font), i(font));
        l(aprVarC, iM + k(aprVarC, iM, listG), listG);
        return aprVarC;
    }

    public final List<b> g(Font font) {
        ArrayList arrayList = new ArrayList();
        TreeSet treeSet = new TreeSet(font.p().keySet());
        treeSet.remove(Integer.valueOf(tzo.y));
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            dzo dzoVarH = font.h(iIntValue);
            b bVar = new b();
            bVar.f(iIntValue);
            bVar.e(dzoVarH.e());
            bVar.d(dzoVarH.i());
            j(bVar, dzoVarH);
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final int h(Font font) {
        return (((FontHeaderTable) font.h(tzo.c)).o() >> 16) & 65535;
    }

    public final int i(Font font) {
        return ((FontHeaderTable) font.h(tzo.c)).o() & 65535;
    }

    public final void j(b bVar, dzo dzoVar) {
        int iE = dzoVar.e();
        byte[] bArrCopyOfRange = new byte[iE];
        dzoVar.f().n(0, bArrCopyOfRange, 0, iE);
        if (this.f16823a && (iE < 100 || dzoVar.k() == tzo.m)) {
            bVar.c(bArrCopyOfRange);
            return;
        }
        byte[] bArr = new byte[iE];
        Deflater deflater = new Deflater();
        deflater.setInput(bArrCopyOfRange);
        deflater.finish();
        int iDeflate = deflater.deflate(bArr);
        if (iDeflate != iE && deflater.finished()) {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, iDeflate);
        }
        bVar.c(bArrCopyOfRange);
    }

    public final int k(apr aprVar, int i, List<b> list) {
        int iA = a(b(list) + i);
        for (b bVar : list) {
            i += bVar.g(aprVar, iA, i);
            iA = a(iA + bVar.a());
        }
        return b(list);
    }

    public final int l(apr aprVar, int i, List<b> list) {
        int iA = a(i);
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            iA = a(iA + it.next().h(aprVar, iA));
        }
        return iA - i;
    }

    public final int m(apr aprVar, int i, List<b> list, int i2, int i3, int i4, int i5) {
        int iO = i + aprVar.O(i, 2001684038L);
        int iO2 = iO + aprVar.O(iO, i2);
        int iO3 = iO2 + aprVar.O(iO2, i3);
        int iQ = iO3 + aprVar.Q(iO3, list.size());
        int iQ2 = iQ + aprVar.Q(iQ, 0);
        int iO4 = iQ2 + aprVar.O(iQ2, e(list) + c(list));
        int iQ3 = iO4 + aprVar.Q(iO4, 1);
        int iQ4 = iQ3 + aprVar.Q(iQ3, 1);
        int iO5 = iQ4 + aprVar.O(iQ4, 0L);
        int iO6 = iO5 + aprVar.O(iO5, 0L);
        int iO7 = iO6 + aprVar.O(iO6, 0L);
        aprVar.O(iO7 + aprVar.O(iO7, 0L), 0L);
        return f16822b;
    }
}
