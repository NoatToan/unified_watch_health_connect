package aq2;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Laq2/c;", "", "Ljava/util/ArrayList;", "Laq2/d;", "Lkotlin/collections/ArrayList;", "fitPayCountries", "<init>", "(Ljava/util/ArrayList;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<d> f12465a;

    public c(ArrayList<d> arrayList) {
        arrayList.getClass();
        this.f12465a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f12465a.equals(((c) obj).f12465a);
    }

    public final int hashCode() {
        return this.f12465a.hashCode();
    }

    public final String toString() {
        return "FitPayCountriesCollection(fitPayCountries=" + this.f12465a + ")";
    }
}
