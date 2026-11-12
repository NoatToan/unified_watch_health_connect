package ug0;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lug0/a;", "", "Lue0/k;", "managedAccount", "", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Lue0/k;ZLjava/lang/String;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.k f170565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f170566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170567c;

    public /* synthetic */ a(ue0.k kVar, boolean z14, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : kVar, (i14 & 2) != 0 ? true : z14, (i14 & 4) != 0 ? null : str);
    }

    public static a a(a aVar, boolean z14) {
        ue0.k kVar = aVar.f170565a;
        String str = aVar.f170567c;
        aVar.getClass();
        return new a(kVar, z14, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f170565a, aVar.f170565a) && this.f170566b == aVar.f170566b && s.g(this.f170567c, aVar.f170567c);
    }

    public final int hashCode() {
        ue0.k kVar = this.f170565a;
        int iG = q6.f.g((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.f170566b);
        String str = this.f170567c;
        return iG + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AuthorizedViewersUiState(managedAccount=");
        sb3.append(this.f170565a);
        sb3.append(", isLoading=");
        sb3.append(this.f170566b);
        sb3.append(", error=");
        return am.j.o(this.f170567c, ")", sb3);
    }

    public a(ue0.k kVar, boolean z14, String str) {
        this.f170565a = kVar;
        this.f170566b = z14;
        this.f170567c = str;
    }

    public a() {
        this(null, false, null, 7, null);
    }
}
