package defpackage;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class mza implements xqk<kza> {
    @Override // defpackage.xqk
    public EncodeStrategy a(cch cchVar) {
        return EncodeStrategy.SOURCE;
    }

    @Override // defpackage.x98
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(kqk<kza> kqkVar, File file, cch cchVar) throws Throwable {
        try {
            f73.f(kqkVar.get().c(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }
}
