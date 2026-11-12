package com.huami.ai.speech.simplify.engine;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.huami.account.XiaomiTokenMananger;
import com.huami.ai.speech.alexa.AlexaEngine;
import com.huami.ai.speech.alexa.GeoLocation;
import com.huami.ai.speech.alexa.entity.payload.Coordinate;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.api.engine.Engine;
import com.huami.ai.speech.api.engine.VoiceCodeType;
import com.huami.ai.speech.simplify.inject.AccessCheck;
import com.huami.ai.speech.simplify.inject.AppType;
import com.huami.ai.speech.simplify.inject.SwitchConfig;
import com.huami.ai.speech.xiaoai.ClientParams;
import com.huami.ai.speech.xiaoai.DeviceInfo;
import com.huami.ai.speech.xiaoai.Location;
import com.huami.ai.speech.xiaoai.XiaoAiEngine;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.identity.auth.alexa.AuthApi;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/ai/speech/simplify/engine/SpeechEngineFactoryImpl;", "Lcom/huami/ai/speech/simplify/engine/SpeechEngineFactory;", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "Lcom/huami/ai/speech/api/engine/Engine;", "c", "", "deviceName", "e", "", "b", "Lcom/huami/ai/speech/xiaoai/Location;", GoogleApiAvailabilityLight.a, "a", "", Constants.JSON_FEATURE, "speechEngine", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "Lcom/huami/ai/speech/alexa/GeoLocation;", "Lcom/huami/ai/speech/alexa/GeoLocation;", "geoLocation", "", "Z", "productEnv", "Lcom/huami/ai/speech/simplify/inject/AccessCheck;", "Lcom/huami/ai/speech/simplify/inject/AccessCheck;", "accessCheck", "<init>", "(Landroid/content/Context;Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;Lcom/huami/ai/speech/alexa/GeoLocation;ZLcom/huami/ai/speech/simplify/inject/AccessCheck;)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechEngineFactoryImpl implements SpeechEngineFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final VoiceConfig voiceConfig;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final GeoLocation geoLocation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean productEnv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AccessCheck accessCheck;

    public SpeechEngineFactoryImpl(@NotNull Context context, @NotNull VoiceConfig voiceConfig, @NotNull GeoLocation geoLocation, boolean z, @NotNull AccessCheck accessCheck) {
        this.context = context;
        this.voiceConfig = voiceConfig;
        this.geoLocation = geoLocation;
        this.productEnv = z;
        this.accessCheck = accessCheck;
    }

    private final VoiceConfig a(VoiceConfig voiceConfig) {
        Object objM3845constructorimpl;
        if (voiceConfig.getConfiguration() == null) {
            return voiceConfig;
        }
        if ((voiceConfig.getConfiguration().length() == 0) || m.isBlank(voiceConfig.getConfiguration())) {
            voiceConfig.setConfiguration(null);
            return voiceConfig;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new JsonParser().parse(voiceConfig.getConfiguration()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null && (thM3848exceptionOrNullimpl instanceof JsonSyntaxException)) {
            voiceConfig.setConfiguration(null);
        }
        return voiceConfig;
    }

    private final void b() {
        if (!this.accessCheck.isMiAiRegionAccess()) {
            throw new EngineRegionNotSupport();
        }
        if (!XiaomiTokenMananger.hasXiaomiAiToken()) {
            throw new EngineNotOAuth();
        }
    }

    private final Engine c(VoiceConfig voiceConfig) {
        if (((AuthApi) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AuthApi.class), null, null)).isLogin()) {
            return new AlexaEngine(VoiceCodeType.PCM_16K, voiceConfig);
        }
        throw new EngineNotOAuth();
    }

    private final Location d() {
        Coordinate coordinate = this.geoLocation.getCoordinate();
        if (coordinate != null && coordinate.getLatitudeInDegrees() > 0.0f && coordinate.getLongitudeInDegrees() > 0.0f) {
            return new Location(coordinate.getLongitudeInDegrees(), coordinate.getLatitudeInDegrees());
        }
        return null;
    }

    private final Engine e(VoiceConfig voiceConfig, String deviceName) {
        b();
        SwitchConfig switchConfig = (SwitchConfig) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SwitchConfig.class), null, null);
        AppType appType = switchConfig.getAppType();
        AppType appType2 = AppType.MIFIT;
        return new XiaoAiEngine(this.context, new ClientParams(XiaoAiConfigConstantsKt.getCurrentClientId(), XiaoAiConfigConstantsKt.getCurrentClientSecret(), XiaoAiConfigConstantsKt.XIAOMI_XIAOAI_DEVICE_OAUTH_CALL_BACK_URL, XiaoAiConfigConstantsKt.getCurrentCapabilityVersion(), d(), new DeviceInfo(XiaoAiConfigConstantsKt.getCurrentDeviceId(), appType == appType2 ? null : XiaoAiConfigConstantsKt.getCurrentMiotDid(), VoiceCodeType.PCM_16K, voiceConfig, switchConfig.getAppType() == appType2 ? null : deviceName, switchConfig.getAppType() == appType2 ? XiaoAiConfigConstantsKt.getCurrentDeviceProductID() : null, switchConfig.getAppType() == appType2 ? XiaoAiConfigConstantsKt.getCurrentDeviceVendorId() : null), 1), this.productEnv);
    }

    @Override // com.huami.ai.speech.simplify.engine.SpeechEngineFactory
    @NotNull
    public Engine speechEngine(int feature, @Nullable String deviceName) throws Exception {
        if (feature == 16) {
            return c(a(this.voiceConfig));
        }
        if (feature == 17) {
            return e(a(this.voiceConfig), deviceName);
        }
        throw new Exception("Unsupported engine type");
    }

    public /* synthetic */ SpeechEngineFactoryImpl(Context context, VoiceConfig voiceConfig, GeoLocation geoLocation, boolean z, AccessCheck accessCheck, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, voiceConfig, geoLocation, (i & 8) != 0 ? true : z, accessCheck);
    }
}
