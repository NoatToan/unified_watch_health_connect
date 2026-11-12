package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ei0.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import rg0.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;", "", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "j", "g", "a", "h", IntegerTokenConverter.CONVERTER_KEY, "b", "d", "c", "f", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$a;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$b;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$c;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$d;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$e;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$f;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$h;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$i;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$j;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$a;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$g;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;", "Lrg0/h0;", "basicProfileData", "", FirebaseAnalytics.Param.LOCATION, "Lei0/u0$a$a;", "inviteType", "<init>", "(Lrg0/h0;Ljava/lang/String;Lei0/u0$a$a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f35065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u0.a.EnumC1362a f35067c;

        static {
            Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0 h0Var, String str, u0.a.EnumC1362a enumC1362a) {
            super(null);
            h0Var.getClass();
            str.getClass();
            enumC1362a.getClass();
            this.f35065a = h0Var;
            this.f35066b = str;
            this.f35067c = enumC1362a;
        }

        @Override // com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public final h0 getF35077a() {
            return this.f35065a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f35065a, aVar.f35065a) && s.g(this.f35066b, aVar.f35066b) && this.f35067c == aVar.f35067c;
        }

        public final int hashCode() {
            return this.f35067c.hashCode() + wr.g.j(this.f35065a.hashCode() * 31, 31, this.f35066b);
        }

        public final String toString() {
            return "AcceptedUser(basicProfileData=" + this.f35065a + ", location=" + this.f35066b + ", inviteType=" + this.f35067c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$b;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35068a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1147104274;
        }

        public final String toString() {
            return "AccountsYouCanViewHeader";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$c;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f35069a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1223744206;
        }

        public final String toString() {
            return "AccountsYouCanViewText";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$d;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$g;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;", "Lrg0/h0;", "basicProfileData", "", FirebaseAnalytics.Param.LOCATION, "", "hasDeclined", "<init>", "(Lrg0/h0;Ljava/lang/String;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f35070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f35072c;

        static {
            Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h0 h0Var, String str, boolean z14) {
            super(null);
            h0Var.getClass();
            str.getClass();
            this.f35070a = h0Var;
            this.f35071b = str;
            this.f35072c = z14;
        }

        @Override // com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public final h0 getF35077a() {
            return this.f35070a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f35070a, dVar.f35070a) && s.g(this.f35071b, dVar.f35071b) && this.f35072c == dVar.f35072c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f35072c) + wr.g.j(this.f35070a.hashCode() * 31, 31, this.f35071b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("IncomingRequest(basicProfileData=");
            sb3.append(this.f35070a);
            sb3.append(", location=");
            sb3.append(this.f35071b);
            sb3.append(", hasDeclined=");
            return hb.a.k(sb3, this.f35072c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$e;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f35073a = new e();

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1616044052;
        }

        public final String toString() {
            return "IntroText";
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$f;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$g;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;", "Lrg0/h0;", "basicProfileData", "", FirebaseAnalytics.Param.LOCATION, "Lei0/u0$a$a;", "inviteType", "<init>", "(Lrg0/h0;Ljava/lang/String;Lei0/u0$a$a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0601f extends f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f35074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u0.a.EnumC1362a f35076c;

        static {
            Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0601f(h0 h0Var, String str, u0.a.EnumC1362a enumC1362a) {
            super(null);
            h0Var.getClass();
            str.getClass();
            enumC1362a.getClass();
            this.f35074a = h0Var;
            this.f35075b = str;
            this.f35076c = enumC1362a;
        }

        @Override // com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public final h0 getF35077a() {
            return this.f35074a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0601f)) {
                return false;
            }
            C0601f c0601f = (C0601f) obj;
            return s.g(this.f35074a, c0601f.f35074a) && s.g(this.f35075b, c0601f.f35075b) && this.f35076c == c0601f.f35076c;
        }

        public final int hashCode() {
            return this.f35076c.hashCode() + wr.g.j(this.f35074a.hashCode() * 31, 31, this.f35075b);
        }

        public final String toString() {
            return "ManagedChildrenMember(basicProfileData=" + this.f35074a + ", location=" + this.f35075b + ", inviteType=" + this.f35076c + ")";
        }
    }

    public interface g {
        /* JADX INFO: renamed from: a */
        h0 getF35077a();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$h;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$g;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;", "Lrg0/h0;", "basicProfileData", "<init>", "(Lrg0/h0;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f35077a;

        static {
            Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(h0 h0Var) {
            super(null);
            h0Var.getClass();
            this.f35077a = h0Var;
        }

        @Override // com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.f.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public final h0 getF35077a() {
            return this.f35077a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && s.g(this.f35077a, ((h) obj).f35077a);
        }

        public final int hashCode() {
            return this.f35077a.hashCode();
        }

        public final String toString() {
            return "YourViewerPending(basicProfileData=" + this.f35077a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$i;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f35078a = new i();

        private i() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 177366186;
        }

        public final String toString() {
            return "YourViewersAddButton";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f$j;", "Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/f;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f35079a = new j();

        private j() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -476178314;
        }

        public final String toString() {
            return "YourViewersHeader";
        }
    }

    public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private f() {
    }
}
