package zn2;

import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn2/k;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f205614a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f205615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o13.p<Locale, String> f205616c;

    static {
        int i14 = gt2.c.f79010a;
        f205615b = gt2.b.f79005a.h("PAY#NEW_FITPAY#FP#WVLanguageValidator");
    }

    private k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o13.p a() {
        String language;
        o13.p<Locale, String> pVar;
        o13.p<Locale, String> pVar2 = f205616c;
        if (pVar2 != null && p005kotlin.jvm.internal.s.g(pVar2.f128594a, b())) {
            return f205616c;
        }
        Logger logger = f205615b;
        logger.debug("languageToFpWV: Locale language is null or changed, re validating translation file...");
        logger.debug("validate");
        if (hb2.h.d(b()).equals(hb2.h.d(Locale.TAIWAN))) {
            language = com.garmin.android.lib.legal.d.TW.f50046a;
        } else if (p005kotlin.jvm.internal.s.g(b().getLanguage(), "pt")) {
            language = p005kotlin.jvm.internal.s.g(b().getCountry(), "BR") ? "pt-BR" : "pt-PT";
        } else {
            language = b().getLanguage();
            language.getClass();
        }
        try {
            ln2.e eVar = ln2.e.f113687a;
            kj0.b.f104940a.getClass();
            String strB = yr2.g.b(kj0.b.a());
            eVar.getClass();
            c83.a0 a0Var = (c83.a0) ((mn2.n) ln2.e.e(ln2.e.d(eVar, null, 7), strB, null).b(mn2.n.class)).a(language).j(l13.a.f108327b).c();
            if (a0Var == null || !a0Var.f25745a.isSuccessful()) {
                logger.error("validate: language " + language + " translation file is not available defaulting back to English...");
                pVar = new o13.p<>(b(), Locale.ENGLISH.getLanguage());
            } else {
                logger.debug("validate: language " + language + " translation file is available...");
                pVar = new o13.p<>(b(), language);
            }
            f205616c = pVar;
            o13.p pVarA = a();
            pVarA.getClass();
            return pVarA;
        } catch (Exception unused) {
            logger.debug("validate: failed to get language");
            f205616c = new o13.p<>(b(), Locale.ENGLISH.getLanguage());
            o13.p pVarA2 = a();
            pVarA2.getClass();
            return pVarA2;
        }
    }

    public static Locale b() {
        Locale localeA = hb2.h.a(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c());
        localeA.getClass();
        return localeA;
    }
}
