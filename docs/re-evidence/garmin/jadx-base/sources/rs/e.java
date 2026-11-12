package rs;

import android.graphics.drawable.LayerDrawable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrs/e;", "", "", "startLabel", "endLabel", "Landroid/graphics/drawable/LayerDrawable;", "legendDrawable", "customLegend", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/drawable/LayerDrawable;Ljava/lang/Integer;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f154303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f154304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayerDrawable f154305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f154306d;

    public /* synthetic */ e(Integer num, Integer num2, LayerDrawable layerDrawable, Integer num3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1 : num, (i14 & 2) != 0 ? -1 : num2, (i14 & 4) != 0 ? null : layerDrawable, (i14 & 8) != 0 ? -1 : num3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f154303a, eVar.f154303a) && s.g(this.f154304b, eVar.f154304b) && s.g(this.f154305c, eVar.f154305c) && s.g(this.f154306d, eVar.f154306d);
    }

    public final int hashCode() {
        Integer num = this.f154303a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f154304b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        LayerDrawable layerDrawable = this.f154305c;
        int iHashCode3 = (iHashCode2 + (layerDrawable == null ? 0 : layerDrawable.hashCode())) * 31;
        Integer num3 = this.f154306d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f154303a, "MapLegendItemData(startLabel=", ", endLabel=", ", legendDrawable=", this.f154304b);
        sbL.append(this.f154305c);
        sbL.append(", customLegend=");
        sbL.append(this.f154306d);
        sbL.append(")");
        return sbL.toString();
    }

    public e(Integer num, Integer num2, LayerDrawable layerDrawable, Integer num3) {
        this.f154303a = num;
        this.f154304b = num2;
        this.f154305c = layerDrawable;
        this.f154306d = num3;
    }

    public e() {
        this(null, null, null, null, 15, null);
    }
}
