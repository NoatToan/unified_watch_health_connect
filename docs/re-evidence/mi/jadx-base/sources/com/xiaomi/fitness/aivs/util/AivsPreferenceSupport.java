package com.xiaomi.fitness.aivs.util;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cJ\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010#\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0016\u0010%\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010'\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005J\u0016\u0010(\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005J\u000e\u0010*\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\u0011¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/aivs/util/AivsPreferenceSupport;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "AIVS_KEY_ACCESS_TOKEN", "AIVS_KEY_TTSENABLED", "AIVS_TONE_ID", AivsPreferenceSupport.AIVS_DEVICE_ID, AivsPreferenceSupport.AIVS_DEVICE_AUTHORIZATION, "<set-?>", "AIVS_ENV_ENTRY", "getAIVS_ENV_ENTRY", "setAIVS_ENV_ENTRY", "(Ljava/lang/String;)V", "AIVS_ENV_ENTRY$delegate", "Lkotlin/properties/ReadWriteProperty;", "getAivsAccessToken", "did", "clientId", "setAivsAccessToken", "", "token", "setTtsEnableSp", "enabled", "", "getTtsEnableSp", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "setToneId", "toneId", "getToneId", "getTtskey", "getAivsKey", "getToneIdKey", "setDeviceId", "deviceId", "getDeviceId", "setAuthorization", "authorization", "getAuthorization", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAivsPreferenceSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AivsPreferenceSupport.kt\ncom/xiaomi/fitness/aivs/util/AivsPreferenceSupport\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,75:1\n135#2,6:76\n*S KotlinDebug\n*F\n+ 1 AivsPreferenceSupport.kt\ncom/xiaomi/fitness/aivs/util/AivsPreferenceSupport\n*L\n16#1:76,6\n*E\n"})
public final class AivsPreferenceSupport extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AivsPreferenceSupport.class, "AIVS_ENV_ENTRY", "getAIVS_ENV_ENTRY()Ljava/lang/String;", 0))};

    @NotNull
    private static final String AIVS_DEVICE_AUTHORIZATION = "AIVS_DEVICE_AUTHORIZATION";

    @NotNull
    private static final String AIVS_DEVICE_ID = "AIVS_DEVICE_ID";

    /* JADX INFO: renamed from: AIVS_ENV_ENTRY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AIVS_ENV_ENTRY;

    @NotNull
    private static String AIVS_KEY_ACCESS_TOKEN;

    @NotNull
    private static String AIVS_KEY_TTSENABLED;

    @NotNull
    private static String AIVS_TONE_ID;

    @NotNull
    public static final AivsPreferenceSupport INSTANCE;

    static {
        AivsPreferenceSupport aivsPreferenceSupport = new AivsPreferenceSupport();
        INSTANCE = aivsPreferenceSupport;
        AIVS_KEY_ACCESS_TOKEN = "AIVS_KEY_ACCESS_TOKEN";
        AIVS_KEY_TTSENABLED = "aivs_key_tts_enabled";
        AIVS_TONE_ID = "aivs_tone_id";
        AIVS_ENV_ENTRY = aivsPreferenceSupport.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.aivs.util.AivsPreferenceSupport$special$$inlined$bindToPreferenceField$default$1
        }.getType(), "", null, true);
    }

    private AivsPreferenceSupport() {
    }

    private final String getAivsKey(String did, String clientId) {
        return AIVS_KEY_ACCESS_TOKEN + clientId + did;
    }

    private final String getToneIdKey(String did) {
        return AIVS_TONE_ID + did;
    }

    private final String getTtskey(String did, String clientId) {
        return AIVS_KEY_TTSENABLED + clientId + did;
    }

    @NotNull
    public final String getAIVS_ENV_ENTRY() {
        return (String) AIVS_ENV_ENTRY.getValue(this, $$delegatedProperties[0]);
    }

    @Nullable
    public final String getAivsAccessToken(@NotNull String did, @NotNull String clientId) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        return (String) getValue(getAivsKey(did, clientId), "");
    }

    @NotNull
    public final String getAuthorization(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return (String) getValue(did + AIVS_DEVICE_AUTHORIZATION, "");
    }

    @NotNull
    public final String getDeviceId(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return (String) getValue(did + AIVS_DEVICE_ID, "");
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "aivs_user_data";
    }

    @NotNull
    public final String getToneId(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return (String) getValue(getToneIdKey(did), "");
    }

    @Nullable
    public final Boolean getTtsEnableSp(@NotNull String did, @NotNull String clientId) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        return (Boolean) getValue(getTtskey(did, clientId), Boolean.FALSE);
    }

    public final void setAIVS_ENV_ENTRY(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        AIVS_ENV_ENTRY.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setAivsAccessToken(@NotNull String did, @NotNull String clientId, @Nullable String token) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        if (token == null) {
            remove(getAivsKey(did, clientId));
        } else {
            putValue(getAivsKey(did, clientId), token);
        }
    }

    public final void setAuthorization(@NotNull String did, @NotNull String authorization) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        putValue(did + AIVS_DEVICE_AUTHORIZATION, authorization);
    }

    public final void setDeviceId(@NotNull String did, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        putValue(did + AIVS_DEVICE_ID, deviceId);
    }

    public final void setToneId(@NotNull String did, @NotNull String toneId) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(toneId, "toneId");
        putValue(getToneIdKey(did), toneId);
    }

    public final void setTtsEnableSp(@NotNull String did, @NotNull String clientId, boolean enabled) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        putValue(getTtskey(did, clientId), Boolean.valueOf(enabled));
    }
}
