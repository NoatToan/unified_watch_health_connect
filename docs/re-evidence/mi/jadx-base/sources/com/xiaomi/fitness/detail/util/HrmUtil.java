package com.xiaomi.fitness.detail.util;

import android.content.Context;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.model.HrmZoneLevel;
import com.xiaomi.fitness.widget.distribute.HrmDistribute;
import defpackage.b0o;
import defpackage.dki;
import defpackage.j1j;
import defpackage.mfc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011¢\u0006\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/detail/util/HrmUtil;", "", "", "hrm", "Lcom/xiaomi/fitness/account/HrZoneLevel;", "hrmZone", "Lcom/xiaomi/fitness/detail/model/HrmZoneLevel;", "getHrmZoneLevel", "(ILcom/xiaomi/fitness/account/HrZoneLevel;)Lcom/xiaomi/fitness/detail/model/HrmZoneLevel;", "index", "getModelColorByIndex", "(I)I", "Landroid/content/Context;", "context", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportValues", "duration", "", "Lb0o;", "createHrmDistributeModel", "(Landroid/content/Context;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;I)Ljava/util/List;", "Lcom/xiaomi/fitness/widget/distribute/HrmDistribute;", "hrmDistribute", "reserveHrZone", "createHrmSportSegmentModel", "(Landroid/content/Context;Lcom/xiaomi/fitness/widget/distribute/HrmDistribute;ILjava/lang/Integer;)Ljava/util/List;", "", "getModelStrByIndex", "(Landroid/content/Context;ILjava/lang/Integer;)Ljava/lang/String;", "Lcom/xiaomi/fitness/chart/entrys/SportRecordEntry;", "entryList", "createColorList", "(Ljava/util/List;)Ljava/util/List;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HrmUtil {

    @NotNull
    public static final HrmUtil INSTANCE = new HrmUtil();

    private HrmUtil() {
    }

    @JvmStatic
    @NotNull
    public static final HrmZoneLevel getHrmZoneLevel(int hrm, @NotNull HrZoneLevel hrmZone) {
        Intrinsics.checkNotNullParameter(hrmZone, "hrmZone");
        HrZone hrZone = new HrZone();
        float maxHr = hrZone.getMaxHr();
        int iRound = Math.round(((0.9f * maxHr) - (maxHr * 0.8f)) / 3);
        int minHr = hrZone.getHrZoneRange(hrmZone).getMinHr();
        if (hrmZone == HrZoneLevel.WarmUp) {
            if (hrm > minHr || hrm <= minHr - iRound) {
                return hrm >= minHr - (iRound * 2) ? HrmZoneLevel.Zhong : HrmZoneLevel.Shu;
            }
            return HrmZoneLevel.Bo;
        }
        if (hrm < minHr || hrm >= minHr + iRound) {
            return hrm < minHr + (iRound * 2) ? HrmZoneLevel.Zhong : HrmZoneLevel.Bo;
        }
        return HrmZoneLevel.Shu;
    }

    private final int getModelColorByIndex(int index) {
        if (index == 0) {
            return AppUtil.getApp().getColor(dki.D);
        }
        if (index == 1) {
            return AppUtil.getApp().getColor(dki.C);
        }
        if (index == 2) {
            return AppUtil.getApp().getColor(dki.z);
        }
        if (index != 3) {
            return index != 4 ? AppUtil.getApp().getColor(dki.D) : AppUtil.getApp().getColor(dki.B);
        }
        return AppUtil.getApp().getColor(dki.A);
    }

    @Nullable
    public final List<Integer> createColorList(@Nullable List<? extends SportRecordEntry> entryList) {
        ArrayList arrayList = new ArrayList();
        if (entryList != null && !entryList.isEmpty()) {
            int size = entryList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(Integer.valueOf(mfc.a((int) entryList.get(i).getY())));
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<b0o> createHrmDistributeModel(@NotNull Context context, @NotNull SportBasicReport sportValues, int duration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        ArrayList arrayList = new ArrayList();
        if (!sportValues.checkHrmDistributeValid()) {
            return arrayList;
        }
        Integer hrWarmUpDuration = sportValues.getHrWarmUpDuration();
        Intrinsics.checkNotNull(hrWarmUpDuration);
        int iIntValue = hrWarmUpDuration.intValue();
        Integer hrFatBurningDuration = sportValues.getHrFatBurningDuration();
        Intrinsics.checkNotNull(hrFatBurningDuration);
        int iIntValue2 = hrFatBurningDuration.intValue();
        Integer hrAerobicDuration = sportValues.getHrAerobicDuration();
        Intrinsics.checkNotNull(hrAerobicDuration);
        int iIntValue3 = hrAerobicDuration.intValue();
        Integer hrAnaerobicDuration = sportValues.getHrAnaerobicDuration();
        Intrinsics.checkNotNull(hrAnaerobicDuration);
        int iIntValue4 = hrAnaerobicDuration.intValue();
        Integer hrExtremeDuration = sportValues.getHrExtremeDuration();
        Intrinsics.checkNotNull(hrExtremeDuration);
        return createHrmSportSegmentModel(context, new HrmDistribute(iIntValue, iIntValue2, iIntValue3, iIntValue4, hrExtremeDuration.intValue()), duration, sportValues.getReserveHrZone());
    }

    @NotNull
    public final List<b0o> createHrmSportSegmentModel(@NotNull Context context, @NotNull HrmDistribute hrmDistribute, int duration, @Nullable Integer reserveHrZone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hrmDistribute, "hrmDistribute");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ListExtKt.add(arrayList2, Integer.valueOf(hrmDistribute.getWarmUpDuration()));
        ListExtKt.add(arrayList2, Integer.valueOf(hrmDistribute.getFatBurningDuration()));
        ListExtKt.add(arrayList2, Integer.valueOf(hrmDistribute.getAerobicDuration()));
        ListExtKt.add(arrayList2, Integer.valueOf(hrmDistribute.getAnaerobicDuration()));
        ListExtKt.add(arrayList2, Integer.valueOf(hrmDistribute.getExtremeDuration()));
        int sumDuration = duration == 0 ? hrmDistribute.getSumDuration() : duration;
        if (hrmDistribute.getSumDuration() != 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                int iIntValue = ((Number) arrayList2.get(i)).intValue();
                arrayList.add(new b0o(i, iIntValue, getModelStrByIndex(context, i, reserveHrZone), hrmDistribute.createPercentage(iIntValue, sumDuration), getModelColorByIndex(i), 0));
            }
        }
        return arrayList;
    }

    @NotNull
    public final String getModelStrByIndex(@NotNull Context context, int index, @Nullable Integer reserveHrZone) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Intrinsics.checkNotNullParameter(context, "context");
        if (index == 0) {
            if (reserveHrZone != null && reserveHrZone.intValue() == 1) {
                string = context.getString(j1j.h0);
            } else if (reserveHrZone != null && reserveHrZone.intValue() == 2) {
                string = context.getString(j1j.h3);
            } else {
                string = (reserveHrZone != null && reserveHrZone.intValue() == 3) ? context.getString(j1j.D9) : context.getString(j1j.s);
            }
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (index == 1) {
            if (reserveHrZone != null && reserveHrZone.intValue() == 1) {
                string2 = context.getString(j1j.i0);
            } else if (reserveHrZone != null && reserveHrZone.intValue() == 2) {
                string2 = context.getString(j1j.i3);
            } else {
                string2 = (reserveHrZone != null && reserveHrZone.intValue() == 3) ? context.getString(j1j.C2) : context.getString(j1j.t);
            }
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (index == 2) {
            if (reserveHrZone != null && reserveHrZone.intValue() == 1) {
                string3 = context.getString(j1j.t1);
            } else if (reserveHrZone != null && reserveHrZone.intValue() == 2) {
                string3 = context.getString(j1j.j3);
            } else {
                string3 = (reserveHrZone != null && reserveHrZone.intValue() == 3) ? context.getString(j1j.B2) : context.getString(j1j.u);
            }
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        if (index == 3) {
            if (reserveHrZone != null && reserveHrZone.intValue() == 1) {
                string4 = context.getString(j1j.k0);
            } else if (reserveHrZone != null && reserveHrZone.intValue() == 2) {
                string4 = context.getString(j1j.k3);
            } else {
                string4 = (reserveHrZone != null && reserveHrZone.intValue() == 3) ? context.getString(j1j.g5) : context.getString(j1j.v);
            }
            Intrinsics.checkNotNull(string4);
            return string4;
        }
        if (index != 4) {
            String string6 = context.getString(j1j.s);
            Intrinsics.checkNotNull(string6);
            return string6;
        }
        if (reserveHrZone != null && reserveHrZone.intValue() == 1) {
            string5 = context.getString(j1j.l0);
        } else if (reserveHrZone != null && reserveHrZone.intValue() == 2) {
            string5 = context.getString(j1j.l3);
        } else {
            string5 = (reserveHrZone != null && reserveHrZone.intValue() == 3) ? context.getString(j1j.G2) : context.getString(j1j.w);
        }
        Intrinsics.checkNotNull(string5);
        return string5;
    }
}
