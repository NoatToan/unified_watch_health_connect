package mi0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import d53.w;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import li0.d0;
import li0.e0;
import li0.l0;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.k0;
import p13.u0;
import p13.y;
import r53.a2;
import r53.p2;
import r53.q2;
import r53.s;
import yc.i0;
import yc.o;
import yc.t2;
import yc.u2;
import yc.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lmi0/c;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "b", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f118707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f118708k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei0.d f118709a = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f118710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f118711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f118712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<String> f118713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r53.u1 f118714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f118715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f118716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r53.u1 f118717i;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmi0/c$b;", "", "Landroid/net/Uri;", "uri", "", "column", "<init>", "(Ljava/lang/String;ILandroid/net/Uri;Ljava/lang/String;)V", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f118718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f118719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b[] f118720e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f118721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f118722b;

        static {
            Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
            uri.getClass();
            b bVar = new b("PHONE", 0, uri, "data1");
            f118718c = bVar;
            Uri uri2 = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
            uri2.getClass();
            b bVar2 = new b("EMAIL", 1, uri2, "data1");
            f118719d = bVar2;
            f118720e = new b[]{bVar, bVar2};
        }

        private b(String str, int i14, Uri uri, String str2) {
            super(str, i14);
            this.f118721a = uri;
            this.f118722b = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f118720e.clone();
        }
    }

    /* JADX INFO: renamed from: mi0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendDiscoverListViewModel$contactsFlow$1", f = "FriendDiscoverListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C2253c extends v13.i implements q<Map<String, ? extends l0>, List<? extends d0>, t13.d<? super List<? extends d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ List f118724b;

        public C2253c(t13.d<? super C2253c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends l0> map, List<? extends d0> list, t13.d<? super List<? extends d0>> dVar) {
            C2253c c2253c = new C2253c(dVar);
            c2253c.f118723a = map;
            c2253c.f118724b = list;
            return c2253c.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118723a;
            List list = this.f118724b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(e0.f((d0) it.next(), map));
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"mi0/c$d", "Lli0/f;", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends li0.f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendDiscoverListViewModel$friendAction$1$updateStateData$1", f = "FriendDiscoverListViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f118726a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f118727b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f118728c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l0 f118729d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, String str, l0 l0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118727b = cVar;
                this.f118728c = str;
                this.f118729d = l0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f118727b, this.f118728c, this.f118729d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f118726a;
                if (i14 == 0) {
                    r.b(obj);
                    c cVar = this.f118727b;
                    LinkedHashMap linkedHashMapN = u0.n((Map) cVar.f118710b.getValue());
                    linkedHashMapN.put(this.f118728c, this.f118729d);
                    p2 p2Var = cVar.f118710b;
                    this.f118726a = 1;
                    p2Var.k(null, linkedHashMapN);
                    if (Unit.INSTANCE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public d(b0 b0Var) {
            super(b0Var, null, null, 6, null);
        }

        @Override // li0.f
        public final void l(int i14, String str) {
        }

        @Override // li0.f
        public final void n(String str, l0 l0Var) {
            if (str == null || l0Var == null) {
                return;
            }
            c cVar = c.this;
            ge1.b.T(v1.a(cVar), null, null, new a(cVar, str, l0Var, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lli0/l0;", "tempMap", "Lyc/v2;", "Lli0/d0;", "list", "<anonymous>", "(Ljava/util/Map;Lyc/v2;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendDiscoverListViewModel$searchFlow$1", f = "FriendDiscoverListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements q<Map<String, ? extends l0>, v2<d0>, t13.d<? super v2<d0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map f118730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ v2 f118731b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lli0/d0;", "data", "<anonymous>", "(Lli0/d0;)Lli0/d0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendDiscoverListViewModel$searchFlow$1$1", f = "FriendDiscoverListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<d0, t13.d<? super d0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f118732a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map<String, l0> f118733b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, l0> map, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f118733b = map;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f118733b, dVar);
                aVar.f118732a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(d0 d0Var, t13.d<? super d0> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                d0 d0Var = (d0) this.f118732a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return e0.f(d0Var, this.f118733b);
            }
        }

        public e(t13.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(Map<String, ? extends l0> map, v2<d0> v2Var, t13.d<? super v2<d0>> dVar) {
            e eVar = new e(dVar);
            eVar.f118730a = map;
            eVar.f118731b = v2Var;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map map = this.f118730a;
            v2 v2Var = this.f118731b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return i0.e(v2Var, new a(map, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f118734a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f118735a;

            /* JADX INFO: renamed from: mi0.c$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendDiscoverListViewModel$special$$inlined$filter$1$2", f = "FriendDiscoverListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2254a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f118736a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f118737b;

                public C2254a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f118736a = obj;
                    this.f118737b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f118735a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2254a c2254a;
                if (dVar instanceof C2254a) {
                    c2254a = (C2254a) dVar;
                    int i14 = c2254a.f118737b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2254a.f118737b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2254a = new C2254a(dVar);
                    }
                } else {
                    c2254a = new C2254a(dVar);
                }
                Object obj2 = c2254a.f118736a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2254a.f118737b;
                if (i15 == 0) {
                    r.b(obj2);
                    if (((String) obj).length() >= 2) {
                        c2254a.f118737b = 1;
                        if (this.f118735a.emit(obj, c2254a) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public f(r53.i iVar) {
            this.f118734a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f118734a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendDiscoverListViewModel$special$$inlined$flatMapLatest$1", f = "FriendDiscoverListViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements q<r53.j<? super v2<d0>>, String, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f118739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f118740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f118741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f118742d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(t13.d dVar, c cVar) {
            super(3, dVar);
            this.f118742d = cVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super v2<d0>> jVar, String str, t13.d<? super Unit> dVar) {
            g gVar = new g(dVar, this.f118742d);
            gVar.f118740b = jVar;
            gVar.f118741c = str;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f118739a;
            if (i14 == 0) {
                r.b(obj);
                r53.j jVar = this.f118740b;
                String str = (String) this.f118741c;
                c cVar = this.f118742d;
                synchronized (cVar.f118713e) {
                    cVar.f118713e.clear();
                    Unit unit = Unit.INSTANCE;
                }
                a2 a2VarA = o.a(new t2(new u2(20, 0, false, 0, 0, 0, 62, null), null, new l30.i0(28, cVar, str), 2, null).f196485a, v1.a(cVar));
                this.f118740b = null;
                this.f118741c = null;
                this.f118739a = 1;
                if (s.v(jVar, a2VarA, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f118743a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f118744a;

            /* JADX INFO: renamed from: mi0.c$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.follow.viewmodel.FriendDiscoverListViewModel$special$$inlined$map$1$2", f = "FriendDiscoverListViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2255a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f118745a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f118746b;

                public C2255a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f118745a = obj;
                    this.f118746b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f118744a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2255a c2255a;
                if (dVar instanceof C2255a) {
                    c2255a = (C2255a) dVar;
                    int i14 = c2255a.f118746b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2255a.f118746b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2255a = new C2255a(dVar);
                    }
                } else {
                    c2255a = new C2255a(dVar);
                }
                Object obj2 = c2255a.f118745a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2255a.f118746b;
                if (i15 == 0) {
                    r.b(obj2);
                    String string = w.i0((String) obj).toString();
                    c2255a.f118746b = 1;
                    if (this.f118744a.emit(string, c2255a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public h(r53.i iVar) {
            this.f118743a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f118743a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f118707j = 8;
        f118708k = "FriendDiscoverListViewModel";
    }

    public c() {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        p2 p2VarA = q2.a(k0Var);
        this.f118710b = p2VarA;
        this.f118711c = new d(v1.a(this));
        p2 p2VarA2 = q2.a("");
        this.f118712d = p2VarA2;
        Set<String> setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        setSynchronizedSet.getClass();
        this.f118713e = setSynchronizedSet;
        this.f118714f = new r53.u1(p2VarA, s.N(s.q(new f(new h(p2VarA2)), 500L), new g(null, this)), new e(null));
        p2 p2VarA3 = q2.a(j0.f134944a);
        this.f118715g = p2VarA3;
        this.f118716h = q2.a(Boolean.FALSE);
        this.f118717i = new r53.u1(p2VarA, p2VarA3, new C2253c(null));
    }

    public static final List x4(c cVar, Context context, b bVar) {
        cVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        String str = bVar.f118722b;
        String strG = tn.k.g(str, " NOT LIKE ''");
        Cursor cursorQuery = contentResolver.query(bVar.f118721a, new String[]{"_id", str}, strG, null, null);
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            do {
                String string = cursorQuery.getString(1);
                string.getClass();
                linkedHashSet.add(string);
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
        }
        return h0.b1(linkedHashSet);
    }

    public final void y4(Context context) {
        context.getClass();
        j22.b bVar = j22.b.f96736a;
        j22.a[] aVarArr = {j22.a.f96717f};
        bVar.getClass();
        if (j22.b.k(aVarArr)) {
            ge1.b.T(v1.a(this), null, null, new mi0.d(this, context, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmi0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PAGING_SIZE", "I", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
