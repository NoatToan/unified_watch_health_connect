package q92;

import i3.e5;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import o53.b0;
import okhttp3.Response;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq92/a0;", "Ls92/g;", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getConsentText$4", f = "ConsentRepository.kt", l = {485}, m = "invokeSuspend")
public final class l extends v13.i implements e23.p<b0, t13.d<? super a0<? extends s92.g>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f143685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Locale f143686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f143687e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq92/a0;", "Ls92/g;", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getConsentText$4$1", f = "ConsentRepository.kt", l = {490}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends s92.g>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Locale f143689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f143690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f143691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b0 f143692e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Locale locale, f fVar, String str, b0 b0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f143689b = locale;
            this.f143690c = fVar;
            this.f143691d = str;
            this.f143692e = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143689b, this.f143690c, this.f143691d, this.f143692e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<? extends s92.g>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:140:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:74:0x0113  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            a aVar;
            String str2;
            List<s92.g> list;
            s92.g gVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143688a;
            Locale locale = this.f143689b;
            if (i14 == 0) {
                o13.r.b(obj);
                String strG = e5.g(locale.getLanguage(), "-", locale.getCountry());
                f.f143627e.getClass();
                String language = locale.getLanguage();
                if (language != null) {
                    switch (language.hashCode()) {
                        case 3121:
                            if (language.equals("ar")) {
                                str2 = "ar-AE";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3184:
                            if (language.equals("cs")) {
                                str2 = "cs-CZ";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3197:
                            if (language.equals("da")) {
                                str2 = "da-DK";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3201:
                            if (language.equals("de")) {
                                str2 = "de-DE";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3239:
                            if (language.equals("el")) {
                                str2 = "el-GR";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3241:
                            language.equals("en");
                            str = "en-US";
                            break;
                        case 3246:
                            if (language.equals("es")) {
                                str2 = "es-ES";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3267:
                            if (language.equals("fi")) {
                                str2 = "fi-FI";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3276:
                            if (language.equals("fr")) {
                                str2 = "fr-FR";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3338:
                            if (language.equals("hr")) {
                                str2 = "hr-HR";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3341:
                            if (language.equals("hu")) {
                                str2 = "hu-HU";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3365:
                            if (language.equals("in")) {
                                str2 = "in-ID";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3371:
                            if (language.equals("it")) {
                                str2 = "it-IT";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3374:
                            if (language.equals("iw")) {
                                str2 = "iw-IL";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3383:
                            if (language.equals("ja")) {
                                str2 = "ja-JP";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3428:
                            if (language.equals("ko")) {
                                str2 = "ko-KR";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3494:
                            if (language.equals("ms")) {
                                str2 = "ms-MY";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3508:
                            if (language.equals("nb")) {
                                str2 = "nb-NO";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3518:
                            if (language.equals("nl")) {
                                str2 = "nl-NL";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3521:
                            if (language.equals(BooleanUtils.NO)) {
                                str2 = "nb-NO";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3580:
                            if (language.equals("pl")) {
                                str2 = "pl-PL";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3588:
                            if (language.equals("pt")) {
                                str2 = p005kotlin.jvm.internal.s.g(locale.getCountry(), "BR") ? "pt-BR" : "pt-PT";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3645:
                            if (language.equals("ro")) {
                                str2 = "ro-RO";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3651:
                            if (language.equals("ru")) {
                                str2 = "ru-RU";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3672:
                            if (language.equals("sk")) {
                                str2 = "sk-SK";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3673:
                            if (language.equals("sl")) {
                                str2 = "sl-SI";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3683:
                            if (language.equals("sv")) {
                                str2 = "sv-SE";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3700:
                            if (language.equals("th")) {
                                str2 = "th-TH";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3710:
                            if (language.equals("tr")) {
                                str2 = "tr-TR";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3763:
                            if (language.equals("vi")) {
                                str2 = "vi-VN";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        case 3886:
                            if (language.equals("zh")) {
                                str2 = p005kotlin.jvm.internal.s.g(locale.getCountry(), "CN") ? "zh-CN" : "zh-TW";
                                str = str2;
                            } else {
                                str = "en-US";
                            }
                            break;
                        default:
                            str = "en-US";
                            break;
                    }
                } else {
                    str = "en-US";
                }
                p92.o.f136619a.getClass();
                p92.o.l();
                r92.b bVar = this.f143690c.f143629b;
                this.f143688a = 1;
                aVar = this;
                obj = bVar.a(this.f143691d, strG, str, "garminConnect", aVar);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                aVar = this;
            }
            c83.a0 a0Var = (c83.a0) obj;
            Response response = a0Var.f25745a;
            boolean zIsSuccessful = response.isSuccessful();
            String str3 = aVar.f143691d;
            if (!zIsSuccessful || (list = (List) a0Var.f25746b) == null || list.isEmpty()) {
                int iCode = response.code();
                String strMessage = response.message();
                StringBuilder sbK = androidx.core.view.j.k(iCode, "Error fetching consent text ", str3, " code[", "] ");
                sbK.append(strMessage);
                IOException iOException = new IOException(sbK.toString());
                p92.y.f136664a.getClass();
                p92.y.a.d("ConsentRepository", iOException);
                return new a0.a(iOException);
            }
            p92.y.f136664a.getClass();
            p92.y.a.a("ConsentRepository", "getConsentText(" + str3 + ", " + locale + ") successfully " + list);
            f.f143627e.getClass();
            if (list.size() == 1) {
                gVar = (s92.g) list.get(0);
            } else {
                for (s92.g gVar2 : list) {
                    if (!d53.u.q(gVar2.getLocale(), "en-US", true)) {
                        gVar = gVar2;
                    }
                }
                gVar = (s92.g) list.get(0);
            }
            return new a0.b(gVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, Locale locale, f fVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f143685c = str;
        this.f143686d = locale;
        this.f143687e = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f143685c, this.f143686d, this.f143687e, dVar);
        lVar.f143684b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends s92.g>> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143683a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f143686d, this.f143687e, this.f143685c, (b0) this.f143684b, null);
        String strN = fb1.c.n("Error fetching consent text ", this.f143685c);
        this.f143683a = 1;
        Object objA = u92.b.a(aVar2, strN, this);
        return objA == aVar ? aVar : objA;
    }
}
