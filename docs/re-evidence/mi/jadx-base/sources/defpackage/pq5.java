package defpackage;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

/* JADX INFO: loaded from: classes3.dex */
public class pq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw3 f30630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30631b;
    public final Locale c;
    public final int d;
    public final DateTimeZone e;
    public final Integer f;
    public DateTimeZone g;
    public Integer h;
    public Integer i;
    public a[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30632k;
    public boolean l;
    public Object m;

    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public gq5 f30633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30634b;
        public String c;
        public Locale d;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            gq5 gq5Var = aVar.f30633a;
            int iJ = pq5.j(this.f30633a.getRangeDurationField(), gq5Var.getRangeDurationField());
            return iJ != 0 ? iJ : pq5.j(this.f30633a.getDurationField(), gq5Var.getDurationField());
        }

        public void b(gq5 gq5Var, int i) {
            this.f30633a = gq5Var;
            this.f30634b = i;
            this.c = null;
            this.d = null;
        }

        public void c(gq5 gq5Var, String str, Locale locale) {
            this.f30633a = gq5Var;
            this.f30634b = 0;
            this.c = str;
            this.d = locale;
        }

        public long d(long j, boolean z) {
            String str = this.c;
            long extended = str == null ? this.f30633a.setExtended(j, this.f30634b) : this.f30633a.set(j, str, this.d);
            return z ? this.f30633a.roundFloor(extended) : extended;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTimeZone f30635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f30636b;
        public final a[] c;
        public final int d;

        public b() {
            this.f30635a = pq5.this.g;
            this.f30636b = pq5.this.h;
            this.c = pq5.this.j;
            this.d = pq5.this.f30632k;
        }

        public boolean a(pq5 pq5Var) {
            if (pq5Var != pq5.this) {
                return false;
            }
            pq5Var.g = this.f30635a;
            pq5Var.h = this.f30636b;
            pq5Var.j = this.c;
            if (this.d < pq5Var.f30632k) {
                pq5Var.l = true;
            }
            pq5Var.f30632k = this.d;
            return true;
        }
    }

    public pq5(long j, bw3 bw3Var, Locale locale, Integer num, int i) {
        bw3 bw3VarC = wq5.c(bw3Var);
        this.f30631b = j;
        DateTimeZone zone = bw3VarC.getZone();
        this.e = zone;
        this.f30630a = bw3VarC.withUTC();
        this.c = locale == null ? Locale.getDefault() : locale;
        this.d = i;
        this.f = num;
        this.g = zone;
        this.i = num;
        this.j = new a[8];
    }

    public static void A(a[] aVarArr, int i) {
        if (i > 10) {
            Arrays.sort(aVarArr, 0, i);
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = i2; i3 > 0; i3--) {
                int i4 = i3 - 1;
                if (aVarArr[i4].compareTo(aVarArr[i3]) <= 0) {
                    break;
                }
                a aVar = aVarArr[i3];
                aVarArr[i3] = aVarArr[i4];
                aVarArr[i4] = aVar;
            }
        }
    }

    public static int j(t67 t67Var, t67 t67Var2) {
        if (t67Var == null || !t67Var.isSupported()) {
            return (t67Var2 == null || !t67Var2.isSupported()) ? 0 : -1;
        }
        if (t67Var2 == null || !t67Var2.isSupported()) {
            return 1;
        }
        return -t67Var.compareTo(t67Var2);
    }

    public long k(boolean z, CharSequence charSequence) {
        a[] aVarArr = this.j;
        int i = this.f30632k;
        if (this.l) {
            aVarArr = (a[]) aVarArr.clone();
            this.j = aVarArr;
            this.l = false;
        }
        A(aVarArr, i);
        if (i > 0) {
            t67 field = DurationFieldType.months().getField(this.f30630a);
            t67 field2 = DurationFieldType.days().getField(this.f30630a);
            t67 durationField = aVarArr[0].f30633a.getDurationField();
            if (j(durationField, field) >= 0 && j(durationField, field2) <= 0) {
                v(DateTimeFieldType.year(), this.d);
                return k(z, charSequence);
            }
        }
        long jD = this.f30631b;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                jD = aVarArr[i2].d(jD, z);
            } catch (IllegalFieldValueException e) {
                if (charSequence != null) {
                    e.prependMessage("Cannot parse \"" + ((Object) charSequence) + '\"');
                }
                throw e;
            }
        }
        if (z) {
            int i3 = 0;
            while (i3 < i) {
                if (!aVarArr[i3].f30633a.isLenient()) {
                    jD = aVarArr[i3].d(jD, i3 == i + (-1));
                }
                i3++;
            }
        }
        Integer num = this.h;
        if (num != null) {
            return jD - ((long) num.intValue());
        }
        DateTimeZone dateTimeZone = this.g;
        if (dateTimeZone == null) {
            return jD;
        }
        int offsetFromLocal = dateTimeZone.getOffsetFromLocal(jD);
        long j = jD - ((long) offsetFromLocal);
        if (offsetFromLocal == this.g.getOffset(j)) {
            return j;
        }
        String str = "Illegal instant due to time zone offset transition (" + this.g + ')';
        if (charSequence != null) {
            str = "Cannot parse \"" + ((Object) charSequence) + "\": " + str;
        }
        throw new IllegalInstantException(str);
    }

    public long l(boolean z, String str) {
        return k(z, str);
    }

    public long m(bfd bfdVar, CharSequence charSequence) {
        int iC = bfdVar.c(this, charSequence, 0);
        if (iC < 0) {
            iC = ~iC;
        } else if (iC >= charSequence.length()) {
            return k(true, charSequence);
        }
        throw new IllegalArgumentException(d1a.h(charSequence.toString(), iC));
    }

    public bw3 n() {
        return this.f30630a;
    }

    public Locale o() {
        return this.c;
    }

    public Integer p() {
        return this.h;
    }

    public Integer q() {
        return this.i;
    }

    public DateTimeZone r() {
        return this.g;
    }

    public final a s() {
        a[] aVarArr = this.j;
        int i = this.f30632k;
        if (i == aVarArr.length || this.l) {
            a[] aVarArr2 = new a[i == aVarArr.length ? i * 2 : aVarArr.length];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
            this.j = aVarArr2;
            this.l = false;
            aVarArr = aVarArr2;
        }
        this.m = null;
        a aVar = aVarArr[i];
        if (aVar == null) {
            aVar = new a();
            aVarArr[i] = aVar;
        }
        this.f30632k = i + 1;
        return aVar;
    }

    public boolean t(Object obj) {
        if (!(obj instanceof b) || !((b) obj).a(this)) {
            return false;
        }
        this.m = obj;
        return true;
    }

    public void u(gq5 gq5Var, int i) {
        s().b(gq5Var, i);
    }

    public void v(DateTimeFieldType dateTimeFieldType, int i) {
        s().b(dateTimeFieldType.getField(this.f30630a), i);
    }

    public void w(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        s().c(dateTimeFieldType.getField(this.f30630a), str, locale);
    }

    public Object x() {
        if (this.m == null) {
            this.m = new b();
        }
        return this.m;
    }

    public void y(Integer num) {
        this.m = null;
        this.h = num;
    }

    public void z(DateTimeZone dateTimeZone) {
        this.m = null;
        this.g = dateTimeZone;
    }
}
