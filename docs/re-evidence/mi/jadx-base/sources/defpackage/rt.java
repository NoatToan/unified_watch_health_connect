package defpackage;

import com.huami.proto.SportEfect;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u0006\u001a\u00020\tH\u0002¨\u0006\u0011"}, d2 = {"Lrt;", "", "", PluginDeviceInfo.FDESC, "", "byteArray", PluginDeviceInfo.FMODEL, "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;", "outData", "Ljava/util/Calendar;", "startTime", "Lne;", "device", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/IHMFirstbeatDataCallback;", "dataCallback", "<init>", "(Ljava/util/Calendar;Lne;Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/IHMFirstbeatDataCallback;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class rt {

    @NotNull
    public static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Calendar f32877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ne f32878b;

    @NotNull
    public final IHMFirstbeatDataCallback c;
    public final int d;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lrt$a;", "", "", "MAX_WAIT_TIME", "J", "", "tag", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\r"}, d2 = {"rt$b", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ltg;", "", LifecycleConstantKt.ON_START, "", Constants.KEY_PAY_RESULT_RET, "onFinish", DeviceTagInterface.CUSTOM_TAG_TYPE, PluginDeviceInfo.FMODEL, "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "onProgress", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends HMCallback<HmGdspRawData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f32879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rt f32880b;

        public b(CountDownLatch countDownLatch, rt rtVar) {
            this.f32879a = countDownLatch;
            this.f32880b = rtVar;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(@Nullable HmGdspRawData t) {
            this.f32880b.a(t != null ? t.getRawData() : null);
            this.f32879a.countDown();
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean ret) {
            if (!ret) {
                t5t.d("SportsEffectJob", "sync first beat data finished.");
            }
            this.f32880b.c.onFinish(ret);
            this.f32879a.countDown();
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onProgress(@Nullable Progress progress) {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onStart() {
            this.f32879a.countDown();
        }
    }

    public rt(@NotNull Calendar startTime, @NotNull ne device, @NotNull IHMFirstbeatDataCallback dataCallback) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(dataCallback, "dataCallback");
        this.f32877a = startTime;
        this.f32878b = device;
        this.c = dataCallback;
        this.d = 59;
    }

    public final void b() throws InterruptedException {
        t5t.d("SportsEffectJob", "Start sync sport effect.");
        CountDownLatch countDownLatch = new CountDownLatch(2);
        this.f32878b.M2(a(), this.d, new b(countDownLatch, this));
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
    }

    public final void a(@Nullable byte[] byteArray) {
        Object objM886constructorimpl;
        if (byteArray == null || byteArray.length == 0) {
            t5t.d("SportsEffectJob", "没有同步到SportEffect数据");
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            t5t.d("SportsEffectJob", "同步到训练效果数据" + byteArray.length + " ,开始解析");
            StringBuilder sb = new StringBuilder();
            sb.append("训练效果数据:");
            sb.append(y2.c(byteArray));
            t5t.d("SportsEffectJob", sb.toString());
            SportEfect.SportEffectMessage sportEffect = SportEfect.SportEffectMessage.parseFrom(byteArray);
            Intrinsics.checkNotNullExpressionValue(sportEffect, "sportEffect");
            a(st.a(sportEffect, a().getTimeInMillis() / ((long) 1000)));
            objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("SportsEffectJob", "解析SportEffect数据异常:" + thM889exceptionOrNullimpl);
        }
    }

    public final void a(BleFirstbeatData outData) {
        this.c.onFirstbeatData(outData);
    }

    public final Calendar a() {
        t5t.d("SportsEffectJob", "ready to sync firstbeat data");
        return this.f32877a;
    }
}
