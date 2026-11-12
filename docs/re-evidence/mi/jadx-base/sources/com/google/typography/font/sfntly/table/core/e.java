package com.google.typography.font.sfntly.table.core;

import defpackage.jgj;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends CMap {

    public static class a extends CMap.b<e> {
        public a(jgj jgjVar, int i, j.d dVar) {
            super(jgjVar == null ? null : jgjVar.A(i, jgjVar.u(j.f.format14Length.f9849a + i)), CMap.CMapFormat.Format14, dVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public e o(jgj jgjVar) {
            return new e(jgjVar, u());
        }
    }

    public e(jgj jgjVar, j.d dVar) {
        super(jgjVar, CMap.CMapFormat.Format14.value, dVar);
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override // com.google.typography.font.sfntly.table.core.CMap
    public int m(int i) {
        return 0;
    }
}
