package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class cke extends ake {
    public final Resources c;

    public cke(Executor executor, n3i n3iVar, Resources resources) {
        super(executor, n3iVar);
        this.c = resources;
    }

    private int g(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
        try {
            assetFileDescriptorOpenRawResourceFd = this.c.openRawResourceFd(h(imageRequest));
            int length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            try {
                assetFileDescriptorOpenRawResourceFd.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptorOpenRawResourceFd == null) {
                return -1;
            }
            try {
                assetFileDescriptorOpenRawResourceFd.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static int h(ImageRequest imageRequest) {
        return Integer.parseInt(imageRequest.q().getPath().substring(1));
    }

    @Override // defpackage.ake
    public o98 d(ImageRequest imageRequest) throws IOException {
        return e(this.c.openRawResource(h(imageRequest)), g(imageRequest));
    }

    @Override // defpackage.ake
    public String f() {
        return "LocalResourceFetchProducer";
    }
}
