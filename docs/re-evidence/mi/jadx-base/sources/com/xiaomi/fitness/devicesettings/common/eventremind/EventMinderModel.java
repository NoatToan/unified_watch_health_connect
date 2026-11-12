package com.xiaomi.fitness.devicesettings.common.eventremind;

import android.content.Context;
import android.text.format.DateFormat;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.EventReMinder;
import com.xiaomi.fitness.settingitem.settingitem.EventReMinderItem;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.b4s;
import defpackage.eu6;
import defpackage.jz6;
import defpackage.k14;
import defpackage.ld8;
import defpackage.lhi;
import defpackage.m28;
import defpackage.mz6;
import defpackage.n64;
import defpackage.o14;
import defpackage.p14;
import defpackage.s7r;
import defpackage.t64;
import defpackage.ua1;
import defpackage.v84;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 r2\u00020\u0001:\u0001rB\u0007¢\u0006\u0004\bq\u0010EJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010 \u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b \u0010\u001bJ-\u0010!\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b%\u0010\u001bJ3\u0010'\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b'\u0010(J3\u0010)\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b)\u0010(J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020/H\u0002¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b7\u0010\fJ\u0017\u00108\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0010J\u0017\u00109\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010\u0010J\u001d\u0010:\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b:\u0010\fJ\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010;\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u0010\u001fJ\u001f\u0010?\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=2\u0006\u00103\u001a\u00020\u0012H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\nH\u0002¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\bF\u0010\fJ\u001d\u0010J\u001a\u00020\n2\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010G¢\u0006\u0004\bJ\u0010KJ%\u0010L\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\bL\u0010MJ#\u0010N\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0017¢\u0006\u0004\bN\u0010OJ+\u0010P\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\bP\u0010\u001bJ+\u0010Q\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\bQ\u0010\u001bJ1\u0010R\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\bR\u0010(J\u0015\u0010T\u001a\u00020\u00122\u0006\u0010S\u001a\u00020\u0012¢\u0006\u0004\bT\u0010UJ\u0015\u0010V\u001a\u00020\u00122\u0006\u0010S\u001a\u00020\u0012¢\u0006\u0004\bV\u0010UJ\u001d\u0010W\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\bW\u0010XJ\r\u0010Y\u001a\u00020\n¢\u0006\u0004\bY\u0010ER\u0014\u0010Z\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bZ\u0010[R\"\u0010\\\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010cR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010cR\u0016\u0010h\u001a\u0004\u0018\u00010g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010l\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010_R\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020\b0\u001d8F¢\u0006\u0006\u001a\u0004\bN\u0010o¨\u0006s"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel;", "", "Ljava/util/Date;", DialWidgetType.DATE, "", "getWeekOfDate", "(Ljava/util/Date;)Ljava/lang/String;", "", "Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;", "mindItemList", "", "sortByStartDate", "(Ljava/util/List;)V", "sortByID", "mindItem", "updateMindItem", "(Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;)V", "item", "", "getIndexById", "(Ljava/util/List;Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;)I", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Leu6;", "", "callBack", "addEventMinderListForBle", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;Leu6;)V", "code", "", "getRepeatDays", "(I)Ljava/util/List;", "addEventMinderForHuami", "updateEventMinderForBle", "Lp14$a;", "convertReminderInfoData", "(Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;)Lp14$a;", "updateEventMinderForHuami", "items", "deleteEventMinderItemsForBle", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/util/List;Leu6;)V", "deleteEventMinderItemsForHuami", "did", "uploadEventMinder", "(Ljava/lang/String;)V", "getItemType", "(Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;)I", "", "startDate", "getTypeDayByStartDate", "(J)I", "loop", "startTime", "getTypeDayByWeek", "(Ljava/lang/String;J)I", "deleteMinderList", "changeItemCountAfterDelete", "addItem", "addMindItem", "count", "getNewIds", "Landroid/content/Context;", "context", "getWeekDesByLoop", "(Landroid/content/Context;I)Ljava/lang/String;", "getDateByStartDate", "(J)Ljava/lang/String;", "getMonthDateByStartDate", "reset", "()V", "init", "", "Lp14;", "reMinderItems", "initBLERemindList", "([Lp14;)V", "updateMindersByXiaoAiSetting", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/util/List;)V", "getEventMinders", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Leu6;)V", "addEventMinder", "updateEventMinder", "deleteEventMinderItems", "type", "getTypeIndex", "(I)I", "getTypeCount", "getItemDes", "(Landroid/content/Context;Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;)Ljava/lang/String;", "destroy", "TAG", "Ljava/lang/String;", "supportMaxItemCount", "I", "getSupportMaxItemCount", "()I", "setSupportMaxItemCount", "(I)V", "todayList", "Ljava/util/List;", "tomorrowList", "afterList", "closeList", "Ljz6;", "disposable", "Ljz6;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "getNewId", "newId", "()Ljava/util/List;", "eventMinders", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEventMinderModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventMinderModel.kt\ncom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1043:1\n1863#2,2:1044\n37#3:1046\n36#3,3:1047\n37#3:1050\n36#3,3:1051\n*S KotlinDebug\n*F\n+ 1 EventMinderModel.kt\ncom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel\n*L\n637#1:1044,2\n761#1:1046\n761#1:1047,3\n1001#1:1050\n1001#1:1051,3\n*E\n"})
public final class EventMinderModel {
    private static final int SUPPORT_MAX_MINDER_COUNT = 50;
    public static final int TYPE_AFTER = 2;
    public static final int TYPE_CLOSE = -1;
    public static final int TYPE_TODAY = 0;
    public static final int TYPE_TOMORROW = 1;

    @Nullable
    private final jz6 disposable;

    @NotNull
    private final String TAG = "EventMinderModel";
    private int supportMaxItemCount = 50;

    @NotNull
    private final List<EventReMinderItem> todayList = new ArrayList();

    @NotNull
    private final List<EventReMinderItem> tomorrowList = new ArrayList();

    @NotNull
    private final List<EventReMinderItem> afterList = new ArrayList();

    @NotNull
    private final List<EventReMinderItem> closeList = new ArrayList();

    private final synchronized void addEventMinderForHuami(final WearableDeviceModel deviceModel, EventReMinderItem mindItem, final eu6<Boolean> callBack) {
        try {
            final ArrayList arrayList = new ArrayList();
            if (!DeviceModelExtKt.isKongMing(deviceModel)) {
                mindItem.setFrom("0");
            }
            arrayList.add(mindItem);
            String loop = mindItem.getLoop();
            Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
            if (StringsKt__StringsKt.contains$default((CharSequence) loop, (CharSequence) ",", false, 2, (Object) null)) {
                String loopByStartDate = EventMinderUtil.INSTANCE.getLoopByStartDate(mindItem);
                String loop2 = mindItem.getLoop();
                Intrinsics.checkNotNullExpressionValue(loop2, "getLoop(...)");
                if (!StringsKt__StringsKt.contains$default((CharSequence) loop2, (CharSequence) loopByStartDate, false, 2, (Object) null)) {
                    EventReMinderItem eventReMinderItemM557clone = mindItem.m557clone();
                    Intrinsics.checkNotNullExpressionValue(eventReMinderItemM557clone, "clone(...)");
                    eventReMinderItemM557clone.setLoop(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD);
                    eventReMinderItemM557clone.setCreateDateLong(System.currentTimeMillis());
                    arrayList.add(eventReMinderItemM557clone);
                }
            }
            List<Integer> newIds = getNewIds(arrayList.size());
            int size = newIds.size();
            for (int i = 0; i < size; i++) {
                if (newIds.get(i).intValue() < 50) {
                    ((EventReMinderItem) arrayList.get(i)).setId(newIds.get(i).intValue());
                } else {
                    try {
                        arrayList.remove(arrayList.get(i));
                    } catch (Exception e) {
                        e.printStackTrace();
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
            if (arrayList.size() >= 1 || callBack == null) {
                com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.syncEventMinders(deviceModel, arrayList).H(ua1.c()).a(new mz6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderModel.addEventMinderForHuami.1
                    @Override // defpackage.z5h
                    public void onComplete() {
                    }

                    @Override // defpackage.z5h
                    public void onError(Throwable e2) {
                        Intrinsics.checkNotNullParameter(e2, "e");
                        Logger.i("sync reminderInfo error:" + v84.f(e2), new Object[0]);
                        eu6<Boolean> eu6Var = callBack;
                        if (eu6Var != null) {
                            eu6Var.onResult(Boolean.FALSE);
                        }
                    }

                    @Override // defpackage.z5h
                    public /* bridge */ /* synthetic */ void onNext(Object obj) {
                        onNext(((Boolean) obj).booleanValue());
                    }

                    public void onNext(boolean isSuccess) {
                        Logger.i("sync reminderInfo " + isSuccess, new Object[0]);
                        if (isSuccess) {
                            EventMinderModel.this.addMindItem(arrayList);
                            EventMinderModel.this.uploadEventMinder(deviceModel.getDeviceInfo().getDid());
                        }
                        eu6<Boolean> eu6Var = callBack;
                        if (eu6Var != null) {
                            eu6Var.onResult(Boolean.valueOf(isSuccess));
                        }
                    }
                });
            } else {
                callBack.onResult(Boolean.FALSE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void addEventMinderListForBle(WearableDeviceModel deviceModel, final EventReMinderItem mindItem, final eu6<Boolean> callBack) {
        p14.a aVarConvertReminderInfoData = convertReminderInfoData(mindItem);
        final s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 15;
        k14 k14Var = new k14();
        k14Var.H(aVarConvertReminderInfoData);
        s7rVar.P(k14Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderModel.addEventMinderListForBle.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(this.TAG, "addEventMinderListForBle onError" + code);
                callBack.onResult(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, final SyncResult result) {
                s7r packet;
                k14 k14VarQ;
                s7r packet2;
                k14 k14VarQ2;
                k14 k14VarQ3;
                Integer numValueOf = null;
                if (result == null || (packet2 = result.getPacket()) == null || (k14VarQ2 = packet2.q()) == null || !k14VarQ2.z()) {
                    if (result != null && (packet = result.getPacket()) != null && (k14VarQ = packet.q()) != null) {
                        numValueOf = Integer.valueOf(k14VarQ.o());
                    }
                    Logger.i(this.TAG, "addEventMinderListForBle clockError = " + numValueOf);
                    callBack.onResult(Boolean.FALSE);
                    return;
                }
                EventReMinderItem eventReMinderItem = mindItem;
                s7r packet3 = result.getPacket();
                eventReMinderItem.setId((packet3 == null || (k14VarQ3 = packet3.q()) == null) ? -1 : k14VarQ3.s());
                this.addItem(mindItem);
                Logger.i(this.TAG, "addEventMinderListForBle onSuccess id " + mindItem.getId());
                String loopByStartDate = EventMinderUtil.INSTANCE.getLoopByStartDate(mindItem);
                String loop = mindItem.getLoop();
                Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
                if (StringsKt__StringsKt.contains$default((CharSequence) loop, (CharSequence) ",", false, 2, (Object) null)) {
                    String loop2 = mindItem.getLoop();
                    Intrinsics.checkNotNullExpressionValue(loop2, "getLoop(...)");
                    if (!StringsKt__StringsKt.contains$default((CharSequence) loop2, (CharSequence) loopByStartDate, false, 2, (Object) null)) {
                        final EventReMinderItem eventReMinderItemM557clone = mindItem.m557clone();
                        Intrinsics.checkNotNullExpressionValue(eventReMinderItemM557clone, "clone(...)");
                        eventReMinderItemM557clone.setLoop(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD);
                        eventReMinderItemM557clone.setCreateDateLong(System.currentTimeMillis());
                        p14.a aVarConvertReminderInfoData2 = this.convertReminderInfoData(eventReMinderItemM557clone);
                        s7r s7rVar2 = new s7r();
                        s7rVar2.e = 17;
                        s7rVar2.f = 15;
                        k14 k14Var2 = new k14();
                        k14Var2.H(aVarConvertReminderInfoData2);
                        s7rVar2.P(k14Var2);
                        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                        s7r s7rVar3 = s7rVar;
                        final EventMinderModel eventMinderModel = this;
                        final eu6<Boolean> eu6Var = callBack;
                        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar3, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderModel$addEventMinderListForBle$1$onSuccess$1
                            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                            public void onError(String did2, int type2, int code) {
                                s7r packet4;
                                k14 k14VarQ4;
                                SyncResult syncResult = result;
                                Integer numValueOf2 = (syncResult == null || (packet4 = syncResult.getPacket()) == null || (k14VarQ4 = packet4.q()) == null) ? null : Integer.valueOf(k14VarQ4.o());
                                Logger.i(eventMinderModel.TAG, "addEventMinderListForBle clockError = " + numValueOf2);
                                eu6Var.onResult(Boolean.FALSE);
                            }

                            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                            public void onSuccess(String did2, int type2, SyncResult result2) {
                                s7r packet4;
                                k14 k14VarQ4;
                                s7r packet5;
                                k14 k14VarQ5;
                                k14 k14VarQ6;
                                if (result2 == null || (packet5 = result2.getPacket()) == null || (k14VarQ5 = packet5.q()) == null || !k14VarQ5.z()) {
                                    Integer numValueOf2 = (result2 == null || (packet4 = result2.getPacket()) == null || (k14VarQ4 = packet4.q()) == null) ? null : Integer.valueOf(k14VarQ4.o());
                                    Logger.i(eventMinderModel.TAG, "addEventMinderListForBle add new clockError = " + numValueOf2);
                                    eu6Var.onResult(Boolean.FALSE);
                                    return;
                                }
                                EventReMinderItem eventReMinderItem2 = eventReMinderItemM557clone;
                                s7r packet6 = result2.getPacket();
                                eventReMinderItem2.setId((packet6 == null || (k14VarQ6 = packet6.q()) == null) ? -1 : k14VarQ6.s());
                                Logger.i(eventMinderModel.TAG, "addEventMinderListForBle add new onSuccess id " + eventReMinderItemM557clone.getId());
                                eventMinderModel.addItem(eventReMinderItemM557clone);
                                eu6Var.onResult(Boolean.TRUE);
                            }
                        }, 0, 8, null);
                        return;
                    }
                }
                callBack.onResult(Boolean.TRUE);
            }
        }, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addItem(EventReMinderItem mindItem) {
        int itemType = getItemType(mindItem);
        if (itemType == -1) {
            this.closeList.add(mindItem);
            sortByStartDate(this.closeList);
        } else if (itemType == 0) {
            this.todayList.add(mindItem);
            sortByStartDate(this.todayList);
        } else if (itemType != 1) {
            this.afterList.add(mindItem);
            sortByStartDate(this.afterList);
        } else {
            this.tomorrowList.add(mindItem);
            sortByStartDate(this.tomorrowList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addMindItem(List<? extends EventReMinderItem> items) {
        Iterator<? extends EventReMinderItem> it = items.iterator();
        while (it.hasNext()) {
            addItem(it.next());
        }
    }

    private final void changeItemCountAfterDelete(EventReMinderItem mindItem) {
        if (this.todayList.remove(mindItem) || this.tomorrowList.remove(mindItem) || this.afterList.remove(mindItem)) {
            return;
        }
        this.closeList.remove(mindItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p14.a convertReminderInfoData(EventReMinderItem mindItem) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(EventMinderUtil.INSTANCE.localToUTC(mindItem.getStartDateLong()));
        n64 n64Var = new n64();
        n64Var.c = calendar.get(1);
        n64Var.d = calendar.get(2) + 1;
        int repeat = 5;
        n64Var.e = calendar.get(5);
        t64 t64Var = new t64();
        t64Var.c = calendar.get(11);
        t64Var.d = calendar.get(12);
        int i = 0;
        if (mindItem.getRepeat() != -1) {
            repeat = mindItem.getRepeat();
        } else {
            String loop = mindItem.getLoop();
            if (loop != null) {
                int iHashCode = loop.hashCode();
                if (iHashCode != 48) {
                    if (iHashCode != 1567) {
                        if (iHashCode != 56) {
                            if (iHashCode == 57 && loop.equals(UserConfig.KEY_LITE_SCENE_ORDER)) {
                                repeat = 8;
                            }
                        } else if (loop.equals(UserConfig.KEY_MI_BRAIN_SETTING)) {
                            repeat = 7;
                        }
                    } else if (loop.equals(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD)) {
                        repeat = 0;
                    }
                } else if (loop.equals("0")) {
                    repeat = 1;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        String loop2 = mindItem.getLoop();
        Intrinsics.checkNotNullExpressionValue(loop2, "getLoop(...)");
        if (StringsKt__StringsKt.contains$default((CharSequence) loop2, (CharSequence) ",", false, 2, (Object) null)) {
            String loop3 = mindItem.getLoop();
            Intrinsics.checkNotNullExpressionValue(loop3, "getLoop(...)");
            arrayList.addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default((CharSequence) loop3, new String[]{","}, false, 0, 6, (Object) null)));
        } else {
            arrayList.add((calendar.get(7) == 1 ? UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP : Integer.valueOf(calendar.get(7) - 1)).toString());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i |= 1 << (Integer.parseInt((String) it.next()) - 1);
        }
        p14.a aVar = new p14.a();
        aVar.g = mindItem.getTitle();
        aVar.c = n64Var;
        aVar.d = t64Var;
        aVar.e = repeat;
        aVar.f = i;
        Logger.i(this.TAG, "convertReminderInfoData EventReMinderItem = " + mindItem + "ReminderInfo.Data" + aVar);
        return aVar;
    }

    private final void deleteEventMinderItemsForBle(WearableDeviceModel deviceModel, final List<? extends EventReMinderItem> items, final eu6<Boolean> callBack) {
        if (items.isEmpty()) {
            callBack.onResult(Boolean.FALSE);
            return;
        }
        Logger.d(this.TAG, "deleteEventMinderItemsForBle = " + items);
        final ArrayList arrayList = new ArrayList();
        for (EventReMinderItem eventReMinderItem : items) {
            getItemType(eventReMinderItem);
            arrayList.add(Integer.valueOf(eventReMinderItem.getId()));
        }
        if (arrayList.isEmpty()) {
            callBack.onResult(Boolean.FALSE);
            return;
        }
        o14 o14Var = new o14();
        o14Var.c = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        k14 k14Var = new k14();
        k14Var.I(o14Var);
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 18;
        s7rVar.P(k14Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderModel.deleteEventMinderItemsForBle.2
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(EventMinderModel.this.TAG, "deleteEventMinderItemsForBle onError");
                EventMinderModel.this.deleteMinderList(items);
                callBack.onResult(Boolean.TRUE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(EventMinderModel.this.TAG, "deleteEventMinderItemsForBle onSuccess = " + arrayList);
                EventMinderModel.this.deleteMinderList(items);
                callBack.onResult(Boolean.TRUE);
            }
        }, 0, 8, null);
    }

    private final void deleteEventMinderItemsForHuami(final WearableDeviceModel deviceModel, final List<? extends EventReMinderItem> items, final eu6<Boolean> callBack) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends EventReMinderItem> it = items.iterator();
        while (it.hasNext()) {
            EventReMinderItem eventReMinderItemM557clone = it.next().m557clone();
            eventReMinderItemM557clone.setOp(2);
            arrayList.add(eventReMinderItemM557clone);
        }
        com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.syncEventMinders(deviceModel, arrayList).H(ua1.c()).a(new mz6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderModel.deleteEventMinderItemsForHuami.1
            @Override // defpackage.z5h
            public void onComplete() {
            }

            @Override // defpackage.z5h
            public void onError(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                Logger.i("sync reminderInfo error:" + v84.f(e), new Object[0]);
                eu6<Boolean> eu6Var = callBack;
                if (eu6Var != null) {
                    eu6Var.onResult(Boolean.FALSE);
                }
            }

            @Override // defpackage.z5h
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                onNext(((Boolean) obj).booleanValue());
            }

            public void onNext(boolean isSuccess) {
                Logger.i("sync reminderInfo " + isSuccess, new Object[0]);
                if (isSuccess) {
                    EventMinderModel.this.deleteMinderList(items);
                    EventMinderModel.this.uploadEventMinder(deviceModel.getDeviceInfo().getDid());
                }
                callBack.onResult(Boolean.valueOf(isSuccess));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteMinderList(List<? extends EventReMinderItem> mindItemList) {
        Iterator<? extends EventReMinderItem> it = mindItemList.iterator();
        while (it.hasNext()) {
            changeItemCountAfterDelete(it.next());
        }
    }

    private final String getDateByStartDate(long startDate) {
        return TimeDateUtil.getDayFormat(TimeDateUtil.timestampToLocalDate(startDate / ((long) 1000)));
    }

    private final int getIndexById(List<? extends EventReMinderItem> mindItemList, EventReMinderItem item) {
        int size = mindItemList.size();
        for (int i = 0; i < size; i++) {
            if (mindItemList.get(i).getId() == item.getId()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:60:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00d2, please report this as an issue */
    private final int getItemType(EventReMinderItem item) {
        String loop;
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        int iMin = 2;
        if (DeviceModelExtKt.isHuaMi(mDeviceModel) && (item.getOp() == 0 || item.getOp() == 2)) {
            return -1;
        }
        String loop2 = item.getLoop();
        if (loop2 == null) {
            loop = item.getLoop();
            Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
            if (StringsKt__StringsKt.contains$default((CharSequence) loop, (CharSequence) ",", false, 2, (Object) null)) {
                String loop3 = item.getLoop();
                Intrinsics.checkNotNullExpressionValue(loop3, "getLoop(...)");
                return getTypeDayByWeek(loop3, item.getStartDateLong());
            }
            String loop4 = item.getLoop();
            Intrinsics.checkNotNullExpressionValue(loop4, "getLoop(...)");
            for (String str : (String[]) StringsKt__StringsKt.split$default((CharSequence) loop4, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0])) {
                if (str.length() > 0) {
                    iMin = Math.min(iMin, getTypeDayByWeek(str, item.getStartDateLong()));
                }
            }
        } else {
            int iHashCode = loop2.hashCode();
            if (iHashCode != 48) {
                if (iHashCode != 1567) {
                    if (iHashCode == 56 ? loop2.equals(UserConfig.KEY_MI_BRAIN_SETTING) : iHashCode == 57 && loop2.equals(UserConfig.KEY_LITE_SCENE_ORDER)) {
                        if (System.currentTimeMillis() - item.getStartDateLong() < 0) {
                            return getTypeDayByStartDate(item.getStartDateLong());
                        }
                    }
                } else if (loop2.equals(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD)) {
                    if (System.currentTimeMillis() - item.getStartDateLong() < 0) {
                        return getTypeDayByStartDate(item.getStartDateLong());
                    }
                    item.setOp(0);
                    return -1;
                }
            } else if (loop2.equals("0")) {
                if (System.currentTimeMillis() - item.getStartDateLong() < 0) {
                    return getTypeDayByStartDate(item.getStartDateLong());
                }
                WearableDeviceModel mDeviceModel2 = getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel2);
                if (DeviceModelExtKt.isHuaMi(mDeviceModel2)) {
                    return 1;
                }
                item.setOp(1);
                return 1;
            }
            loop = item.getLoop();
            Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
            if (StringsKt__StringsKt.contains$default((CharSequence) loop, (CharSequence) ",", false, 2, (Object) null)) {
                String loop5 = item.getLoop();
                Intrinsics.checkNotNullExpressionValue(loop5, "getLoop(...)");
                return getTypeDayByWeek(loop5, item.getStartDateLong());
            }
            String loop6 = item.getLoop();
            Intrinsics.checkNotNullExpressionValue(loop6, "getLoop(...)");
            while (i < r1) {
                if (str.length() > 0) {
                    iMin = Math.min(iMin, getTypeDayByWeek(str, item.getStartDateLong()));
                }
            }
        }
        return iMin;
    }

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final String getMonthDateByStartDate(long startDate) {
        return TimeDateUtil.getDateMMddSimpleFormat(TimeDateUtil.timestampToLocalDate(startDate / ((long) 1000)));
    }

    private final int getNewId() {
        List<EventReMinderItem> eventMinders = getEventMinders();
        int i = 0;
        if (eventMinders != null && eventMinders.size() != 0) {
            sortByID(eventMinders);
            Iterator<EventReMinderItem> it = eventMinders.iterator();
            while (it.hasNext() && it.next().getId() == i) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[LOOP:0: B:8:0x001a->B:23:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0059 A[EDGE_INSN: B:35:0x0059->B:24:0x0059 BREAK  A[LOOP:0: B:8:0x001a->B:23:0x0056], SYNTHETIC] */
    private final List<Integer> getNewIds(int count) {
        ArrayList arrayList = new ArrayList(count);
        List<EventReMinderItem> eventMinders = getEventMinders();
        int i = 0;
        if (eventMinders == null || eventMinders.size() == 0) {
            while (i < count) {
                arrayList.add(Integer.valueOf(i));
                i++;
            }
            return arrayList;
        }
        sortByID(eventMinders);
        for (EventReMinderItem eventReMinderItem : eventMinders) {
            if (eventReMinderItem.getId() != i) {
                arrayList.add(Integer.valueOf(i));
                if (arrayList.size() == count) {
                    break;
                }
                int id = eventReMinderItem.getId();
                do {
                    i++;
                    if (i >= id) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(i));
                } while (arrayList.size() != count);
                if (arrayList.size() == count) {
                    break;
                }
                i++;
            } else {
                if (arrayList.size() == count) {
                    break;
                    break;
                }
                i++;
            }
        }
        if (arrayList.size() < count) {
            for (int size = arrayList.size(); size < count; size++) {
                arrayList.add(Integer.valueOf(i + size));
            }
        }
        return arrayList;
    }

    private final List<String> getRepeatDays(int code) {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (code != 0) {
            if ((code & 1) == 1) {
                arrayList.add(String.valueOf(i));
            }
            i++;
            code >>= 1;
        }
        return arrayList;
    }

    private final int getTypeDayByStartDate(long startDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, calendar.get(1));
        calendar2.set(2, calendar.get(2));
        calendar2.set(5, calendar.get(5));
        calendar2.set(10, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(10, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        calendar3.set(14, 0);
        int timeInMillis = (int) ((calendar2.getTimeInMillis() - calendar3.getTimeInMillis()) / ((long) 86400000));
        if (timeInMillis > 2) {
            return 2;
        }
        return timeInMillis;
    }

    private final int getTypeDayByWeek(String loop, long startTime) {
        int i = Integer.parseInt(loop) - Integer.parseInt(EventMinderUtil.INSTANCE.calendarWeekToLoop(Calendar.getInstance().get(7)));
        if (i != 0) {
            if (i >= 0 && i <= 2) {
                return i;
            }
            return 2;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        Calendar calendar2 = Calendar.getInstance();
        calendar.set(1, calendar2.get(1));
        calendar.set(2, calendar2.get(2));
        calendar.set(5, calendar2.get(5));
        return System.currentTimeMillis() - calendar.getTimeInMillis() < 0 ? 0 : 2;
    }

    private final String getWeekDesByLoop(Context context, int loop) {
        String[] stringArray = context.getResources().getStringArray(lhi.i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String str = stringArray[loop];
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        return str;
    }

    private final String getWeekOfDate(Date date) {
        String[] strArr = {UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, "1", "2", "3", "4", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "6"};
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(7) - 1;
        if (i < 0) {
            i = 0;
        }
        return strArr[i];
    }

    private final void reset() {
        this.todayList.clear();
        this.tomorrowList.clear();
        this.afterList.clear();
        this.closeList.clear();
    }

    private final void sortByID(List<? extends EventReMinderItem> mindItemList) {
        final Function2 function2 = new Function2() { // from class: xd8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(EventMinderModel.sortByID$lambda$1((EventReMinderItem) obj, (EventReMinderItem) obj2));
            }
        };
        Collections.sort(mindItemList, new Comparator() { // from class: yd8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return EventMinderModel.sortByID$lambda$2(function2, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByID$lambda$1(EventReMinderItem item, EventReMinderItem t1) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(t1, "t1");
        return item.getId() - t1.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByID$lambda$2(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final void sortByStartDate(List<? extends EventReMinderItem> mindItemList) {
        Collections.sort(mindItemList, new Comparator() { // from class: wd8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return EventMinderModel.sortByStartDate$lambda$0((EventReMinderItem) obj, (EventReMinderItem) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByStartDate$lambda$0(EventReMinderItem eventReMinderItem, EventReMinderItem eventReMinderItem2) {
        return Intrinsics.compare(eventReMinderItem.getStartDateLong(), eventReMinderItem2.getStartDateLong());
    }

    private final void updateEventMinderForBle(WearableDeviceModel deviceModel, final EventReMinderItem mindItem, final eu6<Boolean> callBack) {
        p14.a aVarConvertReminderInfoData = convertReminderInfoData(mindItem);
        p14 p14Var = new p14();
        p14Var.c = mindItem.getId();
        p14Var.d = aVarConvertReminderInfoData;
        final s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 17;
        k14 k14Var = new k14();
        k14Var.J(p14Var);
        s7rVar.P(k14Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderModel.updateEventMinderForBle.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(EventMinderModel.this.TAG, "updateEventMinderForBle onError" + code);
                callBack.onResult(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(EventMinderModel.this.TAG, "updateEventMinderForBle onSuccess id " + mindItem.getId());
                EventMinderModel.this.updateMindItem(mindItem);
                String loopByStartDate = EventMinderUtil.INSTANCE.getLoopByStartDate(mindItem);
                String loop = mindItem.getLoop();
                Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
                if (StringsKt__StringsKt.contains$default((CharSequence) loop, (CharSequence) ",", false, 2, (Object) null)) {
                    String loop2 = mindItem.getLoop();
                    Intrinsics.checkNotNullExpressionValue(loop2, "getLoop(...)");
                    if (!StringsKt__StringsKt.contains$default((CharSequence) loop2, (CharSequence) loopByStartDate, false, 2, (Object) null)) {
                        final EventReMinderItem eventReMinderItemM557clone = mindItem.m557clone();
                        Intrinsics.checkNotNullExpressionValue(eventReMinderItemM557clone, "clone(...)");
                        eventReMinderItemM557clone.setLoop(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD);
                        eventReMinderItemM557clone.setCreateDateLong(System.currentTimeMillis());
                        p14.a aVarConvertReminderInfoData2 = EventMinderModel.this.convertReminderInfoData(eventReMinderItemM557clone);
                        s7r s7rVar2 = new s7r();
                        s7rVar2.e = 17;
                        s7rVar2.f = 15;
                        k14 k14Var2 = new k14();
                        k14Var2.H(aVarConvertReminderInfoData2);
                        s7rVar2.P(k14Var2);
                        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                        s7r s7rVar3 = s7rVar;
                        final EventMinderModel eventMinderModel = EventMinderModel.this;
                        final eu6<Boolean> eu6Var = callBack;
                        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar3, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderModel$updateEventMinderForBle$1$onSuccess$1
                            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                            public void onError(String did2, int type2, int code) {
                                Logger.i(eventMinderModel.TAG, "updateEventMinderForBle add new onError" + eventReMinderItemM557clone.getId());
                                eu6Var.onResult(Boolean.FALSE);
                            }

                            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                            public void onSuccess(String did2, int type2, SyncResult result2) {
                                s7r packet;
                                k14 k14VarQ;
                                s7r packet2;
                                k14 k14VarQ2;
                                k14 k14VarQ3;
                                if (result2 == null || (packet2 = result2.getPacket()) == null || (k14VarQ2 = packet2.q()) == null || !k14VarQ2.z()) {
                                    Integer numValueOf = (result2 == null || (packet = result2.getPacket()) == null || (k14VarQ = packet.q()) == null) ? null : Integer.valueOf(k14VarQ.o());
                                    Logger.i(eventMinderModel.TAG, "addEventMinderListForBle clockError = " + numValueOf);
                                    eu6Var.onResult(Boolean.FALSE);
                                    return;
                                }
                                EventReMinderItem eventReMinderItem = eventReMinderItemM557clone;
                                s7r packet3 = result2.getPacket();
                                eventReMinderItem.setId((packet3 == null || (k14VarQ3 = packet3.q()) == null) ? -1 : k14VarQ3.s());
                                Logger.i(eventMinderModel.TAG, "updateEventMinderForBle add new onSuccess id " + eventReMinderItemM557clone.getId());
                                eventMinderModel.addItem(eventReMinderItemM557clone);
                                eu6Var.onResult(Boolean.TRUE);
                            }
                        }, 0, 8, null);
                        return;
                    }
                }
                callBack.onResult(Boolean.TRUE);
            }
        }, 0, 8, null);
    }

    private final void updateEventMinderForHuami(final WearableDeviceModel deviceModel, EventReMinderItem mindItem, final eu6<Boolean> callBack) {
        final ArrayList arrayList = new ArrayList();
        if (!DeviceModelExtKt.isKongMing(deviceModel)) {
            mindItem.setFrom("0");
        }
        arrayList.add(mindItem);
        String loop = mindItem.getLoop();
        Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
        if (StringsKt__StringsKt.contains$default((CharSequence) loop, (CharSequence) ",", false, 2, (Object) null)) {
            String loopByStartDate = EventMinderUtil.INSTANCE.getLoopByStartDate(mindItem);
            String loop2 = mindItem.getLoop();
            Intrinsics.checkNotNullExpressionValue(loop2, "getLoop(...)");
            if (!StringsKt__StringsKt.contains$default((CharSequence) loop2, (CharSequence) loopByStartDate, false, 2, (Object) null)) {
                EventReMinderItem eventReMinderItemM557clone = mindItem.m557clone();
                Intrinsics.checkNotNullExpressionValue(eventReMinderItemM557clone, "clone(...)");
                eventReMinderItemM557clone.setLoop(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD);
                eventReMinderItemM557clone.setCreateDateLong(System.currentTimeMillis());
                int newId = getNewId();
                if (newId < 50) {
                    eventReMinderItemM557clone.setId(newId);
                    arrayList.add(eventReMinderItemM557clone);
                }
            }
        }
        com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.syncEventMinders(deviceModel, arrayList).H(ua1.c()).a(new mz6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderModel.updateEventMinderForHuami.1
            @Override // defpackage.z5h
            public void onComplete() {
            }

            @Override // defpackage.z5h
            public void onError(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                Logger.i("sync reminderInfo error:" + v84.f(e), new Object[0]);
                eu6<Boolean> eu6Var = callBack;
                if (eu6Var != null) {
                    eu6Var.onResult(Boolean.FALSE);
                }
            }

            @Override // defpackage.z5h
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                onNext(((Boolean) obj).booleanValue());
            }

            public void onNext(boolean isSuccess) {
                Logger.i("sync reminderInfo " + isSuccess, new Object[0]);
                if (isSuccess) {
                    EventMinderModel.this.updateMindItem(arrayList.get(0));
                    if (arrayList.size() > 1) {
                        EventMinderModel.this.addItem(arrayList.get(1));
                    }
                    EventMinderModel.this.uploadEventMinder(deviceModel.getDeviceInfo().getDid());
                }
                eu6<Boolean> eu6Var = callBack;
                if (eu6Var != null) {
                    eu6Var.onResult(Boolean.valueOf(isSuccess));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMindItem(EventReMinderItem mindItem) {
        List<EventReMinderItem> eventMinders = getEventMinders();
        int indexById = getIndexById(eventMinders, mindItem);
        if (indexById != -1) {
            eventMinders.remove(indexById);
        }
        eventMinders.add(mindItem);
        init(eventMinders);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadEventMinder(String did) {
        EventReMinder eventReMinder = new EventReMinder();
        eventReMinder.setMindItems(getEventMinders());
        eventReMinder.setSupportMaxNum(this.supportMaxItemCount);
        DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(did, DeviceSettingConfigKey.BIG_KEY_EVENT_REMINDER, eventReMinder);
    }

    public final void addEventMinder(@NotNull WearableDeviceModel deviceModel, @NotNull EventReMinderItem mindItem, @NotNull eu6<Boolean> callBack) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(mindItem, "mindItem");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (DeviceModelExtKt.isHuaMi(deviceModel)) {
            addEventMinderForHuami(deviceModel, mindItem, callBack);
        } else {
            addEventMinderListForBle(deviceModel, mindItem, callBack);
        }
    }

    public final synchronized void deleteEventMinderItems(@NotNull WearableDeviceModel deviceModel, @NotNull List<? extends EventReMinderItem> items, @NotNull eu6<Boolean> callBack) {
        try {
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(callBack, "callBack");
            if (DeviceModelExtKt.isHuaMi(deviceModel)) {
                deleteEventMinderItemsForHuami(deviceModel, items, callBack);
            } else {
                deleteEventMinderItemsForBle(deviceModel, items, callBack);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void destroy() {
        jz6 jz6Var = this.disposable;
        if (jz6Var == null || jz6Var.isDisposed()) {
            return;
        }
        this.disposable.dispose();
    }

    public final void getEventMinders(@NotNull WearableDeviceModel deviceModel, @NotNull final eu6<EventMinderModel> callBack) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (!deviceModel.getDeviceInfo().isHuaMi()) {
            s7r s7rVar = new s7r();
            s7rVar.e = 17;
            s7rVar.f = 14;
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderModel.getEventMinders.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(EventMinderModel.this.TAG, "getEventMinders onError:" + code);
                    callBack.onResult(EventMinderModel.this);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    s7r packet;
                    k14 k14VarQ;
                    p14.b bVarU = (result == null || (packet = result.getPacket()) == null || (k14VarQ = packet.q()) == null) ? null : k14VarQ.u();
                    Logger.i(EventMinderModel.this.TAG, "getEventMinders onSuccess:" + bVarU);
                    if (bVarU != null) {
                        EventMinderModel.this.setSupportMaxItemCount(bVarU.d);
                        EventMinderModel.this.initBLERemindList(bVarU.c);
                    }
                    callBack.onResult(EventMinderModel.this);
                }
            }, 0, 8, null);
            return;
        }
        this.supportMaxItemCount = 50;
        EventReMinder eventReMinder = (EventReMinder) DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDeviceInfo().getDid(), DeviceSettingConfigKey.BIG_KEY_EVENT_REMINDER).valueToObject(EventReMinder.class);
        if (eventReMinder != null) {
            init(eventReMinder.getMindItems());
        }
        callBack.onResult(this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final String getItemDes(@NotNull Context context, @NotNull EventReMinderItem mindItem) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mindItem, "mindItem");
        boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
        String loop = mindItem.getLoop();
        if (loop != null) {
            int iHashCode = loop.hashCode();
            if (iHashCode != 1567) {
                switch (iHashCode) {
                    case 48:
                        if (loop.equals("0")) {
                            return context.getString(wzi.S1) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getStartDateLong(), zIs24HourFormat);
                        }
                        break;
                    case 49:
                        if (loop.equals("1")) {
                            return context.getString(wzi.U1) + " " + getWeekDesByLoop(context, 0) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getStartDateLong(), zIs24HourFormat);
                        }
                        break;
                    case 50:
                        if (loop.equals("2")) {
                            return context.getString(wzi.U1) + " " + getWeekDesByLoop(context, 1) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getStartDateLong(), zIs24HourFormat);
                        }
                        break;
                    case 51:
                        if (loop.equals("3")) {
                            return context.getString(wzi.U1) + " " + getWeekDesByLoop(context, 2) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getStartDateLong(), zIs24HourFormat);
                        }
                        break;
                    case 52:
                        if (loop.equals("4")) {
                            return context.getString(wzi.U1) + " " + getWeekDesByLoop(context, 3) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getStartDateLong(), zIs24HourFormat);
                        }
                        break;
                    case 53:
                        if (loop.equals(UserConfig.KEY_DEVICE_LITE_SORT_GROUP)) {
                            return context.getString(wzi.U1) + " " + getWeekDesByLoop(context, 4) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getStartDateLong(), zIs24HourFormat);
                        }
                        break;
                    case 54:
                        if (loop.equals("6")) {
                            return context.getString(wzi.U1) + " " + getWeekDesByLoop(context, 5) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getStartDateLong(), zIs24HourFormat);
                        }
                        break;
                    case 55:
                        if (loop.equals(UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP)) {
                            return context.getString(wzi.U1) + " " + getWeekDesByLoop(context, 6) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getStartDateLong(), zIs24HourFormat);
                        }
                        break;
                    case 56:
                        if (loop.equals(UserConfig.KEY_MI_BRAIN_SETTING)) {
                            return context.getString(wzi.T1) + " " + getDateByStartDate(mindItem.getStartDateLong()) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getStartDateLong(), zIs24HourFormat);
                        }
                        break;
                    case 57:
                        if (loop.equals(UserConfig.KEY_LITE_SCENE_ORDER)) {
                            return context.getString(wzi.V1) + " " + getMonthDateByStartDate(mindItem.getStartDateLong()) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getStartDateLong(), zIs24HourFormat);
                        }
                        break;
                }
            } else if (loop.equals(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD)) {
                return context.getString(wzi.K6) + " " + EventMinderUtil.INSTANCE.getEventMinderYearMonthDayTime(context, mindItem.getStartDateLong(), zIs24HourFormat);
            }
        }
        String loop2 = mindItem.getLoop();
        Intrinsics.checkNotNullExpressionValue(loop2, "getLoop(...)");
        String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) loop2, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        String string = context.getString(wzi.U1);
        EventMinderUtil eventMinderUtil = EventMinderUtil.INSTANCE;
        return string + " " + eventMinderUtil.getWeeksByType(context, strArr) + " " + eventMinderUtil.getEventMinderTime(mindItem.getStartDateLong(), zIs24HourFormat);
    }

    public final int getSupportMaxItemCount() {
        return this.supportMaxItemCount;
    }

    public final int getTypeCount(int type) {
        if (type == -1) {
            return this.closeList.size();
        }
        if (type == 0) {
            return this.todayList.size();
        }
        if (type == 1) {
            return this.tomorrowList.size();
        }
        if (type != 2) {
            return 0;
        }
        return this.afterList.size();
    }

    public final int getTypeIndex(int type) {
        if (type == -1) {
            return this.todayList.size() + this.tomorrowList.size() + this.afterList.size();
        }
        if (type == 1) {
            return this.todayList.size();
        }
        if (type != 2) {
            return 0;
        }
        return this.todayList.size() + this.tomorrowList.size();
    }

    public final synchronized void init(@Nullable List<? extends EventReMinderItem> mindItemList) {
        try {
            reset();
            if (mindItemList != null && (!mindItemList.isEmpty())) {
                for (EventReMinderItem eventReMinderItem : mindItemList) {
                    int itemType = getItemType(eventReMinderItem);
                    if (itemType == -1) {
                        this.closeList.add(eventReMinderItem);
                    } else if (itemType == 0) {
                        this.todayList.add(eventReMinderItem);
                    } else if (itemType == 1) {
                        this.tomorrowList.add(eventReMinderItem);
                    } else if (itemType == 2) {
                        this.afterList.add(eventReMinderItem);
                    }
                }
                if (this.todayList.size() > 1) {
                    sortByStartDate(this.todayList);
                }
                if (this.tomorrowList.size() > 1) {
                    sortByStartDate(this.tomorrowList);
                }
                if (this.afterList.size() > 1) {
                    sortByStartDate(this.afterList);
                }
                if (this.closeList.size() > 1) {
                    sortByStartDate(this.closeList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void initBLERemindList(@Nullable p14[] reMinderItems) {
        Object objValueOf;
        try {
            reset();
            if (reMinderItems != null && reMinderItems.length != 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ArrayIteratorKt.iterator(reMinderItems);
                while (it.hasNext()) {
                    p14 p14Var = (p14) it.next();
                    EventReMinderItem eventReMinderItem = new EventReMinderItem();
                    eventReMinderItem.setId(p14Var.c);
                    eventReMinderItem.setTitle(p14Var.d.g);
                    List<String> repeatDays = getRepeatDays(p14Var.d.f);
                    String strJoinToString$default = repeatDays.size() == 1 ? repeatDays.get(0) : CollectionsKt___CollectionsKt.joinToString$default(repeatDays, ",", null, null, 0, null, null, 62, null);
                    Logger.i(this.TAG, "initBLERemindList weekArray = " + repeatDays + " loop = " + strJoinToString$default);
                    String strValueOf = String.valueOf(p14Var.d.c.c);
                    int i = p14Var.d.c.d;
                    if (i < 10) {
                        objValueOf = "0" + i;
                    } else {
                        objValueOf = Integer.valueOf(i);
                    }
                    p14.a aVar = p14Var.d;
                    int i2 = aVar.c.e;
                    t64 t64Var = aVar.d;
                    Date dateUtcToLocal = EventMinderUtil.INSTANCE.utcToLocal(strValueOf + "-" + objValueOf + "-" + i2 + " " + t64Var.c + ":" + t64Var.d);
                    eventReMinderItem.setStartDateLong(dateUtcToLocal.getTime());
                    arrayList.add(eventReMinderItem);
                    int i3 = p14Var.d.e;
                    if (i3 == 0) {
                        strJoinToString$default = b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD;
                    } else if (i3 == 1) {
                        strJoinToString$default = "0";
                    } else if (i3 != 5) {
                        if (i3 == 6) {
                            strJoinToString$default = getWeekOfDate(dateUtcToLocal);
                        } else if (i3 != 7) {
                            strJoinToString$default = i3 != 8 ? b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD : UserConfig.KEY_LITE_SCENE_ORDER;
                        } else {
                            strJoinToString$default = UserConfig.KEY_MI_BRAIN_SETTING;
                        }
                    } else if (strJoinToString$default.length() == 0 || repeatDays.size() == 1) {
                        strJoinToString$default = getWeekOfDate(dateUtcToLocal);
                    }
                    eventReMinderItem.setLoop(strJoinToString$default);
                }
                init(arrayList);
                Logger.i(this.TAG, "initBLERemindList todayList = " + this.todayList + " tomorrowList = " + this.tomorrowList + " afterList = " + this.afterList + " closeList = " + this.closeList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setSupportMaxItemCount(int i) {
        this.supportMaxItemCount = i;
    }

    public final synchronized void updateEventMinder(@NotNull WearableDeviceModel deviceModel, @NotNull EventReMinderItem mindItem, @NotNull eu6<Boolean> callBack) {
        try {
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(mindItem, "mindItem");
            Intrinsics.checkNotNullParameter(callBack, "callBack");
            if (DeviceModelExtKt.isHuaMi(deviceModel)) {
                updateEventMinderForHuami(deviceModel, mindItem, callBack);
            } else {
                updateEventMinderForBle(deviceModel, mindItem, callBack);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void updateMindersByXiaoAiSetting(@NotNull WearableDeviceModel deviceModel, @Nullable List<? extends EventReMinderItem> mindItemList) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        init(mindItemList);
        uploadEventMinder(deviceModel.getDeviceInfo().getDid());
        ld8.c().l(new m28());
    }

    @NotNull
    public final List<EventReMinderItem> getEventMinders() {
        ArrayList arrayList = new ArrayList();
        if (this.todayList.size() > 0) {
            arrayList.addAll(this.todayList);
        }
        if (this.tomorrowList.size() > 0) {
            arrayList.addAll(this.tomorrowList);
        }
        if (this.afterList.size() > 0) {
            arrayList.addAll(this.afterList);
        }
        if (this.closeList.size() > 0) {
            arrayList.addAll(this.closeList);
        }
        return arrayList;
    }
}
