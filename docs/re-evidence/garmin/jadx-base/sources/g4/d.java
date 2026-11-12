package g4;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg4/d;", "", "", "groupKey", "Lg4/s;", "sourceInfo", "groupOffset", "<init>", "(ILg4/s;Ljava/lang/Integer;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f75734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f75735c;

    public d(int i14, s sVar, Integer num) {
        this.f75733a = i14;
        this.f75734b = sVar;
        this.f75735c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f75733a == dVar.f75733a && p005kotlin.jvm.internal.s.g(this.f75734b, dVar.f75734b) && p005kotlin.jvm.internal.s.g(this.f75735c, dVar.f75735c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f75733a) * 31;
        s sVar = this.f75734b;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        Integer num = this.f75735c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f75733a + ", sourceInfo=" + this.f75734b + ", groupOffset=" + this.f75735c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
