package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzn {
    private static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    @Nullable
    private final String a;

    @Nullable
    private final String b;

    @Nullable
    private final ComponentName c;
    private final int d;
    private final boolean e;

    public zzn(ComponentName componentName, int i) {
        this.a = null;
        this.b = null;
        Preconditions.checkNotNull(componentName);
        this.c = componentName;
        this.d = i;
        this.e = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return Objects.equal(this.a, zznVar.a) && Objects.equal(this.b, zznVar.b) && Objects.equal(this.c, zznVar.c) && this.d == zznVar.d && this.e == zznVar.e;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e));
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        Preconditions.checkNotNull(this.c);
        return this.c.flattenToString();
    }

    public final int zza() {
        return this.d;
    }

    @Nullable
    public final ComponentName zzb() {
        return this.c;
    }

    public final Intent zzc(Context context) {
        Bundle bundleCall;
        if (this.a == null) {
            return new Intent().setComponent(this.c);
        }
        Intent intent = null;
        if (this.e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.a);
            try {
                bundleCall = context.getContentResolver().call(f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                String strValueOf = String.valueOf(this.a);
                Log.w("ConnectionStatusConfig", strValueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(strValueOf) : new String("Dynamic lookup for intent failed for action: "));
            }
        }
        return intent != null ? intent : new Intent(this.a).setPackage(this.b);
    }

    @Nullable
    public final String zzd() {
        return this.b;
    }

    public zzn(String str, int i, boolean z) {
        this(str, "com.google.android.gms", i, false);
    }

    public zzn(String str, String str2, int i, boolean z) {
        Preconditions.checkNotEmpty(str);
        this.a = str;
        Preconditions.checkNotEmpty(str2);
        this.b = str2;
        this.c = null;
        this.d = i;
        this.e = z;
    }
}
