package ue0;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lue0/o;", "", "", "inviteeUserId", "", "Lue0/a;", "accountDelegationTypes", "<init>", "(JLjava/util/List;)V", "a", "J", "getInviteeUserId", "()J", "b", "Ljava/util/List;", "getAccountDelegationTypes", "()Ljava/util/List;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteeUserId")
    private final long inviteeUserId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("accountDelegationTypes")
    private final List<a> accountDelegationTypes;

    public /* synthetic */ o(long j8, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? x.k(a.CONNECT_NON_SOCIAL_SHARED_READ, a.ATP_READ, a.INSIGHTS_READ, a.DIVE_SHARED_READ, a.GOLF_SHARED_READ) : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.inviteeUserId == oVar.inviteeUserId && s.g(this.accountDelegationTypes, oVar.accountDelegationTypes);
    }

    public final int hashCode() {
        return this.accountDelegationTypes.hashCode() + (Long.hashCode(this.inviteeUserId) * 31);
    }

    public final String toString() {
        return "SendInviteBody(inviteeUserId=" + this.inviteeUserId + ", accountDelegationTypes=" + this.accountDelegationTypes + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(long j8, List<? extends a> list) {
        list.getClass();
        this.inviteeUserId = j8;
        this.accountDelegationTypes = list;
    }
}
