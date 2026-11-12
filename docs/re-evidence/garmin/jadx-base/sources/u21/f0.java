package u21;

import androidx.lifecycle.u1;
import o53.c2;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu21/f0;", "Landroidx/lifecycle/u1;", "", "initialWarningShown", "", "caloriesGoal", "<init>", "(ZLjava/lang/Integer;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f167953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f167954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f167955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c2 f167956e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167957a;

        static {
            int[] iArr = new int[s21.f0.values().length];
            try {
                iArr[s21.f0.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s21.f0.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f167957a = iArr;
        }
    }

    public f0(boolean z14, Integer num) {
        this.f167952a = z14;
        this.f167953b = num;
        p2 p2VarA = q2.a(new e0(num, false, false, false, 14, null));
        this.f167954c = p2VarA;
        this.f167955d = p2VarA;
    }
}
