package defpackage;

import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miuipub.internal.hybrid.SignUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes11.dex */
public class hds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f19965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static RSAPublicKey f19966b;

    static {
        byte[] bArr = {48, -127, -97, 48, HMProSyncDataBaseProfile.DATA_TYPE_PAI, 6, 9, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, -122, 72, -122, -9, HMProSyncDataBaseProfile.DATA_TYPE_PAI, 1, 1, 1, 5, 0, 3, -127, -115, 0, 48, -127, -119, 2, -127, -127, 0, -109, -38, -114, 26, -72, 78, 16, 70, -90, 113, -30, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, 85, -3, -43, 123, Base64.padSymbol, -98, 4, -16, 67, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, -90, -73, -5, -89, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, -27, 59, -123, 72, -73, -48, 49, HMProSyncDataBaseProfile.DATA_TYPE_PAI, 16, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, -27, -82, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, -28, 84, 0, -41, 16, 69, -39, 7, 82, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, 79, -37, HMProSyncDataBaseProfile.DATA_SPO2_ODI, 85, 107, 98, SettingsModule.VALUE_TYPE_STRING_ENUM, 123, -34, -49, 111, -11, 49, 28, 117, -74, 114, -122, -29, -84, 82, 22, -122, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, -40, -79, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, -116, -42, 101, -70, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 11, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -49, -3, -22, -2, 66, 90, -116, -75, -99, 34, 121, 69, 10, -81, -57, 89, -23, -36, -60, -81, 67, -114, 10, 79, 100, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, -24, 110, -66, -7, 87, 16, -125, -91, -43, -103, 67, -20, HMProSyncDataBaseProfile.DATA_STAND_HOUR, 117, -37, -11, 2, 3, 1, 0, 1};
        f19965a = bArr;
        try {
            f19966b = (RSAPublicKey) KeyFactory.getInstance(SignUtils.KEY_RSA).generatePublic(new X509EncodedKeySpec(bArr));
        } catch (Throwable unused) {
            x9s.D("rsa key pair init failure!!!");
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance(SignUtils.CIPHER_RSA);
            cipher.init(1, f19966b);
            return android.util.Base64.encodeToString(b(cipher, 1, str.getBytes("UTF-8"), f19966b.getModulus().bitLength()), 2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] b(Cipher cipher, int i, byte[] bArr, int i2) {
        if (cipher == null || bArr == null) {
            return null;
        }
        int i3 = i == 2 ? i2 / 8 : (i2 / 8) - 11;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i4 = 0;
            int i5 = 0;
            while (bArr.length > i4) {
                byte[] bArrDoFinal = bArr.length - i4 > i3 ? cipher.doFinal(bArr, i4, i3) : cipher.doFinal(bArr, i4, bArr.length - i4);
                byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                i5++;
                i4 = i5 * i3;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
