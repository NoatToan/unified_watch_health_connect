package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class York {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.York$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

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

    public static final class YorkAlexaEventMessage extends GeneratedMessageLite<YorkAlexaEventMessage, Builder> implements YorkAlexaEventMessageOrBuilder {
        public static final int ALEXAPAGECOUNTER_FIELD_NUMBER = 1;
        public static final int CMD_FOR_ALARMS_FIELD_NUMBER = 13;
        public static final int CMD_FOR_INFORMATION_FIELD_NUMBER = 20;
        public static final int CMD_FOR_LISTS_FIELD_NUMBER = 15;
        public static final int CMD_FOR_NOTIFICATIONS_FIELD_NUMBER = 17;
        public static final int CMD_FOR_QA_FIELD_NUMBER = 21;
        public static final int CMD_FOR_REMINDERS_FIELD_NUMBER = 14;
        public static final int CMD_FOR_SEARCH_FIELD_NUMBER = 18;
        public static final int CMD_FOR_SMARTHOME_FIELD_NUMBER = 12;
        public static final int CMD_FOR_TRANSLATION_FIELD_NUMBER = 19;
        public static final int CMD_FOR_WEATHER_FIELD_NUMBER = 16;
        private static final YorkAlexaEventMessage DEFAULT_INSTANCE;
        public static final int NET_ERROR_FIELD_NUMBER = 4;
        public static final int NET_TIMEOUT_FIELD_NUMBER = 5;
        private static volatile Parser<YorkAlexaEventMessage> PARSER = null;
        public static final int SUCCESS_REQUEST_FIELD_NUMBER = 2;
        public static final int TTS_TIME_OUT_FIELD_NUMBER = 7;
        public static final int UNAUTHORIZED_FIELD_NUMBER = 6;
        public static final int UNCONNECT_MOBILE_FIELD_NUMBER = 8;
        public static final int UNKNOW_ERROR_FIELD_NUMBER = 3;
        public static final int UNSUPPORT_FUNCTION_FIELD_NUMBER = 10;
        public static final int UNSUPPORT_LANGUAGE_FIELD_NUMBER = 11;
        public static final int UPLOAD_DATA_FIELD_NUMBER = 9;
        private int alexapagecounter_;
        private int bitField0_;
        private int cmdForAlarms_;
        private int cmdForInformation_;
        private int cmdForLists_;
        private int cmdForNotifications_;
        private int cmdForQa_;
        private int cmdForReminders_;
        private int cmdForSearch_;
        private int cmdForSmarthome_;
        private int cmdForTranslation_;
        private int cmdForWeather_;
        private byte memoizedIsInitialized = 2;
        private int netError_;
        private int netTimeout_;
        private int successRequest_;
        private int ttsTimeOut_;
        private int unauthorized_;
        private int unconnectMobile_;
        private int unknowError_;
        private int unsupportFunction_;
        private int unsupportLanguage_;
        private int uploadData_;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkAlexaEventMessage, Builder> implements YorkAlexaEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlexapagecounter() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearAlexapagecounter();
                return this;
            }

            public Builder clearCmdForAlarms() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearCmdForAlarms();
                return this;
            }

            public Builder clearCmdForInformation() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearCmdForInformation();
                return this;
            }

            public Builder clearCmdForLists() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearCmdForLists();
                return this;
            }

            public Builder clearCmdForNotifications() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearCmdForNotifications();
                return this;
            }

            public Builder clearCmdForQa() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearCmdForQa();
                return this;
            }

            public Builder clearCmdForReminders() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearCmdForReminders();
                return this;
            }

            public Builder clearCmdForSearch() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearCmdForSearch();
                return this;
            }

            public Builder clearCmdForSmarthome() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearCmdForSmarthome();
                return this;
            }

            public Builder clearCmdForTranslation() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearCmdForTranslation();
                return this;
            }

            public Builder clearCmdForWeather() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearCmdForWeather();
                return this;
            }

            public Builder clearNetError() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearNetError();
                return this;
            }

            public Builder clearNetTimeout() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearNetTimeout();
                return this;
            }

            public Builder clearSuccessRequest() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearSuccessRequest();
                return this;
            }

            public Builder clearTtsTimeOut() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearTtsTimeOut();
                return this;
            }

            public Builder clearUnauthorized() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearUnauthorized();
                return this;
            }

            public Builder clearUnconnectMobile() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearUnconnectMobile();
                return this;
            }

            public Builder clearUnknowError() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearUnknowError();
                return this;
            }

            public Builder clearUnsupportFunction() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearUnsupportFunction();
                return this;
            }

            public Builder clearUnsupportLanguage() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearUnsupportLanguage();
                return this;
            }

            public Builder clearUploadData() {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).clearUploadData();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getAlexapagecounter() {
                return ((YorkAlexaEventMessage) this.instance).getAlexapagecounter();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getCmdForAlarms() {
                return ((YorkAlexaEventMessage) this.instance).getCmdForAlarms();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getCmdForInformation() {
                return ((YorkAlexaEventMessage) this.instance).getCmdForInformation();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getCmdForLists() {
                return ((YorkAlexaEventMessage) this.instance).getCmdForLists();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getCmdForNotifications() {
                return ((YorkAlexaEventMessage) this.instance).getCmdForNotifications();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getCmdForQa() {
                return ((YorkAlexaEventMessage) this.instance).getCmdForQa();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getCmdForReminders() {
                return ((YorkAlexaEventMessage) this.instance).getCmdForReminders();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getCmdForSearch() {
                return ((YorkAlexaEventMessage) this.instance).getCmdForSearch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getCmdForSmarthome() {
                return ((YorkAlexaEventMessage) this.instance).getCmdForSmarthome();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getCmdForTranslation() {
                return ((YorkAlexaEventMessage) this.instance).getCmdForTranslation();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getCmdForWeather() {
                return ((YorkAlexaEventMessage) this.instance).getCmdForWeather();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getNetError() {
                return ((YorkAlexaEventMessage) this.instance).getNetError();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getNetTimeout() {
                return ((YorkAlexaEventMessage) this.instance).getNetTimeout();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getSuccessRequest() {
                return ((YorkAlexaEventMessage) this.instance).getSuccessRequest();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getTtsTimeOut() {
                return ((YorkAlexaEventMessage) this.instance).getTtsTimeOut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getUnauthorized() {
                return ((YorkAlexaEventMessage) this.instance).getUnauthorized();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getUnconnectMobile() {
                return ((YorkAlexaEventMessage) this.instance).getUnconnectMobile();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getUnknowError() {
                return ((YorkAlexaEventMessage) this.instance).getUnknowError();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getUnsupportFunction() {
                return ((YorkAlexaEventMessage) this.instance).getUnsupportFunction();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getUnsupportLanguage() {
                return ((YorkAlexaEventMessage) this.instance).getUnsupportLanguage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public int getUploadData() {
                return ((YorkAlexaEventMessage) this.instance).getUploadData();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasAlexapagecounter() {
                return ((YorkAlexaEventMessage) this.instance).hasAlexapagecounter();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasCmdForAlarms() {
                return ((YorkAlexaEventMessage) this.instance).hasCmdForAlarms();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasCmdForInformation() {
                return ((YorkAlexaEventMessage) this.instance).hasCmdForInformation();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasCmdForLists() {
                return ((YorkAlexaEventMessage) this.instance).hasCmdForLists();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasCmdForNotifications() {
                return ((YorkAlexaEventMessage) this.instance).hasCmdForNotifications();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasCmdForQa() {
                return ((YorkAlexaEventMessage) this.instance).hasCmdForQa();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasCmdForReminders() {
                return ((YorkAlexaEventMessage) this.instance).hasCmdForReminders();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasCmdForSearch() {
                return ((YorkAlexaEventMessage) this.instance).hasCmdForSearch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasCmdForSmarthome() {
                return ((YorkAlexaEventMessage) this.instance).hasCmdForSmarthome();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasCmdForTranslation() {
                return ((YorkAlexaEventMessage) this.instance).hasCmdForTranslation();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasCmdForWeather() {
                return ((YorkAlexaEventMessage) this.instance).hasCmdForWeather();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasNetError() {
                return ((YorkAlexaEventMessage) this.instance).hasNetError();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasNetTimeout() {
                return ((YorkAlexaEventMessage) this.instance).hasNetTimeout();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasSuccessRequest() {
                return ((YorkAlexaEventMessage) this.instance).hasSuccessRequest();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasTtsTimeOut() {
                return ((YorkAlexaEventMessage) this.instance).hasTtsTimeOut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasUnauthorized() {
                return ((YorkAlexaEventMessage) this.instance).hasUnauthorized();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasUnconnectMobile() {
                return ((YorkAlexaEventMessage) this.instance).hasUnconnectMobile();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasUnknowError() {
                return ((YorkAlexaEventMessage) this.instance).hasUnknowError();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasUnsupportFunction() {
                return ((YorkAlexaEventMessage) this.instance).hasUnsupportFunction();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasUnsupportLanguage() {
                return ((YorkAlexaEventMessage) this.instance).hasUnsupportLanguage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
            public boolean hasUploadData() {
                return ((YorkAlexaEventMessage) this.instance).hasUploadData();
            }

            public Builder setAlexapagecounter(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setAlexapagecounter(value);
                return this;
            }

            public Builder setCmdForAlarms(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setCmdForAlarms(value);
                return this;
            }

            public Builder setCmdForInformation(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setCmdForInformation(value);
                return this;
            }

            public Builder setCmdForLists(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setCmdForLists(value);
                return this;
            }

            public Builder setCmdForNotifications(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setCmdForNotifications(value);
                return this;
            }

            public Builder setCmdForQa(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setCmdForQa(value);
                return this;
            }

            public Builder setCmdForReminders(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setCmdForReminders(value);
                return this;
            }

            public Builder setCmdForSearch(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setCmdForSearch(value);
                return this;
            }

            public Builder setCmdForSmarthome(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setCmdForSmarthome(value);
                return this;
            }

            public Builder setCmdForTranslation(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setCmdForTranslation(value);
                return this;
            }

            public Builder setCmdForWeather(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setCmdForWeather(value);
                return this;
            }

            public Builder setNetError(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setNetError(value);
                return this;
            }

            public Builder setNetTimeout(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setNetTimeout(value);
                return this;
            }

            public Builder setSuccessRequest(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setSuccessRequest(value);
                return this;
            }

            public Builder setTtsTimeOut(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setTtsTimeOut(value);
                return this;
            }

            public Builder setUnauthorized(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setUnauthorized(value);
                return this;
            }

            public Builder setUnconnectMobile(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setUnconnectMobile(value);
                return this;
            }

            public Builder setUnknowError(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setUnknowError(value);
                return this;
            }

            public Builder setUnsupportFunction(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setUnsupportFunction(value);
                return this;
            }

            public Builder setUnsupportLanguage(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setUnsupportLanguage(value);
                return this;
            }

            public Builder setUploadData(int value) {
                copyOnWrite();
                ((YorkAlexaEventMessage) this.instance).setUploadData(value);
                return this;
            }

            private Builder() {
                super(YorkAlexaEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            YorkAlexaEventMessage yorkAlexaEventMessage = new YorkAlexaEventMessage();
            DEFAULT_INSTANCE = yorkAlexaEventMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkAlexaEventMessage.class, yorkAlexaEventMessage);
        }

        private YorkAlexaEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlexapagecounter() {
            this.bitField0_ &= -2;
            this.alexapagecounter_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdForAlarms() {
            this.bitField0_ &= -4097;
            this.cmdForAlarms_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdForInformation() {
            this.bitField0_ &= -524289;
            this.cmdForInformation_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdForLists() {
            this.bitField0_ &= -16385;
            this.cmdForLists_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdForNotifications() {
            this.bitField0_ &= -65537;
            this.cmdForNotifications_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdForQa() {
            this.bitField0_ &= -1048577;
            this.cmdForQa_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdForReminders() {
            this.bitField0_ &= -8193;
            this.cmdForReminders_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdForSearch() {
            this.bitField0_ &= -131073;
            this.cmdForSearch_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdForSmarthome() {
            this.bitField0_ &= -2049;
            this.cmdForSmarthome_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdForTranslation() {
            this.bitField0_ &= -262145;
            this.cmdForTranslation_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdForWeather() {
            this.bitField0_ &= -32769;
            this.cmdForWeather_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetError() {
            this.bitField0_ &= -9;
            this.netError_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetTimeout() {
            this.bitField0_ &= -17;
            this.netTimeout_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuccessRequest() {
            this.bitField0_ &= -3;
            this.successRequest_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTtsTimeOut() {
            this.bitField0_ &= -65;
            this.ttsTimeOut_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnauthorized() {
            this.bitField0_ &= -33;
            this.unauthorized_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnconnectMobile() {
            this.bitField0_ &= -129;
            this.unconnectMobile_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnknowError() {
            this.bitField0_ &= -5;
            this.unknowError_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnsupportFunction() {
            this.bitField0_ &= -513;
            this.unsupportFunction_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnsupportLanguage() {
            this.bitField0_ &= -1025;
            this.unsupportLanguage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUploadData() {
            this.bitField0_ &= -257;
            this.uploadData_ = 0;
        }

        public static YorkAlexaEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkAlexaEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkAlexaEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkAlexaEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlexapagecounter(int value) {
            this.bitField0_ |= 1;
            this.alexapagecounter_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdForAlarms(int value) {
            this.bitField0_ |= 4096;
            this.cmdForAlarms_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdForInformation(int value) {
            this.bitField0_ |= 524288;
            this.cmdForInformation_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdForLists(int value) {
            this.bitField0_ |= 16384;
            this.cmdForLists_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdForNotifications(int value) {
            this.bitField0_ |= 65536;
            this.cmdForNotifications_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdForQa(int value) {
            this.bitField0_ |= 1048576;
            this.cmdForQa_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdForReminders(int value) {
            this.bitField0_ |= 8192;
            this.cmdForReminders_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdForSearch(int value) {
            this.bitField0_ |= 131072;
            this.cmdForSearch_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdForSmarthome(int value) {
            this.bitField0_ |= 2048;
            this.cmdForSmarthome_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdForTranslation(int value) {
            this.bitField0_ |= 262144;
            this.cmdForTranslation_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdForWeather(int value) {
            this.bitField0_ |= 32768;
            this.cmdForWeather_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetError(int value) {
            this.bitField0_ |= 8;
            this.netError_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetTimeout(int value) {
            this.bitField0_ |= 16;
            this.netTimeout_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuccessRequest(int value) {
            this.bitField0_ |= 2;
            this.successRequest_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTtsTimeOut(int value) {
            this.bitField0_ |= 64;
            this.ttsTimeOut_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnauthorized(int value) {
            this.bitField0_ |= 32;
            this.unauthorized_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnconnectMobile(int value) {
            this.bitField0_ |= 128;
            this.unconnectMobile_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnknowError(int value) {
            this.bitField0_ |= 4;
            this.unknowError_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnsupportFunction(int value) {
            this.bitField0_ |= 512;
            this.unsupportFunction_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnsupportLanguage(int value) {
            this.bitField0_ |= 1024;
            this.unsupportLanguage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUploadData(int value) {
            this.bitField0_ |= 256;
            this.uploadData_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkAlexaEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0015\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014", new Object[]{"bitField0_", "alexapagecounter_", "successRequest_", "unknowError_", "netError_", "netTimeout_", "unauthorized_", "ttsTimeOut_", "unconnectMobile_", "uploadData_", "unsupportFunction_", "unsupportLanguage_", "cmdForSmarthome_", "cmdForAlarms_", "cmdForReminders_", "cmdForLists_", "cmdForWeather_", "cmdForNotifications_", "cmdForSearch_", "cmdForTranslation_", "cmdForInformation_", "cmdForQa_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkAlexaEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkAlexaEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getAlexapagecounter() {
            return this.alexapagecounter_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getCmdForAlarms() {
            return this.cmdForAlarms_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getCmdForInformation() {
            return this.cmdForInformation_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getCmdForLists() {
            return this.cmdForLists_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getCmdForNotifications() {
            return this.cmdForNotifications_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getCmdForQa() {
            return this.cmdForQa_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getCmdForReminders() {
            return this.cmdForReminders_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getCmdForSearch() {
            return this.cmdForSearch_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getCmdForSmarthome() {
            return this.cmdForSmarthome_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getCmdForTranslation() {
            return this.cmdForTranslation_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getCmdForWeather() {
            return this.cmdForWeather_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getNetError() {
            return this.netError_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getNetTimeout() {
            return this.netTimeout_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getSuccessRequest() {
            return this.successRequest_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getTtsTimeOut() {
            return this.ttsTimeOut_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getUnauthorized() {
            return this.unauthorized_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getUnconnectMobile() {
            return this.unconnectMobile_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getUnknowError() {
            return this.unknowError_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getUnsupportFunction() {
            return this.unsupportFunction_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getUnsupportLanguage() {
            return this.unsupportLanguage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public int getUploadData() {
            return this.uploadData_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasAlexapagecounter() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasCmdForAlarms() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasCmdForInformation() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasCmdForLists() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasCmdForNotifications() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasCmdForQa() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasCmdForReminders() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasCmdForSearch() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasCmdForSmarthome() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasCmdForTranslation() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasCmdForWeather() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasNetError() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasNetTimeout() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasSuccessRequest() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasTtsTimeOut() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasUnauthorized() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasUnconnectMobile() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasUnknowError() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasUnsupportFunction() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasUnsupportLanguage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkAlexaEventMessageOrBuilder
        public boolean hasUploadData() {
            return (this.bitField0_ & 256) != 0;
        }

        public static Builder newBuilder(YorkAlexaEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkAlexaEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkAlexaEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkAlexaEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkAlexaEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkAlexaEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkAlexaEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkAlexaEventMessage parseFrom(InputStream input) throws IOException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkAlexaEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkAlexaEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkAlexaEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkAlexaEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkAlexaEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlexapagecounter();

        int getCmdForAlarms();

        int getCmdForInformation();

        int getCmdForLists();

        int getCmdForNotifications();

        int getCmdForQa();

        int getCmdForReminders();

        int getCmdForSearch();

        int getCmdForSmarthome();

        int getCmdForTranslation();

        int getCmdForWeather();

        int getNetError();

        int getNetTimeout();

        int getSuccessRequest();

        int getTtsTimeOut();

        int getUnauthorized();

        int getUnconnectMobile();

        int getUnknowError();

        int getUnsupportFunction();

        int getUnsupportLanguage();

        int getUploadData();

        boolean hasAlexapagecounter();

        boolean hasCmdForAlarms();

        boolean hasCmdForInformation();

        boolean hasCmdForLists();

        boolean hasCmdForNotifications();

        boolean hasCmdForQa();

        boolean hasCmdForReminders();

        boolean hasCmdForSearch();

        boolean hasCmdForSmarthome();

        boolean hasCmdForTranslation();

        boolean hasCmdForWeather();

        boolean hasNetError();

        boolean hasNetTimeout();

        boolean hasSuccessRequest();

        boolean hasTtsTimeOut();

        boolean hasUnauthorized();

        boolean hasUnconnectMobile();

        boolean hasUnknowError();

        boolean hasUnsupportFunction();

        boolean hasUnsupportLanguage();

        boolean hasUploadData();
    }

    public static final class YorkBloodoxygenEventMessage extends GeneratedMessageLite<YorkBloodoxygenEventMessage, Builder> implements YorkBloodoxygenEventMessageOrBuilder {
        private static final YorkBloodoxygenEventMessage DEFAULT_INSTANCE;
        public static final int MEASUREFAILAGAINDISPLAYPAGE_FIELD_NUMBER = 4;
        public static final int MEASUREFAILNOWEARDISPLAYPAGE_FIELD_NUMBER = 3;
        public static final int MEASUREFAILSIGNALDISPLAYPAGE_FIELD_NUMBER = 2;
        public static final int MEASURESUCCAGAINDISPLAYPAGE_FIELD_NUMBER = 5;
        public static final int MEASURESUCESSDISPLAYPAGE_FIELD_NUMBER = 1;
        private static volatile Parser<YorkBloodoxygenEventMessage> PARSER;
        private int bitField0_;
        private int measurefailagainDisplayPage_;
        private int measurefailnowearDisplayPage_;
        private int measurefailsignalDisplayPage_;
        private int measuresuccagainDisplayPage_;
        private int measuresucessDisplayPage_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkBloodoxygenEventMessage, Builder> implements YorkBloodoxygenEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearMeasurefailagainDisplayPage() {
                copyOnWrite();
                ((YorkBloodoxygenEventMessage) this.instance).clearMeasurefailagainDisplayPage();
                return this;
            }

            public Builder clearMeasurefailnowearDisplayPage() {
                copyOnWrite();
                ((YorkBloodoxygenEventMessage) this.instance).clearMeasurefailnowearDisplayPage();
                return this;
            }

            public Builder clearMeasurefailsignalDisplayPage() {
                copyOnWrite();
                ((YorkBloodoxygenEventMessage) this.instance).clearMeasurefailsignalDisplayPage();
                return this;
            }

            public Builder clearMeasuresuccagainDisplayPage() {
                copyOnWrite();
                ((YorkBloodoxygenEventMessage) this.instance).clearMeasuresuccagainDisplayPage();
                return this;
            }

            public Builder clearMeasuresucessDisplayPage() {
                copyOnWrite();
                ((YorkBloodoxygenEventMessage) this.instance).clearMeasuresucessDisplayPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
            public int getMeasurefailagainDisplayPage() {
                return ((YorkBloodoxygenEventMessage) this.instance).getMeasurefailagainDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
            public int getMeasurefailnowearDisplayPage() {
                return ((YorkBloodoxygenEventMessage) this.instance).getMeasurefailnowearDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
            public int getMeasurefailsignalDisplayPage() {
                return ((YorkBloodoxygenEventMessage) this.instance).getMeasurefailsignalDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
            public int getMeasuresuccagainDisplayPage() {
                return ((YorkBloodoxygenEventMessage) this.instance).getMeasuresuccagainDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
            public int getMeasuresucessDisplayPage() {
                return ((YorkBloodoxygenEventMessage) this.instance).getMeasuresucessDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
            public boolean hasMeasurefailagainDisplayPage() {
                return ((YorkBloodoxygenEventMessage) this.instance).hasMeasurefailagainDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
            public boolean hasMeasurefailnowearDisplayPage() {
                return ((YorkBloodoxygenEventMessage) this.instance).hasMeasurefailnowearDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
            public boolean hasMeasurefailsignalDisplayPage() {
                return ((YorkBloodoxygenEventMessage) this.instance).hasMeasurefailsignalDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
            public boolean hasMeasuresuccagainDisplayPage() {
                return ((YorkBloodoxygenEventMessage) this.instance).hasMeasuresuccagainDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
            public boolean hasMeasuresucessDisplayPage() {
                return ((YorkBloodoxygenEventMessage) this.instance).hasMeasuresucessDisplayPage();
            }

            public Builder setMeasurefailagainDisplayPage(int value) {
                copyOnWrite();
                ((YorkBloodoxygenEventMessage) this.instance).setMeasurefailagainDisplayPage(value);
                return this;
            }

            public Builder setMeasurefailnowearDisplayPage(int value) {
                copyOnWrite();
                ((YorkBloodoxygenEventMessage) this.instance).setMeasurefailnowearDisplayPage(value);
                return this;
            }

            public Builder setMeasurefailsignalDisplayPage(int value) {
                copyOnWrite();
                ((YorkBloodoxygenEventMessage) this.instance).setMeasurefailsignalDisplayPage(value);
                return this;
            }

            public Builder setMeasuresuccagainDisplayPage(int value) {
                copyOnWrite();
                ((YorkBloodoxygenEventMessage) this.instance).setMeasuresuccagainDisplayPage(value);
                return this;
            }

            public Builder setMeasuresucessDisplayPage(int value) {
                copyOnWrite();
                ((YorkBloodoxygenEventMessage) this.instance).setMeasuresucessDisplayPage(value);
                return this;
            }

            private Builder() {
                super(YorkBloodoxygenEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            YorkBloodoxygenEventMessage yorkBloodoxygenEventMessage = new YorkBloodoxygenEventMessage();
            DEFAULT_INSTANCE = yorkBloodoxygenEventMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkBloodoxygenEventMessage.class, yorkBloodoxygenEventMessage);
        }

        private YorkBloodoxygenEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeasurefailagainDisplayPage() {
            this.bitField0_ &= -9;
            this.measurefailagainDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeasurefailnowearDisplayPage() {
            this.bitField0_ &= -5;
            this.measurefailnowearDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeasurefailsignalDisplayPage() {
            this.bitField0_ &= -3;
            this.measurefailsignalDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeasuresuccagainDisplayPage() {
            this.bitField0_ &= -17;
            this.measuresuccagainDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeasuresucessDisplayPage() {
            this.bitField0_ &= -2;
            this.measuresucessDisplayPage_ = 0;
        }

        public static YorkBloodoxygenEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkBloodoxygenEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkBloodoxygenEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkBloodoxygenEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeasurefailagainDisplayPage(int value) {
            this.bitField0_ |= 8;
            this.measurefailagainDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeasurefailnowearDisplayPage(int value) {
            this.bitField0_ |= 4;
            this.measurefailnowearDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeasurefailsignalDisplayPage(int value) {
            this.bitField0_ |= 2;
            this.measurefailsignalDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeasuresuccagainDisplayPage(int value) {
            this.bitField0_ |= 16;
            this.measuresuccagainDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeasuresucessDisplayPage(int value) {
            this.bitField0_ |= 1;
            this.measuresucessDisplayPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkBloodoxygenEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004", new Object[]{"bitField0_", "measuresucessDisplayPage_", "measurefailsignalDisplayPage_", "measurefailnowearDisplayPage_", "measurefailagainDisplayPage_", "measuresuccagainDisplayPage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkBloodoxygenEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkBloodoxygenEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
        public int getMeasurefailagainDisplayPage() {
            return this.measurefailagainDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
        public int getMeasurefailnowearDisplayPage() {
            return this.measurefailnowearDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
        public int getMeasurefailsignalDisplayPage() {
            return this.measurefailsignalDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
        public int getMeasuresuccagainDisplayPage() {
            return this.measuresuccagainDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
        public int getMeasuresucessDisplayPage() {
            return this.measuresucessDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
        public boolean hasMeasurefailagainDisplayPage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
        public boolean hasMeasurefailnowearDisplayPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
        public boolean hasMeasurefailsignalDisplayPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
        public boolean hasMeasuresuccagainDisplayPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkBloodoxygenEventMessageOrBuilder
        public boolean hasMeasuresucessDisplayPage() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(YorkBloodoxygenEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkBloodoxygenEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkBloodoxygenEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkBloodoxygenEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkBloodoxygenEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkBloodoxygenEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkBloodoxygenEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkBloodoxygenEventMessage parseFrom(InputStream input) throws IOException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkBloodoxygenEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkBloodoxygenEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkBloodoxygenEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkBloodoxygenEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkBloodoxygenEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getMeasurefailagainDisplayPage();

        int getMeasurefailnowearDisplayPage();

        int getMeasurefailsignalDisplayPage();

        int getMeasuresuccagainDisplayPage();

        int getMeasuresucessDisplayPage();

        boolean hasMeasurefailagainDisplayPage();

        boolean hasMeasurefailnowearDisplayPage();

        boolean hasMeasurefailsignalDisplayPage();

        boolean hasMeasuresuccagainDisplayPage();

        boolean hasMeasuresucessDisplayPage();
    }

    public static final class YorkDialEventMessage extends GeneratedMessageLite<YorkDialEventMessage, Builder> implements YorkDialEventMessageOrBuilder {
        private static final YorkDialEventMessage DEFAULT_INSTANCE;
        public static final int DIALEDITPAGE_FIELD_NUMBER = 2;
        public static final int DIALLISTDISPLAYPAGE_FIELD_NUMBER = 1;
        public static final int EDITDIAL1_FIELD_NUMBER = 3;
        public static final int EDITDIAL2_FIELD_NUMBER = 4;
        public static final int EDITDIAL3_FIELD_NUMBER = 5;
        private static volatile Parser<YorkDialEventMessage> PARSER;
        private int bitField0_;
        private int dialEditpage_;
        private int dialListDisplayPage_;
        private YorkEditDialEventMessage editDial1_;
        private YorkEditDialEventMessage editDial2_;
        private YorkEditDialEventMessage editDial3_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkDialEventMessage, Builder> implements YorkDialEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDialEditpage() {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).clearDialEditpage();
                return this;
            }

            public Builder clearDialListDisplayPage() {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).clearDialListDisplayPage();
                return this;
            }

            public Builder clearEditDial1() {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).clearEditDial1();
                return this;
            }

            public Builder clearEditDial2() {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).clearEditDial2();
                return this;
            }

            public Builder clearEditDial3() {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).clearEditDial3();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
            public int getDialEditpage() {
                return ((YorkDialEventMessage) this.instance).getDialEditpage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
            public int getDialListDisplayPage() {
                return ((YorkDialEventMessage) this.instance).getDialListDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
            public YorkEditDialEventMessage getEditDial1() {
                return ((YorkDialEventMessage) this.instance).getEditDial1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
            public YorkEditDialEventMessage getEditDial2() {
                return ((YorkDialEventMessage) this.instance).getEditDial2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
            public YorkEditDialEventMessage getEditDial3() {
                return ((YorkDialEventMessage) this.instance).getEditDial3();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
            public boolean hasDialEditpage() {
                return ((YorkDialEventMessage) this.instance).hasDialEditpage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
            public boolean hasDialListDisplayPage() {
                return ((YorkDialEventMessage) this.instance).hasDialListDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
            public boolean hasEditDial1() {
                return ((YorkDialEventMessage) this.instance).hasEditDial1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
            public boolean hasEditDial2() {
                return ((YorkDialEventMessage) this.instance).hasEditDial2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
            public boolean hasEditDial3() {
                return ((YorkDialEventMessage) this.instance).hasEditDial3();
            }

            public Builder mergeEditDial1(YorkEditDialEventMessage value) {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).mergeEditDial1(value);
                return this;
            }

            public Builder mergeEditDial2(YorkEditDialEventMessage value) {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).mergeEditDial2(value);
                return this;
            }

            public Builder mergeEditDial3(YorkEditDialEventMessage value) {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).mergeEditDial3(value);
                return this;
            }

            public Builder setDialEditpage(int value) {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).setDialEditpage(value);
                return this;
            }

            public Builder setDialListDisplayPage(int value) {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).setDialListDisplayPage(value);
                return this;
            }

            public Builder setEditDial1(YorkEditDialEventMessage value) {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).setEditDial1(value);
                return this;
            }

            public Builder setEditDial2(YorkEditDialEventMessage value) {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).setEditDial2(value);
                return this;
            }

            public Builder setEditDial3(YorkEditDialEventMessage value) {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).setEditDial3(value);
                return this;
            }

            private Builder() {
                super(YorkDialEventMessage.DEFAULT_INSTANCE);
            }

            public Builder setEditDial1(YorkEditDialEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).setEditDial1(builderForValue.build());
                return this;
            }

            public Builder setEditDial2(YorkEditDialEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).setEditDial2(builderForValue.build());
                return this;
            }

            public Builder setEditDial3(YorkEditDialEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkDialEventMessage) this.instance).setEditDial3(builderForValue.build());
                return this;
            }
        }

        static {
            YorkDialEventMessage yorkDialEventMessage = new YorkDialEventMessage();
            DEFAULT_INSTANCE = yorkDialEventMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkDialEventMessage.class, yorkDialEventMessage);
        }

        private YorkDialEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialEditpage() {
            this.bitField0_ &= -3;
            this.dialEditpage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialListDisplayPage() {
            this.bitField0_ &= -2;
            this.dialListDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditDial1() {
            this.editDial1_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditDial2() {
            this.editDial2_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditDial3() {
            this.editDial3_ = null;
            this.bitField0_ &= -17;
        }

        public static YorkDialEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEditDial1(YorkEditDialEventMessage value) {
            value.getClass();
            YorkEditDialEventMessage yorkEditDialEventMessage = this.editDial1_;
            if (yorkEditDialEventMessage == null || yorkEditDialEventMessage == YorkEditDialEventMessage.getDefaultInstance()) {
                this.editDial1_ = value;
            } else {
                this.editDial1_ = YorkEditDialEventMessage.newBuilder(this.editDial1_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEditDial2(YorkEditDialEventMessage value) {
            value.getClass();
            YorkEditDialEventMessage yorkEditDialEventMessage = this.editDial2_;
            if (yorkEditDialEventMessage == null || yorkEditDialEventMessage == YorkEditDialEventMessage.getDefaultInstance()) {
                this.editDial2_ = value;
            } else {
                this.editDial2_ = YorkEditDialEventMessage.newBuilder(this.editDial2_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEditDial3(YorkEditDialEventMessage value) {
            value.getClass();
            YorkEditDialEventMessage yorkEditDialEventMessage = this.editDial3_;
            if (yorkEditDialEventMessage == null || yorkEditDialEventMessage == YorkEditDialEventMessage.getDefaultInstance()) {
                this.editDial3_ = value;
            } else {
                this.editDial3_ = YorkEditDialEventMessage.newBuilder(this.editDial3_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkDialEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkDialEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkDialEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialEditpage(int value) {
            this.bitField0_ |= 2;
            this.dialEditpage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialListDisplayPage(int value) {
            this.bitField0_ |= 1;
            this.dialListDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditDial1(YorkEditDialEventMessage value) {
            value.getClass();
            this.editDial1_ = value;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditDial2(YorkEditDialEventMessage value) {
            value.getClass();
            this.editDial2_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditDial3(YorkEditDialEventMessage value) {
            value.getClass();
            this.editDial3_ = value;
            this.bitField0_ |= 16;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkDialEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔉ\u0002\u0004ᔉ\u0003\u0005ᔉ\u0004", new Object[]{"bitField0_", "dialListDisplayPage_", "dialEditpage_", "editDial1_", "editDial2_", "editDial3_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkDialEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkDialEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
        public int getDialEditpage() {
            return this.dialEditpage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
        public int getDialListDisplayPage() {
            return this.dialListDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
        public YorkEditDialEventMessage getEditDial1() {
            YorkEditDialEventMessage yorkEditDialEventMessage = this.editDial1_;
            return yorkEditDialEventMessage == null ? YorkEditDialEventMessage.getDefaultInstance() : yorkEditDialEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
        public YorkEditDialEventMessage getEditDial2() {
            YorkEditDialEventMessage yorkEditDialEventMessage = this.editDial2_;
            return yorkEditDialEventMessage == null ? YorkEditDialEventMessage.getDefaultInstance() : yorkEditDialEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
        public YorkEditDialEventMessage getEditDial3() {
            YorkEditDialEventMessage yorkEditDialEventMessage = this.editDial3_;
            return yorkEditDialEventMessage == null ? YorkEditDialEventMessage.getDefaultInstance() : yorkEditDialEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
        public boolean hasDialEditpage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
        public boolean hasDialListDisplayPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
        public boolean hasEditDial1() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
        public boolean hasEditDial2() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkDialEventMessageOrBuilder
        public boolean hasEditDial3() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(YorkDialEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkDialEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkDialEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkDialEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkDialEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkDialEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkDialEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkDialEventMessage parseFrom(InputStream input) throws IOException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkDialEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkDialEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkDialEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkDialEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getDialEditpage();

        int getDialListDisplayPage();

        YorkEditDialEventMessage getEditDial1();

        YorkEditDialEventMessage getEditDial2();

        YorkEditDialEventMessage getEditDial3();

        boolean hasDialEditpage();

        boolean hasDialListDisplayPage();

        boolean hasEditDial1();

        boolean hasEditDial2();

        boolean hasEditDial3();
    }

    public static final class YorkEditDialEventMessage extends GeneratedMessageLite<YorkEditDialEventMessage, Builder> implements YorkEditDialEventMessageOrBuilder {
        public static final int AIRQUALITYPAGE_FIELD_NUMBER = 12;
        public static final int ALARMPAGE_FIELD_NUMBER = 14;
        public static final int ALLDAYHR_FIELD_NUMBER = 8;
        public static final int BATTERYPAGE_FIELD_NUMBER = 5;
        public static final int CALENDARPAGE_FIELD_NUMBER = 15;
        public static final int CALPAGE_FIELD_NUMBER = 3;
        public static final int DAYPAIPAGE_FIELD_NUMBER = 6;
        private static final YorkEditDialEventMessage DEFAULT_INSTANCE;
        public static final int EVENTREMINDPAGE_FIELD_NUMBER = 13;
        public static final int HOURSTEPPAGE_FIELD_NUMBER = 7;
        public static final int HRPAGE_FIELD_NUMBER = 2;
        public static final int OTHERWEATEHRPAGE_FIELD_NUMBER = 11;
        public static final int PAIPAGE_FIELD_NUMBER = 4;
        private static volatile Parser<YorkEditDialEventMessage> PARSER = null;
        public static final int SPORTPAGE_FIELD_NUMBER = 16;
        public static final int STEPIDPAGE_FIELD_NUMBER = 1;
        public static final int SUNRISEPAGE_FIELD_NUMBER = 10;
        public static final int WEATHERPAGE_FIELD_NUMBER = 9;
        private int airQualityPage_;
        private int alarmPage_;
        private int allDayHr_;
        private int batteryPage_;
        private int bitField0_;
        private int calPage_;
        private int calendarPage_;
        private int dayPaiPage_;
        private int eventRemindPage_;
        private int hourStepPage_;
        private int hrPage_;
        private byte memoizedIsInitialized = 2;
        private int otherWeatehrPage_;
        private int paiPage_;
        private int sportPage_;
        private int stepIdPage_;
        private int sunrisePage_;
        private int weatherPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkEditDialEventMessage, Builder> implements YorkEditDialEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAirQualityPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearAirQualityPage();
                return this;
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAllDayHr() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearAllDayHr();
                return this;
            }

            public Builder clearBatteryPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearBatteryPage();
                return this;
            }

            public Builder clearCalPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearCalPage();
                return this;
            }

            public Builder clearCalendarPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearCalendarPage();
                return this;
            }

            public Builder clearDayPaiPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearDayPaiPage();
                return this;
            }

            public Builder clearEventRemindPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearEventRemindPage();
                return this;
            }

            public Builder clearHourStepPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearHourStepPage();
                return this;
            }

            public Builder clearHrPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearHrPage();
                return this;
            }

            public Builder clearOtherWeatehrPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearOtherWeatehrPage();
                return this;
            }

            public Builder clearPaiPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearPaiPage();
                return this;
            }

            public Builder clearSportPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearSportPage();
                return this;
            }

            public Builder clearStepIdPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearStepIdPage();
                return this;
            }

            public Builder clearSunrisePage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearSunrisePage();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getAirQualityPage() {
                return ((YorkEditDialEventMessage) this.instance).getAirQualityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getAlarmPage() {
                return ((YorkEditDialEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getAllDayHr() {
                return ((YorkEditDialEventMessage) this.instance).getAllDayHr();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getBatteryPage() {
                return ((YorkEditDialEventMessage) this.instance).getBatteryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getCalPage() {
                return ((YorkEditDialEventMessage) this.instance).getCalPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getCalendarPage() {
                return ((YorkEditDialEventMessage) this.instance).getCalendarPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getDayPaiPage() {
                return ((YorkEditDialEventMessage) this.instance).getDayPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getEventRemindPage() {
                return ((YorkEditDialEventMessage) this.instance).getEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getHourStepPage() {
                return ((YorkEditDialEventMessage) this.instance).getHourStepPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getHrPage() {
                return ((YorkEditDialEventMessage) this.instance).getHrPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getOtherWeatehrPage() {
                return ((YorkEditDialEventMessage) this.instance).getOtherWeatehrPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getPaiPage() {
                return ((YorkEditDialEventMessage) this.instance).getPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getSportPage() {
                return ((YorkEditDialEventMessage) this.instance).getSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getStepIdPage() {
                return ((YorkEditDialEventMessage) this.instance).getStepIdPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getSunrisePage() {
                return ((YorkEditDialEventMessage) this.instance).getSunrisePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public int getWeatherPage() {
                return ((YorkEditDialEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasAirQualityPage() {
                return ((YorkEditDialEventMessage) this.instance).hasAirQualityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((YorkEditDialEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasAllDayHr() {
                return ((YorkEditDialEventMessage) this.instance).hasAllDayHr();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasBatteryPage() {
                return ((YorkEditDialEventMessage) this.instance).hasBatteryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasCalPage() {
                return ((YorkEditDialEventMessage) this.instance).hasCalPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasCalendarPage() {
                return ((YorkEditDialEventMessage) this.instance).hasCalendarPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasDayPaiPage() {
                return ((YorkEditDialEventMessage) this.instance).hasDayPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasEventRemindPage() {
                return ((YorkEditDialEventMessage) this.instance).hasEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasHourStepPage() {
                return ((YorkEditDialEventMessage) this.instance).hasHourStepPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasHrPage() {
                return ((YorkEditDialEventMessage) this.instance).hasHrPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasOtherWeatehrPage() {
                return ((YorkEditDialEventMessage) this.instance).hasOtherWeatehrPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasPaiPage() {
                return ((YorkEditDialEventMessage) this.instance).hasPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasSportPage() {
                return ((YorkEditDialEventMessage) this.instance).hasSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasStepIdPage() {
                return ((YorkEditDialEventMessage) this.instance).hasStepIdPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasSunrisePage() {
                return ((YorkEditDialEventMessage) this.instance).hasSunrisePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((YorkEditDialEventMessage) this.instance).hasWeatherPage();
            }

            public Builder setAirQualityPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setAirQualityPage(value);
                return this;
            }

            public Builder setAlarmPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setAlarmPage(value);
                return this;
            }

            public Builder setAllDayHr(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setAllDayHr(value);
                return this;
            }

            public Builder setBatteryPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setBatteryPage(value);
                return this;
            }

            public Builder setCalPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setCalPage(value);
                return this;
            }

            public Builder setCalendarPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setCalendarPage(value);
                return this;
            }

            public Builder setDayPaiPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setDayPaiPage(value);
                return this;
            }

            public Builder setEventRemindPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setEventRemindPage(value);
                return this;
            }

            public Builder setHourStepPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setHourStepPage(value);
                return this;
            }

            public Builder setHrPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setHrPage(value);
                return this;
            }

            public Builder setOtherWeatehrPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setOtherWeatehrPage(value);
                return this;
            }

            public Builder setPaiPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setPaiPage(value);
                return this;
            }

            public Builder setSportPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setSportPage(value);
                return this;
            }

            public Builder setStepIdPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setStepIdPage(value);
                return this;
            }

            public Builder setSunrisePage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setSunrisePage(value);
                return this;
            }

            public Builder setWeatherPage(int value) {
                copyOnWrite();
                ((YorkEditDialEventMessage) this.instance).setWeatherPage(value);
                return this;
            }

            private Builder() {
                super(YorkEditDialEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            YorkEditDialEventMessage yorkEditDialEventMessage = new YorkEditDialEventMessage();
            DEFAULT_INSTANCE = yorkEditDialEventMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkEditDialEventMessage.class, yorkEditDialEventMessage);
        }

        private YorkEditDialEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAirQualityPage() {
            this.bitField0_ &= -2049;
            this.airQualityPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPage() {
            this.bitField0_ &= -8193;
            this.alarmPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllDayHr() {
            this.bitField0_ &= -129;
            this.allDayHr_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryPage() {
            this.bitField0_ &= -17;
            this.batteryPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalPage() {
            this.bitField0_ &= -5;
            this.calPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalendarPage() {
            this.bitField0_ &= -16385;
            this.calendarPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDayPaiPage() {
            this.bitField0_ &= -33;
            this.dayPaiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventRemindPage() {
            this.bitField0_ &= -4097;
            this.eventRemindPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHourStepPage() {
            this.bitField0_ &= -65;
            this.hourStepPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHrPage() {
            this.bitField0_ &= -3;
            this.hrPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOtherWeatehrPage() {
            this.bitField0_ &= -1025;
            this.otherWeatehrPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiPage() {
            this.bitField0_ &= -9;
            this.paiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportPage() {
            this.bitField0_ &= -32769;
            this.sportPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStepIdPage() {
            this.bitField0_ &= -2;
            this.stepIdPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSunrisePage() {
            this.bitField0_ &= -513;
            this.sunrisePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherPage() {
            this.bitField0_ &= -257;
            this.weatherPage_ = 0;
        }

        public static YorkEditDialEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkEditDialEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkEditDialEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkEditDialEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAirQualityPage(int value) {
            this.bitField0_ |= 2048;
            this.airQualityPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPage(int value) {
            this.bitField0_ |= 8192;
            this.alarmPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllDayHr(int value) {
            this.bitField0_ |= 128;
            this.allDayHr_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryPage(int value) {
            this.bitField0_ |= 16;
            this.batteryPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalPage(int value) {
            this.bitField0_ |= 4;
            this.calPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalendarPage(int value) {
            this.bitField0_ |= 16384;
            this.calendarPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDayPaiPage(int value) {
            this.bitField0_ |= 32;
            this.dayPaiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventRemindPage(int value) {
            this.bitField0_ |= 4096;
            this.eventRemindPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHourStepPage(int value) {
            this.bitField0_ |= 64;
            this.hourStepPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrPage(int value) {
            this.bitField0_ |= 2;
            this.hrPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOtherWeatehrPage(int value) {
            this.bitField0_ |= 1024;
            this.otherWeatehrPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiPage(int value) {
            this.bitField0_ |= 8;
            this.paiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage(int value) {
            this.bitField0_ |= 32768;
            this.sportPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStepIdPage(int value) {
            this.bitField0_ |= 1;
            this.stepIdPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSunrisePage(int value) {
            this.bitField0_ |= 512;
            this.sunrisePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherPage(int value) {
            this.bitField0_ |= 256;
            this.weatherPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkEditDialEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0010\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f", new Object[]{"bitField0_", "stepIdPage_", "hrPage_", "calPage_", "paiPage_", "batteryPage_", "dayPaiPage_", "hourStepPage_", "allDayHr_", "weatherPage_", "sunrisePage_", "otherWeatehrPage_", "airQualityPage_", "eventRemindPage_", "alarmPage_", "calendarPage_", "sportPage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkEditDialEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkEditDialEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getAirQualityPage() {
            return this.airQualityPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getAllDayHr() {
            return this.allDayHr_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getBatteryPage() {
            return this.batteryPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getCalPage() {
            return this.calPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getCalendarPage() {
            return this.calendarPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getDayPaiPage() {
            return this.dayPaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getEventRemindPage() {
            return this.eventRemindPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getHourStepPage() {
            return this.hourStepPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getHrPage() {
            return this.hrPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getOtherWeatehrPage() {
            return this.otherWeatehrPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getPaiPage() {
            return this.paiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getSportPage() {
            return this.sportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getStepIdPage() {
            return this.stepIdPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getSunrisePage() {
            return this.sunrisePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasAirQualityPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasAllDayHr() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasBatteryPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasCalPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasCalendarPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasDayPaiPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasEventRemindPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasHourStepPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasHrPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasOtherWeatehrPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasPaiPage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasSportPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasStepIdPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasSunrisePage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkEditDialEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 256) != 0;
        }

        public static Builder newBuilder(YorkEditDialEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkEditDialEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkEditDialEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkEditDialEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkEditDialEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkEditDialEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkEditDialEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkEditDialEventMessage parseFrom(InputStream input) throws IOException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkEditDialEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkEditDialEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkEditDialEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkEditDialEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkEditDialEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAirQualityPage();

        int getAlarmPage();

        int getAllDayHr();

        int getBatteryPage();

        int getCalPage();

        int getCalendarPage();

        int getDayPaiPage();

        int getEventRemindPage();

        int getHourStepPage();

        int getHrPage();

        int getOtherWeatehrPage();

        int getPaiPage();

        int getSportPage();

        int getStepIdPage();

        int getSunrisePage();

        int getWeatherPage();

        boolean hasAirQualityPage();

        boolean hasAlarmPage();

        boolean hasAllDayHr();

        boolean hasBatteryPage();

        boolean hasCalPage();

        boolean hasCalendarPage();

        boolean hasDayPaiPage();

        boolean hasEventRemindPage();

        boolean hasHourStepPage();

        boolean hasHrPage();

        boolean hasOtherWeatehrPage();

        boolean hasPaiPage();

        boolean hasSportPage();

        boolean hasStepIdPage();

        boolean hasSunrisePage();

        boolean hasWeatherPage();
    }

    public static final class YorkLcdEventMessage extends GeneratedMessageLite<YorkLcdEventMessage, Builder> implements YorkLcdEventMessageOrBuilder {
        private static final YorkLcdEventMessage DEFAULT_INSTANCE;
        public static final int LCDONBECAUSEOFEVENT_FIELD_NUMBER = 2;
        public static final int LCDONBECAUSEOFNOTIFY_FIELD_NUMBER = 3;
        public static final int LCDONBECAUSEOFPRESS_FIELD_NUMBER = 1;
        private static volatile Parser<YorkLcdEventMessage> PARSER;
        private int bitField0_;
        private int lcdOnBecauseOfEvent_;
        private int lcdOnBecauseOfNotify_;
        private int lcdOnBecauseOfPress_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkLcdEventMessage, Builder> implements YorkLcdEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearLcdOnBecauseOfEvent() {
                copyOnWrite();
                ((YorkLcdEventMessage) this.instance).clearLcdOnBecauseOfEvent();
                return this;
            }

            public Builder clearLcdOnBecauseOfNotify() {
                copyOnWrite();
                ((YorkLcdEventMessage) this.instance).clearLcdOnBecauseOfNotify();
                return this;
            }

            public Builder clearLcdOnBecauseOfPress() {
                copyOnWrite();
                ((YorkLcdEventMessage) this.instance).clearLcdOnBecauseOfPress();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
            public int getLcdOnBecauseOfEvent() {
                return ((YorkLcdEventMessage) this.instance).getLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
            public int getLcdOnBecauseOfNotify() {
                return ((YorkLcdEventMessage) this.instance).getLcdOnBecauseOfNotify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
            public int getLcdOnBecauseOfPress() {
                return ((YorkLcdEventMessage) this.instance).getLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfEvent() {
                return ((YorkLcdEventMessage) this.instance).hasLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfNotify() {
                return ((YorkLcdEventMessage) this.instance).hasLcdOnBecauseOfNotify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfPress() {
                return ((YorkLcdEventMessage) this.instance).hasLcdOnBecauseOfPress();
            }

            public Builder setLcdOnBecauseOfEvent(int value) {
                copyOnWrite();
                ((YorkLcdEventMessage) this.instance).setLcdOnBecauseOfEvent(value);
                return this;
            }

            public Builder setLcdOnBecauseOfNotify(int value) {
                copyOnWrite();
                ((YorkLcdEventMessage) this.instance).setLcdOnBecauseOfNotify(value);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int value) {
                copyOnWrite();
                ((YorkLcdEventMessage) this.instance).setLcdOnBecauseOfPress(value);
                return this;
            }

            private Builder() {
                super(YorkLcdEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            YorkLcdEventMessage yorkLcdEventMessage = new YorkLcdEventMessage();
            DEFAULT_INSTANCE = yorkLcdEventMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkLcdEventMessage.class, yorkLcdEventMessage);
        }

        private YorkLcdEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfEvent() {
            this.bitField0_ &= -3;
            this.lcdOnBecauseOfEvent_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfNotify() {
            this.bitField0_ &= -5;
            this.lcdOnBecauseOfNotify_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfPress() {
            this.bitField0_ &= -2;
            this.lcdOnBecauseOfPress_ = 0;
        }

        public static YorkLcdEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkLcdEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkLcdEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkLcdEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfEvent(int value) {
            this.bitField0_ |= 2;
            this.lcdOnBecauseOfEvent_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfNotify(int value) {
            this.bitField0_ |= 4;
            this.lcdOnBecauseOfNotify_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfPress(int value) {
            this.bitField0_ |= 1;
            this.lcdOnBecauseOfPress_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkLcdEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "lcdOnBecauseOfNotify_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkLcdEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkLcdEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
        public int getLcdOnBecauseOfEvent() {
            return this.lcdOnBecauseOfEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
        public int getLcdOnBecauseOfNotify() {
            return this.lcdOnBecauseOfNotify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
        public int getLcdOnBecauseOfPress() {
            return this.lcdOnBecauseOfPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfEvent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfNotify() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkLcdEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfPress() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(YorkLcdEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkLcdEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkLcdEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkLcdEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkLcdEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkLcdEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkLcdEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkLcdEventMessage parseFrom(InputStream input) throws IOException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkLcdEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkLcdEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkLcdEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkLcdEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkLcdEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getLcdOnBecauseOfEvent();

        int getLcdOnBecauseOfNotify();

        int getLcdOnBecauseOfPress();

        boolean hasLcdOnBecauseOfEvent();

        boolean hasLcdOnBecauseOfNotify();

        boolean hasLcdOnBecauseOfPress();
    }

    public static final class YorkMenuEventMessage extends GeneratedMessageLite<YorkMenuEventMessage, Builder> implements YorkMenuEventMessageOrBuilder {
        public static final int ALARMPAGE_FIELD_NUMBER = 14;
        public static final int ALIPAYPAGE_FIELD_NUMBER = 20;
        public static final int BLOODOXYGENPAGE_FIELD_NUMBER = 25;
        public static final int BREATHEPAGE_FIELD_NUMBER = 6;
        public static final int CALENDERPAGE_FIELD_NUMBER = 22;
        public static final int CAMERAPAGE_FIELD_NUMBER = 15;
        public static final int COUNTDOWNPAGE_FIELD_NUMBER = 17;
        private static final YorkMenuEventMessage DEFAULT_INSTANCE;
        public static final int DIALPAGE_FIELD_NUMBER = 23;
        public static final int EVENTREMINDPAGE_FIELD_NUMBER = 8;
        public static final int FINDPHONEPAGE_FIELD_NUMBER = 18;
        public static final int HEARTPAGE_FIELD_NUMBER = 2;
        public static final int MOREPAGE_FIELD_NUMBER = 12;
        public static final int MUSICPAGECOUNT_FIELD_NUMBER = 16;
        public static final int NFCPAGE_FIELD_NUMBER = 11;
        public static final int NOTIFYPAGE_FIELD_NUMBER = 4;
        public static final int PAIPAGE_FIELD_NUMBER = 3;
        private static volatile Parser<YorkMenuEventMessage> PARSER = null;
        public static final int PHONEMUTEPAGE_FIELD_NUMBER = 19;
        public static final int PRESSUREPAGE_FIELD_NUMBER = 5;
        public static final int SETTINGPAGE_FIELD_NUMBER = 24;
        public static final int SILENCEPAGE_FIELD_NUMBER = 13;
        public static final int SPORTPAGE_FIELD_NUMBER = 10;
        public static final int STATUSPAGE_FIELD_NUMBER = 1;
        public static final int WEATHERPAGE_FIELD_NUMBER = 9;
        public static final int WOMENHEALTHPAGE_FIELD_NUMBER = 7;
        public static final int WORLDTIMEPAGE_FIELD_NUMBER = 21;
        private int alarmPage_;
        private int alipayPage_;
        private int bitField0_;
        private int bloodoxygenPage_;
        private int breathePage_;
        private int calenderPage_;
        private int cameraPage_;
        private int countdownPage_;
        private int dialPage_;
        private int eventRemindPage_;
        private int findphonePage_;
        private int heartPage_;
        private byte memoizedIsInitialized = 2;
        private int morePage_;
        private int musicPageCount_;
        private int nfcPage_;
        private int notifyPage_;
        private int paiPage_;
        private int phonemutePage_;
        private int pressurePage_;
        private int settingPage_;
        private int silencePage_;
        private int sportPage_;
        private int statusPage_;
        private int weatherPage_;
        private int womenHealthPage_;
        private int worldTimePage_;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkMenuEventMessage, Builder> implements YorkMenuEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlipayPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearAlipayPage();
                return this;
            }

            public Builder clearBloodoxygenPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearBloodoxygenPage();
                return this;
            }

            public Builder clearBreathePage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearBreathePage();
                return this;
            }

            public Builder clearCalenderPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearCalenderPage();
                return this;
            }

            public Builder clearCameraPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearCameraPage();
                return this;
            }

            public Builder clearCountdownPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearCountdownPage();
                return this;
            }

            public Builder clearDialPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearDialPage();
                return this;
            }

            public Builder clearEventRemindPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearEventRemindPage();
                return this;
            }

            public Builder clearFindphonePage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearFindphonePage();
                return this;
            }

            public Builder clearHeartPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearHeartPage();
                return this;
            }

            public Builder clearMorePage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearMorePage();
                return this;
            }

            public Builder clearMusicPageCount() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearMusicPageCount();
                return this;
            }

            public Builder clearNfcPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearNfcPage();
                return this;
            }

            public Builder clearNotifyPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearNotifyPage();
                return this;
            }

            public Builder clearPaiPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearPaiPage();
                return this;
            }

            public Builder clearPhonemutePage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearPhonemutePage();
                return this;
            }

            public Builder clearPressurePage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearPressurePage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSilencePage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearSilencePage();
                return this;
            }

            public Builder clearSportPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearSportPage();
                return this;
            }

            public Builder clearStatusPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearStatusPage();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            public Builder clearWomenHealthPage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearWomenHealthPage();
                return this;
            }

            public Builder clearWorldTimePage() {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).clearWorldTimePage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getAlarmPage() {
                return ((YorkMenuEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getAlipayPage() {
                return ((YorkMenuEventMessage) this.instance).getAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getBloodoxygenPage() {
                return ((YorkMenuEventMessage) this.instance).getBloodoxygenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getBreathePage() {
                return ((YorkMenuEventMessage) this.instance).getBreathePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getCalenderPage() {
                return ((YorkMenuEventMessage) this.instance).getCalenderPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getCameraPage() {
                return ((YorkMenuEventMessage) this.instance).getCameraPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getCountdownPage() {
                return ((YorkMenuEventMessage) this.instance).getCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getDialPage() {
                return ((YorkMenuEventMessage) this.instance).getDialPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getEventRemindPage() {
                return ((YorkMenuEventMessage) this.instance).getEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getFindphonePage() {
                return ((YorkMenuEventMessage) this.instance).getFindphonePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getHeartPage() {
                return ((YorkMenuEventMessage) this.instance).getHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getMorePage() {
                return ((YorkMenuEventMessage) this.instance).getMorePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getMusicPageCount() {
                return ((YorkMenuEventMessage) this.instance).getMusicPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getNfcPage() {
                return ((YorkMenuEventMessage) this.instance).getNfcPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getNotifyPage() {
                return ((YorkMenuEventMessage) this.instance).getNotifyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getPaiPage() {
                return ((YorkMenuEventMessage) this.instance).getPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getPhonemutePage() {
                return ((YorkMenuEventMessage) this.instance).getPhonemutePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getPressurePage() {
                return ((YorkMenuEventMessage) this.instance).getPressurePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getSettingPage() {
                return ((YorkMenuEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getSilencePage() {
                return ((YorkMenuEventMessage) this.instance).getSilencePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getSportPage() {
                return ((YorkMenuEventMessage) this.instance).getSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getStatusPage() {
                return ((YorkMenuEventMessage) this.instance).getStatusPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getWeatherPage() {
                return ((YorkMenuEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getWomenHealthPage() {
                return ((YorkMenuEventMessage) this.instance).getWomenHealthPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public int getWorldTimePage() {
                return ((YorkMenuEventMessage) this.instance).getWorldTimePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((YorkMenuEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasAlipayPage() {
                return ((YorkMenuEventMessage) this.instance).hasAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasBloodoxygenPage() {
                return ((YorkMenuEventMessage) this.instance).hasBloodoxygenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasBreathePage() {
                return ((YorkMenuEventMessage) this.instance).hasBreathePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasCalenderPage() {
                return ((YorkMenuEventMessage) this.instance).hasCalenderPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasCameraPage() {
                return ((YorkMenuEventMessage) this.instance).hasCameraPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasCountdownPage() {
                return ((YorkMenuEventMessage) this.instance).hasCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasDialPage() {
                return ((YorkMenuEventMessage) this.instance).hasDialPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasEventRemindPage() {
                return ((YorkMenuEventMessage) this.instance).hasEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasFindphonePage() {
                return ((YorkMenuEventMessage) this.instance).hasFindphonePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasHeartPage() {
                return ((YorkMenuEventMessage) this.instance).hasHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasMorePage() {
                return ((YorkMenuEventMessage) this.instance).hasMorePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasMusicPageCount() {
                return ((YorkMenuEventMessage) this.instance).hasMusicPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasNfcPage() {
                return ((YorkMenuEventMessage) this.instance).hasNfcPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasNotifyPage() {
                return ((YorkMenuEventMessage) this.instance).hasNotifyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasPaiPage() {
                return ((YorkMenuEventMessage) this.instance).hasPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasPhonemutePage() {
                return ((YorkMenuEventMessage) this.instance).hasPhonemutePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasPressurePage() {
                return ((YorkMenuEventMessage) this.instance).hasPressurePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((YorkMenuEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasSilencePage() {
                return ((YorkMenuEventMessage) this.instance).hasSilencePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasSportPage() {
                return ((YorkMenuEventMessage) this.instance).hasSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasStatusPage() {
                return ((YorkMenuEventMessage) this.instance).hasStatusPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((YorkMenuEventMessage) this.instance).hasWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasWomenHealthPage() {
                return ((YorkMenuEventMessage) this.instance).hasWomenHealthPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
            public boolean hasWorldTimePage() {
                return ((YorkMenuEventMessage) this.instance).hasWorldTimePage();
            }

            public Builder setAlarmPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setAlarmPage(value);
                return this;
            }

            public Builder setAlipayPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setAlipayPage(value);
                return this;
            }

            public Builder setBloodoxygenPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setBloodoxygenPage(value);
                return this;
            }

            public Builder setBreathePage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setBreathePage(value);
                return this;
            }

            public Builder setCalenderPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setCalenderPage(value);
                return this;
            }

            public Builder setCameraPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setCameraPage(value);
                return this;
            }

            public Builder setCountdownPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setCountdownPage(value);
                return this;
            }

            public Builder setDialPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setDialPage(value);
                return this;
            }

            public Builder setEventRemindPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setEventRemindPage(value);
                return this;
            }

            public Builder setFindphonePage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setFindphonePage(value);
                return this;
            }

            public Builder setHeartPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setHeartPage(value);
                return this;
            }

            public Builder setMorePage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setMorePage(value);
                return this;
            }

            public Builder setMusicPageCount(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setMusicPageCount(value);
                return this;
            }

            public Builder setNfcPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setNfcPage(value);
                return this;
            }

            public Builder setNotifyPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setNotifyPage(value);
                return this;
            }

            public Builder setPaiPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setPaiPage(value);
                return this;
            }

            public Builder setPhonemutePage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setPhonemutePage(value);
                return this;
            }

            public Builder setPressurePage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setPressurePage(value);
                return this;
            }

            public Builder setSettingPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setSettingPage(value);
                return this;
            }

            public Builder setSilencePage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setSilencePage(value);
                return this;
            }

            public Builder setSportPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setSportPage(value);
                return this;
            }

            public Builder setStatusPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setStatusPage(value);
                return this;
            }

            public Builder setWeatherPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setWeatherPage(value);
                return this;
            }

            public Builder setWomenHealthPage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setWomenHealthPage(value);
                return this;
            }

            public Builder setWorldTimePage(int value) {
                copyOnWrite();
                ((YorkMenuEventMessage) this.instance).setWorldTimePage(value);
                return this;
            }

            private Builder() {
                super(YorkMenuEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            YorkMenuEventMessage yorkMenuEventMessage = new YorkMenuEventMessage();
            DEFAULT_INSTANCE = yorkMenuEventMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkMenuEventMessage.class, yorkMenuEventMessage);
        }

        private YorkMenuEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPage() {
            this.bitField0_ &= -8193;
            this.alarmPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayPage() {
            this.bitField0_ &= -524289;
            this.alipayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBloodoxygenPage() {
            this.bitField0_ &= -16777217;
            this.bloodoxygenPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreathePage() {
            this.bitField0_ &= -33;
            this.breathePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalenderPage() {
            this.bitField0_ &= -2097153;
            this.calenderPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraPage() {
            this.bitField0_ &= -16385;
            this.cameraPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountdownPage() {
            this.bitField0_ &= -65537;
            this.countdownPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialPage() {
            this.bitField0_ &= -4194305;
            this.dialPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventRemindPage() {
            this.bitField0_ &= -129;
            this.eventRemindPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindphonePage() {
            this.bitField0_ &= -131073;
            this.findphonePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartPage() {
            this.bitField0_ &= -3;
            this.heartPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMorePage() {
            this.bitField0_ &= -2049;
            this.morePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicPageCount() {
            this.bitField0_ &= -32769;
            this.musicPageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNfcPage() {
            this.bitField0_ &= -1025;
            this.nfcPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyPage() {
            this.bitField0_ &= -9;
            this.notifyPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiPage() {
            this.bitField0_ &= -5;
            this.paiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhonemutePage() {
            this.bitField0_ &= -262145;
            this.phonemutePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPressurePage() {
            this.bitField0_ &= -17;
            this.pressurePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingPage() {
            this.bitField0_ &= -8388609;
            this.settingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilencePage() {
            this.bitField0_ &= -4097;
            this.silencePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportPage() {
            this.bitField0_ &= -513;
            this.sportPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusPage() {
            this.bitField0_ &= -2;
            this.statusPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherPage() {
            this.bitField0_ &= -257;
            this.weatherPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWomenHealthPage() {
            this.bitField0_ &= -65;
            this.womenHealthPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWorldTimePage() {
            this.bitField0_ &= -1048577;
            this.worldTimePage_ = 0;
        }

        public static YorkMenuEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkMenuEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkMenuEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkMenuEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPage(int value) {
            this.bitField0_ |= 8192;
            this.alarmPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayPage(int value) {
            this.bitField0_ |= 524288;
            this.alipayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBloodoxygenPage(int value) {
            this.bitField0_ |= 16777216;
            this.bloodoxygenPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreathePage(int value) {
            this.bitField0_ |= 32;
            this.breathePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalenderPage(int value) {
            this.bitField0_ |= 2097152;
            this.calenderPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCameraPage(int value) {
            this.bitField0_ |= 16384;
            this.cameraPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownPage(int value) {
            this.bitField0_ |= 65536;
            this.countdownPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialPage(int value) {
            this.bitField0_ |= 4194304;
            this.dialPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventRemindPage(int value) {
            this.bitField0_ |= 128;
            this.eventRemindPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindphonePage(int value) {
            this.bitField0_ |= 131072;
            this.findphonePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartPage(int value) {
            this.bitField0_ |= 2;
            this.heartPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMorePage(int value) {
            this.bitField0_ |= 2048;
            this.morePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicPageCount(int value) {
            this.bitField0_ |= 32768;
            this.musicPageCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfcPage(int value) {
            this.bitField0_ |= 1024;
            this.nfcPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyPage(int value) {
            this.bitField0_ |= 8;
            this.notifyPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiPage(int value) {
            this.bitField0_ |= 4;
            this.paiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhonemutePage(int value) {
            this.bitField0_ |= 262144;
            this.phonemutePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressurePage(int value) {
            this.bitField0_ |= 16;
            this.pressurePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingPage(int value) {
            this.bitField0_ |= 8388608;
            this.settingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilencePage(int value) {
            this.bitField0_ |= 4096;
            this.silencePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage(int value) {
            this.bitField0_ |= 512;
            this.sportPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage(int value) {
            this.bitField0_ |= 1;
            this.statusPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherPage(int value) {
            this.bitField0_ |= 256;
            this.weatherPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWomenHealthPage(int value) {
            this.bitField0_ |= 64;
            this.womenHealthPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWorldTimePage(int value) {
            this.bitField0_ |= 1048576;
            this.worldTimePage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkMenuEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0000\u0019\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018", new Object[]{"bitField0_", "statusPage_", "heartPage_", "paiPage_", "notifyPage_", "pressurePage_", "breathePage_", "womenHealthPage_", "eventRemindPage_", "weatherPage_", "sportPage_", "nfcPage_", "morePage_", "silencePage_", "alarmPage_", "cameraPage_", "musicPageCount_", "countdownPage_", "findphonePage_", "phonemutePage_", "alipayPage_", "worldTimePage_", "calenderPage_", "dialPage_", "settingPage_", "bloodoxygenPage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkMenuEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkMenuEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getAlipayPage() {
            return this.alipayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getBloodoxygenPage() {
            return this.bloodoxygenPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getBreathePage() {
            return this.breathePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getCalenderPage() {
            return this.calenderPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getCameraPage() {
            return this.cameraPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getCountdownPage() {
            return this.countdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getDialPage() {
            return this.dialPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getEventRemindPage() {
            return this.eventRemindPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getFindphonePage() {
            return this.findphonePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getHeartPage() {
            return this.heartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getMorePage() {
            return this.morePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getMusicPageCount() {
            return this.musicPageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getNfcPage() {
            return this.nfcPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getNotifyPage() {
            return this.notifyPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getPaiPage() {
            return this.paiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getPhonemutePage() {
            return this.phonemutePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getPressurePage() {
            return this.pressurePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getSilencePage() {
            return this.silencePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getSportPage() {
            return this.sportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getStatusPage() {
            return this.statusPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getWomenHealthPage() {
            return this.womenHealthPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public int getWorldTimePage() {
            return this.worldTimePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasAlipayPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasBloodoxygenPage() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasBreathePage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasCalenderPage() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasCameraPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasCountdownPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasDialPage() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasEventRemindPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasFindphonePage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasHeartPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasMorePage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasMusicPageCount() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasNfcPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasNotifyPage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasPaiPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasPhonemutePage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasPressurePage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasSilencePage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasSportPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasStatusPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasWomenHealthPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMenuEventMessageOrBuilder
        public boolean hasWorldTimePage() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public static Builder newBuilder(YorkMenuEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkMenuEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkMenuEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkMenuEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkMenuEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkMenuEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkMenuEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkMenuEventMessage parseFrom(InputStream input) throws IOException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkMenuEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkMenuEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkMenuEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkMenuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkMenuEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmPage();

        int getAlipayPage();

        int getBloodoxygenPage();

        int getBreathePage();

        int getCalenderPage();

        int getCameraPage();

        int getCountdownPage();

        int getDialPage();

        int getEventRemindPage();

        int getFindphonePage();

        int getHeartPage();

        int getMorePage();

        int getMusicPageCount();

        int getNfcPage();

        int getNotifyPage();

        int getPaiPage();

        int getPhonemutePage();

        int getPressurePage();

        int getSettingPage();

        int getSilencePage();

        int getSportPage();

        int getStatusPage();

        int getWeatherPage();

        int getWomenHealthPage();

        int getWorldTimePage();

        boolean hasAlarmPage();

        boolean hasAlipayPage();

        boolean hasBloodoxygenPage();

        boolean hasBreathePage();

        boolean hasCalenderPage();

        boolean hasCameraPage();

        boolean hasCountdownPage();

        boolean hasDialPage();

        boolean hasEventRemindPage();

        boolean hasFindphonePage();

        boolean hasHeartPage();

        boolean hasMorePage();

        boolean hasMusicPageCount();

        boolean hasNfcPage();

        boolean hasNotifyPage();

        boolean hasPaiPage();

        boolean hasPhonemutePage();

        boolean hasPressurePage();

        boolean hasSettingPage();

        boolean hasSilencePage();

        boolean hasSportPage();

        boolean hasStatusPage();

        boolean hasWeatherPage();

        boolean hasWomenHealthPage();

        boolean hasWorldTimePage();
    }

    public static final class YorkMoreEventMessage extends GeneratedMessageLite<YorkMoreEventMessage, Builder> implements YorkMoreEventMessageOrBuilder {
        public static final int ALARMCLOSEPAGE_FIELD_NUMBER = 4;
        public static final int ALARMCREATEBYAPPPAGE_FIELD_NUMBER = 3;
        public static final int ALARMCREATEBYXIAOAIPAGE_FIELD_NUMBER = 2;
        public static final int ALARMOPENPAGE_FIELD_NUMBER = 1;
        public static final int ALIPAYBINDPAGE_FIELD_NUMBER = 16;
        public static final int AUTOCLOSELCDPAGE_FIELD_NUMBER = 20;
        public static final int BRIGHTPAGE_FIELD_NUMBER = 19;
        private static final YorkMoreEventMessage DEFAULT_INSTANCE;
        public static final int EVENTCREATEBYAPPPAGE_FIELD_NUMBER = 6;
        public static final int EVENTCREATEBYXIAOAIPAGE_FIELD_NUMBER = 5;
        public static final int LOOKSCREENCLOASEPAGE_FIELD_NUMBER = 18;
        public static final int LOOKSCREENOPENPAGE_FIELD_NUMBER = 17;
        public static final int MUSICCONTROLPAUSEPAGE1_FIELD_NUMBER = 10;
        public static final int MUSICCONTROLPAUSEPAGE2_FIELD_NUMBER = 13;
        public static final int MUSICCONTROLPRENEXTPAGE1_FIELD_NUMBER = 9;
        public static final int MUSICCONTROLPRENEXTPAGE2_FIELD_NUMBER = 12;
        public static final int MUSICCONTROLVOLUMEPAGE1_FIELD_NUMBER = 8;
        public static final int MUSICCONTROLVOLUMEPAGE2_FIELD_NUMBER = 11;
        public static final int MUTECLOSEPAGE_FIELD_NUMBER = 15;
        public static final int MUTEOPENPAGE_FIELD_NUMBER = 14;
        private static volatile Parser<YorkMoreEventMessage> PARSER = null;
        public static final int SHORTCUTPAGE_FIELD_NUMBER = 21;
        public static final int TAKEPHOTOSPAGE_FIELD_NUMBER = 7;
        private int alarmClosePage_;
        private int alarmCreateByAppPage_;
        private int alarmCreateByXiaoaiPage_;
        private int alarmOpenPage_;
        private int alipayBindPage_;
        private int autoCloseLcdPage_;
        private int bitField0_;
        private int brightPage_;
        private int eventCreateByAppPage_;
        private int eventCreateByXiaoaiPage_;
        private int lookScreenCloasePage_;
        private int lookScreenOpenPage_;
        private byte memoizedIsInitialized = 2;
        private int musicControlPausePage1_;
        private int musicControlPausePage2_;
        private int musicControlPreNextPage1_;
        private int musicControlPreNextPage2_;
        private int musicControlVolumePage1_;
        private int musicControlVolumePage2_;
        private int muteClosePage_;
        private int muteOpenPage_;
        private int shortcutPage_;
        private int takePhotosPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkMoreEventMessage, Builder> implements YorkMoreEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmClosePage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearAlarmClosePage();
                return this;
            }

            public Builder clearAlarmCreateByAppPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearAlarmCreateByAppPage();
                return this;
            }

            public Builder clearAlarmCreateByXiaoaiPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearAlarmCreateByXiaoaiPage();
                return this;
            }

            public Builder clearAlarmOpenPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearAlarmOpenPage();
                return this;
            }

            public Builder clearAlipayBindPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearAlipayBindPage();
                return this;
            }

            public Builder clearAutoCloseLcdPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearAutoCloseLcdPage();
                return this;
            }

            public Builder clearBrightPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearBrightPage();
                return this;
            }

            public Builder clearEventCreateByAppPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearEventCreateByAppPage();
                return this;
            }

            public Builder clearEventCreateByXiaoaiPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearEventCreateByXiaoaiPage();
                return this;
            }

            public Builder clearLookScreenCloasePage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearLookScreenCloasePage();
                return this;
            }

            public Builder clearLookScreenOpenPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearLookScreenOpenPage();
                return this;
            }

            public Builder clearMusicControlPausePage1() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearMusicControlPausePage1();
                return this;
            }

            public Builder clearMusicControlPausePage2() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearMusicControlPausePage2();
                return this;
            }

            public Builder clearMusicControlPreNextPage1() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearMusicControlPreNextPage1();
                return this;
            }

            public Builder clearMusicControlPreNextPage2() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearMusicControlPreNextPage2();
                return this;
            }

            public Builder clearMusicControlVolumePage1() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearMusicControlVolumePage1();
                return this;
            }

            public Builder clearMusicControlVolumePage2() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearMusicControlVolumePage2();
                return this;
            }

            public Builder clearMuteClosePage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearMuteClosePage();
                return this;
            }

            public Builder clearMuteOpenPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearMuteOpenPage();
                return this;
            }

            public Builder clearShortcutPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearShortcutPage();
                return this;
            }

            public Builder clearTakePhotosPage() {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).clearTakePhotosPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getAlarmClosePage() {
                return ((YorkMoreEventMessage) this.instance).getAlarmClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getAlarmCreateByAppPage() {
                return ((YorkMoreEventMessage) this.instance).getAlarmCreateByAppPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getAlarmCreateByXiaoaiPage() {
                return ((YorkMoreEventMessage) this.instance).getAlarmCreateByXiaoaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getAlarmOpenPage() {
                return ((YorkMoreEventMessage) this.instance).getAlarmOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getAlipayBindPage() {
                return ((YorkMoreEventMessage) this.instance).getAlipayBindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getAutoCloseLcdPage() {
                return ((YorkMoreEventMessage) this.instance).getAutoCloseLcdPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getBrightPage() {
                return ((YorkMoreEventMessage) this.instance).getBrightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getEventCreateByAppPage() {
                return ((YorkMoreEventMessage) this.instance).getEventCreateByAppPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getEventCreateByXiaoaiPage() {
                return ((YorkMoreEventMessage) this.instance).getEventCreateByXiaoaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getLookScreenCloasePage() {
                return ((YorkMoreEventMessage) this.instance).getLookScreenCloasePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getLookScreenOpenPage() {
                return ((YorkMoreEventMessage) this.instance).getLookScreenOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getMusicControlPausePage1() {
                return ((YorkMoreEventMessage) this.instance).getMusicControlPausePage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getMusicControlPausePage2() {
                return ((YorkMoreEventMessage) this.instance).getMusicControlPausePage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getMusicControlPreNextPage1() {
                return ((YorkMoreEventMessage) this.instance).getMusicControlPreNextPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getMusicControlPreNextPage2() {
                return ((YorkMoreEventMessage) this.instance).getMusicControlPreNextPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getMusicControlVolumePage1() {
                return ((YorkMoreEventMessage) this.instance).getMusicControlVolumePage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getMusicControlVolumePage2() {
                return ((YorkMoreEventMessage) this.instance).getMusicControlVolumePage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getMuteClosePage() {
                return ((YorkMoreEventMessage) this.instance).getMuteClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getMuteOpenPage() {
                return ((YorkMoreEventMessage) this.instance).getMuteOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getShortcutPage() {
                return ((YorkMoreEventMessage) this.instance).getShortcutPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public int getTakePhotosPage() {
                return ((YorkMoreEventMessage) this.instance).getTakePhotosPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasAlarmClosePage() {
                return ((YorkMoreEventMessage) this.instance).hasAlarmClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasAlarmCreateByAppPage() {
                return ((YorkMoreEventMessage) this.instance).hasAlarmCreateByAppPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasAlarmCreateByXiaoaiPage() {
                return ((YorkMoreEventMessage) this.instance).hasAlarmCreateByXiaoaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasAlarmOpenPage() {
                return ((YorkMoreEventMessage) this.instance).hasAlarmOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasAlipayBindPage() {
                return ((YorkMoreEventMessage) this.instance).hasAlipayBindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasAutoCloseLcdPage() {
                return ((YorkMoreEventMessage) this.instance).hasAutoCloseLcdPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasBrightPage() {
                return ((YorkMoreEventMessage) this.instance).hasBrightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasEventCreateByAppPage() {
                return ((YorkMoreEventMessage) this.instance).hasEventCreateByAppPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasEventCreateByXiaoaiPage() {
                return ((YorkMoreEventMessage) this.instance).hasEventCreateByXiaoaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasLookScreenCloasePage() {
                return ((YorkMoreEventMessage) this.instance).hasLookScreenCloasePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasLookScreenOpenPage() {
                return ((YorkMoreEventMessage) this.instance).hasLookScreenOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasMusicControlPausePage1() {
                return ((YorkMoreEventMessage) this.instance).hasMusicControlPausePage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasMusicControlPausePage2() {
                return ((YorkMoreEventMessage) this.instance).hasMusicControlPausePage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasMusicControlPreNextPage1() {
                return ((YorkMoreEventMessage) this.instance).hasMusicControlPreNextPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasMusicControlPreNextPage2() {
                return ((YorkMoreEventMessage) this.instance).hasMusicControlPreNextPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasMusicControlVolumePage1() {
                return ((YorkMoreEventMessage) this.instance).hasMusicControlVolumePage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasMusicControlVolumePage2() {
                return ((YorkMoreEventMessage) this.instance).hasMusicControlVolumePage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasMuteClosePage() {
                return ((YorkMoreEventMessage) this.instance).hasMuteClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasMuteOpenPage() {
                return ((YorkMoreEventMessage) this.instance).hasMuteOpenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasShortcutPage() {
                return ((YorkMoreEventMessage) this.instance).hasShortcutPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
            public boolean hasTakePhotosPage() {
                return ((YorkMoreEventMessage) this.instance).hasTakePhotosPage();
            }

            public Builder setAlarmClosePage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setAlarmClosePage(value);
                return this;
            }

            public Builder setAlarmCreateByAppPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setAlarmCreateByAppPage(value);
                return this;
            }

            public Builder setAlarmCreateByXiaoaiPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setAlarmCreateByXiaoaiPage(value);
                return this;
            }

            public Builder setAlarmOpenPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setAlarmOpenPage(value);
                return this;
            }

            public Builder setAlipayBindPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setAlipayBindPage(value);
                return this;
            }

            public Builder setAutoCloseLcdPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setAutoCloseLcdPage(value);
                return this;
            }

            public Builder setBrightPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setBrightPage(value);
                return this;
            }

            public Builder setEventCreateByAppPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setEventCreateByAppPage(value);
                return this;
            }

            public Builder setEventCreateByXiaoaiPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setEventCreateByXiaoaiPage(value);
                return this;
            }

            public Builder setLookScreenCloasePage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setLookScreenCloasePage(value);
                return this;
            }

            public Builder setLookScreenOpenPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setLookScreenOpenPage(value);
                return this;
            }

            public Builder setMusicControlPausePage1(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setMusicControlPausePage1(value);
                return this;
            }

            public Builder setMusicControlPausePage2(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setMusicControlPausePage2(value);
                return this;
            }

            public Builder setMusicControlPreNextPage1(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setMusicControlPreNextPage1(value);
                return this;
            }

            public Builder setMusicControlPreNextPage2(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setMusicControlPreNextPage2(value);
                return this;
            }

            public Builder setMusicControlVolumePage1(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setMusicControlVolumePage1(value);
                return this;
            }

            public Builder setMusicControlVolumePage2(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setMusicControlVolumePage2(value);
                return this;
            }

            public Builder setMuteClosePage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setMuteClosePage(value);
                return this;
            }

            public Builder setMuteOpenPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setMuteOpenPage(value);
                return this;
            }

            public Builder setShortcutPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setShortcutPage(value);
                return this;
            }

            public Builder setTakePhotosPage(int value) {
                copyOnWrite();
                ((YorkMoreEventMessage) this.instance).setTakePhotosPage(value);
                return this;
            }

            private Builder() {
                super(YorkMoreEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            YorkMoreEventMessage yorkMoreEventMessage = new YorkMoreEventMessage();
            DEFAULT_INSTANCE = yorkMoreEventMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkMoreEventMessage.class, yorkMoreEventMessage);
        }

        private YorkMoreEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmClosePage() {
            this.bitField0_ &= -9;
            this.alarmClosePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmCreateByAppPage() {
            this.bitField0_ &= -5;
            this.alarmCreateByAppPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmCreateByXiaoaiPage() {
            this.bitField0_ &= -3;
            this.alarmCreateByXiaoaiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmOpenPage() {
            this.bitField0_ &= -2;
            this.alarmOpenPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBindPage() {
            this.bitField0_ &= -32769;
            this.alipayBindPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoCloseLcdPage() {
            this.bitField0_ &= -524289;
            this.autoCloseLcdPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBrightPage() {
            this.bitField0_ &= -262145;
            this.brightPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventCreateByAppPage() {
            this.bitField0_ &= -33;
            this.eventCreateByAppPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventCreateByXiaoaiPage() {
            this.bitField0_ &= -17;
            this.eventCreateByXiaoaiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLookScreenCloasePage() {
            this.bitField0_ &= -131073;
            this.lookScreenCloasePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLookScreenOpenPage() {
            this.bitField0_ &= -65537;
            this.lookScreenOpenPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlPausePage1() {
            this.bitField0_ &= -513;
            this.musicControlPausePage1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlPausePage2() {
            this.bitField0_ &= -4097;
            this.musicControlPausePage2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlPreNextPage1() {
            this.bitField0_ &= -257;
            this.musicControlPreNextPage1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlPreNextPage2() {
            this.bitField0_ &= -2049;
            this.musicControlPreNextPage2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlVolumePage1() {
            this.bitField0_ &= -129;
            this.musicControlVolumePage1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicControlVolumePage2() {
            this.bitField0_ &= -1025;
            this.musicControlVolumePage2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMuteClosePage() {
            this.bitField0_ &= -16385;
            this.muteClosePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMuteOpenPage() {
            this.bitField0_ &= -8193;
            this.muteOpenPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShortcutPage() {
            this.bitField0_ &= -1048577;
            this.shortcutPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTakePhotosPage() {
            this.bitField0_ &= -65;
            this.takePhotosPage_ = 0;
        }

        public static YorkMoreEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkMoreEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkMoreEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkMoreEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmClosePage(int value) {
            this.bitField0_ |= 8;
            this.alarmClosePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmCreateByAppPage(int value) {
            this.bitField0_ |= 4;
            this.alarmCreateByAppPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmCreateByXiaoaiPage(int value) {
            this.bitField0_ |= 2;
            this.alarmCreateByXiaoaiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOpenPage(int value) {
            this.bitField0_ |= 1;
            this.alarmOpenPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBindPage(int value) {
            this.bitField0_ |= 32768;
            this.alipayBindPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoCloseLcdPage(int value) {
            this.bitField0_ |= 524288;
            this.autoCloseLcdPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrightPage(int value) {
            this.bitField0_ |= 262144;
            this.brightPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventCreateByAppPage(int value) {
            this.bitField0_ |= 32;
            this.eventCreateByAppPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventCreateByXiaoaiPage(int value) {
            this.bitField0_ |= 16;
            this.eventCreateByXiaoaiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLookScreenCloasePage(int value) {
            this.bitField0_ |= 131072;
            this.lookScreenCloasePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLookScreenOpenPage(int value) {
            this.bitField0_ |= 65536;
            this.lookScreenOpenPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlPausePage1(int value) {
            this.bitField0_ |= 512;
            this.musicControlPausePage1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlPausePage2(int value) {
            this.bitField0_ |= 4096;
            this.musicControlPausePage2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlPreNextPage1(int value) {
            this.bitField0_ |= 256;
            this.musicControlPreNextPage1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlPreNextPage2(int value) {
            this.bitField0_ |= 2048;
            this.musicControlPreNextPage2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlVolumePage1(int value) {
            this.bitField0_ |= 128;
            this.musicControlVolumePage1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicControlVolumePage2(int value) {
            this.bitField0_ |= 1024;
            this.musicControlVolumePage2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMuteClosePage(int value) {
            this.bitField0_ |= 16384;
            this.muteClosePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMuteOpenPage(int value) {
            this.bitField0_ |= 8192;
            this.muteOpenPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutPage(int value) {
            this.bitField0_ |= 1048576;
            this.shortcutPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTakePhotosPage(int value) {
            this.bitField0_ |= 64;
            this.takePhotosPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkMoreEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0015\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014", new Object[]{"bitField0_", "alarmOpenPage_", "alarmCreateByXiaoaiPage_", "alarmCreateByAppPage_", "alarmClosePage_", "eventCreateByXiaoaiPage_", "eventCreateByAppPage_", "takePhotosPage_", "musicControlVolumePage1_", "musicControlPreNextPage1_", "musicControlPausePage1_", "musicControlVolumePage2_", "musicControlPreNextPage2_", "musicControlPausePage2_", "muteOpenPage_", "muteClosePage_", "alipayBindPage_", "lookScreenOpenPage_", "lookScreenCloasePage_", "brightPage_", "autoCloseLcdPage_", "shortcutPage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkMoreEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkMoreEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getAlarmClosePage() {
            return this.alarmClosePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getAlarmCreateByAppPage() {
            return this.alarmCreateByAppPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getAlarmCreateByXiaoaiPage() {
            return this.alarmCreateByXiaoaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getAlarmOpenPage() {
            return this.alarmOpenPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getAlipayBindPage() {
            return this.alipayBindPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getAutoCloseLcdPage() {
            return this.autoCloseLcdPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getBrightPage() {
            return this.brightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getEventCreateByAppPage() {
            return this.eventCreateByAppPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getEventCreateByXiaoaiPage() {
            return this.eventCreateByXiaoaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getLookScreenCloasePage() {
            return this.lookScreenCloasePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getLookScreenOpenPage() {
            return this.lookScreenOpenPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getMusicControlPausePage1() {
            return this.musicControlPausePage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getMusicControlPausePage2() {
            return this.musicControlPausePage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getMusicControlPreNextPage1() {
            return this.musicControlPreNextPage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getMusicControlPreNextPage2() {
            return this.musicControlPreNextPage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getMusicControlVolumePage1() {
            return this.musicControlVolumePage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getMusicControlVolumePage2() {
            return this.musicControlVolumePage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getMuteClosePage() {
            return this.muteClosePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getMuteOpenPage() {
            return this.muteOpenPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getShortcutPage() {
            return this.shortcutPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public int getTakePhotosPage() {
            return this.takePhotosPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasAlarmClosePage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasAlarmCreateByAppPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasAlarmCreateByXiaoaiPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasAlarmOpenPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasAlipayBindPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasAutoCloseLcdPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasBrightPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasEventCreateByAppPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasEventCreateByXiaoaiPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasLookScreenCloasePage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasLookScreenOpenPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasMusicControlPausePage1() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasMusicControlPausePage2() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasMusicControlPreNextPage1() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasMusicControlPreNextPage2() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasMusicControlVolumePage1() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasMusicControlVolumePage2() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasMuteClosePage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasMuteOpenPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasShortcutPage() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkMoreEventMessageOrBuilder
        public boolean hasTakePhotosPage() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(YorkMoreEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkMoreEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkMoreEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkMoreEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkMoreEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkMoreEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkMoreEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkMoreEventMessage parseFrom(InputStream input) throws IOException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkMoreEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkMoreEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkMoreEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkMoreEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkMoreEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmClosePage();

        int getAlarmCreateByAppPage();

        int getAlarmCreateByXiaoaiPage();

        int getAlarmOpenPage();

        int getAlipayBindPage();

        int getAutoCloseLcdPage();

        int getBrightPage();

        int getEventCreateByAppPage();

        int getEventCreateByXiaoaiPage();

        int getLookScreenCloasePage();

        int getLookScreenOpenPage();

        int getMusicControlPausePage1();

        int getMusicControlPausePage2();

        int getMusicControlPreNextPage1();

        int getMusicControlPreNextPage2();

        int getMusicControlVolumePage1();

        int getMusicControlVolumePage2();

        int getMuteClosePage();

        int getMuteOpenPage();

        int getShortcutPage();

        int getTakePhotosPage();

        boolean hasAlarmClosePage();

        boolean hasAlarmCreateByAppPage();

        boolean hasAlarmCreateByXiaoaiPage();

        boolean hasAlarmOpenPage();

        boolean hasAlipayBindPage();

        boolean hasAutoCloseLcdPage();

        boolean hasBrightPage();

        boolean hasEventCreateByAppPage();

        boolean hasEventCreateByXiaoaiPage();

        boolean hasLookScreenCloasePage();

        boolean hasLookScreenOpenPage();

        boolean hasMusicControlPausePage1();

        boolean hasMusicControlPausePage2();

        boolean hasMusicControlPreNextPage1();

        boolean hasMusicControlPreNextPage2();

        boolean hasMusicControlVolumePage1();

        boolean hasMusicControlVolumePage2();

        boolean hasMuteClosePage();

        boolean hasMuteOpenPage();

        boolean hasShortcutPage();

        boolean hasTakePhotosPage();
    }

    public static final class YorkNotifyEventMessage extends GeneratedMessageLite<YorkNotifyEventMessage, Builder> implements YorkNotifyEventMessageOrBuilder {
        public static final int ALARMONCLOSEPAGE_FIELD_NUMBER = 8;
        public static final int ALARMONLATERONPAGE_FIELD_NUMBER = 7;
        public static final int APPNOTIFYDISPALYPAGE_FIELD_NUMBER = 2;
        public static final int CALLINGPAGE_FIELD_NUMBER = 3;
        private static final YorkNotifyEventMessage DEFAULT_INSTANCE;
        public static final int EVENTREMINDPAGE_FIELD_NUMBER = 6;
        public static final int LINKDISCONPAGE_FIELD_NUMBER = 5;
        public static final int LONGSITEPAGE_FIELD_NUMBER = 4;
        public static final int NOTIFYDISPLAYPAGE_FIELD_NUMBER = 1;
        private static volatile Parser<YorkNotifyEventMessage> PARSER;
        private int alarmOnClosePage_;
        private int alarmOnLaterOnPage_;
        private int appNotifyDispalyPage_;
        private int bitField0_;
        private int callingPage_;
        private int eventRemindPage_;
        private int linkDisconpage_;
        private int longSitePage_;
        private byte memoizedIsInitialized = 2;
        private int notifyDisplayPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkNotifyEventMessage, Builder> implements YorkNotifyEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmOnClosePage() {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).clearAlarmOnClosePage();
                return this;
            }

            public Builder clearAlarmOnLaterOnPage() {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).clearAlarmOnLaterOnPage();
                return this;
            }

            public Builder clearAppNotifyDispalyPage() {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).clearAppNotifyDispalyPage();
                return this;
            }

            public Builder clearCallingPage() {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).clearCallingPage();
                return this;
            }

            public Builder clearEventRemindPage() {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).clearEventRemindPage();
                return this;
            }

            public Builder clearLinkDisconpage() {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).clearLinkDisconpage();
                return this;
            }

            public Builder clearLongSitePage() {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).clearLongSitePage();
                return this;
            }

            public Builder clearNotifyDisplayPage() {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).clearNotifyDisplayPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public int getAlarmOnClosePage() {
                return ((YorkNotifyEventMessage) this.instance).getAlarmOnClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public int getAlarmOnLaterOnPage() {
                return ((YorkNotifyEventMessage) this.instance).getAlarmOnLaterOnPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public int getAppNotifyDispalyPage() {
                return ((YorkNotifyEventMessage) this.instance).getAppNotifyDispalyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public int getCallingPage() {
                return ((YorkNotifyEventMessage) this.instance).getCallingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public int getEventRemindPage() {
                return ((YorkNotifyEventMessage) this.instance).getEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public int getLinkDisconpage() {
                return ((YorkNotifyEventMessage) this.instance).getLinkDisconpage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public int getLongSitePage() {
                return ((YorkNotifyEventMessage) this.instance).getLongSitePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public int getNotifyDisplayPage() {
                return ((YorkNotifyEventMessage) this.instance).getNotifyDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public boolean hasAlarmOnClosePage() {
                return ((YorkNotifyEventMessage) this.instance).hasAlarmOnClosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public boolean hasAlarmOnLaterOnPage() {
                return ((YorkNotifyEventMessage) this.instance).hasAlarmOnLaterOnPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public boolean hasAppNotifyDispalyPage() {
                return ((YorkNotifyEventMessage) this.instance).hasAppNotifyDispalyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public boolean hasCallingPage() {
                return ((YorkNotifyEventMessage) this.instance).hasCallingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public boolean hasEventRemindPage() {
                return ((YorkNotifyEventMessage) this.instance).hasEventRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public boolean hasLinkDisconpage() {
                return ((YorkNotifyEventMessage) this.instance).hasLinkDisconpage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public boolean hasLongSitePage() {
                return ((YorkNotifyEventMessage) this.instance).hasLongSitePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
            public boolean hasNotifyDisplayPage() {
                return ((YorkNotifyEventMessage) this.instance).hasNotifyDisplayPage();
            }

            public Builder setAlarmOnClosePage(int value) {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).setAlarmOnClosePage(value);
                return this;
            }

            public Builder setAlarmOnLaterOnPage(int value) {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).setAlarmOnLaterOnPage(value);
                return this;
            }

            public Builder setAppNotifyDispalyPage(int value) {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).setAppNotifyDispalyPage(value);
                return this;
            }

            public Builder setCallingPage(int value) {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).setCallingPage(value);
                return this;
            }

            public Builder setEventRemindPage(int value) {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).setEventRemindPage(value);
                return this;
            }

            public Builder setLinkDisconpage(int value) {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).setLinkDisconpage(value);
                return this;
            }

            public Builder setLongSitePage(int value) {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).setLongSitePage(value);
                return this;
            }

            public Builder setNotifyDisplayPage(int value) {
                copyOnWrite();
                ((YorkNotifyEventMessage) this.instance).setNotifyDisplayPage(value);
                return this;
            }

            private Builder() {
                super(YorkNotifyEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            YorkNotifyEventMessage yorkNotifyEventMessage = new YorkNotifyEventMessage();
            DEFAULT_INSTANCE = yorkNotifyEventMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkNotifyEventMessage.class, yorkNotifyEventMessage);
        }

        private YorkNotifyEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmOnClosePage() {
            this.bitField0_ &= -129;
            this.alarmOnClosePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmOnLaterOnPage() {
            this.bitField0_ &= -65;
            this.alarmOnLaterOnPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppNotifyDispalyPage() {
            this.bitField0_ &= -3;
            this.appNotifyDispalyPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallingPage() {
            this.bitField0_ &= -5;
            this.callingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventRemindPage() {
            this.bitField0_ &= -33;
            this.eventRemindPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinkDisconpage() {
            this.bitField0_ &= -17;
            this.linkDisconpage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongSitePage() {
            this.bitField0_ &= -9;
            this.longSitePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyDisplayPage() {
            this.bitField0_ &= -2;
            this.notifyDisplayPage_ = 0;
        }

        public static YorkNotifyEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkNotifyEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkNotifyEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkNotifyEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOnClosePage(int value) {
            this.bitField0_ |= 128;
            this.alarmOnClosePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOnLaterOnPage(int value) {
            this.bitField0_ |= 64;
            this.alarmOnLaterOnPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppNotifyDispalyPage(int value) {
            this.bitField0_ |= 2;
            this.appNotifyDispalyPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallingPage(int value) {
            this.bitField0_ |= 4;
            this.callingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventRemindPage(int value) {
            this.bitField0_ |= 32;
            this.eventRemindPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkDisconpage(int value) {
            this.bitField0_ |= 16;
            this.linkDisconpage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongSitePage(int value) {
            this.bitField0_ |= 8;
            this.longSitePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyDisplayPage(int value) {
            this.bitField0_ |= 1;
            this.notifyDisplayPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkNotifyEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\b\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007", new Object[]{"bitField0_", "notifyDisplayPage_", "appNotifyDispalyPage_", "callingPage_", "longSitePage_", "linkDisconpage_", "eventRemindPage_", "alarmOnLaterOnPage_", "alarmOnClosePage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkNotifyEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkNotifyEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public int getAlarmOnClosePage() {
            return this.alarmOnClosePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public int getAlarmOnLaterOnPage() {
            return this.alarmOnLaterOnPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public int getAppNotifyDispalyPage() {
            return this.appNotifyDispalyPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public int getCallingPage() {
            return this.callingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public int getEventRemindPage() {
            return this.eventRemindPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public int getLinkDisconpage() {
            return this.linkDisconpage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public int getLongSitePage() {
            return this.longSitePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public int getNotifyDisplayPage() {
            return this.notifyDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public boolean hasAlarmOnClosePage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public boolean hasAlarmOnLaterOnPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public boolean hasAppNotifyDispalyPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public boolean hasCallingPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public boolean hasEventRemindPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public boolean hasLinkDisconpage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public boolean hasLongSitePage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkNotifyEventMessageOrBuilder
        public boolean hasNotifyDisplayPage() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(YorkNotifyEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkNotifyEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkNotifyEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkNotifyEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkNotifyEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkNotifyEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkNotifyEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkNotifyEventMessage parseFrom(InputStream input) throws IOException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkNotifyEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkNotifyEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkNotifyEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkNotifyEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkNotifyEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmOnClosePage();

        int getAlarmOnLaterOnPage();

        int getAppNotifyDispalyPage();

        int getCallingPage();

        int getEventRemindPage();

        int getLinkDisconpage();

        int getLongSitePage();

        int getNotifyDisplayPage();

        boolean hasAlarmOnClosePage();

        boolean hasAlarmOnLaterOnPage();

        boolean hasAppNotifyDispalyPage();

        boolean hasCallingPage();

        boolean hasEventRemindPage();

        boolean hasLinkDisconpage();

        boolean hasLongSitePage();

        boolean hasNotifyDisplayPage();
    }

    public static final class YorkShortcutEventMessage extends GeneratedMessageLite<YorkShortcutEventMessage, Builder> implements YorkShortcutEventMessageOrBuilder {
        public static final int ALARMDISPLAYPAGE_FIELD_NUMBER = 15;
        public static final int ALIPAYBRDISPLAYPAGE_FIELD_NUMBER = 21;
        public static final int ALIPAYQRDISPLAYPAGE_FIELD_NUMBER = 22;
        public static final int BLOODOXYGENDISPLAYPAGE_FIELD_NUMBER = 25;
        public static final int BREATHEDISPLAYPAGE_FIELD_NUMBER = 9;
        public static final int CALENDARDISPLAYPAGE_FIELD_NUMBER = 24;
        public static final int CAMERADISPLAYPAGE_FIELD_NUMBER = 16;
        public static final int COUNTDOWNDISPLAYPAGE_FIELD_NUMBER = 18;
        private static final YorkShortcutEventMessage DEFAULT_INSTANCE;
        public static final int EVENTREMINDDISPLAYPAGE_FIELD_NUMBER = 11;
        public static final int FINDPHONEDISPLAYPAGE_FIELD_NUMBER = 19;
        public static final int HEARTDISPLAYPAGE_FIELD_NUMBER = 7;
        public static final int MUSICDISPLAYPAGE_FIELD_NUMBER = 4;
        public static final int NFCDISPLAYPAGE_FIELD_NUMBER = 13;
        public static final int NOTIFYDISPLAYPAGE_FIELD_NUMBER = 1;
        public static final int PAIDISPLAYPAGE_FIELD_NUMBER = 6;
        private static volatile Parser<YorkShortcutEventMessage> PARSER = null;
        public static final int PHONEMUTEDISPLAYPAGE_FIELD_NUMBER = 20;
        public static final int PRESSUREDISPLAYPAGE_FIELD_NUMBER = 8;
        public static final int SILENCEDISPLAYPAGE_FIELD_NUMBER = 14;
        public static final int SPORTDISPLAYPAGE_FIELD_NUMBER = 12;
        public static final int STATUSDISPLAYPAGE_FIELD_NUMBER = 5;
        public static final int STOPWATCHDISPLAYPAGE_FIELD_NUMBER = 17;
        public static final int WEATEHRDISPLAYPAGE_FIELD_NUMBER = 3;
        public static final int WOMENHEALTHDISPLAYPAGE_FIELD_NUMBER = 10;
        public static final int WORLDTIMEDISPLAYPAGE_FIELD_NUMBER = 23;
        public static final int XIAOAIDISPLAYPAGE_FIELD_NUMBER = 2;
        private int alarmDisplayPage_;
        private int alipayBrDisplayPage_;
        private int alipayQrDisplayPage_;
        private int bitField0_;
        private int bloodoxygenDisplayPage_;
        private int breatheDisplayPage_;
        private int calendarDisplayPage_;
        private int cameraDisplayPage_;
        private int countDownDisplayPage_;
        private int eventRemindDisplayPage_;
        private int findPhoneDisplayPage_;
        private int heartDisplayPage_;
        private byte memoizedIsInitialized = 2;
        private int musicDisplayPage_;
        private int nfcDisplayPage_;
        private int notifyDisplayPage_;
        private int paiDisplayPage_;
        private int phoneMuteDisplayPage_;
        private int pressureDisplayPage_;
        private int silenceDisplayPage_;
        private int sportDisplayPage_;
        private int statusDisplayPage_;
        private int stopWatchDisplayPage_;
        private int weatehrDisplayPage_;
        private int womenHealthDisplayPage_;
        private int worldTimeDisplayPage_;
        private int xiaoaiDisplayPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkShortcutEventMessage, Builder> implements YorkShortcutEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearAlarmDisplayPage();
                return this;
            }

            public Builder clearAlipayBrDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearAlipayBrDisplayPage();
                return this;
            }

            public Builder clearAlipayQrDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearAlipayQrDisplayPage();
                return this;
            }

            public Builder clearBloodoxygenDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearBloodoxygenDisplayPage();
                return this;
            }

            public Builder clearBreatheDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearBreatheDisplayPage();
                return this;
            }

            public Builder clearCalendarDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearCalendarDisplayPage();
                return this;
            }

            public Builder clearCameraDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearCameraDisplayPage();
                return this;
            }

            public Builder clearCountDownDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearCountDownDisplayPage();
                return this;
            }

            public Builder clearEventRemindDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearEventRemindDisplayPage();
                return this;
            }

            public Builder clearFindPhoneDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearFindPhoneDisplayPage();
                return this;
            }

            public Builder clearHeartDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearHeartDisplayPage();
                return this;
            }

            public Builder clearMusicDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearMusicDisplayPage();
                return this;
            }

            public Builder clearNfcDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearNfcDisplayPage();
                return this;
            }

            public Builder clearNotifyDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearNotifyDisplayPage();
                return this;
            }

            public Builder clearPaiDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearPaiDisplayPage();
                return this;
            }

            public Builder clearPhoneMuteDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearPhoneMuteDisplayPage();
                return this;
            }

            public Builder clearPressureDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearPressureDisplayPage();
                return this;
            }

            public Builder clearSilenceDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearSilenceDisplayPage();
                return this;
            }

            public Builder clearSportDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearSportDisplayPage();
                return this;
            }

            public Builder clearStatusDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearStatusDisplayPage();
                return this;
            }

            public Builder clearStopWatchDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearStopWatchDisplayPage();
                return this;
            }

            public Builder clearWeatehrDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearWeatehrDisplayPage();
                return this;
            }

            public Builder clearWomenHealthDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearWomenHealthDisplayPage();
                return this;
            }

            public Builder clearWorldTimeDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearWorldTimeDisplayPage();
                return this;
            }

            public Builder clearXiaoaiDisplayPage() {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).clearXiaoaiDisplayPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getAlarmDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getAlarmDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getAlipayBrDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getAlipayBrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getAlipayQrDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getAlipayQrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getBloodoxygenDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getBloodoxygenDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getBreatheDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getBreatheDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getCalendarDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getCalendarDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getCameraDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getCameraDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getCountDownDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getCountDownDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getEventRemindDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getEventRemindDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getFindPhoneDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getFindPhoneDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getHeartDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getHeartDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getMusicDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getMusicDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getNfcDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getNfcDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getNotifyDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getNotifyDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getPaiDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getPaiDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getPhoneMuteDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getPhoneMuteDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getPressureDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getPressureDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getSilenceDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getSilenceDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getSportDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getSportDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getStatusDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getStatusDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getStopWatchDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getStopWatchDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getWeatehrDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getWeatehrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getWomenHealthDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getWomenHealthDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getWorldTimeDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getWorldTimeDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public int getXiaoaiDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).getXiaoaiDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasAlarmDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasAlarmDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasAlipayBrDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasAlipayBrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasAlipayQrDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasAlipayQrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasBloodoxygenDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasBloodoxygenDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasBreatheDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasBreatheDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasCalendarDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasCalendarDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasCameraDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasCameraDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasCountDownDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasCountDownDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasEventRemindDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasEventRemindDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasFindPhoneDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasFindPhoneDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasHeartDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasHeartDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasMusicDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasMusicDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasNfcDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasNfcDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasNotifyDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasNotifyDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasPaiDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasPaiDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasPhoneMuteDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasPhoneMuteDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasPressureDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasPressureDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasSilenceDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasSilenceDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasSportDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasSportDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasStatusDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasStatusDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasStopWatchDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasStopWatchDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasWeatehrDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasWeatehrDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasWomenHealthDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasWomenHealthDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasWorldTimeDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasWorldTimeDisplayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
            public boolean hasXiaoaiDisplayPage() {
                return ((YorkShortcutEventMessage) this.instance).hasXiaoaiDisplayPage();
            }

            public Builder setAlarmDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setAlarmDisplayPage(value);
                return this;
            }

            public Builder setAlipayBrDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setAlipayBrDisplayPage(value);
                return this;
            }

            public Builder setAlipayQrDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setAlipayQrDisplayPage(value);
                return this;
            }

            public Builder setBloodoxygenDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setBloodoxygenDisplayPage(value);
                return this;
            }

            public Builder setBreatheDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setBreatheDisplayPage(value);
                return this;
            }

            public Builder setCalendarDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setCalendarDisplayPage(value);
                return this;
            }

            public Builder setCameraDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setCameraDisplayPage(value);
                return this;
            }

            public Builder setCountDownDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setCountDownDisplayPage(value);
                return this;
            }

            public Builder setEventRemindDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setEventRemindDisplayPage(value);
                return this;
            }

            public Builder setFindPhoneDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setFindPhoneDisplayPage(value);
                return this;
            }

            public Builder setHeartDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setHeartDisplayPage(value);
                return this;
            }

            public Builder setMusicDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setMusicDisplayPage(value);
                return this;
            }

            public Builder setNfcDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setNfcDisplayPage(value);
                return this;
            }

            public Builder setNotifyDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setNotifyDisplayPage(value);
                return this;
            }

            public Builder setPaiDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setPaiDisplayPage(value);
                return this;
            }

            public Builder setPhoneMuteDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setPhoneMuteDisplayPage(value);
                return this;
            }

            public Builder setPressureDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setPressureDisplayPage(value);
                return this;
            }

            public Builder setSilenceDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setSilenceDisplayPage(value);
                return this;
            }

            public Builder setSportDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setSportDisplayPage(value);
                return this;
            }

            public Builder setStatusDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setStatusDisplayPage(value);
                return this;
            }

            public Builder setStopWatchDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setStopWatchDisplayPage(value);
                return this;
            }

            public Builder setWeatehrDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setWeatehrDisplayPage(value);
                return this;
            }

            public Builder setWomenHealthDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setWomenHealthDisplayPage(value);
                return this;
            }

            public Builder setWorldTimeDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setWorldTimeDisplayPage(value);
                return this;
            }

            public Builder setXiaoaiDisplayPage(int value) {
                copyOnWrite();
                ((YorkShortcutEventMessage) this.instance).setXiaoaiDisplayPage(value);
                return this;
            }

            private Builder() {
                super(YorkShortcutEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            YorkShortcutEventMessage yorkShortcutEventMessage = new YorkShortcutEventMessage();
            DEFAULT_INSTANCE = yorkShortcutEventMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkShortcutEventMessage.class, yorkShortcutEventMessage);
        }

        private YorkShortcutEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmDisplayPage() {
            this.bitField0_ &= -16385;
            this.alarmDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBrDisplayPage() {
            this.bitField0_ &= -1048577;
            this.alipayBrDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQrDisplayPage() {
            this.bitField0_ &= -2097153;
            this.alipayQrDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBloodoxygenDisplayPage() {
            this.bitField0_ &= -16777217;
            this.bloodoxygenDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreatheDisplayPage() {
            this.bitField0_ &= -257;
            this.breatheDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalendarDisplayPage() {
            this.bitField0_ &= -8388609;
            this.calendarDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCameraDisplayPage() {
            this.bitField0_ &= -32769;
            this.cameraDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountDownDisplayPage() {
            this.bitField0_ &= -131073;
            this.countDownDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventRemindDisplayPage() {
            this.bitField0_ &= -1025;
            this.eventRemindDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneDisplayPage() {
            this.bitField0_ &= -262145;
            this.findPhoneDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartDisplayPage() {
            this.bitField0_ &= -65;
            this.heartDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicDisplayPage() {
            this.bitField0_ &= -9;
            this.musicDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNfcDisplayPage() {
            this.bitField0_ &= -4097;
            this.nfcDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyDisplayPage() {
            this.bitField0_ &= -2;
            this.notifyDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiDisplayPage() {
            this.bitField0_ &= -33;
            this.paiDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneMuteDisplayPage() {
            this.bitField0_ &= -524289;
            this.phoneMuteDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPressureDisplayPage() {
            this.bitField0_ &= -129;
            this.pressureDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceDisplayPage() {
            this.bitField0_ &= -8193;
            this.silenceDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportDisplayPage() {
            this.bitField0_ &= -2049;
            this.sportDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusDisplayPage() {
            this.bitField0_ &= -17;
            this.statusDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopWatchDisplayPage() {
            this.bitField0_ &= -65537;
            this.stopWatchDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatehrDisplayPage() {
            this.bitField0_ &= -5;
            this.weatehrDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWomenHealthDisplayPage() {
            this.bitField0_ &= -513;
            this.womenHealthDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWorldTimeDisplayPage() {
            this.bitField0_ &= -4194305;
            this.worldTimeDisplayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXiaoaiDisplayPage() {
            this.bitField0_ &= -3;
            this.xiaoaiDisplayPage_ = 0;
        }

        public static YorkShortcutEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkShortcutEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkShortcutEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkShortcutEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmDisplayPage(int value) {
            this.bitField0_ |= 16384;
            this.alarmDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBrDisplayPage(int value) {
            this.bitField0_ |= 1048576;
            this.alipayBrDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQrDisplayPage(int value) {
            this.bitField0_ |= 2097152;
            this.alipayQrDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBloodoxygenDisplayPage(int value) {
            this.bitField0_ |= 16777216;
            this.bloodoxygenDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreatheDisplayPage(int value) {
            this.bitField0_ |= 256;
            this.breatheDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalendarDisplayPage(int value) {
            this.bitField0_ |= 8388608;
            this.calendarDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCameraDisplayPage(int value) {
            this.bitField0_ |= 32768;
            this.cameraDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountDownDisplayPage(int value) {
            this.bitField0_ |= 131072;
            this.countDownDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventRemindDisplayPage(int value) {
            this.bitField0_ |= 1024;
            this.eventRemindDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneDisplayPage(int value) {
            this.bitField0_ |= 262144;
            this.findPhoneDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartDisplayPage(int value) {
            this.bitField0_ |= 64;
            this.heartDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicDisplayPage(int value) {
            this.bitField0_ |= 8;
            this.musicDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfcDisplayPage(int value) {
            this.bitField0_ |= 4096;
            this.nfcDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyDisplayPage(int value) {
            this.bitField0_ |= 1;
            this.notifyDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiDisplayPage(int value) {
            this.bitField0_ |= 32;
            this.paiDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneMuteDisplayPage(int value) {
            this.bitField0_ |= 524288;
            this.phoneMuteDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressureDisplayPage(int value) {
            this.bitField0_ |= 128;
            this.pressureDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceDisplayPage(int value) {
            this.bitField0_ |= 8192;
            this.silenceDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportDisplayPage(int value) {
            this.bitField0_ |= 2048;
            this.sportDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusDisplayPage(int value) {
            this.bitField0_ |= 16;
            this.statusDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopWatchDisplayPage(int value) {
            this.bitField0_ |= 65536;
            this.stopWatchDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatehrDisplayPage(int value) {
            this.bitField0_ |= 4;
            this.weatehrDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWomenHealthDisplayPage(int value) {
            this.bitField0_ |= 512;
            this.womenHealthDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWorldTimeDisplayPage(int value) {
            this.bitField0_ |= 4194304;
            this.worldTimeDisplayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXiaoaiDisplayPage(int value) {
            this.bitField0_ |= 2;
            this.xiaoaiDisplayPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkShortcutEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0000\u0019\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018", new Object[]{"bitField0_", "notifyDisplayPage_", "xiaoaiDisplayPage_", "weatehrDisplayPage_", "musicDisplayPage_", "statusDisplayPage_", "paiDisplayPage_", "heartDisplayPage_", "pressureDisplayPage_", "breatheDisplayPage_", "womenHealthDisplayPage_", "eventRemindDisplayPage_", "sportDisplayPage_", "nfcDisplayPage_", "silenceDisplayPage_", "alarmDisplayPage_", "cameraDisplayPage_", "stopWatchDisplayPage_", "countDownDisplayPage_", "findPhoneDisplayPage_", "phoneMuteDisplayPage_", "alipayBrDisplayPage_", "alipayQrDisplayPage_", "worldTimeDisplayPage_", "calendarDisplayPage_", "bloodoxygenDisplayPage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkShortcutEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkShortcutEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getAlarmDisplayPage() {
            return this.alarmDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getAlipayBrDisplayPage() {
            return this.alipayBrDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getAlipayQrDisplayPage() {
            return this.alipayQrDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getBloodoxygenDisplayPage() {
            return this.bloodoxygenDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getBreatheDisplayPage() {
            return this.breatheDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getCalendarDisplayPage() {
            return this.calendarDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getCameraDisplayPage() {
            return this.cameraDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getCountDownDisplayPage() {
            return this.countDownDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getEventRemindDisplayPage() {
            return this.eventRemindDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getFindPhoneDisplayPage() {
            return this.findPhoneDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getHeartDisplayPage() {
            return this.heartDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getMusicDisplayPage() {
            return this.musicDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getNfcDisplayPage() {
            return this.nfcDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getNotifyDisplayPage() {
            return this.notifyDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getPaiDisplayPage() {
            return this.paiDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getPhoneMuteDisplayPage() {
            return this.phoneMuteDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getPressureDisplayPage() {
            return this.pressureDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getSilenceDisplayPage() {
            return this.silenceDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getSportDisplayPage() {
            return this.sportDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getStatusDisplayPage() {
            return this.statusDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getStopWatchDisplayPage() {
            return this.stopWatchDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getWeatehrDisplayPage() {
            return this.weatehrDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getWomenHealthDisplayPage() {
            return this.womenHealthDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getWorldTimeDisplayPage() {
            return this.worldTimeDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public int getXiaoaiDisplayPage() {
            return this.xiaoaiDisplayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasAlarmDisplayPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasAlipayBrDisplayPage() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasAlipayQrDisplayPage() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasBloodoxygenDisplayPage() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasBreatheDisplayPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasCalendarDisplayPage() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasCameraDisplayPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasCountDownDisplayPage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasEventRemindDisplayPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasFindPhoneDisplayPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasHeartDisplayPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasMusicDisplayPage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasNfcDisplayPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasNotifyDisplayPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasPaiDisplayPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasPhoneMuteDisplayPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasPressureDisplayPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasSilenceDisplayPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasSportDisplayPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasStatusDisplayPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasStopWatchDisplayPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasWeatehrDisplayPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasWomenHealthDisplayPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasWorldTimeDisplayPage() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkShortcutEventMessageOrBuilder
        public boolean hasXiaoaiDisplayPage() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(YorkShortcutEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkShortcutEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkShortcutEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkShortcutEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkShortcutEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkShortcutEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkShortcutEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkShortcutEventMessage parseFrom(InputStream input) throws IOException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkShortcutEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkShortcutEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkShortcutEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkShortcutEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkShortcutEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmDisplayPage();

        int getAlipayBrDisplayPage();

        int getAlipayQrDisplayPage();

        int getBloodoxygenDisplayPage();

        int getBreatheDisplayPage();

        int getCalendarDisplayPage();

        int getCameraDisplayPage();

        int getCountDownDisplayPage();

        int getEventRemindDisplayPage();

        int getFindPhoneDisplayPage();

        int getHeartDisplayPage();

        int getMusicDisplayPage();

        int getNfcDisplayPage();

        int getNotifyDisplayPage();

        int getPaiDisplayPage();

        int getPhoneMuteDisplayPage();

        int getPressureDisplayPage();

        int getSilenceDisplayPage();

        int getSportDisplayPage();

        int getStatusDisplayPage();

        int getStopWatchDisplayPage();

        int getWeatehrDisplayPage();

        int getWomenHealthDisplayPage();

        int getWorldTimeDisplayPage();

        int getXiaoaiDisplayPage();

        boolean hasAlarmDisplayPage();

        boolean hasAlipayBrDisplayPage();

        boolean hasAlipayQrDisplayPage();

        boolean hasBloodoxygenDisplayPage();

        boolean hasBreatheDisplayPage();

        boolean hasCalendarDisplayPage();

        boolean hasCameraDisplayPage();

        boolean hasCountDownDisplayPage();

        boolean hasEventRemindDisplayPage();

        boolean hasFindPhoneDisplayPage();

        boolean hasHeartDisplayPage();

        boolean hasMusicDisplayPage();

        boolean hasNfcDisplayPage();

        boolean hasNotifyDisplayPage();

        boolean hasPaiDisplayPage();

        boolean hasPhoneMuteDisplayPage();

        boolean hasPressureDisplayPage();

        boolean hasSilenceDisplayPage();

        boolean hasSportDisplayPage();

        boolean hasStatusDisplayPage();

        boolean hasStopWatchDisplayPage();

        boolean hasWeatehrDisplayPage();

        boolean hasWomenHealthDisplayPage();

        boolean hasWorldTimeDisplayPage();

        boolean hasXiaoaiDisplayPage();
    }

    public static final class YorkSportEventMessage extends GeneratedMessageLite<YorkSportEventMessage, Builder> implements YorkSportEventMessageOrBuilder {
        public static final int BEFORESPORTSKIPGPSLOC_FIELD_NUMBER = 1;
        public static final int BEFORESPORTSUCCGPSLOC_FIELD_NUMBER = 2;
        private static final YorkSportEventMessage DEFAULT_INSTANCE;
        private static volatile Parser<YorkSportEventMessage> PARSER = null;
        public static final int SPORTINGDISCONPAGE_FIELD_NUMBER = 9;
        public static final int SPORTINGRECONNECTPAGE_FIELD_NUMBER = 10;
        public static final int SPORTINGSUCCGPSLOCPAGE_FIELD_NUMBER = 8;
        public static final int SPORTINGSUCCGPSLOCTIMELESS10S_FIELD_NUMBER = 6;
        public static final int SPORTINGSUCCGPSLOCTIMELESS1S_FIELD_NUMBER = 3;
        public static final int SPORTINGSUCCGPSLOCTIMELESS3S_FIELD_NUMBER = 4;
        public static final int SPORTINGSUCCGPSLOCTIMELESS5S_FIELD_NUMBER = 5;
        public static final int SPORTINGSUCCGPSLOCTIMELESSOTHER_FIELD_NUMBER = 7;
        private int beforeSportSkipGpsLoc_;
        private int beforeSportSuccGpsLoc_;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int sportingDisconPage_;
        private int sportingReconnectPage_;
        private int sportingSuccGpsLocPage_;
        private int sportingSuccGpsLocTimeLess10S_;
        private int sportingSuccGpsLocTimeLess1S_;
        private int sportingSuccGpsLocTimeLess3S_;
        private int sportingSuccGpsLocTimeLess5S_;
        private int sportingSuccGpsLocTimeLessOther_;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkSportEventMessage, Builder> implements YorkSportEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBeforeSportSkipGpsLoc() {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).clearBeforeSportSkipGpsLoc();
                return this;
            }

            public Builder clearBeforeSportSuccGpsLoc() {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).clearBeforeSportSuccGpsLoc();
                return this;
            }

            public Builder clearSportingDisconPage() {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).clearSportingDisconPage();
                return this;
            }

            public Builder clearSportingReconnectPage() {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).clearSportingReconnectPage();
                return this;
            }

            public Builder clearSportingSuccGpsLocPage() {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).clearSportingSuccGpsLocPage();
                return this;
            }

            public Builder clearSportingSuccGpsLocTimeLess10S() {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).clearSportingSuccGpsLocTimeLess10S();
                return this;
            }

            public Builder clearSportingSuccGpsLocTimeLess1S() {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).clearSportingSuccGpsLocTimeLess1S();
                return this;
            }

            public Builder clearSportingSuccGpsLocTimeLess3S() {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).clearSportingSuccGpsLocTimeLess3S();
                return this;
            }

            public Builder clearSportingSuccGpsLocTimeLess5S() {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).clearSportingSuccGpsLocTimeLess5S();
                return this;
            }

            public Builder clearSportingSuccGpsLocTimeLessOther() {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).clearSportingSuccGpsLocTimeLessOther();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public int getBeforeSportSkipGpsLoc() {
                return ((YorkSportEventMessage) this.instance).getBeforeSportSkipGpsLoc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public int getBeforeSportSuccGpsLoc() {
                return ((YorkSportEventMessage) this.instance).getBeforeSportSuccGpsLoc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public int getSportingDisconPage() {
                return ((YorkSportEventMessage) this.instance).getSportingDisconPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public int getSportingReconnectPage() {
                return ((YorkSportEventMessage) this.instance).getSportingReconnectPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public int getSportingSuccGpsLocPage() {
                return ((YorkSportEventMessage) this.instance).getSportingSuccGpsLocPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public int getSportingSuccGpsLocTimeLess10S() {
                return ((YorkSportEventMessage) this.instance).getSportingSuccGpsLocTimeLess10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public int getSportingSuccGpsLocTimeLess1S() {
                return ((YorkSportEventMessage) this.instance).getSportingSuccGpsLocTimeLess1S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public int getSportingSuccGpsLocTimeLess3S() {
                return ((YorkSportEventMessage) this.instance).getSportingSuccGpsLocTimeLess3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public int getSportingSuccGpsLocTimeLess5S() {
                return ((YorkSportEventMessage) this.instance).getSportingSuccGpsLocTimeLess5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public int getSportingSuccGpsLocTimeLessOther() {
                return ((YorkSportEventMessage) this.instance).getSportingSuccGpsLocTimeLessOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public boolean hasBeforeSportSkipGpsLoc() {
                return ((YorkSportEventMessage) this.instance).hasBeforeSportSkipGpsLoc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public boolean hasBeforeSportSuccGpsLoc() {
                return ((YorkSportEventMessage) this.instance).hasBeforeSportSuccGpsLoc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public boolean hasSportingDisconPage() {
                return ((YorkSportEventMessage) this.instance).hasSportingDisconPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public boolean hasSportingReconnectPage() {
                return ((YorkSportEventMessage) this.instance).hasSportingReconnectPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocPage() {
                return ((YorkSportEventMessage) this.instance).hasSportingSuccGpsLocPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocTimeLess10S() {
                return ((YorkSportEventMessage) this.instance).hasSportingSuccGpsLocTimeLess10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocTimeLess1S() {
                return ((YorkSportEventMessage) this.instance).hasSportingSuccGpsLocTimeLess1S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocTimeLess3S() {
                return ((YorkSportEventMessage) this.instance).hasSportingSuccGpsLocTimeLess3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocTimeLess5S() {
                return ((YorkSportEventMessage) this.instance).hasSportingSuccGpsLocTimeLess5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
            public boolean hasSportingSuccGpsLocTimeLessOther() {
                return ((YorkSportEventMessage) this.instance).hasSportingSuccGpsLocTimeLessOther();
            }

            public Builder setBeforeSportSkipGpsLoc(int value) {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).setBeforeSportSkipGpsLoc(value);
                return this;
            }

            public Builder setBeforeSportSuccGpsLoc(int value) {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).setBeforeSportSuccGpsLoc(value);
                return this;
            }

            public Builder setSportingDisconPage(int value) {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).setSportingDisconPage(value);
                return this;
            }

            public Builder setSportingReconnectPage(int value) {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).setSportingReconnectPage(value);
                return this;
            }

            public Builder setSportingSuccGpsLocPage(int value) {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).setSportingSuccGpsLocPage(value);
                return this;
            }

            public Builder setSportingSuccGpsLocTimeLess10S(int value) {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).setSportingSuccGpsLocTimeLess10S(value);
                return this;
            }

            public Builder setSportingSuccGpsLocTimeLess1S(int value) {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).setSportingSuccGpsLocTimeLess1S(value);
                return this;
            }

            public Builder setSportingSuccGpsLocTimeLess3S(int value) {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).setSportingSuccGpsLocTimeLess3S(value);
                return this;
            }

            public Builder setSportingSuccGpsLocTimeLess5S(int value) {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).setSportingSuccGpsLocTimeLess5S(value);
                return this;
            }

            public Builder setSportingSuccGpsLocTimeLessOther(int value) {
                copyOnWrite();
                ((YorkSportEventMessage) this.instance).setSportingSuccGpsLocTimeLessOther(value);
                return this;
            }

            private Builder() {
                super(YorkSportEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            YorkSportEventMessage yorkSportEventMessage = new YorkSportEventMessage();
            DEFAULT_INSTANCE = yorkSportEventMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkSportEventMessage.class, yorkSportEventMessage);
        }

        private YorkSportEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBeforeSportSkipGpsLoc() {
            this.bitField0_ &= -2;
            this.beforeSportSkipGpsLoc_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBeforeSportSuccGpsLoc() {
            this.bitField0_ &= -3;
            this.beforeSportSuccGpsLoc_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingDisconPage() {
            this.bitField0_ &= -257;
            this.sportingDisconPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingReconnectPage() {
            this.bitField0_ &= -513;
            this.sportingReconnectPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocPage() {
            this.bitField0_ &= -129;
            this.sportingSuccGpsLocPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocTimeLess10S() {
            this.bitField0_ &= -33;
            this.sportingSuccGpsLocTimeLess10S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocTimeLess1S() {
            this.bitField0_ &= -5;
            this.sportingSuccGpsLocTimeLess1S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocTimeLess3S() {
            this.bitField0_ &= -9;
            this.sportingSuccGpsLocTimeLess3S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocTimeLess5S() {
            this.bitField0_ &= -17;
            this.sportingSuccGpsLocTimeLess5S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportingSuccGpsLocTimeLessOther() {
            this.bitField0_ &= -65;
            this.sportingSuccGpsLocTimeLessOther_ = 0;
        }

        public static YorkSportEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkSportEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkSportEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkSportEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeforeSportSkipGpsLoc(int value) {
            this.bitField0_ |= 1;
            this.beforeSportSkipGpsLoc_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeforeSportSuccGpsLoc(int value) {
            this.bitField0_ |= 2;
            this.beforeSportSuccGpsLoc_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingDisconPage(int value) {
            this.bitField0_ |= 256;
            this.sportingDisconPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingReconnectPage(int value) {
            this.bitField0_ |= 512;
            this.sportingReconnectPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocPage(int value) {
            this.bitField0_ |= 128;
            this.sportingSuccGpsLocPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocTimeLess10S(int value) {
            this.bitField0_ |= 32;
            this.sportingSuccGpsLocTimeLess10S_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocTimeLess1S(int value) {
            this.bitField0_ |= 4;
            this.sportingSuccGpsLocTimeLess1S_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocTimeLess3S(int value) {
            this.bitField0_ |= 8;
            this.sportingSuccGpsLocTimeLess3S_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocTimeLess5S(int value) {
            this.bitField0_ |= 16;
            this.sportingSuccGpsLocTimeLess5S_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportingSuccGpsLocTimeLessOther(int value) {
            this.bitField0_ |= 64;
            this.sportingSuccGpsLocTimeLessOther_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkSportEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\n\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t", new Object[]{"bitField0_", "beforeSportSkipGpsLoc_", "beforeSportSuccGpsLoc_", "sportingSuccGpsLocTimeLess1S_", "sportingSuccGpsLocTimeLess3S_", "sportingSuccGpsLocTimeLess5S_", "sportingSuccGpsLocTimeLess10S_", "sportingSuccGpsLocTimeLessOther_", "sportingSuccGpsLocPage_", "sportingDisconPage_", "sportingReconnectPage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkSportEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkSportEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public int getBeforeSportSkipGpsLoc() {
            return this.beforeSportSkipGpsLoc_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public int getBeforeSportSuccGpsLoc() {
            return this.beforeSportSuccGpsLoc_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public int getSportingDisconPage() {
            return this.sportingDisconPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public int getSportingReconnectPage() {
            return this.sportingReconnectPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public int getSportingSuccGpsLocPage() {
            return this.sportingSuccGpsLocPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public int getSportingSuccGpsLocTimeLess10S() {
            return this.sportingSuccGpsLocTimeLess10S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public int getSportingSuccGpsLocTimeLess1S() {
            return this.sportingSuccGpsLocTimeLess1S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public int getSportingSuccGpsLocTimeLess3S() {
            return this.sportingSuccGpsLocTimeLess3S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public int getSportingSuccGpsLocTimeLess5S() {
            return this.sportingSuccGpsLocTimeLess5S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public int getSportingSuccGpsLocTimeLessOther() {
            return this.sportingSuccGpsLocTimeLessOther_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public boolean hasBeforeSportSkipGpsLoc() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public boolean hasBeforeSportSuccGpsLoc() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public boolean hasSportingDisconPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public boolean hasSportingReconnectPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocTimeLess10S() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocTimeLess1S() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocTimeLess3S() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocTimeLess5S() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkSportEventMessageOrBuilder
        public boolean hasSportingSuccGpsLocTimeLessOther() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(YorkSportEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkSportEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkSportEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkSportEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkSportEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkSportEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkSportEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkSportEventMessage parseFrom(InputStream input) throws IOException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkSportEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkSportEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkSportEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkSportEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkSportEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getBeforeSportSkipGpsLoc();

        int getBeforeSportSuccGpsLoc();

        int getSportingDisconPage();

        int getSportingReconnectPage();

        int getSportingSuccGpsLocPage();

        int getSportingSuccGpsLocTimeLess10S();

        int getSportingSuccGpsLocTimeLess1S();

        int getSportingSuccGpsLocTimeLess3S();

        int getSportingSuccGpsLocTimeLess5S();

        int getSportingSuccGpsLocTimeLessOther();

        boolean hasBeforeSportSkipGpsLoc();

        boolean hasBeforeSportSuccGpsLoc();

        boolean hasSportingDisconPage();

        boolean hasSportingReconnectPage();

        boolean hasSportingSuccGpsLocPage();

        boolean hasSportingSuccGpsLocTimeLess10S();

        boolean hasSportingSuccGpsLocTimeLess1S();

        boolean hasSportingSuccGpsLocTimeLess3S();

        boolean hasSportingSuccGpsLocTimeLess5S();

        boolean hasSportingSuccGpsLocTimeLessOther();
    }

    public static final class YorkStatisticsMessage extends GeneratedMessageLite<YorkStatisticsMessage, Builder> implements YorkStatisticsMessageOrBuilder {
        public static final int ALEXAEVENT_FIELD_NUMBER = 20;
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        public static final int BLOODOXYGENEVENT_FIELD_NUMBER = 19;
        private static final YorkStatisticsMessage DEFAULT_INSTANCE;
        public static final int DIALEVENT_FIELD_NUMBER = 13;
        public static final int DIALID_FIELD_NUMBER = 4;
        public static final int EVENTBYDIAL_FIELD_NUMBER = 8;
        public static final int EVENTBYMENU_FIELD_NUMBER = 7;
        public static final int EVENTBYSHORTCUT_FIELD_NUMBER = 6;
        public static final int LCDEVENT_FIELD_NUMBER = 5;
        public static final int MOREEVENT_FIELD_NUMBER = 10;
        public static final int NOTIFYEVENT_FIELD_NUMBER = 12;
        private static volatile Parser<YorkStatisticsMessage> PARSER = null;
        public static final int SHORTCUTLESS10S_FIELD_NUMBER = 17;
        public static final int SHORTCUTLESS3S_FIELD_NUMBER = 14;
        public static final int SHORTCUTLESS5S_FIELD_NUMBER = 15;
        public static final int SHORTCUTLESS8S_FIELD_NUMBER = 16;
        public static final int SHORTCUTLESSOTHER_FIELD_NUMBER = 18;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        public static final int SPORTEVENT_FIELD_NUMBER = 11;
        public static final int XIAOAIEVENT_FIELD_NUMBER = 9;
        private YorkAlexaEventMessage alexaEvent_;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private YorkBloodoxygenEventMessage bloodoxygenEvent_;
        private YorkDialEventMessage dialEvent_;
        private int dialId_;
        private YorkMenuEventMessage eventByDial_;
        private YorkMenuEventMessage eventByMenu_;
        private YorkMenuEventMessage eventByShortcut_;
        private YorkLcdEventMessage lcdEvent_;
        private byte memoizedIsInitialized = 2;
        private YorkMoreEventMessage moreEvent_;
        private YorkNotifyEventMessage notifyEvent_;
        private YorkShortcutEventMessage shortcutLess10S_;
        private YorkShortcutEventMessage shortcutLess3S_;
        private YorkShortcutEventMessage shortcutLess5S_;
        private YorkShortcutEventMessage shortcutLess8S_;
        private YorkShortcutEventMessage shortcutLessOther_;
        private int silenceMode_;
        private YorkSportEventMessage sportEvent_;
        private YorkXiaoaiEventMessage xiaoaiEvent_;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkStatisticsMessage, Builder> implements YorkStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlexaEvent() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearAlexaEvent();
                return this;
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearBloodoxygenEvent() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearBloodoxygenEvent();
                return this;
            }

            public Builder clearDialEvent() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearDialEvent();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearEventByDial() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearEventByDial();
                return this;
            }

            public Builder clearEventByMenu() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearEventByMenu();
                return this;
            }

            public Builder clearEventByShortcut() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearEventByShortcut();
                return this;
            }

            public Builder clearLcdEvent() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearLcdEvent();
                return this;
            }

            public Builder clearMoreEvent() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearMoreEvent();
                return this;
            }

            public Builder clearNotifyEvent() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearNotifyEvent();
                return this;
            }

            public Builder clearShortcutLess10S() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearShortcutLess10S();
                return this;
            }

            public Builder clearShortcutLess3S() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearShortcutLess3S();
                return this;
            }

            public Builder clearShortcutLess5S() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearShortcutLess5S();
                return this;
            }

            public Builder clearShortcutLess8S() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearShortcutLess8S();
                return this;
            }

            public Builder clearShortcutLessOther() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearShortcutLessOther();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            public Builder clearSportEvent() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearSportEvent();
                return this;
            }

            public Builder clearXiaoaiEvent() {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).clearXiaoaiEvent();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkAlexaEventMessage getAlexaEvent() {
                return ((YorkStatisticsMessage) this.instance).getAlexaEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((YorkStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((YorkStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkBloodoxygenEventMessage getBloodoxygenEvent() {
                return ((YorkStatisticsMessage) this.instance).getBloodoxygenEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkDialEventMessage getDialEvent() {
                return ((YorkStatisticsMessage) this.instance).getDialEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public int getDialId() {
                return ((YorkStatisticsMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkMenuEventMessage getEventByDial() {
                return ((YorkStatisticsMessage) this.instance).getEventByDial();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkMenuEventMessage getEventByMenu() {
                return ((YorkStatisticsMessage) this.instance).getEventByMenu();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkMenuEventMessage getEventByShortcut() {
                return ((YorkStatisticsMessage) this.instance).getEventByShortcut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkLcdEventMessage getLcdEvent() {
                return ((YorkStatisticsMessage) this.instance).getLcdEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkMoreEventMessage getMoreEvent() {
                return ((YorkStatisticsMessage) this.instance).getMoreEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkNotifyEventMessage getNotifyEvent() {
                return ((YorkStatisticsMessage) this.instance).getNotifyEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkShortcutEventMessage getShortcutLess10S() {
                return ((YorkStatisticsMessage) this.instance).getShortcutLess10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkShortcutEventMessage getShortcutLess3S() {
                return ((YorkStatisticsMessage) this.instance).getShortcutLess3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkShortcutEventMessage getShortcutLess5S() {
                return ((YorkStatisticsMessage) this.instance).getShortcutLess5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkShortcutEventMessage getShortcutLess8S() {
                return ((YorkStatisticsMessage) this.instance).getShortcutLess8S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkShortcutEventMessage getShortcutLessOther() {
                return ((YorkStatisticsMessage) this.instance).getShortcutLessOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((YorkStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkSportEventMessage getSportEvent() {
                return ((YorkStatisticsMessage) this.instance).getSportEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public YorkXiaoaiEventMessage getXiaoaiEvent() {
                return ((YorkStatisticsMessage) this.instance).getXiaoaiEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasAlexaEvent() {
                return ((YorkStatisticsMessage) this.instance).hasAlexaEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((YorkStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((YorkStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasBloodoxygenEvent() {
                return ((YorkStatisticsMessage) this.instance).hasBloodoxygenEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasDialEvent() {
                return ((YorkStatisticsMessage) this.instance).hasDialEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasDialId() {
                return ((YorkStatisticsMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasEventByDial() {
                return ((YorkStatisticsMessage) this.instance).hasEventByDial();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasEventByMenu() {
                return ((YorkStatisticsMessage) this.instance).hasEventByMenu();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasEventByShortcut() {
                return ((YorkStatisticsMessage) this.instance).hasEventByShortcut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasLcdEvent() {
                return ((YorkStatisticsMessage) this.instance).hasLcdEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasMoreEvent() {
                return ((YorkStatisticsMessage) this.instance).hasMoreEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasNotifyEvent() {
                return ((YorkStatisticsMessage) this.instance).hasNotifyEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasShortcutLess10S() {
                return ((YorkStatisticsMessage) this.instance).hasShortcutLess10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasShortcutLess3S() {
                return ((YorkStatisticsMessage) this.instance).hasShortcutLess3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasShortcutLess5S() {
                return ((YorkStatisticsMessage) this.instance).hasShortcutLess5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasShortcutLess8S() {
                return ((YorkStatisticsMessage) this.instance).hasShortcutLess8S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasShortcutLessOther() {
                return ((YorkStatisticsMessage) this.instance).hasShortcutLessOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((YorkStatisticsMessage) this.instance).hasSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasSportEvent() {
                return ((YorkStatisticsMessage) this.instance).hasSportEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
            public boolean hasXiaoaiEvent() {
                return ((YorkStatisticsMessage) this.instance).hasXiaoaiEvent();
            }

            public Builder mergeAlexaEvent(YorkAlexaEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeAlexaEvent(value);
                return this;
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeBloodoxygenEvent(YorkBloodoxygenEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeBloodoxygenEvent(value);
                return this;
            }

            public Builder mergeDialEvent(YorkDialEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeDialEvent(value);
                return this;
            }

            public Builder mergeEventByDial(YorkMenuEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeEventByDial(value);
                return this;
            }

            public Builder mergeEventByMenu(YorkMenuEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeEventByMenu(value);
                return this;
            }

            public Builder mergeEventByShortcut(YorkMenuEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeEventByShortcut(value);
                return this;
            }

            public Builder mergeLcdEvent(YorkLcdEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeLcdEvent(value);
                return this;
            }

            public Builder mergeMoreEvent(YorkMoreEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeMoreEvent(value);
                return this;
            }

            public Builder mergeNotifyEvent(YorkNotifyEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeNotifyEvent(value);
                return this;
            }

            public Builder mergeShortcutLess10S(YorkShortcutEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeShortcutLess10S(value);
                return this;
            }

            public Builder mergeShortcutLess3S(YorkShortcutEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeShortcutLess3S(value);
                return this;
            }

            public Builder mergeShortcutLess5S(YorkShortcutEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeShortcutLess5S(value);
                return this;
            }

            public Builder mergeShortcutLess8S(YorkShortcutEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeShortcutLess8S(value);
                return this;
            }

            public Builder mergeShortcutLessOther(YorkShortcutEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeShortcutLessOther(value);
                return this;
            }

            public Builder mergeSportEvent(YorkSportEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeSportEvent(value);
                return this;
            }

            public Builder mergeXiaoaiEvent(YorkXiaoaiEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).mergeXiaoaiEvent(value);
                return this;
            }

            public Builder setAlexaEvent(YorkAlexaEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setAlexaEvent(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setBloodoxygenEvent(YorkBloodoxygenEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setBloodoxygenEvent(value);
                return this;
            }

            public Builder setDialEvent(YorkDialEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setDialEvent(value);
                return this;
            }

            public Builder setDialId(int value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setDialId(value);
                return this;
            }

            public Builder setEventByDial(YorkMenuEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setEventByDial(value);
                return this;
            }

            public Builder setEventByMenu(YorkMenuEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setEventByMenu(value);
                return this;
            }

            public Builder setEventByShortcut(YorkMenuEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setEventByShortcut(value);
                return this;
            }

            public Builder setLcdEvent(YorkLcdEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setLcdEvent(value);
                return this;
            }

            public Builder setMoreEvent(YorkMoreEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setMoreEvent(value);
                return this;
            }

            public Builder setNotifyEvent(YorkNotifyEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setNotifyEvent(value);
                return this;
            }

            public Builder setShortcutLess10S(YorkShortcutEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setShortcutLess10S(value);
                return this;
            }

            public Builder setShortcutLess3S(YorkShortcutEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setShortcutLess3S(value);
                return this;
            }

            public Builder setShortcutLess5S(YorkShortcutEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setShortcutLess5S(value);
                return this;
            }

            public Builder setShortcutLess8S(YorkShortcutEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setShortcutLess8S(value);
                return this;
            }

            public Builder setShortcutLessOther(YorkShortcutEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setShortcutLessOther(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            public Builder setSportEvent(YorkSportEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setSportEvent(value);
                return this;
            }

            public Builder setXiaoaiEvent(YorkXiaoaiEventMessage value) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setXiaoaiEvent(value);
                return this;
            }

            private Builder() {
                super(YorkStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setAlexaEvent(YorkAlexaEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setAlexaEvent(builderForValue.build());
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setBloodoxygenEvent(YorkBloodoxygenEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setBloodoxygenEvent(builderForValue.build());
                return this;
            }

            public Builder setDialEvent(YorkDialEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setDialEvent(builderForValue.build());
                return this;
            }

            public Builder setEventByDial(YorkMenuEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setEventByDial(builderForValue.build());
                return this;
            }

            public Builder setEventByMenu(YorkMenuEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setEventByMenu(builderForValue.build());
                return this;
            }

            public Builder setEventByShortcut(YorkMenuEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setEventByShortcut(builderForValue.build());
                return this;
            }

            public Builder setLcdEvent(YorkLcdEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setLcdEvent(builderForValue.build());
                return this;
            }

            public Builder setMoreEvent(YorkMoreEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setMoreEvent(builderForValue.build());
                return this;
            }

            public Builder setNotifyEvent(YorkNotifyEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setNotifyEvent(builderForValue.build());
                return this;
            }

            public Builder setShortcutLess10S(YorkShortcutEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setShortcutLess10S(builderForValue.build());
                return this;
            }

            public Builder setShortcutLess3S(YorkShortcutEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setShortcutLess3S(builderForValue.build());
                return this;
            }

            public Builder setShortcutLess5S(YorkShortcutEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setShortcutLess5S(builderForValue.build());
                return this;
            }

            public Builder setShortcutLess8S(YorkShortcutEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setShortcutLess8S(builderForValue.build());
                return this;
            }

            public Builder setShortcutLessOther(YorkShortcutEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setShortcutLessOther(builderForValue.build());
                return this;
            }

            public Builder setSportEvent(YorkSportEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setSportEvent(builderForValue.build());
                return this;
            }

            public Builder setXiaoaiEvent(YorkXiaoaiEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((YorkStatisticsMessage) this.instance).setXiaoaiEvent(builderForValue.build());
                return this;
            }
        }

        static {
            YorkStatisticsMessage yorkStatisticsMessage = new YorkStatisticsMessage();
            DEFAULT_INSTANCE = yorkStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkStatisticsMessage.class, yorkStatisticsMessage);
        }

        private YorkStatisticsMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlexaEvent() {
            this.alexaEvent_ = null;
            this.bitField0_ &= -524289;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBacklightLevel() {
            this.bitField0_ &= -5;
            this.backlightLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBase() {
            this.base_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBloodoxygenEvent() {
            this.bloodoxygenEvent_ = null;
            this.bitField0_ &= -262145;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialEvent() {
            this.dialEvent_ = null;
            this.bitField0_ &= -4097;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialId() {
            this.bitField0_ &= -9;
            this.dialId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventByDial() {
            this.eventByDial_ = null;
            this.bitField0_ &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventByMenu() {
            this.eventByMenu_ = null;
            this.bitField0_ &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventByShortcut() {
            this.eventByShortcut_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdEvent() {
            this.lcdEvent_ = null;
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMoreEvent() {
            this.moreEvent_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyEvent() {
            this.notifyEvent_ = null;
            this.bitField0_ &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShortcutLess10S() {
            this.shortcutLess10S_ = null;
            this.bitField0_ &= -65537;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShortcutLess3S() {
            this.shortcutLess3S_ = null;
            this.bitField0_ &= -8193;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShortcutLess5S() {
            this.shortcutLess5S_ = null;
            this.bitField0_ &= -16385;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShortcutLess8S() {
            this.shortcutLess8S_ = null;
            this.bitField0_ &= -32769;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShortcutLessOther() {
            this.shortcutLessOther_ = null;
            this.bitField0_ &= -131073;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceMode() {
            this.bitField0_ &= -3;
            this.silenceMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportEvent() {
            this.sportEvent_ = null;
            this.bitField0_ &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXiaoaiEvent() {
            this.xiaoaiEvent_ = null;
            this.bitField0_ &= -257;
        }

        public static YorkStatisticsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAlexaEvent(YorkAlexaEventMessage value) {
            value.getClass();
            YorkAlexaEventMessage yorkAlexaEventMessage = this.alexaEvent_;
            if (yorkAlexaEventMessage == null || yorkAlexaEventMessage == YorkAlexaEventMessage.getDefaultInstance()) {
                this.alexaEvent_ = value;
            } else {
                this.alexaEvent_ = YorkAlexaEventMessage.newBuilder(this.alexaEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBase(StatisBase.StatisBaseMessage value) {
            value.getClass();
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            if (statisBaseMessage == null || statisBaseMessage == StatisBase.StatisBaseMessage.getDefaultInstance()) {
                this.base_ = value;
            } else {
                this.base_ = StatisBase.StatisBaseMessage.newBuilder(this.base_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBloodoxygenEvent(YorkBloodoxygenEventMessage value) {
            value.getClass();
            YorkBloodoxygenEventMessage yorkBloodoxygenEventMessage = this.bloodoxygenEvent_;
            if (yorkBloodoxygenEventMessage == null || yorkBloodoxygenEventMessage == YorkBloodoxygenEventMessage.getDefaultInstance()) {
                this.bloodoxygenEvent_ = value;
            } else {
                this.bloodoxygenEvent_ = YorkBloodoxygenEventMessage.newBuilder(this.bloodoxygenEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialEvent(YorkDialEventMessage value) {
            value.getClass();
            YorkDialEventMessage yorkDialEventMessage = this.dialEvent_;
            if (yorkDialEventMessage == null || yorkDialEventMessage == YorkDialEventMessage.getDefaultInstance()) {
                this.dialEvent_ = value;
            } else {
                this.dialEvent_ = YorkDialEventMessage.newBuilder(this.dialEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventByDial(YorkMenuEventMessage value) {
            value.getClass();
            YorkMenuEventMessage yorkMenuEventMessage = this.eventByDial_;
            if (yorkMenuEventMessage == null || yorkMenuEventMessage == YorkMenuEventMessage.getDefaultInstance()) {
                this.eventByDial_ = value;
            } else {
                this.eventByDial_ = YorkMenuEventMessage.newBuilder(this.eventByDial_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventByMenu(YorkMenuEventMessage value) {
            value.getClass();
            YorkMenuEventMessage yorkMenuEventMessage = this.eventByMenu_;
            if (yorkMenuEventMessage == null || yorkMenuEventMessage == YorkMenuEventMessage.getDefaultInstance()) {
                this.eventByMenu_ = value;
            } else {
                this.eventByMenu_ = YorkMenuEventMessage.newBuilder(this.eventByMenu_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventByShortcut(YorkMenuEventMessage value) {
            value.getClass();
            YorkMenuEventMessage yorkMenuEventMessage = this.eventByShortcut_;
            if (yorkMenuEventMessage == null || yorkMenuEventMessage == YorkMenuEventMessage.getDefaultInstance()) {
                this.eventByShortcut_ = value;
            } else {
                this.eventByShortcut_ = YorkMenuEventMessage.newBuilder(this.eventByShortcut_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLcdEvent(YorkLcdEventMessage value) {
            value.getClass();
            YorkLcdEventMessage yorkLcdEventMessage = this.lcdEvent_;
            if (yorkLcdEventMessage == null || yorkLcdEventMessage == YorkLcdEventMessage.getDefaultInstance()) {
                this.lcdEvent_ = value;
            } else {
                this.lcdEvent_ = YorkLcdEventMessage.newBuilder(this.lcdEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMoreEvent(YorkMoreEventMessage value) {
            value.getClass();
            YorkMoreEventMessage yorkMoreEventMessage = this.moreEvent_;
            if (yorkMoreEventMessage == null || yorkMoreEventMessage == YorkMoreEventMessage.getDefaultInstance()) {
                this.moreEvent_ = value;
            } else {
                this.moreEvent_ = YorkMoreEventMessage.newBuilder(this.moreEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotifyEvent(YorkNotifyEventMessage value) {
            value.getClass();
            YorkNotifyEventMessage yorkNotifyEventMessage = this.notifyEvent_;
            if (yorkNotifyEventMessage == null || yorkNotifyEventMessage == YorkNotifyEventMessage.getDefaultInstance()) {
                this.notifyEvent_ = value;
            } else {
                this.notifyEvent_ = YorkNotifyEventMessage.newBuilder(this.notifyEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess10S(YorkShortcutEventMessage value) {
            value.getClass();
            YorkShortcutEventMessage yorkShortcutEventMessage = this.shortcutLess10S_;
            if (yorkShortcutEventMessage == null || yorkShortcutEventMessage == YorkShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess10S_ = value;
            } else {
                this.shortcutLess10S_ = YorkShortcutEventMessage.newBuilder(this.shortcutLess10S_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess3S(YorkShortcutEventMessage value) {
            value.getClass();
            YorkShortcutEventMessage yorkShortcutEventMessage = this.shortcutLess3S_;
            if (yorkShortcutEventMessage == null || yorkShortcutEventMessage == YorkShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess3S_ = value;
            } else {
                this.shortcutLess3S_ = YorkShortcutEventMessage.newBuilder(this.shortcutLess3S_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess5S(YorkShortcutEventMessage value) {
            value.getClass();
            YorkShortcutEventMessage yorkShortcutEventMessage = this.shortcutLess5S_;
            if (yorkShortcutEventMessage == null || yorkShortcutEventMessage == YorkShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess5S_ = value;
            } else {
                this.shortcutLess5S_ = YorkShortcutEventMessage.newBuilder(this.shortcutLess5S_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess8S(YorkShortcutEventMessage value) {
            value.getClass();
            YorkShortcutEventMessage yorkShortcutEventMessage = this.shortcutLess8S_;
            if (yorkShortcutEventMessage == null || yorkShortcutEventMessage == YorkShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess8S_ = value;
            } else {
                this.shortcutLess8S_ = YorkShortcutEventMessage.newBuilder(this.shortcutLess8S_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLessOther(YorkShortcutEventMessage value) {
            value.getClass();
            YorkShortcutEventMessage yorkShortcutEventMessage = this.shortcutLessOther_;
            if (yorkShortcutEventMessage == null || yorkShortcutEventMessage == YorkShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLessOther_ = value;
            } else {
                this.shortcutLessOther_ = YorkShortcutEventMessage.newBuilder(this.shortcutLessOther_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSportEvent(YorkSportEventMessage value) {
            value.getClass();
            YorkSportEventMessage yorkSportEventMessage = this.sportEvent_;
            if (yorkSportEventMessage == null || yorkSportEventMessage == YorkSportEventMessage.getDefaultInstance()) {
                this.sportEvent_ = value;
            } else {
                this.sportEvent_ = YorkSportEventMessage.newBuilder(this.sportEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeXiaoaiEvent(YorkXiaoaiEventMessage value) {
            value.getClass();
            YorkXiaoaiEventMessage yorkXiaoaiEventMessage = this.xiaoaiEvent_;
            if (yorkXiaoaiEventMessage == null || yorkXiaoaiEventMessage == YorkXiaoaiEventMessage.getDefaultInstance()) {
                this.xiaoaiEvent_ = value;
            } else {
                this.xiaoaiEvent_ = YorkXiaoaiEventMessage.newBuilder(this.xiaoaiEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlexaEvent(YorkAlexaEventMessage value) {
            value.getClass();
            this.alexaEvent_ = value;
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBacklightLevel(int value) {
            this.bitField0_ |= 4;
            this.backlightLevel_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBase(StatisBase.StatisBaseMessage value) {
            value.getClass();
            this.base_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBloodoxygenEvent(YorkBloodoxygenEventMessage value) {
            value.getClass();
            this.bloodoxygenEvent_ = value;
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialEvent(YorkDialEventMessage value) {
            value.getClass();
            this.dialEvent_ = value;
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialId(int value) {
            this.bitField0_ |= 8;
            this.dialId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventByDial(YorkMenuEventMessage value) {
            value.getClass();
            this.eventByDial_ = value;
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventByMenu(YorkMenuEventMessage value) {
            value.getClass();
            this.eventByMenu_ = value;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventByShortcut(YorkMenuEventMessage value) {
            value.getClass();
            this.eventByShortcut_ = value;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdEvent(YorkLcdEventMessage value) {
            value.getClass();
            this.lcdEvent_ = value;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMoreEvent(YorkMoreEventMessage value) {
            value.getClass();
            this.moreEvent_ = value;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyEvent(YorkNotifyEventMessage value) {
            value.getClass();
            this.notifyEvent_ = value;
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess10S(YorkShortcutEventMessage value) {
            value.getClass();
            this.shortcutLess10S_ = value;
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess3S(YorkShortcutEventMessage value) {
            value.getClass();
            this.shortcutLess3S_ = value;
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess5S(YorkShortcutEventMessage value) {
            value.getClass();
            this.shortcutLess5S_ = value;
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess8S(YorkShortcutEventMessage value) {
            value.getClass();
            this.shortcutLess8S_ = value;
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLessOther(YorkShortcutEventMessage value) {
            value.getClass();
            this.shortcutLessOther_ = value;
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
            this.silenceMode_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportEvent(YorkSportEventMessage value) {
            value.getClass();
            this.sportEvent_ = value;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXiaoaiEvent(YorkXiaoaiEventMessage value) {
            value.getClass();
            this.xiaoaiEvent_ = value;
            this.bitField0_ |= 256;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0014\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔉ\u0004\u0006ᔉ\u0005\u0007ᔉ\u0006\bᔉ\u0007\tᔉ\b\nᔉ\t\u000bᔉ\n\fᔉ\u000b\rᔉ\f\u000eᔉ\r\u000fᔉ\u000e\u0010ᔉ\u000f\u0011ᔉ\u0010\u0012ᔉ\u0011\u0013ᔉ\u0012\u0014ᔉ\u0013", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "dialId_", "lcdEvent_", "eventByShortcut_", "eventByMenu_", "eventByDial_", "xiaoaiEvent_", "moreEvent_", "sportEvent_", "notifyEvent_", "dialEvent_", "shortcutLess3S_", "shortcutLess5S_", "shortcutLess8S_", "shortcutLess10S_", "shortcutLessOther_", "bloodoxygenEvent_", "alexaEvent_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkStatisticsMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkAlexaEventMessage getAlexaEvent() {
            YorkAlexaEventMessage yorkAlexaEventMessage = this.alexaEvent_;
            return yorkAlexaEventMessage == null ? YorkAlexaEventMessage.getDefaultInstance() : yorkAlexaEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkBloodoxygenEventMessage getBloodoxygenEvent() {
            YorkBloodoxygenEventMessage yorkBloodoxygenEventMessage = this.bloodoxygenEvent_;
            return yorkBloodoxygenEventMessage == null ? YorkBloodoxygenEventMessage.getDefaultInstance() : yorkBloodoxygenEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkDialEventMessage getDialEvent() {
            YorkDialEventMessage yorkDialEventMessage = this.dialEvent_;
            return yorkDialEventMessage == null ? YorkDialEventMessage.getDefaultInstance() : yorkDialEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkMenuEventMessage getEventByDial() {
            YorkMenuEventMessage yorkMenuEventMessage = this.eventByDial_;
            return yorkMenuEventMessage == null ? YorkMenuEventMessage.getDefaultInstance() : yorkMenuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkMenuEventMessage getEventByMenu() {
            YorkMenuEventMessage yorkMenuEventMessage = this.eventByMenu_;
            return yorkMenuEventMessage == null ? YorkMenuEventMessage.getDefaultInstance() : yorkMenuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkMenuEventMessage getEventByShortcut() {
            YorkMenuEventMessage yorkMenuEventMessage = this.eventByShortcut_;
            return yorkMenuEventMessage == null ? YorkMenuEventMessage.getDefaultInstance() : yorkMenuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkLcdEventMessage getLcdEvent() {
            YorkLcdEventMessage yorkLcdEventMessage = this.lcdEvent_;
            return yorkLcdEventMessage == null ? YorkLcdEventMessage.getDefaultInstance() : yorkLcdEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkMoreEventMessage getMoreEvent() {
            YorkMoreEventMessage yorkMoreEventMessage = this.moreEvent_;
            return yorkMoreEventMessage == null ? YorkMoreEventMessage.getDefaultInstance() : yorkMoreEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkNotifyEventMessage getNotifyEvent() {
            YorkNotifyEventMessage yorkNotifyEventMessage = this.notifyEvent_;
            return yorkNotifyEventMessage == null ? YorkNotifyEventMessage.getDefaultInstance() : yorkNotifyEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkShortcutEventMessage getShortcutLess10S() {
            YorkShortcutEventMessage yorkShortcutEventMessage = this.shortcutLess10S_;
            return yorkShortcutEventMessage == null ? YorkShortcutEventMessage.getDefaultInstance() : yorkShortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkShortcutEventMessage getShortcutLess3S() {
            YorkShortcutEventMessage yorkShortcutEventMessage = this.shortcutLess3S_;
            return yorkShortcutEventMessage == null ? YorkShortcutEventMessage.getDefaultInstance() : yorkShortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkShortcutEventMessage getShortcutLess5S() {
            YorkShortcutEventMessage yorkShortcutEventMessage = this.shortcutLess5S_;
            return yorkShortcutEventMessage == null ? YorkShortcutEventMessage.getDefaultInstance() : yorkShortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkShortcutEventMessage getShortcutLess8S() {
            YorkShortcutEventMessage yorkShortcutEventMessage = this.shortcutLess8S_;
            return yorkShortcutEventMessage == null ? YorkShortcutEventMessage.getDefaultInstance() : yorkShortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkShortcutEventMessage getShortcutLessOther() {
            YorkShortcutEventMessage yorkShortcutEventMessage = this.shortcutLessOther_;
            return yorkShortcutEventMessage == null ? YorkShortcutEventMessage.getDefaultInstance() : yorkShortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkSportEventMessage getSportEvent() {
            YorkSportEventMessage yorkSportEventMessage = this.sportEvent_;
            return yorkSportEventMessage == null ? YorkSportEventMessage.getDefaultInstance() : yorkSportEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public YorkXiaoaiEventMessage getXiaoaiEvent() {
            YorkXiaoaiEventMessage yorkXiaoaiEventMessage = this.xiaoaiEvent_;
            return yorkXiaoaiEventMessage == null ? YorkXiaoaiEventMessage.getDefaultInstance() : yorkXiaoaiEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasAlexaEvent() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasBloodoxygenEvent() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasDialEvent() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasEventByDial() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasEventByMenu() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasEventByShortcut() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasLcdEvent() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasMoreEvent() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasNotifyEvent() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasShortcutLess10S() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasShortcutLess3S() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasShortcutLess5S() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasShortcutLess8S() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasShortcutLessOther() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasSportEvent() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkStatisticsMessageOrBuilder
        public boolean hasXiaoaiEvent() {
            return (this.bitField0_ & 256) != 0;
        }

        public static Builder newBuilder(YorkStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        YorkAlexaEventMessage getAlexaEvent();

        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        YorkBloodoxygenEventMessage getBloodoxygenEvent();

        YorkDialEventMessage getDialEvent();

        int getDialId();

        YorkMenuEventMessage getEventByDial();

        YorkMenuEventMessage getEventByMenu();

        YorkMenuEventMessage getEventByShortcut();

        YorkLcdEventMessage getLcdEvent();

        YorkMoreEventMessage getMoreEvent();

        YorkNotifyEventMessage getNotifyEvent();

        YorkShortcutEventMessage getShortcutLess10S();

        YorkShortcutEventMessage getShortcutLess3S();

        YorkShortcutEventMessage getShortcutLess5S();

        YorkShortcutEventMessage getShortcutLess8S();

        YorkShortcutEventMessage getShortcutLessOther();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        YorkSportEventMessage getSportEvent();

        YorkXiaoaiEventMessage getXiaoaiEvent();

        boolean hasAlexaEvent();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasBloodoxygenEvent();

        boolean hasDialEvent();

        boolean hasDialId();

        boolean hasEventByDial();

        boolean hasEventByMenu();

        boolean hasEventByShortcut();

        boolean hasLcdEvent();

        boolean hasMoreEvent();

        boolean hasNotifyEvent();

        boolean hasShortcutLess10S();

        boolean hasShortcutLess3S();

        boolean hasShortcutLess5S();

        boolean hasShortcutLess8S();

        boolean hasShortcutLessOther();

        boolean hasSilenceMode();

        boolean hasSportEvent();

        boolean hasXiaoaiEvent();
    }

    public static final class YorkXiaoaiEventMessage extends GeneratedMessageLite<YorkXiaoaiEventMessage, Builder> implements YorkXiaoaiEventMessageOrBuilder {
        private static final YorkXiaoaiEventMessage DEFAULT_INSTANCE;
        public static final int GUIDANCEPAGE_FIELD_NUMBER = 6;
        public static final int IDENTIFYFAILPAGE_FIELD_NUMBER = 5;
        public static final int IDENTIFYSUCCPAGE_FIELD_NUMBER = 3;
        public static final int LINKFAIL_FIELD_NUMBER = 2;
        private static volatile Parser<YorkXiaoaiEventMessage> PARSER = null;
        public static final int UNAUTHORIZED_FIELD_NUMBER = 4;
        public static final int XIAOAIPAGE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int guidancePage_;
        private int identifyFailPage_;
        private int identifySuccPage_;
        private int linkFail_;
        private byte memoizedIsInitialized = 2;
        private int unauthorized_;
        private int xiaoaiPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<YorkXiaoaiEventMessage, Builder> implements YorkXiaoaiEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearGuidancePage() {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).clearGuidancePage();
                return this;
            }

            public Builder clearIdentifyFailPage() {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).clearIdentifyFailPage();
                return this;
            }

            public Builder clearIdentifySuccPage() {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).clearIdentifySuccPage();
                return this;
            }

            public Builder clearLinkFail() {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).clearLinkFail();
                return this;
            }

            public Builder clearUnauthorized() {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).clearUnauthorized();
                return this;
            }

            public Builder clearXiaoaiPage() {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).clearXiaoaiPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public int getGuidancePage() {
                return ((YorkXiaoaiEventMessage) this.instance).getGuidancePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public int getIdentifyFailPage() {
                return ((YorkXiaoaiEventMessage) this.instance).getIdentifyFailPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public int getIdentifySuccPage() {
                return ((YorkXiaoaiEventMessage) this.instance).getIdentifySuccPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public int getLinkFail() {
                return ((YorkXiaoaiEventMessage) this.instance).getLinkFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public int getUnauthorized() {
                return ((YorkXiaoaiEventMessage) this.instance).getUnauthorized();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public int getXiaoaiPage() {
                return ((YorkXiaoaiEventMessage) this.instance).getXiaoaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public boolean hasGuidancePage() {
                return ((YorkXiaoaiEventMessage) this.instance).hasGuidancePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public boolean hasIdentifyFailPage() {
                return ((YorkXiaoaiEventMessage) this.instance).hasIdentifyFailPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public boolean hasIdentifySuccPage() {
                return ((YorkXiaoaiEventMessage) this.instance).hasIdentifySuccPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public boolean hasLinkFail() {
                return ((YorkXiaoaiEventMessage) this.instance).hasLinkFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public boolean hasUnauthorized() {
                return ((YorkXiaoaiEventMessage) this.instance).hasUnauthorized();
            }

            @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
            public boolean hasXiaoaiPage() {
                return ((YorkXiaoaiEventMessage) this.instance).hasXiaoaiPage();
            }

            public Builder setGuidancePage(int value) {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).setGuidancePage(value);
                return this;
            }

            public Builder setIdentifyFailPage(int value) {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).setIdentifyFailPage(value);
                return this;
            }

            public Builder setIdentifySuccPage(int value) {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).setIdentifySuccPage(value);
                return this;
            }

            public Builder setLinkFail(int value) {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).setLinkFail(value);
                return this;
            }

            public Builder setUnauthorized(int value) {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).setUnauthorized(value);
                return this;
            }

            public Builder setXiaoaiPage(int value) {
                copyOnWrite();
                ((YorkXiaoaiEventMessage) this.instance).setXiaoaiPage(value);
                return this;
            }

            private Builder() {
                super(YorkXiaoaiEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            YorkXiaoaiEventMessage yorkXiaoaiEventMessage = new YorkXiaoaiEventMessage();
            DEFAULT_INSTANCE = yorkXiaoaiEventMessage;
            GeneratedMessageLite.registerDefaultInstance(YorkXiaoaiEventMessage.class, yorkXiaoaiEventMessage);
        }

        private YorkXiaoaiEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuidancePage() {
            this.bitField0_ &= -33;
            this.guidancePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifyFailPage() {
            this.bitField0_ &= -17;
            this.identifyFailPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifySuccPage() {
            this.bitField0_ &= -5;
            this.identifySuccPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinkFail() {
            this.bitField0_ &= -3;
            this.linkFail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnauthorized() {
            this.bitField0_ &= -9;
            this.unauthorized_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXiaoaiPage() {
            this.bitField0_ &= -2;
            this.xiaoaiPage_ = 0;
        }

        public static YorkXiaoaiEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static YorkXiaoaiEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkXiaoaiEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<YorkXiaoaiEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuidancePage(int value) {
            this.bitField0_ |= 32;
            this.guidancePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifyFailPage(int value) {
            this.bitField0_ |= 16;
            this.identifyFailPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifySuccPage(int value) {
            this.bitField0_ |= 4;
            this.identifySuccPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkFail(int value) {
            this.bitField0_ |= 2;
            this.linkFail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnauthorized(int value) {
            this.bitField0_ |= 8;
            this.unauthorized_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXiaoaiPage(int value) {
            this.bitField0_ |= 1;
            this.xiaoaiPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new YorkXiaoaiEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005", new Object[]{"bitField0_", "xiaoaiPage_", "linkFail_", "identifySuccPage_", "unauthorized_", "identifyFailPage_", "guidancePage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<YorkXiaoaiEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (YorkXiaoaiEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public int getGuidancePage() {
            return this.guidancePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public int getIdentifyFailPage() {
            return this.identifyFailPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public int getIdentifySuccPage() {
            return this.identifySuccPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public int getLinkFail() {
            return this.linkFail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public int getUnauthorized() {
            return this.unauthorized_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public int getXiaoaiPage() {
            return this.xiaoaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public boolean hasGuidancePage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public boolean hasIdentifyFailPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public boolean hasIdentifySuccPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public boolean hasLinkFail() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public boolean hasUnauthorized() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.York.YorkXiaoaiEventMessageOrBuilder
        public boolean hasXiaoaiPage() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(YorkXiaoaiEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static YorkXiaoaiEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkXiaoaiEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkXiaoaiEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkXiaoaiEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkXiaoaiEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static YorkXiaoaiEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static YorkXiaoaiEventMessage parseFrom(InputStream input) throws IOException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkXiaoaiEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static YorkXiaoaiEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static YorkXiaoaiEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (YorkXiaoaiEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface YorkXiaoaiEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getGuidancePage();

        int getIdentifyFailPage();

        int getIdentifySuccPage();

        int getLinkFail();

        int getUnauthorized();

        int getXiaoaiPage();

        boolean hasGuidancePage();

        boolean hasIdentifyFailPage();

        boolean hasIdentifySuccPage();

        boolean hasLinkFail();

        boolean hasUnauthorized();

        boolean hasXiaoaiPage();
    }

    private York() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
