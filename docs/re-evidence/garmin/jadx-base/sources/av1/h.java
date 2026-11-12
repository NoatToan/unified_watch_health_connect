package av1;

import c22.l3;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import g22.k;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b.\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001c¨\u00062"}, d2 = {"Lav1/h;", "", "Lhv1/b;", "category", "", "contentId", "", "contentRef", "Lhv1/c;", "contentType", "imageUrlSmall", "imageUrlLarge", "lengthInSeconds", "provider", "", "seen", "_showAtTime", "title", "titleI18nKey", "trainingPlanId", "<init>", "(Lhv1/b;JLjava/lang/String;Lhv1/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "a", "Lhv1/b;", "b", "()Lhv1/b;", "J", "c", "()J", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lhv1/c;", JWKParameterNames.RSA_EXPONENT, "()Lhv1/c;", "g", "f", "getImageUrlLarge", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "getProvider", IntegerTokenConverter.CONVERTER_KEY, "Z", "()Z", "j", JWKParameterNames.OCT_KEY_VALUE, "l", "m", "getTrainingPlanId", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("category")
    private final hv1.b category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentId")
    private final long contentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentRef")
    private final String contentRef;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentType")
    private final hv1.c contentType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrlSmall")
    private final String imageUrlSmall;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrlLarge")
    private final String imageUrlLarge;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lengthInSeconds")
    private final Long lengthInSeconds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("provider")
    private final String provider;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("seen")
    private final boolean seen;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showAtTime")
    private final String _showAtTime;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("titleI18nKey")
    private final String titleI18nKey;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanId")
    private final long trainingPlanId;

    public h(hv1.b bVar, long j8, String str, hv1.c cVar, String str2, String str3, Long l14, String str4, boolean z14, String str5, String str6, String str7, long j14) {
        bVar.getClass();
        cVar.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.category = bVar;
        this.contentId = j8;
        this.contentRef = str;
        this.contentType = cVar;
        this.imageUrlSmall = str2;
        this.imageUrlLarge = str3;
        this.lengthInSeconds = l14;
        this.provider = str4;
        this.seen = z14;
        this._showAtTime = str5;
        this.title = str6;
        this.titleI18nKey = str7;
        this.trainingPlanId = j14;
    }

    public static h a(h hVar) {
        hv1.b bVar = hVar.category;
        long j8 = hVar.contentId;
        String str = hVar.contentRef;
        hv1.c cVar = hVar.contentType;
        String str2 = hVar.imageUrlSmall;
        String str3 = hVar.imageUrlLarge;
        Long l14 = hVar.lengthInSeconds;
        String str4 = hVar.provider;
        String str5 = hVar._showAtTime;
        String str6 = hVar.title;
        String str7 = hVar.titleI18nKey;
        long j14 = hVar.trainingPlanId;
        hVar.getClass();
        bVar.getClass();
        cVar.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        return new h(bVar, j8, str, cVar, str2, str3, l14, str4, true, str5, str6, str7, j14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final hv1.b getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getContentRef() {
        return this.contentRef;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hv1.c getContentType() {
        return this.contentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.category == hVar.category && this.contentId == hVar.contentId && s.g(this.contentRef, hVar.contentRef) && this.contentType == hVar.contentType && s.g(this.imageUrlSmall, hVar.imageUrlSmall) && s.g(this.imageUrlLarge, hVar.imageUrlLarge) && s.g(this.lengthInSeconds, hVar.lengthInSeconds) && s.g(this.provider, hVar.provider) && this.seen == hVar.seen && s.g(this._showAtTime, hVar._showAtTime) && s.g(this.title, hVar.title) && s.g(this.titleI18nKey, hVar.titleI18nKey) && this.trainingPlanId == hVar.trainingPlanId;
    }

    public final String f(boolean z14) {
        Long l14 = this.lengthInSeconds;
        if (l14 == null) {
            return null;
        }
        long jLongValue = l14.longValue();
        l3.f23124b.getClass();
        long j8 = 60;
        long j14 = jLongValue / j8;
        long j15 = jLongValue % j8;
        x0 x0Var = x0.f105818a;
        String str = String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14), Long.valueOf(j15)}, 2));
        if (z14) {
            List listW = w.W(str, new String[]{":"});
            String str2 = (String) listW.get(0);
            if (w.z((String) listW.get(1), "00", false)) {
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getImageUrlSmall() {
        return this.imageUrlSmall;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getLengthInSeconds() {
        return this.lengthInSeconds;
    }

    public final int hashCode() {
        int iE = q6.f.e(this.category.hashCode() * 31, 31, this.contentId);
        String str = this.contentRef;
        int iHashCode = (this.contentType.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.imageUrlSmall;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrlLarge;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.lengthInSeconds;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str4 = this.provider;
        return Long.hashCode(this.trainingPlanId) + wr.g.j(wr.g.j(wr.g.j(q6.f.g((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.seen), 31, this._showAtTime), 31, this.title), 31, this.titleI18nKey);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getSeen() {
        return this.seen;
    }

    public final DateTime j() {
        return k.q(this._showAtTime, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTitleI18nKey() {
        return this.titleI18nKey;
    }

    public final String toString() {
        hv1.b bVar = this.category;
        long j8 = this.contentId;
        String str = this.contentRef;
        hv1.c cVar = this.contentType;
        String str2 = this.imageUrlSmall;
        String str3 = this.imageUrlLarge;
        Long l14 = this.lengthInSeconds;
        String str4 = this.provider;
        boolean z14 = this.seen;
        String str5 = this._showAtTime;
        String str6 = this.title;
        String str7 = this.titleI18nKey;
        long j14 = this.trainingPlanId;
        StringBuilder sb3 = new StringBuilder("TrainingPremiumContent(category=");
        sb3.append(bVar);
        sb3.append(", contentId=");
        sb3.append(j8);
        sb3.append(", contentRef=");
        sb3.append(str);
        sb3.append(", contentType=");
        sb3.append(cVar);
        sn.a.t(sb3, ", imageUrlSmall=", str2, ", imageUrlLarge=", str3);
        sb3.append(", lengthInSeconds=");
        sb3.append(l14);
        sb3.append(", provider=");
        sb3.append(str4);
        sb3.append(", seen=");
        sb3.append(z14);
        sb3.append(", _showAtTime=");
        sb3.append(str5);
        sn.a.t(sb3, ", title=", str6, ", titleI18nKey=", str7);
        return com.nimbusds.jose.shaded.gson.internal.a.g(j14, ", trainingPlanId=", ")", sb3);
    }
}
