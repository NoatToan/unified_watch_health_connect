package com.mapbox.common.location;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class BaseDeviceLocationProvider$locationUpdatePendingIntent$2 extends w implements e23.a<PendingIntent> {
    final /* synthetic */ BaseDeviceLocationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDeviceLocationProvider$locationUpdatePendingIntent$2(BaseDeviceLocationProvider baseDeviceLocationProvider) {
        super(0);
        this.this$0 = baseDeviceLocationProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final PendingIntent invoke() {
        Intent intent = new Intent(this.this$0.getContext(), (Class<?>) LocationUpdatesReceiver.class);
        intent.setAction(LocationUpdatesReceiver.ACTION_PROCESS_LOCATION_UPDATES);
        int i14 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        intent.putExtra(LocationUpdatesReceiver.LOCATION_PROVIDER_ID_KEY, this.this$0.getPersistentId());
        return PendingIntent.getBroadcast(this.this$0.getContext(), this.this$0.getPersistentId(), intent, i14);
    }
}
