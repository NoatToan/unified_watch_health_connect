package com.xiaomi.fitness.devicesettings.bluttooth.todo.remind;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.data.TodoRemindItem;
import defpackage.k14;
import defpackage.o14;
import defpackage.p14;
import defpackage.s7r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\tJ\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R/\u0010$\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020#0\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R)\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110#0\u001e8\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"R)\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110#0\u001e8\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"R\u0011\u0010,\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "Lp14;", "deviceMiuiList", "", "checkDeleteMiuiTodoIfNeed", "(Ljava/util/List;)V", "requestDeviceTodoReminderData", "()V", "", "deleteIdList", "", "needCallbackStatus", "deleteTodoReminderList", "(Ljava/util/List;Z)V", "markDone", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;", "todoRemindItem", "markTodoRemindToDevice", "(ZLcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;)V", "isAdd", "addOrUpdateTodoRemind", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;Z)V", "supportMaxCount", "I", "getSupportMaxCount", "()I", "setSupportMaxCount", "(I)V", "Landroidx/lifecycle/MutableLiveData;", "todoRemindListLiveData", "Landroidx/lifecycle/MutableLiveData;", "getTodoRemindListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "deleteResultLiveData", "getDeleteResultLiveData", "addOrUpdateResultLiveData", "getAddOrUpdateResultLiveData", "markToDeviceResultLiveData", "getMarkToDeviceResultLiveData", "getDeviceConnected", "()Z", "deviceConnected", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTodoRemindViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodoRemindViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,327:1\n1557#2:328\n1628#2,3:329\n*S KotlinDebug\n*F\n+ 1 TodoRemindViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/TodoRemindViewModel\n*L\n76#1:328\n76#1:329,3\n*E\n"})
public final class TodoRemindViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "TodoRemindViewModel";
    private int supportMaxCount = 20;

    @NotNull
    private final MutableLiveData<List<TodoRemindItem>> todoRemindListLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<Boolean, List<Integer>>> deleteResultLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<Boolean, TodoRemindItem>> addOrUpdateResultLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<Boolean, TodoRemindItem>> markToDeviceResultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindViewModel$deleteTodoReminderList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindViewModel$deleteTodoReminderList$1", f = "TodoRemindViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Integer> $deleteIdList;
        final /* synthetic */ boolean $needCallbackStatus;
        int label;
        final /* synthetic */ TodoRemindViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21101(List<Integer> list, boolean z, TodoRemindViewModel todoRemindViewModel, Continuation<? super C21101> continuation) {
            super(2, continuation);
            this.$deleteIdList = list;
            this.$needCallbackStatus = z;
            this.this$0 = todoRemindViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21101(this.$deleteIdList, this.$needCallbackStatus, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            o14 o14Var = new o14();
            o14Var.c = CollectionsKt___CollectionsKt.toIntArray(this.$deleteIdList);
            k14 k14Var = new k14();
            k14Var.I(o14Var);
            s7r s7rVar = new s7r();
            s7rVar.e = 17;
            s7rVar.f = 18;
            s7rVar.P(k14Var);
            Logger.i(TodoRemindViewModel.TAG, "deleteTodoReminderList packet " + s7rVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final List<Integer> list = this.$deleteIdList;
            final boolean z = this.$needCallbackStatus;
            final TodoRemindViewModel todoRemindViewModel = this.this$0;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindViewModel.deleteTodoReminderList.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(TodoRemindViewModel.TAG, "deleteTodoReminderList onError code " + code);
                    if (z) {
                        todoRemindViewModel.getDeleteResultLiveData().postValue(new Pair<>(Boolean.FALSE, CollectionsKt__CollectionsKt.emptyList()));
                    }
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i(TodoRemindViewModel.TAG, "deleteTodoReminderList onSuccess = " + list);
                    if (z) {
                        todoRemindViewModel.getDeleteResultLiveData().postValue(new Pair<>(Boolean.TRUE, list));
                    }
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindViewModel$markTodoRemindToDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindViewModel$markTodoRemindToDevice$1", f = "TodoRemindViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $markDone;
        final /* synthetic */ TodoRemindItem $todoRemindItem;
        int label;
        final /* synthetic */ TodoRemindViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21111(TodoRemindItem todoRemindItem, boolean z, TodoRemindViewModel todoRemindViewModel, Continuation<? super C21111> continuation) {
            super(2, continuation);
            this.$todoRemindItem = todoRemindItem;
            this.$markDone = z;
            this.this$0 = todoRemindViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21111(this.$todoRemindItem, this.$markDone, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            p14.c cVar = new p14.c();
            cVar.c = this.$todoRemindItem.getId();
            cVar.e = this.$markDone ? 2 : 1;
            cVar.d = this.$todoRemindItem.getSource();
            final long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            cVar.f = jCurrentTimeMillis;
            k14 k14Var = new k14();
            k14Var.L(cVar);
            s7r s7rVar = new s7r();
            s7rVar.e = 17;
            s7rVar.f = 20;
            s7rVar.P(k14Var);
            Logger.i(TodoRemindViewModel.TAG, "markTodoRemindToDevice packet " + s7rVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final TodoRemindItem todoRemindItem = this.$todoRemindItem;
            final TodoRemindViewModel todoRemindViewModel = this.this$0;
            final boolean z = this.$markDone;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindViewModel.markTodoRemindToDevice.1.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(TodoRemindViewModel.TAG, "markTodoRemindToDevice onError code " + code);
                    todoRemindViewModel.getMarkToDeviceResultLiveData().postValue(new Pair<>(Boolean.FALSE, todoRemindItem));
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i(TodoRemindViewModel.TAG, "markTodoRemindToDevice onSuccess");
                    TodoRemindItem todoRemindItem2 = todoRemindItem;
                    long j = jCurrentTimeMillis;
                    boolean z2 = z;
                    todoRemindItem2.setUpdateTimeSecond(j);
                    todoRemindItem2.setStatus(z2 ? 2 : 1);
                    todoRemindViewModel.getMarkToDeviceResultLiveData().postValue(new Pair<>(Boolean.TRUE, todoRemindItem));
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkDeleteMiuiTodoIfNeed(List<p14> deviceMiuiList) {
        List<p14> list = deviceMiuiList;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<p14> list2 = deviceMiuiList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((p14) it.next()).c));
        }
        Logger.i(TAG, "needDeleteMiuiTodo " + arrayList);
        deleteTodoReminderList(arrayList, false);
    }

    public static /* synthetic */ void deleteTodoReminderList$default(TodoRemindViewModel todoRemindViewModel, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        todoRemindViewModel.deleteTodoReminderList(list, z);
    }

    public final void addOrUpdateTodoRemind(@NotNull final TodoRemindItem todoRemindItem, boolean isAdd) {
        Intrinsics.checkNotNullParameter(todoRemindItem, "todoRemindItem");
        Logger.i(TAG, "addOrUpdateTodoRemind " + todoRemindItem + ";isAdd: " + isAdd);
        p14 p14VarTransformToDevice = TodoRemindViewModelKt.transformToDevice(todoRemindItem);
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = isAdd ? 15 : 17;
        k14 k14Var = new k14();
        if (isAdd) {
            k14Var.H(p14VarTransformToDevice.d);
        } else {
            k14Var.J(p14VarTransformToDevice);
        }
        s7rVar.P(k14Var);
        Logger.i(TAG, "addOrUpdateTodoRemind packet " + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindViewModel.addOrUpdateTodoRemind.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(TodoRemindViewModel.TAG, "addOrUpdateTodoRemind onError " + code);
                this.getAddOrUpdateResultLiveData().postValue(new Pair<>(Boolean.FALSE, todoRemindItem));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                k14 k14VarQ;
                s7r packet2;
                k14 k14VarQ2;
                Integer numValueOf = null;
                Integer numValueOf2 = (result == null || (packet2 = result.getPacket()) == null || (k14VarQ2 = packet2.q()) == null) ? null : Integer.valueOf(k14VarQ2.s());
                Logger.i(TodoRemindViewModel.TAG, "addOrUpdateTodoRemind onSuccess id:" + numValueOf2);
                if (numValueOf2 != null && numValueOf2.intValue() >= 0) {
                    todoRemindItem.setId(numValueOf2.intValue());
                    this.getAddOrUpdateResultLiveData().postValue(new Pair<>(Boolean.TRUE, todoRemindItem));
                    return;
                }
                if (result != null && (packet = result.getPacket()) != null && (k14VarQ = packet.q()) != null) {
                    numValueOf = Integer.valueOf(k14VarQ.o());
                }
                Logger.i(TodoRemindViewModel.TAG, "addOrUpdateTodoRemind clockError " + numValueOf);
                this.getAddOrUpdateResultLiveData().postValue(new Pair<>(Boolean.FALSE, todoRemindItem));
            }
        }, 0, 8, null);
    }

    public final void deleteTodoReminderList(@NotNull List<Integer> deleteIdList, boolean needCallbackStatus) {
        Intrinsics.checkNotNullParameter(deleteIdList, "deleteIdList");
        if (!deleteIdList.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C21101(deleteIdList, needCallbackStatus, this, null), 2, null);
        } else if (needCallbackStatus) {
            this.deleteResultLiveData.postValue(new Pair<>(Boolean.FALSE, CollectionsKt__CollectionsKt.emptyList()));
        }
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, TodoRemindItem>> getAddOrUpdateResultLiveData() {
        return this.addOrUpdateResultLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, List<Integer>>> getDeleteResultLiveData() {
        return this.deleteResultLiveData;
    }

    public final boolean getDeviceConnected() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, TodoRemindItem>> getMarkToDeviceResultLiveData() {
        return this.markToDeviceResultLiveData;
    }

    public final int getSupportMaxCount() {
        return this.supportMaxCount;
    }

    @NotNull
    public final MutableLiveData<List<TodoRemindItem>> getTodoRemindListLiveData() {
        return this.todoRemindListLiveData;
    }

    public final void markTodoRemindToDevice(boolean markDone, @NotNull TodoRemindItem todoRemindItem) {
        Intrinsics.checkNotNullParameter(todoRemindItem, "todoRemindItem");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C21111(todoRemindItem, markDone, this, null), 2, null);
    }

    public final void requestDeviceTodoReminderData() {
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 14;
        Logger.i(TAG, "requestDeviceTodoReminderData packet " + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindViewModel.requestDeviceTodoReminderData.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(TodoRemindViewModel.TAG, "getTodoRemindList from device onError:" + code);
                TodoRemindViewModel.this.getTodoRemindListLiveData().postValue(CollectionsKt__CollectionsKt.emptyList());
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                ArrayList arrayList;
                s7r packet;
                k14 k14VarQ;
                ArrayList arrayList2 = null;
                p14.b bVarU = (result == null || (packet = result.getPacket()) == null || (k14VarQ = packet.q()) == null) ? null : k14VarQ.u();
                Logger.i(TodoRemindViewModel.TAG, "getTodoRemindList from device onSuccess:" + bVarU);
                p14[] p14VarArr = bVarU != null ? bVarU.c : null;
                TodoRemindViewModel todoRemindViewModel = TodoRemindViewModel.this;
                if (p14VarArr != null) {
                    arrayList2 = new ArrayList();
                    for (p14 p14Var : p14VarArr) {
                        if (p14Var.d.i == 1) {
                            arrayList2.add(p14Var);
                        }
                    }
                }
                todoRemindViewModel.checkDeleteMiuiTodoIfNeed(arrayList2);
                if (p14VarArr != null) {
                    ArrayList<p14> arrayList3 = new ArrayList();
                    for (p14 p14Var2 : p14VarArr) {
                        if (p14Var2.d.i != 1) {
                            arrayList3.add(p14Var2);
                        }
                    }
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                    for (p14 p14Var3 : arrayList3) {
                        Intrinsics.checkNotNull(p14Var3);
                        arrayList.add(TodoRemindViewModelKt.transform(p14Var3));
                    }
                } else {
                    arrayList = new ArrayList();
                }
                TodoRemindViewModel.this.getTodoRemindListLiveData().postValue(TodoRemindViewModelKt.groupAndSort(arrayList));
            }
        }, 0, 8, null);
    }

    public final void setSupportMaxCount(int i) {
        this.supportMaxCount = i;
    }
}
