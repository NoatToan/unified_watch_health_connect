package ex2;

import android.content.Context;
import c83.a0;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.Strictness;
import java.io.IOException;
import java.util.Objects;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.r0;
import p13.h0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lex2/a;", "<anonymous>", "(Lo53/b0;)Lex2/a;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.StringsHelper$fetchGSUPStringsMetaData$2", f = "StringsHelper.kt", l = {272}, m = "invokeSuspend", v = 1)
public final class p extends v13.i implements e23.p<b0, t13.d<? super ex2.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f67002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f67003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f67004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f67006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f67007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f67008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f67009h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.StringsHelper$fetchGSUPStringsMetaData$2$1", f = "StringsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f67010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f67011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f67012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f67013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r0<String> f67014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ o0 f67015f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ r0<String> f67016g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Context f67017h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, long j8, String str, String str2, r0<String> r0Var, o0 o0Var, r0<String> r0Var2, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f67010a = mVar;
            this.f67011b = j8;
            this.f67012c = str;
            this.f67013d = str2;
            this.f67014e = r0Var;
            this.f67015f = o0Var;
            this.f67016g = r0Var2;
            this.f67017h = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f67010a, this.f67011b, this.f67012c, this.f67013d, this.f67014e, this.f67015f, this.f67016g, this.f67017h, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v7, types: [T, java.lang.String] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a0<JsonObject> a0VarExecute;
            JsonObject jsonObject;
            JsonElement jsonElement;
            JsonObject asJsonObject;
            long j8 = this.f67011b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            try {
                a0VarExecute = this.f67010a.a(j8, this.f67012c).execute();
            } catch (IOException e4) {
                w.f67058a.getClass();
                cx2.h hVarE = w.e();
                String str = "fetchGSUPStringsMetaData: error getting string update version from: " + this.f67013d + ", exception: " + e4;
                Logger logger = cx2.h.f56678c;
                hVarE.d(null, str);
                a0VarExecute = null;
            }
            if (a0VarExecute == null || (jsonObject = a0VarExecute.f25746b) == null) {
                return null;
            }
            r0<String> r0Var = this.f67014e;
            o0 o0Var = this.f67015f;
            r0<String> r0Var2 = this.f67016g;
            Context context = this.f67017h;
            w wVar = w.f67058a;
            wVar.getClass();
            cx2.h hVarE2 = w.e();
            jsonObject.toString();
            hVarE2.getClass();
            JsonArray asJsonArray = jsonObject.get("updates").getAsJsonArray();
            if (asJsonArray.size() <= 0) {
                asJsonArray = null;
            }
            if (asJsonArray == null || (jsonElement = (JsonElement) h0.a0(asJsonArray)) == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) {
                return null;
            }
            try {
                r0Var.f105810a = asJsonObject.get("deliverable").getAsJsonObject().get("downloadUrl").getAsString();
                o0Var.f105806a = asJsonObject.get("version").getAsFloat();
                com.garmin.realtimesettings.app.util.a.f52669a.getClass();
                JsonElement jsonElement2 = asJsonObject.get("locale");
                if (jsonElement2 == null || jsonElement2.isJsonNull()) {
                    jsonElement2 = null;
                }
                r0Var2.f105810a = jsonElement2 != null ? jsonElement2.getAsString() : 0;
                w.a(wVar, context, j8);
            } catch (ClassCastException e14) {
                w.f67058a.getClass();
                w.e().d(null, "Unable to cast GSUP response " + e14);
            } catch (IllegalStateException e15) {
                w.f67058a.getClass();
                w.e().d(null, "Unable to parse GSUP response " + e15);
            } catch (UnsupportedOperationException e16) {
                w.f67058a.getClass();
                w.e().d(null, "Unable to parse GSUP response " + e16);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, Context context, long j8, String str2, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f67006e = str;
        this.f67007f = context;
        this.f67008g = j8;
        this.f67009h = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f67006e, this.f67007f, this.f67008g, this.f67009h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super ex2.a> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        r0 r0VarS;
        o0 o0Var;
        r0 r0Var;
        Object objE0;
        r0 r0Var2;
        r0 r0Var3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67005d;
        if (i14 == 0) {
            r0VarS = wr.g.s(obj);
            o0Var = new o0();
            o0Var.f105806a = -1.0f;
            r0Var = new r0();
            w.f67058a.getClass();
            w.e().getClass();
            String strG = tn.k.g(this.f67006e, "/api/device-software/");
            cx2.i.f56681a.getClass();
            Context context = this.f67007f;
            context.getClass();
            tw2.b.f166803b.getClass();
            if (tw2.b.a.a(context)) {
                c83.b0.b bVar = new c83.b0.b();
                bVar.b(strG);
                bVar.a(e83.a.d(new GsonBuilder().setStrictness(Strictness.LENIENT).create()));
                m mVar = (m) bVar.c().b(m.class);
                x53.c cVar = s0.f129406a;
                x53.b bVar2 = x53.b.f189152a;
                a aVar2 = new a(mVar, this.f67008g, this.f67009h, strG, r0VarS, o0Var, r0Var, this.f67007f, null);
                this.f67002a = r0VarS;
                this.f67003b = o0Var;
                this.f67004c = r0Var;
                this.f67005d = 1;
                objE0 = ge1.b.e0(bVar2, aVar2, this);
                if (objE0 == aVar) {
                    return aVar;
                }
                r0Var2 = r0VarS;
                r0Var3 = r0Var;
            } else {
                w.e().d(null, "fetchGSUPStringsMetaData: No internet. So cannot get GSUP data. Either use local storage or device fall back text.");
            }
            w.f67058a.getClass();
            cx2.h hVarE = w.e();
            T t7 = r0VarS.f105810a;
            float f14 = o0Var.f105806a;
            T t14 = r0Var.f105810a;
            Objects.toString(t7);
            Objects.toString(t14);
            hVarE.getClass();
            return new ex2.a(new Float(o0Var.f105806a), (String) r0VarS.f105810a, (String) r0Var.f105810a);
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r0Var3 = this.f67004c;
        o0 o0Var2 = this.f67003b;
        r0Var2 = this.f67002a;
        o13.r.b(obj);
        o0Var = o0Var2;
        objE0 = obj;
        r0Var = r0Var3;
        r0VarS = r0Var2;
        w.f67058a.getClass();
        cx2.h hVarE2 = w.e();
        T t15 = r0VarS.f105810a;
        float f15 = o0Var.f105806a;
        T t16 = r0Var.f105810a;
        Objects.toString(t15);
        Objects.toString(t16);
        hVarE2.getClass();
        return new ex2.a(new Float(o0Var.f105806a), (String) r0VarS.f105810a, (String) r0Var.f105810a);
    }
}
