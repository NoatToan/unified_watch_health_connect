package com.huami.watchfacesstore.device.process;

import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class BmpConverter {

    public static class a {
        public byte a;
        public byte b;
        public byte c;

        public a(byte b, byte g, byte r) {
            this.a = b;
            this.b = g;
            this.c = r;
        }
    }

    public static void writeBmp565(String srcFile, String dstFilePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(srcFile));
        fileInputStream.read(new byte[2], 0, 2);
        fileInputStream.read(new byte[4], 0, 4);
        fileInputStream.read(new byte[4], 0, 4);
        fileInputStream.read(new byte[4], 0, 4);
        fileInputStream.read(new byte[4], 0, 4);
        byte[] bArr = new byte[4];
        fileInputStream.read(bArr, 0, 4);
        int iBytesToInt = GattUtils.bytesToInt(bArr, 0, 4);
        byte[] bArr2 = new byte[4];
        fileInputStream.read(bArr2, 0, 4);
        int iBytesToInt2 = GattUtils.bytesToInt(bArr2, 0, 4);
        fileInputStream.read(new byte[2], 0, 2);
        fileInputStream.read(new byte[2], 0, 2);
        fileInputStream.read(new byte[4], 0, 4);
        fileInputStream.read(new byte[4], 0, 4);
        fileInputStream.read(new byte[4], 0, 4);
        fileInputStream.read(new byte[4], 0, 4);
        fileInputStream.read(new byte[4], 0, 4);
        fileInputStream.read(new byte[4], 0, 4);
        ArrayList arrayList = new ArrayList();
        byte[] bArr3 = new byte[3];
        for (int i = 0; i < iBytesToInt * iBytesToInt2; i++) {
            fileInputStream.read(bArr3, 0, 3);
            arrayList.add(new a(bArr3[0], bArr3[1], bArr3[2]));
        }
        byte[] bArr4 = new byte[1048576];
        int i2 = 0;
        for (int i3 = 0; i3 < iBytesToInt2; i3++) {
            for (int i4 = 0; i4 < iBytesToInt; i4++) {
                a aVar = (a) arrayList.get((i3 * iBytesToInt) + i4);
                int i5 = (((aVar.c & 255) >>> 3) << 11) + (((aVar.b & 255) >>> 2) << 5) + ((aVar.a & 255) >>> 3);
                int i6 = i2 + 1;
                bArr4[i2] = (byte) (i5 & 255);
                i2 = i6 + 1;
                bArr4[i6] = (byte) (i5 >>> 8);
            }
        }
        byte[] bArr5 = {org.threeten.bp.a.l, 77, 0, 0, 0, 0, 0, 0, 0, 0, org.threeten.bp.a.l, 0, 0, 0, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 16, 0, 3, 0, 0, 0, 0, 0, 0, 0, 18, 11, 0, 0, 18, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0, MiLiProProfile.ECF_COMMAND_SET_SPORT_TYPE_SORT, 7, 0, 0, 31, 0, 0, 0};
        int i7 = ((((iBytesToInt * 16) + 31) & (-32)) / 8) * iBytesToInt2;
        System.arraycopy(GattUtils.intToBytes(i7 + 66), 0, bArr5, 2, 4);
        System.arraycopy(GattUtils.intToBytes(iBytesToInt), 0, bArr5, 18, 4);
        System.arraycopy(GattUtils.intToBytes(iBytesToInt2), 0, bArr5, 22, 4);
        System.arraycopy(GattUtils.intToBytes(i7), 0, bArr5, 34, 4);
        FileOutputStream fileOutputStream = new FileOutputStream(dstFilePath);
        fileOutputStream.write(bArr5, 0, 66);
        fileOutputStream.write(bArr4, 0, i7);
        fileOutputStream.close();
    }
}
