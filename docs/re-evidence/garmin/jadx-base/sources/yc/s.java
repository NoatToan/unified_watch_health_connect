package yc;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/s;", "", "Lyc/z0;", "refresh", "prepend", "append", "Lyc/b1;", "source", "mediator", "<init>", "(Lyc/z0;Lyc/z0;Lyc/z0;Lyc/b1;Lyc/b1;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f196385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f196386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f196387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1 f196388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1 f196389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f196390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f196391g;

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public s(z0 z0Var, z0 z0Var2, z0 z0Var3, b1 b1Var, b1 b1Var2) {
        boolean z14;
        boolean z15;
        z0Var.getClass();
        z0Var2.getClass();
        z0Var3.getClass();
        b1Var.getClass();
        this.f196385a = z0Var;
        this.f196386b = z0Var2;
        this.f196387c = z0Var3;
        this.f196388d = b1Var;
        this.f196389e = b1Var2;
        if (b1Var.f195773e) {
            if (b1Var2 != null ? b1Var2.f195773e : true) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        this.f196390f = z14;
        if (!b1Var.f195772d) {
            z15 = b1Var2 != null ? b1Var2.f195772d : false;
        }
        this.f196391g = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f196385a, sVar.f196385a) && p005kotlin.jvm.internal.s.g(this.f196386b, sVar.f196386b) && p005kotlin.jvm.internal.s.g(this.f196387c, sVar.f196387c) && p005kotlin.jvm.internal.s.g(this.f196388d, sVar.f196388d) && p005kotlin.jvm.internal.s.g(this.f196389e, sVar.f196389e);
    }

    public final int hashCode() {
        int iHashCode = (this.f196388d.hashCode() + ((this.f196387c.hashCode() + ((this.f196386b.hashCode() + (this.f196385a.hashCode() * 31)) * 31)) * 31)) * 31;
        b1 b1Var = this.f196389e;
        return iHashCode + (b1Var != null ? b1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f196385a + ", prepend=" + this.f196386b + ", append=" + this.f196387c + ", source=" + this.f196388d + ", mediator=" + this.f196389e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ s(z0 z0Var, z0 z0Var2, z0 z0Var3, b1 b1Var, b1 b1Var2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z0Var, z0Var2, z0Var3, b1Var, (i14 & 16) != 0 ? null : b1Var2);
    }
}
