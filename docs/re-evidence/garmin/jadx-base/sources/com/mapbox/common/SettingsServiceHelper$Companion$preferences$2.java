package com.mapbox.common;

import android.content.SharedPreferences;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class SettingsServiceHelper$Companion$preferences$2 extends w implements e23.a<SharedPreferences> {
    public static final SettingsServiceHelper$Companion$preferences$2 INSTANCE = new SettingsServiceHelper$Companion$preferences$2();

    public SettingsServiceHelper$Companion$preferences$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final SharedPreferences invoke() {
        return MapboxSDKCommon.INSTANCE.getContext().getSharedPreferences("mapbox_settings", 0);
    }
}
