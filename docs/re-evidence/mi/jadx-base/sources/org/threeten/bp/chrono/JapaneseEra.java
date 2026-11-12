package org.threeten.bp.chrono;

import com.mibi.sdk.common.CommonConstants;
import defpackage.crd;
import defpackage.d8i;
import defpackage.gwl;
import defpackage.qv5;
import defpackage.z4p;
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
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class JapaneseEra extends qv5 implements Serializable {
    private static final int ADDITIONAL_VALUE = 3;
    static final int ERA_OFFSET = 2;
    public static final JapaneseEra HEISEI;
    private static final AtomicReference<JapaneseEra[]> KNOWN_ERAS;
    public static final JapaneseEra MEIJI;
    public static final JapaneseEra SHOWA;
    public static final JapaneseEra TAISHO;
    private static final long serialVersionUID = 1466499369062886794L;
    private final int eraValue;
    private final transient String name;
    private final transient LocalDate since;

    static {
        JapaneseEra japaneseEra = new JapaneseEra(-1, LocalDate.of(1868, 9, 8), "Meiji");
        MEIJI = japaneseEra;
        JapaneseEra japaneseEra2 = new JapaneseEra(0, LocalDate.of(1912, 7, 30), "Taisho");
        TAISHO = japaneseEra2;
        JapaneseEra japaneseEra3 = new JapaneseEra(1, LocalDate.of(1926, 12, 25), "Showa");
        SHOWA = japaneseEra3;
        JapaneseEra japaneseEra4 = new JapaneseEra(2, LocalDate.of(CommonConstants.Mgc.AUTH_FAILED_ERROR, 1, 8), "Heisei");
        HEISEI = japaneseEra4;
        KNOWN_ERAS = new AtomicReference<>(new JapaneseEra[]{japaneseEra, japaneseEra2, japaneseEra3, japaneseEra4});
    }

    private JapaneseEra(int i, LocalDate localDate, String str) {
        this.eraValue = i;
        this.since = localDate;
        this.name = str;
    }

    public static JapaneseEra from(LocalDate localDate) {
        if (localDate.isBefore(MEIJI.since)) {
            throw new DateTimeException("Date too early: " + localDate);
        }
        JapaneseEra[] japaneseEraArr = KNOWN_ERAS.get();
        for (int length = japaneseEraArr.length - 1; length >= 0; length--) {
            JapaneseEra japaneseEra = japaneseEraArr[length];
            if (localDate.compareTo((a) japaneseEra.since) >= 0) {
                return japaneseEra;
            }
        }
        return null;
    }

    public static JapaneseEra of(int i) {
        JapaneseEra[] japaneseEraArr = KNOWN_ERAS.get();
        if (i < MEIJI.eraValue || i > japaneseEraArr[japaneseEraArr.length - 1].eraValue) {
            throw new DateTimeException("japaneseEra is invalid");
        }
        return japaneseEraArr[ordinal(i)];
    }

    private static int ordinal(int i) {
        return i + 1;
    }

    public static JapaneseEra readExternal(DataInput dataInput) throws IOException {
        return of(dataInput.readByte());
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return of(this.eraValue);
        } catch (DateTimeException e) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e);
            throw invalidObjectException;
        }
    }

    public static JapaneseEra registerEra(LocalDate localDate, String str) {
        AtomicReference<JapaneseEra[]> atomicReference = KNOWN_ERAS;
        JapaneseEra[] japaneseEraArr = atomicReference.get();
        if (japaneseEraArr.length > 4) {
            throw new DateTimeException("Only one additional Japanese era can be added");
        }
        crd.i(localDate, "since");
        crd.i(str, "name");
        if (!localDate.isAfter(HEISEI.since)) {
            throw new DateTimeException("Invalid since date for additional Japanese era, must be after Heisei");
        }
        JapaneseEra japaneseEra = new JapaneseEra(3, localDate, str);
        JapaneseEra[] japaneseEraArr2 = (JapaneseEra[]) Arrays.copyOf(japaneseEraArr, 5);
        japaneseEraArr2[4] = japaneseEra;
        if (d8i.a(atomicReference, japaneseEraArr, japaneseEraArr2)) {
            return japaneseEra;
        }
        throw new DateTimeException("Only one additional Japanese era can be added");
    }

    public static JapaneseEra valueOf(String str) {
        crd.i(str, "japaneseEra");
        for (JapaneseEra japaneseEra : KNOWN_ERAS.get()) {
            if (str.equals(japaneseEra.name)) {
                return japaneseEra;
            }
        }
        throw new IllegalArgumentException("Era not found: " + str);
    }

    public static JapaneseEra[] values() {
        JapaneseEra[] japaneseEraArr = KNOWN_ERAS.get();
        return (JapaneseEra[]) Arrays.copyOf(japaneseEraArr, japaneseEraArr.length);
    }

    private Object writeReplace() {
        return new gwl((byte) 2, this);
    }

    public LocalDate endDate() {
        int iOrdinal = ordinal(this.eraValue);
        JapaneseEra[] japaneseEraArrValues = values();
        return iOrdinal >= japaneseEraArrValues.length + (-1) ? LocalDate.MAX : japaneseEraArrValues[iOrdinal + 1].startDate().minusDays(1L);
    }

    @Override // defpackage.ad8
    public int getValue() {
        return this.eraValue;
    }

    @Override // defpackage.sv5, defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        ChronoField chronoField = ChronoField.ERA;
        return z4pVar == chronoField ? JapaneseChronology.INSTANCE.range(chronoField) : super.range(z4pVar);
    }

    public LocalDate startDate() {
        return this.since;
    }

    public String toString() {
        return this.name;
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }
}
