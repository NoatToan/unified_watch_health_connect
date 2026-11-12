package com.xiaomi.hm.health.thirdbind;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/ThirdAuthItem;", "Lcom/xiaomi/hm/health/thirdbind/ThirdAppItem;", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "icon", "appId", "appTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ThirdAuthItem extends ThirdAppItem {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String icon;

    public ThirdAuthItem(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.icon = str3;
        setId(str);
        setTitle(str2);
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }
}
