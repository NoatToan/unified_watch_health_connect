package px2;

import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.samd.protoimpl.GarminHealthServiceHandler", f = "GarminHealthServiceHandler.kt", l = {266, 280, 282, 353, 355, 353, 355, 353, 355, 367, 371, 371, 371, 374}, m = "handleMsg")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f141809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f141810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f141811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f141812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f141813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f141814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f141815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f141816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f141817i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f141816h = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141815g = obj;
        this.f141817i |= Integer.MIN_VALUE;
        return this.f141816h.i(null, null, this);
    }
}
