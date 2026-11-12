package androidx.emoji2.text;

import a8.j;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.SparseArray;
import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b8.b f7079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f7080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f7081c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Typeface f7082d;

    private h(Typeface typeface, b8.b bVar) {
        int i14;
        int i15;
        int i16;
        int i17;
        this.f7082d = typeface;
        this.f7079a = bVar;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i18 = iA + bVar.f16372a;
            i14 = bVar.f16373b.getInt(bVar.f16373b.getInt(i18) + i18);
        } else {
            i14 = 0;
        }
        this.f7080b = new char[i14 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i19 = iA2 + bVar.f16372a;
            i15 = bVar.f16373b.getInt(bVar.f16373b.getInt(i19) + i19);
        } else {
            i15 = 0;
        }
        for (int i24 = 0; i24 < i15; i24++) {
            j jVar = new j(this, i24);
            b8.a aVarB = jVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? aVarB.f16373b.getInt(iA3 + aVarB.f16372a) : 0, this.f7080b, i24 * 2);
            b8.a aVarB2 = jVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i25 = iA4 + aVarB2.f16372a;
                i16 = aVarB2.f16373b.getInt(aVarB2.f16373b.getInt(i25) + i25);
            } else {
                i16 = 0;
            }
            k7.h.b(i16 > 0, "invalid metadata codepoint length");
            a aVar = this.f7081c;
            b8.a aVarB3 = jVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i26 = iA5 + aVarB3.f16372a;
                i17 = aVarB3.f16373b.getInt(aVarB3.f16373b.getInt(i26) + i26);
            } else {
                i17 = 0;
            }
            aVar.a(jVar, 0, i17 - 1);
        }
    }

    public static h a(Typeface typeface, MappedByteBuffer mappedByteBuffer) {
        try {
            int i14 = h7.j.f82330a;
            Trace.beginSection("EmojiCompat.MetadataRepo.create");
            return new h(typeface, a8.h.a(mappedByteBuffer));
        } finally {
            int i15 = h7.j.f82330a;
            Trace.endSection();
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f7083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f7084b;

        public a(int i14) {
            this.f7083a = new SparseArray<>(i14);
        }

        public final void a(j jVar, int i14, int i15) {
            int iA = jVar.a(i14);
            SparseArray<a> sparseArray = this.f7083a;
            a aVar = sparseArray == null ? null : sparseArray.get(iA);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(jVar.a(i14), aVar);
            }
            if (i15 > i14) {
                aVar.a(jVar, i14 + 1, i15);
            } else {
                aVar.f7084b = jVar;
            }
        }

        private a() {
            this(1);
        }
    }
}
