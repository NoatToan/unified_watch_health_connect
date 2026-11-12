package uv;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.y0;
import fw.m;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luv/f;", "", "Landroid/app/Activity;", "activity", "", "deviceId", "", "pedalId", "<init>", "(Landroid/app/Activity;JLjava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f172888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f172889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f172890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f172891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IntentFilter f172892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f172893f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"uv/f$a", "Landroid/content/BroadcastReceiver;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            long longExtra = intent != null ? intent.getLongExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L) : -1L;
            f fVar = f.this;
            if (longExtra == fVar.f172889b) {
                Boolean boolValueOf = intent != null ? Boolean.valueOf(intent.getBooleanExtra(fVar.f172890c, false)) : null;
                y0 y0Var = fVar.f172891d;
                y0Var.getClass();
                y0Var.m(m.a.g(m.f73767e, boolValueOf, 1));
                z9.a.a(fVar.f172888a).d(this);
            }
        }
    }

    public f(Activity activity, long j8, String str) {
        activity.getClass();
        str.getClass();
        this.f172888a = activity;
        this.f172889b = j8;
        this.f172890c = str;
        this.f172891d = new y0();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.garmin.android.gdi.ACTION_ON_VECTOR_PEDAL_PAIRING_STATUS_RECEIVED");
        this.f172892e = intentFilter;
        this.f172893f = new a();
    }
}
