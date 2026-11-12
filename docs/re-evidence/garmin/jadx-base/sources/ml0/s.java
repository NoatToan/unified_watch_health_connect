package ml0;

import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.search.SearchGolfCoursesViewModel$onSearchQueryChanged$1", f = "SearchGolfCoursesViewModel.kt", l = {121, 123, 124, 127}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f119292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f119293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, p pVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f119292b = str;
        this.f119293c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f119292b, this.f119293c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        if (r2.a(r16) == r1) goto L47;
     */
    /* JADX WARN: Type inference failed for: r4v2, types: [Key] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119291a;
        p pVar = this.f119293c;
        if (i14 == 0) {
            o13.r.b(obj);
            String str = this.f119292b;
            int length = str.length() - 1;
            int i15 = 0;
            boolean z14 = false;
            while (i15 <= length) {
                boolean z15 = p005kotlin.jvm.internal.s.h(str.charAt(!z14 ? i15 : length), 32) <= 0;
                if (z14) {
                    if (!z15) {
                        break;
                    }
                    length--;
                } else if (z15) {
                    i15++;
                } else {
                    z14 = true;
                }
            }
            if (str.subSequence(i15, length + 1).toString().length() < 3) {
                return Unit.INSTANCE;
            }
            this.f119291a = 1;
            if (m0.b(2000L, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                this.f119291a = 3;
                if (gg.b.U(this) != aVar) {
                    pVar.f119266g.k(null, new l(false, this.f119292b, null, false, false, 0, k.NAME, 61, null));
                    m02.b<Integer, o13.p<fl0.a, il0.c>> bVar = pVar.f119269j;
                    bVar.f115752g = bVar.f115746a;
                    this.f119291a = 4;
                }
                return aVar;
            }
            if (i14 == 3) {
                o13.r.b(obj);
                pVar.f119266g.k(null, new l(false, this.f119292b, null, false, false, 0, k.NAME, 61, null));
                m02.b<Integer, o13.p<fl0.a, il0.c>> bVar2 = pVar.f119269j;
                bVar2.f115752g = bVar2.f115746a;
                this.f119291a = 4;
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        if (pVar.f119265f == null) {
            this.f119291a = 2;
            if (p.x4(pVar, this) != aVar) {
                this.f119291a = 3;
                if (gg.b.U(this) != aVar) {
                    pVar.f119266g.k(null, new l(false, this.f119292b, null, false, false, 0, k.NAME, 61, null));
                    m02.b<Integer, o13.p<fl0.a, il0.c>> bVar3 = pVar.f119269j;
                    bVar3.f115752g = bVar3.f115746a;
                    this.f119291a = 4;
                }
            }
        } else {
            this.f119291a = 3;
            if (gg.b.U(this) != aVar) {
                pVar.f119266g.k(null, new l(false, this.f119292b, null, false, false, 0, k.NAME, 61, null));
                m02.b<Integer, o13.p<fl0.a, il0.c>> bVar4 = pVar.f119269j;
                bVar4.f115752g = bVar4.f115746a;
                this.f119291a = 4;
            }
        }
        return aVar;
    }
}
