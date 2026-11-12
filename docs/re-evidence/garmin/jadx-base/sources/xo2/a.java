package xo2;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lxo2/a;", "Landroid/os/Parcelable;", "", "commandId", "", "groupId", "sequence", "command", NotificationConstants.KEY_DATA_MIME_TYPE, "", "continueOnFailure", "description", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "c", IntegerTokenConverter.CONVERTER_KEY, "d", "getCommand", JWKParameterNames.RSA_EXPONENT, "j", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3569a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("commandId")
    private final String commandId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupId")
    private final Long groupId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sequence")
    private final Long sequence;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("command")
    private final String command;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String type;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("continueOnFailure")
    private final Boolean continueOnFailure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private final String description;

    /* JADX INFO: renamed from: xo2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3569a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            Boolean boolValueOf = null;
            Long l14 = lValueOf2;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new a(string, lValueOf, l14, string2, string3, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, Long l14, Long l15, String str2, String str3, Boolean bool, String str4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : l15, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : bool, (i14 & 64) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCommandId() {
        return this.commandId;
    }

    public final byte[] d() {
        String str = this.command;
        if (str == null) {
            return null;
        }
        return aq2.h.b(str);
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
        return s.g(this.commandId, aVar.commandId) && s.g(this.groupId, aVar.groupId) && s.g(this.sequence, aVar.sequence) && s.g(this.command, aVar.command) && s.g(this.type, aVar.type) && s.g(this.continueOnFailure, aVar.continueOnFailure) && s.g(this.description, aVar.description);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getContinueOnFailure() {
        return this.continueOnFailure;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getGroupId() {
        return this.groupId;
    }

    public final int hashCode() {
        String str = this.commandId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l14 = this.groupId;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.sequence;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str2 = this.command;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.continueOnFailure;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.description;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getSequence() {
        return this.sequence;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final String toString() {
        String str = this.commandId;
        Long l14 = this.groupId;
        Long l15 = this.sequence;
        String str2 = this.command;
        String str3 = this.type;
        Boolean bool = this.continueOnFailure;
        String str4 = this.description;
        StringBuilder sb3 = new StringBuilder("ApduCommand(commandId=");
        sb3.append(str);
        sb3.append(", groupId=");
        sb3.append(l14);
        sb3.append(", sequence=");
        i.q(l15, ", command=", str2, ", type=", sb3);
        i.w(sb3, str3, ", continueOnFailure=", bool, ", description=");
        return am.j.o(str4, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.commandId);
        Long l14 = this.groupId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.sequence;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.command);
        parcel.writeString(this.type);
        Boolean bool = this.continueOnFailure;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        parcel.writeString(this.description);
    }

    public a(String str, Long l14, Long l15, String str2, String str3, Boolean bool, String str4) {
        this.commandId = str;
        this.groupId = l14;
        this.sequence = l15;
        this.command = str2;
        this.type = str3;
        this.continueOnFailure = bool;
        this.description = str4;
    }

    public a() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
