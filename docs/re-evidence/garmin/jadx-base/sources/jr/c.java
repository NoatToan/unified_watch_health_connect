package jr;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljr/c;", "", "", "Ljr/w;", "templates", "Ljr/g;", "customPhoto", "<init>", "(Ljava/util/List;Ljr/g;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljr/g;", "()Ljr/g;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("templates")
    private final List<w> templates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("customPhoto")
    private final g customPhoto;

    public c(List list, g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? null : gVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getCustomPhoto() {
        return this.customPhoto;
    }

    public final List<w> b() {
        return this.templates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.templates, cVar.templates) && p005kotlin.jvm.internal.s.g(this.customPhoto, cVar.customPhoto);
    }

    public final int hashCode() {
        int iHashCode = this.templates.hashCode() * 31;
        g gVar = this.customPhoto;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        return "ActivityShareConfiguration(templates=" + this.templates + ", customPhoto=" + this.customPhoto + ")";
    }

    public c(List<w> list, g gVar) {
        list.getClass();
        this.templates = list;
        this.customPhoto = gVar;
    }

    public c() {
        this(null, null, 3, null);
    }
}
