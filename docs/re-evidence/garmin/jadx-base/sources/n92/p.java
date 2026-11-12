package n92;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;
import s5.s0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln92/p;", "", "Ls5/s0;", "textMeasurer", "Ls5/x0;", TtmlNode.TAG_STYLE, "endStyle", "<init>", "(Ls5/s0;Ls5/x0;Ls5/x0;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f125097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f125098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f125099c;

    public p(s0 s0Var, x0 x0Var, x0 x0Var2) {
        s0Var.getClass();
        x0Var.getClass();
        x0Var2.getClass();
        this.f125097a = s0Var;
        this.f125098b = x0Var;
        this.f125099c = x0Var2;
    }

    public abstract f a(q4.f fVar, List<o13.p<Float, String>> list, List<o13.p<Float, String>> list2, float f14);

    public /* synthetic */ p(s0 s0Var, x0 x0Var, x0 x0Var2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(s0Var, x0Var, (i14 & 4) != 0 ? x0Var : x0Var2);
    }
}
