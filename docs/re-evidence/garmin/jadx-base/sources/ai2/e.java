package ai2;

import java.io.FileNotFoundException;
import java.util.HashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lai2/e;", "", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi2.d f3317a = new hi2.d("UIDataLoader", null, 2, 0 == true ? 1 : 0);

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ai2/e$a", "Lni2/a;", "", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements ni2.a<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ni2.a<HashMap<String, Object>> f3320c;

        public a(String str, ni2.a<HashMap<String, Object>> aVar) {
            this.f3319b = str;
            this.f3320c = aVar;
        }

        @Override // ni2.a
        public final void a() {
            e.this.f3317a.b("getDataValues: Received void ");
            this.f3320c.b("Cannot be empty", new NullPointerException());
        }

        @Override // ni2.a
        public final void b(String str, Throwable th3) {
            th3.getClass();
            e.this.f3317a.b("Consuming app exception: " + str);
            this.f3320c.b(str, th3);
        }

        @Override // ni2.a
        public final void onSuccess(String str) {
            String str2 = str;
            ni2.a<HashMap<String, Object>> aVar = this.f3320c;
            String str3 = this.f3319b;
            e eVar = e.this;
            str2.getClass();
            try {
                com.garmin.androiddynamicsettings.app.util.a.f50704a.getClass();
                HashMap mapC = com.garmin.androiddynamicsettings.app.util.a.C1021a.c(str2);
                HashMap<String, Object> mapC2 = com.garmin.androiddynamicsettings.app.util.a.C1021a.c(str2);
                eVar.f3317a.a("getDataValues: Received data values for " + str3);
                zh2.e.f204807a.getClass();
                nh2.a aVar2 = zh2.e.f204811e;
                aVar2.getClass();
                str3.getClass();
                aVar2.f126155a.put(str3, mapC);
                aVar.onSuccess(mapC2);
            } catch (Exception e4) {
                eVar.f3317a.b("Failed to parse JSON into dictionaries: " + e4);
                aVar.b(null, e4);
            }
        }
    }

    public final void a(ni2.a aVar, String str) {
        str.getClass();
        String strConcat = "getDataValues: Requesting Data Values for -> ".concat(str);
        hi2.d dVar = this.f3317a;
        dVar.a(strConcat);
        try {
            zh2.e.f204807a.getClass();
            zh2.e.b().d(str, new a(str, aVar));
        } catch (FileNotFoundException e4) {
            dVar.b("section not found: " + e4);
            aVar.b(null, e4);
        }
    }
}
