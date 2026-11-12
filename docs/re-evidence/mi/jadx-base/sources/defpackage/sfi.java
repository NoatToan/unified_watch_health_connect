package defpackage;

import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class sfi extends ake {
    public final ContentResolver c;

    public sfi(Executor executor, n3i n3iVar, ContentResolver contentResolver) {
        super(executor, n3iVar);
        this.c = contentResolver;
    }

    @Override // defpackage.ake
    public o98 d(ImageRequest imageRequest) throws IOException {
        return e(this.c.openInputStream(imageRequest.q()), -1);
    }

    @Override // defpackage.ake
    public String f() {
        return "QualifiedResourceFetchProducer";
    }
}
