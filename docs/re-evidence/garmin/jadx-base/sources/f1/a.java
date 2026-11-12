package f1;

import androidx.camera.core.impl.f1;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1.c f67781c;

    public static final class b extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f67782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f67783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f1.c f67784c;
    }

    private a(String str, int i14, f1.c cVar) {
        this.f67779a = str;
        this.f67780b = i14;
        this.f67781c = cVar;
    }

    @Override // f1.c
    public final String a() {
        return this.f67779a;
    }

    @Override // f1.c
    public final int b() {
        return this.f67780b;
    }

    @Override // f1.g
    public final f1.c c() {
        return this.f67781c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f67779a.equals(gVar.a()) || this.f67780b != gVar.b()) {
            return false;
        }
        f1.c cVar = this.f67781c;
        if (cVar == null) {
            return gVar.c() == null;
        }
        return cVar.equals(gVar.c());
    }

    public final int hashCode() {
        int iHashCode = (((this.f67779a.hashCode() ^ 1000003) * 1000003) ^ this.f67780b) * 1000003;
        f1.c cVar = this.f67781c;
        return iHashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f67779a + ", profile=" + this.f67780b + ", compatibleVideoProfile=" + this.f67781c + StringSubstitutor.DEFAULT_VAR_END;
    }
}
