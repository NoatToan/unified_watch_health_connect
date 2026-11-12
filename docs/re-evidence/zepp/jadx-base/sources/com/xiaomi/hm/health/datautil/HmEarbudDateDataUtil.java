package com.xiaomi.hm.health.datautil;

import com.facebook.appevents.UserDataStore;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.model.summery.DeviceDataSelectInfo;
import com.xiaomi.hm.health.model.summery.SelectDateData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0004H\u0002J \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0015\u001a\u00020\u0013*\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0016\u0010\u0018\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004J\u0014\u0010\u001e\u001a\u00020\u0004*\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010!\u001a\u00020\u0004*\u0004\u0018\u00010\u0002J\u0010\u0010\"\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/datautil/HmEarbudDateDataUtil;", "", "", "day", "", "isEarbud", "Lcom/xiaomi/hm/health/model/summery/DeviceDataSelectInfo;", "getDeviceSelectInfo", "Ljava/util/concurrent/CopyOnWriteArrayList;", "list", "info", "sort", "", "setListItem", "startTime", "endTime", "", "Lcom/xiaomi/hm/health/databases/model/EarbudDateData;", "getRegionData", "Lcom/xiaomi/hm/health/model/summery/SelectDateData;", "getDefaultSelectData", "correctSource", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getMajorDeviceSource", "replaceDeviceSelectInfo", "switchSelect", "date", "getSpecifyDayData", "getSelectData", "needSource", "hasSleep", "summary", "summaryHasSleep", "isSelect", "summaryIsSelect", "TAG", "Ljava/lang/String;", "bandSleepInfos", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getBandSleepInfos", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "bandSelectDays", "getBandSelectDays", "earbudSleepInfos", "getEarbudSleepInfos", "earbudSelectDays", "getEarbudSelectDays", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudDateDataUtil {

    @NotNull
    private static final String TAG = "HmEarbudDateDataUtil";

    @NotNull
    public static final HmEarbudDateDataUtil INSTANCE = new HmEarbudDateDataUtil();

    @NotNull
    private static final CopyOnWriteArrayList<DeviceDataSelectInfo> bandSleepInfos = new CopyOnWriteArrayList<>();

    @NotNull
    private static final CopyOnWriteArrayList<DeviceDataSelectInfo> bandSelectDays = new CopyOnWriteArrayList<>();

    @NotNull
    private static final CopyOnWriteArrayList<DeviceDataSelectInfo> earbudSleepInfos = new CopyOnWriteArrayList<>();

    @NotNull
    private static final CopyOnWriteArrayList<DeviceDataSelectInfo> earbudSelectDays = new CopyOnWriteArrayList<>();

    private HmEarbudDateDataUtil() {
    }

    private final SelectDateData correctSource(SelectDateData selectDateData) {
        int value;
        int value2;
        HMDeviceSource mainDataSource = selectDateData.getMainDataSource();
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        if (mainDataSource == hMDeviceSource) {
            if (selectDateData.getIsEarbud()) {
                EarbudDateData specifyDayData = getSpecifyDayData(selectDateData.getDate());
                Integer source = specifyDayData == null ? null : specifyDayData.getSource();
                value2 = source == null ? hMDeviceSource.getValue() : source.intValue();
            } else {
                DateData specifyDayData2 = HMBraceletDateDataUtil.getSpecifyDayData(selectDateData.getDate());
                Integer source2 = specifyDayData2 == null ? null : specifyDayData2.getSource();
                value2 = source2 == null ? hMDeviceSource.getValue() : source2.intValue();
            }
            selectDateData.setMainDataSource(HMDeviceSource.fromValue(value2));
        }
        if (selectDateData.getMainDataSource() == hMDeviceSource) {
            if (selectDateData.getIsEarbud()) {
                HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.EARBUD);
                Integer numValueOf = boundDeviceSource != null ? Integer.valueOf(boundDeviceSource.getValue()) : null;
                value = numValueOf == null ? HMDeviceSource.EARBUD_CHOPIN.getValue() : numValueOf.intValue();
            } else {
                value = getMajorDeviceSource().getValue();
            }
            selectDateData.setMainDataSource(HMDeviceSource.fromValue(value));
        }
        if (selectDateData.getMainDataSource() == hMDeviceSource) {
            selectDateData.setMainDataSource(HMDeviceSource.fromValue(selectDateData.getIsEarbud() ? HMDeviceSource.EARBUD_CHOPIN.getValue() : HMDeviceSource.MILI.getValue()));
        }
        return selectDateData;
    }

    private final SelectDateData getDefaultSelectData(String day) {
        SelectDateData selectDateData = new SelectDateData(day);
        selectDateData.setMutiSource(false);
        selectDateData.setEarbud(false);
        selectDateData.setMainDataSource(INSTANCE.getMajorDeviceSource());
        return selectDateData;
    }

    private final DeviceDataSelectInfo getDeviceSelectInfo(String day, boolean isEarbud) {
        Object obj = null;
        if (isEarbud) {
            for (Object obj2 : earbudSleepInfos) {
                if (Intrinsics.areEqual(((DeviceDataSelectInfo) obj2).getDay(), day)) {
                    obj = obj2;
                    break;
                }
            }
            return (DeviceDataSelectInfo) obj;
        }
        for (Object obj3 : bandSleepInfos) {
            if (Intrinsics.areEqual(((DeviceDataSelectInfo) obj3).getDay(), day)) {
                obj = obj3;
                break;
            }
        }
        return (DeviceDataSelectInfo) obj;
    }

    private final HMDeviceSource getMajorDeviceSource() {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceManager.getInstance().getMajorDeviceType());
        if (!(boundDeviceSource != HMDeviceSource.VDEVICE)) {
            boundDeviceSource = null;
        }
        return boundDeviceSource == null ? HMDeviceSource.MILI : boundDeviceSource;
    }

    @JvmStatic
    @Nullable
    public static final List<EarbudDateData> getRegionData(@NotNull String startTime, @NotNull String endTime) {
        return HMDaoManager.getInstance().getDaoSession().getEarbudDateDataDao().queryBuilder().where(EarbudDateDataDao.Properties.Date.between(startTime, endTime), new WhereCondition[0]).list();
    }

    private final void setListItem(CopyOnWriteArrayList<DeviceDataSelectInfo> list, DeviceDataSelectInfo info, boolean sort) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(((DeviceDataSelectInfo) it2.next()).getDay(), info.getDay())) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.set(i, info);
        } else {
            arrayList.add(info);
        }
        if (sort) {
            g.sort(arrayList);
        }
        list.clear();
        list.addAll(arrayList);
    }

    public static /* synthetic */ void setListItem$default(HmEarbudDateDataUtil hmEarbudDateDataUtil, CopyOnWriteArrayList copyOnWriteArrayList, DeviceDataSelectInfo deviceDataSelectInfo, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        hmEarbudDateDataUtil.setListItem(copyOnWriteArrayList, deviceDataSelectInfo, z);
    }

    @NotNull
    public final CopyOnWriteArrayList<DeviceDataSelectInfo> getBandSelectDays() {
        return bandSelectDays;
    }

    @NotNull
    public final CopyOnWriteArrayList<DeviceDataSelectInfo> getBandSleepInfos() {
        return bandSleepInfos;
    }

    @NotNull
    public final CopyOnWriteArrayList<DeviceDataSelectInfo> getEarbudSelectDays() {
        return earbudSelectDays;
    }

    @NotNull
    public final CopyOnWriteArrayList<DeviceDataSelectInfo> getEarbudSleepInfos() {
        return earbudSleepInfos;
    }

    @NotNull
    public final SelectDateData getSelectData(@NotNull String day) {
        return getSelectData(day, false);
    }

    @Nullable
    public final EarbudDateData getSpecifyDayData(@NotNull String date) {
        return HMDaoManager.getInstance().getEarbudDateDataDao().queryBuilder().where(EarbudDateDataDao.Properties.Date.eq(date), new WhereCondition[0]).build().forCurrentThread().unique();
    }

    public final boolean hasSleep(@Nullable String str, boolean z) {
        return summaryHasSleep(str, z);
    }

    public final boolean isSelect(@Nullable String str) {
        return summaryIsSelect(str);
    }

    public final void replaceDeviceSelectInfo(@NotNull DeviceDataSelectInfo info, boolean isEarbud) {
        if (isEarbud) {
            setListItem$default(this, earbudSleepInfos, info, false, 4, null);
            setListItem(earbudSelectDays, info, true);
        } else {
            setListItem$default(this, bandSleepInfos, info, false, 4, null);
            setListItem(bandSelectDays, info, true);
        }
    }

    public final boolean summaryHasSleep(@Nullable String summary, boolean isEarbud) {
        JSONArray jSONArrayOptJSONArray;
        int length;
        if (summary != null) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(summary).optJSONObject("slp");
                if (jSONObjectOptJSONObject != null) {
                    if (!isEarbud && jSONObjectOptJSONObject.has("odd_stage")) {
                        return true;
                    }
                    if (jSONObjectOptJSONObject.optLong("ed", 0L) - jSONObjectOptJSONObject.optLong(UserDataStore.STATE, 0L) > 0 && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(StepsInfo.KEY_STAGE)) != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                            if (CollectionsKt___CollectionsKt.contains(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{5, 4, 8}), jSONObject == null ? null : Integer.valueOf(jSONObject.optInt("mode", -1)))) {
                                return true;
                            }
                            if (i2 < length) {
                                i = i2;
                            }
                        }
                    }
                    return false;
                }
            } catch (Exception e) {
                HMLog.error$default(TAG, null, null, new Function0<String>() { // from class: com.xiaomi.hm.health.datautil.HmEarbudDateDataUtil$summaryHasSleep$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return e.getMessage();
                    }
                }, 6, null);
                Unit unit = Unit.INSTANCE;
            }
        }
        return false;
    }

    public final boolean summaryIsSelect(@Nullable String summary) {
        if (summary != null) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(summary).optJSONObject("slp");
                return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("selected", 0) == 1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public final void switchSelect(@NotNull String day, boolean isEarbud) {
        DeviceDataSelectInfo deviceSelectInfo = getDeviceSelectInfo(day, true);
        if (deviceSelectInfo == null) {
            deviceSelectInfo = new DeviceDataSelectInfo(day, -1, true, isEarbud);
        }
        DeviceDataSelectInfo deviceSelectInfo2 = getDeviceSelectInfo(day, false);
        if (deviceSelectInfo2 == null) {
            deviceSelectInfo2 = new DeviceDataSelectInfo(day, -1, true, !isEarbud);
        }
        if (isEarbud) {
            deviceSelectInfo.setSelect(true);
            deviceSelectInfo2.setSelect(false);
        } else {
            deviceSelectInfo.setSelect(false);
            deviceSelectInfo2.setSelect(true);
        }
        replaceDeviceSelectInfo(deviceSelectInfo, true);
        replaceDeviceSelectInfo(deviceSelectInfo2, false);
    }

    @NotNull
    public final SelectDateData getSelectData(@NotNull String day, boolean needSource) {
        SelectDateData defaultSelectData = getDefaultSelectData(day);
        boolean zIsToday = SportDay.fromString(day).isToday();
        DeviceDataSelectInfo deviceSelectInfo = getDeviceSelectInfo(day, false);
        if (deviceSelectInfo == null) {
            deviceSelectInfo = new DeviceDataSelectInfo(day, -1, false, false);
        }
        DeviceDataSelectInfo deviceSelectInfo2 = getDeviceSelectInfo(day, true);
        if (deviceSelectInfo2 == null) {
            deviceSelectInfo2 = new DeviceDataSelectInfo(day, -1, false, false);
        }
        boolean hasSleep = deviceSelectInfo2.getHasSleep();
        boolean zIsSelect = deviceSelectInfo2.isSelect();
        boolean hasSleep2 = deviceSelectInfo.getHasSleep();
        boolean zIsSelect2 = deviceSelectInfo.isSelect();
        defaultSelectData.setMutiSource(zIsToday && hasSleep2 && hasSleep);
        if (!hasSleep && !hasSleep2) {
            defaultSelectData.setEarbud(false);
        } else if (hasSleep && !hasSleep2) {
            defaultSelectData.setEarbud(true);
        } else if (!hasSleep && hasSleep2) {
            defaultSelectData.setEarbud(false);
        } else if (zIsSelect || !zIsSelect2) {
            defaultSelectData.setEarbud(true);
        }
        if (defaultSelectData.getIsEarbud()) {
            defaultSelectData.setMainDataSource(HMDeviceSource.fromValue(deviceSelectInfo2.getSource()));
        } else {
            defaultSelectData.setMainDataSource(HMDeviceSource.fromValue(deviceSelectInfo.getSource()));
        }
        if (needSource) {
            correctSource(defaultSelectData);
        }
        return defaultSelectData;
    }
}
