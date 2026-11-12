package defpackage;

import android.view.KeyEvent;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;

/* JADX INFO: loaded from: classes4.dex */
public class xsl extends qhh {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f39425k;
    public int l;
    public int m;
    public String n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39424b = "SendKeyData";
    public byte o = 0;
    public String p = null;
    public KeyEvent q = null;

    public xsl() {
    }

    public static byte[] e(byte b2, int i) {
        byte[] bArrD = p4q.d(i);
        byte[] bArr = new byte[5];
        bArr[0] = b2;
        System.arraycopy(bArrD, 0, bArr, 1, 4);
        return bArr;
    }

    public static byte[] f(byte b2, long j) {
        byte[] bArrE = p4q.e(j);
        byte[] bArr = new byte[9];
        bArr[0] = b2;
        System.arraycopy(bArrE, 0, bArr, 1, 8);
        return bArr;
    }

    public static byte[] g(byte b2, String str) {
        byte[] bytes = str != null ? str.getBytes() : new byte[0];
        byte[] bArrF = p4q.f((short) bytes.length);
        byte[] bArr = new byte[bytes.length + 3];
        bArr[0] = b2;
        System.arraycopy(bArrF, 0, bArr, 1, 2);
        System.arraycopy(bytes, 0, bArr, 3, bytes.length);
        return bArr;
    }

    public byte b() {
        return this.o;
    }

    public String c() {
        return this.p;
    }

    public final byte[] d() {
        byte[] bArrE = e((byte) 1, this.c);
        byte[] bArrE2 = e((byte) 2, this.d);
        byte[] bArrE3 = e((byte) 3, this.e);
        byte[] bArrE4 = e((byte) 4, this.f);
        byte[] bArrE5 = e((byte) 5, this.g);
        byte[] bArrE6 = e((byte) 6, this.h);
        byte[] bArrF = f((byte) 7, this.i);
        byte[] bArrF2 = f((byte) 8, this.j);
        byte[] bArrE7 = e((byte) 10, this.l);
        byte[] bArrE8 = e((byte) 11, this.m);
        byte[] bArrG = new byte[0];
        byte[] bArrG2 = new byte[0];
        String str = this.f39425k;
        if (str != null && str.length() > 0) {
            bArrG = g((byte) 9, this.f39425k);
        }
        String str2 = this.n;
        if (str2 != null && str2.length() > 0) {
            bArrG2 = g(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, this.n);
        }
        byte[] bArrD = l73.d(bArrE, bArrE2, bArrE3, bArrE4, bArrE5, bArrE6);
        this.f31524a = bArrD;
        byte[] bArrC = l73.c(bArrD, bArrF, bArrF2, bArrE7, bArrE8);
        this.f31524a = bArrC;
        this.f31524a = l73.b(bArrC, bArrG, bArrG2);
        voe.a(this.f39424b, "make send data success. len:" + this.f31524a.length);
        return this.f31524a;
    }

    public int h(byte[] bArr) {
        this.o = bArr[0];
        if (bArr.length > 1) {
            byte[] bArr2 = new byte[bArr.length - 1];
            System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
            this.p = new String(bArr2);
        }
        return 0;
    }

