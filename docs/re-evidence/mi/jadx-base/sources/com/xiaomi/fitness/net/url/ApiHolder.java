package com.xiaomi.fitness.net.url;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.extensions.HttpExtensionKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.url.ApiHolder;
import defpackage.kdq;
import defpackage.ngh;
import defpackage.uua;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0002J \u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0002J\u0014\u0010\u001c\u001a\u00020\n2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\u0014\u0010\u001e\u001a\u00020\n2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\u0014\u0010\u001f\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J/\u0010 \u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0002J+\u0010$\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010&H\u0002¢\u0006\u0002\u0010'J1\u0010(\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0012H\u0002¢\u0006\u0002\u0010\u0014J\u0012\u0010\u0019\u001a\u00020\b2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0006J\u0010\u0010)\u001a\u0004\u0018\u00010\r2\u0006\u0010*\u001a\u00020\bJ\u0010\u0010)\u001a\u0004\u0018\u00010\r2\u0006\u0010*\u001a\u00020+J\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010+R\u001e\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/net/url/ApiHolder;", "", "<init>", "()V", "mApis", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "mHosts", "", "mUrlDatas", "Lcom/xiaomi/fitness/net/url/BaseUrlData;", "mSecrets", "", "Lcom/xiaomi/fitness/net/url/SecretData;", "getService", "T", "serviceClass", "create", "Lkotlin/Function0;", "getService$net_release", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "updateApi", "", "apiClass", "newDomain", "getBaseUrl", "Ljava/net/URL;", "api", "getAnnotationUrl", "cls", "getUserBaseUrl", "updateSecret", "createHolderApi", "getPath", "method", "Ljava/lang/reflect/Method;", "invokeApi", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "getSingleApi", "getSecret", "url", "Lokhttp3/HttpUrl;", "newUrl", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nApiHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiHolder.kt\ncom/xiaomi/fitness/net/url/ApiHolder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,203:1\n13402#2:204\n13402#2,2:205\n13403#2:207\n*S KotlinDebug\n*F\n+ 1 ApiHolder.kt\ncom/xiaomi/fitness/net/url/ApiHolder\n*L\n150#1:204\n151#1:205,2\n150#1:207\n*E\n"})
public final class ApiHolder {

    @NotNull
    private final ConcurrentHashMap<Class<?>, Object> mApis = new ConcurrentHashMap<>();

    @NotNull
    private final ConcurrentHashMap<Class<?>, String> mHosts = new ConcurrentHashMap<>();

    @NotNull
    private final ConcurrentHashMap<Class<?>, BaseUrlData> mUrlDatas = new ConcurrentHashMap<>();

    @NotNull
    private final Map<String, SecretData> mSecrets = new ConcurrentHashMap();

