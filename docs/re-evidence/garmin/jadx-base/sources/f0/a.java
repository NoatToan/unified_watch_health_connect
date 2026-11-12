package f0;

import androidx.camera.core.impl.k0;
import b0.b0;
import b0.i1;
import b0.s0;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lf0/a;", "Ld0/a;", "Lb0/b0;", "dynamicRange", "<init>", "(Lb0/b0;)V", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends d0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f67623d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f67624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f67625c;

    static {
        new C1405a(null);
        b0 b0Var = b0.f13854d;
        b0Var.getClass();
        f67623d = b0Var;
    }

    public a(b0 b0Var) {
        b0Var.getClass();
        this.f67624b = b0Var;
        this.f67625c = b.DYNAMIC_RANGE;
    }

    @Override // d0.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getF67635d() {
        return this.f67625c;
    }

    @Override // d0.a
    public final boolean b(k0 k0Var, s0 s0Var) {
        k0Var.getClass();
        Set<b0> setA = k0Var.a();
        setA.getClass();
        setA.toString();
        toString();
        b0 b0Var = this.f67624b;
        if (!setA.contains(b0Var)) {
            return false;
        }
        for (i1 i1Var : s0Var.f14129f) {
            Set<b0> setJ = i1Var.j(k0Var);
            Objects.toString(setJ);
            toString();
            i1Var.toString();
            if (setJ != null && !setJ.contains(b0Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.f67624b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: f0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lb0/b0;", "DEFAULT_DYNAMIC_RANGE", "Lb0/b0;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1405a {
        public /* synthetic */ C1405a(j jVar) {
            this();
        }

        private C1405a() {
        }
    }
}
