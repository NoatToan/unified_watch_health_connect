package androidx.media3.exoplayer;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.q f8977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.q f8978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8980e;

    public h(String str, androidx.media3.common.q qVar, androidx.media3.common.q qVar2, int i14, int i15) {
        fa.a.a(i14 == 0 || i15 == 0);
        if (TextUtils.isEmpty(str)) {
            vb.h.w();
            throw null;
        }
        this.f8976a = str;
        qVar.getClass();
        this.f8977b = qVar;
        qVar2.getClass();
        this.f8978c = qVar2;
        this.f8979d = i14;
        this.f8980e = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f8979d == hVar.f8979d && this.f8980e == hVar.f8980e && this.f8976a.equals(hVar.f8976a) && this.f8977b.equals(hVar.f8977b) && this.f8978c.equals(hVar.f8978c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8978c.hashCode() + ((this.f8977b.hashCode() + wr.g.j((((527 + this.f8979d) * 31) + this.f8980e) * 31, 31, this.f8976a)) * 31);
    }
}
