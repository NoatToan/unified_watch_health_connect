package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class qos {
    public static final short[] f = {160, 450, 160, 450, 160, 700, 160, 450, 160, 450, 160, 700, 400, 350, 400, 350, 400, 350, 400, 350};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f31703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short[] f31704b;
    public boolean c;
    public boolean d;
    public short e;

    public qos(short s, short[] sArr) {
        this.c = false;
        this.d = false;
        this.f31703a = s;
        this.f31704b = sArr;
    }

    public static qos a(int i) {
        qos qosVar = new qos();
        qosVar.f31704b = new short[0];
        qosVar.c = false;
        qosVar.f31703a = (short) -1;
        qosVar.d = false;
        qosVar.e = (short) i;
        return qosVar;
    }

    public static qos b(short[] sArr) {
        qos qosVar = new qos();
        qosVar.c = true;
        qosVar.d = true;
        qosVar.f31704b = sArr;
        return qosVar;
    }

    public byte[] c() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(this.e);
            byteArrayOutputStream.write((byte) (((this.f31704b.length + 1) / 2) | (this.c ? 128 : 0) | (this.d ? 64 : 0)));
            for (short s : this.f31704b) {
                byteArrayOutputStream.write(s);
                byteArrayOutputStream.write(s >> 8);
            }
            if (this.f31704b.length % 2 == 1) {
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            t5t.d("HMVibrateInfo", "toBleBytes: " + e);
            return null;
        }
    }

    public byte[] d() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(this.e);
            byteArrayOutputStream.write(c3.a(this.d));
            byteArrayOutputStream.write(c3.a(this.c));
            byteArrayOutputStream.write((this.f31704b.length + 1) / 2);
            for (short s : this.f31704b) {
                byteArrayOutputStream.write(s);
                byteArrayOutputStream.write(s >> 8);
            }
            if (this.f31704b.length % 2 == 1) {
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            t5t.d("HMVibrateInfo", "toModuleBleBytes: " + e);
            return null;
        }
    }

    public String toString() {
        return "HMVibrateInfo:\n id: " + ((int) this.f31703a) + "\n test: " + this.c + "\n useCustomVibrate: " + this.d + "\n times, length: " + this.f31704b.length + ", value: " + Arrays.toString(this.f31704b) + "\n type: " + ((int) this.e);
    }

    public qos() {
        this.f31703a = (short) -1;
        this.c = false;
        this.d = false;
    }
}
