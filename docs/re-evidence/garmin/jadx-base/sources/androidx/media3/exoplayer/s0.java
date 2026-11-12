package androidx.media3.exoplayer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends androidx.media3.exoplayer.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f9360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f9361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.media3.common.d0[] f9362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object[] f9363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap<Object, Integer> f9364l;

    public class a extends sa.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.d0.c f9365c;

        public a(s0 s0Var, androidx.media3.common.d0 d0Var) {
            super(d0Var);
            this.f9365c = new androidx.media3.common.d0.c();
        }

        @Override // sa.h, androidx.media3.common.d0
        public final androidx.media3.common.d0.b f(int i14, androidx.media3.common.d0.b bVar, boolean z14) {
            androidx.media3.common.d0 d0Var = this.f158114b;
            androidx.media3.common.d0.b bVarF = d0Var.f(i14, bVar, z14);
            if (d0Var.m(bVarF.f8189c, this.f9365c, 0L).a()) {
                bVarF.i(bVar.f8187a, bVar.f8188b, bVar.f8189c, bVar.f8190d, bVar.f8191e, androidx.media3.common.b.f8153g, true);
                return bVarF;
            }
            bVarF.f8192f = true;
            return bVarF;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private s0(androidx.media3.common.d0[] d0VarArr, Object[] objArr, androidx.media3.exoplayer.source.t tVar) {
        super(false, tVar);
        int i14 = 0;
        int length = d0VarArr.length;
        this.f9362j = d0VarArr;
        this.f9360h = new int[length];
        this.f9361i = new int[length];
        this.f9363k = objArr;
        this.f9364l = new HashMap<>();
        int length2 = d0VarArr.length;
        int iO = 0;
        int iH = 0;
        int i15 = 0;
        while (i14 < length2) {
            androidx.media3.common.d0 d0Var = d0VarArr[i14];
            this.f9362j[i15] = d0Var;
            this.f9361i[i15] = iO;
            this.f9360h[i15] = iH;
            iO += d0Var.o();
            iH += this.f9362j[i15].h();
            this.f9364l.put(objArr[i15], Integer.valueOf(i15));
            i14++;
            i15++;
        }
        this.f9358f = iO;
        this.f9359g = iH;
    }

    @Override // androidx.media3.common.d0
    public final int h() {
        return this.f9359g;
    }

    @Override // androidx.media3.common.d0
    public final int o() {
        return this.f9358f;
    }

    @Override // androidx.media3.exoplayer.a
    public final int q(Object obj) {
        Integer num = this.f9364l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.a
    public final int r(int i14) {
        return fa.z.d(this.f9360h, i14 + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.a
    public final int s(int i14) {
        return fa.z.d(this.f9361i, i14 + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.a
    public final Object t(int i14) {
        return this.f9363k[i14];
    }

    @Override // androidx.media3.exoplayer.a
    public final int u(int i14) {
        return this.f9360h[i14];
    }

    @Override // androidx.media3.exoplayer.a
    public final int v(int i14) {
        return this.f9361i[i14];
    }

    @Override // androidx.media3.exoplayer.a
    public final androidx.media3.common.d0 x(int i14) {
        return this.f9362j[i14];
    }

    public final s0 y(androidx.media3.exoplayer.source.t tVar) {
        androidx.media3.common.d0[] d0VarArr = this.f9362j;
        androidx.media3.common.d0[] d0VarArr2 = new androidx.media3.common.d0[d0VarArr.length];
        for (int i14 = 0; i14 < d0VarArr.length; i14++) {
            d0VarArr2[i14] = new a(this, d0VarArr[i14]);
        }
        return new s0(d0VarArr2, this.f9363k, tVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s0(Collection<? extends i0> collection, androidx.media3.exoplayer.source.t tVar) {
        androidx.media3.common.d0[] d0VarArr = new androidx.media3.common.d0[collection.size()];
        Iterator<? extends i0> it = collection.iterator();
        int i14 = 0;
        int i15 = 0;
        while (it.hasNext()) {
            d0VarArr[i15] = it.next().getTimeline();
            i15++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends i0> it3 = collection.iterator();
        while (it3.hasNext()) {
            objArr[i14] = it3.next().getUid();
            i14++;
        }
        this(d0VarArr, objArr, tVar);
    }
}
