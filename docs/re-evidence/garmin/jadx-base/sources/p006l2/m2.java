package p006l2;

import android.R;
import ch.qos.logback.core.joran.action.Action;
import o2.f;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll2/m2;", "", "", Action.KEY_ATTRIBUTE, "Ll2/u0;", "stringId", "Ll2/t0;", "drawableId", "<init>", "(Ljava/lang/String;ILjava/lang/Object;II)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m2 f108656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m2 f108657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m2 f108658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m2 f108659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m2 f108660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ m2[] f108661i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f108662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f108664c;

    static {
        f.f128629a.getClass();
        Object obj = f.f128630b;
        u0.f108803b.getClass();
        t0.f108795b.getClass();
        m2 m2Var = new m2("Cut", 0, obj, R.string.cut, R.attr.actionModeCutDrawable);
        f108656d = m2Var;
        m2 m2Var2 = new m2("Copy", 1, f.f128631c, R.string.copy, R.attr.actionModeCopyDrawable);
        f108657e = m2Var2;
        m2 m2Var3 = new m2("Paste", 2, f.f128632d, R.string.paste, R.attr.actionModePasteDrawable);
        f108658f = m2Var3;
        m2 m2Var4 = new m2("SelectAll", 3, f.f128633e, R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        f108659g = m2Var4;
        m2 m2Var5 = new m2("Autofill", 4, f.f128634f, R.string.autofill, 0);
        f108660h = m2Var5;
        f108661i = new m2[]{m2Var, m2Var2, m2Var3, m2Var4, m2Var5};
    }

    private m2(String str, int i14, Object obj, int i15, int i16) {
        super(str, i14);
        this.f108662a = obj;
        this.f108663b = i15;
        this.f108664c = i16;
    }

    public static m2 valueOf(String str) {
        return (m2) Enum.valueOf(m2.class, str);
    }

    public static m2[] values() {
        return (m2[]) f108661i.clone();
    }
}
