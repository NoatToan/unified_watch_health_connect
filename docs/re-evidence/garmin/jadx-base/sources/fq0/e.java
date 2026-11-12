package fq0;

import com.garmin.device.datatypes.DeviceProfile;
import iu1.k;
import java.util.List;
import l20.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfq0/e;", "Liu1/k;", "Ll20/r;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements k<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f73218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<DeviceProfile> f73219b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(f fVar, List<? extends DeviceProfile> list) {
        this.f73218a = fVar;
        this.f73219b = list;
    }

    @Override // iu1.k
    public final void a(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
    }

    @Override // iu1.k
    public final void onSuccess(r rVar) {
        List<l20.a> listF = rVar.f();
        List<DeviceProfile> list = this.f73219b;
        f fVar = this.f73218a;
        if (listF == null || listF.isEmpty()) {
            fVar.b(new f.c(fVar, list));
        } else {
            fVar.b(new gq0.a(fVar, listF, new d(fVar, list)));
        }
    }
}
