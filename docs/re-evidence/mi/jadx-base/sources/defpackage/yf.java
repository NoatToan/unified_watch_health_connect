package defpackage;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lyf;", "Lxf;", "Lgg;", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "Lsf;", "hearingAidApiV2", "<init>", "(Lsf;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class yf implements xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final sf f40114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public volatile gg f40115b;

    public yf(@NotNull sf hearingAidApiV2) {
        Intrinsics.checkNotNullParameter(hearingAidApiV2, "hearingAidApiV2");
        this.f40114a = hearingAidApiV2;
        this.f40115b = gg.e.c;
    }

    @Override // defpackage.xf
    @NotNull
    public gg a() {
        Response<gg> responseB = this.f40114a.b();
        if (!(responseB instanceof Success)) {
            return gg.e.c;
        }
        this.f40115b = (gg) ((Success) responseB).getData();
        return this.f40115b;
    }

    @Override // defpackage.xf
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public gg getF40115b() {
        return this.f40115b;
    }
}
