package qm0;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqm0/c0;", "", "", "newsPostUuid", "Ljava/util/ArrayList;", "Ljo1/f;", "Lkotlin/collections/ArrayList;", "imageList", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<jo1.f> f145488b;

    public c0(String str, ArrayList<jo1.f> arrayList) {
        this.f145487a = str;
        this.f145488b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.f145487a, c0Var.f145487a) && p005kotlin.jvm.internal.s.g(this.f145488b, c0Var.f145488b);
    }

    public final int hashCode() {
        String str = this.f145487a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArrayList<jo1.f> arrayList = this.f145488b;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "PostImageChangedEvent(newsPostUuid=" + this.f145487a + ", imageList=" + this.f145488b + ")";
    }
}
