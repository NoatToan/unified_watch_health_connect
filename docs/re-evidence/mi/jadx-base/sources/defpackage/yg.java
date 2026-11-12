package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00028\u0000*\u00020\u0003H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0011"}, d2 = {"Lyg;", "T", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ltg;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", PluginDeviceInfo.FMODEL, "(Ljava/lang/Object;)V", PluginDeviceInfo.FDESC, "(Ltg;)Ljava/lang/Object;", "", "()I", "dataType", "", "onUIThread", "<init>", "(Z)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class yg<T> extends HMCallback<HmGdspRawData> {
    public yg(boolean z) {
        super(z);
    }

    public abstract int a();

    public abstract void a(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onData(@Nullable HmGdspRawData t) {
        super.onData(t);
        if (t != 0) {
            a(b(t));
        }
    }

    public abstract T b(@NotNull HmGdspRawData hmGdspRawData);
}
