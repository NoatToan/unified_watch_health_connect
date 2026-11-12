package rc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.lib.networking.authentication.model.customerage.GsonIso8601LongAgeDateDeserializer;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.net.URL;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lrc2/r;", "Lrc2/i;", "Ltc2/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "customerGUID", "it2AccessToken", "thisAppITClientIdLoggingOnly", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends i<tc2.c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f151943h = new a(null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.lib.networking.authentication.itapi.ITCustomerAgeStatusRequest", f = "ITCustomerAgeStatusRequest.kt", l = {92}, m = "execute$networking_core_release")
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f151944a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f151946c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f151944a = obj;
            this.f151946c |= Integer.MIN_VALUE;
            return r.this.c(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(Context context, ve2.e eVar, String str, String str2, String str3) {
        context.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        Logger loggerB = nd2.c.b("ITCustomerAgeStatusRequest");
        loggerB.getClass();
        super(context, loggerB, str2, new URL(com.nimbusds.jose.shaded.gson.internal.a.h(ve2.f.a(eVar), "/customers/", str, "/ageStatus")), str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // rc2.j
    public final Object c(t13.d<? super wc2.a<tc2.c>> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f151946c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f151946c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objD = bVar.f151944a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f151946c;
        if (i15 == 0) {
            o13.r.b(objD);
            bVar.f151946c = 1;
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
        wc2.a aVar = (wc2.a) objD;
        if (aVar instanceof wc2.a.C3415a) {
            return aVar;
        }
        aVar.getClass();
        T t7 = ((wc2.a.b) aVar).f184316a;
        t7.getClass();
        String str = ((sc2.r) t7).f158564a;
        str.getClass();
        if (nd2.c.f125412a) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f151915a.debug("parse\n" + jSONObject.toString(4));
            } catch (Exception unused) {
            }
        }
        f151943h.getClass();
        tc2.c cVarA = a.a(str);
        cVarA.f163844a = str;
        return new wc2.a.b(cVarA, 200);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrc2/r$a;", "", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: rc2.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"rc2/r$a$a", "Lcom/google/gson/reflect/TypeToken;", "", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C2858a extends TypeToken<Long> {
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static tc2.c a(String str) {
            Object objFromJson = new GsonBuilder().registerTypeAdapter(Long.TYPE, new GsonIso8601LongAgeDateDeserializer()).registerTypeAdapter(new C2858a().getType(), new GsonIso8601LongAgeDateDeserializer()).serializeNulls().create().fromJson(str, (Class<Object>) tc2.c.class);
            objFromJson.getClass();
            return (tc2.c) objFromJson;
        }

        private a() {
        }
    }
}
