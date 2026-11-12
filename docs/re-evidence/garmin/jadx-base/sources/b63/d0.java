package b63;

import com.roomorama.caldroid.CaldroidFragment;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\u000e\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lb63/d0;", "", "Ljava/io/Serializable;", "Ljava/time/YearMonth;", "value", "<init>", "(Ljava/time/YearMonth;)V", "", CaldroidFragment.YEAR, CaldroidFragment.MONTH, "(II)V", "Lb63/w;", "(ILb63/w;)V", "Companion", "a", "b", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = h63.r.class)
public final class d0 implements Comparable<d0>, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YearMonth f16180a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb63/d0$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16181a = new b();

        private b() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(int i14, w wVar) {
        wVar.getClass();
        try {
            Month monthOf = Month.of(wVar.ordinal() + 1);
            monthOf.getClass();
            YearMonth yearMonthOf = YearMonth.of(i14, monthOf);
            yearMonthOf.getClass();
            this(yearMonthOf);
        } catch (DateTimeException e4) {
            l2.t(e4);
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(d0 d0Var) {
        d0 d0Var2 = d0Var;
        d0Var2.getClass();
        return this.f16180a.compareTo(d0Var2.f16180a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return p005kotlin.jvm.internal.s.g(this.f16180a, ((d0) obj).f16180a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16180a.hashCode();
    }

    public final String toString() {
        String str = ((DateTimeFormatter) e0.f16183a.getValue()).format(this.f16180a);
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: b63.d0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb63/d0$a;", "", "<init>", "()V", "Li63/c;", "Lb63/d0;", "serializer", "()Li63/c;", "", "serialVersionUID", "J", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d0> serializer() {
            return h63.r.f82318a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(int i14, int i15) {
        try {
            YearMonth yearMonthOf = YearMonth.of(i14, i15);
            yearMonthOf.getClass();
            this(yearMonthOf);
        } catch (DateTimeException e4) {
            l2.t(e4);
            throw null;
        }
    }

    public d0(YearMonth yearMonth) {
        yearMonth.getClass();
        this.f16180a = yearMonth;
    }
}
