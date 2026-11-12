package bv0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@i63.h
public interface a extends sc.j, Parcelable {
    public static final d Companion = d.f21248a;

    /* JADX INFO: renamed from: bv0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$a;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class C0300a implements a, Parcelable {
        public static final C0300a INSTANCE = new C0300a();
        public static final Parcelable.Creator<C0300a> CREATOR = new C0301a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21241a = o13.m.a(o13.n.PUBLICATION, new bm.y(16));

        /* JADX INFO: renamed from: bv0.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0301a implements Parcelable.Creator<C0300a> {
            @Override // android.os.Parcelable.Creator
            public final C0300a createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return C0300a.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final C0300a[] newArray(int i14) {
                return new C0300a[i14];
            }
        }

        private C0300a() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0300a);
        }

        public final int hashCode() {
            return 709555006;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<C0300a> serializer() {
            return (i63.c) f21241a.getValue();
        }

        public final String toString() {
            return "ActiveSessionPrivacy";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$a0;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class a0 implements a, Parcelable {
        public static final a0 INSTANCE = new a0();
        public static final Parcelable.Creator<a0> CREATOR = new C0302a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21242a = o13.m.a(o13.n.PUBLICATION, new bv0.b(7));

        /* JADX INFO: renamed from: bv0.a$a0$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0302a implements Parcelable.Creator<a0> {
            @Override // android.os.Parcelable.Creator
            public final a0 createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return a0.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final a0[] newArray(int i14) {
                return new a0[i14];
            }
        }

        private a0() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a0);
        }

        public final int hashCode() {
            return -2143901224;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<a0> serializer() {
            return (i63.c) f21242a.getValue();
        }

        public final String toString() {
            return "StravaBeaconSetup";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$b;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b implements a, Parcelable {
        public static final b INSTANCE = new b();
        public static final Parcelable.Creator<b> CREATOR = new C0303a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21243a = o13.m.a(o13.n.PUBLICATION, new bm.y(17));

        /* JADX INFO: renamed from: bv0.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0303a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return b.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        private b() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1258545094;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<b> serializer() {
            return (i63.c) f21243a.getValue();
        }

        public final String toString() {
            return "AdministratorRequired";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$d;", "", "<init>", "()V", "Li63/c;", "Lbv0/a;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ d f21248a = new d();

        private d() {
        }

        public final i63.c<a> serializer() {
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            return new i63.g("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination", t0Var.b(a.class), new k23.d[]{t0Var.b(C0300a.class), t0Var.b(b.class), t0Var.b(c.class), t0Var.b(e.class), t0Var.b(f.class), t0Var.b(g.class), t0Var.b(h.class), t0Var.b(i.class), t0Var.b(j.class), t0Var.b(k.class), t0Var.b(l.class), t0Var.b(m.class), t0Var.b(n.class), t0Var.b(o.class), t0Var.b(p.class), t0Var.b(q.class), t0Var.b(r.class), t0Var.b(s.class), t0Var.b(t.class), t0Var.b(u.class), t0Var.b(v.class), t0Var.b(w.class), t0Var.b(x.class), t0Var.b(y.class), t0Var.b(z.class), t0Var.b(a0.class)}, new i63.c[]{new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.ActiveSessionPrivacy", C0300a.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.AdministratorRequired", b.INSTANCE, new Annotation[0]), c.C0304a.f21247a, new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.ConnectionsReadOnly", e.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.Consent", f.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.DataUnavailable", g.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.DevicesUnavailable", h.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.EmailContactsSetup", i.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.ExtendLiveTrackSetup", j.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.Genesis", k.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.GroupTrack", l.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.GroupTrackFriends", m.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.GroupTrackSetup", n.INSTANCE, new Annotation[0]), o.C0316a.f21261a, new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.Main", p.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.ManagedAccountSharingSettings", q.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.PastSessionsPrivacy", r.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.ProfileAndPrivacy", s.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.Recipients", t.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.SavedSessionPrivacy", u.INSTANCE, new Annotation[0]), v.C0323a.f21269a, w.C0324a.f21271a, new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.SessionName", x.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.SharingOptions", y.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.SharingOptionsSetup", z.INSTANCE, new Annotation[0]), new m63.f1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.StravaBeaconSetup", a0.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$e;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class e implements a, Parcelable {
        public static final e INSTANCE = new e();
        public static final Parcelable.Creator<e> CREATOR = new C0306a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21249a = o13.m.a(o13.n.PUBLICATION, new bm.y(18));

        /* JADX INFO: renamed from: bv0.a$e$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0306a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return e.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i14) {
                return new e[i14];
            }
        }

        private e() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1769947247;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<e> serializer() {
            return (i63.c) f21249a.getValue();
        }

        public final String toString() {
            return "ConnectionsReadOnly";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$f;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class f implements a, Parcelable {
        public static final f INSTANCE = new f();
        public static final Parcelable.Creator<f> CREATOR = new C0307a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21250a = o13.m.a(o13.n.PUBLICATION, new bm.y(19));

        /* JADX INFO: renamed from: bv0.a$f$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0307a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return f.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i14) {
                return new f[i14];
            }
        }

        private f() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1671071788;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<f> serializer() {
            return (i63.c) f21250a.getValue();
        }

        public final String toString() {
            return "Consent";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$g;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class g implements a, Parcelable {
        public static final g INSTANCE = new g();
        public static final Parcelable.Creator<g> CREATOR = new C0308a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21251a = o13.m.a(o13.n.PUBLICATION, new bm.y(20));

        /* JADX INFO: renamed from: bv0.a$g$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0308a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return g.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i14) {
                return new g[i14];
            }
        }

        private g() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1659723776;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<g> serializer() {
            return (i63.c) f21251a.getValue();
        }

        public final String toString() {
            return "DataUnavailable";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$h;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class h implements a, Parcelable {
        public static final h INSTANCE = new h();
        public static final Parcelable.Creator<h> CREATOR = new C0309a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21252a = o13.m.a(o13.n.PUBLICATION, new bm.y(21));

        /* JADX INFO: renamed from: bv0.a$h$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0309a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return h.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i14) {
                return new h[i14];
            }
        }

        private h() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1260005177;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<h> serializer() {
            return (i63.c) f21252a.getValue();
        }

        public final String toString() {
            return "DevicesUnavailable";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$i;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class i implements a, Parcelable {
        public static final i INSTANCE = new i();
        public static final Parcelable.Creator<i> CREATOR = new C0310a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21253a = o13.m.a(o13.n.PUBLICATION, new bm.y(22));

        /* JADX INFO: renamed from: bv0.a$i$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0310a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public final i createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return i.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final i[] newArray(int i14) {
                return new i[i14];
            }
        }

        private i() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1010640972;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<i> serializer() {
            return (i63.c) f21253a.getValue();
        }

        public final String toString() {
            return "EmailContactsSetup";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$j;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class j implements a, Parcelable {
        public static final j INSTANCE = new j();
        public static final Parcelable.Creator<j> CREATOR = new C0311a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21254a = o13.m.a(o13.n.PUBLICATION, new bm.y(23));

        /* JADX INFO: renamed from: bv0.a$j$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0311a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            public final j createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return j.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final j[] newArray(int i14) {
                return new j[i14];
            }
        }

        private j() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -897056194;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<j> serializer() {
            return (i63.c) f21254a.getValue();
        }

        public final String toString() {
            return "ExtendLiveTrackSetup";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$k;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class k implements a, Parcelable {
        public static final k INSTANCE = new k();
        public static final Parcelable.Creator<k> CREATOR = new C0312a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21255a = o13.m.a(o13.n.PUBLICATION, new bm.y(24));

        /* JADX INFO: renamed from: bv0.a$k$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0312a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public final k createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return k.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final k[] newArray(int i14) {
                return new k[i14];
            }
        }

        private k() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1592247650;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<k> serializer() {
            return (i63.c) f21255a.getValue();
        }

        public final String toString() {
            return "Genesis";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$l;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class l implements a, Parcelable {
        public static final l INSTANCE = new l();
        public static final Parcelable.Creator<l> CREATOR = new C0313a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21256a = o13.m.a(o13.n.PUBLICATION, new bm.y(25));

        /* JADX INFO: renamed from: bv0.a$l$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0313a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return l.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i14) {
                return new l[i14];
            }
        }

        private l() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1961605138;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<l> serializer() {
            return (i63.c) f21256a.getValue();
        }

        public final String toString() {
            return "GroupTrack";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$m;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class m implements a, Parcelable {
        public static final m INSTANCE = new m();
        public static final Parcelable.Creator<m> CREATOR = new C0314a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21257a = o13.m.a(o13.n.PUBLICATION, new bm.y(26));

        /* JADX INFO: renamed from: bv0.a$m$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0314a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            public final m createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return m.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final m[] newArray(int i14) {
                return new m[i14];
            }
        }

        private m() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1572974301;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<m> serializer() {
            return (i63.c) f21257a.getValue();
        }

        public final String toString() {
            return "GroupTrackFriends";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$n;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class n implements a, Parcelable {
        public static final n INSTANCE = new n();
        public static final Parcelable.Creator<n> CREATOR = new C0315a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21258a = o13.m.a(o13.n.PUBLICATION, new bm.y(27));

        /* JADX INFO: renamed from: bv0.a$n$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0315a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            public final n createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return n.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final n[] newArray(int i14) {
                return new n[i14];
            }
        }

        private n() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 85970315;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<n> serializer() {
            return (i63.c) f21258a.getValue();
        }

        public final String toString() {
            return "GroupTrackSetup";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$p;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class p implements a, Parcelable {
        public static final p INSTANCE = new p();
        public static final Parcelable.Creator<p> CREATOR = new C0317a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21262a = o13.m.a(o13.n.PUBLICATION, new bm.y(28));

        /* JADX INFO: renamed from: bv0.a$p$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0317a implements Parcelable.Creator<p> {
            @Override // android.os.Parcelable.Creator
            public final p createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return p.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final p[] newArray(int i14) {
                return new p[i14];
            }
        }

        private p() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -2134640577;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<p> serializer() {
            return (i63.c) f21262a.getValue();
        }

        public final String toString() {
            return "Main";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$q;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class q implements a, Parcelable {
        public static final q INSTANCE = new q();
        public static final Parcelable.Creator<q> CREATOR = new C0318a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21263a = o13.m.a(o13.n.PUBLICATION, new bm.y(29));

        /* JADX INFO: renamed from: bv0.a$q$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0318a implements Parcelable.Creator<q> {
            @Override // android.os.Parcelable.Creator
            public final q createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return q.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final q[] newArray(int i14) {
                return new q[i14];
            }
        }

        private q() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -1540694549;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<q> serializer() {
            return (i63.c) f21263a.getValue();
        }

        public final String toString() {
            return "ManagedAccountSharingSettings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$r;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class r implements a, Parcelable {
        public static final r INSTANCE = new r();
        public static final Parcelable.Creator<r> CREATOR = new C0319a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21264a = o13.m.a(o13.n.PUBLICATION, new bv0.b(0));

        /* JADX INFO: renamed from: bv0.a$r$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0319a implements Parcelable.Creator<r> {
            @Override // android.os.Parcelable.Creator
            public final r createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return r.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final r[] newArray(int i14) {
                return new r[i14];
            }
        }

        private r() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -1313157517;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<r> serializer() {
            return (i63.c) f21264a.getValue();
        }

        public final String toString() {
            return "PastSessionsPrivacy";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$s;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class s implements a, Parcelable {
        public static final s INSTANCE = new s();
        public static final Parcelable.Creator<s> CREATOR = new C0320a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21265a = o13.m.a(o13.n.PUBLICATION, new bv0.b(1));

        /* JADX INFO: renamed from: bv0.a$s$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0320a implements Parcelable.Creator<s> {
            @Override // android.os.Parcelable.Creator
            public final s createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return s.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final s[] newArray(int i14) {
                return new s[i14];
            }
        }

        private s() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -280113292;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<s> serializer() {
            return (i63.c) f21265a.getValue();
        }

        public final String toString() {
            return "ProfileAndPrivacy";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$t;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class t implements a, Parcelable {
        public static final t INSTANCE = new t();
        public static final Parcelable.Creator<t> CREATOR = new C0321a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21266a = o13.m.a(o13.n.PUBLICATION, new bv0.b(2));

        /* JADX INFO: renamed from: bv0.a$t$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0321a implements Parcelable.Creator<t> {
            @Override // android.os.Parcelable.Creator
            public final t createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return t.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final t[] newArray(int i14) {
                return new t[i14];
            }
        }

        private t() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 342050688;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<t> serializer() {
            return (i63.c) f21266a.getValue();
        }

        public final String toString() {
            return "Recipients";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$u;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class u implements a, Parcelable {
        public static final u INSTANCE = new u();
        public static final Parcelable.Creator<u> CREATOR = new C0322a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21267a = o13.m.a(o13.n.PUBLICATION, new bv0.b(3));

        /* JADX INFO: renamed from: bv0.a$u$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0322a implements Parcelable.Creator<u> {
            @Override // android.os.Parcelable.Creator
            public final u createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return u.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final u[] newArray(int i14) {
                return new u[i14];
            }
        }

        private u() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return -2079328461;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<u> serializer() {
            return (i63.c) f21267a.getValue();
        }

        public final String toString() {
            return "SavedSessionPrivacy";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$x;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class x implements a, Parcelable {
        public static final x INSTANCE = new x();
        public static final Parcelable.Creator<x> CREATOR = new C0325a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21272a = o13.m.a(o13.n.PUBLICATION, new bv0.b(4));

        /* JADX INFO: renamed from: bv0.a$x$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0325a implements Parcelable.Creator<x> {
            @Override // android.os.Parcelable.Creator
            public final x createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return x.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final x[] newArray(int i14) {
                return new x[i14];
            }
        }

        private x() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return -128024325;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<x> serializer() {
            return (i63.c) f21272a.getValue();
        }

        public final String toString() {
            return "SessionName";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$y;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class y implements a, Parcelable {
        public static final y INSTANCE = new y();
        public static final Parcelable.Creator<y> CREATOR = new C0326a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21273a = o13.m.a(o13.n.PUBLICATION, new bv0.b(5));

        /* JADX INFO: renamed from: bv0.a$y$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0326a implements Parcelable.Creator<y> {
            @Override // android.os.Parcelable.Creator
            public final y createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return y.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final y[] newArray(int i14) {
                return new y[i14];
            }
        }

        private y() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return -1927102168;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<y> serializer() {
            return (i63.c) f21273a.getValue();
        }

        public final String toString() {
            return "SharingOptions";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$z;", "Lbv0/a;", "Landroid/os/Parcelable;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class z implements a, Parcelable {
        public static final z INSTANCE = new z();
        public static final Parcelable.Creator<z> CREATOR = new C0327a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f21274a = o13.m.a(o13.n.PUBLICATION, new bv0.b(6));

        /* JADX INFO: renamed from: bv0.a$z$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0327a implements Parcelable.Creator<z> {
            @Override // android.os.Parcelable.Creator
            public final z createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return z.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final z[] newArray(int i14) {
                return new z[i14];
            }
        }

        private z() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return -126811595;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<z> serializer() {
            return (i63.c) f21274a.getValue();
        }

        public final String toString() {
            return "SharingOptionsSetup";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0002\u0011\u0012B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB9\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lbv0/a$c;", "Lbv0/a;", "Landroid/os/Parcelable;", "", "recipientId", "", "recipientContactMethodId", "", "hasPremiumLiveTrack", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Lm63/u1;)V", "Companion", "a", "b", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c implements a, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f21245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f21246c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<c> CREATOR = new C0305c();

        /* JADX INFO: renamed from: bv0.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/livetrackui/presentation/navigation/LiveTrackDestination.ChangeRecipientContactMethod.$serializer", "Lm63/e0;", "Lbv0/a$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C0304a implements m63.e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0304a f21247a;
            private static final k63.e descriptor;

            static {
                C0304a c0304a = new C0304a();
                f21247a = c0304a;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.ChangeRecipientContactMethod", c0304a, 3);
                m1Var.j("recipientId", false);
                m1Var.j("recipientContactMethodId", true);
                m1Var.j("hasPremiumLiveTrack", true);
                descriptor = m1Var;
            }

            private C0304a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.y1.f117048a, j63.a.d(m63.v0.f117027a), j63.a.d(m63.g.f116948a)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                Long l14 = null;
                Boolean bool = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        l14 = (Long) cVarC.v(eVar2, 1, m63.v0.f117027a, l14);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        bool = (Boolean) cVarC.v(eVar2, 2, m63.g.f116948a, bool);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new c(i15, strR, l14, bool, (m63.u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF116202c() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                String str = cVar.f21244a;
                Boolean bool = cVar.f21246c;
                Long l14 = cVar.f21245b;
                dVarC.k(eVar, 0, str);
                if (dVarC.C(eVar) || l14 != null) {
                    dVarC.d(eVar, 1, m63.v0.f117027a, l14);
                }
                if (dVarC.C(eVar) || bool != null) {
                    dVarC.d(eVar, 2, m63.g.f116948a, bool);
                }
                dVarC.b(eVar);
            }
        }

        /* JADX INFO: renamed from: bv0.a$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0305c implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                String string = parcel.readString();
                Boolean boolValueOf = null;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new c(string, lValueOf, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public /* synthetic */ c(int i14, String str, Long l14, Boolean bool, m63.u1 u1Var) {
            if (1 != (i14 & 1)) {
                m63.k1.h(i14, 1, C0304a.f21247a.getF116202c());
                throw null;
            }
            this.f21244a = str;
            if ((i14 & 2) == 0) {
                this.f21245b = null;
            } else {
                this.f21245b = l14;
            }
            if ((i14 & 4) == 0) {
                this.f21246c = null;
            } else {
                this.f21246c = bool;
            }
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
            return p005kotlin.jvm.internal.s.g(this.f21244a, cVar.f21244a) && p005kotlin.jvm.internal.s.g(this.f21245b, cVar.f21245b) && p005kotlin.jvm.internal.s.g(this.f21246c, cVar.f21246c);
        }