    public int i(byte[] bArr) {
        int i;
        int i2 = 0;
        while (i2 < bArr.length) {
            byte b2 = bArr[i2];
            voe.a(this.f39424b, "subcode:" + ((int) b2));
            switch (b2) {
                case 1:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(bArr, i2 + 1, bArr2, 0, 4);
                    this.c = p4q.a(bArr2);
                    voe.a(this.f39424b, "mMetaState:" + this.c);
                    i2 += 5;
                    break;
                case 2:
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(bArr, i2 + 1, bArr3, 0, 4);
                    this.d = p4q.a(bArr3);
                    voe.a(this.f39424b, "mAction:" + this.d);
                    i2 += 5;
                    break;
                case 3:
                    byte[] bArr4 = new byte[4];
                    System.arraycopy(bArr, i2 + 1, bArr4, 0, 4);
                    this.e = p4q.a(bArr4);
                    voe.a(this.f39424b, "mKeyCode:" + this.e);
                    i2 += 5;
                    break;
                case 4:
                    byte[] bArr5 = new byte[4];
                    System.arraycopy(bArr, i2 + 1, bArr5, 0, 4);
                    this.f = p4q.a(bArr5);
                    voe.a(this.f39424b, "mScanCode:" + this.f);
                    i2 += 5;
                    break;
                case 5:
                    byte[] bArr6 = new byte[4];
                    System.arraycopy(bArr, i2 + 1, bArr6, 0, 4);
                    this.g = p4q.a(bArr6);
                    voe.a(this.f39424b, "mRepeatCount:" + this.g);
                    i2 += 5;
                    break;
                case 6:
                    byte[] bArr7 = new byte[4];
                    System.arraycopy(bArr, i2 + 1, bArr7, 0, 4);
                    this.h = p4q.a(bArr7);
                    voe.a(this.f39424b, "mFlags:" + this.h);
                    i2 += 5;
                    break;
                case 7:
                    byte[] bArr8 = new byte[8];
                    System.arraycopy(bArr, i2 + 1, bArr8, 0, 8);
                    this.i = p4q.b(bArr8);
                    voe.a(this.f39424b, "mDownTime:" + this.i);
                    i2 += 9;
                    break;
                case 8:
                    byte[] bArr9 = new byte[8];
                    System.arraycopy(bArr, i2 + 1, bArr9, 0, 8);
                    this.j = p4q.b(bArr9);
                    voe.a(this.f39424b, "mEventTime:" + this.j);
                    i2 += 9;
                    break;
                case 9:
                    voe.a(this.f39424b, "to parse charaters, i:" + i2);
                    byte[] bArr10 = new byte[2];
                    System.arraycopy(bArr, i2 + 1, bArr10, 0, 2);
                    int iC = p4q.c(bArr10);
                    voe.a(this.f39424b, "characters len:" + iC);
                    int i3 = i2 + 3;
                    if (iC < 0) {
                        voe.b(this.f39424b, "invalid data length error during parsing characters");
                        return -1;
                    }
                    i = iC + i3;
                    if (i > bArr.length) {
                        voe.b(this.f39424b, "data length error during parsing characters");
                        return -1;
                    }
                    byte[] bArr11 = new byte[iC];
                    System.arraycopy(bArr, i3, bArr11, 0, iC);
                    this.f39425k = new String(bArr11);
                    i2 = i;
                    break;
                case 10:
                    byte[] bArr12 = new byte[4];
                    System.arraycopy(bArr, i2 + 1, bArr12, 0, 4);
                    this.l = p4q.a(bArr12);
                    voe.a(this.f39424b, "mDeviceId:" + this.l);
                    i2 += 5;
                    break;
                case 11:
                    byte[] bArr13 = new byte[4];
                    System.arraycopy(bArr, i2 + 1, bArr13, 0, 4);
                    this.m = p4q.a(bArr13);
                    voe.a(this.f39424b, "mSource:" + this.m);
                    i2 += 5;
                    break;
                case 12:
                    voe.a(this.f39424b, "to parse extra, i:" + i2);
                    byte[] bArr14 = new byte[2];
                    System.arraycopy(bArr, i2 + 1, bArr14, 0, 2);
                    int iC2 = p4q.c(bArr14);
                    voe.a(this.f39424b, "extra len:" + iC2);
                    int i4 = i2 + 3;
                    if (iC2 < 0) {
                        voe.b(this.f39424b, "invalid data length error during parsing extra");
                        return -1;
                    }
                    i = iC2 + i4;
                    if (i > bArr.length) {
                        voe.b(this.f39424b, "data length error during parsing extra");
                        return -1;
                    }
                    byte[] bArr15 = new byte[iC2];
                    System.arraycopy(bArr, i4, bArr15, 0, iC2);
                    this.f39425k = new String(bArr15);
                    i2 = i;
                    break;
                default:
                    voe.b(this.f39424b, "subcode error");
                    return -1;
            }
        }
        this.q = new KeyEvent(this.i, this.j, this.d, this.e, this.g, this.c, this.l, this.f, this.h, this.m);
        voe.a(this.f39424b, "parse send data success.");
        return 0;
    }

    public xsl(KeyEvent keyEvent, String str) {
        this.c = keyEvent.getMetaState();
        this.d = keyEvent.getAction();
        this.e = keyEvent.getKeyCode();
        this.f = keyEvent.getScanCode();
        this.g = keyEvent.getRepeatCount();
        this.h = keyEvent.getFlags();
        this.i = keyEvent.getDownTime();
        this.j = keyEvent.getEventTime();
        this.f39425k = keyEvent.getCharacters();
        this.l = keyEvent.getDeviceId();
        this.m = keyEvent.getSource();
        this.n = str;
        d();
    }
}
