package fw0;

import b63.v;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfw0/a;", "Lmd1/a;", "Lf12/b;", "userAccount", "<init>", "(Lf12/b;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements md1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.b f73777a;

    public a(f12.b bVar) {
        bVar.getClass();
        this.f73777a = bVar;
    }

    @Override // md1.a
    public final qd1.a a() {
        return new qd1.a(true, com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.EVENING.f38694a, new v(18, 0, 0, 0, 12, null), null, 8, null);
    }

    @Override // md1.a
    public final qd1.a b() {
        return new qd1.a(true, com.garmin.android.apps.connectmobile.logging.presentation.reminders.a.MORNING.f38694a, new v(9, 0, 0, 0, 12, null), null, 8, null);
    }
}
