package u7;

import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ljava/io/File;", "it", "Lu7/t0;", "invoke", "(Ljava/io/File;)Lu7/t0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class c1 extends p005kotlin.jvm.internal.w implements e23.l<File, t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f169102a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(o53.b0 b0Var) {
        super(1);
        this.f169102a = b0Var;
    }

    @Override // e23.l
    public final t0 invoke(File file) {
        File file2 = file;
        file2.getClass();
        return new w0(this.f169102a.getF7937b(), file2);
    }
}
