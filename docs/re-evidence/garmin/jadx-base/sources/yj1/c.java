package yj1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyj1/c;", "", "", "unitId", "", "displayName", "", "hasError", "<init>", "(JLjava/lang/String;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f197526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f197528c;

    public c(long j8, String str, boolean z14) {
        str.getClass();
        this.f197526a = j8;
        this.f197527b = str;
        this.f197528c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f197526a == cVar.f197526a && s.g(this.f197527b, cVar.f197527b) && this.f197528c == cVar.f197528c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197528c) + wr.g.j(Long.hashCode(this.f197526a) * 31, 31, this.f197527b);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.i(com.airbnb.lottie.animation.keyframe.a.k(this.f197526a, "DeviceRowUiState(unitId=", ", displayName=", this.f197527b), ", hasError=", this.f197528c, ")");
    }

    public /* synthetic */ c(long j8, String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, (i14 & 4) != 0 ? false : z14);
    }
}
