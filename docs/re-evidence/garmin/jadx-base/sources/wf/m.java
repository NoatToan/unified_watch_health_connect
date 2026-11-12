package wf;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bo\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lwf/m;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxf/g;", "size", "Lxf/f;", "scale", "Lxf/c;", "precision", "", "diskCacheKey", "Lw63/l;", "fileSystem", "Lwf/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lhf/f;", "extras", "<init>", "(Landroid/content/Context;Lxf/g;Lxf/f;Lxf/c;Ljava/lang/String;Lw63/l;Lwf/c;Lwf/c;Lwf/c;Lhf/f;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f184996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xf.g f184997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xf.f f184998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xf.c f184999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f185000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w63.l f185001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f185002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f185003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f185004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final hf.f f185005j;

    public m(Context context, xf.g gVar, xf.f fVar, xf.c cVar, String str, w63.l lVar, c cVar2, c cVar3, c cVar4, hf.f fVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? xf.g.f190618c : gVar, (i14 & 4) != 0 ? xf.f.FIT : fVar, (i14 & 8) != 0 ? xf.c.EXACT : cVar, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? w63.l.f183387a : lVar, (i14 & 64) != 0 ? c.ENABLED : cVar2, (i14 & 128) != 0 ? c.ENABLED : cVar3, (i14 & 256) != 0 ? c.ENABLED : cVar4, (i14 & 512) != 0 ? hf.f.f83558b : fVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.f184996a, mVar.f184996a) && p005kotlin.jvm.internal.s.g(this.f184997b, mVar.f184997b) && this.f184998c == mVar.f184998c && this.f184999d == mVar.f184999d && p005kotlin.jvm.internal.s.g(this.f185000e, mVar.f185000e) && p005kotlin.jvm.internal.s.g(this.f185001f, mVar.f185001f) && this.f185002g == mVar.f185002g && this.f185003h == mVar.f185003h && this.f185004i == mVar.f185004i && p005kotlin.jvm.internal.s.g(this.f185005j, mVar.f185005j);
    }

    public final int hashCode() {
        int iHashCode = (this.f184999d.hashCode() + ((this.f184998c.hashCode() + ((this.f184997b.hashCode() + (this.f184996a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f185000e;
        return this.f185005j.f83559a.hashCode() + ((this.f185004i.hashCode() + ((this.f185003h.hashCode() + ((this.f185002g.hashCode() + ((this.f185001f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f184996a + ", size=" + this.f184997b + ", scale=" + this.f184998c + ", precision=" + this.f184999d + ", diskCacheKey=" + this.f185000e + ", fileSystem=" + this.f185001f + ", memoryCachePolicy=" + this.f185002g + ", diskCachePolicy=" + this.f185003h + ", networkCachePolicy=" + this.f185004i + ", extras=" + this.f185005j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public m(Context context, xf.g gVar, xf.f fVar, xf.c cVar, String str, w63.l lVar, c cVar2, c cVar3, c cVar4, hf.f fVar2) {
        this.f184996a = context;
        this.f184997b = gVar;
        this.f184998c = fVar;
        this.f184999d = cVar;
        this.f185000e = str;
        this.f185001f = lVar;
        this.f185002g = cVar2;
        this.f185003h = cVar3;
        this.f185004i = cVar4;
        this.f185005j = fVar2;
    }
}
