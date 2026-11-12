package com.xiaomi.hm.health.healthdata.utils.headset;

import com.huami.bluetooth.profile.gdsp.HearingHealthDayData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.feature.sync.job.headset.IHearingInfoSyncJobHandler;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/headset/HearingInfoSyncJobHandlerImpl;", "Lcom/xiaomi/hm/health/device/feature/sync/job/headset/IHearingInfoSyncJobHandler;", "", "Lcom/huami/bluetooth/profile/gdsp/HearingHealthDayData;", "outData", "", "onDataOut", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HearingInfoSyncJobHandlerImpl implements IHearingInfoSyncJobHandler {

    @NotNull
    private static final String a = "HearingInfoSyncJobHandlerImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.utils.headset.HearingInfoSyncJobHandlerImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0965a extends Lambda implements Function0<String> {
            public static final C0965a a = new C0965a();

            public C0965a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "upload hearing statics info success";
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(HearingInfoSyncJobHandlerImpl.a, C0965a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "upload hearing statics info failed";
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(HearingInfoSyncJobHandlerImpl.a, a.a);
        }
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.job.headset.IHearingInfoSyncJobHandler
    public void onDataOut(@NotNull List<HearingHealthDayData> outData) {
        HeadsetSyncTimeKeeper.INSTANCE.setHearingHealthSyncTime(Calendar.getInstance());
        if (!(!outData.isEmpty())) {
            outData = null;
        }
        if (outData == null) {
            return;
        }
        HearingHealthRepo.INSTANCE.tryUploadHearingData(outData, a.a, b.a);
    }
}
