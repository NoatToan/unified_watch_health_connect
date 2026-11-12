package com.nimbusds.jose.proc;

import com.nimbusds.jose.JOSEObjectType;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.jcip.Immutable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public class DefaultJOSEObjectTypeVerifier<C extends SecurityContext> implements JOSEObjectTypeVerifier<C> {
    public static final DefaultJOSEObjectTypeVerifier JOSE = new DefaultJOSEObjectTypeVerifier(JOSEObjectType.JOSE, null);
    public static final DefaultJOSEObjectTypeVerifier JWT = new DefaultJOSEObjectTypeVerifier(JOSEObjectType.JWT, null);
    private final Set<JOSEObjectType> allowedTypes;

    public DefaultJOSEObjectTypeVerifier(JOSEObjectType... jOSEObjectTypeArr) {
        if (jOSEObjectTypeArr.length != 0) {
            this.allowedTypes = new HashSet(Arrays.asList(jOSEObjectTypeArr));
        } else {
            h.s("The allowed types must not be empty");
            throw null;
        }
    }

    public Set<JOSEObjectType> getAllowedTypes() {
        return this.allowedTypes;
    }

    @Override // com.nimbusds.jose.proc.JOSEObjectTypeVerifier
    public void verify(JOSEObjectType jOSEObjectType, C c14) throws BadJOSEException {
        if (jOSEObjectType == null && !this.allowedTypes.contains(null)) {
            throw new BadJOSEException("Required JOSE header typ (type) parameter is missing");
        }
        if (this.allowedTypes.contains(jOSEObjectType)) {
            return;
        }
        throw new BadJOSEException("JOSE header typ (type) " + jOSEObjectType + " not allowed");
    }

    public DefaultJOSEObjectTypeVerifier(Set<JOSEObjectType> set) {
        if (!set.isEmpty()) {
            this.allowedTypes = set;
        } else {
            h.s("The allowed types must not be empty");
            throw null;
        }
    }

    public DefaultJOSEObjectTypeVerifier() {
        this.allowedTypes = Collections.singleton(null);
    }
}
