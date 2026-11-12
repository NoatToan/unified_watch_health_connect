package m63;

import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm63/j0;", "Lm63/m1;", "", "name", "Lm63/e0;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lm63/e0;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 extends m1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f116965m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(String str, e0<?> e0Var) {
        super(str, e0Var, 1);
        str.getClass();
        e0Var.getClass();
        this.f116965m = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, o13.l] */
    @Override // m63.m1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            k63.e eVar = (k63.e) obj;
            if (p005kotlin.jvm.internal.s.g(this.f116983a, eVar.getF116983a())) {
                j0 j0Var = (j0) obj;
                if (j0Var.f116965m && Arrays.equals((k63.e[]) this.f116993k.getValue(), (k63.e[]) j0Var.f116993k.getValue())) {
                    int f116985c = eVar.getF116985c();
                    int i14 = this.f116985c;
                    if (i14 == f116985c) {
                        for (int i15 = 0; i15 < i14; i15++) {
                            if (p005kotlin.jvm.internal.s.g(h(i15).getF116983a(), eVar.h(i15).getF116983a()) && p005kotlin.jvm.internal.s.g(h(i15).getF103234b(), eVar.h(i15).getF103234b())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // m63.m1
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: isInline, reason: from getter */
    public final boolean getF116965m() {
        return this.f116965m;
    }
}
