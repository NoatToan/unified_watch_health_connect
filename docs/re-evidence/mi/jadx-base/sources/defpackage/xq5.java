package defpackage;

import com.xiaomi.fitness.sync.SyncEngine;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class xq5 {

    public static final class a extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f39349b;
        public final d c;

        public a(String str, int i, d dVar, d dVar2) {
            super(str);
            this.f39348a = i;
            this.f39349b = dVar;
            this.c = dVar2;
        }

        public static a b(DataInput dataInput, String str) throws IOException {
            return new a(str, (int) xq5.c(dataInput), d.e(dataInput), d.e(dataInput));
        }

        public final d a(long j) {
            long jC;
            int i = this.f39348a;
            d dVar = this.f39349b;
            d dVar2 = this.c;
            try {
                jC = dVar.c(j, i, dVar2.b());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                jC = j;
            }
            try {
                j = dVar2.c(j, i, dVar.b());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return jC > j ? dVar : dVar2;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return getID().equals(aVar.getID()) && this.f39348a == aVar.f39348a && this.f39349b.equals(aVar.f39349b) && this.c.equals(aVar.c);
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j) {
            return a(j).a();
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j) {
            return this.f39348a + a(j).b();
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j) {
            return this.f39348a;
        }

        @Override // org.joda.time.DateTimeZone
        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f39348a), this.f39349b, this.c});
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j) {
            long jC;
            int i = this.f39348a;
            d dVar = this.f39349b;
            d dVar2 = this.c;
            try {
                jC = dVar.c(j, i, dVar2.b());
                if (j > 0 && jC < 0) {
                    jC = j;
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                long jC2 = dVar2.c(j, i, dVar.b());
                if (j <= 0 || jC2 >= 0) {
                    j = jC2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return jC > j ? j : jC;
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j) {
            long jD;
            long j2 = j + 1;
            int i = this.f39348a;
            d dVar = this.f39349b;
            d dVar2 = this.c;
            try {
                jD = dVar.d(j2, i, dVar2.b());
                if (j2 < 0 && jD > 0) {
                    jD = j2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                long jD2 = dVar2.d(j2, i, dVar.b());
                if (j2 >= 0 || jD2 <= 0) {
                    j2 = jD2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jD <= j2) {
                jD = j2;
            }
            return jD - 1;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f39350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39351b;
        public final int c;
        public final int d;
        public final boolean e;
        public final int f;

        public b(char c, int i, int i2, int i3, boolean z, int i4) {
            if (c != 'u' && c != 'w' && c != 's') {
                throw new IllegalArgumentException("Unknown mode: " + c);
            }
            this.f39350a = c;
            this.f39351b = i;
            this.c = i2;
            this.d = i3;
            this.e = z;
            this.f = i4;
        }

        public static b c(DataInput dataInput) throws IOException {
            return new b((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) xq5.c(dataInput));
        }

        public long a(long j, int i, int i2) {
            char c = this.f39350a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = i;
            long j3 = j + j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long jE = e(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j3, this.f39351b), 0), Math.min(this.f, 86399999)));
            if (this.d != 0) {
                jE = g(instanceUTC, jE);
                if (jE <= j3) {
                    jE = g(instanceUTC, e(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(jE, 1), this.f39351b)));
                }
            } else if (jE <= j3) {
                jE = e(instanceUTC, instanceUTC.year().add(jE, 1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(jE, 0), this.f) - j2;
        }

        public long b(long j, int i, int i2) {
            char c = this.f39350a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = i;
            long j3 = j + j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long jF = f(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j3, this.f39351b), 0), this.f));
            if (this.d != 0) {
                jF = g(instanceUTC, jF);
                if (jF >= j3) {
                    jF = g(instanceUTC, f(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(jF, -1), this.f39351b)));
                }
            } else if (jF >= j3) {
                jF = f(instanceUTC, instanceUTC.year().add(jF, -1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(jF, 0), this.f) - j2;
        }

        public final long d(bw3 bw3Var, long j) {
            if (this.c >= 0) {
                return bw3Var.dayOfMonth().set(j, this.c);
            }
            return bw3Var.dayOfMonth().add(bw3Var.monthOfYear().add(bw3Var.dayOfMonth().set(j, 1), 1), this.c);
        }

        public final long e(bw3 bw3Var, long j) {
            try {
                return d(bw3Var, j);
            } catch (IllegalArgumentException e) {
                if (this.f39351b != 2 || this.c != 29) {
                    throw e;
                }
                while (!bw3Var.year().isLeap(j)) {
                    j = bw3Var.year().add(j, 1);
                }
                return d(bw3Var, j);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f39350a == bVar.f39350a && this.f39351b == bVar.f39351b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
        }

        public final long f(bw3 bw3Var, long j) {
            try {
                return d(bw3Var, j);
            } catch (IllegalArgumentException e) {
                if (this.f39351b != 2 || this.c != 29) {
                    throw e;
                }
                while (!bw3Var.year().isLeap(j)) {
                    j = bw3Var.year().add(j, -1);
                }
                return d(bw3Var, j);
            }
        }

        public final long g(bw3 bw3Var, long j) {
            int i = this.d - bw3Var.dayOfWeek().get(j);
            if (i == 0) {
                return j;
            }
            if (this.e) {
                if (i < 0) {
                    i += 7;
                }
            } else if (i > 0) {
                i -= 7;
            }
            return bw3Var.dayOfWeek().add(j, i);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Character.valueOf(this.f39350a), Integer.valueOf(this.f39351b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f)});
        }

        public String toString() {
            return "[OfYear]\nMode: " + this.f39350a + "\nMonthOfYear: " + this.f39351b + "\nDayOfMonth: " + this.c + "\nDayOfWeek: " + this.d + "\nAdvanceDayOfWeek: " + this.e + "\nMillisOfDay: " + this.f + '\n';
        }
    }

    public static final class c extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f39352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f39353b;
        public final int[] c;
        public final String[] d;
        public final a e;

        public c(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, a aVar) {
            super(str);
            this.f39352a = jArr;
            this.f39353b = iArr;
            this.c = iArr2;
            this.d = strArr;
            this.e = aVar;
        }

        public static c a(DataInput dataInput, String str) throws IOException {
            int unsignedByte;
            int unsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[unsignedShort];
            for (int i = 0; i < unsignedShort; i++) {
                strArr[i] = dataInput.readUTF();
            }
            int i2 = dataInput.readInt();
            long[] jArr = new long[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            String[] strArr2 = new String[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                jArr[i3] = xq5.c(dataInput);
                iArr[i3] = (int) xq5.c(dataInput);
                iArr2[i3] = (int) xq5.c(dataInput);
                if (unsignedShort < 256) {
                    try {
                        unsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    unsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i3] = strArr[unsignedByte];
            }
            return new c(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? a.b(dataInput, str) : null);
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (getID().equals(cVar.getID()) && Arrays.equals(this.f39352a, cVar.f39352a) && Arrays.equals(this.d, cVar.d) && Arrays.equals(this.f39353b, cVar.f39353b) && Arrays.equals(this.c, cVar.c)) {
                a aVar = this.e;
                a aVar2 = cVar.e;
                if (aVar == null) {
                    if (aVar2 == null) {
                        return true;
                    }
                } else if (aVar.equals(aVar2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j) {
            long[] jArr = this.f39352a;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch >= 0) {
                return this.d[iBinarySearch];
            }
            int i = ~iBinarySearch;
            if (i < jArr.length) {
                return i > 0 ? this.d[i - 1] : "UTC";
            }
            a aVar = this.e;
            return aVar == null ? this.d[i - 1] : aVar.getNameKey(j);
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j) {
            long[] jArr = this.f39352a;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch >= 0) {
                return this.f39353b[iBinarySearch];
            }
            int i = ~iBinarySearch;
            if (i >= jArr.length) {
                a aVar = this.e;
                return aVar == null ? this.f39353b[i - 1] : aVar.getOffset(j);
            }
            if (i > 0) {
                return this.f39353b[i - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j) {
            long[] jArr = this.f39352a;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch >= 0) {
                return this.c[iBinarySearch];
            }
            int i = ~iBinarySearch;
            if (i >= jArr.length) {
                a aVar = this.e;
                return aVar == null ? this.c[i - 1] : aVar.getStandardOffset(j);
            }
            if (i > 0) {
                return this.c[i - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int hashCode() {
            return getID().hashCode();
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j) {
            long[] jArr = this.f39352a;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            int i = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
            if (i < jArr.length) {
                return jArr[i];
            }
            a aVar = this.e;
            if (aVar == null) {
                return j;
            }
            long j2 = jArr[jArr.length - 1];
            if (j < j2) {
                j = j2;
            }
            return aVar.nextTransition(j);
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j) {
            long[] jArr = this.f39352a;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch >= 0) {
                return j > Long.MIN_VALUE ? j - 1 : j;
            }
            int i = ~iBinarySearch;
            if (i < jArr.length) {
                if (i > 0) {
                    long j2 = jArr[i - 1];
                    if (j2 > Long.MIN_VALUE) {
                        return j2 - 1;
                    }
                }
                return j;
            }
            a aVar = this.e;
            if (aVar != null) {
                long jPreviousTransition = aVar.previousTransition(j);
                if (jPreviousTransition < j) {
                    return jPreviousTransition;
                }
            }
            long j3 = jArr[i - 1];
            return j3 > Long.MIN_VALUE ? j3 - 1 : j;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f39354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39355b;
        public final int c;

        public d(b bVar, String str, int i) {
            this.f39354a = bVar;
            this.f39355b = str;
            this.c = i;
        }

        public static d e(DataInput dataInput) throws IOException {
            return new d(b.c(dataInput), dataInput.readUTF(), (int) xq5.c(dataInput));
        }

        public String a() {
            return this.f39355b;
        }

        public int b() {
            return this.c;
        }

        public long c(long j, int i, int i2) {
            return this.f39354a.a(j, i, i2);
        }

        public long d(long j, int i, int i2) {
            return this.f39354a.b(j, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.c == dVar.c && this.f39355b.equals(dVar.f39355b) && this.f39354a.equals(dVar.f39354a);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.f39355b, this.f39354a});
        }

        public String toString() {
            return this.f39354a + " named " + this.f39355b + " at " + this.c;
        }
    }

    public static DateTimeZone a(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return CachedDateTimeZone.forZone(c.a(dataInput, str));
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return c.a(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) c(dataInput), (int) c(dataInput));
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DateTimeZone b(InputStream inputStream, String str) throws IOException {
        return inputStream instanceof DataInput ? a((DataInput) inputStream, str) : a(new DataInputStream(inputStream), str);
    }

    public static long c(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i = unsignedByte2 >> 6;
        if (i == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        } else if (i == 2) {
            unsignedByte = ((((long) unsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else {
            if (i == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j = SyncEngine.SYNC_WEATHER_DURATION;
        }
        return unsignedByte * j;
    }
}
