package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.bp.chrono.HijrahDate;
import org.threeten.bp.chrono.HijrahEra;
import org.threeten.bp.chrono.JapaneseDate;
import org.threeten.bp.chrono.JapaneseEra;
import org.threeten.bp.chrono.MinguoDate;
import org.threeten.bp.chrono.MinguoEra;
import org.threeten.bp.chrono.ThaiBuddhistDate;
import org.threeten.bp.chrono.ThaiBuddhistEra;
import org.threeten.bp.chrono.b;

/* JADX INFO: loaded from: classes3.dex */
public final class gwl implements Externalizable {
    private static final long serialVersionUID = 7857518227608961174L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f19402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19403b;

    public gwl() {
    }

    public static Object a(byte b2, ObjectInput objectInput) throws IOException, ClassNotFoundException {
        switch (b2) {
            case 1:
                return JapaneseDate.readExternal(objectInput);
            case 2:
                return JapaneseEra.readExternal(objectInput);
            case 3:
                return HijrahDate.readExternal(objectInput);
            case 4:
                return HijrahEra.readExternal(objectInput);
            case 5:
                return MinguoDate.readExternal(objectInput);
            case 6:
                return MinguoEra.readExternal(objectInput);
            case 7:
                return ThaiBuddhistDate.readExternal(objectInput);
            case 8:
                return ThaiBuddhistEra.readExternal(objectInput);
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                return b.readExternal(objectInput);
            case 12:
                return wv3.n(objectInput);
            case 13:
                return aw3.d(objectInput);
        }
    }

    public static void b(byte b2, Object obj, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(b2);
        switch (b2) {
            case 1:
                ((JapaneseDate) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((JapaneseEra) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((HijrahDate) obj).writeExternal(objectOutput);
                return;
            case 4:
                ((HijrahEra) obj).writeExternal(objectOutput);
                return;
            case 5:
                ((MinguoDate) obj).writeExternal(objectOutput);
                return;
            case 6:
                ((MinguoEra) obj).writeExternal(objectOutput);
                return;
            case 7:
                ((ThaiBuddhistDate) obj).writeExternal(objectOutput);
                return;
            case 8:
                ((ThaiBuddhistEra) obj).writeExternal(objectOutput);
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                ((b) obj).writeExternal(objectOutput);
                return;
            case 12:
                ((wv3) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((aw3) obj).writeExternal(objectOutput);
                return;
        }
    }

    private Object readResolve() {
        return this.f19403b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte b2 = objectInput.readByte();
        this.f19402a = b2;
        this.f19403b = a(b2, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        b(this.f19402a, this.f19403b, objectOutput);
    }

    public gwl(byte b2, Object obj) {
        this.f19402a = b2;
        this.f19403b = obj;
    }
}
