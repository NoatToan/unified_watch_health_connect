package rc;

import android.os.Bundle;
import com.garmin.android.gncs.NotificationConstants;
import java.io.Serializable;
import lc.q0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrc/d;", "Ljava/io/Serializable;", "D", "Llc/q0;", "Ljava/lang/Class;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class d<D extends Serializable> extends q0<D> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class<D> f151800s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Class<D> cls) {
        super(true);
        cls.getClass();
        this.f151800s = cls;
        if (Serializable.class.isAssignableFrom(cls)) {
            return;
        }
        kg.f.l(cls, " does not implement Serializable.");
        throw null;
    }

    @Override // lc.q0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // lc.q0
    public String b() {
        return this.f151800s.getName();
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, this.f151800s.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return s.g(this.f151800s, ((d) obj).f151800s);
    }

    @Override // lc.q0
    public D h(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f151800s.hashCode();
    }
}
