package ji2;

import com.garmin.androiddynamicsettings.networklayer.util.DynamicSettingsException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import org.joda.time.DateTime;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lji2/a0;", "Lji2/h;", "Lli2/d;", "networkConfiguration", "Lmi2/b;", "settingsRetrofitBuilder", "<init>", "(Lli2/d;Lmi2/b;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mi2.b f98830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f98831c;

    static {
        new a(null);
    }

    public a0(li2.d dVar, mi2.b bVar) {
        dVar.getClass();
        bVar.getClass();
        this.f98830b = bVar;
        this.f98831c = new hi2.d("DSL-UserSettingsLoader", null, 2, null);
    }

    @Override // ji2.h
    public final void a(ni2.c cVar, li2.b bVar) {
        String string;
        String str = cVar.f126219c;
        int length = str.length();
        hi2.d dVar = this.f98831c;
        if (length <= 0) {
            dVar.getClass();
            bVar.a();
            return;
        }
        dVar.getClass();
        JSONObject jSONObject = new JSONObject(str);
        String strDecode = "";
        try {
            Object objRemove = jSONObject.remove("criticalSwimSpeed");
            if (objRemove == null || (string = objRemove.toString()) == null) {
                string = "";
            }
            ki2.f.f104922a.getClass();
            strDecode = ki2.f.a.a(null, "criticalSwimSpeed").decode(string);
        } catch (Exception e4) {
            dVar.b("getUpdatedCriticalSwimSpeed: failed " + e4 + ".");
        }
        int length2 = jSONObject.length();
        mi2.b bVar2 = this.f98830b;
        if (length2 > 0) {
            String string2 = jSONObject.toString();
            string2.getClass();
            bVar2.getClass();
            bVar2.f118990a.o(string2).q0(new e0(this, bVar));
        }
        if (strDecode.length() > 0) {
            bVar2.getClass();
            bVar2.f118990a.k(strDecode).q0(new d0(this, bVar));
        }
    }

    @Override // ji2.h
    public final void b(String str, ai2.e.a aVar) {
        mi2.b bVar = this.f98830b;
        hi2.d dVar = this.f98831c;
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            bVar.f118990a.getUserSettings().q0(new b0(this, countDownLatch, concurrentHashMap));
        } catch (Exception e4) {
            dVar.b("fetchUserData: Exception " + e4);
            countDownLatch.countDown();
        }
        try {
            hi2.b.a aVar2 = hi2.b.f83885a;
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            aVar2.getClass();
            String str2 = hi2.b.f83887c.format(dateTimeNow.toDate());
            str2.getClass();
            bVar.getClass();
            bVar.f118990a.l(str2).q0(new c0(this, countDownLatch, concurrentHashMap));
        } catch (Exception e14) {
            dVar.b("fetchCriticalSwimSpeed: Exception " + e14);
            countDownLatch.countDown();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            dVar.b("fetchUserSettingsData: Interrupted exception");
            Thread.currentThread().interrupt();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(concurrentHashMap);
        try {
            if (linkedHashMap.get("userData") == null) {
                dVar.b("fetchUserSettingsData: Failed to fetch user settings.");
                aVar.b(null, new DynamicSettingsException("Failed to fetch user settings"));
                return;
            }
            ki2.f.f104922a.getClass();
            JSONObject jSONObject = new JSONObject(ki2.f.a.a(null, "userData").encode(String.valueOf(linkedHashMap.remove("userData"))));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getValue();
                if (str3 != null) {
                    String str4 = (String) entry.getKey();
                    ki2.f.a aVar3 = ki2.f.f104922a;
                    String str5 = (String) entry.getKey();
                    aVar3.getClass();
                    jSONObject.put(str4, ki2.f.a.a(null, str5).encode(str3));
                }
            }
            String string = jSONObject.toString();
            string.getClass();
            if (string.length() > 0) {
                dVar.getClass();
                h.f98854a.getClass();
                h.a.f98857c.put(str, jSONObject.toString());
            }
            String string2 = jSONObject.toString();
            string2.getClass();
            aVar.onSuccess(string2);
        } catch (Exception e15) {
            dVar.b("fetchUserSettingsData: Failed to fetch data with exception " + e15 + ".");
            aVar.b(null, e15);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lji2/a0$a;", "", "<init>", "()V", "", "USER_DATA", "Ljava/lang/String;", "", "USER_SETTINGS_LATCH_COUNT", "I", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ a0(li2.d dVar, mi2.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, (i14 & 2) != 0 ? mi2.b.f118988b.a(dVar) : bVar);
    }
}
