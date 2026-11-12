package com.garmin.android.apps.connectmobile.navigation.more;

import am.x0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import lc.u0;
import m12.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ty0.o;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u001d\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\r\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "", "Lty0/j;", "parent", "item", "<init>", "(Lty0/j;Lty0/j;)V", "l", JWKParameterNames.RSA_EXPONENT, "a", JWKParameterNames.OCT_KEY_VALUE, "f", "j", "d", IntegerTokenConverter.CONVERTER_KEY, "m", "g", "b", "h", "c", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$a;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$b;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$c;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$d;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$e;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$f;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$g;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$h;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$i;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$j;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$k;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$l;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$m;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.j f39396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty0.j f39397b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$a;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lam/x0;", "item", "<init>", "(Lam/x0;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x0 f39398c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0 x0Var) {
            super(ty0.b.K1, x0Var, null);
            x0Var.getClass();
            this.f39398c = x0Var;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39398c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f39398c == ((a) obj).f39398c;
        }

        public final int hashCode() {
            return this.f39398c.hashCode();
        }

        public final String toString() {
            return "ActivityItem(item=" + this.f39398c + ")";
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.navigation.more.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$b;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lty0/j;", "parent", "Lvy0/c;", "item", "<init>", "(Lty0/j;Lvy0/c;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0704b extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ty0.j f39399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final vy0.c f39400d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0704b(ty0.j jVar, vy0.c cVar) {
            super(jVar, cVar, null);
            cVar.getClass();
            this.f39399c = jVar;
            this.f39400d = cVar;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39400d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0704b)) {
                return false;
            }
            C0704b c0704b = (C0704b) obj;
            return s.g(this.f39399c, c0704b.f39399c) && s.g(this.f39400d, c0704b.f39400d);
        }

        public final int hashCode() {
            ty0.j jVar = this.f39399c;
            return this.f39400d.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31);
        }

        public final String toString() {
            return "DeviceNotificationItem(parent=" + this.f39399c + ", item=" + this.f39400d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$c;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lty0/j;", "parent", "Lty0/e;", "item", "<init>", "(Lty0/j;Lty0/e;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ty0.j f39401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ty0.e f39402d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ty0.j jVar, ty0.e eVar) {
            super(jVar, eVar, null);
            eVar.getClass();
            this.f39401c = jVar;
            this.f39402d = eVar;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39402d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f39401c, cVar.f39401c) && this.f39402d == cVar.f39402d;
        }

        public final int hashCode() {
            ty0.j jVar = this.f39401c;
            return this.f39402d.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31);
        }

        public final String toString() {
            return "FriendsItem(parent=" + this.f39401c + ", item=" + this.f39402d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$d;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lty0/j;", "parent", "Lty0/g;", "item", "<init>", "(Lty0/j;Lty0/g;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ty0.j f39403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ty0.g f39404d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ty0.j jVar, ty0.g gVar) {
            super(jVar, gVar, null);
            gVar.getClass();
            this.f39403c = jVar;
            this.f39404d = gVar;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39404d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f39403c, dVar.f39403c) && this.f39404d == dVar.f39404d;
        }

        public final int hashCode() {
            ty0.j jVar = this.f39403c;
            return this.f39404d.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31);
        }

        public final String toString() {
            return "HomeSettings(parent=" + this.f39403c + ", item=" + this.f39404d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$f;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lty0/b;", "item", "Lcom/garmin/android/apps/connectmobile/userprofile/model/g;", "managedAccount", "<init>", "(Lty0/b;Lcom/garmin/android/apps/connectmobile/userprofile/model/g;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ty0.b f39409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.userprofile.model.g f39410d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(ty0.b bVar, com.garmin.android.apps.connectmobile.userprofile.model.g gVar) {
            super(null, bVar, 0 == true ? 1 : 0);
            bVar.getClass();
            gVar.getClass();
            this.f39409c = bVar;
            this.f39410d = gVar;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39409c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f39409c == fVar.f39409c && s.g(this.f39410d, fVar.f39410d);
        }

        public final int hashCode() {
            return this.f39410d.hashCode() + (this.f39409c.hashCode() * 31);
        }

        public final String toString() {
            return "ManagedAccount(item=" + this.f39409c + ", managedAccount=" + this.f39410d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$g;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lty0/j;", "parent", "Lty0/l;", "item", "<init>", "(Lty0/j;Lty0/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ty0.j f39411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ty0.l f39412d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ty0.j jVar, ty0.l lVar) {
            super(jVar, lVar, null);
            lVar.getClass();
            this.f39411c = jVar;
            this.f39412d = lVar;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39412d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return s.g(this.f39411c, gVar.f39411c) && this.f39412d == gVar.f39412d;
        }

        public final int hashCode() {
            ty0.j jVar = this.f39411c;
            return this.f39412d.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31);
        }

        public final String toString() {
            return "NotificationItem(parent=" + this.f39411c + ", item=" + this.f39412d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$h;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lty0/j;", "parent", "Lty0/m;", "item", "<init>", "(Lty0/j;Lty0/m;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ty0.j f39413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ty0.m f39414d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ty0.j jVar, ty0.m mVar) {
            super(jVar, mVar, null);
            mVar.getClass();
            this.f39413c = jVar;
            this.f39414d = mVar;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39414d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return s.g(this.f39413c, hVar.f39413c) && s.g(this.f39414d, hVar.f39414d);
        }

        public final int hashCode() {
            ty0.j jVar = this.f39413c;
            return this.f39414d.f167031a.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31);
        }

        public final String toString() {
            return "PhonePermissionItem(parent=" + this.f39413c + ", item=" + this.f39414d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$i;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lty0/j;", "parent", "Lm12/t;", "item", "<init>", "(Lty0/j;Lm12/t;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ty0.j f39415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t f39416d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ty0.j jVar, t tVar) {
            super(jVar, tVar, null);
            tVar.getClass();
            this.f39415c = jVar;
            this.f39416d = tVar;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39416d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return s.g(this.f39415c, iVar.f39415c) && this.f39416d == iVar.f39416d;
        }

        public final int hashCode() {
            ty0.j jVar = this.f39415c;
            return this.f39416d.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31);
        }

        public final String toString() {
            return "ProfilePrivacyItem(parent=" + this.f39415c + ", item=" + this.f39416d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$j;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lwy0/a;", "item", "<init>", "(Lwy0/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wy0.a f39417c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(wy0.a aVar) {
            super(null, aVar, 0 == true ? 1 : 0);
            aVar.getClass();
            this.f39417c = aVar;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39417c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f39417c == ((j) obj).f39417c;
        }

        public final int hashCode() {
            return this.f39417c.hashCode();
        }

        public final String toString() {
            return "SearchableOnlyItem(item=" + this.f39417c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$l;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lty0/b;", "item", "<init>", "(Lty0/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ty0.b f39421c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(ty0.b bVar) {
            super(null, bVar, 0 == true ? 1 : 0);
            bVar.getClass();
            this.f39421c = bVar;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39421c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f39421c == ((l) obj).f39421c;
        }

        public final int hashCode() {
            return this.f39421c.hashCode();
        }

        public final String toString() {
            return "TopItem(item=" + this.f39421c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$m;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lty0/j;", "parent", "Lty0/o;", "item", "<init>", "(Lty0/j;Lty0/o;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ty0.j f39422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o f39423d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ty0.j jVar, o oVar) {
            super(jVar, oVar, null);
            oVar.getClass();
            this.f39422c = jVar;
            this.f39423d = oVar;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39423d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return s.g(this.f39422c, mVar.f39422c) && this.f39423d == mVar.f39423d;
        }

        public final int hashCode() {
            ty0.j jVar = this.f39422c;
            return this.f39423d.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31);
        }

        public final String toString() {
            return "UserSettings(parent=" + this.f39422c + ", item=" + this.f39423d + ")";
        }
    }

    private b(ty0.j jVar, ty0.j jVar2) {
        this.f39396a = jVar;
        this.f39397b = jVar2;
    }

    public final String a(l22.b bVar) {
        String strB;
        ty0.j f39397b = getF39397b();
        return (f39397b == null || (strB = f39397b.b(bVar)) == null) ? "" : strB;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public ty0.j getF39397b() {
        return this.f39397b;
    }

    public final String c() {
        String f188047a;
        ty0.j f39397b = getF39397b();
        return (f39397b == null || (f188047a = f39397b.getF188047a()) == null) ? "" : f188047a;
    }

    public /* synthetic */ b(ty0.j jVar, ty0.j jVar2, p005kotlin.jvm.internal.j jVar3) {
        this(jVar, jVar2);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$e;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "Lty0/b;", "parent", "item", "", "description", "", "enableNavigation", "<init>", "(Lty0/b;Lty0/b;Ljava/lang/String;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ty0.b f39405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ty0.b f39406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f39407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f39408f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ty0.b bVar, ty0.b bVar2, String str, boolean z14) {
            super(bVar, bVar2, null);
            bVar2.getClass();
            this.f39405c = bVar;
            this.f39406d = bVar2;
            this.f39407e = str;
            this.f39408f = z14;
        }

        @Override // com.garmin.android.apps.connectmobile.navigation.more.b
        /* JADX INFO: renamed from: b */
        public final ty0.j getF39397b() {
            return this.f39406d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f39405c == eVar.f39405c && this.f39406d == eVar.f39406d && s.g(this.f39407e, eVar.f39407e) && this.f39408f == eVar.f39408f;
        }

        public final int hashCode() {
            ty0.b bVar = this.f39405c;
            int iHashCode = (this.f39406d.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31)) * 31;
            String str = this.f39407e;
            return Boolean.hashCode(this.f39408f) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Item(parent=");
            sb3.append(this.f39405c);
            sb3.append(", item=");
            sb3.append(this.f39406d);
            sb3.append(", description=");
            return am.j.n(this.f39407e, ", enableNavigation=", ")", sb3, this.f39408f);
        }

        public /* synthetic */ e(ty0.b bVar, ty0.b bVar2, String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, bVar2, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? true : z14);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/b$k;", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "", "title", "", FirebaseAnalytics.Param.ITEMS, "description", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f39418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<b> f39419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f39420e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(String str, List<? extends b> list, String str2) {
            super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
            str.getClass();
            list.getClass();
            this.f39418c = str;
            this.f39419d = list;
            this.f39420e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return s.g(this.f39418c, kVar.f39418c) && s.g(this.f39419d, kVar.f39419d) && s.g(this.f39420e, kVar.f39420e);
        }

        public final int hashCode() {
            int iB = u0.b(this.f39418c.hashCode() * 31, 31, this.f39419d);
            String str = this.f39420e;
            return iB + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return am.j.o(this.f39420e, ")", l2.g("Section(title=", this.f39418c, ", items=", this.f39419d, ", description="));
        }

        public /* synthetic */ k(String str, List list, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, list, (i14 & 4) != 0 ? null : str2);
        }
    }
}
