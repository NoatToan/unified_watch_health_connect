package com.xiaomi.hm.health.device.setting.appsort;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0016\u001a\u00020\u00118\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppItem;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "b", LogUtil.I, "getValue", "()I", "value", "c", "getParent", "parent", "", GoogleApiAvailabilityLight.a, "Z", "getCanDisable", "()Z", "canDisable", "<init>", "(Ljava/lang/String;IIZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class AppItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int parent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean canDisable;

    public AppItem(@NotNull String str, int i, int i2, boolean z) {
        this.name = str;
        this.value = i;
        this.parent = i2;
        this.canDisable = z;
    }

    public boolean getCanDisable() {
        return this.canDisable;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    public int getParent() {
        return this.parent;
    }

    public int getValue() {
        return this.value;
    }

    public /* synthetic */ AppItem(String str, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? true : z);
    }
}
