package ec2;

import bs2.ad;
import ch.qos.logback.classic.Logger;
import com.garmin.device.datatypes.DeviceProfile;
import gy2.g;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lm2.h;
import wb2.t0;
import yr1.i;

/* JADX INFO: loaded from: classes11.dex */
public class b implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f63790c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gc2.a f63791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bc2.a f63792b;

    static {
        int i14 = gt2.c.f79010a;
        f63790c = gt2.b.f79005a.i("SYNC#SyncDataQueryCallback");
    }

    public b() {
        this.f63791a = null;
        this.f63792b = null;
    }

    @Override // ec2.c
    public List<g> a(DeviceProfile deviceProfile) {
        try {
            if (h.f113619b) {
                if (((em2.d) h.e()).k(deviceProfile.getF172494b())) {
                    return Collections.EMPTY_LIST;
                }
            }
        } catch (Exception unused) {
        }
        return Arrays.asList(g.DEVICE_SETTINGS);
    }

    @Override // ec2.c
    public Long b(long j8) {
        return null;
    }

    @Override // ec2.c
    public boolean d(DeviceProfile deviceProfile) {
        try {
            return sm2.g.a(deviceProfile);
        } catch (Exception e4) {
            f63790c.error("Failed autoUpload check for " + deviceProfile, (Throwable) e4);
            return true;
        }
    }

    @Override // ec2.c
    public final bc2.g.a e(t0 t0Var) {
        return ad.USER_BEHAVIOR_LOG.f19675a == t0Var.f184147g ? bc2.g.a.GUARANTEED : bc2.g.a.DEFAULT;
    }

    @Override // ec2.c
    public boolean g(long j8, String str) {
        return false;
    }

    @Override // ec2.c
    public final long getUserProfilePk() {
        return -1L;
    }

    @Override // ec2.c
    public boolean i() {
        return false;
    }

    @Override // ec2.c
    public boolean j() {
        return this instanceof i;
    }

    public b(gc2.a aVar, bc2.a aVar2) {
        this.f63791a = aVar;
        this.f63792b = aVar2;
    }
}
