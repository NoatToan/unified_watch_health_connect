package zc0;

import ad0.j;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzc0/f;", "", "", "isLoading", "isError", "", "Lad0/j;", "tutorialItems", "<init>", "(ZZLjava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f203946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f203947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f203948c;

    public /* synthetic */ f(boolean z14, boolean z15, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f203946a == fVar.f203946a && this.f203947b == fVar.f203947b && s.g(this.f203948c, fVar.f203948c);
    }

    public final int hashCode() {
        return this.f203948c.hashCode() + q6.f.g(Boolean.hashCode(this.f203946a) * 31, 31, this.f203947b);
    }

    public final String toString() {
        return z.c(com.airbnb.lottie.animation.keyframe.a.m("TutorialUiState(isLoading=", ", isError=", ", tutorialItems=", this.f203946a, this.f203947b), this.f203948c, ")");
    }

    public f(boolean z14, boolean z15, List<j> list) {
        list.getClass();
        this.f203946a = z14;
        this.f203947b = z15;
        this.f203948c = list;
    }
}
