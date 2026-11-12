package io.jsonwebtoken.security;

import io.jsonwebtoken.Identifiable;

/* JADX INFO: loaded from: classes46.dex */
public interface KeyOperation extends Identifiable {
    String getDescription();

    boolean isRelated(KeyOperation keyOperation);
}
