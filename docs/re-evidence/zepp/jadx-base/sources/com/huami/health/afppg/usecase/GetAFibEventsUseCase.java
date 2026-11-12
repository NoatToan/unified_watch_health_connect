package com.huami.health.afppg.usecase;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.local.bean.HREventData;
import com.huami.health.afppg.data.remote.dto.AFibResultExtra;
import com.huami.health.afppg.data.remote.dto.AtrialFibrillationExtra;
import com.huami.health.afppg.data.remote.dto.UserEvents;
import com.huami.health.afppg.model.AtrialFibrillation;
import com.huami.health.afppg.repository.PPGRepository;
import com.huami.health.afppg.utils.AfibCacheHelper;
import com.huami.health.afppg.utils.GsonConvertorKt;
import com.huami.health.afppg.utils.PPGExtensionsKt;
import com.huami.tools.log.HMLog;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J:\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0002J$\u0010\u0014\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0002J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002H\u0002J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002J2\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0006\u0010!\u001a\u00020 R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$¨\u0006)"}, d2 = {"Lcom/huami/health/afppg/usecase/GetAFibEventsUseCase;", "", "", "Lcom/huami/health/afppg/data/remote/dto/UserEvents$EventItem;", "items", "Lcom/huami/health/afppg/data/local/bean/HREventData;", "f", "item", "", "duration", "a", "", "totalData", "", "toTime", "limit", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "list", "h", "", GoogleApiAvailabilityLight.a, "Lcom/huami/health/afppg/data/local/bean/AFibData;", "aFibs", "b", "c", "eventData", "Lcom/huami/health/afppg/data/remote/dto/UserEvents;", "e", "fromTime", "initialItems", "g", "queryHREvents", "", "toDateLong", "queryAFibByDayEvents", "Lcom/huami/health/afppg/repository/PPGRepository;", "Lcom/huami/health/afppg/repository/PPGRepository;", "ppgRepository", "<init>", "(Lcom/huami/health/afppg/repository/PPGRepository;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class GetAFibEventsUseCase {

    @NotNull
    private static final String b = "af_ppg_GetAFibEventsService";

    @NotNull
    private static final String c = "00:00:00";

    @NotNull
    private static final String d = "23:59:59";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PPGRepository ppgRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<AFibData> a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<AFibData> list, String str, String str2) {
            super(0);
            this.a = list;
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "queryHREvents fromDB size:" + this.a.size() + " from:" + this.b + ", to:" + this.c;
        }
    }

    public GetAFibEventsUseCase(@NotNull PPGRepository pPGRepository) {
        this.ppgRepository = pPGRepository;
    }

    private final HREventData a(UserEvents.EventItem item, int duration) {
        HREventData hREventData = new HREventData(null, null, null, item.getTimestamp(), item.getTimeZoneId(), duration, 0, 0, 0, null, null, null, null, 0, item.getDate(), 16327, null);
        if (item.getExtra().length() == 0) {
            hREventData.setDeviceID(item.getDeviceId());
            hREventData.setDeviceSource(item.getDeviceSource());
            return hREventData;
        }
        AFibResultExtra aFibResultExtra = (AFibResultExtra) GsonConvertorKt.jsonConvert(item.getExtra(), AFibResultExtra.class);
        if (aFibResultExtra == null) {
            return hREventData;
        }
        hREventData.setDeviceID(aFibResultExtra.getDeviceId());
        hREventData.setDeviceSource(aFibResultExtra.getDeviceSource());
        return hREventData;
    }

    private final List<UserEvents.EventItem> b(List<AFibData> aFibs) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(aFibs, 10));
        for (AFibData aFibData : aFibs) {
            String userId = aFibData.getUserId();
            long timestamp = aFibData.getTimestamp() * ((long) 1000);
            String appName = aFibData.getAppName();
            int deviceSource = aFibData.getDeviceSource();
            arrayList.add(new UserEvents.EventItem(userId, "17_1", null, timestamp, 0, null, null, 0, null, GsonConvertorKt.toJson(new AFibResultExtra(aFibData.getSn(), aFibData.getDeviceId(), appName, deviceSource)), aFibData.getTimeZone(), false, aFibData.getDate(), 500, null));
        }
        return arrayList;
    }

    private final List<AFibData> c(List<UserEvents.EventItem> items) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        Iterator it2 = items.iterator();
        while (it2.hasNext()) {
            UserEvents.EventItem eventItem = (UserEvents.EventItem) it2.next();
            long j = 1000;
            Iterator it3 = it2;
            AFibData aFibData = new AFibData(Constants.VIA_REPORT_TYPE_START_GROUP, eventItem.getTimestamp() / j, 0, 1, 0L, 1, eventItem.getUserId(), null, null, null, null, eventItem.getTimeZoneId(), PPGExtensionsKt.toYMDHMS(eventItem.getTimestamp() / j, TimeZone.getTimeZone(eventItem.getTimeZoneId())), 1924, null);
            AtrialFibrillationExtra atrialFibrillationExtra = (AtrialFibrillationExtra) GsonConvertorKt.jsonConvert(eventItem.getExtra(), AtrialFibrillationExtra.class);
            if (atrialFibrillationExtra != null) {
                aFibData.setDeviceSource(atrialFibrillationExtra.getDeviceSource());
                aFibData.setSn(atrialFibrillationExtra.getSn());
                aFibData.setDeviceId(atrialFibrillationExtra.getDeviceId());
                aFibData.setAppName(atrialFibrillationExtra.getAppName());
            }
            arrayList.add(aFibData);
            it2 = it3;
        }
        return arrayList;
    }

    private final void d(List<UserEvents.EventItem> items, List<AtrialFibrillation> list) {
        for (UserEvents.EventItem eventItem : items) {
            AtrialFibrillationExtra atrialFibrillationExtra = (AtrialFibrillationExtra) GsonConvertorKt.jsonConvert(eventItem.getExtra(), AtrialFibrillationExtra.class);
            if (atrialFibrillationExtra != null) {
                int duration = atrialFibrillationExtra.getDuration();
                long timestamp = eventItem.getTimestamp();
                long jConvertToEndTime = GetAfibListUseCase.INSTANCE.convertToEndTime(eventItem.getTimestamp(), atrialFibrillationExtra.getDuration());
                String diagnosis = atrialFibrillationExtra.getDiagnosis();
                if (diagnosis == null) {
                    diagnosis = "";
                }
                list.add(new AtrialFibrillation(duration, timestamp, jConvertToEndTime, diagnosis, atrialFibrillationExtra.getDeviceSource()));
            }
        }
    }

    private final UserEvents e(List<HREventData> eventData) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(eventData, 10));
        for (HREventData hREventData : eventData) {
            arrayList.add(new UserEvents.EventItem(hREventData.getUserID(), hREventData.getEventType(), hREventData.getSubType(), hREventData.getTimestamp(), 0, null, null, 0, null, GsonConvertorKt.toJson(new AtrialFibrillationExtra(hREventData.getEventType(), hREventData.getDuration(), hREventData.getLowHR(), hREventData.getHighHR(), hREventData.getDiagnosis(), hREventData.getDeviceSource(), hREventData.getDeviceID(), hREventData.getSn(), null, 256, null)), hREventData.getTimeZone(), false, hREventData.getDate(), 2544, null));
        }
        return new UserEvents(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    private final List<HREventData> f(List<UserEvents.EventItem> items) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        for (Object obj : items) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            UserEvents.EventItem eventItem = (UserEvents.EventItem) obj;
            long timestamp = eventItem.getTimestamp();
            if (i < items.size() - 1) {
                long timestamp2 = items.get(i3).getTimestamp();
                Date date = new Date(timestamp);
                Date date2 = new Date(timestamp2);
                if (Math.abs(timestamp - timestamp2) >= 75000 || !PPGExtensionsKt.isSameDay(date, date2)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (!z) {
                if (z2) {
                    long j = 1000;
                    arrayList.add(a(eventItem, (int) (((items.get(i2).getTimestamp() / j) - (eventItem.getTimestamp() / j)) / ((long) 60))));
                } else {
                    arrayList.add(a(items.get(i2), 1));
                }
                i2 = i3;
            }
            z2 = z;
            i = i3;
        }
        return arrayList;
    }

    private final List<UserEvents.EventItem> g(String fromTime, String toTime, List<UserEvents.EventItem> initialItems) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(initialItems);
        UserEvents afibFromServer = this.ppgRepository.getAfibFromServer(fromTime, toTime);
        if (afibFromServer != null) {
            this.ppgRepository.insertNewAFibData(c(afibFromServer.getItems()));
            arrayList.addAll(afibFromServer.getItems());
            if (afibFromServer.getNext() != null && afibFromServer.getNext().getTimestamp() != 0) {
                String strTimestampToYMD$default = PPGExtensionsKt.timestampToYMD$default(afibFromServer.getNext().getTimestamp(), null, 2, null);
                g(Intrinsics.stringPlus(strTimestampToYMD$default, c), Intrinsics.stringPlus(strTimestampToYMD$default, d), arrayList);
            }
        }
        return arrayList;
    }

    private final List<AtrialFibrillation> h(List<UserEvents.EventItem> totalData, String toTime, int limit, List<AtrialFibrillation> list) throws Exception {
        UserEvents afibFromServer;
        ArrayList arrayList = new ArrayList();
        if (AfibCacheHelper.isLoadMore(toTime) && (afibFromServer = this.ppgRepository.getAfibFromServer(PPGExtensionsKt.timestampToYMDHMS$default(0L, null, 2, null), toTime)) != null) {
            totalData.addAll(afibFromServer.getItems());
            this.ppgRepository.insertNewAFibData(c(afibFromServer.getItems()));
            arrayList.addAll(totalData);
            List<HREventData> listF = f(arrayList);
            AfibCacheHelper.updateCacheCount(listF.size());
            if (listF.size() < limit) {
                if (afibFromServer.getNext() != null) {
                    return queryHREvents(PPGExtensionsKt.timestampToYMDHMS$default(0L, null, 2, null), PPGExtensionsKt.timestampToYMDHMS$default(afibFromServer.getNext().getTimestamp(), null, 2, null), limit, totalData);
                }
                d(e(listF).getItems(), list);
                return list;
            }
        }
        arrayList.addAll(totalData);
        if (arrayList.isEmpty()) {
            throw new Exception("query from server empty!");
        }
        List<HREventData> listF2 = f(arrayList);
        if (listF2.size() >= limit && limit >= 1) {
            d(e(listF2.subList(0, limit - 1)).getItems(), list);
        }
        return list;
    }

    @Nullable
    public final UserEvents queryAFibByDayEvents(long toDateLong) {
        Object objM3845constructorimpl;
        String strTimestampToYMD$default = PPGExtensionsKt.timestampToYMD$default(toDateLong, null, 2, null);
        String strStringPlus = Intrinsics.stringPlus(strTimestampToYMD$default, c);
        String strStringPlus2 = Intrinsics.stringPlus(strTimestampToYMD$default, d);
        ArrayList arrayList = new ArrayList();
        List<AFibData> aFibDataData = this.ppgRepository.getAFibDataData(strStringPlus, strStringPlus2);
        if (AfibCacheHelper.isCached(strTimestampToYMD$default)) {
            arrayList.addAll(f(b(aFibDataData)));
        } else {
            try {
                Result.Companion companion = Result.Companion;
                arrayList.addAll(f(g(strStringPlus, strStringPlus2, new ArrayList())));
                AfibCacheHelper.saveCache(strTimestampToYMD$default);
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null && (!aFibDataData.isEmpty())) {
                arrayList.addAll(f(b(aFibDataData)));
            }
        }
        return e(arrayList);
    }

    @NotNull
    public final List<AtrialFibrillation> queryHREvents(@NotNull String fromTime, @NotNull String toTime, int limit, @NotNull List<UserEvents.EventItem> initialItems) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(initialItems);
        ArrayList arrayList3 = new ArrayList();
        List<AFibData> aFibDataData = this.ppgRepository.getAFibDataData(fromTime, toTime);
        HMLog.info(b, new a(aFibDataData, fromTime, toTime));
        arrayList3.addAll(b(aFibDataData));
        List<HREventData> listF = f(arrayList3);
        if (!arrayList2.isEmpty()) {
            try {
                Result.Companion companion = Result.Companion;
                return h(arrayList2, toTime, limit, arrayList);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                if (Result.m3848exceptionOrNullimpl(Result.m3845constructorimpl(ResultKt.createFailure(th))) != null) {
                    d(e(listF).getItems(), arrayList);
                }
            }
        } else if (listF.size() < limit || limit < 1) {
            try {
                Result.Companion companion3 = Result.Companion;
                return h(arrayList2, toTime, limit, arrayList);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                if (Result.m3848exceptionOrNullimpl(Result.m3845constructorimpl(ResultKt.createFailure(th2))) != null) {
                    d(e(listF).getItems(), arrayList);
                }
            }
        } else {
            d(e(listF.subList(0, limit - 1)).getItems(), arrayList);
        }
        return arrayList;
    }
}
