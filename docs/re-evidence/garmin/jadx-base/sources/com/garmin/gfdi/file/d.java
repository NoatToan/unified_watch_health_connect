package com.garmin.gfdi.file;

import e23.l;
import e23.p;
import java.io.OutputStream;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import rs2.v;
import v13.i;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lws2/l;", "<anonymous>", "()Lws2/l;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.file.FileManager$readFile$5", f = "FileManager.kt", l = {370}, m = "invokeSuspend")
public final class d extends i implements l<t13.d<? super ws2.l>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.gfdi.file.a f52386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f52388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p<Integer, Integer, Unit> f52389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OutputStream f52390f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lws2/l;", "<anonymous>", "(Lo53/b0;)Lws2/l;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.file.FileManager$readFile$5$2", f = "FileManager.kt", l = {371}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super ws2.l>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<xs2.c> f52392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ OutputStream f52393c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r0<xs2.c> r0Var, OutputStream outputStream, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f52392b = r0Var;
            this.f52393c = outputStream;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f52392b, this.f52393c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super ws2.l> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws FileException {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f52391a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            xs2.c cVar = this.f52392b.f105810a;
            this.f52391a = 1;
            Object objB = cVar.b(this.f52393c, this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(com.garmin.gfdi.file.a aVar, int i14, boolean z14, p<? super Integer, ? super Integer, Unit> pVar, OutputStream outputStream, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f52386b = aVar;
        this.f52387c = i14;
        this.f52388d = z14;
        this.f52389e = pVar;
        this.f52390f = outputStream;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f52386b, this.f52387c, this.f52388d, this.f52389e, this.f52390f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super ws2.l> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, xs2.c] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f52385a;
        try {
            if (i14 == 0) {
                r0 r0VarS = g.s(obj);
                com.garmin.gfdi.file.a aVar2 = this.f52386b;
                Object obj2 = aVar2.f52366g;
                int i15 = this.f52387c;
                boolean z14 = this.f52388d;
                p<Integer, Integer, Unit> pVar = this.f52389e;
                synchronized (obj2) {
                    try {
                        if (aVar2.f52369j != null) {
                            Logger logger = aVar2.f52361b;
                            if (logger == null) {
                                s.m("logger");
                                throw null;
                            }
                            logger.warn("Unable to receive file from device - Transfer in progress");
                            FileException.a aVar3 = FileException.a.TRANSFER_IN_PROGRESS;
                            xs2.c cVar = aVar2.f52369j;
                            throw new FileException(aVar3, aVar3 + " - existing read index " + (cVar != null ? new Integer(cVar.f192093b) : null));
                        }
                        v vVar = aVar2.f52362c;
                        if (vVar == null) {
                            s.m("messenger");
                            throw null;
                        }
                        ?? cVar2 = new xs2.c(vVar, i15, 60000L, z14, pVar);
                        r0VarS.f105810a = cVar2;
                        aVar2.f52369j = cVar2;
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                a aVar4 = new a(r0VarS, this.f52390f, null);
                this.f52385a = 1;
                obj = ge1.b.Y(aVar4, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            com.garmin.gfdi.file.a aVar5 = this.f52386b;
            synchronized (aVar5.f52366g) {
                aVar5.f52369j = null;
                Unit unit2 = Unit.INSTANCE;
            }
            return obj;
        } catch (Throwable th4) {
            com.garmin.gfdi.file.a aVar6 = this.f52386b;
            synchronized (aVar6.f52366g) {
                aVar6.f52369j = null;
                Unit unit3 = Unit.INSTANCE;
                throw th4;
            }
        }
    }
}
