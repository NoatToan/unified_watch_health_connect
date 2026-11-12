package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PerfSession extends GeneratedMessageLite<PerfSession, Builder> implements PerfSessionOrBuilder {
    private static final PerfSession DEFAULT_INSTANCE;
    private static volatile Parser<PerfSession> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final Internal.ListAdapter.Converter<Integer, SessionVerbosity> sessionVerbosity_converter_ = new Internal.ListAdapter.Converter<Integer, SessionVerbosity>() { // from class: com.google.firebase.perf.v1.PerfSession.1
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public SessionVerbosity convert(Integer num) {
            SessionVerbosity sessionVerbosityForNumber = SessionVerbosity.forNumber(num.intValue());
            return sessionVerbosityForNumber == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : sessionVerbosityForNumber;
        }
    };
    private int bitField0_;
    private String sessionId_ = "";
    private Internal.IntList sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    /* JADX INFO: renamed from: com.google.firebase.perf.v1.PerfSession$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
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

    public static final class Builder extends GeneratedMessageLite.Builder<PerfSession, Builder> implements PerfSessionOrBuilder {
        private Builder() {
            super(PerfSession.DEFAULT_INSTANCE);
        }

        public Builder addAllSessionVerbosity(Iterable<? extends SessionVerbosity> iterable) {
            copyOnWrite();
            ((PerfSession) this.instance).addAllSessionVerbosity(iterable);
            return this;
        }

        public Builder addSessionVerbosity(SessionVerbosity sessionVerbosity) {
            copyOnWrite();
            ((PerfSession) this.instance).addSessionVerbosity(sessionVerbosity);
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((PerfSession) this.instance).clearSessionId();
            return this;
        }

        public Builder clearSessionVerbosity() {
            copyOnWrite();
            ((PerfSession) this.instance).clearSessionVerbosity();
            return this;
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public String getSessionId() {
            return ((PerfSession) this.instance).getSessionId();
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public ByteString getSessionIdBytes() {
            return ((PerfSession) this.instance).getSessionIdBytes();
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public SessionVerbosity getSessionVerbosity(int i14) {
            return ((PerfSession) this.instance).getSessionVerbosity(i14);
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public int getSessionVerbosityCount() {
            return ((PerfSession) this.instance).getSessionVerbosityCount();
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public List<SessionVerbosity> getSessionVerbosityList() {
            return ((PerfSession) this.instance).getSessionVerbosityList();
        }

        @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
        public boolean hasSessionId() {
            return ((PerfSession) this.instance).hasSessionId();
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((PerfSession) this.instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((PerfSession) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public Builder setSessionVerbosity(int i14, SessionVerbosity sessionVerbosity) {
            copyOnWrite();
            ((PerfSession) this.instance).setSessionVerbosity(i14, sessionVerbosity);
            return this;
        }
    }

    static {
        PerfSession perfSession = new PerfSession();
        DEFAULT_INSTANCE = perfSession;
        GeneratedMessageLite.registerDefaultInstance(PerfSession.class, perfSession);
    }

    private PerfSession() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSessionVerbosity(Iterable<? extends SessionVerbosity> iterable) {
        ensureSessionVerbosityIsMutable();
        Iterator<? extends SessionVerbosity> it = iterable.iterator();
        while (it.hasNext()) {
            this.sessionVerbosity_.addInt(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessionVerbosity(SessionVerbosity sessionVerbosity) {
        sessionVerbosity.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.addInt(sessionVerbosity.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionVerbosity() {
        this.sessionVerbosity_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureSessionVerbosityIsMutable() {
        Internal.IntList intList = this.sessionVerbosity_;
        if (intList.isModifiable()) {
            return;
        }
        this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static PerfSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream) {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PerfSession> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        this.sessionId_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionVerbosity(int i14, SessionVerbosity sessionVerbosity) {
        sessionVerbosity.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.setInt(i14, sessionVerbosity.getNumber());
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AnonymousClass2.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new PerfSession();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", SessionVerbosity.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PerfSession> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PerfSession.class) {
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

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public SessionVerbosity getSessionVerbosity(int i14) {
        SessionVerbosity sessionVerbosityForNumber = SessionVerbosity.forNumber(this.sessionVerbosity_.getInt(i14));
        return sessionVerbosityForNumber == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : sessionVerbosityForNumber;
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public int getSessionVerbosityCount() {
        return this.sessionVerbosity_.size();
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public List<SessionVerbosity> getSessionVerbosityList() {
        return new Internal.ListAdapter(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    @Override // com.google.firebase.perf.v1.PerfSessionOrBuilder
    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(PerfSession perfSession) {
        return DEFAULT_INSTANCE.createBuilder(perfSession);
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PerfSession parseFrom(ByteString byteString) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PerfSession parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PerfSession parseFrom(byte[] bArr) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfSession parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PerfSession parseFrom(InputStream inputStream) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PerfSession parseFrom(CodedInputStream codedInputStream) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PerfSession parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
