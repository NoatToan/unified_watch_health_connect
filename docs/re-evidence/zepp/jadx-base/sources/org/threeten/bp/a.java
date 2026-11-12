package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes23.dex */
final class a implements Externalizable {
    public static final byte c = 1;
    public static final byte d = 2;
    public static final byte e = 3;
    public static final byte f = 4;
    public static final byte g = 5;
    public static final byte h = 6;
    public static final byte i = 7;
    public static final byte j = 8;
    public static final byte k = 64;
    public static final byte l = 66;
    public static final byte m = 67;
    public static final byte n = 68;
    public static final byte o = 69;
    private static final long serialVersionUID = -7683839454370182990L;
    private byte a;
    private Object b;

    public a() {
    }

    public static Object a(DataInput dataInput) throws IOException {
        return b(dataInput.readByte(), dataInput);
    }

    private static Object b(byte b, DataInput dataInput) throws IOException {
        if (b == 64) {
            return MonthDay.a(dataInput);
        }
        switch (b) {
            case 1:
                return Duration.h(dataInput);
            case 2:
                return Instant.e(dataInput);
            case 3:
                return LocalDate.h(dataInput);
            case 4:
                return LocalDateTime.c(dataInput);
            case 5:
                return LocalTime.e(dataInput);
            case 6:
                return ZonedDateTime.c(dataInput);
            case 7:
                return b.e(dataInput);
            case 8:
                return ZoneOffset.e(dataInput);
            default:
                switch (b) {
                    case 66:
                        return OffsetTime.a(dataInput);
                    case 67:
                        return Year.a(dataInput);
                    case 68:
                        return YearMonth.b(dataInput);
                    case 69:
                        return OffsetDateTime.a(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    public static void c(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b == 64) {
            ((MonthDay) obj).b(dataOutput);
            return;
        }
        switch (b) {
            case 1:
                ((Duration) obj).j(dataOutput);
                return;
            case 2:
                ((Instant) obj).g(dataOutput);
                return;
            case 3:
                ((LocalDate) obj).j(dataOutput);
                return;
            case 4:
                ((LocalDateTime) obj).f(dataOutput);
                return;
            case 5:
                ((LocalTime) obj).f(dataOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).h(dataOutput);
                return;
            case 7:
                ((b) obj).f(dataOutput);
                return;
            case 8:
                ((ZoneOffset) obj).h(dataOutput);
                return;
            default:
                switch (b) {
                    case 66:
                        ((OffsetTime) obj).e(dataOutput);
                        return;
                    case 67:
                        ((Year) obj).b(dataOutput);
                        return;
                    case 68:
                        ((YearMonth) obj).e(dataOutput);
                        return;
                    case 69:
                        ((OffsetDateTime) obj).c(dataOutput);
                        return;
                    default:
                        throw new InvalidClassException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = b(b, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        c(this.a, this.b, objectOutput);
    }

    public a(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
