package defpackage;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.wearable.utils.ByteUtil;
import com.xiaomi.wearable.utils.SharedPreferencesUtil;

/* JADX INFO: loaded from: classes2.dex */
public class sq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f33878a = new a();

    public class a implements b {
        @Override // sq1.b
        public void a(long j) {
            SharedPreferencesUtil.INSTANCE.setLong("appCount", j);
        }

        @Override // sq1.b
        public void b(long j) {
            SharedPreferencesUtil.INSTANCE.setLong("deviceCount", j);
        }
    }

    public interface b {
        void a(long j);

        void b(long j);
    }

    public static void a() {
        SharedPreferencesUtil sharedPreferencesUtil = SharedPreferencesUtil.INSTANCE;
        sharedPreferencesUtil.setString("auth_key", "");
        sharedPreferencesUtil.setLong("appCount", 0L);
        sharedPreferencesUtil.setLong("deviceCount", 0L);
    }

    public static long b() {
        return SharedPreferencesUtil.INSTANCE.getLong("last_connect_time", 0L);
    }

    public static void c(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, q45 q45Var) {
        String strByteToString = ByteUtil.byteToString(bArr);
        String strByteToString2 = ByteUtil.byteToString(bArr2);
        String strByteToString3 = ByteUtil.byteToString(bArr3);
        String strByteToString4 = ByteUtil.byteToString(bArr4);
        SharedPreferencesUtil sharedPreferencesUtil = SharedPreferencesUtil.INSTANCE;
        sharedPreferencesUtil.setLong("last_connect_time", j);
        sharedPreferencesUtil.setString("auth_key", strByteToString + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + strByteToString2 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + strByteToString3 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + strByteToString4);
    }
}
