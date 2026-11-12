package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.ym;

/* JADX INFO: loaded from: classes21.dex */
public interface NullValueProvider {
    AccessPattern getNullAccessPattern();

    Object getNullValue(DeserializationContext deserializationContext) throws ym;
}
