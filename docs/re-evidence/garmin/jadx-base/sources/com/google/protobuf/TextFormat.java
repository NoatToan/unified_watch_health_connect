package com.google.protobuf;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.common.base.Ascii;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kg.f;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import v.e0;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes2.dex */
public final class TextFormat {
    private static final String DEBUG_STRING_SILENT_MARKER = "\t ";
    private static final Logger logger = Logger.getLogger(TextFormat.class.getName());
    private static final Parser PARSER = Parser.newBuilder().build();

    /* JADX INFO: renamed from: com.google.protobuf.TextFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[Descriptors.FieldDescriptor.JavaType.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType = iArr2;
            try {
                iArr2[Descriptors.FieldDescriptor.JavaType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[Descriptors.FieldDescriptor.JavaType.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static class InvalidEscapeSequenceException extends IOException {
        private static final long serialVersionUID = -8164033650142593304L;

        public InvalidEscapeSequenceException(String str) {
            super(str);
        }
    }

    private TextFormat() {
    }

    private static int digitValue(byte b14) {
        if (48 > b14 || b14 > 57) {
            return (97 > b14 || b14 > 122) ? b14 - 55 : b14 - 87;
        }
        return b14 - 48;
    }

    public static String escapeBytes(ByteString byteString) {
        return TextFormatEscaper.escapeBytes(byteString);
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return TextFormatEscaper.escapeDoubleQuotesAndBackslashes(str);
    }

    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    public static Parser getParser() {
        return PARSER;
    }

    private static boolean isHex(byte b14) {
        if (48 <= b14 && b14 <= 57) {
            return true;
        }
        if (97 > b14 || b14 > 102) {
            return 65 <= b14 && b14 <= 70;
        }
        return true;
    }

    private static boolean isOctal(byte b14) {
        return 48 <= b14 && b14 <= 55;
    }

    public static void merge(Readable readable, Message.Builder builder) throws ParseException {
        PARSER.merge(readable, builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextGenerator multiLineOutput(Appendable appendable) {
        return new TextGenerator(appendable, false, null);
    }

    public static <T extends Message> T parse(CharSequence charSequence, Class<T> cls) throws ParseException {
        Message.Builder builderNewBuilderForType = ((Message) Internal.getDefaultInstance(cls)).newBuilderForType();
        merge(charSequence, builderNewBuilderForType);
        return (T) builderNewBuilderForType.build();
    }

    public static int parseInt32(String str) {
        return (int) parseInteger(str, true, false);
    }

    public static long parseInt64(String str) {
        return parseInteger(str, true, true);
    }

    private static long parseInteger(String str, boolean z14, boolean z15) {
        int i14;
        int i15 = 0;
        if (str.startsWith("-", 0)) {
            if (!z14) {
                throw new NumberFormatException("Number must be positive: ".concat(str));
            }
            i15 = 1;
        }
        int i16 = i15;
        if (str.startsWith("0x", i15)) {
            i15 += 2;
            i14 = 16;
        } else {
            i14 = str.startsWith("0", i15) ? 8 : 10;
        }
        String strSubstring = str.substring(i15);
        if (strSubstring.length() < 16) {
            long j8 = Long.parseLong(strSubstring, i14);
            if (i16 != 0) {
                j8 = -j8;
            }
            if (!z15) {
                if (z14) {
                    if (j8 > 2147483647L || j8 < -2147483648L) {
                        throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
                    }
                } else if (j8 >= 4294967296L || j8 < 0) {
                    throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
                }
            }
            return j8;
        }
        BigInteger bigInteger = new BigInteger(strSubstring, i14);
        if (i16 != 0) {
            bigInteger = bigInteger.negate();
        }
        if (z15) {
            if (z14) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: ".concat(str));
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: ".concat(str));
            }
        } else if (z14) {
            if (bigInteger.bitLength() > 31) {
                throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
        }
        return bigInteger.longValue();
    }

    public static int parseUInt32(String str) {
        return (int) parseInteger(str, false, false);
    }

    public static long parseUInt64(String str) {
        return parseInteger(str, false, true);
    }

    @InlineMe(imports = {"com.google.protobuf.TextFormat"}, replacement = "TextFormat.printer().print(message, output)")
    @Deprecated
    public static void print(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
        printer().print(messageOrBuilder, appendable);
    }

    @Deprecated
    public static void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        printer().printField(fieldDescriptor, obj, appendable);
    }

    @Deprecated
    public static String printFieldToString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return printer().printFieldToString(fieldDescriptor, obj);
    }

    @InlineMe(imports = {"com.google.protobuf.TextFormat"}, replacement = "TextFormat.printer().printFieldValue(field, value, output)")
    @Deprecated
    public static void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        printer().printFieldValue(fieldDescriptor, obj, appendable);
    }

    @InlineMe(imports = {"com.google.protobuf.TextFormat"}, replacement = "TextFormat.printer().printToString(message)")
    @Deprecated
    public static String printToString(MessageOrBuilder messageOrBuilder) {
        return printer().printToString(messageOrBuilder);
    }

    @InlineMe(imports = {"com.google.protobuf.TextFormat"}, replacement = "TextFormat.printer().escapingNonAscii(false).printToString(message)")
    @Deprecated
    public static String printToUnicodeString(MessageOrBuilder messageOrBuilder) {
        return printer().escapingNonAscii(false).printToString(messageOrBuilder);
    }

    @InlineMe(imports = {"com.google.protobuf.TextFormat"}, replacement = "TextFormat.printer().escapingNonAscii(false).print(message, output)")
    @Deprecated
    public static void printUnicode(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).print(messageOrBuilder, appendable);
    }

    @Deprecated
    public static void printUnicodeFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).printFieldValue(fieldDescriptor, obj, appendable);
    }

    private static void printUnknownFieldValue(int i14, Object obj, TextGenerator textGenerator) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i14);
        if (tagWireType == 0) {
            textGenerator.print(unsignedToString(((Long) obj).longValue()));
            return;
        }
        if (tagWireType == 1) {
            textGenerator.print(String.format(null, "0x%016x", (Long) obj));
            return;
        }
        if (tagWireType != 2) {
            if (tagWireType == 3) {
                Printer.printUnknownFields((UnknownFieldSet) obj, textGenerator);
                return;
            } else if (tagWireType == 5) {
                textGenerator.print(String.format(null, "0x%08x", (Integer) obj));
                return;
            } else {
                h.s(j.h(i14, "Bad tag: "));
                return;
            }
        }
        try {
            UnknownFieldSet from = UnknownFieldSet.parseFrom((ByteString) obj);
            textGenerator.print("{");
            textGenerator.eol();
            textGenerator.indent();
            Printer.printUnknownFields(from, textGenerator);
            textGenerator.outdent();
            textGenerator.print(StringSubstitutor.DEFAULT_VAR_END);
        } catch (InvalidProtocolBufferException unused) {
            textGenerator.print("\"");
            textGenerator.print(escapeBytes((ByteString) obj));
            textGenerator.print("\"");
        }
    }

    public static Printer printer() {
        return Printer.DEFAULT;
    }

    public static String shortDebugString(MessageOrBuilder messageOrBuilder) {
        return printer().shortDebugString(messageOrBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextGenerator singleLineOutput(Appendable appendable) {
        return new TextGenerator(appendable, true, null);
    }

    public static ByteString unescapeBytes(CharSequence charSequence) throws InvalidEscapeSequenceException {
        int i14;
        int i15;
        int length;
        int i16;
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(charSequence.toString());
        int size = byteStringCopyFromUtf8.size();
        byte[] bArr = new byte[size];
        int i17 = 0;
        int i18 = 0;
        while (i17 < byteStringCopyFromUtf8.size()) {
            byte bByteAt = byteStringCopyFromUtf8.byteAt(i17);
            if (bByteAt == 92) {
                int i19 = i17 + 1;
                if (i19 >= byteStringCopyFromUtf8.size()) {
                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\' at end of string.");
                }
                byte bByteAt2 = byteStringCopyFromUtf8.byteAt(i19);
                if (isOctal(bByteAt2)) {
                    int iDigitValue = digitValue(bByteAt2);
                    int i24 = i17 + 2;
                    if (i24 < byteStringCopyFromUtf8.size() && isOctal(byteStringCopyFromUtf8.byteAt(i24))) {
                        iDigitValue = (iDigitValue * 8) + digitValue(byteStringCopyFromUtf8.byteAt(i24));
                        i19 = i24;
                    }
                    i17 = i19 + 1;
                    if (i17 >= byteStringCopyFromUtf8.size() || !isOctal(byteStringCopyFromUtf8.byteAt(i17))) {
                        i17 = i19;
                    } else {
                        iDigitValue = (iDigitValue * 8) + digitValue(byteStringCopyFromUtf8.byteAt(i17));
                    }
                    i16 = i18 + 1;
                    bArr[i18] = (byte) iDigitValue;
                } else {
                    if (bByteAt2 == 34) {
                        i14 = i18 + 1;
                        bArr[i18] = 34;
                    } else if (bByteAt2 == 39) {
                        i14 = i18 + 1;
                        bArr[i18] = 39;
                    } else if (bByteAt2 != 63) {
                        if (bByteAt2 == 85) {
                            int i25 = i17 + 2;
                            i15 = i17 + 9;
                            if (i15 >= byteStringCopyFromUtf8.size()) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                            }
                            int iDigitValue2 = 0;
                            int i26 = i25;
                            while (true) {
                                int i27 = i17 + 10;
                                if (i26 < i27) {
                                    byte bByteAt3 = byteStringCopyFromUtf8.byteAt(i26);
                                    if (!isHex(bByteAt3)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                                    }
                                    iDigitValue2 = (iDigitValue2 << 4) | digitValue(bByteAt3);
                                    i26++;
                                } else {
                                    if (!Character.isValidCodePoint(iDigitValue2)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + byteStringCopyFromUtf8.substring(i25, i27).toStringUtf8() + "' is not a valid code point value");
                                    }
                                    Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iDigitValue2);
                                    if (unicodeBlockOf != null && (unicodeBlockOf.equals(Character.UnicodeBlock.LOW_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES))) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + byteStringCopyFromUtf8.substring(i25, i27).toStringUtf8() + "' refers to a surrogate code unit");
                                    }
                                    byte[] bytes = new String(new int[]{iDigitValue2}, 0, 1).getBytes(Internal.UTF_8);
                                    System.arraycopy(bytes, 0, bArr, i18, bytes.length);
                                    length = bytes.length;
                                }
                            }
                        } else if (bByteAt2 == 92) {
                            i14 = i18 + 1;
                            bArr[i18] = 92;
                        } else if (bByteAt2 == 102) {
                            i14 = i18 + 1;
                            bArr[i18] = Ascii.FF;
                        } else if (bByteAt2 == 110) {
                            i14 = i18 + 1;
                            bArr[i18] = 10;
                        } else if (bByteAt2 == 114) {
                            i14 = i18 + 1;
                            bArr[i18] = Ascii.CR;
                        } else if (bByteAt2 == 120) {
                            int i28 = i17 + 2;
                            if (i28 >= byteStringCopyFromUtf8.size() || !isHex(byteStringCopyFromUtf8.byteAt(i28))) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\x' with no digits");
                            }
                            int iDigitValue3 = digitValue(byteStringCopyFromUtf8.byteAt(i28));
                            i17 += 3;
                            if (i17 >= byteStringCopyFromUtf8.size() || !isHex(byteStringCopyFromUtf8.byteAt(i17))) {
                                i17 = i28;
                            } else {
                                iDigitValue3 = (iDigitValue3 * 16) + digitValue(byteStringCopyFromUtf8.byteAt(i17));
                            }
                            i16 = i18 + 1;
                            bArr[i18] = (byte) iDigitValue3;
                        } else if (bByteAt2 == 97) {
                            i14 = i18 + 1;
                            bArr[i18] = 7;
                        } else if (bByteAt2 != 98) {
                            switch (bByteAt2) {
                                case 116:
                                    i14 = i18 + 1;
                                    bArr[i18] = 9;
                                    break;
                                case 117:
                                    int i29 = i17 + 2;
                                    i15 = i17 + 5;
                                    if (i15 < byteStringCopyFromUtf8.size() && isHex(byteStringCopyFromUtf8.byteAt(i29))) {
                                        int i30 = i17 + 3;
                                        if (isHex(byteStringCopyFromUtf8.byteAt(i30))) {
                                            int i34 = i17 + 4;
                                            if (isHex(byteStringCopyFromUtf8.byteAt(i34)) && isHex(byteStringCopyFromUtf8.byteAt(i15))) {
                                                char cDigitValue = (char) ((digitValue(byteStringCopyFromUtf8.byteAt(i34)) << 4) | (digitValue(byteStringCopyFromUtf8.byteAt(i29)) << 12) | (digitValue(byteStringCopyFromUtf8.byteAt(i30)) << 8) | digitValue(byteStringCopyFromUtf8.byteAt(i15)));
                                                if (cDigitValue >= 55296 && cDigitValue <= 57343) {
                                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' refers to a surrogate");
                                                }
                                                byte[] bytes2 = Character.toString(cDigitValue).getBytes(Internal.UTF_8);
                                                System.arraycopy(bytes2, 0, bArr, i18, bytes2.length);
                                                length = bytes2.length;
                                                break;
                                            }
                                        }
                                    }
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' with too few hex chars");
                                case 118:
                                    i14 = i18 + 1;
                                    bArr[i18] = Ascii.VT;
                                    break;
                                default:
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\" + ((char) bByteAt2) + CoreConstants.SINGLE_QUOTE_CHAR);
                            }
                        } else {
                            i14 = i18 + 1;
                            bArr[i18] = 8;
                        }
                        i18 += length;
                        i17 = i15;
                    } else {
                        i14 = i18 + 1;
                        bArr[i18] = 63;
                    }
                    i18 = i14;
                    i17 = i19;
                }
                i18 = i16;
            } else {
                bArr[i18] = bByteAt;
                i18++;
            }
            i17++;
        }
        return size == i18 ? ByteString.wrap(bArr) : ByteString.copyFrom(bArr, 0, i18);
    }

    public static String unescapeText(String str) {
        return unescapeBytes(str).toStringUtf8();
    }

    public static String unsignedToString(long j8) {
        return j8 >= 0 ? Long.toString(j8) : BigInteger.valueOf(j8 & Long.MAX_VALUE).setBit(63).toString();
    }

    public static String escapeBytes(byte[] bArr) {
        return TextFormatEscaper.escapeBytes(bArr);
    }

    public static class UnknownFieldParseException extends ParseException {
        private final String unknownField;

        public UnknownFieldParseException(String str) {
            this(-1, -1, "", str);
        }

        public String getUnknownField() {
            return this.unknownField;
        }

        public UnknownFieldParseException(int i14, int i15, String str, String str2) {
            super(i14, i15, str2);
            this.unknownField = str;
        }
    }

    public static void merge(CharSequence charSequence, Message.Builder builder) throws ParseException {
        PARSER.merge(charSequence, builder);
    }

    public static void merge(Readable readable, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
        PARSER.merge(readable, extensionRegistry, builder);
    }

    public static void merge(CharSequence charSequence, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
        PARSER.merge(charSequence, extensionRegistry, builder);
    }

    @Deprecated
    public static void print(UnknownFieldSet unknownFieldSet, Appendable appendable) throws IOException {
        printer().print(unknownFieldSet, appendable);
    }

    @Deprecated
    public static String printToString(UnknownFieldSet unknownFieldSet) {
        return printer().printToString(unknownFieldSet);
    }

    @Deprecated
    public static String shortDebugString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return printer().shortDebugString(fieldDescriptor, obj);
    }

    @Deprecated
    public static String shortDebugString(UnknownFieldSet unknownFieldSet) {
        return printer().shortDebugString(unknownFieldSet);
    }

    @Deprecated
    public static void printUnicode(UnknownFieldSet unknownFieldSet, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).print(unknownFieldSet, appendable);
    }

    @Deprecated
    public static String printToUnicodeString(UnknownFieldSet unknownFieldSet) {
        return printer().escapingNonAscii(false).printToString(unknownFieldSet);
    }

    public static class Parser {
        private static final int BUFFER_SIZE = 4096;
        private final boolean allowUnknownEnumValues;
        private final boolean allowUnknownExtensions;
        private final boolean allowUnknownFields;
        private TextFormatParseInfoTree.Builder parseInfoTreeBuilder;
        private final int recursionLimit;
        private final SingularOverwritePolicy singularOverwritePolicy;
        private final TypeRegistry typeRegistry;

        public static class Builder {
            private boolean allowUnknownFields = false;
            private boolean allowUnknownEnumValues = false;
            private boolean allowUnknownExtensions = false;
            private SingularOverwritePolicy singularOverwritePolicy = SingularOverwritePolicy.ALLOW_SINGULAR_OVERWRITES;
            private TextFormatParseInfoTree.Builder parseInfoTreeBuilder = null;
            private TypeRegistry typeRegistry = TypeRegistry.getEmptyTypeRegistry();
            private int recursionLimit = 100;

            public Parser build() {
                return new Parser(this.typeRegistry, this.allowUnknownFields, this.allowUnknownEnumValues, this.allowUnknownExtensions, this.singularOverwritePolicy, this.parseInfoTreeBuilder, this.recursionLimit, null);
            }

            public Builder setAllowUnknownExtensions(boolean z14) {
                this.allowUnknownExtensions = z14;
                return this;
            }

            public Builder setAllowUnknownFields(boolean z14) {
                this.allowUnknownFields = z14;
                return this;
            }

            public Builder setParseInfoTreeBuilder(TextFormatParseInfoTree.Builder builder) {
                this.parseInfoTreeBuilder = builder;
                return this;
            }

            public Builder setRecursionLimit(int i14) {
                this.recursionLimit = i14;
                return this;
            }

            public Builder setSingularOverwritePolicy(SingularOverwritePolicy singularOverwritePolicy) {
                this.singularOverwritePolicy = singularOverwritePolicy;
                return this;
            }

            public Builder setTypeRegistry(TypeRegistry typeRegistry) {
                this.typeRegistry = typeRegistry;
                return this;
            }
        }

        public enum SingularOverwritePolicy {
            ALLOW_SINGULAR_OVERWRITES,
            FORBID_SINGULAR_OVERWRITES
        }

        public static final class UnknownField {
            final String message;
            final Type type;

            public enum Type {
                FIELD,
                EXTENSION
            }

            public UnknownField(String str, Type type) {
                this.message = str;
                this.type = type;
            }
        }

        private Parser(TypeRegistry typeRegistry, boolean z14, boolean z15, boolean z16, SingularOverwritePolicy singularOverwritePolicy, TextFormatParseInfoTree.Builder builder, int i14) {
            this.typeRegistry = typeRegistry;
            this.allowUnknownFields = z14;
            this.allowUnknownEnumValues = z15;
            this.allowUnknownExtensions = z16;
            this.singularOverwritePolicy = singularOverwritePolicy;
            this.parseInfoTreeBuilder = builder;
            this.recursionLimit = i14;
        }

        private void checkUnknownFields(List<UnknownField> list) throws ParseException {
            int i14;
            if (list.isEmpty()) {
                return;
            }
            StringBuilder sb3 = new StringBuilder("Input contains unknown fields and/or extensions:");
            for (UnknownField unknownField : list) {
                sb3.append('\n');
                sb3.append(unknownField.message);
            }
            if (this.allowUnknownFields) {
                TextFormat.logger.warning(sb3.toString());
                return;
            }
            if (this.allowUnknownExtensions) {
                Iterator<UnknownField> it = list.iterator();
                i14 = 0;
                while (it.hasNext()) {
                    if (it.next().type != UnknownField.Type.FIELD) {
                        i14++;
                    }
                }
                TextFormat.logger.warning(sb3.toString());
                return;
            }
            i14 = 0;
            String[] strArrSplit = list.get(i14).message.split(":");
            throw new ParseException(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), sb3.toString());
        }

        private void consumeFieldValue(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, Descriptors.FieldDescriptor fieldDescriptor, ExtensionRegistry.ExtensionInfo extensionInfo, TextFormatParseInfoTree.Builder builder, List<UnknownField> list, int i14) throws ParseException {
            String str;
            if (this.singularOverwritePolicy == SingularOverwritePolicy.FORBID_SINGULAR_OVERWRITES && !fieldDescriptor.isRepeated()) {
                if (mergeTarget.hasField(fieldDescriptor)) {
                    throw tokenizer.parseExceptionPreviousToken("Non-repeated field \"" + fieldDescriptor.getFullName() + "\" cannot be overwritten.");
                }
                if (fieldDescriptor.getContainingOneof() != null && mergeTarget.hasOneof(fieldDescriptor.getContainingOneof())) {
                    Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
                    throw tokenizer.parseExceptionPreviousToken("Field \"" + fieldDescriptor.getFullName() + "\" is specified along with field \"" + mergeTarget.getOneofFieldDescriptor(containingOneof).getFullName() + "\", another member of oneof \"" + containingOneof.getName() + "\".");
                }
            }
            Object objValueOf = null;
            if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        objValueOf = Integer.valueOf(tokenizer.consumeInt32());
                        break;
                    case 4:
                    case 5:
                    case 6:
                        objValueOf = Long.valueOf(tokenizer.consumeInt64());
                        break;
                    case 7:
                        objValueOf = Boolean.valueOf(tokenizer.consumeBoolean());
                        break;
                    case 8:
                        objValueOf = Float.valueOf(tokenizer.consumeFloat());
                        break;
                    case 9:
                        objValueOf = Double.valueOf(tokenizer.consumeDouble());
                        break;
                    case 10:
                    case 11:
                        objValueOf = Integer.valueOf(tokenizer.consumeUInt32());
                        break;
                    case 12:
                    case 13:
                        objValueOf = Long.valueOf(tokenizer.consumeUInt64());
                        break;
                    case 14:
                        objValueOf = tokenizer.consumeString();
                        break;
                    case 15:
                        objValueOf = tokenizer.consumeByteString();
                        break;
                    case 16:
                        Descriptors.EnumDescriptor enumType = fieldDescriptor.getEnumType();
                        if (tokenizer.lookingAtInteger()) {
                            int iConsumeInt32 = tokenizer.consumeInt32();
                            objValueOf = enumType.findValueByNumber(iConsumeInt32);
                            if (objValueOf == null) {
                                String str2 = "Enum type \"" + enumType.getFullName() + "\" has no value with number " + iConsumeInt32 + '.';
                                if (this.allowUnknownEnumValues) {
                                    TextFormat.logger.warning(str2);
                                    return;
                                }
                                throw tokenizer.parseExceptionPreviousToken("Enum type \"" + enumType.getFullName() + "\" has no value with number " + iConsumeInt32 + '.');
                            }
                        } else {
                            String strConsumeIdentifier = tokenizer.consumeIdentifier();
                            objValueOf = enumType.findValueByName(strConsumeIdentifier);
                            if (objValueOf == null) {
                                String str3 = "Enum type \"" + enumType.getFullName() + "\" has no value named \"" + strConsumeIdentifier + "\".";
                                if (!this.allowUnknownEnumValues) {
                                    throw tokenizer.parseExceptionPreviousToken(str3);
                                }
                                TextFormat.logger.warning(str3);
                                return;
                            }
                        }
                    case 17:
                    case 18:
                        f.n("Can't get here.");
                        return;
                }
            } else {
                if (i14 < 1) {
                    throw tokenizer.parseException("Message is nested too deep");
                }
                if (tokenizer.tryConsume("<")) {
                    str = ">";
                } else {
                    tokenizer.consume("{");
                    str = StringSubstitutor.DEFAULT_VAR_END;
                }
                String str4 = str;
                MessageReflection.MergeTarget mergeTargetNewMergeTargetForField = mergeTarget.newMergeTargetForField(fieldDescriptor, extensionInfo != null ? extensionInfo.defaultInstance : null);
                while (!tokenizer.tryConsume(str4)) {
                    if (tokenizer.atEnd()) {
                        throw tokenizer.parseException(j.m("Expected \"", str4, "\"."));
                    }
                    mergeField(tokenizer, extensionRegistry, mergeTargetNewMergeTargetForField, builder, list, i14 - 1);
                }
                objValueOf = mergeTargetNewMergeTargetForField.finish();
            }
            if (fieldDescriptor.isRepeated()) {
                mergeTarget.addRepeatedField(fieldDescriptor, objValueOf);
            } else {
                mergeTarget.setField(fieldDescriptor, objValueOf);
            }
        }

        private void consumeFieldValues(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, Descriptors.FieldDescriptor fieldDescriptor, ExtensionRegistry.ExtensionInfo extensionInfo, TextFormatParseInfoTree.Builder builder, List<UnknownField> list, int i14) throws ParseException {
            if (!fieldDescriptor.isRepeated() || !tokenizer.tryConsume("[")) {
                consumeFieldValue(tokenizer, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfo, builder, list, i14);
            } else {
                if (tokenizer.tryConsume("]")) {
                    return;
                }
                while (true) {
                    consumeFieldValue(tokenizer, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfo, builder, list, i14);
                    if (tokenizer.tryConsume("]")) {
                        return;
                    } else {
                        tokenizer.consume(",");
                    }
                }
            }
        }

        private String consumeFullTypeName(Tokenizer tokenizer) throws ParseException {
            if (!tokenizer.tryConsume("[")) {
                return tokenizer.consumeIdentifier();
            }
            String strConsumeIdentifier = tokenizer.consumeIdentifier();
            while (tokenizer.tryConsume(".")) {
                StringBuilder sbI = sn.a.i(strConsumeIdentifier, ".");
                sbI.append(tokenizer.consumeIdentifier());
                strConsumeIdentifier = sbI.toString();
            }
            if (tokenizer.tryConsume("/")) {
                StringBuilder sbI2 = sn.a.i(strConsumeIdentifier, "/");
                sbI2.append(tokenizer.consumeIdentifier());
                strConsumeIdentifier = sbI2.toString();
                while (tokenizer.tryConsume(".")) {
                    StringBuilder sbI3 = sn.a.i(strConsumeIdentifier, ".");
                    sbI3.append(tokenizer.consumeIdentifier());
                    strConsumeIdentifier = sbI3.toString();
                }
            }
            tokenizer.consume("]");
            return strConsumeIdentifier;
        }

        private void detectSilentMarker(Tokenizer tokenizer, Descriptors.Descriptor descriptor, String str) {
        }

        private void guessFieldTypeAndSkip(Tokenizer tokenizer, Descriptors.Descriptor descriptor, int i14) throws ParseException {
            boolean zTryConsume = tokenizer.tryConsume(":");
            if (tokenizer.lookingAt("[")) {
                skipFieldShortFormedRepeated(tokenizer, zTryConsume, descriptor, i14);
                return;
            }
            if (zTryConsume && !tokenizer.lookingAt("{") && !tokenizer.lookingAt("<")) {
                skipFieldValue(tokenizer);
            } else {
                if (i14 < 1) {
                    throw tokenizer.parseException("Message is nested too deep");
                }
                skipFieldMessage(tokenizer, descriptor, i14 - 1);
            }
        }

        private void mergeAnyFieldValue(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, TextFormatParseInfoTree.Builder builder, List<UnknownField> list, Descriptors.Descriptor descriptor, int i14) throws ParseException {
            String str;
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                sb3.append(tokenizer.consumeIdentifier());
                if (tokenizer.tryConsume("]")) {
                    detectSilentMarker(tokenizer, descriptor, sb3.toString());
                    tokenizer.tryConsume(":");
                    if (tokenizer.tryConsume("<")) {
                        str = ">";
                    } else {
                        tokenizer.consume("{");
                        str = StringSubstitutor.DEFAULT_VAR_END;
                    }
                    String string = sb3.toString();
                    try {
                        Descriptors.Descriptor descriptorForTypeUrl = this.typeRegistry.getDescriptorForTypeUrl(string);
                        if (descriptorForTypeUrl == null) {
                            throw tokenizer.parseException(j.m("Unable to parse Any of type: ", string, ". Please make sure that the TypeRegistry contains the descriptors for the given types."));
                        }
                        DynamicMessage.Builder builderNewBuilderForType = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                        MessageReflection.BuilderAdapter builderAdapter = new MessageReflection.BuilderAdapter(builderNewBuilderForType);
                        while (!tokenizer.tryConsume(str)) {
                            mergeField(tokenizer, extensionRegistry, builderAdapter, builder, list, i14);
                        }
                        mergeTarget.setField(descriptor.findFieldByName("type_url"), sb3.toString());
                        mergeTarget.setField(descriptor.findFieldByName("value"), builderNewBuilderForType.build().toByteString());
                        return;
                    } catch (InvalidProtocolBufferException unused) {
                        throw tokenizer.parseException("Invalid valid type URL. Found: ".concat(string));
                    }
                }
                if (tokenizer.tryConsume("/")) {
                    sb3.append("/");
                } else {
                    if (!tokenizer.tryConsume(".")) {
                        throw tokenizer.parseExceptionPreviousToken("Expected a valid type URL.");
                    }
                    sb3.append(".");
                }
            }
        }

        private void mergeField(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, TextFormatParseInfoTree.Builder builder, List<UnknownField> list, int i14) throws ParseException {
            ExtensionRegistry extensionRegistry2;
            String strConsumeIdentifier;
            Descriptors.FieldDescriptor fieldDescriptor;
            ExtensionRegistry.ExtensionInfo extensionInfoFindExtensionByName;
            TextFormatParseInfoTree.Builder builder2;
            Descriptors.FieldDescriptor fieldDescriptor2;
            Tokenizer tokenizer2 = tokenizer;
            int line = tokenizer2.getLine();
            int column = tokenizer2.getColumn();
            Descriptors.Descriptor descriptorForType = mergeTarget.getDescriptorForType();
            if ("google.protobuf.Any".equals(descriptorForType.getFullName()) && tokenizer2.tryConsume("[")) {
                if (i14 < 1) {
                    throw tokenizer2.parseException("Message is nested too deep");
                }
                mergeAnyFieldValue(tokenizer2, extensionRegistry, mergeTarget, builder, list, descriptorForType, i14 - 1);
                return;
            }
            if (tokenizer2.tryConsume("[")) {
                StringBuilder sb3 = new StringBuilder(tokenizer2.consumeIdentifier());
                while (tokenizer2.tryConsume(".")) {
                    sb3.append('.');
                    sb3.append(tokenizer2.consumeIdentifier());
                }
                strConsumeIdentifier = sb3.toString();
                extensionRegistry2 = extensionRegistry;
                extensionInfoFindExtensionByName = mergeTarget.findExtensionByName(extensionRegistry2, strConsumeIdentifier);
                if (extensionInfoFindExtensionByName == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(tokenizer2.getPreviousLine() + 1);
                    sb4.append(":");
                    sb4.append(tokenizer2.getPreviousColumn() + 1);
                    sb4.append(":\t");
                    sb4.append(descriptorForType.getFullName());
                    list.add(new UnknownField(e0.h(sb4, ".[", strConsumeIdentifier, "]"), UnknownField.Type.EXTENSION));
                    fieldDescriptor2 = null;
                } else {
                    if (extensionInfoFindExtensionByName.descriptor.getContainingType() != descriptorForType) {
                        StringBuilder sbL = hb.a.l("Extension \"", strConsumeIdentifier, "\" does not extend message type \"");
                        sbL.append(descriptorForType.getFullName());
                        sbL.append("\".");
                        throw tokenizer2.parseExceptionPreviousToken(sbL.toString());
                    }
                    fieldDescriptor2 = extensionInfoFindExtensionByName.descriptor;
                }
                tokenizer2.consume("]");
                fieldDescriptor = fieldDescriptor2;
            } else {
                extensionRegistry2 = extensionRegistry;
                strConsumeIdentifier = tokenizer2.consumeIdentifier();
                Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = descriptorForType.findFieldByName(strConsumeIdentifier);
                if (fieldDescriptorFindFieldByName == null && (fieldDescriptorFindFieldByName = descriptorForType.findFieldByName(strConsumeIdentifier.toLowerCase(Locale.US))) != null && fieldDescriptorFindFieldByName.getType() != Descriptors.FieldDescriptor.Type.GROUP) {
                    fieldDescriptorFindFieldByName = null;
                }
                if (fieldDescriptorFindFieldByName != null && fieldDescriptorFindFieldByName.getType() == Descriptors.FieldDescriptor.Type.GROUP && !fieldDescriptorFindFieldByName.getMessageType().getName().equals(strConsumeIdentifier)) {
                    fieldDescriptorFindFieldByName = null;
                }
                if (fieldDescriptorFindFieldByName == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(tokenizer2.getPreviousLine() + 1);
                    sb5.append(":");
                    sb5.append(tokenizer2.getPreviousColumn() + 1);
                    sb5.append(":\t");
                    sb5.append(descriptorForType.getFullName());
                    list.add(new UnknownField(j.o(".", strConsumeIdentifier, sb5), UnknownField.Type.FIELD));
                }
                fieldDescriptor = fieldDescriptorFindFieldByName;
                extensionInfoFindExtensionByName = null;
            }
            if (fieldDescriptor == null) {
                detectSilentMarker(tokenizer2, descriptorForType, strConsumeIdentifier);
                guessFieldTypeAndSkip(tokenizer2, descriptorForType, i14);
                return;
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                detectSilentMarker(tokenizer2, descriptorForType, fieldDescriptor.getFullName());
                tokenizer2.tryConsume(":");
                if (builder != null) {
                    consumeFieldValues(tokenizer2, extensionRegistry2, mergeTarget, fieldDescriptor, extensionInfoFindExtensionByName, builder.getBuilderForSubMessageField(fieldDescriptor), list, i14);
                    tokenizer2 = tokenizer;
                    builder2 = builder;
                } else {
                    consumeFieldValues(tokenizer2, extensionRegistry2, mergeTarget, fieldDescriptor, extensionInfoFindExtensionByName, builder, list, i14);
                    builder2 = builder;
                }
            } else {
                detectSilentMarker(tokenizer2, descriptorForType, fieldDescriptor.getFullName());
                tokenizer2.consume(":");
                builder2 = builder;
                consumeFieldValues(tokenizer2, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfoFindExtensionByName, builder2, list, i14);
            }
            if (builder2 != null) {
                builder2.setLocation(fieldDescriptor, TextFormatParseLocation.create(line, column));
            }
            if (tokenizer2.tryConsume(";")) {
                return;
            }
            tokenizer2.tryConsume(",");
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        private void skipField(Tokenizer tokenizer, Descriptors.Descriptor descriptor, int i14) {
            detectSilentMarker(tokenizer, descriptor, consumeFullTypeName(tokenizer));
            guessFieldTypeAndSkip(tokenizer, descriptor, i14);
            if (tokenizer.tryConsume(";")) {
                return;
            }
            tokenizer.tryConsume(",");
        }

        private void skipFieldMessage(Tokenizer tokenizer, Descriptors.Descriptor descriptor, int i14) throws ParseException {
            String str;
            if (tokenizer.tryConsume("<")) {
                str = ">";
            } else {
                tokenizer.consume("{");
                str = StringSubstitutor.DEFAULT_VAR_END;
            }
            while (!tokenizer.lookingAt(">") && !tokenizer.lookingAt(StringSubstitutor.DEFAULT_VAR_END)) {
                skipField(tokenizer, descriptor, i14);
            }
            tokenizer.consume(str);
        }

        private void skipFieldShortFormedRepeated(Tokenizer tokenizer, boolean z14, Descriptors.Descriptor descriptor, int i14) throws ParseException {
            if (!tokenizer.tryConsume("[") || tokenizer.tryConsume("]")) {
                return;
            }
            while (true) {
                if (tokenizer.lookingAt("{") || tokenizer.lookingAt("<")) {
                    if (i14 < 1) {
                        throw tokenizer.parseException("Message is nested too deep");
                    }
                    skipFieldMessage(tokenizer, descriptor, i14 - 1);
                } else {
                    if (!z14) {
                        throw tokenizer.parseException("Invalid repeated scalar field: missing \":\" before \"[\".");
                    }
                    skipFieldValue(tokenizer);
                }
                if (tokenizer.tryConsume("]")) {
                    return;
                } else {
                    tokenizer.consume(",");
                }
            }
        }

        private void skipFieldValue(Tokenizer tokenizer) throws ParseException {
            if (tokenizer.tryConsumeByteString() || tokenizer.tryConsumeIdentifier() || tokenizer.tryConsumeInt64() || tokenizer.tryConsumeUInt64() || tokenizer.tryConsumeDouble() || tokenizer.tryConsumeFloat()) {
                return;
            }
            throw tokenizer.parseException("Invalid field value: " + tokenizer.currentToken);
        }

        private static StringBuilder toStringBuilder(Readable readable) throws IOException {
            StringBuilder sb3 = new StringBuilder();
            CharBuffer charBufferAllocate = CharBuffer.allocate(4096);
            while (true) {
                int i14 = readable.read(charBufferAllocate);
                if (i14 == -1) {
                    return sb3;
                }
                Java8Compatibility.flip(charBufferAllocate);
                sb3.append((CharSequence) charBufferAllocate, 0, i14);
            }
        }

        public void merge(CharSequence charSequence, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
            Tokenizer tokenizer = new Tokenizer(charSequence, null);
            MessageReflection.BuilderAdapter builderAdapter = new MessageReflection.BuilderAdapter(builder);
            ArrayList arrayList = new ArrayList();
            while (!tokenizer.atEnd()) {
                mergeField(tokenizer, extensionRegistry, builderAdapter, arrayList, this.recursionLimit);
            }
            checkUnknownFields(arrayList);
        }

        public /* synthetic */ Parser(TypeRegistry typeRegistry, boolean z14, boolean z15, boolean z16, SingularOverwritePolicy singularOverwritePolicy, TextFormatParseInfoTree.Builder builder, int i14, AnonymousClass1 anonymousClass1) {
            this(typeRegistry, z14, z15, z16, singularOverwritePolicy, builder, i14);
        }

