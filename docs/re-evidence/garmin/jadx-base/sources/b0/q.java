package b0;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB!\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lb0/q;", "", "", "", "cameraIds", "Landroidx/camera/core/impl/j1;", "compatibilityId", "<init>", "(Ljava/util/List;Landroidx/camera/core/impl/j1;)V", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14044c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f14045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.impl.j1 f14046b;

    private q(List<String> list, androidx.camera.core.impl.j1 j1Var) {
        this.f14045a = list;
        this.f14046b = j1Var;
        k7.h.b(!list.isEmpty(), "Camera ID set cannot be empty.");
    }

    public final String a() {
        List<String> list = this.f14045a;
        k7.h.f(list.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String) p13.h0.b0(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f14045a, qVar.f14045a) && p005kotlin.jvm.internal.s.g(this.f14046b, qVar.f14046b);
    }

    public final int hashCode() {
        int iHashCode = this.f14045a.hashCode() * 31;
        androidx.camera.core.impl.j1 j1Var = this.f14046b;
        return iHashCode + (j1Var != null ? j1Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("CameraIdentifier{cameraIds=");
        sb3.append(p13.h0.k0(this.f14045a, ",", null, null, null, 62));
        androidx.camera.core.impl.j1 j1Var = this.f14046b;
        if (j1Var != null) {
            str = ", compatId=" + j1Var;
        } else {
            str = "";
        }
        return androidx.room.a0.m(sb3, str, CoreConstants.CURLY_RIGHT);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb0/q$a;", "", "<init>", "()V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static q a(String str, String str2, androidx.camera.core.impl.j1 j1Var) {
            ArrayList arrayListM = p13.x.m(str);
            if (str2 != null) {
                arrayListM.add(str2);
            }
            return new q(arrayListM, j1Var, null);
        }

        public static q b(androidx.camera.core.impl.c cVar, androidx.camera.core.impl.c cVar2) {
            String strQ = cVar2 != null ? cVar2.f5574a.q() : null;
            androidx.camera.core.impl.l lVar = ((androidx.camera.core.impl.g0.a) cVar.f5517d).N;
            lVar.getClass();
            String strQ2 = cVar.f5574a.q();
            strQ2.getClass();
            return a(strQ2, strQ, lVar);
        }

        private a() {
        }
    }

    public /* synthetic */ q(List list, androidx.camera.core.impl.j1 j1Var, p005kotlin.jvm.internal.j jVar) {
        this(list, j1Var);
    }
}
