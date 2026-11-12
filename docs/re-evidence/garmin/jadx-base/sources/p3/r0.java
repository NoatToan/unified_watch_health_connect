package p3;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp3/r0;", "", "", "Ls3/e;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<s3.e> f135253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f135254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f135255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f135256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.i0<r3.b> f135257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f135258f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e23.a<q3.b<Object, s3.e>> {
        public a() {
        }

        @Override // e23.a
        public final q3.b<Object, s3.e> invoke() {
            r0 r0Var = r0.this;
            p1.t0 t0Var = new p1.t0(r0Var.f135253a.size());
            List<s3.e> list = r0Var.f135253a;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                s3.e eVar = list.get(i14);
                Object obj = eVar.f156328b;
                int i15 = eVar.f156327a;
                q3.b.a(t0Var, obj != null ? new y0(Integer.valueOf(i15), eVar.f156328b) : Integer.valueOf(i15), eVar);
            }
            return q3.b.b(t0Var);
        }
    }

    public r0(List<s3.e> list, int i14) {
        this.f135253a = list;
        this.f135254b = i14;
        if (i14 < 0) {
            j2.a("Invalid start index");
        }
        this.f135256d = new ArrayList();
        p1.i0<r3.b> i0Var = new p1.i0<>(0, 1, null);
        int size = list.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            s3.e eVar = this.f135253a.get(i16);
            int i17 = eVar.f156329c;
            int i18 = eVar.f156330d;
            i0Var.i(i17, new r3.b(i16, i15, i18));
            i15 += i18;
        }
        this.f135257e = i0Var;
        this.f135258f = o13.m.b(new a());
    }

    public final boolean a(int i14, int i15) {
        int i16;
        p1.i0<r3.b> i0Var = this.f135257e;
        r3.b bVarB = i0Var.b(i14);
        if (bVarB == null) {
            return false;
        }
        int i17 = bVarB.f149970b;
        int i18 = i15 - bVarB.f149971c;
        bVarB.f149971c = i15;
        if (i18 == 0) {
            return true;
        }
        Object[] objArr = i0Var.f134774c;
        long[] jArr = i0Var.f134772a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i19 = 0;
        while (true) {
            long j8 = jArr[i19];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i24 = 8 - ((~(i19 - length)) >>> 31);
                for (int i25 = 0; i25 < i24; i25++) {
                    if ((255 & j8) < 128) {
                        r3.b bVar = (r3.b) objArr[(i19 << 3) + i25];
                        if (bVar.f149970b >= i17 && !bVar.equals(bVarB) && (i16 = bVar.f149970b + i18) >= 0) {
                            bVar.f149970b = i16;
                        }
                    }
                    j8 >>= 8;
                }
                if (i24 != 8) {
                    return true;
                }
            }
            if (i19 == length) {
                return true;
            }
            i19++;
        }
    }
}
