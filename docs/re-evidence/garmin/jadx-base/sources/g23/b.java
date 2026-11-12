package g23;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import k23.l;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg23/b;", "", "T", "Lg23/e;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b<T> implements e<Object, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f75579a;

    @Override // g23.d
    public final T getValue(Object obj, l<?> lVar) {
        lVar.getClass();
        T t7 = this.f75579a;
        if (t7 != null) {
            return t7;
        }
        g.x("Property ", lVar.getF122483i(), " should be initialized before get.");
        return null;
    }

    @Override // g23.e
    public final void setValue(Object obj, l<?> lVar, T t7) {
        lVar.getClass();
        t7.getClass();
        this.f75579a = t7;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("NotNullProperty(");
        if (this.f75579a != null) {
            str = "value=" + this.f75579a;
        } else {
            str = "value not initialized yet";
        }
        return a0.m(sb3, str, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