        public final int hashCode() {
            int iHashCode = this.f21244a.hashCode() * 31;
            Long l14 = this.f21245b;
            int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
            Boolean bool = this.f21246c;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ChangeRecipientContactMethod(recipientId=");
            sb3.append(this.f21244a);
            sb3.append(", recipientContactMethodId=");
            sb3.append(this.f21245b);
            sb3.append(", hasPremiumLiveTrack=");
            return p6.b.f(sb3, this.f21246c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f21244a);
            Long l14 = this.f21245b;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                sn.a.n(parcel, 1, l14);
            }
            Boolean bool = this.f21246c;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                tn.k.m(parcel, 1, bool);
            }
        }

        /* JADX INFO: renamed from: bv0.a$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$c$b;", "", "<init>", "()V", "Li63/c;", "Lbv0/a$c;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return C0304a.f21247a;
            }

            private Companion() {
            }
        }

        public c(String str, Long l14, Boolean bool) {
            str.getClass();
            this.f21244a = str;
            this.f21245b = l14;
            this.f21246c = bool;
        }

        public /* synthetic */ c(String str, Long l14, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0002\u000f\u0010B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB-\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lbv0/a$o;", "Lbv0/a;", "Landroid/os/Parcelable;", "", "recipientId", "", "resend", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLm63/u1;)V", "Companion", "a", "b", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class o implements a, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21260b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<o> CREATOR = new c();

        /* JADX INFO: renamed from: bv0.a$o$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/livetrackui/presentation/navigation/LiveTrackDestination.InviteToMessenger.$serializer", "Lm63/e0;", "Lbv0/a$o;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C0316a implements m63.e0<o> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0316a f21261a;
            private static final k63.e descriptor;

            static {
                C0316a c0316a = new C0316a();
                f21261a = c0316a;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.InviteToMessenger", c0316a, 2);
                m1Var.j("recipientId", false);
                m1Var.j("resend", true);
                descriptor = m1Var;
            }

            private C0316a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.y1.f117048a, m63.g.f116948a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                String strR = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG = cVarC.g(eVar2, 1);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new o(i15, strR, zG, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF116202c() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                o oVar = (o) obj;
                oVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                String str = oVar.f21259a;
                boolean z14 = oVar.f21260b;
                dVarC.k(eVar, 0, str);
                if (dVarC.C(eVar) || z14) {
                    dVarC.n(eVar, 1, z14);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<o> {
            @Override // android.os.Parcelable.Creator
            public final o createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new o(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final o[] newArray(int i14) {
                return new o[i14];
            }
        }

        public /* synthetic */ o(int i14, String str, boolean z14, m63.u1 u1Var) {
            if (1 != (i14 & 1)) {
                m63.k1.h(i14, 1, C0316a.f21261a.getF116202c());
                throw null;
            }
            this.f21259a = str;
            if ((i14 & 2) == 0) {
                this.f21260b = false;
            } else {
                this.f21260b = z14;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return p005kotlin.jvm.internal.s.g(this.f21259a, oVar.f21259a) && this.f21260b == oVar.f21260b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f21260b) + (this.f21259a.hashCode() * 31);
        }

        public final String toString() {
            return n23.j.g("InviteToMessenger(recipientId=", this.f21259a, ", resend=", this.f21260b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f21259a);
            parcel.writeInt(this.f21260b ? 1 : 0);
        }

        /* JADX INFO: renamed from: bv0.a$o$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$o$b;", "", "<init>", "()V", "Li63/c;", "Lbv0/a$o;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<o> serializer() {
                return C0316a.f21261a;
            }

            private Companion() {
            }
        }

        public o(String str, boolean z14) {
            str.getClass();
            this.f21259a = str;
            this.f21260b = z14;
        }

        public /* synthetic */ o(String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lbv0/a$v;", "Lbv0/a;", "Landroid/os/Parcelable;", "", "contactId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class v implements a, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21268a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<v> CREATOR = new c();

        /* JADX INFO: renamed from: bv0.a$v$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/livetrackui/presentation/navigation/LiveTrackDestination.SelectContactMethod.$serializer", "Lm63/e0;", "Lbv0/a$v;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C0323a implements m63.e0<v> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0323a f21269a;
            private static final k63.e descriptor;

            static {
                C0323a c0323a = new C0323a();
                f21269a = c0323a;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.SelectContactMethod", c0323a, 1);
                m1Var.j("contactId", false);
                descriptor = m1Var;
            }

            private C0323a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.y1.f117048a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                m63.u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        strR = cVarC.r(eVar2, 0);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new v(i15, strR, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF116202c() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                v vVar = (v) obj;
                vVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, vVar.f21268a);
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<v> {
            @Override // android.os.Parcelable.Creator
            public final v createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new v(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final v[] newArray(int i14) {
                return new v[i14];
            }
        }

        public /* synthetic */ v(int i14, String str, m63.u1 u1Var) {
            if (1 == (i14 & 1)) {
                this.f21268a = str;
            } else {
                m63.k1.h(i14, 1, C0323a.f21269a.getF116202c());
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && p005kotlin.jvm.internal.s.g(this.f21268a, ((v) obj).f21268a);
        }

        public final int hashCode() {
            return this.f21268a.hashCode();
        }

        public final String toString() {
            return am.j.m("SelectContactMethod(contactId=", this.f21268a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f21268a);
        }

        /* JADX INFO: renamed from: bv0.a$v$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$v$b;", "", "<init>", "()V", "Li63/c;", "Lbv0/a$v;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<v> serializer() {
                return C0323a.f21269a;
            }

            private Companion() {
            }
        }

        public v(String str) {
            str.getClass();
            this.f21268a = str;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B#\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lbv0/a$w;", "Lbv0/a;", "Landroid/os/Parcelable;", "", "deviceId", "<init>", "(J)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLm63/u1;)V", "Companion", "a", "b", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class w implements a, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21270a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<w> CREATOR = new c();

        /* JADX INFO: renamed from: bv0.a$w$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/livetrackui/presentation/navigation/LiveTrackDestination.SessionDetails.$serializer", "Lm63/e0;", "Lbv0/a$w;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C0324a implements m63.e0<w> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0324a f21271a;
            private static final k63.e descriptor;

            static {
                C0324a c0324a = new C0324a();
                f21271a = c0324a;
                m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.livetrackui.presentation.navigation.LiveTrackDestination.SessionDetails", c0324a, 1);
                m1Var.j("deviceId", true);
                descriptor = m1Var;
            }

            private C0324a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{m63.v0.f117027a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                long jW = 0;
                boolean z14 = true;
                int i15 = 0;
                while (true) {
                    m63.u1 u1Var = null;
                    if (!z14) {
                        cVarC.b(eVar2);
                        return new w(i15, jW, u1Var);
                    }
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        jW = cVarC.w(eVar2, 0);
                        i15 = 1;
                    }
                }
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF116202c() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                w wVar = (w) obj;
                wVar.getClass();
                long j8 = wVar.f21270a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || j8 != -1) {
                    dVarC.z(eVar, 0, j8);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<w> {
            @Override // android.os.Parcelable.Creator
            public final w createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new w(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final w[] newArray(int i14) {
                return new w[i14];
            }
        }

        public /* synthetic */ w(int i14, long j8, m63.u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f21270a = -1L;
            } else {
                this.f21270a = j8;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f21270a == ((w) obj).f21270a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f21270a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f21270a, "SessionDetails(deviceId=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeLong(this.f21270a);
        }

        /* JADX INFO: renamed from: bv0.a$w$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbv0/a$w$b;", "", "<init>", "()V", "Li63/c;", "Lbv0/a$w;", "serializer", "()Li63/c;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<w> serializer() {
                return C0324a.f21271a;
            }

            private Companion() {
            }
        }

        public w() {
            this(0L, 1, (p005kotlin.jvm.internal.j) null);
        }

        public w(long j8) {
            this.f21270a = j8;
        }

        public /* synthetic */ w(long j8, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? -1L : j8);
        }
    }
}
