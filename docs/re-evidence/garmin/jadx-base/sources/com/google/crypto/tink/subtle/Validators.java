package com.google.crypto.tink.subtle;

import am.j;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.internal.measurement.a;
import fb1.c;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class Validators {
    private static final Pattern GCP_KMS_CRYPTO_KEY_PATTERN = Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
    private static final Pattern GCP_KMS_CRYPTO_KEY_VERSION_PATTERN = Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
    private static final int MIN_RSA_MODULUS_SIZE = 2048;
    private static final String TYPE_URL_PREFIX = "type.googleapis.com/";
    private static final String URI_UNRESERVED_CHARS = "([0-9a-zA-Z\\-\\.\\_~])+";

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.Validators$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = iArr;
            try {
                iArr[Enums.HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Validators() {
    }

    public static void validateAesKeySize(int i14) throws InvalidAlgorithmParameterException {
        if (i14 != 16 && i14 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i14 * 8)));
        }
    }

    public static void validateCryptoKeyUri(String str) throws GeneralSecurityException {
        if (GCP_KMS_CRYPTO_KEY_PATTERN.matcher(str).matches()) {
            return;
        }
        if (GCP_KMS_CRYPTO_KEY_VERSION_PATTERN.matcher(str).matches()) {
            a.t("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey, not a CryptoKeyVersion");
        } else {
            a.t("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey in the format projects/*/locations/*/keyRings/*/cryptoKeys/*. See https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys#CryptoKey");
        }
    }

    public static void validateExists(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException(String.format("Error: %s doesn't exist, please choose another file\n", file));
        }
    }

    public static String validateKmsKeyUriAndRemovePrefix(String str, String str2) {
        if (str2.toLowerCase(Locale.US).startsWith(str)) {
            return str2.substring(str.length());
        }
        h.s(c.n("key URI must start with ", str));
        return null;
    }

    public static void validateNotExists(File file) throws IOException {
        if (file.exists()) {
            throw new IOException(String.format("%s exists, please choose another file\n", file));
        }
    }

    public static void validateRsaModulusSize(int i14) throws GeneralSecurityException {
        if (i14 < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i14)));
        }
    }

    public static void validateRsaPublicExponent(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            a.t("Public exponent must be odd.");
        } else {
            if (bigInteger.compareTo(BigInteger.valueOf(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) > 0) {
                return;
            }
            a.t("Public exponent must be greater than 65536.");
        }
    }

    public static void validateSignatureHash(Enums.HashType hashType) throws GeneralSecurityException {
        int i14 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hashType.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            return;
        }
        throw new GeneralSecurityException("Unsupported hash: " + hashType.name());
    }

    public static void validateTypeUrl(String str) throws GeneralSecurityException {
        if (!str.startsWith(TYPE_URL_PREFIX)) {
            throw new GeneralSecurityException(j.m("Error: type URL ", str, " is invalid; it must start with type.googleapis.com/.\n"));
        }
        if (str.length() == 20) {
            throw new GeneralSecurityException(j.m("Error: type URL ", str, " is invalid; it has no message name.\n"));
        }
    }

    public static void validateVersion(int i14, int i15) throws GeneralSecurityException {
        if (i14 < 0 || i14 > i15) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(i14), Integer.valueOf(i15)));
        }
    }
}
