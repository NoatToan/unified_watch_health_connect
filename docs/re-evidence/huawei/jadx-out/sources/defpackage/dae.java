package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemProperties;
import android.util.Log;
import android.widget.Toast;
import b.e;
import c.c;
import com.huawei.harmonyos.interwork.abilitykit.a;
import com.huawei.harmonyos.interwork.base.ability.IAbilityStartCallback;
import com.huawei.harmonyos.interwork.base.bundle.AbilityInfo;
import com.huawei.harmonyos.interwork.base.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class dae {
    public static Handler d;

    public static void b(final Context context, int i, IAbilityStartCallback iAbilityStartCallback) {
        if (d == null) {
            d = new Handler(Looper.getMainLooper());
        }
        if (i == 1204) {
            iAbilityStartCallback.onStartResult(8);
            return;
        }
        if (i == 1014) {
            iAbilityStartCallback.onStartResult(9);
            return;
        }
        if (i == 1319 || i == 1200 || i == 1203 || i == 1000 || i == 1001) {
            d.post(new Runnable() { // from class: com.huawei.harmonyos.interwork.abilitykit.AbilityManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(context, R.string.service_error, 0).show();
                }
            });
            iAbilityStartCallback.onStartResult(7);
        } else if (i != 1407 && i != 1320 && i != 1312 && i != 1311 && i != 1300) {
            iAbilityStartCallback.onStartResult(7);
        } else {
            d.post(new Runnable() { // from class: com.huawei.harmonyos.interwork.abilitykit.AbilityManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(context, R.string.remote_system_error, 0).show();
                }
            });
            iAbilityStartCallback.onStartResult(3);
        }
    }

    public static int c(Intent intent) throws IllegalStateException, daf, SecurityException, IllegalArgumentException {
        c();
        c cVarA = e.a();
        if (cVarA == null) {
            throw new IllegalStateException("failed to get def access service");
        }
        try {
            return b(((cr) cVarA).a(intent));
        } catch (RemoteException e) {
            throw new daf(e.getMessage());
        }
    }

    public static List<AbilityInfo> d(Intent intent) {
        if (intent == null || intent.getElement() == null) {
            Log.e("DefKitLib_Ability", "intent and element must be specified");
            return new ArrayList(0);
        }
        c cVarA = e.a();
        if (cVarA != null) {
            try {
                return ((cr) cVarA).d(intent);
            } catch (RemoteException unused) {
                Log.e("DefKitLib_Ability", "failed to register device state callback");
            }
        }
        return new ArrayList(0);
    }

    public static void a(Context context, Intent intent, IAbilityStartCallback iAbilityStartCallback) throws IllegalStateException, IllegalArgumentException {
        if (context == null || intent == null || iAbilityStartCallback == null) {
            Log.e("DefKitLib_Ability", "startAbility: IAbilityStartCallback is null");
            throw new IllegalArgumentException("invalid param for startAbility");
        }
        c();
        c cVarA = e.a();
        int i = 7;
        if (cVarA == null) {
            Log.e("DefKitLib_Ability", "startAbility: failed to get def access service");
            iAbilityStartCallback.onStartResult(7);
            return;
        }
        a aVar = new a(context, iAbilityStartCallback);
        try {
            int iC = ((cr) cVarA).c(intent, aVar);
            Log.i("DefKitLib_Ability", "startAbility: result: " + iC);
            i = iC;
        } catch (RemoteException e) {
            Log.e("DefKitLib_Ability", "startAbilityForResult failed " + e.getMessage());
        }
        if (i == 0) {
            aVar.c();
        } else {
            b(context, i, iAbilityStartCallback);
        }
    }

    public static void c() {
        int i = SystemProperties.getInt("ro.build.version.sdk", 0);
        Log.d("DefKitLib_Ability", "SDK version is " + i);
        if (i >= 29) {
            return;
        }
        Log.e("DefKitLib_Ability", "SDK version min than 28, is " + i);
        throw new IllegalStateException("sdk version min than 28");
    }

    public static int b(int i) throws daf {
        if (i == 0) {
            return i;
        }
        if (i >= 1000 && i < 1100) {
            throw new IllegalArgumentException("invalid parameter, error code: " + i);
        }
        if (i >= 1100 && i < 1200) {
            throw new IllegalStateException("illegal state exception, error code: " + i);
        }
        if (i >= 1200 && i < 1300) {
            throw new SecurityException("security exception, error code: " + i);
        }
        if (i >= 1300 && i < 1400) {
            throw new daf("remote exception, error code: " + i);
        }
        if (i >= 1400 && i < 1500) {
            throw new IllegalStateException("runtime exception, error code: " + i);
        }
        throw new IllegalStateException("unknown error code: " + i);
    }
}
