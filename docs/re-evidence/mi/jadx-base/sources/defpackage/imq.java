package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class imq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f21305a;

    static {
        Hashtable hashtable = new Hashtable();
        f21305a = hashtable;
        hashtable.put("SHA-1", rcd.b(128));
        hashtable.put("SHA-224", rcd.b(192));
        hashtable.put(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, rcd.b(256));
        hashtable.put("SHA-384", rcd.b(256));
        hashtable.put("SHA-512", rcd.b(256));
        hashtable.put("SHA-512/224", rcd.b(192));
        hashtable.put("SHA-512/256", rcd.b(256));
    }

    public static int a(aw6 aw6Var) {
        return ((Integer) f21305a.get(aw6Var.getAlgorithmName())).intValue();
    }

    public static int b(zye zyeVar) {
        String algorithmName = zyeVar.getAlgorithmName();
        return ((Integer) f21305a.get(algorithmName.substring(0, algorithmName.indexOf("/")))).intValue();
    }

    public static byte[] c(aw6 aw6Var, byte[] bArr, int i) {
        int i2 = (i + 7) / 8;
        byte[] bArr2 = new byte[i2];
        int iC = i2 / aw6Var.c();
        int iC2 = aw6Var.c();
        byte[] bArr3 = new byte[iC2];
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 <= iC; i5++) {
            aw6Var.update((byte) i3);
            aw6Var.update((byte) (i >> 24));
            aw6Var.update((byte) (i >> 16));
            aw6Var.update((byte) (i >> 8));
            aw6Var.update((byte) i);
            aw6Var.update(bArr, 0, bArr.length);
            aw6Var.doFinal(bArr3, 0);
            int i6 = i5 * iC2;
            int i7 = i2 - i6;
            if (i7 > iC2) {
                i7 = iC2;
            }
            System.arraycopy(bArr3, 0, bArr2, i6, i7);
            i3++;
        }
        int i8 = i % 8;
        if (i8 != 0) {
            int i9 = 8 - i8;
            int i10 = 0;
            while (i4 != i2) {
                int i11 = bArr2[i4] & 255;
                bArr2[i4] = (byte) ((i10 << (8 - i9)) | (i11 >>> i9));
                i4++;
                i10 = i11;
            }
        }
        return bArr2;
    }
}
