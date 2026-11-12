package vp2;

import android.view.View;
import androidx.core.view.j;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvp2/b;", "", "", "bankSupportTitle", "", "bankSupportTypeIcon", "Lkotlin/Function1;", "Landroid/view/View;", "", "bankSupportAction", "<init>", "(Ljava/lang/String;ILe23/l;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f179409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<View, Unit> f179410c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, int i14, l<? super View, Unit> lVar) {
        str.getClass();
        lVar.getClass();
        this.f179408a = str;
        this.f179409b = i14;
        this.f179410c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f179408a.equals(bVar.f179408a) && this.f179409b == bVar.f179409b && this.f179410c.equals(bVar.f179410c);
    }

    public final int hashCode() {
        return this.f179410c.hashCode() + q2.d(this.f179409b, this.f179408a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbK = j.k(this.f179409b, "FitPayCardBankSupportType(bankSupportTitle=", this.f179408a, ", bankSupportTypeIcon=", ", bankSupportAction=");
        sbK.append(this.f179410c);
        sbK.append(")");
        return sbK.toString();
    }
}
