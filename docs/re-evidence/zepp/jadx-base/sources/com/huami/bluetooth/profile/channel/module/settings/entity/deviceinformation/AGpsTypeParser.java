package com.huami.bluetooth.profile.channel.module.settings.entity.deviceinformation;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.Flag;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/deviceinformation/AGpsTypeParser;", "", "", "hasFeatureSonyLLE", "hasFeatureGlonassAlmanac", "hasFeatureEpo", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "a", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "getFlag", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "flag", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AGpsTypeParser {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Flag flag;

    public AGpsTypeParser(@Nullable Flag flag) {
        this.flag = flag;
    }

    @Nullable
    public final Flag getFlag() {
        return this.flag;
    }

    public final boolean hasFeatureEpo() {
        Flag flag = this.flag;
        return (flag == null || (flag.getFlag() & 1024) == 0) ? false : true;
    }

    public final boolean hasFeatureGlonassAlmanac() {
        Flag flag = this.flag;
        return (flag == null || (flag.getFlag() & 8) == 0) ? false : true;
    }

    public final boolean hasFeatureSonyLLE() {
        Flag flag = this.flag;
        return (flag == null || (flag.getFlag() & 496) == 0) ? false : true;
    }
}
