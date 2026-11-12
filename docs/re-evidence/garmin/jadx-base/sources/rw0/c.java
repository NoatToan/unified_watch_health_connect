package rw0;

import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/c;", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements com.garmin.android.library.mapsdkadapter.i.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<GCMMapPreview, Unit> f154822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCMMapPreview f154823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<GCMMapPreview, Unit> f154824c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(e23.l<? super GCMMapPreview, Unit> lVar, GCMMapPreview gCMMapPreview, e23.l<? super GCMMapPreview, Unit> lVar2) {
        this.f154822a = lVar;
        this.f154823b = gCMMapPreview;
        this.f154824c = lVar2;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void O5(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        this.f154824c.invoke(this.f154823b);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        this.f154822a.invoke(this.f154823b);
    }
}
