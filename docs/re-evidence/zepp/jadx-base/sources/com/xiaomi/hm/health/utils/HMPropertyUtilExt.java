package com.xiaomi.hm.health.utils;

import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.reflect.TypeToken;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.UserPropertyModuleKt;
import com.huami.userproperty.service.entity.remote.BatchPushResult;
import com.huami.userproperty.service.entity.remote.ResultFuture;
import com.xiaomi.hm.health.bodyfat.property.BodyfatProperty;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.HmProperty;
import com.xiaomi.hm.health.databases.model.HmPropertyDao;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.e;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002J\u0013\u0010\u000e\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\nH\u0007R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R9\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019j\u0002`\u001a0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/utils/HMPropertyUtilExt;", "", "Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", "Lcom/huami/userproperty/entity/BatchPushResult;", "pushAllPropertiesBlock", "", "key", "defaultValue", "readLocal", "value", "", "saveLocal", "c", "b", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPropertiesToServer", "", LogUtil.I, "STATUS_SYNCED", "STATUS_SYNC_NEED", "", "Ljava/util/List;", "needMigrationKeys", "", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/utils/SortingHandler;", GoogleApiAvailabilityLight.a, "Ljava/util/Map;", "getSortingHandlers", "()Ljava/util/Map;", "sortingHandlers", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HMPropertyUtilExt {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int STATUS_SYNCED = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int STATUS_SYNC_NEED = 0;

    @NotNull
    public static final HMPropertyUtilExt INSTANCE = new HMPropertyUtilExt();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final List<String> needMigrationKeys = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{BodyfatProperty.PROPERTY_LOSE_WEIGHT_SETTING, BodyfatProperty.PROPERTY_LOSE_WEIGHT_SETTING_ALGORITHM, BodyfatProperty.PROPERTY_GUEST_WEIGHTING_TIME_SETTING, HMAccountWebAPI.APPS_SETTINGS_TRACK_SHARE, HMDeviceManager.PROPERTY_SYNC_TIME});

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Map<String, Function1<String, String>> sortingHandlers = r.mapOf(TuplesKt.to(Property.PROPERTY_APP_SORT_CONFIG, new Function1<String, String>() { // from class: com.xiaomi.hm.health.utils.HMPropertyUtilExt$sortingHandlers$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@Nullable String str) {
            Object objM3845constructorimpl;
            String json;
            HMPropertyUtilExt hMPropertyUtilExt = HMPropertyUtilExt.INSTANCE;
            try {
                Result.Companion companion = Result.Companion;
                if (str == null) {
                    json = str;
                } else {
                    List<Pair> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(s.toList((Map) Utils.getGson().fromJson(str, new TypeToken<Map<String, ? extends List<? extends AppItemData>>>() { // from class: com.xiaomi.hm.health.utils.HMPropertyUtilExt$sortingHandlers$1$1$appSortData$1
                    }.getType())), new Comparator() { // from class: com.xiaomi.hm.health.utils.HMPropertyUtilExt$sortingHandlers$1$invoke$lambda-3$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues((String) ((Pair) t).getFirst(), (String) ((Pair) t2).getFirst());
                        }
                    });
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10)), 16));
                    for (Pair pair : listSortedWith) {
                        Pair pair2 = TuplesKt.to((String) pair.component1(), CollectionsKt___CollectionsKt.sortedWith((List) pair.component2(), new Comparator() { // from class: com.xiaomi.hm.health.utils.HMPropertyUtilExt$sortingHandlers$1$invoke$lambda-3$lambda-2$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((AppItemData) t).getIndex()), Integer.valueOf(((AppItemData) t2).getIndex()));
                            }
                        }));
                        linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                    }
                    json = Utils.getGson().toJson(linkedHashMap);
                }
                objM3845constructorimpl = Result.m3845constructorimpl(json);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Object obj = str;
            if (!Result.m3850isFailureimpl(objM3845constructorimpl)) {
                obj = objM3845constructorimpl;
            }
            return (String) obj;
        }
    }), TuplesKt.to(Property.PROPERTY_CONFIG_STATUS_BAR, new Function1<String, String>() { // from class: com.xiaomi.hm.health.utils.HMPropertyUtilExt$sortingHandlers$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@Nullable String str) {
            Object objM3845constructorimpl;
            String json;
            HMPropertyUtilExt hMPropertyUtilExt = HMPropertyUtilExt.INSTANCE;
            try {
                Result.Companion companion = Result.Companion;
                if (str == null) {
                    json = str;
                } else {
                    json = Utils.getGson().toJson(CollectionsKt___CollectionsKt.sortedWith(CollectionsKt___CollectionsKt.toList((List) Utils.getGson().fromJson(str, new TypeToken<List<? extends AppItemData>>() { // from class: com.xiaomi.hm.health.utils.HMPropertyUtilExt$sortingHandlers$2$1$appSortData$1
                    }.getType())), new Comparator() { // from class: com.xiaomi.hm.health.utils.HMPropertyUtilExt$sortingHandlers$2$invoke$lambda-1$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((AppItemData) t).getIndex()), Integer.valueOf(((AppItemData) t2).getIndex()));
                        }
                    }));
                }
                objM3845constructorimpl = Result.m3845constructorimpl(json);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Object obj = str;
            if (!Result.m3850isFailureimpl(objM3845constructorimpl)) {
                obj = objM3845constructorimpl;
            }
            return (String) obj;
        }
    }));

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.utils.HMPropertyUtilExt", f = "HMPropertyUtilExt.kt", i = {}, l = {167}, m = "appendPropertiesDeprecated", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return HMPropertyUtilExt.this.a(this);
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "setPropertyDeprecated 跳过，在数据库初始化前无法进行操作";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0005\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/databases/model/HmProperty;", "kotlin.jvm.PlatformType", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.utils.HMPropertyUtilExt$appendPropertiesDeprecated$list$1", f = "HMPropertyUtilExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<HmProperty>>, Object> {
        public int a;
        public final /* synthetic */ HMDaoManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMDaoManager hMDaoManager, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = hMDaoManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<HmProperty>> continuation) {
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
            return this.b.getHmPropertyDao().queryBuilder().where(HmPropertyDao.Properties.Status.eq(Boxing.boxInt(0)), new WhereCondition[0]).list();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "setPropertyDeprecated 跳过，在数据库初始化前无法进行操作";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.utils.HMPropertyUtilExt$postPropertiesToServer$1", f = "HMPropertyUtilExt.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_MODERN_DANCE}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMPropertyUtilExt hMPropertyUtilExt = HMPropertyUtilExt.INSTANCE;
                this.a = 1;
                if (hMPropertyUtilExt.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            UserPropertyManager.INSTANCE.schedulePushAll();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", "Lcom/huami/userproperty/entity/BatchPushResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.utils.HMPropertyUtilExt$pushAllPropertiesBlock$1", f = "HMPropertyUtilExt.kt", i = {}, l = {60, 61}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BatchPushResult>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ BatchPushResult a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BatchPushResult batchPushResult) {
                super(0);
                this.a = batchPushResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                if (this.a.isSuccess()) {
                    return "登出-同步成功：" + this.a.getSuccessKeys();
                }
                return "登出-同步失败：" + this.a.getFailedKeys();
            }
        }

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super BatchPushResult> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BatchPushResult batchPushResult = (BatchPushResult) obj;
                HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new a(batchPushResult));
                return batchPushResult;
            }
            ResultKt.throwOnFailure(obj);
            HMPropertyUtilExt hMPropertyUtilExt = HMPropertyUtilExt.INSTANCE;
            this.a = 1;
            if (hMPropertyUtilExt.a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ResultFuture resultFuturePushAll$default = UserPropertyManager.pushAll$default(UserPropertyManager.INSTANCE, null, 1, null);
            this.a = 2;
            obj = resultFuturePushAll$default.get(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            BatchPushResult batchPushResult2 = (BatchPushResult) obj;
            HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new a(batchPushResult2));
            return batchPushResult2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "回退读取：key=" + this.a + ", value=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "回退写入：key=" + this.a + ", value=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "setPropertyDeprecated 跳过，在数据库初始化前无法进行操作";
        }
    }

    private HMPropertyUtilExt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Continuation<? super Unit> continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            HMDaoManager hMDaoManager = HMDaoManager.getInstance();
            if (hMDaoManager == null) {
                HMLog.error$default(EcgAnalyticsKt.TAG, null, null, b.a, 6, null);
                return Unit.INSTANCE;
            }
            CoroutineDispatcher io2 = Dispatchers.getIO();
            c cVar = new c(hMDaoManager, null);
            aVar.c = 1;
            objWithContext = BuildersKt.withContext(io2, cVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        for (HmProperty hmProperty : (List) objWithContext) {
            String key = hmProperty.getKey();
            if (needMigrationKeys.contains(key)) {
                saveLocal(key, hmProperty.getValue());
            }
        }
        return Unit.INSTANCE;
    }

    private final String b(String key, String defaultValue) {
        HMDaoManager hMDaoManager = HMDaoManager.getInstance();
        if (hMDaoManager == null) {
            HMLog.error$default(EcgAnalyticsKt.TAG, null, null, d.a, 6, null);
            return null;
        }
        HmProperty hmPropertyLoad = hMDaoManager.getHmPropertyDao().load(key);
        return (hmPropertyLoad == null || TextUtils.isEmpty(hmPropertyLoad.getValue())) ? defaultValue : hmPropertyLoad.getValue();
    }

    private final synchronized void c(String key, String value) {
        HmProperty hmProperty = new HmProperty(key, value, 0);
        HMDaoManager hMDaoManager = HMDaoManager.getInstance();
        if (hMDaoManager == null) {
            HMLog.error$default(EcgAnalyticsKt.TAG, null, null, i.a, 6, null);
        } else {
            hMDaoManager.getHmPropertyDao().insertOrReplace(hmProperty);
        }
    }

    @JvmStatic
    public static final void postPropertiesToServer() {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new e(null), 3, null);
    }

    @JvmStatic
    @NotNull
    public static final BatchPushResult pushAllPropertiesBlock() {
        return (BatchPushResult) kotlinx.coroutines.d.b(null, new f(null), 1, null);
    }

    @JvmStatic
    @Nullable
    public static final String readLocal(@NotNull String key, @Nullable String defaultValue) {
        if (!needMigrationKeys.contains(key)) {
            String local = UserPropertyManager.INSTANCE.readLocal(key, null);
            return local == null ? defaultValue : local;
        }
        String strB = INSTANCE.b(key, defaultValue);
        HMLog.debug(EcgAnalyticsKt.TAG, new g(key, strB));
        return strB;
    }

    @JvmStatic
    public static final void saveLocal(@NotNull String key, @Nullable String value) {
        if (needMigrationKeys.contains(key)) {
            INSTANCE.c(key, value);
            HMLog.debug(EcgAnalyticsKt.TAG, new h(key, value));
        }
        UserPropertyManager.INSTANCE.saveLocal(key, null, value);
    }

    @NotNull
    public final Map<String, Function1<String, String>> getSortingHandlers() {
        return sortingHandlers;
    }
}
