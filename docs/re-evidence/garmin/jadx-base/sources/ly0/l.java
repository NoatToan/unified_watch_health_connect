package ly0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps.MapFullscreenViewModel", f = "MapFullscreenViewModel.kt", l = {357, 361}, m = "selectPolylines", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f115331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f115332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f115333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f115334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f115333c = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115332b = obj;
        this.f115334d |= Integer.MIN_VALUE;
        return this.f115333c.B4(null, this);
    }
}
