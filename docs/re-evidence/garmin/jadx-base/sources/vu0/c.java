package vu0;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.v;
import c22.s3;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import lc.u0;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p92.o;
import q92.x;
import s92.l;
import z10.d2;
import z10.h2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveTrackActivity f180232b;

    public /* synthetic */ c(LiveTrackActivity liveTrackActivity, int i14) {
        this.f180231a = i14;
        this.f180232b = liveTrackActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Parcelable parcelable;
        int i14 = this.f180231a;
        LiveTrackActivity liveTrackActivity = this.f180232b;
        switch (i14) {
            case 0:
                LiveTrackActivity.a aVar = LiveTrackActivity.f38637g;
                liveTrackActivity.finish();
                return Unit.INSTANCE;
            case 1:
                LiveTrackActivity.a aVar2 = LiveTrackActivity.f38637g;
                wu0.d dVarDa = liveTrackActivity.da();
                wu0.c cVar = dVarDa.f187254l;
                wu0.c cVar2 = dVarDa.f187253k;
                hl.a aVar3 = dVarDa.f187244b;
                wu0.d.a aVar4 = dVarDa.f187245c;
                wu0.d.c cVar3 = (wu0.d.c) dVarDa.f187246d.getF182175a();
                if (cVar3 != null) {
                    x xVar = cVar3.f187255a;
                    v vVarH7 = aVar4.h7();
                    if (vVarH7.G("CONSENT_FRAGMENT") == null || !s.g(dVarDa.f187250h, cVar3)) {
                        dVarDa.f187250h = cVar3;
                        w02.b bVar = new w02.b(20, vVarH7, dVarDa);
                        if (aVar3.equals(hl.a.c.f84256b)) {
                            o.x(o.f136619a, aVar4.S1(), (LiveTrackActivity) aVar4, bVar, cVar2, cVar, xVar, cVar3.f187256b, null, null, s3.b(), false, 2880);
                        } else {
                            if (!(aVar3 instanceof hl.a.b)) {
                                u0.r();
                                return null;
                            }
                            o.z(o.f136619a, aVar4.S1(), (LiveTrackActivity) aVar4, bVar, cVar2, cVar, xVar, new l(String.valueOf(((hl.a.b) aVar3).f84252b)), cVar3.f187256b, null, false, 1664);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                LiveTrackActivity.a aVar5 = LiveTrackActivity.f38637g;
                wu0.d dVarDa2 = liveTrackActivity.da();
                if (dVarDa2.f187245c.V6()) {
                    dVarDa2.f187243a.y4(x.DI_CONNECT_LIVETRACK, null);
                } else {
                    dVarDa2.f187247e.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 3:
                LiveTrackActivity.a aVar6 = LiveTrackActivity.f38637g;
                wu0.d dVarDa3 = liveTrackActivity.da();
                if (dVarDa3.f187245c.V6()) {
                    dVarDa3.f187243a.y4(x.DI_CONNECT_LIVETRACK_STRAVA_BEACON, null);
                } else {
                    dVarDa3.f187247e.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 4:
                LiveTrackActivity.a aVar7 = LiveTrackActivity.f38637g;
                Bundle extras = liveTrackActivity.getIntent().getExtras();
                if (extras != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) extras.getParcelable("extra_screen_access_role", hl.a.class);
                    } else {
                        Parcelable parcelable2 = extras.getParcelable("extra_screen_access_role");
                        parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                    }
                    hl.a aVar8 = (hl.a) parcelable;
                    if (aVar8 != null) {
                        return aVar8;
                    }
                }
                return hl.a.c.f84256b;
            case 5:
                LiveTrackActivity.a aVar9 = LiveTrackActivity.f38637g;
                return ParametersHolderKt.parametersOf((hl.a) liveTrackActivity.f38638a.getValue());
            case 6:
                LiveTrackActivity.a aVar10 = LiveTrackActivity.f38637g;
                return new h2((hl.a) liveTrackActivity.f38638a.getValue());
            case 7:
                LiveTrackActivity.a aVar11 = LiveTrackActivity.f38637g;
                return new wu0.d((d2) liveTrackActivity.f38642e.getValue(), (hl.a) liveTrackActivity.f38638a.getValue(), liveTrackActivity);
            default:
                LiveTrackActivity.a aVar12 = LiveTrackActivity.f38637g;
                liveTrackActivity.da().f187247e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
