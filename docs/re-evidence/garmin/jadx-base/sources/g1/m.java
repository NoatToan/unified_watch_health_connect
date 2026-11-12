package g1;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f74718b;

    public /* synthetic */ m(r rVar, int i14) {
        this.f74717a = i14;
        this.f74718b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f74717a;
        r rVar = this.f74718b;
        switch (i14) {
            case 0:
                int iOrdinal = rVar.f74749w.ordinal();
                if (iOrdinal == 1) {
                    rVar.i();
                } else if (iOrdinal == 6 || iOrdinal == 8) {
                    vb.h.z("Encoder is released");
                }
                break;
            case 1:
                switch (rVar.f74749w) {
                    case CONFIGURED:
                    case STARTED:
                    case PAUSED:
                    case ERROR:
                        rVar.h();
                        break;
                    case STOPPING:
                    case PENDING_START:
                    case PENDING_START_PAUSED:
                        rVar.l(r.c.PENDING_RELEASE);
                        break;
                    case PENDING_RELEASE:
                    case RELEASED:
                        break;
                    default:
                        androidx.room.a0.s(rVar.f74749w, "Unknown state: ");
                        break;
                }
                break;
            case 2:
                rVar.E = true;
                if (rVar.D) {
                    if (!rVar.f74746t) {
                        rVar.f74732f.stop();
                    }
                    rVar.j();
                }
                break;
            case 3:
                rVar.f74735i.execute(new m(rVar, 4));
                break;
            case 4:
                if (rVar.f74752z) {
                    rVar.A = null;
                    rVar.m();
                    rVar.f74752z = false;
                }
                break;
            default:
                Range<Long> range = r.H;
                l0.j.a(rVar.a(), new q(rVar), rVar.f74735i);
                break;
        }
    }
}
