package i21;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li21/a;", "", "Li21/b;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lkotlin/Function0;", "", "undoFunction", "<init>", "(Li21/b;Le23/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f87237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f87238b;

    public a(b bVar, e23.a<Unit> aVar) {
        bVar.getClass();
        this.f87237a = bVar;
        this.f87238b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f87237a, aVar.f87237a) && p005kotlin.jvm.internal.s.g(this.f87238b, aVar.f87238b);
    }

    public final int hashCode() {
        int iHashCode = this.f87237a.hashCode() * 31;
        e23.a<Unit> aVar = this.f87238b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "NutritionReportsSnackbarState(type=" + this.f87237a + ", undoFunction=" + this.f87238b + ")";
    }

    public /* synthetic */ a(b bVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? null : aVar);
    }
}
