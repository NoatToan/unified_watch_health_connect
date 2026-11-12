package com.xiaomi.fitness.data.model;

import android.content.Context;
import android.content.res.Resources;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.util.ActiveStageItemExKt;
import defpackage.pz6;
import defpackage.qxi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/data/model/DataActiveModel;", "", "activeModeInfo", "Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;", "sportDataType", "", "<init>", "(Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;I)V", "getActiveModeInfo", "()Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;", "setActiveModeInfo", "(Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;)V", "getSportDataType", "()I", "setSportDataType", "(I)V", "isDayFirstData", "", "isDayEndData", "startTime", "", "endTime", "getEndTime", "()J", "setEndTime", "(J)V", "compareTo", "activeModel", "imgResource", "getImgResource", "titleStr", "", "getTitleStr", "()Ljava/lang/String;", "getDescStr", "context", "Landroid/content/Context;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataActiveModel implements Comparable<DataActiveModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private ActiveStageItem activeModeInfo;
    private long endTime;

    @JvmField
    public boolean isDayEndData;

    @JvmField
    public boolean isDayFirstData;
    private int sportDataType;

    @JvmField
    public long startTime;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/data/model/DataActiveModel$Companion;", "", "<init>", "()V", "setFirstDayFlag", "", "modelList", "", "Lcom/xiaomi/fitness/data/model/DataActiveModel;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setFirstDayFlag(@NotNull List<DataActiveModel> modelList) {
            Intrinsics.checkNotNullParameter(modelList, "modelList");
            int size = modelList.size();
            if (size > 0) {
                int i = 0;
                modelList.get(0).isDayFirstData = true;
                modelList.get(modelList.size() - 1).isDayEndData = true;
                if (size > 1) {
                    int i2 = size - 1;
                    while (i < i2) {
                        DataActiveModel dataActiveModel = modelList.get(i);
                        i++;
                        DataActiveModel dataActiveModel2 = modelList.get(i);
                        if (!TimeDateUtil.isSameLocalDate(TimeDateUtil.timestampToLocalDate(dataActiveModel.startTime), TimeDateUtil.timestampToLocalDate(dataActiveModel2.startTime))) {
                            dataActiveModel2.isDayFirstData = true;
                            dataActiveModel.isDayEndData = true;
                        }
                    }
                }
            }
        }
    }

    public DataActiveModel(@NotNull ActiveStageItem activeModeInfo, int i) {
        Intrinsics.checkNotNullParameter(activeModeInfo, "activeModeInfo");
        this.activeModeInfo = activeModeInfo;
        this.sportDataType = i;
        this.startTime = activeModeInfo.getStartTime();
        this.endTime = this.activeModeInfo.getEndTime();
    }

    @NotNull
    public final ActiveStageItem getActiveModeInfo() {
        return this.activeModeInfo;
    }

    @NotNull
    public final String getDescStr(@NotNull Context context) {
        String quantityString;
        Intrinsics.checkNotNullParameter(context, "context");
        long j = 60;
        int endTime = ((int) (this.activeModeInfo.getEndTime() / j)) - ((int) (this.activeModeInfo.getStartTime() / j));
        if (this.activeModeInfo.getSteps() != null) {
            Resources resources = context.getResources();
            int i = qxi.common_unit_step_desc;
            Integer steps = this.activeModeInfo.getSteps();
            Intrinsics.checkNotNull(steps);
            quantityString = resources.getQuantityString(i, steps.intValue(), this.activeModeInfo.getSteps());
        } else {
            quantityString = "";
        }
        String strB = pz6.b(context, this.activeModeInfo.getDistance());
        Intrinsics.checkNotNullExpressionValue(strB, "getDistanceStr(...)");
        String quantityString2 = context.getResources().getQuantityString(qxi.common_unit_calorie_desc, this.activeModeInfo.getCalories(), Integer.valueOf(this.activeModeInfo.getCalories()));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        return TimeDateUtil.getZNTimeWithMin(endTime) + " " + quantityString + " " + strB + " " + quantityString2;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getImgResource() {
        return ActiveStageItemExKt.getImgResource(this.activeModeInfo);
    }

    public final int getSportDataType() {
        return this.sportDataType;
    }

    @NotNull
    public final String getTitleStr() {
        String name;
        String sid = this.activeModeInfo.getSid();
        if (sid != null) {
            DeviceInfo<? extends Device> deviceInfoInAll = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceInfoInAll(sid);
            name = (deviceInfoInAll != null ? deviceInfoInAll.getName() : null) != null ? deviceInfoInAll.getName() : "";
            Logger.i("DataActiveModel", "sid:" + sid + "-deviceFrom:" + ((Object) name));
        } else {
            name = "";
        }
        String modeName = ActiveStageItemExKt.getModeName(this.activeModeInfo);
        return (modeName != null ? modeName : "") + " " + TimeDateUtil.getDateHHmmFormat(this.startTime) + " " + ((Object) name);
    }

    public final void setActiveModeInfo(@NotNull ActiveStageItem activeStageItem) {
        Intrinsics.checkNotNullParameter(activeStageItem, "<set-?>");
        this.activeModeInfo = activeStageItem;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setSportDataType(int i) {
        this.sportDataType = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull DataActiveModel activeModel) {
        Intrinsics.checkNotNullParameter(activeModel, "activeModel");
        return (int) (activeModel.startTime - this.startTime);
    }
}
