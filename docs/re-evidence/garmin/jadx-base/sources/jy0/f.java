package jy0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f101690a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.e f101691b = new z3.e(744759398, false, new jl1.a(10));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z3.e f101692c = new z3.e(806846287, false, new jl1.a(11));

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.ComposableSingletons$MultiDayActivitiesSelectionScreenKt$lambda$1245366413$1$1$1", f = "MultiDayActivitiesSelectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
    }

    static {
        new z3.e(-235950822, false, new jt1.b((byte) 0, 17));
        new z3.e(897523806, false, new jt1.b((byte) 0, 18));
        new z3.e(-1735258380, false, new jt1.b((byte) 0, 19));
        new z3.e(1245366413, false, new jt1.b((byte) 0, 20));
    }
}
