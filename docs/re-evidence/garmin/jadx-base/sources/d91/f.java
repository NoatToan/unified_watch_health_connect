package d91;

import com.garmin.android.apps.connectmobile.R;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import v62.s4;
import v62.v4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Ld91/f;", "", "", "descriptionResId", "Lu4/d;", "icon", "", "userVisible", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;Lu4/d;Z)V", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("LIKE")
    public static final f f58525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("DISLIKE")
    public static final f f58526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("CONCERN")
    public static final f f58527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("IMPLICIT_LINK_ACTIVATED")
    public static final f f58528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f[] f58529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f58530i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f58531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.d f58532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f58533c;

    static {
        Integer numValueOf = Integer.valueOf(R.string.lbl_interesting);
        s62.a.f157643a.getClass();
        t62.b bVar = t62.b.f162798a;
        f fVar = new f("LIKE", 0, numValueOf, v4.a(bVar), true);
        f58525d = fVar;
        f fVar2 = new f("DISLIKE", 1, Integer.valueOf(R.string.lbl_not_interesting), s4.a(bVar), true);
        f58526e = fVar2;
        f fVar3 = new f("CONCERN", 2, Integer.valueOf(R.string.lbl_report_concern), null, true);
        f58527f = fVar3;
        f fVar4 = new f("IMPLICIT_LINK_ACTIVATED", 3, null, null, false);
        f58528g = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f58529h = fVarArr;
        f58530i = new w13.c(fVarArr);
    }

    private f(String str, int i14, Integer num, u4.d dVar, boolean z14) {
        super(str, i14);
        this.f58531a = num;
        this.f58532b = dVar;
        this.f58533c = z14;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f58529h.clone();
    }
}
