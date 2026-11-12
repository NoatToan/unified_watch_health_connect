package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0000\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lb;", "", "", PluginDeviceInfo.FICONON, PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "flag", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Flag f3627a;

    public b(@Nullable Flag flag) {
        this.f3627a = flag;
    }

    public final boolean a() {
        Flag flag = this.f3627a;
        return (flag == null || (flag.getFlag() & 1024) == 0) ? false : true;
    }

    public final boolean b() {
        Flag flag = this.f3627a;
        return (flag == null || (flag.getFlag() & 8) == 0) ? false : true;
    }

    public final boolean c() {
        Flag flag = this.f3627a;
        return (flag == null || (flag.getFlag() & 496) == 0) ? false : true;
    }
}
