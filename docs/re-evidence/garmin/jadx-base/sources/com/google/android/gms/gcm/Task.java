package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.exoplayer2.v;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.maps.android.BuildConfig;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class Task implements ReflectedParcelable {
    public static final int EXTRAS_LIMIT_BYTES = 10240;
    public static final int NETWORK_STATE_ANY = 2;
    public static final int NETWORK_STATE_CONNECTED = 0;
    public static final int NETWORK_STATE_UNMETERED = 1;
    protected static final long UNINITIALIZED = -1;
    private final Bundle extras;
    private final String gcmTaskService;
    private final boolean isPersisted;
    private final int requiredNetworkState;
    private final boolean requiresCharging;
    private final String tag;
    private final boolean updateCurrent;
    private final Set<Uri> zzaw;
    private final boolean zzax;
    private final zzl zzay;

    public static abstract class Builder {
        protected Bundle extras;
        protected String gcmTaskService;
        protected boolean isPersisted;
        protected int requiredNetworkState;
        protected boolean requiresCharging;
        protected String tag;
        protected boolean updateCurrent;
        protected Set<Uri> zzaw = Collections.EMPTY_SET;

        @ShowFirstParty
        protected zzl zzay = zzl.zzaq;

        public abstract Task build();

        public void checkConditions() {
            Preconditions.checkArgument(this.gcmTaskService != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
            GcmNetworkManager.zzd(this.tag);
            zzl zzlVar = this.zzay;
            if (zzlVar != null) {
                int iZzi = zzlVar.zzi();
                if (iZzi != 1 && iZzi != 0) {
                    h.s(v.b(45, iZzi, "Must provide a valid RetryPolicy: "));
                    return;
                }
                int iZzj = zzlVar.zzj();
                int iZzk = zzlVar.zzk();
                if (iZzi == 0 && iZzj < 0) {
                    h.s(v.b(52, iZzj, "InitialBackoffSeconds can't be negative: "));
                    return;
                } else if (iZzi == 1 && iZzj < 10) {
                    h.s("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                    return;
                } else if (iZzk < iZzj) {
                    h.s(v.b(77, zzlVar.zzk(), "MaximumBackoffSeconds must be greater than InitialBackoffSeconds: "));
                    return;
                }
            }
            if (this.isPersisted) {
                Task.zzg(this.extras);
            }
            if (!this.zzaw.isEmpty() && this.requiredNetworkState == 2) {
                h.s("Required URIs may not be used with NETWORK_STATE_ANY");
                return;
            }
            Iterator<Uri> it = this.zzaw.iterator();
            while (it.hasNext()) {
                Task.zzd(it.next());
            }
        }

        public abstract Builder setExtras(Bundle bundle);

        public abstract Builder setPersisted(boolean z14);

        public abstract Builder setRequiredNetwork(int i14);

        public abstract Builder setRequiresCharging(boolean z14);

        public abstract Builder setService(Class<? extends GcmTaskService> cls);

        public abstract Builder setTag(String str);

        public abstract Builder setUpdateCurrent(boolean z14);
    }

    @Deprecated
    public Task(Parcel parcel) {
        this.gcmTaskService = parcel.readString();
        this.tag = parcel.readString();
        this.updateCurrent = parcel.readInt() == 1;
        this.isPersisted = parcel.readInt() == 1;
        this.requiredNetworkState = 2;
        this.zzaw = Collections.EMPTY_SET;
        this.requiresCharging = false;
        this.zzax = false;
        this.zzay = zzl.zzaq;
        this.extras = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Uri uri) {
        if (uri == null) {
            h.s("Null URI");
            return;
        }
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (TextUtils.isEmpty(host) || BuildConfig.TRAVIS.equals(host)) {
            h.s("URI hostname is required");
            return;
        }
        try {
            int port = uri.getPort();
            if ("tcp".equals(scheme)) {
                if (port <= 0 || port > 65535) {
                    h.s(v.b(38, uri.getPort(), "Invalid required URI port: "));
                    return;
                }
                return;
            }
            if (!"ping".equals(scheme)) {
                String strValueOf = String.valueOf(scheme);
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported required URI scheme: ".concat(strValueOf) : new String("Unsupported required URI scheme: "));
            }
            if (port == -1) {
                return;
            }
            h.s("Ping does not support port numbers");
        } catch (NumberFormatException e4) {
            String strValueOf2 = String.valueOf(e4.getMessage());
            throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Invalid port number: ".concat(strValueOf2) : new String("Invalid port number: "));
        }
    }

    public static void zzg(Bundle bundle) {
        if (bundle != null) {
            Parcel parcelObtain = Parcel.obtain();
            bundle.writeToParcel(parcelObtain, 0);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            if (iDataSize > 10240) {
                h.s(v.b(55, iDataSize, "Extras exceeding maximum size(10240 bytes): "));
                return;
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                    if (!(obj instanceof Bundle)) {
                        h.s("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                        return;
                    }
                    zzg((Bundle) obj);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getExtras() {
        return this.extras;
    }

    public int getRequiredNetwork() {
        return this.requiredNetworkState;
    }

    public boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    public String getServiceName() {
        return this.gcmTaskService;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean isPersisted() {
        return this.isPersisted;
    }

    public boolean isUpdateCurrent() {
        return this.updateCurrent;
    }

    public void toBundle(Bundle bundle) {
        bundle.putString(HeaderParameterNames.AUTHENTICATION_TAG, this.tag);
        bundle.putBoolean("update_current", this.updateCurrent);
        bundle.putBoolean("persisted", this.isPersisted);
        bundle.putString("service", this.gcmTaskService);
        bundle.putInt("requiredNetwork", this.requiredNetworkState);
        if (!this.zzaw.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<Uri> it = this.zzaw.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.requiresCharging);
        bundle.putBoolean("requiresIdle", false);
        bundle.putBundle("retryStrategy", this.zzay.zzf(new Bundle()));
        bundle.putBundle("extras", this.extras);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.gcmTaskService);
        parcel.writeString(this.tag);
        parcel.writeInt(this.updateCurrent ? 1 : 0);
        parcel.writeInt(this.isPersisted ? 1 : 0);
    }

    public Task(Builder builder) {
        this.gcmTaskService = builder.gcmTaskService;
        this.tag = builder.tag;
        this.updateCurrent = builder.updateCurrent;
        this.isPersisted = builder.isPersisted;
        this.requiredNetworkState = builder.requiredNetworkState;
        this.zzaw = builder.zzaw;
        this.requiresCharging = builder.requiresCharging;
        this.zzax = false;
        this.extras = builder.extras;
        zzl zzlVar = builder.zzay;
        this.zzay = zzlVar == null ? zzl.zzaq : zzlVar;
    }
}
