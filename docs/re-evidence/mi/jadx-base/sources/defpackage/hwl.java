package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.zone.ZoneOffsetTransition;
import org.threeten.bp.zone.ZoneOffsetTransitionRule;

/* JADX INFO: loaded from: classes3.dex */
public final class hwl implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f20546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20547b;

    public hwl() {
    }

    public static Object a(DataInput dataInput) throws IOException, ClassNotFoundException {
        return c(dataInput.readByte(), dataInput);
    }

    public static long b(DataInput dataInput) throws IOException {
        int i = dataInput.readByte() & 255;
        if (i == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    public static Object c(byte b2, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b2 == 1) {
            return pbo.n(dataInput);
        }
        if (b2 == 2) {
            return ZoneOffsetTransition.readExternal(dataInput);
        }
        if (b2 == 3) {
            return ZoneOffsetTransitionRule.readExternal(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    public static ZoneOffset d(DataInput dataInput) throws IOException {
        byte b2 = dataInput.readByte();
        return b2 == 127 ? ZoneOffset.ofTotalSeconds(dataInput.readInt()) : ZoneOffset.ofTotalSeconds(b2 * 900);
    }

    public static void e(long j, DataOutput dataOutput) throws IOException {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j);
        } else {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
        }
    }

    public static void f(byte b2, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b2);
        if (b2 == 1) {
            ((pbo) obj).o(dataOutput);
        } else if (b2 == 2) {
            ((ZoneOffsetTransition) obj).writeExternal(dataOutput);
        } else {
            if (b2 != 3) {
                throw new InvalidClassException("Unknown serialized type");
            }
            ((ZoneOffsetTransitionRule) obj).writeExternal(dataOutput);
        }
    }

    public static void g(ZoneOffset zoneOffset, DataOutput dataOutput) throws IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    private Object readResolve() {
        return this.f20547b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte b2 = objectInput.readByte();
        this.f20546a = b2;
        this.f20547b = c(b2, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        f(this.f20546a, this.f20547b, objectOutput);
    }

    public hwl(byte b2, Object obj) {
        this.f20546a = b2;
        this.f20547b = obj;
    }
}
