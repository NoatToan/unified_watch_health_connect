package c63;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.f3;
import com.roomorama.caldroid.CaldroidFragment;
import java.time.LocalDate;
import kotlinx.datetime.DateTimeFormatException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B5\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc63/a0;", "Lc63/l1;", "Lc63/k;", "Lg63/c;", "Lc63/e0;", "yearMonth", "", "day", "dayOfWeek", "dayOfYear", "<init>", "(Lc63/e0;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 implements l1, k, g63.c<a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f24941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f24942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f24943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f24944d;

    public /* synthetic */ a0(e0 e0Var, Integer num, Integer num2, Integer num3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new e0(null, null, 3, null) : e0Var, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : num3);
    }

    @Override // g63.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a0 copy() {
        e0 e0Var = this.f24941a;
        return new a0(new e0(e0Var.f24963a, e0Var.f24964b), this.f24942b, this.f24943c, this.f24944d);
    }

    public final void b(b63.o oVar) {
        oVar.getClass();
        LocalDate localDate = oVar.f16206a;
        Integer numValueOf = Integer.valueOf(localDate.getYear());
        e0 e0Var = this.f24941a;
        e0Var.f24963a = numValueOf;
        e0Var.f24964b = Integer.valueOf(b63.b.b(oVar.c()));
        this.f24942b = Integer.valueOf(localDate.getDayOfMonth());
        b63.j jVarB = oVar.b();
        jVarB.getClass();
        this.f24943c = Integer.valueOf(jVarB.ordinal() + 1);
        this.f24944d = Integer.valueOf(localDate.getDayOfYear());
    }

    public final b63.o c() {
        b63.o oVar;
        b63.j jVar;
        e0 e0Var = this.f24941a;
        Integer num = e0Var.f24963a;
        o1.a(num, CaldroidFragment.YEAR);
        int iIntValue = num.intValue();
        Integer num2 = this.f24944d;
        if (num2 == null) {
            Integer num3 = e0Var.f24964b;
            o1.a(num3, "monthNumber");
            int iIntValue2 = num3.intValue();
            Integer num4 = this.f24942b;
            o1.a(num4, "day");
            oVar = new b63.o(iIntValue, iIntValue2, num4.intValue());
        } else {
            b63.o oVar2 = new b63.o(iIntValue, 1, 1);
            int iIntValue3 = num2.intValue() - 1;
            b63.i.INSTANCE.getClass();
            b63.o oVarE = b63.q.e(oVar2, iIntValue3, b63.i.f16190d);
            LocalDate localDate = oVarE.f16206a;
            if (localDate.getYear() != iIntValue) {
                throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + iIntValue);
            }
            if (e0Var.f24964b != null) {
                int iB = b63.b.b(oVarE.c());
                Integer num5 = e0Var.f24964b;
                if (num5 == null || iB != num5.intValue()) {
                    StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb3.append(num2);
                    sb3.append(", which is ");
                    sb3.append(oVarE.c());
                    sb3.append(", but ");
                    throw new DateTimeFormatException(f3.i(sb3, e0Var.f24964b, " was specified as the month number"));
                }
            }
            if (this.f24942b != null) {
                int dayOfMonth = localDate.getDayOfMonth();
                Integer num6 = this.f24942b;
                if (num6 == null || dayOfMonth != num6.intValue()) {
                    StringBuilder sb4 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb4.append(num2);
                    sb4.append(", which is the day ");
                    sb4.append(localDate.getDayOfMonth());
                    sb4.append(" of ");
                    sb4.append(oVarE.c());
                    sb4.append(", but ");
                    throw new DateTimeFormatException(f3.i(sb4, this.f24942b, " was specified as the day of month"));
                }
            }
            oVar = oVarE;
        }
        Integer num7 = this.f24943c;
        if (num7 != null) {
            int iIntValue4 = num7.intValue();
            b63.j jVarB = oVar.b();
            jVarB.getClass();
            if (iIntValue4 != jVarB.ordinal() + 1) {
                StringBuilder sb5 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > iIntValue4 || iIntValue4 >= 8) {
                    vb.h.x(am.j.h(iIntValue4, "Expected ISO day-of-week number in 1..7, got "));
                    jVar = null;
                } else {
                    jVar = (b63.j) b63.j.f16200b.get(iIntValue4 - 1);
                }
                sb5.append(jVar);
                sb5.append(" but the date is ");
                sb5.append(oVar);
                b63.j jVarB2 = oVar.b();
                sb5.append(", which is a ");
                sb5.append(jVarB2);
                throw new DateTimeFormatException(sb5.toString());
            }
        }
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.f24941a, a0Var.f24941a) && p005kotlin.jvm.internal.s.g(this.f24942b, a0Var.f24942b) && p005kotlin.jvm.internal.s.g(this.f24943c, a0Var.f24943c) && p005kotlin.jvm.internal.s.g(this.f24944d, a0Var.f24944d);
    }

    @Override // c63.k
    /* JADX INFO: renamed from: getDay, reason: from getter */
    public final Integer getF24942b() {
        return this.f24942b;
    }

    @Override // c63.k
    /* JADX INFO: renamed from: getDayOfWeek, reason: from getter */
    public final Integer getF24943c() {
        return this.f24943c;
    }

    @Override // c63.k
    /* JADX INFO: renamed from: getDayOfYear, reason: from getter */
    public final Integer getF24944d() {
        return this.f24944d;
    }

    @Override // c63.l1
    /* JADX INFO: renamed from: getYear */
    public final Integer getF24963a() {
        return this.f24941a.f24963a;
    }

    public final int hashCode() {
        int iHashCode = this.f24941a.hashCode() * 29791;
        Integer num = this.f24942b;
        int iHashCode2 = ((num != null ? num.hashCode() : 0) * 961) + iHashCode;
        Integer num2 = this.f24943c;
        int iHashCode3 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode2;
        Integer num3 = this.f24944d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // c63.k
    public final void i(Integer num) {
        this.f24942b = num;
    }

    @Override // c63.k
    public final void j(Integer num) {
        this.f24943c = num;
    }

    @Override // c63.k
    public final void l(Integer num) {
        this.f24944d = num;
    }

    @Override // c63.l1
    public final void m(Integer num) {
        this.f24941a.f24964b = num;
    }

    @Override // c63.l1
    public final void o(Integer num) {
        this.f24941a.f24963a = num;
    }

    public final String toString() {
        Integer num = this.f24944d;
        e0 e0Var = this.f24941a;
        if (num == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e0Var);
            sb3.append('-');
            Object obj = this.f24942b;
            if (obj == null) {
                obj = "??";
            }
            sb3.append(obj);
            sb3.append(" (day of week is ");
            Integer num2 = this.f24943c;
            return wr.g.p(sb3, num2 != null ? num2 : "??", CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (this.f24942b == null && e0Var.f24964b == null) {
            StringBuilder sb4 = new StringBuilder("(");
            Object obj2 = e0Var.f24963a;
            if (obj2 == null) {
                obj2 = "??";
            }
            sb4.append(obj2);
            sb4.append(")-");
            sb4.append(this.f24944d);
            sb4.append(" (day of week is ");
            Integer num3 = this.f24943c;
            return wr.g.p(sb4, num3 != null ? num3 : "??", CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(e0Var);
        sb5.append('-');
        Object obj3 = this.f24942b;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb5.append(obj3);
        sb5.append(" (day of week is ");
        Integer num4 = this.f24943c;
        sb5.append(num4 != null ? num4 : "??");
        sb5.append(", day of year is ");
        sb5.append(this.f24944d);
        sb5.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb5.toString();
    }

    @Override // c63.l1
    /* JADX INFO: renamed from: x */
    public final Integer getF24964b() {
        return this.f24941a.f24964b;
    }

    public a0(e0 e0Var, Integer num, Integer num2, Integer num3) {
        e0Var.getClass();
        this.f24941a = e0Var;
        this.f24942b = num;
        this.f24943c = num2;
        this.f24944d = num3;
    }

    public a0() {
        this(null, null, null, null, 15, null);
    }
}
