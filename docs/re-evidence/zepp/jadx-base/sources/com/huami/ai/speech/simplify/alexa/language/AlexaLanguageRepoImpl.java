package com.huami.ai.speech.simplify.alexa.language;

import com.huami.ai.helper.LoginCountry;
import com.huami.ai.speech.alexa.uitls.AlexaLanguage;
import com.huami.ai.speech.alexa.uitls.AlexaSupportUtilsKt;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.bluetooth.profile.channel.module.voice.LanguageSetting;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0006\u0010\n\u001a\u00020\u0003R\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageRepoImpl;", "Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageRepo;", "", "", "deviceSupportLanguages", "currentAlexaLanguage", "", "cleanCache", "setLanguage", "updateLanguageCache", "getDefaultLanguage", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lkotlin/jvm/functions/Function0;", "device", "", "b", "deviceLanguage", "Lcom/huami/bluetooth/profile/channel/module/voice/LanguageSetting;", "c", "Lcom/huami/bluetooth/profile/channel/module/voice/LanguageSetting;", "settings", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Companion", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaLanguageRepoImpl implements AlexaLanguageRepo {

    @NotNull
    public static final String BASE_DEFAULT_LANGUAGE = "en-US";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<HMBaseDevice> device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Integer> deviceLanguage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private LanguageSetting settings;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            ArrayList<String> list;
            LanguageSetting languageSetting = AlexaLanguageRepoImpl.this.settings;
            String strJoinToString$default = null;
            if (languageSetting != null && (list = languageSetting.getList()) != null) {
                strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null);
            }
            return Intrinsics.stringPlus("设备Alexa多语言列表：", strJoinToString$default);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("设备读取的默认Alexa语言：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("get saved alexa language:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, String str) {
            super(0);
            this.a = i;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save local index:" + this.a + ",语言Code:" + this.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlexaLanguageRepoImpl(@NotNull Function0<? extends HMBaseDevice> function0, @NotNull Function0<Integer> function1) {
        this.device = function0;
        this.deviceLanguage = function1;
    }

    @Override // com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepo
    public void cleanCache() {
        this.settings = null;
    }

    @Override // com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepo
    @NotNull
    public String currentAlexaLanguage() {
        if (this.settings == null) {
            HMBaseDevice hMBaseDeviceInvoke = this.device.invoke();
            if (hMBaseDeviceInvoke != null && hMBaseDeviceInvoke.isConnected()) {
                this.settings = AlexaLanguageUtilsKt.getAlexaLanguageSettings();
                HMLog.info("speech", new a());
                LanguageSetting languageSetting = this.settings;
                String str = languageSetting == null ? null : languageSetting.getCom.huami.account.UserLegalInfoManager.KEY_LANGUAGE java.lang.String();
                HMLog.info("speech", new b(str));
                if (!(str == null || str.length() == 0)) {
                    updateLanguageCache(str);
                }
            }
        }
        LanguageSetting languageSetting2 = this.settings;
        if (languageSetting2 == null) {
            return BASE_DEFAULT_LANGUAGE;
        }
        if (languageSetting2 != null) {
            if (languageSetting2.getCom.huami.account.UserLegalInfoManager.KEY_LANGUAGE java.lang.String().length() > 0) {
                return languageSetting2.getCom.huami.account.UserLegalInfoManager.KEY_LANGUAGE java.lang.String();
            }
        }
        String currentSavedAlexaLanguage = AlexaLanguageUtilsKt.getCurrentSavedAlexaLanguage();
        if (currentSavedAlexaLanguage == null) {
            return getDefaultLanguage();
        }
        HMLog.info("speech", new c(currentSavedAlexaLanguage));
        return currentSavedAlexaLanguage;
    }

    @Override // com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepo
    @Nullable
    public List<String> deviceSupportLanguages() {
        LanguageSetting languageSetting = this.settings;
        if (languageSetting != null) {
            return languageSetting.getList();
        }
        LanguageSetting alexaLanguageSettings = AlexaLanguageUtilsKt.getAlexaLanguageSettings();
        this.settings = alexaLanguageSettings;
        if (alexaLanguageSettings == null) {
            return null;
        }
        return alexaLanguageSettings.getList();
    }

    @NotNull
    public final String getDefaultLanguage() {
        ArrayList<String> list;
        String alexaDefaultLanguage = AlexaLanguageUtilsKt.getAlexaDefaultLanguage(((LoginCountry) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(LoginCountry.class), null, null)).countryCode(), this.deviceLanguage.invoke().intValue());
        LanguageSetting languageSetting = this.settings;
        return (languageSetting == null || (list = languageSetting.getList()) == null || !list.contains(alexaDefaultLanguage)) ? false : true ? alexaDefaultLanguage : BASE_DEFAULT_LANGUAGE;
    }

    @Override // com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepo
    public void updateLanguageCache(@NotNull String setLanguage) {
        AlexaLanguage alexaLanguage;
        LanguageSetting languageSetting = this.settings;
        this.settings = new LanguageSetting(setLanguage, languageSetting == null ? null : languageSetting.getList());
        AlexaLanguage[] allAlexaLanguage = AlexaSupportUtilsKt.getAllAlexaLanguage();
        int length = allAlexaLanguage.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                alexaLanguage = null;
                break;
            }
            alexaLanguage = allAlexaLanguage[i];
            if (Intrinsics.areEqual(alexaLanguage.getLanguageCode(), setLanguage)) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = alexaLanguage != null ? Integer.valueOf(alexaLanguage.getIndex()) : null;
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        HMLog.info("speech", new d(iIntValue, setLanguage));
        AlexaLanguageUtilsKt.saveLanguageToLocal(iIntValue);
    }
}
