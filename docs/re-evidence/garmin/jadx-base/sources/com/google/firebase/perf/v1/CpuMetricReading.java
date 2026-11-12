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
public final class CpuMetricReading extends GeneratedMessageLite<CpuMetricReading, Builder> implements CpuMetricReadingOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final CpuMetricReading DEFAULT_INSTANCE;
    private static volatile Parser<CpuMetricReading> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* JADX INFO: renamed from: com.google.firebase.perf.v1.CpuMetricReading$1, reason: invalid class name */
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
        CpuMetricReading cpuMetricReading = new CpuMetricReading();
        DEFAULT_INSTANCE = cpuMetricReading;
        GeneratedMessageLite.registerDefaultInstance(CpuMetricReading.class, cpuMetricReading);
    }

    private CpuMetricReading() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemTimeUs() {
        this.bitField0_ &= -5;
        this.systemTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserTimeUs() {
        this.bitField0_ &= -3;
        this.userTimeUs_ = 0L;
    }

    public static CpuMetricReading getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream) {
        return (CpuMetricReading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CpuMetricReading> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTimeUs(long j8) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemTimeUs(long j8) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserTimeUs(long j8) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j8;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new CpuMetricReading();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CpuMetricReading> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CpuMetricReading.class) {
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

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public long getClientTimeUs() {
        return this.clientTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public long getSystemTimeUs() {
        return this.systemTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public long getUserTimeUs() {
        return this.userTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public boolean hasClientTimeUs() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public boolean hasSystemTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public boolean hasUserTimeUs() {
        return (this.bitField0_ & 2) != 0;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CpuMetricReading, Builder> implements CpuMetricReadingOrBuilder {
        private Builder() {
            super(CpuMetricReading.DEFAULT_INSTANCE);
        }

        public Builder clearClientTimeUs() {
            copyOnWrite();
            ((CpuMetricReading) this.instance).clearClientTimeUs();
            return this;
        }

        public Builder clearSystemTimeUs() {
            copyOnWrite();
            ((CpuMetricReading) this.instance).clearSystemTimeUs();
            return this;
        }

        public Builder clearUserTimeUs() {
            copyOnWrite();
            ((CpuMetricReading) this.instance).clearUserTimeUs();
            return this;
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public long getClientTimeUs() {
            return ((CpuMetricReading) this.instance).getClientTimeUs();
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public long getSystemTimeUs() {
            return ((CpuMetricReading) this.instance).getSystemTimeUs();
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public long getUserTimeUs() {
            return ((CpuMetricReading) this.instance).getUserTimeUs();
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public boolean hasClientTimeUs() {
            return ((CpuMetricReading) this.instance).hasClientTimeUs();
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public boolean hasSystemTimeUs() {
            return ((CpuMetricReading) this.instance).hasSystemTimeUs();
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public boolean hasUserTimeUs() {
            return ((CpuMetricReading) this.instance).hasUserTimeUs();
        }

        public Builder setClientTimeUs(long j8) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setClientTimeUs(j8);
            return this;
        }

        public Builder setSystemTimeUs(long j8) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setSystemTimeUs(j8);
            return this;
        }

        public Builder setUserTimeUs(long j8) {
            copyOnWrite();
            ((CpuMetricReading) this.instance).setUserTimeUs(j8);
            return this;
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static Builder newBuilder(CpuMetricReading cpuMetricReading) {
        return DEFAULT_INSTANCE.createBuilder(cpuMetricReading);
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CpuMetricReading parseFrom(ByteString byteString) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CpuMetricReading parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CpuMetricReading parseFrom(byte[] bArr) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CpuMetricReading parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CpuMetricReading parseFrom(CodedInputStream codedInputStream) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CpuMetricReading parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
