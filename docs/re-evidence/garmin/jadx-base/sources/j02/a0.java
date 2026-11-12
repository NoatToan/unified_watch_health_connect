package j02;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.ReorderableLazyCollectionState", f = "ReorderableLazyCollection.kt", l = {322}, m = "onDragStart-d-4ec7I$gcm_common_ui_vanillaRelease", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f96018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f96019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f96020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f96021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f96022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s<Object> f96023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f96024g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(s<Object> sVar, t13.d<? super a0> dVar) {
        super(dVar);
        this.f96023f = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96022e = obj;
        this.f96024g |= Integer.MIN_VALUE;
        return this.f96023f.g(null, 0L, this);
    }
}
