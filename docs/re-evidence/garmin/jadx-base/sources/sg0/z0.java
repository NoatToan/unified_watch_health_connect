package sg0;

import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsg0/z0;", "", "", "Lue0/l;", "managedAccounts", "", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ue0.l> f159185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159187c;

    public /* synthetic */ z0(List list, boolean z14, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? true : z14, (i14 & 4) != 0 ? null : str);
    }

    public static z0 a(z0 z0Var, boolean z14, String str) {
        List<ue0.l> list = z0Var.f159185a;
        z0Var.getClass();
        return new z0(list, z14, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return p005kotlin.jvm.internal.s.g(this.f159185a, z0Var.f159185a) && this.f159186b == z0Var.f159186b && p005kotlin.jvm.internal.s.g(this.f159187c, z0Var.f159187c);
    }

    public final int hashCode() {
        List<ue0.l> list = this.f159185a;
        int iG = q6.f.g((list == null ? 0 : list.hashCode()) * 31, 31, this.f159186b);
        String str = this.f159187c;
        return iG + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ManageFamilyUiState(managedAccounts=");
        sb3.append(this.f159185a);
        sb3.append(", isLoading=");
        sb3.append(this.f159186b);
        sb3.append(", error=");
        return am.j.o(this.f159187c, ")", sb3);
    }

    public z0(List<ue0.l> list, boolean z14, String str) {
        this.f159185a = list;
        this.f159186b = z14;
        this.f159187c = str;
    }

    public z0() {
        this(null, false, null, 7, null);
    }
}
