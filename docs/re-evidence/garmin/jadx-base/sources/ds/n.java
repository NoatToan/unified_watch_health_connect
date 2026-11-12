package ds;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import v62.h5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fBA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lds/n;", "", "", Action.KEY_ATTRIBUTE, "", "ratio", "", Constants.ScionAnalytics.PARAM_LABEL, "labelDescription", "Lu4/d;", "icon", "ratioX", "ratioY", "<init>", "(Ljava/lang/String;ILjava/lang/String;FIILu4/d;II)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f61011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f61012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f61013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f61014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n[] f61015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f61016m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f61018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u4.d f61021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f61022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f61023g;

    static {
        s62.a.f157643a.getClass();
        t62.b.f162798a.getClass();
        h5 h5Var = h5.f175898a;
        n nVar = new n("Portrait", 0, "portrait", 0.5625f, R.string.lbl_full_portrait_aspect_ratio, R.string.full_portrait_aspect_ratio_description, z62.b.a(h5Var), 9, 16);
        f61012i = nVar;
        n nVar2 = new n("Post", 1, "post", 0.8f, R.string.lbl_vertical_aspect_ratio, R.string.vertical_aspect_ratio_description, z62.a.a(h5Var), 4, 5);
        f61013j = nVar2;
        n nVar3 = new n("Square", 2, "square", 1.0f, R.string.lbl_square_aspect_ratio, R.string.square_aspect_ratio_description, z62.d.a(h5Var), 1, 1);
        f61014k = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        f61015l = nVarArr;
        f61016m = new w13.c(nVarArr);
        f61011h = new a(null);
    }

    private n(String str, int i14, String str2, float f14, int i15, int i16, u4.d dVar, int i17, int i18) {
        super(str, i14);
        this.f61017a = str2;
        this.f61018b = f14;
        this.f61019c = i15;
        this.f61020d = i16;
        this.f61021e = dVar;
        this.f61022f = i17;
        this.f61023g = i18;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f61015l.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lds/n$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static n a(String str) {
            Object next;
            str.getClass();
            w13.c cVar = n.f61016m;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((n) next).f61017a, str)) {
                    return (n) next;
                }
            }
            next = null;
            return (n) next;
        }

        private a() {
        }
    }
}
