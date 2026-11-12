package org.apache.commons.compress.archivers.zip;

import defpackage.cj1;
import defpackage.d1s;
import defpackage.ebq;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes3.dex */
public class ZipArchiveEntry extends ZipEntry implements cj1 {

    public enum CommentSource {
        COMMENT,
        UNICODE_EXTRA_FIELD
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class ExtraFieldParsingMode {
        private static final /* synthetic */ ExtraFieldParsingMode[] $VALUES;
        public static final ExtraFieldParsingMode BEST_EFFORT;
        public static final ExtraFieldParsingMode DRACONIC;
        public static final ExtraFieldParsingMode ONLY_PARSEABLE_LENIENT;
        public static final ExtraFieldParsingMode ONLY_PARSEABLE_STRICT;
        public static final ExtraFieldParsingMode STRICT_FOR_KNOW_EXTRA_FIELDS;
        private final org.apache.commons.compress.archivers.zip.a.C1063a onUnparseableData;

        public static enum a extends ExtraFieldParsingMode {
            public a(String str, int i, org.apache.commons.compress.archivers.zip.a.C1063a c1063a) {
                super(str, i, c1063a);
            }

            @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode
            public d1s fill(d1s d1sVar, byte[] bArr, int i, int i2, boolean z) {
                return ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(d1sVar, bArr, i, i2, z);
            }
        }

        public static enum b extends ExtraFieldParsingMode {
            public b(String str, int i, org.apache.commons.compress.archivers.zip.a.C1063a c1063a) {
                super(str, i, c1063a);
            }

            @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode
            public d1s fill(d1s d1sVar, byte[] bArr, int i, int i2, boolean z) {
                return ExtraFieldParsingMode.fillAndMakeUnrecognizedOnError(d1sVar, bArr, i, i2, z);
            }
        }

        static {
            org.apache.commons.compress.archivers.zip.a.C1063a c1063a = org.apache.commons.compress.archivers.zip.a.C1063a.d;
            a aVar = new a("BEST_EFFORT", 0, c1063a);
            BEST_EFFORT = aVar;
            ExtraFieldParsingMode extraFieldParsingMode = new ExtraFieldParsingMode("STRICT_FOR_KNOW_EXTRA_FIELDS", 1, c1063a);
            STRICT_FOR_KNOW_EXTRA_FIELDS = extraFieldParsingMode;
            org.apache.commons.compress.archivers.zip.a.C1063a c1063a2 = org.apache.commons.compress.archivers.zip.a.C1063a.c;
            b bVar = new b("ONLY_PARSEABLE_LENIENT", 2, c1063a2);
            ONLY_PARSEABLE_LENIENT = bVar;
            ExtraFieldParsingMode extraFieldParsingMode2 = new ExtraFieldParsingMode("ONLY_PARSEABLE_STRICT", 3, c1063a2);
            ONLY_PARSEABLE_STRICT = extraFieldParsingMode2;
            ExtraFieldParsingMode extraFieldParsingMode3 = new ExtraFieldParsingMode("DRACONIC", 4, org.apache.commons.compress.archivers.zip.a.C1063a.f29430b);
            DRACONIC = extraFieldParsingMode3;
            $VALUES = new ExtraFieldParsingMode[]{aVar, extraFieldParsingMode, bVar, extraFieldParsingMode2, extraFieldParsingMode3};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static d1s fillAndMakeUnrecognizedOnError(d1s d1sVar, byte[] bArr, int i, int i2, boolean z) {
            try {
                return org.apache.commons.compress.archivers.zip.a.c(d1sVar, bArr, i, i2, z);
            } catch (ZipException unused) {
                ebq ebqVar = new ebq();
                ebqVar.b(d1sVar.getHeaderId());
                if (z) {
                    ebqVar.c(Arrays.copyOfRange(bArr, i, i2 + i));
                } else {
                    ebqVar.a(Arrays.copyOfRange(bArr, i, i2 + i));
                }
                return ebqVar;
            }
        }

        public static ExtraFieldParsingMode valueOf(String str) {
            return (ExtraFieldParsingMode) Enum.valueOf(ExtraFieldParsingMode.class, str);
        }

        public static ExtraFieldParsingMode[] values() {
            return (ExtraFieldParsingMode[]) $VALUES.clone();
        }

        public d1s createExtraField(ZipShort zipShort) throws IllegalAccessException, ZipException, InstantiationException {
            return org.apache.commons.compress.archivers.zip.a.a(zipShort);
        }

        public d1s fill(d1s d1sVar, byte[] bArr, int i, int i2, boolean z) throws ZipException {
            return org.apache.commons.compress.archivers.zip.a.c(d1sVar, bArr, i, i2, z);
        }

        public d1s onUnparseableExtraField(byte[] bArr, int i, int i2, boolean z, int i3) throws ZipException {
            return this.onUnparseableData.a(bArr, i, i2, z, i3);
        }

        private ExtraFieldParsingMode(String str, int i, org.apache.commons.compress.archivers.zip.a.C1063a c1063a) {
            super(str, i);
            this.onUnparseableData = c1063a;
        }
    }

    public enum NameSource {
        NAME,
        NAME_WITH_EFS_FLAG,
        UNICODE_EXTRA_FIELD
    }
}
