package com.xiaomi.hm.health.healthtag.core.datasource;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.xiaomi.hm.health.healthdata.api.HealthDataWebApi;
import com.xiaomi.hm.health.healthdata.api.pojo.UserEventsItem;
import com.xiaomi.hm.health.healthdata.api.pojo.UserEventsResponse;
import com.xiaomi.hm.health.healthtag.api.convert.DataTypeConvert;
import com.xiaomi.hm.health.healthtag.api.request.WebConst;
import com.xiaomi.hm.health.healthtag.core.dto.HealthDataTagType;
import com.xiaomi.hm.health.healthtag.core.dto.StressDataTagType;
import com.xiaomi.hm.health.healthtag.core.dto.TagInfoDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J,\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u000e\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R)\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/core/datasource/HealthTagDataSource;", "Lcom/xiaomi/hm/health/healthtag/core/datasource/IHealthTagDataSource;", "", "subType", "", "Lcom/xiaomi/hm/health/healthtag/core/dto/TagInfoDto;", "c", "infoDto", "", "a", "uid", "type", "Landroidx/lifecycle/MutableLiveData;", "loadAllTagData", "addTagInfos", "Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;", "Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;", "webApi", "b", "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "tags", "<init>", "(Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthTagDataSource implements IHealthTagDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthDataWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy tags = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthtag.core.datasource.HealthTagDataSource$loadAllTagData$1", f = "HealthTagDataSource.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.healthtag.core.datasource.HealthTagDataSource$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.healthtag.core.datasource.HealthTagDataSource$loadAllTagData$1$1", f = "HealthTagDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0966a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HealthTagDataSource b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ String e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0966a(HealthTagDataSource healthTagDataSource, String str, String str2, String str3, Continuation<? super C0966a> continuation) {
                super(2, continuation);
                this.b = healthTagDataSource;
                this.c = str;
                this.d = str2;
                this.e = str3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0966a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0966a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ApiResponse<UserEventsResponse> apiResponseFetchUserEventsData = this.b.webApi.fetchUserEventsData(this.c, this.d, this.e, null, null, null, 1000, Boxing.boxBoolean(true));
                if (apiResponseFetchUserEventsData instanceof ApiSuccessResponse) {
                    HealthTagDataSource healthTagDataSource = this.b;
                    String str = this.e;
                    List<UserEventsItem> items = ((UserEventsResponse) ((ApiSuccessResponse) apiResponseFetchUserEventsData).getBody()).getItems();
                    DataTypeConvert dataTypeConvert = DataTypeConvert.INSTANCE;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
                    Iterator<T> it2 = items.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(dataTypeConvert.convert2TagInfoDto((UserEventsItem) it2.next()));
                    }
                    healthTagDataSource.a(str, arrayList);
                } else {
                    this.b.a(this.e, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HealthTagDataSource.this.new a(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0966a c0966a = new C0966a(HealthTagDataSource.this, this.c, this.d, this.e, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, c0966a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/hm/health/healthtag/core/dto/TagInfoDto;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<List<? extends TagInfoDto>>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<TagInfoDto>> invoke() {
            return new MutableLiveData<>();
        }
    }

    public HealthTagDataSource(@NotNull HealthDataWebApi healthDataWebApi) {
        this.webApi = healthDataWebApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String subType, List<TagInfoDto> infoDto) {
        MutableLiveData<List<TagInfoDto>> mutableLiveDataB = b();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c(subType));
        if (arrayList.size() >= 1) {
            if (!(infoDto == null || infoDto.isEmpty())) {
                arrayList.addAll(1, infoDto);
            }
        }
        Unit unit = Unit.INSTANCE;
        mutableLiveDataB.postValue(arrayList);
    }

    private final MutableLiveData<List<TagInfoDto>> b() {
        return (MutableLiveData) this.tags.getValue();
    }

    private final List<TagInfoDto> c(String subType) {
        if (!Intrinsics.areEqual(subType, WebConst.Param.STRESS_SELF_TAG_RECORD)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        StressDataTagType stressDataTagType = StressDataTagType.INSTANCE;
        HealthDataTagType.Companion companion = HealthDataTagType.INSTANCE;
        arrayList.add(new TagInfoDto(stressDataTagType.getDesc(companion.getADD()), companion.getADD()));
        arrayList.add(new TagInfoDto(stressDataTagType.getDesc(1), 1));
        arrayList.add(new TagInfoDto(stressDataTagType.getDesc(2), 2));
        arrayList.add(new TagInfoDto(stressDataTagType.getDesc(3), 3));
        arrayList.add(new TagInfoDto(stressDataTagType.getDesc(4), 4));
        arrayList.add(new TagInfoDto(stressDataTagType.getDesc(5), 5));
        arrayList.add(new TagInfoDto(stressDataTagType.getDesc(6), 6));
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.healthtag.core.datasource.IHealthTagDataSource
    public void addTagInfos(@NotNull List<TagInfoDto> infoDto) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b().getValue());
        if (arrayList.size() >= 1) {
            arrayList.addAll(1, infoDto);
        }
        b().postValue(arrayList);
    }

    @Override // com.xiaomi.hm.health.healthtag.core.datasource.IHealthTagDataSource
    @NotNull
    public MutableLiveData<List<TagInfoDto>> loadAllTagData(@NotNull String uid, @NotNull String type, @NotNull String subType) {
        e.f(GlobalScope.INSTANCE, null, null, new a(uid, type, subType, null), 3, null);
        return b();
    }
}
