package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41751a;

    public /* synthetic */ c(int i14) {
        this.f41751a = i14;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f41751a) {
            case 0:
                DeleteAllOnboardingItems.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0(dialogInterface, i14);
                break;
            case 1:
                DeleteAllOnboardingItems.AnonymousClass1.AnonymousClass5.invokeSuspend$lambda$0(dialogInterface, i14);
                break;
            case 2:
                FeedbackLoopInfo.handleClick$lambda$0(dialogInterface, i14);
                break;
            case 3:
                dialogInterface.dismiss();
                break;
            case 4:
                dialogInterface.dismiss();
                break;
            case 5:
                LifestyleLoggingOnboardingReset.handleClick$lambda$1(dialogInterface, i14);
                break;
            case 6:
                ResetLivetrackShareMethods.handleClick$lambda$0(dialogInterface, i14);
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
