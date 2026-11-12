package aq;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Laq/c;", "Landroid/os/Parcelable;", "", Constants.ScionAnalytics.PARAM_LABEL, "labelContentDescription", "value", "contentDescription", "", "badge", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f11847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f11848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f11849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f11850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f11851e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            return new c((CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(charSequence, (i14 & 2) != 0 ? null : charSequence2, charSequence3, (i14 & 8) != 0 ? null : charSequence4, (i14 & 16) != 0 ? null : num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f11847a, cVar.f11847a) && p005kotlin.jvm.internal.s.g(this.f11848b, cVar.f11848b) && p005kotlin.jvm.internal.s.g(this.f11849c, cVar.f11849c) && p005kotlin.jvm.internal.s.g(this.f11850d, cVar.f11850d) && p005kotlin.jvm.internal.s.g(this.f11851e, cVar.f11851e);
    }

    public final int hashCode() {
        int iHashCode = this.f11847a.hashCode() * 31;
        CharSequence charSequence = this.f11848b;
        int iHashCode2 = (this.f11849c.hashCode() + ((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31;
        CharSequence charSequence2 = this.f11850d;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Integer num = this.f11851e;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityStatsText(label=");
        sb3.append((Object) this.f11847a);
        sb3.append(", labelContentDescription=");
        sb3.append((Object) this.f11848b);
        sb3.append(", value=");
        sb3.append((Object) this.f11849c);
        sb3.append(", contentDescription=");
        sb3.append((Object) this.f11850d);
        sb3.append(", badge=");
        return com.garmin.android.apps.connectmobile.f3.i(sb3, this.f11851e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        TextUtils.writeToParcel(this.f11847a, parcel, i14);
        TextUtils.writeToParcel(this.f11848b, parcel, i14);
        TextUtils.writeToParcel(this.f11849c, parcel, i14);
        TextUtils.writeToParcel(this.f11850d, parcel, i14);
        Integer num = this.f11851e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public c(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Integer num) {
        charSequence.getClass();
        charSequence3.getClass();
        this.f11847a = charSequence;
        this.f11848b = charSequence2;
        this.f11849c = charSequence3;
        this.f11850d = charSequence4;
        this.f11851e = num;
    }
}
