package xa;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f189671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.g f189672b;

    static {
        Pattern.compile(".*-.*");
    }

    public e(d dVar, wa.g gVar, long j8, float f14, String str, boolean z14, boolean z15, boolean z16) {
        fa.a.a(j8 >= 0);
        fa.a.a(f14 == -3.4028235E38f || f14 > 0.0f);
        this.f189671a = dVar;
        this.f189672b = gVar;
    }
}
