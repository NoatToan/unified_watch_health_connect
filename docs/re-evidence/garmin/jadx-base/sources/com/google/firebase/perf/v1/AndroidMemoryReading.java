package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.a;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidMemoryReading extends GeneratedMessageLite<AndroidMemoryReading, Builder> implements AndroidMemoryReadingOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final AndroidMemoryReading DEFAULT_INSTANCE;
    private static volatile Parser<AndroidMemoryReading> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* JADX INFO: renamed from: com.google.firebase.perf.v1.AndroidMemoryReading$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AndroidMemoryReading androidMemoryReading = new AndroidMemoryReading();
        DEFAULT_INSTANCE = androidMemoryReading;
        GeneratedMessageLite.registerDefaultInstance(AndroidMemoryReading.class, androidMemoryReading);
    }

    private AndroidMemoryReading() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsedAppJavaHeapMemoryKb() {
        this.bitField0_ &= -3;
        this.usedAppJavaHeapMemoryKb_ = 0;
    }

    public static AndroidMemoryReading getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AndroidMemoryReading> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTimeUs(long j8) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsedAppJavaHeapMemoryKb(int i14) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i14;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new AndroidMemoryReading();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AndroidMemoryReading> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AndroidMemoryReading.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                a.m();
                return null;
        }
    }

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public long getClientTimeUs() {
        return this.clientTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public int getUsedAppJavaHeapMemoryKb() {
        return this.usedAppJavaHeapMemoryKb_;
    }

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public boolean hasClientTimeUs() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public boolean hasUsedAppJavaHeapMemoryKb() {
        return (this.bitField0_ & 2) != 0;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AndroidMemoryReading, Builder> implements AndroidMemoryReadingOrBuilder {
        private Builder() {
            super(AndroidMemoryReading.DEFAULT_INSTANCE);
        }

        public Builder clearClientTimeUs() {
            copyOnWrite();
            ((AndroidMemoryReading) this.instance).clearClientTimeUs();
            return this;
        }

        public Builder clearUsedAppJavaHeapMemoryKb() {
            copyOnWrite();
            ((AndroidMemoryReading) this.instance).clearUsedAppJavaHeapMemoryKb();
            return this;
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public long getClientTimeUs() {
            return ((AndroidMemoryReading) this.instance).getClientTimeUs();
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public int getUsedAppJavaHeapMemoryKb() {
            return ((AndroidMemoryReading) this.instance).getUsedAppJavaHeapMemoryKb();
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public boolean hasClientTimeUs() {
            return ((AndroidMemoryReading) this.instance).hasClientTimeUs();
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public boolean hasUsedAppJavaHeapMemoryKb() {
            return ((AndroidMemoryReading) this.instance).hasUsedAppJavaHeapMemoryKb();
        }

        public Builder setClientTimeUs(long j8) {
            copyOnWrite();
            ((AndroidMemoryReading) this.instance).setClientTimeUs(j8);
            return this;
        }

        public Builder setUsedAppJavaHeapMemoryKb(int i14) {
            copyOnWrite();
            ((AndroidMemoryReading) this.instance).setUsedAppJavaHeapMemoryKb(i14);
            return this;
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static Builder newBuilder(AndroidMemoryReading androidMemoryReading) {
        return DEFAULT_INSTANCE.createBuilder(androidMemoryReading);
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AndroidMemoryReading parseFrom(ByteString byteString) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AndroidMemoryReading parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AndroidMemoryReading parseFrom(byte[] bArr) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AndroidMemoryReading parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AndroidMemoryReading parseFrom(CodedInputStream codedInputStream) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AndroidMemoryReading parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
