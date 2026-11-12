package sk0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddCollectionViewModel", f = "AddCollectionViewModel.kt", l = {249}, m = "backfillGear", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jk0.j f159835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f159836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f159837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f159838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f159837c = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f159836b = obj;
        this.f159838d |= Integer.MIN_VALUE;
        return this.f159837c.y4(null, this);
    }
}
