package defpackage;

import com.careforeyou.library.bean.RoleInfo;
import com.google.common.base.Ascii;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class vy {
    private static byte a(byte b2, byte b3) {
        return (byte) (b2 == 1 ? b3 | 128 : b3 & Ascii.DEL);
    }

    private static byte c(byte b2, byte b3) {
        return (byte) (((byte) (b2 << 4)) | b3);
    }

    public static ArrayList<byte[]> d(ArrayList<vl> arrayList) {
        ArrayList<byte[]> arrayList2 = new ArrayList<>();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        char c2 = 2;
        if (arrayList.size() == 1) {
            vl vlVar = arrayList.get(0);
            byte[] bArr = new byte[20];
            bArr[0] = -54;
            bArr[1] = 17;
            bArr[2] = 16;
            bArr[3] = 16;
            bArr[4] = c((byte) 1, (byte) 1);
            wg.e(bArr, iCurrentTimeMillis, 5);
            bArr[9] = 0;
            bArr[10] = 0;
            wg.e(bArr, vlVar.f51277a, 11);
            bArr[15] = a(vlVar.f51278b, vlVar.f51279c);
            bArr[16] = vlVar.e;
            wg.b(bArr, vlVar.d, 17);
            bArr[19] = wg.d(bArr, 1, 18);
            arrayList2.add(bArr);
            return arrayList2;
        }
        int i = 6;
        int size = (arrayList.size() * 8) + 6;
        byte[] bArr2 = new byte[size];
        wg.e(bArr2, iCurrentTimeMillis, 0);
        bArr2[4] = 0;
        bArr2[5] = 0;
        for (vl vlVar2 : arrayList) {
            wg.e(bArr2, vlVar2.f51277a, i);
            bArr2[i + 4] = a(vlVar2.f51278b, vlVar2.f51279c);
            bArr2[i + 5] = vlVar2.e;
            wg.b(bArr2, vlVar2.d, i + 6);
            i += 8;
        }
        int i2 = size / 14;
        int i3 = 14;
        int i4 = size % 14;
        if (i4 > 0) {
            i2++;
        }
        int i5 = 0;
        while (i5 < i2) {
            int i6 = (i5 != i2 + (-1) || i4 == 0) ? i3 : i4;
            byte[] bArr3 = new byte[i6 + 6];
            bArr3[0] = -54;
            bArr3[1] = 17;
            bArr3[c2] = (byte) (i6 + 2);
            bArr3[3] = 16;
            int i7 = i5 + 1;
            bArr3[4] = c((byte) i7, (byte) i2);
            System.arraycopy(bArr2, i5 * 14, bArr3, 5, i6);
            bArr3[i6 + 5] = wg.d(bArr3, 1, i6 + 4);
            arrayList2.add(bArr3);
            i5 = i7;
            i3 = 14;
            c2 = 2;
        }
        return arrayList2;
    }

    public static byte[] b(int i, byte b2, byte b3, int i2) {
        byte[] bArr = new byte[20];
        String[] strArrSplit = new SimpleDateFormat("yy:MM:dd:HH:mm:ss", Locale.getDefault()).format(new Date(System.currentTimeMillis())).split(":");
        bArr[0] = -54;
        bArr[1] = 16;
        bArr[2] = 14;
        bArr[3] = 1;
        bArr[4] = (byte) (Integer.parseInt(strArrSplit[0]) & 255);
        bArr[5] = (byte) (Integer.parseInt(strArrSplit[1]) & 255);
        bArr[6] = (byte) (Integer.parseInt(strArrSplit[2]) & 255);
        bArr[7] = (byte) (Integer.parseInt(strArrSplit[3]) & 255);
        bArr[8] = (byte) (Integer.parseInt(strArrSplit[4]) & 255);
        bArr[9] = (byte) (Integer.parseInt(strArrSplit[5]) & 255);
        wg.e(bArr, i, 10);
        bArr[14] = (byte) (b2 & 255);
        bArr[15] = (byte) (i2 & 255);
        bArr[16] = (byte) (b3 & 255);
        bArr[17] = wg.d(bArr, 1, 16);
        bArr[18] = 0;
        bArr[19] = 0;
        return bArr;
    }

    public static byte[] c(RoleInfo roleInfo) {
        byte[] bArr = new byte[9];
        byte age = (byte) (roleInfo.getAge() & 255);
        byte sex = (byte) roleInfo.getSex();
        bArr[0] = -96;
        wg.e(bArr, roleInfo.getId(), 1);
        bArr[5] = a(sex, age);
        bArr[6] = (byte) (roleInfo.getHeight() & 255);
        wg.b(bArr, (short) (roleInfo.getWeight() * 10.0f), 7);
        return bArr;
    }
}
