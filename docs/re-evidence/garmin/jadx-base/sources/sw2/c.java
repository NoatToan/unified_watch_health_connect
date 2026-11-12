package sw2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.roomorama.caldroid.CaldroidFragment;
import d53.w;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.y;
import q6.f;
import r1.q2;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R$\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/R\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b6\u0010-\"\u0004\b:\u0010/R$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010+\u001a\u0004\b9\u0010-\"\u0004\b;\u0010/R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010+\u001a\u0004\b0\u0010-\"\u0004\b<\u0010/R$\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010+\u001a\u0004\b3\u0010-\"\u0004\b>\u0010/R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0018\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001cR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lsw2/c;", "Landroid/os/Parcelable;", "", "compositionId", "", "compositionIdSet", "", "versionId", "globalId", "", "notificationTitle", "notificationTitleHandle", "notificationDescription", "notificationDescriptionHandle", CaldroidFragment.DIALOG_TITLE, "dialogTitleHandle", "dialogDescription", "dialogDescriptionHandle", "redirectionSchemeVersion", "Lorg/joda/time/DateTime;", "scheduledTimestamp", "<init>", "(ILjava/util/List;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILorg/joda/time/DateTime;)V", "a", "I", "b", "()I", "setCompositionId", "(I)V", "Ljava/util/List;", "d", "()Ljava/util/List;", "setCompositionIdSet", "(Ljava/util/List;)V", "c", "J", "s", "()J", "setVersionId", "(J)V", "j", "setGlobalId", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "o", "()Ljava/lang/String;", "setNotificationTitle", "(Ljava/lang/String;)V", "f", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "setNotificationTitleHandle", "g", JWKParameterNames.OCT_KEY_VALUE, "setNotificationDescription", "h", "m", "setNotificationDescriptionHandle", IntegerTokenConverter.CONVERTER_KEY, "setDialogTitle", "setDialogTitleHandle", "setDialogDescription", "l", "setDialogDescriptionHandle", "getRedirectionSchemeVersion", "setRedirectionSchemeVersion", JWKParameterNames.RSA_MODULUS, "Lorg/joda/time/DateTime;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Lorg/joda/time/DateTime;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("compositionId")
    private int compositionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("compositionIdSet")
    private List<Integer> compositionIdSet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("versionId")
    private long versionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("globalId")
    private long globalId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notificationTitle")
    private String notificationTitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notificationTitleHandle")
    private String notificationTitleHandle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notificationDescription")
    private String notificationDescription;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notificationDescriptionHandle")
    private String notificationDescriptionHandle;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName(CaldroidFragment.DIALOG_TITLE)
    private String dialogTitle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dialogTitleHandle")
    private String dialogTitleHandle;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dialogDescription")
    private String dialogDescription;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dialogDescriptionHandle")
    private String dialogDescriptionHandle;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("redirectionSchemeVersion")
    private int redirectionSchemeVersion;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scheduled_timestamp")
    private final DateTime scheduledTimestamp;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f161097o = new a(null);
    public static final Parcelable.Creator<c> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int i14 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                arrayList = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new c(i14, arrayList, parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(int i14, List list, long j8, long j14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i15, DateTime dateTime, int i16, j jVar) {
        this(i14, (i16 & 2) != 0 ? null : list, j8, j14, str, (i16 & 32) != 0 ? null : str2, str3, (i16 & 128) != 0 ? null : str4, str5, (i16 & 512) != 0 ? null : str6, str7, (i16 & 2048) != 0 ? null : str8, i15, (i16 & 8192) != 0 ? null : dateTime);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCompositionId() {
        return this.compositionId;
    }

    public final List<Integer> d() {
        return this.compositionIdSet;
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
        return this.compositionId == cVar.compositionId && s.g(this.compositionIdSet, cVar.compositionIdSet) && this.versionId == cVar.versionId && this.globalId == cVar.globalId && s.g(this.notificationTitle, cVar.notificationTitle) && s.g(this.notificationTitleHandle, cVar.notificationTitleHandle) && s.g(this.notificationDescription, cVar.notificationDescription) && s.g(this.notificationDescriptionHandle, cVar.notificationDescriptionHandle) && s.g(this.dialogTitle, cVar.dialogTitle) && s.g(this.dialogTitleHandle, cVar.dialogTitleHandle) && s.g(this.dialogDescription, cVar.dialogDescription) && s.g(this.dialogDescriptionHandle, cVar.dialogDescriptionHandle) && this.redirectionSchemeVersion == cVar.redirectionSchemeVersion && s.g(this.scheduledTimestamp, cVar.scheduledTimestamp);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDialogDescription() {
        return this.dialogDescription;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDialogDescriptionHandle() {
        return this.dialogDescriptionHandle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.compositionId) * 31;
        List<Integer> list = this.compositionIdSet;
        int iJ = g.j(f.e(f.e((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.versionId), 31, this.globalId), 31, this.notificationTitle);
        String str = this.notificationTitleHandle;
        int iJ2 = g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.notificationDescription);
        String str2 = this.notificationDescriptionHandle;
        int iJ3 = g.j((iJ2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.dialogTitle);
        String str3 = this.dialogTitleHandle;
        int iJ4 = g.j((iJ3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.dialogDescription);
        String str4 = this.dialogDescriptionHandle;
        int iD = q2.d(this.redirectionSchemeVersion, (iJ4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        DateTime dateTime = this.scheduledTimestamp;
        return iD + (dateTime != null ? dateTime.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDialogTitleHandle() {
        return this.dialogTitleHandle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getGlobalId() {
        return this.globalId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getNotificationDescription() {
        return this.notificationDescription;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getNotificationDescriptionHandle() {
        return this.notificationDescriptionHandle;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getNotificationTitle() {
        return this.notificationTitle;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getNotificationTitleHandle() {
        return this.notificationTitleHandle;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final DateTime getScheduledTimestamp() {
        return this.scheduledTimestamp;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getVersionId() {
        return this.versionId;
    }

    public final String toString() {
        int i14 = this.compositionId;
        List<Integer> list = this.compositionIdSet;
        long j8 = this.versionId;
        long j14 = this.globalId;
        String str = this.notificationTitle;
        String str2 = this.notificationTitleHandle;
        String str3 = this.notificationDescription;
        String str4 = this.notificationDescriptionHandle;
        String str5 = this.dialogTitle;
        String str6 = this.dialogTitleHandle;
        String str7 = this.dialogDescription;
        String str8 = this.dialogDescriptionHandle;
        int i15 = this.redirectionSchemeVersion;
        DateTime dateTime = this.scheduledTimestamp;
        StringBuilder sb3 = new StringBuilder("RTSDeviceDeepLinkingDto(compositionId=");
        sb3.append(i14);
        sb3.append(", compositionIdSet=");
        sb3.append(list);
        sb3.append(", versionId=");
        sb3.append(j8);
        x.j(j14, ", globalId=", ", notificationTitle=", sb3);
        sn.a.t(sb3, str, ", notificationTitleHandle=", str2, ", notificationDescription=");
        sn.a.t(sb3, str3, ", notificationDescriptionHandle=", str4, ", dialogTitle=");
        sn.a.t(sb3, str5, ", dialogTitleHandle=", str6, ", dialogDescription=");
        sn.a.t(sb3, str7, ", dialogDescriptionHandle=", str8, ", redirectionSchemeVersion=");
        sb3.append(i15);
        sb3.append(", scheduledTimestamp=");
        sb3.append(dateTime);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.compositionId);
        List<Integer> list = this.compositionIdSet;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeInt(((Number) itO.next()).intValue());
            }
        }
        parcel.writeLong(this.versionId);
        parcel.writeLong(this.globalId);
        parcel.writeString(this.notificationTitle);
        parcel.writeString(this.notificationTitleHandle);
        parcel.writeString(this.notificationDescription);
        parcel.writeString(this.notificationDescriptionHandle);
        parcel.writeString(this.dialogTitle);
        parcel.writeString(this.dialogTitleHandle);
        parcel.writeString(this.dialogDescription);
        parcel.writeString(this.dialogDescriptionHandle);
        parcel.writeInt(this.redirectionSchemeVersion);
        parcel.writeSerializable(this.scheduledTimestamp);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsw2/c$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a(Uri uri) {
            ArrayList arrayList;
            uri.getClass();
            String queryParameter = uri.getQueryParameter("composition_entry_id");
            if (queryParameter == null) {
                h.s("composition_entry_id is null");
                return null;
            }
            int i14 = Integer.parseInt(queryParameter);
            String queryParameter2 = uri.getQueryParameter("composition_id_set");
            DateTime dateTimeWithMillis = null;
            if (queryParameter2 != null) {
                List listW = w.W(queryParameter2, new String[]{","});
                arrayList = new ArrayList(y.r(listW, 10));
                Iterator it = listW.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                }
            } else {
                arrayList = null;
            }
            String queryParameter3 = uri.getQueryParameter("version_id");
            if (queryParameter3 == null) {
                h.s("version_id is null");
                return null;
            }
            long j8 = Long.parseLong(queryParameter3);
            String queryParameter4 = uri.getQueryParameter("global_id");
            if (queryParameter4 == null) {
                h.s("global_id is null");
                return null;
            }
            long j14 = Long.parseLong(queryParameter4);
            String queryParameter5 = uri.getQueryParameter("notification_title");
            if (queryParameter5 == null) {
                h.s("notification_title is null");
                return null;
            }
            String queryParameter6 = uri.getQueryParameter("notification_title_handle");
            String queryParameter7 = uri.getQueryParameter("notification_description");
            if (queryParameter7 == null) {
                h.s("notification_description is null");
                return null;
            }
            String queryParameter8 = uri.getQueryParameter("notification_description_handle");
            String queryParameter9 = uri.getQueryParameter("dialog_title");
            if (queryParameter9 == null) {
                h.s("dialog_title is null");
                return null;
            }
            String queryParameter10 = uri.getQueryParameter("dialog_title_handle");
            String queryParameter11 = uri.getQueryParameter("dialog_description");
            if (queryParameter11 == null) {
                h.s("dialog_description is null");
                return null;
            }
            String queryParameter12 = uri.getQueryParameter("dialog_description_handle");
            String queryParameter13 = uri.getQueryParameter("redirection_scheme_version");
            if (queryParameter13 == null) {
                h.s("redirection_scheme_version is null");
                return null;
            }
            int i15 = Integer.parseInt(queryParameter13);
            String queryParameter14 = uri.getQueryParameter("scheduled_timestamp");
            if (queryParameter14 != null) {
                dateTimeWithMillis = new DateTime().withMillis(Long.parseLong(queryParameter14) * 1000);
            }
            return new c(i14, arrayList, j8, j14, queryParameter5, queryParameter6, queryParameter7, queryParameter8, queryParameter9, queryParameter10, queryParameter11, queryParameter12, i15, dateTimeWithMillis);
        }

        private a() {
        }
    }

    public c(int i14, List<Integer> list, long j8, long j14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i15, DateTime dateTime) {
        kg.f.p(str, str3, str5, str7);
        this.compositionId = i14;
        this.compositionIdSet = list;
        this.versionId = j8;
        this.globalId = j14;
        this.notificationTitle = str;
        this.notificationTitleHandle = str2;
        this.notificationDescription = str3;
        this.notificationDescriptionHandle = str4;
        this.dialogTitle = str5;
        this.dialogTitleHandle = str6;
        this.dialogDescription = str7;
        this.dialogDescriptionHandle = str8;
        this.redirectionSchemeVersion = i15;
        this.scheduledTimestamp = dateTime;
    }
}
