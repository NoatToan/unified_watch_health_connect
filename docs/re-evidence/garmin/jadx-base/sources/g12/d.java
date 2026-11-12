package g12;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 g12.d[], still in use, count: 1, list:
  (r0v1 g12.d[]) from 0x0066: CONSTRUCTOR (r0v1 g12.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB=\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lg12/d;", "", "", "labelResourceID", "", Action.KEY_ATTRIBUTE, TtmlNode.ATTR_ID, "profileHintResourceId", "profileImplicitConsentResId", "activityImplicitConsentResId", "<init>", "(Ljava/lang/String;IILjava/lang/String;IIII)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {
    /* JADX INFO: Fake field, exist only in values array */
    PRIVACY_ONLY_ME(R.string.privacy_only_me, "private", 2, R.string.startup_privacy_will_not_be_shared, R.string.lbl_profile_visibility_only_me, R.string.lbl_activity_visibility_only_me),
    PRIVACY_MY_CONNECTIONS(R.string.privacy_my_connections, "following", 3, R.string.startup_privacy_personal_share, R.string.lbl_profile_visibility_my_connections, R.string.lbl_activity_visibility_my_connections),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVACY_MY_GROUPS_AND_CONNECTION(R.string.privacy_my_connections_groups, "groups", 4, R.string.startup_privacy_conn_groups_share, R.string.lbl_profile_visibility_my_connections_groups, R.string.lbl_activity_visibility_my_connections_groups),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVACY_EVERYONE(R.string.privacy_everyone, "public", 1, R.string.startup_privacy_everyone_share, R.string.lbl_profile_visibility_everyone, R.string.lbl_activity_visibility_everyone);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f74882b = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w13.c f74885e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74886a;

    static {
        f74885e = new w13.c(new d[]{r0, r1, new d(R.string.privacy_my_connections_groups, "groups", 4, R.string.startup_privacy_conn_groups_share, R.string.lbl_profile_visibility_my_connections_groups, R.string.lbl_activity_visibility_my_connections_groups), new d(R.string.privacy_everyone, "public", 1, R.string.startup_privacy_everyone_share, R.string.lbl_profile_visibility_everyone, R.string.lbl_activity_visibility_everyone)});
    }

    private d(int i14, String str, int i15, int i16, int i17, int i18) {
        super(str, i);
        this.f74886a = str;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f74884d.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg12/d$a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
