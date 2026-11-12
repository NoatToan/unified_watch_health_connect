package fl;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import e23.l;
import java.util.HashMap;
import kc2.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import vb.h;
import yt2.d;
import yt2.f;
import yt2.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB%\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lfl/a;", "", "", "eventName", "Lkotlin/Function1;", "Lyt2/g;", "Lkc2/a;", "clientInfoFunc", "<init>", "(Ljava/lang/String;Le23/l;)V", "(Ljava/lang/String;)V", "b", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f71948d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<g, kc2.a> f71950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, Object> f71951c;

    /* JADX INFO: renamed from: fl.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C1464a extends q implements l<g, kc2.a> {
        public C1464a(Object obj) {
            super(1, obj, b.class, "createClientInfo", "createClientInfo(Lcom/garmin/net/omtanalytics/OmtClientInfo;)Lcom/garmin/android/lib/garminmobileanalytics/dto/ClientInfo;", 0);
        }

        @Override // e23.l
        public final kc2.a invoke(g gVar) {
            g gVar2 = gVar;
            gVar2.getClass();
            ((b) this.receiver).getClass();
            return new kc2.a(gVar2.f199677c, gVar2.f199675a, gVar2.f199676b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, l<? super g, kc2.a> lVar) {
        str.getClass();
        lVar.getClass();
        this.f71949a = str;
        this.f71950b = lVar;
        this.f71951c = new HashMap<>();
    }

    public final zk.a a() {
        f.f199669a.getClass();
        yt2.a aVar = f.f199670b;
        if (aVar != null) {
            return b(aVar);
        }
        return null;
    }

    public zk.a b(d dVar) {
        String strName;
        NetworkInfo.State state;
        dVar.getClass();
        HashMap<String, Object> map = this.f71951c;
        if (!map.containsKey("UnitInfo")) {
            h.s("Missing UnitInfo");
            return null;
        }
        map.put("ClientInfo", this.f71950b.invoke(dVar.d()));
        map.put("IsBackground", Boolean.valueOf(!dVar.a()));
        ConnectivityManager connectivityManager = (ConnectivityManager) dVar.getF199650a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || (state = activeNetworkInfo.getState()) == null || (strName = state.name()) == null) {
            strName = NetworkInfo.State.UNKNOWN.name();
        }
        String typeName = activeNetworkInfo != null ? activeNetworkInfo.getTypeName() : null;
        if (typeName == null) {
            typeName = "";
        }
        String subtypeName = activeNetworkInfo != null ? activeNetworkInfo.getSubtypeName() : null;
        map.put("NetworkInfo", new e(strName, typeName, subtypeName != null ? subtypeName : ""));
        zk.a aVar = new zk.a(this.f71949a, map, 0L, 4, null);
        aVar.f205031c = false;
        return aVar;
    }

    public final void c(kc2.b bVar) {
        bVar.getClass();
        f71948d.getClass();
        b.a(bVar);
        this.f71951c.put("ErrorInfo", bVar);
    }

    public final void d(jc2.f fVar) {
        fVar.getClass();
        String str = fVar.jsonValue;
        str.getClass();
        this.f71951c.put("Result", str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lfl/a$b;", "", "<init>", "()V", "", "ATTRIBUTE_CLIENT_INFO", "Ljava/lang/String;", "ATTRIBUTE_ERROR_INFO", "ATTRIBUTE_IS_BACKGROUND", "ATTRIBUTE_LIBRARY_VERSION", "ATTRIBUTE_NETWORK_INFO", "ATTRIBUTE_RESULT", "ATTRIBUTE_UNIT_INFO", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        public static void a(kc2.b bVar) {
            bVar.getClass();
            com.garmin.android.lib.garminmobileanalytics.b.a aVar = com.garmin.android.lib.garminmobileanalytics.b.f49927a;
            String errorMessage = bVar.getErrorMessage();
            aVar.getClass();
            bVar.j(com.garmin.android.lib.garminmobileanalytics.b.a.a(errorMessage));
            bVar.i(com.garmin.android.lib.garminmobileanalytics.b.a.a(bVar.getErrorGroupName()));
            bVar.k(com.garmin.android.lib.garminmobileanalytics.b.a.a(bVar.getErrorStackTrace()));
            bVar.m(com.garmin.android.lib.garminmobileanalytics.b.a.a(bVar.getErrorType()));
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(str, new C1464a(f71948d));
        str.getClass();
    }
}
