package ss1;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl", f = "GarminTrailsRepoImpl.kt", l = {148, 151, ModuleDescriptor.MODULE_VERSION}, m = "getTrailDetails", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qs1.d f160691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f160692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f160693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f160694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f160695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f160696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z zVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f160695e = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160694d = obj;
        this.f160696f |= Integer.MIN_VALUE;
        return this.f160695e.C3(null, null, null, this);
    }
}
