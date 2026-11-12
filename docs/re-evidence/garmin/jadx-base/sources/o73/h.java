package o73;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.extension.compose.style.standard.StandardStyleConfigurationState;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo73/h;", "", "Lo73/d;", "language", "Lo73/f;", TtmlNode.TAG_REGION, "Lo73/a0;", StandardStyleConfigurationState.CONFIG_THEME, "Lo73/c;", "density", "<init>", "(Lo73/d;Lo73/f;Lo73/a0;Lo73/c;)V", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f130758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f130759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f130760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f130761d;

    public h(d dVar, f fVar, a0 a0Var, c cVar) {
        dVar.getClass();
        fVar.getClass();
        a0Var.getClass();
        cVar.getClass();
        this.f130758a = dVar;
        this.f130759b = fVar;
        this.f130760c = a0Var;
        this.f130761d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f130758a.equals(hVar.f130758a) && this.f130759b.equals(hVar.f130759b) && this.f130760c == hVar.f130760c && this.f130761d == hVar.f130761d;
    }

    public final int hashCode() {
        return this.f130761d.hashCode() + ((this.f130760c.hashCode() + wr.g.j(this.f130758a.f130754a.hashCode() * 31, 31, this.f130759b.f130755a)) * 31);
    }
}
