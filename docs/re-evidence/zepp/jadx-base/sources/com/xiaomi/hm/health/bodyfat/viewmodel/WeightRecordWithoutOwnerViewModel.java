package com.xiaomi.hm.health.bodyfat.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.helper.Resource;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.model.WeightInfoWithoutOwner;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.utils.WeightInfoCreateHelper;
import com.xiaomi.hm.health.bodyfat.webapi.WeightInfoApi;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011R\u001c\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R/\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00190\u00188F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u000b\u0010\u001bR)\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00190\u00188F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001bR#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001b¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/WeightRecordWithoutOwnerViewModel;", "Landroidx/lifecycle/ViewModel;", "", "json", "", "Lcom/xiaomi/hm/health/bodyfat/model/WeightInfoWithoutOwner;", "b", "Lorg/json/JSONObject;", "data", "a", "", "getWeightInfoRecords", "getLatestWeightInfoRecord", "", ParamKey.createTime, "deleteWeightRecords", "(Ljava/lang/Long;)V", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "userInfos", "claimWeightRecords", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/helper/Resource;", "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "weightInfoRecords", "c", "getDeleteResult", "deleteResult", GoogleApiAvailabilityLight.a, "getLatestWeightInfoRecords", "latestWeightInfoRecords", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightRecordWithoutOwnerViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "WeightRecord";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy weightInfoRecords = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteResult = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy latestWeightInfoRecords = LazyKt__LazyJVMKt.lazy(c.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel$claimWeightRecords$1", f = "WeightRecordWithoutOwnerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WeightInfoWithoutOwner b;
        public final /* synthetic */ UserInfos c;
        public final /* synthetic */ WeightRecordWithoutOwnerViewModel d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeightInfoWithoutOwner weightInfoWithoutOwner, UserInfos userInfos, WeightRecordWithoutOwnerViewModel weightRecordWithoutOwnerViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = weightInfoWithoutOwner;
            this.c = userInfos;
            this.d = weightRecordWithoutOwnerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Integer encryptImpedance;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int impedance = (this.b.getEncryptImpedance() == null || ((encryptImpedance = this.b.getEncryptImpedance()) != null && encryptImpedance.intValue() == 0)) ? this.b.getImpedance() : this.b.getEncryptImpedance().intValue();
            WeightInfoCreateHelper weightInfoCreateHelper = WeightInfoCreateHelper.INSTANCE;
            WeightInfos weightInfosCreateWeightInfo = weightInfoCreateHelper.createWeightInfo(this.c, this.b.getCreateTime(), this.b.getWeight(), impedance);
            if (weightInfosCreateWeightInfo != null) {
                WeightInfoWithoutOwner weightInfoWithoutOwner = this.b;
                UserInfos userInfos = this.c;
                WeightRecordWithoutOwnerViewModel weightRecordWithoutOwnerViewModel = this.d;
                weightInfosCreateWeightInfo.setHeartRate(weightInfoWithoutOwner.getHeartRate());
                weightInfosCreateWeightInfo.setPressure(weightInfoWithoutOwner.getSingleStress());
                WeightInfoRepository.INSTANCE.getInstance().addWeightInfo(weightInfosCreateWeightInfo);
                if (HMWeightUtils.isSelf(userInfos.getUserId()) && weightInfosCreateWeightInfo.getHeartRate() > 0) {
                    weightInfoCreateHelper.saveHeartOfScale(weightInfosCreateWeightInfo);
                }
                weightRecordWithoutOwnerViewModel.deleteWeightRecords(Boxing.boxLong(weightInfoWithoutOwner.getCreateTime()));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/helper/Resource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<Resource<? extends Long>>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Resource<Long>> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bodyfat/model/WeightInfoWithoutOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MutableLiveData<WeightInfoWithoutOwner>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<WeightInfoWithoutOwner> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject jSONObject) {
            super(0);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("无效的无主数据--", this.a);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel$deleteWeightRecords$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel$deleteWeightRecords$1", f = "WeightRecordWithoutOwnerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Long b;
        public final /* synthetic */ WeightRecordWithoutOwnerViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Long l, WeightRecordWithoutOwnerViewModel weightRecordWithoutOwnerViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.b = l;
            this.c = weightRecordWithoutOwnerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long jLongValue = this.b.longValue();
            final WeightRecordWithoutOwnerViewModel weightRecordWithoutOwnerViewModel = this.c;
            final Long l = this.b;
            WeightInfoApi.deleteWeightInfoWithoutOwner(jLongValue, new IHMSimpleHttpResponseHandler() { // from class: com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel.deleteWeightRecords.1.1
                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onFailure(@Nullable HMHttpResponseData item) {
                    String strErrorMsg;
                    MutableLiveData<Resource<Long>> deleteResult = weightRecordWithoutOwnerViewModel.getDeleteResult();
                    Resource.Companion companion = Resource.INSTANCE;
                    String str = "";
                    if (item != null && (strErrorMsg = ExtentionUtilsKt.errorMsg(item)) != null) {
                        str = strErrorMsg;
                    }
                    deleteResult.postValue(Resource.Companion.error$default(companion, str, null, 2, null));
                }

                @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
                public void onSuccess(@Nullable WebResponse response, @Nullable HMHttpResponseData item) {
                    weightRecordWithoutOwnerViewModel.getDeleteResult().postValue(Resource.INSTANCE.success(l));
                }
            });
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/helper/Resource;", "", "Lcom/xiaomi/hm/health/bodyfat/model/WeightInfoWithoutOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<MutableLiveData<Resource<? extends List<? extends WeightInfoWithoutOwner>>>> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Resource<List<WeightInfoWithoutOwner>>> getA() {
            return new MutableLiveData<>();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel$getLatestWeightInfoRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel$getLatestWeightInfoRecord$1", f = "WeightRecordWithoutOwnerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public C15651(Continuation<? super C15651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightRecordWithoutOwnerViewModel.this.new C15651(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final WeightRecordWithoutOwnerViewModel weightRecordWithoutOwnerViewModel = WeightRecordWithoutOwnerViewModel.this;
            WeightInfoApi.syncWeightInfoLatestWithoutOwnerToLocal(new IHMSimpleHttpResponseHandler() { // from class: com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel.getLatestWeightInfoRecord.1.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel$getLatestWeightInfoRecord$1$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ String a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(String str) {
                        super(0);
                        this.a = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return Intrinsics.stringPlus("Response : ", this.a);
                    }
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onFailure(@Nullable HMHttpResponseData item) {
                    Throwable error;
                    if (item == null || (error = item.getError()) == null) {
                        return;
                    }
                    error.printStackTrace();
                }

                @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
                public void onSuccess(@Nullable WebResponse response, @Nullable HMHttpResponseData item) {
                    byte[] responseBody = item == null ? null : item.getResponseBody();
                    if (responseBody != null) {
                        String str = new String(responseBody, Charsets.UTF_8);
                        HMLog.info(weightRecordWithoutOwnerViewModel.getTAG(), new a(str));
                        try {
                            WeightInfoWithoutOwner weightInfoWithoutOwnerA = weightRecordWithoutOwnerViewModel.a(new JSONObject(str));
                            if (weightInfoWithoutOwnerA != null) {
                                weightRecordWithoutOwnerViewModel.getLatestWeightInfoRecords().postValue(weightInfoWithoutOwnerA);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel$getWeightInfoRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel$getWeightInfoRecords$1", f = "WeightRecordWithoutOwnerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public C15661(Continuation<? super C15661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightRecordWithoutOwnerViewModel.this.new C15661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final WeightRecordWithoutOwnerViewModel weightRecordWithoutOwnerViewModel = WeightRecordWithoutOwnerViewModel.this;
            WeightInfoApi.syncWeightInfoWithoutOwnerToLocal(new IHMSimpleHttpResponseHandler() { // from class: com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel.getWeightInfoRecords.1.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.viewmodel.WeightRecordWithoutOwnerViewModel$getWeightInfoRecords$1$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ String a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(String str) {
                        super(0);
                        this.a = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return Intrinsics.stringPlus("Response : ", this.a);
                    }
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onFailure(@Nullable HMHttpResponseData item) {
                    String strErrorMsg;
                    MutableLiveData<Resource<List<WeightInfoWithoutOwner>>> weightInfoRecords = weightRecordWithoutOwnerViewModel.getWeightInfoRecords();
                    Resource.Companion companion = Resource.INSTANCE;
                    String str = "";
                    if (item != null && (strErrorMsg = ExtentionUtilsKt.errorMsg(item)) != null) {
                        str = strErrorMsg;
                    }
                    weightInfoRecords.postValue(Resource.Companion.error$default(companion, str, null, 2, null));
                }

                @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
                public void onSuccess(@Nullable WebResponse response, @Nullable HMHttpResponseData item) {
                    byte[] responseBody = item == null ? null : item.getResponseBody();
                    if (responseBody != null) {
                        String str = new String(responseBody, Charsets.UTF_8);
                        HMLog.info(weightRecordWithoutOwnerViewModel.getTAG(), new a(str));
                        List listB = weightRecordWithoutOwnerViewModel.b(str);
                        if (!listB.isEmpty()) {
                            BFKeeper.putValue(BFKeeper.WITHOUT_OWNER_REMIND_TIME, Long.valueOf(ExtentionUtilsKt.millsToSecond$default(((WeightInfoWithoutOwner) CollectionsKt.first(listB)).getCreateTime(), false, 1, null)));
                        }
                        weightRecordWithoutOwnerViewModel.getWeightInfoRecords().postValue(Resource.INSTANCE.success(listB));
                    }
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeightInfoWithoutOwner a(JSONObject data) throws JSONException {
        long jOptLong = data.optLong(ParamKey.createTime);
        JSONObject jSONObject = data.getJSONObject("summary");
        int heartRate = HMWeightUtils.parseHeartRate(jSONObject.optString(ParamKey.heartRateData));
        int iOptInt = jSONObject.optInt(ParamKey.impedance);
        int iOptInt2 = jSONObject.optInt("encryptImpedance");
        int iOptInt3 = jSONObject.optInt(ParamKey.singleStress);
        double dOptDouble = jSONObject.optDouble("weight");
        if (jOptLong > 0 && !Double.isNaN(dOptDouble) && dOptDouble > 0.0d) {
            return new WeightInfoWithoutOwner(jOptLong, heartRate, iOptInt, Integer.valueOf(iOptInt2), iOptInt3, (float) dOptDouble);
        }
        HMLog.debug(this.TAG, new d(data));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<WeightInfoWithoutOwner> b(String json) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONObject(json).getJSONArray("items");
            int i = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    WeightInfoWithoutOwner weightInfoWithoutOwnerA = a(jSONArray.getJSONObject(i));
                    if (weightInfoWithoutOwnerA != null) {
                        arrayList.add(weightInfoWithoutOwnerA);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    public final void claimWeightRecords(@NotNull WeightInfoWithoutOwner data, @NotNull UserInfos userInfos) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(data, userInfos, this, null), 2, null);
    }

    public final void deleteWeightRecords(@Nullable Long createTime) {
        if (createTime == null) {
            return;
        }
        getDeleteResult().postValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(createTime, this, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Resource<Long>> getDeleteResult() {
        return (MutableLiveData) this.deleteResult.getValue();
    }

    public final void getLatestWeightInfoRecord() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C15651(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<WeightInfoWithoutOwner> getLatestWeightInfoRecords() {
        return (MutableLiveData) this.latestWeightInfoRecords.getValue();
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final MutableLiveData<Resource<List<WeightInfoWithoutOwner>>> getWeightInfoRecords() {
        return (MutableLiveData) this.weightInfoRecords.getValue();
    }

    /* JADX INFO: renamed from: getWeightInfoRecords, reason: collision with other method in class */
    public final void m3436getWeightInfoRecords() {
        getWeightInfoRecords().setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C15661(null), 2, null);
    }
}
