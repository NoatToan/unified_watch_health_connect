package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f28728a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f28728a.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> b() {
        return this.f28728a;
    }
}
