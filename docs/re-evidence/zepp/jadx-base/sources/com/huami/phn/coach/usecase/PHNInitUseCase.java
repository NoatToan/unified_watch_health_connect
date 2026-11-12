package com.huami.phn.coach.usecase;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.core.device.BleException;
import com.huami.phn.core.device.DevicePHNFeature;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.phn.core.source.RemoteDataSource;
import com.huami.phn.util.Result;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/phn/coach/usecase/PHNInitUseCase;", "", "", "jsonData", "", Constant.METHOD_EXECUTE, "Lcom/huami/phn/core/source/LocalDataSource;", "a", "Lcom/huami/phn/core/source/LocalDataSource;", "local", "Lcom/huami/phn/core/source/RemoteDataSource;", "b", "Lcom/huami/phn/core/source/RemoteDataSource;", "remote", "Lcom/huami/phn/core/device/DevicePHNFeature;", "c", "Lcom/huami/phn/core/device/DevicePHNFeature;", "deviceFeature", "<init>", "(Lcom/huami/phn/core/source/LocalDataSource;Lcom/huami/phn/core/source/RemoteDataSource;Lcom/huami/phn/core/device/DevicePHNFeature;)V", GoogleApiAvailabilityLight.a, "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNInitUseCase {

    @Deprecated
    @NotNull
    public static final String TAG = "PHNInitUseCase";

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RemoteDataSource remote;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DevicePHNFeature deviceFeature;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/phn/coach/usecase/PHNInitUseCase$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
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
            return "phn init cloud  failed, no record ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ PHNProjectRecord a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PHNProjectRecord pHNProjectRecord) {
            super(0);
            this.a = pHNProjectRecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            Json.Companion companion = Json.INSTANCE;
            return "record: " + companion.encodeToString(SerializersKt.serializer(companion.getSerializersModule(), Reflection.typeOf(PHNProjectRecord.class)), this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMDeviceSource hMDeviceSource) {
            super(0);
            this.a = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "phn init device(" + this.a + ") success!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ BleException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BleException bleException) {
            super(0);
            this.a = bleException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "phn init device failed: " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "query algo version success " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ BleException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BleException bleException) {
            super(0);
            this.a = bleException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "query algo version failed: " + this.a.getMessage();
        }
    }

    public PHNInitUseCase(@NotNull LocalDataSource localDataSource, @NotNull RemoteDataSource remoteDataSource, @NotNull DevicePHNFeature devicePHNFeature) {
        this.local = localDataSource;
        this.remote = remoteDataSource;
        this.deviceFeature = devicePHNFeature;
    }

    public final boolean execute(@NotNull String jsonData) {
        String str;
        Object objM3845constructorimpl;
        Result<String, BleException> resultQueryVersion = this.deviceFeature.queryVersion();
        Throwable thExceptionOrNull = resultQueryVersion.exceptionOrNull();
        if (thExceptionOrNull == null) {
            str = (String) resultQueryVersion.getValue();
            HMLog.info(TAG, new f(str));
        } else {
            HMLog.info(TAG, new g((BleException) thExceptionOrNull));
            str = null;
        }
        if (str == null) {
            return false;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(this.remote.postPHNInit(jsonData, str));
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        PHNProjectRecord pHNProjectRecord = (PHNProjectRecord) (kotlin.Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        if (pHNProjectRecord == null) {
            HMLog.info(TAG, b.a);
            return false;
        }
        HMDeviceSource hMDeviceSourceDeviceSource = this.deviceFeature.deviceSource();
        HMLog.info(TAG, new c(pHNProjectRecord));
        Result<Boolean, BleException> resultStartPhnProject = this.deviceFeature.startPhnProject(pHNProjectRecord);
        Throwable thExceptionOrNull2 = resultStartPhnProject.exceptionOrNull();
        if (thExceptionOrNull2 != null) {
            HMLog.info(TAG, new e((BleException) thExceptionOrNull2));
            return false;
        }
        ((Boolean) resultStartPhnProject.getValue()).booleanValue();
        HMLog.info(TAG, new d(hMDeviceSourceDeviceSource));
        this.local.saveProjectFromWeb(kotlin.collections.e.listOf(pHNProjectRecord.copy((47 & 1) != 0 ? pHNProjectRecord.timestamp : 0L, (47 & 2) != 0 ? pHNProjectRecord.version : null, (47 & 4) != 0 ? pHNProjectRecord.setting : null, (47 & 8) != 0 ? pHNProjectRecord.result : null, (47 & 16) != 0 ? pHNProjectRecord.source : hMDeviceSourceDeviceSource.getValue(), (47 & 32) != 0 ? pHNProjectRecord.synced : 0)));
        return true;
    }
}
