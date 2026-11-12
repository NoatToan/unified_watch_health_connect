package ji2;

import com.google.firebase.perf.util.Constants;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lji2/c;", "Lji2/h;", "Lli2/d;", "networkConfiguration", "Lli2/a;", "deviceSettingsConfiguration", "<init>", "(Lli2/d;Lli2/a;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hi2.d f98838d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final li2.a f98839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mi2.b f98840c;

    static {
        new a(null);
        f98838d = new hi2.d("DSL-CustomStrideLoader", null, 2, null);
    }

    public c(li2.d dVar, li2.a aVar) {
        dVar.getClass();
        aVar.getClass();
        this.f98839b = aVar;
        this.f98840c = mi2.b.f118988b.a(dVar);
    }

    @Override // ji2.h
    public final void a(ni2.c cVar, li2.b bVar) {
        String str = cVar.f126218b;
        String strDecode = cVar.f126219c;
        int length = new JSONObject(strDecode).length();
        hi2.d dVar = f98838d;
        if (length <= 0) {
            dVar.getClass();
            bVar.a();
            return;
        }
        JSONObject jSONObject = new JSONObject(cVar.f126217a);
        JSONObject jSONObject2 = new JSONObject(str);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("walking");
        Boolean boolValueOf = jSONObjectOptJSONObject != null ? Boolean.valueOf(jSONObjectOptJSONObject.optBoolean(Constants.ENABLE_DISABLE, false)) : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("walking");
        Boolean boolValueOf2 = jSONObjectOptJSONObject2 != null ? Boolean.valueOf(jSONObjectOptJSONObject2.optBoolean(Constants.ENABLE_DISABLE, false)) : null;
        if (new JSONObject(strDecode).length() > 0) {
            ki2.f.f104922a.getClass();
            strDecode = ki2.f.a.a(this.f98839b, "walking").decode(str);
        }
        boolean zIsNull = new JSONObject(strDecode).isNull("stepLength");
        if (boolValueOf == null || boolValueOf2 == null) {
            return;
        }
        boolean zEquals = boolValueOf.equals(boolValueOf2);
        mi2.b bVar2 = this.f98840c;
        if (zEquals) {
            dVar.getClass();
            if (zIsNull) {
                bVar.a();
                return;
            } else {
                bVar2.getClass();
                bVar2.f118990a.e(strDecode).q0(new e(bVar));
                return;
            }
        }
        if (boolValueOf.booleanValue() && !boolValueOf2.booleanValue()) {
            dVar.getClass();
            bVar2.f118990a.g().q0(new f(bVar));
            return;
        }
        if (boolValueOf.booleanValue() || !boolValueOf2.booleanValue()) {
            dVar.getClass();
            bVar.a();
            return;
        }
        dVar.getClass();
        if (zIsNull) {
            bVar.a();
        } else {
            bVar2.getClass();
            bVar2.f118990a.j(strDecode).q0(new g(bVar));
        }
    }

    @Override // ji2.h
    public final void b(String str, ai2.e.a aVar) {
        try {
            this.f98840c.f118990a.q().q0(new d(aVar, this, str));
        } catch (Exception unused) {
            f98838d.b("onDataLoaded: Exception");
            aVar.b(null, new Exception("No data"));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lji2/c$a;", "", "<init>", "()V", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
