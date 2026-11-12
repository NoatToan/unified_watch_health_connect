package com.facebook.appevents.codeless.internal;

import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J&\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u001a\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/facebook/appevents/codeless/internal/UnityReflection;", "", "Ljava/lang/Class;", "a", "", "unityObject", "unityMethod", "message", "", "sendMessage", "captureViewHierarchy", "eventMapping", "sendEventMapping", "Ljava/lang/String;", "TAG", "b", "UNITY_PLAYER_CLASS", "c", "UNITY_SEND_MESSAGE_METHOD", GoogleApiAvailabilityLight.a, "FB_UNITY_GAME_OBJECT", "e", "CAPTURE_VIEW_HIERARCHY_METHOD", "f", "EVENT_MAPPING_METHOD", "g", "Ljava/lang/Class;", "unityPlayer", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class UnityReflection {

    @NotNull
    public static final UnityReflection INSTANCE = new UnityReflection();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = UnityReflection.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String UNITY_PLAYER_CLASS = "com.unity3d.player.UnityPlayer";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String UNITY_SEND_MESSAGE_METHOD = "UnitySendMessage";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String FB_UNITY_GAME_OBJECT = "UnityFacebookSDKPlugin";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String CAPTURE_VIEW_HIERARCHY_METHOD = "CaptureViewHierarchy";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String EVENT_MAPPING_METHOD = "OnReceiveMapping";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static Class<?> unityPlayer;

    private UnityReflection() {
    }

    private final Class<?> a() {
        return Class.forName(UNITY_PLAYER_CLASS);
    }

    @JvmStatic
    public static final void captureViewHierarchy() {
        sendMessage(FB_UNITY_GAME_OBJECT, CAPTURE_VIEW_HIERARCHY_METHOD, "");
    }

    @JvmStatic
    public static final void sendEventMapping(@Nullable String eventMapping) {
        sendMessage(FB_UNITY_GAME_OBJECT, EVENT_MAPPING_METHOD, eventMapping);
    }

    @JvmStatic
    public static final void sendMessage(@Nullable String unityObject, @Nullable String unityMethod, @Nullable String message) {
        try {
            if (unityPlayer == null) {
                unityPlayer = INSTANCE.a();
            }
            unityPlayer.getMethod(UNITY_SEND_MESSAGE_METHOD, String.class, String.class, String.class).invoke(unityPlayer, unityObject, unityMethod, message);
        } catch (Exception e) {
            Log.e(TAG, "Failed to send message to Unity", e);
        }
    }
}
