package hf;

import com.google.android.gms.actions.SearchIntents;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001BK\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lhf/y;", "", "", "data", "separator", "scheme", "authority", "path", SearchIntents.EXTRA_QUERY, "fragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f83621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f83622e;

    public y(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f83618a = str;
        this.f83619b = str2;
        this.f83620c = str3;
        this.f83621d = str4;
        this.f83622e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && p005kotlin.jvm.internal.s.g(((y) obj).f83618a, this.f83618a);
    }

    public final int hashCode() {
        return this.f83618a.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF83618a() {
        return this.f83618a;
    }
}
