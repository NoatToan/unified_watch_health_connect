package u21;

import androidx.lifecycle.u1;
import p005kotlin.Metadata;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu21/d;", "Landroidx/lifecycle/u1;", "Lu21/a;", "activityLevelInputData", "<init>", "(Lu21/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f167924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f167925b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167926a;

        static {
            int[] iArr = new int[s21.a.values().length];
            try {
                iArr[s21.a.ACTIVE_CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s21.a.ACTIVITY_MULTIPLIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s21.a.CUSTOM_ACTIVE_CALORIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f167926a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    public d(u21.a aVar) {
        String strValueOf;
        String strValueOf2;
        aVar.getClass();
        s21.a aVar2 = aVar.f167889c;
        l01.a aVar3 = aVar.f167890d;
        Integer num = aVar.f167888b;
        Integer num2 = aVar.f167887a;
        String strValueOf3 = num2 != null ? String.valueOf(num2.intValue()) : null;
        String strValueOf4 = num != null ? String.valueOf(num.intValue()) : null;
        int i14 = a.f167926a[aVar2.ordinal()];
        boolean zX4 = true;
        if (i14 == 1) {
            zX4 = x4(strValueOf3);
        } else if (i14 != 2) {
            if (i14 != 3) {
                lc.u0.r();
                throw null;
            }
            zX4 = x4(strValueOf4);
        } else if (aVar3 == null) {
            zX4 = false;
        }
        boolean z14 = zX4;
        if (num2 == null) {
            strValueOf = null;
        } else {
            num2 = num2.intValue() <= 0 ? null : num2;
            if (num2 != null) {
                strValueOf = String.valueOf(num2.intValue());
            } else {
                strValueOf = null;
            }
        }
        strValueOf = strValueOf == null ? "" : strValueOf;
        if (num == null) {
            strValueOf2 = null;
        } else {
            num = num.intValue() <= 0 ? null : num;
            if (num != null) {
                strValueOf2 = String.valueOf(num.intValue());
            } else {
                strValueOf2 = null;
            }
        }
        p2 p2VarA = q2.a(new c(strValueOf, strValueOf2 != null ? strValueOf2 : "", false, z14, aVar2, aVar2 == s21.a.ACTIVITY_MULTIPLIER ? aVar3 : null, 4, null));
        this.f167924a = p2VarA;
        this.f167925b = r53.s.d(p2VarA);
    }

    public static boolean x4(String str) {
        v21.f fVar = v21.f.f175333a;
        if (str == null) {
            str = "";
        }
        Integer numI = d53.t.i(str);
        fVar.getClass();
        return v21.f.s(numI);
    }
}
