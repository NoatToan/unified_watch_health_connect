package com.xiaomi.hm.health.bt.profile.gdsp.spo2;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.Constants;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2OsaEventData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "", "toString", "", "b", LogUtil.I, "getVersion", "()I", "version", "c", "getSpo2Decrease", "spo2Decrease", "", GoogleApiAvailabilityLight.a, "[B", "getSpo2", "()[B", "spo2", "e", "getHr", Constants.DATA_KEY_HR, "", "timeStamp", "<init>", "(IJI[B[B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class Spo2OsaEventData extends Spo2Data {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int VERSION = 2;
    private static final int f = 240;
    private static final int g = 240;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int spo2Decrease;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final byte[] spo2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final byte[] hr;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2OsaEventData$Companion;", "", "", "values", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2OsaEventData;", "parse", "", "HR_SIZE", LogUtil.I, "SPO2_SIZE", "VERSION", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final List<Spo2OsaEventData> parse(@NotNull byte[] values) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < values.length; i += 485) {
                long jBytesToLong = GattUtils.bytesToLong(values, i, 4);
                byte b = values[i + 4];
                byte[] bArr = new byte[240];
                System.arraycopy(values, i + 5, bArr, 0, 240);
                byte[] bArr2 = new byte[240];
                System.arraycopy(values, i + Constant.PLAIN_TEXT_MAX_LENGTH, bArr2, 0, 240);
                arrayList.add(new Spo2OsaEventData(2, jBytesToLong, b, bArr, bArr2));
            }
            return arrayList;
        }
    }

    public /* synthetic */ Spo2OsaEventData(int i, long j, int i2, byte[] bArr, byte[] bArr2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, j, i2, bArr, bArr2);
    }

    @NotNull
    public final byte[] getHr() {
        return this.hr;
    }

    @NotNull
    public final byte[] getSpo2() {
        return this.spo2;
    }

    public final int getSpo2Decrease() {
        return this.spo2Decrease;
    }

    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public String toString() {
        return "Spo2OsaEventData: \ntimeStamp: " + getTimeStamp() + " \nspo2Decrease: " + this.spo2Decrease + " \nspo2: " + ((Object) GattUtils.bytesToHexString(this.spo2)) + " \nhr: " + ((Object) GattUtils.bytesToHexString(this.hr));
    }

    public Spo2OsaEventData(int i, long j, int i2, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
        super(j);
        this.version = i;
        this.spo2Decrease = i2;
        this.spo2 = bArr;
        this.hr = bArr2;
    }
}
