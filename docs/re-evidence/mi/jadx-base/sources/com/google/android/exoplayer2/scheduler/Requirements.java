package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import com.example.statistics.export.OneTrackConstant;
import defpackage.rk1;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();
    public static final int DEVICE_CHARGING = 8;
    public static final int DEVICE_IDLE = 4;
    public static final int DEVICE_STORAGE_NOT_LOW = 16;
    public static final int NETWORK = 1;
    public static final int NETWORK_UNMETERED = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8071a;

    public class a implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Requirements[] newArray(int i) {
            return new Requirements[i];
        }
    }

    public Requirements(int i) {
        this.f8071a = (i & 2) != 0 ? i | 1 : i;
    }

    public static boolean h(ConnectivityManager connectivityManager) {
        if (wlq.f38110a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null && networkCapabilities.hasCapability(16);
    }

    public final int a(Context context) {
        if (!i()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) rk1.e(context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && h(connectivityManager)) {
            return (l() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0;
        }
        return this.f8071a & 3;
    }

    public int c(Context context) {
        int iA = a(context);
        if (d() && !e(context)) {
            iA |= 8;
        }
        if (g() && !f(context)) {
            iA |= 4;
        }
        return (!k() || j(context)) ? iA : iA | 16;
    }

    public boolean d() {
        return (this.f8071a & 8) != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f8071a == ((Requirements) obj).f8071a;
    }

    public final boolean f(Context context) {
        PowerManager powerManager = (PowerManager) rk1.e(context.getSystemService("power"));
        int i = wlq.f38110a;
        if (i >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        return i < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive();
    }

    public boolean g() {
        return (this.f8071a & 4) != 0;
    }

    public int hashCode() {
        return this.f8071a;
    }

    public boolean i() {
        return (this.f8071a & 1) != 0;
    }

    public final boolean j(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    public boolean k() {
        return (this.f8071a & 16) != 0;
    }

    public boolean l() {
        return (this.f8071a & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8071a);
    }
}
