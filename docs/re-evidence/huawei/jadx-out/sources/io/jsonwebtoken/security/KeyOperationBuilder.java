package io.jsonwebtoken.security;

import io.jsonwebtoken.lang.Builder;

/* JADX INFO: loaded from: classes46.dex */
public interface KeyOperationBuilder extends Builder<KeyOperation> {
    KeyOperationBuilder description(String str);

    KeyOperationBuilder id(String str);

    KeyOperationBuilder related(String str);
}
