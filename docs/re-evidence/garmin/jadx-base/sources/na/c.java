package na;

import androidx.media3.common.b0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f125103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f125104c;

    public c(String str, List<String> list, boolean z14) {
        this.f125102a = str;
        this.f125103b = Collections.unmodifiableList(list);
        this.f125104c = z14;
    }

    public abstract c a(List<b0> list);
}
