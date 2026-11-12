package s00;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/i0;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends j {

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155299a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.SHAREABLE_EVENT_PACEPRO_RECREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n00.c.SHAREABLE_EVENT_PACEPRO_REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n00.c.SHAREABLE_EVENT_POWER_GUIDE_RECREATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f155299a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        String string;
        sz0.e eVar;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        String string2 = bundle.getString("shareable-event-uuid");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = bundle.getString("event-name");
        String str = string3 != null ? string3 : "";
        if (string2.length() <= 0 || str.length() <= 0) {
            return;
        }
        String string4 = garminConnectMobileApp.getString(R.string.common_garmin_connect);
        string4.getClass();
        int i14 = b.f155299a[cVar.ordinal()];
        if (i14 == 1) {
            string = garminConnectMobileApp.getString(R.string.pn_shareable_event_pace_pro_recreate_format, str);
            string.getClass();
            eVar = sz0.e.T;
        } else if (i14 == 2) {
            string = garminConnectMobileApp.getString(R.string.pn_shareable_event_pace_pro_remove_format, str);
            string.getClass();
            eVar = sz0.e.X;
        } else if (i14 != 3) {
            string = garminConnectMobileApp.getString(R.string.pn_shareable_event_powerguide_removed_format, str);
            string.getClass();
            eVar = sz0.e.Z;
        } else {
            string = garminConnectMobileApp.getString(R.string.pn_shareable_event_powerguide_recreate_format, str);
            string.getClass();
            eVar = sz0.e.Y;
        }
        String str2 = string;
        sz0.e eVar2 = eVar;
        int iD = d(cVar);
        EventDetailsActivity.f45692o.getClass();
        Intent intent = new Intent(garminConnectMobileApp, (Class<?>) EventDetailsActivity.class);
        intent.putExtra("GCM_extra_sharable_event_id", string2);
        intent.putExtra("GCM_extra_show_strategy_tab", true);
        intent.putExtra("extra_is_fbt_flow", false);
        j.e(garminConnectMobileApp, eVar2, iD, string4, str2, j.c(garminConnectMobileApp, intent));
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.SHAREABLE_EVENT_PACEPRO_RECREATE, n00.c.SHAREABLE_EVENT_PACEPRO_REMOVED, n00.c.SHAREABLE_EVENT_POWER_GUIDE_RECREATE, n00.c.SHAREABLE_EVENT_POWER_GUIDE_REMOVED};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ls00/i0$a;", "", "<init>", "()V", "", "SHAREABLE_EVENT_UUID", "Ljava/lang/String;", "EVENT_NAME", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
