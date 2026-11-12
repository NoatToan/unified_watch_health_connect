package i71;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li71/y;", "", "", "barWidthPercentage", "Lcom/garmin/android/apps/connectmobile/performance/model/b;", "trainingStatus", "<init>", "(FLcom/garmin/android/apps/connectmobile/performance/model/b;)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f92026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.performance.model.b f92027b;

    public y(float f14, com.garmin.android.apps.connectmobile.performance.model.b bVar) {
        bVar.getClass();
        this.f92026a = f14;
        this.f92027b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f92026a, yVar.f92026a) == 0 && this.f92027b == yVar.f92027b;
    }

    public final int hashCode() {
        return this.f92027b.hashCode() + (Float.hashCode(this.f92026a) * 31);
    }

    public final String toString() {
        return "TrainingStatusPoint(barWidthPercentage=" + this.f92026a + ", trainingStatus=" + this.f92027b + ")";
    }
}
