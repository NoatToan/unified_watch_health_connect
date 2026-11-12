package o13;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.g3;
import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo13/u;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f128605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f128606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f128607c;

    public u(A a14, B b14, C c14) {
        this.f128605a = a14;
        this.f128606b = b14;
        this.f128607c = c14;
    }

    public static u d(u uVar, g3 g3Var, g3 g3Var2, g3 g3Var3, int i14) {
        if ((i14 & 1) != 0) {
            g3Var = uVar.f128605a;
        }
        if ((i14 & 2) != 0) {
            g3Var2 = uVar.f128606b;
        }
        if ((i14 & 4) != 0) {
            g3Var3 = uVar.f128607c;
        }
        return new u(g3Var, g3Var2, g3Var3);
    }

    public final A a() {
        return this.f128605a;
    }

    public final B b() {
        return this.f128606b;
    }

    public final C c() {
        return this.f128607c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f128605a, uVar.f128605a) && p005kotlin.jvm.internal.s.g(this.f128606b, uVar.f128606b) && p005kotlin.jvm.internal.s.g(this.f128607c, uVar.f128607c);
    }

    public final int hashCode() {
        A a14 = this.f128605a;
        int iHashCode = (a14 == null ? 0 : a14.hashCode()) * 31;
        B b14 = this.f128606b;
        int iHashCode2 = (iHashCode + (b14 == null ? 0 : b14.hashCode())) * 31;
        C c14 = this.f128607c;
        return iHashCode2 + (c14 != null ? c14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(this.f128605a);
        sb3.append(", ");
        sb3.append(this.f128606b);
        sb3.append(", ");
        return wr.g.p(sb3, this.f128607c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
