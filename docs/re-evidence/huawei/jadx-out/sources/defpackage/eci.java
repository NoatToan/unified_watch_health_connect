package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;

/* JADX INFO: loaded from: classes7.dex */
public class eci {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f32738c;

    public static void d() {
        byte[] bArrE = ecj.e();
        if (bArrE == null || bArrE.length == 0) {
            return;
        }
        int i = bArrE[0];
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = bArrE[((i2 + i) * 8) - 2];
        }
        for (int i3 = 0; i3 < i / 2; i3++) {
            byte b2 = bArr[i3];
            int i4 = (i - 1) - i3;
            bArr[i3] = bArr[i4];
            bArr[i4] = b2;
        }
        int length = ecj.a().length;
        byte[] bArr2 = new byte[length];
        for (int i5 = 0; i5 < ecj.a().length; i5++) {
            bArr2[i5] = ecj.a()[(ecj.a().length - 1) - i5];
        }
        byte[] bArrC = ecj.c(new StringBuilder(BaseApplication.getContext().getResources().getString(R.string.aes_kti_word_key2)).reverse().toString());
        int length2 = ecg.a().length;
        byte[] bArr3 = new byte[length2];
        for (int i6 = 0; i6 < ecg.a().length; i6++) {
            bArr3[i6] = ecg.a()[(ecg.a().length - 1) - i6];
        }
        byte[] bArr4 = new byte[bArrC.length + length + length2];
        byte[] bArr5 = new byte[16];
        byte[] bArr6 = new byte[32];
        System.arraycopy(bArr2, 0, bArr4, 0, length);
        System.arraycopy(bArrC, 0, bArr4, length, bArrC.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArrC.length, length2);
        System.arraycopy(bArr4, 0, bArr5, 0, 16);
        System.arraycopy(bArr4, 16, bArr6, 0, 32);
        try {
            f32738c = ecg.b(nio.a(bArr, bArr5, bArr6));
        } catch (Exception unused) {
            LogUtil.e("CommonPskUtil", "getPskFromSo get mPskData is exception");
            f32738c = ecg.b(new byte[0]);
        }
    }

    public static byte[] a() {
        byte[] bArr = f32738c;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }
}
