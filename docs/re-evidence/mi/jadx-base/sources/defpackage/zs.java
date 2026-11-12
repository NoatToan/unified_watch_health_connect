package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.hm.health.bt.sdk.ISpO2Callback;
import com.xiaomi.hm.health.bt.sdk.spo2.SpO2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lzs;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "", "result", "", "onFinish", "spo2DataList", PluginDeviceInfo.FMODEL, "Lcom/xiaomi/hm/health/bt/sdk/ISpO2Callback;", "callback", "<init>", "(Lcom/xiaomi/hm/health/bt/sdk/ISpO2Callback;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class zs extends HMCallback<List<? extends Spo2Data>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41615b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ISpO2Callback f41616a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lzs$a;", "", "", "K_1000", "J", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public zs(@NotNull ISpO2Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f41616a = callback;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onFinish(@Nullable List<? extends Spo2Data> spo2DataList) {
        if (spo2DataList == null) {
            this.f41616a.onResult(null);
            return;
        }
        if (spo2DataList.isEmpty()) {
            this.f41616a.onResult(new ArrayList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Spo2Data spo2Data : spo2DataList) {
            if (spo2Data instanceof it) {
                long timeStamp = spo2Data.getTimeStamp() * 1000;
                it itVar = (it) spo2Data;
                int f20418a = itVar.getF20418a();
                byte[] e = itVar.getE();
                ArrayList arrayList2 = new ArrayList(e.length);
                for (byte b2 : e) {
                    arrayList2.add(Integer.valueOf(b2));
                }
                arrayList.add(new SpO2(timeStamp, f20418a, arrayList2));
            } else if (spo2Data instanceof ht) {
                arrayList.add(new SpO2(spo2Data.getTimeStamp() * 1000, ((ht) spo2Data).getF20418a(), null));
            }
        }
        this.f41616a.onResult(arrayList);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(boolean result) {
        super.onFinish(result);
        this.f41616a.onResult(null);
    }
}
