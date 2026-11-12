package com.google.typography.font.sfntly.table.bitmap;

import com.google.typography.font.sfntly.data.FontData;
import defpackage.apr;
import defpackage.jgj;
import defpackage.ono;
import defpackage.rp2;
import defpackage.ylb;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public final class EbdtTable extends ono {

    public enum Offset {
        version(0),
        headerLength(FontData.DataSize.Fixed.size());

        protected final int offset;

        Offset(int i) {
            this.offset = i;
        }
    }

    public static class a extends ono.a<EbdtTable> {
        public final int g;
        public List<Map<Integer, Object>> h;
        public List<Map<Integer, rp2<Object>>> i;

        public a(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
            this.g = 131072;
        }

        public static a w(ylb ylbVar, apr aprVar) {
            return new a(ylbVar, aprVar);
        }

        @Override // xz9.a
        public void p() {
            x();
        }

        @Override // xz9.a
        public int q() {
            List<Map<Integer, rp2<Object>>> list = this.i;
            if (list == null || list.size() == 0) {
                return 0;
            }
            int iAbs = Offset.headerLength.offset;
            boolean z = true;
            for (Map<Integer, rp2<Object>> map : this.i) {
                new TreeMap();
                Iterator<Map.Entry<Integer, rp2<Object>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    int iQ = it.next().getValue().q();
                    iAbs += Math.abs(iQ);
                    if (iQ <= 0) {
                        z = false;
                    }
                }
            }
            return (z ? 1 : -1) * iAbs;
        }

        @Override // xz9.a
        public boolean r() {
            return this.i != null;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            int iJ = aprVar.J(Offset.version.offset, 131072);
            for (Map<Integer, rp2<Object>> map : this.i) {
                new TreeMap();
                Iterator<Map.Entry<Integer, rp2<Object>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    iJ += it.next().getValue().s(aprVar.z(iJ));
                }
            }
            return iJ;
        }

        public void x() {
            this.h = null;
            this.i = null;
            n(false);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public EbdtTable o(jgj jgjVar) {
            return new EbdtTable(u(), jgjVar);
        }
    }

    public EbdtTable(ylb ylbVar, jgj jgjVar) {
        super(ylbVar, jgjVar);
    }
}
