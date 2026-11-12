package yg2;

import com.garmin.proto.generated.GDIDataTypes;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyg2/g;", "", "", "stepIndex", "reps", "", "weight", "Lcom/garmin/proto/generated/GDIDataTypes$MeasurementUnit;", "weightUnit", "timeout", "", "Lvf2/c;", "exerciseSuggestions", "<init>", "(IIFLcom/garmin/proto/generated/GDIDataTypes$MeasurementUnit;ILjava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f196984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f196985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f196986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GDIDataTypes.MeasurementUnit f196987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f196988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<vf2.c> f196989f;

    public g(int i14, int i15, float f14, GDIDataTypes.MeasurementUnit measurementUnit, int i16, List<vf2.c> list) {
        measurementUnit.getClass();
        this.f196984a = i14;
        this.f196985b = i15;
        this.f196986c = f14;
        this.f196987d = measurementUnit;
        this.f196988e = i16;
        this.f196989f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f196984a == gVar.f196984a && this.f196985b == gVar.f196985b && Float.compare(this.f196986c, gVar.f196986c) == 0 && this.f196987d == gVar.f196987d && this.f196988e == gVar.f196988e && p005kotlin.jvm.internal.s.g(this.f196989f, gVar.f196989f);
    }

    public final int hashCode() {
        int iD = q2.d(this.f196988e, (this.f196987d.hashCode() + q6.f.d(this.f196986c, q2.d(this.f196985b, Integer.hashCode(this.f196984a) * 31, 31), 31)) * 31, 31);
        List<vf2.c> list = this.f196989f;
        return iD + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f196984a, this.f196985b, "ExerciseEditData(stepIndex=", ", reps=", ", weight=");
        sbJ.append(this.f196986c);
        sbJ.append(", weightUnit=");
        sbJ.append(this.f196987d);
        sbJ.append(", timeout=");
        sbJ.append(this.f196988e);
        sbJ.append(", exerciseSuggestions=");
        sbJ.append(this.f196989f);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ g(int i14, int i15, float f14, GDIDataTypes.MeasurementUnit measurementUnit, int i16, List list, int i17, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, f14, measurementUnit, i16, (i17 & 32) != 0 ? null : list);
    }
}
