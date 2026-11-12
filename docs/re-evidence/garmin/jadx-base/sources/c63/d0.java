package c63;

import ch.qos.logback.core.CoreConstants;
import java.time.DateTimeException;
import java.time.ZoneOffset;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc63/d0;", "Lc63/c1;", "Lg63/c;", "", "offsetIsNegative", "", "offsetHours", "offsetMinutesOfHour", "offsetSecondsOfMinute", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 implements c1, g63.c<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f24956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f24957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f24958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f24959d;

    public /* synthetic */ d0(Boolean bool, Integer num, Integer num2, Integer num3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : num3);
    }

    @Override // c63.c1
    /* JADX INFO: renamed from: A, reason: from getter */
    public final Integer getF24958c() {
        return this.f24958c;
    }

    public final void a(b63.a0 a0Var) {
        a0Var.getClass();
        ZoneOffset zoneOffset = a0Var.f16173a;
        this.f24956a = Boolean.valueOf(zoneOffset.getTotalSeconds() < 0);
        int iAbs = Math.abs(zoneOffset.getTotalSeconds());
        this.f24957b = Integer.valueOf(iAbs / DateTimeConstants.SECONDS_PER_HOUR);
        this.f24958c = Integer.valueOf((iAbs / 60) % 60);
        this.f24959d = Integer.valueOf(iAbs % 60);
    }

    public final b63.a0 b() {
        int i14 = p005kotlin.jvm.internal.s.g(this.f24956a, Boolean.TRUE) ? -1 : 1;
        Integer num = this.f24957b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i14) : null;
        Integer num2 = this.f24958c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i14) : null;
        Integer num3 = this.f24959d;
        Integer numValueOf3 = num3 != null ? Integer.valueOf(num3.intValue() * i14) : null;
        o13.t tVar = b63.c0.f16175a;
        try {
            if (numValueOf != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(numValueOf.intValue(), numValueOf2 != null ? numValueOf2.intValue() : 0, numValueOf3 != null ? numValueOf3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds.getClass();
                return new b63.a0(zoneOffsetOfHoursMinutesSeconds);
            }
            if (numValueOf2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(numValueOf2.intValue() / 60, numValueOf2.intValue() % 60, numValueOf3 != null ? numValueOf3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds2.getClass();
                return new b63.a0(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(numValueOf3 != null ? numValueOf3.intValue() : 0);
            zoneOffsetOfTotalSeconds.getClass();
            return new b63.a0(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e4) {
            l2.t(e4);
            return null;
        }
    }

    @Override // g63.c
    public final d0 copy() {
        return new d0(this.f24956a, this.f24957b, this.f24958c, this.f24959d);
    }

    @Override // c63.c1
    public final void d(Integer num) {
        this.f24959d = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p005kotlin.jvm.internal.s.g(this.f24956a, d0Var.f24956a) && p005kotlin.jvm.internal.s.g(this.f24957b, d0Var.f24957b) && p005kotlin.jvm.internal.s.g(this.f24958c, d0Var.f24958c) && p005kotlin.jvm.internal.s.g(this.f24959d, d0Var.f24959d);
    }

    @Override // c63.c1
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getF24959d() {
        return this.f24959d;
    }

    @Override // c63.c1
    public final void h(Integer num) {
        this.f24957b = num;
    }

    public final int hashCode() {
        Boolean bool = this.f24956a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.f24957b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.f24958c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.f24959d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // c63.c1
    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getF24956a() {
        return this.f24956a;
    }

    @Override // c63.c1
    public final void q(Integer num) {
        this.f24958c = num;
    }

    @Override // c63.c1
    /* JADX INFO: renamed from: t, reason: from getter */
    public final Integer getF24957b() {
        return this.f24957b;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        Boolean bool = this.f24956a;
        if (bool != null) {
            str = bool.booleanValue() ? "-" : Marker.ANY_NON_NULL_MARKER;
        } else {
            str = StringUtils.SPACE;
        }
        sb3.append(str);
        Object obj = this.f24957b;
        if (obj == null) {
            obj = "??";
        }
        sb3.append(obj);
        sb3.append(CoreConstants.COLON_CHAR);
        Object obj2 = this.f24958c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb3.append(obj2);
        sb3.append(CoreConstants.COLON_CHAR);
        Integer num = this.f24959d;
        sb3.append(num != null ? num : "??");
        return sb3.toString();
    }

    @Override // c63.c1
    public final void z(Boolean bool) {
        this.f24956a = bool;
    }

    public d0(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.f24956a = bool;
        this.f24957b = num;
        this.f24958c = num2;
        this.f24959d = num3;
    }

    public d0() {
        this(null, null, null, null, 15, null);
    }
}
