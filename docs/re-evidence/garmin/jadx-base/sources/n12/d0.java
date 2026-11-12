package n12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewHolder", f = "EditProfileImageViewHolder.kt", l = {224}, m = "storeBitmapToUri", v = 2)
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f122229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.c f122230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f122231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar, t13.d<? super d0> dVar) {
        super(dVar);
        this.f122230b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f122229a = obj;
        this.f122231c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.userprofile.editimage.c.a(this.f122230b, null, this);
    }
}
