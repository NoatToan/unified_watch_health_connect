package com.xiaomi.hm.health.bt.profile.gdsp.spo2.p005extends;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2OsaData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 BI\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0015\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0018\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/extends/Spo2OsaDataExtends;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2OsaData;", "", "toString", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getVersion", "()I", "version", "", "e", "[B", "getSpo2High", "()[B", "spo2High", "f", "getSpo2Low", "spo2Low", "g", "getSignalQuality", "signalQuality", "h", "getExtend", "extend", "", "timeStamp", "spo2", "", "time", "<init>", "(IJIB[B[B[B[B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class Spo2OsaDataExtends extends Spo2OsaData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int VERSION = 2;
    private static final int i = 6;
    private static final int j = 6;
    private static final int k = 8;
    private static final int l = 4;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final byte[] spo2High;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final byte[] spo2Low;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final byte[] signalQuality;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final byte[] extend;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/extends/Spo2OsaDataExtends$Companion;", "", "", "values", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/extends/Spo2OsaDataExtends;", "parse", "", "EXTEND_SIZE", LogUtil.I, "OSA_SPO2_HIGH_SIZE", "OSA_SPO2_LOW_SIZE", "SIGNAL_QUALITY_SIZE", "VERSION", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final List<Spo2OsaDataExtends> parse(@NotNull byte[] values) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < values.length) {
                long jBytesToLong = GattUtils.bytesToLong(values, i, 4);
                int i2 = i + 4;
                int i3 = i2 + 1;
                byte b = values[i2];
                int i4 = i3 + 1;
                byte b2 = values[i3];
                byte[] bArr = new byte[6];
                System.arraycopy(values, i4, bArr, 0, 6);
                int i5 = i4 + 6;
                byte[] bArr2 = new byte[6];
                System.arraycopy(values, i5, bArr2, 0, 6);
                int i6 = i5 + 6;
                byte[] bArr3 = new byte[8];
                System.arraycopy(values, i6, bArr3, 0, 8);
                int i7 = i6 + 8;
                byte[] bArr4 = new byte[4];
                System.arraycopy(values, i7, bArr4, 0, 4);
                arrayList.add(new Spo2OsaDataExtends(2, jBytesToLong, b, b2, bArr, bArr2, bArr3, bArr4));
                i = i7 + 4;
            }
            return arrayList;
        }
    }

    public /* synthetic */ Spo2OsaDataExtends(int i2, long j2, int i3, byte b, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, j2, i3, b, bArr, bArr2, bArr3, bArr4);
    }

    @NotNull
    public final byte[] getExtend() {
        return this.extend;
    }

    @NotNull
    public final byte[] getSignalQuality() {
        return this.signalQuality;
    }

    @NotNull
    public final byte[] getSpo2High() {
        return this.spo2High;
    }

    @NotNull
    public final byte[] getSpo2Low() {
        return this.spo2Low;
    }

    public final int getVersion() {
        return this.version;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2OsaData
    @NotNull
    public String toString() {
        return "Spo2OsaDataExtends: \nversion: " + this.version + " \ntimeStamp: " + getTimeStamp() + " \nspo2: " + getSpo2() + " \ntime: " + ((int) getTime()) + " \nspo2high: " + ((Object) GattUtils.bytesToHexString(this.spo2High)) + " \nspo2Low: " + ((Object) GattUtils.bytesToHexString(this.spo2Low)) + " \nsignalQuality: " + ((Object) GattUtils.bytesToHexString(this.signalQuality)) + " \nextend: " + ((Object) GattUtils.bytesToHexString(this.extend));
    }

    public Spo2OsaDataExtends(int i2, long j2, int i3, byte b, @NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull byte[] bArr4) {
        super(j2, i3, b);
        this.version = i2;
        this.spo2High = bArr;
        this.spo2Low = bArr2;
        this.signalQuality = bArr3;
        this.extend = bArr4;
    }
}
