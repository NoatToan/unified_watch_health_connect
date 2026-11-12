package com.xiaomi.hm.health.bt.profile.gdsp.spo2.p005extends;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2PointData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/extends/Spo2PointDataExtends;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2PointData;", "", "toString", "", "c", LogUtil.I, "getVersion", "()I", "version", "", GoogleApiAvailabilityLight.a, "[B", "getSpo2History", "()[B", "spo2History", "", "timeStamp", "spo2", "<init>", "(IJI[B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class Spo2PointDataExtends extends Spo2PointData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int VERSION = 2;
    private static final int e = 60;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final byte[] spo2History;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/extends/Spo2PointDataExtends$Companion;", "", "", "values", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/extends/Spo2PointDataExtends;", "parse", "", "POINT_SPO2_SIZE", LogUtil.I, "VERSION", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final List<Spo2PointDataExtends> parse(@NotNull byte[] values) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < values.length; i += 65) {
                long jBytesToLong = GattUtils.bytesToLong(values, i, 4);
                byte b = values[i + 4];
                byte[] bArr = new byte[60];
                System.arraycopy(values, i + 5, bArr, 0, 60);
                arrayList.add(new Spo2PointDataExtends(2, jBytesToLong, b, bArr));
            }
            return arrayList;
        }
    }

    public Spo2PointDataExtends(int i, long j, int i2, @NotNull byte[] bArr) {
        super(j, i2);
        this.version = i;
        this.spo2History = bArr;
    }

    @NotNull
    public final byte[] getSpo2History() {
        return this.spo2History;
    }

    public final int getVersion() {
        return this.version;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2PointData
    @NotNull
    public String toString() {
        return "Spo2PointDataExtends: \nversion: " + this.version + " \ntimeStamp: " + getTimeStamp() + " \nspo2: " + getSpo2() + " \nspo2History: " + ((Object) GattUtils.bytesToHexString(this.spo2History));
    }
}
