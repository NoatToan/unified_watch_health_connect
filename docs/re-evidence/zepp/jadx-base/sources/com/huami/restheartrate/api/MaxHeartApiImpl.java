package com.huami.restheartrate.api;

import com.app.restheartrate.service.api.MaxHeartApi;
import com.app.restheartrate.service.entity.MaxHeartRate;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.restheartrate.entity.MaxHeartEntity;
import com.huami.restheartrate.room.MaxHeartDao;
import com.huami.restheartrate.utils.ExtensionUtilKt;
import com.huami.tools.log.HMLog;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.xiaomi.hm.health.Constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/restheartrate/api/MaxHeartApiImpl;", "Lcom/app/restheartrate/service/api/MaxHeartApi;", "", "date", "Lcom/app/restheartrate/service/entity/MaxHeartRate;", "getHeartRateByDate", "Lorg/json/JSONObject;", "getMaxHeartJson", "", "summaryList", "", "parseAndSaveMaxHeartFromSummary", "list", "saveHeartRateData", "Lcom/huami/restheartrate/room/MaxHeartDao;", "a", "Lcom/huami/restheartrate/room/MaxHeartDao;", "maxHeartDao", "Lcom/huami/account/service/AccountService;", "b", "Lcom/huami/account/service/AccountService;", "accountService", "c", "Ljava/lang/String;", "tag", "Lkotlinx/coroutines/CoroutineScope;", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lcom/huami/restheartrate/room/MaxHeartDao;Lcom/huami/account/service/AccountService;)V", "restheartrate_release"}, k = 1, mv = {1, 5, 1})
public final class MaxHeartApiImpl implements MaxHeartApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MaxHeartDao maxHeartDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccountService accountService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String tag = "MaxHeartApiImpl";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

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
        public final String invoke() {
            return "parse max heart error " + this.a;
        }
    }

    /* JADX INFO: renamed from: com.huami.restheartrate.api.MaxHeartApiImpl$saveHeartRateData$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.restheartrate.api.MaxHeartApiImpl$saveHeartRateData$1", f = "MaxHeartApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<MaxHeartRate> b;
        public final /* synthetic */ MaxHeartApiImpl c;

        /* JADX INFO: renamed from: com.huami.restheartrate.api.MaxHeartApiImpl$saveHeartRateData$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<MaxHeartEntity> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<MaxHeartEntity> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "insert " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<MaxHeartRate> list, MaxHeartApiImpl maxHeartApiImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = maxHeartApiImpl;
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
            Object next;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<MaxHeartRate> list = this.b;
            if (list != null && (!list.isEmpty())) {
                String strUserId = AccountServiceExtKt.userId(this.c.accountService);
                if (strUserId == null) {
                    return Unit.INSTANCE;
                }
                List<MaxHeartRate> list2 = this.b;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (MaxHeartRate maxHeartRate : list2) {
                    arrayList.add(new MaxHeartEntity(strUserId, ExtensionUtilKt.getDate(maxHeartRate.getTime()), maxHeartRate.getValue(), maxHeartRate.getTime()));
                }
                List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.huami.restheartrate.api.MaxHeartApiImpl$saveHeartRateData$1$invokeSuspend$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MaxHeartEntity) t).getTimestamp()), Long.valueOf(((MaxHeartEntity) t2).getTimestamp()));
                    }
                });
                List<MaxHeartEntity> maxHeartBetweenDate = this.c.maxHeartDao.getMaxHeartBetweenDate(strUserId, ((MaxHeartEntity) CollectionsKt.first(listSortedWith)).getDate(), ((MaxHeartEntity) CollectionsKt.last(listSortedWith)).getDate());
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listSortedWith.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    MaxHeartEntity maxHeartEntity = (MaxHeartEntity) next2;
                    Iterator<T> it3 = maxHeartBetweenDate.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!Boxing.boxBoolean(Intrinsics.areEqual(((MaxHeartEntity) next).getDate(), maxHeartEntity.getDate())).booleanValue());
                    MaxHeartEntity maxHeartEntity2 = (MaxHeartEntity) next;
                    Integer numBoxInt = maxHeartEntity2 != null ? Boxing.boxInt(maxHeartEntity2.getHeartRate()) : null;
                    if (Boxing.boxBoolean(numBoxInt == null || numBoxInt.intValue() <= maxHeartEntity.getHeartRate()).booleanValue()) {
                        arrayList2.add(next2);
                    }
                }
                HMLog.info(this.c.tag, new a(arrayList2));
                MaxHeartDao maxHeartDao = this.c.maxHeartDao;
                Object[] array = arrayList2.toArray(new MaxHeartEntity[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                MaxHeartEntity[] maxHeartEntityArr = (MaxHeartEntity[]) array;
                maxHeartDao.insertMaxHeart((MaxHeartEntity[]) Arrays.copyOf(maxHeartEntityArr, maxHeartEntityArr.length));
            }
            return Unit.INSTANCE;
        }
    }

    public MaxHeartApiImpl(@NotNull MaxHeartDao maxHeartDao, @NotNull AccountService accountService) {
        this.maxHeartDao = maxHeartDao;
        this.accountService = accountService;
    }

    @Override // com.app.restheartrate.service.api.MaxHeartApi
    @Nullable
    public MaxHeartRate getHeartRateByDate(@NotNull String date) {
        MaxHeartEntity maxHeartByDate;
        String strUserId = AccountServiceExtKt.userId(this.accountService);
        if (strUserId == null || (maxHeartByDate = this.maxHeartDao.getMaxHeartByDate(strUserId, date)) == null) {
            return null;
        }
        return new MaxHeartRate(maxHeartByDate.getTimestamp(), maxHeartByDate.getHeartRate());
    }

    @Override // com.app.restheartrate.service.api.MaxHeartApi
    @Nullable
    public JSONObject getMaxHeartJson(@NotNull String date) throws JSONException {
        MaxHeartRate heartRateByDate = getHeartRateByDate(date);
        if (heartRateByDate == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AuthHandler.d, heartRateByDate.getTime());
        jSONObject.put(Constants.DATA_KEY_HR, heartRateByDate.getValue());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(Constant.PAI_KEY_MAX_HR, jSONObject);
        return jSONObject2;
    }

    @Override // com.app.restheartrate.service.api.MaxHeartApi
    public void parseAndSaveMaxHeartFromSummary(@NotNull List<String> summaryList) {
        MaxHeartRate maxHeartRate;
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : summaryList) {
            if (StringsKt__StringsKt.contains$default((CharSequence) obj, (CharSequence) Constant.PAI_KEY_MAX_HR, false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(Constants.DATA_KEY_HR);
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONObject(Constant.PAI_KEY_MAX_HR);
                maxHeartRate = jSONObjectOptJSONObject2 != null ? new MaxHeartRate(jSONObjectOptJSONObject2.getLong(AuthHandler.d), jSONObjectOptJSONObject2.getInt(Constants.DATA_KEY_HR)) : null;
            } catch (Exception unused) {
                HMLog.info("MaxHeartSummaryUtil", new a(str));
            }
            if (maxHeartRate != null) {
                arrayList2.add(maxHeartRate);
            }
        }
        if (!arrayList2.isEmpty()) {
            saveHeartRateData(arrayList2);
        }
    }

    @Override // com.app.restheartrate.service.api.MaxHeartApi
    public void saveHeartRateData(@Nullable List<MaxHeartRate> list) {
        e.f(this.coroutineScope, null, null, new AnonymousClass1(list, this, null), 3, null);
    }
}
