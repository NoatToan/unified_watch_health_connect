package s21;

import java.util.List;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ls21/d0;", "", "", "Lq01/e;", "meals", "Ls21/c;", "selectedViewType", "Lb63/v;", "timelineStartTime", "timelineEndTime", "<init>", "(Ljava/util/List;Ls21/c;Lb63/v;Lb63/v;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q01.e> f156093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f156094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.v f156095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.v f156096d;

    public d0(List<q01.e> list, c cVar, b63.v vVar, b63.v vVar2) {
        list.getClass();
        cVar.getClass();
        vVar.getClass();
        vVar2.getClass();
        this.f156093a = list;
        this.f156094b = cVar;
        this.f156095c = vVar;
        this.f156096d = vVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f156093a.equals(d0Var.f156093a) && this.f156094b == d0Var.f156094b && this.f156095c.equals(d0Var.f156095c) && this.f156096d.equals(d0Var.f156096d);
    }

    public final int hashCode() {
        return this.f156096d.f16219a.hashCode() + l2.c(this.f156095c.f16219a, (this.f156094b.hashCode() + (this.f156093a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "SaveMealSettingsData(meals=" + this.f156093a + ", selectedViewType=" + this.f156094b + ", timelineStartTime=" + this.f156095c + ", timelineEndTime=" + this.f156096d + ")";
    }
}
