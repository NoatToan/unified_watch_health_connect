package u70;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010BQ\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lu70/b;", "", "", "headerTextResId", "Lc22/g2;", "onDemandHeaderTextResId", "footerTextResId", "primaryButtonTextResId", "", "hasSecondaryButton", "titleResId", "onDemandTitleResId", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;IZILjava/lang/String;)V", "a", "c", "b", "Lu70/b$a;", "Lu70/b$b;", "Lu70/b$c;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f169391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f169393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f169394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f169395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f169396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f169397g;

    public /* synthetic */ b(int i14, String str, Integer num, int i15, boolean z14, int i16, String str2, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : num, i15, z14, (i17 & 32) != 0 ? 0 : i16, (i17 & 64) != 0 ? null : str2, null);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu70/b$a;", "Lu70/b;", "Lu70/a;", "first", "second", "<init>", "(Lu70/a;Lu70/a;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final u70.a f169398h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final u70.a f169399i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u70.a aVar, u70.a aVar2) {
            super(R.string.msg_choose_view_for_key_stats, null, null, R.string.lbl_next, false, R.string.lbl_home_view, null, 70, null);
            aVar.getClass();
            aVar2.getClass();
            this.f169398h = aVar;
            this.f169399i = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f169398h == aVar.f169398h && this.f169399i == aVar.f169399i;
        }

        public final int hashCode() {
            return this.f169399i.hashCode() + (this.f169398h.hashCode() * 31);
        }

        public final String toString() {
            return "InteractiveDual(first=" + this.f169398h + ", second=" + this.f169399i + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ a(u70.a aVar, u70.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? u70.a.ESSENTIALS : aVar, (i14 & 2) != 0 ? u70.a.IN_FOCUS : aVar2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu70/b$c;", "Lu70/b;", "Lu70/a;", "view", "<init>", "(Lu70/a;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final u70.a f169402h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u70.a aVar) {
            super(R.string.msg_add_essentials, null, Integer.valueOf(R.string.msg_home_screen_update), R.string.lbl_update_home_screen, true, R.string.lbl_try_essentials, null, 66, null);
            aVar.getClass();
            this.f169402h = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f169402h == ((c) obj).f169402h;
        }

        public final int hashCode() {
            return this.f169402h.hashCode();
        }

        public final String toString() {
            return "StaticSingle(view=" + this.f169402h + ")";
        }

        public /* synthetic */ c(u70.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? u70.a.ESSENTIALS : aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: u70.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu70/b$b;", "Lu70/b;", "Lu70/a;", "first", "second", "<init>", "(Lu70/a;Lu70/a;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3169b extends b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final u70.a f169400h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final u70.a f169401i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3169b(u70.a aVar, u70.a aVar2) {
            super(R.string.msg_add_essentials, null, Integer.valueOf(R.string.msg_home_screen_update), R.string.lbl_update_home_screen, true, R.string.lbl_try_essentials, null, 66, null);
            aVar.getClass();
            aVar2.getClass();
            this.f169400h = aVar;
            this.f169401i = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3169b)) {
                return false;
            }
            C3169b c3169b = (C3169b) obj;
            return this.f169400h == c3169b.f169400h && this.f169401i == c3169b.f169401i;
        }

        public final int hashCode() {
            return this.f169401i.hashCode() + (this.f169400h.hashCode() * 31);
        }

        public final String toString() {
            return "StaticDual(first=" + this.f169400h + ", second=" + this.f169401i + ")";
        }

        public /* synthetic */ C3169b(u70.a aVar, u70.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? u70.a.IN_FOCUS : aVar, (i14 & 2) != 0 ? u70.a.ESSENTIALS : aVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C3169b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    private b(int i14, String str, Integer num, int i15, boolean z14, int i16, String str2) {
        this.f169391a = i14;
        this.f169392b = str;
        this.f169393c = num;
        this.f169394d = i15;
        this.f169395e = z14;
        this.f169396f = i16;
        this.f169397g = str2;
    }

    public /* synthetic */ b(int i14, String str, Integer num, int i15, boolean z14, int i16, String str2, p005kotlin.jvm.internal.j jVar) {
        this(i14, str, num, i15, z14, i16, str2);
    }
}
