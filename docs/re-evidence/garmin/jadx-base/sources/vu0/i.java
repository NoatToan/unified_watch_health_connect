package vu0;

import android.content.Intent;
import android.net.Uri;
import h82.r;
import o13.q;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f180246b;

    public /* synthetic */ i(r rVar, j jVar) {
        this.f180245a = 0;
        this.f180246b = jVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f180245a;
        j jVar = this.f180246b;
        switch (i14) {
            case 0:
                int i15 = j.f180247o;
                try {
                    int i16 = q.f128596b;
                    c.q qVar = jVar.f180256n;
                    if (qVar == null) {
                        s.m("deleteLauncher");
                        throw null;
                    }
                    qVar.a(new Intent("android.intent.action.VIEW", Uri.parse(jVar.f180255m)), null);
                    Unit unit = Unit.INSTANCE;
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    int i17 = q.f128596b;
                    new q.b(th3);
                }
                break;
            case 1:
                int i18 = j.f180247o;
                jVar.e("HOW_IT_WORKS");
                return Unit.INSTANCE;
            case 2:
                int i19 = j.f180247o;
                jVar.e("SHARING_OPTIONS");
                return Unit.INSTANCE;
            case 3:
                int i24 = j.f180247o;
                jVar.e("PROFILE_AND_PRIVACY");
                return Unit.INSTANCE;
            case 4:
                int i25 = j.f180247o;
                jVar.e("GROUP_TRACK");
                return Unit.INSTANCE;
            case 5:
                int i26 = j.f180247o;
                jVar.e("AUTO_START");
                return Unit.INSTANCE;
            case 6:
                int i27 = j.f180247o;
                jVar.e("SHARE_COURSE");
                return Unit.INSTANCE;
            case 7:
                int i28 = j.f180247o;
                jVar.e("ALLOW_MESSAGES");
                return Unit.INSTANCE;
            default:
                int i29 = j.f180247o;
                jVar.e("STRAVA_BEACON");
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(j jVar, int i14) {
        this.f180245a = i14;
        this.f180246b = jVar;
    }
}
