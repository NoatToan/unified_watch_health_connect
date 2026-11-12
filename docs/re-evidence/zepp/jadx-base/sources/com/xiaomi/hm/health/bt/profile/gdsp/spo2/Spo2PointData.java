package com.xiaomi.hm.health.bt.profile.gdsp.spo2;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2PointData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "", "toString", "", "b", LogUtil.I, "getSpo2", "()I", "spo2", "", "timeStamp", "<init>", "(JI)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class Spo2PointData extends Spo2Data {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int VERSION = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int spo2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2PointData$Companion;", "", "", "values", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2PointData;", "parse", "", "VERSION", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final List<Spo2PointData> parse(@NotNull byte[] values) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < values.length; i += 5) {
                arrayList.add(new Spo2PointData(GattUtils.bytesToLong(values, i, 4), values[i + 4]));
            }
            return arrayList;
        }
    }

    public Spo2PointData(long j, int i) {
        super(j);
        this.spo2 = i;
    }

    public final int getSpo2() {
        return this.spo2;
    }

    @NotNull
    public String toString() {
        return "Spo2PointData: \ntimeStamp: " + getTimeStamp() + " \nspo2: " + this.spo2;
    }
}
