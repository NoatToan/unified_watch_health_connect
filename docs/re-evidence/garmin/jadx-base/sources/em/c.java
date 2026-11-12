package em;

import am.b2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceAppInfoDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import iu1.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB/\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lem/c;", "Liu1/h;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceAppInfoDTO;", "", "activityId", "", "agentApplicationId", "deviceApplicationId", "Liu1/i;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JIILiu1/i;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends iu1.h<DeviceAppInfoDTO> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f64574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f64575m;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j8, int i14, int i15, i<? super DeviceAppInfoDTO> iVar) {
        super(new iu1.f(), new dm.a(j8, qd2.a.EnumC2721a.ACTIVITY_DEVICE, 7200), true, DeviceAppInfoDTO.class, null, iVar, null, null, 208, null);
        iVar.getClass();
        this.f64574l = i14;
        this.f64575m = i15;
    }

    @Override // iu1.h
    public final c83.d<String> f() {
        return ((b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b2.class, new c83.h.a[0], null, null, null, 120)).U(this.f64574l, this.f64575m);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lem/c$a;", "", "<init>", "()V", "", "FIVE_DAYS_CACHE_STALE_TIME", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
