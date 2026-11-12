package com.huami.phn.coach.usecase.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.datepicker.UtcDates;
import com.huami.phn.coach.usecase.SyncDevicePhnUseCase;
import com.huami.phn.coach.usecase.UseCaseException;
import com.huami.phn.core.device.BleException;
import com.huami.phn.core.device.DevicePHNFeature;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.phn.core.source.LocalKeeper;
import com.huami.phn.util.Result;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.base.MKTime;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\r\u0010\u000f\u001a\u00020\u000e*\u00020\u000bH\u0082\bJ\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/phn/coach/usecase/impl/SyncDevicePhnUseCaseImpl;", "Lcom/huami/phn/coach/usecase/SyncDevicePhnUseCase;", "Lcom/huami/phn/core/model/PHNProjectRecord;", "record", "", "source", "Lkotlinx/serialization/json/JsonObject;", "result", "", "c", "", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult;", "list", "b", "", "a", "Lcom/huami/phn/util/Result;", "", "Lcom/huami/phn/coach/usecase/UseCaseException$DeviceException;", "exec", "Lcom/huami/phn/core/source/LocalDataSource;", "Lcom/huami/phn/core/source/LocalDataSource;", "local", "Lcom/huami/phn/core/device/DevicePHNFeature;", "Lcom/huami/phn/core/device/DevicePHNFeature;", "device", "Lcom/huami/phn/core/source/LocalKeeper;", "Lcom/huami/phn/core/source/LocalKeeper;", HMKeeperConstant.KEEP_XML, "<init>", "(Lcom/huami/phn/core/source/LocalDataSource;Lcom/huami/phn/core/device/DevicePHNFeature;Lcom/huami/phn/core/source/LocalKeeper;)V", GoogleApiAvailabilityLight.a, "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class SyncDevicePhnUseCaseImpl implements SyncDevicePhnUseCase {

    @Deprecated
    @NotNull
    public static final String TAG = "SyncDevicePhnUseCaseImpl";

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DevicePHNFeature device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LocalKeeper keeper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/phn/coach/usecase/impl/SyncDevicePhnUseCaseImpl$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
            return "No phn plan to sync!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Phn plan is ended!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ JsonObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JsonObject jsonObject) {
            super(0);
            this.a = jsonObject;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Daily synced!";
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
            return "No daily analysis!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Skip daily analysis update!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Sync from device failed!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ List<PHNDailyAnalysisResult> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List<PHNDailyAnalysisResult> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            PHNDailyAnalysisResult pHNDailyAnalysisResult = (PHNDailyAnalysisResult) CollectionsKt.first((List) this.b);
            long timestamp = pHNDailyAnalysisResult.getTimestamp();
            int timezoneOffset = pHNDailyAnalysisResult.getTimezoneOffset();
            String str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            Object obj = timezoneOffset > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
            int iAbs = Math.abs(timezoneOffset);
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{obj, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3))));
            calendar.setTimeInMillis(timestamp);
            String str2 = String.format("%d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3));
            PHNDailyAnalysisResult pHNDailyAnalysisResult2 = (PHNDailyAnalysisResult) CollectionsKt.last((List) this.b);
            long timestamp2 = pHNDailyAnalysisResult2.getTimestamp();
            int timezoneOffset2 = pHNDailyAnalysisResult2.getTimezoneOffset();
            if (timezoneOffset2 <= 0) {
                str = "+";
            }
            int iAbs2 = Math.abs(timezoneOffset2);
            Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs2 / 60), Integer.valueOf(iAbs2 % 60)}, 3))));
            calendar2.setTimeInMillis(timestamp2);
            return "Result from " + str2 + " to " + String.format("%d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar2.get(1)), Integer.valueOf(calendar2.get(2) + 1), Integer.valueOf(calendar2.get(5))}, 3));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ PHNDailyAnalysisResult b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(PHNDailyAnalysisResult pHNDailyAnalysisResult) {
            super(0);
            this.b = pHNDailyAnalysisResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            PHNDailyAnalysisResult pHNDailyAnalysisResult = this.b;
            long timestamp = pHNDailyAnalysisResult.getTimestamp();
            int timezoneOffset = pHNDailyAnalysisResult.getTimezoneOffset();
            String str = timezoneOffset > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
            int iAbs = Math.abs(timezoneOffset);
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3))));
            calendar.setTimeInMillis(timestamp);
            return "Skip save - " + String.format("%d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3)) + "(" + this.b.getPhnPlanId() + "): " + this.b.getResult();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ List<PHNDailyAnalysisResult> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List<PHNDailyAnalysisResult> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            PHNDailyAnalysisResult pHNDailyAnalysisResult = (PHNDailyAnalysisResult) CollectionsKt.first((List) this.b);
            long timestamp = pHNDailyAnalysisResult.getTimestamp();
            int timezoneOffset = pHNDailyAnalysisResult.getTimezoneOffset();
            String str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            Object obj = timezoneOffset > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
            int iAbs = Math.abs(timezoneOffset);
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{obj, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3))));
            calendar.setTimeInMillis(timestamp);
            String str2 = String.format("%d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3));
            PHNDailyAnalysisResult pHNDailyAnalysisResult2 = (PHNDailyAnalysisResult) CollectionsKt.last((List) this.b);
            long timestamp2 = pHNDailyAnalysisResult2.getTimestamp();
            int timezoneOffset2 = pHNDailyAnalysisResult2.getTimezoneOffset();
            if (timezoneOffset2 <= 0) {
                str = "+";
            }
            int iAbs2 = Math.abs(timezoneOffset2);
            Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs2 / 60), Integer.valueOf(iAbs2 % 60)}, 3))));
            calendar2.setTimeInMillis(timestamp2);
            return "Save from " + str2 + " to " + String.format("%d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar2.get(1)), Integer.valueOf(calendar2.get(2) + 1), Integer.valueOf(calendar2.get(5))}, 3));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "No new daily analysis!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "No data change, skip save!";
        }
    }

    public SyncDevicePhnUseCaseImpl(@NotNull LocalDataSource localDataSource, @NotNull DevicePHNFeature devicePHNFeature, @NotNull LocalKeeper localKeeper) {
        this.local = localDataSource;
        this.device = devicePHNFeature;
        this.keeper = localKeeper;
    }

    private final String a(PHNDailyAnalysisResult pHNDailyAnalysisResult) {
        long timestamp = pHNDailyAnalysisResult.getTimestamp();
        int timezoneOffset = pHNDailyAnalysisResult.getTimezoneOffset();
        String str = timezoneOffset > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
        int iAbs = Math.abs(timezoneOffset);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3))));
        calendar.setTimeInMillis(timestamp);
        return String.format("%d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3));
    }

    private final void b(PHNProjectRecord record, List<PHNDailyAnalysisResult> list) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(UtcDates.UTC));
        PHNProjectRecord.PHNProjectSetting.TimeStampAndZone startDate = record.getSetting().getStartDate();
        long timestamp = startDate.getTimestamp();
        int timezone_offset = startDate.getTimezone_offset();
        String str = timezone_offset > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
        int iAbs = Math.abs(timezone_offset);
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3))));
        calendar2.setTimeInMillis(timestamp);
        calendar.set(calendar2.get(1), calendar2.get(2), calendar2.get(5), 0, 0, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        HMLog.info(TAG, new i(list));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            PHNDailyAnalysisResult pHNDailyAnalysisResult = (PHNDailyAnalysisResult) obj;
            boolean z = pHNDailyAnalysisResult.getTimestamp() >= timeInMillis;
            if (!z) {
                HMLog.debug(TAG, new j(pHNDailyAnalysisResult));
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        Boolean boolValueOf = null;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            HMLog.info(TAG, new k(arrayList));
            boolValueOf = Boolean.valueOf(this.local.saveDailyResult(arrayList));
        }
        if (boolValueOf == null) {
            HMLog.info(TAG, l.a);
        }
    }

    private final void c(PHNProjectRecord record, int source, JsonObject result) {
        Map.Entry<String, JsonElement> next;
        if (record.getResult() != null) {
            boolean z = true;
            if (!result.isEmpty()) {
                Iterator<Map.Entry<String, JsonElement>> it2 = result.entrySet().iterator();
                do {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    next = it2.next();
                } while (!(!Intrinsics.areEqual(next.getValue(), record.getResult().get((Object) next.getKey()))));
            } else {
                z = false;
                break;
            }
            if (!z) {
                HMLog.info(TAG, m.a);
                return;
            }
        }
        this.local.saveOrUpdateProject(kotlin.collections.e.listOf(record.copy((47 & 1) != 0 ? record.timestamp : 0L, (47 & 2) != 0 ? record.version : null, (47 & 4) != 0 ? record.setting : null, (47 & 8) != 0 ? record.result : result, (47 & 16) != 0 ? record.source : source, (47 & 32) != 0 ? record.synced : 0)));
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01f0  */
    @Override // com.huami.phn.coach.usecase.SyncDevicePhnUseCase
    @NotNull
    public Result<Boolean, UseCaseException.DeviceException> exec() {
        Object objM3845constructorimpl;
        List<PHNDailyAnalysisResult> list;
        Object objM3845constructorimpl2;
        Calendar calendar;
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        Calendar calendar2;
        PHNProjectRecord pHNProjectRecord = (PHNProjectRecord) CollectionsKt.firstOrNull((List) this.local.queryProject(1, null));
        if (pHNProjectRecord == null) {
            HMLog.warn(TAG, null, b.a);
            return Result.INSTANCE.success$phn_coach_release(Boolean.TRUE);
        }
        PHNProjectRecord.PHNProjectSetting.TimeStampAndZone endDate = pHNProjectRecord.getSetting().getEndDate();
        int i2 = 0;
        if (endDate != null && endDate.getTimestamp() > 0) {
            HMLog.warn(TAG, null, c.a);
            return Result.INSTANCE.success$phn_coach_release(Boolean.TRUE);
        }
        Result<JsonObject, BleException> resultSyncPhnResult = this.device.syncPhnResult();
        Throwable thExceptionOrNull = resultSyncPhnResult.exceptionOrNull();
        if (thExceptionOrNull != null) {
            BleException bleException = (BleException) thExceptionOrNull;
            HMLog.error(TAG, "", bleException, h.a);
            return Result.INSTANCE.failure$phn_coach_release(new UseCaseException.DeviceException(bleException));
        }
        JsonObject jsonObject = (JsonObject) resultSyncPhnResult.getValue();
        HMLog.info(TAG, new d(jsonObject));
        c(pHNProjectRecord, this.device.deviceSource().getValue(), jsonObject);
        if (this.keeper.isDailySynced()) {
            HMLog.info(TAG, g.a);
        } else {
            HMLog.info(TAG, e.a);
            this.keeper.updateDailySyncTime();
            long timestamp = pHNProjectRecord.getTimestamp();
            try {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                try {
                    JsonElement jsonElement = (JsonElement) jsonObject.get("last_update_time");
                    Long lValueOf = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : Long.valueOf(JsonElementKt.getLong(jsonPrimitive) * ((long) 1000));
                    if (lValueOf == null) {
                        calendar2 = null;
                    } else {
                        long jLongValue = lValueOf.longValue();
                        JsonElement jsonElement2 = (JsonElement) jsonObject.get("last_update_time_zone");
                        TimeZone timeZoneZoneKeyToTimeZone = (jsonElement2 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : MKTime.INSTANCE.zoneKeyToTimeZone(JsonElementKt.getInt(jsonPrimitive2));
                        if (timeZoneZoneKeyToTimeZone == null) {
                            calendar2 = null;
                        } else {
                            calendar2 = Calendar.getInstance(timeZoneZoneKeyToTimeZone);
                            calendar2.setTimeInMillis(jLongValue);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    objM3845constructorimpl2 = kotlin.Result.m3845constructorimpl(calendar2);
                } catch (Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    objM3845constructorimpl2 = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.error("PHNProjectRecord.toPlanDetail", "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getUpdateCal$2$1(thM3848exceptionOrNullimpl));
                    Unit unit2 = Unit.INSTANCE;
                }
                if (kotlin.Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                    objM3845constructorimpl2 = null;
                }
                Calendar calendar3 = (Calendar) objM3845constructorimpl2;
                if (calendar3 == null) {
                    calendar = null;
                } else {
                    calendar3.add(6, -42);
                    Calendar calendar4 = Calendar.getInstance(TimeZone.getTimeZone(UtcDates.UTC));
                    calendar4.set(calendar3.get(1), calendar3.get(2), calendar3.get(5), 0, 0, 0);
                    calendar4.set(14, 0);
                    Unit unit3 = Unit.INSTANCE;
                    calendar = calendar4;
                }
                if (calendar == null) {
                    throw new Exception("No update time!");
                }
                PHNProjectRecordKt$getDailyAnalysis$1$createResult$1 pHNProjectRecordKt$getDailyAnalysis$1$createResult$1 = new PHNProjectRecordKt$getDailyAnalysis$1$createResult$1((-(calendar.get(15) + calendar.get(16))) / 60000, timestamp, JsonElementKt.getJsonArray((JsonElement) jsonObject.get("trimp_42_days")), JsonElementKt.getJsonArray((JsonElement) jsonObject.get("atl_42_days")), JsonElementKt.getJsonArray((JsonElement) jsonObject.get("ctl_42_days")), JsonElementKt.getJsonArray((JsonElement) jsonObject.get("tsb_42_days")));
                ArrayList arrayList = new ArrayList();
                while (i2 < 42) {
                    PHNProjectRecordKt$getDailyAnalysis$1$createResult$1 pHNProjectRecordKt$getDailyAnalysis$1$createResult$2 = pHNProjectRecordKt$getDailyAnalysis$1$createResult$1;
                    arrayList.add(pHNProjectRecordKt$getDailyAnalysis$1$createResult$2.invoke(Integer.valueOf(i2), Long.valueOf(calendar.getTimeInMillis())));
                    calendar.add(6, 1);
                    Unit unit4 = Unit.INSTANCE;
                    i2++;
                    pHNProjectRecordKt$getDailyAnalysis$1$createResult$1 = pHNProjectRecordKt$getDailyAnalysis$1$createResult$2;
                }
                Unit unit5 = Unit.INSTANCE;
                objM3845constructorimpl = kotlin.Result.m3845constructorimpl(arrayList);
                Throwable thM3848exceptionOrNullimpl2 = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl2 != null) {
                    HMLog.error("PHNProjectRecord.toPlanDetail", "", thM3848exceptionOrNullimpl2, new PHNProjectRecordKt$getDailyAnalysis$2$1(thM3848exceptionOrNullimpl2, jsonObject));
                    Unit unit6 = Unit.INSTANCE;
                }
                if (kotlin.Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objM3845constructorimpl = null;
                }
                List<PHNDailyAnalysisResult> list2 = (List) objM3845constructorimpl;
                if (list2 != null) {
                    if (!(!list2.isEmpty())) {
                        list2 = null;
                    }
                    if (list2 == null) {
                        list = null;
                    } else {
                        b(pHNProjectRecord, list2);
                        Unit unit7 = Unit.INSTANCE;
                        list = list2;
                    }
                } else {
                    list = null;
                }
                if (list == null) {
                    HMLog.info(TAG, f.a);
                    Unit unit8 = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                kotlin.Result.Companion companion3 = kotlin.Result.Companion;
                objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th2));
            }
        }
        return Result.INSTANCE.success$phn_coach_release(Boolean.TRUE);
    }
}
