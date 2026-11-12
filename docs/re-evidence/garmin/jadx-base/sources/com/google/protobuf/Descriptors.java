package com.google.protobuf;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import fb1.c;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kg.f;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
public final class Descriptors {
    private static final Logger logger = Logger.getLogger(Descriptors.class.getName());
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Descriptor[] EMPTY_DESCRIPTORS = new Descriptor[0];
    private static final FieldDescriptor[] EMPTY_FIELD_DESCRIPTORS = new FieldDescriptor[0];
    private static final EnumDescriptor[] EMPTY_ENUM_DESCRIPTORS = new EnumDescriptor[0];
    private static final ServiceDescriptor[] EMPTY_SERVICE_DESCRIPTORS = new ServiceDescriptor[0];
    private static final OneofDescriptor[] EMPTY_ONEOF_DESCRIPTORS = new OneofDescriptor[0];

    /* JADX INFO: renamed from: com.google.protobuf.Descriptors$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            int[] iArr = new int[FieldDescriptor.JavaType.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType = iArr;
            try {
                iArr[FieldDescriptor.JavaType.ENUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[FieldDescriptor.JavaType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr2;
            try {
                iArr2[FieldDescriptor.Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.UINT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SINT64.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.UINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FIXED64.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.FLOAT.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.DOUBLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.BOOL.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[FieldDescriptor.Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public interface NumberGetter<T> {
        int getNumber(T t7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T binarySearch(T[] tArr, int i14, NumberGetter<T> numberGetter, int i15) {
        int i16 = i14 - 1;
        int i17 = 0;
        while (i17 <= i16) {
            int i18 = (i17 + i16) / 2;
            T t7 = tArr[i18];
            int number = numberGetter.getNumber(t7);
            if (i15 < number) {
                i16 = i18 - 1;
            } else {
                if (i15 <= number) {
                    return t7;
                }
                i17 = i18 + 1;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String computeFullName(FileDescriptor fileDescriptor, Descriptor descriptor, String str) {
        if (descriptor != null) {
            return descriptor.getFullName() + '.' + str;
        }
        String str2 = fileDescriptor.getPackage();
        if (str2.isEmpty()) {
            return str;
        }
        return str2 + '.' + str;
    }

    public static abstract class GenericDescriptor {
        public /* synthetic */ GenericDescriptor(AnonymousClass1 anonymousClass1) {
            this();
        }

        public abstract FileDescriptor getFile();

        public abstract String getFullName();

        public abstract String getName();

        public abstract Message toProto();

