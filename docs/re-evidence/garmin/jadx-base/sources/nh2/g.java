package nh2;

import e23.p;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import mt0.b2;
import o13.r;
import o53.b0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p13.h0;
import q03.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.datalayer.SettingsDataModel$getComposition$1$1", f = "SettingsDataModel.kt", l = {}, m = "invokeSuspend")
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f126181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f126182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s<List<Map<String, Object>>> f126183c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"nh2/g$a", "Lni2/a;", "Lorg/json/JSONObject;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements ni2.a<JSONObject> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f126184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s<List<Map<String, Object>>> f126185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f126186c;

        public a(d dVar, s<List<Map<String, Object>>> sVar, m0 m0Var, String str) {
            this.f126184a = dVar;
            this.f126185b = sVar;
            this.f126186c = m0Var;
        }

        @Override // ni2.a
        public final void a() {
            s<List<Map<String, Object>>> sVar = this.f126185b;
            boolean zB = ((e13.a.C1312a) sVar).b();
            d dVar = this.f126184a;
            if (zB) {
                dVar.f126161a.getClass();
                return;
            }
            dVar.f126161a.getClass();
            ((e13.a.C1312a) sVar).a(new NullPointerException());
        }

        @Override // ni2.a
        public final void b(String str, Throwable th3) {
            th3.getClass();
            s<List<Map<String, Object>>> sVar = this.f126185b;
            boolean zB = ((e13.a.C1312a) sVar).b();
            d dVar = this.f126184a;
            if (zB) {
                dVar.f126161a.getClass();
            } else {
                dVar.f126161a.getClass();
                ((e13.a.C1312a) sVar).a(th3);
            }
        }

        @Override // ni2.a
        public final void onSuccess(JSONObject jSONObject) {
            Unit unit;
            Unit unit2;
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.getClass();
            d dVar = this.f126184a;
            hi2.d dVar2 = dVar.f126161a;
            jSONObject2.toString();
            dVar2.getClass();
            Object objOpt = jSONObject2.opt(mh2.i.SETTINGS.f118617a);
            mh2.a aVar = null;
            if (objOpt != null) {
                com.garmin.androiddynamicsettings.app.util.a.f50704a.getClass();
                dVar.f126167g = h0.d1(com.garmin.androiddynamicsettings.app.util.a.C1021a.b(objOpt));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                dVar2.getClass();
            }
            Object objOpt2 = jSONObject2.opt(mh2.i.MENU_ITEMS.f118617a);
            if (objOpt2 != null) {
                com.garmin.androiddynamicsettings.app.util.a.f50704a.getClass();
                dVar.f126170j = h0.d1(com.garmin.androiddynamicsettings.app.util.a.C1021a.b(objOpt2));
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                dVar2.getClass();
            }
            String strOptString = jSONObject2.optString(mh2.i.TITLE.f118617a);
            strOptString.getClass();
            if (strOptString.length() <= 0) {
                strOptString = null;
            }
            dVar.f126164d = strOptString;
            boolean zOptBoolean = jSONObject2.optBoolean(mh2.i.SHOW_SEARCH.f118617a, false);
            m0 m0Var = this.f126186c;
            m0Var.f105804a = zOptBoolean;
            String strOptString2 = jSONObject2.optString(mh2.i.ACTION_BAR_SAVE_TYPE.f118617a);
            for (mh2.a aVar2 : mh2.a.values()) {
                if (p005kotlin.jvm.internal.s.g(aVar2.f118530a, strOptString2)) {
                    aVar = aVar2;
                    break;
                }
            }
            if (aVar == null) {
                dVar2.getClass();
            } else {
                dVar.f126165e = aVar;
            }
            s<List<Map<String, Object>>> sVar = this.f126185b;
            e13.a.C1312a c1312a = (e13.a.C1312a) sVar;
            if (c1312a.b() || dVar.f126167g.isEmpty()) {
                c1312a.a(new Throwable("getComposition: Either this Single is disposed or viewAttrs is empty"));
                return;
            }
            dVar2.getClass();
            boolean z14 = m0Var.f105804a;
            List<Map<String, Object>> list = dVar.f126167g;
            if (!z14) {
                c1312a.c(list);
                return;
            }
            sVar.getClass();
            b bVar = new b(dVar, 2);
            int i14 = w03.b.f181178a;
            dVar.f126163c = new e13.d(new e13.a(bVar).j(l13.a.f108327b).g(r03.a.a()), new b(dVar, 1)).h(new b2(new e(dVar, sVar, list), 17), new b2(new f(dVar, sVar, list), 18));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, d dVar, s<List<Map<String, Object>>> sVar, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f126181a = str;
        this.f126182b = dVar;
        this.f126183c = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f126181a, this.f126182b, this.f126183c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        m0 m0Var = new m0();
        ai2.d dVar = new ai2.d();
        d dVar2 = this.f126182b;
        s<List<Map<String, Object>>> sVar = this.f126183c;
        String str = this.f126181a;
        a aVar2 = new a(dVar2, sVar, m0Var, str);
        str.getClass();
        String strConcat = "getComposition: Requesting UI composition for -> ".concat(str);
        hi2.d dVar3 = dVar.f3316a;
        dVar3.a(strConcat);
        try {
            zh2.e.f204807a.getClass();
            zh2.e.b().e(str, new ai2.c(dVar, aVar2));
        } catch (FileNotFoundException e4) {
            dVar3.b("section not found: " + e4);
            aVar2.b(null, e4);
        }
        return Unit.INSTANCE;
    }
}
