package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideGenesisActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj31/g0;", "Lj31/z0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 implements z0 {
    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        ds.e0.p(context, str, str2);
        GroupRideGenesisActivity.f44734a.getClass();
        Intent intent = new Intent(context, (Class<?>) GroupRideGenesisActivity.class);
        intent.putExtra("GCM_deviceUnitID", j8);
        context.startActivity(intent);
    }
}
