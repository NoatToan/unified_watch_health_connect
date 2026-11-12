package qs;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qs.a0[], still in use, count: 1, list:
  (r0v1 qs.a0[]) from 0x002c: CONSTRUCTOR (r0v1 qs.a0[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqs/a0;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "labelResId", "<init>", "(Ljava/lang/String;III)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 {
    /* JADX INFO: Fake field, exist only in values array */
    Fresh(0, R.string.activity_details_water_type_fresh),
    /* JADX INFO: Fake field, exist only in values array */
    Salt(1, R.string.activity_details_water_type_salt),
    Custom(3, R.string.activity_details_water_type_custom);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w13.c f146994e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f146995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146996b;

    static {
        f146994e = new w13.c(a0VarArr);
    }

    private a0(int i14, int i15) {
        super(str, i);
        this.f146995a = i14;
        this.f146996b = i15;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f146993d.clone();
    }
}
