package tb0;

import com.airbnb.lottie.RenderMode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ltb0/s;", "", "", "isLoading", "isError", "Lcom/airbnb/lottie/RenderMode;", "renderMode", "enableMergePathsForKitKatAndAbove", "Ltb0/p;", "lottieAnimationState", "<init>", "(ZZLcom/airbnb/lottie/RenderMode;ZLtb0/p;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RenderMode f163702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f163703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f163704e;

    public /* synthetic */ s(boolean z14, boolean z15, RenderMode renderMode, boolean z16, p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, renderMode, z16, (i14 & 16) != 0 ? null : pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f163700a == sVar.f163700a && this.f163701b == sVar.f163701b && this.f163702c == sVar.f163702c && this.f163703d == sVar.f163703d && p005kotlin.jvm.internal.s.g(this.f163704e, sVar.f163704e);
    }

    public final int hashCode() {
        int iG = q6.f.g((this.f163702c.hashCode() + q6.f.g(Boolean.hashCode(this.f163700a) * 31, 31, this.f163701b)) * 31, 31, this.f163703d);
        p pVar = this.f163704e;
        return iG + (pVar == null ? 0 : pVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("GestureUiState(isLoading=", ", isError=", ", renderMode=", this.f163700a, this.f163701b);
        sbM.append(this.f163702c);
        sbM.append(", enableMergePathsForKitKatAndAbove=");
        sbM.append(this.f163703d);
        sbM.append(", lottieAnimationState=");
        sbM.append(this.f163704e);
        sbM.append(")");
        return sbM.toString();
    }

    public s(boolean z14, boolean z15, RenderMode renderMode, boolean z16, p pVar) {
        renderMode.getClass();
        this.f163700a = z14;
        this.f163701b = z15;
        this.f163702c = renderMode;
        this.f163703d = z16;
        this.f163704e = pVar;
    }
}
