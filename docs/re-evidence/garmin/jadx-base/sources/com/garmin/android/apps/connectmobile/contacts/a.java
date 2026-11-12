package com.garmin.android.apps.connectmobile.contacts;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import l20.k;
import l20.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/a;", "", "<init>", "()V", "d", "f", "c", JWKParameterNames.RSA_EXPONENT, "b", "a", "g", "Lcom/garmin/android/apps/connectmobile/contacts/a$a;", "Lcom/garmin/android/apps/connectmobile/contacts/a$b;", "Lcom/garmin/android/apps/connectmobile/contacts/a$c;", "Lcom/garmin/android/apps/connectmobile/contacts/a$d;", "Lcom/garmin/android/apps/connectmobile/contacts/a$e;", "Lcom/garmin/android/apps/connectmobile/contacts/a$f;", "Lcom/garmin/android/apps/connectmobile/contacts/a$g;", "Lf20/d0;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/a$a;", "Lcom/garmin/android/apps/connectmobile/contacts/a;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0525a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0525a f32332a = new C0525a();

        private C0525a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/a$b;", "Lcom/garmin/android/apps/connectmobile/contacts/a;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32333a = new b();

        private b() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/a$g;", "Lcom/garmin/android/apps/connectmobile/contacts/a;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f32377a = new g();

        private g() {
            super(null);
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/a$e;", "Lcom/garmin/android/apps/connectmobile/contacts/a;", "", "phoneNumber", "", "showLiveTrackIcon", "shouldShowHeading", "<init>", "(Ljava/lang/String;ZZ)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f32354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f32355c;

        public /* synthetic */ e(String str, boolean z14, boolean z15, int i14, j jVar) {
            this(str, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f32353a, eVar.f32353a) && this.f32354b == eVar.f32354b && this.f32355c == eVar.f32355c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f32355c) + q6.f.g(this.f32353a.hashCode() * 31, 31, this.f32354b);
        }

        public final String toString() {
            return hb.a.k(zl.a.d("MessengerItem(phoneNumber=", this.f32353a, ", showLiveTrackIcon=", this.f32354b, ", shouldShowHeading="), this.f32355c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z14, boolean z15) {
            super(null);
            str.getClass();
            this.f32353a = str;
            this.f32354b = z14;
            this.f32355c = z15;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/a$d;", "Lcom/garmin/android/apps/connectmobile/contacts/a;", "", "firstName", "lastName", "imageUrl", "", "showViewProfileButton", "", "emergencyIconResource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f32348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f32349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f32350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f32351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f32352e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, boolean z14, Integer num) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f32348a = str;
            this.f32349b = str2;
            this.f32350c = str3;
            this.f32351d = z14;
            this.f32352e = num;
        }

        public /* synthetic */ d(String str, String str2, String str3, boolean z14, Integer num, int i14, j jVar) {
            this(str, str2, str3, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? null : num);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/a$c;", "Lcom/garmin/android/apps/connectmobile/contacts/a;", "", TtmlNode.ATTR_ID, "", FirebaseAnalytics.Param.CONTENT, "Ll20/k;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "isValid", "", "localId", "showLiveTrackIcon", "grayedLiveTrackIcon", "selectable", "selected", "emergencyContactMethod", "detailStatusTextResourceId", "methodPickerStatusResourceId", "shouldShowHeading", "emergencyIconResource", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ll20/k;ZIZZZZZLjava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f32334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f32335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k f32336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f32337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f32338e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f32339f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f32340g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f32341h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f32342i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f32343j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Integer f32344k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Integer f32345l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f32346m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Integer f32347n;

        public /* synthetic */ c(Long l14, String str, k kVar, boolean z14, int i14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Integer num, Integer num2, boolean z24, Integer num3, int i15, j jVar) {
            this((i15 & 1) != 0 ? null : l14, str, kVar, (i15 & 8) != 0 ? true : z14, (i15 & 16) != 0 ? -1 : i14, (i15 & 32) != 0 ? false : z15, (i15 & 64) != 0 ? false : z16, (i15 & 128) != 0 ? false : z17, (i15 & 256) != 0 ? false : z18, (i15 & 512) != 0 ? false : z19, (i15 & 1024) != 0 ? null : num, (i15 & 2048) != 0 ? null : num2, (i15 & 4096) != 0 ? false : z24, num3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f32334a, cVar.f32334a) && s.g(this.f32335b, cVar.f32335b) && this.f32336c == cVar.f32336c && this.f32337d == cVar.f32337d && this.f32338e == cVar.f32338e && this.f32339f == cVar.f32339f && this.f32340g == cVar.f32340g && this.f32341h == cVar.f32341h && this.f32342i == cVar.f32342i && this.f32343j == cVar.f32343j && s.g(this.f32344k, cVar.f32344k) && s.g(this.f32345l, cVar.f32345l) && this.f32346m == cVar.f32346m && s.g(this.f32347n, cVar.f32347n);
        }

        public final int hashCode() {
            Long l14 = this.f32334a;
            int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q2.d(this.f32338e, q6.f.g((this.f32336c.hashCode() + wr.g.j((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.f32335b)) * 31, 31, this.f32337d), 31), 31, this.f32339f), 31, this.f32340g), 31, this.f32341h), 31, this.f32342i), 31, this.f32343j);
            Integer num = this.f32344k;
            int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f32345l;
            int iG2 = q6.f.g((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f32346m);
            Integer num3 = this.f32347n;
            return iG2 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f32335b;
            k kVar = this.f32336c;
            boolean z14 = this.f32342i;
            StringBuilder sbJ = b71.i.j("EmailItem(id=", ", content=", str, this.f32334a, ", type=");
            sbJ.append(kVar);
            sbJ.append(", isValid=");
            sbJ.append(this.f32337d);
            sbJ.append(", localId=");
            fb1.c.x(sbJ, this.f32338e, ", showLiveTrackIcon=", this.f32339f, ", grayedLiveTrackIcon=");
            kg.f.q(", selectable=", ", selected=", sbJ, this.f32340g, this.f32341h);
            kg.f.q(", emergencyContactMethod=", ", detailStatusTextResourceId=", sbJ, z14, this.f32343j);
            x.m(sbJ, this.f32344k, ", methodPickerStatusResourceId=", this.f32345l, ", shouldShowHeading=");
            sbJ.append(this.f32346m);
            sbJ.append(", emergencyIconResource=");
            sbJ.append(this.f32347n);
            sbJ.append(")");
            return sbJ.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Long l14, String str, k kVar, boolean z14, int i14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Integer num, Integer num2, boolean z24, Integer num3) {
            super(null);
            str.getClass();
            kVar.getClass();
            this.f32334a = l14;
            this.f32335b = str;
            this.f32336c = kVar;
            this.f32337d = z14;
            this.f32338e = i14;
            this.f32339f = z15;
            this.f32340g = z16;
            this.f32341h = z17;
            this.f32342i = z18;
            this.f32343j = z19;
            this.f32344k = num;
            this.f32345l = num2;
            this.f32346m = z24;
            this.f32347n = num3;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/a$f;", "Lcom/garmin/android/apps/connectmobile/contacts/a;", "", TtmlNode.ATTR_ID, "", FirebaseAnalytics.Param.CONTENT, "Ll20/p;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "hasWarnings", "showLiveTrackIcon", "grayedLiveTrackIcon", "selectable", "selected", "isValid", "isEmergencyCallingNumber", "phoneUUID", "", "statusTextResourceId", "emergencyContactMethod", "detailStatusTextResourceId", "methodPickerStatusResourceId", "showSendRequest", "isValidApi", "shouldShowHeading", "localId", "emergencyIconResource", "hasMessengerAssociated", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ll20/p;ZZZZZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Boolean;ZILjava/lang/Integer;Z)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f32356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f32357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f32358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f32359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f32360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f32361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f32362g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f32363h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f32364i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Boolean f32365j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f32366k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f32367l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f32368m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Integer f32369n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Integer f32370o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f32371p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f32372q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f32373r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f32374s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Integer f32375t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f32376u;

        public /* synthetic */ f(Long l14, String str, p pVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Boolean bool, String str2, Integer num, boolean z24, Integer num2, Integer num3, boolean z25, Boolean bool2, boolean z26, int i14, Integer num4, boolean z27, int i15, j jVar) {
            this((i15 & 1) != 0 ? null : l14, str, pVar, (i15 & 8) != 0 ? false : z14, (i15 & 16) != 0 ? false : z15, (i15 & 32) != 0 ? false : z16, (i15 & 64) != 0 ? false : z17, (i15 & 128) != 0 ? false : z18, (i15 & 256) != 0 ? true : z19, (i15 & 512) != 0 ? null : bool, (i15 & 1024) != 0 ? null : str2, (i15 & 2048) != 0 ? null : num, (i15 & 4096) != 0 ? false : z24, (i15 & 8192) != 0 ? null : num2, (i15 & 16384) != 0 ? null : num3, (32768 & i15) != 0 ? false : z25, (65536 & i15) != 0 ? Boolean.TRUE : bool2, (131072 & i15) != 0 ? false : z26, (262144 & i15) != 0 ? -1 : i14, (524288 & i15) != 0 ? null : num4, (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? false : z27);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return s.g(this.f32356a, fVar.f32356a) && s.g(this.f32357b, fVar.f32357b) && this.f32358c == fVar.f32358c && this.f32359d == fVar.f32359d && this.f32360e == fVar.f32360e && this.f32361f == fVar.f32361f && this.f32362g == fVar.f32362g && this.f32363h == fVar.f32363h && this.f32364i == fVar.f32364i && s.g(this.f32365j, fVar.f32365j) && s.g(this.f32366k, fVar.f32366k) && s.g(this.f32367l, fVar.f32367l) && this.f32368m == fVar.f32368m && s.g(this.f32369n, fVar.f32369n) && s.g(this.f32370o, fVar.f32370o) && this.f32371p == fVar.f32371p && s.g(this.f32372q, fVar.f32372q) && this.f32373r == fVar.f32373r && this.f32374s == fVar.f32374s && s.g(this.f32375t, fVar.f32375t) && this.f32376u == fVar.f32376u;
        }

        public final int hashCode() {
            Long l14 = this.f32356a;
            int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((this.f32358c.hashCode() + wr.g.j((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.f32357b)) * 31, 31, this.f32359d), 31, this.f32360e), 31, this.f32361f), 31, this.f32362g), 31, this.f32363h), 31, this.f32364i);
            Boolean bool = this.f32365j;
            int iHashCode = (iG + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.f32366k;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f32367l;
            int iG2 = q6.f.g((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f32368m);
            Integer num2 = this.f32369n;
            int iHashCode3 = (iG2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f32370o;
            int iG3 = q6.f.g((iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.f32371p);
            Boolean bool2 = this.f32372q;
            int iD = q2.d(this.f32374s, q6.f.g((iG3 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f32373r), 31);
            Integer num4 = this.f32375t;
            return Boolean.hashCode(this.f32376u) + ((iD + (num4 != null ? num4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            String str = this.f32357b;
            p pVar = this.f32358c;
            boolean z14 = this.f32359d;
            boolean z15 = this.f32363h;
            String str2 = this.f32366k;
            Integer num = this.f32367l;
            Boolean bool = this.f32372q;
            StringBuilder sbJ = b71.i.j("PhoneItem(id=", ", content=", str, this.f32356a, ", type=");
            sbJ.append(pVar);
            sbJ.append(", hasWarnings=");
            sbJ.append(z14);
            sbJ.append(", showLiveTrackIcon=");
            kg.f.q(", grayedLiveTrackIcon=", ", selectable=", sbJ, this.f32360e, this.f32361f);
            kg.f.q(", selected=", ", isValid=", sbJ, this.f32362g, z15);
            sbJ.append(this.f32364i);
            sbJ.append(", isEmergencyCallingNumber=");
            sbJ.append(this.f32365j);
            sbJ.append(", phoneUUID=");
            fb1.c.u(num, str2, ", statusTextResourceId=", ", emergencyContactMethod=", sbJ);
            sbJ.append(this.f32368m);
            sbJ.append(", detailStatusTextResourceId=");
            sbJ.append(this.f32369n);
            sbJ.append(", methodPickerStatusResourceId=");
            sbJ.append(this.f32370o);
            sbJ.append(", showSendRequest=");
            sbJ.append(this.f32371p);
            sbJ.append(", isValidApi=");
            sbJ.append(bool);
            sbJ.append(", shouldShowHeading=");
            sbJ.append(this.f32373r);
            sbJ.append(", localId=");
            sbJ.append(this.f32374s);
            sbJ.append(", emergencyIconResource=");
            sbJ.append(this.f32375t);
            sbJ.append(", hasMessengerAssociated=");
            return hb.a.k(sbJ, this.f32376u, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Long l14, String str, p pVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Boolean bool, String str2, Integer num, boolean z24, Integer num2, Integer num3, boolean z25, Boolean bool2, boolean z26, int i14, Integer num4, boolean z27) {
            super(null);
            str.getClass();
            pVar.getClass();
            this.f32356a = l14;
            this.f32357b = str;
            this.f32358c = pVar;
            this.f32359d = z14;
            this.f32360e = z15;
            this.f32361f = z16;
            this.f32362g = z17;
            this.f32363h = z18;
            this.f32364i = z19;
            this.f32365j = bool;
            this.f32366k = str2;
            this.f32367l = num;
            this.f32368m = z24;
            this.f32369n = num2;
            this.f32370o = num3;
            this.f32371p = z25;
            this.f32372q = bool2;
            this.f32373r = z26;
            this.f32374s = i14;
            this.f32375t = num4;
            this.f32376u = z27;
        }
    }
}
