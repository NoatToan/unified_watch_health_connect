package w02;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.reorderable.ReorderableLazyListState", f = "ReorderableLazyListState.kt", l = {343, 399}, m = "moveDraggingItemToEnd", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0.b f181138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f181139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f181140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f181141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f181140c = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f181139b = obj;
        this.f181141d |= Integer.MIN_VALUE;
        return r.a(this.f181140c, null, this);
    }
}
