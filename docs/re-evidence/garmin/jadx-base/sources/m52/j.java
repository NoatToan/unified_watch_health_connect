package m52;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import d53.u;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB'\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lm52/j;", "Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/InlineUnitsTextFieldView$a;", "", "", "abbreviatedResourceID", "resourceID", "", "isMetricUnit", "<init>", "(Ljava/lang/String;IIILjava/lang/Boolean;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements InlineUnitsTextFieldView.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f116744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f116745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f116746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f116747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f116748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ j[] f116749i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f116752c;

    static {
        Boolean bool = Boolean.FALSE;
        j jVar = new j("MILE", 0, R.string.lbl_mile, R.string.lbl_miles, bool);
        f116745e = jVar;
        Boolean bool2 = Boolean.TRUE;
        j jVar2 = new j("KILOMETER", 1, R.string.lbl_km, R.string.lbl_kilometers, bool2);
        f116746f = jVar2;
        j jVar3 = new j("METER", 2, R.string.lbl_meter, R.string.common_meters_string, bool2);
        f116747g = jVar3;
        j jVar4 = new j("YARD", 3, R.string.lbl_yard, R.string.common_yards_string, bool);
        f116748h = jVar4;
        f116749i = new j[]{jVar, jVar2, jVar3, jVar4};
        f116744d = new a(null);
    }

    private j(String str, int i14, int i15, int i16, Boolean bool) {
        super(str, i14);
        this.f116750a = i15;
        this.f116751b = i16;
        this.f116752c = bool;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f116749i.clone();
    }

    @Override // c32.d
    public final String a(Context context) {
        int i14;
        int i15 = this.f116751b;
        if (i15 == -1 || (i14 = this.f116750a) == -1) {
            return "";
        }
        String string = context.getString(R.string.string_space_string_bracket_pattern, context.getString(i15), context.getString(i14));
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView.a
    public final String b(Context context) {
        context.getClass();
        int i14 = this.f116750a;
        if (i14 == -1) {
            return "";
        }
        String string = context.getString(i14);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView.a
    public final String c(Number number, Context context) {
        number.getClass();
        if (this.f116751b == -1) {
            return number.toString();
        }
        String string = context.getString(R.string.placeholder_text_with_unit, number, b(context));
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm52/j$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a(String str) {
            for (j jVar : j.values()) {
                if (u.q(jVar.name(), str, true)) {
                    return jVar;
                }
            }
            if (str.length() == 0) {
                return null;
            }
            vb.h.s("Unknown key: ".concat(str));
            return null;
        }

        private a() {
        }
    }
}
