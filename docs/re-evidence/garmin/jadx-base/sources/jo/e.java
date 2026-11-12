package jo;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v62.fa;
import v62.o7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB1\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ljo/e;", "", "", "titleId", "messageId", "actionTextId", "Lu4/d;", "icon", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;Lu4/d;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f99744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f99745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f99746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f99747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f99748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f99749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ e[] f99750k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f99753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u4.d f99754d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99755a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f99748i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f99755a = iArr;
        }
    }

    static {
        s62.a.f157643a.getClass();
        t62.a aVar = t62.a.f162797a;
        e eVar = new e("NO_ACTIVITIES", 0, R.string.msg_no_activities, R.string.activity_list_empty_message, null, u62.a.a(aVar));
        f99745f = eVar;
        e eVar2 = new e("NO_ACTIVITIES_FOR_CONNECTION", 1, R.string.msg_no_activities, R.string.activities_list_all_private, null, u62.a.a(aVar));
        f99746g = eVar2;
        Integer numValueOf = Integer.valueOf(R.string.filter_clear_filters);
        t62.b bVar = t62.b.f162798a;
        e eVar3 = new e("NO_ACTIVITIES_FOR_FILTER", 2, R.string.news_feed_empty_for_no_results_title, R.string.activity_list_filter_no_results_message, numValueOf, o7.a(bVar));
        f99747h = eVar3;
        e eVar4 = new e("NO_ACTIVITIES_FOR_QUERY", 3, R.string.more_menu_search_no_results_title, R.string.more_menu_search_no_results_description, null, o7.a(bVar));
        f99748i = eVar4;
        e eVar5 = new e("ERROR", 4, R.string.lbl_error_occurred, R.string.problem_loading_refresh, Integer.valueOf(R.string.lbl_try_again), fa.a(bVar));
        f99749j = eVar5;
        f99750k = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
        f99744e = new a(null);
    }

    public /* synthetic */ e(String str, int i14, int i15, int i16, Integer num, u4.d dVar, int i17, j jVar) {
        this(str, i14, i15, i16, (i17 & 4) != 0 ? null : num, dVar);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f99750k.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljo/e$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private e(String str, int i14, int i15, int i16, Integer num, u4.d dVar) {
        super(str, i14);
        this.f99751a = i15;
        this.f99752b = i16;
        this.f99753c = num;
        this.f99754d = dVar;
    }
}
