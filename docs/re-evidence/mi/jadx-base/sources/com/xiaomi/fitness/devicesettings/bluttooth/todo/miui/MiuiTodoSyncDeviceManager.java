package com.xiaomi.fitness.devicesettings.bluttooth.todo.miui;

import android.os.Handler;
import android.os.HandlerThread;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.TodoExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoSyncDeviceManager;
import defpackage.k14;
import defpackage.p14;
import defpackage.s7r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010\u000bJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoSyncDeviceManager;", "", "", "Lp14;", "deviceReminderList", "", "mergeAndSyncMiuiTodoList", "(Ljava/util/List;)V", "coreList", "syncReminderListToDevice", "registerNestMiuiSyncTask", "()V", "", "id", "", "isFinish", "Lp14$d;", "subList", "updateMiuiTodo", "(IZLjava/util/List;)V", "subTodo", "updateMiuiSubIfNeed", "(ILp14$d;)V", "enable", "syncMiuiTodoListToDeviceIfNeed", "(Z)V", "Lp14$c;", "reminderMark", "markMiuiTodoFromDevice", "(Lp14$c;)V", "", "TAG", "Ljava/lang/String;", "LIMIT_COUNT", "I", "Landroid/os/Handler;", "workerHandler", "Landroid/os/Handler;", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMiuiTodoSyncDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiuiTodoSyncDeviceManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoSyncDeviceManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,290:1\n774#2:291\n865#2,2:292\n1863#2,2:294\n1557#2:296\n1628#2,3:297\n1863#2,2:304\n37#3:300\n36#3,3:301\n*S KotlinDebug\n*F\n+ 1 MiuiTodoSyncDeviceManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoSyncDeviceManager\n*L\n69#1:291\n69#1:292,2\n71#1:294,2\n86#1:296\n86#1:297,3\n156#1:304,2\n103#1:300\n103#1:301,3\n*E\n"})
public final class MiuiTodoSyncDeviceManager {

    @NotNull
    public static final MiuiTodoSyncDeviceManager INSTANCE = new MiuiTodoSyncDeviceManager();
    private static final int LIMIT_COUNT = 20;

    @NotNull
    public static final String TAG = "MiuiTodoSyncDeviceManager";
    private static Handler workerHandler;

    private MiuiTodoSyncDeviceManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mergeAndSyncMiuiTodoList(List<p14> deviceReminderList) throws JSONException {
        ArrayList<p14> arrayList;
        Logger.i(TAG, "mergeAndSyncTodoList deviceList " + deviceReminderList);
        if (deviceReminderList != null) {
            arrayList = new ArrayList();
            for (Object obj : deviceReminderList) {
                if (((p14) obj).d.i == 1) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (p14 p14Var : arrayList) {
                MiuiTodoEntity miuiTodoEntityQueryMiuiTodo = MiuiTodoProviderDataHelper.INSTANCE.queryMiuiTodo(ApplicationExtKt.getApplication(), p14Var.c);
                if (miuiTodoEntityQueryMiuiTodo != null) {
                    long lastModifyTimeMillis = miuiTodoEntityQueryMiuiTodo.getLastModifyTimeMillis() / ((long) 1000);
                    p14.a aVar = p14Var.d;
                    if (lastModifyTimeMillis < aVar.f29901k) {
                        MiuiTodoSyncDeviceManager miuiTodoSyncDeviceManager = INSTANCE;
                        int i = p14Var.c;
                        boolean zTransformDeviceTodoStatusToMiui = MiuiTodoSyncDeviceManagerKt.transformDeviceTodoStatusToMiui(aVar.j);
                        p14.d[] dVarArr = p14Var.d.l;
                        miuiTodoSyncDeviceManager.updateMiuiTodo(i, zTransformDeviceTodoStatusToMiui, dVarArr != null ? ArraysKt___ArraysKt.toList(dVarArr) : null);
                    }
                }
            }
        }
        List<MiuiTodoEntity> listQueryMiuiTodoList = MiuiTodoProviderDataHelper.INSTANCE.queryMiuiTodoList(ApplicationExtKt.getApplication(), 20);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryMiuiTodoList, 10));
        Iterator<T> it = listQueryMiuiTodoList.iterator();
        while (it.hasNext()) {
            arrayList2.add(MiuiTodoSyncDeviceManagerKt.toDeviceReminderInfo((MiuiTodoEntity) it.next()));
        }
        if (MiuiTodoSettingHelper.INSTANCE.queryCurrentDeviceMiuiTodoSwitchStatus()) {
            syncReminderListToDevice(arrayList2);
        } else {
            Logger.i(TAG, "mergeAndSyncMiuiTodoList double check enable false,sync empty list");
            syncReminderListToDevice(CollectionsKt__CollectionsKt.emptyList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerNestMiuiSyncTask() {
        Logger.i(TAG, "registerNestMiuiSyncTask clear before task and register new timer task .");
        if (workerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("MIUI_TODO");
            handlerThread.start();
            workerHandler = new Handler(handlerThread.getLooper());
        }
        Handler handler = workerHandler;
        Handler handler2 = null;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("workerHandler");
            handler = null;
        }
        handler.removeCallbacksAndMessages(null);
        Handler handler3 = workerHandler;
        if (handler3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("workerHandler");
        } else {
            handler2 = handler3;
        }
        handler2.postDelayed(new Runnable() { // from class: p6g
            @Override // java.lang.Runnable
            public final void run() {
                MiuiTodoSyncDeviceManager.registerNestMiuiSyncTask$lambda$4();
            }
        }, TimeUnit.HOURS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerNestMiuiSyncTask$lambda$4() {
        Logger.i(TAG, "Timed sync miui task starts");
        if (TodoExtKt.getShowMiuiTodoEntranceEnable()) {
            INSTANCE.syncMiuiTodoListToDeviceIfNeed(MiuiTodoSettingHelper.INSTANCE.queryCurrentDeviceMiuiTodoSwitchStatus());
        }
    }

    private final void syncReminderListToDevice(List<p14> coreList) {
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 19;
        k14 k14Var = new k14();
        p14.b bVar = new p14.b();
        bVar.c = (p14[]) coreList.toArray(new p14[0]);
        k14Var.K(bVar);
        s7rVar.P(k14Var);
        Logger.i(TAG, "syncReminderListToDevice listSize:" + coreList.size() + ";wholePacket:" + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoSyncDeviceManager.syncReminderListToDevice.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(MiuiTodoSyncDeviceManager.TAG, "syncReminderListToDevice onError code " + code);
                MiuiTodoSyncDeviceManager.INSTANCE.registerNestMiuiSyncTask();
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(MiuiTodoSyncDeviceManager.TAG, "syncReminderListToDevice onSuccess");
                MiuiTodoSyncDeviceManager.INSTANCE.registerNestMiuiSyncTask();
            }
        }, 0, 8, null);
    }

    private final void updateMiuiSubIfNeed(int id, p14.d subTodo) {
        SubTodoList getSubTodoList;
        MiuiTodoEntity miuiTodoEntityQueryMiuiTodo = MiuiTodoProviderDataHelper.INSTANCE.queryMiuiTodo(ApplicationExtKt.getApplication(), id);
        List<SubTodoEntity> subTodoEntities = (miuiTodoEntityQueryMiuiTodo == null || (getSubTodoList = miuiTodoEntityQueryMiuiTodo.getGetSubTodoList()) == null) ? null : getSubTodoList.getSubTodoEntities();
        if (subTodoEntities == null) {
            return;
        }
        int size = subTodoEntities.size();
        for (int i = 0; i < size; i++) {
            String content = subTodoEntities.get(i).getContent();
            if (content == null) {
                content = "";
            }
            String str = subTodo.e;
            if (content.length() >= str.length()) {
                String strSubstring = content.substring(0, str.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (Intrinsics.areEqual(strSubstring, str)) {
                    MiuiTodoProviderDataHelper.INSTANCE.changeStubItemFinishStatus(ApplicationExtKt.getApplication(), id, i, MiuiTodoSyncDeviceManagerKt.transformDeviceTodoStatusToMiui(subTodo.d));
                    return;
                }
            }
        }
    }

    private final void updateMiuiTodo(int id, boolean isFinish, List<p14.d> subList) {
        Logger.i(TAG, "updateMiuiTodo " + id + "," + isFinish + ";" + subList);
        MiuiTodoProviderDataHelper.INSTANCE.changeItemFinishStatus(ApplicationExtKt.getApplication(), id, isFinish);
        if (isFinish || subList == null) {
            return;
        }
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            INSTANCE.updateMiuiSubIfNeed(id, (p14.d) it.next());
        }
    }

    public final void markMiuiTodoFromDevice(@NotNull p14.c reminderMark) {
        Intrinsics.checkNotNullParameter(reminderMark, "reminderMark");
        int i = reminderMark.c;
        MiuiTodoEntity miuiTodoEntityQueryMiuiTodo = MiuiTodoProviderDataHelper.INSTANCE.queryMiuiTodo(ApplicationExtKt.getApplication(), i);
        Logger.i(TAG, "markMiuiTodoFromDevice " + reminderMark + ";queryFromMiui " + miuiTodoEntityQueryMiuiTodo);
        if (miuiTodoEntityQueryMiuiTodo == null) {
            return;
        }
        boolean zTransformDeviceTodoStatusToMiui = MiuiTodoSyncDeviceManagerKt.transformDeviceTodoStatusToMiui(reminderMark.e);
        p14.d[] dVarArr = reminderMark.g;
        updateMiuiTodo(i, zTransformDeviceTodoStatusToMiui, dVarArr != null ? ArraysKt___ArraysKt.toList(dVarArr) : null);
    }

    public final void syncMiuiTodoListToDeviceIfNeed(boolean enable) {
        Logger.i(TAG, "syncMiuiTodoListToDeviceIfNeed miuiEnable: " + enable);
        if (!enable) {
            syncReminderListToDevice(CollectionsKt__CollectionsKt.emptyList());
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 14;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoSyncDeviceManager.syncMiuiTodoListToDeviceIfNeed.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(MiuiTodoSyncDeviceManager.TAG, "miuiTodoSync getDeviceReminderList onError " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                k14 k14VarQ;
                p14.b bVarU;
                Logger.i(MiuiTodoSyncDeviceManager.TAG, "miuiTodoSync getDeviceReminderList onSuccess");
                AnyExtKt.io$default(null, new MiuiTodoSyncDeviceManager$syncMiuiTodoListToDeviceIfNeed$1$onSuccess$1((result == null || (packet = result.getPacket()) == null || (k14VarQ = packet.q()) == null || (bVarU = k14VarQ.u()) == null) ? null : bVarU.c, null), 1, null);
            }
        }, 0, 8, null);
    }
}
