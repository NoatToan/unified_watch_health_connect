package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class ol9 extends wk1<AssetFileDescriptor> {
    public ol9(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.jl5
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.wk1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // defpackage.wk1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
