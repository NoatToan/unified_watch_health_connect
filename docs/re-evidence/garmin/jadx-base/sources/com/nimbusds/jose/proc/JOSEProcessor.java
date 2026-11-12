package com.nimbusds.jose.proc;

import com.nimbusds.jose.JOSEObject;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.PlainObject;
import com.nimbusds.jose.proc.SecurityContext;

/* JADX INFO: loaded from: classes3.dex */
public interface JOSEProcessor<C extends SecurityContext> {
    Payload process(JOSEObject jOSEObject, C c14);

    Payload process(JWEObject jWEObject, C c14);

    Payload process(JWSObject jWSObject, C c14);

    Payload process(PlainObject plainObject, C c14);

    Payload process(String str, C c14);
}
