package yq0;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyq0/c;", "", "", "isLoading", "Lyq0/b;", "searchFilters", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(ZLyq0/b;Z)V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f198738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f198739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f198740c;

    public /* synthetic */ c(boolean z14, b bVar, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? new b(null, null, null, null, null, 31, null) : bVar, (i14 & 4) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f198738a == cVar.f198738a && s.g(this.f198739b, cVar.f198739b) && this.f198740c == cVar.f198740c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198740c) + ((this.f198739b.hashCode() + (Boolean.hashCode(this.f198738a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InsightsDemographicFiltersUiState(isLoading=");
        sb3.append(this.f198738a);
        sb3.append(", searchFilters=");
        sb3.append(this.f198739b);
        sb3.append(", error=");
        return hb.a.k(sb3, this.f198740c, ")");
    }

    public c(boolean z14, b bVar, boolean z15) {
        bVar.getClass();
        this.f198738a = z14;
        this.f198739b = bVar;
        this.f198740c = z15;
    }

    public c() {
        this(false, null, false, 7, null);
    }
}
