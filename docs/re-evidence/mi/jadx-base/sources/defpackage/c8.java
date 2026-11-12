package defpackage;

import com.huami.bluetooth.profile.channel.module.DialModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lc8;", "Ls7;", "", "", "dialIds", "", PluginDeviceInfo.FMODEL, "dialId", "", "imageSize", PluginDeviceInfo.FDESC, "Lf8;", "Lcom/huami/bluetooth/profile/channel/module/DialModule;", "dialModule", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/DialModule;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class c8 implements s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DialModule f5032a;

    public c8(@NotNull DialModule dialModule) {
        Intrinsics.checkNotNullParameter(dialModule, "dialModule");
        this.f5032a = dialModule;
    }

    @Override // defpackage.s7
    public boolean a(@NotNull List<Integer> dialIds) {
        Intrinsics.checkNotNullParameter(dialIds, "dialIds");
        return this.f5032a.deleteDialSync(dialIds).a().booleanValue();
    }

    @Override // defpackage.s7
    @NotNull
    public List<Integer> b() {
        return this.f5032a.getDialIdListSync().a();
    }

    @Override // defpackage.s7
    public boolean a(int dialId, long imageSize) {
        return this.f5032a.checkDeviceSpaceSync(dialId, imageSize).a().booleanValue();
    }

    @Override // defpackage.s7
    @Nullable
    public DialVersion a() {
        if (this.f5032a.queryVersionSync().getResultCode() == DialModule.b.FAILED) {
            return null;
        }
        return this.f5032a.queryVersionSync().a();
    }
}
