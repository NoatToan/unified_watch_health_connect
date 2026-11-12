package com.facebook.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\r\u001a\u00020\f8F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/InternalSettings;", "", "", "getCustomUserAgent", "value", "", "setCustomUserAgent", "a", "Ljava/lang/String;", "UNITY_PREFIX", "b", "customUserAgent", "", "isUnityApp", "()Z", "isUnityApp$annotations", "()V", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class InternalSettings {

    @NotNull
    public static final InternalSettings INSTANCE = new InternalSettings();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String UNITY_PREFIX = "Unity.";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static volatile String customUserAgent;

    private InternalSettings() {
    }

    @JvmStatic
    @Nullable
    public static final String getCustomUserAgent() {
        return customUserAgent;
    }

    public static final boolean isUnityApp() {
        String str = customUserAgent;
        return str != null && m.startsWith$default(str, UNITY_PREFIX, false, 2, null);
    }

    @JvmStatic
    public static /* synthetic */ void isUnityApp$annotations() {
    }

    @JvmStatic
    public static final void setCustomUserAgent(@NotNull String value) {
        customUserAgent = value;
    }
}
