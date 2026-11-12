package com.xiaomi.hm.health.device.settings.todo;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.todo.DataChangAction;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.bluetooth.profile.channel.module.todo.TodoApi;
import com.huami.bluetooth.profile.channel.module.todo.TodoCallback;
import com.huami.bluetooth.profile.channel.module.todo.TodoModule;
import com.huami.bluetooth.profile.channel.module.todo.Version;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource;
import com.xiaomi.hm.health.device.settings.todo.usecase.SyncLocalChangeToRemoteUseCase;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 N2\u00020\u0001:\u0001NB\u001f\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u00100\u001a\u00020.\u0012\u0006\u00103\u001a\u000201¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00020\nH\u0082\bJ\u0013\u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00020\nH\u0082\bJ\u0013\u0010\u000f\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0082\bJ\u0016\u0010\u0011\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002JI\u0010\u001b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0014\u001a\u00020\u00132'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015¢\u0006\u0002\b\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010!\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u001fH\u0082\bJ&\u0010#\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001d2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\"H\u0002J\b\u0010$\u001a\u00020\u0004H\u0014J\u0006\u0010%\u001a\u00020\rJ\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010*\u001a\u00020\rR\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00102R%\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000205048\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020\r048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b;\u00109R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001d\u0010E\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010F8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010GR\u0013\u0010K\u001a\u00020\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\bI\u0010J\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "todo", "", "e", "h", "", "list", "b", "", "", "a", "", "i", "o", "", "c", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, com.google.android.exoplayer2.text.ttml.b.r, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", AbstractJSONTokenResponse.RESPONSE, "Lkotlin/Function1;", "successBlock", hl.k, "Lkotlin/Function0;", z.j, "onCleared", "isFull", "loadData", "addOrUpdate", "delete", "done", "supportWorkdayRepeat", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "local", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase;", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase;", "sync2Cloud", "Landroidx/lifecycle/MutableLiveData;", "", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "getTodoListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "todoListLiveData", "getResultLiveData", "resultLiveData", "Lcom/huami/bluetooth/profile/channel/module/todo/Version;", "f", "Lcom/huami/bluetooth/profile/channel/module/todo/Version;", "version", "Lcom/huami/bluetooth/profile/channel/module/todo/TodoCallback;", "g", "Lkotlin/Lazy;", "()Lcom/huami/bluetooth/profile/channel/module/todo/TodoCallback;", "callback", "Lcom/huami/bluetooth/profile/channel/module/todo/TodoApi;", "()Lcom/huami/bluetooth/profile/channel/module/todo/TodoApi;", "api", "getMaxCount", "()I", "maxCount", "<init>", "(Lcom/xiaomi/hm/health/device/setting/DeviceCenter;Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;Lcom/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TodoListViewModel extends ViewModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String h = "TodoListViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceCenter deviceCenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SyncLocalChangeToRemoteUseCase sync2Cloud;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Version version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<Todo>> todoListLiveData = new MutableLiveData<>(CollectionsKt__CollectionsKt.emptyList());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> resultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy callback = LazyKt__LazyJVMKt.lazy(new Function0<TodoListViewModel$callback$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.device.settings.todo.TodoListViewModel$callback$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.device.settings.todo.TodoListViewModel$callback$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            final TodoListViewModel todoListViewModel = this.a;
            return new TodoCallback() { // from class: com.xiaomi.hm.health.device.settings.todo.TodoListViewModel$callback$2.1
                /* JADX WARN: Code duplicated, block: B:39:0x0099  */
                /* JADX WARN: Code duplicated, block: B:61:0x00da  */
                @Override // com.huami.bluetooth.profile.channel.module.todo.TodoCallback
                public void onDataChanged(@NotNull DataChangAction action, @NotNull Todo todo) {
                    int i;
                    Object next;
                    int i2 = -1;
                    if (!(Intrinsics.areEqual(action, DataChangAction.Add.INSTANCE) ? true : Intrinsics.areEqual(action, DataChangAction.Update.INSTANCE))) {
                        if (Intrinsics.areEqual(action, DataChangAction.Delete.INSTANCE)) {
                            List<Todo> value = todoListViewModel.getTodoListLiveData().getValue();
                            List<Todo> mutableList = value != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) value) : null;
                            if (mutableList == null) {
                                mutableList = new ArrayList<>();
                            }
                            Iterator<Todo> it2 = mutableList.iterator();
                            int i3 = 0;
                            while (it2.hasNext()) {
                                if (it2.next().getId() == todo.getId()) {
                                    i2 = i3;
                                    break;
                                }
                                i3++;
                            }
                            if (i2 >= 0) {
                                mutableList.remove(i2);
                                todoListViewModel.getTodoListLiveData().postValue(mutableList);
                                EventBus.getDefault().post(new TodoChangeEvent());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    List<Todo> value2 = todoListViewModel.getTodoListLiveData().getValue();
                    List<Todo> mutableList2 = value2 == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) value2);
                    if (mutableList2 == null) {
                        mutableList2 = new ArrayList<>();
                    }
                    Iterator<Todo> it3 = mutableList2.iterator();
                    int i4 = 0;
                    while (it3.hasNext()) {
                        if (it3.next().getId() == todo.getId()) {
                            i2 = i4;
                            break;
                        }
                        i4++;
                    }
                    if (i2 < 0) {
                        mutableList2.add(todo);
                    } else {
                        mutableList2.remove(i2);
                        mutableList2.add(i2, todo);
                    }
                    while (todoListViewModel.getMaxCount() > 0 && mutableList2.size() > todoListViewModel.getMaxCount()) {
                        if (mutableList2.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator<T> it4 = mutableList2.iterator();
                            i = 0;
                            while (it4.hasNext()) {
                                Long completeTime = ((Todo) it4.next()).getCompleteTime();
                                if (completeTime == null) {
                                    completeTime = null;
                                } else if (!(completeTime.longValue() > 0)) {
                                    completeTime = null;
                                }
                                if ((completeTime != null) && (i = i + 1) < 0) {
                                    CollectionsKt__CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                        if (!(i > 0)) {
                            break;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : mutableList2) {
                            Long completeTime2 = ((Todo) obj).getCompleteTime();
                            if (completeTime2 == null) {
                                completeTime2 = null;
                            } else if (!(completeTime2.longValue() > 0)) {
                                completeTime2 = null;
                            }
                            if (completeTime2 != null) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it5 = arrayList.iterator();
                            if (it5.hasNext()) {
                                next = it5.next();
                                if (it5.hasNext()) {
                                    long id = ((Todo) next).getId();
                                    do {
                                        Object next2 = it5.next();
                                        long id2 = ((Todo) next2).getId();
                                        if (id > id2) {
                                            next = next2;
                                            id = id2;
                                        }
                                    } while (it5.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            Todo todo2 = (Todo) next;
                            if (todo2 != null) {
                                mutableList2.remove(todo2);
                            }
                        }
                    }
                    todoListViewModel.getTodoListLiveData().postValue(mutableList2);
                    EventBus.getDefault().post(new TodoChangeEvent());
                }
            };
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoListViewModel$Companion;", "", "", "version", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "supportWorkday", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean supportWorkday(int version, @Nullable HMBaseDevice device) {
            if (version >= 3) {
                if (!(device != null && (ConfigHelperKt.hasFeature(device.getMDeviceSource(), Feature.OVERSEA) || CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_MADRID_W, HMDeviceSource.MILI_ANDES_W, HMDeviceSource.MILI_VIENNA_W, HMDeviceSource.MILI_ZURICH_W}).contains(device.getMDeviceSource()))) && HMLoginManager.isInChina()) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.settings.todo.TodoListViewModel$addOrUpdate$1", f = "TodoListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Todo c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.todo.TodoListViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0881a extends Lambda implements Function0<String> {
            public static final C0881a a = new C0881a();

            public C0881a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Add when device full!";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "No completed todo!";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Delete completed todo!";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<Unit> {
            public final /* synthetic */ int a;
            public final /* synthetic */ List<Todo> b;
            public final /* synthetic */ Todo c;
            public final /* synthetic */ TodoListViewModel d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i, List<Todo> list, Todo todo, TodoListViewModel todoListViewModel) {
                super(0);
                this.a = i;
                this.b = list;
                this.c = todo;
                this.d = todoListViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                int i = this.a;
                if (i < 0) {
                    this.b.add(this.c);
                } else {
                    this.b.remove(i);
                    this.b.add(this.a, this.c);
                }
                this.d.local.save(this.c);
                this.d.sync2Cloud.execute();
                this.d.getTodoListLiveData().postValue(this.b);
                EventBus.getDefault().post(new TodoChangeEvent());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Todo todo, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = todo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TodoListViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<Todo> value = TodoListViewModel.this.getTodoListLiveData().getValue();
            List mutableList = value == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) value);
            if (mutableList == null) {
                mutableList = new ArrayList();
            }
            Todo todo = this.c;
            Iterator it2 = mutableList.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Boxing.boxBoolean(((Todo) it2.next()).getId() == todo.getId()).booleanValue()) {
                    break;
                }
                i2++;
            }
            if ((i2 < 0) && TodoListViewModel.this.getMaxCount() > 0 && mutableList.size() >= TodoListViewModel.this.getMaxCount()) {
                HMLog.info(TodoListViewModel.h, C0881a.a);
                if (mutableList.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it3 = mutableList.iterator();
                    i = 0;
                    while (it3.hasNext()) {
                        Long completeTime = ((Todo) it3.next()).getCompleteTime();
                        if (completeTime != null) {
                            if (!Boxing.boxBoolean(completeTime.longValue() > 0).booleanValue()) {
                                completeTime = null;
                            }
                        } else {
                            completeTime = null;
                        }
                        if (Boxing.boxBoolean(completeTime != null).booleanValue() && (i = i + 1) < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i > 0) {
                    HMLog.info(TodoListViewModel.h, c.a);
                    TodoListViewModel.this.c(mutableList);
                } else {
                    HMLog.info(TodoListViewModel.h, b.a);
                }
            }
            TodoApi todoApiF = TodoListViewModel.this.f();
            Response<Boolean> responseUpdate = todoApiF == null ? null : todoApiF.update(this.c);
            if (responseUpdate == null) {
                responseUpdate = new Failure<>("Todo api is null", 0, 2, null);
            }
            TodoListViewModel todoListViewModel = TodoListViewModel.this;
            todoListViewModel.j(responseUpdate, new d(i2, mutableList, this.c, todoListViewModel));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Device not HMMiLiProDevice";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.settings.todo.TodoListViewModel$delete$1", f = "TodoListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Todo c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ TodoListViewModel a;
            public final /* synthetic */ Todo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TodoListViewModel todoListViewModel, Todo todo) {
                super(0);
                this.a = todoListViewModel;
                this.b = todo;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                List<Todo> value = this.a.getTodoListLiveData().getValue();
                List<Todo> mutableList = value == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) value);
                if (mutableList == null) {
                    mutableList = new ArrayList<>();
                }
                Todo todo = this.b;
                Iterator<Todo> it2 = mutableList.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else {
                        if (it2.next().getId() == todo.getId()) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (i >= 0) {
                    mutableList.remove(i);
                    this.a.local.delete(this.b);
                    this.a.sync2Cloud.execute();
                    this.a.getTodoListLiveData().postValue(mutableList);
                    EventBus.getDefault().post(new TodoChangeEvent());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Todo todo, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = todo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TodoListViewModel.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TodoApi todoApiF = TodoListViewModel.this.f();
            Response<Boolean> responseDelete = todoApiF == null ? null : todoApiF.delete(this.c);
            if (responseDelete == null) {
                responseDelete = new Failure<>("Call reply is null", 0, 2, null);
            }
            TodoListViewModel todoListViewModel = TodoListViewModel.this;
            todoListViewModel.j(responseDelete, new a(todoListViewModel, this.c));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.settings.todo.TodoListViewModel$doneRepeat$1", f = "TodoListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Todo c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Done repeat when device full!";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Create complete todo after delete completed todo!";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Skip create complete todo!";
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.todo.TodoListViewModel$d$d, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0882d extends Lambda implements Function0<String> {
            public static final C0882d a = new C0882d();

            public C0882d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Create complete todo!";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Todo todo, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = todo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TodoListViewModel.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Todo todoH = TodoListViewModel.this.h(this.c);
            TodoApi todoApiF = TodoListViewModel.this.f();
            Response<Boolean> responseUpdate = todoApiF == null ? null : todoApiF.update(todoH);
            if (responseUpdate == null) {
                responseUpdate = new Failure<>("Todo api is null", 0, 2, null);
            }
            if (!(responseUpdate instanceof Success) || !((Boolean) ((Success) responseUpdate).getData()).booleanValue()) {
                TodoListViewModel.this.getResultLiveData().postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            TodoListViewModel.this.local.save(this.c);
            List<Todo> value = TodoListViewModel.this.getTodoListLiveData().getValue();
            List<Todo> mutableList = value == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) value);
            if (mutableList == null) {
                mutableList = new ArrayList<>();
            }
            Iterator<Todo> it2 = mutableList.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Boxing.boxBoolean(it2.next().getId() == todoH.getId()).booleanValue()) {
                    break;
                }
                i2++;
            }
            if (i2 < 0) {
                mutableList.add(todoH);
            } else {
                mutableList.remove(i2);
                mutableList.add(i2, todoH);
            }
            if (TodoListViewModel.this.getMaxCount() <= 0 || mutableList.size() < TodoListViewModel.this.getMaxCount()) {
                HMLog.info(TodoListViewModel.h, C0882d.a);
                TodoListViewModel.this.b(mutableList, this.c);
            } else {
                HMLog.info(TodoListViewModel.h, a.a);
                if (mutableList.isEmpty()) {
                    i = 0;
                } else {
                    Iterator<T> it3 = mutableList.iterator();
                    i = 0;
                    while (it3.hasNext()) {
                        Long completeTime = ((Todo) it3.next()).getCompleteTime();
                        if (completeTime != null) {
                            if (!Boxing.boxBoolean(completeTime.longValue() > 0).booleanValue()) {
                                completeTime = null;
                            }
                        } else {
                            completeTime = null;
                        }
                        if (Boxing.boxBoolean(completeTime != null).booleanValue() && (i = i + 1) < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if ((i > 0) && TodoListViewModel.this.c(mutableList)) {
                    HMLog.info(TodoListViewModel.h, b.a);
                    TodoListViewModel.this.b(mutableList, this.c);
                } else {
                    HMLog.info(TodoListViewModel.h, c.a);
                }
            }
            TodoListViewModel.this.sync2Cloud.execute();
            TodoListViewModel.this.getTodoListLiveData().postValue(mutableList);
            EventBus.getDefault().post(new TodoChangeEvent());
            TodoListViewModel.this.getResultLiveData().postValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.settings.todo.TodoListViewModel$loadData$1", f = "TodoListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TodoListViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (TodoListViewModel.this.version == null) {
                TodoApi todoApiF = TodoListViewModel.this.f();
                Response<Version> responseQueryVersion = todoApiF == null ? null : todoApiF.queryVersion();
                if (responseQueryVersion == null) {
                    responseQueryVersion = new Failure<>("Todo api is null", 0, 2, null);
                }
                if (!(responseQueryVersion instanceof Success)) {
                    TodoListViewModel.this.getResultLiveData().postValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                TodoListViewModel.this.version = (Version) ((Success) responseQueryVersion).getData();
            }
            TodoApi todoApiF2 = TodoListViewModel.this.f();
            Response<List<Todo>> responseQueryData = todoApiF2 == null ? null : todoApiF2.queryData();
            if (responseQueryData == null) {
                responseQueryData = new Failure<>("Todo api is null", 0, 2, null);
            }
            TodoListViewModel todoListViewModel = TodoListViewModel.this;
            if (responseQueryData instanceof Success) {
                todoListViewModel.getResultLiveData().postValue(Boxing.boxBoolean(true));
                List<Todo> list = (List) ((Success) responseQueryData).getData();
                todoListViewModel.local.deleteAll();
                if (!list.isEmpty()) {
                    todoListViewModel.local.save(list);
                }
                todoListViewModel.sync2Cloud.execute();
                todoListViewModel.getTodoListLiveData().postValue(list);
            } else {
                todoListViewModel.getResultLiveData().postValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public TodoListViewModel(@NotNull DeviceCenter deviceCenter, @NotNull LocalDataSource localDataSource, @NotNull SyncLocalChangeToRemoteUseCase syncLocalChangeToRemoteUseCase) {
        this.deviceCenter = deviceCenter;
        this.local = localDataSource;
        this.sync2Cloud = syncLocalChangeToRemoteUseCase;
        TodoApi todoApiF = f();
        if (todoApiF == null) {
            return;
        }
        todoApiF.registerDeviceCallback(g());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    private final int a(Collection<Todo> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return 0;
        }
        Iterator<T> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Long completeTime = ((Todo) it2.next()).getCompleteTime();
            if (completeTime != null) {
                if (!(completeTime.longValue() > 0)) {
                    completeTime = null;
                }
            } else {
                completeTime = null;
            }
            if ((completeTime != null) && (i = i + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Collection<Todo> list, Todo todo) {
        long j = 1000;
        long jCurrentTimeMillis = (System.currentTimeMillis() / j) * j;
        Todo todoCopy = todo.copy((158 & 1) != 0 ? todo.id : jCurrentTimeMillis, (158 & 2) != 0 ? todo.content : null, (158 & 4) != 0 ? todo.source : null, (158 & 8) != 0 ? todo.date : null, (158 & 16) != 0 ? todo.time : null, (158 & 32) != 0 ? todo.repeat : 1, (158 & 64) != 0 ? todo.completeTime : Long.valueOf(jCurrentTimeMillis), (158 & 128) != 0 ? todo.firstRemind : null);
        TodoApi todoApiF = f();
        Response<Boolean> responseUpdate = todoApiF == null ? null : todoApiF.update(todoCopy);
        if (responseUpdate == null) {
            responseUpdate = new Failure<>("Todo api is null", 0, 2, null);
        }
        if ((responseUpdate instanceof Success) && ((Boolean) ((Success) responseUpdate).getData()).booleanValue()) {
            list.add(todoCopy);
            this.local.save(todoCopy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(List<Todo> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (true) {
            Long l = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            Long completeTime = ((Todo) next2).getCompleteTime();
            if (completeTime != null) {
                if (completeTime.longValue() > 0) {
                    l = completeTime;
                }
            }
            if (l != null) {
                arrayList.add(next2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                long id = ((Todo) next).getId();
                do {
                    Object next3 = it3.next();
                    long id2 = ((Todo) next3).getId();
                    if (id > id2) {
                        next = next3;
                        id = id2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        Todo todo = (Todo) next;
        if (todo == null) {
            return false;
        }
        TodoApi todoApiF = f();
        Response<Boolean> responseDelete = todoApiF == null ? null : todoApiF.delete(todo);
        if (responseDelete == null) {
            responseDelete = new Failure<>("Call reply is null", 0, 2, null);
        }
        if (!(responseDelete instanceof Success) || !((Boolean) ((Success) responseDelete).getData()).booleanValue()) {
            return false;
        }
        this.local.delete(todo);
        list.remove(todo);
        return true;
    }

    private final void e(Todo todo) {
        p(Dispatchers.getIO(), new d(todo, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TodoApi f() {
        HMBaseDevice device = this.deviceCenter.getDevice();
        if (device == null) {
            return null;
        }
        if (!(device instanceof HMMiLiProDevice)) {
            HMLog.error$default(h, null, null, b.a, 6, null);
            return null;
        }
        TodoModule todoModule = (TodoModule) device.getChannelModule(TodoModule.class);
        if (todoModule == null) {
            return null;
        }
        return todoModule.loadApi();
    }

    private final TodoCallback g() {
        return (TodoCallback) this.callback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:4:0x0013  */
    public final Todo h(Todo todo) {
        Unit unit;
        long timeInMillis;
        Long lValueOf;
        Calendar calendar = Calendar.getInstance();
        Long time = todo.getTime();
        if (time != null) {
            if (!(time.longValue() > 0)) {
                time = null;
            }
            if (time == null) {
                unit = null;
            } else {
                time.longValue();
                calendar.set(13, 0);
                calendar.set(14, 0);
                unit = Unit.INSTANCE;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        long timeInMillis2 = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance();
        Long date = todo.getDate();
        if (date != null) {
            calendar2.setTimeInMillis(date.longValue());
        }
        Long firstRemind = todo.getFirstRemind();
        if (firstRemind == null) {
            firstRemind = TodoExtKt.calculatorFirstRemind(todo.getDate(), todo.getTime());
        }
        do {
            calendar2 = TodoRepeat.calculatorNextRepeatDate(firstRemind, todo.getRepeat(), calendar2);
            timeInMillis = calendar2.getTimeInMillis();
            Long time2 = todo.getTime();
            if (time2 != null) {
                if (!(time2.longValue() > 0)) {
                    time2 = null;
                }
                if (time2 == null) {
                    lValueOf = null;
                } else {
                    long jLongValue = time2.longValue();
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTimeInMillis(jLongValue);
                    calendar3.set(1, calendar2.get(1));
                    calendar3.set(2, calendar2.get(2));
                    calendar3.set(5, calendar2.get(5));
                    lValueOf = Long.valueOf(calendar3.getTimeInMillis());
                }
            } else {
                lValueOf = null;
            }
            if (lValueOf != null) {
                timeInMillis = lValueOf.longValue();
            }
        } while (timeInMillis < timeInMillis2);
        return todo.copy((158 & 1) != 0 ? todo.id : 0L, (158 & 2) != 0 ? todo.content : null, (158 & 4) != 0 ? todo.source : null, (158 & 8) != 0 ? todo.date : Long.valueOf(calendar2.getTimeInMillis()), (158 & 16) != 0 ? todo.time : lValueOf, (158 & 32) != 0 ? todo.repeat : 0, (158 & 64) != 0 ? todo.completeTime : null, (158 & 128) != 0 ? todo.firstRemind : null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    private final boolean i(Collection<Todo> collection) {
        int i;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it2 = collection.iterator();
            i = 0;
            while (it2.hasNext()) {
                Long completeTime = ((Todo) it2.next()).getCompleteTime();
                if (completeTime != null) {
                    if (!(completeTime.longValue() > 0)) {
                        completeTime = null;
                    }
                } else {
                    completeTime = null;
                }
                if ((completeTime != null) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Response<Boolean> response, Function0<Unit> successBlock) {
        if (response instanceof Success) {
            Success success = (Success) response;
            if (((Boolean) success.getData()).booleanValue()) {
                this.resultLiveData.postValue((Boolean) success.getData());
                successBlock.invoke();
                return;
            }
        }
        this.resultLiveData.postValue(Boolean.FALSE);
    }

    private final <T> void k(Response<T> response, Function1<? super T, Unit> successBlock) {
        if (!(response instanceof Success)) {
            getResultLiveData().postValue(Boolean.FALSE);
        } else {
            getResultLiveData().postValue(Boolean.TRUE);
            successBlock.invoke((Object) ((Success) response).getData());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(TodoListViewModel todoListViewModel, Response response, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = f.a;
        }
        todoListViewModel.j(response, function0);
    }

    public static /* synthetic */ void n(TodoListViewModel todoListViewModel, Response response, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<T, Unit>() { // from class: com.xiaomi.hm.health.device.settings.todo.TodoListViewModel$postResult$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke2(obj2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t) {
                }
            };
        }
        if (!(response instanceof Success)) {
            todoListViewModel.getResultLiveData().postValue(Boolean.FALSE);
        } else {
            todoListViewModel.getResultLiveData().postValue(Boolean.TRUE);
            function1.invoke(((Success) response).getData());
        }
    }

    private final void o(Collection<Todo> collection) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collection.iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            Long completeTime = ((Todo) next2).getCompleteTime();
            if (completeTime != null) {
                if (completeTime.longValue() > 0) {
                    next = completeTime;
                }
            }
            if (next != null) {
                arrayList.add(next2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                long id = ((Todo) next).getId();
                do {
                    Object next3 = it3.next();
                    long id2 = ((Todo) next3).getId();
                    if (id > id2) {
                        next = next3;
                        id = id2;
                    }
                } while (it3.hasNext());
            }
        }
        Todo todo = (Todo) next;
        if (todo == null) {
            return;
        }
        collection.remove(todo);
    }

    private final <T> void p(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new TodoListViewModel$safeWithContext$$inlined$safeLaunch$1(null, context, block), 2, null);
    }

    public final void addOrUpdate(@NotNull Todo todo) {
        p(Dispatchers.getIO(), new a(todo, null));
    }

    public final void delete(@NotNull Todo todo) {
        p(Dispatchers.getIO(), new c(todo, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final void done(@NotNull Todo todo) {
        boolean z = false;
        if (todo.getRepeat() != 0 && todo.getRepeat() != 1) {
            Long date = todo.getDate();
            if (date != null) {
                if (!(date.longValue() > 0)) {
                    date = null;
                }
            } else {
                date = null;
            }
            if (date != null) {
                z = true;
            }
        }
        if (z) {
            e(todo);
        } else {
            long j = 1000;
            addOrUpdate(todo.copy((158 & 1) != 0 ? todo.id : 0L, (158 & 2) != 0 ? todo.content : null, (158 & 4) != 0 ? todo.source : null, (158 & 8) != 0 ? todo.date : null, (158 & 16) != 0 ? todo.time : null, (158 & 32) != 0 ? todo.repeat : 0, (158 & 64) != 0 ? todo.completeTime : Long.valueOf((System.currentTimeMillis() / j) * j), (158 & 128) != 0 ? todo.firstRemind : null));
        }
    }

    public final int getMaxCount() {
        Version version = this.version;
        if (version == null) {
            return 0;
        }
        return version.getMaxCount();
    }

    @NotNull
    public final MutableLiveData<Boolean> getResultLiveData() {
        return this.resultLiveData;
    }

    @NotNull
    public final MutableLiveData<List<Todo>> getTodoListLiveData() {
        return this.todoListLiveData;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    public final boolean isFull() {
        int i;
        List<Todo> value = this.todoListLiveData.getValue();
        Integer numValueOf = null;
        if (value != null) {
            if (value.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it2 = value.iterator();
                i = 0;
                while (it2.hasNext()) {
                    Long completeTime = ((Todo) it2.next()).getCompleteTime();
                    if (completeTime != null) {
                        if (!(completeTime.longValue() > 0)) {
                            completeTime = null;
                        }
                    } else {
                        completeTime = null;
                    }
                    if ((completeTime == null) && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        return numValueOf != null && numValueOf.intValue() >= getMaxCount();
    }

    public final void loadData() {
        p(Dispatchers.getIO(), new e(null));
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        TodoApi todoApiF = f();
        if (todoApiF != null) {
            todoApiF.unregisterDeviceCallback(g());
        }
        super.onCleared();
    }

    public final boolean supportWorkdayRepeat() {
        Companion companion = INSTANCE;
        Version version = this.version;
        return companion.supportWorkday(version == null ? 1 : version.getV(), this.deviceCenter.getDevice());
    }
}
