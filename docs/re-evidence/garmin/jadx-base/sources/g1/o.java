package g1;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f74723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f74724c;

    public /* synthetic */ o(r rVar, long j8, int i14) {
        this.f74722a = i14;
        this.f74723b = rVar;
        this.f74724c = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f74722a) {
            case 0:
                r rVar = this.f74723b;
                long j8 = this.f74724c;
                switch (rVar.f74749w) {
                    case CONFIGURED:
                    case PAUSED:
                    case STOPPING:
                    case PENDING_START_PAUSED:
                    case ERROR:
                        break;
                    case STARTED:
                        b1.d.b(j8);
                        rVar.f74742p.addLast(Range.create(Long.valueOf(j8), Long.MAX_VALUE));
                        rVar.l(r.c.PAUSED);
                        break;
                    case PENDING_START:
                        rVar.l(r.c.PENDING_START_PAUSED);
                        break;
                    case PENDING_RELEASE:
                    case RELEASED:
                        vb.h.z("Encoder is released");
                        break;
                    default:
                        androidx.room.a0.s(rVar.f74749w, "Unknown state: ");
                        break;
                }
                break;
            default:
                r rVar2 = this.f74723b;
                long j14 = this.f74724c;
                switch (rVar2.f74749w) {
                    case CONFIGURED:
                        rVar2.A = null;
                        b1.d.b(j14);
                        try {
                            if (rVar2.D) {
                                rVar2.j();
                            }
                            rVar2.f74750x = Range.create(Long.valueOf(j14), Long.MAX_VALUE);
                            rVar2.f74732f.start();
                            i.b bVar = rVar2.f74733g;
                            if (bVar instanceof r.b) {
                                ((r.b) bVar).f(true);
                            }
                            rVar2.l(r.c.STARTED);
                        } catch (MediaCodec.CodecException e4) {
                            rVar2.b(1, e4.getMessage(), e4);
                        }
                        break;
                    case STARTED:
                    case PENDING_START:
                    case ERROR:
                        break;
                    case PAUSED:
                        rVar2.A = null;
                        Range range = (Range) rVar2.f74742p.removeLast();
                        k7.h.f(range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                        Long l14 = (Long) range.getLower();
                        long jLongValue = l14.longValue();
                        rVar2.f74742p.addLast(Range.create(l14, Long.valueOf(j14)));
                        b1.d.b(j14);
                        b1.d.b(j14 - jLongValue);
                        if ((rVar2.f74729c || e1.a.f61851a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!rVar2.f74729c || e1.a.f61851a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            rVar2.f74732f.setParameters(am.j.e(0, "drop-input-frames"));
                            i.b bVar2 = rVar2.f74733g;
                            if (bVar2 instanceof r.b) {
                                ((r.b) bVar2).f(true);
                            }
                        }
                        if (rVar2.f74729c) {
                            rVar2.i();
                        }
                        rVar2.l(r.c.STARTED);
                        break;
                    case STOPPING:
                    case PENDING_START_PAUSED:
                        rVar2.l(r.c.PENDING_START);
                        break;
                    case PENDING_RELEASE:
                    case RELEASED:
                        vb.h.z("Encoder is released");
                        break;
                    default:
                        androidx.room.a0.s(rVar2.f74749w, "Unknown state: ");
                        break;
                }
                break;
        }
    }
}
