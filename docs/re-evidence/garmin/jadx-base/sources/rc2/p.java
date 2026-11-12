package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.lib.networking.authentication.exceptions.CountryCodeNotRecognizedByITException;
import com.google.gson.GsonBuilder;
import i3.e5;
import java.net.URL;
import org.json.JSONArray;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrc2/p;", "Lrc2/i;", "Ltc2/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "twoCharCountryCode", "it2AccessToken", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends i<tc2.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f151936i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f151937h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.lib.networking.authentication.itapi.ITCountryAgeRestrictionsRequest", f = "ITCountryAgeRestrictionsRequest.kt", l = {61}, m = "execute$networking_core_release")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f151938a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f151940c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f151938a = obj;
            this.f151940c |= Integer.MIN_VALUE;
            return p.this.c(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(Context context, ve2.e eVar, String str, String str2, String str3) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        Logger loggerB = nd2.c.b("ITCustomerAgeStatusRequest");
        loggerB.getClass();
        super(context, loggerB, str2, new URL(e5.g(ve2.f.a(eVar), "/ageRestrictions?country=", str)), str3);
        this.f151937h = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // rc2.j
    public final Object c(t13.d<? super wc2.a<tc2.d>> dVar) throws CountryCodeNotRecognizedByITException {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f151940c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f151940c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objD = aVar.f151938a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f151940c;
        if (i15 == 0) {
            o13.r.b(objD);
            aVar.f151940c = 1;
            objD = d();
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        wc2.a aVar2 = (wc2.a) objD;
        if (aVar2 instanceof wc2.a.C3415a) {
            return aVar2;
        }
        aVar2.getClass();
        T t7 = ((wc2.a.b) aVar2).f184316a;
        t7.getClass();
        String str = ((sc2.r) t7).f158564a;
        str.getClass();
        JSONArray jSONArray = new JSONArray(str);
        if (nd2.c.f125412a) {
            com.airbnb.lottie.animation.keyframe.a.w("parse\n", jSONArray.toString(4), this.f151915a);
        }
        if (jSONArray.length() == 0) {
            throw new CountryCodeNotRecognizedByITException(this.f151937h);
        }
        String string = jSONArray.getJSONObject(0).toString();
        string.getClass();
        Object objFromJson = new GsonBuilder().create().fromJson(string, (Class<Object>) tc2.d.class);
        objFromJson.getClass();
        tc2.d dVar2 = (tc2.d) objFromJson;
        dVar2.f163850a = str;
        return new wc2.a.b(dVar2, 200);
    }
}
