package ji2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lji2/j;", "Lji2/h;", "Lli2/d;", "networkConfiguration", "Lli2/a;", "deviceSettingsConfiguration", "<init>", "(Lli2/d;Lli2/a;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hi2.d f98861f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final li2.a f98862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mi2.b f98863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f98864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f98865e;

    static {
        new a(null);
        f98861f = new hi2.d("DSL-DeviceSettingsDataLoader", null, 2, null);
    }

    public j(li2.d dVar, li2.a aVar) {
        dVar.getClass();
        aVar.getClass();
        this.f98862b = aVar;
        this.f98863c = mi2.b.f118988b.a(dVar);
        this.f98864d = Executors.newSingleThreadExecutor();
        this.f98865e = DateTimeFormat.forPattern("yyyy-MM-dd").print(DateTime.now());
    }

    @Override // ji2.h
    public final void a(ni2.c cVar, li2.b bVar) {
        this.f98864d.execute(new fh2.a(cVar.f126219c, 9, this, bVar));
    }

    @Override // ji2.h
    public final void b(String str, ai2.e.a aVar) {
        this.f98864d.execute(new fh2.a(this, 10, str, aVar));
    }

    public final String c(JSONObject jSONObject, String str) {
        String string;
        ki2.a aVar;
        try {
            Object objRemove = jSONObject.remove(str);
            if (objRemove == null || (string = objRemove.toString()) == null) {
                string = "";
            }
            ki2.f.a aVar2 = ki2.f.f104922a;
            li2.a aVar3 = this.f98862b;
            aVar2.getClass();
            try {
                aVar = (ki2.a) ki2.f.a.a(aVar3, str);
            } catch (ClassCastException unused) {
                aVar = null;
            }
            return aVar != null ? string : "";
        } catch (Exception e4) {
            f98861f.b("getUpdatedActivityOptionsData: failed " + e4 + ".");
            return "";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lji2/j$a;", "", "<init>", "()V", "", "DEVICE_SETTINGS_LATCH_COUNT", "I", "", "INTENSITY_MINUTES_CALC_METHOD", "Ljava/lang/String;", "INTENSITY_MINUTES_CALC_METHOD_SRVR", "MODERATE_INTENSITY_MINUTES_HR_ZONE", "USER_DATA", "VIGOROUS_INTENSITY_MINUTES_HR_ZONE", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
