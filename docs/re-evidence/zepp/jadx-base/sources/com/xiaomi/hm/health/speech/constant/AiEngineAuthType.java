package com.xiaomi.hm.health.speech.constant;

import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.watch.musicupload.fragment.MusicConstant;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'XIAOMI_AUTH_ANONYMOUS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes21.dex */
public final class AiEngineAuthType {
    private static final /* synthetic */ AiEngineAuthType[] $VALUES;
    public static final AiEngineAuthType XIAOMI_AUTH_ANONYMOUS;
    public static final AiEngineAuthType XIAOMI_AUTH_APPLICATION;
    public static final AiEngineAuthType XIAOMI_AUTH_DEVICE_OAUTH;
    private AiEnginePlatform platform;
    private String specifiedAuthTypeDesc;

    static {
        AiEnginePlatform aiEnginePlatform = AiEnginePlatform.XIAOMI;
        AiEngineAuthType aiEngineAuthType = new AiEngineAuthType("XIAOMI_AUTH_ANONYMOUS", 0, aiEnginePlatform, MusicConstant.FTP_USER_NAME);
        XIAOMI_AUTH_ANONYMOUS = aiEngineAuthType;
        AiEngineAuthType aiEngineAuthType2 = new AiEngineAuthType("XIAOMI_AUTH_APPLICATION", 1, aiEnginePlatform, MimeTypes.BASE_TYPE_APPLICATION);
        XIAOMI_AUTH_APPLICATION = aiEngineAuthType2;
        AiEngineAuthType aiEngineAuthType3 = new AiEngineAuthType("XIAOMI_AUTH_DEVICE_OAUTH", 2, aiEnginePlatform, "device_oauth");
        XIAOMI_AUTH_DEVICE_OAUTH = aiEngineAuthType3;
        $VALUES = new AiEngineAuthType[]{aiEngineAuthType, aiEngineAuthType2, aiEngineAuthType3};
    }

    private AiEngineAuthType(String $enum$name, int $enum$ordinal, AiEnginePlatform platform, String specifiedAuthTypeDesc) {
        super($enum$name, $enum$ordinal);
        this.platform = platform;
        this.specifiedAuthTypeDesc = specifiedAuthTypeDesc;
    }

    public static AiEngineAuthType valueOf(String name) {
        return (AiEngineAuthType) Enum.valueOf(AiEngineAuthType.class, name);
    }

    public static AiEngineAuthType[] values() {
        return (AiEngineAuthType[]) $VALUES.clone();
    }
}
