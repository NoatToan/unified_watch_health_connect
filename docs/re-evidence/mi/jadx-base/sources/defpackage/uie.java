package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class uie extends ake {
    public final AssetManager c;

    public uie(Executor executor, n3i n3iVar, AssetManager assetManager) {
        super(executor, n3iVar);
        this.c = assetManager;
    }

    public static String g(ImageRequest imageRequest) {
        return imageRequest.q().getPath().substring(1);
    }

    @Override // defpackage.ake
    public o98 d(ImageRequest imageRequest) throws IOException {
        return e(this.c.open(g(imageRequest), 2), h(imageRequest));
    }

    @Override // defpackage.ake
    public String f() {
        return "LocalAssetFetchProducer";
    }

    public final int h(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            assetFileDescriptorOpenFd = this.c.openFd(g(imageRequest));
            int length = (int) assetFileDescriptorOpenFd.getLength();
            try {
                assetFileDescriptorOpenFd.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (IOException unused2) {
            if (assetFileDescriptorOpenFd == null) {
                return -1;
            }
            try {
                assetFileDescriptorOpenFd.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }
}
