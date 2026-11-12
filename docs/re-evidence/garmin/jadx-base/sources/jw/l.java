package jw;

import android.text.TextUtils;
import android.util.Pair;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l<T extends s1, RT> extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public lj0.j f101276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d80.d f101277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object[] f101278k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lj0.g f101279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<Pair<String, String>> f101280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Class<T> f101281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d80.g f101282o;

    public class a implements lj0.k {
        public a() {
        }

        @Override // lj0.k
        public final void a(lj0.b bVar) {
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar;
            l lVar = l.this;
            if (bVar != null) {
                String str = bVar.f112959c;
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                Class<T> cls = lVar.f101281n;
                lj0.g gVar = lVar.f101279l;
                lj0.c cVar2 = bVar.f112957a;
                if (cls != null) {
                    i2.n("GCOperationTask", "task failed (" + cVar2.name() + "): " + str + " >> for " + lVar.f101281n);
                } else {
                    i2.n("GCOperationTask", "task failed (" + cVar2.name() + "): " + str + " >> for " + gVar.b() + ": " + gVar.getURI());
                }
            }
            lVar.getClass();
            if (bVar != null) {
                switch (b.f101285b[bVar.f112957a.ordinal()]) {
                    case 1:
                        cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.UNAUTHORIZED;
                        break;
                    case 2:
                        cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE;
                        break;
                    case 3:
                    case 4:
                        cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.RECOVERABLE;
                        break;
                    case 5:
                        int i14 = bVar.f112958b;
                        if (i14 == 401) {
                            cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHENTICATED;
                            break;
                        } else if (i14 == 403) {
                            cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHORIZED;
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
                        break;
                    default:
                        cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
                        break;
                }
            } else {
                cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            }
            lVar.c(cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // lj0.k
        public final void b(lj0.e.a aVar) {
            Object objC;
            l lVar = l.this;
            Class<T> cls = lVar.f101281n;
            d80.d dVar = lVar.f101277j;
            d80.g gVar = lVar.f101282o;
            Class<T> cls2 = lVar.f101281n;
            lj0.g gVar2 = lVar.f101279l;
            if (cls != null) {
                i2.d("GCOperationTask", "onResultsSucceeded for ".concat(cls.getSimpleName()));
            } else {
                i2.d("GCOperationTask", "onResultsSucceeded for " + gVar2.b() + ": " + gVar2.getURI());
            }
            int i14 = aVar.f112978b;
            d80.g gVar3 = d80.g.NO_PARSING;
            if (gVar == gVar3) {
                if (cls2 != null) {
                    i2.d("GCOperationTask", "no parsing required for ".concat(cls2.getSimpleName()));
                } else {
                    i2.d("GCOperationTask", "no parsing required for " + gVar2.b() + ": " + gVar2.getURI());
                }
                lVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
                return;
            }
            String str = (String) aVar.f112977a;
            if (TextUtils.isEmpty(str) && gVar != gVar3) {
                if (cls2 != null) {
                    i2.d("GCOperationTask", "received empty response for ".concat(cls2.getSimpleName()));
                } else {
                    i2.d("GCOperationTask", "received empty response for " + gVar2.b() + ": " + gVar2.getURI());
                }
                lj0.b bVar = lj0.b.f112950d;
                lVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                return;
            }
            int i15 = b.f101284a[gVar.ordinal()];
            if (i15 == 1) {
                dVar.getClass();
                objC = d80.d.c(cls2, str);
            } else if (i15 == 2) {
                dVar.getClass();
                objC = d80.d.b(cls2, str);
            } else if (i15 != 3) {
                objC = str;
                objC = null;
            }
            if (objC == null && cls2 != null) {
                i2.d("GCOperationTask", "invalid resultObject for ".concat(cls2.getSimpleName()));
                lj0.b bVar2 = lj0.b.f112950d;
                lVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                return;
            }
            try {
                lVar.d(objC);
                if (cls2 != null) {
                    i2.d("GCOperationTask", "task completed successfully for ".concat(cls2.getSimpleName()));
                } else {
                    i2.d("GCOperationTask", "task completed successfully for " + gVar2.b() + ": " + gVar2.getURI());
                }
                lVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            } catch (ClassCastException e4) {
                if (cls2 != null) {
                    i2.i("GCOperationTask", "return type mismatch for " + cls2.getSimpleName() + "error: " + e4.getMessage());
                }
                lj0.b bVar3 = lj0.b.f112950d;
                lVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f101285b;

        static {
            int[] iArr = new int[lj0.c.values().length];
            f101285b = iArr;
            try {
                iArr[lj0.c.OAUTH_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101285b[lj0.c.CONNECT_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101285b[lj0.c.IO_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f101285b[lj0.c.SSL_EXCEPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f101285b[lj0.c.ERROR_CODE_RESPONSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f101285b[lj0.c.NULL_GC_DATA_RESPONSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f101285b[lj0.c.JSON_EXCEPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f101285b[lj0.c.UNKNOWN_EXCEPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[d80.g.values().length];
            f101284a = iArr2;
            try {
                iArr2[d80.g.JSON_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f101284a[d80.g.JSON_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f101284a[d80.g.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public l(com.garmin.android.library.backgroundtaskmanagement.b bVar, Object[] objArr, lj0.g gVar, List<Pair<String, String>> list, Class<T> cls, d80.g gVar2, boolean z14) {
        super(bVar, z14);
        this.f101278k = objArr;
        this.f101279l = gVar;
        this.f101280m = list;
        this.f101281n = cls;
        this.f101282o = gVar2;
        this.f101277j = new d80.d();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        lj0.g gVar = this.f101279l;
        Class<T> cls = this.f101281n;
        if (cls != null) {
            i2.d("GCOperationTask", "executing task for ".concat(cls.getSimpleName()));
        } else {
            i2.d("GCOperationTask", "executing task for " + gVar.getURI());
        }
        this.f101276i = new lj0.j(new a());
        i2.d("GCOperationTask", gVar.b() + ": " + gVar.getURI());
        this.f101276i.c(new lj0.i(gVar, this.f101278k, this.f101280m));
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
        lj0.j jVar = this.f101276i;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void c(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        super.c(cVar);
        if (this.f50126f != null) {
            boolean z14 = this.f50127g;
            Class<T> cls = this.f101281n;
            if (cls != null) {
                i2.d("GCOperationTask", "taskComplete(): " + z14 + " for " + cls.getSimpleName());
                return;
            }
            StringBuilder sb3 = new StringBuilder("taskComplete(): ");
            sb3.append(z14);
            sb3.append(" for ");
            lj0.g gVar = this.f101279l;
            sb3.append(gVar.b());
            sb3.append(": ");
            sb3.append(gVar.getURI());
            i2.d("GCOperationTask", sb3.toString());
        }
    }

    public abstract void d(RT rt3);

    public l(com.garmin.android.library.backgroundtaskmanagement.b bVar, lj0.g gVar, Class<T> cls, d80.g gVar2) {
        this(bVar, new String[0], gVar, null, cls, gVar2, true);
    }

    public l(com.garmin.android.library.backgroundtaskmanagement.b bVar, Object[] objArr, lj0.g gVar, Class<T> cls, d80.g gVar2) {
        this(bVar, objArr, gVar, null, cls, gVar2, true);
    }

    public l(com.garmin.android.library.backgroundtaskmanagement.b bVar, Object[] objArr, lj0.g gVar, List<Pair<String, String>> list) {
        super(bVar);
        this.f101278k = objArr;
        this.f101279l = gVar;
        this.f101280m = list;
        this.f101281n = null;
        this.f101282o = d80.g.NO_PARSING;
    }
}
