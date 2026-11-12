package defpackage;

import com.mi.fitness.netproxy.NetProxyComponentKt;

/* JADX INFO: loaded from: classes4.dex */
public class z6d implements tfi {
    public static final tfi d = d(Integer.MAX_VALUE, true, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40949b;
    public boolean c;

    public z6d(int i, boolean z, boolean z2) {
        this.f40948a = i;
        this.f40949b = z;
        this.c = z2;
    }

    public static tfi d(int i, boolean z, boolean z2) {
        return new z6d(i, z, z2);
    }

    @Override // defpackage.tfi
    public boolean a() {
        return this.c;
    }

    @Override // defpackage.tfi
    public boolean b() {
        return this.f40949b;
    }

    @Override // defpackage.tfi
    public int c() {
        return this.f40948a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z6d)) {
            return false;
        }
        z6d z6dVar = (z6d) obj;
        return this.f40948a == z6dVar.f40948a && this.f40949b == z6dVar.f40949b && this.c == z6dVar.c;
    }

    public int hashCode() {
        return (this.f40948a ^ (this.f40949b ? 4194304 : 0)) ^ (this.c ? NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY : 0);
    }
}
