package ca2;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lca2/b;", "", "", "message1", "message2", "errorMessage", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f26605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f26606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f26607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f26608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f26609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f26610i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f26612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f26613c;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b bVar = new b("ENTER_EXISTING_PASSCODE", 0, R.string.msg_enter_current_passcode, null, Integer.valueOf(R.string.msg_no_attempts_remaining), 2, null);
        f26605d = bVar;
        Integer numValueOf = Integer.valueOf(R.string.msg_device_passcode_info);
        b bVar2 = new b("CHANGE_PASSCODE", 1, R.string.msg_enter_new_passcode, numValueOf, null, 4, null);
        f26606e = bVar2;
        b bVar3 = new b("CREATE_NEW_PASSCODE", 2, R.string.msg_enter_passcode, numValueOf, 0 == true ? 1 : 0, 4, null);
        f26607f = bVar3;
        b bVar4 = new b("REENTER_PASSCODE", 3, R.string.msg_re_enter_passcode, 0 == true ? 1 : 0, Integer.valueOf(R.string.msg_passcode_mismatch), 2, null);
        f26608g = bVar4;
        b bVar5 = new b("CONFIRM_PASSCODE", 4, R.string.msg_confirm_passcode, null, null, 6, null);
        f26609h = bVar5;
        f26610i = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public /* synthetic */ b(String str, int i14, int i15, Integer num, Integer num2, int i16, j jVar) {
        this(str, i14, i15, (i16 & 2) != 0 ? null : num, (i16 & 4) != 0 ? null : num2);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f26610i.clone();
    }

    private b(String str, int i14, int i15, Integer num, Integer num2) {
        super(str, i14);
        this.f26611a = i15;
        this.f26612b = num;
        this.f26613c = num2;
    }
}
