package com.huami.phn.coach.usecase.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.coach.usecase.SwitchDeviceAlertUseCase;
import com.huami.phn.core.device.Device;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0005B3\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/huami/phn/coach/usecase/impl/SwitchDeviceAlertUseCaseImpl;", "Lcom/huami/phn/coach/usecase/SwitchDeviceAlertUseCase;", "", "getAlert", "Lcom/huami/phn/core/device/Device;", "a", "Lcom/huami/phn/core/device/Device;", "device", "Lcom/huami/phn/core/source/LocalDataSource;", "b", "Lcom/huami/phn/core/source/LocalDataSource;", "local", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "restoreAlert", GoogleApiAvailabilityLight.a, "deviceUnsupported", "<init>", "(Lcom/huami/phn/core/device/Device;Lcom/huami/phn/core/source/LocalDataSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "e", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class SwitchDeviceAlertUseCaseImpl implements SwitchDeviceAlertUseCase {

    @Deprecated
    @NotNull
    public static final String TAG = "SwitchDeviceAlertUseCaseImpl";

    @NotNull
    private static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Device device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> restoreAlert;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> deviceUnsupported;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/phn/coach/usecase/impl/SwitchDeviceAlertUseCaseImpl$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
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
            return "No phn record!";
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
            return "PHN has been stopped!";
        }
    }

    public SwitchDeviceAlertUseCaseImpl(@NotNull Device device, @NotNull LocalDataSource localDataSource, @NotNull Function0<String> function0, @NotNull Function0<String> function1) {
        this.device = device;
        this.local = localDataSource;
        this.restoreAlert = function0;
        this.deviceUnsupported = function1;
    }

    @Override // com.huami.phn.coach.usecase.SwitchDeviceAlertUseCase
    @Nullable
    public String getAlert() {
        PHNProjectRecord pHNProjectRecord = (PHNProjectRecord) CollectionsKt.firstOrNull((List) this.local.queryProject(1, null));
        if (pHNProjectRecord == null) {
            HMLog.info(TAG, b.a);
            return null;
        }
        PHNProjectRecord.PHNProjectSetting.TimeStampAndZone endDate = pHNProjectRecord.getSetting().getEndDate();
        boolean z = false;
        if (endDate != null) {
            z = endDate.getTimestamp() > 0;
        }
        if (!z) {
            return this.device.getIsPhnEnable() ? this.restoreAlert.invoke() : this.deviceUnsupported.invoke();
        }
        HMLog.info(TAG, c.a);
        return null;
    }
}
