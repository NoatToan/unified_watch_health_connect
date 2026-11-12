package com.google.typography.font.sfntly.table.core;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.jgj;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends CMap {

    public static class a extends CMap.b<f> {
        public a(jgj jgjVar, int i, j.d dVar) {
            super(jgjVar == null ? null : jgjVar.A(i, jgjVar.v(j.f.format2Length.f9849a + i)), CMap.CMapFormat.Format2, dVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public f o(jgj jgjVar) {
            return new f(jgjVar, u());
        }
    }

    public f(jgj jgjVar, j.d dVar) {
        super(jgjVar, CMap.CMapFormat.Format2.value, dVar);
    }

    private int r(int i) {
        return this.f39611a.r(u(i) + j.f.format2SubHeaderKeys.f9849a + j.f.format2SubHeader_idDelta.f9849a);
    }

    private int t(int i) {
        return this.f39611a.v(u(i) + j.f.format2SubHeaderKeys.f9849a + j.f.format2SubHeader_idRangeOffset.f9849a);
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new CMap.c(0, 65535);
    }

    @Override // com.google.typography.font.sfntly.table.core.CMap
    public int m(int i) {
        if (i > 65535) {
            return 0;
        }
        int i2 = (i >> 8) & 255;
        int i3 = i & 255;
        int iU = u(i2);
        if (iU == 0) {
            i3 = i2;
            i2 = 0;
        }
        int iQ = q(i2);
        int iO = o(i2);
        if (i3 < iQ || i3 >= iO + iQ) {
            return 0;
        }
        int iV = this.f39611a.v(j.f.format2SubHeader_idRangeOffset.f9849a + iU + t(i2) + ((i3 - iQ) * FontData.DataSize.USHORT.size()));
        if (iV == 0) {
            return 0;
        }
        return iU == 0 ? iV : (iV + r(i2)) % 65536;
    }

    public final int o(int i) {
        return this.f39611a.v(u(i) + j.f.format2SubHeaderKeys.f9849a + j.f.format2SubHeader_entryCount.f9849a);
    }

    public final int q(int i) {
        return this.f39611a.v(u(i) + j.f.format2SubHeaderKeys.f9849a + j.f.format2SubHeader_firstCode.f9849a);
    }

    public final int u(int i) {
        return this.f39611a.v(j.f.format2SubHeaderKeys.f9849a + (i * FontData.DataSize.USHORT.size()));
    }
}
