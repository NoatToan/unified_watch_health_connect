package defpackage;

import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class uh2 {
    public static String j = n4q.g(th2.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f35751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r80[] f35752b;
    public final b77 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final HashMap<Class<?>, Method> h = new HashMap<>();
    public Class<? extends Exception> i = NoSuchFieldException.class;

    public uh2(Class<?> cls, r80[] r80VarArr, b77 b77Var) {
        this.f35751a = cls;
        this.f35752b = r80VarArr;
        this.c = b77Var;
        String name = cls.getName();
        this.d = name;
        if (name.startsWith("java.")) {
            this.e = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            this.e = name.concat("AccAccess");
        }
        this.f = this.e.replace('.', '/');
        this.g = name.replace('.', '/');
    }

    public void a(Class<?> cls) {
        if (cls == null) {
            return;
        }
        for (Method method : cls.getMethods()) {
            if ((method.getModifiers() & 8) != 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(Object.class)) {
                    Class<?> returnType = method.getReturnType();
                    if (!returnType.equals(Void.TYPE)) {
                        this.h.put(returnType, method);
                    }
                }
            }
        }
    }

    public void b(Iterable<Class<?>> iterable) {
        if (iterable == null) {
            return;
        }
        Iterator<Class<?>> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public Class<?> c() {
        Method method;
        Method method2;
        int i;
        Method method3;
        n04 n04Var = new n04(1);
        boolean z = this.f35752b.length > 10;
        n04Var.a(50, 33, this.f, "Lnet/minidev/asm/BeansAccess<L" + this.g + ";>;", j, null);
        cuf cufVarG = n04Var.g(1, "<init>", "()V", null, null);
        cufVarG.e();
        int i2 = 25;
        cufVarG.E(25, 0);
        cufVarG.v(SportReportBaseParser.ReportType.entryTime, j, "<init>", "()V", false);
        cufVarG.j(177);
        cufVarG.u(1, 1);
        cufVarG.f();
        cuf cufVarG2 = n04Var.g(1, CourseConfigModel.DevCmd.CMD_ACTION_SET, "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
        cufVarG2.e();
        r80[] r80VarArr = this.f35752b;
        if (r80VarArr.length != 0) {
            if (r80VarArr.length > 14) {
                cufVarG2.E(21, 2);
                h2e[] h2eVarArrF = sb.f(this.f35752b.length);
                h2e h2eVar = new h2e();
                cufVarG2.z(0, h2eVarArrF.length - 1, h2eVar, h2eVarArrF);
                r80[] r80VarArr2 = this.f35752b;
                int length = r80VarArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    r80 r80Var = r80VarArr2[i3];
                    int i5 = i4 + 1;
                    cufVarG2.o(h2eVarArrF[i4]);
                    if (r80Var.h()) {
                        e(cufVarG2, r80Var);
                    } else {
                        cufVarG2.j(177);
                    }
                    i3++;
                    i4 = i5;
                }
                cufVarG2.o(h2eVar);
            } else {
                h2e[] h2eVarArrF2 = sb.f(r80VarArr.length);
                int i6 = 0;
                for (r80 r80Var2 : this.f35752b) {
                    d(cufVarG2, 2, i6, h2eVarArrF2[i6]);
                    e(cufVarG2, r80Var2);
                    cufVarG2.o(h2eVarArrF2[i6]);
                    cufVarG2.h(3, 0, null, 0, null);
                    i6++;
                }
            }
        }
        Class<? extends Exception> cls = this.i;
        if (cls != null) {
            f(cufVarG2, cls);
        } else {
            cufVarG2.j(177);
        }
        cufVarG2.u(0, 0);
        cufVarG2.f();
        cuf cufVarG3 = n04Var.g(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
        cufVarG3.e();
        r80[] r80VarArr3 = this.f35752b;
        int i7 = 192;
        if (r80VarArr3.length == 0) {
            cufVarG3.h(3, 0, null, 0, null);
        } else if (r80VarArr3.length > 14) {
            cufVarG3.E(21, 2);
            h2e[] h2eVarArrF3 = sb.f(this.f35752b.length);
            h2e h2eVar2 = new h2e();
            cufVarG3.z(0, h2eVarArrF3.length - 1, h2eVar2, h2eVarArrF3);
            r80[] r80VarArr4 = this.f35752b;
            int length2 = r80VarArr4.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length2) {
                r80 r80Var3 = r80VarArr4[i8];
                int i10 = i9 + 1;
                cufVarG3.o(h2eVarArrF3[i9]);
                cufVarG3.h(3, 0, null, 0, null);
                if (r80Var3.f()) {
                    cufVarG3.E(i2, 1);
                    cufVarG3.D(i7, this.g);
                    n4q n4qVarM = n4q.m(r80Var3.c());
                    if (r80Var3.e() || (method2 = r80Var3.c) == null) {
                        cufVarG3.g(180, this.g, r80Var3.b(), n4qVarM.d());
                    } else {
                        cufVarG3.v(182, this.g, r80Var3.c.getName(), n4q.h(method2), false);
                    }
                    sb.a(cufVarG3, n4qVarM);
                    cufVarG3.j(176);
                } else {
                    cufVarG3.j(1);
                    cufVarG3.j(176);
                }
                i8++;
                i9 = i10;
                i7 = 192;
                i2 = 25;
            }
            cufVarG3.o(h2eVar2);
            cufVarG3.h(3, 0, null, 0, null);
        } else {
            h2e[] h2eVarArrF4 = sb.f(r80VarArr3.length);
            int i11 = 0;
            for (r80 r80Var4 : this.f35752b) {
                d(cufVarG3, 2, i11, h2eVarArrF4[i11]);
                cufVarG3.E(25, 1);
                cufVarG3.D(192, this.g);
                n4q n4qVarM2 = n4q.m(r80Var4.c());
                if (r80Var4.e() || (method = r80Var4.c) == null) {
                    cufVarG3.g(180, this.g, r80Var4.b(), n4qVarM2.d());
                } else {
                    if (method == null) {
                        throw new RuntimeException("no Getter for field " + r80Var4.b() + " in class " + this.d);
                    }
                    cufVarG3.v(182, this.g, r80Var4.c.getName(), n4q.h(method), false);
                }
                sb.a(cufVarG3, n4qVarM2);
                cufVarG3.j(176);
                cufVarG3.o(h2eVarArrF4[i11]);
                cufVarG3.h(3, 0, null, 0, null);
                i11++;
            }
        }
        Class<? extends Exception> cls2 = this.i;
        if (cls2 != null) {
            f(cufVarG3, cls2);
        } else {
            cufVarG3.j(1);
            cufVarG3.j(176);
        }
        cufVarG3.u(0, 0);
        cufVarG3.f();
        int i12 = 153;
        if (z) {
            i = 192;
        } else {
            i = 192;
            cuf cufVarG4 = n04Var.g(1, CourseConfigModel.DevCmd.CMD_ACTION_SET, "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
            cufVarG4.e();
            h2e[] h2eVarArrF5 = sb.f(this.f35752b.length);
            int i13 = 0;
            for (r80 r80Var5 : this.f35752b) {
                cufVarG4.E(25, 2);
                cufVarG4.p(r80Var5.g);
                cufVarG4.v(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                cufVarG4.n(153, h2eVarArrF5[i13]);
                e(cufVarG4, r80Var5);
                cufVarG4.o(h2eVarArrF5[i13]);
                cufVarG4.h(3, 0, null, 0, null);
                i13++;
            }
            Class<? extends Exception> cls3 = this.i;
            if (cls3 != null) {
                g(cufVarG4, cls3);
            } else {
                cufVarG4.j(177);
            }
            cufVarG4.u(0, 0);
            cufVarG4.f();
        }
        if (!z) {
            cuf cufVarG5 = n04Var.g(1, "get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, null);
            cufVarG5.e();
            h2e[] h2eVarArrF6 = sb.f(this.f35752b.length);
            r80[] r80VarArr5 = this.f35752b;
            int length3 = r80VarArr5.length;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length3) {
                r80 r80Var6 = r80VarArr5[i14];
                cufVarG5.E(25, 2);
                cufVarG5.p(r80Var6.g);
                cufVarG5.v(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                cufVarG5.n(i12, h2eVarArrF6[i15]);
                cufVarG5.E(25, 1);
                cufVarG5.D(i, this.g);
                n4q n4qVarM3 = n4q.m(r80Var6.c());
                if (r80Var6.e() || (method3 = r80Var6.c) == null) {
                    cufVarG5.g(180, this.g, r80Var6.b(), n4qVarM3.d());
                } else {
                    cufVarG5.v(182, this.g, r80Var6.c.getName(), n4q.h(method3), false);
                }
                sb.a(cufVarG5, n4qVarM3);
                cufVarG5.j(176);
                cufVarG5.o(h2eVarArrF6[i15]);
                cufVarG5.h(3, 0, null, 0, null);
                i15++;
                i14++;
                i12 = 153;
            }
            Class<? extends Exception> cls4 = this.i;
            if (cls4 != null) {
                g(cufVarG5, cls4);
            } else {
                cufVarG5.j(1);
                cufVarG5.j(176);
            }
            cufVarG5.u(0, 0);
            cufVarG5.f();
        }
        cuf cufVarG6 = n04Var.g(1, "newInstance", "()Ljava/lang/Object;", null, null);
        cufVarG6.e();
        cufVarG6.D(SportReportBaseParser.ReportType.avgAscentRate, this.g);
        cufVarG6.j(89);
        cufVarG6.v(SportReportBaseParser.ReportType.entryTime, this.g, "<init>", "()V", false);
        cufVarG6.j(176);
        cufVarG6.u(2, 1);
        cufVarG6.f();
        n04Var.d();
        return this.c.a(this.e, n04Var.t());
    }

    public final void d(cuf cufVar, int i, int i2, h2e h2eVar) {
        cufVar.E(21, i);
        if (i2 == 0) {
            cufVar.n(154, h2eVar);
            return;
        }
        if (i2 == 1) {
            cufVar.j(4);
            cufVar.n(160, h2eVar);
            return;
        }
        if (i2 == 2) {
            cufVar.j(5);
            cufVar.n(160, h2eVar);
            return;
        }
        if (i2 == 3) {
            cufVar.j(6);
            cufVar.n(160, h2eVar);
            return;
        }
        if (i2 == 4) {
            cufVar.j(7);
            cufVar.n(160, h2eVar);
        } else if (i2 == 5) {
            cufVar.j(8);
            cufVar.n(160, h2eVar);
        } else {
            if (i2 < 6) {
                throw new RuntimeException("non supported negative values");
            }
            cufVar.l(16, i2);
            cufVar.n(160, h2eVar);
        }
    }

    public final void e(cuf cufVar, r80 r80Var) {
        Method method;
        cufVar.E(25, 1);
        cufVar.D(192, this.g);
        cufVar.E(25, 3);
        n4q n4qVarM = n4q.m(r80Var.c());
        Class<?> clsC = r80Var.c();
        String strG = n4q.g(clsC);
        Method method2 = this.h.get(clsC);
        if (method2 != null) {
            cufVar.v(SportReportBaseParser.ReportType.exitTime, n4q.g(method2.getDeclaringClass()), method2.getName(), n4q.h(method2), false);
        } else if (r80Var.d()) {
            h2e h2eVar = new h2e();
            cufVar.n(SportReportBaseParser.ReportType.algorithmDataSource, h2eVar);
            cufVar.E(25, 3);
            cufVar.v(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            cufVar.v(SportReportBaseParser.ReportType.exitTime, strG, "valueOf", "(Ljava/lang/String;)L" + strG + ";", false);
            cufVar.E(58, 3);
            cufVar.o(h2eVar);
            cufVar.h(3, 0, null, 0, null);
            cufVar.E(25, 1);
            cufVar.D(192, this.g);
            cufVar.E(25, 3);
            cufVar.D(192, strG);
        } else if (clsC.equals(String.class)) {
            h2e h2eVar2 = new h2e();
            cufVar.n(SportReportBaseParser.ReportType.algorithmDataSource, h2eVar2);
            cufVar.E(25, 3);
            cufVar.v(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            cufVar.E(58, 3);
            cufVar.o(h2eVar2);
            cufVar.h(3, 0, null, 0, null);
            cufVar.E(25, 1);
            cufVar.D(192, this.g);
            cufVar.E(25, 3);
            cufVar.D(192, strG);
        } else {
            cufVar.D(192, strG);
        }
        if (r80Var.e() || (method = r80Var.f32304b) == null) {
            cufVar.g(181, this.g, r80Var.b(), n4qVarM.d());
        } else {
            cufVar.v(182, this.g, r80Var.f32304b.getName(), n4q.h(method), false);
        }
        cufVar.j(177);
    }

    public final void f(cuf cufVar, Class<?> cls) {
        String strG = n4q.g(cls);
        cufVar.D(SportReportBaseParser.ReportType.avgAscentRate, strG);
        cufVar.j(89);
        cufVar.p("mapping " + this.d + " failed to map field:");
        cufVar.E(21, 2);
        cufVar.v(SportReportBaseParser.ReportType.exitTime, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
        cufVar.v(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        cufVar.v(SportReportBaseParser.ReportType.entryTime, strG, "<init>", "(Ljava/lang/String;)V", false);
        cufVar.j(SportReportBaseParser.ReportType.minWaterTemperature);
    }

    public final void g(cuf cufVar, Class<?> cls) {
        String strG = n4q.g(cls);
        cufVar.D(SportReportBaseParser.ReportType.avgAscentRate, strG);
        cufVar.j(89);
        cufVar.p("mapping " + this.d + " failed to map field:");
        cufVar.E(25, 2);
        cufVar.v(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        cufVar.v(SportReportBaseParser.ReportType.entryTime, strG, "<init>", "(Ljava/lang/String;)V", false);
        cufVar.j(SportReportBaseParser.ReportType.minWaterTemperature);
    }
}
