package hj1;

import android.content.Context;
import androidx.lifecycle.y0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import f12.l;
import g8.i;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import o53.t1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u53.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lhj1/d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "mDeviceID", "Lhj1/c;", "removeListener", "Lfj1/b;", "gcmSettingsRepo", "Lo53/b0;", "coroutineScope", "<init>", "(Landroid/content/Context;JLhj1/c;Lfj1/b;Lo53/b0;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f83995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fj1.b f83996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f83997c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.util.RemovePrimaryDeviceHelper$handleUpdatePrimaryDevice$1$1", f = "RemovePrimaryDeviceHelper.kt", l = {52, 58, 60, 67, 74, 82, 90, 95, 108, 110, 117, 125}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ gj1.c f84000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f84001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f84002e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.util.RemovePrimaryDeviceHelper$handleUpdatePrimaryDevice$1$1$1", f = "RemovePrimaryDeviceHelper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f84003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ gj1.c f84004b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, gj1.c cVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f84003a = dVar;
                this.f84004b = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f84003a, this.f84004b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                d dVar = this.f84003a;
                dVar.f83995a.hideProgressOverlay();
                hj1.c.a(dVar.f83995a, this.f84004b, 6);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: hj1.d$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.util.RemovePrimaryDeviceHelper$handleUpdatePrimaryDevice$1$1$2", f = "RemovePrimaryDeviceHelper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1665b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f84005a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1665b(d dVar, t13.d<? super C1665b> dVar2) {
                super(2, dVar2);
                this.f84005a = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1665b(this.f84005a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1665b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                d dVar = this.f84005a;
                dVar.f83995a.hideProgressOverlay();
                hj1.c.a(dVar.f83995a, null, 3);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.util.RemovePrimaryDeviceHelper$handleUpdatePrimaryDevice$1$1$3", f = "RemovePrimaryDeviceHelper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f84006a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ gj1.c f84007b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d dVar, gj1.c cVar, t13.d<? super c> dVar2) {
                super(2, dVar2);
                this.f84006a = dVar;
                this.f84007b = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f84006a, this.f84007b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                d dVar = this.f84006a;
                dVar.f83995a.hideProgressOverlay();
                hj1.c.a(dVar.f83995a, this.f84007b, 6);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: hj1.d$b$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.util.RemovePrimaryDeviceHelper$handleUpdatePrimaryDevice$1$1$4", f = "RemovePrimaryDeviceHelper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1666d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f84008a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1666d(d dVar, t13.d<? super C1666d> dVar2) {
                super(2, dVar2);
                this.f84008a = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1666d(this.f84008a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1666d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                d dVar = this.f84008a;
                dVar.f83995a.hideProgressOverlay();
                hj1.c.a(dVar.f83995a, null, 3);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.util.RemovePrimaryDeviceHelper$handleUpdatePrimaryDevice$1$1$5", f = "RemovePrimaryDeviceHelper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f84009a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ gj1.c f84010b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(d dVar, gj1.c cVar, t13.d<? super e> dVar2) {
                super(2, dVar2);
                this.f84009a = dVar;
                this.f84010b = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new e(this.f84009a, this.f84010b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                d dVar = this.f84009a;
                dVar.f83995a.hideProgressOverlay();
                hj1.c.a(dVar.f83995a, this.f84010b, 6);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.util.RemovePrimaryDeviceHelper$handleUpdatePrimaryDevice$1$1$6", f = "RemovePrimaryDeviceHelper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f84011a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ gj1.c f84012b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(d dVar, gj1.c cVar, t13.d<? super f> dVar2) {
                super(2, dVar2);
                this.f84011a = dVar;
                this.f84012b = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new f(this.f84011a, this.f84012b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                d dVar = this.f84011a;
                dVar.f83995a.hideProgressOverlay();
                hj1.c.a(dVar.f83995a, this.f84012b, 6);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.util.RemovePrimaryDeviceHelper$handleUpdatePrimaryDevice$1$1$7", f = "RemovePrimaryDeviceHelper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f84013a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(d dVar, t13.d<? super g> dVar2) {
                super(2, dVar2);
                this.f84013a = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new g(this.f84013a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                d dVar = this.f84013a;
                dVar.f83995a.hideProgressOverlay();
                hj1.c.a(dVar.f83995a, null, 3);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.util.RemovePrimaryDeviceHelper$handleUpdatePrimaryDevice$1$1$8", f = "RemovePrimaryDeviceHelper.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f84014a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(d dVar, t13.d<? super h> dVar2) {
                super(2, dVar2);
                this.f84014a = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new h(this.f84014a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f84014a.f83995a.hideProgressOverlay();
                return Unit.INSTANCE;
            }
        }

        public static final /* synthetic */ class i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f84015a;

            static {
                int[] iArr = new int[ej1.b.values().length];
                try {
                    iArr[ej1.b.WEARABLE_TRAINING_DEVICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ej1.b.WEARABLE_DEVICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ej1.b.TRAINING_DEVICE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f84015a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gj1.c cVar, d dVar, long j8, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f84000c = cVar;
            this.f84001d = dVar;
            this.f84002e = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f84000c, this.f84001d, this.f84002e, dVar);
            bVar.f83999b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0083  */
        /* JADX WARN: Code duplicated, block: B:26:0x009a  */
        /* JADX WARN: Code duplicated, block: B:28:0x009e  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:41:0x0113  */
        /* JADX WARN: Code duplicated, block: B:43:0x0117  */
        /* JADX WARN: Code duplicated, block: B:44:0x0145  */
        /* JADX WARN: Code duplicated, block: B:51:0x015d  */
        /* JADX WARN: Code duplicated, block: B:53:0x0177  */
        /* JADX WARN: Code duplicated, block: B:56:0x018f A[PHI: r14
          0x018f: PHI (r14v31 java.lang.Object) = (r14v30 java.lang.Object), (r14v0 java.lang.Object) binds: [B:54:0x018b, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:58:0x0195  */
        /* JADX WARN: Code duplicated, block: B:61:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:63:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:66:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:68:0x01eb  */
        /* JADX WARN: Code duplicated, block: B:71:0x0200  */
        /* JADX WARN: Code duplicated, block: B:73:0x0204  */
        /* JADX WARN: Code duplicated, block: B:78:0x023e  */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        
            if (ge1.b.e0(r14, r0, r13) == r1) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
        
            if (ge1.b.e0(r14, r0, r13) == r1) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
        
            if (ge1.b.e0(r14, r0, r13) == r1) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
        
            if (ge1.b.e0(r14, r0, r13) == r1) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x01a6, code lost:
        
            if (ge1.b.e0(r14, r0, r13) == r1) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01e4, code lost:
        
            if (ge1.b.e0(r14, r0, r13) == r1) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01fd, code lost:
        
            if (ge1.b.e0(r14, r0, r13) == r1) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0238, code lost:
        
            if (ge1.b.e0(r14, r0, r13) == r1) goto L75;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:28:0x009e, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:43:0x0117, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:63:0x01ae, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:73:0x0204, please report this as an issue */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            v2 v2Var2;
            v2 v2Var3;
            v2 v2Var4;
            b0 b0Var = (b0) this.f83999b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f83998a;
            long j8 = this.f84002e;
            gj1.c cVar = this.f84000c;
            d dVar = this.f84001d;
            switch (i14) {
                case 0:
                    r.b(obj);
                    int i15 = i.f84015a[cVar.f77652a.ordinal()];
                    if (i15 != 1) {
                        if (i15 == 2) {
                            fj1.b bVar = dVar.f83996b;
                            this.f83999b = b0Var;
                            this.f83998a = 7;
                            obj = bVar.c(j8, this);
                            if (obj != aVar) {
                                v2Var3 = (v2) obj;
                                if (v2Var3 instanceof v2.b) {
                                    l.f68084a.getClass();
                                    l.a.a().s1(j8);
                                    x53.c cVar2 = s0.f129406a;
                                    t1 t1Var = o.f168762a;
                                    e eVar = new e(dVar, cVar, null);
                                    this.f83999b = null;
                                    this.f83998a = 8;
                                    break;
                                } else {
                                    if (v2Var3 instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    v2.a aVar2 = (v2.a) v2Var3;
                                    String str = " Error in updating the Primary Wearable " + aVar2.f47385c + StringUtils.SPACE + aVar2.f47384b;
                                    i2.a aVar3 = i2.f36769a;
                                    a2 a2Var = a2.GENERAL;
                                    aVar3.getClass();
                                    i2.a.f(a2Var, "RemovePrimaryDeviceHelper", str);
                                    dVar.f83995a.hideProgressOverlay();
                                    hj1.c.a(dVar.f83995a, null, 3);
                                }
                                return Unit.INSTANCE;
                            }
                        } else if (i15 != 3) {
                            x53.c cVar3 = s0.f129406a;
                            t1 t1Var2 = o.f168762a;
                            h hVar = new h(dVar, null);
                            this.f83999b = null;
                            this.f83998a = 12;
                        } else {
                            fj1.b bVar2 = dVar.f83996b;
                            gj1.d dVar2 = new gj1.d(new Long(j8));
                            this.f83999b = b0Var;
                            this.f83998a = 9;
                            obj = bVar2.b(dVar2, this);
                            if (obj != aVar) {
                                v2Var4 = (v2) obj;
                                if (v2Var4 instanceof v2.b) {
                                    x53.c cVar4 = s0.f129406a;
                                    t1 t1Var3 = o.f168762a;
                                    f fVar = new f(dVar, cVar, null);
                                    this.f83999b = null;
                                    this.f83998a = 10;
                                } else {
                                    if (v2Var4 instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    v2.a aVar4 = (v2.a) v2Var4;
                                    String str2 = " Error in updating the Primary Wearable " + aVar4.f47385c + StringUtils.SPACE + aVar4.f47384b;
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar5.getClass();
                                    i2.a.f(a2Var2, "RemovePrimaryDeviceHelper", str2);
                                    x53.c cVar5 = s0.f129406a;
                                    t1 t1Var4 = o.f168762a;
                                    g gVar = new g(dVar, null);
                                    this.f83999b = null;
                                    this.f83998a = 11;
                                }
                            }
                        }
                        break;
                    } else {
                        fj1.b bVar3 = dVar.f83996b;
                        this.f83999b = b0Var;
                        this.f83998a = 1;
                        obj = bVar3.c(j8, this);
                        if (obj != aVar) {
                            v2Var = (v2) obj;
                            if (v2Var instanceof v2.b) {
                                l.f68084a.getClass();
                                l.a.a().s1(j8);
                                if (!s.g(cVar.f77653b.getPrimaryTrainingCapable(), Boolean.TRUE)) {
                                    x53.c cVar6 = s0.f129406a;
                                    t1 t1Var5 = o.f168762a;
                                    c cVar7 = new c(dVar, cVar, null);
                                    this.f83999b = null;
                                    this.f83998a = 5;
                                } else {
                                    fj1.b bVar4 = dVar.f83996b;
                                    gj1.d dVar3 = new gj1.d(new Long(j8));
                                    this.f83999b = b0Var;
                                    this.f83998a = 2;
                                    obj = bVar4.b(dVar3, this);
                                    if (obj != aVar) {
                                        v2Var2 = (v2) obj;
                                        if (v2Var2 instanceof v2.b) {
                                            x53.c cVar8 = s0.f129406a;
                                            t1 t1Var6 = o.f168762a;
                                            a aVar6 = new a(dVar, cVar, null);
                                            this.f83999b = null;
                                            this.f83998a = 3;
                                        } else {
                                            if (!(v2Var2 instanceof v2.a)) {
                                                u0.r();
                                                return null;
                                            }
                                            v2.a aVar7 = (v2.a) v2Var2;
                                            String str3 = "Error in updating the Primary Wearable " + aVar7.f47385c + StringUtils.SPACE + aVar7.f47384b;
                                            i2.a aVar8 = i2.f36769a;
                                            a2 a2Var3 = a2.GENERAL;
                                            aVar8.getClass();
                                            i2.a.f(a2Var3, "RemovePrimaryDeviceHelper", str3);
                                            x53.c cVar9 = s0.f129406a;
                                            t1 t1Var7 = o.f168762a;
                                            C1665b c1665b = new C1665b(dVar, null);
                                            this.f83999b = null;
                                            this.f83998a = 4;
                                        }
                                    }
                                }
                            } else {
                                if (v2Var instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                v2.a aVar9 = (v2.a) v2Var;
                                String str4 = " Error in updating the Primary Wearable " + aVar9.f47385c + StringUtils.SPACE + aVar9.f47384b;
                                i2.a aVar10 = i2.f36769a;
                                a2 a2Var4 = a2.GENERAL;
                                aVar10.getClass();
                                i2.a.f(a2Var4, "RemovePrimaryDeviceHelper", str4);
                                x53.c cVar10 = s0.f129406a;
                                t1 t1Var8 = o.f168762a;
                                C1666d c1666d = new C1666d(dVar, null);
                                this.f83999b = null;
                                this.f83998a = 6;
                            }
                        }
                        break;
                    }
                    return aVar;
                case 1:
                    r.b(obj);
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        l.f68084a.getClass();
                        l.a.a().s1(j8);
                        if (!s.g(cVar.f77653b.getPrimaryTrainingCapable(), Boolean.TRUE)) {
                            fj1.b bVar5 = dVar.f83996b;
                            gj1.d dVar4 = new gj1.d(new Long(j8));
                            this.f83999b = b0Var;
                            this.f83998a = 2;
                            obj = bVar5.b(dVar4, this);
                            if (obj != aVar) {
                                v2Var2 = (v2) obj;
                                if (v2Var2 instanceof v2.b) {
                                    x53.c cVar11 = s0.f129406a;
                                    t1 t1Var9 = o.f168762a;
                                    a aVar11 = new a(dVar, cVar, null);
                                    this.f83999b = null;
                                    this.f83998a = 3;
                                } else {
                                    if (!(v2Var2 instanceof v2.a)) {
                                        u0.r();
                                        return null;
                                    }
                                    v2.a aVar12 = (v2.a) v2Var2;
                                    String str5 = "Error in updating the Primary Wearable " + aVar12.f47385c + StringUtils.SPACE + aVar12.f47384b;
                                    i2.a aVar13 = i2.f36769a;
                                    a2 a2Var5 = a2.GENERAL;
                                    aVar13.getClass();
                                    i2.a.f(a2Var5, "RemovePrimaryDeviceHelper", str5);
                                    x53.c cVar12 = s0.f129406a;
                                    t1 t1Var10 = o.f168762a;
                                    C1665b c1665b2 = new C1665b(dVar, null);
                                    this.f83999b = null;
                                    this.f83998a = 4;
                                }
                            }
                            break;
                        } else {
                            x53.c cVar13 = s0.f129406a;
                            t1 t1Var11 = o.f168762a;
                            c cVar14 = new c(dVar, cVar, null);
                            this.f83999b = null;
                            this.f83998a = 5;
                            break;
                        }
                        return aVar;
                    }
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar14 = (v2.a) v2Var;
                    String str6 = " Error in updating the Primary Wearable " + aVar14.f47385c + StringUtils.SPACE + aVar14.f47384b;
                    i2.a aVar15 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar15.getClass();
                    i2.a.f(a2Var6, "RemovePrimaryDeviceHelper", str6);
                    x53.c cVar15 = s0.f129406a;
                    t1 t1Var12 = o.f168762a;
                    C1666d c1666d2 = new C1666d(dVar, null);
                    this.f83999b = null;
                    this.f83998a = 6;
                    break;
                    break;
                case 2:
                    r.b(obj);
                    v2Var2 = (v2) obj;
                    if (v2Var2 instanceof v2.b) {
                        x53.c cVar16 = s0.f129406a;
                        t1 t1Var13 = o.f168762a;
                        a aVar16 = new a(dVar, cVar, null);
                        this.f83999b = null;
                        this.f83998a = 3;
                    } else {
                        if (!(v2Var2 instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        v2.a aVar17 = (v2.a) v2Var2;
                        String str7 = "Error in updating the Primary Wearable " + aVar17.f47385c + StringUtils.SPACE + aVar17.f47384b;
                        i2.a aVar18 = i2.f36769a;
                        a2 a2Var7 = a2.GENERAL;
                        aVar18.getClass();
                        i2.a.f(a2Var7, "RemovePrimaryDeviceHelper", str7);
                        x53.c cVar17 = s0.f129406a;
                        t1 t1Var14 = o.f168762a;
                        C1665b c1665b3 = new C1665b(dVar, null);
                        this.f83999b = null;
                        this.f83998a = 4;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                case 10:
                case 11:
                case 12:
                    r.b(obj);
                    return Unit.INSTANCE;
                case 7:
                    r.b(obj);
                    v2Var3 = (v2) obj;
                    if (v2Var3 instanceof v2.b) {
                        l.f68084a.getClass();
                        l.a.a().s1(j8);
                        x53.c cVar18 = s0.f129406a;
                        t1 t1Var15 = o.f168762a;
                        e eVar2 = new e(dVar, cVar, null);
                        this.f83999b = null;
                        this.f83998a = 8;
                        break;
                    } else {
                        if (v2Var3 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        v2.a aVar19 = (v2.a) v2Var3;
                        String str8 = " Error in updating the Primary Wearable " + aVar19.f47385c + StringUtils.SPACE + aVar19.f47384b;
                        i2.a aVar20 = i2.f36769a;
                        a2 a2Var8 = a2.GENERAL;
                        aVar20.getClass();
                        i2.a.f(a2Var8, "RemovePrimaryDeviceHelper", str8);
                        dVar.f83995a.hideProgressOverlay();
                        hj1.c.a(dVar.f83995a, null, 3);
                    }
                    return Unit.INSTANCE;
                case 9:
                    r.b(obj);
                    v2Var4 = (v2) obj;
                    if (v2Var4 instanceof v2.b) {
                        x53.c cVar19 = s0.f129406a;
                        t1 t1Var16 = o.f168762a;
                        f fVar2 = new f(dVar, cVar, null);
                        this.f83999b = null;
                        this.f83998a = 10;
                    } else {
                        if (v2Var4 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        v2.a aVar21 = (v2.a) v2Var4;
                        String str9 = " Error in updating the Primary Wearable " + aVar21.f47385c + StringUtils.SPACE + aVar21.f47384b;
                        i2.a aVar22 = i2.f36769a;
                        a2 a2Var9 = a2.GENERAL;
                        aVar22.getClass();
                        i2.a.f(a2Var9, "RemovePrimaryDeviceHelper", str9);
                        x53.c cVar20 = s0.f129406a;
                        t1 t1Var17 = o.f168762a;
                        g gVar2 = new g(dVar, null);
                        this.f83999b = null;
                        this.f83998a = 11;
                    }
                    break;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, long j8, c cVar, fj1.b bVar, b0 b0Var, int i14, j jVar) {
        fj1.b bVarA = (i14 & 8) != 0 ? fj1.b.a.a(fj1.b.f71828c) : bVar;
        if ((i14 & 16) != 0) {
            x53.c cVar2 = s0.f129406a;
            b0Var = c0.a(x53.b.f189152a.plus(i.c()));
        }
        this(context, j8, cVar, bVarA, b0Var);
    }

    public final void a(gj1.c cVar) {
        Long deviceId;
        cVar.getClass();
        c cVar2 = this.f83995a;
        cVar2.showProgressOverlay();
        gj1.b bVar = cVar.f77653b;
        if (bVar != null && (deviceId = bVar.getDeviceId()) != null) {
            ge1.b.T(this.f83997c, null, null, new b(cVar, this, deviceId.longValue(), null), 3);
        } else {
            cVar2.hideProgressOverlay();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhj1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public d(Context context, long j8, c cVar, fj1.b bVar, b0 b0Var) {
        context.getClass();
        cVar.getClass();
        bVar.getClass();
        b0Var.getClass();
        this.f83995a = cVar;
        this.f83996b = bVar;
        this.f83997c = b0Var;
        ej1.b bVar2 = ej1.b.WEARABLE_TRAINING_DEVICE;
        new y0();
    }
}
