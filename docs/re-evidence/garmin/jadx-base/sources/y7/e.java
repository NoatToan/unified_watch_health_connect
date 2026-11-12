package y7;

import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class e extends w implements e23.a<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<File> f194633a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(e23.a<? extends File> aVar) {
        super(0);
        this.f194633a = aVar;
    }

    @Override // e23.a
    public final File invoke() {
        File fileInvoke = this.f194633a.invoke();
        if (!a23.g.e(fileInvoke).equals("preferences_pb")) {
            e0.n(wr.g.o("File extension for file: ", fileInvoke, " does not match required extension for Preferences file: preferences_pb"));
            return null;
        }
        File absoluteFile = fileInvoke.getAbsoluteFile();
        absoluteFile.getClass();
        return absoluteFile;
    }
}
