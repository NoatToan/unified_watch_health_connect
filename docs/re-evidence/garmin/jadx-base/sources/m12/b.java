package m12;

import com.google.gson.Gson;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm12/b;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f115791a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Gson f115792b = new Gson();

    private b() {
    }

    public static nj1.e a(nj1.e eVar) {
        if (eVar == null) {
            return null;
        }
        Gson gson = f115792b;
        return (nj1.e) gson.fromJson(gson.toJson(eVar, nj1.e.class), nj1.e.class);
    }
}
