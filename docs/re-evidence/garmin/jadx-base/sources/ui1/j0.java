package ui1;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lui1/j0;", "", "", "Lui1/b1;", "userSubscriptionInfo", "sarSubscriptionInfo", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "getSarSubscriptionInfo", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("UserSubscriptionInfo")
    private final List<b1> userSubscriptionInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("SARSubscriptionInfo")
    private final List<Object> sarSubscriptionInfo;

    public /* synthetic */ j0(List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2);
    }

    public final List<b1> a() {
        return this.userSubscriptionInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return p005kotlin.jvm.internal.s.g(this.userSubscriptionInfo, j0Var.userSubscriptionInfo) && p005kotlin.jvm.internal.s.g(this.sarSubscriptionInfo, j0Var.sarSubscriptionInfo);
    }

    public final int hashCode() {
        List<b1> list = this.userSubscriptionInfo;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Object> list2 = this.sarSubscriptionInfo;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return c22.t.f("SubscriptionInfoDTO(userSubscriptionInfo=", ", sarSubscriptionInfo=", ")", this.userSubscriptionInfo, this.sarSubscriptionInfo);
    }

    public j0(List<b1> list, List<Object> list2) {
        this.userSubscriptionInfo = list;
        this.sarSubscriptionInfo = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
