package com.huami.ai.helper;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/ai/helper/DebugMode;", "", "", "a", "Z", "getDebug", "()Z", "setDebug", "(Z)V", "debug", "<init>", "()V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class DebugMode {

    @NotNull
    public static final DebugMode INSTANCE = new DebugMode();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean debug;

    private DebugMode() {
    }

    public final boolean getDebug() {
        return debug;
    }

    public final void setDebug(boolean z) {
        debug = z;
    }
}
