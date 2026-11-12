package i71;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li71/w;", "", "Lyz1/d;", "status", "Lcom/garmin/android/apps/connectmobile/performance/model/b;", "trainingStatus", "", "sinceDate", "Li53/c;", "Li71/y;", "summaryTrainingStatusCardData", "", "last4WeeksDataAvailable", "last2WeeksDataAvailable", "<init>", "(Lyz1/d;Lcom/garmin/android/apps/connectmobile/performance/model/b;Ljava/lang/String;Li53/c;ZZ)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f92006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.performance.model.b f92007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<y> f92009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f92010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f92011f;

    public w(yz1.d dVar, com.garmin.android.apps.connectmobile.performance.model.b bVar, String str, i53.c<y> cVar, boolean z14, boolean z15) {
        dVar.getClass();
        bVar.getClass();
        cVar.getClass();
        this.f92006a = dVar;
        this.f92007b = bVar;
        this.f92008c = str;
        this.f92009d = cVar;
        this.f92010e = z14;
        this.f92011f = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f92006a.equals(wVar.f92006a) && this.f92007b == wVar.f92007b && p005kotlin.jvm.internal.s.g(this.f92008c, wVar.f92008c) && this.f92009d.equals(wVar.f92009d) && this.f92010e == wVar.f92010e && this.f92011f == wVar.f92011f;
    }

    public final int hashCode() {
        int iHashCode = (this.f92007b.hashCode() + (this.f92006a.hashCode() * 31)) * 31;
        String str = this.f92008c;
        return Boolean.hashCode(this.f92011f) + q6.f.g(l2.a(this.f92009d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f92010e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingStatusCardData(status=");
        sb3.append(this.f92006a);
        sb3.append(", trainingStatus=");
        sb3.append(this.f92007b);
        sb3.append(", sinceDate=");
        sb3.append(this.f92008c);
        sb3.append(", summaryTrainingStatusCardData=");
        sb3.append(this.f92009d);
        sb3.append(", last4WeeksDataAvailable=");
        return com.airbnb.lottie.animation.keyframe.a.f(", last2WeeksDataAvailable=", ")", sb3, this.f92010e, this.f92011f);
    }
}
