package fo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfo/a0;", "", "Lwo0/a;", "activityListItem", "", "inProgress", "isSuccess", "showDialog", "<init>", "(Lwo0/a;ZZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wo0.a f72257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f72258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f72259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f72260d;

    public /* synthetic */ a0(wo0.a aVar, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16);
    }

    public static a0 a(a0 a0Var, boolean z14, int i14) {
        wo0.a aVar = a0Var.f72257a;
        boolean z15 = (i14 & 4) != 0 ? a0Var.f72259c : true;
        a0Var.getClass();
        aVar.getClass();
        return new a0(aVar, z14, z15, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.f72257a, a0Var.f72257a) && this.f72258b == a0Var.f72258b && this.f72259c == a0Var.f72259c && this.f72260d == a0Var.f72260d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72260d) + q6.f.g(q6.f.g(this.f72257a.hashCode() * 31, 31, this.f72258b), 31, this.f72259c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeleteActivityData(activityListItem=");
        sb3.append(this.f72257a);
        sb3.append(", inProgress=");
        sb3.append(this.f72258b);
        sb3.append(", isSuccess=");
        return com.airbnb.lottie.animation.keyframe.a.f(", showDialog=", ")", sb3, this.f72259c, this.f72260d);
    }

    public a0(wo0.a aVar, boolean z14, boolean z15, boolean z16) {
        aVar.getClass();
        this.f72257a = aVar;
        this.f72258b = z14;
        this.f72259c = z15;
        this.f72260d = z16;
    }
}
