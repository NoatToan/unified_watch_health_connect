package com.google.firebase.datastorage;

import android.content.Context;
import android.os.Process;
import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import e23.p;
import g23.d;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k23.l;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.k0;
import p005kotlin.jvm.internal.s0;
import p13.w;
import r53.s;
import u7.k;
import v13.e;
import v13.i;
import vb.h;
import x53.c;
import x7.j;
import y7.b;
import y7.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120'*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/google/firebase/datastorage/JavaDataStorage;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Ly7/g$a;", Action.KEY_ATTRIBUTE, "defaultValue", "getSync", "(Ly7/g$a;Ljava/lang/Object;)Ljava/lang/Object;", "", "contains", "(Ly7/g$a;)Z", "value", "Ly7/g;", "putSync", "(Ly7/g$a;Ljava/lang/Object;)Ly7/g;", "", "getAllSync", "()Ljava/util/Map;", "Lkotlin/Function1;", "Ly7/b;", "", "transform", "editSync", "(Le23/l;)Ly7/g;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "editLock", "Ljava/lang/ThreadLocal;", "Lu7/k;", "dataStore$delegate", "Lg23/d;", "getDataStore", "(Landroid/content/Context;)Lu7/k;", "dataStore", "Lu7/k;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaDataStorage {
    static final /* synthetic */ l<Object>[] $$delegatedProperties = {s0.f105811a.i(new k0(JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    private final Context context;
    private final k<g> dataStore;

    /* JADX INFO: renamed from: dataStore$delegate, reason: from kotlin metadata */
    private final d dataStore;
    private final ThreadLocal<Boolean> editLock;
    private final String name;

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$contains$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$contains$1", f = "JavaDataStorage.kt", l = {124}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Boolean>, Object> {
        final /* synthetic */ g.a<T> $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g.a<T> aVar, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$key = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return JavaDataStorage.this.new AnonymousClass1(this.$key, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                r53.i data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = s.y(data, this);
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
            g gVar = (g) obj;
            return Boolean.valueOf(gVar != null ? gVar.b(this.$key) : false);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ly7/g;", "<anonymous>", "(Lo53/b0;)Ly7/g;"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {220}, m = "invokeSuspend")
    public static final class C39161 extends i implements p<b0, t13.d<? super g>, Object> {
        final /* synthetic */ e23.l<b, Unit> $transform;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly7/b;", "it", "", "<anonymous>", "(Ly7/b;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        public static final class C11531 extends i implements p<b, t13.d<? super Unit>, Object> {
            final /* synthetic */ e23.l<b, Unit> $transform;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11531(e23.l<? super b, Unit> lVar, t13.d<? super C11531> dVar) {
                super(2, dVar);
                this.$transform = lVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C11531 c11531 = new C11531(this.$transform, dVar);
                c11531.L$0 = obj;
                return c11531;
            }

            @Override // e23.p
            public final Object invoke(b bVar, t13.d<? super Unit> dVar) {
                return ((C11531) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                this.$transform.invoke((b) this.L$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C39161(e23.l<? super b, Unit> lVar, t13.d<? super C39161> dVar) {
            super(2, dVar);
            this.$transform = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return JavaDataStorage.this.new C39161(this.$transform, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super g> dVar) {
            return ((C39161) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    Object obj2 = JavaDataStorage.this.editLock.get();
                    Boolean bool = Boolean.TRUE;
                    if (p005kotlin.jvm.internal.s.g(obj2, bool)) {
                        h.z("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        return null;
                    }
                    JavaDataStorage.this.editLock.set(bool);
                    k kVar = JavaDataStorage.this.dataStore;
                    C11531 c11531 = new C11531(this.$transform, null);
                    this.label = 1;
                    obj = kVar.a(new y7.i(c11531, null), this);
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
                g gVar = (g) obj;
                JavaDataStorage.this.editLock.set(Boolean.FALSE);
                return gVar;
            } catch (Throwable th3) {
                JavaDataStorage.this.editLock.set(Boolean.FALSE);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getAllSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "Ly7/g$a;", "", "<anonymous>", "(Lo53/b0;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {170}, m = "invokeSuspend")
    public static final class C39171 extends i implements p<b0, t13.d<? super Map<g.a<?>, ? extends Object>>, Object> {
        int label;

        public C39171(t13.d<? super C39171> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return JavaDataStorage.this.new C39171(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Map<g.a<?>, ? extends Object>> dVar) {
            return ((C39171) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                r53.i data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = s.y(data, this);
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
            g gVar = (g) obj;
            if (gVar != null) {
                return gVar.a();
            }
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", l = {104}, m = "invokeSuspend")
    public static final class C39181<T> extends i implements p<b0, t13.d<? super T>, Object> {
        final /* synthetic */ T $defaultValue;
        final /* synthetic */ g.a<T> $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39181(g.a<T> aVar, T t7, t13.d<? super C39181> dVar) {
            super(2, dVar);
            this.$key = aVar;
            this.$defaultValue = t7;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return JavaDataStorage.this.new C39181(this.$key, this.$defaultValue, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super T> dVar) {
            return ((C39181) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objC;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                r53.i<T> data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = s.y(data, this);
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
            g gVar = (g) obj;
            return (gVar == null || (objC = gVar.c(this.$key)) == null) ? this.$defaultValue : objC;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ly7/g;", "<anonymous>", "(Lo53/b0;)Ly7/g;"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {145}, m = "invokeSuspend")
    public static final class C39191 extends i implements p<b0, t13.d<? super g>, Object> {
        final /* synthetic */ g.a<T> $key;
        final /* synthetic */ T $value;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly7/b;", "it", "", "<anonymous>", "(Ly7/b;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        public static final class C11541 extends i implements p<b, t13.d<? super Unit>, Object> {
            final /* synthetic */ g.a<T> $key;
            final /* synthetic */ T $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11541(g.a<T> aVar, T t7, t13.d<? super C11541> dVar) {
                super(2, dVar);
                this.$key = aVar;
                this.$value = t7;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C11541 c11541 = new C11541(this.$key, this.$value, dVar);
                c11541.L$0 = obj;
                return c11541;
            }

            @Override // e23.p
            public final Object invoke(b bVar, t13.d<? super Unit> dVar) {
                return ((C11541) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                ((b) this.L$0).e(this.$key, this.$value);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39191(g.a<T> aVar, T t7, t13.d<? super C39191> dVar) {
            super(2, dVar);
            this.$key = aVar;
            this.$value = t7;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return JavaDataStorage.this.new C39191(this.$key, this.$value, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super g> dVar) {
            return ((C39191) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            k kVar = JavaDataStorage.this.dataStore;
            C11541 c11541 = new C11541(this.$key, this.$value, null);
            this.label = 1;
            Object objA = kVar.a(new y7.i(c11541, null), this);
            return objA == aVar ? aVar : objA;
        }
    }

    public JavaDataStorage(Context context, String str) {
        context.getClass();
        str.getClass();
        this.context = context;
        this.name = str;
        this.editLock = new ThreadLocal<>();
        final int i14 = 0;
        v7.b bVar = new v7.b(new e23.l(this) { // from class: com.google.firebase.datastorage.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JavaDataStorage f53731b;

            {
                this.f53731b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return JavaDataStorage.dataStore_delegate$lambda$0(this.f53731b, (CorruptionException) obj);
                    default:
                        return JavaDataStorage.dataStore_delegate$lambda$1(this.f53731b, (Context) obj);
                }
            }
        });
        final int i15 = 1;
        e23.l lVar = new e23.l(this) { // from class: com.google.firebase.datastorage.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JavaDataStorage f53731b;

            {
                this.f53731b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return JavaDataStorage.dataStore_delegate$lambda$0(this.f53731b, (CorruptionException) obj);
                    default:
                        return JavaDataStorage.dataStore_delegate$lambda$1(this.f53731b, (Context) obj);
                }
            }
        };
        c cVar = o53.s0.f129406a;
        this.dataStore = new x7.b(str, bVar, lVar, c0.a(x53.b.f189152a.plus(ge1.b.h())));
        this.dataStore = getDataStore(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g dataStore_delegate$lambda$0(JavaDataStorage javaDataStorage, CorruptionException corruptionException) {
        corruptionException.getClass();
        s0.f105811a.b(JavaDataStorage.class).D();
        String str = javaDataStorage.name;
        Process.myPid();
        return new b(null, true, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dataStore_delegate$lambda$1(JavaDataStorage javaDataStorage, Context context) {
        context.getClass();
        String str = javaDataStorage.name;
        LinkedHashSet linkedHashSet = j.f189377a;
        str.getClass();
        linkedHashSet.getClass();
        return w.c(new w7.a(context, str, null, new x7.i(linkedHashSet, null), new x7.h(null), 4, null));
    }

    private final k<g> getDataStore(Context context) {
        return (k) this.dataStore.getValue(context, $$delegatedProperties[0]);
    }

    public final <T> boolean contains(g.a<T> key) {
        key.getClass();
        return ((Boolean) ge1.b.W(t13.h.f161748a, new AnonymousClass1(key, null))).booleanValue();
    }

    public final g editSync(e23.l<? super b, Unit> transform) {
        transform.getClass();
        return (g) ge1.b.W(t13.h.f161748a, new C39161(transform, null));
    }

    public final Map<g.a<?>, Object> getAllSync() {
        return (Map) ge1.b.W(t13.h.f161748a, new C39171(null));
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getName() {
        return this.name;
    }

    public final <T> T getSync(g.a<T> key, T defaultValue) {
        key.getClass();
        return (T) ge1.b.W(t13.h.f161748a, new C39181(key, defaultValue, null));
    }

    public final <T> g putSync(g.a<T> key, T value) {
        key.getClass();
        return (g) ge1.b.W(t13.h.f161748a, new C39191(key, value, null));
    }
}
