package rx;

import android.content.Context;
import android.text.format.DateFormat;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import tx.c;
import tx.d;
import tx.e;
import yz.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrx/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f154899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u00.a f154901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mn.a f154902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f154903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f154904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f154905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tx.a f154906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final tx.b f154907i;

    /* JADX INFO: renamed from: rx.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2935a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154908a;

        static {
            int[] iArr = new int[hx.c.values().length];
            try {
                iArr[hx.c.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hx.c.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hx.c.STRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hx.c.SLEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hx.c.NAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f154908a = iArr;
        }
    }

    public a(Context context) {
        context.getClass();
        this.f154899a = context;
        String string = context.getString(R.string.no_value);
        string.getClass();
        this.f154900b = string;
        l22.a aVar = new l22.a(context);
        this.f154901c = new u00.a(aVar);
        this.f154902d = new mn.a(aVar);
        this.f154903e = new d(aVar);
        this.f154904f = new e(aVar);
        this.f154905g = new c(aVar);
        this.f154906h = new tx.a(aVar);
        this.f154907i = new tx.b(aVar);
        new pi0.e(context);
    }

    /* JADX WARN: Code duplicated, block: B:479:0x0f3c  */
    /* JADX WARN: Code duplicated, block: B:484:0x0f52  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v8 java.lang.Object, still in use, count: 2, list:
          (r4v8 java.lang.Object) from 0x0f38: PHI (r4 I:??) = (r4v5 java.lang.Object), (r4v8 java.lang.Object) binds: [B:476:0x0f37, B:488:0x0f38] A[DONT_GENERATE, DONT_INLINE]
          (r4v8 java.lang.Object) from 0x0f2c: CHECK_CAST (cx.d) (r4v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final rx.b a(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 4960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.a.a(java.lang.String, java.lang.String, java.lang.String):rx.b");
    }

    public final String b(Integer num) {
        String strValueOf;
        if (num != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null && (strValueOf = String.valueOf(num.intValue())) != null) {
                return strValueOf;
            }
        }
        return this.f154900b;
    }

    public final String c(bx.b bVar) {
        bVar.getClass();
        hx.b event = bVar.getEvent();
        hx.c cVarB = event != null ? event.b() : null;
        int i14 = cVarB == null ? -1 : C2935a.f154908a[cVarB.ordinal()];
        if (i14 == 1) {
            return this.f154902d.a(bVar.getActivityName());
        }
        Context context = this.f154899a;
        if (i14 == 2) {
            String string = context.getString(R.string.allday_stress_low_stress);
            string.getClass();
            return string;
        }
        if (i14 == 3) {
            String string2 = context.getString(R.string.alldaystress_high_stress);
            string2.getClass();
            return string2;
        }
        if (i14 == 4) {
            String string3 = context.getString(R.string.sleep_lbl_sleep);
            string3.getClass();
            return string3;
        }
        if (i14 != 5) {
            return "";
        }
        String string4 = context.getString(R.string.sleep_lbl_nap);
        string4.getClass();
        return string4;
    }

    public final String d(Integer num) {
        String str;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue != 0) {
                l3.f23124b.getClass();
                str = l3.f23132j.format(Integer.valueOf(iIntValue));
            } else {
                str = "0";
            }
            if (str != null) {
                return str;
            }
        }
        return this.f154900b;
    }

    public final String e(DateTime dateTime, DateTime dateTime2) {
        if (dateTime == null || dateTime2 == null) {
            return this.f154900b;
        }
        k kVar = new k(DateFormat.is24HourFormat(this.f154899a));
        return e5.g(kVar.a((dateTime.getHourOfDay() * 60.0f) + dateTime.getMinuteOfHour()), " - ", kVar.a((dateTime2.getHourOfDay() * 60.0f) + dateTime2.getMinuteOfHour()));
    }

    public final String f() {
        String string = this.f154899a.getString(R.string.msg_not_enough_data);
        string.getClass();
        return string;
    }
}
