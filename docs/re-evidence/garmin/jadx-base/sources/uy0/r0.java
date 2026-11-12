package uy0;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetSearchableItemsUseCase", f = "GetSearchableItemsUseCase.kt", l = {26, 34}, m = "getChildren", v = 2)
public final class r0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f173289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f173290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f173291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f173292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f173293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f173294f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(u0 u0Var, t13.d<? super r0> dVar) {
        super(dVar);
        this.f173293e = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173292d = obj;
        this.f173294f |= Integer.MIN_VALUE;
        return u0.a(this.f173293e, null, this);
    }
}
