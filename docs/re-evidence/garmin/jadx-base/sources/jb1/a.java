package jb1;

import android.view.View;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.logdelivery.PregnancyLogDeliveryDateActivity;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PregnancyLogDeliveryDateActivity f98112b;

    public /* synthetic */ a(PregnancyLogDeliveryDateActivity pregnancyLogDeliveryDateActivity, int i14) {
        this.f98111a = i14;
        this.f98112b = pregnancyLogDeliveryDateActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f98111a;
        PregnancyLogDeliveryDateActivity pregnancyLogDeliveryDateActivity = this.f98112b;
        switch (i14) {
            case 0:
                PregnancyLogDeliveryDateActivity.a aVar = PregnancyLogDeliveryDateActivity.f40875e;
                pregnancyLogDeliveryDateActivity.ia();
                break;
            case 1:
                PregnancyLogDeliveryDateActivity.a aVar2 = PregnancyLogDeliveryDateActivity.f40875e;
                pregnancyLogDeliveryDateActivity.ha(false);
                pregnancyLogDeliveryDateActivity.da();
                break;
            case 2:
                PregnancyLogDeliveryDateActivity.a aVar3 = PregnancyLogDeliveryDateActivity.f40875e;
                pregnancyLogDeliveryDateActivity.ia();
                break;
            case 3:
                PregnancyLogDeliveryDateActivity.a aVar4 = PregnancyLogDeliveryDateActivity.f40875e;
                pregnancyLogDeliveryDateActivity.ia();
                break;
            default:
                PregnancyLogDeliveryDateActivity.a aVar5 = PregnancyLogDeliveryDateActivity.f40875e;
                pregnancyLogDeliveryDateActivity.ea().debug("updatePregnancySnapshot: ");
                dh.b.L(pregnancyLogDeliveryDateActivity.fa().C4(), pregnancyLogDeliveryDateActivity, new PregnancyLogDeliveryDateActivity.c(new b(pregnancyLogDeliveryDateActivity, 1)));
                pregnancyLogDeliveryDateActivity.fa().D4(true);
                break;
        }
    }
}
