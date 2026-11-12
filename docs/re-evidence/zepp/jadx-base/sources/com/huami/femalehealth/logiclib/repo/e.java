package com.huami.femalehealth.logiclib.repo;

import androidx.annotation.MainThread;
import androidx.core.app.NotificationCompat;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiEmptyResponse;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.api.pojo.Items;
import com.huami.femalehealth.logiclib.db.po.MenstruationHistory;
import com.huami.femalehealth.logiclib.helper.AppExecutors;
import com.huami.femalehealth.logiclib.helper.PagingRequestHelper;
import com.huami.femalehealth.logiclib.helper.ext.DtoExKt;
import com.huami.femalehealth.logiclib.vo.HistoryItemVo;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u0014\u0012,\u0010\u001f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b\u0012\u0004\u0012\u00020\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00070\u001a\u00120\u0010#\u001a,\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u001a¢\u0006\u0004\b)\u0010*J\u001e\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0017J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0017R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R<\u0010\u001f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b\u0012\u0004\u0012\u00020\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00070\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR@\u0010#\u001a,\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010'¨\u0006+"}, d2 = {"Lcom/huami/femalehealth/logiclib/repo/e;", "Landroidx/paging/PagedList$BoundaryCallback;", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/femalehealth/logiclib/api/pojo/Items;", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", NotificationCompat.CATEGORY_ERROR, "", "f", "onZeroItemsLoaded", "itemAtEnd", "g", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "a", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "appExecutors", "", "b", "Ljava/lang/Long;", "filterTime", "Lkotlin/Function0;", "", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationHistory;", "c", "Lkotlin/jvm/functions/Function0;", "getHistoryCatch", "Lkotlin/Function3;", "", "", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function3;", "insertDb", "", "", "e", "loadHistoryFromNet", "Lcom/huami/femalehealth/logiclib/helper/PagingRequestHelper;", "Lcom/huami/femalehealth/logiclib/helper/PagingRequestHelper;", "helper", "Ljava/lang/String;", "next", "<init>", "(Lcom/huami/femalehealth/logiclib/helper/AppExecutors;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
final class e extends PagedList.BoundaryCallback<HistoryItemVo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Long filterTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<List<MenstruationHistory>> getHistoryCatch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function3<List<MenstruationHistory>, Boolean, Function0<Unit>, Unit> insertDb;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function3<Integer, String, Long, ApiResponse<Items<HistoryItemBean>>> loadHistoryFromNet;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final PagingRequestHelper helper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String next;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<Items<HistoryItemBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ApiResponse<Items<HistoryItemBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("加载错误读取历史经期缓存:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ List<MenstruationHistory> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<MenstruationHistory> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onItemAtEndLoaded:", e.this.next);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onItemAtEndLoaded success :", e.this.next);
        }
    }

    /* JADX INFO: renamed from: com.huami.femalehealth.logiclib.repo.e$e, reason: collision with other inner class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C0402e extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HistoryItemBean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0402e(List<HistoryItemBean> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onItemAtEndLoaded list :", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onZeroItemsLoaded";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onZeroItemsLoaded next:", e.this.next);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MenstruationHistory> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<MenstruationHistory> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("onZeroItemsLoaded list:", Integer.valueOf(this.a.size()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull AppExecutors appExecutors, @Nullable Long l, @NotNull Function0<? extends List<MenstruationHistory>> function0, @NotNull Function3<? super List<MenstruationHistory>, ? super Boolean, ? super Function0<Unit>, Unit> function3, @NotNull Function3<? super Integer, ? super String, ? super Long, ? extends ApiResponse<Items<HistoryItemBean>>> function4) {
        this.appExecutors = appExecutors;
        this.filterTime = l;
        this.getHistoryCatch = function0;
        this.insertDb = function3;
        this.loadHistoryFromNet = function4;
        this.helper = new PagingRequestHelper(appExecutors.getDiskIO());
    }

    private final void f(ApiResponse<Items<HistoryItemBean>> err) {
        HMLog.warn$default("xys", null, new a(err), 2, null);
        List<MenstruationHistory> listInvoke = this.getHistoryCatch.invoke();
        if (listInvoke == null) {
            return;
        }
        this.insertDb.invoke(listInvoke, Boolean.FALSE, new b(listInvoke));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final e eVar, final PagingRequestHelper.Request.Callback callback) {
        eVar.appExecutors.getNetworkIO().execute(new Runnable() { // from class: com.huami.femalehealth.logiclib.repo.c
            @Override // java.lang.Runnable
            public final void run() {
                e.i(this.a, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(e eVar, PagingRequestHelper.Request.Callback callback) {
        ApiResponse<Items<HistoryItemBean>> apiResponseInvoke = eVar.loadHistoryFromNet.invoke(150, eVar.next, eVar.filterTime);
        if (!(apiResponseInvoke instanceof ApiSuccessResponse)) {
            if (apiResponseInvoke instanceof ApiEmptyResponse) {
                callback.recordSuccess();
                return;
            } else {
                if (apiResponseInvoke instanceof ApiErrorResponse) {
                    callback.recordFailure(new Throwable(((ApiErrorResponse) apiResponseInvoke).getErrorMessage()));
                    return;
                }
                return;
            }
        }
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponseInvoke;
        eVar.next = ((Items) apiSuccessResponse.getBody()).getNext();
        HMLog.info("xys", eVar.new d());
        List items = ((Items) apiSuccessResponse.getBody()).getItems();
        HMLog.info("xys", new C0402e(items));
        eVar.insertDb.invoke(DtoExKt.toMenstruationHistoryList(items), Boolean.FALSE, null);
        callback.recordSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final e eVar, final PagingRequestHelper.Request.Callback callback) {
        HMLog.info("xys", f.a);
        eVar.appExecutors.getNetworkIO().execute(new Runnable() { // from class: com.huami.femalehealth.logiclib.repo.d
            @Override // java.lang.Runnable
            public final void run() {
                e.k(this.a, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(e eVar, PagingRequestHelper.Request.Callback callback) {
        ApiResponse<Items<HistoryItemBean>> apiResponseInvoke = eVar.loadHistoryFromNet.invoke(150, "1", eVar.filterTime);
        if (apiResponseInvoke instanceof ApiSuccessResponse) {
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponseInvoke;
            eVar.next = ((Items) apiSuccessResponse.getBody()).getNext();
            HMLog.info("xys", eVar.new g());
            List<MenstruationHistory> menstruationHistoryList = DtoExKt.toMenstruationHistoryList(((Items) apiSuccessResponse.getBody()).getItems());
            HMLog.info("xys", new h(menstruationHistoryList));
            eVar.insertDb.invoke(menstruationHistoryList, Boolean.FALSE, null);
            return;
        }
        if (apiResponseInvoke instanceof ApiEmptyResponse) {
            eVar.f(apiResponseInvoke);
            callback.recordSuccess();
        } else if (apiResponseInvoke instanceof ApiErrorResponse) {
            eVar.f(apiResponseInvoke);
            callback.recordFailure(new Throwable(((ApiErrorResponse) apiResponseInvoke).getErrorMessage()));
        }
    }

    @Override // androidx.paging.PagedList.BoundaryCallback
    @MainThread
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onItemAtEndLoaded(@NotNull HistoryItemVo itemAtEnd) {
        HMLog.info("xys", new c());
        if (this.next == null) {
            return;
        }
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.AFTER, new PagingRequestHelper.Request() { // from class: com.huami.femalehealth.logiclib.repo.a
            @Override // com.huami.femalehealth.logiclib.helper.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                e.h(this.a, callback);
            }
        });
    }

    @Override // androidx.paging.PagedList.BoundaryCallback
    @MainThread
    public void onZeroItemsLoaded() {
        this.helper.runIfNotRunning(PagingRequestHelper.RequestType.INITIAL, new PagingRequestHelper.Request() { // from class: com.huami.femalehealth.logiclib.repo.b
            @Override // com.huami.femalehealth.logiclib.helper.PagingRequestHelper.Request
            public final void run(PagingRequestHelper.Request.Callback callback) {
                e.j(this.a, callback);
            }
        });
    }
}
