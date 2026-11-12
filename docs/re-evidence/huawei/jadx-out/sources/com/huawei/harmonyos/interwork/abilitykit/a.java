package com.huawei.harmonyos.interwork.abilitykit;

import a.c;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.widget.Toast;
import com.huawei.harmonyos.interwork.base.ability.IAbilityStartCallback;

/* JADX INFO: loaded from: classes23.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f6099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IAbilityStartCallback f6100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f6101c;
    public final Object d = new Object();
    public Context e;

    public a(Context context, IAbilityStartCallback iAbilityStartCallback) {
        this.f6100b = iAbilityStartCallback;
        this.e = context;
    }

    public final void a() {
        synchronized (this.d) {
            if (this.f6100b != null) {
                Log.i("DefKitLib_AbilityStartCallback", "release callback: " + this.f6100b);
                this.f6100b = null;
            }
            if (this.e != null) {
                Log.i("DefKitLib_AbilityStartCallback", "release context: " + this.e);
                this.e = null;
            }
        }
    }

    public final /* synthetic */ void b() {
        synchronized (this.d) {
            if (this.f6100b == null) {
                Log.e("DefKitLib_AbilityStartCallback", "startCallbackTimeoutDetection: mCallback may has released");
                return;
            }
            Log.e("DefKitLib_AbilityStartCallback", "start ability callback time out, callback: " + this.f6100b);
            this.f6100b.onStartResult(3);
            a();
        }
    }

    public final void c() {
        if (f6099a == null) {
            Log.e("DefKitLib_AbilityStartCallback", "startCallbackTimeoutDetection: sHandler is null");
            return;
        }
        Runnable runnable = new Runnable() { // from class: dai
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b();
            }
        };
        this.f6101c = runnable;
        f6099a.postDelayed(runnable, this.f6100b, 40000L);
    }

    @Override // a.c, android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (parcel == null || parcel2 == null) {
            Log.e("DefKitLib_AbilityStartCallback", "AbilityStartCallback: onTransact param invalid");
        }
        Log.d("DefKitLib_AbilityStartCallback", "AbilityStartCallback::onRemoteRequest code:" + i);
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface("ohos.abilityshell.AbilityStartCallback");
        b(parcel.readInt());
        parcel2.writeInt(0);
        return true;
    }

    public final void a(int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = R.string.remote_query_failed;
                break;
            case 2:
                i2 = R.string.remote_network_error;
                break;
            case 3:
                i2 = R.string.remote_system_error;
                break;
            case 4:
                i2 = R.string.remote_loading_error;
                break;
            case 5:
                i2 = R.string.remote_loading_conflict;
                break;
            case 6:
                i2 = R.string.remote_free_install_not_support;
                break;
            case 7:
                i2 = R.string.service_error;
                break;
            default:
                i2 = -1;
                break;
        }
        Log.i("DefKitLib_AbilityStartCallback", "getRestId restId:" + i2);
        Context context = this.e;
        if (context == null || i2 == -1) {
            return;
        }
        Toast.makeText(context, i2, 0).show();
    }

    public final void b(final int i) {
        Runnable runnable;
        Handler handler = f6099a;
        if (handler != null && (runnable = this.f6101c) != null) {
            handler.removeCallbacks(runnable, this.f6100b);
        }
        synchronized (this.d) {
            IAbilityStartCallback iAbilityStartCallback = this.f6100b;
            if (iAbilityStartCallback == null) {
                Log.e("DefKitLib_AbilityStartCallback", "OnResult called, mCallback may has released");
                return;
            }
            iAbilityStartCallback.onStartResult(i);
            if (i != 0) {
                Log.i("DefKitLib_AbilityStartCallback", "AbilityStartCallback::OnResult errorCode:" + i);
                f6099a.post(new Runnable() { // from class: dal
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31581b.a(i);
                    }
                });
            }
            a();
        }
    }
}
