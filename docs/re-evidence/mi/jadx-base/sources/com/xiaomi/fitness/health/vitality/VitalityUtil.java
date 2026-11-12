package com.xiaomi.fitness.health.vitality;

import android.content.Context;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.c0j;
import defpackage.iji;
import defpackage.qxi;
import defpackage.uz6;
import defpackage.x44;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/health/vitality/VitalityUtil;", "", "", "type", "getVitalityDistributeStingRes", "(I)I", "getVitalityDistributeColor", "Lcom/xiaomi/fitness/health/vitality/VitalityEntry;", "Records", "getVitalityDistributePercent", "(ILcom/xiaomi/fitness/health/vitality/VitalityEntry;)I", "getVitalityDistributeValue", "value", "sum", "valueToPercentage", "(II)I", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "createHomeEntries", "(I)Ljava/util/List;", "Landroid/content/Context;", "context", "singleVitalityRecords", "Luz6;", "createDistributeModelList", "(Landroid/content/Context;Lcom/xiaomi/fitness/health/vitality/VitalityEntry;)Ljava/util/List;", "", "TAG", "Ljava/lang/String;", "COLOR_HIGH", "I", "COLOR_NORMAL", "COLOR_LOW", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class VitalityUtil {

    @NotNull
    public static final String TAG = "VitalityUtil";

    @NotNull
    public static final VitalityUtil INSTANCE = new VitalityUtil();
    private static final int COLOR_HIGH = iji.s2;
    private static final int COLOR_NORMAL = iji.r2;
    private static final int COLOR_LOW = iji.k0;

    private VitalityUtil() {
    }

    private final int getVitalityDistributeColor(int type) {
        if (type != 0) {
            return type != 1 ? COLOR_HIGH : COLOR_NORMAL;
        }
        return COLOR_LOW;
    }

    private final int getVitalityDistributePercent(int type, VitalityEntry Records) {
        if (Records == null) {
            return 0;
        }
        if (type != 0) {
            return type != 1 ? valueToPercentage(Records.getHighZoneVitality(), Records.getDailyVitality()) : valueToPercentage(Records.getMediumZoneVitality(), Records.getDailyVitality());
        }
        return valueToPercentage(Records.getLowZoneVitality(), Records.getDailyVitality());
    }

    private final int getVitalityDistributeStingRes(int type) {
        if (type != 0) {
            return type != 1 ? c0j.uo : c0j.xo;
        }
        return c0j.wo;
    }

    private final int getVitalityDistributeValue(int type, VitalityEntry Records) {
        if (Records == null) {
            return 0;
        }
        if (type != 0) {
            return type != 1 ? Records.getHighZoneVitality() : Records.getMediumZoneVitality();
        }
        return Records.getLowZoneVitality();
    }

    private final int valueToPercentage(int value, int sum) {
        if (sum != 0) {
            return (value * 100) / sum;
        }
        return 0;
    }

    @NotNull
    public final List<uz6> createDistributeModelList(@NotNull Context context, @Nullable VitalityEntry singleVitalityRecords) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 3; i++) {
            int vitalityDistributePercent = getVitalityDistributePercent(i, singleVitalityRecords);
            int vitalityDistributeValue = getVitalityDistributeValue(i, singleVitalityRecords);
            ListExtKt.add(linkedList, new uz6(x44.a(getVitalityDistributeColor(i)), context.getString(getVitalityDistributeStingRes(i)), 9, vitalityDistributePercent, String.valueOf(vitalityDistributeValue), context.getResources().getQuantityString(qxi.E1, vitalityDistributeValue)));
        }
        return linkedList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createHomeEntries(int progress) {
        int[] iArr = {progress, 0};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            arrayList.add(new RecyclerBarEntry(i, iArr[i], System.currentTimeMillis(), 3));
        }
        return arrayList;
    }
}
