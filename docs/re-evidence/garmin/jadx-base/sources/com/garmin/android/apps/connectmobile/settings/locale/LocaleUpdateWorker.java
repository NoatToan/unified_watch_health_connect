package com.garmin.android.apps.connectmobile.settings.locale;

import android.content.Context;
import androidx.room.a0;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import c22.s1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.messaging.Constants;
import f12.l;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import o13.m;
import o13.p;
import o13.q;
import o13.r;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.u;
import ue.i0;
import ue.v;
import ue.x;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/locale/LocaleUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocaleUpdateWorker extends CoroutineWorker implements KoinComponent {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f43431l = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f43432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f43433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f43434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f43435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f43436k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.locale.LocaleUpdateWorker", f = "LocaleUpdateWorker.kt", l = {52, 66}, m = "doWork", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f43437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f43438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f43439c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f43441e;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f43439c = obj;
            this.f43441e |= Integer.MIN_VALUE;
            return LocaleUpdateWorker.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<f12.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f43442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f43443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f43444c;

        public c(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f43442a = koinComponent;
            this.f43443b = qualifier;
            this.f43444c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [f12.b, java.lang.Object] */
        @Override // e23.a
        public final f12.b invoke() {
            KoinComponent koinComponent = this.f43442a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(f12.b.class), this.f43443b, this.f43444c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f43445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f43446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f43447c;

        public d(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f43445a = koinComponent;
            this.f43446b = qualifier;
            this.f43447c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [f12.l, java.lang.Object] */
        @Override // e23.a
        public final l invoke() {
            KoinComponent koinComponent = this.f43445a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(l.class), this.f43446b, this.f43447c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<s1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f43448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f43449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f43450c;

        public e(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f43448a = koinComponent;
            this.f43449b = qualifier;
            this.f43450c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [c22.s1, java.lang.Object] */
        @Override // e23.a
        public final s1 invoke() {
            KoinComponent koinComponent = this.f43448a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(s1.class), this.f43449b, this.f43450c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<oi1.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f43451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f43452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f43453c;

        public f(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f43451a = koinComponent;
            this.f43452b = qualifier;
            this.f43453c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, oi1.e] */
        @Override // e23.a
        public final oi1.e invoke() {
            KoinComponent koinComponent = this.f43451a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(oi1.e.class), this.f43452b, this.f43453c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<String[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f43454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f43455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f43456c;

        public g(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f43454a = koinComponent;
            this.f43455b = qualifier;
            this.f43456c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.String[]] */
        @Override // e23.a
        public final String[] invoke() {
            KoinComponent koinComponent = this.f43454a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(String[].class), this.f43455b, this.f43456c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        this.f43432g = m.a(koinPlatformTools.defaultLazyMode(), new c(this, null, null));
        this.f43433h = m.a(koinPlatformTools.defaultLazyMode(), new d(this, null, null));
        this.f43434i = m.a(koinPlatformTools.defaultLazyMode(), new e(this, null, null));
        this.f43435j = m.a(koinPlatformTools.defaultLazyMode(), new f(this, null, null));
        this.f43436k = m.a(koinPlatformTools.defaultLazyMode(), new g(this, QualifierKt.qualifier("gcSupportedLanguages"), null));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:37:0x011b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0122  */
    /* JADX WARN: Code duplicated, block: B:43:0x013b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, o13.l] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(t13.d<? super androidx.work.d.a> dVar) {
        b bVar;
        String strE;
        Object objA;
        String strO4;
        String id3;
        Object objB;
        String str;
        Throwable thB;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f43441e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f43441e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f43439c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f43441e;
        ?? r14 = this.f43435j;
        ?? r15 = this.f43433h;
        if (i15 != 0) {
            if (i15 == 1) {
                strE = bVar.f43437a;
                r.b(obj);
                objA = ((q) obj).f128597a;
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = bVar.f43438b;
                r.b(obj);
                objB = ((q) obj).f128597a;
            }
            int i16 = q.f128596b;
            if (!(objB instanceof q.b)) {
                ((l) r15.getValue()).s2(str);
                i2.a.c(i2.f36769a, "LocaleUpdateWorker", "Timezone successfully changed on GC");
            }
            thB = q.b(objB);
            if (thB != null) {
                i2.a.c(i2.f36769a, "LocaleUpdateWorker", "Failed to update timezone on GC");
                p[] pVarArr = {new p(Constants.IPC_BUNDLE_KEY_SEND_ERROR, thB.getMessage())};
                androidx.work.c.a aVar2 = new androidx.work.c.a();
                p pVar = pVarArr[0];
                aVar2.b(pVar.f128595b, (String) pVar.f128594a);
                return new androidx.work.d.a.C0165a(aVar2.a());
            }
            return new androidx.work.d.a.c();
        }
        r.b(obj);
        if (((f12.b) this.f43432g.getValue()).c()) {
            s1 s1Var = (s1) this.f43434i.getValue();
            Context context = this.f11469a;
            context.getClass();
            s1Var.getClass();
            strE = s1.e(context);
            if (strE.equals(((l) r15.getValue()).b()) || !u.z((String[]) this.f43436k.getValue(), strE)) {
                strO4 = ((l) r15.getValue()).O4();
                id3 = TimeZone.getDefault().getID();
                if (!s.g(id3, strO4)) {
                    oi1.e eVar = (oi1.e) r14.getValue();
                    id3.getClass();
                    bVar.f43437a = null;
                    bVar.f43438b = id3;
                    bVar.f43441e = 2;
                    objB = eVar.b(id3, bVar);
                    if (objB != aVar) {
                        str = id3;
                        int i17 = q.f128596b;
                        if (!(objB instanceof q.b)) {
                            ((l) r15.getValue()).s2(str);
                            i2.a.c(i2.f36769a, "LocaleUpdateWorker", "Timezone successfully changed on GC");
                        }
                        thB = q.b(objB);
                        if (thB != null) {
                            i2.a.c(i2.f36769a, "LocaleUpdateWorker", "Failed to update timezone on GC");
                            p[] pVarArr2 = {new p(Constants.IPC_BUNDLE_KEY_SEND_ERROR, thB.getMessage())};
                            androidx.work.c.a aVar3 = new androidx.work.c.a();
                            p pVar2 = pVarArr2[0];
                            aVar3.b(pVar2.f128595b, (String) pVar2.f128594a);
                            return new androidx.work.d.a.C0165a(aVar3.a());
                        }
                    }
                }
            } else {
                oi1.e eVar2 = (oi1.e) r14.getValue();
                bVar.f43437a = strE;
                bVar.f43441e = 1;
                objA = eVar2.a(strE, bVar);
            }
            return aVar;
        }
        return new androidx.work.d.a.c();
        int i18 = q.f128596b;
        if (!(objA instanceof q.b)) {
            ((l) r15.getValue()).v1(strE);
            i2.a.c(i2.f36769a, "LocaleUpdateWorker", "Locale successfully changed on GC");
        }
        Throwable thB2 = q.b(objA);
        if (thB2 != null) {
            i2.a.c(i2.f36769a, "LocaleUpdateWorker", "Failed to update locale on GC");
            p[] pVarArr3 = {new p(Constants.IPC_BUNDLE_KEY_SEND_ERROR, thB2.getMessage())};
            androidx.work.c.a aVar4 = new androidx.work.c.a();
            p pVar3 = pVarArr3[0];
            aVar4.b(pVar3.f128595b, (String) pVar3.f128594a);
            return new androidx.work.d.a.C0165a(aVar4.a());
        }
        strO4 = ((l) r15.getValue()).O4();
        id3 = TimeZone.getDefault().getID();
        if (!s.g(id3, strO4)) {
            oi1.e eVar3 = (oi1.e) r14.getValue();
            id3.getClass();
            bVar.f43437a = null;
            bVar.f43438b = id3;
            bVar.f43441e = 2;
            objB = eVar3.b(id3, bVar);
            if (objB != aVar) {
                str = id3;
                int i19 = q.f128596b;
                if (!(objB instanceof q.b)) {
                    ((l) r15.getValue()).s2(str);
                    i2.a.c(i2.f36769a, "LocaleUpdateWorker", "Timezone successfully changed on GC");
                }
                thB = q.b(objB);
                if (thB != null) {
                    i2.a.c(i2.f36769a, "LocaleUpdateWorker", "Failed to update timezone on GC");
                    p[] pVarArr4 = {new p(Constants.IPC_BUNDLE_KEY_SEND_ERROR, thB.getMessage())};
                    androidx.work.c.a aVar5 = new androidx.work.c.a();
                    p pVar4 = pVarArr4[0];
                    aVar5.b(pVar4.f128595b, (String) pVar4.f128594a);
                    return new androidx.work.d.a.C0165a(aVar5.a());
                }
            }
            return aVar;
        }
        return new androidx.work.d.a.c();
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/locale/LocaleUpdateWorker$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Context context) {
            context.getClass();
            x.a aVarE = new x.a((Class<? extends androidx.work.d>) LocaleUpdateWorker.class).e(0L, TimeUnit.MILLISECONDS);
            ue.f.a aVar = new ue.f.a();
            aVar.b(v.CONNECTED);
            aVarE.f170098c.f26950j = aVar.a();
            com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context).a("com.garmin.android.apps.connectmobile.settings.locale.worker", ue.l.REPLACE, aVarE.a()).a();
        }

        private a() {
        }
    }
}
