package q21;

import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;
import s21.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lq21/p;", "", "", "isLoading", "isInMinutes", "", "snackbarMessageRes", "navigateBack", "isSaveEnabled", "showWarningDialog", "", "Lo21/f;", "meals", "Ls21/e0;", "timelineStart", "timelineEnd", "<init>", "(ZZLjava/lang/Integer;ZZZLjava/util/List;Ls21/e0;Ls21/e0;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f142269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f142270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f142271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f142272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f142273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f142274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<o21.f> f142275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f142276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f142277i;

    public p(boolean z14, boolean z15, Integer num, boolean z16, boolean z17, boolean z18, List list, e0 e0Var, e0 e0Var2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, z15, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? true : z17, (i14 & 32) != 0 ? false : z18, (i14 & 64) != 0 ? j0.f134944a : list, e0Var, e0Var2);
    }

    public static p a(p pVar, boolean z14, Integer num, boolean z15, boolean z16, boolean z17, ArrayList arrayList, e0 e0Var, e0 e0Var2, int i14) {
        if ((i14 & 1) != 0) {
            z14 = pVar.f142269a;
        }
        boolean z18 = z14;
        boolean z19 = pVar.f142270b;
        if ((i14 & 4) != 0) {
            num = pVar.f142271c;
        }
        Integer num2 = num;
        if ((i14 & 8) != 0) {
            z15 = pVar.f142272d;
        }
        boolean z24 = z15;
        if ((i14 & 16) != 0) {
            z16 = pVar.f142273e;
        }
        boolean z25 = z16;
        if ((i14 & 32) != 0) {
            z17 = pVar.f142274f;
        }
        boolean z26 = z17;
        List<o21.f> list = (i14 & 64) != 0 ? pVar.f142275g : arrayList;
        e0 e0Var3 = (i14 & 128) != 0 ? pVar.f142276h : e0Var;
        e0 e0Var4 = (i14 & 256) != 0 ? pVar.f142277i : e0Var2;
        pVar.getClass();
        list.getClass();
        e0Var3.getClass();
        e0Var4.getClass();
        return new p(z18, z19, num2, z24, z25, z26, list, e0Var3, e0Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f142269a == pVar.f142269a && this.f142270b == pVar.f142270b && p005kotlin.jvm.internal.s.g(this.f142271c, pVar.f142271c) && this.f142272d == pVar.f142272d && this.f142273e == pVar.f142273e && this.f142274f == pVar.f142274f && p005kotlin.jvm.internal.s.g(this.f142275g, pVar.f142275g) && p005kotlin.jvm.internal.s.g(this.f142276h, pVar.f142276h) && p005kotlin.jvm.internal.s.g(this.f142277i, pVar.f142277i);
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f142269a) * 31, 31, this.f142270b);
        Integer num = this.f142271c;
        return this.f142277i.hashCode() + ((this.f142276h.hashCode() + u0.b(q6.f.g(q6.f.g(q6.f.g((iG + (num == null ? 0 : num.hashCode())) * 31, 31, this.f142272d), 31, this.f142273e), 31, this.f142274f), 31, this.f142275g)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("MealWindowsAndTimelineUiModel(isLoading=", ", isInMinutes=", ", snackbarMessageRes=", this.f142269a, this.f142270b);
        sbM.append(this.f142271c);
        sbM.append(", navigateBack=");
        sbM.append(this.f142272d);
        sbM.append(", isSaveEnabled=");
        kg.f.q(", showWarningDialog=", ", meals=", sbM, this.f142273e, this.f142274f);
        sbM.append(this.f142275g);
        sbM.append(", timelineStart=");
        sbM.append(this.f142276h);
        sbM.append(", timelineEnd=");
        sbM.append(this.f142277i);
        sbM.append(")");
        return sbM.toString();
    }

    public p(boolean z14, boolean z15, Integer num, boolean z16, boolean z17, boolean z18, List<o21.f> list, e0 e0Var, e0 e0Var2) {
        list.getClass();
        e0Var.getClass();
        e0Var2.getClass();
        this.f142269a = z14;
        this.f142270b = z15;
        this.f142271c = num;
        this.f142272d = z16;
        this.f142273e = z17;
        this.f142274f = z18;
        this.f142275g = list;
        this.f142276h = e0Var;
        this.f142277i = e0Var2;
    }
}
