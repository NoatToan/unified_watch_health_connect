package w02;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.reorderable.ReorderableLazyListState", f = "ReorderableLazyListState.kt", l = {253}, m = "onDragStart$gcm_common_ui_vanillaRelease", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f181164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e2.n f181165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e2.n f181166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f181167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f181168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f181169f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(r rVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f181168e = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f181167d = obj;
        this.f181169f |= Integer.MIN_VALUE;
        return this.f181168e.h(null, this);
    }
}
