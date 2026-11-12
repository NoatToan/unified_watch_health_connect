package uc0;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkActivity;
import e23.l;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComposeView f169947b;

    public /* synthetic */ c(ComposeView composeView, int i14) {
        this.f169946a = i14;
        this.f169947b = composeView;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f169946a;
        ComposeView composeView = this.f169947b;
        n80.a aVar = (n80.a) obj;
        switch (i14) {
            case 0:
                Logger logger = d.f169948i;
                aVar.getClass();
                CompanionDeviceLinkActivity.a aVar2 = CompanionDeviceLinkActivity.f33743a;
                Context context = composeView.getContext();
                context.getClass();
                aVar2.getClass();
                Intent intent = new Intent(context, (Class<?>) CompanionDeviceLinkActivity.class);
                intent.putExtra("companion_device", aVar);
                context.startActivity(intent);
                break;
            default:
                Logger logger2 = com.garmin.android.apps.connectmobile.devices.settings.realtime.c.f34371f;
                aVar.getClass();
                CompanionDeviceLinkActivity.a aVar3 = CompanionDeviceLinkActivity.f33743a;
                Context context2 = composeView.getContext();
                context2.getClass();
                aVar3.getClass();
                Intent intent2 = new Intent(context2, (Class<?>) CompanionDeviceLinkActivity.class);
                intent2.putExtra("companion_device", aVar);
                context2.startActivity(intent2);
                break;
        }
        return Unit.INSTANCE;
    }
}
