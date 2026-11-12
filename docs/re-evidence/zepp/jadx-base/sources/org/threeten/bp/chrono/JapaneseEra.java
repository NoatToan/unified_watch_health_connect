package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.jdk8.DefaultInterfaceEra;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes23.dex */
public final class JapaneseEra extends DefaultInterfaceEra implements Serializable {
    public static final JapaneseEra HEISEI;
    public static final JapaneseEra MEIJI;
    public static final JapaneseEra REIWA;
    public static final JapaneseEra SHOWA;
    public static final JapaneseEra TAISHO;
    public static final int d = 2;
    private static final int e = 4;
    private static final AtomicReference<JapaneseEra[]> f;
    private static final long serialVersionUID = 1466499369062886794L;
    private final int a;
    private final transient LocalDate b;
    private final transient String c;

    static {
        JapaneseEra japaneseEra = new JapaneseEra(-1, LocalDate.of(1868, 9, 8), "Meiji");
        MEIJI = japaneseEra;
        JapaneseEra japaneseEra2 = new JapaneseEra(0, LocalDate.of(1912, 7, 30), "Taisho");
        TAISHO = japaneseEra2;
        JapaneseEra japaneseEra3 = new JapaneseEra(1, LocalDate.of(1926, 12, 25), "Showa");
        SHOWA = japaneseEra3;
        JapaneseEra japaneseEra4 = new JapaneseEra(2, LocalDate.of(1989, 1, 8), "Heisei");
        HEISEI = japaneseEra4;
        JapaneseEra japaneseEra5 = new JapaneseEra(3, LocalDate.of(2019, 5, 1), "Reiwa");
        REIWA = japaneseEra5;
        f = new AtomicReference<>(new JapaneseEra[]{japaneseEra, japaneseEra2, japaneseEra3, japaneseEra4, japaneseEra5});
    }

    private JapaneseEra(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static JapaneseEra b(LocalDate localDate) {
        if (localDate.isBefore(MEIJI.b)) {
            throw new DateTimeException("Date too early: " + localDate);
        }
        JapaneseEra[] japaneseEraArr = f.get();
        for (int length = japaneseEraArr.length - 1; length >= 0; length--) {
            JapaneseEra japaneseEra = japaneseEraArr[length];
            if (localDate.compareTo((ChronoLocalDate) japaneseEra.b) >= 0) {
                return japaneseEra;
            }
        }
        return null;
    }

    private static int c(int i) {
        return i + 1;
    }

    public static JapaneseEra e(DataInput dataInput) throws IOException {
        return of(dataInput.readByte());
    }

    public static JapaneseEra of(int i) {
        JapaneseEra[] japaneseEraArr = f.get();
        if (i < MEIJI.a || i > japaneseEraArr[japaneseEraArr.length - 1].a) {
            throw new DateTimeException("japaneseEra is invalid");
        }
        return japaneseEraArr[c(i)];
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return of(this.a);
        } catch (DateTimeException e2) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e2);
            throw invalidObjectException;
        }
    }

    public static JapaneseEra registerEra(LocalDate localDate, String str) {
        AtomicReference<JapaneseEra[]> atomicReference = f;
        JapaneseEra[] japaneseEraArr = atomicReference.get();
        if (japaneseEraArr.length > 5) {
            throw new DateTimeException("Only one additional Japanese era can be added");
        }
        Jdk8Methods.requireNonNull(localDate, "since");
        Jdk8Methods.requireNonNull(str, "name");
        if (!localDate.isAfter(REIWA.b)) {
            throw new DateTimeException("Invalid since date for additional Japanese era, must be after Reiwa");
        }
        JapaneseEra japaneseEra = new JapaneseEra(4, localDate, str);
        JapaneseEra[] japaneseEraArr2 = (JapaneseEra[]) Arrays.copyOf(japaneseEraArr, 6);
        japaneseEraArr2[5] = japaneseEra;
        if (atomicReference.compareAndSet(japaneseEraArr, japaneseEraArr2)) {
            return japaneseEra;
        }
        throw new DateTimeException("Only one additional Japanese era can be added");
    }

    public static JapaneseEra valueOf(String str) {
        Jdk8Methods.requireNonNull(str, "japaneseEra");
        for (JapaneseEra japaneseEra : f.get()) {
            if (str.equals(japaneseEra.c)) {
                return japaneseEra;
            }
        }
        throw new IllegalArgumentException("Era not found: " + str);
    }

    public static JapaneseEra[] values() {
        JapaneseEra[] japaneseEraArr = f.get();
        return (JapaneseEra[]) Arrays.copyOf(japaneseEraArr, japaneseEraArr.length);
    }

    private Object writeReplace() {
        return new e((byte) 2, this);
    }

    public LocalDate a() {
        int iC = c(this.a);
        JapaneseEra[] japaneseEraArrValues = values();
        return iC >= japaneseEraArrValues.length + (-1) ? LocalDate.MAX : japaneseEraArrValues[iC + 1].f().minusDays(1L);
    }

    public LocalDate f() {
        return this.b;
    }

    public void g(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }

    @Override // org.threeten.bp.chrono.Era
    public int getValue() {
        return this.a;
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        return temporalField == chronoField ? JapaneseChronology.INSTANCE.range(chronoField) : super.range(temporalField);
    }

    public String toString() {
        return this.c;
    }
}
