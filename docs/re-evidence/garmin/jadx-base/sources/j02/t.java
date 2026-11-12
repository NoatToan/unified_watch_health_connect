package j02;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.ReorderableLazyCollectionState", f = "ReorderableLazyCollection.kt", l = {446, 499}, m = "moveDraggingItemToEnd", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0.b f96150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s<Object> f96152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s<Object> sVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f96152c = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96151b = obj;
        this.f96153d |= Integer.MIN_VALUE;
        return s.a(this.f96152c, null, this);
    }
}
