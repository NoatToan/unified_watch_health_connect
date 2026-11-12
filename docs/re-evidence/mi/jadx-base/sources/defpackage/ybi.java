package defpackage;

import androidx.annotation.RestrictTo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ybi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f40017a = {48, 49, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f40018b = {48, 49, 48, 0};
    public static final byte[] c = {48, 48, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, 0};
    public static final byte[] d = {48, 48, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, 0};
    public static final byte[] e = {48, 48, 49, 0};
    public static final byte[] f = {48, 48, 49, 0};
    public static final byte[] g = {48, 48, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 0};

    public static String a(byte[] bArr) {
        return (Arrays.equals(bArr, e) || Arrays.equals(bArr, d)) ? ":" : "!";
    }
}
