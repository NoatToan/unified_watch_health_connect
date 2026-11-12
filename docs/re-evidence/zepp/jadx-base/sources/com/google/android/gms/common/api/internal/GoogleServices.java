package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@Deprecated
public final class GoogleServices {
    private static final Object e = new Object();

    @Nullable
    @GuardedBy("sLock")
    private static GoogleServices f;

    @Nullable
    private final String a;
    private final Status b;
    private final boolean c;
    private final boolean d;

    @VisibleForTesting
    @KeepForSdk
    public GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", TypedValues.Custom.S_INT, resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z2 = integer == 0;
            z = integer != 0;
            this.d = z2;
        } else {
            this.d = false;
        }
        this.c = z;
        String strZzb = zzag.zzb(context);
        strZzb = strZzb == null ? new StringResourceValueReader(context).getString("google_app_id") : strZzb;
        if (TextUtils.isEmpty(strZzb)) {
            this.b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.a = null;
        } else {
            this.a = strZzb;
            this.b = Status.RESULT_SUCCESS;
        }
    }

    @VisibleForTesting
    @KeepForSdk
    public GoogleServices(String str, boolean z) {
        this.a = str;
        this.b = Status.RESULT_SUCCESS;
        this.c = z;
        this.d = !z;
    }

    @KeepForSdk
    private static GoogleServices b(String str) {
        GoogleServices googleServices;
        synchronized (e) {
            googleServices = f;
            if (googleServices == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return googleServices;
    }

    @VisibleForTesting
    @KeepForSdk
    public static void c() {
        synchronized (e) {
            f = null;
        }
    }

    @Nullable
    @KeepForSdk
    public static String getGoogleAppId() {
        return b("getGoogleAppId").a;
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (e) {
            if (f == null) {
                f = new GoogleServices(context);
            }
            status = f.b;
        }
        return status;
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices googleServicesB = b("isMeasurementEnabled");
        return googleServicesB.b.isSuccess() && googleServicesB.c;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return b("isMeasurementExplicitlyDisabled").d;
    }

    @VisibleForTesting
    @KeepForSdk
    public Status a(String str) {
        String str2 = this.a;
        if (str2 == null || str2.equals(str)) {
            return Status.RESULT_SUCCESS;
        }
        String str3 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 97);
        sb.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
        sb.append(str3);
        sb.append("'.");
        return new Status(10, sb.toString());
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context, @NonNull String str, boolean z) {
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (e) {
            GoogleServices googleServices = f;
            if (googleServices != null) {
                return googleServices.a(str);
            }
            GoogleServices googleServices2 = new GoogleServices(str, z);
            f = googleServices2;
            return googleServices2.b;
        }
    }
}
