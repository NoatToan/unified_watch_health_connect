package na0;

import gg1.o0;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lna0/n;", "", "Lgg1/o0;", "measurementSystem", "", "circumferenceInMm", "", "Lfb0/f;", "pickerConfigData", "<init>", "(Lgg1/o0;ILjava/util/List;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f125155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f125156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<fb0.f> f125157c;

    public n(o0 o0Var, int i14, List<fb0.f> list) {
        o0Var.getClass();
        list.getClass();
        this.f125155a = o0Var;
        this.f125156b = i14;
        this.f125157c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f125155a == nVar.f125155a && this.f125156b == nVar.f125156b && this.f125157c.equals(nVar.f125157c);
    }

    public final int hashCode() {
        return this.f125157c.hashCode() + q2.d(this.f125156b, this.f125155a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BikeWheelCircumferenceUiState(measurementSystem=");
        sb3.append(this.f125155a);
        sb3.append(", circumferenceInMm=");
        sb3.append(this.f125156b);
        sb3.append(", pickerConfigData=");
        return z.c(sb3, this.f125157c, ")");
    }
}
