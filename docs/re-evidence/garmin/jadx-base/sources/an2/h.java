package an2;

import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import u53.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class h extends w implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f4560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharedDeviceInfo f4561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, SharedDeviceInfo sharedDeviceInfo, boolean z14) {
        super(0);
        this.f4560a = aVar;
        this.f4561b = sharedDeviceInfo;
        this.f4562c = z14;
    }

    @Override // e23.a
    public final Boolean invoke() {
        a.d dVar = a.f4492e;
        a aVar = this.f4560a;
        aVar.getClass();
        a.d dVar2 = a.f4492e;
        SharedDeviceInfo sharedDeviceInfo = this.f4561b;
        boolean z14 = false;
        if (sharedDeviceInfo.isPaired()) {
            a.e eVar = aVar.f4494a;
            if (eVar.f4514f) {
                boolean zC = eVar.c();
                boolean z15 = this.f4562c;
                if (!zC || z15) {
                    try {
                        SharedDeviceInfo sharedDeviceInfoBuild = new SharedDeviceInfo.Builder(sharedDeviceInfo).configureWasSavedLocally(z15).build();
                        u53.d dVar3 = aVar.f4497d;
                        x53.c cVar = s0.f129406a;
                        ge1.b.T(dVar3, o.f168762a, null, new e(aVar, sharedDeviceInfoBuild, null), 2);
                        z14 = true;
                    } catch (Exception e4) {
                        a.d.a(dVar2).warn("failed when notifying app about missing system bond for " + sharedDeviceInfo.getMacAddress() + StringUtils.SPACE + e4.getMessage());
                    }
                } else {
                    com.airbnb.lottie.animation.keyframe.a.A("isAppInBackground=true, cannot attempt to create system bond for ", sharedDeviceInfo.getMacAddress(), a.d.a(dVar2));
                }
            } else {
                a.d.a(dVar2).warn("shouldMonitorBondChanges=false, cannot attempt to create system bond");
            }
        } else {
            a.d.a(dVar2).error("cannot create system bond without mac address");
        }
        return Boolean.valueOf(z14);
    }
}
