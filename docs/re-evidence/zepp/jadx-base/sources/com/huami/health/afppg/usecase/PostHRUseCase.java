package com.huami.health.afppg.usecase;

import com.huami.health.afppg.data.local.bean.HREventData;
import com.huami.health.afppg.data.remote.dto.HealthEvents;
import com.huami.health.afppg.data.remote.dto.HeartHealthExtra;
import com.huami.health.afppg.repository.PPGRepository;
import com.huami.health.afppg.utils.GsonConvertorKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/health/afppg/usecase/PostHRUseCase;", "", "", Constant.METHOD_EXECUTE, "", "a", "Ljava/lang/String;", "appName", "Lcom/huami/health/afppg/repository/PPGRepository;", "b", "Lcom/huami/health/afppg/repository/PPGRepository;", "ppgRepository", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "isSyncDataEnabled", "<init>", "(Ljava/lang/String;Lcom/huami/health/afppg/repository/PPGRepository;Lkotlin/jvm/functions/Function0;)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class PostHRUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PPGRepository ppgRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
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
            return "updateHrSyncState failed";
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
        public final String invoke() {
            return "updateHrSyncState failed";
        }
    }

    public PostHRUseCase(@NotNull String str, @NotNull PPGRepository pPGRepository, @NotNull Function0<Boolean> function0) {
        this.appName = str;
        this.ppgRepository = pPGRepository;
        this.isSyncDataEnabled = function0;
    }

    public final boolean execute() {
        Object objM3845constructorimpl;
        if (!this.isSyncDataEnabled.invoke().booleanValue()) {
            return false;
        }
        List<HREventData> unsyncedHrData = this.ppgRepository.getUnsyncedHrData();
        if (unsyncedHrData.isEmpty()) {
            return true;
        }
        try {
            Result.Companion companion = Result.Companion;
            PPGRepository pPGRepository = this.ppgRepository;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(unsyncedHrData, 10));
            for (HREventData hREventData : unsyncedHrData) {
                String sn = hREventData.getSn();
                int deviceSource = hREventData.getDeviceSource();
                String deviceID = hREventData.getDeviceID();
                String str = this.appName;
                int lowHR = hREventData.getLowHR();
                HeartHealthExtra heartHealthExtra = new HeartHealthExtra(hREventData.getDuration(), hREventData.getHighHR(), lowHR, null, deviceSource, str, sn, deviceID, 8, null);
                arrayList.add(new HealthEvents.EventItem(hREventData.getUserID(), hREventData.getEventType(), 0, null, null, 0, null, hREventData.getSubType(), hREventData.getTimestamp(), GsonConvertorKt.toJson(heartHealthExtra), hREventData.getTimeZone(), 124, null));
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(pPGRepository.postEvents(arrayList)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m3851isSuccessimpl(objM3845constructorimpl)) {
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) == null) {
                return true;
            }
            HMLog.error$default("", null, null, b.a, 6, null);
            return false;
        }
        if (((Boolean) objM3845constructorimpl).booleanValue()) {
            this.ppgRepository.updateHrSyncState(unsyncedHrData);
            return true;
        }
        HMLog.error$default("", null, null, a.a, 6, null);
        return false;
    }
}
