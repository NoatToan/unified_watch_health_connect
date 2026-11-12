package id;

import am.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/c;", "", "", "filename", "<init>", "(Ljava/lang/String;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileChannel f92653b;

    public c(String str) {
        str.getClass();
        this.f92652a = str.concat(".lck");
    }

    public final void a() throws IOException {
        String str = this.f92652a;
        if (this.f92653b != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f92653b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th3) {
            FileChannel fileChannel = this.f92653b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f92653b = null;
            com.airbnb.lottie.animation.keyframe.a.x(j.m("Unable to lock file: '", str, "'."), th3);
        }
    }
}
