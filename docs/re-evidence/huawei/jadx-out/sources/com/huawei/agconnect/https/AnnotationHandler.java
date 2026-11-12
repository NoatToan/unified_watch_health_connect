package com.huawei.agconnect.https;

import com.huawei.agconnect.https.annotation.Header;
import com.huawei.agconnect.https.annotation.HeaderMap;
import com.huawei.agconnect.https.annotation.Query;
import com.huawei.agconnect.https.annotation.Url;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.InvalidParameterException;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
abstract class AnnotationHandler<Annotation, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static QueryHandler f5006a = new QueryHandler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HeaderMapHandler f5007b = new HeaderMapHandler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HeaderHandler f5008c = new HeaderHandler();

    public abstract <RequestBean> Builder a(Field field, RequestBean requestbean, Builder builder);

    public static void b(final Field field) {
        if (field.isAccessible()) {
            return;
        }
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.agconnect.https.AnnotationHandler.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                field.setAccessible(true);
                return null;
            }
        });
    }

    public static <RequestBean> Request.Builder b(RequestBean requestbean) {
        HttpUrl.Builder builderA = a(requestbean);
        Request.Builder builder = new Request.Builder();
        Class<?> superclass = requestbean.getClass();
        do {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    b(field);
                    for (Annotation annotation : field.getDeclaredAnnotations()) {
                        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                        if (Query.class.equals(clsAnnotationType)) {
                            f5006a.a(field, (Object) requestbean, builderA);
                        } else if (HeaderMap.class.equals(clsAnnotationType)) {
                            f5007b.a(field, (Object) requestbean, builder);
                        } else if (Header.class.equals(clsAnnotationType)) {
                            f5008c.a(field, (Object) requestbean, builder);
                        }
                    }
                }
            }
            superclass = superclass.getSuperclass();
        } while (superclass != Object.class);
        return builder.url(builderA.build());
    }

    public static class HeaderHandler extends AnnotationHandler<Header, Request.Builder> {
        @Override // com.huawei.agconnect.https.AnnotationHandler
        public <RequestBean> Request.Builder a(Field field, RequestBean requestbean, Request.Builder builder) {
            if (builder == null) {
                throw new IllegalArgumentException("builder cannot be null");
            }
            try {
                AnnotationHandler.b(field);
                Object obj = field.get(requestbean);
                String strValue = ((Header) field.getAnnotation(Header.class)).value();
                if (strValue.isEmpty()) {
                    strValue = field.getName();
                }
                if (!String.class.equals(field.getType())) {
                    throw new InvalidParameterException("Header should be the annotation of String type");
                }
                String str = (String) obj;
                if (!Utils.a(str)) {
                    builder.addHeader(strValue, str);
                }
                return builder;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class HeaderMapHandler extends AnnotationHandler<HeaderMap, Request.Builder> {
        @Override // com.huawei.agconnect.https.AnnotationHandler
        public <RequestBean> Request.Builder a(Field field, RequestBean requestbean, Request.Builder builder) {
            if (builder == null) {
                throw new IllegalArgumentException("builder cannot be null");
            }
            try {
                AnnotationHandler.b(field);
                Object obj = field.get(requestbean);
                if (!Map.class.isAssignableFrom(field.getType())) {
                    throw new InvalidParameterException("HeaderMap should be the annotation of Map type");
                }
                Map map = (Map) obj;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        builder.addHeader((String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                return builder;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class QueryHandler extends AnnotationHandler<Query, HttpUrl.Builder> {
        @Override // com.huawei.agconnect.https.AnnotationHandler
        public <RequestBean> HttpUrl.Builder a(Field field, RequestBean requestbean, HttpUrl.Builder builder) {
            if (builder == null) {
                throw new IllegalArgumentException("builder cannot be null");
            }
            try {
                AnnotationHandler.b(field);
                Object obj = field.get(requestbean);
                if (!String.class.equals(field.getType())) {
                    throw new InvalidParameterException("QueryHandler should be the annotation of String");
                }
                Query query = (Query) field.getAnnotation(Query.class);
                String strValue = query.value();
                boolean zEncoded = query.encoded();
                if (strValue == null || strValue.isEmpty()) {
                    strValue = field.getName();
                }
                if (obj == null) {
                    obj = "";
                }
                if (zEncoded) {
                    builder.addEncodedQueryParameter(strValue, String.valueOf(obj));
                    return builder;
                }
                builder.addQueryParameter(strValue, String.valueOf(obj));
                return builder;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class UrlHandler extends AnnotationHandler<Url, HttpUrl.Builder> {
        @Override // com.huawei.agconnect.https.AnnotationHandler
        public <RequestBean> HttpUrl.Builder a(Field field, RequestBean requestbean, HttpUrl.Builder builder) {
            try {
                if (!field.isAnnotationPresent(Url.class)) {
                    throw new IllegalArgumentException("field is not Url annotation");
                }
                AnnotationHandler.b(field);
                Object obj = field.get(requestbean);
                if (!String.class.equals(field.getType())) {
                    throw new InvalidParameterException("Url should be the annotation of String");
                }
                String str = (String) obj;
                if (str == null || str.isEmpty()) {
                    throw new IllegalArgumentException("url cannot be null or empty");
                }
                return HttpUrl.parse(str).newBuilder();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static <RequestBean> HttpUrl.Builder a(RequestBean requestbean) {
        ArrayList arrayList = new ArrayList(1);
        Class<?> superclass = requestbean.getClass();
        do {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    if (field.isAnnotationPresent(Url.class)) {
                        arrayList.add(field);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        } while (superclass != Object.class);
        if (arrayList.size() == 1) {
            return new UrlHandler().a((Field) arrayList.get(0), (Object) requestbean, (HttpUrl.Builder) null);
        }
        throw new IllegalArgumentException("ONLY ONE String Field can be annotated as Url");
    }
}
