package com.huami.bluetooth.profile.channel.module.settings.primarydata;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Flag;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "Ljava/io/Serializable;", "Ljava/io/ByteArrayOutputStream;", "bos", "", "write", "", "component1", "flag", "copy", "", "toString", "hashCode", "", "other", "", "equals", "I", "getFlag", "()I", "containDesc", "Z", "getContainDesc", "()Z", "<init>", "(I)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Flag implements IPrimaryData, Serializable {
    private static final long serialVersionUID = 1;
    private final boolean containDesc;
    private final int flag;

    public Flag(int i) {
        this.flag = i;
    }

    public static /* synthetic */ Flag copy$default(Flag flag, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = flag.flag;
        }
        return flag.copy(i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean checkValid() {
        return IPrimaryData.b.a(this);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    @NotNull
    public final Flag copy(int flag) {
        return new Flag(flag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Flag) && this.flag == ((Flag) other).flag;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean getContainDesc() {
        return this.containDesc;
    }

    public final int getFlag() {
        return this.flag;
    }

    public int hashCode() {
        return Integer.hashCode(this.flag);
    }

    @NotNull
    public String toString() {
        return "Flag(flag=" + this.flag + ')';
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public void write(@NotNull ByteArrayOutputStream bos) throws IOException {
        Intrinsics.checkNotNullParameter(bos, "bos");
        bos.write(80);
        bos.write(tet.p(this.flag));
    }
}
