package uy0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetConnectPlusItemsUseCase", f = "GetConnectPlusItemsUseCase.kt", l = {24}, m = "invoke", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f173231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f173232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f173233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f173234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f173233c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173232b = obj;
        this.f173234d |= Integer.MIN_VALUE;
        return this.f173233c.a(this);
    }
}
