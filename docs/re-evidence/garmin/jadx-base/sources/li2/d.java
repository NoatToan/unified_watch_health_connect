package li2;

import am.j;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lli2/d;", "", "Lokhttp3/OkHttpClient;", "httpClient", "", "baseURL", "staticURL", "<init>", "(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f112915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112917c;

    public d(OkHttpClient okHttpClient, String str, String str2) {
        okHttpClient.getClass();
        str.getClass();
        str2.getClass();
        this.f112915a = okHttpClient;
        this.f112916b = str;
        this.f112917c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f112915a.equals(dVar.f112915a) && this.f112916b.equals(dVar.f112916b) && this.f112917c.equals(dVar.f112917c);
    }

    public final int hashCode() {
        return this.f112917c.hashCode() + g.j(this.f112915a.hashCode() * 31, 31, this.f112916b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NetworkConfiguration(httpClient=");
        sb3.append(this.f112915a);
        sb3.append(", baseURL=");
        sb3.append(this.f112916b);
        sb3.append(", staticURL=");
        return j.o(this.f112917c, ")", sb3);
    }
}
