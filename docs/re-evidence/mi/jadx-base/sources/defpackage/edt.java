package defpackage;

import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class edt {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f16546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte f16547b;
        public byte c;

        public a(byte b2, byte b3, byte b4) {
            this.f16546a = b2;
            this.f16547b = b3;
            this.c = b4;
        }
    }

    public static void a(String str, String str2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        fileInputStream.read(new byte[2], 0, 2);
        fileInputStream.read(new byte[4], 0, 4);
        fileInputStream.read(new byte[4], 0, 4);
        fileInputStream.read(new byte[4], 0, 4);
        fileInputStream.read(new byte[4], 0, 4);
        byte[] bArr = new byte[4];
        fileInputStream.read(bArr, 0, 4);
        int iD = tet.d(bArr, 0, 4);
        byte[] bArr2 = new byte[4];
        fileInputStream.read(bArr2, 0, 4);
        int iD2 = tet.d(bArr2, 0, 4);
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
        for (int i = 0; i < iD * iD2; i++) {
            fileInputStream.read(bArr3, 0, 3);
            arrayList.add(new a(bArr3[0], bArr3[1], bArr3[2]));
        }
        byte[] bArr4 = new byte[EventRecurrence.TH];
        int i2 = 0;
        for (int i3 = 0; i3 < iD2; i3++) {
            for (int i4 = 0; i4 < iD; i4++) {
                a aVar = (a) arrayList.get((i3 * iD) + i4);
                int i5 = (((aVar.c & 255) >>> 3) << 11) + (((aVar.f16547b & 255) >>> 2) << 5) + ((aVar.f16546a & 255) >>> 3);
                int i6 = i2 + 1;
                bArr4[i2] = (byte) (i5 & 255);
                i2 += 2;
                bArr4[i6] = (byte) (i5 >>> 8);
            }
        }
        byte[] bArr5 = {66, 77, 0, 0, 0, 0, 0, 0, 0, 0, 66, 0, 0, 0, HMProSyncDataBaseProfile.DATA_SPO2_ODI, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 16, 0, 3, 0, 0, 0, 0, 0, 0, 0, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 11, 0, 0, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0, -32, 7, 0, 0, 31, 0, 0, 0};
        int i7 = ((((iD * 16) + 31) & (-32)) / 8) * iD2;
        System.arraycopy(tet.p(i7 + 66), 0, bArr5, 2, 4);
        System.arraycopy(tet.p(iD), 0, bArr5, 18, 4);
        System.arraycopy(tet.p(iD2), 0, bArr5, 22, 4);
        System.arraycopy(tet.p(i7), 0, bArr5, 34, 4);
        FileOutputStream fileOutputStream = new FileOutputStream(str2);
        fileOutputStream.write(bArr5, 0, 66);
        fileOutputStream.write(bArr4, 0, i7);
        fileOutputStream.close();
    }
}
