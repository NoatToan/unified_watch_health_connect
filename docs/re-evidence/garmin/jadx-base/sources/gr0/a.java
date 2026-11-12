package gr0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zk0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgr0/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lnr0/a;", "userGoals", "", "goalType", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lnr0/a;ILcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends com.garmin.android.library.backgroundtaskmanagement.b<nr0.a> {
    static {
        new C1583a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nr0.a aVar, int i14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar2) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar2);
        aVar.getClass();
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, aVar);
        if (i14 == 0) {
            b(new c(this, aVar));
            return;
        }
        if (i14 == 1) {
            h hVar = aVar.f127608b;
            b(new b(this, "floors-climbed", new h("FLOORS_CLIMBED", hVar != null ? hVar.C() : 0)));
        } else {
            if (i14 != 2) {
                return;
            }
            b(new b(this, "intensity-minutes", new h("INTENSITY_MINUTES", aVar.b())));
        }
    }

    /* JADX INFO: renamed from: gr0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgr0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1583a {
        public /* synthetic */ C1583a(j jVar) {
            this();
        }

        private C1583a() {
        }
    }
}
