package com.nimbusds.jose;

import com.mapbox.maps.p;
import com.nimbusds.jose.crypto.impl.AAD;
import com.nimbusds.jose.shaded.gson.internal.a;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import java.text.ParseException;
import java.util.Objects;
import java.util.Set;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class JWEObject extends JOSEObject {
    public static final int MAX_COMPRESSED_CIPHER_TEXT_LENGTH = 100000;
    private static final long serialVersionUID = 1;
    private Base64URL authTag;
    private Base64URL cipherText;
    private Base64URL encryptedKey;
    private JWEHeader header;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private Base64URL f54707iv;
    private State state;

    public enum State {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public JWEObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5) throws ParseException {
        try {
            Objects.requireNonNull(base64URL);
            this.header = JWEHeader.parse(base64URL);
            if (base64URL2 == null || base64URL2.toString().isEmpty()) {
                this.encryptedKey = null;
            } else {
                this.encryptedKey = base64URL2;
            }
            if (base64URL3 == null || base64URL3.toString().isEmpty()) {
                this.f54707iv = null;
            } else {
                this.f54707iv = base64URL3;
            }
            Objects.requireNonNull(base64URL4);
            this.cipherText = base64URL4;
            if (base64URL5 == null || base64URL5.toString().isEmpty()) {
                this.authTag = null;
            } else {
                this.authTag = base64URL5;
            }
            this.state = State.ENCRYPTED;
            setParsedParts(base64URL, base64URL2, base64URL3, base64URL4, base64URL5);
        } catch (ParseException e4) {
            a.A(e4.getMessage(), "Invalid JWE header: ");
            throw null;
        }
    }

    private void ensureEncryptedOrDecryptedState() {
        State state = this.state;
        if (state == State.ENCRYPTED || state == State.DECRYPTED) {
            return;
        }
        h.z("The JWE object must be in an encrypted or decrypted state");
    }

    private void ensureEncryptedState() {
        if (this.state == State.ENCRYPTED) {
            return;
        }
        h.z("The JWE object must be in an encrypted state");
    }

    private void ensureJWEEncrypterSupport(JWEEncrypter jWEEncrypter) throws JOSEException {
        if (!jWEEncrypter.supportedJWEAlgorithms().contains(getHeader().getAlgorithm())) {
            StringBuilder sb3 = new StringBuilder("The ");
            sb3.append(getHeader().getAlgorithm());
            Set<JWEAlgorithm> setSupportedJWEAlgorithms = jWEEncrypter.supportedJWEAlgorithms();
            sb3.append(" algorithm is not supported by the JWE encrypter: Supported algorithms: ");
            sb3.append(setSupportedJWEAlgorithms);
            throw new JOSEException(sb3.toString());
        }
        if (jWEEncrypter.supportedEncryptionMethods().contains(getHeader().getEncryptionMethod())) {
            return;
        }
        StringBuilder sb4 = new StringBuilder("The ");
        sb4.append(getHeader().getEncryptionMethod());
        Set<EncryptionMethod> setSupportedEncryptionMethods = jWEEncrypter.supportedEncryptionMethods();
        sb4.append(" encryption method or key size is not supported by the JWE encrypter: Supported methods: ");
        sb4.append(setSupportedEncryptionMethods);
        throw new JOSEException(sb4.toString());
    }

    private void ensureUnencryptedState() {
        if (this.state == State.UNENCRYPTED) {
            return;
        }
        h.z("The JWE object must be in an unencrypted state");
    }

    public static JWEObject parse(String str) throws ParseException {
        Base64URL[] base64URLArrSplit = JOSEObject.split(str);
        if (base64URLArrSplit.length == 5) {
            return new JWEObject(base64URLArrSplit[0], base64URLArrSplit[1], base64URLArrSplit[2], base64URLArrSplit[3], base64URLArrSplit[4]);
        }
        p.i(0, "Unexpected number of Base64URL parts, must be five");
        return null;
    }

    public synchronized void decrypt(JWEDecrypter jWEDecrypter) {
        ensureEncryptedState();
        if (getHeader().getCompressionAlgorithm() != null && getCipherText().toString().length() > 100000) {
            throw new JOSEException("The JWE compressed cipher text exceeds the maximum allowed length of 100000 characters");
        }
        try {
            setPayload(new Payload(jWEDecrypter.decrypt(getHeader(), getEncryptedKey(), getIV(), getCipherText(), getAuthTag(), AAD.compute(getHeader()))));
            this.state = State.DECRYPTED;
        } catch (JOSEException e4) {
            throw e4;
        } catch (Exception e14) {
            throw new JOSEException(e14.getMessage(), e14);
        }
    }

    public synchronized void encrypt(JWEEncrypter jWEEncrypter) {
        try {
            ensureUnencryptedState();
            ensureJWEEncrypterSupport(jWEEncrypter);
            try {
                JWECryptoParts jWECryptoPartsEncrypt = jWEEncrypter.encrypt(getHeader(), getPayload().toBytes(), AAD.compute(getHeader()));
                if (jWECryptoPartsEncrypt.getHeader() != null) {
                    this.header = jWECryptoPartsEncrypt.getHeader();
                }
                this.encryptedKey = jWECryptoPartsEncrypt.getEncryptedKey();
                this.f54707iv = jWECryptoPartsEncrypt.getInitializationVector();
                this.cipherText = jWECryptoPartsEncrypt.getCipherText();
                this.authTag = jWECryptoPartsEncrypt.getAuthenticationTag();
                this.state = State.ENCRYPTED;
            } catch (JOSEException e4) {
                throw e4;
            } catch (Exception e14) {
                throw new JOSEException(e14.getMessage(), e14);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public Base64URL getAuthTag() {
        return this.authTag;
    }

    public Base64URL getCipherText() {
        return this.cipherText;
    }

    public Base64URL getEncryptedKey() {
        return this.encryptedKey;
    }

    public Base64URL getIV() {
        return this.f54707iv;
    }

    public State getState() {
        return this.state;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public String serialize() {
        ensureEncryptedOrDecryptedState();
        StringBuilder sb3 = new StringBuilder(this.header.toBase64URL().toString());
        sb3.append('.');
        Base64URL base64URL = this.encryptedKey;
        if (base64URL != null) {
            sb3.append(base64URL);
        }
        sb3.append('.');
        Base64URL base64URL2 = this.f54707iv;
        if (base64URL2 != null) {
            sb3.append(base64URL2);
        }
        sb3.append('.');
        sb3.append(this.cipherText);
        sb3.append('.');
        Base64URL base64URL3 = this.authTag;
        if (base64URL3 != null) {
            sb3.append(base64URL3);
        }
        return sb3.toString();
    }

    @Override // com.nimbusds.jose.JOSEObject
    public JWEHeader getHeader() {
        return this.header;
    }

    public JWEObject(JWEHeader jWEHeader, Payload payload) {
        Objects.requireNonNull(jWEHeader);
        this.header = jWEHeader;
        Objects.requireNonNull(payload);
        setPayload(payload);
        this.encryptedKey = null;
        this.cipherText = null;
        this.state = State.UNENCRYPTED;
    }
}
