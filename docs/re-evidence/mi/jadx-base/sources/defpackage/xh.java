package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lxh;", "Lyh;", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface xh extends yh {
    @Override // defpackage.yh, defpackage.jys
    /* synthetic */ void a(int i);

    boolean a();

    @Override // defpackage.yh, defpackage.jys
    /* synthetic */ void onFwProgress(Progress progress);

    @Override // defpackage.yh, defpackage.jys
    /* synthetic */ void onFwStop(boolean z);
}
