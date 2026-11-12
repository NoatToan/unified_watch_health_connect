package am;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lam/l;", "", "", "theOrdinal", "", Action.KEY_ATTRIBUTE, TtmlNode.ATTR_ID, "hintResourceId", "<init>", "(Ljava/lang/String;IILjava/lang/String;II)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f4048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f4049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f4050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f4051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ l[] f4052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f4053i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4055b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/ActivityPrivacyType.PRIVACY_EVERYONE", "Lam/l;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends l {
        public b(String str, int i14) {
            super(str, i14, 3, "public", 1, R.string.startup_privacy_activities_everyone_share, null);
        }

        @Override // am.l
        public final int a() {
            return R.string.lbl_activity_visibility_everyone;
        }

        @Override // am.l
        public final int b() {
            return R.string.privacy_everyone;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/ActivityPrivacyType.PRIVACY_MY_CONNECTIONS", "Lam/l;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends l {
        public c(String str, int i14) {
            super(str, i14, 1, "subscribers", 3, R.string.startup_privacy_personal_activities_share, null);
        }

        @Override // am.l
        public final int a() {
            return R.string.activity_privacy_my_followers_description;
        }

        @Override // am.l
        public final int b() {
            return R.string.privacy_my_followers;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/ActivityPrivacyType.PRIVACY_MY_GROUPS_AND_CONNECTION", "Lam/l;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends l {
        public d(String str, int i14) {
            super(str, i14, 2, "groups", 4, R.string.startup_privacy_conn_groups_activities_share, null);
        }

        @Override // am.l
        public final int a() {
            return R.string.activity_privacy_my_followers_groups_description;
        }

        @Override // am.l
        public final int b() {
            return R.string.privacy_my_followers_groups;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/ActivityPrivacyType.PRIVACY_ONLY_ME", "Lam/l;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends l {
        public e(String str, int i14) {
            super(str, i14, 0, "private", 2, R.string.startup_privacy_activies_not_shared, null);
        }

        @Override // am.l
        public final int a() {
            return R.string.lbl_activity_visibility_only_me;
        }

        @Override // am.l
        public final int b() {
            return R.string.privacy_only_me;
        }
    }

    static {
        e eVar = new e("PRIVACY_ONLY_ME", 0);
        f4048d = eVar;
        c cVar = new c("PRIVACY_MY_CONNECTIONS", 1);
        f4049e = cVar;
        d dVar = new d("PRIVACY_MY_GROUPS_AND_CONNECTION", 2);
        f4050f = dVar;
        b bVar = new b("PRIVACY_EVERYONE", 3);
        f4051g = bVar;
        l[] lVarArr = {eVar, cVar, dVar, bVar};
        f4052h = lVarArr;
        f4053i = new w13.c(lVarArr);
        f4047c = new a(null);
    }

    private l(String str, int i14, int i15, String str2, int i16, int i17) {
        super(str, i14);
        this.f4054a = str2;
        this.f4055b = i16;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f4052h.clone();
    }

    public abstract int a();

    public abstract int b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lam/l$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static l a(String str, l lVar) {
            Object next;
            lVar.getClass();
            w13.c cVar = l.f4053i;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!p005kotlin.jvm.internal.s.g(((l) next).f4054a, str));
            l lVar2 = (l) next;
            return lVar2 == null ? lVar : lVar2;
        }

        private a() {
        }
    }

    public /* synthetic */ l(String str, int i14, int i15, String str2, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, i15, str2, i16, i17);
    }
}
