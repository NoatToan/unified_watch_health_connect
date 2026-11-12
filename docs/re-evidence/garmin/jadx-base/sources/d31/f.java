package d31;

import b63.u;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ld31/f;", "", "Ld31/d;", NotificationConstants.KEY_DATA_MIME_TYPE, "Ld31/c;", "status", "Lb63/u;", "reminderDate", "Ld31/e;", "partnerRewardMetaData", "<init>", "(Ld31/d;Ld31/c;Lb63/u;Ld31/e;)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f57383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f57384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f57385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f57386d;

    public f(d dVar, c cVar, u uVar, e eVar) {
        dVar.getClass();
        cVar.getClass();
        this.f57383a = dVar;
        this.f57384b = cVar;
        this.f57385c = uVar;
        this.f57386d = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f57383a == fVar.f57383a && this.f57384b == fVar.f57384b && s.g(this.f57385c, fVar.f57385c) && s.g(this.f57386d, fVar.f57386d);
    }

    public final int hashCode() {
        int iHashCode = (this.f57384b.hashCode() + (this.f57383a.hashCode() * 31)) * 31;
        u uVar = this.f57385c;
        int iHashCode2 = (iHashCode + (uVar == null ? 0 : uVar.f16216a.hashCode())) * 31;
        e eVar = this.f57386d;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "PromptOnboardingItem(type=" + this.f57383a + ", status=" + this.f57384b + ", reminderDate=" + this.f57385c + ", partnerRewardMetaData=" + this.f57386d + ")";
    }

    public /* synthetic */ f(d dVar, c cVar, u uVar, e eVar, int i14, j jVar) {
        this(dVar, cVar, (i14 & 4) != 0 ? null : uVar, (i14 & 8) != 0 ? null : eVar);
    }
}
