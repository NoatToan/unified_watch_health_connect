package jr;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Ljr/d;", "", "", "Ljr/u;", "tabs", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tabs")
    private final List<u> tabs;

    public d(List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list);
    }

    public final List<u> a() {
        return this.tabs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.tabs, ((d) obj).tabs);
    }

    public final int hashCode() {
        return this.tabs.hashCode();
    }

    public final String toString() {
        return tn.k.h("ActivityTypeConfiguration(tabs=", ")", this.tabs);
    }

    public d(List<u> list) {
        list.getClass();
        this.tabs = list;
    }

    public d() {
        this(null, 1, null);
    }
}
