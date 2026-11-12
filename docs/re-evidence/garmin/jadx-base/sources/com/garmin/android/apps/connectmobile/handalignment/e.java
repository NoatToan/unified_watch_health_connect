package com.garmin.android.apps.connectmobile.handalignment;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.m;
import androidx.lifecycle.n;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/e;", "Landroidx/lifecycle/n;", "<init>", "()V", "a", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36611b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s03.a f36612a = new s03.a();

    public final void a(m mVar, long j8, String str) {
        if (mVar != null) {
            ArrayList arrayListE = da2.d.b().f58886a.f111646e.e();
            if (!arrayListE.isEmpty()) {
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    if (((DeviceProfile) it.next()).getF92746j() == j8) {
                        f.f36613h.getClass();
                        this.f36612a.a(f.a.a(j8, str).f().j(r03.a.a()).g(r03.a.a()).h(new en0.n(new c31.e(mVar, j8, str, 2), 0), new en0.n(new a42.b(mVar, str, 2), 1)));
                        return;
                    }
                }
            }
            HandsCalibrationActivity.f36565z.getClass();
            HandsCalibrationActivity.a.a(mVar, null);
        }
    }

    @Override // androidx.lifecycle.n
    public final void onDestroy(n0 n0Var) {
        this.f36612a.e();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/handalignment/e$a;", "", "<init>", "()V", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Context context, String str) {
            context.getClass();
            new androidx.appcompat.app.e.a(context).setTitle(context.getString(R.string.connect_iq_device_is_busy, str)).setMessage(R.string.connect_iq_music_setup_try_again).setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).create().show();
        }

        private a() {
        }
    }
}
