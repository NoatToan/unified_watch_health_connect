package il2;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.legacy.LegacySyncManager$requestSync$syncRequestListener$1", f = "LegacySyncManager.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "await")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.d f94033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f94034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.d f94035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a.d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f94035c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f94034b = obj;
        this.f94036d |= Integer.MIN_VALUE;
        return this.f94035c.a(this);
    }
}
