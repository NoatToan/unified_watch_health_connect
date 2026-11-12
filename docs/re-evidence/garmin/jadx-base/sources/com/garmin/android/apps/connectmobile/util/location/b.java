package com.garmin.android.apps.connectmobile.util.location;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDICore;
import i3.e5;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/b;", "", "", "deviceId", "", "protobufRequestId", "Lcom/garmin/proto/generated/GDICore$LocationData$DataType;", "gdiLocationDataType", "", "responseSentToDevice", "<init>", "(JILcom/garmin/proto/generated/GDICore$LocationData$DataType;Z)V", "c", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f47275f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GDICore.LocationData.DataType f47278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f47280e;

    public b(long j8, int i14, GDICore.LocationData.DataType dataType, boolean z14) {
        dataType.getClass();
        this.f47276a = j8;
        this.f47277b = i14;
        this.f47278c = dataType;
        this.f47279d = z14;
        this.f47280e = c.C0920c.f47284a;
    }

    public abstract AbstractC0917b a();

    public abstract AbstractC0917b b();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f47278c.getNumber() == ((b) obj).f47278c.getNumber();
    }

    public final int hashCode() {
        return this.f47278c.getNumber();
    }

    public final String toString() {
        String strName = this.f47278c.name();
        String simpleName = this.f47280e.getClass().getSimpleName();
        return hb.a.k(p6.b.i("LocationSubscription(gdiLocationDataType=", strName, ", state=", simpleName, ", responseSentToDevice="), this.f47279d, ")");
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.util.location.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b4\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/b$b;", "", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "subscription", "<init>", "(Lcom/garmin/android/apps/connectmobile/util/location/b;)V", "b", "a", "c", "Lcom/garmin/android/apps/connectmobile/util/location/b$b$a;", "Lcom/garmin/android/apps/connectmobile/util/location/b$b$c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC0917b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f47281a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.util.location.b$b$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/b$b$a;", "Lcom/garmin/android/apps/connectmobile/util/location/b$b;", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "subscription", "<init>", "(Lcom/garmin/android/apps/connectmobile/util/location/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class a extends AbstractC0917b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(bVar, null);
                bVar.getClass();
            }

            @Override // com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b
            public final void a() {
                String simpleName = getClass().getSimpleName();
                b bVar = this.f47281a;
                String strG = e5.g(simpleName, " action invoked, subscription.state = ", bVar.f47280e.getClass().getSimpleName());
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "SubscriptionAction", strG);
                c cVar = bVar.f47280e;
                if (s.g(cVar, c.C0920c.f47284a) || s.g(cVar, c.d.f47285a)) {
                    Boolean boolB = b();
                    if (s.g(boolB, Boolean.TRUE)) {
                        c.a aVar2 = c.a.f47282a;
                        aVar2.getClass();
                        bVar.f47280e = aVar2;
                    } else if (s.g(boolB, Boolean.FALSE)) {
                        c.C0919b c0919b = c.C0919b.f47283a;
                        c0919b.getClass();
                        bVar.f47280e = c0919b;
                    } else if (boolB != null) {
                        u0.r();
                        return;
                    } else {
                        c.d dVar = c.d.f47285a;
                        dVar.getClass();
                        bVar.f47280e = dVar;
                    }
                } else if (!s.g(cVar, c.a.f47282a) && !s.g(cVar, c.C0919b.f47283a)) {
                    u0.r();
                    return;
                }
                i2.a.b(a2Var, "SubscriptionAction", getClass().getSimpleName() + " action finished, subscription.state = " + bVar.f47280e.getClass().getSimpleName());
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.util.location.b$b$c */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/b$b$c;", "Lcom/garmin/android/apps/connectmobile/util/location/b$b;", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "subscription", "<init>", "(Lcom/garmin/android/apps/connectmobile/util/location/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class c extends AbstractC0917b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar) {
                super(bVar, null);
                bVar.getClass();
            }

            @Override // com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b
            public final void a() {
                String simpleName = getClass().getSimpleName();
                b bVar = this.f47281a;
                String strG = e5.g(simpleName, " action invoked, subscription.state = ", bVar.f47280e.getClass().getSimpleName());
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "SubscriptionAction", strG);
                c cVar = bVar.f47280e;
                c.C0920c c0920c = c.C0920c.f47284a;
                if (!s.g(cVar, c0920c) && !s.g(cVar, c.d.f47285a)) {
                    c.C0919b c0919b = c.C0919b.f47283a;
                    if (!s.g(cVar, c0919b)) {
                        if (!s.g(cVar, c.a.f47282a)) {
                            u0.r();
                            return;
                        }
                        Boolean boolB = b();
                        if (s.g(boolB, Boolean.TRUE)) {
                            c0920c.getClass();
                            bVar.f47280e = c0920c;
                        } else if (!s.g(boolB, Boolean.FALSE) && boolB != null) {
                            u0.r();
                            return;
                        } else {
                            c0919b.getClass();
                            bVar.f47280e = c0919b;
                        }
                    }
                }
                i2.a.b(a2Var, "SubscriptionAction", getClass().getSimpleName() + " action finished, subscription.state = " + bVar.f47280e.getClass().getSimpleName());
            }
        }

        static {
            new C0918b(null);
        }

        private AbstractC0917b(b bVar) {
            this.f47281a = bVar;
        }

        public abstract void a();

        public abstract Boolean b();

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.util.location.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/b$b$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0918b {
            public /* synthetic */ C0918b(j jVar) {
                this();
            }

            private C0918b() {
            }
        }

        public /* synthetic */ AbstractC0917b(b bVar, j jVar) {
            this(bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b4\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/b$c;", "", "<init>", "()V", "c", "a", "d", "b", "Lcom/garmin/android/apps/connectmobile/util/location/b$c$a;", "Lcom/garmin/android/apps/connectmobile/util/location/b$c$b;", "Lcom/garmin/android/apps/connectmobile/util/location/b$c$c;", "Lcom/garmin/android/apps/connectmobile/util/location/b$c$d;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/b$c$a;", "Lcom/garmin/android/apps/connectmobile/util/location/b$c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f47282a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.util.location.b$c$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/b$c$b;", "Lcom/garmin/android/apps/connectmobile/util/location/b$c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0919b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0919b f47283a = new C0919b();

            private C0919b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.util.location.b$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/b$c$c;", "Lcom/garmin/android/apps/connectmobile/util/location/b$c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0920c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0920c f47284a = new C0920c();

            private C0920c() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/b$c$d;", "Lcom/garmin/android/apps/connectmobile/util/location/b$c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f47285a = new d();

            private d() {
                super(null);
            }
        }

        public /* synthetic */ c(j jVar) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ b(long j8, int i14, GDICore.LocationData.DataType dataType, boolean z14, int i15, j jVar) {
        this(j8, i14, dataType, (i15 & 8) != 0 ? false : z14);
    }
}
