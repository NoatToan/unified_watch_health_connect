package q21;

import b63.v;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lq21/d;", "", "", "isInMinutes", "", "mealName", "Lb63/v;", "currentStartTime", "currentStopTime", "stopTimePickerMinTime", "stopTimePickerMaxTime", "", "infoText", "", "infoTextArgs", "isRangeValid", "<init>", "(ZLjava/lang/String;Lb63/v;Lb63/v;Lb63/v;Lb63/v;Ljava/lang/Integer;Ljava/util/List;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f142224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f142226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f142227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f142228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f142229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f142230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Object> f142231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f142232i;

    public d(boolean z14, String str, v vVar, v vVar2, v vVar3, v vVar4, Integer num, List list, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, str, vVar, vVar2, vVar3, (i14 & 32) != 0 ? v21.d.f175319w : vVar4, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? j0.f134944a : list, (i14 & 256) != 0 ? true : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f142224a == dVar.f142224a && p005kotlin.jvm.internal.s.g(this.f142225b, dVar.f142225b) && p005kotlin.jvm.internal.s.g(this.f142226c, dVar.f142226c) && p005kotlin.jvm.internal.s.g(this.f142227d, dVar.f142227d) && p005kotlin.jvm.internal.s.g(this.f142228e, dVar.f142228e) && p005kotlin.jvm.internal.s.g(this.f142229f, dVar.f142229f) && p005kotlin.jvm.internal.s.g(this.f142230g, dVar.f142230g) && p005kotlin.jvm.internal.s.g(this.f142231h, dVar.f142231h) && this.f142232i == dVar.f142232i;
    }

    public final int hashCode() {
        int iC = l2.c(this.f142229f.f16219a, l2.c(this.f142228e.f16219a, l2.c(this.f142227d.f16219a, l2.c(this.f142226c.f16219a, wr.g.j(Boolean.hashCode(this.f142224a) * 31, 31, this.f142225b), 31), 31), 31), 31);
        Integer num = this.f142230g;
        return Boolean.hashCode(this.f142232i) + u0.b((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.f142231h);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LegacyMealWindowUiModel(isInMinutes=");
        sb3.append(this.f142224a);
        sb3.append(", mealName=");
        sb3.append(this.f142225b);
        sb3.append(", currentStartTime=");
        sb3.append(this.f142226c);
        sb3.append(", currentStopTime=");
        sb3.append(this.f142227d);
        sb3.append(", stopTimePickerMinTime=");
        sb3.append(this.f142228e);
        sb3.append(", stopTimePickerMaxTime=");
        sb3.append(this.f142229f);
        sb3.append(", infoText=");
        sb3.append(this.f142230g);
        sb3.append(", infoTextArgs=");
        sb3.append(this.f142231h);
        sb3.append(", isRangeValid=");
        return hb.a.k(sb3, this.f142232i, ")");
    }

    public d(boolean z14, String str, v vVar, v vVar2, v vVar3, v vVar4, Integer num, List<? extends Object> list, boolean z15) {
        str.getClass();
        vVar.getClass();
        vVar2.getClass();
        vVar3.getClass();
        vVar4.getClass();
        list.getClass();
        this.f142224a = z14;
        this.f142225b = str;
        this.f142226c = vVar;
        this.f142227d = vVar2;
        this.f142228e = vVar3;
        this.f142229f = vVar4;
        this.f142230g = num;
        this.f142231h = list;
        this.f142232i = z15;
    }
}
