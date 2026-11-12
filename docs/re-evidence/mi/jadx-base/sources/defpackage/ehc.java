package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.KotlinExtensions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ehc<ResponseT, ReturnT> extends oyl<ReturnT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lok f16644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f16645b;
    public final dk4<ResponseBody, ResponseT> c;

    public static final class a<ResponseT, ReturnT> extends ehc<ResponseT, ReturnT> {
        public final la3<ResponseT, ReturnT> d;

        public a(lok lokVar, Call.Factory factory, dk4<ResponseBody, ResponseT> dk4Var, la3<ResponseT, ReturnT> la3Var) {
            super(lokVar, factory, dk4Var);
            this.d = la3Var;
        }

        @Override // defpackage.ehc
        public ReturnT c(ka3<ResponseT> ka3Var, Object[] objArr) {
            return this.d.b(ka3Var);
        }
    }

    public static final class b<ResponseT> extends ehc<ResponseT, Object> {
        public final la3<ResponseT, ka3<ResponseT>> d;
        public final boolean e;

        public b(lok lokVar, Call.Factory factory, dk4<ResponseBody, ResponseT> dk4Var, la3<ResponseT, ka3<ResponseT>> la3Var, boolean z) {
            super(lokVar, factory, dk4Var);
            this.d = la3Var;
            this.e = z;
        }

        @Override // defpackage.ehc
        public Object c(ka3<ResponseT> ka3Var, Object[] objArr) {
            ka3<ResponseT> ka3VarB = this.d.b(ka3Var);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.e ? KotlinExtensions.awaitNullable(ka3VarB, continuation) : KotlinExtensions.await(ka3VarB, continuation);
            } catch (Exception e) {
                return KotlinExtensions.suspendAndThrow(e, continuation);
            }
        }
    }

    public static final class c<ResponseT> extends ehc<ResponseT, Object> {
        public final la3<ResponseT, ka3<ResponseT>> d;

        public c(lok lokVar, Call.Factory factory, dk4<ResponseBody, ResponseT> dk4Var, la3<ResponseT, ka3<ResponseT>> la3Var) {
            super(lokVar, factory, dk4Var);
            this.d = la3Var;
        }

        @Override // defpackage.ehc
        public Object c(ka3<ResponseT> ka3Var, Object[] objArr) {
            ka3<ResponseT> ka3VarB = this.d.b(ka3Var);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.awaitResponse(ka3VarB, continuation);
            } catch (Exception e) {
                return KotlinExtensions.suspendAndThrow(e, continuation);
            }
        }
    }

    public ehc(lok lokVar, Call.Factory factory, dk4<ResponseBody, ResponseT> dk4Var) {
        this.f16644a = lokVar;
        this.f16645b = factory;
        this.c = dk4Var;
    }

    public static <ResponseT, ReturnT> la3<ResponseT, ReturnT> d(etk etkVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (la3<ResponseT, ReturnT>) etkVar.a(type, annotationArr);
        } catch (RuntimeException e) {
            throw kmq.n(method, e, "Unable to create call adapter for %s", type);
        }
    }

    public static <ResponseT> dk4<ResponseBody, ResponseT> e(etk etkVar, Method method, Type type) {
        try {
            return etkVar.i(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw kmq.n(method, e, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> ehc<ResponseT, ReturnT> f(etk etkVar, Method method, lok lokVar) {
        Type genericReturnType;
        boolean z;
        boolean z2 = lokVar.f25276k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeF = kmq.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (kmq.h(typeF) == prk.class && (typeF instanceof ParameterizedType)) {
                typeF = kmq.g(0, (ParameterizedType) typeF);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new kmq.b(null, ka3.class, typeF);
            annotations = dfm.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        la3 la3VarD = d(etkVar, method, genericReturnType, annotations);
        Type typeA = la3VarD.a();
        if (typeA == Response.class) {
            throw kmq.m(method, "'" + kmq.h(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeA == prk.class) {
            throw kmq.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (lokVar.c.equals("HEAD") && !Void.class.equals(typeA)) {
            throw kmq.m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        dk4 dk4VarE = e(etkVar, method, typeA);
        Call.Factory factory = etkVar.f17055b;
        if (z2) {
            return z ? new c(lokVar, factory, dk4VarE, la3VarD) : new b(lokVar, factory, dk4VarE, la3VarD, false);
        }
        return new a(lokVar, factory, dk4VarE, la3VarD);
    }

    @Override // defpackage.oyl
    public final ReturnT a(Object[] objArr) {
        return c(new d7h(this.f16644a, objArr, this.f16645b, this.c), objArr);
    }

    public abstract ReturnT c(ka3<ResponseT> ka3Var, Object[] objArr);
}
