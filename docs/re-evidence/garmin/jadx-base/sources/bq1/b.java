package bq1;

import cq1.o;
import e23.p;
import java.util.Iterator;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.startup.background.StartupBackgroundOperation$execute$1", f = "StartupBackgroundOperation.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f19564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f19568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bq1.a f19569f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.startup.background.StartupBackgroundOperation$execute$1$startupTasks$1$1", f = "StartupBackgroundOperation.kt", l = {54}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f19571b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, d<? super a> dVar) {
            super(2, dVar);
            this.f19571b = oVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f19571b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f19570a;
            if (i14 == 0) {
                r.b(obj);
                this.f19570a = 1;
                if (this.f19571b.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bq1.a aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f19569f = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f19569f, dVar);
        bVar.f19568e = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00cb A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:6:0x0016, B:17:0x00c5, B:19:0x00cb, B:23:0x00e7, B:16:0x00bb), top: B:31:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:21:0x00e3 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00e1 -> B:22:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq1.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
