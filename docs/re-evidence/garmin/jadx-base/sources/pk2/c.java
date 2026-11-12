package pk2;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import o53.l1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper", f = "AgentQueueHelper.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "activePopulateQueue")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f138375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l1 f138376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f138377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f138378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f138379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f138378d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f138377c = obj;
        this.f138379e |= Integer.MIN_VALUE;
        return this.f138378d.f(this);
    }
}
