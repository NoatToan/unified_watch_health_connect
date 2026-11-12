package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class oio extends wk1<InputStream> {
    public oio(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.jl5
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.wk1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // defpackage.wk1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
