package ro1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ro1.b[], still in use, count: 1, list:
  (r0v1 ro1.b[]) from 0x005a: CONSTRUCTOR (r0v1 ro1.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lro1/b;", "", "", "thumbnailResId", "layoutResId", "", "reportingName", "<init>", "(Ljava/lang/String;IIILjava/lang/String;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    Default(2131233195, 0, "option0"),
    /* JADX INFO: Fake field, exist only in values array */
    Option1(2131233191, R.layout.share_image_stats_template_1, "option1"),
    Option2(2131233192, R.layout.share_image_stats_template_2, "option2"),
    /* JADX INFO: Fake field, exist only in values array */
    Option3(2131233193, R.layout.share_image_stats_template_3, "option3"),
    /* JADX INFO: Fake field, exist only in values array */
    Option4(2131233194, R.layout.share_image_stats_template_4, "option4");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f153905d = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f153909h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153912c;

    static {
        f153909h = new w13.c(new b[]{r0, r1, r2, new b(2131233193, R.layout.share_image_stats_template_3, "option3"), new b(2131233194, R.layout.share_image_stats_template_4, "option4")});
    }

    private b(int i14, int i15, String str) {
        super(str, i);
        this.f153910a = i14;
        this.f153911b = i15;
        this.f153912c = str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f153908g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro1/b$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
