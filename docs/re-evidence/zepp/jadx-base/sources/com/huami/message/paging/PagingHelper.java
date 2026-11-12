package com.huami.message.paging;

import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.paging.DataSource;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiEmptyResponse;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.android.vo.Resource;
import com.huami.message.db.MessageDb;
import com.huami.message.paging.PagingHelper;
import com.huami.message.util.AppExecutors;
import com.loc.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B¬\u0003\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001aj\b\u0012\u0004\u0012\u00028\u0001`\u001b\u0012\u001c\u0010!\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001aj\b\u0012\u0004\u0012\u00028\u0001`\u001f\u00123\u0010(\u001a/\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010%0\u001aj\b\u0012\u0004\u0012\u00028\u0001`&\u0012H\b\u0002\u0010.\u001aB\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u0001\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0001\u0018\u0001`+\u0012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000/\u0012\u0010\u00108\u001a\f\u0012\u0004\u0012\u00020403j\u0002`5\u0012\u0016\b\u0002\u0010<\u001a\u0010\u0012\u0004\u0012\u000209\u0018\u000103j\u0004\u0018\u0001`:\u0012\u001c\u0010?\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002040\u001aj\b\u0012\u0004\u0012\u00028\u0001`=\u0012\u0018\b\u0002\u0010A\u001a\u0012\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u001a\u0012'\b\u0002\u0010C\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(B\u0012\u0004\u0012\u000204\u0018\u00010\u001a\u0012'\b\u0002\u0010E\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(B\u0012\u0004\u0012\u000204\u0018\u00010\u001a¢\u0006\u0004\bF\u0010GJ\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0003J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R.\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001aj\b\u0012\u0004\u0012\u00028\u0001`\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR,\u0010!\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001aj\b\u0012\u0004\u0012\u00028\u0001`\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dRC\u0010(\u001a/\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010%0\u001aj\b\u0012\u0004\u0012\u00028\u0001`&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001dRV\u0010.\u001aB\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u0001\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0001\u0018\u0001`+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00108\u001a\f\u0012\u0004\u0012\u00020403j\u0002`58\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u0010<\u001a\u0010\u0012\u0004\u0012\u000209\u0018\u000103j\u0004\u0018\u0001`:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R,\u0010?\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002040\u001aj\b\u0012\u0004\u0012\u00028\u0001`=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u001dR&\u0010A\u001a\u0012\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u001dR5\u0010C\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(B\u0012\u0004\u0012\u000204\u0018\u00010\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR5\u0010E\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(B\u0012\u0004\u0012\u000204\u0018\u00010\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\u001d¨\u0006H"}, d2 = {"Lcom/huami/message/paging/PagingHelper;", "Vo", "WebBean", "", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", GoogleApiAvailabilityLight.b, "Lcom/huami/message/paging/Listing;", "getListing", "Lcom/huami/message/util/AppExecutors;", "a", "Lcom/huami/message/util/AppExecutors;", "appExecutors", "Lcom/huami/message/db/MessageDb;", "b", "Lcom/huami/message/db/MessageDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/message/paging/PagingKeyCache;", "c", "Lcom/huami/message/paging/PagingKeyCache;", "pagingKeyCache", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "pagingKey", "Lkotlin/Function1;", "Lcom/huami/message/paging/PagingKeyParser;", "e", "Lkotlin/jvm/functions/Function1;", "pagingKeyParser", "Lcom/huami/message/paging/PageSizeParser;", "f", "pageSizeParser", "Lkotlin/ParameterName;", "name", "nextPageKey", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/message/paging/WebRequest;", "g", "webRequest", "Lkotlin/Function2;", "webBean", "Lcom/huami/message/paging/MapResponse;", "h", "Lkotlin/jvm/functions/Function2;", "mapResponse", "Landroidx/paging/DataSource$Factory;", "i", "Landroidx/paging/DataSource$Factory;", "pagingDbSource", "Lkotlin/Function0;", "", "Lcom/huami/message/paging/ClearDataInDb;", z.j, "Lkotlin/jvm/functions/Function0;", "clearDataInDb", "", "Lcom/huami/message/paging/IsEmptyData;", hl.k, "isEmptyData", "Lcom/huami/message/paging/AppendWebDataToDb;", "l", "appendWebDataToDb", "m", "algorithmParser", "algorithm", "onLoadData", "o", com.alipay.sdk.m.x.d.p, "<init>", "(Lcom/huami/message/util/AppExecutors;Lcom/huami/message/db/MessageDb;Lcom/huami/message/paging/PagingKeyCache;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/paging/DataSource$Factory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class PagingHelper<Vo, WebBean> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MessageDb db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final PagingKeyCache pagingKeyCache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String pagingKey;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function1<WebBean, String> pagingKeyParser;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function1<WebBean, Integer> pageSizeParser;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function1<String, ApiResponse<WebBean>> webRequest;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final Function2<String, WebBean, WebBean> mapResponse;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final DataSource.Factory<Integer, Vo> pagingDbSource;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> clearDataInDb;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private final Function0<Boolean> isEmptyData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Function1<WebBean, Unit> appendWebDataToDb;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private final Function1<WebBean, String> algorithmParser;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private final Function1<String, Unit> onLoadData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private final Function1<String, Unit> onRefresh;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n"}, d2 = {"Vo", "WebBean", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MutableLiveData<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableLiveData<Unit> mutableLiveData) {
            super(0);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setValue(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n"}, d2 = {"Vo", "WebBean", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ PagedListBoundaryCallback<Vo, WebBean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PagedListBoundaryCallback<Vo, WebBean> pagedListBoundaryCallback) {
            super(0);
            this.a = pagedListBoundaryCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.getHelper().retryAllFailed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n"}, d2 = {"Vo", "WebBean", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MutableLiveData<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MutableLiveData<Unit> mutableLiveData) {
            super(0);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setValue(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n"}, d2 = {"Vo", "WebBean", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MutableLiveData<Resource<Unit>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MutableLiveData<Resource<Unit>> mutableLiveData) {
            super(0);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n"}, d2 = {"Vo", "WebBean", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MutableLiveData<Resource<Unit>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MutableLiveData<Resource<Unit>> mutableLiveData) {
            super(0);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n"}, d2 = {"Vo", "WebBean", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MutableLiveData<Resource<Unit>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MutableLiveData<Resource<Unit>> mutableLiveData) {
            super(0);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagingHelper(@NotNull AppExecutors appExecutors, @NotNull MessageDb messageDb, @NotNull PagingKeyCache pagingKeyCache, @NotNull String str, @NotNull Function1<? super WebBean, String> function1, @NotNull Function1<? super WebBean, Integer> function2, @NotNull Function1<? super String, ? extends ApiResponse<WebBean>> function3, @Nullable Function2<? super String, ? super WebBean, ? extends WebBean> function4, @NotNull DataSource.Factory<Integer, Vo> factory, @NotNull Function0<Unit> function0, @Nullable Function0<Boolean> function5, @NotNull Function1<? super WebBean, Unit> function6, @Nullable Function1<? super WebBean, String> function7, @Nullable Function1<? super String, Unit> function8, @Nullable Function1<? super String, Unit> function9) {
        this.appExecutors = appExecutors;
        this.db = messageDb;
        this.pagingKeyCache = pagingKeyCache;
        this.pagingKey = str;
        this.pagingKeyParser = function1;
        this.pageSizeParser = function2;
        this.webRequest = function3;
        this.mapResponse = function4;
        this.pagingDbSource = factory;
        this.clearDataInDb = function0;
        this.isEmptyData = function5;
        this.appendWebDataToDb = function6;
        this.algorithmParser = function7;
        this.onLoadData = function8;
        this.onRefresh = function9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData i(final PagingHelper pagingHelper, Unit unit) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.INSTANCE.loading(null));
        pagingHelper.appExecutors.getDiskIO().execute(new Runnable() { // from class: zq5
            @Override // java.lang.Runnable
            public final void run() {
                PagingHelper.j(this.a, mutableLiveData);
            }
        });
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void j(final PagingHelper pagingHelper, MutableLiveData mutableLiveData) {
        Boolean boolInvoke;
        Function0<Boolean> function0 = pagingHelper.isEmptyData;
        boolean zBooleanValue = true;
        if (function0 != null && (boolInvoke = function0.invoke()) != null) {
            zBooleanValue = boolInvoke.booleanValue();
        }
        if (zBooleanValue) {
            return;
        }
        pagingHelper.pagingKeyCache.clearKey(pagingHelper.pagingKey);
        ApiResponse<WebBean> apiResponseInvoke = pagingHelper.webRequest.invoke(null);
        if (!(apiResponseInvoke instanceof ApiSuccessResponse)) {
            if (apiResponseInvoke instanceof ApiEmptyResponse) {
                pagingHelper.db.runInTransaction(new Runnable() { // from class: wq5
                    @Override // java.lang.Runnable
                    public final void run() {
                        PagingHelper.l(this.a);
                    }
                });
                mutableLiveData.postValue(Resource.INSTANCE.success(null));
                return;
            } else {
                if (apiResponseInvoke instanceof ApiErrorResponse) {
                    mutableLiveData.postValue(Resource.INSTANCE.error(((ApiErrorResponse) apiResponseInvoke).getErrorMessage(), null));
                    return;
                }
                return;
            }
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? body = ((ApiSuccessResponse) apiResponseInvoke).getBody();
        objectRef.element = body;
        Function2<String, WebBean, WebBean> function2 = pagingHelper.mapResponse;
        if (function2 != null) {
            objectRef.element = function2.invoke(null, body);
        }
        pagingHelper.pagingKeyCache.saveKey(pagingHelper.pagingKey, (String) pagingHelper.pagingKeyParser.invoke(objectRef.element));
        pagingHelper.db.runInTransaction(new Runnable() { // from class: br5
            @Override // java.lang.Runnable
            public final void run() {
                PagingHelper.k(this.a, objectRef);
            }
        });
        mutableLiveData.postValue(Resource.INSTANCE.success(pagingHelper.pageSizeParser.invoke(objectRef.element)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void k(PagingHelper pagingHelper, Ref.ObjectRef objectRef) {
        pagingHelper.clearDataInDb.invoke();
        pagingHelper.appendWebDataToDb.invoke(objectRef.element);
        Function1<String, Unit> function1 = pagingHelper.onRefresh;
        if (function1 == null) {
            return;
        }
        Function1<WebBean, String> function2 = pagingHelper.algorithmParser;
        function1.invoke(function2 == null ? null : (String) function2.invoke(objectRef.element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(PagingHelper pagingHelper) {
        pagingHelper.clearDataInDb.invoke();
        Function1<String, Unit> function1 = pagingHelper.onRefresh;
        if (function1 == null) {
            return;
        }
        function1.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData m(PagingHelper pagingHelper, Unit unit) {
        return pagingHelper.n();
    }

    @MainThread
    private final LiveData<Resource<Integer>> n() {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.INSTANCE.loading(null));
        this.pagingKeyCache.clearKey(this.pagingKey);
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: yq5
            @Override // java.lang.Runnable
            public final void run() {
                PagingHelper.o(this.a, mutableLiveData);
            }
        });
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void o(final PagingHelper pagingHelper, MutableLiveData mutableLiveData) {
        ApiResponse<WebBean> apiResponseInvoke = pagingHelper.webRequest.invoke(null);
        if (!(apiResponseInvoke instanceof ApiSuccessResponse)) {
            if (apiResponseInvoke instanceof ApiEmptyResponse) {
                pagingHelper.db.runInTransaction(new Runnable() { // from class: xq5
                    @Override // java.lang.Runnable
                    public final void run() {
                        PagingHelper.q(this.a);
                    }
                });
                mutableLiveData.postValue(Resource.INSTANCE.success(null));
                return;
            } else {
                if (apiResponseInvoke instanceof ApiErrorResponse) {
                    mutableLiveData.postValue(Resource.INSTANCE.error(((ApiErrorResponse) apiResponseInvoke).getErrorMessage(), null));
                    return;
                }
                return;
            }
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponseInvoke;
        objectRef.element = apiSuccessResponse.getBody();
        Function2<String, WebBean, WebBean> function2 = pagingHelper.mapResponse;
        if (function2 != null) {
            objectRef.element = function2.invoke(null, (WebBean) apiSuccessResponse.getBody());
        }
        pagingHelper.pagingKeyCache.saveKey(pagingHelper.pagingKey, (String) pagingHelper.pagingKeyParser.invoke(objectRef.element));
        pagingHelper.db.runInTransaction(new Runnable() { // from class: ar5
            @Override // java.lang.Runnable
            public final void run() {
                PagingHelper.p(this.a, objectRef);
            }
        });
        mutableLiveData.postValue(Resource.INSTANCE.success(pagingHelper.pageSizeParser.invoke(objectRef.element)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void p(PagingHelper pagingHelper, Ref.ObjectRef objectRef) {
        pagingHelper.clearDataInDb.invoke();
        pagingHelper.appendWebDataToDb.invoke(objectRef.element);
        Function1<String, Unit> function1 = pagingHelper.onRefresh;
        if (function1 == null) {
            return;
        }
        Function1<WebBean, String> function2 = pagingHelper.algorithmParser;
        function1.invoke(function2 == null ? null : (String) function2.invoke(objectRef.element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(PagingHelper pagingHelper) {
        pagingHelper.clearDataInDb.invoke();
        Function1<String, Unit> function1 = pagingHelper.onRefresh;
        if (function1 == null) {
            return;
        }
        function1.invoke(null);
    }

    @NotNull
    public final Listing<Vo> getListing() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        PagedListBoundaryCallback pagedListBoundaryCallback = new PagedListBoundaryCallback(this.appExecutors, this.pagingKeyCache, this.pagingKey, this.pagingKeyParser, this.webRequest, this.mapResponse, this.appendWebDataToDb, this.algorithmParser, this.onLoadData, new d(mutableLiveData), new e(mutableLiveData2), new f(mutableLiveData3));
        MutableLiveData mutableLiveData4 = new MutableLiveData();
        MutableLiveData mutableLiveData5 = new MutableLiveData();
        LiveData liveDataSwitchMap = Transformations.switchMap(mutableLiveData5, new Function() { // from class: sq5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PagingHelper.i(this.a, (Unit) obj);
            }
        });
        return new Listing<>(new LivePagedListBuilder(this.pagingDbSource, new PagedList.Config.Builder().setEnablePlaceholders(true).setPageSize(10).setInitialLoadSizeHint(10).setPrefetchDistance(0).build()).setBoundaryCallback(pagedListBoundaryCallback).setFetchExecutor(this.appExecutors.getDiskIO()).build(), pagedListBoundaryCallback.getNetworkState(), Transformations.switchMap(mutableLiveData4, new Function() { // from class: vq5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PagingHelper.m(this.a, (Unit) obj);
            }
        }), new a(mutableLiveData4), new b(pagedListBoundaryCallback), mutableLiveData, mutableLiveData2, mutableLiveData3, new c(mutableLiveData5), liveDataSwitchMap);
    }

    public /* synthetic */ PagingHelper(AppExecutors appExecutors, MessageDb messageDb, PagingKeyCache pagingKeyCache, String str, Function1 function1, Function1 function2, Function1 function3, Function2 function4, DataSource.Factory factory, Function0 function0, Function0 function5, Function1 function6, Function1 function7, Function1 function8, Function1 function9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appExecutors, messageDb, pagingKeyCache, str, function1, function2, function3, (i & 128) != 0 ? null : function4, factory, function0, (i & 1024) != 0 ? null : function5, function6, (i & 4096) != 0 ? null : function7, (i & 8192) != 0 ? null : function8, (i & 16384) != 0 ? null : function9);
    }
}
