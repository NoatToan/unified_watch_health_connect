package qi2;

import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqi2/c;", "", "Lui2/a;", "environment", "", "applicationId", "Lqi2/d;", "flow", "", "isAppDebugBuild", "<init>", "(Lui2/a;Ljava/lang/String;Lqi2/d;Z)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui2.a f144948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f144950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f144951d;

    public c(ui2.a aVar, String str, d dVar, boolean z14) {
        aVar.getClass();
        str.getClass();
        dVar.getClass();
        this.f144948a = aVar;
        this.f144949b = str;
        this.f144950c = dVar;
        this.f144951d = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f144948a == cVar.f144948a && this.f144949b.equals(cVar.f144949b) && this.f144950c == cVar.f144950c && this.f144951d == cVar.f144951d;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f144951d) + ((this.f144950c.hashCode() + g.j(this.f144948a.hashCode() * 31, 31, this.f144949b)) * 31);
    }
}
