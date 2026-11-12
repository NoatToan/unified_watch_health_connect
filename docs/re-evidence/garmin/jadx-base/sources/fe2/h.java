package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession", f = "ClassicSession.kt", l = {261}, m = "startUpload", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f70761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f70762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f70763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f70763c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70762b = obj;
        this.f70764d |= Integer.MIN_VALUE;
        int i14 = b.f70632t;
        return this.f70763c.x(this);
    }
}
