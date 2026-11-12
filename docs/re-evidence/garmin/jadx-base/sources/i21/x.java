package i21;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li21/x;", "", "", "hasReviewSettingsButton", "Li53/c;", "Li21/w;", FirebaseAnalytics.Param.ITEMS, "<init>", "(ZLi53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f87374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<w> f87375b;

    public x(boolean z14, i53.c<w> cVar) {
        cVar.getClass();
        this.f87374a = z14;
        this.f87375b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f87374a == xVar.f87374a && this.f87375b.equals(xVar.f87375b);
    }

    public final int hashCode() {
        return this.f87375b.hashCode() + (Boolean.hashCode(this.f87374a) * 31);
    }

    public final String toString() {
        return "NutritionWhatsNewModalState(hasReviewSettingsButton=" + this.f87374a + ", items=" + this.f87375b + ")";
    }
}
