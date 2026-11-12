package com.garmin.android.apps.connectmobile.tag;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.q;
import fo1.f;
import io1.g;
import java.util.ArrayList;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.a2;
import r53.b2;
import r53.j;
import r53.l1;
import r53.p2;
import r53.q2;
import r53.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import yc.h3;
import yc.o;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/tag/b;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45059f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f45060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f45061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f45062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cs1.f f45063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f45064e;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.tag.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0861b implements e23.a<h3<Integer, ds1.a>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45066b;

        public C0861b(String str) {
            this.f45066b = str;
        }

        @Override // e23.a
        public final h3<Integer, ds1.a> invoke() {
            return new g(b.this.f45060a, this.f45066b, 1, 20);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.tag.TaggingSuggestionViewModel$special$$inlined$flatMapLatest$1", f = "TaggingSuggestionViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements q<j<? super v2<ds1.a>>, String, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ j f45068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f45069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f45070d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d dVar, b bVar) {
            super(3, dVar);
            this.f45070d = bVar;
        }

        @Override // e23.q
        public final Object invoke(j<? super v2<ds1.a>> jVar, String str, d<? super Unit> dVar) {
            c cVar = new c(dVar, this.f45070d);
            cVar.f45068b = jVar;
            cVar.f45069c = str;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f45067a;
            if (i14 == 0) {
                r.b(obj);
                j jVar = this.f45068b;
                Object obj2 = null;
                t2 t2Var = new t2(new u2(20, 0, false, 0, 0, 0, 62, null), obj2, this.f45070d.new C0861b((String) this.f45069c), 2, null);
                this.f45068b = null;
                this.f45069c = null;
                this.f45067a = 1;
                if (s.v(jVar, t2Var.f196485a, this) == aVar) {
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

    static {
        new a(null);
        f45059f = 8;
    }

    public b() {
        f.f72522b.getClass();
        this.f45060a = f.a.a();
        a22.i.f537b.getClass();
        a22.i.a.a();
        new ArrayList();
        p2 p2VarA = q2.a(null);
        this.f45061b = p2VarA;
        this.f45062c = s.d(p2VarA);
        this.f45064e = o.a(s.N(new l1(p2VarA), new c(null, this)), v1.a(this));
    }

    public final void x4(String str, cs1.f fVar) {
        str.getClass();
        this.f45063d = fVar;
        fVar.v3(com.garmin.android.apps.connectmobile.tag.a.d.f45056a);
        this.f45061b.k(null, str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/tag/b$a;", "", "<init>", "()V", "", "PAGING_SIZE", "I", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
