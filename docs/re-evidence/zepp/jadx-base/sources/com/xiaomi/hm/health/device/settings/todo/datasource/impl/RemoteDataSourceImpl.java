package com.xiaomi.hm.health.device.settings.todo.datasource.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.xiaomi.hm.health.device.settings.todo.datasource.RemoteDataSource;
import com.xiaomi.hm.health.device.settings.todo.datasource.RemoteResult;
import com.xiaomi.hm.health.device.webapi.ApiResult;
import com.xiaomi.hm.health.device.webapi.UserEventApi;
import com.xiaomi.hm.health.device.webapi.UserEventList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\u0004H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/datasource/impl/RemoteDataSourceImpl;", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteDataSource;", "Lcom/xiaomi/hm/health/device/webapi/ApiResult;", "", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteResult;", "b", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "Lkotlinx/serialization/json/JsonObject;", "c", "json", "a", "", RemoteConfigComponent.FETCH_FILE_NAME, "todo", "delete", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "Lcom/xiaomi/hm/health/device/webapi/UserEventApi;", "Lcom/xiaomi/hm/health/device/webapi/UserEventApi;", "api", "<init>", "(Lcom/xiaomi/hm/health/device/webapi/UserEventApi;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class RemoteDataSourceImpl implements RemoteDataSource {

    @Deprecated
    @NotNull
    public static final String EVENT_DATA_KEY_COMPLETE_DATE = "completeDate";

    @Deprecated
    @NotNull
    public static final String EVENT_DATA_KEY_CONTENT = "content";

    @Deprecated
    @NotNull
    public static final String EVENT_DATA_KEY_FIRST_REMIND_DATE = "firstRemindDate";

    @Deprecated
    @NotNull
    public static final String EVENT_DATA_KEY_ID = "ID";

    @Deprecated
    @NotNull
    public static final String EVENT_DATA_KEY_REMIND_DATE = "remindDate";

    @Deprecated
    @NotNull
    public static final String EVENT_DATA_KEY_REMIND_TIME = "remindTime";

    @Deprecated
    @NotNull
    public static final String EVENT_DATA_KEY_REPEAT_MODE = "repeatMode";

    @Deprecated
    @NotNull
    public static final String EVENT_DATA_KEY_SOURCE = "source";

    @Deprecated
    @NotNull
    public static final String EVENT_DATA_KEY_TIMESTAMP = "timestamp";

    @Deprecated
    public static final int QUERY_LIMIT = 50;

    @Deprecated
    @NotNull
    public static final String USER_EVENT_KEY = "TodoList";

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final UserEventApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"com/xiaomi/hm/health/device/settings/todo/datasource/impl/RemoteDataSourceImpl$a", "", "", "EVENT_DATA_KEY_COMPLETE_DATE", "Ljava/lang/String;", "EVENT_DATA_KEY_CONTENT", "EVENT_DATA_KEY_FIRST_REMIND_DATE", "EVENT_DATA_KEY_ID", "EVENT_DATA_KEY_REMIND_DATE", "EVENT_DATA_KEY_REMIND_TIME", "EVENT_DATA_KEY_REPEAT_MODE", "EVENT_DATA_KEY_SOURCE", "EVENT_DATA_KEY_TIMESTAMP", "", "QUERY_LIMIT", LogUtil.I, "USER_EVENT_KEY", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<JsonObject, Todo> {
        public b(RemoteDataSourceImpl remoteDataSourceImpl) {
            super(1, remoteDataSourceImpl, RemoteDataSourceImpl.class, "parseTodo", "parseTodo(Lkotlinx/serialization/json/JsonObject;)Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Todo invoke(@NotNull JsonObject jsonObject) {
            return ((RemoteDataSourceImpl) this.receiver).a(jsonObject);
        }
    }

    public RemoteDataSourceImpl(@NotNull UserEventApi userEventApi) {
        this.api = userEventApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Todo a(JsonObject json) {
        JsonPrimitive jsonPrimitive;
        Integer intOrNull;
        JsonPrimitive jsonPrimitive2;
        JsonPrimitive jsonPrimitive3;
        JsonPrimitive jsonPrimitive4;
        JsonPrimitive jsonPrimitive5;
        JsonPrimitive jsonPrimitive6;
        Integer intOrNull2;
        JsonPrimitive jsonPrimitive7;
        String contentOrNull;
        JsonPrimitive jsonPrimitive8;
        Long longOrNull;
        JsonElement jsonElement = (JsonElement) json.get("ID");
        long jLongValue = 0;
        if (jsonElement != null && (jsonPrimitive8 = JsonElementKt.getJsonPrimitive(jsonElement)) != null && (longOrNull = JsonElementKt.getLongOrNull(jsonPrimitive8)) != null) {
            jLongValue = longOrNull.longValue();
        }
        JsonElement jsonElement2 = (JsonElement) json.get("content");
        String str = "";
        if (jsonElement2 != null && (jsonPrimitive7 = JsonElementKt.getJsonPrimitive(jsonElement2)) != null && (contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive7)) != null) {
            str = contentOrNull;
        }
        JsonElement jsonElement3 = (JsonElement) json.get("source");
        Todo.Source todoSource = (jsonElement3 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement3)) == null || (intOrNull = JsonElementKt.getIntOrNull(jsonPrimitive)) == null) ? null : TodoSourceKt.toTodoSource(intOrNull.intValue());
        if (todoSource == null) {
            todoSource = Todo.Source.Default.INSTANCE;
        }
        Todo.Source source = todoSource;
        JsonElement jsonElement4 = (JsonElement) json.get(EVENT_DATA_KEY_REMIND_DATE);
        Long longOrNull2 = (jsonElement4 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement4)) == null) ? null : JsonElementKt.getLongOrNull(jsonPrimitive2);
        JsonElement jsonElement5 = (JsonElement) json.get(EVENT_DATA_KEY_REMIND_TIME);
        Long longOrNull3 = (jsonElement5 == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement5)) == null) ? null : JsonElementKt.getLongOrNull(jsonPrimitive3);
        JsonElement jsonElement6 = (JsonElement) json.get(EVENT_DATA_KEY_REPEAT_MODE);
        int iIntValue = 0;
        if (jsonElement6 != null && (jsonPrimitive6 = JsonElementKt.getJsonPrimitive(jsonElement6)) != null && (intOrNull2 = JsonElementKt.getIntOrNull(jsonPrimitive6)) != null) {
            iIntValue = intOrNull2.intValue();
        }
        JsonElement jsonElement7 = (JsonElement) json.get(EVENT_DATA_KEY_COMPLETE_DATE);
        Long longOrNull4 = (jsonElement7 == null || (jsonPrimitive4 = JsonElementKt.getJsonPrimitive(jsonElement7)) == null) ? null : JsonElementKt.getLongOrNull(jsonPrimitive4);
        JsonElement jsonElement8 = (JsonElement) json.get(EVENT_DATA_KEY_FIRST_REMIND_DATE);
        return new Todo(jLongValue, str, source, longOrNull2, longOrNull3, iIntValue, longOrNull4, (jsonElement8 == null || (jsonPrimitive5 = JsonElementKt.getJsonPrimitive(jsonElement8)) == null) ? null : JsonElementKt.getLongOrNull(jsonPrimitive5));
    }

    private final RemoteResult<Boolean> b(ApiResult<Boolean> apiResult) {
        if (apiResult instanceof ApiResult.Failed) {
            return new RemoteResult.Failed(((ApiResult.Failed) apiResult).getCode());
        }
        if (apiResult instanceof ApiResult.Success) {
            return new RemoteResult.Success(Boolean.TRUE);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final JsonObject c(Todo todo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("timestamp", JsonElementKt.JsonPrimitive(Long.valueOf(todo.getId())));
        linkedHashMap.put("ID", JsonElementKt.JsonPrimitive(Long.valueOf(todo.getId())));
        linkedHashMap.put("content", JsonElementKt.JsonPrimitive(todo.getContent()));
        linkedHashMap.put("source", JsonElementKt.JsonPrimitive(Integer.valueOf(TodoSourceKt.toInt(todo.getSource()))));
        Long date = todo.getDate();
        if (date != null) {
        }
        Long time = todo.getTime();
        if (time != null) {
        }
        linkedHashMap.put(EVENT_DATA_KEY_REPEAT_MODE, JsonElementKt.JsonPrimitive(Integer.valueOf(todo.getRepeat())));
        Long completeTime = todo.getCompleteTime();
        if (completeTime != null) {
        }
        Long firstRemind = todo.getFirstRemind();
        if (firstRemind != null) {
            linkedHashMap.put(EVENT_DATA_KEY_FIRST_REMIND_DATE, JsonElementKt.JsonPrimitive(Long.valueOf(firstRemind.longValue())));
        }
        return new JsonObject(linkedHashMap);
    }

    @Override // com.xiaomi.hm.health.device.settings.todo.datasource.RemoteDataSource
    @NotNull
    public RemoteResult<Boolean> delete(@NotNull Todo todo) {
        return b(UserEventApi.DefaultImpls.deleteUserEvent$default(this.api, USER_EVENT_KEY, todo.getId(), null, 4, null));
    }

    @Override // com.xiaomi.hm.health.device.settings.todo.datasource.RemoteDataSource
    @NotNull
    public RemoteResult<List<Todo>> fetch() {
        ArrayList arrayList = new ArrayList();
        Object next = null;
        do {
            Todo todo = (Todo) next;
            ApiResult apiResultQueryUserEvents$default = UserEventApi.DefaultImpls.queryUserEvents$default(this.api, USER_EVENT_KEY, new b(this), null, null, null, todo == null ? null : Long.valueOf(todo.getId()), 50, null, 156, null);
            if (apiResultQueryUserEvents$default instanceof ApiResult.Failed) {
                return new RemoteResult.Failed(((ApiResult.Failed) apiResultQueryUserEvents$default).getCode());
            }
            if (apiResultQueryUserEvents$default instanceof ApiResult.Success) {
                ApiResult.Success success = (ApiResult.Success) apiResultQueryUserEvents$default;
                if (!((UserEventList) success.getData()).getItems().isEmpty()) {
                    arrayList.addAll(((UserEventList) success.getData()).getItems());
                }
                next = ((UserEventList) success.getData()).getNext();
            }
        } while (next != null);
        return new RemoteResult.Success(arrayList);
    }

    @Override // com.xiaomi.hm.health.device.settings.todo.datasource.RemoteDataSource
    @NotNull
    public RemoteResult<Boolean> push(@NotNull Todo todo) {
        return RemoteDataSource.DefaultImpls.push(this, todo);
    }

    @Override // com.xiaomi.hm.health.device.settings.todo.datasource.RemoteDataSource
    @NotNull
    public RemoteResult<Boolean> push(@NotNull List<Todo> todo) {
        UserEventApi userEventApi = this.api;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(todo, 10));
        Iterator<T> it2 = todo.iterator();
        while (it2.hasNext()) {
            arrayList.add(c((Todo) it2.next()));
        }
        return b(UserEventApi.DefaultImpls.postUserEvent$default(userEventApi, USER_EVENT_KEY, arrayList, null, 4, null));
    }
}
