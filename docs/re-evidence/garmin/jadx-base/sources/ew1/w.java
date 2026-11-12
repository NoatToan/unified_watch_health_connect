package ew1;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f66805b;

    public /* synthetic */ w(y yVar, int i14) {
        this.f66804a = i14;
        this.f66805b = yVar;
    }

    @Override // e23.a
    public final Object invoke() {
        androidx.fragment.app.v supportFragmentManager;
        androidx.fragment.app.v supportFragmentManager2;
        androidx.fragment.app.v supportFragmentManager3;
        androidx.fragment.app.v supportFragmentManager4;
        androidx.fragment.app.v supportFragmentManager5;
        androidx.fragment.app.v supportFragmentManager6;
        androidx.fragment.app.v supportFragmentManager7;
        int i14 = this.f66804a;
        int i15 = 0;
        y yVar = this.f66805b;
        switch (i14) {
            case 0:
                y.b bVar = y.f66842g;
                dw1.a aVarH5 = yVar.A6().H5();
                aVarH5.f61435a.setValue(aVarH5.f61442h);
                break;
            case 1:
                if (!yVar.f66844c) {
                    if (yVar.A6().f13385r1 && yVar.A6().Y6()) {
                        androidx.fragment.app.m activity = yVar.getActivity();
                        if (activity != null && (supportFragmentManager5 = activity.getSupportFragmentManager()) != null) {
                            supportFragmentManager5.Z();
                        }
                        yVar.A6().s6().j("FBTItpHoursPerWeekSelectionFragmentCompose");
                    } else if (!yVar.f66844c && yVar.A6().Q6() && yVar.getParentFragmentManager().G("FBTUserUpcomingEventsFragCompose") == null) {
                        yVar.A6().g6(null);
                    } else if (yVar.A6().e7()) {
                        if (yVar.A6().Q6()) {
                            yVar.A6().d8();
                            androidx.fragment.app.m activity2 = yVar.getActivity();
                            if (activity2 != null && (supportFragmentManager4 = activity2.getSupportFragmentManager()) != null) {
                                supportFragmentManager4.a0(0, "FBTUserUpcomingEventsFragCompose");
                            }
                        } else {
                            yVar.A6().x7();
                            androidx.fragment.app.m activity3 = yVar.getActivity();
                            if (activity3 != null && (supportFragmentManager3 = activity3.getSupportFragmentManager()) != null) {
                                supportFragmentManager3.a0(0, "FBTTriathlonTrainingHistoryFragCompose");
                            }
                            aw1.h hVarA6 = yVar.A6();
                            androidx.fragment.app.m mVarRequireActivity = yVar.requireActivity();
                            mVarRequireActivity.getClass();
                            aw1.h.n7(hVarA6, mVarRequireActivity);
                        }
                    } else if (!yVar.f66844c && yVar.A6().Q6() && yVar.getParentFragmentManager().G("FBTAddGoalDataFragment") == null) {
                        yVar.A6().d8();
                        androidx.fragment.app.m activity4 = yVar.getActivity();
                        if (activity4 != null && (supportFragmentManager2 = activity4.getSupportFragmentManager()) != null) {
                            supportFragmentManager2.a0(0, "FBTUserUpcomingEventsFragCompose");
                        }
                    } else {
                        androidx.fragment.app.m activity5 = yVar.getActivity();
                        if (activity5 != null && (supportFragmentManager = activity5.getSupportFragmentManager()) != null) {
                            supportFragmentManager.Z();
                        }
                    }
                    yVar.A6().x6();
                } else if (yVar.A6().J6() || yVar.A6().L6()) {
                    aw1.h hVarA7 = yVar.A6();
                    Context contextRequireContext = yVar.requireContext();
                    contextRequireContext.getClass();
                    hVarA7.E6(vw1.c.d(contextRequireContext));
                } else {
                    androidx.fragment.app.m activity6 = yVar.getActivity();
                    if (activity6 != null && (supportFragmentManager6 = activity6.getSupportFragmentManager()) != null) {
                        supportFragmentManager6.Z();
                    }
                    yVar.A6().x6();
                }
                break;
            default:
                y.b bVar2 = y.f66842g;
                if (yVar.A6().f13385r1) {
                    androidx.fragment.app.m activity7 = yVar.getActivity();
                    if (activity7 != null && (supportFragmentManager7 = activity7.getSupportFragmentManager()) != null) {
                        supportFragmentManager7.a0(0, "FBTReviewInformationFragCompose");
                    }
                    aw1.h hVarA8 = yVar.A6();
                    Context contextRequireContext2 = yVar.requireContext();
                    contextRequireContext2.getClass();
                    hVarA8.E6(vw1.c.d(contextRequireContext2));
                } else if (!yVar.f66844c) {
                    aw1.h hVarA9 = yVar.A6();
                    Context contextRequireContext3 = yVar.requireContext();
                    contextRequireContext3.getClass();
                    hVarA9.E6(vw1.c.d(contextRequireContext3));
                } else if (yVar.A6().J6() || yVar.A6().L6()) {
                    fy1.i.a aVar = fy1.i.f73924a;
                    androidx.fragment.app.m mVarRequireActivity2 = yVar.requireActivity();
                    mVarRequireActivity2.getClass();
                    w wVar = new w(yVar, i15);
                    aVar.getClass();
                    fy1.i.a.u(mVarRequireActivity2, wVar);
                } else {
                    aw1.h hVarA10 = yVar.A6();
                    Context contextRequireContext4 = yVar.requireContext();
                    contextRequireContext4.getClass();
                    hVarA10.E6(vw1.c.d(contextRequireContext4));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