        public void merge(CharSequence charSequence, Message.Builder builder) throws ParseException {
            merge(charSequence, ExtensionRegistry.getEmptyRegistry(), builder);
        }

        public void merge(Readable readable, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
            merge(toStringBuilder(readable), extensionRegistry, builder);
        }

        public void merge(Readable readable, Message.Builder builder) throws ParseException {
            merge(readable, ExtensionRegistry.getEmptyRegistry(), builder);
        }

        private void mergeField(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, List<UnknownField> list, int i14) throws ParseException {
            mergeField(tokenizer, extensionRegistry, mergeTarget, this.parseInfoTreeBuilder, list, i14);
        }
    }

    public static final class TextGenerator {
        private boolean atStartOfLine;
        private final StringBuilder indent;
        private final Appendable output;
        private final boolean singleLineMode;

        private TextGenerator(Appendable appendable, boolean z14) {
            this.indent = new StringBuilder();
            this.atStartOfLine = false;
            this.output = appendable;
            this.singleLineMode = z14;
        }

        public void eol() throws IOException {
            if (!this.singleLineMode) {
                this.output.append("\n");
            }
            this.atStartOfLine = true;
        }

        public void indent() {
            this.indent.append("  ");
        }

        public void outdent() {
            int length = this.indent.length();
            if (length != 0) {
                this.indent.setLength(length - 2);
            } else {
                h.s(" Outdent() without matching Indent().");
            }
        }

        public void print(CharSequence charSequence) throws IOException {
            if (this.atStartOfLine) {
                this.atStartOfLine = false;
                this.output.append(this.singleLineMode ? StringUtils.SPACE : this.indent);
            }
            this.output.append(charSequence);
        }

        public /* synthetic */ TextGenerator(Appendable appendable, boolean z14, AnonymousClass1 anonymousClass1) {
            this(appendable, z14);
        }
    }

    public static final class Printer {
        private static final Printer DEFAULT = new Printer(true, TypeRegistry.getEmptyTypeRegistry());
        private final boolean escapeNonAscii;
        private final TypeRegistry typeRegistry;

        public static class MapEntryAdapter implements Comparable<MapEntryAdapter> {
            private Object entry;
            private final Descriptors.FieldDescriptor.JavaType fieldType;
            private MapEntry mapEntry;

            public MapEntryAdapter(Object obj, Descriptors.FieldDescriptor fieldDescriptor) {
                if (obj instanceof MapEntry) {
                    this.mapEntry = (MapEntry) obj;
                } else {
                    this.entry = obj;
                }
                this.fieldType = extractFieldType(fieldDescriptor);
            }

            private static Descriptors.FieldDescriptor.JavaType extractFieldType(Descriptors.FieldDescriptor fieldDescriptor) {
                return fieldDescriptor.getMessageType().getFields().get(0).getJavaType();
            }

            @Override // java.lang.Comparable
            public int compareTo(MapEntryAdapter mapEntryAdapter) {
                if (getKey() == null || mapEntryAdapter.getKey() == null) {
                    TextFormat.logger.info("Invalid key for map field.");
                    return -1;
                }
                int i14 = AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[this.fieldType.ordinal()];
                if (i14 == 1) {
                    Boolean bool = (Boolean) getKey();
                    bool.booleanValue();
                    Boolean bool2 = (Boolean) mapEntryAdapter.getKey();
                    bool2.booleanValue();
                    return bool.compareTo(bool2);
                }
                if (i14 == 2) {
                    Long l14 = (Long) getKey();
                    l14.longValue();
                    Long l15 = (Long) mapEntryAdapter.getKey();
                    l15.longValue();
                    return l14.compareTo(l15);
                }
                if (i14 == 3) {
                    Integer num = (Integer) getKey();
                    num.intValue();
                    Integer num2 = (Integer) mapEntryAdapter.getKey();
                    num2.intValue();
                    return num.compareTo(num2);
                }
                if (i14 != 4) {
                    return 0;
                }
                String str = (String) getKey();
                String str2 = (String) mapEntryAdapter.getKey();
                if (str == null && str2 == null) {
                    return 0;
                }
                if (str == null && str2 != null) {
                    return -1;
                }
                if (str == null || str2 != null) {
                    return str.compareTo(str2);
                }
                return 1;
            }

            public Object getEntry() {
                MapEntry mapEntry = this.mapEntry;
                return mapEntry != null ? mapEntry : this.entry;
            }

            public Object getKey() {
                MapEntry mapEntry = this.mapEntry;
                if (mapEntry != null) {
                    return mapEntry.getKey();
                }
                return null;
            }
        }

        private Printer(boolean z14, TypeRegistry typeRegistry) {
            this.escapeNonAscii = z14;
            this.typeRegistry = typeRegistry;
        }

        private void print(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            if (messageOrBuilder.getDescriptorForType().getFullName().equals("google.protobuf.Any") && printAny(messageOrBuilder, textGenerator)) {
                return;
            }
            printMessage(messageOrBuilder, textGenerator);
        }

        private boolean printAny(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            Descriptors.Descriptor descriptorForType = messageOrBuilder.getDescriptorForType();
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByNumber = descriptorForType.findFieldByNumber(1);
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByNumber2 = descriptorForType.findFieldByNumber(2);
            if (fieldDescriptorFindFieldByNumber != null && fieldDescriptorFindFieldByNumber.getType() == Descriptors.FieldDescriptor.Type.STRING && fieldDescriptorFindFieldByNumber2 != null && fieldDescriptorFindFieldByNumber2.getType() == Descriptors.FieldDescriptor.Type.BYTES) {
                String str = (String) messageOrBuilder.getField(fieldDescriptorFindFieldByNumber);
                if (str.isEmpty()) {
                    return false;
                }
                Object field = messageOrBuilder.getField(fieldDescriptorFindFieldByNumber2);
                try {
                    Descriptors.Descriptor descriptorForTypeUrl = this.typeRegistry.getDescriptorForTypeUrl(str);
                    if (descriptorForTypeUrl == null) {
                        return false;
                    }
                    DynamicMessage.Builder builderNewBuilderForType = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                    builderNewBuilderForType.mergeFrom((ByteString) field);
                    textGenerator.print("[");
                    textGenerator.print(str);
                    textGenerator.print("] {");
                    textGenerator.eol();
                    textGenerator.indent();
                    print(builderNewBuilderForType, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print(StringSubstitutor.DEFAULT_VAR_END);
                    textGenerator.eol();
                    return true;
                } catch (InvalidProtocolBufferException unused) {
                }
            }
            return false;
        }

        private void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (!fieldDescriptor.isMapField()) {
                if (!fieldDescriptor.isRepeated()) {
                    printSingleField(fieldDescriptor, obj, textGenerator);
                    return;
                }
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    printSingleField(fieldDescriptor, it.next(), textGenerator);
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = ((List) obj).iterator();
            while (it3.hasNext()) {
                arrayList.add(new MapEntryAdapter(it3.next(), fieldDescriptor));
            }
            Collections.sort(arrayList);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                printSingleField(fieldDescriptor, ((MapEntryAdapter) it4.next()).getEntry(), textGenerator);
            }
        }

        private void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    textGenerator.print(((Integer) obj).toString());
                    break;
                case 4:
                case 5:
                case 6:
                    textGenerator.print(((Long) obj).toString());
                    break;
                case 7:
                    textGenerator.print(((Boolean) obj).toString());
                    break;
                case 8:
                    textGenerator.print(((Float) obj).toString());
                    break;
                case 9:
                    textGenerator.print(((Double) obj).toString());
                    break;
                case 10:
                case 11:
                    textGenerator.print(TextFormat.unsignedToString(((Integer) obj).intValue()));
                    break;
                case 12:
                case 13:
                    textGenerator.print(TextFormat.unsignedToString(((Long) obj).longValue()));
                    break;
                case 14:
                    textGenerator.print("\"");
                    textGenerator.print(this.escapeNonAscii ? TextFormatEscaper.escapeText((String) obj) : TextFormat.escapeDoubleQuotesAndBackslashes((String) obj).replace("\n", "\\n"));
                    textGenerator.print("\"");
                    break;
                case 15:
                    textGenerator.print("\"");
                    if (obj instanceof ByteString) {
                        textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                    } else {
                        textGenerator.print(TextFormat.escapeBytes((byte[]) obj));
                    }
                    textGenerator.print("\"");
                    break;
                case 16:
                    textGenerator.print(((Descriptors.EnumValueDescriptor) obj).getName());
                    break;
                case 17:
                case 18:
                    print((MessageOrBuilder) obj, textGenerator);
                    break;
            }
        }

        private void printMessage(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
                printField(entry.getKey(), entry.getValue(), textGenerator);
            }
            printUnknownFields(messageOrBuilder.getUnknownFields(), textGenerator);
        }

        private void printSingleField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (fieldDescriptor.isExtension()) {
                textGenerator.print("[");
                if (fieldDescriptor.getContainingType().getOptions().getMessageSetWireFormat() && fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && fieldDescriptor.isOptional() && fieldDescriptor.getExtensionScope() == fieldDescriptor.getMessageType()) {
                    textGenerator.print(fieldDescriptor.getMessageType().getFullName());
                } else {
                    textGenerator.print(fieldDescriptor.getFullName());
                }
                textGenerator.print("]");
            } else if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP) {
                textGenerator.print(fieldDescriptor.getMessageType().getName());
            } else {
                textGenerator.print(fieldDescriptor.getName());
            }
            Descriptors.FieldDescriptor.JavaType javaType = fieldDescriptor.getJavaType();
            Descriptors.FieldDescriptor.JavaType javaType2 = Descriptors.FieldDescriptor.JavaType.MESSAGE;
            if (javaType == javaType2) {
                textGenerator.print(" {");
                textGenerator.eol();
                textGenerator.indent();
            } else {
                textGenerator.print(": ");
            }
            printFieldValue(fieldDescriptor, obj, textGenerator);
            if (fieldDescriptor.getJavaType() == javaType2) {
                textGenerator.outdent();
                textGenerator.print(StringSubstitutor.DEFAULT_VAR_END);
            }
            textGenerator.eol();
        }

        private static void printUnknownField(int i14, int i15, List<?> list, TextGenerator textGenerator) throws IOException {
            for (Object obj : list) {
                textGenerator.print(String.valueOf(i14));
                textGenerator.print(": ");
                printUnknownFieldValue(i15, obj, textGenerator);
                textGenerator.eol();
            }
        }

        private static void printUnknownFieldValue(int i14, Object obj, TextGenerator textGenerator) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i14);
            if (tagWireType == 0) {
                textGenerator.print(TextFormat.unsignedToString(((Long) obj).longValue()));
                return;
            }
            if (tagWireType == 1) {
                textGenerator.print(String.format(null, "0x%016x", (Long) obj));
                return;
            }
            if (tagWireType != 2) {
                if (tagWireType == 3) {
                    printUnknownFields((UnknownFieldSet) obj, textGenerator);
                    return;
                } else if (tagWireType == 5) {
                    textGenerator.print(String.format(null, "0x%08x", (Integer) obj));
                    return;
                } else {
                    h.s(j.h(i14, "Bad tag: "));
                    return;
                }
            }
            try {
                UnknownFieldSet from = UnknownFieldSet.parseFrom((ByteString) obj);
                textGenerator.print("{");
                textGenerator.eol();
                textGenerator.indent();
                printUnknownFields(from, textGenerator);
                textGenerator.outdent();
                textGenerator.print(StringSubstitutor.DEFAULT_VAR_END);
            } catch (InvalidProtocolBufferException unused) {
                textGenerator.print("\"");
                textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                textGenerator.print("\"");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void printUnknownFields(UnknownFieldSet unknownFieldSet, TextGenerator textGenerator) throws IOException {
            for (Map.Entry<Integer, UnknownFieldSet.Field> entry : unknownFieldSet.asMap().entrySet()) {
                int iIntValue = entry.getKey().intValue();
                UnknownFieldSet.Field value = entry.getValue();
                printUnknownField(iIntValue, 0, value.getVarintList(), textGenerator);
                printUnknownField(iIntValue, 5, value.getFixed32List(), textGenerator);
                printUnknownField(iIntValue, 1, value.getFixed64List(), textGenerator);
                printUnknownField(iIntValue, 2, value.getLengthDelimitedList(), textGenerator);
                for (UnknownFieldSet unknownFieldSet2 : value.getGroupList()) {
                    textGenerator.print(entry.getKey().toString());
                    textGenerator.print(" {");
                    textGenerator.eol();
                    textGenerator.indent();
                    printUnknownFields(unknownFieldSet2, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print(StringSubstitutor.DEFAULT_VAR_END);
                    textGenerator.eol();
                }
            }
        }

        public Printer escapingNonAscii(boolean z14) {
            return new Printer(z14, this.typeRegistry);
        }

        public String printFieldToString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            try {
                StringBuilder sb3 = new StringBuilder();
                printField(fieldDescriptor, obj, sb3);
                return sb3.toString();
            } catch (IOException e4) {
                l2.p(e4);
                return null;
            }
        }

        public String printToString(MessageOrBuilder messageOrBuilder) {
            try {
                StringBuilder sb3 = new StringBuilder();
                print(messageOrBuilder, sb3);
                return sb3.toString();
            } catch (IOException e4) {
                l2.p(e4);
                return null;
            }
        }

        public String shortDebugString(MessageOrBuilder messageOrBuilder) {
            try {
                StringBuilder sb3 = new StringBuilder();
                print(messageOrBuilder, TextFormat.singleLineOutput(sb3));
                return sb3.toString();
            } catch (IOException e4) {
                l2.p(e4);
                return null;
            }
        }

        public Printer usingTypeRegistry(TypeRegistry typeRegistry) {
            if (this.typeRegistry == TypeRegistry.getEmptyTypeRegistry()) {
                return new Printer(this.escapeNonAscii, typeRegistry);
            }
            h.s("Only one typeRegistry is allowed.");
            return null;
        }

        public String printToString(UnknownFieldSet unknownFieldSet) {
            try {
                StringBuilder sb3 = new StringBuilder();
                print(unknownFieldSet, sb3);
                return sb3.toString();
            } catch (IOException e4) {
                l2.p(e4);
                return null;
            }
        }

        public String shortDebugString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            try {
                StringBuilder sb3 = new StringBuilder();
                printField(fieldDescriptor, obj, TextFormat.singleLineOutput(sb3));
                return sb3.toString();
            } catch (IOException e4) {
                l2.p(e4);
                return null;
            }
        }

        public void print(UnknownFieldSet unknownFieldSet, Appendable appendable) throws IOException {
            printUnknownFields(unknownFieldSet, TextFormat.multiLineOutput(appendable));
        }

        public String shortDebugString(UnknownFieldSet unknownFieldSet) {
            try {
                StringBuilder sb3 = new StringBuilder();
                printUnknownFields(unknownFieldSet, TextFormat.singleLineOutput(sb3));
                return sb3.toString();
            } catch (IOException e4) {
                l2.p(e4);
                return null;
            }
        }

        public void print(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
            print(messageOrBuilder, TextFormat.multiLineOutput(appendable));
        }

        public void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
            printField(fieldDescriptor, obj, TextFormat.multiLineOutput(appendable));
        }

        public void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
            printFieldValue(fieldDescriptor, obj, TextFormat.multiLineOutput(appendable));
        }
    }

    public static <T extends Message> T parse(CharSequence charSequence, ExtensionRegistry extensionRegistry, Class<T> cls) throws ParseException {
        Message.Builder builderNewBuilderForType = ((Message) Internal.getDefaultInstance(cls)).newBuilderForType();
        merge(charSequence, extensionRegistry, builderNewBuilderForType);
        return (T) builderNewBuilderForType.build();
    }

    public static String unsignedToString(int i14) {
        if (i14 >= 0) {
            return Integer.toString(i14);
        }
        return Long.toString(((long) i14) & 4294967295L);
    }

    public static final class Tokenizer {
        private int column;
        private boolean containsSilentMarkerAfterCurrentToken;
        private boolean containsSilentMarkerAfterPrevToken;
        private String currentToken;
        private int line;
        private final Matcher matcher;
        private int pos;
        private int previousColumn;
        private int previousLine;
        private final CharSequence text;
        private static final Pattern WHITESPACE = Pattern.compile("(\\s|(#.*$))++", 8);
        private static final Pattern TOKEN = Pattern.compile("[a-zA-Z_][0-9a-zA-Z_+-]*+|[.]?[0-9+-][0-9a-zA-Z_.+-]*+|\"([^\"\n\\\\]|\\\\.)*+(\"|\\\\?$)|'([^'\n\\\\]|\\\\.)*+('|\\\\?$)", 8);
        private static final Pattern DOUBLE_INFINITY = Pattern.compile("-?inf(inity)?", 2);
        private static final Pattern FLOAT_INFINITY = Pattern.compile("-?inf(inity)?f?", 2);
        private static final Pattern FLOAT_NAN = Pattern.compile("nanf?", 2);

        private Tokenizer(CharSequence charSequence) {
            this.pos = 0;
            this.line = 0;
            this.column = 0;
            this.previousLine = 0;
            this.previousColumn = 0;
            this.containsSilentMarkerAfterCurrentToken = false;
            this.containsSilentMarkerAfterPrevToken = false;
            this.text = charSequence;
            this.matcher = WHITESPACE.matcher(charSequence);
            skipWhitespace();
            nextToken();
        }

        private void consumeByteString(List<ByteString> list) throws ParseException {
            char cCharAt = this.currentToken.length() > 0 ? this.currentToken.charAt(0) : (char) 0;
            if (cCharAt != '\"' && cCharAt != '\'') {
                throw parseException("Expected string.");
            }
            if (this.currentToken.length() >= 2) {
                String str = this.currentToken;
                if (str.charAt(str.length() - 1) == cCharAt) {
                    try {
                        String str2 = this.currentToken;
                        ByteString byteStringUnescapeBytes = TextFormat.unescapeBytes(str2.substring(1, str2.length() - 1));
                        nextToken();
                        list.add(byteStringUnescapeBytes);
                        return;
                    } catch (InvalidEscapeSequenceException e4) {
                        throw parseException(e4.getMessage());
                    }
                }
            }
            throw parseException("String missing ending quote.");
        }

        private ParseException floatParseException(NumberFormatException numberFormatException) {
            return parseException("Couldn't parse number: " + numberFormatException.getMessage());
        }

        private ParseException integerParseException(NumberFormatException numberFormatException) {
            return parseException("Couldn't parse integer: " + numberFormatException.getMessage());
        }

        private void skipWhitespace() {
            this.matcher.usePattern(WHITESPACE);
            if (this.matcher.lookingAt()) {
                Matcher matcher = this.matcher;
                matcher.region(matcher.end(), this.matcher.regionEnd());
            }
        }

        public boolean atEnd() {
            return this.currentToken.length() == 0;
        }

        public void consume(String str) throws ParseException {
            if (!tryConsume(str)) {
                throw parseException(j.m("Expected \"", str, "\"."));
            }
        }

        public boolean consumeBoolean() throws ParseException {
            if (this.currentToken.equals(BooleanUtils.TRUE) || this.currentToken.equals("True") || this.currentToken.equals(JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT) || this.currentToken.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                nextToken();
                return true;
            }
            if (this.currentToken.equals(BooleanUtils.FALSE) || this.currentToken.equals("False") || this.currentToken.equals("f") || this.currentToken.equals("0")) {
                nextToken();
                return false;
            }
            throw parseException(j.o(this.currentToken, "\".", new StringBuilder("Expected \"true\" or \"false\". Found \"")));
        }

        public double consumeDouble() throws ParseException {
            boolean zMatches = DOUBLE_INFINITY.matcher(this.currentToken).matches();
            String str = this.currentToken;
            if (zMatches) {
                boolean zStartsWith = str.startsWith("-");
                nextToken();
                return zStartsWith ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            }
            if (str.equalsIgnoreCase("nan")) {
                nextToken();
                return Double.NaN;
            }
            try {
                double d14 = Double.parseDouble(this.currentToken);
                nextToken();
                return d14;
            } catch (NumberFormatException e4) {
                throw floatParseException(e4);
            }
        }

        public float consumeFloat() throws ParseException {
            boolean zMatches = FLOAT_INFINITY.matcher(this.currentToken).matches();
            String str = this.currentToken;
            if (zMatches) {
                boolean zStartsWith = str.startsWith("-");
                nextToken();
                return zStartsWith ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            }
            if (FLOAT_NAN.matcher(str).matches()) {
                nextToken();
                return Float.NaN;
            }
            try {
                float f14 = Float.parseFloat(this.currentToken);
                nextToken();
                return f14;
            } catch (NumberFormatException e4) {
                throw floatParseException(e4);
            }
        }

        public String consumeIdentifier() throws ParseException {
            int i14 = 0;
            while (true) {
                int length = this.currentToken.length();
                String str = this.currentToken;
                if (i14 >= length) {
                    nextToken();
                    return str;
                }
                char cCharAt = str.charAt(i14);
                if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && !(('0' <= cCharAt && cCharAt <= '9') || cCharAt == '_' || cCharAt == '.'))) {
                    throw parseException(j.o(this.currentToken, "'", new StringBuilder("Expected identifier. Found '")));
                }
                i14++;
            }
        }

        public int consumeInt32() throws ParseException {
            try {
                int int32 = TextFormat.parseInt32(this.currentToken);
                nextToken();
                return int32;
            } catch (NumberFormatException e4) {
                throw integerParseException(e4);
            }
        }

        public long consumeInt64() throws ParseException {
            try {
                long int64 = TextFormat.parseInt64(this.currentToken);
                nextToken();
                return int64;
            } catch (NumberFormatException e4) {
                throw integerParseException(e4);
            }
        }

        public String consumeString() {
            return consumeByteString().toStringUtf8();
        }

        public int consumeUInt32() throws ParseException {
            try {
                int uInt32 = TextFormat.parseUInt32(this.currentToken);
                nextToken();
                return uInt32;
            } catch (NumberFormatException e4) {
                throw integerParseException(e4);
            }
        }

        public long consumeUInt64() throws ParseException {
            try {
                long uInt64 = TextFormat.parseUInt64(this.currentToken);
                nextToken();
                return uInt64;
            } catch (NumberFormatException e4) {
                throw integerParseException(e4);
            }
        }

        public int getColumn() {
            return this.column;
        }

        public boolean getContainsSilentMarkerAfterCurrentToken() {
            return this.containsSilentMarkerAfterCurrentToken;
        }

        public boolean getContainsSilentMarkerAfterPrevToken() {
            return this.containsSilentMarkerAfterPrevToken;
        }

        public int getLine() {
            return this.line;
        }

        public int getPreviousColumn() {
            return this.previousColumn;
        }

        public int getPreviousLine() {
            return this.previousLine;
        }

        public boolean lookingAt(String str) {
            return this.currentToken.equals(str);
        }

        public boolean lookingAtInteger() {
            if (this.currentToken.length() == 0) {
                return false;
            }
            char cCharAt = this.currentToken.charAt(0);
            return ('0' <= cCharAt && cCharAt <= '9') || cCharAt == '-' || cCharAt == '+';
        }

        public void nextToken() {
            this.previousLine = this.line;
            this.previousColumn = this.column;
            while (this.pos < this.matcher.regionStart()) {
                if (this.text.charAt(this.pos) == '\n') {
                    this.line++;
                    this.column = 0;
                } else {
                    this.column++;
                }
                this.pos++;
            }
            if (this.matcher.regionStart() == this.matcher.regionEnd()) {
                this.currentToken = "";
                return;
            }
            this.matcher.usePattern(TOKEN);
            if (this.matcher.lookingAt()) {
                this.currentToken = this.matcher.group();
                Matcher matcher = this.matcher;
                matcher.region(matcher.end(), this.matcher.regionEnd());
            } else {
                this.currentToken = String.valueOf(this.text.charAt(this.pos));
                Matcher matcher2 = this.matcher;
                matcher2.region(this.pos + 1, matcher2.regionEnd());
            }
            skipWhitespace();
        }

        public ParseException parseException(String str) {
            return new ParseException(this.line + 1, this.column + 1, str);
        }

        public ParseException parseExceptionPreviousToken(String str) {
            return new ParseException(this.previousLine + 1, this.previousColumn + 1, str);
        }

        public boolean tryConsume(String str) {
            if (!this.currentToken.equals(str)) {
                return false;
            }
            nextToken();
            return true;
        }

        public boolean tryConsumeByteString() {
            try {
                consumeByteString();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeDouble() {
            try {
                consumeDouble();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeFloat() {
            try {
                consumeFloat();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeIdentifier() {
            try {
                consumeIdentifier();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeInt64() {
            try {
                consumeInt64();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeUInt64() {
            try {
                consumeUInt64();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public /* synthetic */ Tokenizer(CharSequence charSequence, AnonymousClass1 anonymousClass1) {
            this(charSequence);
        }

        @CanIgnoreReturnValue
        public ByteString consumeByteString() throws ParseException {
            ArrayList arrayList = new ArrayList();
            consumeByteString(arrayList);
            while (true) {
                if (!this.currentToken.startsWith("'") && !this.currentToken.startsWith("\"")) {
                    return ByteString.copyFrom(arrayList);
                }
                consumeByteString(arrayList);
            }
        }
    }

    public static class ParseException extends IOException {
        private static final long serialVersionUID = 3196188060225107702L;
        private final int column;
        private final int line;

        public ParseException(int i14, int i15, String str) {
            super(Integer.toString(i14) + ":" + i15 + ": " + str);
            this.line = i14;
            this.column = i15;
        }

        public int getColumn() {
            return this.column;
        }

        public int getLine() {
            return this.line;
        }

        public ParseException(String str) {
            this(-1, -1, str);
        }
    }

    public static void printUnknownFieldValue(int i14, Object obj, Appendable appendable) throws IOException {
        printUnknownFieldValue(i14, obj, multiLineOutput(appendable));
    }
}
