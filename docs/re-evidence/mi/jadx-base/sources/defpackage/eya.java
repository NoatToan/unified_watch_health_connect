package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class eya implements x2i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do9 f17188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2i f17189b;

    public eya(do9 do9Var, v2i v2iVar) {
        this.f17188a = do9Var;
        this.f17189b = v2iVar;
    }

    @Override // defpackage.do9
    public int a() {
        return this.f17188a.a() * this.f17189b.b();
    }

    @Override // defpackage.do9
    public BigInteger b() {
        return this.f17188a.b();
    }

    @Override // defpackage.x2i
    public v2i c() {
        return this.f17189b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eya)) {
            return false;
        }
        eya eyaVar = (eya) obj;
        return this.f17188a.equals(eyaVar.f17188a) && this.f17189b.equals(eyaVar.f17189b);
    }

    public int hashCode() {
        return this.f17188a.hashCode() ^ scd.a(this.f17189b.hashCode(), 16);
    }
}
