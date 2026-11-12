package defpackage;

import android.text.TextUtils;
import com.xiaomi.EcoConnectPreference;
import com.xiaomi.eco.api.i;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class rd7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f32436a = new a();

    public class a implements b {
        @Override // rd7.b
        public void a(long j) {
            EcoConnectPreference.INSTANCE.setAPP_COUNT(j);
        }

        @Override // rd7.b
        public void b(long j) {
            EcoConnectPreference.INSTANCE.setDEVICE_COUNT(j);
        }
    }

    public interface b {
        void a(long j);

        void b(long j);
    }

    public static void a() {
        EcoConnectPreference ecoConnectPreference = EcoConnectPreference.INSTANCE;
        ecoConnectPreference.setAUTH_KEY("");
        ecoConnectPreference.setAPP_COUNT(0L);
        ecoConnectPreference.setDEVICE_COUNT(0L);
    }

    public static long b() {
        return EcoConnectPreference.INSTANCE.getLAST_CONNECT_TIME();
    }

    public static void c(i iVar) {
        EcoConnectPreference ecoConnectPreference = EcoConnectPreference.INSTANCE;
        String auth_key = ecoConnectPreference.getAUTH_KEY();
        if (TextUtils.isEmpty(auth_key)) {
            throw new IllegalArgumentException("");
        }
        String[] strArrSplit = auth_key.split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        if (strArrSplit.length < 4) {
            throw new IllegalArgumentException("");
        }
        iVar.updateCounter(new rq7(ecoConnectPreference.getAPP_COUNT(), ecoConnectPreference.getDEVICE_COUNT()));
        Logger.d("EcoAuthKeyManager", "restoreAuthKeys: " + Arrays.toString(strArrSplit));
        iVar.updateKeys(ByteUtil.stringToBytes(strArrSplit[0]), ByteUtil.stringToBytes(strArrSplit[1]), ByteUtil.stringToBytes(strArrSplit[2]), ByteUtil.stringToBytes(strArrSplit[3]));
    }

    public static void d(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, rq7 rq7Var) {
        String strByteToString = ByteUtil.byteToString(bArr);
        String strByteToString2 = ByteUtil.byteToString(bArr2);
        String strByteToString3 = ByteUtil.byteToString(bArr3);
        String strByteToString4 = ByteUtil.byteToString(bArr4);
        EcoConnectPreference ecoConnectPreference = EcoConnectPreference.INSTANCE;
        ecoConnectPreference.setLAST_CONNECT_TIME(j);
        ecoConnectPreference.setAUTH_KEY(strByteToString + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + strByteToString2 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + strByteToString3 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + strByteToString4);
    }
}
