package com.garmin.android.apps.connectmobile.navigation.more;

import i63.h;
import m63.k1;
import m63.u1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vv0.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0004\n\u000b\f\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute;", "", "<init>", "()V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm63/u1;)V", "Companion", "MoreScreen", "BaseFeatureScreen", "SettingsScreen", "Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute$BaseFeatureScreen;", "Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute$MoreScreen;", "Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute$SettingsScreen;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public abstract class MoreNavigationRoute {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f39384a = m.a(n.PUBLICATION, new u(12));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute$MoreScreen;", "Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class MoreScreen extends MoreNavigationRoute {
        public static final MoreScreen INSTANCE = new MoreScreen();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f39388b = m.a(n.PUBLICATION, new u(13));

        private MoreScreen() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MoreScreen);
        }

        public final int hashCode() {
            return -542984154;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<MoreScreen> serializer() {
            return (i63.c) f39388b.getValue();
        }

        public final String toString() {
            return "MoreScreen";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute$SettingsScreen;", "Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class SettingsScreen extends MoreNavigationRoute {
        public static final SettingsScreen INSTANCE = new SettingsScreen();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f39389b = m.a(n.PUBLICATION, new u(14));

        private SettingsScreen() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SettingsScreen);
        }

        public final int hashCode() {
            return -796238860;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<SettingsScreen> serializer() {
            return (i63.c) f39389b.getValue();
        }

        public final String toString() {
            return "SettingsScreen";
        }
    }

    public /* synthetic */ MoreNavigationRoute(j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute$BaseFeatureScreen;", "Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute;", "", "featureNavigationItemKey", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm63/u1;)V", "Companion", "$serializer", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class BaseFeatureScreen extends MoreNavigationRoute {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39385b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BaseFeatureScreen(int i14, String str, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, MoreNavigationRoute$BaseFeatureScreen$$serializer.f39386a.getF158591b());
                throw null;
            }
            this.f39385b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BaseFeatureScreen) && s.g(this.f39385b, ((BaseFeatureScreen) obj).f39385b);
        }

        public final int hashCode() {
            return this.f39385b.hashCode();
        }

        public final String toString() {
            return am.j.m("BaseFeatureScreen(featureNavigationItemKey=", this.f39385b, ")");
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute$BaseFeatureScreen$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute$BaseFeatureScreen;", "serializer", "()Li63/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<BaseFeatureScreen> serializer() {
                return MoreNavigationRoute$BaseFeatureScreen$$serializer.f39386a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseFeatureScreen(String str) {
            super(null);
            str.getClass();
            this.f39385b = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute;", "serializer", "()Li63/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39387a;

            static {
                int[] iArr = new int[ty0.b.values().length];
                try {
                    iArr[ty0.b.f166892l3.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ty0.b.J2.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f39387a = iArr;
            }
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static MoreNavigationRoute a(ty0.b bVar) {
            bVar.getClass();
            int i14 = WhenMappings.f39387a[bVar.ordinal()];
            if (i14 != 1) {
                return i14 != 2 ? new BaseFeatureScreen(bVar.f166935a) : SettingsScreen.INSTANCE;
            }
            return MoreScreen.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<MoreNavigationRoute> serializer() {
            return (i63.c) MoreNavigationRoute.f39384a.getValue();
        }

        private Companion() {
        }
    }

    private MoreNavigationRoute() {
    }

    public /* synthetic */ MoreNavigationRoute(int i14, u1 u1Var) {
    }
}
