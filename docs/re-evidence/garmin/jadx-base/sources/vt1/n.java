package vt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 vt1.n[], still in use, count: 1, list:
  (r0v1 vt1.n[]) from 0x0058: CONSTRUCTOR (r0v1 vt1.n[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB#\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvt1/n;", "", "", "displayResId", "planTypeID", "valueInMeters", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {
    FIVE_K(R.string.personal_records_label_5k_run, 1, 5000),
    TEN_K(R.string.personal_records_label_10k_run, 2, 10000),
    HALF_MARATHON(R.string.atp_lbl_half_marathon, 3, 21098),
    MARATHON(R.string.pacepro_lbl_distance_marathon, -1, 42195),
    OTHER(R.string.workout_step_type_other, -1, 0);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f180163d = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f180170k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f180171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f180173c;

    static {
        f180170k = new w13.c(new n[]{r0, r1, r2, r3, r4});
    }

    private n(int i14, int i15, int i16) {
        super(str, i);
        this.f180171a = i14;
        this.f180172b = i15;
        this.f180173c = i16;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f180169j.clone();
    }

    public final String a(Context context) {
        context.getClass();
        String string = context.getString(this.f180171a);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvt1/n$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
