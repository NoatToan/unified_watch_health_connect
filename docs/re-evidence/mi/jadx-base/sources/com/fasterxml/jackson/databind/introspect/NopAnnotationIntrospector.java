package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import defpackage.ihh;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NopAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    public static final NopAnnotationIntrospector instance = new a();
    private static final long serialVersionUID = 1;

    public static class a extends NopAnnotationIntrospector {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector, com.fasterxml.jackson.databind.AnnotationIntrospector
        public Version version() {
            return ihh.f21147a;
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Version version() {
        return Version.unknownVersion();
    }
}
