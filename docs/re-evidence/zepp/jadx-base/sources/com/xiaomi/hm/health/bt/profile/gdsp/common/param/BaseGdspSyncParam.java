package com.xiaomi.hm.health.bt.profile.gdsp.common.param;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.common.data.DataReturnTime;
import com.xiaomi.hm.health.bt.profile.gdsp.common.filter.IGdspHeaderFilter;
import com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b=\u0010>J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J#\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001eR\"\u0010&\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u00100\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00028\u0000098&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/param/BaseGdspSyncParam;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/filter/IGdspHeaderFilter;", "getHeadFilters", "", "isNewGdspSync", "isDataReturnOnLoop", "isDataReturnOnFinish", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "data", "Ljava/util/Calendar;", "getStartSyncTime", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;Ljava/lang/Object;)Ljava/util/Calendar;", "a", "Ljava/util/Calendar;", "getStartTime", "()Ljava/util/Calendar;", "startTime", "", "b", LogUtil.I, "getType", "()I", "type", "c", "getGdspVersion", "setGdspVersion", "(I)V", "gdspVersion", GoogleApiAvailabilityLight.a, "getRetryCount", "setRetryCount", "retryCount", "e", "Z", "isLoop", "()Z", "setLoop", "(Z)V", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "f", "Lkotlin/jvm/functions/Function1;", "getGetErrorCodeTrans", "()Lkotlin/jvm/functions/Function1;", "getErrorCodeTrans", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "g", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "getDataReturnTime", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;", "setDataReturnTime", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/DataReturnTime;)V", "dataReturnTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "getDataReceiver", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "dataReceiver", "<init>", "(Ljava/util/Calendar;II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseGdspSyncParam<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Calendar startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int gdspVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int retryCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isLoop;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final Function1<GDSPErrorCode, GDSPErrorCode> getErrorCodeTrans;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private DataReturnTime dataReturnTime;

    public BaseGdspSyncParam(@NotNull Calendar calendar, int i, int i2) {
        this.startTime = calendar;
        this.type = i;
        this.gdspVersion = i2;
        this.retryCount = 3;
        this.isLoop = true;
        this.dataReturnTime = DataReturnTime.ON_FINISH.INSTANCE;
    }

    @NotNull
    public abstract IGdspDataReceiver<T> getDataReceiver();

    @NotNull
    public DataReturnTime getDataReturnTime() {
        return this.dataReturnTime;
    }

    public final int getGdspVersion() {
        return this.gdspVersion;
    }

    @Nullable
    public Function1<GDSPErrorCode, GDSPErrorCode> getGetErrorCodeTrans() {
        return this.getErrorCodeTrans;
    }

    @NotNull
    public List<IGdspHeaderFilter> getHeadFilters() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    @Nullable
    public abstract Calendar getStartSyncTime(@Nullable DataHeader header, T data);

    @NotNull
    public final Calendar getStartTime() {
        return this.startTime;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isDataReturnOnFinish() {
        return Intrinsics.areEqual(getDataReturnTime(), DataReturnTime.ON_FINISH.INSTANCE);
    }

    public final boolean isDataReturnOnLoop() {
        return Intrinsics.areEqual(getDataReturnTime(), DataReturnTime.ON_LOOP.INSTANCE);
    }

    /* JADX INFO: renamed from: isLoop, reason: from getter */
    public boolean getIsLoop() {
        return this.isLoop;
    }

    public final boolean isNewGdspSync() {
        return this.gdspVersion == 1;
    }

    public void setDataReturnTime(@NotNull DataReturnTime dataReturnTime) {
        this.dataReturnTime = dataReturnTime;
    }

    public final void setGdspVersion(int i) {
        this.gdspVersion = i;
    }

    public void setLoop(boolean z) {
        this.isLoop = z;
    }

    public void setRetryCount(int i) {
        this.retryCount = i;
    }

    public /* synthetic */ BaseGdspSyncParam(Calendar calendar, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Calendar.getInstance() : calendar, i, (i3 & 4) != 0 ? 0 : i2);
    }
}
