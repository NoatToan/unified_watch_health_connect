package com.xiaomi.fitness.health.curse.data;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.c0j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"CURSE_CHANNEL_ID", "", "getCURSE_CHANNEL_ID", "()Ljava/lang/String;", "CURSE_IN_NOTIFY_ID", "", "CURSE_OVUM_NOTIFY_ID", "CURSE_PREGNANCY_NOTIFY_ID", "TAG", "ACTION_IN", "ACTION_OVUM", "ACTION_EASY_PREGNANCY", "ACTION_OPEN", "DAYS_LEFT", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CurseNotifyKt {

    @NotNull
    private static final String ACTION_EASY_PREGNANCY = "action_pregnancy";

    @NotNull
    private static final String ACTION_IN = "action_in";

    @NotNull
    private static final String ACTION_OPEN = "action_open";

    @NotNull
    private static final String ACTION_OVUM = "action_ovum";

    @NotNull
    private static final String CURSE_CHANNEL_ID = ResourceExtKt.getString(c0j.h7);
    private static final int CURSE_IN_NOTIFY_ID = 20023;
    private static final int CURSE_OVUM_NOTIFY_ID = 20024;
    private static final int CURSE_PREGNANCY_NOTIFY_ID = 20025;

    @NotNull
    private static final String DAYS_LEFT = "day_left";

    @NotNull
    private static final String TAG = "CurseNotify";

    @NotNull
    public static final String getCURSE_CHANNEL_ID() {
        return CURSE_CHANNEL_ID;
    }
}
