package c63;

import ch.qos.logback.core.CoreConstants;
import java.time.LocalTime;
import kotlinx.datetime.DateTimeFormatException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BO\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lc63/c0;", "Lc63/v0;", "Lg63/c;", "", "hour", "hourOfAmPm", "Lc63/i;", "amPm", "minute", "second", "nanosecond", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lc63/i;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 implements v0, g63.c<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f24950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f24951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f24952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f24953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f24954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f24955f;

    public /* synthetic */ c0(Integer num, Integer num2, i iVar, Integer num3, Integer num4, Integer num5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : iVar, (i14 & 8) != 0 ? null : num3, (i14 & 16) != 0 ? null : num4, (i14 & 32) != 0 ? null : num5);
    }

    @Override // c63.v0
    public final void B(Integer num) {
        this.f24950a = num;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getF24953d() {
        return this.f24953d;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getF24950a() {
        return this.f24950a;
    }

    @Override // c63.v0
    public final void c(Integer num) {
        this.f24954e = num;
    }

    @Override // g63.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final c0 copy() {
        return new c0(this.f24950a, this.f24951b, this.f24952c, this.f24953d, this.f24954e, this.f24955f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.f24950a, c0Var.f24950a) && p005kotlin.jvm.internal.s.g(this.f24951b, c0Var.f24951b) && this.f24952c == c0Var.f24952c && p005kotlin.jvm.internal.s.g(this.f24953d, c0Var.f24953d) && p005kotlin.jvm.internal.s.g(this.f24954e, c0Var.f24954e) && p005kotlin.jvm.internal.s.g(this.f24955f, c0Var.f24955f);
    }

    @Override // c63.v0
    public final void f(i iVar) {
        this.f24952c = iVar;
    }

    public final void g(b63.v vVar) {
        vVar.getClass();
        LocalTime localTime = vVar.f16219a;
        this.f24950a = Integer.valueOf(localTime.getHour());
        this.f24951b = Integer.valueOf(((localTime.getHour() + 11) % 12) + 1);
        this.f24952c = localTime.getHour() >= 12 ? i.PM : i.AM;
        this.f24953d = Integer.valueOf(localTime.getMinute());
        this.f24954e = Integer.valueOf(localTime.getSecond());
        this.f24955f = Integer.valueOf(localTime.getNano());
    }

    public final b63.v h() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.f24950a;
        Integer num2 = this.f24951b;
        if (num != null) {
            iIntValue = num.intValue();
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                vb.h.x(tn.k.e(iIntValue, iIntValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is "));
                return null;
            }
            i iVar = this.f24952c;
            if (iVar != null) {
                if ((iVar == i.PM) != (iIntValue >= 12)) {
                    q6.f.v(", but the AM/PM marker is ", "Inconsistent hour and the AM/PM marker: hour is ", iIntValue, iVar);
                    return null;
                }
            }
        } else {
            Integer numValueOf = null;
            if (num2 != null) {
                int iIntValue3 = num2.intValue();
                i iVar2 = this.f24952c;
                if (iVar2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (iVar2 != i.PM ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new DateTimeFormatException("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num3 = this.f24953d;
        o1.a(num3, "minute");
        int iIntValue4 = num3.intValue();
        Integer num4 = this.f24954e;
        int iIntValue5 = num4 != null ? num4.intValue() : 0;
        Integer num5 = this.f24955f;
        return new b63.v(iIntValue, iIntValue4, iIntValue5, num5 != null ? num5.intValue() : 0);
    }

    public final int hashCode() {
        Integer num = this.f24950a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f24951b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        i iVar = this.f24952c;
        int iHashCode = ((iVar != null ? iVar.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.f24953d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.f24954e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f24955f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getF24954e() {
        return this.f24954e;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getF24955f() {
        return this.f24955f;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: s, reason: from getter */
    public final Integer getF24951b() {
        return this.f24951b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final String toString() {
        String strM;
        StringBuilder sb3 = new StringBuilder();
        Object obj = this.f24950a;
        if (obj == null) {
            obj = "??";
        }
        sb3.append(obj);
        sb3.append(CoreConstants.COLON_CHAR);
        Object obj2 = this.f24953d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb3.append(obj2);
        sb3.append(CoreConstants.COLON_CHAR);
        Integer num = this.f24954e;
        sb3.append(num != null ? num : "??");
        sb3.append('.');
        Integer num2 = this.f24955f;
        if (num2 != null) {
            String strValueOf = String.valueOf(num2.intValue());
            strM = d53.w.M(9 - strValueOf.length(), strValueOf);
            if (strM == null) {
                strM = "???";
            }
        } else {
            strM = "???";
        }
        sb3.append(strM);
        return sb3.toString();
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: u, reason: from getter */
    public final i getF24952c() {
        return this.f24952c;
    }

    @Override // c63.v0
    public final void v(Integer num) {
        this.f24951b = num;
    }

    @Override // c63.v0
    public final void w(Integer num) {
        this.f24955f = num;
    }

    @Override // c63.v0
    public final void y(Integer num) {
        this.f24953d = num;
    }

    public c0(Integer num, Integer num2, i iVar, Integer num3, Integer num4, Integer num5) {
        this.f24950a = num;
        this.f24951b = num2;
        this.f24952c = iVar;
        this.f24953d = num3;
        this.f24954e = num4;
        this.f24955f = num5;
    }

    public c0() {
        this(null, null, null, null, null, null, 63, null);
    }
}
