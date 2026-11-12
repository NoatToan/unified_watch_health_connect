package com.huami.health.afppg.usecase;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.afppg.PpgCoroutineScope;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.remote.dto.AFibResultExtra;
import com.huami.health.afppg.data.remote.dto.AtrialFibrillationExtra;
import com.huami.health.afppg.data.remote.dto.UserEvents;
import com.huami.health.afppg.repository.PPGRepository;
import com.huami.health.afppg.service.event.AFib;
import com.huami.health.afppg.service.event.AFibEventDay;
import com.huami.health.afppg.usecase.GetAFibByDayFlowUseCase;
import com.huami.health.afppg.utils.AfibCacheHelper;
import com.huami.health.afppg.utils.GsonConvertorKt;
import com.huami.health.afppg.utils.PPGExtensionsKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b*\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\b*\b\u0012\u0004\u0012\u00020\u00100\bH\u0002J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/health/afppg/usecase/GetAFibByDayFlowUseCase;", "", "", "fromTime", "toTime", "", "Lcom/huami/health/afppg/data/remote/dto/UserEvents$EventItem;", "initialItems", "", "h", "Lcom/huami/health/afppg/service/event/AFib;", "e", "item", "", "duration", GoogleApiAvailabilityLight.a, "Lcom/huami/health/afppg/data/local/bean/AFibData;", "b", "items", "c", "", "toDateLong", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/health/afppg/service/event/AFibEventDay;", Constant.METHOD_EXECUTE, "Lcom/huami/health/afppg/repository/PPGRepository;", "a", "Lcom/huami/health/afppg/repository/PPGRepository;", "ppgRepository", "Lcom/huami/health/afppg/PpgCoroutineScope;", "Lcom/huami/health/afppg/PpgCoroutineScope;", "scope", "<init>", "(Lcom/huami/health/afppg/repository/PPGRepository;Lcom/huami/health/afppg/PpgCoroutineScope;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class GetAFibByDayFlowUseCase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = "af_ppg_GetAfibByDayUseCase";

    @NotNull
    private static final String d = "00:00:00";

    @NotNull
    private static final String e = "23:59:59";
    private static final long f = 60;
    private static final long g = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PPGRepository ppgRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PpgCoroutineScope scope;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/health/afppg/usecase/GetAFibByDayFlowUseCase$Companion;", "", "", "", "duration", "a", "", "TAG", "Ljava/lang/String;", "TIME_TODAY_END", "TIME_TODAY_FROM", "TIME_UNIT_MILLISECOND", "J", "TIME_UNIT_SECOND", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long a(long j, int i) {
            return j + (((long) i) * 60 * 1000);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.health.afppg.usecase.GetAFibByDayFlowUseCase$execute$1$1", f = "GetAFibByDayFlowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ List<AFibData> d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ MutableLiveData<AFibEventDay> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, List<AFibData> list, String str2, String str3, MutableLiveData<AFibEventDay> mutableLiveData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = list;
            this.e = str2;
            this.f = str3;
            this.g = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetAFibByDayFlowUseCase.this.new a(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GetAFibByDayFlowUseCase getAFibByDayFlowUseCase = GetAFibByDayFlowUseCase.this;
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getAFibByDayFlowUseCase.e(GetAFibByDayFlowUseCase.g(this.c, getAFibByDayFlowUseCase, this.d, this.e, this.f)));
            MutableLiveData<AFibEventDay> mutableLiveData = this.g;
            int duration = 0;
            Iterator it2 = mutableList.iterator();
            while (it2.hasNext()) {
                duration += ((AFib) it2.next()).getDuration();
            }
            mutableLiveData.postValue(new AFibEventDay(duration, mutableList));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("queryAFibByDayEvents failed: ", this.a.getMessage());
        }
    }

    public GetAFibByDayFlowUseCase(@NotNull PPGRepository pPGRepository, @NotNull PpgCoroutineScope ppgCoroutineScope) {
        this.ppgRepository = pPGRepository;
        this.scope = ppgCoroutineScope;
    }

    private final List<UserEvents.EventItem> b(List<AFibData> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AFibData aFibData : list) {
            String userId = aFibData.getUserId();
            long timestamp = aFibData.getTimestamp() * ((long) 1000);
            String appName = aFibData.getAppName();
            int deviceSource = aFibData.getDeviceSource();
            arrayList.add(new UserEvents.EventItem(userId, "17_1", null, timestamp, 0, null, null, 0, null, GsonConvertorKt.toJson(new AFibResultExtra(aFibData.getSn(), aFibData.getDeviceId(), appName, deviceSource)), aFibData.getTimeZone(), false, aFibData.getDate(), 500, null));
        }
        return arrayList;
    }

    private final List<AFibData> c(List<UserEvents.EventItem> items) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        Iterator it2 = items.iterator();
        while (it2.hasNext()) {
            UserEvents.EventItem eventItem = (UserEvents.EventItem) it2.next();
            long j = 1000;
            Iterator it3 = it2;
            AFibData aFibData = new AFibData(Constants.VIA_REPORT_TYPE_START_GROUP, eventItem.getTimestamp() / j, 0, 1, 0L, 1, eventItem.getUserId(), null, null, null, null, eventItem.getTimeZoneId(), PPGExtensionsKt.toYMDHMS(eventItem.getTimestamp() / j, TimeZone.getTimeZone(eventItem.getTimeZoneId())), 1924, null);
            AtrialFibrillationExtra atrialFibrillationExtra = (AtrialFibrillationExtra) GsonConvertorKt.jsonConvert(eventItem.getExtra(), AtrialFibrillationExtra.class);
            if (atrialFibrillationExtra != null) {
                aFibData.setDeviceSource(atrialFibrillationExtra.getDeviceSource());
                aFibData.setSn(atrialFibrillationExtra.getSn());
                aFibData.setDeviceId(atrialFibrillationExtra.getDeviceId());
                aFibData.setAppName(atrialFibrillationExtra.getAppName());
            }
            arrayList.add(aFibData);
            it2 = it3;
        }
        return arrayList;
    }

    private final AFib d(UserEvents.EventItem item, int duration) {
        int deviceSource;
        String diagnosis;
        AtrialFibrillationExtra atrialFibrillationExtra = (AtrialFibrillationExtra) GsonConvertorKt.jsonConvert(item.getExtra(), AtrialFibrillationExtra.class);
        if (item.getExtra().length() > 0) {
            Integer numValueOf = atrialFibrillationExtra == null ? null : Integer.valueOf(atrialFibrillationExtra.getDeviceSource());
            deviceSource = numValueOf == null ? item.getDeviceSource() : numValueOf.intValue();
        } else {
            deviceSource = item.getDeviceSource();
        }
        return new AFib(duration, item.getTimestamp(), INSTANCE.a(item.getTimestamp(), duration), (atrialFibrillationExtra == null || (diagnosis = atrialFibrillationExtra.getDiagnosis()) == null) ? "" : diagnosis, deviceSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    public final List<AFib> e(List<UserEvents.EventItem> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        for (Object obj : list) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            UserEvents.EventItem eventItem = (UserEvents.EventItem) obj;
            long timestamp = eventItem.getTimestamp();
            if (i < list.size() - 1) {
                long timestamp2 = list.get(i3).getTimestamp();
                Date date = new Date(timestamp);
                Date date2 = new Date(timestamp2);
                if (Math.abs(timestamp - timestamp2) >= 75000 || !PPGExtensionsKt.isSameDay(date, date2)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (!z) {
                if (z2) {
                    long j = 1000;
                    arrayList.add(d(eventItem, (int) (((list.get(i2).getTimestamp() / j) - (eventItem.getTimestamp() / j)) / ((long) 60))));
                } else {
                    arrayList.add(d(list.get(i2), 1));
                }
                i2 = i3;
            }
            z2 = z;
            i = i3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData f(GetAFibByDayFlowUseCase getAFibByDayFlowUseCase, String str, String str2, String str3, List list) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        e.f(getAFibByDayFlowUseCase.scope, Dispatchers.getIO(), null, getAFibByDayFlowUseCase.new a(str, list, str2, str3, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<UserEvents.EventItem> g(String str, GetAFibByDayFlowUseCase getAFibByDayFlowUseCase, List<AFibData> list, String str2, String str3) {
        Object objM3845constructorimpl;
        if (AfibCacheHelper.isCached(str)) {
            return getAFibByDayFlowUseCase.b(list);
        }
        try {
            Result.Companion companion = Result.Companion;
            List<UserEvents.EventItem> listH = getAFibByDayFlowUseCase.h(str2, str3, new ArrayList());
            AfibCacheHelper.saveCache(str);
            objM3845constructorimpl = Result.m3845constructorimpl(listH);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(c, null, null, new b(thM3848exceptionOrNullimpl), 6, null);
            return getAFibByDayFlowUseCase.b(list);
        }
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = listEmptyList;
        }
        return (List) objM3845constructorimpl;
    }

    private final List<UserEvents.EventItem> h(String fromTime, String toTime, List<UserEvents.EventItem> initialItems) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(initialItems);
        UserEvents afibFromServer = this.ppgRepository.getAfibFromServer(fromTime, toTime);
        this.ppgRepository.insertNewAFibData(c(afibFromServer.getItems()));
        arrayList.addAll(afibFromServer.getItems());
        if (afibFromServer.getNext() != null && afibFromServer.getNext().getTimestamp() != 0) {
            String strTimestampToYMD$default = PPGExtensionsKt.timestampToYMD$default(afibFromServer.getNext().getTimestamp(), null, 2, null);
            h(Intrinsics.stringPlus(strTimestampToYMD$default, d), Intrinsics.stringPlus(strTimestampToYMD$default, e), arrayList);
        }
        return arrayList;
    }

    @NotNull
    public final Flow<AFibEventDay> execute(long toDateLong) {
        final String strTimestampToYMD$default = PPGExtensionsKt.timestampToYMD$default(toDateLong, null, 2, null);
        final String strStringPlus = Intrinsics.stringPlus(strTimestampToYMD$default, d);
        final String strStringPlus2 = Intrinsics.stringPlus(strTimestampToYMD$default, e);
        return FlowLiveDataConversions.asFlow(Transformations.switchMap(FlowLiveDataConversions.asLiveData$default(this.ppgRepository.getAFibDataDataFlow(strStringPlus, strStringPlus2), (CoroutineContext) null, 0L, 3, (Object) null), new Function() { // from class: pf2
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return GetAFibByDayFlowUseCase.f(this.a, strTimestampToYMD$default, strStringPlus, strStringPlus2, (List) obj);
            }
        }));
    }
}
