package sk0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddCollectionViewModel", f = "AddCollectionViewModel.kt", l = {220, 225, 229}, m = "associateGear", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jk0.j f159826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f159827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f159828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f159829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f159830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f159829d = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f159828c = obj;
        this.f159830e |= Integer.MIN_VALUE;
        return u.x4(this.f159829d, null, null, null, false, this);
    }
}
