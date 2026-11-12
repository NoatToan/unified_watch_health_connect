package o53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo53/u;", "R", "", "result", "Lo53/i;", "cancelHandler", "Lkotlin/Function3;", "", "Lt13/g;", "", "onCancellation", "idempotentResume", "cancelCause", "<init>", "(Ljava/lang/Object;Lo53/i;Le23/q;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class u<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R f129410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f129411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.q<Throwable, R, t13.g, Unit> f129412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f129413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f129414e;

    public /* synthetic */ u(Object obj, i iVar, e23.q qVar, Object obj2, Throwable th3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(obj, (i14 & 2) != 0 ? null : iVar, (i14 & 4) != 0 ? null : qVar, (i14 & 8) != 0 ? null : obj2, (i14 & 16) != 0 ? null : th3);
    }

    public static u a(u uVar, i iVar, Throwable th3, int i14) {
        R r14 = uVar.f129410a;
        if ((i14 & 2) != 0) {
            iVar = uVar.f129411b;
        }
        i iVar2 = iVar;
        e23.q<Throwable, R, t13.g, Unit> qVar = uVar.f129412c;
        Object obj = uVar.f129413d;
        if ((i14 & 16) != 0) {
            th3 = uVar.f129414e;
        }
        return new u(r14, iVar2, qVar, obj, th3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f129410a, uVar.f129410a) && p005kotlin.jvm.internal.s.g(this.f129411b, uVar.f129411b) && p005kotlin.jvm.internal.s.g(this.f129412c, uVar.f129412c) && p005kotlin.jvm.internal.s.g(this.f129413d, uVar.f129413d) && p005kotlin.jvm.internal.s.g(this.f129414e, uVar.f129414e);
    }

    public final int hashCode() {
        R r14 = this.f129410a;
        int iHashCode = (r14 == null ? 0 : r14.hashCode()) * 31;
        i iVar = this.f129411b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        e23.q<Throwable, R, t13.g, Unit> qVar = this.f129412c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.f129413d;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th3 = this.f129414e;
        return iHashCode4 + (th3 != null ? th3.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f129410a + ", cancelHandler=" + this.f129411b + ", onCancellation=" + this.f129412c + ", idempotentResume=" + this.f129413d + ", cancelCause=" + this.f129414e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(R r14, i iVar, e23.q<? super Throwable, ? super R, ? super t13.g, Unit> qVar, Object obj, Throwable th3) {
        this.f129410a = r14;
        this.f129411b = iVar;
        this.f129412c = qVar;
        this.f129413d = obj;
        this.f129414e = th3;
    }
}
