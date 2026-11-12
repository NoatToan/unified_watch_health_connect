package jv1;

import com.google.firebase.perf.util.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljv1/t;", "", "", "topLineText", "bottomLineText", "Lb92/a;", "descriptor", "", Constants.ENABLE_DISABLE, "showOrHide", "Lu4/d;", "leadingIconResID", "isTriathlonRow", "navigationTag", "actionTag", "actionData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb92/a;ZZLu4/d;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b92.a f101150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f101151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f101152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u4.d f101153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f101154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f101155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f101156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f101157j;

    public /* synthetic */ t(String str, String str2, b92.a aVar, boolean z14, boolean z15, u4.d dVar, boolean z16, String str3, String str4, Object obj, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : aVar, (i14 & 8) != 0 ? true : z14, (i14 & 16) != 0 ? true : z15, (i14 & 32) != 0 ? null : dVar, (i14 & 64) != 0 ? false : z16, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f101148a, tVar.f101148a) && p005kotlin.jvm.internal.s.g(this.f101149b, tVar.f101149b) && p005kotlin.jvm.internal.s.g(this.f101150c, tVar.f101150c) && this.f101151d == tVar.f101151d && this.f101152e == tVar.f101152e && p005kotlin.jvm.internal.s.g(this.f101153f, tVar.f101153f) && this.f101154g == tVar.f101154g && p005kotlin.jvm.internal.s.g(this.f101155h, tVar.f101155h) && p005kotlin.jvm.internal.s.g(this.f101156i, tVar.f101156i) && p005kotlin.jvm.internal.s.g(this.f101157j, tVar.f101157j);
    }

    public final int hashCode() {
        int iHashCode = this.f101148a.hashCode() * 31;
        String str = this.f101149b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b92.a aVar = this.f101150c;
        int iG = q6.f.g(q6.f.g((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f101151d), 31, this.f101152e);
        u4.d dVar = this.f101153f;
        int iG2 = q6.f.g((iG + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f101154g);
        String str2 = this.f101155h;
        int iHashCode3 = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f101156i;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.f101157j;
        return iHashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FBTReviewInfoUIItem(topLineText=", this.f101148a, ", bottomLineText=", this.f101149b, ", descriptor=");
        sbI.append(this.f101150c);
        sbI.append(", isEnabled=");
        sbI.append(this.f101151d);
        sbI.append(", showOrHide=");
        sbI.append(this.f101152e);
        sbI.append(", leadingIconResID=");
        sbI.append(this.f101153f);
        sbI.append(", isTriathlonRow=");
        fb1.c.w(", navigationTag=", this.f101155h, ", actionTag=", sbI, this.f101154g);
        sbI.append(this.f101156i);
        sbI.append(", actionData=");
        sbI.append(this.f101157j);
        sbI.append(")");
        return sbI.toString();
    }

    public t(String str, String str2, b92.a aVar, boolean z14, boolean z15, u4.d dVar, boolean z16, String str3, String str4, Object obj) {
        str.getClass();
        this.f101148a = str;
        this.f101149b = str2;
        this.f101150c = aVar;
        this.f101151d = z14;
        this.f101152e = z15;
        this.f101153f = dVar;
        this.f101154g = z16;
        this.f101155h = str3;
        this.f101156i = str4;
        this.f101157j = obj;
    }
}
