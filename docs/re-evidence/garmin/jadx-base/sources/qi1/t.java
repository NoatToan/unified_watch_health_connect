package qi1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqi1/t;", "", "", "planLabel", "assistantPlusLabel", "", "canSupportAssistancePlus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f144934c;

    public /* synthetic */ t(String str, String str2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f144932a, tVar.f144932a) && p005kotlin.jvm.internal.s.g(this.f144933b, tVar.f144933b) && this.f144934c == tVar.f144934c;
    }

    public final int hashCode() {
        String str = this.f144932a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f144933b;
        return Boolean.hashCode(this.f144934c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return hb.a.k(p6.b.i("SubscriptionManagementUIModel(planLabel=", this.f144932a, ", assistantPlusLabel=", this.f144933b, ", canSupportAssistancePlus="), this.f144934c, ")");
    }

    public t(String str, String str2, boolean z14) {
        this.f144932a = str;
        this.f144933b = str2;
        this.f144934c = z14;
    }

    public t() {
        this(null, null, false, 7, null);
    }
}
