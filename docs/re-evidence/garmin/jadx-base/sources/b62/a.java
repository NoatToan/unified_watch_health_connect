package b62;

import o70.b;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import yz1.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb62/a;", "Lr70/a;", "Lyz1/d;", "status", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/d;", "workout", "<init>", "(Lyz1/d;Lcom/garmin/android/apps/connectmobile/workouts/data/model/d;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r70.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f16166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.d f16167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f16168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f16169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16170e;

    public a(d dVar, com.garmin.android.apps.connectmobile.workouts.data.model.d dVar2) {
        dVar.getClass();
        dVar2.getClass();
        this.f16166a = dVar;
        this.f16167b = dVar2;
        this.f16168c = b.WORKOUT;
        DateTime dateTimeG = dVar2.g();
        this.f16169d = dateTimeG == null ? new DateTime() : dateTimeG;
        Long scheduledWorkoutId = dVar2.getScheduledWorkoutId();
        this.f16170e = scheduledWorkoutId != null ? String.valueOf(scheduledWorkoutId.longValue()) : null;
    }

    @Override // r70.s
    public final String a() {
        return this.f16168c.a();
    }

    @Override // r70.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getF16169d() {
        return this.f16169d;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF16170e() {
        return this.f16170e;
    }

    @Override // r70.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getF16168c() {
        return this.f16168c;
    }
}
