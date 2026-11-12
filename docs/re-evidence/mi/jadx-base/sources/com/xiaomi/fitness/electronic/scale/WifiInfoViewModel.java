package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.AbsViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/WifiInfoViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "wifiName", "", "getWifiName", "()Ljava/lang/String;", "setWifiName", "(Ljava/lang/String;)V", "wifiStrength", "getWifiStrength", "setWifiStrength", "wifiIp", "getWifiIp", "setWifiIp", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WifiInfoViewModel extends AbsViewModel {

    @NotNull
    private String wifiName = "MiOffice-5G";

    @NotNull
    private String wifiStrength = "100%";

    @NotNull
    private String wifiIp = "192.168.12.23";

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final String getWifiIp() {
        return this.wifiIp;
    }

    @NotNull
    public final String getWifiName() {
        return this.wifiName;
    }

    @NotNull
    public final String getWifiStrength() {
        return this.wifiStrength;
    }

    public final void setWifiIp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiIp = str;
    }

    public final void setWifiName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiName = str;
    }

    public final void setWifiStrength(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wifiStrength = str;
    }
}
