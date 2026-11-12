package tv2;

import android.app.Dialog;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import ew2.e;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import s70.a0;
import zw2.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltv2/a;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3135a f166658a = new C3135a(null);

    /* JADX INFO: renamed from: tv2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltv2/a$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3135a {
        public /* synthetic */ C3135a(j jVar) {
            this();
        }

        public static void a(Context context, SettingsDeviceActivity settingsDeviceActivity, f fVar, b bVar, e23.a aVar) {
            fVar.getClass();
            bVar.getClass();
            String strB = fVar.b(bVar.f166659a);
            String strB2 = fVar.b(bVar.f166660b);
            String strB3 = fVar.b(bVar.f166661c);
            if (strB3.length() == 0) {
                strB3 = context.getString(R.string.lbl_ok);
                strB3.getClass();
            }
            if (strB2.length() > 0) {
                Dialog dialogA = e.a.a(e.f66901a, context, strB, strB2, new p(strB3, new a0(aVar, 14)), null, 1008);
                yw2.a aVar2 = settingsDeviceActivity.f52610d;
                if (aVar2 != null) {
                    aVar2.a(settingsDeviceActivity, dialogA);
                } else {
                    dialogA.show();
                }
            }
        }

        private C3135a() {
        }
    }
}
