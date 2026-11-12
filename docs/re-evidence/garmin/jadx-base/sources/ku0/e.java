package ku0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fw.m;
import java.util.List;
import l20.r;
import lc.u0;
import m20.z;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lfw/m;", "Ll20/r;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.recipients.LiveEventRecipientsViewModel$saveContacts$1", f = "LiveEventRecipientsViewModel.kt", l = {16, 17}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<t0<m<? extends r>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f106548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<l20.a> f106549c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.recipients.LiveEventRecipientsViewModel$saveContacts$1$1", f = "LiveEventRecipientsViewModel.kt", l = {18, 19, 21}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f106550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<l20.a> f106551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t0<m<r>> f106552c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<l20.a> list, t0<m<r>> t0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f106551b = list;
            this.f106552c = t0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f106551b, this.f106552c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            if (r5.emit(r15, r14) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        
            if (r5.emit(r15, r14) == r0) goto L25;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f106550a;
            if (i14 == 0) {
                o13.r.b(obj);
                z zVar = (z) KoinJavaComponent.get$default(z.class, null, null, 6, null);
                r rVar = new r(this.f106551b, null, null, null, null, null, 62, null);
                this.f106550a = 1;
                obj = zVar.i(rVar, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2 && i14 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            v2 v2Var = (v2) obj;
            boolean z14 = v2Var instanceof v2.a;
            t0<m<r>> t0Var = this.f106552c;
            if (z14) {
                v2.a aVar2 = (v2.a) v2Var;
                m mVarE = m.f73767e.e(aVar2.f47383a, aVar2.f47384b);
                this.f106550a = 2;
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                m<r> mVarG = m.a.g(m.f73767e, ((v2.b) v2Var).f47386a, 1);
                this.f106550a = 3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List<l20.a> list, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f106549c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f106549c, dVar);
        eVar.f106548b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(t0<m<? extends r>> t0Var, t13.d<? super Unit> dVar) {
        return ((e) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (ge1.b.e0(r7, r2, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f106548b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106547a;
        if (i14 == 0) {
            o13.r.b(obj);
            m mVarF = m.a.f(m.f73767e, null, null, 3);
            this.f106548b = t0Var;
            this.f106547a = 1;
            if (t0Var.emit(mVarF, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar2 = new a(this.f106549c, t0Var, null);
        this.f106548b = null;
        this.f106547a = 2;
    }
}
