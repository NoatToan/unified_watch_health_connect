package e0;

import androidx.camera.core.impl.k0;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import b0.i1;
import b0.l0;
import b0.s0;
import b0.w0;
import ch.qos.logback.core.CoreConstants;
import f0.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Le0/c;", "", "", "Ld0/a;", "features", "<init>", "(Ljava/util/Set;)V", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f61820b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<d0.a> f61821a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Set<? extends d0.a> set) {
        set.getClass();
        this.f61821a = set;
    }

    public final String toString() {
        return "ResolvedFeatureGroup(features=" + this.f61821a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a(a aVar, s0 s0Var, k0 k0Var) {
            boolean z14;
            boolean z15;
            g0.b bVarA;
            List<d0.a> list = s0Var.f14128e;
            g0.a aVar2 = new g0.a(k0Var);
            aVar.getClass();
            k0Var.getClass();
            k0Var.b();
            Set<d0.a> set = s0Var.f14127d;
            if (set.isEmpty() && list.isEmpty()) {
                return null;
            }
            List<i1> list2 = s0Var.f14129f;
            if (set.isEmpty() && list.isEmpty()) {
                h.s("Must have at least one required or preferred feature");
                return null;
            }
            if (list2 != null && list2.isEmpty()) {
                z14 = false;
                break;
            }
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = false;
                    break;
                }
                if (((i1) it.next()) instanceof l0) {
                    z14 = true;
                    break;
                }
            }
            if (list2 == null || !list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        i1 i1Var = (i1) it3.next();
                        if ((i1Var instanceof w0) || CameraUseCaseAdapter.A(i1Var)) {
                            z15 = true;
                        }
                    } else {
                        z15 = false;
                    }
                }
            } else {
                z15 = false;
            }
            Iterator<T> it4 = list2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    i1 i1Var2 = (i1) it4.next();
                    d.f61822b.getClass();
                    if (d.a.a(i1Var2) == d.UNDEFINED) {
                        bVarA = new g0.b.c(i1Var2);
                        break;
                    }
                } else {
                    Iterator<T> it5 = set.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list) {
                                if (((d0.a) obj) instanceof f0.d ? z14 : true) {
                                    arrayList.add(obj);
                                }
                            }
                            bVarA = aVar2.a(s0Var, arrayList, 0, j0.f134944a);
                            break;
                        }
                        d0.a aVar3 = (d0.a) it5.next();
                        if (aVar3 instanceof f0.d) {
                            if (!z14) {
                                bVarA = new g0.b.d(d.IMAGE_CAPTURE.toString(), aVar3);
                                break;
                            }
                        } else if ((aVar3 instanceof f0.a) || (aVar3 instanceof f0.c) || (aVar3 instanceof e)) {
                            if (!z15) {
                                bVarA = new g0.b.d(d.PREVIEW + " or " + d.VIDEO_CAPTURE, aVar3);
                                break;
                            }
                        }
                    }
                }
            }
            if (bVarA instanceof g0.b.a) {
                c cVar = ((g0.b.a) bVarA).f74078a;
                Objects.toString(cVar);
                return cVar;
            }
            if (bVarA instanceof g0.b.C1505b) {
                h.s("Feature group is not supported");
                return null;
            }
            if (bVarA instanceof g0.b.c) {
                com.google.protobuf.a.i(((g0.b.c) bVarA).f74080a, " is not supported");
                return null;
            }
            if (!(bVarA instanceof g0.b.d)) {
                u0.r();
                return null;
            }
            g0.b.d dVar = (g0.b.d) bVarA;
            throw new IllegalArgumentException(dVar.f74081a + " must be added for " + dVar.f74082b);
        }

        private a() {
        }
    }
}
