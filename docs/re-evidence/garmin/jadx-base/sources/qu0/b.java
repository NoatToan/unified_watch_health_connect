package qu0;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lqu0/b;", "", "", Action.KEY_ATTRIBUTE, "", "infoResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f147871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f147872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f147873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f147874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f147875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b[] f147876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f147877i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f147879b;

    /* JADX INFO: Fake field, exist only in values array */
    b EF1;

    static {
        b bVar = new b("NONE", 0, "NONE", null, 2, null);
        f147872d = bVar;
        b bVar2 = new b("LEGACY", 1, "LEGACY", null, 2, null);
        Integer numValueOf = Integer.valueOf(R.string.lbl_livetrack_notifications_not_sent_until_accept);
        b bVar3 = new b("UNCONFIRMED", 2, "UNCONFIRMED", numValueOf);
        f147873e = bVar3;
        b bVar4 = new b("PENDING", 3, "PENDING", numValueOf);
        b bVar5 = new b("ACCEPTED", 4, "ACCEPTED", null, 2, null);
        f147874f = bVar5;
        b bVar6 = new b("DECLINED", 5, "DECLINED", Integer.valueOf(R.string.lbl_livetrack_notifications_not_sent));
        f147875g = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        f147876h = bVarArr;
        f147877i = new w13.c(bVarArr);
        f147871c = new a(null);
    }

    public /* synthetic */ b(String str, int i14, String str2, Integer num, int i15, j jVar) {
        this(str, i14, str2, (i15 & 2) != 0 ? null : num);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f147876h.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqu0/b$a;", "", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private b(String str, int i14, String str2, Integer num) {
        super(str, i14);
        this.f147878a = str2;
        this.f147879b = num;
    }
}
