package n92;

import m92.p0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln92/o;", "", "Lm92/p0;", "formatter", "", "minY", "maxY", "", "noOfAxes", "<init>", "(Lm92/p0;Ljava/lang/Float;Ljava/lang/Float;I)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f125093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f125094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f125095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f125096d;

    public /* synthetic */ o(p0 p0Var, Float f14, Float f15, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(p0Var, (i15 & 2) != 0 ? null : f14, (i15 & 4) != 0 ? null : f15, (i15 & 8) != 0 ? 5 : i14);
    }

    public abstract i53.f<o13.p<Float, String>> a();

    public o(p0 p0Var, Float f14, Float f15, int i14) {
        p0Var.getClass();
        this.f125093a = p0Var;
        this.f125094b = f14;
        this.f125095c = f15;
        this.f125096d = i14;
    }
}