    private final <T> T createHolderApi(final Class<T> apiClass, final Function0<? extends Object> create) {
        return (T) Proxy.newProxyInstance(apiClass.getClassLoader(), new Class[]{apiClass}, new InvocationHandler() { // from class: ae1
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return ApiHolder.createHolderApi$lambda$2(this.f913a, apiClass, create, obj, method, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createHolderApi$lambda$2(ApiHolder this$0, Class apiClass, Function0 create, Object obj, Method method, Object[] objArr) throws ApiException {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(apiClass, "$apiClass");
        Intrinsics.checkNotNullParameter(create, "$create");
        BaseUrlData baseUrlData = this$0.mUrlDatas.get(apiClass);
        if (baseUrlData != null) {
            str = baseUrlData.getHost() + baseUrlData.getPath();
        } else {
            str = null;
        }
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(method);
        String path = this$0.getPath(method);
        if (path.length() > 0) {
            String str2 = str + path;
            if (method.isAnnotationPresent(Secret.class)) {
                if (this$0.mSecrets.get(str2) == null) {
                    Secret secret = (Secret) method.getAnnotation(Secret.class);
                    Intrinsics.checkNotNull(secret);
                    SecretData secretData = new SecretData(secret.encryptResponse(), secret.pathPrefix(), secret.filterSignatureKeys(), secret.sid(), secret.loginPolicy());
                    if (!Intrinsics.areEqual(this$0.mSecrets.get(str2), secretData)) {
                        this$0.mSecrets.put(str2, secretData);
                    }
                }
            } else if (!apiClass.isAnnotationPresent(Secret.class)) {
                this$0.mSecrets.remove(str2);
            } else if (this$0.mSecrets.get(str2) == null) {
                Map<String, SecretData> map = this$0.mSecrets;
                map.put(str2, map.get(str));
            }
        }
        Class<?> declaringClass = method.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        return this$0.invokeApi(this$0.getSingleApi(declaringClass, create), method, objArr);
    }

    private final BaseUrlData getAnnotationUrl(Class<?> cls) {
        BaseUrlData userBaseUrl = this.mUrlDatas.get(cls);
        if (userBaseUrl == null) {
            if (cls.isAnnotationPresent(BaseUrl.class)) {
                Annotation annotation = cls.getAnnotation(BaseUrl.class);
                Intrinsics.checkNotNull(annotation);
                BaseUrl baseUrl = (BaseUrl) annotation;
                userBaseUrl = new DefaultUrlData(baseUrl.host(), baseUrl.path());
            } else {
                userBaseUrl = getUserBaseUrl(cls);
            }
            this.mUrlDatas.put(cls, userBaseUrl);
        }
        return userBaseUrl;
    }

    private final URL getBaseUrl(Class<?> api, String newDomain) {
        BaseUrlData annotationUrl = getAnnotationUrl(api);
        if (newDomain == null) {
            newDomain = annotationUrl.getHost();
        }
        return new URL(HttpExtensionKt.appendPath(newDomain, annotationUrl.getPath()));
    }

    public static /* synthetic */ URL getBaseUrl$default(ApiHolder apiHolder, Class cls, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return apiHolder.getBaseUrl(cls, str);
    }

    private final String getPath(Method method) throws ApiException {
        ngh nghVar;
        String strValue = null;
        if (method.isAnnotationPresent(uua.class)) {
            uua uuaVar = (uua) method.getAnnotation(uua.class);
            if (uuaVar != null) {
                strValue = uuaVar.value();
            }
        } else if (method.isAnnotationPresent(ngh.class) && (nghVar = (ngh) method.getAnnotation(ngh.class)) != null) {
            strValue = nghVar.value();
        }
        if (strValue == null || strValue.length() == 0) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
            for (Annotation[] annotationArr : parameterAnnotations) {
                Intrinsics.checkNotNull(annotationArr);
                for (Annotation annotation : annotationArr) {
                    if (Intrinsics.areEqual(JvmClassMappingKt.getAnnotationClass(annotation), Reflection.getOrCreateKotlinClass(kdq.class))) {
                        strValue = "";
                        break;
                    }
                }
            }
        }
        if (strValue != null) {
            return strValue;
        }
        throw new ApiException("方法上必须添加注解（GET/POST）和path, 或方法中包含@Url 参数", -1);
    }

    private final <T> T getSingleApi(Class<?> apiClass, Function0<? extends T> create) {
        T t = (T) this.mApis.get(apiClass);
        if (t != null) {
            return t;
        }
        T tInvoke = create.invoke();
        this.mApis.put(apiClass, tInvoke);
        return tInvoke;
    }

    private final BaseUrlData getUserBaseUrl(Class<?> cls) {
        throw new IllegalArgumentException("需要添加BaseUrl注解");
    }

    private final Object invokeApi(Object api, Method method, Object[] args) throws Throwable {
        Object objInvoke = args != null ? method.invoke(api, Arrays.copyOf(args, args.length)) : method.invoke(api, new Object[0]);
        Intrinsics.checkNotNull(objInvoke);
        return objInvoke;
    }

    private final void updateApi(Class<?> apiClass, String newDomain, Function0<? extends Object> create) {
        String str = this.mHosts.get(apiClass);
        String string = getBaseUrl(apiClass, newDomain).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!Intrinsics.areEqual(str, string)) {
            this.mHosts.put(apiClass, string);
            if (this.mApis.get(apiClass) == null) {
                this.mApis.put(apiClass, create.invoke());
            }
        }
        updateSecret(apiClass);
    }

    public static /* synthetic */ void updateApi$default(ApiHolder apiHolder, Class cls, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        apiHolder.updateApi(cls, str, function0);
    }

    private final void updateSecret(Class<?> apiClass) {
        String str;
        BaseUrlData baseUrlData = this.mUrlDatas.get(apiClass);
        if (baseUrlData != null) {
            str = baseUrlData.getHost() + baseUrlData.getPath();
        } else {
            str = null;
        }
        if (str == null) {
            Logger.i(apiClass + "'s url is null", new Object[0]);
            return;
        }
        if (this.mSecrets.get(str) == null && apiClass.isAnnotationPresent(Secret.class)) {
            Secret secret = (Secret) apiClass.getAnnotation(Secret.class);
            this.mSecrets.put(str, new SecretData(secret.encryptResponse(), secret.pathPrefix(), secret.filterSignatureKeys(), secret.sid(), secret.loginPolicy()));
        }
    }

    @Nullable
    public final SecretData getSecret(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.mSecrets.get(url);
    }

    public final <T> T getService$net_release(@NotNull Class<T> serviceClass, @NotNull Function0<? extends Object> create) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        Intrinsics.checkNotNullParameter(create, "create");
        Class<?>[] interfaces = serviceClass.getInterfaces();
        Intrinsics.checkNotNull(interfaces);
        if (!(interfaces.length == 0)) {
            Iterator it = ArrayIteratorKt.iterator(interfaces);
            while (it.hasNext()) {
                Class cls = (Class) it.next();
                Intrinsics.checkNotNull(cls);
                updateApi$default(this, cls, null, create, 2, null);
            }
        } else {
            updateApi$default(this, serviceClass, null, create, 2, null);
        }
        return (T) createHolderApi(serviceClass, create);
    }

    @Nullable
    public final SecretData getSecret(@NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return getSecret(url.scheme() + "://" + url.host() + url.encodedPath());
    }

    @NotNull
    public final String getBaseUrl(@NotNull Class<?> apiClass) {
        Intrinsics.checkNotNullParameter(apiClass, "apiClass");
        return (String) MapsKt__MapsKt.getValue(this.mHosts, apiClass);
    }

    public final synchronized void updateSecret(@NotNull HttpUrl url, @Nullable HttpUrl newUrl) {
        try {
            Intrinsics.checkNotNullParameter(url, "url");
            String str = url.scheme() + "://" + url.host() + url.encodedPath();
            String str2 = (newUrl != null ? newUrl.scheme() : null) + "://" + (newUrl != null ? newUrl.host() : null) + (newUrl != null ? newUrl.encodedPath() : null);
            if (!Intrinsics.areEqual(str, str2) && newUrl != null && this.mSecrets.get(str) != null) {
                Map<String, SecretData> map = this.mSecrets;
                map.put(str2, map.get(str));
                this.mSecrets.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
