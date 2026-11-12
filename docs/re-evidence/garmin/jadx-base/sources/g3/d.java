package g3;

import a5.j;
import e23.l;
import e23.p;
import g6.s;
import o13.r;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BG\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg3/d;", "La5/a;", "Lkotlin/Function1;", "", "onPull", "Lkotlin/Function2;", "Lt13/d;", "", "onRelease", "", "enabled", "<init>", "(Le23/l;Le23/p;Z)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements a5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<Float, Float> f75583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<Float, t13.d<? super Float>, Object> f75584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75585c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {98}, m = "onPreFling-QWom1Mo", v = 1)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f75586a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f75588c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f75586a = obj;
            this.f75588c |= Integer.MIN_VALUE;
            return d.this.mo3onPreFlingQWom1Mo(0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super Float, Float> lVar, p<? super Float, ? super t13.d<? super Float>, ? extends Object> pVar, boolean z14) {
        this.f75583a = lVar;
        this.f75584b = pVar;
        this.f75585c = z14;
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo2onPostScrollDzOQY0M(long j8, long j14, int i14) {
        if (!this.f75585c) {
            n4.c.f123541b.getClass();
            return 0L;
        }
        j.f1233b.getClass();
        if (i14 == j.f1234c) {
            int i15 = (int) (j14 & 4294967295L);
            if (Float.intBitsToFloat(i15) > 0.0f) {
                long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(this.f75583a.invoke(Float.valueOf(Float.intBitsToFloat(i15))).floatValue()))) | (Float.floatToRawIntBits(0.0f) << 32);
                n4.c.a aVar = n4.c.f123541b;
                return jFloatToRawIntBits;
            }
        }
        n4.c.f123541b.getClass();
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a5.a
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo3onPreFlingQWom1Mo(long j8, t13.d<? super s> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f75588c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f75588c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objInvoke = aVar.f75586a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f75588c;
        if (i15 == 0) {
            r.b(objInvoke);
            Float f14 = new Float(s.d(j8));
            aVar.f75588c = 1;
            objInvoke = this.f75584b.invoke(f14, aVar);
            if (objInvoke == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objInvoke);
        }
        return s.a(xy2.b.h(0.0f, ((Number) objInvoke).floatValue()));
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo4onPreScrollOzD1aCk(long j8, int i14) {
        if (!this.f75585c) {
            n4.c.f123541b.getClass();
            return 0L;
        }
        j.f1233b.getClass();
        if (i14 == j.f1234c) {
            int i15 = (int) (j8 & 4294967295L);
            if (Float.intBitsToFloat(i15) < 0.0f) {
                float fFloatValue = this.f75583a.invoke(Float.valueOf(Float.intBitsToFloat(i15))).floatValue();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue)) & 4294967295L);
                n4.c.a aVar = n4.c.f123541b;
                return jFloatToRawIntBits;
            }
        }
        n4.c.f123541b.getClass();
        return 0L;
    }
}
