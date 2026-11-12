package fq0;

import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq0/d;", "Lgq0/a$a;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements gq0.a.InterfaceC1582a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f73216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<DeviceProfile> f73217b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(f fVar, List<? extends DeviceProfile> list) {
        this.f73216a = fVar;
        this.f73217b = list;
    }

    @Override // gq0.a.InterfaceC1582a
    public final void a(ArrayList arrayList) {
        f fVar = this.f73216a;
        fVar.f73220l = arrayList;
        fVar.b(new f.c(fVar, this.f73217b));
    }
}
