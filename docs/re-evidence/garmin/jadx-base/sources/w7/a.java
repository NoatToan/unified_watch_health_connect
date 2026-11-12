package w7;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.p;
import e23.q;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o13.m;
import o13.r;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p13.h0;
import u7.f;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0019B\u0089\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015Bw\b\u0017\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0004\b\u0014\u0010\u0016By\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0004\b\u0014\u0010\u0018¨\u0006\u001a"}, d2 = {"Lw7/a;", "T", "Lu7/f;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Lkotlin/Function2;", "Lt13/d;", "", "", "shouldRunMigration", "Lkotlin/Function3;", "Lw7/d;", "migrate", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "name", "<init>", "(Le23/a;Ljava/util/Set;Le23/p;Le23/q;Landroid/content/Context;Ljava/lang/String;)V", "(Le23/a;Ljava/util/Set;Le23/p;Le23/q;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Le23/p;Le23/q;)V", JWKParameterNames.RSA_EXPONENT, "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<T, t13.d<? super Boolean>, Object> f183417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q<w7.d, T, t13.d<? super T>, Object> f183418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f183419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f183420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f183421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<String> f183422f;

    /* JADX INFO: renamed from: w7.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @v13.e(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    public static final class C3396a extends i implements p<T, t13.d<? super Boolean>, Object> {
        public C3396a(t13.d<? super C3396a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C3396a(dVar);
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Boolean> dVar) {
            new C3396a(dVar).invokeSuspend(Unit.INSTANCE);
            return Boolean.TRUE;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @v13.e(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    public static final class b extends i implements p<T, t13.d<? super Boolean>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Boolean> dVar) {
            new b(dVar).invokeSuspend(Unit.INSTANCE);
            return Boolean.TRUE;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @v13.e(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    public static final class c extends i implements p<T, t13.d<? super Boolean>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Boolean> dVar) {
            new c(dVar).invokeSuspend(Unit.INSTANCE);
            return Boolean.TRUE;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d extends w implements e23.a<SharedPreferences> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f183423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f183424b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, String str) {
            super(0);
            this.f183423a = context;
            this.f183424b = str;
        }

        @Override // e23.a
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f183423a.getSharedPreferences(this.f183424b, 0);
            sharedPreferences.getClass();
            return sharedPreferences;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw7/a$e;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e {
        static {
            new e();
        }

        private e() {
        }

        public static final boolean a(Context context, String name) {
            context.getClass();
            name.getClass();
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(e23.a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super t13.d<? super Boolean>, ? extends Object> pVar, q<? super w7.d, ? super T, ? super t13.d<? super T>, ? extends Object> qVar, Context context, String str) {
        this.f183417a = pVar;
        this.f183418b = qVar;
        this.f183419c = context;
        this.f183420d = str;
        this.f183421e = m.b(aVar);
        this.f183422f = set == w7.c.f183429a ? null : h0.f1(set);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u7.f
    public final Object a(Object obj, v13.c cVar) {
        w7.b bVar;
        a<T> aVar;
        if (cVar instanceof w7.b) {
            bVar = (w7.b) cVar;
            int i14 = bVar.f183428d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f183428d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new w7.b(this, cVar);
            }
        } else {
            bVar = new w7.b(this, cVar);
        }
        Object objInvoke = bVar.f183426b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f183428d;
        boolean z14 = true;
        if (i15 == 0) {
            r.b(objInvoke);
            bVar.f183425a = this;
            bVar.f183428d = 1;
            objInvoke = this.f183417a.invoke(obj, bVar);
            if (objInvoke == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = bVar.f183425a;
            r.b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set<String> set = aVar.f183422f;
        t tVar = aVar.f183421e;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) tVar.getValue()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z14 = false;
            }
        } else {
            Set<String> set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) tVar.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z14 = false;
            } else {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z14 = false;
            }
        }
        return Boolean.valueOf(z14);
    }

    @Override // u7.f
    public final Object b(Object obj, u7.i iVar) {
        return this.f183418b.invoke(new w7.d((SharedPreferences) this.f183421e.getValue(), this.f183422f), obj, iVar);
    }

    @Override // u7.f
    public final Unit cleanUp() throws IOException {
        Context context;
        String str;
        t tVar = this.f183421e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) tVar.getValue()).edit();
        Set<String> set = this.f183422f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            h.C("Unable to delete migrated keys from SharedPreferences.");
            return null;
        }
        if (((SharedPreferences) tVar.getValue()).getAll().isEmpty() && (context = this.f183419c) != null && (str = this.f183420d) != null) {
            e.a(context, str);
        }
        if (set != null) {
            set.clear();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, Set<String> set, q<? super w7.d, ? super T, ? super t13.d<? super T>, ? extends Object> qVar) {
        this(context, str, set, null, qVar, 8, null);
        context.getClass();
        str.getClass();
        set.getClass();
        qVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e23.a<? extends SharedPreferences> aVar, q<? super w7.d, ? super T, ? super t13.d<? super T>, ? extends Object> qVar) {
        this(aVar, (Set) null, (p) null, qVar, 6, (j) null);
        aVar.getClass();
        qVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e23.a<? extends SharedPreferences> aVar, Set<String> set, q<? super w7.d, ? super T, ? super t13.d<? super T>, ? extends Object> qVar) {
        this(aVar, set, (p) null, qVar, 4, (j) null);
        aVar.getClass();
        set.getClass();
        qVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, q<? super w7.d, ? super T, ? super t13.d<? super T>, ? extends Object> qVar) {
        this(context, str, null, null, qVar, 12, null);
        context.getClass();
        str.getClass();
        qVar.getClass();
    }

    public /* synthetic */ a(e23.a aVar, Set set, p pVar, q qVar, Context context, String str, int i14, j jVar) {
        this((e23.a<? extends SharedPreferences>) aVar, (Set<String>) set, (i14 & 4) != 0 ? new C3396a(null) : pVar, qVar, context, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e23.a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super t13.d<? super Boolean>, ? extends Object> pVar, q<? super w7.d, ? super T, ? super t13.d<? super T>, ? extends Object> qVar) {
        this(aVar, set, pVar, qVar, (Context) null, (String) null);
        aVar.getClass();
        set.getClass();
        pVar.getClass();
        qVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, Set<String> set, p<? super T, ? super t13.d<? super Boolean>, ? extends Object> pVar, q<? super w7.d, ? super T, ? super t13.d<? super T>, ? extends Object> qVar) {
        this(new d(context, str), set, pVar, qVar, context, str);
        context.getClass();
        str.getClass();
        set.getClass();
        pVar.getClass();
        qVar.getClass();
    }

    public a(Context context, String str, Set set, p pVar, q qVar, int i14, j jVar) {
        this(context, str, (i14 & 4) != 0 ? w7.c.f183429a : set, (i14 & 8) != 0 ? new c(null) : pVar, qVar);
    }

    public a(e23.a aVar, Set set, p pVar, q qVar, int i14, j jVar) {
        this((e23.a<? extends SharedPreferences>) aVar, (Set<String>) ((i14 & 2) != 0 ? w7.c.f183429a : set), (i14 & 4) != 0 ? new b(null) : pVar, qVar);
    }
}
