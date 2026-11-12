package io.jsonwebtoken.security;

import java.io.InputStream;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes46.dex */
public interface AeadRequest extends SecureRequest<InputStream, SecretKey>, AssociatedDataSupplier {
}
