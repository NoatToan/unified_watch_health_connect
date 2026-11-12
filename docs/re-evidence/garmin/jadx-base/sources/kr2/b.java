package kr2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkr2/b;", "", "", "settingTitle", "settingSubtitle", "Lkotlin/Function1;", "", "", "itemTouchListener", "<init>", "(Ljava/lang/String;Ljava/lang/String;Le23/l;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f106240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.l<? super Integer, Unit> f106241c;

    public /* synthetic */ b(String str, String str2, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f106239a, bVar.f106239a) && s.g(this.f106240b, bVar.f106240b) && s.g(this.f106241c, bVar.f106241c);
    }

    public final int hashCode() {
        int iHashCode = this.f106239a.hashCode() * 31;
        String str = this.f106240b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e23.l<? super Integer, Unit> lVar = this.f106241c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f106240b;
        e23.l<? super Integer, Unit> lVar = this.f106241c;
        StringBuilder sbI = p6.b.i("DeveloperSettingItemModel(settingTitle=", this.f106239a, ", settingSubtitle=", str, ", itemTouchListener=");
        sbI.append(lVar);
        sbI.append(")");
        return sbI.toString();
    }

    public b(String str, String str2, e23.l<? super Integer, Unit> lVar) {
        str.getClass();
        this.f106239a = str;
        this.f106240b = str2;
        this.f106241c = lVar;
    }
}
