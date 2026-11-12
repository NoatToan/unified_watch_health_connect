package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.bp.Duration;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.LocalTime;
import org.threeten.bp.MonthDay;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.OffsetTime;
import org.threeten.bp.Year;
import org.threeten.bp.YearMonth;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.a;

/* JADX INFO: loaded from: classes3.dex */
public final class iwl implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f22173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22174b;

    public iwl() {
    }

    public static Object a(DataInput dataInput) throws IOException {
        return b(dataInput.readByte(), dataInput);
    }

    public static Object b(byte b2, DataInput dataInput) throws IOException {
        if (b2 == 64) {
            return MonthDay.readExternal(dataInput);
        }
        switch (b2) {
            case 1:
                return Duration.readExternal(dataInput);
            case 2:
                return Instant.readExternal(dataInput);
            case 3:
                return LocalDate.readExternal(dataInput);
            case 4:
                return LocalDateTime.readExternal(dataInput);
            case 5:
                return LocalTime.readExternal(dataInput);
            case 6:
                return ZonedDateTime.readExternal(dataInput);
            case 7:
                return a.c(dataInput);
            case 8:
                return ZoneOffset.readExternal(dataInput);
            default:
                switch (b2) {
                    case 66:
                        return OffsetTime.readExternal(dataInput);
                    case 67:
                        return Year.readExternal(dataInput);
                    case 68:
                        return YearMonth.readExternal(dataInput);
                    case 69:
                        return OffsetDateTime.readExternal(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    public static void c(byte b2, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b2);
        if (b2 == 64) {
            ((MonthDay) obj).writeExternal(dataOutput);
            return;
        }
        switch (b2) {
            case 1:
                ((Duration) obj).writeExternal(dataOutput);
                return;
            case 2:
                ((Instant) obj).writeExternal(dataOutput);
                return;
            case 3:
                ((LocalDate) obj).writeExternal(dataOutput);
                return;
            case 4:
                ((LocalDateTime) obj).writeExternal(dataOutput);
                return;
            case 5:
                ((LocalTime) obj).writeExternal(dataOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).writeExternal(dataOutput);
                return;
            case 7:
                ((a) obj).writeExternal(dataOutput);
                return;
            case 8:
                ((ZoneOffset) obj).writeExternal(dataOutput);
                return;
            default:
                switch (b2) {
                    case 66:
                        ((OffsetTime) obj).writeExternal(dataOutput);
                        return;
                    case 67:
                        ((Year) obj).writeExternal(dataOutput);
                        return;
                    case 68:
                        ((YearMonth) obj).writeExternal(dataOutput);
                        return;
                    case 69:
                        ((OffsetDateTime) obj).writeExternal(dataOutput);
                        return;
                    default:
                        throw new InvalidClassException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.f22174b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte b2 = objectInput.readByte();
        this.f22173a = b2;
        this.f22174b = b(b2, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        c(this.f22173a, this.f22174b, objectOutput);
    }

    public iwl(byte b2, Object obj) {
        this.f22173a = b2;
        this.f22174b = obj;
    }
}
