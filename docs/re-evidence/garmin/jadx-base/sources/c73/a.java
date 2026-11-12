package c73;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public class a implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f25255a;

    public a(File file) {
        this.f25255a = file;
    }

    @Override // c73.c.b
    public final FileChannel getChannel() {
        return new FileInputStream(this.f25255a).getChannel();
    }
}
