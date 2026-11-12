package g0;

import androidx.camera.core.impl.k0;
import b0.s0;
import e0.c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.c1;
import p13.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lg0/a;", "", "Landroidx/camera/core/impl/k0;", "cameraInfoInternal", "<init>", "(Landroidx/camera/core/impl/k0;)V", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f74077a;

    static {
        new C1504a(null);
    }

    public a(k0 k0Var) {
        k0Var.getClass();
        this.f74077a = k0Var;
    }

    public final b a(s0 s0Var, ArrayList arrayList, int i14, List list) {
        if (i14 < arrayList.size()) {
            int i15 = i14 + 1;
            b bVarA = a(s0Var, arrayList, i15, h0.D0(list, arrayList.get(i14)));
            return bVarA instanceof b.a ? bVarA : a(s0Var, arrayList, i15, list);
        }
        LinkedHashSet linkedHashSetH = c1.h(s0Var.f14127d, list);
        linkedHashSetH.toString();
        Objects.toString(s0Var.f14129f);
        return this.f74077a.w(new c(linkedHashSetH), s0Var) ? new b.a(new c(linkedHashSetH)) : b.C1505b.f74079a;
    }

    /* JADX INFO: renamed from: g0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1504a {
        public /* synthetic */ C1504a(j jVar) {
            this();
        }

        private C1504a() {
        }
    }
}
