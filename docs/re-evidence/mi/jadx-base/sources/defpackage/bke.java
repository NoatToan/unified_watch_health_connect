package defpackage;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class bke extends ake {
    public bke(Executor executor, n3i n3iVar) {
        super(executor, n3iVar);
    }

    @Override // defpackage.ake
    public o98 d(ImageRequest imageRequest) throws IOException {
        return e(new FileInputStream(imageRequest.p().toString()), (int) imageRequest.p().length());
    }

    @Override // defpackage.ake
    public String f() {
        return "LocalFileFetchProducer";
    }
}
