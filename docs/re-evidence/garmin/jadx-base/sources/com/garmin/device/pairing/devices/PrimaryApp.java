package com.garmin.device.pairing.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import d53.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import w13.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u000ej\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/garmin/device/pairing/devices/PrimaryApp;", "Landroid/os/Parcelable;", "", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "<init>", "(Ljava/lang/String;II)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "I", "getAppId", "Companion", "a", "UNSPECIFIED", "GCM", "GOLF", "DIVE", "JUNIOR", "EXPLORE", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum PrimaryApp implements Parcelable {
    UNSPECIFIED(0),
    GCM(1),
    GOLF(2),
    DIVE(3),
    JUNIOR(4),
    EXPLORE(5);

    private final int appId;
    private static final /* synthetic */ a $ENTRIES = w13.b.g(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PrimaryApp> CREATOR = new Parcelable.Creator<PrimaryApp>() { // from class: com.garmin.device.pairing.devices.PrimaryApp.b
        @Override // android.os.Parcelable.Creator
        public final PrimaryApp createFromParcel(Parcel parcel) {
            parcel.getClass();
            return PrimaryApp.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PrimaryApp[] newArray(int i14) {
            return new PrimaryApp[i14];
        }
    };

    PrimaryApp(int i14) {
        this.appId = i14;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[RETURN] */
    public static final PrimaryApp fromKey(String str) {
        INSTANCE.getClass();
        for (PrimaryApp primaryApp : values()) {
            if (u.q(primaryApp.name(), str, true)) {
                if (primaryApp == null) {
                    return UNSPECIFIED;
                }
                return primaryApp;
            }
        }
        primaryApp = null;
        if (primaryApp == null) {
            return UNSPECIFIED;
        }
        return primaryApp;
    }

    public static a<PrimaryApp> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getAppId() {
        return this.appId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }

    /* JADX INFO: renamed from: com.garmin.device.pairing.devices.PrimaryApp$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/device/pairing/devices/PrimaryApp$a;", "", "<init>", "()V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
