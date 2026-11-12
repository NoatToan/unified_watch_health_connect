package uy0;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetGCPlusFeatureSettingsItemsUseCase", f = "GetGCPlusFeatureSettingsItemsUseCase.kt", l = {30}, m = "invoke", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f173274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f173275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f173276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f173277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f173276c = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173275b = obj;
        this.f173277d |= Integer.MIN_VALUE;
        return this.f173276c.a(this);
    }
}
