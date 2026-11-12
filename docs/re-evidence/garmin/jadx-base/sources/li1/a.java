package li1;

import f12.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lli1/a;", "", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "<init>", "(Ll22/b;Z)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f112890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f112892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f112893d;

    public a(l22.b bVar, boolean z14) {
        bVar.getClass();
        this.f112890a = bVar;
        this.f112891b = z14;
        this.f112892c = new c(bVar, z14);
        this.f112893d = new b(bVar, z14);
    }

    public /* synthetic */ a(l22.b bVar, boolean z14, int i14, j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() : z14);
    }
}
