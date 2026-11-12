package defpackage;

import com.google.typography.font.sfntly.data.FontData;

/* JADX INFO: loaded from: classes5.dex */
public final class rj4 extends dzo {

    public static class a extends w63<rj4> {
        public a(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
        }

        public static a y(ylb ylbVar, apr aprVar) {
            return new a(ylbVar, aprVar);
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public rj4 o(jgj jgjVar) {
            return new rj4(u(), jgjVar);
        }
    }

    public rj4(ylb ylbVar, jgj jgjVar) {
        super(ylbVar, jgjVar);
    }

    public int l(int i) {
        return this.f39611a.o(i);
    }

    public int m() {
        return e() / FontData.DataSize.FWORD.size();
    }
}
