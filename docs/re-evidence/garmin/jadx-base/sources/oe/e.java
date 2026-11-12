package oe;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f131216b;

    public /* synthetic */ e(f fVar, int i14) {
        this.f131215a = i14;
        this.f131216b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x012c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0215  */
    @Override // e23.a
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean z14;
        boolean z15;
        boolean z16;
        Class<?> clsLoadClass;
        switch (this.f131215a) {
            case 0:
                f fVar = this.f131216b;
                Class<?> clsLoadClass2 = fVar.f131219c.f112032a.loadClass("androidx.window.extensions.WindowExtensions");
                clsLoadClass2.getClass();
                Method method = clsLoadClass2.getMethod("getWindowLayoutComponent", null);
                Class<?> clsLoadClass3 = fVar.f131217a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                clsLoadClass3.getClass();
                te.a aVar = te.a.f163908a;
                method.getClass();
                aVar.getClass();
                return Boolean.valueOf(Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(clsLoadClass3));
            case 1:
                Class<?> clsLoadClass4 = this.f131216b.f131217a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                clsLoadClass4.getClass();
                Method method2 = clsLoadClass4.getMethod("getBounds", null);
                Method method3 = clsLoadClass4.getMethod("getType", null);
                Method method4 = clsLoadClass4.getMethod("getState", null);
                te.a aVar2 = te.a.f163908a;
                method2.getClass();
                t0 t0Var = s0.f105811a;
                k23.d dVarB = t0Var.b(Rect.class);
                aVar2.getClass();
                if (method2.getReturnType().equals(dh.b.u(dVarB)) && Modifier.isPublic(method2.getModifiers())) {
                    method3.getClass();
                    Class cls = Integer.TYPE;
                    if (method3.getReturnType().equals(dh.b.u(t0Var.b(cls))) && Modifier.isPublic(method3.getModifiers())) {
                        method4.getClass();
                        if (method4.getReturnType().equals(dh.b.u(t0Var.b(cls))) && Modifier.isPublic(method4.getModifiers())) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            case 2:
                ClassLoader classLoader = this.f131216b.f131217a;
                Class<?> clsLoadClass5 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                clsLoadClass5.getClass();
                Method method5 = clsLoadClass5.getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method5.getGenericReturnType();
                genericReturnType.getClass();
                boolean z17 = false;
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls2 = (Class) type;
                te.a.f163908a.getClass();
                if (Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class)) {
                    Class<?> clsLoadClass6 = classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                    clsLoadClass6.getClass();
                    if (cls2.equals(clsLoadClass6)) {
                        z17 = true;
                    }
                }
                return Boolean.valueOf(z17);
            case 3:
                Class<?> clsLoadClass7 = this.f131216b.f131217a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                clsLoadClass7.getClass();
                Method method6 = clsLoadClass7.getMethod("getType", null);
                Class cls3 = Integer.TYPE;
                Method method7 = clsLoadClass7.getMethod("hasProperty", cls3);
                Method method8 = clsLoadClass7.getMethod("hasProperties", int[].class);
                te.a aVar3 = te.a.f163908a;
                method6.getClass();
                aVar3.getClass();
                if (Modifier.isPublic(method6.getModifiers())) {
                    cls3.getClass();
                    if (method6.getReturnType().equals(cls3)) {
                        method7.getClass();
                        if (Modifier.isPublic(method7.getModifiers())) {
                            Class cls4 = Boolean.TYPE;
                            cls4.getClass();
                            if (method7.getReturnType().equals(cls4)) {
                                method8.getClass();
                                if (Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(cls4)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                } else {
                    z15 = false;
                }
                return Boolean.valueOf(z15);
            case 4:
                ClassLoader classLoader2 = this.f131216b.f131217a;
                Class<?> clsLoadClass8 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                clsLoadClass8.getClass();
                Method method9 = clsLoadClass8.getMethod("getSupportedWindowFeatures", null);
                te.a aVar4 = te.a.f163908a;
                method9.getClass();
                aVar4.getClass();
                if (Modifier.isPublic(method9.getModifiers())) {
                    Class<?> clsLoadClass9 = classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                    clsLoadClass9.getClass();
                    if (method9.getReturnType().equals(clsLoadClass9)) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    z16 = false;
                }
                return Boolean.valueOf(z16);
            case 5:
                f fVar2 = this.f131216b;
                try {
                    clsLoadClass = fVar2.f131218b.f117955a.loadClass("java.util.function.Consumer");
                    clsLoadClass.getClass();
                    break;
                } catch (ClassNotFoundException unused) {
                    clsLoadClass = null;
                }
                boolean z18 = false;
                if (clsLoadClass != null) {
                    Class<?> clsLoadClass10 = fVar2.f131217a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    clsLoadClass10.getClass();
                    Method method10 = clsLoadClass10.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass);
                    Method method11 = clsLoadClass10.getMethod("removeWindowLayoutInfoListener", clsLoadClass);
                    te.a aVar5 = te.a.f163908a;
                    method10.getClass();
                    aVar5.getClass();
                    if (Modifier.isPublic(method10.getModifiers())) {
                        method11.getClass();
                        if (Modifier.isPublic(method11.getModifiers())) {
                            z18 = true;
                        }
                    }
                }
                return Boolean.valueOf(z18);
            default:
                return Boolean.valueOf(f.d(this.f131216b));
        }
    }
}
