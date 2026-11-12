package com.garmin.android.apps.connectmobile.connectiq;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/y;", "", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "d", "b", "a", "c", "Lcom/garmin/android/apps/connectmobile/connectiq/y$a;", "Lcom/garmin/android/apps/connectmobile/connectiq/y$b;", "Lcom/garmin/android/apps/connectmobile/connectiq/y$c;", "Lcom/garmin/android/apps/connectmobile/connectiq/y$d;", "Lcom/garmin/android/apps/connectmobile/connectiq/y$e;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class y {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/y$b;", "Lcom/garmin/android/apps/connectmobile/connectiq/y;", "", "noDataText", "<init>", "(I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f32098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f32099c;

        public b(int i14) {
            super(null);
            this.f32097a = i14;
            long j8 = i14;
            this.f32098b = j8;
            this.f32099c = j8;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.y
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF32108c() {
            return this.f32099c;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.y
        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getF32107b() {
            return this.f32098b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f32097a == ((b) obj).f32097a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f32097a);
        }

        public final String toString() {
            return v.e0.f(this.f32097a, "NoData(noDataText=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/y$c;", "Lcom/garmin/android/apps/connectmobile/connectiq/y;", "", "message", "<init>", "(I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f32101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f32102c;

        public c(int i14) {
            super(null);
            this.f32100a = i14;
            long j8 = i14;
            this.f32101b = j8;
            this.f32102c = j8;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.y
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF32108c() {
            return this.f32102c;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.y
        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getF32107b() {
            return this.f32101b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f32100a == ((c) obj).f32100a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f32100a);
        }

        public final String toString() {
            return v.e0.f(this.f32100a, "SectionButton(message=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/y$d;", "Lcom/garmin/android/apps/connectmobile/connectiq/y;", "", "headerText", "<init>", "(I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f32104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f32105c;

        public d(int i14) {
            super(null);
            this.f32103a = i14;
            long j8 = i14;
            this.f32104b = j8;
            this.f32105c = j8;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.y
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF32108c() {
            return this.f32105c;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.y
        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getF32107b() {
            return this.f32104b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f32103a == ((d) obj).f32103a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f32103a);
        }

        public final String toString() {
            return v.e0.f(this.f32103a, "SectionHeader(headerText=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/y$e;", "Lcom/garmin/android/apps/connectmobile/connectiq/y;", "", "headerText", "<init>", "(I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f32107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f32108c;

        public e(int i14) {
            super(null);
            this.f32106a = i14;
            long j8 = i14;
            this.f32107b = j8;
            this.f32108c = j8;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.y
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF32108c() {
            return this.f32108c;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.y
        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getF32107b() {
            return this.f32107b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f32106a == ((e) obj).f32106a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f32106a);
        }

        public final String toString() {
            return v.e0.f(this.f32106a, "TopSectionHeader(headerText=", ")");
        }
    }

    public /* synthetic */ y(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract long getF32108c();

    /* JADX INFO: renamed from: b */
    public abstract long getF32107b();

    private y() {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/y$a;", "Lcom/garmin/android/apps/connectmobile/connectiq/y;", "Lo10/b;", "ciqItem", "Lcom/garmin/android/apps/connectmobile/connectiq/b;", "ciqItemAction", "", "supportDetails", "<init>", "(Lo10/b;Lcom/garmin/android/apps/connectmobile/connectiq/b;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o10.b f32092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.connectiq.b f32093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f32094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f32095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f32096e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o10.b bVar, com.garmin.android.apps.connectmobile.connectiq.b bVar2, boolean z14) {
            super(null);
            bVar.getClass();
            bVar2.getClass();
            this.f32092a = bVar;
            this.f32093b = bVar2;
            this.f32094c = z14;
            String str = bVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String();
            this.f32095d = str != null ? str.hashCode() : 0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(bVar);
            sb3.append(bVar2);
            this.f32096e = sb3.toString().hashCode();
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.y
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF32108c() {
            return this.f32096e;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.y
        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getF32107b() {
            return this.f32095d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f32092a, aVar.f32092a) && this.f32093b == aVar.f32093b && this.f32094c == aVar.f32094c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f32094c) + ((this.f32093b.hashCode() + (this.f32092a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("CIQItem(ciqItem=");
            sb3.append(this.f32092a);
            sb3.append(", ciqItemAction=");
            sb3.append(this.f32093b);
            sb3.append(", supportDetails=");
            return hb.a.k(sb3, this.f32094c, ")");
        }

        public /* synthetic */ a(o10.b bVar, com.garmin.android.apps.connectmobile.connectiq.b bVar2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, bVar2, (i14 & 4) != 0 ? true : z14);
        }
    }
}
