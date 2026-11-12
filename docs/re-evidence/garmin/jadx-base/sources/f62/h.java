package f62;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0082\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf62/h;", "KeyType", "T", "", Action.KEY_ATTRIBUTE, "item", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h<KeyType, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyType f69246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f69247b;

    public h(KeyType keytype, T t7) {
        this.f69246a = keytype;
        this.f69247b = t7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f69246a, hVar.f69246a) && p005kotlin.jvm.internal.s.g(this.f69247b, hVar.f69247b);
    }

    public final int hashCode() {
        KeyType keytype = this.f69246a;
        int iHashCode = (keytype == null ? 0 : keytype.hashCode()) * 31;
        T t7 = this.f69247b;
        return iHashCode + (t7 != null ? t7.hashCode() : 0);
    }

    public final String toString() {
        return "ItemWithKey(key=" + this.f69246a + ", item=" + this.f69247b + ")";
    }
}
