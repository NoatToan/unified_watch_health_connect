package androidx.room;

import android.database.SQLException;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/room/u0;", "connection", "", "", "<anonymous>", "(Landroidx/room/u0;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", l = {418, 425}, m = "invokeSuspend")
public final class b1 extends v13.i implements e23.p<u0, t13.d<? super Set<? extends Integer>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f10766c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/room/t0;", "", "", "<anonymous>", "(Landroidx/room/t0;)Ljava/util/Set;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", l = {426}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<t0<Set<? extends Integer>>, t13.d<? super Set<? extends Integer>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0 f10769c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0 x0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f10769c = x0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f10769c, dVar);
            aVar.f10768b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(t0<Set<? extends Integer>> t0Var, t13.d<? super Set<? extends Integer>> dVar) {
            return ((a) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f10767a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            t0 t0Var = (t0) this.f10768b;
            this.f10767a = 1;
            Object objA = x0.a(this.f10769c, t0Var, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(x0 x0Var, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f10766c = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b1 b1Var = new b1(this.f10766c, dVar);
        b1Var.f10765b = obj;
        return b1Var;
    }

    @Override // e23.p
    public final Object invoke(u0 u0Var, t13.d<? super Set<? extends Integer>> dVar) {
        return ((b1) create(u0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u0 u0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f10764a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                u0Var = (u0) this.f10765b;
                this.f10765b = u0Var;
                this.f10764a = 1;
                obj = u0Var.d(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                u0Var = (u0) this.f10765b;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return (Set) obj;
            if (((Boolean) obj).booleanValue()) {
                return p13.l0.f134950a;
            }
            u0.a aVar2 = u0.a.IMMEDIATE;
            a aVar3 = new a(this.f10766c, null);
            this.f10765b = null;
            this.f10764a = 2;
            obj = u0Var.b(aVar2, aVar3, this);
        } catch (SQLException unused) {
            return p13.l0.f134950a;
        }
    }
}
