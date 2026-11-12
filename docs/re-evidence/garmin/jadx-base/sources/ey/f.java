package ey;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.garmin.android.apps.connectmobile.v2;
import o53.b0;
import o53.s0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.presentation.CalendarViewModel$fetchCalendarData$1", f = "CalendarViewModel.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<CalendarDTO>> f67071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f67072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f67073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f67074e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.calendar.presentation.CalendarViewModel$fetchCalendarData$1$1", f = "CalendarViewModel.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0<fw.m<CalendarDTO>> f67076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f67077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DateTime f67078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f67079e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y0<fw.m<CalendarDTO>> y0Var, h hVar, DateTime dateTime, boolean z14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f67076b = y0Var;
            this.f67077c = hVar;
            this.f67078d = dateTime;
            this.f67079e = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f67076b, this.f67077c, this.f67078d, this.f67079e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67075a;
            y0<fw.m<CalendarDTO>> y0Var = this.f67076b;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    y0Var.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
                    zx.e eVar = this.f67077c.f67084a;
                    DateTime dateTime = this.f67078d;
                    boolean z14 = this.f67079e;
                    this.f67075a = 1;
                    obj = eVar.a(dateTime, z14, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                v2 v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    y0Var.j(fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1));
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y0Var.j(fw.m.a.d(fw.m.f73767e, ((v2.a) v2Var).f47383a));
                }
            } catch (Throwable th3) {
                fw.m.f73767e.getClass();
                y0Var.j(fw.m.a.a(null, th3));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(y0<fw.m<CalendarDTO>> y0Var, h hVar, DateTime dateTime, boolean z14, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f67071b = y0Var;
        this.f67072c = hVar;
        this.f67073d = dateTime;
        this.f67074e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f67071b, this.f67072c, this.f67073d, this.f67074e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67070a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f67071b, this.f67072c, this.f67073d, this.f67074e, null);
            this.f67070a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
