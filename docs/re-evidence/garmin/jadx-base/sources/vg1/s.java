package vg1;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public class s implements e23.l<n80.a, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.f f178155a;

    public s(com.garmin.android.apps.connectmobile.settings.devices.common.f fVar) {
        this.f178155a = fVar;
    }

    @Override // e23.l
    public final Unit invoke(n80.a aVar) {
        n80.a aVar2 = aVar;
        CompanionDeviceLinkActivity.a aVar3 = CompanionDeviceLinkActivity.f33743a;
        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar = this.f178155a;
        Context contextRequireContext = fVar.requireContext();
        f.c<Intent> cVar = fVar.L0;
        aVar3.getClass();
        contextRequireContext.getClass();
        aVar2.getClass();
        cVar.getClass();
        Intent intent = new Intent(contextRequireContext, (Class<?>) CompanionDeviceLinkActivity.class);
        intent.putExtra("companion_device", aVar2);
        cVar.a(intent, null);
        return null;
    }
}
