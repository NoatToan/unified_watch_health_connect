package ji2;

import java.io.FileNotFoundException;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lji2/w;", "", "Lli2/d;", "networkConfiguration", "Lli2/a;", "deviceSettingsConfiguration", "<init>", "(Lli2/d;Lli2/a;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi2.d f98897c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final li2.a f98898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mi2.d f98899b;

    static {
        new a(null);
        f98897c = new hi2.d("DSL-UICompositionLoader", null, 2, null);
    }

    public w(li2.d dVar, li2.a aVar) {
        mi2.d dVar2;
        dVar.getClass();
        aVar.getClass();
        this.f98898a = aVar;
        synchronized (mi2.d.f118991b) {
            dVar2 = mi2.d.f118992c;
            if (dVar2 == null) {
                dVar2 = new mi2.d(dVar, null);
                mi2.d.f118992c = dVar2;
            }
        }
        this.f98899b = dVar2;
    }

    public static String c(String str, String str2, String str3) {
        return j20.x.d(d53.w.R(str2, ".json"), "/", str, "/", str3);
    }

    public final void a(String str, String str2, String str3, String str4, ni2.a<String> aVar) {
        boolean zG = p005kotlin.jvm.internal.s.g(str3, ni2.b.SEARCH_INDEX.f126214a);
        mi2.d dVar = this.f98899b;
        if (zG) {
            try {
                String strC = c(str, str2, str4);
                dVar.getClass();
                dVar.f118993a.b(strC).q0(new y(aVar, str3));
                return;
            } catch (IOException e4) {
                aVar.b("Something went wrong", e4);
                return;
            }
        }
        try {
            String strC2 = c(str, str2, str4);
            dVar.getClass();
            dVar.f118993a.a(strC2).q0(new z(aVar, str3));
        } catch (IOException e14) {
            aVar.b("Something went wrong", e14);
        }
    }

    public final void b(ni2.a aVar, String str) {
        w wVar;
        ni2.a aVar2;
        String str2;
        Unit unit;
        str.getClass();
        h.f98854a.getClass();
        String str3 = (String) h.a.f98856b.get(str);
        hi2.d dVar = f98897c;
        if (str3 != null && str3.length() != 0) {
            dVar.getClass();
            aVar.onSuccess(str3);
            return;
        }
        dVar.getClass();
        for (ni2.b bVar : ni2.b.values()) {
            if (p005kotlin.jvm.internal.s.g(bVar.f126214a, str)) {
                li2.a aVar3 = this.f98898a;
                String str4 = aVar3.f112901b;
                String str5 = aVar3.f112902c;
                h.f98854a.getClass();
                String str6 = h.a.f98858d;
                if (str6 != null) {
                    wVar = this;
                    str2 = str;
                    wVar.a(str6, str4, str2, bVar.f126216c, aVar);
                    aVar2 = aVar;
                    unit = Unit.INSTANCE;
                } else {
                    wVar = this;
                    aVar2 = aVar;
                    str2 = str;
                    unit = null;
                }
                if (unit == null) {
                    String str7 = bVar.f126216c;
                    try {
                        String strConcat = d53.w.R(str4, ".json").concat("/config.json");
                        mi2.d dVar2 = wVar.f98899b;
                        dVar2.getClass();
                        dVar2.f118993a.a(strConcat).q0(new x(aVar2, this, str5, str4, str2, str7));
                        return;
                    } catch (IOException e4) {
                        aVar2.b("Something went wrong", e4);
                        return;
                    }
                }
                return;
            }
        }
        throw new FileNotFoundException(am.j.m("Section ", str, " was not found!"));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lji2/w$a;", "", "<init>", "()V", "", "SUFFIX_JSON", "Ljava/lang/String;", "VERSIONS", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
