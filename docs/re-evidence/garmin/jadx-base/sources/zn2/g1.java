package zn2;

import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.GarminPayInitializer;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import i3.e5;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.lang3.BooleanUtils;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lzn2/g1;", "", "Lco2/a;", "transitCardCache", "Lzn2/g;", "fitpayCardCache", "Lzn2/f;", "deviceRegistrationRepo", "<init>", "(Lco2/a;Lzn2/g;Lzn2/f;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f205525n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co2.a f205526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f205527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f205528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sn2.a f205529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fo2.u f205530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Set<fo2.s> f205531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fo2.v f205532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinkedHashMap f205533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f205534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f205535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ep2.c f205536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u53.d f205537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z53.b f205538m;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f205539a;

        static {
            int[] iArr = new int[ep2.a.values().length];
            try {
                iArr[ep2.a.ECOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f205539a = iArr;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f205525n = gt2.b.f79005a.i("PAY#NEW_FITPAY#NewUserDataManager");
    }

    public g1(co2.a aVar, g gVar, f fVar) {
        aVar.getClass();
        gVar.getClass();
        fVar.getClass();
        this.f205526a = aVar;
        this.f205527b = gVar;
        this.f205528c = fVar;
        this.f205531f = new LinkedHashSet();
        this.f205533h = new LinkedHashMap();
        x53.c cVar = o53.s0.f129406a;
        this.f205537l = o53.c0.h(o53.c0.a(x53.b.f189152a), ge1.b.h());
        this.f205538m = z53.c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yo2.b T(c83.a0 a0Var) throws NewFitPayException {
        String string;
        String string2;
        Response response = a0Var.f25745a;
        T t7 = a0Var.f25746b;
        int iCode = response.code();
        Logger logger = f205525n;
        if (iCode == 201) {
            logger.debug("handleCardResponse: creditCard created successfully");
            JsonElement jsonElement = (JsonElement) t7;
            if (jsonElement == null) {
                throw new NewFitPayException("invalid creditcard response", z.INVALID_CREATE_CREDIT_CARD_RESPONSE, null, 4, null);
            }
            try {
                aq2.j.f12491a.getClass();
                Object objFromJson = aq2.j.d().fromJson(jsonElement, (Class<Object>) yo2.b.class);
                ((yo2.b) objFromJson).i0();
                objFromJson.getClass();
                return (yo2.b) objFromJson;
            } catch (Exception unused) {
                throw new NewFitPayException("Failed to parse card response to card object", z.UNABLE_TO_PARSE_CREDIT_CARD, null, 4, null);
            }
        }
        if (iCode == 202) {
            logger.warn("handleCardResponse: card is being created but not ready, notifying caller");
            throw new NewFitPayException("card is being created but not ready, notifying caller", z.CREDIT_CARD_NOT_READY, response.headers().get(FirebaseAnalytics.Param.LOCATION));
        }
        if (iCode == 400) {
            logger.error("handleCardResponse: user entered bad data");
            aq2.e eVar = aq2.e.f12470a;
            ResponseBody responseBody = a0Var.f25747c;
            String strString = responseBody != null ? responseBody.string() : null;
            eVar.getClass();
            throw new NewFitPayException("user entered bad data", z.CREATE_CREDIT_CARD_USER_ENTERED_BAD_DATA, aq2.e.a(strString));
        }
        if (iCode == 403) {
            logger.error("handleCardResponse: card issuer is not supported/eligible");
            throw new NewFitPayException("card is issuer not supported/eligible", z.CREDIT_CARD_ISSUER_NOT_ELIGIBLE, null, 4, null);
        }
        if (iCode == 409) {
            logger.error("handleCardResponse: duplicate card error, the card is already exists in the cloud");
            throw new NewFitPayException("card is being created but not ready, notifying caller", z.DUPLICATE_CARD, response.headers().get(FirebaseAnalytics.Param.LOCATION));
        }
        if (iCode == 412) {
            logger.error("handleCardResponse: max card limit reached");
            throw new NewFitPayException("card is being created but not ready, notifying caller", z.MAX_CARD_LIMIT_REACHED, null, 4, null);
        }
        if (400 > iCode || iCode >= 500) {
            logger.error("handleCardResponse: failed to create creditCard. code " + response.code());
            JsonElement jsonElement2 = (JsonElement) t7;
            throw new NewFitPayException((jsonElement2 == null || (string = jsonElement2.toString()) == null) ? "" : string, z.UNABLE_TO_CREATE_CREDIT_CARD, null, 4, null);
        }
        logger.error("handleCardResponse: client error occurred, code " + response.code());
        JsonElement jsonElement3 = (JsonElement) t7;
        throw new NewFitPayException((jsonElement3 == null || (string2 = jsonElement3.toString()) == null) ? "" : string2, z.CREATE_CREDIT_CARD_USER_ENTERED_BAD_DATA, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ep2.d U(c83.a0 a0Var) throws NewFitPayException {
        String string;
        Response response = a0Var.f25745a;
        T t7 = a0Var.f25746b;
        int iCode = response.code();
        Logger logger = f205525n;
        if (iCode == 201) {
            logger.debug("handleCredentialResponse: creditCard created successfully");
            JsonElement jsonElement = (JsonElement) t7;
            if (jsonElement == null) {
                throw new NewFitPayException("invalid creditcard response", z.INVALID_CREATE_CREDIT_CARD_RESPONSE, null, 4, null);
            }
            try {
                aq2.j.f12491a.getClass();
                Object objFromJson = aq2.j.d().fromJson(jsonElement, (Class<Object>) ep2.d.class);
                objFromJson.getClass();
                return (ep2.d) objFromJson;
            } catch (Exception unused) {
                throw new NewFitPayException("Failed to parse card response to card object", z.UNABLE_TO_PARSE_CREDIT_CARD, null, 4, null);
            }
        }
        if (iCode == 202) {
            logger.warn("handleCredentialResponse: card is being created but not ready, notifying caller");
            throw new NewFitPayException("card is being created but not ready, notifying caller", z.CREDIT_CARD_NOT_READY, response.headers().get(FirebaseAnalytics.Param.LOCATION));
        }
        if (iCode == 403) {
            logger.error("handleCredentialResponse: card issuer is not supported/eligible");
            throw new NewFitPayException("card is issuer not supported/eligible", z.CREDIT_CARD_ISSUER_NOT_ELIGIBLE, null, 4, null);
        }
        if (400 > iCode || iCode >= 500) {
            logger.error("handleCredentialResponse: failed to create creditCard. code " + response.code());
            aq2.e eVar = aq2.e.f12470a;
            ResponseBody responseBody = a0Var.f25747c;
            String strString = responseBody != null ? responseBody.string() : null;
            eVar.getClass();
            throw new NewFitPayException("user entered bad data", z.UNABLE_TO_CREATE_CREDIT_CARD, aq2.e.a(strString));
        }
        logger.error("handleCredentialResponse: client error occurred, code " + response.code());
        JsonElement jsonElement2 = (JsonElement) t7;
        if (jsonElement2 == null || (string = jsonElement2.toString()) == null) {
            string = "";
        }
        throw new NewFitPayException(string, z.CREATE_CREDIT_CARD_USER_ENTERED_BAD_DATA, null, 4, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void V(String str) throws NewFitPayException {
        String string = new JSONObject(str).get("message").toString();
        switch (string.hashCode()) {
            case -1743198940:
                if (string.equals("INCORRECT_CODE_RETRIES_EXCEEDED")) {
                    throw new NewFitPayException("card verification failed INCORRECT_CODE_RETRIES_EXCEEDED", z.CARD_VERIFICATION_INCORRECT_CODE_RETRIES_EXCEEDED, null, 4, null);
                }
                break;
            case -1344203972:
                if (string.equals("EXPIRED_SESSION")) {
                    throw new NewFitPayException("card verification failed EXPIRED_SESSION", z.CARD_VERIFICATION_EXPIRED_SESSION, null, 4, null);
                }
                break;
            case -1314470068:
                if (string.equals("ERROR_CALLBACK_URL")) {
                    throw new NewFitPayException("card verification failed ERROR_CALLBACK_URL", z.CARD_VERIFICATION_FAILED, null, 4, null);
                }
                break;
            case -1149187101:
                if (string.equals("SUCCESS")) {
                    return;
                }
                break;
            case -511162649:
                if (string.equals("EXPIRED_CODE")) {
                    throw new NewFitPayException("card verification failed EXPIRED_CODE", z.CARD_VERIFICATION_EXPIRED_CODE, null, 4, null);
                }
                break;
            case 859615183:
                if (string.equals("INCORRECT_TAV")) {
                    throw new NewFitPayException("card verification failed INCORRECT_TAV", z.CARD_VERIFICATION_INCORRECT_TAV, null, 4, null);
                }
                break;
            case 877773415:
                if (string.equals("INCORRECT_CODE")) {
                    throw new NewFitPayException("card verification failed INCORRECT_CODE", z.CARD_VERIFICATION_INCORRECT_CODE, null, 4, null);
                }
                break;
        }
        throw new NewFitPayException("failed to verify credit card authCode", z.CARD_VERIFICATION_FAILED, null, 4, null);
    }

    public static final fo2.s c(g1 g1Var, String str) throws NewFitPayException {
        Object next;
        Iterator<T> it = g1Var.f205531f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((fo2.s) next).f73101a, str));
        fo2.s sVar = (fo2.s) next;
        if (sVar != null) {
            return sVar;
        }
        throw new NewFitPayException(am.j.m("Can not find device ", str, "."), null, null, 6, null);
    }

    public static void c0() {
        kj0.c.f104941a.getClass();
        if (p005kotlin.jvm.internal.s.g(kj0.c.f104947g.get(), kj0.a.b.f104932a)) {
            wr2.j.f186862a.getClass();
            ht.a.f85464a.getClass();
            ht.a.a(null, "Gp_ecom_deeplink_tokenization_attempt");
        }
    }

    public static void d0(c83.a0 a0Var) throws NewFitPayException {
        Response response = a0Var.f25745a;
        int iCode = response.code();
        if (iCode == 403) {
            throw new NewFitPayException(am.j.h(response.code(), "credit card is not eligible, response code: "), z.CREDIT_CARD_NOT_ELIGIBLE, null, 4, null);
        }
        if (iCode == 503) {
            throw new NewFitPayException(am.j.h(response.code(), "credit card issuer is slow, try again later, response code: "), z.CREDIT_CARD_ISSUER_PROVISIONING_CARD, null, 4, null);
        }
        switch (iCode) {
            case 200:
            case 201:
            case 202:
                return;
            default:
                throw new NewFitPayException(am.j.h(response.code(), "failed to accept issuer terms, response code: "), null, null, 6, null);
        }
    }

    public static /* synthetic */ Object g0(g1 g1Var, qw0.y yVar, v13.c cVar, int i14) {
        boolean z14 = (i14 & 2) != 0;
        if ((i14 & 4) != 0) {
            yVar = null;
        }
        return g1Var.f0(z14, yVar, cVar);
    }

    public final Object A(String str, fo2.s sVar, boolean z14, v13.c cVar) throws NewFitPayException {
        fo2.m0 links;
        fo2.p creditCards;
        fo2.u uVar = this.f205530e;
        String link = (uVar == null || (links = uVar.getLinks()) == null || (creditCards = links.getCreditCards()) == null) ? null : creditCards.getLink();
        if (link == null || link.length() == 0) {
            throw new NewFitPayException("getCreditCard: can not retrieve cards, creditCard link must not be null", z.UNABLE_TO_LOAD_CREDIT_CARD, null, 4, null);
        }
        return z(new fo2.p(e5.g(link, "/", str), false), sVar, z14, cVar);
    }

    public final Object B(String str, v13.c cVar) throws NewFitPayException {
        fo2.m0 links;
        fo2.p creditCards;
        fo2.u uVar = this.f205530e;
        String link = (uVar == null || (links = uVar.getLinks()) == null || (creditCards = links.getCreditCards()) == null) ? null : creditCards.getLink();
        if (link == null || link.length() == 0) {
            throw new NewFitPayException("getCreditCard: can not retrieve cards, creditCard link must not be null", z.UNABLE_TO_LOAD_CREDIT_CARD, null, 4, null);
        }
        return z(new fo2.p(e5.g(link, "/", str), false), null, false, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object C(v13.c cVar) throws NewFitPayException {
        m2 m2Var;
        fo2.m0 links;
        fo2.p creditCards;
        String link;
        List<yo2.b> list;
        if (cVar instanceof m2) {
            m2Var = (m2) cVar;
            int i14 = m2Var.f205670c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m2Var.f205670c = i14 - Integer.MIN_VALUE;
            } else {
                m2Var = new m2(this, cVar);
            }
        } else {
            m2Var = new m2(this, cVar);
        }
        Object objO = m2Var.f205668a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m2Var.f205670c;
        if (i15 == 0) {
            o13.r.b(objO);
            f205525n.debug("getCreditCards");
            fo2.u uVar = this.f205530e;
            if (uVar != null && (links = uVar.getLinks()) != null && (creditCards = links.getCreditCards()) != null && (link = creditCards.getLink()) != null) {
                u0 u0Var = u0.f205864a;
                m2Var.f205670c = 1;
                u0Var.getClass();
                objO = u0.g().o(link, 0, 100, m2Var);
                if (objO == aVar) {
                    return aVar;
                }
            }
            return p13.j0.f134944a;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objO);
        c83.a0 a0Var = (c83.a0) objO;
        if (a0Var != null) {
            Response response = a0Var.f25745a;
            if (!response.isSuccessful()) {
                throw new NewFitPayException(sn.a.e(response.code(), "getCreditCards: failed to retrieve creditcards code: ", " message: ", response.message()), null, null, 6, null);
            }
            yo2.f fVar = (yo2.f) a0Var.f25746b;
            if (fVar == null || (list = fVar.f198598c) == null) {
                throw new NewFitPayException("getCreditCards: something went wrong while deserialize card response", z.UNABLE_TO_LOAD_CREDIT_CARD, null, 4, null);
            }
            for (yo2.b bVar : list) {
                String strU = bVar.getDeviceId();
                if (strU == null || strU.length() == 0) {
                    throw new NewFitPayException(fb1.c.n("getCreditCards: target device id is null for ", bVar.getIssuerName()), z.UNABLE_TO_LOAD_CREDIT_CARD, null, 4, null);
                }
            }
            return list;
        }
        return p13.j0.f134944a;
    }

    public final fo2.s E(long j8) {
        Object next;
        Iterator<T> it = this.f205531f.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((fo2.s) next).f73103c == j8) {
                return (fo2.s) next;
            }
        }
        next = null;
        return (fo2.s) next;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F(String str, v13.c cVar) throws NewFitPayException {
        n2 n2Var;
        if (cVar instanceof n2) {
            n2Var = (n2) cVar;
            int i14 = n2Var.f205698c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n2Var.f205698c = i14 - Integer.MIN_VALUE;
            } else {
                n2Var = new n2(this, cVar);
            }
        } else {
            n2Var = new n2(this, cVar);
        }
        Object objD0 = n2Var.f205696a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n2Var.f205698c;
        if (i15 == 0) {
            o13.r.b(objD0);
            u0 u0Var = u0.f205864a;
            n2Var.f205698c = 1;
            u0Var.getClass();
            objD0 = u0.g().d0(str, n2Var);
            if (objD0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD0);
        }
        c83.a0 a0Var = (c83.a0) objD0;
        Response response = a0Var.f25745a;
        if (response.isSuccessful()) {
            return a0Var.f25746b;
        }
        String strE = sn.a.e(response.code(), "getDeviceSEUpdateOperationData: failed to get device se update data: code: ", " message: ", response.message());
        f205525n.error(strE);
        throw new NewFitPayException(strE, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(long j8, v13.c cVar, boolean z14) {
        o2 o2Var;
        if (cVar instanceof o2) {
            o2Var = (o2) cVar;
            int i14 = o2Var.f205717d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o2Var.f205717d = i14 - Integer.MIN_VALUE;
            } else {
                o2Var = new o2(this, cVar);
            }
        } else {
            o2Var = new o2(this, cVar);
        }
        Object obj = o2Var.f205715b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = o2Var.f205717d;
        Object obj3 = null;
        if (i15 == 0) {
            o13.r.b(obj);
            if (!z14) {
                for (Object obj4 : this.f205531f) {
                    if (((fo2.s) obj4).f73103c == j8) {
                        obj3 = obj4;
                        break;
                    }
                }
                return (fo2.s) obj3;
            }
            o2Var.f205714a = j8;
            o2Var.f205717d = 1;
            if (t(true, o2Var) == obj2) {
                return obj2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = o2Var.f205714a;
            o13.r.b(obj);
        }
        for (Object obj5 : this.f205531f) {
            if (((fo2.s) obj5).f73103c == j8) {
                obj3 = obj5;
                break;
            }
        }
        return (fo2.s) obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H(boolean z14, v13.c cVar) throws NewFitPayException {
        p2 p2Var;
        fo2.m0 links;
        fo2.p devices;
        String link;
        if (cVar instanceof p2) {
            p2Var = (p2) cVar;
            int i14 = p2Var.f205730c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p2Var.f205730c = i14 - Integer.MIN_VALUE;
            } else {
                p2Var = new p2(this, cVar);
            }
        } else {
            p2Var = new p2(this, cVar);
        }
        Object objE = p2Var.f205728a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p2Var.f205730c;
        if (i15 == 0) {
            o13.r.b(objE);
            fo2.v vVar = this.f205532g;
            if (vVar != null && !z14) {
                return vVar;
            }
            fo2.u uVar = this.f205530e;
            if (uVar == null || (links = uVar.getLinks()) == null || (devices = links.getDevices()) == null || (link = devices.getLink()) == null) {
                throw new NewFitPayException("missing device links, can not get devices...", z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
            }
            u0 u0Var = u0.f205864a;
            p2Var.f205730c = 1;
            objE = u0Var.e(100, link, p2Var);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        fo2.v vVar2 = (fo2.v) objE;
        this.f205532g = vVar2;
        return vVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:12:0x002e, B:26:0x0074, B:21:0x004f, B:23:0x0055, B:39:0x00a7, B:41:0x00b1, B:50:0x00e0, B:44:0x00bc, B:45:0x00c7, B:48:0x00da, B:52:0x00e3, B:53:0x00e8, B:28:0x007c, B:30:0x0082, B:32:0x0088, B:34:0x0092, B:36:0x0098, B:38:0x009e, B:20:0x0043), top: B:55:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:12:0x002e, B:26:0x0074, B:21:0x004f, B:23:0x0055, B:39:0x00a7, B:41:0x00b1, B:50:0x00e0, B:44:0x00bc, B:45:0x00c7, B:48:0x00da, B:52:0x00e3, B:53:0x00e8, B:28:0x007c, B:30:0x0082, B:32:0x0088, B:34:0x0092, B:36:0x0098, B:38:0x009e, B:20:0x0043), top: B:55:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0098 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:12:0x002e, B:26:0x0074, B:21:0x004f, B:23:0x0055, B:39:0x00a7, B:41:0x00b1, B:50:0x00e0, B:44:0x00bc, B:45:0x00c7, B:48:0x00da, B:52:0x00e3, B:53:0x00e8, B:28:0x007c, B:30:0x0082, B:32:0x0088, B:34:0x0092, B:36:0x0098, B:38:0x009e, B:20:0x0043), top: B:55:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009e A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:12:0x002e, B:26:0x0074, B:21:0x004f, B:23:0x0055, B:39:0x00a7, B:41:0x00b1, B:50:0x00e0, B:44:0x00bc, B:45:0x00c7, B:48:0x00da, B:52:0x00e3, B:53:0x00e8, B:28:0x007c, B:30:0x0082, B:32:0x0088, B:34:0x0092, B:36:0x0098, B:38:0x009e, B:20:0x0043), top: B:55:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0071 -> B:26:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable I(java.util.List r10, java.util.List r11, v13.c r12) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn2.g1.I(java.util.List, java.util.List, v13.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object J(String str, ep2.a aVar, v13.c cVar) throws NewFitPayException {
        r2 r2Var;
        fo2.m0 links;
        fo2.p creditCards;
        String link;
        fo2.m0 links2;
        fo2.p credentials;
        fo2.p selfLink;
        fo2.p selfLink2;
        if (cVar instanceof r2) {
            r2Var = (r2) cVar;
            int i14 = r2Var.f205796d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r2Var.f205796d = i14 - Integer.MIN_VALUE;
            } else {
                r2Var = new r2(this, cVar);
            }
        } else {
            r2Var = new r2(this, cVar);
        }
        Object objZ = r2Var.f205794b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = r2Var.f205796d;
        String link2 = null;
        if (i15 == 0) {
            o13.r.b(objZ);
            if (aVar == null || !aVar.equals(ep2.a.ECOM)) {
                fo2.u uVar = this.f205530e;
                if (uVar == null || (links = uVar.getLinks()) == null || (creditCards = links.getCreditCards()) == null) {
                    link = null;
                } else {
                    link = creditCards.getLink();
                }
            } else {
                fo2.u uVar2 = this.f205530e;
                if (uVar2 == null || (links2 = uVar2.getLinks()) == null || (credentials = links2.getCredentials()) == null) {
                    link = null;
                } else {
                    link = credentials.getLink();
                }
            }
            if (link == null) {
                throw new NewFitPayException("missing credentials link", null, null, 6, null);
            }
            u0 u0Var = u0.f205864a;
            String strName = aVar != null ? aVar.name() : null;
            r2Var.f205793a = aVar;
            r2Var.f205796d = 1;
            u0Var.getClass();
            objZ = u0.f205867d.getValue().z(link, str, strName, r2Var);
            if (objZ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = r2Var.f205793a;
            o13.r.b(objZ);
        }
        c83.a0 a0Var = (c83.a0) objZ;
        Response response = a0Var.f25745a;
        if (!response.isSuccessful()) {
            throw new NewFitPayException(sn.a.e(response.code(), "received failed response to get field properties, code: ", " data: ", response.message()), null, null, 6, null);
        }
        ep2.f fVar = (ep2.f) a0Var.f25746b;
        if (fVar == null) {
            throw new NewFitPayException(sn.a.e(response.code(), "received failed response to get field properties, code: ", " data: ", response.message()), null, null, 6, null);
        }
        f205525n.debug("getFieldPropertiesForVerification: requiredFields.fitPayTemplatesDTO: {}", fVar.getFitPayTemplatesDTO());
        if ((aVar == null ? -1 : b.f205539a[aVar.ordinal()]) == 1) {
            fo2.m0 links3 = fVar.getLinks();
            if (links3 != null && (selfLink2 = links3.getSelfLink()) != null) {
                link2 = selfLink2.getLink();
            }
            this.f205534i = link2;
            return fVar;
        }
        fo2.m0 links4 = fVar.getLinks();
        if (links4 != null && (selfLink = links4.getSelfLink()) != null) {
            link2 = selfLink.getLink();
        }
        this.f205535j = link2;
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K(String str, v13.c cVar) throws NewFitPayException {
        s2 s2Var;
        if (cVar instanceof s2) {
            s2Var = (s2) cVar;
            int i14 = s2Var.f205812c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s2Var.f205812c = i14 - Integer.MIN_VALUE;
            } else {
                s2Var = new s2(this, cVar);
            }
        } else {
            s2Var = new s2(this, cVar);
        }
        Object objU = s2Var.f205810a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s2Var.f205812c;
        if (i15 == 0) {
            o13.r.b(objU);
            u0 u0Var = u0.f205864a;
            s2Var.f205812c = 1;
            u0Var.getClass();
            objU = u0.g().U(str, s2Var);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objU);
        }
        c83.a0 a0Var = (c83.a0) objU;
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        if (response.isSuccessful()) {
            String str2 = (String) obj;
            if (str2 != null) {
                return str2;
            }
            throw new NewFitPayException("getMaxNumberOfCardsInWallet: received null response from the server", null, null, 6, null);
        }
        throw new NewFitPayException("getMaxNumberOfCardsInWallet: received failed response from the platform code: " + a0Var.f25745a.code() + ", body: " + obj, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object L(String str, v13.c cVar) throws NewFitPayException {
        t2 t2Var;
        fo2.m0 links;
        fo2.p paymentCards;
        String link;
        if (cVar instanceof t2) {
            t2Var = (t2) cVar;
            int i14 = t2Var.f205846c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t2Var.f205846c = i14 - Integer.MIN_VALUE;
            } else {
                t2Var = new t2(this, cVar);
            }
        } else {
            t2Var = new t2(this, cVar);
        }
        Object objQ = t2Var.f205844a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t2Var.f205846c;
        if (i15 == 0) {
            o13.r.b(objQ);
            f205525n.debug("getPaymentCards");
            fo2.u uVar = this.f205530e;
            if (uVar != null && (links = uVar.getLinks()) != null && (paymentCards = links.getPaymentCards()) != null && (link = paymentCards.getLink()) != null) {
                u0 u0Var = u0.f205864a;
                t2Var.f205846c = 1;
                u0Var.getClass();
                objQ = p005kotlin.jvm.internal.s.g(str, "0") ? u0.g().Q(link, t2Var) : u0.g().k(link, str, t2Var);
                if (objQ == aVar) {
                    return aVar;
                }
            }
            return p13.j0.f134944a;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objQ);
        c83.a0 a0Var = (c83.a0) objQ;
        if (a0Var != null) {
            Response response = a0Var.f25745a;
            if (!response.isSuccessful()) {
                throw new NewFitPayException(sn.a.e(response.code(), "getPaymentCards: failed to retrieve payment cards code: ", " message: ", response.message()), null, null, 6, null);
            }
            fo2.b bVar = (fo2.b) a0Var.f25746b;
            if (bVar == null) {
                throw new NewFitPayException("getPaymentCards: something went wrong while deserialize card response", z.UNABLE_TO_LOAD_CREDIT_CARD, null, 4, null);
            }
            Collection collection = bVar.f72920e;
            int iA = p13.t0.a(p13.y.r(collection, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : collection) {
                linkedHashMap.put(((zo2.a) obj).getPaymentCardId(), obj);
            }
            this.f205533h = linkedHashMap;
            return collection;
        }
        return p13.j0.f134944a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object M(String str, v13.c cVar) throws NewFitPayException {
        u2 u2Var;
        String id3;
        if (cVar instanceof u2) {
            u2Var = (u2) cVar;
            int i14 = u2Var.f205878c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u2Var.f205878c = i14 - Integer.MIN_VALUE;
            } else {
                u2Var = new u2(this, cVar);
            }
        } else {
            u2Var = new u2(this, cVar);
        }
        Object objP = u2Var.f205876a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u2Var.f205878c;
        if (i15 == 0) {
            o13.r.b(objP);
            f205525n.debug("getSecurityDomain");
            u0 u0Var = u0.f205864a;
            fo2.u uVar = this.f205530e;
            if (uVar == null || (id3 = uVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) {
                throw new NewFitPayException("getSecurityDomain: null user", null, null, 6, null);
            }
            u2Var.f205878c = 1;
            u0Var.getClass();
            objP = u0.g().p(id3, str, u2Var);
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objP);
        }
        c83.a0 a0Var = (c83.a0) objP;
        Response response = a0Var.f25745a;
        if (response.isSuccessful()) {
            fo2.e0 e0Var = (fo2.e0) a0Var.f25746b;
            if (e0Var != null) {
                return e0Var;
            }
            throw new NewFitPayException("getSecurityDomain: null body", null, null, 6, null);
        }
        if (response.code() == 404) {
            return null;
        }
        throw new NewFitPayException("getSecurityDomain: failed to get security domain responseCode: " + response.code() + " , responseBody: " + a0Var.f25747c, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object N(String str, v13.c cVar) throws NewFitPayException {
        v2 v2Var;
        if (cVar instanceof v2) {
            v2Var = (v2) cVar;
            int i14 = v2Var.f205901c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v2Var.f205901c = i14 - Integer.MIN_VALUE;
            } else {
                v2Var = new v2(this, cVar);
            }
        } else {
            v2Var = new v2(this, cVar);
        }
        Object objB = v2Var.f205899a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v2Var.f205901c;
        if (i15 == 0) {
            o13.r.b(objB);
            f205525n.debug("getSecurityDomainByUrl");
            u0 u0Var = u0.f205864a;
            v2Var.f205901c = 1;
            u0Var.getClass();
            objB = u0.g().B(str, v2Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        c83.a0 a0Var = (c83.a0) objB;
        Response response = a0Var.f25745a;
        if (response.isSuccessful()) {
            fo2.e0 e0Var = (fo2.e0) a0Var.f25746b;
            if (e0Var != null) {
                return e0Var;
            }
            throw new NewFitPayException("getSecurityDomain: null body", null, null, 6, null);
        }
        if (response.code() == 404) {
            return null;
        }
        throw new NewFitPayException("getSecurityDomain: failed to get security domain responseCode: " + response.code() + " , responseBody: " + a0Var.f25747c, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r9 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(long j8, v13.c cVar) throws NewFitPayException {
        w2 w2Var;
        if (cVar instanceof w2) {
            w2Var = (w2) cVar;
            int i14 = w2Var.f205921d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w2Var.f205921d = i14 - Integer.MIN_VALUE;
            } else {
                w2Var = new w2(this, cVar);
            }
        } else {
            w2Var = new w2(this, cVar);
        }
        Object objG = w2Var.f205919b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = w2Var.f205921d;
        if (i15 == 0) {
            o13.r.b(objG);
            w2Var.f205918a = j8;
            w2Var.f205921d = 1;
            objG = G(j8, w2Var, false);
            if (objG != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            j8 = w2Var.f205918a;
            o13.r.b(objG);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        return (fo2.s) objG;
        fo2.s sVar = (fo2.s) objG;
        if (sVar == null) {
            return null;
        }
        u0 u0Var = u0.f205864a;
        String link = sVar.f73112l.getLink();
        if (link == null) {
            throw new NewFitPayException("missing self link, can not get device...", z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
        }
        w2Var.f205918a = j8;
        w2Var.f205921d = 2;
        objG = u0Var.d(link, w2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(String str, v13.c cVar) throws NewFitPayException {
        x2 x2Var;
        String strString;
        if (cVar instanceof x2) {
            x2Var = (x2) cVar;
            int i14 = x2Var.f205935c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x2Var.f205935c = i14 - Integer.MIN_VALUE;
            } else {
                x2Var = new x2(this, cVar);
            }
        } else {
            x2Var = new x2(this, cVar);
        }
        Object objF = x2Var.f205933a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = x2Var.f205935c;
        if (i15 == 0) {
            o13.r.b(objF);
            u0 u0Var = u0.f205864a;
            x2Var.f205935c = 1;
            u0Var.getClass();
            objF = u0.f205870g.getValue().F(str, x2Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        c83.a0 a0Var = (c83.a0) objF;
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        if (response.isSuccessful()) {
            ResponseBody responseBody = (ResponseBody) obj;
            if (responseBody == null || (strString = responseBody.string()) == null) {
                throw new NewFitPayException("getTermsCondition: received null response from the server", null, null, 6, null);
            }
            return strString;
        }
        throw new NewFitPayException("getTermsCondition: received failed response from the platform code: " + a0Var.f25745a.code() + ", body: " + obj, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(boolean z14, v13.c cVar) throws NewFitPayException {
        y2 y2Var;
        String externalAccountId;
        fo2.u uVar;
        if (cVar instanceof y2) {
            y2Var = (y2) cVar;
            int i14 = y2Var.f205949c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y2Var.f205949c = i14 - Integer.MIN_VALUE;
            } else {
                y2Var = new y2(this, cVar);
            }
        } else {
            y2Var = new y2(this, cVar);
        }
        Object objM = y2Var.f205947a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = y2Var.f205949c;
        if (i15 == 0) {
            o13.r.b(objM);
            if (!z14 && (uVar = this.f205530e) != null) {
                return uVar;
            }
            sn2.b bVar = s().f160417a;
            if (bVar == null || (externalAccountId = bVar.getExternalAccountId()) == null) {
                throw new NewFitPayException("externalAccountId is null can not get user", z.MISSING_EXTERNAL_ACCOUNT_ID, null, 4, null);
            }
            u0 u0Var = u0.f205864a;
            y2Var.f205949c = 1;
            objM = u0Var.m(externalAccountId, y2Var);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objM);
        }
        this.f205530e = (fo2.u) objM;
        return objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(dq2.f fVar, v13.c cVar) throws NewFitPayException {
        z2 z2Var;
        if (cVar instanceof z2) {
            z2Var = (z2) cVar;
            int i14 = z2Var.f206010c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z2Var.f206010c = i14 - Integer.MIN_VALUE;
            } else {
                z2Var = new z2(this, cVar);
            }
        } else {
            z2Var = new z2(this, cVar);
        }
        Object objH = z2Var.f206008a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = z2Var.f206010c;
        if (i15 == 0) {
            o13.r.b(objH);
            String str = fVar.f60814i;
            if (str == null) {
                throw new NewFitPayException("getVerificationMethod: user id is missing, can not get verification methods", null, null, 6, null);
            }
            u0 u0Var = u0.f205864a;
            z2Var.f206010c = 1;
            u0Var.getClass();
            objH = u0.g().h(str, z2Var);
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objH);
        }
        c83.a0 a0Var = (c83.a0) objH;
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        if (response.isSuccessful()) {
            dq2.f fVar2 = (dq2.f) obj;
            if (fVar2 != null) {
                return fVar2;
            }
            throw new NewFitPayException("getVerificationMethod: received null response from the server", null, null, 6, null);
        }
        throw new NewFitPayException("getVerificationMethod: received failed response from the platform code: " + a0Var.f25745a.code() + ", body: " + obj, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S(yo2.b bVar, v13.c cVar) throws NewFitPayException {
        a3 a3Var;
        if (cVar instanceof a3) {
            a3Var = (a3) cVar;
            int i14 = a3Var.f205421c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a3Var.f205421c = i14 - Integer.MIN_VALUE;
            } else {
                a3Var = new a3(this, cVar);
            }
        } else {
            a3Var = new a3(this, cVar);
        }
        Object objX = a3Var.f205419a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a3Var.f205421c;
        if (i15 == 0) {
            o13.r.b(objX);
            String link = bVar.getVerificationMethods().getLink();
            if (link == null) {
                throw new NewFitPayException("getVerificationMethods: verificationMethods link is missing, can not get verification methods", null, null, 6, null);
            }
            u0 u0Var = u0.f205864a;
            a3Var.f205421c = 1;
            u0Var.getClass();
            objX = u0.g().X(link, a3Var);
            if (objX == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objX);
        }
        c83.a0 a0Var = (c83.a0) objX;
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        if (response.isSuccessful()) {
            dq2.g gVar = (dq2.g) obj;
            if (gVar != null) {
                return gVar;
            }
            throw new NewFitPayException("getVerificationMethods: received null response from the server", null, null, 6, null);
        }
        throw new NewFitPayException("getVerificationMethods: received failed response from the platform code: " + a0Var.f25745a.code() + ", body: " + obj, null, null, 6, null);
    }

    public final boolean W() {
        return (s() instanceof sn2.a.C3030a) && p005kotlin.jvm.internal.s.g(s().f160418b, Boolean.TRUE);
    }

    public final boolean X(long j8) {
        Iterator<T> it = this.f205531f.iterator();
        while (it.hasNext()) {
            if (((fo2.s) it.next()).f73103c == j8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object Y(long j8, String str, v13.c cVar) {
        b3 b3Var;
        Long unprocessedCommitsCount;
        if (cVar instanceof b3) {
            b3Var = (b3) cVar;
            int i14 = b3Var.f205438c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b3Var.f205438c = i14 - Integer.MIN_VALUE;
            } else {
                b3Var = new b3(this, cVar);
            }
        } else {
            b3Var = new b3(this, cVar);
        }
        Object objA = b3Var.f205436a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b3Var.f205438c;
        boolean z14 = true;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                u0 u0Var = u0.f205864a;
                b3Var.f205438c = 1;
                u0Var.getClass();
                objA = u0.f205870g.getValue().a(str, b3Var);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            c83.a0 a0Var = (c83.a0) objA;
            if (!a0Var.f25745a.isSuccessful()) {
                return Boolean.FALSE;
            }
            wo2.d dVar = (wo2.d) a0Var.f25746b;
            if (dVar == null || (unprocessedCommitsCount = dVar.getUnprocessedCommitsCount()) == null) {
                return Boolean.FALSE;
            }
            long jLongValue = unprocessedCommitsCount.longValue();
            f205525n.debug("hasUnprocessedCommitsForDevice: unprocessedCommit counts: " + jLongValue);
            if (jLongValue <= 0) {
                z14 = false;
            }
            return Boolean.valueOf(z14);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z(long j8, v13.c cVar) throws NewFitPayException {
        c3 c3Var;
        int size;
        if (cVar instanceof c3) {
            c3Var = (c3) cVar;
            int i14 = c3Var.f205461d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c3Var.f205461d = i14 - Integer.MIN_VALUE;
            } else {
                c3Var = new c3(this, cVar);
            }
        } else {
            c3Var = new c3(this, cVar);
        }
        Object objK = c3Var.f205459b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = c3Var.f205461d;
        if (i15 == 0) {
            o13.r.b(objK);
            f205525n.debug("isMaxNumberOfCardsReached");
            aq2.j jVar = aq2.j.f12491a;
            kj0.b.f104940a.getClass();
            zi2.a aVarA = kj0.b.a();
            jVar.getClass();
            String strB = aq2.j.b(aVarA);
            size = this.f205527b.f205521a.b(j8).size();
            c3Var.f205458a = size;
            c3Var.f205461d = 1;
            objK = K(strB, c3Var);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            size = c3Var.f205458a;
            o13.r.b(objK);
        }
        return Boolean.valueOf(size >= Integer.parseInt((String) objK));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r15 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r15 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r15 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, dp2.a aVar, v13.c cVar) throws NewFitPayException {
        h1 h1Var;
        c83.a0 a0Var;
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i14 = h1Var.f205570d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h1Var.f205570d = i14 - Integer.MIN_VALUE;
            } else {
                h1Var = new h1(this, cVar);
            }
        } else {
            h1Var = new h1(this, cVar);
        }
        Object objC = h1Var.f205568b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = h1Var.f205570d;
        if (i15 != 0) {
            if (i15 == 1) {
                str = h1Var.f205567a;
                o13.r.b(objC);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objC);
            }
            a0Var = (c83.a0) objC;
            d0(a0Var);
            return Boolean.TRUE;
        }
        o13.r.b(objC);
        if (aVar != null) {
            jo2.g gVar = jo2.g.f99843a;
            jo2.b bVar = jo2.b.KEY_API;
            aq2.j.f12491a.getClass();
            String json = aq2.j.d().toJson(aVar, dp2.a.class);
            json.getClass();
            gVar.getClass();
            String strB = jo2.g.b(bVar, json);
            if (strB == null) {
                throw new NewFitPayException("acceptTerms: can't create encrypted data for additional info", null, null, 6, null);
            }
            fo2.a aVar3 = new fo2.a(strB, null, 2, null);
            u0 u0Var = u0.f205864a;
            h1Var.f205567a = str;
            h1Var.f205570d = 1;
            u0Var.getClass();
            objC = u0.g().C(str, aVar3, h1Var);
        } else {
            u0 u0Var2 = u0.f205864a;
            h1Var.f205567a = null;
            h1Var.f205570d = 2;
            u0Var2.getClass();
            objC = u0.g().u(str, h1Var);
        }
        return aVar2;
        a0Var = (c83.a0) objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a0(String str, String str2, v13.c cVar) {
        d3 d3Var;
        if (cVar instanceof d3) {
            d3Var = (d3) cVar;
            int i14 = d3Var.f205485d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d3Var.f205485d = i14 - Integer.MIN_VALUE;
            } else {
                d3Var = new d3(this, cVar);
            }
        } else {
            d3Var = new d3(this, cVar);
        }
        Object objJ = d3Var.f205483b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d3Var.f205485d;
        Logger logger = f205525n;
        if (i15 == 0) {
            o13.r.b(objJ);
            logger.debug("linkAddress");
            u0 u0Var = u0.f205864a;
            d3Var.f205482a = str2;
            d3Var.f205485d = 1;
            u0Var.getClass();
            objJ = u0.g().j(str, p13.u0.d(new o13.p("addressId", str2)), d3Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = d3Var.f205482a;
            o13.r.b(objJ);
        }
        Response response = ((c83.a0) objJ).f25745a;
        if (response.isSuccessful()) {
            return str2;
        }
        logger.error("getAddress: failed to link address to payment card code: " + response.code() + " message: " + response.message());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, fo2.h0 h0Var, v13.c cVar) throws NewFitPayException {
        i1 i1Var;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i14 = i1Var.f205580c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i1Var.f205580c = i14 - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(this, cVar);
            }
        } else {
            i1Var = new i1(this, cVar);
        }
        Object objC = i1Var.f205578a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i1Var.f205580c;
        if (i15 == 0) {
            o13.r.b(objC);
            u0 u0Var = u0.f205864a;
            i1Var.f205580c = 1;
            u0Var.getClass();
            objC = u0.g().C(str, h0Var, i1Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        d0((c83.a0) objC);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(v13.c cVar) throws NewFitPayException {
        e3 e3Var;
        if (cVar instanceof e3) {
            e3Var = (e3) cVar;
            int i14 = e3Var.f205496c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e3Var.f205496c = i14 - Integer.MIN_VALUE;
            } else {
                e3Var = new e3(this, cVar);
            }
        } else {
            e3Var = new e3(this, cVar);
        }
        Object objQ = e3Var.f205494a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = e3Var.f205496c;
        Logger logger = f205525n;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objQ);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objQ);
            }
            logger.debug("loadUserData: device: " + ((Set) objQ));
            return Unit.INSTANCE;
        }
        o13.r.b(objQ);
        u0.f205864a.getClass();
        R rC = u0.f().c();
        rC.getClass();
        this.f205529d = (sn2.a) rC;
        if (s() instanceof sn2.a.C3030a) {
            logger.debug("loadUserData: fitPay account: " + s().f160417a);
            e3Var.f205496c = 1;
            objQ = Q(true, e3Var);
            if (objQ != obj) {
            }
            return obj;
        }
        NewFitPayException newFitPayException = s().f160419c;
        logger.debug("loadUserData: fitPay account - exception: " + (newFitPayException != null ? newFitPayException.getMessage() : null));
        return Unit.INSTANCE;
        fo2.u uVar = (fo2.u) objQ;
        logger.debug("loadUserData: user: " + uVar);
        s().f160418b = Boolean.valueOf(uVar.getLinks().getConsent() == null);
        logger.debug("loadUserData: user.termsAndConditionsAccepted: " + s().f160418b);
        e3Var.f205496c = 2;
        objQ = t(true, e3Var);
    }

    public final Object d(long j8, xp2.c.d dVar) {
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        f205525n.debug(new zn2.a.d(j8).a());
        ge1.b.T(this.f205537l, null, null, new m1(this, j8, kVar, null), 3);
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public final void e(long j8) {
        Object next;
        Iterator<T> it = this.f205531f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((fo2.s) next).f73103c != j8);
        fo2.s sVar = (fo2.s) next;
        if (sVar != null) {
            this.f205531f.remove(sVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e0(fo2.p pVar, v13.c cVar) throws NewFitPayException {
        f3 f3Var;
        if (cVar instanceof f3) {
            f3Var = (f3) cVar;
            int i14 = f3Var.f205520c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f3Var.f205520c = i14 - Integer.MIN_VALUE;
            } else {
                f3Var = new f3(this, cVar);
            }
        } else {
            f3Var = new f3(this, cVar);
        }
        Object objA0 = f3Var.f205518a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f3Var.f205520c;
        if (i15 == 0) {
            o13.r.b(objA0);
            String link = pVar.getLink();
            if (link == null) {
                f205525n.error("reactivateCreditCard: reactivateCardLink is missing, can not suspend card");
                throw new NewFitPayException("reactivateCardLink is missing, can not suspend card", null, null, 6, null);
            }
            u0 u0Var = u0.f205864a;
            f3Var.f205520c = 1;
            u0Var.getClass();
            objA0 = u0.g().a0(link, f3Var);
            if (objA0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA0);
        }
        c83.a0 a0Var = (c83.a0) objA0;
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        if (response.isSuccessful()) {
            return (yo2.b) obj;
        }
        throw new NewFitPayException("reactivateCreditCard: failed to deactivate  creditCard responseCode: " + a0Var.f25745a.code() + " , responseBody: " + obj, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(dp2.b bVar, v13.c cVar) throws NewFitPayException {
        o1 o1Var;
        String id3;
        fo2.m0 links;
        fo2.p credentials;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i14 = o1Var.f205713c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o1Var.f205713c = i14 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(this, cVar);
            }
        } else {
            o1Var = new o1(this, cVar);
        }
        Object objO = o1Var.f205711a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o1Var.f205713c;
        if (i15 == 0) {
            o13.r.b(objO);
            String link = this.f205534i;
            if (link == null) {
                fo2.u uVar = this.f205530e;
                link = (uVar == null || (links = uVar.getLinks()) == null || (credentials = links.getCredentials()) == null) ? null : credentials.getLink();
            }
            if (link == null || link.length() == 0) {
                throw new NewFitPayException("createCredential(Credential): can not create credential, createCredential link must not be null", z.UNABLE_TO_CREATE_CREDIT_CARD, null, 4, null);
            }
            jo2.g gVar = jo2.g.f99843a;
            jo2.b bVar2 = jo2.b.KEY_API;
            aq2.j.f12491a.getClass();
            String json = aq2.j.d().toJson(bVar, dp2.b.class);
            json.getClass();
            gVar.getClass();
            String strB = jo2.g.b(bVar2, json);
            if (strB == null) {
                throw new NewFitPayException("createCredential(Credential): can't create encrypted data for credential", null, null, 6, null);
            }
            List listC = p13.w.c(fo2.y.PAYMENT);
            List listC2 = p13.w.c(ep2.a.ECOM);
            fo2.u uVar2 = this.f205530e;
            if (uVar2 == null || (id3 = uVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) {
                throw new NewFitPayException("createCredential(Credential): can't create credentialModel for credential", null, null, 6, null);
            }
            dp2.d dVar = new dp2.d(id3, ep2.l.valueOf("CLOUD"), listC, listC2, strB);
            c0();
            u0 u0Var = u0.f205864a;
            o1Var.f205713c = 1;
            u0Var.getClass();
            objO = u0.g().O(link, dVar, o1Var);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objO);
        }
        return U((c83.a0) objO);
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0561  */
    /* JADX WARN: Code duplicated, block: B:359:0x0521 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0555 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:376:0x0555, B:171:0x0584], limit reached: 410 */
    /* JADX WARN: Type inference failed for: r10v2, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:286:0x0884 -> B:363:0x051b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f0(boolean r36, e23.l r37, v13.c r38) {
        /*
            Method dump skipped, instruction units count: 2574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn2.g1.f0(boolean, e23.l, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, dp2.b bVar, boolean z14, v13.c cVar) throws NewFitPayException {
        r1 r1Var;
        String link;
        fo2.m0 links;
        fo2.p creditCards;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i14 = r1Var.f205792c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r1Var.f205792c = i14 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, cVar);
            }
        } else {
            r1Var = new r1(this, cVar);
        }
        Object objE = r1Var.f205790a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r1Var.f205792c;
        if (i15 == 0) {
            o13.r.b(objE);
            f205525n.debug("createCreditCard: isVerify - " + z14);
            if (z14) {
                link = this.f205535j;
            } else {
                fo2.u uVar = this.f205530e;
                link = (uVar == null || (links = uVar.getLinks()) == null || (creditCards = links.getCreditCards()) == null) ? null : creditCards.getLink();
            }
            if (link == null || link.length() == 0) {
                throw new NewFitPayException("createCreditCard(FitPay): can not create credit card, creditCard link must not be null", z.UNABLE_TO_CREATE_CREDIT_CARD, null, 4, null);
            }
            jo2.g gVar = jo2.g.f99843a;
            jo2.b bVar2 = jo2.b.KEY_API;
            aq2.j.f12491a.getClass();
            String json = aq2.j.d().toJson(bVar, dp2.b.class);
            json.getClass();
            gVar.getClass();
            String strB = jo2.g.b(bVar2, json);
            if (strB == null) {
                throw new NewFitPayException("createCreditCard(FitPay): can't create encrypted data for credit card", null, null, 6, null);
            }
            HashMap<String, String> map = new HashMap<>();
            map.put("encryptedData", strB);
            map.put("deviceId", str);
            u0 u0Var = u0.f205864a;
            r1Var.f205792c = 1;
            u0Var.getClass();
            objE = u0.g().E(link, map, r1Var);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        return T((c83.a0) objE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, io2.c cVar, v13.c cVar2) throws NewFitPayException {
        p1 p1Var;
        fo2.m0 links;
        fo2.p creditCards;
        if (cVar2 instanceof p1) {
            p1Var = (p1) cVar2;
            int i14 = p1Var.f205727c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p1Var.f205727c = i14 - Integer.MIN_VALUE;
            } else {
                p1Var = new p1(this, cVar2);
            }
        } else {
            p1Var = new p1(this, cVar2);
        }
        Object objE = p1Var.f205725a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p1Var.f205727c;
        if (i15 == 0) {
            o13.r.b(objE);
            fo2.u uVar = this.f205530e;
            String link = (uVar == null || (links = uVar.getLinks()) == null || (creditCards = links.getCreditCards()) == null) ? null : creditCards.getLink();
            if (link == null || link.length() == 0) {
                throw new NewFitPayException("createCreditCard(PushProv): can not create credit card, creditCard link must not be null", z.UNABLE_TO_CREATE_CREDIT_CARD, null, 4, null);
            }
            jo2.g gVar = jo2.g.f99843a;
            jo2.b bVar = jo2.b.KEY_API;
            aq2.j.f12491a.getClass();
            String json = aq2.j.d().toJson(cVar, io2.c.class);
            json.getClass();
            gVar.getClass();
            String strB = jo2.g.b(bVar, json);
            if (strB == null) {
                throw new NewFitPayException("createCreditCard(PushProv): can't create encrypted data for credit card", null, null, 6, null);
            }
            HashMap<String, String> map = new HashMap<>();
            map.put("encryptedData", strB);
            map.put("deviceId", str);
            u0 u0Var = u0.f205864a;
            p1Var.f205727c = 1;
            u0Var.getClass();
            objE = u0.g().E(link, map, p1Var);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        return T((c83.a0) objE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h0(v13.c cVar) {
        h3 h3Var;
        if (cVar instanceof h3) {
            h3Var = (h3) cVar;
            int i14 = h3Var.f205576c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h3Var.f205576c = i14 - Integer.MIN_VALUE;
            } else {
                h3Var = new h3(this, cVar);
            }
        } else {
            h3Var = new h3(this, cVar);
        }
        Object obj = h3Var.f205574a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h3Var.f205576c;
        Logger logger = f205525n;
        if (i15 == 0) {
            o13.r.b(obj);
            logger.debug("Start refreshAllCachedTransitCards()");
            h3Var.f205576c = 1;
            x53.c cVar2 = o53.s0.f129406a;
            if (ge1.b.e0(x53.b.f189152a, new c2(this, null), h3Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        logger.debug("Finish refreshAllCachedTransitCards()");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, String str2, v13.c cVar) throws NewFitPayException {
        q1 q1Var;
        fo2.p pVarH;
        if (cVar instanceof q1) {
            q1Var = (q1) cVar;
            int i14 = q1Var.f205770c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q1Var.f205770c = i14 - Integer.MIN_VALUE;
            } else {
                q1Var = new q1(this, cVar);
            }
        } else {
            q1Var = new q1(this, cVar);
        }
        Object objN = q1Var.f205768a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q1Var.f205770c;
        if (i15 == 0) {
            o13.r.b(objN);
            f205525n.debug("createCreditCard");
            String link = this.f205535j;
            if (link == null) {
                zo2.a aVar2 = (zo2.a) this.f205533h.get(str);
                link = (aVar2 == null || (pVarH = aVar2.getCreditCardsLink()) == null) ? null : pVarH.getLink();
                if (link == null) {
                    throw new NewFitPayException("createCreditCard: createCredit link is missing, can not add credit card", null, null, 6, null);
                }
            }
            u0 u0Var = u0.f205864a;
            fo2.a aVar3 = new fo2.a(null, str2, 1, null);
            q1Var.f205770c = 1;
            u0Var.getClass();
            objN = u0.g().n(link, aVar3, q1Var);
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objN);
        }
        return T((c83.a0) objN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i0(long j8, v13.c cVar) throws Throwable {
        i3 i3Var;
        if (cVar instanceof i3) {
            i3Var = (i3) cVar;
            int i14 = i3Var.f205592d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i3Var.f205592d = i14 - Integer.MIN_VALUE;
            } else {
                i3Var = new i3(this, cVar);
            }
        } else {
            i3Var = new i3(this, cVar);
        }
        Object objO = i3Var.f205590b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i3Var.f205592d;
        if (i15 == 0) {
            o13.r.b(objO);
            u0 u0Var = u0.f205864a;
            i3Var.f205589a = j8;
            i3Var.f205592d = 1;
            u0Var.getClass();
            objO = u0.o(j8, i3Var);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = i3Var.f205589a;
            o13.r.b(objO);
        }
        if (!((Boolean) objO).booleanValue()) {
            return Boolean.FALSE;
        }
        e(j8);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(fo2.t tVar, v13.c cVar) throws NewFitPayException {
        s1 s1Var;
        fo2.m0 links;
        fo2.p devices;
        String link;
        if (cVar instanceof s1) {
            s1Var = (s1) cVar;
            int i14 = s1Var.f205809c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s1Var.f205809c = i14 - Integer.MIN_VALUE;
            } else {
                s1Var = new s1(this, cVar);
            }
        } else {
            s1Var = new s1(this, cVar);
        }
        Object objC = s1Var.f205807a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s1Var.f205809c;
        if (i15 == 0) {
            o13.r.b(objC);
            fo2.u uVar = this.f205530e;
            if (uVar == null || (links = uVar.getLinks()) == null || (devices = links.getDevices()) == null || (link = devices.getLink()) == null) {
                throw new NewFitPayException("missing device links, can not create host device...", null, null, 6, null);
            }
            u0 u0Var = u0.f205864a;
            s1Var.f205809c = 1;
            u0Var.getClass();
            objC = u0.g().C(link, tVar, s1Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        Response response = ((c83.a0) objC).f25745a;
        if (response.isSuccessful()) {
            return Unit.INSTANCE;
        }
        throw new NewFitPayException(sn.a.e(response.code(), "received failed response for create host device request, code: ", " data: ", response.message()), null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object j0(fo2.t tVar, v13.c cVar) throws NewFitPayException {
        j3 j3Var;
        fo2.m0 links;
        fo2.p devices;
        String link;
        if (cVar instanceof j3) {
            j3Var = (j3) cVar;
            int i14 = j3Var.f205613c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j3Var.f205613c = i14 - Integer.MIN_VALUE;
            } else {
                j3Var = new j3(this, cVar);
            }
        } else {
            j3Var = new j3(this, cVar);
        }
        Object objG = j3Var.f205611a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = j3Var.f205613c;
        Logger logger = f205525n;
        try {
            if (i15 == 0) {
                o13.r.b(objG);
                fo2.u uVar = this.f205530e;
                if (uVar == null || (links = uVar.getLinks()) == null || (devices = links.getDevices()) == null || (link = devices.getLink()) == null) {
                    throw new NewFitPayException("missing device links, can not remove host device...", null, null, 6, null);
                }
                String str = tVar.f73113a;
                if (str == null) {
                    logger.error("removeHostDevice: failed to remove host device, device id must not null");
                    return Boolean.FALSE;
                }
                u0 u0Var = u0.f205864a;
                j3Var.f205613c = 1;
                u0Var.getClass();
                objG = u0.g().g(link + "/" + str, j3Var);
                if (objG == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objG);
            }
            Response response = ((c83.a0) objG).f25745a;
            if (response.isSuccessful()) {
                return Boolean.TRUE;
            }
            logger.error("removeHostDevice: failed to remove host device code: " + response.code() + " message: " + response.message());
            return Boolean.FALSE;
        } catch (Exception e4) {
            logger.error("removeHostDevice: failed to remove host device, ", (Throwable) e4);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(fo2.p pVar, fo2.f0.a aVar, v13.c cVar) throws NewFitPayException {
        t1 t1Var;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i14 = t1Var.f205843c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t1Var.f205843c = i14 - Integer.MIN_VALUE;
            } else {
                t1Var = new t1(this, cVar);
            }
        } else {
            t1Var = new t1(this, cVar);
        }
        Object objG = t1Var.f205841a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = t1Var.f205843c;
        if (i15 == 0) {
            o13.r.b(objG);
            Logger logger = f205525n;
            logger.debug("createSecurityDomain");
            String link = pVar.getLink();
            if (link == null) {
                logger.error("createSecurityDomain: securityDomainsLink is missing, can not create security domain");
                throw new NewFitPayException("createSecurityDomain: securityDomainsLink is missing, can not create security domain", null, null, 6, null);
            }
            u0 u0Var = u0.f205864a;
            fo2.f0 f0Var = new fo2.f0(aVar);
            t1Var.f205843c = 1;
            u0Var.getClass();
            objG = u0.g().G(link, f0Var, t1Var);
            if (objG == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        c83.a0 a0Var = (c83.a0) objG;
        Response response = a0Var.f25745a;
        if (response.isSuccessful()) {
            String str = response.headers().get(FirebaseAnalytics.Param.LOCATION);
            if (str != null) {
                return str;
            }
            throw new NewFitPayException("createSecurityDomain: failed to get \"location\" header in : " + response.headers(), null, null, 6, null);
        }
        throw new NewFitPayException("createSecurityDomain: failed to create security domain responseCode: " + response.code() + " , responseBody: " + a0Var.f25747c, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object k0(String str, v13.c cVar) throws NewFitPayException {
        k3 k3Var;
        if (cVar instanceof k3) {
            k3Var = (k3) cVar;
            int i14 = k3Var.f205627c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k3Var.f205627c = i14 - Integer.MIN_VALUE;
            } else {
                k3Var = new k3(this, cVar);
            }
        } else {
            k3Var = new k3(this, cVar);
        }
        Object objW = k3Var.f205625a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k3Var.f205627c;
        Logger logger = f205525n;
        try {
            if (i15 == 0) {
                o13.r.b(objW);
                if (str == null || str.length() == 0) {
                    throw new NewFitPayException("selectUrl is missing can not select verification method", null, null, 6, null);
                }
                u0 u0Var = u0.f205864a;
                k3Var.f205627c = 1;
                u0Var.getClass();
                objW = u0.g().w(str, k3Var);
                if (objW == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objW);
            }
            c83.a0 a0Var = (c83.a0) objW;
            Response response = a0Var.f25745a;
            Object obj = a0Var.f25746b;
            if (response.isSuccessful()) {
                dq2.f fVar = (dq2.f) obj;
                if (fVar != null) {
                    return fVar;
                }
                throw new NewFitPayException("verification method not available in success response", null, null, 6, null);
            }
            logger.error("selectVerificationMethod: verification method selection failed, response code: " + response.code() + " body: " + obj);
            throw new NewFitPayException("failed to get verification method code: " + response.code() + " body: " + obj, null, null, 6, null);
        } catch (Exception e4) {
            logger.error("selectVerificationMethod: ", (Throwable) e4);
            String message = e4.getMessage();
            if (message == null) {
                message = "";
            }
            throw new NewFitPayException(message, null, null, 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(io2.a aVar, ep2.l lVar, v13.c cVar) throws NewFitPayException {
        u1 u1Var;
        fo2.m0 links;
        fo2.p credentials;
        fo2.m0 links2;
        if (cVar instanceof u1) {
            u1Var = (u1) cVar;
            int i14 = u1Var.f205875d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u1Var.f205875d = i14 - Integer.MIN_VALUE;
            } else {
                u1Var = new u1(this, cVar);
            }
        } else {
            u1Var = new u1(this, cVar);
        }
        Object objW = u1Var.f205873b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = u1Var.f205875d;
        if (i15 == 0) {
            o13.r.b(objW);
            ep2.l lVar2 = ep2.l.SE;
            fo2.u uVar = this.f205530e;
            String link = null;
            if (lVar != lVar2 ? !(uVar == null || (links = uVar.getLinks()) == null || (credentials = links.getCredentials()) == null) : !(uVar == null || (links2 = uVar.getLinks()) == null || (credentials = links2.getCreditCards()) == null)) {
                link = credentials.getLink();
            }
            if (link == null || link.length() == 0) {
                throw new NewFitPayException("createCreditCard(PushProv): can not create credit card, creditCard link must not be null", z.UNABLE_TO_CREATE_CREDIT_CARD, null, 4, null);
            }
            jo2.g gVar = jo2.g.f99843a;
            jo2.b bVar = jo2.b.KEY_API;
            aq2.j.f12491a.getClass();
            String json = aq2.j.d().toJson(aVar, io2.a.class);
            json.getClass();
            gVar.getClass();
            String strB = jo2.g.b(bVar, json);
            if (strB == null) {
                throw new NewFitPayException("createCredential(Credential): can't create encrypted data for credential", null, null, 6, null);
            }
            io2.b bVar2 = new io2.b(strB, lVar, p13.w.c(fo2.y.PAYMENT), p13.w.c(lVar == lVar2 ? ep2.a.NFC : ep2.a.ECOM));
            u0 u0Var = u0.f205864a;
            u1Var.f205872a = lVar;
            u1Var.f205875d = 1;
            u0Var.getClass();
            objW = u0.g().W(link, bVar2, u1Var);
            if (objW == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar = u1Var.f205872a;
            o13.r.b(objW);
        }
        c83.a0 a0Var = (c83.a0) objW;
        return lVar == ep2.l.SE ? T(a0Var) : U(a0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l0(String str, String str2, v13.c cVar) throws NewFitPayException {
        n3 n3Var;
        String strString;
        if (cVar instanceof n3) {
            n3Var = (n3) cVar;
            int i14 = n3Var.f205701c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n3Var.f205701c = i14 - Integer.MIN_VALUE;
            } else {
                n3Var = new n3(this, cVar);
            }
        } else {
            n3Var = new n3(this, cVar);
        }
        Object objM = n3Var.f205699a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n3Var.f205701c;
        if (i15 == 0) {
            o13.r.b(objM);
            u0 u0Var = u0.f205864a;
            n3Var.f205701c = 1;
            u0Var.getClass();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("verificationCode", str);
            objM = u0.g().M(str2, jsonObject, n3Var);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objM);
        }
        c83.a0 a0Var = (c83.a0) objM;
        if (a0Var.f25745a.isSuccessful()) {
            return Boolean.TRUE;
        }
        ResponseBody responseBody = a0Var.f25747c;
        if (responseBody == null || (strString = responseBody.string()) == null) {
            throw new NewFitPayException(am.j.h(a0Var.f25745a.code(), "failed to verify credit card authCode, response is not available, response code: "), z.CARD_VERIFICATION_FAILED, null, 4, null);
        }
        V(strString);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object m(final boolean z14, v13.c cVar) {
        v1 v1Var;
        if (cVar instanceof v1) {
            v1Var = (v1) cVar;
            int i14 = v1Var.f205898c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v1Var.f205898c = i14 - Integer.MIN_VALUE;
            } else {
                v1Var = new v1(this, cVar);
            }
        } else {
            v1Var = new v1(this, cVar);
        }
        Object obj = v1Var.f205896a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = v1Var.f205898c;
        boolean z15 = true;
        if (i15 == 0) {
            o13.r.b(obj);
            u0.f205864a.getClass();
            Callable callable = new Callable() { // from class: zn2.a0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    u0 u0Var = u0.f205864a;
                    wr2.p pVar = wr2.p.f186870a;
                    String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.is_snowball_sandbox_role);
                    string.getClass();
                    pVar.getClass();
                    boolean zB = wr2.p.b("general_app", string, false);
                    u0.f205864a.getClass();
                    return u0.h().b(zB, z14);
                }
            };
            int i16 = w03.b.f181178a;
            c83.a0 a0Var = (c83.a0) new e13.b(callable).c();
            Response response = a0Var.f25745a;
            if (response.isSuccessful() || response.code() == 409) {
                v1Var.f205898c = 1;
                if (b0(v1Var) == obj2) {
                    return obj2;
                }
            } else {
                f205525n.error("createUser: failed to create GC fitpay user code: " + response.code() + ", body: " + a0Var.f25746b);
                z15 = false;
            }
            return Boolean.valueOf(z15);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        wr2.p.f186870a.getClass();
        wr2.p.f("dynamic_feature_app", GarminPayInitializer.HAS_FITPAY_ACCOUNT, BooleanUtils.TRUE);
        return Boolean.valueOf(z15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m0(String str, String str2, v13.c cVar) throws NewFitPayException {
        o3 o3Var;
        String strString;
        if (cVar instanceof o3) {
            o3Var = (o3) cVar;
            int i14 = o3Var.f205720c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o3Var.f205720c = i14 - Integer.MIN_VALUE;
            } else {
                o3Var = new o3(this, cVar);
            }
        } else {
            o3Var = new o3(this, cVar);
        }
        Object objM = o3Var.f205718a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o3Var.f205720c;
        if (i15 == 0) {
            o13.r.b(objM);
            u0 u0Var = u0.f205864a;
            o3Var.f205720c = 1;
            u0Var.getClass();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("callbackUrl", str);
            objM = u0.g().M(str2, jsonObject, o3Var);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objM);
        }
        c83.a0 a0Var = (c83.a0) objM;
        if (a0Var.f25745a.isSuccessful()) {
            return Boolean.TRUE;
        }
        ResponseBody responseBody = a0Var.f25747c;
        if (responseBody == null || (strString = responseBody.string()) == null) {
            throw new NewFitPayException(am.j.h(a0Var.f25745a.code(), "failed to verify credit card callbackUrl, response is not available, response code: "), z.CARD_VERIFICATION_FAILED, null, 4, null);
        }
        V(strString);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(fo2.p pVar, v13.c cVar) throws NewFitPayException {
        w1 w1Var;
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i14 = w1Var.f205917c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w1Var.f205917c = i14 - Integer.MIN_VALUE;
            } else {
                w1Var = new w1(this, cVar);
            }
        } else {
            w1Var = new w1(this, cVar);
        }
        Object objY = w1Var.f205915a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = w1Var.f205917c;
        if (i15 == 0) {
            o13.r.b(objY);
            String link = pVar.getLink();
            if (link == null) {
                f205525n.error("deactivateCreditCard: deactivateLink is missing, can not suspend card");
                throw new NewFitPayException("deactivateLink is missing, can not suspend card", null, null, 6, null);
            }
            u0 u0Var = u0.f205864a;
            w1Var.f205917c = 1;
            u0Var.getClass();
            objY = u0.g().y(link, w1Var);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        c83.a0 a0Var = (c83.a0) objY;
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        if (response.isSuccessful()) {
            return (yo2.b) obj;
        }
        throw new NewFitPayException("deactivateCreditCard: failed to deactivate  creditCard responseCode: " + a0Var.f25745a.code() + " , responseBody: " + obj, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object n0(jo2.d dVar, v13.c cVar) throws NewFitPayException {
        p3 p3Var;
        if (cVar instanceof p3) {
            p3Var = (p3) cVar;
            int i14 = p3Var.f205733c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p3Var.f205733c = i14 - Integer.MIN_VALUE;
            } else {
                p3Var = new p3(this, cVar);
            }
        } else {
            p3Var = new p3(this, cVar);
        }
        Object objB0 = p3Var.f205731a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p3Var.f205733c;
        if (i15 == 0) {
            o13.r.b(objB0);
            u0 u0Var = u0.f205864a;
            p3Var.f205733c = 1;
            u0Var.getClass();
            objB0 = u0.f205870g.getValue().b0(dVar, p3Var);
            if (objB0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB0);
        }
        c83.a0 a0Var = (c83.a0) objB0;
        Response response = a0Var.f25745a;
        if (!response.isSuccessful()) {
            if (response.code() == 500) {
                throw new NewFitPayException(sn.a.e(response.code(), "verifyJws: Trouble communicating GPay server: ", " message: ", response.message()), z.TROUBLE_COMMUNICATING_GPAY_SERVERS, null, 4, null);
            }
            throw new NewFitPayException(sn.a.e(response.code(), "verifyJws: Generic error: ", " message: ", response.message()), z.GENERIC_ERROR, null, 4, null);
        }
        jo2.e eVar = (jo2.e) a0Var.f25746b;
        if (eVar == null) {
            throw new NewFitPayException("verifyJws: received null response from the server", z.GENERIC_ERROR, null, 4, null);
        }
        if (eVar.getVerified()) {
            return eVar;
        }
        throw new NewFitPayException("JWS not correctly verified", z.BANK_SYSTEM_ERROR, null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object o(String str, v13.c cVar) {
        x1 x1Var;
        if (cVar instanceof x1) {
            x1Var = (x1) cVar;
            int i14 = x1Var.f205932c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x1Var.f205932c = i14 - Integer.MIN_VALUE;
            } else {
                x1Var = new x1(this, cVar);
            }
        } else {
            x1Var = new x1(this, cVar);
        }
        Object objU = x1Var.f205930a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = x1Var.f205932c;
        Logger logger = f205525n;
        try {
            if (i15 == 0) {
                o13.r.b(objU);
                u0 u0Var = u0.f205864a;
                x1Var.f205932c = 1;
                u0Var.getClass();
                objU = u0.g().u(str, x1Var);
                if (objU == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objU);
            }
            c83.a0 a0Var = (c83.a0) objU;
            if (a0Var.f25745a.isSuccessful()) {
                return Boolean.TRUE;
            }
            logger.error("declineTerms: failed to decline terms code: " + a0Var.f25745a.code() + ", body: " + a0Var.f25746b);
            return Boolean.FALSE;
        } catch (Exception e4) {
            logger.error("declineTerms:", (Throwable) e4);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object p(String str, v13.c cVar) {
        z1 z1Var;
        if (cVar instanceof z1) {
            z1Var = (z1) cVar;
            int i14 = z1Var.f206007c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z1Var.f206007c = i14 - Integer.MIN_VALUE;
            } else {
                z1Var = new z1(this, cVar);
            }
        } else {
            z1Var = new z1(this, cVar);
        }
        Object objG = z1Var.f206005a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = z1Var.f206007c;
        Logger logger = f205525n;
        try {
            if (i15 == 0) {
                o13.r.b(objG);
                if (str == null || str.length() == 0) {
                    logger.error("deleteCreditCard: credit card url is null or empty, can not delete credit card");
                    return Boolean.FALSE;
                }
                u0 u0Var = u0.f205864a;
                z1Var.f206007c = 1;
                u0Var.getClass();
                objG = u0.g().g(str, z1Var);
                if (objG == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objG);
            }
            Response response = ((c83.a0) objG).f25745a;
            if (response.isSuccessful()) {
                logger.debug("deleteCreditCard: credit card successfully deleted, response code: " + response.code());
                return Boolean.TRUE;
            }
            logger.error("deleteCreditCard: failed to delete credit card, response code: " + response.code());
            return Boolean.FALSE;
        } catch (Exception e4) {
            logger.error("deleteCreditCard: failed to delete credit card", (Throwable) e4);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object q(String str, String str2, v13.c cVar) {
        a2 a2Var;
        if (cVar instanceof a2) {
            a2Var = (a2) cVar;
            int i14 = a2Var.f205418d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a2Var.f205418d = i14 - Integer.MIN_VALUE;
            } else {
                a2Var = new a2(this, cVar);
            }
        } else {
            a2Var = new a2(this, cVar);
        }
        Object objG = a2Var.f205416b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a2Var.f205418d;
        Logger logger = f205525n;
        try {
            if (i15 == 0) {
                o13.r.b(objG);
                logger.debug("deletePaymentCard");
                if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                    logger.error("deletePaymentCard: payment card url or paymentCardId is null or empty, can not delete payment card");
                    return Boolean.FALSE;
                }
                u0 u0Var = u0.f205864a;
                a2Var.f205415a = str2;
                a2Var.f205418d = 1;
                u0Var.getClass();
                objG = u0.g().g(str, a2Var);
                if (objG == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = a2Var.f205415a;
                o13.r.b(objG);
            }
            Response response = ((c83.a0) objG).f25745a;
            if (!response.isSuccessful()) {
                logger.error("deletePaymentCard: failed to delete payment card, response code: " + response.code());
                return Boolean.FALSE;
            }
            logger.debug("deletePaymentCard: payment card successfully deleted, response code: " + response.code());
            g gVar = this.f205527b;
            gVar.getClass();
            str2.getClass();
            gVar.f205521a.n(str2);
            return Boolean.TRUE;
        } catch (Exception e4) {
            logger.error("deletePaymentCard: failed to delete payment card", (Throwable) e4);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(String str, v13.c cVar) throws NewFitPayException {
        b2 b2Var;
        if (cVar instanceof b2) {
            b2Var = (b2) cVar;
            int i14 = b2Var.f205435c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b2Var.f205435c = i14 - Integer.MIN_VALUE;
            } else {
                b2Var = new b2(this, cVar);
            }
        } else {
            b2Var = new b2(this, cVar);
        }
        Object objL = b2Var.f205433a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b2Var.f205435c;
        if (i15 == 0) {
            o13.r.b(objL);
            f205525n.debug("deleteSecurityDomain");
            u0 u0Var = u0.f205864a;
            b2Var.f205435c = 1;
            u0Var.getClass();
            objL = u0.g().L(str, b2Var);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL);
        }
        c83.a0 a0Var = (c83.a0) objL;
        if (a0Var.f25745a.isSuccessful()) {
            return Unit.INSTANCE;
        }
        throw new NewFitPayException("createSecurityDomain: failed to create security domain responseCode: " + a0Var.f25745a.code() + " , responseBody: " + a0Var.f25747c, null, null, 6, null);
    }

    public final sn2.a s() {
        sn2.a aVar = this.f205529d;
        if (aVar != null) {
            return aVar;
        }
        p005kotlin.jvm.internal.s.m("account");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(boolean z14, v13.c cVar) throws NewFitPayException {
        d2 d2Var;
        g1 g1Var;
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i14 = d2Var.f205481d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d2Var.f205481d = i14 - Integer.MIN_VALUE;
            } else {
                d2Var = new d2(this, cVar);
            }
        } else {
            d2Var = new d2(this, cVar);
        }
        Object objH = d2Var.f205479b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d2Var.f205481d;
        if (i15 == 0) {
            o13.r.b(objH);
            if (!z14) {
                return this.f205531f;
            }
            d2Var.f205478a = this;
            d2Var.f205481d = 1;
            objH = H(true, d2Var);
            if (objH == aVar) {
                return aVar;
            }
            g1Var = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g1Var = d2Var.f205478a;
            o13.r.b(objH);
        }
        g1Var.f205531f = p13.h0.f1(((fo2.v) objH).f73122a);
        return this.f205531f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable u(v13.c cVar) throws NewFitPayException {
        e2 e2Var;
        if (cVar instanceof e2) {
            e2Var = (e2) cVar;
            int i14 = e2Var.f205493c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e2Var.f205493c = i14 - Integer.MIN_VALUE;
            } else {
                e2Var = new e2(this, cVar);
            }
        } else {
            e2Var = new e2(this, cVar);
        }
        Object objH = e2Var.f205491a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e2Var.f205493c;
        if (i15 == 0) {
            o13.r.b(objH);
            e2Var.f205493c = 1;
            objH = H(false, e2Var);
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objH);
        }
        return p13.h0.d1(((fo2.v) objH).f73123b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(fo2.p pVar, v13.c cVar) throws NewFitPayException {
        g2 g2Var;
        if (cVar instanceof g2) {
            g2Var = (g2) cVar;
            int i14 = g2Var.f205542c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g2Var.f205542c = i14 - Integer.MIN_VALUE;
            } else {
                g2Var = new g2(this, cVar);
            }
        } else {
            g2Var = new g2(this, cVar);
        }
        Object objL = g2Var.f205540a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g2Var.f205542c;
        if (i15 == 0) {
            o13.r.b(objL);
            String link = pVar.getLink();
            if (link == null) {
                f205525n.warn("getCardTransactions: transactionLink is missing from card payload");
                return null;
            }
            u0 u0Var = u0.f205864a;
            g2Var.f205542c = 1;
            u0Var.getClass();
            objL = u0.g().l(link, g2Var);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL);
        }
        c83.a0 a0Var = (c83.a0) objL;
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        int iCode = response.code();
        if (iCode == 403) {
            return null;
        }
        switch (iCode) {
            case 200:
            case 201:
            case 202:
                return (vp2.d) obj;
            default:
                throw new NewFitPayException("failed to get transactions: " + obj + ", " + a0Var.f25745a.code(), null, null, 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(v13.c cVar) throws NewFitPayException {
        h2 h2Var;
        if (cVar instanceof h2) {
            h2Var = (h2) cVar;
            int i14 = h2Var.f205573c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h2Var.f205573c = i14 - Integer.MIN_VALUE;
            } else {
                h2Var = new h2(this, cVar);
            }
        } else {
            h2Var = new h2(this, cVar);
        }
        Object objD = h2Var.f205571a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h2Var.f205573c;
        if (i15 == 0) {
            o13.r.b(objD);
            ep2.c cVar2 = this.f205536k;
            if (cVar2 != null) {
                return cVar2;
            }
            u0 u0Var = u0.f205864a;
            h2Var.f205573c = 1;
            u0Var.getClass();
            objD = u0.g().d(h2Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        c83.a0 a0Var = (c83.a0) objD;
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        if (response.isSuccessful()) {
            ep2.c cVar3 = (ep2.c) obj;
            this.f205536k = cVar3;
            if (cVar3 != null) {
                return cVar3;
            }
            throw new NewFitPayException("getCardTypes: received null response from the server", null, null, 6, null);
        }
        throw new NewFitPayException("getCardTypes: received failed response from the platform code: " + a0Var.f25745a.code() + ", body: " + obj, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object x(v13.c cVar) throws NewFitPayException {
        j2 j2Var;
        fo2.m0 links;
        fo2.p credentials;
        String link;
        List<ep2.d> listB;
        if (cVar instanceof j2) {
            j2Var = (j2) cVar;
            int i14 = j2Var.f205610c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j2Var.f205610c = i14 - Integer.MIN_VALUE;
            } else {
                j2Var = new j2(this, cVar);
            }
        } else {
            j2Var = new j2(this, cVar);
        }
        Object objF = j2Var.f205608a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = j2Var.f205610c;
        if (i15 == 0) {
            o13.r.b(objF);
            f205525n.debug("getCredentials");
            fo2.u uVar = this.f205530e;
            if (uVar != null && (links = uVar.getLinks()) != null && (credentials = links.getCredentials()) != null && (link = credentials.getLink()) != null) {
                c0();
                u0 u0Var = u0.f205864a;
                j2Var.f205610c = 1;
                u0Var.getClass();
                objF = u0.g().f(link, "ECOM", j2Var);
                if (objF == aVar) {
                    return aVar;
                }
            }
            return p13.j0.f134944a;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objF);
        c83.a0 a0Var = (c83.a0) objF;
        if (a0Var != null) {
            Response response = a0Var.f25745a;
            if (!response.isSuccessful()) {
                throw new NewFitPayException(sn.a.e(response.code(), "getCredentials: failed to retrieve payment cards code: ", " message: ", response.message()), null, null, 6, null);
            }
            ep2.e eVar = (ep2.e) a0Var.f25746b;
            if (eVar == null || (listB = eVar.b()) == null) {
                throw new NewFitPayException("getCredentials: something went wrong while deserialize card response", z.UNABLE_TO_LOAD_CREDIT_CARD, null, 4, null);
            }
            return listB;
        }
        return p13.j0.f134944a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object y(String str, v13.c cVar) throws NewFitPayException {
        k2 k2Var;
        if (cVar instanceof k2) {
            k2Var = (k2) cVar;
            int i14 = k2Var.f205624c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k2Var.f205624c = i14 - Integer.MIN_VALUE;
            } else {
                k2Var = new k2(this, cVar);
            }
        } else {
            k2Var = new k2(this, cVar);
        }
        Object objH = k2Var.f205622a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k2Var.f205624c;
        if (i15 == 0) {
            o13.r.b(objH);
            f205525n.debug("getCredentialsByPaymentCardId");
            zo2.a aVar2 = (zo2.a) this.f205533h.get(str);
            if (aVar2 == null) {
                throw new NewFitPayException(fb1.c.n("getCredentialsByPaymentCardId: payment card not found for ID: ", str), null, null, 6, null);
            }
            String link = aVar2.getCredentialsLink().getLink();
            if (link == null) {
                throw new NewFitPayException(fb1.c.n("getCredentialsByPaymentCardId: credentials link is missing for payment card ID: ", str), null, null, 6, null);
            }
            c0();
            u0 u0Var = u0.f205864a;
            k2Var.f205624c = 1;
            u0Var.getClass();
            objH = u0.g().H(link, k2Var);
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objH);
        }
        c83.a0 a0Var = (c83.a0) objH;
        Response response = a0Var.f25745a;
        if (!response.isSuccessful()) {
            throw new NewFitPayException(sn.a.e(response.code(), "getCredentialsByPaymentCardId: failed to retrieve payment cards code: ", " message: ", response.message()), null, null, 6, null);
        }
        ep2.e eVar = (ep2.e) a0Var.f25746b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(fo2.p pVar, fo2.s sVar, boolean z14, v13.c cVar) throws NewFitPayException {
        l2 l2Var;
        Object next;
        String strF;
        if (cVar instanceof l2) {
            l2Var = (l2) cVar;
            int i14 = l2Var.f205648e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l2Var.f205648e = i14 - Integer.MIN_VALUE;
            } else {
                l2Var = new l2(this, cVar);
            }
        } else {
            l2Var = new l2(this, cVar);
        }
        Object objJ = l2Var.f205646c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = l2Var.f205648e;
        if (i15 == 0) {
            o13.r.b(objJ);
            String link = pVar.getLink();
            if (link == null || link.length() == 0) {
                throw new NewFitPayException("getCreditCard: can not retrieve cards, creditCard link must not be null", z.UNABLE_TO_LOAD_CREDIT_CARD, null, 4, null);
            }
            u0 u0Var = u0.f205864a;
            String link2 = pVar.getLink();
            l2Var.f205644a = sVar;
            l2Var.f205645b = z14;
            l2Var.f205648e = 1;
            u0Var.getClass();
            objJ = u0.g().J(link2, l2Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = l2Var.f205645b;
            sVar = l2Var.f205644a;
            o13.r.b(objJ);
        }
        c83.a0 a0Var = (c83.a0) objJ;
        T t7 = a0Var.f25746b;
        Response response = a0Var.f25745a;
        yo2.b bVar = (yo2.b) t7;
        if (bVar == null) {
            throw new NewFitPayException("getCreditCards: something went wrong while deserialize card response", z.UNABLE_TO_LOAD_CREDIT_CARD, null, 4, null);
        }
        int iCode = response.code();
        if (iCode == 404) {
            throw new NewFitPayException(sn.a.e(response.code(), "getCreditCard: failed to get creditcard code: ", " message: ", response.message()), z.NOT_FOUND, response.headers().get(FirebaseAnalytics.Param.LOCATION));
        }
        switch (iCode) {
            case 200:
                if (z14 && sVar != null) {
                    long j8 = sVar.f73103c;
                    g gVar = this.f205527b;
                    List listJ = gVar.f205521a.j(j8, "FITPAY");
                    new gs2.a();
                    qs2.f fVarB = gs2.a.b(bVar.getCardState());
                    if (fVarB != null && fVarB != qs2.f.DELETED && fVarB != qs2.f.NOT_ELIGIBLE && fVarB != qs2.f.DECLINED_TERMS_AND_CONDITIONS && fVarB != qs2.f.DECLINED && fVarB != qs2.f.EXPIRED && fVarB != qs2.f.ERROR) {
                        String strF2 = bVar.f();
                        Iterator it = listJ.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                fs2.a aVar2 = (fs2.a) next;
                                if (!p005kotlin.jvm.internal.s.g(aVar2.f73426a, strF2) || aVar2.f73433h != fVarB || aVar2.f73431f != j8) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        fs2.a aVar3 = (fs2.a) next;
                        if (aVar3 == null) {
                            aVar3 = new fs2.a();
                        }
                        aVar3.f73426a = strF2;
                        aVar3.f73427b = is2.b.FITPAY;
                        aVar3.f73428c = gs2.a.a(bVar.getCardType());
                        yo2.d dVarQ = bVar.getCreditCardInfo();
                        if (dVarQ == null || (strF = dVarQ.getPan()) == null) {
                            strF = "";
                        }
                        aVar3.f73429d = strF;
                        aVar3.f73431f = j8;
                        aVar3.f73433h = fVarB;
                        aVar3.j(bVar.getCreditCardId());
                        fs2.a.k(aVar3, bVar);
                        if (aVar3.f73436k == 0) {
                            aVar3.f73436k = System.currentTimeMillis();
                        }
                        es2.a aVar4 = gVar.f205521a;
                        fs2.a aVarI = aVar4.i(aVar3.f73431f, aVar3.f73426a);
                        if (aVarI != null) {
                            long jCurrentTimeMillis = aVarI.f73436k;
                            if (jCurrentTimeMillis == 0) {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                            aVar3.f73436k = jCurrentTimeMillis;
                            aVar4.d(aVar3);
                            return bVar;
                        }
                        aVar4.d(aVar3);
                    }
                }
                return bVar;
            case 201:
                bVar.i0();
                return bVar;
            case 202:
                throw new NewFitPayException("getCreditCard: card is being created but not ready, notifying caller", z.CREDIT_CARD_NOT_READY, response.headers().get(FirebaseAnalytics.Param.LOCATION));
            default:
                throw new NewFitPayException("getCreditCard: failed to get credit card code: " + response.code() + ", body: " + a0Var.f25746b, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzn2/g1$a;", "", "<init>", "()V", "Lch/qos/logback/classic/Logger;", "Glog", "Lch/qos/logback/classic/Logger;", "", "GC_USER_ALREADY_CREATED_CODE", "I", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public g1() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g1(co2.a aVar, g gVar, f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        int i15 = 1;
        this((i14 & 1) != 0 ? new co2.a(null, i15, 0 == true ? 1 : 0) : aVar, (i14 & 2) != 0 ? new g(0 == true ? 1 : 0, i15, 0 == true ? 1 : 0) : gVar, (i14 & 4) != 0 ? new f(0 == true ? 1 : 0, i15, 0 == true ? 1 : 0) : fVar);
    }
}
