package com.huami.health.afppg.usecase;

import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.remote.dto.AFibResultExtra;
import com.huami.health.afppg.data.remote.dto.HealthEvents;
import com.huami.health.afppg.repository.PPGRepository;
import com.huami.health.afppg.service.ConvertContinuousAFibService;
import com.huami.health.afppg.utils.GsonConvertorKt;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/health/afppg/usecase/PostAFibUseCase;", "", "", "Lcom/huami/health/afppg/data/local/bean/AFibData;", "a", "", "value", "", "c", "", "uid", "", "data", "Lcom/huami/health/afppg/data/remote/dto/HealthEvents;", "b", "postAF", "Lcom/huami/health/afppg/repository/PPGRepository;", "Lcom/huami/health/afppg/repository/PPGRepository;", "ppgRepository", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "isSyncDataEnabled", "<init>", "(Lcom/huami/health/afppg/repository/PPGRepository;Lkotlin/jvm/functions/Function0;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class PostAFibUseCase {

    @NotNull
    public static final String PARAM_EVENT_TYPE_HEART_HEALTH = "heart_health";

    @NotNull
    public static final String PARAM_SUBTYPE_ABNORMAL_HEART = "abnormal_heart";

    @NotNull
    private static final String c = "af_ppg_PostAFibUseCase";
    private static final long d = 1583337600;
    private static final long e = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PPGRepository ppgRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isSyncDataEnabled;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "postAF: no data to post";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HealthEvents.EventItem> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<HealthEvents.EventItem> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("post getFwWarningEvents success size: ", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("post getFwWarningEvents failed: ", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HealthEvents.EventItem> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<HealthEvents.EventItem> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("post getAFibEvents success size: ", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("post getAFibEvents failed: ", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Map.Entry<Long, List<AFibData>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Map.Entry<Long, ? extends List<AFibData>> entry) {
            super(0);
            this.a = entry;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("groupMap key: ", this.a.getKey());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Ref.BooleanRef booleanRef) {
            super(0);
            this.a = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("postAF result: ", Boolean.valueOf(this.a.element));
        }
    }

    public PostAFibUseCase(@NotNull PPGRepository pPGRepository, @NotNull Function0<Boolean> function0) {
        this.ppgRepository = pPGRepository;
        this.isSyncDataEnabled = function0;
    }

    private final List<AFibData> a(List<AFibData> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (c(((AFibData) obj).getValue())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
    }

    private final HealthEvents b(String uid, List<AFibData> data) {
        HealthEvents healthEvents = new HealthEvents(null, 1, null);
        List<HealthEvents.EventItem> items = healthEvents.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
        for (AFibData aFibData : data) {
            AFibResultExtra aFibResultExtra = new AFibResultExtra(aFibData.getSn(), aFibData.getDeviceId(), aFibData.getAppName(), aFibData.getDeviceSource());
            long timestamp = aFibData.getTimestamp() * 1000;
            arrayList.add(new HealthEvents.EventItem(uid, aFibData.getType() + '_' + aFibData.getValue(), aFibData.getValue() == 1 ? aFibData.getValue() : 0, aFibData.getSn(), aFibData.getDeviceId(), aFibData.getDeviceSource(), aFibData.getAppName(), null, timestamp, GsonConvertorKt.toJson(aFibResultExtra), aFibData.getTimeZone(), 128, null));
        }
        items.addAll(arrayList);
        return healthEvents;
    }

    private final boolean c(int value) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 2, 3, 8}).contains(Integer.valueOf(value));
    }

    public final boolean postAF(@NotNull String uid) {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        if (!this.isSyncDataEnabled.invoke().booleanValue()) {
            return false;
        }
        List<AFibData> unsyncedAFData = this.ppgRepository.getUnsyncedAFData(d);
        if (unsyncedAFData.isEmpty()) {
            HMLog.info(c, a.a);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : unsyncedAFData) {
            if (!((AFibData) obj).isEmpty()) {
                arrayList.add(obj);
            }
        }
        List<AFibData> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (AFibData aFibData : mutableList) {
            if (aFibData.isNeedNotifyEvent()) {
                arrayList2.add(aFibData);
            }
            if (!map.containsKey(Long.valueOf(aFibData.getGroupTime()))) {
                map.put(Long.valueOf(aFibData.getGroupTime()), new ArrayList());
            }
            List list = (List) map.get(Long.valueOf(aFibData.getGroupTime()));
            if (list != null) {
                list.add(aFibData);
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        List<HealthEvents.EventItem> items = b(uid, arrayList2).getItems();
        if (!items.isEmpty()) {
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(this.ppgRepository.postEvents(items)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3851isSuccessimpl(objM3845constructorimpl)) {
                boolean zBooleanValue = ((Boolean) objM3845constructorimpl).booleanValue();
                HMLog.info(c, new b(items));
                booleanRef.element &= zBooleanValue;
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                booleanRef.element = false;
                HMLog.error$default(c, null, null, new c(thM3848exceptionOrNullimpl), 6, null);
            }
        }
        List<HealthEvents.EventItem> items2 = ConvertContinuousAFibService.INSTANCE.getAFibEvents(uid, a(mutableList)).getItems();
        if (!items2.isEmpty()) {
            try {
                Result.Companion companion3 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(Boolean.valueOf(this.ppgRepository.postEvents(items2)));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m3851isSuccessimpl(objM3845constructorimpl2)) {
                boolean zBooleanValue2 = ((Boolean) objM3845constructorimpl2).booleanValue();
                HMLog.info(c, new d(items2));
                booleanRef.element &= zBooleanValue2;
            }
            Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
            if (thM3848exceptionOrNullimpl2 != null) {
                booleanRef.element = false;
                HMLog.error$default(c, null, null, new e(thM3848exceptionOrNullimpl2), 6, null);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            HMLog.info(c, new f(entry));
            booleanRef.element = this.ppgRepository.postAFResult((List) entry.getValue()) & booleanRef.element;
        }
        HMLog.info(c, new g(booleanRef));
        if (booleanRef.element) {
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableList, 10));
            Iterator<T> it2 = mutableList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Long.valueOf(((AFibData) it2.next()).getTimestamp()));
            }
            this.ppgRepository.updateAFibSyncedState(arrayList3);
        }
        return booleanRef.element;
    }
}
