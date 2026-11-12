package kr2;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkr2/a;", "", "", "deviceName", "deviceUnit", "Lkotlin/Function1;", "", "", "itemTouchListener", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Le23/l;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f106236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f106237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<? super Integer, Unit> f106238c;

    public /* synthetic */ a(Long l14, Long l15, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f106236a, aVar.f106236a) && s.g(this.f106237b, aVar.f106237b) && s.g(this.f106238c, aVar.f106238c);
    }

    public final int hashCode() {
        Long l14 = this.f106236a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.f106237b;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        e23.l<? super Integer, Unit> lVar = this.f106238c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = f3.j(this.f106236a, this.f106237b, "DeveloperNfcDeviceItemModel(deviceName=", ", deviceUnit=", ", itemTouchListener=");
        sbJ.append(this.f106238c);
        sbJ.append(")");
        return sbJ.toString();
    }

    public a(Long l14, Long l15, e23.l<? super Integer, Unit> lVar) {
        this.f106236a = l14;
        this.f106237b = l15;
        this.f106238c = lVar;
    }
}
