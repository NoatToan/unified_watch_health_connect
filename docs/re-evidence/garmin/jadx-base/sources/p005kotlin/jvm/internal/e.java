package p005kotlin.jvm.internal;

import ch.qos.logback.core.CoreConstants;
import d23.b;
import d53.w;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import k23.c;
import k23.f;
import k23.k;
import k23.p;
import k23.q;
import k23.t;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements c, Serializable, v {
    public static final Object NO_RECEIVER = a.f105792a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient c reflected;
    private final String signature;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f105792a = new a();

        private a() {
        }
    }

    public e(Object obj, Class cls, String str, String str2, boolean z14) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z14;
    }

    @Override // k23.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // k23.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public c compute() {
        c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    public abstract c computeReflected();

    @Override // p005kotlin.jvm.internal.v
    public GenericDeclaration findJavaDeclaration() {
        f owner = getOwner();
        String signature = getSignature();
        signature.getClass();
        if (!(owner instanceof g)) {
            return null;
        }
        String strF0 = w.f0(signature, CoreConstants.LEFT_PARENTHESIS_CHAR);
        if (strF0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + IOUtils.DIR_SEPARATOR_UNIX + signature);
        }
        Method[] declaredMethods = ((g) owner).j().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (s.g(method.getName(), strF0)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(method.getName());
                sb3.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    i.a(sb3, cls);
                }
                sb3.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                i.a(sb3, returnType);
                if (sb3.toString().equals(signature)) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override // k23.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // k23.c
    /* JADX INFO: renamed from: getName */
    public String getF122483i() {
        return this.name;
    }

    public f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? s0.f105811a.c(cls) : s0.f105811a.b(cls);
    }

    @Override // k23.c
    public List<k> getParameters() {
        return getReflected().getParameters();
    }

    public c getReflected() {
        c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute;
        }
        throw new b();
    }

    @Override // k23.c
    public p getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // k23.c
    public List<q> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // k23.c
    public t getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // k23.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // k23.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // k23.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // k23.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public e(Object obj) {
        this(obj, null, null, null, false);
    }

    public e() {
        this(NO_RECEIVER);
    }
}
