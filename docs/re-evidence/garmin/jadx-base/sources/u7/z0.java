package u7;

import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class z0 extends p005kotlin.jvm.internal.w implements e23.a<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f169382a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(w0 w0Var) {
        super(0);
        this.f169382a = w0Var;
    }

    @Override // e23.a
    public final File invoke() {
        w0 w0Var = this.f169382a;
        File file = new File(w0Var.f169348b.getAbsolutePath() + w0Var.f169351e);
        w0.f(w0Var, file);
        return file;
    }
}
