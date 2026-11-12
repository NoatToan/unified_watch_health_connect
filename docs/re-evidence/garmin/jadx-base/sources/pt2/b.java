package pt2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpt2/b;", "Lxc2/a;", "Lve2/e;", "environmentDelegate", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpt2/f;", "livetrackDelegate", "Lpt2/c;", "diOAuth2NetworkDelegate", "Lpt2/e;", "itOAuth2NetworkDelegate", "Lpt2/d;", "hermesNetworkDelegate", "<init>", "(Lxc2/a;Landroid/content/Context;Lpt2/f;Lpt2/c;Lpt2/e;Lpt2/d;)V", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements xc2.a<ve2.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xc2.a<ve2.e> f141037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f141038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f141039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f141040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f141041e;

    public /* synthetic */ b(xc2.a aVar, Context context, f fVar, c cVar, e eVar, d dVar, int i14, j jVar) {
        this(aVar, context, (i14 & 4) != 0 ? null : fVar, (i14 & 8) != 0 ? null : cVar, (i14 & 16) != 0 ? null : eVar, (i14 & 32) != 0 ? null : dVar);
    }

    @Override // xc2.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ve2.e a() {
        return this.f141037a.a();
    }

    public b(xc2.a<ve2.e> aVar, Context context, f fVar, c cVar, e eVar, d dVar) {
        aVar.getClass();
        context.getClass();
        this.f141037a = aVar;
        this.f141038b = context;
        this.f141039c = fVar;
        this.f141040d = cVar;
        this.f141041e = eVar;
    }
}
