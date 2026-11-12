package vr2;

import c22.t;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvr2/a;", "", "", "Lbr2/f;", "payEnabledDevices", "payNotEnabledDevices", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<br2.f> f179558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<br2.f> f179559b;

    public a(List<br2.f> list, List<br2.f> list2) {
        list.getClass();
        list2.getClass();
        this.f179558a = list;
        this.f179559b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f179558a.equals(aVar.f179558a) && this.f179559b.equals(aVar.f179559b);
    }

    public final int hashCode() {
        return this.f179559b.hashCode() + (this.f179558a.hashCode() * 31);
    }

    public final String toString() {
        return t.f("CardAssociatedDevicesModel(payEnabledDevices=", ", payNotEnabledDevices=", ")", this.f179558a, this.f179559b);
    }
}
