package com.google.protobuf.util;

import ch.qos.logback.core.joran.action.Action;
import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.messaging.l;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.maps.android.BuildConfig;
import com.google.protobuf.Any;
import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Duration;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.FieldMask;
import com.google.protobuf.FloatValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ListValue;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.NullValue;
import com.google.protobuf.StringValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt64Value;
import com.google.protobuf.Value;
import com.google.protobuf.a;
import fb1.c;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes2.dex */
public class JsonFormat {
    private static final Logger logger = Logger.getLogger(JsonFormat.class.getName());

    /* JADX INFO: renamed from: com.google.protobuf.util.JsonFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
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
        }
    }

    public interface TextGenerator {
        void indent();

        void outdent();

        void print(CharSequence charSequence);
    }

    private JsonFormat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getTypeName(String str) throws InvalidProtocolBufferException {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length != 1) {
            return strArrSplit[strArrSplit.length - 1];
        }
        throw new InvalidProtocolBufferException("Invalid type url found: ".concat(str));
    }

    public static Parser parser() {
        return new Parser(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), TypeRegistry.getEmptyTypeRegistry(), false, 100, null);
    }

    public static Printer printer() {
        return new Printer(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), TypeRegistry.getEmptyTypeRegistry(), false, Collections.EMPTY_SET, false, false, false, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String unsignedToString(long j8) {
        return j8 >= 0 ? Long.toString(j8) : BigInteger.valueOf(j8 & Long.MAX_VALUE).setBit(63).toString();
    }

    public static final class CompactTextGenerator implements TextGenerator {
        private final Appendable output;

        private CompactTextGenerator(Appendable appendable) {
            this.output = appendable;
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void indent() {
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void outdent() {
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void print(CharSequence charSequence) throws IOException {
            this.output.append(charSequence);
        }

        public /* synthetic */ CompactTextGenerator(Appendable appendable, AnonymousClass1 anonymousClass1) {
            this(appendable);
        }
    }

    public static class TypeRegistry {
        private final Map<String, Descriptors.Descriptor> types;

        public static class EmptyTypeRegistryHolder {
            private static final TypeRegistry EMPTY = new TypeRegistry(Collections.EMPTY_MAP, null);

            private EmptyTypeRegistryHolder() {
            }
        }

        private TypeRegistry(Map<String, Descriptors.Descriptor> map) {
            this.types = map;
        }

        public static TypeRegistry getEmptyTypeRegistry() {
            return EmptyTypeRegistryHolder.EMPTY;
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        public Descriptors.Descriptor find(String str) {
            return this.types.get(str);
        }

        public Descriptors.Descriptor getDescriptorForTypeUrl(String str) {
            return find(JsonFormat.getTypeName(str));
        }

        public /* synthetic */ TypeRegistry(Map map, AnonymousClass1 anonymousClass1) {
            this(map);
        }

        public static class Builder {
            private boolean built;
            private final Set<String> files;
            private final Map<String, Descriptors.Descriptor> types;

            private Builder() {
                this.files = new HashSet();
                this.types = new HashMap();
                this.built = false;
            }

            private void addFile(Descriptors.FileDescriptor fileDescriptor) {
                if (this.files.add(fileDescriptor.getFullName())) {
                    Iterator<Descriptors.FileDescriptor> it = fileDescriptor.getDependencies().iterator();
                    while (it.hasNext()) {
                        addFile(it.next());
                    }
                    Iterator<Descriptors.Descriptor> it3 = fileDescriptor.getMessageTypes().iterator();
                    while (it3.hasNext()) {
                        addMessage(it3.next());
                    }
                }
            }

            private void addMessage(Descriptors.Descriptor descriptor) {
                Iterator<Descriptors.Descriptor> it = descriptor.getNestedTypes().iterator();
                while (it.hasNext()) {
                    addMessage(it.next());
                }
                if (!this.types.containsKey(descriptor.getFullName())) {
                    this.types.put(descriptor.getFullName(), descriptor);
                    return;
                }
                JsonFormat.logger.warning("Type " + descriptor.getFullName() + " is added multiple times.");
            }

            @CanIgnoreReturnValue
            public Builder add(Iterable<Descriptors.Descriptor> iterable) {
                if (this.built) {
                    h.z("A TypeRegistry.Builder can only be used once.");
                    return null;
                }
                Iterator<Descriptors.Descriptor> it = iterable.iterator();
                while (it.hasNext()) {
                    addFile(it.next().getFile());
                }
                return this;
            }

            public TypeRegistry build() {
                this.built = true;
                return new TypeRegistry(this.types, null);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            @CanIgnoreReturnValue
            public Builder add(Descriptors.Descriptor descriptor) {
                if (!this.built) {
                    addFile(descriptor.getFile());
                    return this;
                }
                h.z("A TypeRegistry.Builder can only be used once.");
                return null;
            }
        }
    }

    public static class Parser {
        private static final int DEFAULT_RECURSION_LIMIT = 100;
        private final boolean ignoringUnknownFields;
        private final TypeRegistry oldRegistry;
        private final int recursionLimit;
        private final com.google.protobuf.TypeRegistry registry;

        private Parser(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z14, int i14) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.ignoringUnknownFields = z14;
            this.recursionLimit = i14;
        }

        public Parser ignoringUnknownFields() {
            return new Parser(this.registry, this.oldRegistry, true, this.recursionLimit);
        }

        public void merge(String str, Message.Builder builder) throws InvalidProtocolBufferException {
            new ParserImpl(this.registry, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit).merge(str, builder);
        }

        public Parser usingRecursionLimit(int i14) {
            return new Parser(this.registry, this.oldRegistry, this.ignoringUnknownFields, i14);
        }

        public Parser usingTypeRegistry(TypeRegistry typeRegistry) {
            if (this.oldRegistry == TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                return new Parser(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), typeRegistry, this.ignoringUnknownFields, this.recursionLimit);
            }
            h.s("Only one registry is allowed.");
            return null;
        }

        public /* synthetic */ Parser(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z14, int i14, AnonymousClass1 anonymousClass1) {
            this(typeRegistry, typeRegistry2, z14, i14);
        }

        public void merge(Reader reader, Message.Builder builder) throws IOException {
            new ParserImpl(this.registry, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit).merge(reader, builder);
        }

        public Parser usingTypeRegistry(com.google.protobuf.TypeRegistry typeRegistry) {
            if (this.oldRegistry == TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                return new Parser(typeRegistry, this.oldRegistry, this.ignoringUnknownFields, this.recursionLimit);
            }
            h.s("Only one registry is allowed.");
            return null;
        }
    }

    public static final class PrettyTextGenerator implements TextGenerator {
        private boolean atStartOfLine;
        private final StringBuilder indent;
        private final Appendable output;

        private PrettyTextGenerator(Appendable appendable) {
            this.indent = new StringBuilder();
            this.atStartOfLine = true;
            this.output = appendable;
        }

        private void write(CharSequence charSequence) throws IOException {
            if (charSequence.length() == 0) {
                return;
            }
            if (this.atStartOfLine) {
                this.atStartOfLine = false;
                this.output.append(this.indent);
            }
            this.output.append(charSequence);
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void indent() {
            this.indent.append("  ");
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void outdent() {
            int length = this.indent.length();
            if (length >= 2) {
                this.indent.delete(length - 2, length);
            } else {
                h.s(" Outdent() without matching Indent().");
            }
        }

        @Override // com.google.protobuf.util.JsonFormat.TextGenerator
        public void print(CharSequence charSequence) throws IOException {
            int length = charSequence.length();
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                if (charSequence.charAt(i15) == '\n') {
                    int i16 = i15 + 1;
                    write(charSequence.subSequence(i14, i16));
                    this.atStartOfLine = true;
                    i14 = i16;
                }
            }
            write(charSequence.subSequence(i14, length));
        }

        public /* synthetic */ PrettyTextGenerator(Appendable appendable, AnonymousClass1 anonymousClass1) {
            this(appendable);
        }
    }

    public static class Printer {
        private boolean alwaysOutputDefaultValueFields;
        private Set<Descriptors.FieldDescriptor> includingDefaultValueFields;
        private final TypeRegistry oldRegistry;
        private final boolean omittingInsignificantWhitespace;
        private final boolean preservingProtoFieldNames;
        private final boolean printingEnumsAsInts;
        private final com.google.protobuf.TypeRegistry registry;
        private final boolean sortingMapKeys;

        private Printer(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z14, Set<Descriptors.FieldDescriptor> set, boolean z15, boolean z16, boolean z17, boolean z18) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.alwaysOutputDefaultValueFields = z14;
            this.includingDefaultValueFields = set;
            this.preservingProtoFieldNames = z15;
            this.omittingInsignificantWhitespace = z16;
            this.printingEnumsAsInts = z17;
            this.sortingMapKeys = z18;
        }

        private void checkUnsetIncludingDefaultValueFields() {
            if (this.alwaysOutputDefaultValueFields || !this.includingDefaultValueFields.isEmpty()) {
                h.z("JsonFormat includingDefaultValueFields has already been set.");
            }
        }

        private void checkUnsetPrintingEnumsAsInts() {
            if (this.printingEnumsAsInts) {
                h.z("JsonFormat printingEnumsAsInts has already been set.");
            }
        }

        public void appendTo(MessageOrBuilder messageOrBuilder, Appendable appendable) throws InvalidProtocolBufferException {
            new PrinterImpl(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, appendable, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys).print(messageOrBuilder);
        }

        public Printer includingDefaultValueFields(Set<Descriptors.FieldDescriptor> set) {
            Preconditions.checkArgument((set == null || set.isEmpty()) ? false : true, "Non-empty Set must be supplied for includingDefaultValueFields.");
            checkUnsetIncludingDefaultValueFields();
            return new Printer(this.registry, this.oldRegistry, false, Collections.unmodifiableSet(new HashSet(set)), this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public Printer omittingInsignificantWhitespace() {
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, true, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public Printer preservingProtoFieldNames() {
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, true, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
        }

        public String print(MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
            try {
                StringBuilder sb3 = new StringBuilder();
                appendTo(messageOrBuilder, sb3);
                return sb3.toString();
            } catch (InvalidProtocolBufferException e4) {
                throw e4;
            } catch (IOException e14) {
                l2.p(e14);
                return null;
            }
        }

        public Printer printingEnumsAsInts() {
            checkUnsetPrintingEnumsAsInts();
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, true, this.sortingMapKeys);
        }

        public Printer sortingMapKeys() {
            return new Printer(this.registry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, true);
        }

        public Printer usingTypeRegistry(TypeRegistry typeRegistry) {
            if (this.oldRegistry == TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                return new Printer(com.google.protobuf.TypeRegistry.getEmptyTypeRegistry(), typeRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
            }
            h.s("Only one registry is allowed.");
            return null;
        }

        public /* synthetic */ Printer(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z14, Set set, boolean z15, boolean z16, boolean z17, boolean z18, AnonymousClass1 anonymousClass1) {
            this(typeRegistry, typeRegistry2, z14, set, z15, z16, z17, z18);
        }

        public Printer usingTypeRegistry(com.google.protobuf.TypeRegistry typeRegistry) {
            if (this.oldRegistry == TypeRegistry.getEmptyTypeRegistry() && this.registry == com.google.protobuf.TypeRegistry.getEmptyTypeRegistry()) {
                return new Printer(typeRegistry, this.oldRegistry, this.alwaysOutputDefaultValueFields, this.includingDefaultValueFields, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
            }
            h.s("Only one registry is allowed.");
            return null;
        }

        public Printer includingDefaultValueFields() {
            checkUnsetIncludingDefaultValueFields();
            return new Printer(this.registry, this.oldRegistry, true, Collections.EMPTY_SET, this.preservingProtoFieldNames, this.omittingInsignificantWhitespace, this.printingEnumsAsInts, this.sortingMapKeys);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String unsignedToString(int i14) {
        if (i14 >= 0) {
            return Integer.toString(i14);
        }
        return Long.toString(((long) i14) & 4294967295L);
    }

    public static class ParserImpl {
        private static final double EPSILON = 1.0E-6d;
        private static final BigDecimal MAX_DOUBLE;
        private static final BigDecimal MIN_DOUBLE;
        private static final BigDecimal MORE_THAN_ONE;
        private final boolean ignoringUnknownFields;
        private final TypeRegistry oldRegistry;
        private final int recursionLimit;
        private final com.google.protobuf.TypeRegistry registry;
        private static final Map<String, WellKnownTypeParser> wellKnownTypeParsers = buildWellKnownTypeParsers();
        private static final BigInteger MAX_UINT64 = new BigInteger("FFFFFFFFFFFFFFFF", 16);
        private final Map<Descriptors.Descriptor, Map<String, Descriptors.FieldDescriptor>> fieldNameMaps = new HashMap();
        private int currentDepth = 0;

        public interface WellKnownTypeParser {
            void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder);
        }

        static {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(1.000001d));
            MORE_THAN_ONE = bigDecimal;
            MAX_DOUBLE = new BigDecimal(String.valueOf(Double.MAX_VALUE)).multiply(bigDecimal);
            MIN_DOUBLE = new BigDecimal(String.valueOf(-1.7976931348623157E308d)).multiply(bigDecimal);
        }

        public ParserImpl(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z14, int i14) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.ignoringUnknownFields = z14;
            this.recursionLimit = i14;
        }

        private static Map<String, WellKnownTypeParser> buildWellKnownTypeParsers() {
            HashMap map = new HashMap();
            map.put(Any.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.1
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeAny(jsonElement, builder);
                }
            });
            WellKnownTypeParser wellKnownTypeParser = new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.2
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeWrapper(jsonElement, builder);
                }
            };
            map.put(BoolValue.getDescriptor().getFullName(), wellKnownTypeParser);
            map.put(Int32Value.getDescriptor().getFullName(), wellKnownTypeParser);
            map.put(UInt32Value.getDescriptor().getFullName(), wellKnownTypeParser);
            map.put(Int64Value.getDescriptor().getFullName(), wellKnownTypeParser);
            map.put(UInt64Value.getDescriptor().getFullName(), wellKnownTypeParser);
            map.put(StringValue.getDescriptor().getFullName(), wellKnownTypeParser);
            map.put(BytesValue.getDescriptor().getFullName(), wellKnownTypeParser);
            map.put(FloatValue.getDescriptor().getFullName(), wellKnownTypeParser);
            map.put(DoubleValue.getDescriptor().getFullName(), wellKnownTypeParser);
            map.put(Timestamp.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.3
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeTimestamp(jsonElement, builder);
                }
            });
            map.put(Duration.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.4
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeDuration(jsonElement, builder);
                }
            });
            map.put(FieldMask.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.5
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) {
                    parserImpl.mergeFieldMask(jsonElement, builder);
                }
            });
            map.put(Struct.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.6
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeStruct(jsonElement, builder);
                }
            });
            map.put(ListValue.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.7
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeListValue(jsonElement, builder);
                }
            });
            map.put(Value.getDescriptor().getFullName(), new WellKnownTypeParser() { // from class: com.google.protobuf.util.JsonFormat.ParserImpl.8
                @Override // com.google.protobuf.util.JsonFormat.ParserImpl.WellKnownTypeParser
                public void merge(ParserImpl parserImpl, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
                    parserImpl.mergeValue(jsonElement, builder);
                }
            });
            return map;
        }

        private Map<String, Descriptors.FieldDescriptor> getFieldNameMap(Descriptors.Descriptor descriptor) {
            if (this.fieldNameMaps.containsKey(descriptor)) {
                return this.fieldNameMaps.get(descriptor);
            }
            HashMap map = new HashMap();
            for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
                map.put(fieldDescriptor.getName(), fieldDescriptor);
                map.put(fieldDescriptor.getJsonName(), fieldDescriptor);
            }
            this.fieldNameMaps.put(descriptor, map);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAny(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Descriptors.Descriptor descriptorForType = builder.getDescriptorForType();
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = descriptorForType.findFieldByName("type_url");
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName2 = descriptorForType.findFieldByName("value");
            if (fieldDescriptorFindFieldByName == null || fieldDescriptorFindFieldByName2 == null || fieldDescriptorFindFieldByName.getType() != Descriptors.FieldDescriptor.Type.STRING || fieldDescriptorFindFieldByName2.getType() != Descriptors.FieldDescriptor.Type.BYTES) {
                throw new InvalidProtocolBufferException("Invalid Any type.");
            }
            if (!(jsonElement instanceof JsonObject)) {
                a.o(jsonElement, "Expect message object but got: ");
                return;
            }
            JsonObject jsonObject = (JsonObject) jsonElement;
            if (jsonObject.entrySet().isEmpty()) {
                return;
            }
            JsonElement jsonElement2 = jsonObject.get("@type");
            if (jsonElement2 == null) {
                a.o(jsonElement, "Missing type url when parsing: ");
                return;
            }
            String asString = jsonElement2.getAsString();
            Descriptors.Descriptor descriptorForTypeUrl = this.registry.getDescriptorForTypeUrl(asString);
            if (descriptorForTypeUrl == null && (descriptorForTypeUrl = this.oldRegistry.getDescriptorForTypeUrl(asString)) == null) {
                throw new InvalidProtocolBufferException(c.n("Cannot resolve type: ", asString));
            }
            builder.setField(fieldDescriptorFindFieldByName, asString);
            DynamicMessage.Builder builderNewBuilderForType = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
            WellKnownTypeParser wellKnownTypeParser = wellKnownTypeParsers.get(descriptorForTypeUrl.getFullName());
            if (wellKnownTypeParser != null) {
                JsonElement jsonElement3 = jsonObject.get("value");
                if (jsonElement3 != null) {
                    wellKnownTypeParser.merge(this, jsonElement3, builderNewBuilderForType);
                }
            } else {
                mergeMessage(jsonElement, builderNewBuilderForType, true);
            }
            builder.setField(fieldDescriptorFindFieldByName2, builderNewBuilderForType.build().toByteString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDuration(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            try {
                builder.mergeFrom(Durations.parse(jsonElement.getAsString()).toByteString());
            } catch (UnsupportedOperationException | ParseException e4) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException("Failed to parse duration: " + jsonElement);
                invalidProtocolBufferException.initCause(e4);
                throw invalidProtocolBufferException;
            }
        }

        private void mergeField(Descriptors.FieldDescriptor fieldDescriptor, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            if (fieldDescriptor.isRepeated()) {
                if (builder.getRepeatedFieldCount(fieldDescriptor) > 0) {
                    throw new InvalidProtocolBufferException("Field " + fieldDescriptor.getFullName() + " has already been set.");
                }
            } else if (builder.hasField(fieldDescriptor)) {
                throw new InvalidProtocolBufferException("Field " + fieldDescriptor.getFullName() + " has already been set.");
            }
            if (fieldDescriptor.isRepeated() && (jsonElement instanceof JsonNull)) {
                return;
            }
            if (fieldDescriptor.isMapField()) {
                mergeMapField(fieldDescriptor, jsonElement, builder);
                return;
            }
            if (fieldDescriptor.isRepeated()) {
                mergeRepeatedField(fieldDescriptor, jsonElement, builder);
                return;
            }
            if (fieldDescriptor.getContainingOneof() != null) {
                mergeOneofField(fieldDescriptor, jsonElement, builder);
                return;
            }
            Object fieldValue = parseFieldValue(fieldDescriptor, jsonElement, builder);
            if (fieldValue != null) {
                builder.setField(fieldDescriptor, fieldValue);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFieldMask(JsonElement jsonElement, Message.Builder builder) {
            builder.mergeFrom(FieldMaskUtil.fromJsonString(jsonElement.getAsString()).toByteString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeListValue(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = builder.getDescriptorForType().findFieldByName("values");
            if (fieldDescriptorFindFieldByName == null) {
                throw new InvalidProtocolBufferException("Invalid ListValue type.");
            }
            mergeRepeatedField(fieldDescriptorFindFieldByName, jsonElement, builder);
        }

        private void mergeMapField(Descriptors.FieldDescriptor fieldDescriptor, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            if (!(jsonElement instanceof JsonObject)) {
                a.o(jsonElement, "Expect a map object but found: ");
                return;
            }
            Descriptors.Descriptor messageType = fieldDescriptor.getMessageType();
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = messageType.findFieldByName(Action.KEY_ATTRIBUTE);
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName2 = messageType.findFieldByName("value");
            if (fieldDescriptorFindFieldByName == null || fieldDescriptorFindFieldByName2 == null) {
                a.j(fieldDescriptor.getFullName(), "Invalid map field: ");
                return;
            }
            for (Map.Entry<String, JsonElement> entry : ((JsonObject) jsonElement).entrySet()) {
                Message.Builder builderNewBuilderForField = builder.newBuilderForField(fieldDescriptor);
                Object fieldValue = parseFieldValue(fieldDescriptorFindFieldByName, new JsonPrimitive(entry.getKey()), builderNewBuilderForField);
                Object fieldValue2 = parseFieldValue(fieldDescriptorFindFieldByName2, entry.getValue(), builderNewBuilderForField);
                if (fieldValue2 != null) {
                    builderNewBuilderForField.setField(fieldDescriptorFindFieldByName, fieldValue);
                    builderNewBuilderForField.setField(fieldDescriptorFindFieldByName2, fieldValue2);
                    builder.addRepeatedField(fieldDescriptor, builderNewBuilderForField.build());
                } else if (!this.ignoringUnknownFields || fieldDescriptorFindFieldByName2.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                    throw new InvalidProtocolBufferException("Map value cannot be null.");
                }
            }
        }

        private void mergeMessage(JsonElement jsonElement, Message.Builder builder, boolean z14) throws InvalidProtocolBufferException {
            if (!(jsonElement instanceof JsonObject)) {
                a.o(jsonElement, "Expect message object but got: ");
                return;
            }
            Map<String, Descriptors.FieldDescriptor> fieldNameMap = getFieldNameMap(builder.getDescriptorForType());
            for (Map.Entry<String, JsonElement> entry : ((JsonObject) jsonElement).entrySet()) {
                if (!z14 || !entry.getKey().equals("@type")) {
                    Descriptors.FieldDescriptor fieldDescriptor = fieldNameMap.get(entry.getKey());
                    if (fieldDescriptor != null) {
                        mergeField(fieldDescriptor, entry.getValue(), builder);
                    } else if (!this.ignoringUnknownFields) {
                        throw new InvalidProtocolBufferException("Cannot find field: " + entry.getKey() + " in message " + builder.getDescriptorForType().getFullName());
                    }
                }
            }
        }

        private void mergeOneofField(Descriptors.FieldDescriptor fieldDescriptor, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Object fieldValue = parseFieldValue(fieldDescriptor, jsonElement, builder);
            if (fieldValue == null) {
                return;
            }
            if (builder.getOneofFieldDescriptor(fieldDescriptor.getContainingOneof()) == null) {
                builder.setField(fieldDescriptor, fieldValue);
                return;
            }
            throw new InvalidProtocolBufferException("Cannot set field " + fieldDescriptor.getFullName() + " because another field " + builder.getOneofFieldDescriptor(fieldDescriptor.getContainingOneof()).getFullName() + " belonging to the same oneof has already been set ");
        }

        private void mergeRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            if (!(jsonElement instanceof JsonArray)) {
                throw new InvalidProtocolBufferException("Expected an array for " + fieldDescriptor.getName() + " but found " + jsonElement);
            }
            JsonArray jsonArray = (JsonArray) jsonElement;
            for (int i14 = 0; i14 < jsonArray.size(); i14++) {
                Object fieldValue = parseFieldValue(fieldDescriptor, jsonArray.get(i14), builder);
                if (fieldValue != null) {
                    builder.addRepeatedField(fieldDescriptor, fieldValue);
                } else if (!this.ignoringUnknownFields || fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                    a.j(fieldDescriptor.getFullName(), "Repeated field elements cannot be null in field: ");
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStruct(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = builder.getDescriptorForType().findFieldByName("fields");
            if (fieldDescriptorFindFieldByName == null) {
                throw new InvalidProtocolBufferException("Invalid Struct type.");
            }
            mergeMapField(fieldDescriptorFindFieldByName, jsonElement, builder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            try {
                builder.mergeFrom(Timestamps.parse(jsonElement.getAsString()).toByteString());
            } catch (UnsupportedOperationException | ParseException e4) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException("Failed to parse timestamp: " + jsonElement);
                invalidProtocolBufferException.initCause(e4);
                throw invalidProtocolBufferException;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValue(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Descriptors.Descriptor descriptorForType = builder.getDescriptorForType();
            if (jsonElement instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
                if (jsonPrimitive.isBoolean()) {
                    builder.setField(descriptorForType.findFieldByName("bool_value"), Boolean.valueOf(jsonPrimitive.getAsBoolean()));
                    return;
                } else if (jsonPrimitive.isNumber()) {
                    builder.setField(descriptorForType.findFieldByName("number_value"), Double.valueOf(jsonPrimitive.getAsDouble()));
                    return;
                } else {
                    builder.setField(descriptorForType.findFieldByName("string_value"), jsonPrimitive.getAsString());
                    return;
                }
            }
            if (jsonElement instanceof JsonObject) {
                Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = descriptorForType.findFieldByName("struct_value");
                Message.Builder builderNewBuilderForField = builder.newBuilderForField(fieldDescriptorFindFieldByName);
                merge(jsonElement, builderNewBuilderForField);
                builder.setField(fieldDescriptorFindFieldByName, builderNewBuilderForField.build());
                return;
            }
            if (jsonElement instanceof JsonArray) {
                Descriptors.FieldDescriptor fieldDescriptorFindFieldByName2 = descriptorForType.findFieldByName("list_value");
                Message.Builder builderNewBuilderForField2 = builder.newBuilderForField(fieldDescriptorFindFieldByName2);
                merge(jsonElement, builderNewBuilderForField2);
                builder.setField(fieldDescriptorFindFieldByName2, builderNewBuilderForField2.build());
                return;
            }
            if (jsonElement instanceof JsonNull) {
                builder.setField(descriptorForType.findFieldByName("null_value"), NullValue.NULL_VALUE.getValueDescriptor());
            } else {
                l.n(jsonElement, "Unexpected json data: ");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWrapper(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            Descriptors.Descriptor descriptorForType = builder.getDescriptorForType();
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = descriptorForType.findFieldByName("value");
            if (fieldDescriptorFindFieldByName != null) {
                builder.setField(fieldDescriptorFindFieldByName, parseFieldValue(fieldDescriptorFindFieldByName, jsonElement, builder));
            } else {
                a.j(descriptorForType.getFullName(), "Invalid wrapper type: ");
            }
        }

        private boolean parseBool(JsonElement jsonElement) throws InvalidProtocolBufferException {
            if (jsonElement.getAsString().equals(BooleanUtils.TRUE)) {
                return true;
            }
            if (jsonElement.getAsString().equals(BooleanUtils.FALSE)) {
                return false;
            }
            a.o(jsonElement, "Invalid bool value: ");
            return false;
        }

        private ByteString parseBytes(JsonElement jsonElement) {
            try {
                return ByteString.copyFrom(BaseEncoding.base64().decode(jsonElement.getAsString()));
            } catch (IllegalArgumentException unused) {
                return ByteString.copyFrom(BaseEncoding.base64Url().decode(jsonElement.getAsString()));
            }
        }

        private double parseDouble(JsonElement jsonElement) throws InvalidProtocolBufferException {
            if (jsonElement.getAsString().equals("NaN")) {
                return Double.NaN;
            }
            if (jsonElement.getAsString().equals("Infinity")) {
                return Double.POSITIVE_INFINITY;
            }
            if (jsonElement.getAsString().equals("-Infinity")) {
                return Double.NEGATIVE_INFINITY;
            }
            try {
                BigDecimal bigDecimal = new BigDecimal(jsonElement.getAsString());
                if (bigDecimal.compareTo(MAX_DOUBLE) <= 0 && bigDecimal.compareTo(MIN_DOUBLE) >= 0) {
                    return bigDecimal.doubleValue();
                }
                throw new InvalidProtocolBufferException("Out of range double value: " + jsonElement);
            } catch (RuntimeException e4) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException("Not a double value: " + jsonElement);
                invalidProtocolBufferException.initCause(e4);
                throw invalidProtocolBufferException;
            }
        }

        private Descriptors.EnumValueDescriptor parseEnum(Descriptors.EnumDescriptor enumDescriptor, JsonElement jsonElement) throws InvalidProtocolBufferException {
            String asString = jsonElement.getAsString();
            Descriptors.EnumValueDescriptor enumValueDescriptorFindValueByName = enumDescriptor.findValueByName(asString);
            if (enumValueDescriptorFindValueByName == null) {
                try {
                    int int32 = parseInt32(jsonElement);
                    enumValueDescriptorFindValueByName = enumDescriptor.isClosed() ? enumDescriptor.findValueByNumber(int32) : enumDescriptor.findValueByNumberCreatingIfUnknown(int32);
                } catch (InvalidProtocolBufferException unused) {
                }
                if (enumValueDescriptorFindValueByName == null && !this.ignoringUnknownFields) {
                    StringBuilder sbL = hb.a.l("Invalid enum value: ", asString, " for enum type: ");
                    sbL.append(enumDescriptor.getFullName());
                    throw new InvalidProtocolBufferException(sbL.toString());
                }
            }
            return enumValueDescriptorFindValueByName;
        }

        private Object parseFieldValue(Descriptors.FieldDescriptor fieldDescriptor, JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            if (jsonElement instanceof JsonNull) {
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && fieldDescriptor.getMessageType().getFullName().equals(Value.getDescriptor().getFullName())) {
                    return builder.newBuilderForField(fieldDescriptor).mergeFrom(Value.newBuilder().setNullValueValue(0).build().toByteString()).build();
                }
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM && fieldDescriptor.getEnumType().getFullName().equals(NullValue.getDescriptor().getFullName())) {
                    return fieldDescriptor.getEnumType().findValueByNumber(0);
                }
                return null;
            }
            if ((jsonElement instanceof JsonObject) && fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.MESSAGE && fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.GROUP) {
                throw new InvalidProtocolBufferException(String.format("Invalid value: %s for expected type: %s", jsonElement, fieldDescriptor.getType()));
            }
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return Integer.valueOf(parseInt32(jsonElement));
                case 4:
                case 5:
                case 6:
                    return Long.valueOf(parseInt64(jsonElement));
                case 7:
                    return Boolean.valueOf(parseBool(jsonElement));
                case 8:
                    return Float.valueOf(parseFloat(jsonElement));
                case 9:
                    return Double.valueOf(parseDouble(jsonElement));
                case 10:
                case 11:
                    return Integer.valueOf(parseUint32(jsonElement));
                case 12:
                case 13:
                    return Long.valueOf(parseUint64(jsonElement));
                case 14:
                    return parseString(jsonElement);
                case 15:
                    return parseBytes(jsonElement);
                case 16:
                    return parseEnum(fieldDescriptor.getEnumType(), jsonElement);
                case 17:
                case 18:
                    int i14 = this.currentDepth;
                    if (i14 >= this.recursionLimit) {
                        throw new InvalidProtocolBufferException("Hit recursion limit.");
                    }
                    this.currentDepth = i14 + 1;
                    Message.Builder builderNewBuilderForField = builder.newBuilderForField(fieldDescriptor);
                    merge(jsonElement, builderNewBuilderForField);
                    this.currentDepth--;
                    return builderNewBuilderForField.build();
                default:
                    a.j(fieldDescriptor.getType(), "Invalid field type: ");
                    return null;
            }
        }

        private float parseFloat(JsonElement jsonElement) throws InvalidProtocolBufferException {
            if (jsonElement.getAsString().equals("NaN")) {
                return Float.NaN;
            }
            if (jsonElement.getAsString().equals("Infinity")) {
                return Float.POSITIVE_INFINITY;
            }
            if (jsonElement.getAsString().equals("-Infinity")) {
                return Float.NEGATIVE_INFINITY;
            }
            try {
                double d14 = Double.parseDouble(jsonElement.getAsString());
                if (d14 <= 3.402826869208755E38d && d14 >= -3.402826869208755E38d) {
                    return (float) d14;
                }
                throw new InvalidProtocolBufferException("Out of range float value: " + jsonElement);
            } catch (RuntimeException e4) {
                new InvalidProtocolBufferException("Not a float value: " + jsonElement).initCause(e4);
                throw e4;
            }
        }

        private int parseInt32(JsonElement jsonElement) throws InvalidProtocolBufferException {
            try {
                try {
                    return Integer.parseInt(jsonElement.getAsString());
                } catch (RuntimeException e4) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException("Not an int32 value: " + jsonElement);
                    invalidProtocolBufferException.initCause(e4);
                    throw invalidProtocolBufferException;
                }
            } catch (RuntimeException unused) {
                return new BigDecimal(jsonElement.getAsString()).intValueExact();
            }
        }

        private long parseInt64(JsonElement jsonElement) throws InvalidProtocolBufferException {
            try {
                try {
                    return Long.parseLong(jsonElement.getAsString());
                } catch (RuntimeException e4) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException("Not an int64 value: " + jsonElement);
                    invalidProtocolBufferException.initCause(e4);
                    throw invalidProtocolBufferException;
                }
            } catch (RuntimeException unused) {
                return new BigDecimal(jsonElement.getAsString()).longValueExact();
            }
        }

        private String parseString(JsonElement jsonElement) {
            return jsonElement.getAsString();
        }

        private int parseUint32(JsonElement jsonElement) throws InvalidProtocolBufferException {
            try {
                try {
                    long j8 = Long.parseLong(jsonElement.getAsString());
                    if (j8 >= 0 && j8 <= 4294967295L) {
                        return (int) j8;
                    }
                    throw new InvalidProtocolBufferException("Out of range uint32 value: " + jsonElement);
                } catch (RuntimeException e4) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException("Not an uint32 value: " + jsonElement);
                    invalidProtocolBufferException.initCause(e4);
                    throw invalidProtocolBufferException;
                }
            } catch (RuntimeException unused) {
                BigInteger bigIntegerExact = new BigDecimal(jsonElement.getAsString()).toBigIntegerExact();
                if (bigIntegerExact.signum() >= 0 && bigIntegerExact.compareTo(new BigInteger("FFFFFFFF", 16)) <= 0) {
                    return bigIntegerExact.intValue();
                }
                throw new InvalidProtocolBufferException("Out of range uint32 value: " + jsonElement);
            }
        }

        private long parseUint64(JsonElement jsonElement) throws InvalidProtocolBufferException {
            try {
                BigInteger bigIntegerExact = new BigDecimal(jsonElement.getAsString()).toBigIntegerExact();
                if (bigIntegerExact.compareTo(BigInteger.ZERO) >= 0 && bigIntegerExact.compareTo(MAX_UINT64) <= 0) {
                    return bigIntegerExact.longValue();
                }
                throw new InvalidProtocolBufferException("Out of range uint64 value: " + jsonElement);
            } catch (RuntimeException e4) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException("Not an uint64 value: " + jsonElement);
                invalidProtocolBufferException.initCause(e4);
                throw invalidProtocolBufferException;
            }
        }

        public void merge(Reader reader, Message.Builder builder) throws IOException {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                jsonReader.setLenient(false);
                merge(JsonParser.parseReader(jsonReader), builder);
            } catch (JsonIOException e4) {
                if (!(e4.getCause() instanceof IOException)) {
                    throw new InvalidProtocolBufferException(e4.getMessage(), e4);
                }
                throw ((IOException) e4.getCause());
            } catch (RuntimeException e14) {
                throw new InvalidProtocolBufferException(e14.getMessage(), e14);
            }
        }

        public void merge(String str, Message.Builder builder) throws InvalidProtocolBufferException {
            try {
                JsonReader jsonReader = new JsonReader(new StringReader(str));
                jsonReader.setLenient(false);
                merge(JsonParser.parseReader(jsonReader), builder);
            } catch (RuntimeException e4) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e4.getMessage());
                invalidProtocolBufferException.initCause(e4);
                throw invalidProtocolBufferException;
            }
        }

        private void merge(JsonElement jsonElement, Message.Builder builder) throws InvalidProtocolBufferException {
            WellKnownTypeParser wellKnownTypeParser = wellKnownTypeParsers.get(builder.getDescriptorForType().getFullName());
            if (wellKnownTypeParser != null) {
                wellKnownTypeParser.merge(this, jsonElement, builder);
            } else {
                mergeMessage(jsonElement, builder, false);
            }
        }
    }

    public static final class PrinterImpl {
        private static final Map<String, WellKnownTypePrinter> wellKnownTypePrinters = buildWellKnownTypePrinters();
        private final boolean alwaysOutputDefaultValueFields;
        private final CharSequence blankOrNewLine;
        private final CharSequence blankOrSpace;
        private final TextGenerator generator;
        private final Gson gson = GsonHolder.DEFAULT_GSON;
        private final Set<Descriptors.FieldDescriptor> includingDefaultValueFields;
        private final TypeRegistry oldRegistry;
        private final boolean preservingProtoFieldNames;
        private final boolean printingEnumsAsInts;
        private final com.google.protobuf.TypeRegistry registry;
        private final boolean sortingMapKeys;

        public static class GsonHolder {
            private static final Gson DEFAULT_GSON = new GsonBuilder().create();

            private GsonHolder() {
            }
        }

        public interface WellKnownTypePrinter {
            void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder);
        }

        public PrinterImpl(com.google.protobuf.TypeRegistry typeRegistry, TypeRegistry typeRegistry2, boolean z14, Set<Descriptors.FieldDescriptor> set, boolean z15, Appendable appendable, boolean z16, boolean z17, boolean z18) {
            this.registry = typeRegistry;
            this.oldRegistry = typeRegistry2;
            this.alwaysOutputDefaultValueFields = z14;
            this.includingDefaultValueFields = set;
            this.preservingProtoFieldNames = z15;
            this.printingEnumsAsInts = z17;
            this.sortingMapKeys = z18;
            AnonymousClass1 anonymousClass1 = null;
            if (z16) {
                this.generator = new CompactTextGenerator(appendable, anonymousClass1);
                this.blankOrSpace = "";
                this.blankOrNewLine = "";
            } else {
                this.generator = new PrettyTextGenerator(appendable, anonymousClass1);
                this.blankOrSpace = StringUtils.SPACE;
                this.blankOrNewLine = "\n";
            }
        }

        private static Map<String, WellKnownTypePrinter> buildWellKnownTypePrinters() {
            HashMap map = new HashMap();
            map.put(Any.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.1
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
                    printerImpl.printAny(messageOrBuilder);
                }
            });
            WellKnownTypePrinter wellKnownTypePrinter = new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.2
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
                    printerImpl.printWrapper(messageOrBuilder);
                }
            };
            map.put(BoolValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            map.put(Int32Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            map.put(UInt32Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            map.put(Int64Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            map.put(UInt64Value.getDescriptor().getFullName(), wellKnownTypePrinter);
            map.put(StringValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            map.put(BytesValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            map.put(FloatValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            map.put(DoubleValue.getDescriptor().getFullName(), wellKnownTypePrinter);
            map.put(Timestamp.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.3
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) {
                    printerImpl.printTimestamp(messageOrBuilder);
                }
            });
            map.put(Duration.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.4
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) {
                    printerImpl.printDuration(messageOrBuilder);
                }
            });
            map.put(FieldMask.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.5
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) {
                    printerImpl.printFieldMask(messageOrBuilder);
                }
            });
            map.put(Struct.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.6
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
                    printerImpl.printStruct(messageOrBuilder);
                }
            });
            map.put(Value.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.7
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
                    printerImpl.printValue(messageOrBuilder);
                }
            });
            map.put(ListValue.getDescriptor().getFullName(), new WellKnownTypePrinter() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.8
                @Override // com.google.protobuf.util.JsonFormat.PrinterImpl.WellKnownTypePrinter
                public void print(PrinterImpl printerImpl, MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
                    printerImpl.printListValue(messageOrBuilder);
                }
            });
            return map;
        }

        private void print(MessageOrBuilder messageOrBuilder, String str) throws InvalidProtocolBufferException {
            boolean z14;
            Map<Descriptors.FieldDescriptor, Object> allFields;
            this.generator.print("{" + ((Object) this.blankOrNewLine));
            this.generator.indent();
            if (str != null) {
                this.generator.print("\"@type\":" + ((Object) this.blankOrSpace) + this.gson.toJson(str));
                z14 = true;
            } else {
                z14 = false;
            }
            if (this.alwaysOutputDefaultValueFields || !this.includingDefaultValueFields.isEmpty()) {
                TreeMap treeMap = new TreeMap(messageOrBuilder.getAllFields());
                for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
                    if (fieldDescriptor.isOptional()) {
                        if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE || messageOrBuilder.hasField(fieldDescriptor)) {
                            if (fieldDescriptor.getContainingOneof() == null || messageOrBuilder.hasField(fieldDescriptor)) {
                            }
                        }
                    }
                    if (!treeMap.containsKey(fieldDescriptor) && (this.alwaysOutputDefaultValueFields || this.includingDefaultValueFields.contains(fieldDescriptor))) {
                        treeMap.put(fieldDescriptor, messageOrBuilder.getField(fieldDescriptor));
                    }
                }
                allFields = treeMap;
            } else {
                allFields = messageOrBuilder.getAllFields();
            }
            for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : allFields.entrySet()) {
                if (z14) {
                    this.generator.print("," + ((Object) this.blankOrNewLine));
                } else {
                    z14 = true;
                }
                printField(entry.getKey(), entry.getValue());
            }
            if (z14) {
                this.generator.print(this.blankOrNewLine);
            }
            this.generator.outdent();
            this.generator.print(StringSubstitutor.DEFAULT_VAR_END);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printAny(MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
            if (Any.getDefaultInstance().equals(messageOrBuilder)) {
                this.generator.print("{}");
                return;
            }
            Descriptors.Descriptor descriptorForType = messageOrBuilder.getDescriptorForType();
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = descriptorForType.findFieldByName("type_url");
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName2 = descriptorForType.findFieldByName("value");
            if (fieldDescriptorFindFieldByName == null || fieldDescriptorFindFieldByName2 == null || fieldDescriptorFindFieldByName.getType() != Descriptors.FieldDescriptor.Type.STRING || fieldDescriptorFindFieldByName2.getType() != Descriptors.FieldDescriptor.Type.BYTES) {
                throw new InvalidProtocolBufferException("Invalid Any type.");
            }
            String str = (String) messageOrBuilder.getField(fieldDescriptorFindFieldByName);
            Descriptors.Descriptor descriptorForTypeUrl = this.registry.getDescriptorForTypeUrl(str);
            if (descriptorForTypeUrl == null && (descriptorForTypeUrl = this.oldRegistry.getDescriptorForTypeUrl(str)) == null) {
                throw new InvalidProtocolBufferException(c.n("Cannot find type for url: ", str));
            }
            DynamicMessage from = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).getParserForType().parseFrom((ByteString) messageOrBuilder.getField(fieldDescriptorFindFieldByName2));
            WellKnownTypePrinter wellKnownTypePrinter = wellKnownTypePrinters.get(JsonFormat.getTypeName(str));
            if (wellKnownTypePrinter == null) {
                print(from, str);
                return;
            }
            this.generator.print("{" + ((Object) this.blankOrNewLine));
            this.generator.indent();
            this.generator.print("\"@type\":" + ((Object) this.blankOrSpace) + this.gson.toJson(str) + "," + ((Object) this.blankOrNewLine));
            TextGenerator textGenerator = this.generator;
            StringBuilder sb3 = new StringBuilder("\"value\":");
            sb3.append((Object) this.blankOrSpace);
            textGenerator.print(sb3.toString());
            wellKnownTypePrinter.print(this, from);
            this.generator.print(this.blankOrNewLine);
            this.generator.outdent();
            this.generator.print(StringSubstitutor.DEFAULT_VAR_END);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printDuration(MessageOrBuilder messageOrBuilder) {
            Duration from = Duration.parseFrom(toByteString(messageOrBuilder));
            this.generator.print("\"" + Durations.toString(from) + "\"");
        }

        private void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) throws InvalidProtocolBufferException {
            boolean z14 = this.preservingProtoFieldNames;
            TextGenerator textGenerator = this.generator;
            if (z14) {
                textGenerator.print("\"" + fieldDescriptor.getName() + "\":" + ((Object) this.blankOrSpace));
            } else {
                textGenerator.print("\"" + fieldDescriptor.getJsonName() + "\":" + ((Object) this.blankOrSpace));
            }
            if (fieldDescriptor.isMapField()) {
                printMapFieldValue(fieldDescriptor, obj);
            } else if (fieldDescriptor.isRepeated()) {
                printRepeatedFieldValue(fieldDescriptor, obj);
            } else {
                printSingleFieldValue(fieldDescriptor, obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printFieldMask(MessageOrBuilder messageOrBuilder) {
            FieldMask from = FieldMask.parseFrom(toByteString(messageOrBuilder));
            this.generator.print("\"" + FieldMaskUtil.toJsonString(from) + "\"");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printListValue(MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = messageOrBuilder.getDescriptorForType().findFieldByName("values");
            if (fieldDescriptorFindFieldByName == null) {
                throw new InvalidProtocolBufferException("Invalid ListValue type.");
            }
            printRepeatedFieldValue(fieldDescriptorFindFieldByName, messageOrBuilder.getField(fieldDescriptorFindFieldByName));
        }

        private void printMapFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj) throws InvalidProtocolBufferException {
            Descriptors.Descriptor messageType = fieldDescriptor.getMessageType();
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = messageType.findFieldByName(Action.KEY_ATTRIBUTE);
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName2 = messageType.findFieldByName("value");
            if (fieldDescriptorFindFieldByName == null || fieldDescriptorFindFieldByName2 == null) {
                throw new InvalidProtocolBufferException("Invalid map field.");
            }
            this.generator.print("{" + ((Object) this.blankOrNewLine));
            this.generator.indent();
            Collection<Message> collectionValues = (List) obj;
            if (this.sortingMapKeys && !collectionValues.isEmpty()) {
                TreeMap treeMap = new TreeMap(fieldDescriptorFindFieldByName.getType() == Descriptors.FieldDescriptor.Type.STRING ? new Comparator<Object>() { // from class: com.google.protobuf.util.JsonFormat.PrinterImpl.9
                    @Override // java.util.Comparator
                    public int compare(Object obj2, Object obj3) {
                        return ByteString.unsignedLexicographicalComparator().compare(ByteString.copyFromUtf8((String) obj2), ByteString.copyFromUtf8((String) obj3));
                    }
                } : null);
                for (Object obj2 : collectionValues) {
                    treeMap.put(((Message) obj2).getField(fieldDescriptorFindFieldByName), obj2);
                }
                collectionValues = treeMap.values();
            }
            boolean z14 = false;
            for (Message message : collectionValues) {
                Object field = message.getField(fieldDescriptorFindFieldByName);
                Object field2 = message.getField(fieldDescriptorFindFieldByName2);
                if (z14) {
                    this.generator.print("," + ((Object) this.blankOrNewLine));
                } else {
                    z14 = true;
                }
                printSingleFieldValue(fieldDescriptorFindFieldByName, field, true);
                this.generator.print(":" + ((Object) this.blankOrSpace));
                printSingleFieldValue(fieldDescriptorFindFieldByName2, field2);
            }
            if (z14) {
                this.generator.print(this.blankOrNewLine);
            }
            this.generator.outdent();
            this.generator.print(StringSubstitutor.DEFAULT_VAR_END);
        }

        private void printRepeatedFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.generator.print("[");
            boolean z14 = false;
            for (Object obj2 : (List) obj) {
                if (z14) {
                    this.generator.print("," + ((Object) this.blankOrSpace));
                } else {
                    z14 = true;
                }
                printSingleFieldValue(fieldDescriptor, obj2);
            }
            this.generator.print("]");
        }

        private void printSingleFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, boolean z14) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    if (z14) {
                        this.generator.print("\"");
                    }
                    this.generator.print(((Integer) obj).toString());
                    if (z14) {
                        this.generator.print("\"");
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    this.generator.print("\"" + ((Long) obj).toString() + "\"");
                    break;
                case 7:
                    if (z14) {
                        this.generator.print("\"");
                    }
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    TextGenerator textGenerator = this.generator;
                    if (zBooleanValue) {
                        textGenerator.print(BooleanUtils.TRUE);
                    } else {
                        textGenerator.print(BooleanUtils.FALSE);
                    }
                    if (z14) {
                        this.generator.print("\"");
                    }
                    break;
                case 8:
                    Float f14 = (Float) obj;
                    if (f14.isNaN()) {
                        this.generator.print("\"NaN\"");
                    } else if (!f14.isInfinite()) {
                        if (z14) {
                            this.generator.print("\"");
                        }
                        this.generator.print(f14.toString());
                        if (z14) {
                            this.generator.print("\"");
                        }
                    } else {
                        float fFloatValue = f14.floatValue();
                        TextGenerator textGenerator2 = this.generator;
                        if (fFloatValue >= 0.0f) {
                            textGenerator2.print("\"Infinity\"");
                        } else {
                            textGenerator2.print("\"-Infinity\"");
                        }
                    }
                    break;
                case 9:
                    Double d14 = (Double) obj;
                    if (d14.isNaN()) {
                        this.generator.print("\"NaN\"");
                    } else if (!d14.isInfinite()) {
                        if (z14) {
                            this.generator.print("\"");
                        }
                        this.generator.print(d14.toString());
                        if (z14) {
                            this.generator.print("\"");
                        }
                    } else {
                        double dDoubleValue = d14.doubleValue();
                        TextGenerator textGenerator3 = this.generator;
                        if (dDoubleValue >= 0.0d) {
                            textGenerator3.print("\"Infinity\"");
                        } else {
                            textGenerator3.print("\"-Infinity\"");
                        }
                    }
                    break;
                case 10:
                case 11:
                    if (z14) {
                        this.generator.print("\"");
                    }
                    this.generator.print(JsonFormat.unsignedToString(((Integer) obj).intValue()));
                    if (z14) {
                        this.generator.print("\"");
                    }
                    break;
                case 12:
                case 13:
                    this.generator.print("\"" + JsonFormat.unsignedToString(((Long) obj).longValue()) + "\"");
                    break;
                case 14:
                    this.generator.print(this.gson.toJson(obj));
                    break;
                case 15:
                    this.generator.print("\"");
                    this.generator.print(BaseEncoding.base64().encode(((ByteString) obj).toByteArray()));
                    this.generator.print("\"");
                    break;
                case 16:
                    if (!fieldDescriptor.getEnumType().getFullName().equals("google.protobuf.NullValue")) {
                        if (!this.printingEnumsAsInts) {
                            Descriptors.EnumValueDescriptor enumValueDescriptor = (Descriptors.EnumValueDescriptor) obj;
                            if (enumValueDescriptor.getIndex() != -1) {
                                this.generator.print("\"" + enumValueDescriptor.getName() + "\"");
                            }
                        }
                        this.generator.print(String.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                    } else {
                        if (z14) {
                            this.generator.print("\"");
                        }
                        this.generator.print(BuildConfig.TRAVIS);
                        if (z14) {
                            this.generator.print("\"");
                        }
                    }
                    break;
                case 17:
                case 18:
                    print((Message) obj);
                    break;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printStruct(MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = messageOrBuilder.getDescriptorForType().findFieldByName("fields");
            if (fieldDescriptorFindFieldByName == null) {
                throw new InvalidProtocolBufferException("Invalid Struct type.");
            }
            printMapFieldValue(fieldDescriptorFindFieldByName, messageOrBuilder.getField(fieldDescriptorFindFieldByName));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printTimestamp(MessageOrBuilder messageOrBuilder) {
            Timestamp from = Timestamp.parseFrom(toByteString(messageOrBuilder));
            this.generator.print("\"" + Timestamps.toString(from) + "\"");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printValue(MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
            Map<Descriptors.FieldDescriptor, Object> allFields = messageOrBuilder.getAllFields();
            if (allFields.isEmpty()) {
                this.generator.print(BuildConfig.TRAVIS);
                return;
            }
            if (allFields.size() != 1) {
                throw new InvalidProtocolBufferException("Invalid Value type.");
            }
            for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : allFields.entrySet()) {
                Descriptors.FieldDescriptor key = entry.getKey();
                if (key.getType() == Descriptors.FieldDescriptor.Type.DOUBLE) {
                    Double d14 = (Double) entry.getValue();
                    if (d14.isNaN() || d14.isInfinite()) {
                        h.s("google.protobuf.Value cannot encode double values for infinity or nan, because they would be parsed as a string.");
                        return;
                    }
                }
                printSingleFieldValue(key, entry.getValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void printWrapper(MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = messageOrBuilder.getDescriptorForType().findFieldByName("value");
            if (fieldDescriptorFindFieldByName == null) {
                throw new InvalidProtocolBufferException("Invalid Wrapper type.");
            }
            printSingleFieldValue(fieldDescriptorFindFieldByName, messageOrBuilder.getField(fieldDescriptorFindFieldByName));
        }

        private ByteString toByteString(MessageOrBuilder messageOrBuilder) {
            return messageOrBuilder instanceof Message ? ((Message) messageOrBuilder).toByteString() : ((Message.Builder) messageOrBuilder).build().toByteString();
        }

        public void print(MessageOrBuilder messageOrBuilder) throws InvalidProtocolBufferException {
            WellKnownTypePrinter wellKnownTypePrinter = wellKnownTypePrinters.get(messageOrBuilder.getDescriptorForType().getFullName());
            if (wellKnownTypePrinter != null) {
                wellKnownTypePrinter.print(this, messageOrBuilder);
            } else {
                print(messageOrBuilder, null);
            }
        }

        private void printSingleFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            printSingleFieldValue(fieldDescriptor, obj, false);
        }
    }
}
