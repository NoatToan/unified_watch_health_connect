package d71;

import com.garmin.android.apps.connectmobile.f3;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ld71/i;", "", "Lyz1/d;", "status", "", "loadAnaerobic", "loadAnaerobicRangeMin", "loadAnaerobicRangeMax", "loadHighAerobic", "loadHighAerobicRangeMin", "loadHighAerobicRangeMax", "loadLowAerobic", "loadLowAerobicRangeMin", "loadLowAerobicRangeMax", "feedbackPhraseResId", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f58152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f58153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f58154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f58155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f58156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f58157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f58158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f58159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f58160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f58161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f58162k;

    public i(yz1.d dVar, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        dVar.getClass();
        this.f58152a = dVar;
        this.f58153b = num;
        this.f58154c = num2;
        this.f58155d = num3;
        this.f58156e = num4;
        this.f58157f = num5;
        this.f58158g = num6;
        this.f58159h = num7;
        this.f58160i = num8;
        this.f58161j = num9;
        this.f58162k = num10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f58152a.equals(iVar.f58152a) && s.g(this.f58153b, iVar.f58153b) && s.g(this.f58154c, iVar.f58154c) && s.g(this.f58155d, iVar.f58155d) && s.g(this.f58156e, iVar.f58156e) && s.g(this.f58157f, iVar.f58157f) && s.g(this.f58158g, iVar.f58158g) && s.g(this.f58159h, iVar.f58159h) && s.g(this.f58160i, iVar.f58160i) && s.g(this.f58161j, iVar.f58161j) && s.g(this.f58162k, iVar.f58162k);
    }

    public final int hashCode() {
        int iHashCode = this.f58152a.hashCode() * 31;
        Integer num = this.f58153b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f58154c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f58155d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f58156e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f58157f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f58158g;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f58159h;
        int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f58160i;
        int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f58161j;
        int iHashCode10 = (iHashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f58162k;
        return iHashCode10 + (num10 != null ? num10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadFocusCardData(status=");
        sb3.append(this.f58152a);
        sb3.append(", loadAnaerobic=");
        sb3.append(this.f58153b);
        sb3.append(", loadAnaerobicRangeMin=");
        x.m(sb3, this.f58154c, ", loadAnaerobicRangeMax=", this.f58155d, ", loadHighAerobic=");
        x.m(sb3, this.f58156e, ", loadHighAerobicRangeMin=", this.f58157f, ", loadHighAerobicRangeMax=");
        x.m(sb3, this.f58158g, ", loadLowAerobic=", this.f58159h, ", loadLowAerobicRangeMin=");
        x.m(sb3, this.f58160i, ", loadLowAerobicRangeMax=", this.f58161j, ", feedbackPhraseResId=");
        return f3.i(sb3, this.f58162k, ")");
    }
}
