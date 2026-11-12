package ue0;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0012"}, d2 = {"Lue0/b;", "", "", "Lue0/j;", "issuedInvites", "Lue0/n;", "receivedInvites", "Lue0/l;", "childrenManagedAccounts", "adminGuardianMembers", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "d", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issuedInvites")
    private final List<j> issuedInvites;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("receivedInvites")
    private final List<n> receivedInvites;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("childrenManagedAccountMembers")
    private final List<l> childrenManagedAccounts;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adminGuardianMembers")
    private final List<l> adminGuardianMembers;

    public b(List<j> list, List<n> list2, List<l> list3, List<l> list4) {
        this.issuedInvites = list;
        this.receivedInvites = list2;
        this.childrenManagedAccounts = list3;
        this.adminGuardianMembers = list4;
    }

    public final List<l> a() {
        return this.adminGuardianMembers;
    }

    public final List<l> b() {
        return this.childrenManagedAccounts;
    }

    public final List<j> c() {
        return this.issuedInvites;
    }

    public final List<n> d() {
        return this.receivedInvites;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.issuedInvites, bVar.issuedInvites) && s.g(this.receivedInvites, bVar.receivedInvites) && s.g(this.childrenManagedAccounts, bVar.childrenManagedAccounts) && s.g(this.adminGuardianMembers, bVar.adminGuardianMembers);
    }

    public final int hashCode() {
        List<j> list = this.issuedInvites;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<n> list2 = this.receivedInvites;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<l> list3 = this.childrenManagedAccounts;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<l> list4 = this.adminGuardianMembers;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        List<j> list = this.issuedInvites;
        List<n> list2 = this.receivedInvites;
        return n23.j.j(f3.k("AccountAccessInvitesDTO(issuedInvites=", ", receivedInvites=", ", childrenManagedAccounts=", list, list2), this.childrenManagedAccounts, ", adminGuardianMembers=", this.adminGuardianMembers, ")");
    }
}
