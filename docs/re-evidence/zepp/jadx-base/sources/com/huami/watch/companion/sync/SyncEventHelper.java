package com.huami.watch.companion.sync;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.calendar.EventDao;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.dataexchange.sync.EventUpdatesSync;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.util.AssistantBox;
import com.huami.assistant.util.UpdateParser;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004H\u0002J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002JB\u0010\u0011\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/watch/companion/sync/SyncEventHelper;", "Lcom/huami/watch/companion/sync/BaseSyncHelper;", "Lcom/huami/watch/companion/sync/SyncEventHelper$LastMergeEventInfo;", "c", "", "Lcom/huami/assistant/calendar/Event;", "events", "", "lastSyncIds", "", "a", "deleteIds", GoogleApiAvailabilityLight.a, "mergeEvents", "eventsFromSystem", "eventsFromWatch", "", "b", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "lastMergeEventInfo", "", "e", "onStart", "<init>", "()V", "Companion", "LastMergeEventInfo", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class SyncEventHelper extends BaseSyncHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String e = "SyncHelper-MergeEvent";
    private static final int f = 7;
    private static final int g = -3;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/companion/sync/SyncEventHelper$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/watch/companion/sync/SyncEventHelper;", "get", "", "DAY_OFFSET_TODAY", LogUtil.I, "REQUEST_DAY_EVENT_DAYS", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SyncEventHelper get(@NotNull Context context) {
            BaseSyncHelper helper = BaseSyncHelper.getHelper(context, null, SyncEventHelper.class);
            Objects.requireNonNull(helper, "null cannot be cast to non-null type com.huami.watch.companion.sync.SyncEventHelper");
            return (SyncEventHelper) helper;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rR6\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/companion/sync/SyncEventHelper$LastMergeEventInfo;", "", "", "", "", "a", "Ljava/util/Map;", "getInfo", "()Ljava/util/Map;", "setInfo", "(Ljava/util/Map;)V", "info", "<init>", "()V", "Companion", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class LastMergeEventInfo {

        @NotNull
        public static final String KEY_PHONE = "phone";

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private Map<String, List<String>> info = new LinkedHashMap();

        @Nullable
        public final Map<String, List<String>> getInfo() {
            return this.info;
        }

        public final void setInfo(@Nullable Map<String, List<String>> map) {
            this.info = map;
        }
    }

    private final Set<String> a(List<? extends Event> events, List<String> lastSyncIds) {
        if (lastSyncIds == null) {
            return new LinkedHashSet();
        }
        if (events == null) {
            return new LinkedHashSet();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(events, 10));
        Iterator<T> it2 = events.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Event) it2.next()).syncId);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : lastSyncIds) {
            if (!arrayList.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.toMutableSet(arrayList2);
    }

    private final boolean b(Set<String> deleteIds, Set<Event> mergeEvents, List<? extends Event> eventsFromSystem, List<? extends Event> eventsFromWatch) {
        Object[] array = deleteIds.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        if (!ExchangeCenter.deleteEvents((String[]) array).isSuccess()) {
            Log.d(e, "Watch delete event error!!", new Object[0]);
            return false;
        }
        Iterator<T> it2 = deleteIds.iterator();
        while (it2.hasNext()) {
            Update bySyncId = UpdatesManager.getManager().getBySyncId(2, (String) it2.next());
            if (bySyncId != null && bySyncId.hasPin()) {
                ExchangeCenter.deletePin(this.mContext);
            }
        }
        Context context = this.mContext;
        Object[] array2 = deleteIds.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        EventDao.deleteEventsBySyncIds(context, (String[]) array2);
        for (Event event : mergeEvents) {
            if ((eventsFromWatch == null || !eventsFromWatch.contains(event)) && !ExchangeCenter.addEvent(event).isSuccess()) {
                Log.d(e, "Add event to watch error," + event, new Object[0]);
                return false;
            }
            if (!eventsFromSystem.contains(event)) {
                EventDao.deleteEventBySyncId(this.mContext, event.syncId);
                EventDao.insertEvent(this.mContext, event, true);
            }
        }
        UpdatesManager.getManager().deleteAllAndSave(2, EventUpdatesSync.build(CollectionsKt___CollectionsKt.toMutableList((Collection) mergeEvents)));
        return true;
    }

    private final LastMergeEventInfo c() {
        String lastMergeEventInfo = AssistantBox.getLastMergeEventInfo();
        Log.d(e, "Last event merge info : " + lastMergeEventInfo, new Object[0]);
        LastMergeEventInfo lastMergeEventInfo2 = (LastMergeEventInfo) new Gson().fromJson(lastMergeEventInfo, LastMergeEventInfo.class);
        return lastMergeEventInfo2 == null ? new LastMergeEventInfo() : lastMergeEventInfo2;
    }

    private final List<Event> d(Set<String> deleteIds, List<? extends Event> events) {
        ArrayList arrayList;
        if (events == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : events) {
                if (!deleteIds.contains(((Event) obj).syncId)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private final void e(String address, Set<Event> mergeEvents, LastMergeEventInfo lastMergeEventInfo) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mergeEvents, 10));
        Iterator<T> it2 = mergeEvents.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Event) it2.next()).syncId);
        }
        lastMergeEventInfo.getInfo().put("phone", arrayList);
        lastMergeEventInfo.getInfo().put(address, arrayList);
        String json = new Gson().toJson(lastMergeEventInfo);
        Log.d(e, "Merged event sync ids : " + json, new Object[0]);
        AssistantBox.putLastMergeEventInfo(json);
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() throws Throwable {
        String strAddress;
        Map<String, List<String>> info;
        Object next;
        Log.d(e, "onStart!!", new Object[0]);
        Device currentDevice = DeviceManager.getManager(this.mContext).getCurrentDevice();
        if (!AssistantModule.isDeviceConnected(this.mContext)) {
            Log.i(e, "There is NO connected device!!", new Object[0]);
            return false;
        }
        LastMergeEventInfo lastMergeEventInfoC = c();
        ActionResult actionResultQueryAllEvents = ExchangeCenter.queryAllEvents();
        if (!actionResultQueryAllEvents.isSuccess()) {
            Log.d(e, "Query all events error!!", new Object[0]);
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<Event> events = UpdateParser.toEvents(actionResultQueryAllEvents.resultData);
        Log.d(e, "Events from watch : " + events, new Object[0]);
        List<String> list = (currentDevice == null || (strAddress = currentDevice.address()) == null || (info = lastMergeEventInfoC.getInfo()) == null) ? null : info.get(strAddress);
        Log.d(e, "Last device event info : " + list, new Object[0]);
        linkedHashSet.addAll(a(events, list));
        List<Event> listQueryPhoneEventByInstances = EventDao.queryPhoneEventByInstances(this.mContext, TimeUtil.getJulianDay(DateDay.today().add(-3).timeInMillis()), 7);
        Log.d(e, "Events from system : " + listQueryPhoneEventByInstances, new Object[0]);
        Map<String, List<String>> info2 = lastMergeEventInfoC.getInfo();
        List<String> list2 = info2 == null ? null : info2.get("phone");
        Log.d(e, "Last device phone info : " + list2, new Object[0]);
        for (Event event : listQueryPhoneEventByInstances) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (TextUtils.isEmpty(event.syncId)) {
                event.syncId = String.valueOf(jCurrentTimeMillis + 1);
                EventDao.updateEventSyncId(this.mContext, event.id, event.syncId);
            }
        }
        linkedHashSet.addAll(a(listQueryPhoneEventByInstances, list2));
        Log.d(e, "All deleted ids : " + linkedHashSet, new Object[0]);
        List<Event> listD = d(linkedHashSet, events);
        Log.d(e, "Events merged from watch : " + listD, new Object[0]);
        List<Event> listD2 = d(linkedHashSet, listQueryPhoneEventByInstances);
        Log.d(e, "Events merged from system : " + listD2, new Object[0]);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(listD2);
        for (Event event2 : listD) {
            Iterator it2 = linkedHashSet2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((Event) next).syncId, event2.syncId));
            if (((Event) next) == null) {
                linkedHashSet2.add(event2);
            }
        }
        if (!b(linkedHashSet, linkedHashSet2, listQueryPhoneEventByInstances, events)) {
            return false;
        }
        e(currentDevice.address(), linkedHashSet2, lastMergeEventInfoC);
        return true;
    }
}
