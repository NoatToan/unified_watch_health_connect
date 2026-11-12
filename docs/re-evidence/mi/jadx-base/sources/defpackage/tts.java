package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class tts implements ots {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ots f35037a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static tts f35038a = new tts();
    }

    public static tts c() {
        return a.f35038a;
    }

    @Override // defpackage.ots
    public void a(mts mtsVar) {
        ots otsVar = this.f35037a;
        if (otsVar != null) {
            otsVar.a(mtsVar);
        }
    }

    @Override // defpackage.ots
    public void b(String str, Map<String, Object> map) {
        ots otsVar = this.f35037a;
        if (otsVar != null) {
            otsVar.b(str, map);
        }
    }

    public tts() {
    }
}
