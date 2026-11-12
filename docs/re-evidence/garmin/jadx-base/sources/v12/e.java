package v12;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.d2;
import r53.e2;
import r53.g2;
import r53.o2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lv12/e;", "Lv12/c;", "Lip/i;", "activityPrivacyRepo", "Lhl/a;", "screenAccessRole", "", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "privacyTypes", "<init>", "(Lip/i;Lhl/a;Ljava/util/List;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip.i f174693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f174694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f174695c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.PrivacySelectionAllPastActivitiesViewModel$onUserEvent$1", f = "PrivacySelectionAllPastActivitiesViewModel.kt", l = {42, 43, 44, 45, 46}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w f174697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f174698c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar, e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174697b = wVar;
            this.f174698c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174697b, this.f174698c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
        
            if (v12.e.A4(r9, r11) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
        
            if (r12.emit(r1, r11) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174696a;
            if (i14 == 0) {
                o13.r.b(obj);
                w wVar = this.f174697b;
                boolean z14 = wVar instanceof w.d;
                e eVar = this.f174698c;
                if (z14) {
                    PrivacyType privacyType = ((w.d) wVar).f174822a;
                    this.f174696a = 1;
                    p2 p2Var = eVar.f174695c;
                    p2Var.k(null, k.a((k) p2Var.getValue(), privacyType, false, 47));
                } else if (p005kotlin.jvm.internal.s.g(wVar, w.b.f174820a)) {
                    this.f174696a = 2;
                    p2 p2Var2 = eVar.f174695c;
                    p2Var2.k(null, k.a((k) p2Var2.getValue(), null, false, 31));
                } else if (p005kotlin.jvm.internal.s.g(wVar, w.c.f174821a)) {
                    this.f174696a = 3;
                } else if (p005kotlin.jvm.internal.s.g(wVar, w.e.f174823a)) {
                    this.f174696a = 4;
                    p2 p2Var3 = eVar.f174695c;
                    p2Var3.k(null, k.a((k) p2Var3.getValue(), null, true, 31));
                } else {
                    if (!p005kotlin.jvm.internal.s.g(wVar, w.a.f174819a)) {
                        u0.r();
                        return null;
                    }
                    e2 e2Var = eVar.f174694b;
                    x.a aVar2 = x.a.f174824a;
                    this.f174696a = 5;
                }
            } else {
                if (i14 != 1 && i14 != 2 && i14 != 3 && i14 != 4 && i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public e(ip.i iVar, hl.a aVar, List<? extends PrivacyType> list) {
        iVar.getClass();
        aVar.getClass();
        list.getClass();
        this.f174693a = iVar;
        this.f174694b = g2.b(0, 0, null, 7);
        this.f174695c = q2.a(new k(v12.a.CLOSE, R.string.privacy_all_past_activities_label, R.string.privacy_update_all_past_activities_description, list, null, false, 48, null));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        if (r1.emit(r14, r2) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r1.emit(r14, r2) == r3) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A4(e eVar, v13.c cVar) {
        d dVar;
        PrivacyType privacyType;
        Object objB;
        x.b bVar;
        Throwable thB;
        p2 p2Var = eVar.f174695c;
        e2 e2Var = eVar.f174694b;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f174692e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f174692e = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(eVar, cVar);
            }
        } else {
            dVar = new d(eVar, cVar);
        }
        Object obj = dVar.f174690c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f174692e;
        if (i15 == 0) {
            o13.r.b(obj);
            k kVarA = k.a((k) p2Var.getValue(), null, false, 31);
            dVar.f174692e = 1;
            p2Var.k(null, kVarA);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else if (i15 == 2) {
            PrivacyType privacyType2 = dVar.f174688a;
            o13.r.b(obj);
            Object obj2 = ((o13.q) obj).f128597a;
            privacyType = privacyType2;
            objB = obj2;
            int i16 = o13.q.f128596b;
            if (!(objB instanceof o13.q.b)) {
                ((Boolean) objB).getClass();
                bVar = new x.b(privacyType);
                dVar.f174688a = null;
                dVar.f174689b = objB;
                dVar.f174692e = 3;
                if (e2Var.emit(bVar, dVar) != aVar) {
                }
                return aVar;
            }
            thB = o13.q.b(objB);
            if (thB != null) {
                if (thB instanceof PrivacyUpdateRequestError) {
                }
                x.c cVar2 = new x.c(new fw.r());
                dVar.f174688a = null;
                dVar.f174689b = objB;
                dVar.f174692e = 5;
            }
        } else if (i15 == 3) {
            objB = dVar.f174689b;
            o13.r.b(obj);
            thB = o13.q.b(objB);
            if (thB != null) {
                if ((thB instanceof PrivacyUpdateRequestError) || !p005kotlin.jvm.internal.s.g(((PrivacyUpdateRequestError) thB).getError(), PrivacyUpdateRequestError.TOO_MANY_REQUESTS)) {
                    x.c cVar3 = new x.c(new fw.r());
                    dVar.f174688a = null;
                    dVar.f174689b = objB;
                    dVar.f174692e = 5;
                } else {
                    x.e eVar2 = x.e.f174829a;
                    dVar.f174688a = null;
                    dVar.f174689b = objB;
                    dVar.f174692e = 4;
                }
            }
        } else {
            if (i15 != 4 && i15 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        privacyType = ((k) p2Var.getValue()).f174751e;
        if (privacyType != null) {
            ip.i iVar = eVar.f174693a;
            String categoryAccessRule = privacyType.getCategoryAccessRule();
            dVar.f174688a = privacyType;
            dVar.f174692e = 2;
            objB = iVar.b(categoryAccessRule, dVar);
            if (objB != aVar) {
                int i17 = o13.q.f128596b;
                if (!(objB instanceof o13.q.b)) {
                    ((Boolean) objB).getClass();
                    bVar = new x.b(privacyType);
                    dVar.f174688a = null;
                    dVar.f174689b = objB;
                    dVar.f174692e = 3;
                    if (e2Var.emit(bVar, dVar) != aVar) {
                    }
                }
                thB = o13.q.b(objB);
                if (thB != null) {
                    if (thB instanceof PrivacyUpdateRequestError) {
                    }
                    x.c cVar4 = new x.c(new fw.r());
                    dVar.f174688a = null;
                    dVar.f174689b = objB;
                    dVar.f174692e = 5;
                }
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }

    @Override // v12.c
    public final d2<x> x4() {
        return r53.s.c(this.f174694b);
    }

    @Override // v12.c
    public final o2<k> y4() {
        return this.f174695c;
    }

    @Override // v12.c
    public final void z4(w wVar) {
        wVar.getClass();
        ge1.b.T(v1.a(this), null, null, new a(wVar, this, null), 3);
    }
}
