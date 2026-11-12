package com.huami.bluetooth.profile.channel.module.todo.impl;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.base.BaseApiImpl;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.base.ResultCodec;
import com.huami.bluetooth.profile.channel.module.ex.CoderException;
import com.huami.bluetooth.profile.channel.module.todo.DataChangAction;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.bluetooth.profile.channel.module.todo.TodoApi;
import com.huami.bluetooth.profile.channel.module.todo.TodoCallback;
import com.huami.bluetooth.profile.channel.module.todo.Version;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J)\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\b2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\tH\u0082\bJ*\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\rH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0011\u001a\u00020\u0002*\u00020\u0002H\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\nH\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\nH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020\u0004H\u0014J\u0018\u0010'\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014R\u001c\u0010-\u001a\u00020(8\u0014@\u0014X\u0094D¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R:\u00102\u001a&\u0012\f\u0012\n /*\u0004\u0018\u00010!0! /*\u0012\u0012\f\u0012\n /*\u0004\u0018\u00010!0!\u0018\u00010\u00190.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00103R\u0016\u00107\u001a\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006<"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/base/BaseApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCmd;", "Lcom/huami/bluetooth/profile/channel/module/todo/TodoApi;", "", "data", "", "h", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "action", z.j, "Lkotlin/Function1;", "", hl.k, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "m", Constant.h, "", "i", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "f", "Lcom/huami/bluetooth/profile/channel/module/todo/Version;", "queryVersion", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "queryData", "todo", "update", "delete", "list", "syncData", "Lcom/huami/bluetooth/profile/channel/module/todo/TodoCallback;", "callback", "registerDeviceCallback", "unregisterDeviceCallback", "rawData", "parseCommand", "handleCommand", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "", "kotlin.jvm.PlatformType", "e", "Ljava/util/List;", "callbackList", "Lcom/huami/bluetooth/profile/channel/module/todo/Version;", "version", "g", "()Z", "isFirstRemindEnable", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class TodoApiImpl extends BaseApiImpl<TodoCmd> implements TodoApi {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<TodoCallback> callbackList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Version version;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "No version, skip DataChanged!";
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
            return "Skip data changed! Device data invalid!";
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
            return "Handle data change error!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Unsupported action(" + ((int) ArraysKt___ArraysKt.first(this.a)) + ")!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Parse data error!";
        }
    }

    public TodoApiImpl(@NotNull BaseModule baseModule) {
        super(baseModule);
        this.tag = "TodoApiImpl";
        this.callbackList = Collections.synchronizedList(new ArrayList());
    }

    private final Codec<Object, byte[]> f(TodoCmd cmd) {
        if (Intrinsics.areEqual(cmd, TodoCmd.VersionResult.INSTANCE)) {
            return new VersionCodec();
        }
        if (Intrinsics.areEqual(cmd, TodoCmd.QueryDataResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, TodoCmd.SyncData.INSTANCE)) {
            return new TodoListCodec(g());
        }
        if (Intrinsics.areEqual(cmd, TodoCmd.UpdateData.INSTANCE) ? true : Intrinsics.areEqual(cmd, TodoCmd.DataChanged.INSTANCE)) {
            return new TodoCodec(g());
        }
        if (Intrinsics.areEqual(cmd, TodoCmd.UpdateDataResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, TodoCmd.DeleteResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, TodoCmd.SyncDataResult.INSTANCE)) {
            return new ResultCodec();
        }
        throw new CoderException("Can not find " + cmd + " codec!");
    }

    private final boolean g() {
        Version version = this.version;
        return version != null && version.getV() >= 2;
    }

    private final void h(byte[] data) {
        DataChangAction dataChangAction = null;
        if (data.length < 2) {
            HMLog.warn$default(getTag(), null, b.a, 2, null);
            return;
        }
        byte bFirst = ArraysKt___ArraysKt.first(data);
        if (bFirst == 1) {
            dataChangAction = DataChangAction.Add.INSTANCE;
        } else if (bFirst == 2) {
            dataChangAction = DataChangAction.Delete.INSTANCE;
        } else if (bFirst != 3) {
            HMLog.warn$default(getTag(), null, new d(data), 2, null);
        } else {
            dataChangAction = DataChangAction.Update.INSTANCE;
        }
        if (dataChangAction == null) {
            return;
        }
        try {
            Todo todo = (Todo) f(TodoCmd.DataChanged.INSTANCE).decode(ArraysKt___ArraysJvmKt.copyOfRange(data, 1, data.length));
            Iterator<T> it2 = this.callbackList.iterator();
            while (it2.hasNext()) {
                ((TodoCallback) it2.next()).onDataChanged(dataChangAction, todo);
            }
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, e2, c.a, 2, null);
        }
    }

    private final Object i(TodoCmd cmd, byte[] data) {
        try {
            return f(cmd).decode(data);
        } catch (Exception e2) {
            HMLog.error$default(getTag(), null, e2, e.a, 2, null);
            return null;
        }
    }

    private final <T> Response<T> j(Function0<? extends Response<T>> action) {
        return (this.version != null || (queryVersion() instanceof Success)) ? action.invoke() : new Failure("No version!", 0, 2, null);
    }

    private final <T> T k(Function1<? super Boolean, ? extends T> action) {
        return (this.version != null || (queryVersion() instanceof Success)) ? action.invoke(Boolean.TRUE) : action.invoke(Boolean.FALSE);
    }

    private final TodoCmd m(TodoCmd todoCmd) {
        if (Intrinsics.areEqual(todoCmd, TodoCmd.UpdateDataResult.INSTANCE)) {
            return TodoCmd.UpdateData.INSTANCE;
        }
        if (Intrinsics.areEqual(todoCmd, TodoCmd.DeleteResult.INSTANCE)) {
            return TodoCmd.Delete.INSTANCE;
        }
        if (Intrinsics.areEqual(todoCmd, TodoCmd.SyncDataResult.INSTANCE)) {
            return TodoCmd.SyncData.INSTANCE;
        }
        if (Intrinsics.areEqual(todoCmd, TodoCmd.VersionResult.INSTANCE)) {
            return TodoCmd.QueryVersion.INSTANCE;
        }
        return Intrinsics.areEqual(todoCmd, TodoCmd.QueryDataResult.INSTANCE) ? TodoCmd.QueryData.INSTANCE : todoCmd;
    }

    @Override // com.huami.bluetooth.profile.channel.module.todo.TodoApi
    @NotNull
    public Response<Boolean> delete(@NotNull Todo todo) {
        return BaseApiImpl.sendRequest$default(this, TodoCmd.Delete.INSTANCE, ByteUtilsKt.toByteArray$default((int) (todo.getId() / ((long) 1000)), 0, 1, null), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.huami.bluetooth.profile.channel.module.todo.TodoApi
    @NotNull
    public Response<List<Todo>> queryData() {
        return (this.version != null || (queryVersion() instanceof Success)) ? BaseApiImpl.sendRequest$default(this, TodoCmd.QueryData.INSTANCE, null, 0L, 6, null) : new Failure("No version!", 0, 2, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.todo.TodoApi
    @NotNull
    public Response<Version> queryVersion() {
        Response<Version> responseSendRequest$default = BaseApiImpl.sendRequest$default(this, TodoCmd.QueryVersion.INSTANCE, null, 0L, 6, null);
        if (responseSendRequest$default instanceof Success) {
            this.version = (Version) ((Success) responseSendRequest$default).getData();
        }
        return responseSendRequest$default;
    }

    @Override // com.huami.bluetooth.profile.channel.module.todo.TodoApi
    public void registerDeviceCallback(@NotNull TodoCallback callback) {
        if (this.callbackList.contains(callback)) {
            return;
        }
        this.callbackList.add(callback);
    }

    @Override // com.huami.bluetooth.profile.channel.module.todo.TodoApi
    @NotNull
    public Response<Boolean> syncData(@NotNull List<Todo> list) {
        return (this.version != null || (queryVersion() instanceof Success)) ? BaseApiImpl.sendRequest$default(this, TodoCmd.SyncData.INSTANCE, new TodoListCodec(g()).encode2(list), 0L, 4, null) : new Failure("No version!", 0, 2, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.todo.TodoApi
    public void unregisterDeviceCallback(@NotNull TodoCallback callback) {
        this.callbackList.remove(callback);
    }

    @Override // com.huami.bluetooth.profile.channel.module.todo.TodoApi
    @NotNull
    public Response<Boolean> update(@NotNull Todo todo) {
        if (this.version == null && !(queryVersion() instanceof Success)) {
            return new Failure("No version!", 0, 2, null);
        }
        TodoCmd.UpdateData updateData = TodoCmd.UpdateData.INSTANCE;
        return BaseApiImpl.sendRequest$default(this, updateData, f(updateData).encode(todo), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    public void handleCommand(@NotNull TodoCmd cmd, @NotNull byte[] data) {
        if (!Intrinsics.areEqual(cmd, TodoCmd.DataChanged.INSTANCE)) {
            Object objI = i(cmd, data);
            if (objI == null) {
                return;
            }
            dispatchResponse(m(cmd), objI);
            return;
        }
        if (this.version != null || (queryVersion() instanceof Success)) {
            h(data);
        } else {
            HMLog.warn$default(getTag(), null, a.a, 2, null);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    @Nullable
    public TodoCmd parseCommand(@NotNull byte[] rawData) {
        return TodoCmd.INSTANCE.toCommand(rawData);
    }
}
