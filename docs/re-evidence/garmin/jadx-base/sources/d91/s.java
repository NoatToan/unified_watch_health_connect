package d91;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ld91/s;", "", "", "referenceId", "greeting", "message", "Lorg/joda/time/LocalDateTime;", "dateTimeUtc", "version", "", "viewed", "Ld91/f;", "reaction", "sentiment", "Li53/c;", "Ld91/b;", "concerns", "feedback", "", "Ld91/h;", "messageLinks", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Ljava/lang/String;ZLd91/f;Ld91/f;Li53/c;Ljava/lang/String;Ljava/util/List;)V", "a", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f58578l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f58580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime f58582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f58583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f58584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f58585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f58586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i53.c<b> f58587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f58588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<h> f58589k;

    public s(String str, String str2, String str3, LocalDateTime localDateTime, String str4, boolean z14, f fVar, f fVar2, i53.c cVar, String str5, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, localDateTime, str4, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? null : fVar, (i14 & 128) != 0 ? null : fVar2, (i14 & 256) != 0 ? null : cVar, (i14 & 512) != 0 ? null : str5, (i14 & 1024) != 0 ? j0.f134944a : list);
    }

    public static s a(s sVar, f fVar, f fVar2, i53.c cVar, String str, int i14) {
        String str2 = sVar.f58579a;
        String str3 = sVar.f58580b;
        String str4 = sVar.f58581c;
        LocalDateTime localDateTime = sVar.f58582d;
        String str5 = sVar.f58583e;
        boolean z14 = (i14 & 32) != 0 ? sVar.f58584f : true;
        if ((i14 & 64) != 0) {
            fVar = sVar.f58585g;
        }
        f fVar3 = fVar;
        if ((i14 & 128) != 0) {
            fVar2 = sVar.f58586h;
        }
        f fVar4 = fVar2;
        i53.c cVar2 = (i14 & 256) != 0 ? sVar.f58587i : cVar;
        String str6 = (i14 & 512) != 0 ? sVar.f58588j : str;
        List<h> list = sVar.f58589k;
        sVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        localDateTime.getClass();
        list.getClass();
        return new s(str2, str3, str4, localDateTime, str5, z14, fVar3, fVar4, cVar2, str6, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f58579a, sVar.f58579a) && p005kotlin.jvm.internal.s.g(this.f58580b, sVar.f58580b) && p005kotlin.jvm.internal.s.g(this.f58581c, sVar.f58581c) && p005kotlin.jvm.internal.s.g(this.f58582d, sVar.f58582d) && p005kotlin.jvm.internal.s.g(this.f58583e, sVar.f58583e) && this.f58584f == sVar.f58584f && this.f58585g == sVar.f58585g && this.f58586h == sVar.f58586h && p005kotlin.jvm.internal.s.g(this.f58587i, sVar.f58587i) && p005kotlin.jvm.internal.s.g(this.f58588j, sVar.f58588j) && p005kotlin.jvm.internal.s.g(this.f58589k, sVar.f58589k);
    }

    public final int hashCode() {
        int iHashCode = (this.f58582d.hashCode() + wr.g.j(wr.g.j(this.f58579a.hashCode() * 31, 31, this.f58580b), 31, this.f58581c)) * 31;
        String str = this.f58583e;
        int iG = q6.f.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f58584f);
        f fVar = this.f58585g;
        int iHashCode2 = (iG + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f fVar2 = this.f58586h;
        int iHashCode3 = (iHashCode2 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        i53.c<b> cVar = this.f58587i;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str2 = this.f58588j;
        return this.f58589k.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("PersonalizedInsight(referenceId=", this.f58579a, ", greeting=", this.f58580b, ", message=");
        sbI.append(this.f58581c);
        sbI.append(", dateTimeUtc=");
        sbI.append(this.f58582d);
        sbI.append(", version=");
        v.h.C(this.f58583e, ", viewed=", ", reaction=", sbI, this.f58584f);
        sbI.append(this.f58585g);
        sbI.append(", sentiment=");
        sbI.append(this.f58586h);
        sbI.append(", concerns=");
        sbI.append(this.f58587i);
        sbI.append(", feedback=");
        sbI.append(this.f58588j);
        sbI.append(", messageLinks=");
        return z.c(sbI, this.f58589k, ")");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld91/s$a;", "", "<init>", "()V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v0, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
        public static s a(c cVar) {
            ?? arrayList;
            List<b> listA;
            h hVar;
            cVar.getClass();
            List<i> listF = cVar.f();
            if (listF != null) {
                arrayList = new ArrayList();
                for (i iVar : listF) {
                    iVar.getClass();
                    d91.a feature = iVar.getFeature();
                    if (feature != null) {
                        String cardTitle = iVar.getCardTitle();
                        String cardBody = iVar.getCardBody();
                        List<j> listD = iVar.d();
                        ArrayList arrayList2 = new ArrayList();
                        if (listD != null) {
                            for (j jVar : listD) {
                                arrayList2.add(new k(jVar.getName(), jVar.getValue()));
                            }
                        }
                        hVar = new h(feature, cardTitle, cardBody, arrayList2);
                    } else {
                        hVar = null;
                    }
                    if (hVar != null) {
                        arrayList.add(hVar);
                    }
                }
            } else {
                arrayList = j0.f134944a;
            }
            ?? r14 = arrayList;
            if (cVar.getReferenceId() != null) {
                n currentStatus = cVar.getCurrentStatus();
                if ((currentStatus != null ? currentStatus.getTimestampUtc() : null) != null && cVar.getMessageGreeting() != null && cVar.getMessage() != null) {
                    String referenceId = cVar.getReferenceId();
                    String messageGreeting = cVar.getMessageGreeting();
                    String message = cVar.getMessage();
                    LocalDateTime dataAsOfTimestampUtc = cVar.getDataAsOfTimestampUtc();
                    if (dataAsOfTimestampUtc == null) {
                        dataAsOfTimestampUtc = cVar.getCurrentStatus().getTimestampUtc();
                    }
                    LocalDateTime localDateTime = dataAsOfTimestampUtc;
                    String version = cVar.getVersion();
                    Boolean viewed = cVar.getViewed();
                    boolean zBooleanValue = viewed != null ? viewed.booleanValue() : false;
                    g currentFeedback = cVar.getCurrentFeedback();
                    f reaction = currentFeedback != null ? currentFeedback.getReaction() : null;
                    g currentFeedback2 = cVar.getCurrentFeedback();
                    f feedbackSentiment = currentFeedback2 != null ? currentFeedback2.getFeedbackSentiment() : null;
                    g currentFeedback3 = cVar.getCurrentFeedback();
                    i53.c cVarE = (currentFeedback3 == null || (listA = currentFeedback3.a()) == null) ? null : i53.a.e(listA);
                    g currentFeedback4 = cVar.getCurrentFeedback();
                    return new s(referenceId, messageGreeting, message, localDateTime, version, zBooleanValue, reaction, feedbackSentiment, cVarE, currentFeedback4 != null ? currentFeedback4.getReview() : null, r14);
                }
            }
            return null;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(String str, String str2, String str3, LocalDateTime localDateTime, String str4, boolean z14, f fVar, f fVar2, i53.c<? extends b> cVar, String str5, List<h> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        localDateTime.getClass();
        list.getClass();
        this.f58579a = str;
        this.f58580b = str2;
        this.f58581c = str3;
        this.f58582d = localDateTime;
        this.f58583e = str4;
        this.f58584f = z14;
        this.f58585g = fVar;
        this.f58586h = fVar2;
        this.f58587i = cVar;
        this.f58588j = str5;
        this.f58589k = list;
    }
}
