package com.garmin.android.apps.connectmobile.devices.targetedselection;

import c22.c3;
import com.google.firebase.perf.util.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l;", "", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/m;", "itemViewType", "<init>", "(Lcom/garmin/android/apps/connectmobile/devices/targetedselection/m;)V", "a", "b", "c", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l$a;", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l$b;", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l$c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f34612a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l$b;", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l;", "", "titleResourceId", "<init>", "(I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34623b;

        public b(int i14) {
            super(m.HEADER, null);
            this.f34623b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f34623b == ((b) obj).f34623b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f34623b);
        }

        public final String toString() {
            return e0.f(this.f34623b, "HeaderData(titleResourceId=", ")");
        }
    }

    private l(m mVar) {
        this.f34612a = mVar;
    }

    public /* synthetic */ l(m mVar, p005kotlin.jvm.internal.j jVar) {
        this(mVar);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l$c;", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l;", "", "messageResourceId", "Lc22/c3;", "messageOnDemandResId", "<init>", "(ILc22/c3;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c3 f34625c;

        public /* synthetic */ c(int i14, c3 c3Var, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? -1 : i14, (i15 & 2) != 0 ? null : c3Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f34624b == cVar.f34624b && s.g(this.f34625c, cVar.f34625c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f34624b) * 31;
            c3 c3Var = this.f34625c;
            return iHashCode + (c3Var == null ? 0 : c3Var.hashCode());
        }

        public final String toString() {
            return "MessageData(messageResourceId=" + this.f34624b + ", messageOnDemandResId=" + this.f34625c + ")";
        }

        public c(int i14, c3 c3Var) {
            super(m.MESSAGE, null);
            this.f34624b = i14;
            this.f34625c = c3Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l$a;", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/l;", "", "productName", "", "unitId", "imageUrl", "fallbackImageUrl", "", "isSelected", Constants.ENABLE_DISABLE, "isConnected", "startWorkoutAvailable", "Lbz/d;", "compatibility", "shouldShowLearnMore", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLbz/d;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f34613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f34614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f34615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f34616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f34617f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f34618g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f34619h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f34620i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final bz.d f34621j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f34622k;

        public /* synthetic */ a(String str, long j8, String str2, String str3, boolean z14, boolean z15, boolean z16, boolean z17, bz.d dVar, boolean z18, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, j8, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? false : z16, (i14 & 128) != 0 ? false : z17, (i14 & 256) != 0 ? null : dVar, (i14 & 512) != 0 ? true : z18);
        }

        public static a a(a aVar, boolean z14) {
            String str = aVar.f34613b;
            long j8 = aVar.f34614c;
            String str2 = aVar.f34615d;
            String str3 = aVar.f34616e;
            boolean z15 = aVar.f34618g;
            boolean z16 = aVar.f34619h;
            boolean z17 = aVar.f34620i;
            bz.d dVar = aVar.f34621j;
            boolean z18 = aVar.f34622k;
            str.getClass();
            return new a(str, j8, str2, str3, z14, z15, z16, z17, dVar, z18);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f34613b, aVar.f34613b) && this.f34614c == aVar.f34614c && s.g(this.f34615d, aVar.f34615d) && s.g(this.f34616e, aVar.f34616e) && this.f34617f == aVar.f34617f && this.f34618g == aVar.f34618g && this.f34619h == aVar.f34619h && this.f34620i == aVar.f34620i && this.f34621j == aVar.f34621j && this.f34622k == aVar.f34622k;
        }

        public final int hashCode() {
            int iE = q6.f.e(this.f34613b.hashCode() * 31, 31, this.f34614c);
            String str = this.f34615d;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f34616e;
            int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f34617f), 31, this.f34618g), 31, this.f34619h), 31, this.f34620i);
            bz.d dVar = this.f34621j;
            return Boolean.hashCode(this.f34622k) + ((iG + (dVar != null ? dVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f34614c, "DeviceData(productName=", this.f34613b, ", unitId=");
            sn.a.t(sbJ, ", imageUrl=", this.f34615d, ", fallbackImageUrl=", this.f34616e);
            com.airbnb.lottie.animation.keyframe.a.v(", isSelected=", ", isEnabled=", sbJ, this.f34617f, this.f34618g);
            com.airbnb.lottie.animation.keyframe.a.v(", isConnected=", ", startWorkoutAvailable=", sbJ, this.f34619h, this.f34620i);
            sbJ.append(", compatibility=");
            sbJ.append(this.f34621j);
            sbJ.append(", shouldShowLearnMore=");
            sbJ.append(this.f34622k);
            sbJ.append(")");
            return sbJ.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j8, String str2, String str3, boolean z14, boolean z15, boolean z16, boolean z17, bz.d dVar, boolean z18) {
            super(m.DEVICE, null);
            str.getClass();
            this.f34613b = str;
            this.f34614c = j8;
            this.f34615d = str2;
            this.f34616e = str3;
            this.f34617f = z14;
            this.f34618g = z15;
            this.f34619h = z16;
            this.f34620i = z17;
            this.f34621j = dVar;
            this.f34622k = z18;
        }
    }
}
