package zs2;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.fit.FITHandler", f = "FITHandler.kt", l = {187, 201, 222, 234}, m = "sendFitMesg")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f206907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f206908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f206909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteArrayOutputStream f206910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f206911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f206912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f206913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f206914h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f206913g = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f206912f = obj;
        this.f206914h |= Integer.MIN_VALUE;
        return this.f206913g.e(null, this);
    }
}
