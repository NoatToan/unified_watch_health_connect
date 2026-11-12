package com.garmin.android.apps.connectmobile.startup;

import e23.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.o;
import q92.v;
import q92.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$grantAllPendingConsents$1", f = "StartupChecksViewModel.kt", l = {264, 266, 269, 275}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f44851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f44852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f44853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f44854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f44855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Collection f44856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f44860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f44861k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lq92/v;", "<anonymous>", "(Lo53/b0;)Lq92/v;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$grantAllPendingConsents$1$results$1$1", f = "StartupChecksViewModel.kt", l = {265}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s92.g f44863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f44864c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s92.g gVar, x xVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f44863b = gVar;
            this.f44864c = xVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f44863b, this.f44864c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44862a;
            if (i14 == 0) {
                r.b(obj);
                s92.g gVar = this.f44863b;
                if (gVar == null) {
                    return null;
                }
                o oVar = o.f136619a;
                this.f44862a = 1;
                obj = oVar.p(this.f44864c, gVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return (v) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f44861k = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f44861k, dVar);
        gVar.f44860j = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008a  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x0139  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d  */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b1 -> B:23:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.startup.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
