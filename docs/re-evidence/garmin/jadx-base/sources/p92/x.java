package p92;

import android.net.Uri;
import androidx.lifecycle.z0;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class x {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f136663a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f136663a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f136663a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f136663a.invoke(obj);
        }
    }

    public static final String a(ve2.e eVar) {
        Uri uri = Uri.parse(ve2.f.a(eVar));
        Uri.Builder builderPath = uri.buildUpon().path(null);
        List<String> pathSegments = uri.getPathSegments();
        pathSegments.getClass();
        Iterator it = h0.V(1, pathSegments).iterator();
        while (it.hasNext()) {
            builderPath.appendPath((String) it.next());
        }
        String string = builderPath.build().toString();
        string.getClass();
        return string;
    }
}
