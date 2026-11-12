package zk;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzk/e;", "", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f205041b;

    public e(String str, Object obj) {
        str.getClass();
        obj.getClass();
        this.f205040a = str;
        this.f205041b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f205040a.equals(eVar.f205040a) && this.f205041b.equals(eVar.f205041b);
    }

    public final int hashCode() {
        return this.f205041b.hashCode() + (this.f205040a.hashCode() * 31);
    }

    public final String toString() {
        return "AnalyticsParameter(key=" + this.f205040a + ", value=" + this.f205041b + ")";
    }
}
