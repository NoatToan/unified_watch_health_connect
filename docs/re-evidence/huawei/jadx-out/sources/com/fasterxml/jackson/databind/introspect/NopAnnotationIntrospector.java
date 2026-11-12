package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import defpackage.wu;
import defpackage.za;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public abstract class NopAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    public static final NopAnnotationIntrospector instance = new NopAnnotationIntrospector() { // from class: com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector.4
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector, com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.core.Versioned
        public wu version() {
            return za.e;
        }
    };
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.core.Versioned
    public wu version() {
        return wu.d();
    }
}
