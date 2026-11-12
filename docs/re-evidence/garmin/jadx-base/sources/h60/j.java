package h60;

import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lh60/j;", "", "", "showDeleteDialog", "Lg60/b;", "selectedCssToDelete", "Lfw/j;", "deleteErrorType", "<init>", "(ZLg60/b;Lfw/j;)V", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g60.b f82194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fw.j f82195c;

    static {
        Parcelable.Creator<g60.b> creator = g60.b.CREATOR;
    }

    public /* synthetic */ j(boolean z14, g60.b bVar, fw.j jVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : jVar);
    }

    public static j a(j jVar, g60.b bVar, fw.j jVar2, int i14) {
        boolean z14 = jVar.f82193a;
        if ((i14 & 2) != 0) {
            bVar = jVar.f82194b;
        }
        if ((i14 & 4) != 0) {
            jVar2 = jVar.f82195c;
        }
        jVar.getClass();
        return new j(z14, bVar, jVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f82193a == jVar.f82193a && s.g(this.f82194b, jVar.f82194b) && s.g(this.f82195c, jVar.f82195c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f82193a) * 31;
        g60.b bVar = this.f82194b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        fw.j jVar = this.f82195c;
        return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "UiState(showDeleteDialog=" + this.f82193a + ", selectedCssToDelete=" + this.f82194b + ", deleteErrorType=" + this.f82195c + ")";
    }

    public j(boolean z14, g60.b bVar, fw.j jVar) {
        this.f82193a = z14;
        this.f82194b = bVar;
        this.f82195c = jVar;
    }

    public j() {
        this(false, null, null, 7, null);
    }
}
