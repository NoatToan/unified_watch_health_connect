package defpackage;

import com.google.android.exoplayer2.a;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.v;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class j1i extends a {
    public final int f;
    public final int g;
    public final int[] h;
    public final int[] i;
    public final v[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object[] f22327k;
    public final HashMap<Object, Integer> l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1i(Collection<? extends xlf> collection, t tVar) {
        super(false, tVar);
        int iP = 0;
        int size = collection.size();
        this.h = new int[size];
        this.i = new int[size];
        this.j = new v[size];
        this.f22327k = new Object[size];
        this.l = new HashMap<>();
        int i = 0;
        int i2 = 0;
        for (xlf xlfVar : collection) {
            this.j[i2] = xlfVar.a();
            this.i[i2] = iP;
            this.h[i2] = i;
            iP += this.j[i2].p();
            i += this.j[i2].i();
            this.f22327k[i2] = xlfVar.getUid();
            this.l.put(this.f22327k[i2], Integer.valueOf(i2));
            i2++;
        }
        this.f = iP;
        this.g = i;
    }

    @Override // com.google.android.exoplayer2.a
    public int A(int i) {
        return this.i[i];
    }

    @Override // com.google.android.exoplayer2.a
    public v D(int i) {
        return this.j[i];
    }

    public List<v> E() {
        return Arrays.asList(this.j);
    }

    @Override // com.google.android.exoplayer2.v
    public int i() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.v
    public int p() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.a
    public int s(Object obj) {
        Integer num = this.l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.a
    public int t(int i) {
        return wlq.h(this.h, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.a
    public int u(int i) {
        return wlq.h(this.i, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.a
    public Object x(int i) {
        return this.f22327k[i];
    }

    @Override // com.google.android.exoplayer2.a
    public int z(int i) {
        return this.h[i];
    }
}
