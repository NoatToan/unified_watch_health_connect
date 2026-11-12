package d01;

import b63.o;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld01/a;", "", "Lb63/o;", "date", "", "enabledOnly", "<init>", "(Lb63/o;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f57011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57012b;

    public a(o oVar, boolean z14) {
        oVar.getClass();
        this.f57011a = oVar;
        this.f57012b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f57011a.equals(aVar.f57011a) && this.f57012b == aVar.f57012b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57012b) + (this.f57011a.f16206a.hashCode() * 31);
    }

    public final String toString() {
        return "MealsCacheKey(date=" + this.f57011a + ", enabledOnly=" + this.f57012b + ")";
    }
}
