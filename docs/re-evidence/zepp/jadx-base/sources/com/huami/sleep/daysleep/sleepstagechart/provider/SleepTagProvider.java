package com.huami.sleep.daysleep.sleepstagechart.provider;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.sleep.api.EventType;
import com.huami.sleep.api.SleepDataWebApi;
import com.huami.sleep.api.SubType;
import com.huami.sleep.api.converter.DataTypeConverter;
import com.huami.sleep.api.pojo.UserEventsItem;
import com.huami.sleep.api.pojo.UserEventsResponse;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagInfo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagType;
import com.huami.sleep.koin.ScopesKt;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002R\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R)\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/provider/SleepTagProvider;", "Lorg/koin/core/component/KoinComponent;", "", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagInfo;", "selfDefList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "", "userId", "Landroidx/lifecycle/LiveData;", "getSleepTags", "list", "", "addTag", "Lcom/huami/sleep/api/SleepDataWebApi;", "Lkotlin/Lazy;", "c", "()Lcom/huami/sleep/api/SleepDataWebApi;", "webApi", "b", "Ljava/lang/String;", "mTag", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "tags", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTagProvider implements KoinComponent {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String mTag = "SleepTagProvider";

    @NotNull
    public static final SleepTagProvider INSTANCE = new SleepTagProvider();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy webApi = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy tags = LazyKt__LazyJVMKt.lazy(c.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<SleepTagInfo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<SleepTagInfo> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.sleepstagechart.provider.SleepTagProvider$getSleepTags$1", f = "SleepTagProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepTagProvider sleepTagProvider = SleepTagProvider.INSTANCE;
            ApiResponse<UserEventsResponse> apiResponseFetchUserEventsData = sleepTagProvider.c().fetchUserEventsData(this.b, EventType.HEALTH_TAG_RECORD.getValue(), SubType.SLEEP_SELF_DEFINE.getValue(), null, null, null, 1000, Boxing.boxBoolean(true));
            if (apiResponseFetchUserEventsData instanceof ApiSuccessResponse) {
                MutableLiveData mutableLiveDataB = sleepTagProvider.b();
                List<UserEventsItem> items = ((UserEventsResponse) ((ApiSuccessResponse) apiResponseFetchUserEventsData).getBody()).getItems();
                DataTypeConverter dataTypeConverter = DataTypeConverter.INSTANCE;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
                Iterator<T> it2 = items.iterator();
                while (it2.hasNext()) {
                    arrayList.add(dataTypeConverter.convertToSleepSelfDefTagInfo((UserEventsItem) it2.next()));
                }
                mutableLiveDataB.postValue(sleepTagProvider.a(arrayList));
            } else {
                sleepTagProvider.b().postValue(sleepTagProvider.a(null));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MutableLiveData<List<? extends SleepTagInfo>>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<SleepTagInfo>> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/api/SleepDataWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SleepDataWebApi> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepDataWebApi getA() {
            return (SleepDataWebApi) ScopesKt.sleepDataScope(SleepTagProvider.INSTANCE.getKoin()).get(Reflection.getOrCreateKotlinClass(SleepDataWebApi.class), null, null);
        }
    }

    private SleepTagProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<SleepTagInfo> a(List<SleepTagInfo> selfDefList) {
        ArrayList<SleepTagInfo> arrayList = new ArrayList<>();
        SleepTagType sleepTagType = SleepTagType.ADD;
        arrayList.add(new SleepTagInfo(sleepTagType.getTitle(), sleepTagType.getValue()));
        if (selfDefList != null) {
            arrayList.addAll(selfDefList);
        }
        SleepTagType sleepTagType2 = SleepTagType.NIGHTMARE;
        arrayList.add(new SleepTagInfo(sleepTagType2.getTitle(), sleepTagType2.getValue()));
        SleepTagType sleepTagType3 = SleepTagType.DIFF_FAIL_SLEEP;
        arrayList.add(new SleepTagInfo(sleepTagType3.getTitle(), sleepTagType3.getValue()));
        SleepTagType sleepTagType4 = SleepTagType.NOISE;
        arrayList.add(new SleepTagInfo(sleepTagType4.getTitle(), sleepTagType4.getValue()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<List<SleepTagInfo>> b() {
        return (MutableLiveData) tags.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepDataWebApi c() {
        return (SleepDataWebApi) webApi.getValue();
    }

    public final void addTag(@Nullable List<SleepTagInfo> list) {
        ArrayList arrayList = new ArrayList();
        SleepTagProvider sleepTagProvider = INSTANCE;
        if (sleepTagProvider.b().getValue() != null) {
            arrayList.addAll(sleepTagProvider.b().getValue());
        }
        if (arrayList.size() >= 1) {
            if (!(list == null || list.isEmpty())) {
                arrayList.addAll(1, list);
            }
        }
        HMLog.info(mTag, new a(arrayList));
        b().postValue(arrayList);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final LiveData<List<SleepTagInfo>> getSleepTags(@NotNull String userId) {
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new b(userId, null), 2, null);
        return b();
    }
}
