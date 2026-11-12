package defpackage;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class gdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f18871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18872b;
    public byte c;
    public ArrayList<String> d;
    public ArrayList<String> e;
    public ArrayList<String> f;
    public ArrayList<String> g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18873k;
    public String l;
    public String m;
    public WeightAdvData n;
    public String o;
    public qd p;
    public byte[] q;

    public gdt() {
        this.f18871a = null;
        this.f18872b = 0;
        this.c = (byte) 0;
        this.d = new ArrayList<>();
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = "";
        this.i = "";
        this.j = null;
        this.f18873k = "";
        this.l = "";
        this.m = "";
        this.n = null;
        this.o = "";
        this.p = qd.v;
        this.q = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0046. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33, types: [int] */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [int] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [int] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2, types: [int] */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [int] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [int] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [int] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [int] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29, types: [int] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    public static gdt b(byte[] bArr) {
        ?? r27;
        int length = bArr.length;
        gdt gdtVar = new gdt(bArr);
        ?? r3 = 0;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i3 == 0 || i3 + i2 > length) {
                return gdtVar;
            }
            int i4 = i + 2;
            byte b2 = bArr[i2];
            if (b2 != -1) {
                if (b2 == 1) {
                    r27 = r3;
                    i += 3;
                    byte b3 = bArr[i4];
                    gdtVar.c = b3;
                    if (t5t.o()) {
                        t5t.m("AdvData", "        flag: " + String.format("%02x", Byte.valueOf(b3)));
                    }
                } else if (b2 != 2) {
                    char c = 3;
                    if (b2 != 3) {
                        switch (b2) {
                            case 6:
                                StringBuilder sb = new StringBuilder();
                                int i5 = 0;
                                while (true) {
                                    i5 += 16;
                                    if (i5 <= i3) {
                                        byte[] bArr2 = new byte[16];
                                        int i6 = 0;
                                        while (i6 < 16) {
                                            bArr2[i6] = bArr[i4];
                                            i6++;
                                            i4++;
                                        }
                                        gdtVar.g.add(String.format("%02x%02x%02x%02x-%02x%02x-%02x%02x-%02x%02x-%02x%02x%02x%02x%02x%02x", Byte.valueOf(bArr2[15]), Byte.valueOf(bArr2[14]), Byte.valueOf(bArr2[13]), Byte.valueOf(bArr2[12]), Byte.valueOf(bArr2[11]), Byte.valueOf(bArr2[10]), Byte.valueOf(bArr2[9]), Byte.valueOf(bArr2[8]), Byte.valueOf(bArr2[7]), Byte.valueOf(bArr2[6]), Byte.valueOf(bArr2[5]), Byte.valueOf(bArr2[4]), Byte.valueOf(bArr2[3]), Byte.valueOf(bArr2[2]), Byte.valueOf(bArr2[1]), Byte.valueOf(bArr2[0])));
                                        sb.append(tet.x(bArr2));
                                        sb.append("; ");
                                    } else if (t5t.o()) {
                                        t5t.m("AdvData", "  (*)serv128: " + sb.toString());
                                    }
                                    break;
                                }
                                break;
                            case 7:
                                StringBuilder sb2 = new StringBuilder();
                                ?? r26 = r3;
                                while (true) {
                                    int i7 = r26 + 16;
                                    if (i7 <= i3) {
                                        byte[] bArr3 = new byte[16];
                                        int i8 = 0;
                                        while (i8 < 16) {
                                            bArr3[i8] = bArr[i4];
                                            i8++;
                                            i4++;
                                        }
                                        gdtVar.f.add(String.format("%02x%02x%02x%02x-%02x%02x-%02x%02x-%02x%02x-%02x%02x%02x%02x%02x%02x", Byte.valueOf(bArr3[15]), Byte.valueOf(bArr3[14]), Byte.valueOf(bArr3[13]), Byte.valueOf(bArr3[12]), Byte.valueOf(bArr3[11]), Byte.valueOf(bArr3[10]), Byte.valueOf(bArr3[9]), Byte.valueOf(bArr3[8]), Byte.valueOf(bArr3[7]), Byte.valueOf(bArr3[6]), Byte.valueOf(bArr3[5]), Byte.valueOf(bArr3[4]), Byte.valueOf(bArr3[c]), Byte.valueOf(bArr3[2]), Byte.valueOf(bArr3[1]), Byte.valueOf(bArr3[0])));
                                        sb2.append(tet.x(bArr3));
                                        sb2.append("; ");
                                        r26 = i7;
                                        c = 3;
                                    } else if (t5t.o()) {
                                        t5t.m("AdvData", "     serv128: " + sb2.toString());
                                    }
                                    break;
                                }
                                break;
                            case 8:
                                int i9 = i3 - 1;
                                byte[] bArr4 = new byte[i9];
                                for (?? r5 = r3; r5 < i9; r5++) {
                                    bArr4[r5] = bArr[i4];
                                    i4++;
                                }
                                String str = new String(bArr4, Charset.defaultCharset());
                                gdtVar.f18873k = str;
                                if (t5t.o()) {
                                    t5t.m("AdvData", "     (*)name: " + str);
                                }
                                r27 = r3;
                                break;
                            case 9:
                                int i10 = i3 - 1;
                                byte[] bArr5 = new byte[i10];
                                for (?? r6 = r3; r6 < i10; r6++) {
                                    bArr5[r6] = bArr[i4];
                                    i4++;
                                }
                                String str2 = new String(bArr5, Charset.defaultCharset());
                                gdtVar.j = str2;
                                if (t5t.o()) {
                                    t5t.m("AdvData", "        name: " + str2);
                                }
                                r27 = r3;
                                break;
                            case 10:
                                int i11 = i3 - 1;
                                byte[] bArr6 = new byte[i11];
                                for (?? r7 = r3; r7 < i11; r7++) {
                                    bArr6[r7] = bArr[i4];
                                    i4++;
                                }
                                String strX = tet.x(bArr6);
                                gdtVar.l = strX;
                                if (t5t.o()) {
                                    t5t.m("AdvData", "    tx level: " + strX);
                                }
                                r27 = r3;
                                break;
                            default:
                                switch (b2) {
                                    case 20:
                                        StringBuilder sb3 = new StringBuilder();
                                        ?? r8 = r3;
                                        while (true) {
                                            int i12 = r8 + 2;
                                            if (i12 > i3) {
                                                gdtVar.h = sb3.toString();
                                                if (t5t.o()) {
                                                    t5t.m("AdvData", "   solicit16: " + sb3.toString());
                                                }
                                            } else {
                                                byte[] bArr7 = new byte[2];
                                                for (?? r12 = r3; r12 < 2; r12++) {
                                                    bArr7[r12] = bArr[i4];
                                                    i4++;
                                                }
                                                sb3.append(tet.x(bArr7));
                                                sb3.append("; ");
                                                r8 = i12;
                                            }
                                            break;
                                        }
                                        break;
                                    case 21:
                                        StringBuilder sb4 = new StringBuilder();
                                        ?? r9 = r3;
                                        while (true) {
                                            int i13 = r9 + 16;
                                            if (i13 > i3) {
                                                gdtVar.i = sb4.toString();
                                                if (t5t.o()) {
                                                    t5t.m("AdvData", "  solicit128: " + sb4.toString());
                                                }
                                            } else {
                                                byte[] bArr8 = new byte[16];
                                                for (?? r11 = r3; r11 < 16; r11++) {
                                                    bArr8[r11] = bArr[i4];
                                                    i4++;
                                                }
                                                sb4.append(tet.x(bArr8));
                                                sb4.append("; ");
                                                r9 = i13;
                                            }
                                            break;
                                        }
                                        break;
                                    case 22:
                                        int i14 = i3 - 1;
                                        byte[] bArr9 = new byte[i14];
                                        for (?? r13 = r3; r13 < i14; r13++) {
                                            bArr9[r13] = bArr[i4];
                                            i4++;
                                        }
                                        if (i14 >= 3) {
                                            UUID uuidF = tet.F(String.format("%02X%02X", Byte.valueOf(bArr9[1]), Byte.valueOf(bArr9[r3])));
                                            if (jms.d0.equals(uuidF)) {
                                                int i15 = i3 - 3;
                                                byte[] bArr10 = new byte[i15];
                                                System.arraycopy(bArr9, 2, bArr10, r3, i15);
                                                gdtVar.n = ProfileUtils.parseBfsCategoryData(bArr10, r3, r3);
                                            } else if (jms.e0.equals(uuidF)) {
                                                int i16 = i3 - 3;
                                                byte[] bArr11 = new byte[i16];
                                                System.arraycopy(bArr9, 2, bArr11, r3, i16);
                                                gdtVar.n = ProfileUtils.parseWeightDataWithState(bArr11, r3, r3);
                                            } else if (i14 != 12) {
                                                gdtVar.n = ProfileUtils.parseWeightData(bArr9, r3, r3);
                                            } else if (vws.e0.equals(uuidF)) {
                                                int i17 = i3 - 3;
                                                byte[] bArr12 = new byte[i17];
                                                System.arraycopy(bArr9, 2, bArr12, r3, i17);
                                                gdtVar.n = ProfileUtils.parseWeightData(bArr12, r3, r3);
                                            } else {
                                                t5t.d("AdvData", "UUID is not UUID_SERVICE_WEIGHT_SCALE_SERVICE<181D>!!!");
                                            }
                                        }
                                        break;
                                    default:
                                        int i18 = i3 - 1;
                                        byte[] bArr13 = new byte[i18];
                                        for (?? r10 = r3; r10 < i18; r10++) {
                                            bArr13[r10] = bArr[i4];
                                            i4++;
                                        }
                                        gdtVar.o = String.format("[0x%02x]", Byte.valueOf(b2)) + ": " + tet.x(bArr13);
                                        if (t5t.o()) {
                                            t5t.m("AdvData", "      " + String.format("[0x%02x]", Byte.valueOf(b2)) + ": " + tet.x(bArr13));
                                        }
                                        break;
                                }
                                r27 = r3;
                                break;
                        }
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        int i19 = 0;
                        while (true) {
                            i19 += 2;
                            if (i19 <= i3) {
                                byte[] bArr14 = new byte[2];
                                int i20 = 0;
                                for (int i21 = 2; i20 < i21; i21 = 2) {
                                    bArr14[i20] = bArr[i4];
                                    i20++;
                                    i4++;
                                }
                                gdtVar.d.add(String.format("%02x%02x", Byte.valueOf(bArr14[1]), Byte.valueOf(bArr14[0])));
                                sb5.append(tet.x(bArr14));
                                sb5.append("; ");
                            } else if (t5t.o()) {
                                t5t.m("AdvData", "      serv16: " + sb5.toString());
                            }
                        }
                    }
                    i = i4;
                    r27 = 0;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    int i22 = 0;
                    while (true) {
                        i22 += 2;
                        if (i22 <= i3) {
                            byte[] bArr15 = new byte[2];
                            int i23 = 0;
                            while (i23 < 2) {
                                bArr15[i23] = bArr[i4];
                                i23++;
                                i4++;
                            }
                            gdtVar.e.add(String.format("%02x%02x", Byte.valueOf(bArr15[1]), Byte.valueOf(bArr15[0])));
                            sb6.append(tet.x(bArr15));
                            sb6.append("; ");
                        } else {
                            r27 = 0;
                            r27 = 0;
                            if (t5t.o()) {
                                t5t.m("AdvData", "   (*)serv16: " + sb6.toString());
                            }
                        }
                    }
                }
                r3 = r27;
            } else {
                ?? r28 = r3;
                int i24 = i3 - 1;
                byte[] bArr16 = new byte[i24];
                int i25 = r28 == true ? 1 : 0;
                while (i25 < i24) {
                    bArr16[i25] = bArr[i4];
                    i25++;
                    i4++;
                }
                String strX2 = tet.x(bArr16);
                gdtVar.m = strX2;
                r27 = r28;
                if (t5t.o()) {
                    t5t.m("AdvData", "    manufact: " + strX2);
                    r27 = r28;
                }
            }
            i = i4;
            r3 = r27;
        }
        return gdtVar;
    }

    public String a() {
        String strF = tet.f(this.f18871a);
        return !TextUtils.isEmpty(strF) ? strF : this.j;
    }

    public boolean c(UUID uuid) {
        Iterator<String> it = this.d.iterator();
        while (it.hasNext()) {
            if (tet.F(it.next()).equals(uuid)) {
                return true;
            }
        }
        Iterator<String> it2 = this.e.iterator();
        while (it2.hasNext()) {
            if (tet.F(it2.next()).equals(uuid)) {
                return true;
            }
        }
        Iterator<String> it3 = this.f.iterator();
        while (it3.hasNext()) {
            if (tet.D(it3.next()).equals(uuid)) {
                return true;
            }
        }
        Iterator<String> it4 = this.g.iterator();
        while (it4.hasNext()) {
            if (tet.D(it4.next()).equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return ((this.c >> 1) & 1) == 1;
    }

    public boolean e() {
        return (this.c & 1) == 1;
    }

    public void f() {
        t5t.d("printUUIDs", "serv16: " + this.d.toString());
        t5t.d("printUUIDs", "inServ16: " + this.e.toString());
        t5t.d("printUUIDs", "serv128: " + this.f.toString());
        t5t.d("printUUIDs", "inServ128: " + this.g.toString());
    }

    public String toString() {
        return "\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n[" + tet.f(this.f18871a) + "," + tet.A(this.f18871a) + "," + this.f18872b + "]\nflag:" + ((int) this.c) + "\nserv16:" + this.d + "\ninServ16:" + this.e + "\nserv128:" + this.f + "\ninServ128:" + this.g + "\nsolicit16:" + this.h + "\nsolicit128:" + this.i + "\nlocalName:" + this.j + "\nshortLocalName:" + this.f18873k + "\ntxLevel:" + this.l + "\nmanufact:" + this.m + "\nweightData:" + this.n + "\nother:" + this.o + "\ndeviceSource:" + this.p + "\nrawData:" + tet.x(this.q) + "\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
    }

    public gdt(byte[] bArr) {
        this.f18871a = null;
        this.f18872b = 0;
        this.c = (byte) 0;
        this.d = new ArrayList<>();
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = "";
        this.i = "";
        this.j = null;
        this.f18873k = "";
        this.l = "";
        this.m = "";
        this.n = null;
        this.o = "";
        this.p = qd.v;
        this.q = null;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.q = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
