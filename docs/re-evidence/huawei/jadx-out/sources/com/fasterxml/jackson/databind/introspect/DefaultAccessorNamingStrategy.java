package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import defpackage.acj;
import defpackage.ack;
import defpackage.aco;
import defpackage.add;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class DefaultAccessorNamingStrategy extends AccessorNamingStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ack f4152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f4153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final BaseNameValidator f4154c;
    protected final String d;
    protected final MapperConfig<?> e;
    protected final boolean f;
    protected final String h;

    public interface BaseNameValidator {
        boolean accept(char c2, String str, int i);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String modifyFieldName(acj acjVar, String str) {
        return str;
    }

    protected DefaultAccessorNamingStrategy(MapperConfig<?> mapperConfig, ack ackVar, String str, String str2, String str3, BaseNameValidator baseNameValidator) {
        this.e = mapperConfig;
        this.f4152a = ackVar;
        this.f = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
        this.h = str;
        this.d = str2;
        this.f4153b = str3;
        this.f4154c = baseNameValidator;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String findNameForIsGetter(aco acoVar, String str) {
        if (this.f4153b == null) {
            return null;
        }
        Class<?> rawType = acoVar.getRawType();
        if ((rawType != Boolean.class && rawType != Boolean.TYPE) || !str.startsWith(this.f4153b)) {
            return null;
        }
        if (this.f) {
            return e(str, 2);
        }
        return d(str, 2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String findNameForRegularGetter(aco acoVar, String str) {
        String str2 = this.d;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (e(acoVar)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && a(acoVar)) {
            return null;
        }
        if (this.f) {
            return e(str, this.d.length());
        }
        return d(str, this.d.length());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String findNameForMutator(aco acoVar, String str) {
        String str2 = this.h;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if (this.f) {
            return e(str, this.h.length());
        }
        return d(str, this.h.length());
    }

    protected String d(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        BaseNameValidator baseNameValidator = this.f4154c;
        if (baseNameValidator != null && !baseNameValidator.accept(cCharAt, str, i)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb.append((CharSequence) str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    protected String e(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        BaseNameValidator baseNameValidator = this.f4154c;
        if (baseNameValidator != null && !baseNameValidator.accept(cCharAt, str, i)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i2, length);
        return sb.toString();
    }

    protected boolean e(aco acoVar) {
        Class<?> rawType = acoVar.getRawType();
        if (rawType.isArray()) {
            String name = rawType.getComponentType().getName();
            if (name.contains(".cglib")) {
                return name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib");
            }
        }
        return false;
    }

    protected boolean a(aco acoVar) {
        return acoVar.getRawType().getName().startsWith("groovy.lang");
    }

    public static class c extends AccessorNamingStrategy.Provider implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final String f4155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final BaseNameValidator f4156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final String f4157c;
        protected final String d;
        protected final String e;

        public c() {
            this("set", JsonPOJOBuilder.DEFAULT_WITH_PREFIX, "get", "is", null);
        }

        protected c(String str, String str2, String str3, String str4, BaseNameValidator baseNameValidator) {
            this.f4155a = str;
            this.d = str2;
            this.f4157c = str3;
            this.e = str4;
            this.f4156b = baseNameValidator;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forPOJO(MapperConfig<?> mapperConfig, ack ackVar) {
            return new DefaultAccessorNamingStrategy(mapperConfig, ackVar, this.f4155a, this.f4157c, this.e, this.f4156b);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forBuilder(MapperConfig<?> mapperConfig, ack ackVar, BeanDescription beanDescription) {
            AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            JsonPOJOBuilder.e eVarFindPOJOBuilderConfig = annotationIntrospector != null ? annotationIntrospector.findPOJOBuilderConfig(ackVar) : null;
            return new DefaultAccessorNamingStrategy(mapperConfig, ackVar, eVarFindPOJOBuilderConfig == null ? this.d : eVarFindPOJOBuilderConfig.f4099c, this.f4157c, this.e, this.f4156b);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forRecord(MapperConfig<?> mapperConfig, ack ackVar) {
            return new e(mapperConfig, ackVar);
        }
    }

    public static class e extends DefaultAccessorNamingStrategy {
        protected final Set<String> g;

        public e(MapperConfig<?> mapperConfig, ack ackVar) {
            super(mapperConfig, ackVar, null, "get", "is", null);
            this.g = new HashSet();
            for (String str : add.a(ackVar.getRawType())) {
                this.g.add(str);
            }
        }

        @Override // com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy, com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public String findNameForRegularGetter(aco acoVar, String str) {
            return this.g.contains(str) ? str : super.findNameForRegularGetter(acoVar, str);
        }
    }
}
