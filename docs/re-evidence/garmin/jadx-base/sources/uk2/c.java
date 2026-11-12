package uk2;

import al2.k;
import al2.l;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.UUID;
import kg.f;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import pk2.x;
import pk2.y;
import wr.g;
import yt2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b-\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u0010,¨\u00069"}, d2 = {"Luk2/c;", "Landroid/os/Parcelable;", "", "transferType", "transferDirection", "dataType", "result", "agentResult", "Lkc2/b;", "errorInfo", "", "transferSize", "", "transferDuration", "httpCode", "httpUrl", "timestamp", "compressedSize", "queuedDuration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkc2/b;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "getTransferType", "()Ljava/lang/String;", "b", "getTransferDirection", "c", "getDataType", "d", "getResult", JWKParameterNames.RSA_EXPONENT, "getAgentResult", "f", "Lkc2/b;", "getErrorInfo", "()Lkc2/b;", "g", "Ljava/lang/Long;", "getTransferSize", "()Ljava/lang/Long;", "h", "Ljava/lang/Integer;", "getTransferDuration", "()Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "getHttpCode", "j", "getHttpUrl", JWKParameterNames.OCT_KEY_VALUE, "getTimestamp", "setTimestamp", "(Ljava/lang/String;)V", "l", "getCompressedSize", "m", "getQueuedDuration", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c implements Parcelable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final SimpleDateFormat f171925o;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TransferType")
    private final String transferType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TransferDirection")
    private final String transferDirection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("DataType")
    private final String dataType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Result")
    private final String result;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("AgentResult")
    private final String agentResult;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ErrorInfo")
    private final kc2.b errorInfo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TransferSize")
    private final Long transferSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TransferDuration")
    private final Integer transferDuration;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("HttpCode")
    private final Integer httpCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Url")
    private final String httpUrl;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TimeStamp")
    private String timestamp;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CompressedSize")
    private final Long compressedSize;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("QueuedDuration")
    private final Integer queuedDuration;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f171924n = new a(null);
    public static final Parcelable.Creator<c> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            kc2.b bVar = (kc2.b) parcel.readParcelable(c.class.getClassLoader());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long l14 = lValueOf;
            Integer num = numValueOf;
            String string6 = parcel.readString();
            Integer numValueOf3 = null;
            Integer num2 = numValueOf2;
            String string7 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new c(string, string2, string3, string4, string5, bVar, l14, num, num2, string6, string7, lValueOf2, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    static {
        e.f199664d.getClass();
        f171925o = new SimpleDateFormat(e.f199665e, Locale.US);
    }

    public c(String str, String str2, String str3, String str4, String str5, kc2.b bVar, Long l14, Integer num, Integer num2, String str6, String str7, Long l15, Integer num3) {
        hb.a.p(str, str2, str3, str4, str7);
        this.transferType = str;
        this.transferDirection = str2;
        this.dataType = str3;
        this.result = str4;
        this.agentResult = str5;
        this.errorInfo = bVar;
        this.transferSize = l14;
        this.transferDuration = num;
        this.httpCode = num2;
        this.httpUrl = str6;
        this.timestamp = str7;
        this.compressedSize = l15;
        this.queuedDuration = num3;
    }

    public final int b() {
        String str = this.httpUrl;
        f171924n.getClass();
        int length = 0;
        int length2 = str != null ? str.length() : 0;
        kc2.b bVar = this.errorInfo;
        if (bVar != null) {
            int length3 = bVar.getErrorType().length() + bVar.getErrorMessage().length() + bVar.getErrorType().length() + bVar.getErrorGroupName().length();
            String errorPriority = bVar.getErrorPriority();
            length = (errorPriority != null ? errorPriority.length() : 0) + length3;
        }
        return length2 + length;
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
        return s.g(this.transferType, cVar.transferType) && s.g(this.transferDirection, cVar.transferDirection) && s.g(this.dataType, cVar.dataType) && s.g(this.result, cVar.result) && s.g(this.agentResult, cVar.agentResult) && s.g(this.errorInfo, cVar.errorInfo) && s.g(this.transferSize, cVar.transferSize) && s.g(this.transferDuration, cVar.transferDuration) && s.g(this.httpCode, cVar.httpCode) && s.g(this.httpUrl, cVar.httpUrl) && s.g(this.timestamp, cVar.timestamp) && s.g(this.compressedSize, cVar.compressedSize) && s.g(this.queuedDuration, cVar.queuedDuration);
    }

    public final int hashCode() {
        int iJ = g.j(g.j(g.j(this.transferType.hashCode() * 31, 31, this.transferDirection), 31, this.dataType), 31, this.result);
        String str = this.agentResult;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        kc2.b bVar = this.errorInfo;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Long l14 = this.transferSize;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num = this.transferDuration;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.httpCode;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.httpUrl;
        int iJ2 = g.j((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.timestamp);
        Long l15 = this.compressedSize;
        int iHashCode6 = (iJ2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num3 = this.queuedDuration;
        return iHashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.transferType;
        String str2 = this.transferDirection;
        String str3 = this.dataType;
        String str4 = this.result;
        String str5 = this.agentResult;
        kc2.b bVar = this.errorInfo;
        Long l14 = this.transferSize;
        Integer num = this.transferDuration;
        Integer num2 = this.httpCode;
        String str6 = this.httpUrl;
        String str7 = this.timestamp;
        Long l15 = this.compressedSize;
        Integer num3 = this.queuedDuration;
        StringBuilder sbI = p6.b.i("FileTransferInfo(transferType=", str, ", transferDirection=", str2, ", dataType=");
        sn.a.t(sbI, str3, ", result=", str4, ", agentResult=");
        sbI.append(str5);
        sbI.append(", errorInfo=");
        sbI.append(bVar);
        sbI.append(", transferSize=");
        sbI.append(l14);
        sbI.append(", transferDuration=");
        sbI.append(num);
        sbI.append(", httpCode=");
        p6.b.l(num2, ", httpUrl=", str6, ", timestamp=", sbI);
        j.q(l15, str7, ", compressedSize=", ", queuedDuration=", sbI);
        return f3.i(sbI, num3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.transferType);
        parcel.writeString(this.transferDirection);
        parcel.writeString(this.dataType);
        parcel.writeString(this.result);
        parcel.writeString(this.agentResult);
        parcel.writeParcelable(this.errorInfo, i14);
        Long l14 = this.transferSize;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Integer num = this.transferDuration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        Integer num2 = this.httpCode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num2);
        }
        parcel.writeString(this.httpUrl);
        parcel.writeString(this.timestamp);
        Long l15 = this.compressedSize;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Integer num3 = this.queuedDuration;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num3);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luk2/c$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: uk2.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3199a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f171939a;

            static {
                int[] iArr = new int[k.values().length];
                try {
                    iArr[k.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k.SKIPPED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[k.INTERRUPTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[k.FAILURE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f171939a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(a aVar, l lVar) {
            jc2.f fVar;
            kc2.b bVarA;
            y yVar;
            ok2.e failure;
            y yVar2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            aVar.getClass();
            lVar.getClass();
            x xVar = lVar.f3823e;
            wk2.f fVar2 = lVar.f3821c;
            CoreTransferException coreTransferException = lVar.f3826h;
            k kVar = lVar.f3822d;
            int i14 = C3199a.f171939a[kVar.ordinal()];
            if (i14 == 1) {
                fVar = jc2.f.SUCCESS;
            } else if (i14 == 2 || i14 == 3) {
                fVar = jc2.f.ABORT;
            } else {
                if (i14 != 4) {
                    org.apache.commons.lang3.e.l("Unsupported event: [", kVar, "]");
                    return null;
                }
                fVar = jc2.f.FAILURE;
            }
            String str = fVar.jsonValue;
            if (coreTransferException != null) {
                d.b bVar = d.f171940e;
                ok2.e.a aVar2 = coreTransferException.getFailure().f132657a;
                Boolean boolValueOf = (xVar == null || (yVar2 = xVar.f138496a) == null) ? null : Boolean.valueOf(yVar2.f138508a);
                aVar2.getClass();
                jc2.c cVar = ((aVar2 == ok2.e.a.DEVICE || aVar2 == ok2.e.a.APP || aVar2 == ok2.e.a.SERVER) && !s.g(boolValueOf, Boolean.FALSE)) ? jc2.c.HIGH : jc2.c.NORMAL;
                UUID uuid = fVar2.f185842a;
                bVar.getClass();
                bVarA = d.b.a(coreTransferException, cVar, uuid);
            } else {
                bVarA = null;
            }
            String strZ = coreTransferException != null ? lg.d.z(coreTransferException) : null;
            if (strZ != null && strZ.length() != 0) {
                com.garmin.android.lib.garminmobileanalytics.b.f49927a.getClass();
                strZ = com.garmin.android.lib.garminmobileanalytics.b.a.a(strZ);
            }
            String str2 = strZ;
            Integer num = (coreTransferException == null || (failure = coreTransferException.getFailure()) == null || failure.f132658b) ? lVar.f3828j : null;
            String strName = lVar.f3820b.name();
            String strName2 = fVar2.f185844c.name();
            String str3 = fVar2.f185843b;
            str.getClass();
            String strName3 = (xVar == null || (yVar = xVar.f138496a) == null) ? null : yVar.name();
            Long l14 = lVar.f3824f;
            Integer num2 = lVar.f3825g;
            Integer numY = coreTransferException != null ? lg.d.y(coreTransferException) : null;
            String str4 = c.f171925o.format(Long.valueOf(jCurrentTimeMillis));
            str4.getClass();
            return new c(strName, strName2, str3, str, strName3, bVarA, l14, num2, numY, str2, str4, lVar.f3827i, num);
        }

        private a() {
        }
    }
}
