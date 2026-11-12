package ik2;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lik2/c;", "Landroid/os/Parcelable;", "", "passkey", "", "serviceDataOptions", "", "antId", "<init>", "(Ljava/lang/String;IJ)V", "a", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f93934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f93927d = new a(null);
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ParcelUuid f93928e = ParcelUuid.fromString("00002401-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ParcelUuid f93929f = ParcelUuid.fromString("00003E10-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ParcelUuid f93930g = ParcelUuid.fromString("0000FE1F-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f93931h = m.b(new ik2.b(0));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(String str, int i14, long j8) {
        this.f93932a = str;
        this.f93933b = i14;
        this.f93934c = j8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f93932a);
        parcel.writeInt(this.f93933b);
        parcel.writeLong(this.f93934c);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001c\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001a\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lik2/c$a;", "", "<init>", "()V", "", "KEY_OPTIONS", "B", "KEY_DECIMAL_PASSKEY", "KEY_HEXADECIMAL_PASSKEY", "KEY_BLE_ADDRESS_KEY", "KEY_ANT_ID_VALUE", "", "OPTIONS_VALUE_LENGTH", "I", "DECIMAL_PASSKEY_VALUE_LENGTH", "HEXADECIMAL_PASSKEY_VALUE_LENGTH", "BLE_ADDRESS_KEY_VALUE_LENGTH", "KEY_ANT_ID_VALUE_LENGTH", "OPTION_PAIR", "OPTION_GCM", "OPTION_PAIR_MODE_REQUIRED", "Landroid/os/ParcelUuid;", "kotlin.jvm.PlatformType", "LEGACY_FITNESS_SERVICE", "Landroid/os/ParcelUuid;", "UNIFIED_GARMIN_SERVICE", "BLUETOOTH_SIG_GARMIN_SERVICE", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
