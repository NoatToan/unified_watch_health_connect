package li2;

import ci2.j;
import java.io.FileNotFoundException;
import ji2.h;
import ji2.i;
import ji2.w;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lli2/c;", "Lli2/f;", "Lli2/d;", "networkConfiguration", "Lli2/a;", "deviceSettingsConfiguration", "<init>", "(Lli2/d;Lli2/a;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f112912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f112913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f112914c;

    public c(d dVar, a aVar) {
        dVar.getClass();
        aVar.getClass();
        this.f112912a = dVar;
        this.f112913b = aVar;
        this.f112914c = new w(dVar, aVar);
    }

    @Override // li2.f
    public final void a(ai2.a aVar) {
        this.f112914c.b(aVar, ni2.b.SEARCH_INDEX.f126214a);
    }

    @Override // li2.f
    public final void b(String str, ni2.c cVar, boolean z14) {
        if (str.equals(ni2.b.DEVICE.f126214a) || str.equals(ni2.b.RTS_WALK_STRIDE_LENGTH.f126214a) || str.equals(ni2.b.RTS_GOALS_DAILY_STEPS.f126214a) || str.equals(ni2.b.RTS_GOALS_FLOORS.f126214a) || str.equals(ni2.b.RTS_GOALS_WEEKLY_INTENSITY.f126214a)) {
            h.f98854a.getClass();
            h.a.f98857c.clear();
            h.a.f98856b.clear();
            h.a.f98858d = null;
            mi2.b.f118988b.getClass();
            mi2.b.f118989c = null;
            mi2.d.f118991b.getClass();
            mi2.d.f118992c = null;
        }
    }

    @Override // li2.f
    public final void c(String str, ni2.c cVar, j jVar) {
        Unit unit;
        if (new JSONObject(cVar.f126219c).length() == 0) {
            jVar.a();
            return;
        }
        i.f98859a.getClass();
        h hVarA = i.a.a(this.f112912a, this.f112913b, str);
        if (hVarA != null) {
            hVarA.a(cVar, new b(jVar, str, cVar));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            jVar.b("Did not find save loader", new NullPointerException());
        }
    }

    @Override // li2.f
    public final void d(String str, ai2.e.a aVar) {
        Unit unit;
        str.getClass();
        i.f98859a.getClass();
        String strB = i.a.b(str);
        h.f98854a.getClass();
        String str2 = (String) h.a.f98857c.get(strB);
        if (strB != null && str2 != null && str2.length() != 0) {
            aVar.onSuccess(str2);
            return;
        }
        h hVarA = i.a.a(this.f112912a, this.f112913b, str);
        if (hVarA != null) {
            if (strB != null) {
                str = strB;
            }
            hVarA.b(str, aVar);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            aVar.b("_Did not find loader to fetch data", new FileNotFoundException());
        }
    }

    @Override // li2.f
    public final void e(String str, ai2.c cVar) {
        str.getClass();
        this.f112914c.b(cVar, str);
    }
}
