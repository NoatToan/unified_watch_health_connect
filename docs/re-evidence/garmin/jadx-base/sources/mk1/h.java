package mk1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import com.google.firebase.messaging.Constants;
import e23.p;
import ek1.m;
import j53.l;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lmk1/h;", "Landroidx/lifecycle/u1;", "Lek1/m;", "processThirdPartyAppsListUseCase", "<init>", "(Lek1/m;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f119159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f119160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f119161c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.thirdpartyapps.ThirdPartyAppsListViewModel$refreshRequired$1", f = "ThirdPartyAppsListViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z1 f119167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f119168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f119169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f119170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f119171e;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x005e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:15:0x005f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r11.f119171e
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L15
                int r1 = r11.f119170d
                java.lang.Object r3 = r11.f119169c
                mk1.h r4 = r11.f119168b
                r53.z1 r5 = r11.f119167a
                o13.r.b(r12)
                goto L5f
            L15:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r12)
                r12 = 0
                return r12
            L1c:
                o13.r.b(r12)
                mk1.h r12 = mk1.h.this
                r53.p2 r1 = r12.f119160b
            L23:
                java.lang.Object r3 = r1.getValue()
                r4 = r3
                mk1.h$a r4 = (mk1.h.a) r4
                boolean r6 = r4.f119162a
                fk1.a r8 = r4.f119164c
                boolean r9 = r4.f119165d
                boolean r10 = r4.f119166e
                r8.getClass()
                mk1.h$a r5 = new mk1.h$a
                r7 = 1
                r5.<init>(r6, r7, r8, r9, r10)
                boolean r3 = r1.b(r3, r5)
                if (r3 == 0) goto L23
                r53.p2 r1 = r12.f119160b
                r3 = 0
                r4 = r12
                r5 = r1
                r1 = r3
            L47:
                java.lang.Object r3 = r5.getValue()
                r12 = r3
                mk1.h$a r12 = (mk1.h.a) r12
                r11.f119167a = r5
                r11.f119168b = r4
                r11.f119169c = r3
                r11.f119170d = r1
                r11.f119171e = r2
                java.lang.Object r12 = mk1.h.x4(r4, r11)
                if (r12 != r0) goto L5f
                return r0
            L5f:
                mk1.h$a r12 = (mk1.h.a) r12
                boolean r12 = r5.b(r3, r12)
                if (r12 == 0) goto L47
                kotlin.Unit r12 = p005kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: mk1.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lmk1/h$a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.thirdpartyapps.ThirdPartyAppsListViewModel$uiState$1", f = "ThirdPartyAppsListViewModel.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<j<? super a>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z1 f119173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f119174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f119175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f119176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f119177e;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super a> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0047  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:12:0x003f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x003e
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r6.f119177e
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L15
                int r1 = r6.f119176d
                java.lang.Object r3 = r6.f119175c
                mk1.h r4 = r6.f119174b
                r53.z1 r5 = r6.f119173a
                o13.r.b(r7)
                goto L3f
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r7)
                r7 = 0
                return r7
            L1c:
                o13.r.b(r7)
                mk1.h r7 = mk1.h.this
                r53.p2 r1 = r7.f119160b
                r3 = 0
                r4 = r7
                r5 = r1
                r1 = r3
            L27:
                java.lang.Object r3 = r5.getValue()
                r7 = r3
                mk1.h$a r7 = (mk1.h.a) r7
                r6.f119173a = r5
                r6.f119174b = r4
                r6.f119175c = r3
                r6.f119176d = r1
                r6.f119177e = r2
                java.lang.Object r7 = mk1.h.x4(r4, r6)
                if (r7 != r0) goto L3f
                return r0
            L3f:
                mk1.h$a r7 = (mk1.h.a) r7
                boolean r7 = r5.b(r3, r7)
                if (r7 == 0) goto L27
                kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mk1.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(m mVar) {
        mVar.getClass();
        this.f119159a = mVar;
        p2 p2VarA = q2.a(new a(true, false, null, false, false, 30, null));
        this.f119160b = p2VarA;
        v vVar = new v(new c(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f119161c = s.K(vVar, aVarA, k2.a.f150706c, new a(true, false, null, false, false, 30, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(h hVar, v13.c cVar) {
        i iVar;
        hVar.getClass();
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f119181c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f119181c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(hVar, cVar);
            }
        } else {
            iVar = new i(hVar, cVar);
        }
        Object objD = iVar.f119179a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f119181c;
        if (i15 == 0) {
            r.b(objD);
            m mVar = hVar.f119159a;
            iVar.f119181c = 1;
            objD = mVar.d(iVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objD);
        }
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            return new a(false, false, (fk1.a) ((v2.b) v2Var).f47386a, false, false, 27, null);
        }
        if (v2Var instanceof v2.a) {
            return new a(false, false, null, true, false, 23, null);
        }
        u0.r();
        return null;
    }

    public final void y4() {
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmk1/h$a;", "", "", "isLoading", "isRefreshing", "Lfk1/a;", "partnerConnections", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "navigationToNutritionRequired", "<init>", "(ZZLfk1/a;ZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f119162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f119163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final fk1.a f119164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f119165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f119166e;

        public a(boolean z14, boolean z15, fk1.a aVar, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? new fk1.a(l.b(), l.b()) : aVar, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? false : z17);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f119162a == aVar.f119162a && this.f119163b == aVar.f119163b && p005kotlin.jvm.internal.s.g(this.f119164c, aVar.f119164c) && this.f119165d == aVar.f119165d && this.f119166e == aVar.f119166e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f119166e) + q6.f.g((this.f119164c.hashCode() + q6.f.g(Boolean.hashCode(this.f119162a) * 31, 31, this.f119163b)) * 31, 31, this.f119165d);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("ThirdPartyAppsListUIState(isLoading=", ", isRefreshing=", ", partnerConnections=", this.f119162a, this.f119163b);
            sbM.append(this.f119164c);
            sbM.append(", error=");
            sbM.append(this.f119165d);
            sbM.append(", navigationToNutritionRequired=");
            return hb.a.k(sbM, this.f119166e, ")");
        }

        public a(boolean z14, boolean z15, fk1.a aVar, boolean z16, boolean z17) {
            aVar.getClass();
            this.f119162a = z14;
            this.f119163b = z15;
            this.f119164c = aVar;
            this.f119165d = z16;
            this.f119166e = z17;
        }

        public a() {
            this(false, false, null, false, false, 31, null);
        }
    }
}
