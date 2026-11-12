package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.bp.ZoneOffset;

/* JADX INFO: loaded from: classes23.dex */
final class a implements Externalizable {
    public static final byte c = 1;
    public static final byte d = 2;
    public static final byte e = 3;
    private static final long serialVersionUID = -8885321777449118786L;
    private byte a;
    private Object b;

    public a() {
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

    private static Object c(byte b, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b == 1) {
            return b.f(dataInput);
        }
        if (b == 2) {
            return ZoneOffsetTransition.c(dataInput);
        }
        if (b == 3) {
            return ZoneOffsetTransitionRule.b(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    public static ZoneOffset e(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? ZoneOffset.ofTotalSeconds(dataInput.readInt()) : ZoneOffset.ofTotalSeconds(b * 900);
    }

    public static void f(Object obj, DataOutput dataOutput) throws IOException {
        h((byte) 1, obj, dataOutput);
    }

    public static void g(long j, DataOutput dataOutput) throws IOException {
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

    private static void h(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b == 1) {
            ((b) obj).g(dataOutput);
        } else if (b == 2) {
            ((ZoneOffsetTransition) obj).e(dataOutput);
        } else {
            if (b != 3) {
                throw new InvalidClassException("Unknown serialized type");
            }
            ((ZoneOffsetTransitionRule) obj).c(dataOutput);
        }
    }

    public static void i(ZoneOffset zoneOffset, DataOutput dataOutput) throws IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = c(b, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        h(this.a, this.b, objectOutput);
    }

    public a(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
