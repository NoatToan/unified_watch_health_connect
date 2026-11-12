package yj1;

import m20.p0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyj1/i;", "", "Lm20/p0;", "primaryNumber", "secondaryNumber", "<init>", "(Lm20/p0;Lm20/p0;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p0 f197552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p0 f197553b;

    public /* synthetic */ i(p0 p0Var, p0 p0Var2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new p0(null, null, null, null, null, null, null, 127, null) : p0Var, (i14 & 2) != 0 ? new p0(null, null, null, null, null, null, null, 127, null) : p0Var2);
    }

    public static i a(i iVar, p0 p0Var, p0 p0Var2, int i14) {
        if ((i14 & 1) != 0) {
            p0Var = iVar.f197552a;
        }
        if ((i14 & 2) != 0) {
            p0Var2 = iVar.f197553b;
        }
        iVar.getClass();
        p0Var.getClass();
        p0Var2.getClass();
        return new i(p0Var, p0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f197552a, iVar.f197552a) && s.g(this.f197553b, iVar.f197553b);
    }

    public final int hashCode() {
        return this.f197553b.hashCode() + (this.f197552a.hashCode() * 31);
    }

    public final String toString() {
        return "MyInfoPhoneNumberValidation(primaryNumber=" + this.f197552a + ", secondaryNumber=" + this.f197553b + ")";
    }

    public i(p0 p0Var, p0 p0Var2) {
        p0Var.getClass();
        p0Var2.getClass();
        this.f197552a = p0Var;
        this.f197553b = p0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
