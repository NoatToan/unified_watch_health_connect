package p006l2;

import b5.h0;
import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import o53.d0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.h1;
import p008y1.m0;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo53/l1;", "<anonymous>", "(Lo53/b0;)Lo53/l1;"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, d<? super l1>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f108549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h0 f108550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p2 f108551c;

        /* JADX INFO: renamed from: l2.h2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {67}, m = "invokeSuspend", v = 1)
        public static final class C2086a extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f108552a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f108553b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p2 f108554c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2086a(h0 h0Var, p2 p2Var, d<? super C2086a> dVar) {
                super(2, dVar);
                this.f108553b = h0Var;
                this.f108554c = p2Var;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C2086a(this.f108553b, this.f108554c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((C2086a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object obj2 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f108552a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f108552a = 1;
                    Object objC = h1.c(this.f108553b, new i2(this.f108554c, null), this);
                    if (objC != obj2) {
                        objC = Unit.INSTANCE;
                    }
                    if (objC == obj2) {
                        return obj2;
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {68}, m = "invokeSuspend", v = 1)
        public static final class b extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f108555a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f108556b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p2 f108557c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h0 h0Var, p2 p2Var, d<? super b> dVar) {
                super(2, dVar);
                this.f108556b = h0Var;
                this.f108557c = p2Var;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new b(this.f108556b, this.f108557c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object obj2 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f108555a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f108555a = 1;
                    final int i15 = 0;
                    final p2 p2Var = this.f108557c;
                    f2 f2Var = new f2(p2Var, 0);
                    e23.a aVar = new e23.a() { // from class: l2.g2
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    p2Var.onStop();
                                    break;
                                default:
                                    p2Var.onCancel();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    final int i16 = 1;
                    Object objF = m0.f(this.f108556b, f2Var, aVar, new e23.a() { // from class: l2.g2
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    p2Var.onStop();
                                    break;
                                default:
                                    p2Var.onCancel();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new kk1.h(p2Var, 14), this);
                    if (objF != obj2) {
                        objF = Unit.INSTANCE;
                    }
                    if (objF == obj2) {
                        return obj2;
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
        public a(h0 h0Var, p2 p2Var, d<? super a> dVar) {
            super(2, dVar);
            this.f108550b = h0Var;
            this.f108551c = p2Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f108550b, this.f108551c, dVar);
            aVar.f108549a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super l1> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            b0 b0Var = (b0) this.f108549a;
            d0 d0Var = d0.UNDISPATCHED;
            h0 h0Var = this.f108550b;
            p2 p2Var = this.f108551c;
            ge1.b.T(b0Var, null, d0Var, new C2086a(h0Var, p2Var, null), 1);
            return ge1.b.T(b0Var, null, d0Var, new b(h0Var, p2Var, null), 1);
        }
    }

    public static final Object a(h0 h0Var, p2 p2Var, d<? super Unit> dVar) {
        Object objE = c0.e(new a(h0Var, p2Var, null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }
}
