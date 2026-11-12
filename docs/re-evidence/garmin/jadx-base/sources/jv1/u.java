package jv1;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljv1/u;", "", "Lvt1/o;", "activityType", "", "customPlanName", "", "Ljv1/t;", "planInfoSection", "trainingPreferenceSection", "eventGoalSection", "<init>", "(Lvt1/o;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt1.o f101158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<t> f101160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<t> f101161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<t> f101162e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101163a;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180175f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vt1.o.f180176g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vt1.o.f180178i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vt1.o.f180179j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vt1.o.f180180k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f101163a = iArr;
        }
    }

    public /* synthetic */ u(vt1.o oVar, String str, List list, List list2, List list3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : oVar, (i14 & 2) != 0 ? null : str, list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f101158a == uVar.f101158a && p005kotlin.jvm.internal.s.g(this.f101159b, uVar.f101159b) && p005kotlin.jvm.internal.s.g(this.f101160c, uVar.f101160c) && p005kotlin.jvm.internal.s.g(this.f101161d, uVar.f101161d) && p005kotlin.jvm.internal.s.g(this.f101162e, uVar.f101162e);
    }

    public final int hashCode() {
        vt1.o oVar = this.f101158a;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        String str = this.f101159b;
        return this.f101162e.hashCode() + u0.b(u0.b((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f101160c), 31, this.f101161d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTReviewPlanUiModel(activityType=");
        sb3.append(this.f101158a);
        sb3.append(", customPlanName=");
        sb3.append(this.f101159b);
        sb3.append(", planInfoSection=");
        n23.j.z(sb3, this.f101160c, ", trainingPreferenceSection=", this.f101161d, ", eventGoalSection=");
        return u62.z.c(sb3, this.f101162e, ")");
    }

    public u(vt1.o oVar, String str, List<t> list, List<t> list2, List<t> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f101158a = oVar;
        this.f101159b = str;
        this.f101160c = list;
        this.f101161d = list2;
        this.f101162e = list3;
    }
}
