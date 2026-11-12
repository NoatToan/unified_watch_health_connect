package yx0;

import android.content.Context;
import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.menstrualcycle.reminders.MenstrualCycleReminders;
import e23.l;
import e23.p;
import java.util.HashSet;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import t13.d;
import u53.o;
import v13.e;
import v13.i;
import vb.h;
import x53.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.util.MenstrualNotificationsUtil$getPeriodReminders$2$1", f = "MenstrualNotificationsUtil.kt", l = {79, 89}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f200009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f200010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<com.garmin.android.library.backgroundtaskmanagement.b.c, Unit> f200011c;

    /* JADX INFO: renamed from: yx0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.util.MenstrualNotificationsUtil$getPeriodReminders$2$1$1", f = "MenstrualNotificationsUtil.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C3743a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<com.garmin.android.library.backgroundtaskmanagement.b.c, Unit> f200012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.backgroundtaskmanagement.b.c f200013b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3743a(l<? super com.garmin.android.library.backgroundtaskmanagement.b.c, Unit> lVar, com.garmin.android.library.backgroundtaskmanagement.b.c cVar, d<? super C3743a> dVar) {
            super(2, dVar);
            this.f200012a = lVar;
            this.f200013b = cVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C3743a(this.f200012a, this.f200013b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C3743a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f200012a.invoke(this.f200013b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$c;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/library/backgroundtaskmanagement/b$c;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.util.MenstrualNotificationsUtil$getPeriodReminders$2$1$resultStatus$1", f = "MenstrualNotificationsUtil.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super com.garmin.android.library.backgroundtaskmanagement.b.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f200014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f200015b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, d<? super b> dVar) {
            super(2, dVar);
            this.f200015b = context;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new b(this.f200015b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<String> listB;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f200014a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    yw0.a aVar2 = (yw0.a) KoinJavaComponent.get$default(yw0.a.class, null, null, 6, null);
                    this.f200014a = 1;
                    obj = aVar2.f(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                xw0.d dVar = (xw0.d) obj;
                yx0.b bVar = yx0.b.f200016a;
                if (dVar == null || (listB = dVar.b()) == null) {
                    listB = j0.f134944a;
                }
                bVar.getClass();
                listB.getClass();
                HashSet hashSet = new HashSet();
                hashSet.addAll(listB);
                Object value = yx0.b.f200019d.getValue();
                value.getClass();
                SharedPreferences.Editor editorEdit = ((SharedPreferences) value).edit();
                editorEdit.putStringSet("periodStartDates", hashSet);
                editorEdit.apply();
                MenstrualCycleReminders.a aVar3 = MenstrualCycleReminders.f39205a;
                Context context = this.f200015b;
                aVar3.getClass();
                MenstrualCycleReminders.a.f(context);
                return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            } catch (Exception e4) {
                return cx0.b.a(e4);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, l<? super com.garmin.android.library.backgroundtaskmanagement.b.c, Unit> lVar, d<? super a> dVar) {
        super(2, dVar);
        this.f200010b = context;
        this.f200011c = lVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f200010b, this.f200011c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (ge1.b.e0(r1, r3, r6) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f200009a;
        if (i14 == 0) {
            r.b(obj);
            b bVar = new b(this.f200010b, null);
            this.f200009a = 1;
            obj = ge1.b.Y(bVar, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        c cVar = s0.f129406a;
        t1 t1Var = o.f168762a;
        C3743a c3743a = new C3743a(this.f200011c, (com.garmin.android.library.backgroundtaskmanagement.b.c) obj, null);
        this.f200009a = 2;
    }
}
