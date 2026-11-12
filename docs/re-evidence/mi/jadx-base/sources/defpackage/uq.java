package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.RestHeartRate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Luq;", "", "Lne;", "hmMiLiProDevice", "Ljava/util/Calendar;", "calendar", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/RestHeartRate;", PluginDeviceInfo.FMODEL, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class uq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final uq f36012a = new uq();

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"uq$a", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/RestHeartRate;", "list", "", PluginDeviceInfo.FMODEL, "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a extends HMCallback<List<? extends RestHeartRate>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f36013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<RestHeartRate> f36014b;

        /* JADX INFO: renamed from: uq$a$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        public static final class C1117a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<RestHeartRate> t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1117a(List<RestHeartRate> list) {
                super(0);
                this.t = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "receive restheartrate list=" + this.t;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CountDownLatch countDownLatch, List<RestHeartRate> list) {
            super(false);
            this.f36013a = countDownLatch;
            this.f36014b = list;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(@Nullable List<RestHeartRate> list) {
            super.onData(list);
            le.c("RestHeartRateUtils", new C1117a(list));
            if (list != null) {
                this.f36014b.addAll(list);
            }
            this.f36013a.countDown();
        }
    }

    @NotNull
    public final List<RestHeartRate> a(@NotNull ne hmMiLiProDevice, @NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(hmMiLiProDevice, "hmMiLiProDevice");
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        ArrayList arrayList = new ArrayList();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hmMiLiProDevice.I2(new tq(calendar), new a(countDownLatch, arrayList));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            t5t.m("RestHeartRateUtils", "latch await exception:" + e.getMessage());
        }
        return arrayList;
    }
}
