package ot;

import android.content.Context;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ot.n[], still in use, count: 1, list:
  (r0v1 ot.n[]) from 0x00ab: CONSTRUCTOR (r0v1 ot.n[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB5\b\u0002\u0012*\b\u0002\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lot/n;", "", "Lkotlin/Function3;", "Ltt/i;", "Landroid/content/Context;", "Lt13/d;", "", "", "preProcess", "<init>", "(Ljava/lang/String;ILe23/q;)V", "c", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {
    STEPS(null, 1, null),
    PUSHES(null, 1, null),
    SLEEP_SCORE(null, 1, null),
    SLEEP(null, 1, null),
    BODY_BATTERY(null, 1, null),
    ACTIVITY_SUMMARY(null, 1, null),
    ACTIVITY_TIME(null, 1, null),
    ACTIVITY_DISTANCE(null, 1, null),
    ACTIVITY_ELEVATION(null, 1, null),
    ACTIVITY_CALORIES(null, 1, null),
    ACHIEVEMENTS(b.f133643a),
    RECAP(null, 1, null);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f133627b = new c(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w13.c f133641p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.q<tt.i, Context, t13.d<? super Unit>, Object> f133642a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltt/i;", "<unused var>", "Landroid/content/Context;", "", "<anonymous>", "(Ltt/i;Landroid/content/Context;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.chapter.AnnualReportChapterType$1", f = "AnnualReportChapterType.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<tt.i, Context, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(tt.i iVar, Context context, t13.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.q<tt.i, Context, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f133643a = new b();

        public b() {
            super(3, st.b.class, "preProcessAchievements", "preProcessAchievements(Lcom/garmin/android/apps/connectmobile/annual_report/data/model/AnnualReportDTO;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // e23.q
        public final Object invoke(tt.i iVar, Context context, t13.d<? super Unit> dVar) throws Throwable {
            Context context2 = context;
            tt.a achievements = iVar.getAchievements();
            if (achievements == null) {
                return Unit.INSTANCE;
            }
            pt.h.f140570a.getClass();
            ArrayList<String> arrayListF = pt.h.f(achievements);
            if (arrayListF != null) {
                for (String str : arrayListF) {
                    zp0.c.f206560v.getClass();
                    zp0.c cVarA = zp0.c.a.a(context2);
                    cVarA.f206565e = str;
                    cVarA.c();
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        f133641p = new w13.c(new n[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11});
    }

    public /* synthetic */ n(e23.q qVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new a(null) : qVar);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f133640o.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lot/n$c;", "", "<init>", "()V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f133644a;

            static {
                int[] iArr = new int[n.values().length];
                try {
                    iArr[n.STEPS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n.PUSHES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n.SLEEP_SCORE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[n.SLEEP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[n.BODY_BATTERY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[n.ACTIVITY_SUMMARY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[n.ACTIVITY_TIME.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[n.ACTIVITY_ELEVATION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[n.ACTIVITY_DISTANCE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[n.ACTIVITY_CALORIES.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[n.ACHIEVEMENTS.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[n.RECAP.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                f133644a = iArr;
            }
        }

        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    private n(e23.q qVar) {
        super(str, i);
        this.f133642a = qVar;
    }
}
