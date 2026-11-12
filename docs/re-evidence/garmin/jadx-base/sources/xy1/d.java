package xy1;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxy1/d;", "", "Lxy1/c;", Action.KEY_ATTRIBUTE, "", "displayString", "<init>", "(Lxy1/c;Ljava/lang/String;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f192712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192713b;

    public d(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        this.f192712a = cVar;
        this.f192713b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f192712a == dVar.f192712a && this.f192713b.equals(dVar.f192713b);
    }

    public final int hashCode() {
        return this.f192713b.hashCode() + (this.f192712a.hashCode() * 31);
    }

    public final String toString() {
        return "FilterChipModel(key=" + this.f192712a + ", displayString=" + this.f192713b + ")";
    }
}
