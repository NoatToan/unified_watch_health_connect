package ue0;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, d2 = {"Lue0/k;", "", "", "managedId", "", "Lue0/l;", "managedAccountsMembers", "authorizedViewersList", "<init>", "(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/Long;", "getManagedId", "()Ljava/lang/Long;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("managedAccountId")
    private final Long managedId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("managedAccountMemberList")
    private final List<l> managedAccountsMembers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("authorizedViewerList")
    private final List<l> authorizedViewersList;

    public k(Long l14, List<l> list, List<l> list2) {
        list.getClass();
        list2.getClass();
        this.managedId = l14;
        this.managedAccountsMembers = list;
        this.authorizedViewersList = list2;
    }

    public static k a(k kVar, List list, List list2) {
        Long l14 = kVar.managedId;
        kVar.getClass();
        list.getClass();
        list2.getClass();
        return new k(l14, list, list2);
    }

    public final List<l> b() {
        return this.authorizedViewersList;
    }

    public final List<l> c() {
        return this.managedAccountsMembers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.managedId, kVar.managedId) && s.g(this.managedAccountsMembers, kVar.managedAccountsMembers) && s.g(this.authorizedViewersList, kVar.authorizedViewersList);
    }

    public final int hashCode() {
        Long l14 = this.managedId;
        return this.authorizedViewersList.hashCode() + u0.b((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.managedAccountsMembers);
    }

    public final String toString() {
        Long l14 = this.managedId;
        List<l> list = this.managedAccountsMembers;
        List<l> list2 = this.authorizedViewersList;
        StringBuilder sb3 = new StringBuilder("ManagedAccountsDTO(managedId=");
        sb3.append(l14);
        sb3.append(", managedAccountsMembers=");
        sb3.append(list);
        sb3.append(", authorizedViewersList=");
        return z.c(sb3, list2, ")");
    }

    public k(Long l14, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? j0.f134944a : list2);
    }
}