        private GenericDescriptor() {
        }
    }

    public static final class Descriptor extends GenericDescriptor {
        private final Descriptor containingType;
        private final EnumDescriptor[] enumTypes;
        private final int[] extensionRangeLowerBounds;
        private final int[] extensionRangeUpperBounds;
        private final FieldDescriptor[] extensions;
        private final FieldDescriptor[] fields;
        private final FieldDescriptor[] fieldsSortedByNumber;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final Descriptor[] nestedTypes;
        private final OneofDescriptor[] oneofs;
        private DescriptorProtos.DescriptorProto proto;
        private final int realOneofCount;

        /* JADX WARN: Illegal instructions before constructor call */
        private Descriptor(DescriptorProtos.DescriptorProto descriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i14) throws DescriptorValidationException {
            AnonymousClass1 anonymousClass1 = null;
            super(anonymousClass1);
            this.index = i14;
            this.proto = descriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, descriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            this.oneofs = descriptorProto.getOneofDeclCount() > 0 ? new OneofDescriptor[descriptorProto.getOneofDeclCount()] : Descriptors.EMPTY_ONEOF_DESCRIPTORS;
            int i15 = 0;
            for (int i16 = 0; i16 < descriptorProto.getOneofDeclCount(); i16++) {
                this.oneofs[i16] = new OneofDescriptor(descriptorProto.getOneofDecl(i16), fileDescriptor, this, i16, null);
            }
            this.nestedTypes = descriptorProto.getNestedTypeCount() > 0 ? new Descriptor[descriptorProto.getNestedTypeCount()] : Descriptors.EMPTY_DESCRIPTORS;
            for (int i17 = 0; i17 < descriptorProto.getNestedTypeCount(); i17++) {
                this.nestedTypes[i17] = new Descriptor(descriptorProto.getNestedType(i17), fileDescriptor, this, i17);
            }
            this.enumTypes = descriptorProto.getEnumTypeCount() > 0 ? new EnumDescriptor[descriptorProto.getEnumTypeCount()] : Descriptors.EMPTY_ENUM_DESCRIPTORS;
            for (int i18 = 0; i18 < descriptorProto.getEnumTypeCount(); i18++) {
                this.enumTypes[i18] = new EnumDescriptor(descriptorProto.getEnumType(i18), fileDescriptor, this, i18, null);
            }
            this.fields = descriptorProto.getFieldCount() > 0 ? new FieldDescriptor[descriptorProto.getFieldCount()] : Descriptors.EMPTY_FIELD_DESCRIPTORS;
            for (int i19 = 0; i19 < descriptorProto.getFieldCount(); i19++) {
                this.fields[i19] = new FieldDescriptor(descriptorProto.getField(i19), fileDescriptor, this, i19, false, null);
            }
            this.fieldsSortedByNumber = descriptorProto.getFieldCount() > 0 ? (FieldDescriptor[]) this.fields.clone() : Descriptors.EMPTY_FIELD_DESCRIPTORS;
            this.extensions = descriptorProto.getExtensionCount() > 0 ? new FieldDescriptor[descriptorProto.getExtensionCount()] : Descriptors.EMPTY_FIELD_DESCRIPTORS;
            for (int i24 = 0; i24 < descriptorProto.getExtensionCount(); i24++) {
                this.extensions[i24] = new FieldDescriptor(descriptorProto.getExtension(i24), fileDescriptor, this, i24, true, null);
            }
            for (int i25 = 0; i25 < descriptorProto.getOneofDeclCount(); i25++) {
                OneofDescriptor oneofDescriptor = this.oneofs[i25];
                oneofDescriptor.fields = new FieldDescriptor[oneofDescriptor.getFieldCount()];
                this.oneofs[i25].fieldCount = 0;
            }
            for (int i26 = 0; i26 < descriptorProto.getFieldCount(); i26++) {
                OneofDescriptor containingOneof = this.fields[i26].getContainingOneof();
                if (containingOneof != null) {
                    containingOneof.fields[OneofDescriptor.access$2608(containingOneof)] = this.fields[i26];
                }
            }
            int i27 = 0;
            for (OneofDescriptor oneofDescriptor2 : this.oneofs) {
                if (oneofDescriptor2.isSynthetic()) {
                    i27++;
                } else if (i27 > 0) {
                    throw new DescriptorValidationException(this, "Synthetic oneofs must come last.", anonymousClass1);
                }
            }
            this.realOneofCount = this.oneofs.length - i27;
            fileDescriptor.pool.addSymbol(this);
            if (descriptorProto.getExtensionRangeCount() <= 0) {
                this.extensionRangeLowerBounds = Descriptors.EMPTY_INT_ARRAY;
                this.extensionRangeUpperBounds = Descriptors.EMPTY_INT_ARRAY;
                return;
            }
            this.extensionRangeLowerBounds = new int[descriptorProto.getExtensionRangeCount()];
            this.extensionRangeUpperBounds = new int[descriptorProto.getExtensionRangeCount()];
            for (DescriptorProtos.DescriptorProto.ExtensionRange extensionRange : descriptorProto.getExtensionRangeList()) {
                this.extensionRangeLowerBounds[i15] = extensionRange.getStart();
                this.extensionRangeUpperBounds[i15] = extensionRange.getEnd();
                i15++;
            }
            Arrays.sort(this.extensionRangeLowerBounds);
            Arrays.sort(this.extensionRangeUpperBounds);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void crossLink() throws DescriptorValidationException {
            for (Descriptor descriptor : this.nestedTypes) {
                descriptor.crossLink();
            }
            for (FieldDescriptor fieldDescriptor : this.fields) {
                fieldDescriptor.crossLink();
            }
            Arrays.sort(this.fieldsSortedByNumber);
            validateNoDuplicateFieldNumbers();
            for (FieldDescriptor fieldDescriptor2 : this.extensions) {
                fieldDescriptor2.crossLink();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.DescriptorProto descriptorProto) {
            this.proto = descriptorProto;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                Descriptor[] descriptorArr = this.nestedTypes;
                if (i15 >= descriptorArr.length) {
                    break;
                }
                descriptorArr[i15].setProto(descriptorProto.getNestedType(i15));
                i15++;
            }
            int i16 = 0;
            while (true) {
                OneofDescriptor[] oneofDescriptorArr = this.oneofs;
                if (i16 >= oneofDescriptorArr.length) {
                    break;
                }
                oneofDescriptorArr[i16].setProto(descriptorProto.getOneofDecl(i16));
                i16++;
            }
            int i17 = 0;
            while (true) {
                EnumDescriptor[] enumDescriptorArr = this.enumTypes;
                if (i17 >= enumDescriptorArr.length) {
                    break;
                }
                enumDescriptorArr[i17].setProto(descriptorProto.getEnumType(i17));
                i17++;
            }
            int i18 = 0;
            while (true) {
                FieldDescriptor[] fieldDescriptorArr = this.fields;
                if (i18 >= fieldDescriptorArr.length) {
                    break;
                }
                fieldDescriptorArr[i18].setProto(descriptorProto.getField(i18));
                i18++;
            }
            while (true) {
                FieldDescriptor[] fieldDescriptorArr2 = this.extensions;
                if (i14 >= fieldDescriptorArr2.length) {
                    return;
                }
                fieldDescriptorArr2[i14].setProto(descriptorProto.getExtension(i14));
                i14++;
            }
        }

        private void validateNoDuplicateFieldNumbers() throws DescriptorValidationException {
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                FieldDescriptor[] fieldDescriptorArr = this.fieldsSortedByNumber;
                if (i15 >= fieldDescriptorArr.length) {
                    return;
                }
                FieldDescriptor fieldDescriptor = fieldDescriptorArr[i14];
                FieldDescriptor fieldDescriptor2 = fieldDescriptorArr[i15];
                if (fieldDescriptor.getNumber() == fieldDescriptor2.getNumber()) {
                    throw new DescriptorValidationException(fieldDescriptor2, "Field number " + fieldDescriptor2.getNumber() + " has already been used in \"" + fieldDescriptor2.getContainingType().getFullName() + "\" by field \"" + fieldDescriptor.getName() + "\".", (AnonymousClass1) null);
                }
                i14 = i15;
            }
        }

        public EnumDescriptor findEnumTypeByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof EnumDescriptor) {
                return (EnumDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public FieldDescriptor findFieldByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof FieldDescriptor) {
                return (FieldDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public FieldDescriptor findFieldByNumber(int i14) {
            FieldDescriptor[] fieldDescriptorArr = this.fieldsSortedByNumber;
            return (FieldDescriptor) Descriptors.binarySearch(fieldDescriptorArr, fieldDescriptorArr.length, FieldDescriptor.NUMBER_GETTER, i14);
        }

        public Descriptor findNestedTypeByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof Descriptor) {
                return (Descriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        public List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public List<Descriptor> getNestedTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.nestedTypes));
        }

        public List<OneofDescriptor> getOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.oneofs));
        }

        public DescriptorProtos.MessageOptions getOptions() {
            return this.proto.getOptions();
        }

        public List<OneofDescriptor> getRealOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.oneofs).subList(0, this.realOneofCount));
        }

        public boolean isExtendable() {
            return !this.proto.getExtensionRangeList().isEmpty();
        }

        public boolean isExtensionNumber(int i14) {
            int iBinarySearch = Arrays.binarySearch(this.extensionRangeLowerBounds, i14);
            if (iBinarySearch < 0) {
                iBinarySearch = (~iBinarySearch) - 1;
            }
            return iBinarySearch >= 0 && i14 < this.extensionRangeUpperBounds[iBinarySearch];
        }

        public boolean isReservedName(String str) {
            Internal.checkNotNull(str);
            Iterator<String> it = this.proto.getReservedNameList().iterator();
            while (it.hasNext()) {
                if (it.next().equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isReservedNumber(int i14) {
            for (DescriptorProtos.DescriptorProto.ReservedRange reservedRange : this.proto.getReservedRangeList()) {
                if (reservedRange.getStart() <= i14 && i14 < reservedRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.DescriptorProto toProto() {
            return this.proto;
        }

        public Descriptor(String str) {
            String strSubstring;
            String strSubstring2;
            super(null);
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                strSubstring2 = str.substring(iLastIndexOf + 1);
                strSubstring = str.substring(0, iLastIndexOf);
            } else {
                strSubstring = "";
                strSubstring2 = str;
            }
            this.index = 0;
            this.proto = DescriptorProtos.DescriptorProto.newBuilder().setName(strSubstring2).addExtensionRange(DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder().setStart(1).setEnd(536870912).build()).build();
            this.fullName = str;
            this.containingType = null;
            this.nestedTypes = Descriptors.EMPTY_DESCRIPTORS;
            this.enumTypes = Descriptors.EMPTY_ENUM_DESCRIPTORS;
            this.fields = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            this.fieldsSortedByNumber = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            this.extensions = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            this.oneofs = Descriptors.EMPTY_ONEOF_DESCRIPTORS;
            this.realOneofCount = 0;
            this.file = new FileDescriptor(strSubstring, this);
            this.extensionRangeLowerBounds = new int[]{1};
            this.extensionRangeUpperBounds = new int[]{536870912};
        }

        public /* synthetic */ Descriptor(DescriptorProtos.DescriptorProto descriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i14, AnonymousClass1 anonymousClass1) {
            this(descriptorProto, fileDescriptor, descriptor, i14);
        }
    }

    public static final class EnumDescriptor extends GenericDescriptor implements Internal.EnumLiteMap<EnumValueDescriptor> {
        private ReferenceQueue<EnumValueDescriptor> cleanupQueue;
        private final Descriptor containingType;
        private final int distinctNumbers;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private DescriptorProtos.EnumDescriptorProto proto;
        private Map<Integer, WeakReference<EnumValueDescriptor>> unknownValues;
        private final EnumValueDescriptor[] values;
        private final EnumValueDescriptor[] valuesSortedByNumber;

        /* JADX WARN: Illegal instructions before constructor call */
        private EnumDescriptor(DescriptorProtos.EnumDescriptorProto enumDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i14) throws DescriptorValidationException {
            EnumValueDescriptor[] enumValueDescriptorArr;
            AnonymousClass1 anonymousClass1 = null;
            super(anonymousClass1);
            this.unknownValues = null;
            this.cleanupQueue = null;
            this.index = i14;
            this.proto = enumDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, enumDescriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            if (enumDescriptorProto.getValueCount() == 0) {
                throw new DescriptorValidationException(this, "Enums must contain at least one value.", anonymousClass1);
            }
            this.values = new EnumValueDescriptor[enumDescriptorProto.getValueCount()];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int valueCount = enumDescriptorProto.getValueCount();
                enumValueDescriptorArr = this.values;
                if (i16 >= valueCount) {
                    break;
                }
                enumValueDescriptorArr[i16] = new EnumValueDescriptor(enumDescriptorProto.getValue(i16), fileDescriptor, this, i16, null);
                i16++;
            }
            EnumValueDescriptor[] enumValueDescriptorArr2 = (EnumValueDescriptor[]) enumValueDescriptorArr.clone();
            this.valuesSortedByNumber = enumValueDescriptorArr2;
            Arrays.sort(enumValueDescriptorArr2, EnumValueDescriptor.BY_NUMBER);
            for (int i17 = 1; i17 < enumDescriptorProto.getValueCount(); i17++) {
                EnumValueDescriptor[] enumValueDescriptorArr3 = this.valuesSortedByNumber;
                EnumValueDescriptor enumValueDescriptor = enumValueDescriptorArr3[i15];
                EnumValueDescriptor enumValueDescriptor2 = enumValueDescriptorArr3[i17];
                if (enumValueDescriptor.getNumber() != enumValueDescriptor2.getNumber()) {
                    i15++;
                    this.valuesSortedByNumber[i15] = enumValueDescriptor2;
                }
            }
            int i18 = i15 + 1;
            this.distinctNumbers = i18;
            Arrays.fill(this.valuesSortedByNumber, i18, enumDescriptorProto.getValueCount(), (Object) null);
            fileDescriptor.pool.addSymbol(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.EnumDescriptorProto enumDescriptorProto) {
            this.proto = enumDescriptorProto;
            int i14 = 0;
            while (true) {
                EnumValueDescriptor[] enumValueDescriptorArr = this.values;
                if (i14 >= enumValueDescriptorArr.length) {
                    return;
                }
                enumValueDescriptorArr[i14].setProto(enumDescriptorProto.getValue(i14));
                i14++;
            }
        }

        public EnumValueDescriptor findValueByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof EnumValueDescriptor) {
                return (EnumValueDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public EnumValueDescriptor findValueByNumber(int i14) {
            return (EnumValueDescriptor) Descriptors.binarySearch(this.valuesSortedByNumber, this.distinctNumbers, EnumValueDescriptor.NUMBER_GETTER, i14);
        }

        public EnumValueDescriptor findValueByNumberCreatingIfUnknown(int i14) {
            EnumValueDescriptor enumValueDescriptor;
            EnumValueDescriptor enumValueDescriptorFindValueByNumber = findValueByNumber(i14);
            if (enumValueDescriptorFindValueByNumber != null) {
                return enumValueDescriptorFindValueByNumber;
            }
            synchronized (this) {
                try {
                    if (this.cleanupQueue == null) {
                        this.cleanupQueue = new ReferenceQueue<>();
                        this.unknownValues = new HashMap();
                    } else {
                        while (true) {
                            UnknownEnumValueReference unknownEnumValueReference = (UnknownEnumValueReference) this.cleanupQueue.poll();
                            if (unknownEnumValueReference == null) {
                                break;
                            }
                            this.unknownValues.remove(Integer.valueOf(unknownEnumValueReference.number));
                        }
                    }
                    WeakReference<EnumValueDescriptor> weakReference = this.unknownValues.get(Integer.valueOf(i14));
                    AnonymousClass1 anonymousClass1 = null;
                    enumValueDescriptor = weakReference == null ? null : weakReference.get();
                    if (enumValueDescriptor == null) {
                        enumValueDescriptor = new EnumValueDescriptor(this, Integer.valueOf(i14), anonymousClass1);
                        this.unknownValues.put(Integer.valueOf(i14), new UnknownEnumValueReference(i14, enumValueDescriptor, anonymousClass1));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return enumValueDescriptor;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.EnumOptions getOptions() {
            return this.proto.getOptions();
        }

        public int getUnknownEnumValueDescriptorCount() {
            return this.unknownValues.size();
        }

        public List<EnumValueDescriptor> getValues() {
            return Collections.unmodifiableList(Arrays.asList(this.values));
        }

        public boolean isClosed() {
            return getFile().getSyntax() != FileDescriptor.Syntax.PROTO3;
        }

        public boolean isReservedName(String str) {
            Internal.checkNotNull(str);
            Iterator<String> it = this.proto.getReservedNameList().iterator();
            while (it.hasNext()) {
                if (it.next().equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isReservedNumber(int i14) {
            for (DescriptorProtos.EnumDescriptorProto.EnumReservedRange enumReservedRange : this.proto.getReservedRangeList()) {
                if (enumReservedRange.getStart() <= i14 && i14 <= enumReservedRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        public static class UnknownEnumValueReference extends WeakReference<EnumValueDescriptor> {
            private final int number;

            private UnknownEnumValueReference(int i14, EnumValueDescriptor enumValueDescriptor) {
                super(enumValueDescriptor);
                this.number = i14;
            }

            public /* synthetic */ UnknownEnumValueReference(int i14, EnumValueDescriptor enumValueDescriptor, AnonymousClass1 anonymousClass1) {
                this(i14, enumValueDescriptor);
            }
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.EnumDescriptorProto toProto() {
            return this.proto;
        }

        public /* synthetic */ EnumDescriptor(DescriptorProtos.EnumDescriptorProto enumDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i14, AnonymousClass1 anonymousClass1) {
            this(enumDescriptorProto, fileDescriptor, descriptor, i14);
        }
    }

    public static final class EnumValueDescriptor extends GenericDescriptor implements Internal.EnumLite {
        static final Comparator<EnumValueDescriptor> BY_NUMBER = new Comparator<EnumValueDescriptor>() { // from class: com.google.protobuf.Descriptors.EnumValueDescriptor.1
            @Override // java.util.Comparator
            public int compare(EnumValueDescriptor enumValueDescriptor, EnumValueDescriptor enumValueDescriptor2) {
                return Integer.valueOf(enumValueDescriptor.getNumber()).compareTo(Integer.valueOf(enumValueDescriptor2.getNumber()));
            }
        };
        static final NumberGetter<EnumValueDescriptor> NUMBER_GETTER = new NumberGetter<EnumValueDescriptor>() { // from class: com.google.protobuf.Descriptors.EnumValueDescriptor.2
            @Override // com.google.protobuf.Descriptors.NumberGetter
            public int getNumber(EnumValueDescriptor enumValueDescriptor) {
                return enumValueDescriptor.getNumber();
            }
        };
        private final String fullName;
        private final int index;
        private DescriptorProtos.EnumValueDescriptorProto proto;
        private final EnumDescriptor type;

        private EnumValueDescriptor(EnumDescriptor enumDescriptor, Integer num) {
            super(null);
            DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProtoBuild = DescriptorProtos.EnumValueDescriptorProto.newBuilder().setName("UNKNOWN_ENUM_VALUE_" + enumDescriptor.getName() + "_" + num).setNumber(num.intValue()).build();
            this.index = -1;
            this.proto = enumValueDescriptorProtoBuild;
            this.type = enumDescriptor;
            this.fullName = enumDescriptor.getFullName() + '.' + enumValueDescriptorProtoBuild.getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto) {
            this.proto = enumValueDescriptorProto;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.type.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public int getNumber() {
            return this.proto.getNumber();
        }

        public DescriptorProtos.EnumValueOptions getOptions() {
            return this.proto.getOptions();
        }

        public EnumDescriptor getType() {
            return this.type;
        }

        public String toString() {
            return this.proto.getName();
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.EnumValueDescriptorProto toProto() {
            return this.proto;
        }

        public /* synthetic */ EnumValueDescriptor(EnumDescriptor enumDescriptor, Integer num, AnonymousClass1 anonymousClass1) {
            this(enumDescriptor, num);
        }

        private EnumValueDescriptor(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto, FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, int i14) throws DescriptorValidationException {
            super(null);
            this.index = i14;
            this.proto = enumValueDescriptorProto;
            this.type = enumDescriptor;
            this.fullName = enumDescriptor.getFullName() + '.' + enumValueDescriptorProto.getName();
            fileDescriptor.pool.addSymbol(this);
        }

        public /* synthetic */ EnumValueDescriptor(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto, FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, int i14, AnonymousClass1 anonymousClass1) {
            this(enumValueDescriptorProto, fileDescriptor, enumDescriptor, i14);
        }
    }

    public static final class FieldDescriptor extends GenericDescriptor implements Comparable<FieldDescriptor>, FieldSet.FieldDescriptorLite<FieldDescriptor> {
        private static final NumberGetter<FieldDescriptor> NUMBER_GETTER = new NumberGetter<FieldDescriptor>() { // from class: com.google.protobuf.Descriptors.FieldDescriptor.1
            @Override // com.google.protobuf.Descriptors.NumberGetter
            public int getNumber(FieldDescriptor fieldDescriptor) {
                return fieldDescriptor.getNumber();
            }
        };
        private static final WireFormat.FieldType[] table = WireFormat.FieldType.values();
        private OneofDescriptor containingOneof;
        private Descriptor containingType;
        private Object defaultValue;
        private EnumDescriptor enumType;
        private final Descriptor extensionScope;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final boolean isProto3Optional;
        private String jsonName;
        private Descriptor messageType;
        private DescriptorProtos.FieldDescriptorProto proto;
        private Type type;

        public enum JavaType {
            INT(0),
            LONG(0L),
            FLOAT(Float.valueOf(0.0f)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(Boolean.FALSE),
            STRING(""),
            BYTE_STRING(ByteString.EMPTY),
            ENUM(null),
            MESSAGE(null);

            private final Object defaultDefault;

            JavaType(Object obj) {
                this.defaultDefault = obj;
            }
        }

        static {
            if (Type.types.length == DescriptorProtos.FieldDescriptorProto.Type.values().length) {
                return;
            }
            f.n("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private FieldDescriptor(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i14, boolean z14) throws DescriptorValidationException {
            AnonymousClass1 anonymousClass1 = null;
            super(anonymousClass1);
            this.index = i14;
            this.proto = fieldDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, fieldDescriptorProto.getName());
            this.file = fileDescriptor;
            if (fieldDescriptorProto.hasType()) {
                this.type = Type.valueOf(fieldDescriptorProto.getType());
            }
            this.isProto3Optional = fieldDescriptorProto.getProto3Optional();
            if (getNumber() <= 0) {
                throw new DescriptorValidationException(this, "Field numbers must be positive integers.", anonymousClass1);
            }
            if (z14) {
                if (!fieldDescriptorProto.hasExtendee()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee not set for extension field.", anonymousClass1);
                }
                this.containingType = null;
                if (descriptor != null) {
                    this.extensionScope = descriptor;
                } else {
                    this.extensionScope = null;
                }
                if (fieldDescriptorProto.hasOneofIndex()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index set for extension field.", anonymousClass1);
                }
                this.containingOneof = null;
            } else {
                if (fieldDescriptorProto.hasExtendee()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee set for non-extension field.", anonymousClass1);
                }
                this.containingType = descriptor;
                if (!fieldDescriptorProto.hasOneofIndex()) {
                    this.containingOneof = null;
                } else {
                    if (fieldDescriptorProto.getOneofIndex() < 0 || fieldDescriptorProto.getOneofIndex() >= descriptor.toProto().getOneofDeclCount()) {
                        throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index is out of range for type " + descriptor.getName(), anonymousClass1);
                    }
                    OneofDescriptor oneofDescriptor = descriptor.getOneofs().get(fieldDescriptorProto.getOneofIndex());
                    this.containingOneof = oneofDescriptor;
                    OneofDescriptor.access$2608(oneofDescriptor);
                }
                this.extensionScope = null;
            }
            fileDescriptor.pool.addSymbol(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public void crossLink() throws DescriptorValidationException {
            AnonymousClass1 anonymousClass1 = null;
            if (this.proto.hasExtendee()) {
                GenericDescriptor genericDescriptorLookupSymbol = this.file.pool.lookupSymbol(this.proto.getExtendee(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
                if (!(genericDescriptorLookupSymbol instanceof Descriptor)) {
                    throw new DescriptorValidationException(this, "\"" + this.proto.getExtendee() + "\" is not a message type.", anonymousClass1);
                }
                this.containingType = (Descriptor) genericDescriptorLookupSymbol;
                if (!getContainingType().isExtensionNumber(getNumber())) {
                    throw new DescriptorValidationException(this, "\"" + getContainingType().getFullName() + "\" does not declare " + getNumber() + " as an extension number.", anonymousClass1);
                }
            }
            if (this.proto.hasTypeName()) {
                GenericDescriptor genericDescriptorLookupSymbol2 = this.file.pool.lookupSymbol(this.proto.getTypeName(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
                if (!this.proto.hasType()) {
                    if (genericDescriptorLookupSymbol2 instanceof Descriptor) {
                        this.type = Type.MESSAGE;
                    } else {
                        if (!(genericDescriptorLookupSymbol2 instanceof EnumDescriptor)) {
                            throw new DescriptorValidationException(this, "\"" + this.proto.getTypeName() + "\" is not a type.", anonymousClass1);
                        }
                        this.type = Type.ENUM;
                    }
                }
                if (getJavaType() == JavaType.MESSAGE) {
                    if (!(genericDescriptorLookupSymbol2 instanceof Descriptor)) {
                        throw new DescriptorValidationException(this, "\"" + this.proto.getTypeName() + "\" is not a message type.", anonymousClass1);
                    }
                    this.messageType = (Descriptor) genericDescriptorLookupSymbol2;
                    if (this.proto.hasDefaultValue()) {
                        throw new DescriptorValidationException(this, "Messages can't have default values.", anonymousClass1);
                    }
                } else {
                    if (getJavaType() != JavaType.ENUM) {
                        throw new DescriptorValidationException(this, "Field with primitive type has type_name.", anonymousClass1);
                    }
                    if (!(genericDescriptorLookupSymbol2 instanceof EnumDescriptor)) {
                        throw new DescriptorValidationException(this, "\"" + this.proto.getTypeName() + "\" is not an enum type.", anonymousClass1);
                    }
                    this.enumType = (EnumDescriptor) genericDescriptorLookupSymbol2;
                }
            } else if (getJavaType() == JavaType.MESSAGE || getJavaType() == JavaType.ENUM) {
                throw new DescriptorValidationException(this, "Field with message or enum type missing type_name.", anonymousClass1);
            }
            if (this.proto.getOptions().getPacked() && !isPackable()) {
                throw new DescriptorValidationException(this, "[packed = true] can only be specified for repeated primitive fields.", anonymousClass1);
            }
            if (this.proto.hasDefaultValue()) {
                if (isRepeated()) {
                    throw new DescriptorValidationException(this, "Repeated fields cannot have default values.", anonymousClass1);
                }
                try {
                    switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[getType().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            this.defaultValue = Integer.valueOf(TextFormat.parseInt32(this.proto.getDefaultValue()));
                            break;
                        case 4:
                        case 5:
                            this.defaultValue = Integer.valueOf(TextFormat.parseUInt32(this.proto.getDefaultValue()));
                            break;
                        case 6:
                        case 7:
                        case 8:
                            this.defaultValue = Long.valueOf(TextFormat.parseInt64(this.proto.getDefaultValue()));
                            break;
                        case 9:
                        case 10:
                            this.defaultValue = Long.valueOf(TextFormat.parseUInt64(this.proto.getDefaultValue()));
                            break;
                        case 11:
                            if (this.proto.getDefaultValue().equals("inf")) {
                                this.defaultValue = Float.valueOf(Float.POSITIVE_INFINITY);
                            } else if (this.proto.getDefaultValue().equals("-inf")) {
                                this.defaultValue = Float.valueOf(Float.NEGATIVE_INFINITY);
                            } else if (!this.proto.getDefaultValue().equals("nan")) {
                                this.defaultValue = Float.valueOf(this.proto.getDefaultValue());
                            } else {
                                this.defaultValue = Float.valueOf(Float.NaN);
                            }
                            break;
                        case 12:
                            if (this.proto.getDefaultValue().equals("inf")) {
                                this.defaultValue = Double.valueOf(Double.POSITIVE_INFINITY);
                            } else if (this.proto.getDefaultValue().equals("-inf")) {
                                this.defaultValue = Double.valueOf(Double.NEGATIVE_INFINITY);
                            } else if (!this.proto.getDefaultValue().equals("nan")) {
                                this.defaultValue = Double.valueOf(this.proto.getDefaultValue());
                            } else {
                                this.defaultValue = Double.valueOf(Double.NaN);
                            }
                            break;
                        case 13:
                            this.defaultValue = Boolean.valueOf(this.proto.getDefaultValue());
                            break;
                        case 14:
                            this.defaultValue = this.proto.getDefaultValue();
                            break;
                        case 15:
                            try {
                                this.defaultValue = TextFormat.unescapeBytes(this.proto.getDefaultValue());
                            } catch (TextFormat.InvalidEscapeSequenceException e4) {
                                throw new DescriptorValidationException(this, "Couldn't parse default value: " + e4.getMessage(), e4, anonymousClass1);
                            }
                            break;
                        case 16:
                            EnumValueDescriptor enumValueDescriptorFindValueByName = this.enumType.findValueByName(this.proto.getDefaultValue());
                            this.defaultValue = enumValueDescriptorFindValueByName;
                            if (enumValueDescriptorFindValueByName == null) {
                                throw new DescriptorValidationException(this, "Unknown enum default value: \"" + this.proto.getDefaultValue() + CoreConstants.DOUBLE_QUOTE_CHAR, anonymousClass1);
                            }
                            break;
                            break;
                        case 17:
                        case 18:
                            throw new DescriptorValidationException(this, "Message type had default value.", anonymousClass1);
                    }
                } catch (NumberFormatException e14) {
                    throw new DescriptorValidationException(this, "Could not parse default value: \"" + this.proto.getDefaultValue() + CoreConstants.DOUBLE_QUOTE_CHAR, e14, anonymousClass1);
                }
            } else if (isRepeated()) {
                this.defaultValue = Collections.EMPTY_LIST;
            } else {
                int i14 = AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[getJavaType().ordinal()];
                if (i14 == 1) {
                    this.defaultValue = this.enumType.getValues().get(0);
                } else if (i14 != 2) {
                    this.defaultValue = getJavaType().defaultDefault;
                } else {
                    this.defaultValue = null;
                }
            }
            Descriptor descriptor = this.containingType;
            if (descriptor == null || !descriptor.getOptions().getMessageSetWireFormat()) {
                return;
            }
            if (!isExtension()) {
                throw new DescriptorValidationException(this, "MessageSets cannot have fields, only extensions.", anonymousClass1);
            }
            if (!isOptional() || getType() != Type.MESSAGE) {
                throw new DescriptorValidationException(this, "Extensions of MessageSets must be optional messages.", anonymousClass1);
            }
        }

        private static String fieldNameToJsonName(String str) {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder(length);
            boolean z14 = false;
            for (int i14 = 0; i14 < length; i14++) {
                char cCharAt = str.charAt(i14);
                if (cCharAt == '_') {
                    z14 = true;
                } else if (z14) {
                    if ('a' <= cCharAt && cCharAt <= 'z') {
                        cCharAt = (char) (cCharAt - ' ');
                    }
                    sb3.append(cCharAt);
                    z14 = false;
                } else {
                    sb3.append(cCharAt);
                }
            }
            return sb3.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            this.proto = fieldDescriptorProto;
        }

        @Override // java.lang.Comparable
        public int compareTo(FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.containingType == this.containingType) {
                return getNumber() - fieldDescriptor.getNumber();
            }
            h.s("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
            return 0;
        }

        public OneofDescriptor getContainingOneof() {
            return this.containingOneof;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public Object getDefaultValue() {
            if (getJavaType() != JavaType.MESSAGE) {
                return this.defaultValue;
            }
            e.w("FieldDescriptor.getDefaultValue() called on an embedded message field.");
            return null;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public EnumDescriptor getEnumType() {
            if (getJavaType() == JavaType.ENUM) {
                return this.enumType;
            }
            e.w(j.m("This field is not of enum type. (", this.fullName, ")"));
            return null;
        }

        public Descriptor getExtensionScope() {
            if (isExtension()) {
                return this.extensionScope;
            }
            e.w(j.m("This field is not an extension. (", this.fullName, ")"));
            return null;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public JavaType getJavaType() {
            return this.type.getJavaType();
        }

        public String getJsonName() {
            String str = this.jsonName;
            if (str != null) {
                return str;
            }
            boolean zHasJsonName = this.proto.hasJsonName();
            DescriptorProtos.FieldDescriptorProto fieldDescriptorProto = this.proto;
            if (zHasJsonName) {
                String jsonName = fieldDescriptorProto.getJsonName();
                this.jsonName = jsonName;
                return jsonName;
            }
            String strFieldNameToJsonName = fieldNameToJsonName(fieldDescriptorProto.getName());
            this.jsonName = strFieldNameToJsonName;
            return strFieldNameToJsonName;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType getLiteJavaType() {
            return getLiteType().getJavaType();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType getLiteType() {
            return table[this.type.ordinal()];
        }

        public Descriptor getMessageType() {
            if (getJavaType() == JavaType.MESSAGE) {
                return this.messageType;
            }
            e.w(j.m("This field is not of message type. (", this.fullName, ")"));
            return null;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.proto.getNumber();
        }

        public DescriptorProtos.FieldOptions getOptions() {
            return this.proto.getOptions();
        }

        public OneofDescriptor getRealContainingOneof() {
            OneofDescriptor oneofDescriptor = this.containingOneof;
            if (oneofDescriptor == null || oneofDescriptor.isSynthetic()) {
                return null;
            }
            return this.containingOneof;
        }

        public Type getType() {
            return this.type;
        }

        public boolean hasDefaultValue() {
            return this.proto.hasDefaultValue();
        }

        @Deprecated
        public boolean hasOptionalKeyword() {
            if (this.isProto3Optional) {
                return true;
            }
            return this.file.getSyntax() == FileDescriptor.Syntax.PROTO2 && isOptional() && getContainingOneof() == null;
        }

        public boolean hasPresence() {
            if (isRepeated()) {
                return false;
            }
            return getType() == Type.MESSAGE || getType() == Type.GROUP || getContainingOneof() != null || this.file.getSyntax() == FileDescriptor.Syntax.PROTO2;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Message.Builder) builder).mergeFrom((Message) messageLite);
        }

        public boolean isExtension() {
            return this.proto.hasExtendee();
        }

        public boolean isMapField() {
            return getType() == Type.MESSAGE && isRepeated() && getMessageType().getOptions().getMapEntry();
        }

        public boolean isOptional() {
            return this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL;
        }

        public boolean isPackable() {
            return isRepeated() && getLiteType().isPackable();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            if (!isPackable()) {
                return false;
            }
            if (getFile().getSyntax() == FileDescriptor.Syntax.PROTO2) {
                return getOptions().getPacked();
            }
            return !getOptions().hasPacked() || getOptions().getPacked();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REPEATED;
        }

        public boolean isRequired() {
            return this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REQUIRED;
        }

        public boolean legacyEnumFieldTreatedAsClosed() {
            return getType() == Type.ENUM && getFile().getSyntax() == FileDescriptor.Syntax.PROTO2;
        }

        public boolean needsUtf8Check() {
            if (this.type != Type.STRING) {
                return false;
            }
            if (getContainingType().getOptions().getMapEntry() || getFile().getSyntax() == FileDescriptor.Syntax.PROTO3) {
                return true;
            }
            return getFile().getOptions().getJavaStringCheckUtf8();
        }

        public String toString() {
            return getFullName();
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.FieldDescriptorProto toProto() {
            return this.proto;
        }

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        public static final class Type {
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type BOOL;
            public static final Type BYTES;
            public static final Type DOUBLE;
            public static final Type ENUM;
            public static final Type FIXED32;
            public static final Type FIXED64;
            public static final Type FLOAT;
            public static final Type GROUP;
            public static final Type INT32;
            public static final Type INT64;
            public static final Type MESSAGE;
            public static final Type SFIXED32;
            public static final Type SFIXED64;
            public static final Type SINT32;
            public static final Type SINT64;
            public static final Type STRING;
            public static final Type UINT32;
            public static final Type UINT64;
            private static final Type[] types;
            private final JavaType javaType;

            static {
                Type type = new Type("DOUBLE", 0, JavaType.DOUBLE);
                DOUBLE = type;
                Type type2 = new Type("FLOAT", 1, JavaType.FLOAT);
                FLOAT = type2;
                JavaType javaType = JavaType.LONG;
                Type type3 = new Type("INT64", 2, javaType);
                INT64 = type3;
                Type type4 = new Type("UINT64", 3, javaType);
                UINT64 = type4;
                JavaType javaType2 = JavaType.INT;
                Type type5 = new Type("INT32", 4, javaType2);
                INT32 = type5;
                Type type6 = new Type("FIXED64", 5, javaType);
                FIXED64 = type6;
                Type type7 = new Type("FIXED32", 6, javaType2);
                FIXED32 = type7;
                Type type8 = new Type("BOOL", 7, JavaType.BOOLEAN);
                BOOL = type8;
                Type type9 = new Type("STRING", 8, JavaType.STRING);
                STRING = type9;
                JavaType javaType3 = JavaType.MESSAGE;
                Type type10 = new Type("GROUP", 9, javaType3);
                GROUP = type10;
                Type type11 = new Type("MESSAGE", 10, javaType3);
                MESSAGE = type11;
                Type type12 = new Type("BYTES", 11, JavaType.BYTE_STRING);
                BYTES = type12;
                Type type13 = new Type("UINT32", 12, javaType2);
                UINT32 = type13;
                Type type14 = new Type("ENUM", 13, JavaType.ENUM);
                ENUM = type14;
                Type type15 = new Type("SFIXED32", 14, javaType2);
                SFIXED32 = type15;
                Type type16 = new Type("SFIXED64", 15, javaType);
                SFIXED64 = type16;
                Type type17 = new Type("SINT32", 16, javaType2);
                SINT32 = type17;
                Type type18 = new Type("SINT64", 17, javaType);
                SINT64 = type18;
                $VALUES = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18};
                types = values();
            }

            private Type(String str, int i14, JavaType javaType) {
                super(str, i14);
                this.javaType = javaType;
            }

            public static Type valueOf(DescriptorProtos.FieldDescriptorProto.Type type) {
                return types[type.getNumber() - 1];
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            public JavaType getJavaType() {
                return this.javaType;
            }

            public DescriptorProtos.FieldDescriptorProto.Type toProto() {
                return DescriptorProtos.FieldDescriptorProto.Type.forNumber(ordinal() + 1);
            }

            public static Type valueOf(String str) {
                return (Type) java.lang.Enum.valueOf(Type.class, str);
            }
        }

        public /* synthetic */ FieldDescriptor(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i14, boolean z14, AnonymousClass1 anonymousClass1) {
            this(fieldDescriptorProto, fileDescriptor, descriptor, i14, z14);
        }
    }

    public static final class FileDescriptor extends GenericDescriptor {
        private final FileDescriptor[] dependencies;
        private final EnumDescriptor[] enumTypes;
        private final FieldDescriptor[] extensions;
        private final Descriptor[] messageTypes;
        private final DescriptorPool pool;
        private DescriptorProtos.FileDescriptorProto proto;
        private final FileDescriptor[] publicDependencies;
        private final ServiceDescriptor[] services;

        @Deprecated
        public interface InternalDescriptorAssigner {
            ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
        }

        @Deprecated
        public enum Syntax {
            UNKNOWN(PrivacyUpdateRequestError.UNKNOWN),
            PROTO2("proto2"),
            PROTO3("proto3"),
            EDITIONS("editions");

            private final String name;

            Syntax(String str) {
                this.name = str;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private FileDescriptor(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, DescriptorPool descriptorPool, boolean z14) throws DescriptorValidationException {
            AnonymousClass1 anonymousClass1 = null;
            super(anonymousClass1);
            this.pool = descriptorPool;
            this.proto = fileDescriptorProto;
            this.dependencies = (FileDescriptor[]) fileDescriptorArr.clone();
            HashMap map = new HashMap();
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                map.put(fileDescriptor.getName(), fileDescriptor);
            }
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < fileDescriptorProto.getPublicDependencyCount(); i14++) {
                int publicDependency = fileDescriptorProto.getPublicDependency(i14);
                if (publicDependency < 0 || publicDependency >= fileDescriptorProto.getDependencyCount()) {
                    throw new DescriptorValidationException(this, "Invalid public dependency index.", anonymousClass1);
                }
                String dependency = fileDescriptorProto.getDependency(publicDependency);
                FileDescriptor fileDescriptor2 = (FileDescriptor) map.get(dependency);
                if (fileDescriptor2 != null) {
                    arrayList.add(fileDescriptor2);
                } else if (!z14) {
                    throw new DescriptorValidationException(this, c.n("Invalid public dependency: ", dependency), anonymousClass1);
                }
            }
            FileDescriptor[] fileDescriptorArr2 = new FileDescriptor[arrayList.size()];
            this.publicDependencies = fileDescriptorArr2;
            arrayList.toArray(fileDescriptorArr2);
            descriptorPool.addPackage(getPackage(), this);
            this.messageTypes = fileDescriptorProto.getMessageTypeCount() > 0 ? new Descriptor[fileDescriptorProto.getMessageTypeCount()] : Descriptors.EMPTY_DESCRIPTORS;
            for (int i15 = 0; i15 < fileDescriptorProto.getMessageTypeCount(); i15++) {
                this.messageTypes[i15] = new Descriptor(fileDescriptorProto.getMessageType(i15), this, null, i15, null);
            }
            this.enumTypes = fileDescriptorProto.getEnumTypeCount() > 0 ? new EnumDescriptor[fileDescriptorProto.getEnumTypeCount()] : Descriptors.EMPTY_ENUM_DESCRIPTORS;
            for (int i16 = 0; i16 < fileDescriptorProto.getEnumTypeCount(); i16++) {
                this.enumTypes[i16] = new EnumDescriptor(fileDescriptorProto.getEnumType(i16), this, null, i16, null);
            }
            this.services = fileDescriptorProto.getServiceCount() > 0 ? new ServiceDescriptor[fileDescriptorProto.getServiceCount()] : Descriptors.EMPTY_SERVICE_DESCRIPTORS;
            for (int i17 = 0; i17 < fileDescriptorProto.getServiceCount(); i17++) {
                this.services[i17] = new ServiceDescriptor(fileDescriptorProto.getService(i17), this, i17, anonymousClass1);
            }
            this.extensions = fileDescriptorProto.getExtensionCount() > 0 ? new FieldDescriptor[fileDescriptorProto.getExtensionCount()] : Descriptors.EMPTY_FIELD_DESCRIPTORS;
            for (int i18 = 0; i18 < fileDescriptorProto.getExtensionCount(); i18++) {
                this.extensions[i18] = new FieldDescriptor(fileDescriptorProto.getExtension(i18), this, null, i18, true, null);
            }
        }

        public static FileDescriptor buildFrom(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, boolean z14) throws DescriptorValidationException {
            FileDescriptor fileDescriptor = new FileDescriptor(fileDescriptorProto, fileDescriptorArr, new DescriptorPool(fileDescriptorArr, z14), z14);
            fileDescriptor.crossLink();
            return fileDescriptor;
        }

        private void crossLink() throws DescriptorValidationException {
            for (Descriptor descriptor : this.messageTypes) {
                descriptor.crossLink();
            }
            for (ServiceDescriptor serviceDescriptor : this.services) {
                serviceDescriptor.crossLink();
            }
            for (FieldDescriptor fieldDescriptor : this.extensions) {
                fieldDescriptor.crossLink();
            }
        }

        private static FileDescriptor[] findDescriptors(Class<?> cls, String[] strArr, String[] strArr2) {
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < strArr.length; i14++) {
                try {
                    arrayList.add((FileDescriptor) cls.getClassLoader().loadClass(strArr[i14]).getField("descriptor").get(null));
                } catch (Exception unused) {
                    Descriptors.logger.warning("Descriptors for \"" + strArr2[i14] + "\" can not be found.");
                }
            }
            return (FileDescriptor[]) arrayList.toArray(new FileDescriptor[0]);
        }

        @Deprecated
        public static void internalBuildGeneratedFileFrom(String[] strArr, FileDescriptor[] fileDescriptorArr, InternalDescriptorAssigner internalDescriptorAssigner) {
            byte[] bArrLatin1Cat = latin1Cat(strArr);
            try {
                DescriptorProtos.FileDescriptorProto from = DescriptorProtos.FileDescriptorProto.parseFrom(bArrLatin1Cat);
                try {
                    FileDescriptor fileDescriptorBuildFrom = buildFrom(from, fileDescriptorArr, true);
                    ExtensionRegistry extensionRegistryAssignDescriptors = internalDescriptorAssigner.assignDescriptors(fileDescriptorBuildFrom);
                    if (extensionRegistryAssignDescriptors != null) {
                        try {
                            fileDescriptorBuildFrom.setProto(DescriptorProtos.FileDescriptorProto.parseFrom(bArrLatin1Cat, extensionRegistryAssignDescriptors));
                        } catch (InvalidProtocolBufferException e4) {
                            n23.j.w("Failed to parse protocol buffer descriptor for generated code.", e4);
                        }
                    }
                } catch (DescriptorValidationException e14) {
                    n23.j.v("Invalid embedded descriptor for \"", from.getName(), "\".", e14);
                }
            } catch (InvalidProtocolBufferException e15) {
                n23.j.w("Failed to parse protocol buffer descriptor for generated code.", e15);
            }
        }

        public static void internalUpdateFileDescriptor(FileDescriptor fileDescriptor, ExtensionRegistry extensionRegistry) {
            try {
                fileDescriptor.setProto(DescriptorProtos.FileDescriptorProto.parseFrom(fileDescriptor.proto.toByteString(), extensionRegistry));
            } catch (InvalidProtocolBufferException e4) {
                n23.j.w("Failed to parse protocol buffer descriptor for generated code.", e4);
            }
        }

        private static byte[] latin1Cat(String[] strArr) {
            if (strArr.length == 1) {
                return strArr[0].getBytes(Internal.ISO_8859_1);
            }
            StringBuilder sb3 = new StringBuilder();
            for (String str : strArr) {
                sb3.append(str);
            }
            return sb3.toString().getBytes(Internal.ISO_8859_1);
        }

        private void setProto(DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
            this.proto = fileDescriptorProto;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                Descriptor[] descriptorArr = this.messageTypes;
                if (i15 >= descriptorArr.length) {
                    break;
                }
                descriptorArr[i15].setProto(fileDescriptorProto.getMessageType(i15));
                i15++;
            }
            int i16 = 0;
            while (true) {
                EnumDescriptor[] enumDescriptorArr = this.enumTypes;
                if (i16 >= enumDescriptorArr.length) {
                    break;
                }
                enumDescriptorArr[i16].setProto(fileDescriptorProto.getEnumType(i16));
                i16++;
            }
            int i17 = 0;
            while (true) {
                ServiceDescriptor[] serviceDescriptorArr = this.services;
                if (i17 >= serviceDescriptorArr.length) {
                    break;
                }
                serviceDescriptorArr[i17].setProto(fileDescriptorProto.getService(i17));
                i17++;
            }
            while (true) {
                FieldDescriptor[] fieldDescriptorArr = this.extensions;
                if (i14 >= fieldDescriptorArr.length) {
                    return;
                }
                fieldDescriptorArr[i14].setProto(fileDescriptorProto.getExtension(i14));
                i14++;
            }
        }

        public void copyHeadingTo(DescriptorProtos.FileDescriptorProto.Builder builder) {
            builder.setName(getName()).setSyntax(getSyntax().name);
            if (!getPackage().isEmpty()) {
                builder.setPackage(getPackage());
            }
            if (getSyntax().equals(Syntax.EDITIONS)) {
                builder.setEdition(getEdition());
            }
            if (getOptions().equals(DescriptorProtos.FileOptions.getDefaultInstance())) {
                return;
            }
            builder.setOptions(getOptions());
        }

        public EnumDescriptor findEnumTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof EnumDescriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (EnumDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public FieldDescriptor findExtensionByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof FieldDescriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (FieldDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public Descriptor findMessageTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof Descriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (Descriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public ServiceDescriptor findServiceByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof ServiceDescriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (ServiceDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public List<FileDescriptor> getDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.dependencies));
        }

        public DescriptorProtos.Edition getEdition() {
            return this.proto.getEdition();
        }

        public String getEditionName() {
            return this.proto.getEdition().equals(DescriptorProtos.Edition.EDITION_UNKNOWN) ? "" : this.proto.getEdition().name().substring(8);
        }

        public List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.proto.getName();
        }

        public List<Descriptor> getMessageTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.messageTypes));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.FileOptions getOptions() {
            return this.proto.getOptions();
        }

        public String getPackage() {
            return this.proto.getPackage();
        }

        public List<FileDescriptor> getPublicDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.publicDependencies));
        }

        public List<ServiceDescriptor> getServices() {
            return Collections.unmodifiableList(Arrays.asList(this.services));
        }

        @Deprecated
        public Syntax getSyntax() {
            Syntax syntax = Syntax.PROTO3;
            if (syntax.name.equals(this.proto.getSyntax())) {
                return syntax;
            }
            Syntax syntax2 = Syntax.EDITIONS;
            return syntax2.name.equals(this.proto.getSyntax()) ? syntax2 : Syntax.PROTO2;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.FileDescriptorProto toProto() {
            return this.proto;
        }

        public static FileDescriptor buildFrom(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr) {
            return buildFrom(fileDescriptorProto, fileDescriptorArr, false);
        }

        public static FileDescriptor internalBuildGeneratedFileFrom(String[] strArr, FileDescriptor[] fileDescriptorArr) {
            try {
                DescriptorProtos.FileDescriptorProto from = DescriptorProtos.FileDescriptorProto.parseFrom(latin1Cat(strArr));
                try {
                    return buildFrom(from, fileDescriptorArr, true);
                } catch (DescriptorValidationException e4) {
                    n23.j.v("Invalid embedded descriptor for \"", from.getName(), "\".", e4);
                    return null;
                }
            } catch (InvalidProtocolBufferException e14) {
                n23.j.w("Failed to parse protocol buffer descriptor for generated code.", e14);
                return null;
            }
        }

        @Deprecated
        public static void internalBuildGeneratedFileFrom(String[] strArr, Class<?> cls, String[] strArr2, String[] strArr3, InternalDescriptorAssigner internalDescriptorAssigner) {
            internalBuildGeneratedFileFrom(strArr, findDescriptors(cls, strArr2, strArr3), internalDescriptorAssigner);
        }

        public static FileDescriptor internalBuildGeneratedFileFrom(String[] strArr, Class<?> cls, String[] strArr2, String[] strArr3) {
            return internalBuildGeneratedFileFrom(strArr, findDescriptors(cls, strArr2, strArr3));
        }

        public FileDescriptor(String str, Descriptor descriptor) throws DescriptorValidationException {
            super(null);
            DescriptorPool descriptorPool = new DescriptorPool(new FileDescriptor[0], true);
            this.pool = descriptorPool;
            this.proto = DescriptorProtos.FileDescriptorProto.newBuilder().setName(descriptor.getFullName() + ".placeholder.proto").setPackage(str).addMessageType(descriptor.toProto()).build();
            this.dependencies = new FileDescriptor[0];
            this.publicDependencies = new FileDescriptor[0];
            this.messageTypes = new Descriptor[]{descriptor};
            this.enumTypes = Descriptors.EMPTY_ENUM_DESCRIPTORS;
            this.services = Descriptors.EMPTY_SERVICE_DESCRIPTORS;
            this.extensions = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            descriptorPool.addPackage(str, this);
            descriptorPool.addSymbol(descriptor);
        }
    }

    public static final class MethodDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private Descriptor inputType;
        private Descriptor outputType;
        private DescriptorProtos.MethodDescriptorProto proto;
        private final ServiceDescriptor service;

        private MethodDescriptor(DescriptorProtos.MethodDescriptorProto methodDescriptorProto, FileDescriptor fileDescriptor, ServiceDescriptor serviceDescriptor, int i14) throws DescriptorValidationException {
            super(null);
            this.index = i14;
            this.proto = methodDescriptorProto;
            this.file = fileDescriptor;
            this.service = serviceDescriptor;
            this.fullName = serviceDescriptor.getFullName() + '.' + methodDescriptorProto.getName();
            fileDescriptor.pool.addSymbol(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void crossLink() throws DescriptorValidationException {
            DescriptorPool descriptorPool = getFile().pool;
            String inputType = this.proto.getInputType();
            DescriptorPool.SearchFilter searchFilter = DescriptorPool.SearchFilter.TYPES_ONLY;
            GenericDescriptor genericDescriptorLookupSymbol = descriptorPool.lookupSymbol(inputType, this, searchFilter);
            AnonymousClass1 anonymousClass1 = null;
            if (!(genericDescriptorLookupSymbol instanceof Descriptor)) {
                throw new DescriptorValidationException(this, "\"" + this.proto.getInputType() + "\" is not a message type.", anonymousClass1);
            }
            this.inputType = (Descriptor) genericDescriptorLookupSymbol;
            GenericDescriptor genericDescriptorLookupSymbol2 = getFile().pool.lookupSymbol(this.proto.getOutputType(), this, searchFilter);
            if (genericDescriptorLookupSymbol2 instanceof Descriptor) {
                this.outputType = (Descriptor) genericDescriptorLookupSymbol2;
                return;
            }
            throw new DescriptorValidationException(this, "\"" + this.proto.getOutputType() + "\" is not a message type.", anonymousClass1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.MethodDescriptorProto methodDescriptorProto) {
            this.proto = methodDescriptorProto;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public Descriptor getInputType() {
            return this.inputType;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.MethodOptions getOptions() {
            return this.proto.getOptions();
        }

        public Descriptor getOutputType() {
            return this.outputType;
        }

        public ServiceDescriptor getService() {
            return this.service;
        }

        public boolean isClientStreaming() {
            return this.proto.getClientStreaming();
        }

        public boolean isServerStreaming() {
            return this.proto.getServerStreaming();
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.MethodDescriptorProto toProto() {
            return this.proto;
        }

        public /* synthetic */ MethodDescriptor(DescriptorProtos.MethodDescriptorProto methodDescriptorProto, FileDescriptor fileDescriptor, ServiceDescriptor serviceDescriptor, int i14, AnonymousClass1 anonymousClass1) {
            this(methodDescriptorProto, fileDescriptor, serviceDescriptor, i14);
        }
    }

    public static final class OneofDescriptor extends GenericDescriptor {
        private Descriptor containingType;
        private int fieldCount;
        private FieldDescriptor[] fields;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private DescriptorProtos.OneofDescriptorProto proto;

        private OneofDescriptor(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i14) {
            super(null);
            this.proto = oneofDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, oneofDescriptorProto.getName());
            this.file = fileDescriptor;
            this.index = i14;
            this.containingType = descriptor;
            this.fieldCount = 0;
        }

        public static /* synthetic */ int access$2608(OneofDescriptor oneofDescriptor) {
            int i14 = oneofDescriptor.fieldCount;
            oneofDescriptor.fieldCount = i14 + 1;
            return i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto) {
            this.proto = oneofDescriptorProto;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public FieldDescriptor getField(int i14) {
            return this.fields[i14];
        }

        public int getFieldCount() {
            return this.fieldCount;
        }

        public List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.OneofOptions getOptions() {
            return this.proto.getOptions();
        }

        @Deprecated
        public boolean isSynthetic() {
            FieldDescriptor[] fieldDescriptorArr = this.fields;
            return fieldDescriptorArr.length == 1 && fieldDescriptorArr[0].isProto3Optional;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.OneofDescriptorProto toProto() {
            return this.proto;
        }

        public /* synthetic */ OneofDescriptor(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i14, AnonymousClass1 anonymousClass1) {
            this(oneofDescriptorProto, fileDescriptor, descriptor, i14);
        }
    }

    public static final class ServiceDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private MethodDescriptor[] methods;
        private DescriptorProtos.ServiceDescriptorProto proto;

        private ServiceDescriptor(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto, FileDescriptor fileDescriptor, int i14) throws DescriptorValidationException {
            super(null);
            this.index = i14;
            this.proto = serviceDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, null, serviceDescriptorProto.getName());
            this.file = fileDescriptor;
            this.methods = new MethodDescriptor[serviceDescriptorProto.getMethodCount()];
            for (int i15 = 0; i15 < serviceDescriptorProto.getMethodCount(); i15++) {
                this.methods[i15] = new MethodDescriptor(serviceDescriptorProto.getMethod(i15), fileDescriptor, this, i15, null);
            }
            fileDescriptor.pool.addSymbol(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void crossLink() throws DescriptorValidationException {
            for (MethodDescriptor methodDescriptor : this.methods) {
                methodDescriptor.crossLink();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto) {
            this.proto = serviceDescriptorProto;
            int i14 = 0;
            while (true) {
                MethodDescriptor[] methodDescriptorArr = this.methods;
                if (i14 >= methodDescriptorArr.length) {
                    return;
                }
                methodDescriptorArr[i14].setProto(serviceDescriptorProto.getMethod(i14));
                i14++;
            }
        }

        public MethodDescriptor findMethodByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof MethodDescriptor) {
                return (MethodDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public List<MethodDescriptor> getMethods() {
            return Collections.unmodifiableList(Arrays.asList(this.methods));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.ServiceOptions getOptions() {
            return this.proto.getOptions();
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.ServiceDescriptorProto toProto() {
            return this.proto;
        }

        public /* synthetic */ ServiceDescriptor(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto, FileDescriptor fileDescriptor, int i14, AnonymousClass1 anonymousClass1) {
            this(serviceDescriptorProto, fileDescriptor, i14);
        }
    }

    public static class DescriptorValidationException extends Exception {
        private static final long serialVersionUID = 5750205775490483148L;
        private final String description;
        private final String name;
        private final Message proto;

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str) {
            super(genericDescriptor.getFullName() + ": " + str);
            this.name = genericDescriptor.getFullName();
            this.proto = genericDescriptor.toProto();
            this.description = str;
        }

        public String getDescription() {
            return this.description;
        }

        public Message getProblemProto() {
            return this.proto;
        }

        public String getProblemSymbolName() {
            return this.name;
        }

        public /* synthetic */ DescriptorValidationException(GenericDescriptor genericDescriptor, String str, AnonymousClass1 anonymousClass1) {
            this(genericDescriptor, str);
        }

        public /* synthetic */ DescriptorValidationException(GenericDescriptor genericDescriptor, String str, Throwable th3, AnonymousClass1 anonymousClass1) {
            this(genericDescriptor, str, th3);
        }

        public /* synthetic */ DescriptorValidationException(FileDescriptor fileDescriptor, String str, AnonymousClass1 anonymousClass1) {
            this(fileDescriptor, str);
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str, Throwable th3) {
            this(genericDescriptor, str);
            initCause(th3);
        }

        private DescriptorValidationException(FileDescriptor fileDescriptor, String str) {
            super(fileDescriptor.getName() + ": " + str);
            this.name = fileDescriptor.getName();
            this.proto = fileDescriptor.toProto();
            this.description = str;
        }
    }

    public static final class DescriptorPool {
        private final boolean allowUnknownDependencies;
        private final Set<FileDescriptor> dependencies;
        private final Map<String, GenericDescriptor> descriptorsByName = new HashMap();

        public static final class PackageDescriptor extends GenericDescriptor {
            private final FileDescriptor file;
            private final String fullName;
            private final String name;

            public PackageDescriptor(String str, String str2, FileDescriptor fileDescriptor) {
                super(null);
                this.file = fileDescriptor;
                this.fullName = str2;
                this.name = str;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public FileDescriptor getFile() {
                return this.file;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public String getFullName() {
                return this.fullName;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public String getName() {
                return this.name;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public Message toProto() {
                return this.file.toProto();
            }
        }

        public enum SearchFilter {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        public DescriptorPool(FileDescriptor[] fileDescriptorArr, boolean z14) {
            this.dependencies = Collections.newSetFromMap(new IdentityHashMap(fileDescriptorArr.length));
            this.allowUnknownDependencies = z14;
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                this.dependencies.add(fileDescriptor);
                importPublicDependencies(fileDescriptor);
            }
            for (FileDescriptor fileDescriptor2 : this.dependencies) {
                try {
                    addPackage(fileDescriptor2.getPackage(), fileDescriptor2);
                } catch (DescriptorValidationException e4) {
                    h.q(e4);
                    throw null;
                }
            }
        }

        private void importPublicDependencies(FileDescriptor fileDescriptor) {
            for (FileDescriptor fileDescriptor2 : fileDescriptor.getPublicDependencies()) {
                if (this.dependencies.add(fileDescriptor2)) {
                    importPublicDependencies(fileDescriptor2);
                }
            }
        }

        public static void validateSymbolName(GenericDescriptor genericDescriptor) throws DescriptorValidationException {
            String name = genericDescriptor.getName();
            AnonymousClass1 anonymousClass1 = null;
            if (name.length() == 0) {
                throw new DescriptorValidationException(genericDescriptor, "Missing name.", anonymousClass1);
            }
            for (int i14 = 0; i14 < name.length(); i14++) {
                char cCharAt = name.charAt(i14);
                if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i14 <= 0))) {
                    throw new DescriptorValidationException(genericDescriptor, j.m("\"", name, "\" is not a valid identifier."), anonymousClass1);
                }
            }
        }

        public void addPackage(String str, FileDescriptor fileDescriptor) throws DescriptorValidationException {
            String strSubstring;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                strSubstring = str;
            } else {
                addPackage(str.substring(0, iLastIndexOf), fileDescriptor);
                strSubstring = str.substring(iLastIndexOf + 1);
            }
            GenericDescriptor genericDescriptorPut = this.descriptorsByName.put(str, new PackageDescriptor(strSubstring, str, fileDescriptor));
            if (genericDescriptorPut != null) {
                this.descriptorsByName.put(str, genericDescriptorPut);
                if (genericDescriptorPut instanceof PackageDescriptor) {
                    return;
                }
                StringBuilder sbL = hb.a.l("\"", strSubstring, "\" is already defined (as something other than a package) in file \"");
                sbL.append(genericDescriptorPut.getFile().getName());
                sbL.append("\".");
                throw new DescriptorValidationException(fileDescriptor, sbL.toString(), (AnonymousClass1) null);
            }
        }

        public void addSymbol(GenericDescriptor genericDescriptor) throws DescriptorValidationException {
            validateSymbolName(genericDescriptor);
            String fullName = genericDescriptor.getFullName();
            GenericDescriptor genericDescriptorPut = this.descriptorsByName.put(fullName, genericDescriptor);
            if (genericDescriptorPut != null) {
                this.descriptorsByName.put(fullName, genericDescriptorPut);
                AnonymousClass1 anonymousClass1 = null;
                if (genericDescriptor.getFile() != genericDescriptorPut.getFile()) {
                    StringBuilder sbL = hb.a.l("\"", fullName, "\" is already defined in file \"");
                    sbL.append(genericDescriptorPut.getFile().getName());
                    sbL.append("\".");
                    throw new DescriptorValidationException(genericDescriptor, sbL.toString(), anonymousClass1);
                }
                int iLastIndexOf = fullName.lastIndexOf(46);
                if (iLastIndexOf == -1) {
                    throw new DescriptorValidationException(genericDescriptor, j.m("\"", fullName, "\" is already defined."), anonymousClass1);
                }
                throw new DescriptorValidationException(genericDescriptor, "\"" + fullName.substring(iLastIndexOf + 1) + "\" is already defined in \"" + fullName.substring(0, iLastIndexOf) + "\".", anonymousClass1);
            }
        }

        public GenericDescriptor findSymbol(String str, SearchFilter searchFilter) {
            GenericDescriptor genericDescriptor = this.descriptorsByName.get(str);
            if (genericDescriptor != null && (searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor))))) {
                return genericDescriptor;
            }
            Iterator<FileDescriptor> it = this.dependencies.iterator();
            while (it.hasNext()) {
                GenericDescriptor genericDescriptor2 = it.next().pool.descriptorsByName.get(str);
                if (genericDescriptor2 != null && (searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor2)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor2))))) {
                    return genericDescriptor2;
                }
            }
            return null;
        }

        public boolean isAggregate(GenericDescriptor genericDescriptor) {
            return (genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor) || (genericDescriptor instanceof PackageDescriptor) || (genericDescriptor instanceof ServiceDescriptor);
        }

        public boolean isType(GenericDescriptor genericDescriptor) {
            return (genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor);
        }

        public GenericDescriptor lookupSymbol(String str, GenericDescriptor genericDescriptor, SearchFilter searchFilter) throws DescriptorValidationException {
            GenericDescriptor genericDescriptorFindSymbol;
            String string;
            if (str.startsWith(".")) {
                string = str.substring(1);
                genericDescriptorFindSymbol = findSymbol(string, searchFilter);
            } else {
                int iIndexOf = str.indexOf(46);
                String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
                StringBuilder sb3 = new StringBuilder(genericDescriptor.getFullName());
                while (true) {
                    int iLastIndexOf = sb3.lastIndexOf(".");
                    if (iLastIndexOf == -1) {
                        genericDescriptorFindSymbol = findSymbol(str, searchFilter);
                        string = str;
                        break;
                    }
                    int i14 = iLastIndexOf + 1;
                    sb3.setLength(i14);
                    sb3.append(strSubstring);
                    GenericDescriptor genericDescriptorFindSymbol2 = findSymbol(sb3.toString(), SearchFilter.AGGREGATES_ONLY);
                    if (genericDescriptorFindSymbol2 != null) {
                        if (iIndexOf != -1) {
                            sb3.setLength(i14);
                            sb3.append(str);
                            genericDescriptorFindSymbol = findSymbol(sb3.toString(), searchFilter);
                        } else {
                            genericDescriptorFindSymbol = genericDescriptorFindSymbol2;
                        }
                        string = sb3.toString();
                        break;
                    }
                    sb3.setLength(iLastIndexOf);
                }
            }
            if (genericDescriptorFindSymbol != null) {
                return genericDescriptorFindSymbol;
            }
            if (!this.allowUnknownDependencies || searchFilter != SearchFilter.TYPES_ONLY) {
                throw new DescriptorValidationException(genericDescriptor, j.m("\"", str, "\" is not defined."), (AnonymousClass1) null);
            }
            Descriptors.logger.warning("The descriptor for message type \"" + str + "\" cannot be found and a placeholder is created for it");
            Descriptor descriptor = new Descriptor(string);
            this.dependencies.add(descriptor.getFile());
            return descriptor;
        }

        public GenericDescriptor findSymbol(String str) {
            return findSymbol(str, SearchFilter.ALL_SYMBOLS);
        }
    }
}
