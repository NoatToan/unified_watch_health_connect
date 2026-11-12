package com.datatheorem.android.trustkit.config;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.huami.identity.auth.alexa.ConstantsKt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;

/* JADX INFO: loaded from: classes2.dex */
public final class PublicKeyPin {

    @NonNull
    private final String a;

    public PublicKeyPin(@NonNull Certificate certificate) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ConstantsKt.ALGORITHM_SHA_256);
            messageDigest.reset();
            this.a = Base64.encodeToString(messageDigest.digest(certificate.getPublicKey().getEncoded()), 0).trim();
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Should never happen");
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof PublicKeyPin) && obj.toString().equals(toString());
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }

    public PublicKeyPin(@NonNull String str) {
        if (Base64.decode(str, 0).length == 32) {
            this.a = str.trim();
            return;
        }
        throw new IllegalArgumentException("Invalid pin: length is not 32 bytes");
    }
}
