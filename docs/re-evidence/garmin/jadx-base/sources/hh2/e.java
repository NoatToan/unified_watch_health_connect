package hh2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B£\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018¨\u0006\u001a"}, d2 = {"Lhh2/e;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "title", "message", TtmlNode.ATTR_TTS_COLOR, "Landroid/app/PendingIntent;", "tapAction", "Lhh2/c;", "actionOne", "actionTwo", "actionThree", "iconRes", "largeIconRes", "progress", "maxProgress", "", "isIndeterminate", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/app/PendingIntent;Lhh2/c;Lhh2/c;Lhh2/c;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "b", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class e implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f83764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f83765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f83766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f83767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f83768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f83769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f83770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f83771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f83772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f83773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f83760n = new b(null);
    public static final Parcelable.Creator<e> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"hh2/e$a", "Landroid/os/Parcelable$Creator;", "Lhh2/e;", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Parcel parcel) {
        parcel.getClass();
        int i14 = parcel.readInt();
        String string = parcel.readString();
        String string2 = parcel.readString();
        Class cls = Integer.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Integer num = value instanceof Integer ? (Integer) value : null;
        PendingIntent pendingIntent = (PendingIntent) parcel.readParcelable(c.class.getClassLoader());
        c cVar = (c) parcel.readParcelable(c.class.getClassLoader());
        c cVar2 = (c) parcel.readParcelable(c.class.getClassLoader());
        c cVar3 = (c) parcel.readParcelable(c.class.getClassLoader());
        Object value2 = parcel.readValue(cls.getClassLoader());
        Integer num2 = value2 instanceof Integer ? (Integer) value2 : null;
        Object value3 = parcel.readValue(cls.getClassLoader());
        Integer num3 = value3 instanceof Integer ? (Integer) value3 : null;
        Object value4 = parcel.readValue(cls.getClassLoader());
        Integer num4 = value4 instanceof Integer ? (Integer) value4 : null;
        Object value5 = parcel.readValue(cls.getClassLoader());
        Integer num5 = value5 instanceof Integer ? (Integer) value5 : null;
        Object value6 = parcel.readValue(Boolean.TYPE.getClassLoader());
        this(i14, string, string2, num, pendingIntent, cVar, cVar2, cVar3, num2, num3, num4, num5, value6 instanceof Boolean ? (Boolean) value6 : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f83761a == eVar.f83761a && s.g(this.f83762b, eVar.f83762b) && s.g(this.f83763c, eVar.f83763c) && s.g(this.f83764d, eVar.f83764d) && s.g(this.f83765e, eVar.f83765e) && s.g(this.f83766f, eVar.f83766f) && s.g(this.f83767g, eVar.f83767g) && s.g(this.f83768h, eVar.f83768h) && s.g(this.f83769i, eVar.f83769i) && s.g(this.f83770j, eVar.f83770j) && s.g(this.f83771k, eVar.f83771k) && s.g(this.f83772l, eVar.f83772l) && s.g(this.f83773m, eVar.f83773m);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f83761a) * 31;
        String str = this.f83762b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83763c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f83764d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        PendingIntent pendingIntent = this.f83765e;
        int iHashCode5 = (iHashCode4 + (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 31;
        c cVar = this.f83766f;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f83767g;
        int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        c cVar3 = this.f83768h;
        int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        Integer num2 = this.f83769i;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f83770j;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f83771k;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f83772l;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.f83773m;
        return iHashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationData(id=" + this.f83761a + ", title=" + ((Object) this.f83762b) + ", message=" + ((Object) this.f83763c) + ", color=" + this.f83764d + ", tapAction=" + this.f83765e + ", actionOne=" + this.f83766f + ", actionTwo=" + this.f83767g + ", actionThree=" + this.f83768h + ", iconRes=" + this.f83769i + ", largeIconRes=" + this.f83770j + ", progress=" + this.f83771k + ", maxProgress=" + this.f83772l + ", isIndeterminate=" + this.f83773m + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f83761a);
        parcel.writeString(this.f83762b);
        parcel.writeString(this.f83763c);
        parcel.writeValue(this.f83764d);
        parcel.writeParcelable(this.f83765e, i14);
        parcel.writeParcelable(this.f83766f, i14);
        parcel.writeParcelable(this.f83767g, i14);
        parcel.writeParcelable(this.f83768h, i14);
        parcel.writeValue(this.f83769i);
        parcel.writeValue(this.f83770j);
        parcel.writeValue(this.f83771k);
        parcel.writeValue(this.f83772l);
        parcel.writeValue(this.f83773m);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhh2/e$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lhh2/e;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "DEFAULT_ID", "I", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public e(int i14) {
        this(i14, null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
    }

    public e(int i14, String str) {
        this(i14, str, null, null, null, null, null, null, null, null, null, null, null, 8188, null);
    }

    public e(int i14, String str, String str2) {
        this(i14, str, str2, null, null, null, null, null, null, null, null, null, null, 8184, null);
    }

    public e(int i14, String str, String str2, Integer num) {
        this(i14, str, str2, num, null, null, null, null, null, null, null, null, null, 8176, null);
    }

    public e(int i14, String str, String str2, Integer num, PendingIntent pendingIntent) {
        this(i14, str, str2, num, pendingIntent, null, null, null, null, null, null, null, null, 8160, null);
    }

    public e(int i14, String str, String str2, Integer num, PendingIntent pendingIntent, c cVar) {
        this(i14, str, str2, num, pendingIntent, cVar, null, null, null, null, null, null, null, 8128, null);
    }

    public e(int i14, String str, String str2, Integer num, PendingIntent pendingIntent, c cVar, c cVar2) {
        this(i14, str, str2, num, pendingIntent, cVar, cVar2, null, null, null, null, null, null, 8064, null);
    }

    public e(int i14, String str, String str2, Integer num, PendingIntent pendingIntent, c cVar, c cVar2, c cVar3) {
        this(i14, str, str2, num, pendingIntent, cVar, cVar2, cVar3, null, null, null, null, null, 7936, null);
    }

    public e(int i14, String str, String str2, Integer num, PendingIntent pendingIntent, c cVar, c cVar2, c cVar3, Integer num2) {
        this(i14, str, str2, num, pendingIntent, cVar, cVar2, cVar3, num2, null, null, null, null, GDIRealtimeSettingsProto.AppWellKnownCompositionId.INVALID_VALUE, null);
    }

    public e(int i14, String str, String str2, Integer num, PendingIntent pendingIntent, c cVar, c cVar2, c cVar3, Integer num2, Integer num3) {
        this(i14, str, str2, num, pendingIntent, cVar, cVar2, cVar3, num2, num3, null, null, null, 7168, null);
    }

    public e(int i14, String str, String str2, Integer num, PendingIntent pendingIntent, c cVar, c cVar2, c cVar3, Integer num2, Integer num3, Integer num4) {
        this(i14, str, str2, num, pendingIntent, cVar, cVar2, cVar3, num2, num3, num4, null, null, 6144, null);
    }

    public e(int i14, String str, String str2, Integer num, PendingIntent pendingIntent, c cVar, c cVar2, c cVar3, Integer num2, Integer num3, Integer num4, Integer num5) {
        this(i14, str, str2, num, pendingIntent, cVar, cVar2, cVar3, num2, num3, num4, num5, null, 4096, null);
    }

    public e(int i14, String str, String str2, Integer num, PendingIntent pendingIntent, c cVar, c cVar2, c cVar3, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool) {
        this.f83761a = i14;
        this.f83762b = str;
        this.f83763c = str2;
        this.f83764d = num;
        this.f83765e = pendingIntent;
        this.f83766f = cVar;
        this.f83767g = cVar2;
        this.f83768h = cVar3;
        this.f83769i = num2;
        this.f83770j = num3;
        this.f83771k = num4;
        this.f83772l = num5;
        this.f83773m = bool;
    }

    public /* synthetic */ e(int i14, String str, String str2, Integer num, PendingIntent pendingIntent, c cVar, c cVar2, c cVar3, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, int i15, j jVar) {
        this((i15 & 1) != 0 ? 10717 : i14, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? null : num, (i15 & 16) != 0 ? null : pendingIntent, (i15 & 32) != 0 ? null : cVar, (i15 & 64) != 0 ? null : cVar2, (i15 & 128) != 0 ? null : cVar3, (i15 & 256) != 0 ? null : num2, (i15 & 512) != 0 ? null : num3, (i15 & 1024) != 0 ? null : num4, (i15 & 2048) != 0 ? null : num5, (i15 & 4096) != 0 ? null : bool);
    }

    public e() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
