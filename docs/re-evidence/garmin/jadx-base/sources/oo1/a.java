package oo1;

import com.garmin.android.apps.connectmobile.userprofile.model.j;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import f12.l;
import p005kotlin.Metadata;
import w13.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loo1/a;", "", "Lf12/l;", "gcmUserSettings", "Lno1/b;", "profileImageEventManager", "<init>", "(Lf12/l;Lno1/b;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f133127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final no1.b f133128b;

    public a(l lVar, no1.b bVar) {
        lVar.getClass();
        bVar.getClass();
        this.f133127a = lVar;
        this.f133128b = bVar;
    }

    public final void a(j jVar) {
        String str;
        String str2 = jVar != null ? jVar.f46875d : null;
        l lVar = this.f133127a;
        lVar.l4(str2);
        c cVar = k.f46891k;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            k kVar = (k) bVarN.next();
            if (jVar != null) {
                kVar.getClass();
                str = jVar.f46872a.get(kVar);
            } else {
                str = null;
            }
            lVar.r4(kVar.name(), str);
        }
        this.f133128b.b();
    }
}
