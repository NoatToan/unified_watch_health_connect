package db;

import fa.r;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58958a;

    private h(String str) {
        this.f58958a = str;
    }

    public static h a(r rVar) {
        return new h(rVar.s(rVar.a(), StandardCharsets.UTF_8));
    }

    @Override // db.a
    public final int getType() {
        return 1852994675;
    }
}
