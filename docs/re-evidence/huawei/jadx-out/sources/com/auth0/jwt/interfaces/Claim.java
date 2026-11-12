package com.auth0.jwt.interfaces;

import defpackage.rf;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public interface Claim {
    <T> T as(Class<T> cls) throws rf;

    <T> T[] asArray(Class<T> cls) throws rf;

    Boolean asBoolean();

    Date asDate();

    Double asDouble();

    Integer asInt();

    <T> List<T> asList(Class<T> cls) throws rf;

    Long asLong();

    Map<String, Object> asMap() throws rf;

    String asString();

    boolean isMissing();

    boolean isNull();

    default Instant asInstant() {
        Date dateAsDate = asDate();
        if (dateAsDate != null) {
            return dateAsDate.toInstant();
        }
        return null;
    }
}
