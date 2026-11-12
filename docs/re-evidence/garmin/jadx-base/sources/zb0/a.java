package zb0;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 zb0.a[], still in use, count: 1, list:
  (r0v1 zb0.a[]) from 0x0307: CONSTRUCTOR (r0v1 zb0.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lzb0/a;", "", "", "dialectId", "displayName", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "language", "country", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsEnglishAmerican(0, R.string.device_dialect_english_american, "EN_US", "EN", LocaleUnitResolver.ImperialCountryCode.US),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsEnglishBritish(1, R.string.device_dialect_english_british, "EN_GB", "EN", "GB"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsEnglishAustralian(2, R.string.device_dialect_english_australian, "EN_AU", "EN", "AU"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsFrenchStandard(3, R.string.device_dialect_french_standard, "FR_FR", "FR", "FR"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsFrenchCanadian(4, R.string.device_dialect_french_canadian, "FR_CA", "FR", "CA"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsSpanishCastilian(5, R.string.device_dialect_spanish_castilian, "ES_ES", "ES", "ES"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsSpanishMexican(6, R.string.device_dialect_spanish_mexican, "ES_MX", "ES", "MX"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsGerman(7, R.string.device_language_german, "DE_DE", "DE", "DE"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsItalian(8, R.string.device_language_italian, "IT_IT", "IT", "IT"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsDutch(9, R.string.device_language_dutch, "NL_NL", "NL", "NL"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsDanish(10, R.string.device_language_danish, "DA_DK", "DA", "DK"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsSwedish(11, R.string.device_language_swedish, "SV_SE", "SV", "SE"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsFinnish(12, R.string.device_language_finnish, "FI_FI", "FI", "FI"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsNorwegian(13, R.string.device_language_norwegian, "NO_NO", "NB", "NO"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsRussian(14, R.string.device_language_russian, "RU_RU", "RU", "RU"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsCroatian(15, R.string.device_language_portuguese_bzl, "PT_BR", "PT", "BR"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsCroatian(16, R.string.device_language_croatian, "HR_HR", "HR", "HR"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsCzech(17, R.string.device_language_czech, "CS_CZ", "CS", "CZ"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsGreek(18, R.string.device_language_greek, "EL_GR", "EL", "GR"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsHungarian(19, R.string.device_language_hungarian, "HU_HU", "HU", "HU"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsPolish(20, R.string.device_language_polish, "PL_PL", "PL", "PL"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsSlovak(21, R.string.device_language_slovak, "SK_SK", "SK", "SK"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsArabic(22, R.string.device_language_arabic, "AR_AE", "AR", "AE"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsHebrew(23, R.string.device_language_hebrew, "HE_IL", "HE", "IL"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsTurkish(24, R.string.device_language_turkish, "TR_TR", "TR", "TR"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsChinese(25, R.string.device_dialect_chinese, "ZH_CN", "ZH", "CN"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsTaiwanese(26, R.string.device_dialect_taiwanese, "ZH_TW", "ZH", "TW"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsJapanese(27, R.string.device_language_japanese, "JA_JP", "JA", "JP"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsKorean(28, R.string.device_language_korean, "KO_KR", "KO", "KR"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsThai(29, R.string.device_language_thai, "TH_TH", "TH", "TH"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsIndonesian(30, R.string.device_language_indonesian, "ID_ID", "ID", "ID"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsVietnamese(31, R.string.device_language_malaysian, "MS_MY", "MS", "MY"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsVietnamese(32, R.string.device_language_vietnamese, "VI_VI", "VI", "VI"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsRomanian(33, R.string.device_language_romanian, "RO_RO", "RO", "RO"),
    /* JADX INFO: Fake field, exist only in values array */
    AudioPromptsCantonese(34, R.string.device_dialect_cantonese, "ZH_CT", "ZH", "HK"),
    AudioPromptsInvalid(100, R.string.lbl_none, "", "", "");


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3799a f203414e = new C3799a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f203417h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f203418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f203420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f203421d;

    static {
        f203417h = new w13.c(new a[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r32, r33, r34, r35});
    }

    private a(int i14, int i15, String str, String str2, String str3) {
        super(str, i);
        this.f203418a = i15;
        this.f203419b = str;
        this.f203420c = str2;
        this.f203421d = str3;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f203416g.clone();
    }

    /* JADX INFO: renamed from: zb0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzb0/a$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3799a {
        public /* synthetic */ C3799a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(String str) {
            if (!TextUtils.isEmpty(str)) {
                w13.c cVar = a.f203417h;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    a aVar = (a) bVarN.next();
                    if (d53.u.q(aVar.f203419b, str, true)) {
                        return aVar;
                    }
                }
            }
            return a.AudioPromptsInvalid;
        }

        private C3799a() {
        }
    }
}
