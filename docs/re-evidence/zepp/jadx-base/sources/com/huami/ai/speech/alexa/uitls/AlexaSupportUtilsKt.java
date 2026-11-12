package com.huami.ai.speech.alexa.uitls;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.areas.SelectAreaManager;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageRepoImpl;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.smalltool.model.ToolKey;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.text.m;
import org.cybergarage.http.HTTP;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\"(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0000@\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\b\"\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017\"\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017\"\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017\"\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017\"\u0016\u0010\"\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0017\"\u0016\u0010$\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0017\"\u0016\u0010&\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0017\"\u0016\u0010(\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0017\"\u0016\u0010*\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0017\"\u0016\u0010,\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0017\"\u0016\u0010.\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0017\"\u0016\u00100\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0017\"\u0016\u00102\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0017\"\u001f\u00108\u001a\b\u0012\u0004\u0012\u0002030\u00048\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"", "countryCode", "", "isCountrySupportAlexa", "", "a", "[Ljava/lang/String;", "getASIA_COUNTRY", "()[Ljava/lang/String;", "ASIA_COUNTRY", "b", "getEU_COUNTRY", "EU_COUNTRY", "c", "getNA_COUNTRY", "NA_COUNTRY", GoogleApiAvailabilityLight.a, "getSUPPORT_LANGUAGE", "getSUPPORT_LANGUAGE$annotations", "()V", "SUPPORT_LANGUAGE", "", "e", LogUtil.I, "LANGUAGE_DE_INDEX", "f", "LANGUAGE_EN_AU_INDEX", "g", "LANGUAGE_EN_CA_INDEX", "h", "LANGUAGE_EN_GB_INDEX", "i", "LANGUAGE_EN_IN_INDEX", z.j, "LANGUAGE_EN_US_INDEX", hl.k, "LANGUAGE_EN_ES_INDEX", "l", "LANGUAGE_ES_MX_INDEX", "m", "LANGUAGE_ES_US_INDEX", GoogleApiAvailabilityLight.b, "LANGUAGE_FR_CA_INDEX", "o", "LANGUAGE_FR_INDEX", b.r, "LANGUAGE_IT_INDEX", DTransferConstants.SEARCH_KEY, "LANGUAGE_JA_JP_INDEX", "r", "LANGUAGE_PT_BR_INDEX", "Lcom/huami/ai/speech/alexa/uitls/AlexaLanguage;", SOAP.XMLNS, "[Lcom/huami/ai/speech/alexa/uitls/AlexaLanguage;", "getAllAlexaLanguage", "()[Lcom/huami/ai/speech/alexa/uitls/AlexaLanguage;", "allAlexaLanguage", "speech-alexa_release"}, k = 2, mv = {1, 5, 1})
public final class AlexaSupportUtilsKt {
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final int i = 5;
    private static final int j = 6;
    private static final int k = 7;
    private static final int l = 8;
    private static final int m = 9;
    private static final int n = 10;
    private static final int o = 11;
    private static final int p = 12;
    private static final int q = 13;
    private static final int r = 14;

    @NotNull
    private static final String[] a = {"JP", "AU", ToolKey.ALARM};

    @NotNull
    private static final String[] b = {SelectAreaManager.GB, "AT", "FR", "DE", "IN", "IT", "ES", "IE"};

    @NotNull
    private static final String[] c = {"US", "CA", HTTP.MX, Country.BR};

    @NotNull
    private static final String[] d = {"de-DE", "en-AU", "en-CA", "en-GB", "en-IN", AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE, "es-ES", "es-MX", "es-US", "fr-CA", "fr-FR", "it-IT", "ja-JP", "pt-BR"};

    @NotNull
    private static final AlexaLanguage[] s = {new AlexaLanguage(1, "de-DE", "Deutsch"), new AlexaLanguage(2, "en-AU", "English (Australia)"), new AlexaLanguage(3, "en-CA", "English (Canada)"), new AlexaLanguage(4, "en-GB", "English (UK)"), new AlexaLanguage(5, "en-IN", "English (India)"), new AlexaLanguage(6, AlexaLanguageRepoImpl.BASE_DEFAULT_LANGUAGE, "English (United States)"), new AlexaLanguage(7, "es-ES", "Español (España)"), new AlexaLanguage(8, "es-MX", "Español (México)"), new AlexaLanguage(9, "es-US", "Español (Estados Unidos)"), new AlexaLanguage(10, "fr-CA", "Français (Canada)"), new AlexaLanguage(11, "fr-FR", "Français (France)"), new AlexaLanguage(12, "it-IT", "Italiano"), new AlexaLanguage(13, "ja-JP", "日本語"), new AlexaLanguage(14, "pt-BR", "Português (Brasil)")};

    @NotNull
    public static final String[] getASIA_COUNTRY() {
        return a;
    }

    @NotNull
    public static final AlexaLanguage[] getAllAlexaLanguage() {
        return s;
    }

    @NotNull
    public static final String[] getEU_COUNTRY() {
        return b;
    }

    @NotNull
    public static final String[] getNA_COUNTRY() {
        return c;
    }

    @NotNull
    public static final String[] getSUPPORT_LANGUAGE() {
        return d;
    }

    public static /* synthetic */ void getSUPPORT_LANGUAGE$annotations() {
    }

    public static final boolean isCountrySupportAlexa(@NotNull String str) {
        if ((str.length() == 0) || m.isBlank(str)) {
            return false;
        }
        String upperCase = str.toUpperCase(Locale.US);
        return ArraysKt___ArraysKt.contains(a, upperCase) || ArraysKt___ArraysKt.contains(b, upperCase) || ArraysKt___ArraysKt.contains(c, upperCase);
    }
}
