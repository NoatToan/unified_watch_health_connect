package ai2;

import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lai2/c;", "Lni2/a;", "", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements ni2.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f3314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ni2.a<JSONObject> f3315b;

    public c(d dVar, ni2.a<JSONObject> aVar) {
        this.f3314a = dVar;
        this.f3315b = aVar;
    }

    @Override // ni2.a
    public final void a() {
        this.f3314a.f3316a.b("getComposition: Received void ");
        this.f3315b.b("Cannot be empty", new NullPointerException());
    }

    @Override // ni2.a
    public final void b(String str, Throwable th3) {
        th3.getClass();
        this.f3314a.f3316a.getClass();
        this.f3315b.b(str, th3);
    }

    @Override // ni2.a
    public final void onSuccess(String str) {
        String str2 = str;
        ni2.a<JSONObject> aVar = this.f3315b;
        d dVar = this.f3314a;
        str2.getClass();
        try {
            dVar.f3316a.getClass();
            aVar.onSuccess(new JSONObject(str2));
        } catch (Exception e4) {
            dVar.f3316a.b("getComposition: Received throwable - " + e4);
            aVar.b(null, e4);
        }
    }
}
