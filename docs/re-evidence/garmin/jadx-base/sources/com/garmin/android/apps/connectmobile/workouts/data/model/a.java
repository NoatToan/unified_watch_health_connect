package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "audioNoteUuid", "audioNoteUrl", "", "expirationTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "a", "Ljava/lang/String;", "D", "()Ljava/lang/String;", "G", "(Ljava/lang/String;)V", "b", "C", "F", "c", "Ljava/lang/Long;", "getExpirationTimestamp", "()Ljava/lang/Long;", "setExpirationTimestamp", "(Ljava/lang/Long;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a extends s1 implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48070d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("audioNoteUuid")
    private String audioNoteUuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("audioNoteUrl")
    private String audioNoteUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expirationTimestamp")
    private Long expirationTimestamp;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new C0940a(null);
        CREATOR = new b();
        f48070d = 8;
    }

    public /* synthetic */ a(String str, String str2, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : l14);
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getAudioNoteUrl() {
        return this.audioNoteUrl;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getAudioNoteUuid() {
        return this.audioNoteUuid;
    }

    public final void F() {
        this.audioNoteUrl = null;
    }

    public final void G() {
        this.audioNoteUuid = null;
    }

    public final JSONObject H() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("audioNoteUuid", this.audioNoteUuid);
            jSONObject.putOpt("audioNoteUrl", this.audioNoteUrl);
            jSONObject.putOpt("expirationTimestamp", this.expirationTimestamp);
            return jSONObject;
        } catch (JSONException e4) {
            String strN = fb1.c.n("JsonException: ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AudioNoteDTO", strN);
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.audioNoteUuid, aVar.audioNoteUuid) && p005kotlin.jvm.internal.s.g(this.audioNoteUrl, aVar.audioNoteUrl) && p005kotlin.jvm.internal.s.g(this.expirationTimestamp, aVar.expirationTimestamp);
    }

    public final int hashCode() {
        String str = this.audioNoteUuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.audioNoteUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.expirationTimestamp;
        return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.audioNoteUuid = jSONObject.optString("audioNoteUuid");
            this.audioNoteUrl = jSONObject.optString("audioNoteUrl");
            long jOptLong = jSONObject.optLong("expirationTimestamp");
            this.expirationTimestamp = jOptLong != 0 ? Long.valueOf(jOptLong) : null;
        }
    }

    public final String toString() {
        String str = this.audioNoteUuid;
        String str2 = this.audioNoteUrl;
        return p6.b.g(p6.b.i("AudioNoteDTO(audioNoteUuid=", str, ", audioNoteUrl=", str2, ", expirationTimestamp="), this.expirationTimestamp, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.audioNoteUuid);
        parcel.writeString(this.audioNoteUrl);
        Long l14 = this.expirationTimestamp;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.data.model.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_AUDIO_NOTE_UUID", "KEY_AUDIO_NOTE_URL", "KEY_EXPIRATION_TIMESTAMP", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0940a {
        public /* synthetic */ C0940a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0940a() {
        }
    }

    public a(String str, String str2, Long l14) {
        this.audioNoteUuid = str;
        this.audioNoteUrl = str2;
        this.expirationTimestamp = l14;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
