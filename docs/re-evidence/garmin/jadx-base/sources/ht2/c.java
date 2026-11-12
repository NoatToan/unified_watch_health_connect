package ht2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lht2/c;", "", "<init>", "()V", "a", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f85627a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z53.b f85628b = z53.c.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f85629c = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f85633d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f85633d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objA = dVar.f85631b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f85633d;
        if (i15 == 0) {
            o13.r.b(objA);
            dVar.f85630a = str2;
            dVar.f85633d = 1;
            objA = a.a(f85627a, str, dVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = dVar.f85630a;
            o13.r.b(objA);
        }
        return ((SharedPreferences) objA).getString(str2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"ApplySharedPref"})
    public final Object b(String str, String str2, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f85637d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f85637d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objA = eVar.f85635b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f85637d;
        if (i15 == 0) {
            o13.r.b(objA);
            eVar.f85634a = str2;
            eVar.f85637d = 1;
            objA = a.a(f85627a, str, eVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = eVar.f85634a;
            o13.r.b(objA);
        }
        ((SharedPreferences) objA).edit().remove(str2).commit();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ApplySharedPref"})
    public final Object c(String str, zy2.j jVar, v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f85641d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f85641d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objA = fVar.f85639b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f85641d;
        if (i15 == 0) {
            o13.r.b(objA);
            fVar.f85638a = jVar;
            fVar.f85641d = 1;
            objA = a.a(f85627a, str, fVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = fVar.f85638a;
            o13.r.b(objA);
        }
        ((SharedPreferences) objA).edit().putString((String) jVar.f207533a, (String) jVar.f207534b).commit();
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lht2/c$a;", "", "<init>", "()V", "Lz53/a;", "lock", "Lz53/a;", "", "", "Landroid/content/SharedPreferences;", "map", "Ljava/util/Map;", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Object a(a aVar, String str, v13.c cVar) {
            b bVar;
            z53.b bVar2;
            r0 r0Var;
            aVar.getClass();
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i14 = bVar.f85626f;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    bVar.f85626f = i14 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(aVar, cVar);
                }
            } else {
                bVar = new b(aVar, cVar);
            }
            Object obj = bVar.f85624d;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = bVar.f85626f;
            if (i15 == 0) {
                r0 r0VarS = wr.g.s(obj);
                bVar2 = c.f85628b;
                bVar.f85621a = str;
                bVar.f85622b = r0VarS;
                bVar.f85623c = bVar2;
                bVar.f85626f = 1;
                if (bVar2.c(bVar) == aVar2) {
                    return aVar2;
                }
                r0Var = r0VarS;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z53.b bVar3 = bVar.f85623c;
                r0Var = bVar.f85622b;
                String str2 = bVar.f85621a;
                o13.r.b(obj);
                bVar2 = bVar3;
                str = str2;
            }
            try {
                LinkedHashMap linkedHashMap = c.f85629c;
                Object obj2 = linkedHashMap.get(str);
                T t7 = obj2;
                if (obj2 == null) {
                    String strA = td.b.a(td.b.f163878a);
                    zy2.d.f207528a.getClass();
                    Context context = zy2.d.f207529b;
                    if (context == null) {
                        throw new IllegalStateException("'AppContext' not initialized");
                    }
                    td.a aVarA = td.a.a(str, strA, context, td.a.d.AES256_SIV, td.a.e.AES256_GCM);
                    linkedHashMap.put(str, aVarA);
                    t7 = aVarA;
                }
                r0Var.f105810a = t7;
                Unit unit = Unit.INSTANCE;
                bVar2.e(null);
                return r0Var.f105810a;
            } catch (Throwable th3) {
                bVar2.e(null);
                throw th3;
            }
        }

        private a() {
        }
    }
}
