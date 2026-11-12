package com.google.typography.font.sfntly.table.bitmap;

import defpackage.apr;
import defpackage.jgj;

/* JADX INFO: loaded from: classes5.dex */
public class a extends d {

    /* JADX INFO: renamed from: com.google.typography.font.sfntly.table.bitmap.a$a, reason: collision with other inner class name */
    public static class C0262a extends d.a<a> {
        public C0262a(apr aprVar) {
            super(aprVar);
        }

        @Override // xz9.a
        public void p() {
        }

        @Override // xz9.a
        public int q() {
            return 0;
        }

        @Override // xz9.a
        public boolean r() {
            return false;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            return e().j(aprVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public a o(jgj jgjVar) {
            return new a(jgjVar);
        }
    }

    public enum b {
        metricsLength(8),
        height(0),
        width(1),
        horiBearingX(2),
        horiBearingY(3),
        horiAdvance(4),
        vertBearingX(5),
        vertBearingY(6),
        vertAdvance(7);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9796a;

        b(int i) {
            this.f9796a = i;
        }
    }

    public a(jgj jgjVar) {
        super(jgjVar);
    }
}
