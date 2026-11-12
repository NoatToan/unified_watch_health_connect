package r02;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableState", f = "ZoomableState.kt", l = {215, 216}, m = "onDrag-3MmeM6k$gcm_common_ui_vanillaRelease", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f148942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f148943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f148944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f148945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m mVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f148944c = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148943b = obj;
        this.f148945d |= Integer.MIN_VALUE;
        return this.f148944c.j(0L, this);
    }
}
