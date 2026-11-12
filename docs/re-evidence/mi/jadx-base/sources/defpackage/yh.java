package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lyh;", "Ljys;", "Lyd;", "type", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", PluginDeviceInfo.FMODEL, "(Lyd;Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;)V", "", "errorCode", "onError", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface yh extends jys {
    @Override // defpackage.jys
    /* synthetic */ void a(int i);

    void a(@NotNull yd type, @NotNull Progress progress);

    void onError(int errorCode);

    @Override // defpackage.jys
    /* synthetic */ void onFwProgress(Progress progress);

    @Override // defpackage.jys
    /* synthetic */ void onFwStop(boolean z);
}
