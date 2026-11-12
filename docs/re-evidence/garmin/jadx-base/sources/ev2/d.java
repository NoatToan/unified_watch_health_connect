package ev2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lev2/d;", "", "", "displayValue", "displayTitle", "measurementUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66171c;

    public /* synthetic */ d(String str, String str2, String str3, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f66169a, dVar.f66169a) && s.g(this.f66170b, dVar.f66170b) && s.g(this.f66171c, dVar.f66171c);
    }

    public final int hashCode() {
        String str = this.f66169a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f66170b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66171c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.f66171c, ")", p6.b.i("DoubleLabelPickerDisplayInformation(displayValue=", this.f66169a, ", displayTitle=", this.f66170b, ", measurementUnit="));
    }

    public d(String str, String str2, String str3) {
        this.f66169a = str;
        this.f66170b = str2;
        this.f66171c = str3;
    }

    public d() {
        this(null, null, null, 7, null);
    }
}
