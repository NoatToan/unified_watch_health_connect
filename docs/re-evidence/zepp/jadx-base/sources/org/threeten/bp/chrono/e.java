package org.threeten.bp.chrono;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes23.dex */
final class e implements Externalizable {
    public static final byte c = 1;
    public static final byte d = 2;
    public static final byte e = 3;
    public static final byte f = 4;
    public static final byte g = 5;
    public static final byte h = 6;
    public static final byte i = 7;
    public static final byte j = 8;
    public static final byte k = 11;
    public static final byte l = 12;
    public static final byte m = 13;
    private static final long serialVersionUID = 7857518227608961174L;
    private byte a;
    private Object b;

    public e() {
    }

    public static Object a(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return b(objectInput.readByte(), objectInput);
    }

    private static Object b(byte b, ObjectInput objectInput) throws IOException, ClassNotFoundException {
        switch (b) {
            case 1:
                return JapaneseDate.q(objectInput);
            case 2:
                return JapaneseEra.e(objectInput);
            case 3:
                return HijrahDate.R(objectInput);
            case 4:
                return HijrahEra.b(objectInput);
            case 5:
                return MinguoDate.p(objectInput);
            case 6:
                return MinguoEra.a(objectInput);
            case 7:
                return ThaiBuddhistDate.p(objectInput);
            case 8:
                return ThaiBuddhistEra.a(objectInput);
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                return Chronology.f(objectInput);
            case 12:
                return b.j(objectInput);
            case 13:
                return d.e(objectInput);
        }
    }

    private static void c(byte b, Object obj, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((JapaneseDate) obj).u(objectOutput);
                return;
            case 2:
                ((JapaneseEra) obj).g(objectOutput);
                return;
            case 3:
                ((HijrahDate) obj).T(objectOutput);
                return;
            case 4:
                ((HijrahEra) obj).c(objectOutput);
                return;
            case 5:
                ((MinguoDate) obj).r(objectOutput);
                return;
            case 6:
                ((MinguoEra) obj).b(objectOutput);
                return;
            case 7:
                ((ThaiBuddhistDate) obj).r(objectOutput);
                return;
            case 8:
                ((ThaiBuddhistEra) obj).b(objectOutput);
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                ((Chronology) obj).i(objectOutput);
                return;
            case 12:
                ((b) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((d) obj).writeExternal(objectOutput);
                return;
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = b(b, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        c(this.a, this.b, objectOutput);
    }

    public e(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
