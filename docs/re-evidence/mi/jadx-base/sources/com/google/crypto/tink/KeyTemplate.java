package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import defpackage.k0e;

/* JADX INFO: loaded from: classes5.dex */
public final class KeyTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0e f9334a;

    public enum OutputPrefixType {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9336b;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f9336b = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9336b[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9336b[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9336b[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            f9335a = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9335a[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9335a[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9335a[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public KeyTemplate(k0e k0eVar) {
        this.f9334a = k0eVar;
    }

    public static KeyTemplate a(String str, byte[] bArr, OutputPrefixType outputPrefixType) {
        return new KeyTemplate(k0e.K().u(str).v(ByteString.copyFrom(bArr)).t(c(outputPrefixType)).build());
    }

    public static com.google.crypto.tink.proto.OutputPrefixType c(OutputPrefixType outputPrefixType) {
        int i = a.f9336b[outputPrefixType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        if (i == 2) {
            return com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        }
        if (i == 3) {
            return com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        if (i == 4) {
            return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    public k0e b() {
        return this.f9334a;
    }
}
