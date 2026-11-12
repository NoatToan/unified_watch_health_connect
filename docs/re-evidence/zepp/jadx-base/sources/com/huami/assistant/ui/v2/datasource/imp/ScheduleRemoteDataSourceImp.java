package com.huami.assistant.ui.v2.datasource.imp;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.assistant.ui.v2.datasource.RemoteResult;
import com.huami.assistant.ui.v2.datasource.Schedule;
import com.huami.assistant.ui.v2.datasource.ScheduleKt;
import com.huami.assistant.ui.v2.datasource.ScheduleRemoteDataSource;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.message.utils.MessageRecorderEventHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "Lcom/huami/assistant/ui/v2/datasource/ScheduleRemoteDataSource;", "Lcom/huami/http/HttpKit;", "", "from", "to", "Lcom/huami/assistant/ui/v2/datasource/RemoteResult;", "", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", RemoteConfigComponent.FETCH_FILE_NAME, "scheduleList", "", "deviceSource", "", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "delete", "", "a", "Ljava/lang/String;", "url", "Lcom/google/gson/Gson;", "b", "Lkotlin/Lazy;", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleRemoteDataSourceImp implements ScheduleRemoteDataSource, HttpKit {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String url = "me/userSchedule";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Gson> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    }

    private final Gson a() {
        return (Gson) this.gson.getValue();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.assistant.ui.v2.datasource.ScheduleRemoteDataSource
    @WorkerThread
    @NotNull
    public RemoteResult<Boolean> delete(long j) {
        return ScheduleRemoteDataSource.DefaultImpls.delete(this, j);
    }

    @Override // com.huami.assistant.ui.v2.datasource.ScheduleRemoteDataSource
    @NotNull
    public RemoteResult<List<ScheduleModel>> fetch(long from, long to) throws HttpError {
        HashMap map = new HashMap();
        map.put("from", String.valueOf(from));
        map.put("to", String.valueOf(to));
        String str = this.url;
        HashMap map2 = new HashMap();
        map2.put("Content-Type", "application/x-www-form-urlencoded");
        Unit unit = Unit.INSTANCE;
        Response responseHttpGet = HttpKitKtxKt.httpGet(this, str, map, map2);
        if (!responseHttpGet.isSuccessful()) {
            return new RemoteResult.Failed(responseHttpGet.message());
        }
        ConverterKt.checkToken(responseHttpGet, ConverterKt.responseToJsonStr(responseHttpGet));
        if (!responseHttpGet.isSuccessful()) {
            throw new HttpError(responseHttpGet);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        List list = (List) converter.convert(responseBodyBody, new TypeToken<List<? extends Schedule>>() { // from class: com.huami.assistant.ui.v2.datasource.imp.ScheduleRemoteDataSourceImp$fetch$$inlined$deserializeOrThrow$1
        }.getType());
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Schedule) obj).isDeleted()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ScheduleKt.toScheduleModel((Schedule) it2.next()));
        }
        return new RemoteResult.Success(arrayList2);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.assistant.ui.v2.datasource.ScheduleRemoteDataSource
    @WorkerThread
    @NotNull
    public RemoteResult<Boolean> push(@NotNull ScheduleModel scheduleModel, int i) {
        return ScheduleRemoteDataSource.DefaultImpls.push(this, scheduleModel, i);
    }

    @Override // com.huami.assistant.ui.v2.datasource.ScheduleRemoteDataSource
    @NotNull
    public RemoteResult<Boolean> delete(@NotNull List<Long> scheduleList) {
        Response responseHttpDelete$default = HttpKitKtxKt.httpDelete$default(this, this.url, RequestBody.create(MediaType.get("application/x-www-form-urlencoded"), "clientSchduleIds=" + TextUtils.join(",", scheduleList)), null, null, 12, null);
        return responseHttpDelete$default.isSuccessful() ? new RemoteResult.Success(Boolean.TRUE) : new RemoteResult.Failed(responseHttpDelete$default.message());
    }

    @Override // com.huami.assistant.ui.v2.datasource.ScheduleRemoteDataSource
    @NotNull
    public RemoteResult<Boolean> push(@NotNull List<ScheduleModel> scheduleList, int deviceSource) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : scheduleList) {
            if (((ScheduleModel) obj).getSource().getIsUserSchedule()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return new RemoteResult.Failed("scheduleList not contain userSchedule");
        }
        String str = this.url;
        MediaType mediaType = MediaType.get("application/json");
        Gson gsonA = a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ScheduleKt.toSchedule((ScheduleModel) it2.next(), deviceSource));
        }
        Response responseHttpPut$default = HttpKitKtxKt.httpPut$default(this, str, RequestBody.create(mediaType, gsonA.toJson(arrayList2)), null, null, 12, null);
        return responseHttpPut$default.isSuccessful() ? new RemoteResult.Success(Boolean.TRUE) : new RemoteResult.Failed(responseHttpPut$default.message());
    }
}
