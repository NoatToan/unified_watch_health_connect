package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.j;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.bsf;
import defpackage.vkh;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class AlipayEvent {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.AlipayEvent$1, reason: invalid class name */
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

    public static final class CincoAlipayEventMessage extends GeneratedMessageLite<CincoAlipayEventMessage, Builder> implements CincoAlipayEventMessageOrBuilder {
        public static final int ALIPAYCODELEAVE10S_FIELD_NUMBER = 58;
        public static final int ALIPAYCODELEAVE11S_FIELD_NUMBER = 59;
        public static final int ALIPAYCODELEAVE12S_FIELD_NUMBER = 60;
        public static final int ALIPAYCODELEAVE13S_FIELD_NUMBER = 61;
        public static final int ALIPAYCODELEAVE14S_FIELD_NUMBER = 62;
        public static final int ALIPAYCODELEAVE15S_FIELD_NUMBER = 63;
        public static final int ALIPAYCODELEAVE16S_FIELD_NUMBER = 64;
        public static final int ALIPAYCODELEAVE17S_FIELD_NUMBER = 65;
        public static final int ALIPAYCODELEAVE18S_FIELD_NUMBER = 66;
        public static final int ALIPAYCODELEAVE19S_FIELD_NUMBER = 67;
        public static final int ALIPAYCODELEAVE1S5_FIELD_NUMBER = 41;
        public static final int ALIPAYCODELEAVE1S_FIELD_NUMBER = 40;
        public static final int ALIPAYCODELEAVE20S_FIELD_NUMBER = 68;
        public static final int ALIPAYCODELEAVE21S_FIELD_NUMBER = 69;
        public static final int ALIPAYCODELEAVE22S_FIELD_NUMBER = 70;
        public static final int ALIPAYCODELEAVE23S_FIELD_NUMBER = 71;
        public static final int ALIPAYCODELEAVE24S_FIELD_NUMBER = 72;
        public static final int ALIPAYCODELEAVE25S_FIELD_NUMBER = 73;
        public static final int ALIPAYCODELEAVE26S_FIELD_NUMBER = 74;
        public static final int ALIPAYCODELEAVE27S_FIELD_NUMBER = 75;
        public static final int ALIPAYCODELEAVE28S_FIELD_NUMBER = 76;
        public static final int ALIPAYCODELEAVE29S_FIELD_NUMBER = 77;
        public static final int ALIPAYCODELEAVE2S5_FIELD_NUMBER = 43;
        public static final int ALIPAYCODELEAVE2S_FIELD_NUMBER = 42;
        public static final int ALIPAYCODELEAVE30S_FIELD_NUMBER = 78;
        public static final int ALIPAYCODELEAVE3S5_FIELD_NUMBER = 45;
        public static final int ALIPAYCODELEAVE3S_FIELD_NUMBER = 44;
        public static final int ALIPAYCODELEAVE4S5_FIELD_NUMBER = 47;
        public static final int ALIPAYCODELEAVE4S_FIELD_NUMBER = 46;
        public static final int ALIPAYCODELEAVE5S5_FIELD_NUMBER = 49;
        public static final int ALIPAYCODELEAVE5S_FIELD_NUMBER = 48;
        public static final int ALIPAYCODELEAVE6S5_FIELD_NUMBER = 51;
        public static final int ALIPAYCODELEAVE6S_FIELD_NUMBER = 50;
        public static final int ALIPAYCODELEAVE7S5_FIELD_NUMBER = 53;
        public static final int ALIPAYCODELEAVE7S_FIELD_NUMBER = 52;
        public static final int ALIPAYCODELEAVE8S5_FIELD_NUMBER = 55;
        public static final int ALIPAYCODELEAVE8S_FIELD_NUMBER = 54;
        public static final int ALIPAYCODELEAVE9S5_FIELD_NUMBER = 57;
        public static final int ALIPAYCODELEAVE9S_FIELD_NUMBER = 56;
        public static final int ALIPAYQRLEAVE10S_FIELD_NUMBER = 19;
        public static final int ALIPAYQRLEAVE11S_FIELD_NUMBER = 20;
        public static final int ALIPAYQRLEAVE12S_FIELD_NUMBER = 21;
        public static final int ALIPAYQRLEAVE13S_FIELD_NUMBER = 22;
        public static final int ALIPAYQRLEAVE14S_FIELD_NUMBER = 23;
        public static final int ALIPAYQRLEAVE15S_FIELD_NUMBER = 24;
        public static final int ALIPAYQRLEAVE16S_FIELD_NUMBER = 25;
        public static final int ALIPAYQRLEAVE17S_FIELD_NUMBER = 26;
        public static final int ALIPAYQRLEAVE18S_FIELD_NUMBER = 27;
        public static final int ALIPAYQRLEAVE19S_FIELD_NUMBER = 28;
        public static final int ALIPAYQRLEAVE1S5_FIELD_NUMBER = 2;
        public static final int ALIPAYQRLEAVE1S_FIELD_NUMBER = 1;
        public static final int ALIPAYQRLEAVE20S_FIELD_NUMBER = 29;
        public static final int ALIPAYQRLEAVE21S_FIELD_NUMBER = 30;
        public static final int ALIPAYQRLEAVE22S_FIELD_NUMBER = 31;
        public static final int ALIPAYQRLEAVE23S_FIELD_NUMBER = 32;
        public static final int ALIPAYQRLEAVE24S_FIELD_NUMBER = 33;
        public static final int ALIPAYQRLEAVE25S_FIELD_NUMBER = 34;
        public static final int ALIPAYQRLEAVE26S_FIELD_NUMBER = 35;
        public static final int ALIPAYQRLEAVE27S_FIELD_NUMBER = 36;
        public static final int ALIPAYQRLEAVE28S_FIELD_NUMBER = 37;
        public static final int ALIPAYQRLEAVE29S_FIELD_NUMBER = 38;
        public static final int ALIPAYQRLEAVE2S5_FIELD_NUMBER = 4;
        public static final int ALIPAYQRLEAVE2S_FIELD_NUMBER = 3;
        public static final int ALIPAYQRLEAVE30S_FIELD_NUMBER = 39;
        public static final int ALIPAYQRLEAVE3S5_FIELD_NUMBER = 6;
        public static final int ALIPAYQRLEAVE3S_FIELD_NUMBER = 5;
        public static final int ALIPAYQRLEAVE4S5_FIELD_NUMBER = 8;
        public static final int ALIPAYQRLEAVE4S_FIELD_NUMBER = 7;
        public static final int ALIPAYQRLEAVE5S5_FIELD_NUMBER = 10;
        public static final int ALIPAYQRLEAVE5S_FIELD_NUMBER = 9;
        public static final int ALIPAYQRLEAVE6S5_FIELD_NUMBER = 12;
        public static final int ALIPAYQRLEAVE6S_FIELD_NUMBER = 11;
        public static final int ALIPAYQRLEAVE7S5_FIELD_NUMBER = 14;
        public static final int ALIPAYQRLEAVE7S_FIELD_NUMBER = 13;
        public static final int ALIPAYQRLEAVE8S5_FIELD_NUMBER = 16;
        public static final int ALIPAYQRLEAVE8S_FIELD_NUMBER = 15;
        public static final int ALIPAYQRLEAVE9S5_FIELD_NUMBER = 18;
        public static final int ALIPAYQRLEAVE9S_FIELD_NUMBER = 17;
        private static final CincoAlipayEventMessage DEFAULT_INSTANCE;
        private static volatile vkh<CincoAlipayEventMessage> PARSER;
        private int alipayCodeLeave10S_;
        private int alipayCodeLeave11S_;
        private int alipayCodeLeave12S_;
        private int alipayCodeLeave13S_;
        private int alipayCodeLeave14S_;
        private int alipayCodeLeave15S_;
        private int alipayCodeLeave16S_;
        private int alipayCodeLeave17S_;
        private int alipayCodeLeave18S_;
        private int alipayCodeLeave19S_;
        private int alipayCodeLeave1S5_;
        private int alipayCodeLeave1S_;
        private int alipayCodeLeave20S_;
        private int alipayCodeLeave21S_;
        private int alipayCodeLeave22S_;
        private int alipayCodeLeave23S_;
        private int alipayCodeLeave24S_;
        private int alipayCodeLeave25S_;
        private int alipayCodeLeave26S_;
        private int alipayCodeLeave27S_;
        private int alipayCodeLeave28S_;
        private int alipayCodeLeave29S_;
        private int alipayCodeLeave2S5_;
        private int alipayCodeLeave2S_;
        private int alipayCodeLeave30S_;
        private int alipayCodeLeave3S5_;
        private int alipayCodeLeave3S_;
        private int alipayCodeLeave4S5_;
        private int alipayCodeLeave4S_;
        private int alipayCodeLeave5S5_;
        private int alipayCodeLeave5S_;
        private int alipayCodeLeave6S5_;
        private int alipayCodeLeave6S_;
        private int alipayCodeLeave7S5_;
        private int alipayCodeLeave7S_;
        private int alipayCodeLeave8S5_;
        private int alipayCodeLeave8S_;
        private int alipayCodeLeave9S5_;
        private int alipayCodeLeave9S_;
        private int alipayQRLeave10S_;
        private int alipayQRLeave11S_;
        private int alipayQRLeave12S_;
        private int alipayQRLeave13S_;
        private int alipayQRLeave14S_;
        private int alipayQRLeave15S_;
        private int alipayQRLeave16S_;
        private int alipayQRLeave17S_;
        private int alipayQRLeave18S_;
        private int alipayQRLeave19S_;
        private int alipayQRLeave1S5_;
        private int alipayQRLeave1S_;
        private int alipayQRLeave20S_;
        private int alipayQRLeave21S_;
        private int alipayQRLeave22S_;
        private int alipayQRLeave23S_;
        private int alipayQRLeave24S_;
        private int alipayQRLeave25S_;
        private int alipayQRLeave26S_;
        private int alipayQRLeave27S_;
        private int alipayQRLeave28S_;
        private int alipayQRLeave29S_;
        private int alipayQRLeave2S5_;
        private int alipayQRLeave2S_;
        private int alipayQRLeave30S_;
        private int alipayQRLeave3S5_;
        private int alipayQRLeave3S_;
        private int alipayQRLeave4S5_;
        private int alipayQRLeave4S_;
        private int alipayQRLeave5S5_;
        private int alipayQRLeave5S_;
        private int alipayQRLeave6S5_;
        private int alipayQRLeave6S_;
        private int alipayQRLeave7S5_;
        private int alipayQRLeave7S_;
        private int alipayQRLeave8S5_;
        private int alipayQRLeave8S_;
        private int alipayQRLeave9S5_;
        private int alipayQRLeave9S_;
        private int bitField0_;
        private int bitField1_;
        private int bitField2_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.a<CincoAlipayEventMessage, Builder> implements CincoAlipayEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlipayCodeLeave10S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave10S();
                return this;
            }

            public Builder clearAlipayCodeLeave11S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave11S();
                return this;
            }

            public Builder clearAlipayCodeLeave12S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave12S();
                return this;
            }

            public Builder clearAlipayCodeLeave13S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave13S();
                return this;
            }

            public Builder clearAlipayCodeLeave14S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave14S();
                return this;
            }

            public Builder clearAlipayCodeLeave15S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave15S();
                return this;
            }

            public Builder clearAlipayCodeLeave16S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave16S();
                return this;
            }

            public Builder clearAlipayCodeLeave17S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave17S();
                return this;
            }

            public Builder clearAlipayCodeLeave18S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave18S();
                return this;
            }

            public Builder clearAlipayCodeLeave19S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave19S();
                return this;
            }

            public Builder clearAlipayCodeLeave1S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave1S();
                return this;
            }

            public Builder clearAlipayCodeLeave1S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave1S5();
                return this;
            }

            public Builder clearAlipayCodeLeave20S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave20S();
                return this;
            }

            public Builder clearAlipayCodeLeave21S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave21S();
                return this;
            }

            public Builder clearAlipayCodeLeave22S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave22S();
                return this;
            }

            public Builder clearAlipayCodeLeave23S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave23S();
                return this;
            }

            public Builder clearAlipayCodeLeave24S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave24S();
                return this;
            }

            public Builder clearAlipayCodeLeave25S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave25S();
                return this;
            }

            public Builder clearAlipayCodeLeave26S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave26S();
                return this;
            }

            public Builder clearAlipayCodeLeave27S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave27S();
                return this;
            }

            public Builder clearAlipayCodeLeave28S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave28S();
                return this;
            }

            public Builder clearAlipayCodeLeave29S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave29S();
                return this;
            }

            public Builder clearAlipayCodeLeave2S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave2S();
                return this;
            }

            public Builder clearAlipayCodeLeave2S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave2S5();
                return this;
            }

            public Builder clearAlipayCodeLeave30S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave30S();
                return this;
            }

            public Builder clearAlipayCodeLeave3S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave3S();
                return this;
            }

            public Builder clearAlipayCodeLeave3S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave3S5();
                return this;
            }

            public Builder clearAlipayCodeLeave4S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave4S();
                return this;
            }

            public Builder clearAlipayCodeLeave4S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave4S5();
                return this;
            }

            public Builder clearAlipayCodeLeave5S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave5S();
                return this;
            }

            public Builder clearAlipayCodeLeave5S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave5S5();
                return this;
            }

            public Builder clearAlipayCodeLeave6S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave6S();
                return this;
            }

            public Builder clearAlipayCodeLeave6S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave6S5();
                return this;
            }

            public Builder clearAlipayCodeLeave7S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave7S();
                return this;
            }

            public Builder clearAlipayCodeLeave7S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave7S5();
                return this;
            }

            public Builder clearAlipayCodeLeave8S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave8S();
                return this;
            }

            public Builder clearAlipayCodeLeave8S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave8S5();
                return this;
            }

            public Builder clearAlipayCodeLeave9S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave9S();
                return this;
            }

            public Builder clearAlipayCodeLeave9S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayCodeLeave9S5();
                return this;
            }

            public Builder clearAlipayQRLeave10S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave10S();
                return this;
            }

            public Builder clearAlipayQRLeave11S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave11S();
                return this;
            }

            public Builder clearAlipayQRLeave12S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave12S();
                return this;
            }

            public Builder clearAlipayQRLeave13S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave13S();
                return this;
            }

            public Builder clearAlipayQRLeave14S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave14S();
                return this;
            }

            public Builder clearAlipayQRLeave15S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave15S();
                return this;
            }

            public Builder clearAlipayQRLeave16S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave16S();
                return this;
            }

            public Builder clearAlipayQRLeave17S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave17S();
                return this;
            }

            public Builder clearAlipayQRLeave18S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave18S();
                return this;
            }

            public Builder clearAlipayQRLeave19S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave19S();
                return this;
            }

            public Builder clearAlipayQRLeave1S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave1S();
                return this;
            }

            public Builder clearAlipayQRLeave1S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave1S5();
                return this;
            }

            public Builder clearAlipayQRLeave20S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave20S();
                return this;
            }

            public Builder clearAlipayQRLeave21S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave21S();
                return this;
            }

            public Builder clearAlipayQRLeave22S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave22S();
                return this;
            }

            public Builder clearAlipayQRLeave23S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave23S();
                return this;
            }

            public Builder clearAlipayQRLeave24S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave24S();
                return this;
            }

            public Builder clearAlipayQRLeave25S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave25S();
                return this;
            }

            public Builder clearAlipayQRLeave26S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave26S();
                return this;
            }

            public Builder clearAlipayQRLeave27S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave27S();
                return this;
            }

            public Builder clearAlipayQRLeave28S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave28S();
                return this;
            }

            public Builder clearAlipayQRLeave29S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave29S();
                return this;
            }

            public Builder clearAlipayQRLeave2S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave2S();
                return this;
            }

            public Builder clearAlipayQRLeave2S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave2S5();
                return this;
            }

            public Builder clearAlipayQRLeave30S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave30S();
                return this;
            }

            public Builder clearAlipayQRLeave3S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave3S();
                return this;
            }

            public Builder clearAlipayQRLeave3S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave3S5();
                return this;
            }

            public Builder clearAlipayQRLeave4S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave4S();
                return this;
            }

            public Builder clearAlipayQRLeave4S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave4S5();
                return this;
            }

            public Builder clearAlipayQRLeave5S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave5S();
                return this;
            }

            public Builder clearAlipayQRLeave5S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave5S5();
                return this;
            }

            public Builder clearAlipayQRLeave6S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave6S();
                return this;
            }

            public Builder clearAlipayQRLeave6S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave6S5();
                return this;
            }

            public Builder clearAlipayQRLeave7S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave7S();
                return this;
            }

            public Builder clearAlipayQRLeave7S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave7S5();
                return this;
            }

            public Builder clearAlipayQRLeave8S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave8S();
                return this;
            }

            public Builder clearAlipayQRLeave8S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave8S5();
                return this;
            }

            public Builder clearAlipayQRLeave9S() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave9S();
                return this;
            }

            public Builder clearAlipayQRLeave9S5() {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).clearAlipayQRLeave9S5();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave10S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave11S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave11S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave12S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave12S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave13S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave13S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave14S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave14S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave15S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave15S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave16S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave16S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave17S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave17S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave18S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave18S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave19S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave19S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave1S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave1S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave1S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave1S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave20S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave20S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave21S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave21S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave22S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave22S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave23S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave23S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave24S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave24S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave25S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave25S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave26S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave26S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave27S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave27S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave28S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave28S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave29S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave29S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave2S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave2S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave2S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave2S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave30S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave30S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave3S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave3S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave3S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave4S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave4S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave4S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave4S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave5S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave5S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave5S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave6S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave6S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave6S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave6S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave7S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave7S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave7S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave7S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave8S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave8S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave8S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave8S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave9S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave9S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayCodeLeave9S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayCodeLeave9S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave10S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave11S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave11S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave12S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave12S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave13S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave13S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave14S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave14S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave15S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave15S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave16S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave16S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave17S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave17S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave18S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave18S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave19S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave19S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave1S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave1S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave1S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave1S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave20S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave20S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave21S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave21S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave22S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave22S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave23S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave23S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave24S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave24S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave25S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave25S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave26S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave26S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave27S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave27S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave28S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave28S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave29S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave29S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave2S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave2S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave2S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave2S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave30S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave30S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave3S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave3S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave3S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave4S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave4S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave4S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave4S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave5S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave5S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave5S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave6S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave6S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave6S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave6S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave7S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave7S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave7S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave7S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave8S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave8S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave8S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave8S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave9S() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave9S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public int getAlipayQRLeave9S5() {
                return ((CincoAlipayEventMessage) this.instance).getAlipayQRLeave9S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave10S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave11S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave11S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave12S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave12S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave13S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave13S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave14S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave14S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave15S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave15S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave16S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave16S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave17S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave17S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave18S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave18S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave19S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave19S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave1S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave1S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave1S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave1S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave20S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave20S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave21S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave21S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave22S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave22S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave23S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave23S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave24S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave24S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave25S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave25S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave26S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave26S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave27S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave27S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave28S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave28S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave29S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave29S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave2S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave2S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave2S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave2S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave30S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave30S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave3S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave3S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave3S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave4S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave4S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave4S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave4S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave5S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave5S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave5S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave6S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave6S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave6S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave6S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave7S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave7S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave7S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave7S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave8S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave8S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave8S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave8S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave9S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave9S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayCodeLeave9S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayCodeLeave9S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave10S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave11S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave11S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave12S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave12S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave13S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave13S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave14S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave14S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave15S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave15S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave16S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave16S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave17S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave17S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave18S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave18S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave19S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave19S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave1S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave1S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave1S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave1S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave20S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave20S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave21S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave21S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave22S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave22S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave23S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave23S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave24S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave24S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave25S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave25S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave26S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave26S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave27S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave27S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave28S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave28S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave29S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave29S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave2S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave2S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave2S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave2S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave30S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave30S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave3S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave3S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave3S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave4S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave4S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave4S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave4S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave5S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave5S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave5S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave6S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave6S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave6S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave6S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave7S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave7S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave7S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave7S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave8S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave8S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave8S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave8S5();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave9S() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave9S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
            public boolean hasAlipayQRLeave9S5() {
                return ((CincoAlipayEventMessage) this.instance).hasAlipayQRLeave9S5();
            }

            public Builder setAlipayCodeLeave10S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave10S(i);
                return this;
            }

            public Builder setAlipayCodeLeave11S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave11S(i);
                return this;
            }

            public Builder setAlipayCodeLeave12S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave12S(i);
                return this;
            }

            public Builder setAlipayCodeLeave13S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave13S(i);
                return this;
            }

            public Builder setAlipayCodeLeave14S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave14S(i);
                return this;
            }

            public Builder setAlipayCodeLeave15S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave15S(i);
                return this;
            }

            public Builder setAlipayCodeLeave16S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave16S(i);
                return this;
            }

            public Builder setAlipayCodeLeave17S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave17S(i);
                return this;
            }

            public Builder setAlipayCodeLeave18S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave18S(i);
                return this;
            }

            public Builder setAlipayCodeLeave19S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave19S(i);
                return this;
            }

            public Builder setAlipayCodeLeave1S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave1S(i);
                return this;
            }

            public Builder setAlipayCodeLeave1S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave1S5(i);
                return this;
            }

            public Builder setAlipayCodeLeave20S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave20S(i);
                return this;
            }

            public Builder setAlipayCodeLeave21S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave21S(i);
                return this;
            }

            public Builder setAlipayCodeLeave22S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave22S(i);
                return this;
            }

            public Builder setAlipayCodeLeave23S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave23S(i);
                return this;
            }

            public Builder setAlipayCodeLeave24S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave24S(i);
                return this;
            }

            public Builder setAlipayCodeLeave25S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave25S(i);
                return this;
            }

            public Builder setAlipayCodeLeave26S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave26S(i);
                return this;
            }

            public Builder setAlipayCodeLeave27S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave27S(i);
                return this;
            }

            public Builder setAlipayCodeLeave28S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave28S(i);
                return this;
            }

            public Builder setAlipayCodeLeave29S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave29S(i);
                return this;
            }

            public Builder setAlipayCodeLeave2S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave2S(i);
                return this;
            }

            public Builder setAlipayCodeLeave2S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave2S5(i);
                return this;
            }

            public Builder setAlipayCodeLeave30S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave30S(i);
                return this;
            }

            public Builder setAlipayCodeLeave3S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave3S(i);
                return this;
            }

            public Builder setAlipayCodeLeave3S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave3S5(i);
                return this;
            }

            public Builder setAlipayCodeLeave4S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave4S(i);
                return this;
            }

            public Builder setAlipayCodeLeave4S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave4S5(i);
                return this;
            }

            public Builder setAlipayCodeLeave5S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave5S(i);
                return this;
            }

            public Builder setAlipayCodeLeave5S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave5S5(i);
                return this;
            }

            public Builder setAlipayCodeLeave6S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave6S(i);
                return this;
            }

            public Builder setAlipayCodeLeave6S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave6S5(i);
                return this;
            }

            public Builder setAlipayCodeLeave7S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave7S(i);
                return this;
            }

            public Builder setAlipayCodeLeave7S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave7S5(i);
                return this;
            }

            public Builder setAlipayCodeLeave8S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave8S(i);
                return this;
            }

            public Builder setAlipayCodeLeave8S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave8S5(i);
                return this;
            }

            public Builder setAlipayCodeLeave9S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave9S(i);
                return this;
            }

            public Builder setAlipayCodeLeave9S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayCodeLeave9S5(i);
                return this;
            }

            public Builder setAlipayQRLeave10S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave10S(i);
                return this;
            }

            public Builder setAlipayQRLeave11S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave11S(i);
                return this;
            }

            public Builder setAlipayQRLeave12S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave12S(i);
                return this;
            }

            public Builder setAlipayQRLeave13S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave13S(i);
                return this;
            }

            public Builder setAlipayQRLeave14S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave14S(i);
                return this;
            }

            public Builder setAlipayQRLeave15S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave15S(i);
                return this;
            }

            public Builder setAlipayQRLeave16S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave16S(i);
                return this;
            }

            public Builder setAlipayQRLeave17S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave17S(i);
                return this;
            }

            public Builder setAlipayQRLeave18S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave18S(i);
                return this;
            }

            public Builder setAlipayQRLeave19S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave19S(i);
                return this;
            }

            public Builder setAlipayQRLeave1S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave1S(i);
                return this;
            }

            public Builder setAlipayQRLeave1S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave1S5(i);
                return this;
            }

            public Builder setAlipayQRLeave20S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave20S(i);
                return this;
            }

            public Builder setAlipayQRLeave21S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave21S(i);
                return this;
            }

            public Builder setAlipayQRLeave22S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave22S(i);
                return this;
            }

            public Builder setAlipayQRLeave23S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave23S(i);
                return this;
            }

            public Builder setAlipayQRLeave24S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave24S(i);
                return this;
            }

            public Builder setAlipayQRLeave25S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave25S(i);
                return this;
            }

            public Builder setAlipayQRLeave26S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave26S(i);
                return this;
            }

            public Builder setAlipayQRLeave27S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave27S(i);
                return this;
            }

            public Builder setAlipayQRLeave28S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave28S(i);
                return this;
            }

            public Builder setAlipayQRLeave29S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave29S(i);
                return this;
            }

            public Builder setAlipayQRLeave2S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave2S(i);
                return this;
            }

            public Builder setAlipayQRLeave2S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave2S5(i);
                return this;
            }

            public Builder setAlipayQRLeave30S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave30S(i);
                return this;
            }

            public Builder setAlipayQRLeave3S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave3S(i);
                return this;
            }

            public Builder setAlipayQRLeave3S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave3S5(i);
                return this;
            }

            public Builder setAlipayQRLeave4S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave4S(i);
                return this;
            }

            public Builder setAlipayQRLeave4S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave4S5(i);
                return this;
            }

            public Builder setAlipayQRLeave5S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave5S(i);
                return this;
            }

            public Builder setAlipayQRLeave5S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave5S5(i);
                return this;
            }

            public Builder setAlipayQRLeave6S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave6S(i);
                return this;
            }

            public Builder setAlipayQRLeave6S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave6S5(i);
                return this;
            }

            public Builder setAlipayQRLeave7S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave7S(i);
                return this;
            }

            public Builder setAlipayQRLeave7S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave7S5(i);
                return this;
            }

            public Builder setAlipayQRLeave8S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave8S(i);
                return this;
            }

            public Builder setAlipayQRLeave8S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave8S5(i);
                return this;
            }

            public Builder setAlipayQRLeave9S(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave9S(i);
                return this;
            }

            public Builder setAlipayQRLeave9S5(int i) {
                copyOnWrite();
                ((CincoAlipayEventMessage) this.instance).setAlipayQRLeave9S5(i);
                return this;
            }

            private Builder() {
                super(CincoAlipayEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            CincoAlipayEventMessage cincoAlipayEventMessage = new CincoAlipayEventMessage();
            DEFAULT_INSTANCE = cincoAlipayEventMessage;
            GeneratedMessageLite.registerDefaultInstance(CincoAlipayEventMessage.class, cincoAlipayEventMessage);
        }

        private CincoAlipayEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave10S() {
            this.bitField1_ &= -33554433;
            this.alipayCodeLeave10S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave11S() {
            this.bitField1_ &= -67108865;
            this.alipayCodeLeave11S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave12S() {
            this.bitField1_ &= -134217729;
            this.alipayCodeLeave12S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave13S() {
            this.bitField1_ &= -268435457;
            this.alipayCodeLeave13S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave14S() {
            this.bitField1_ &= -536870913;
            this.alipayCodeLeave14S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave15S() {
            this.bitField1_ &= -1073741825;
            this.alipayCodeLeave15S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave16S() {
            this.bitField1_ &= Integer.MAX_VALUE;
            this.alipayCodeLeave16S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave17S() {
            this.bitField2_ &= -2;
            this.alipayCodeLeave17S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave18S() {
            this.bitField2_ &= -3;
            this.alipayCodeLeave18S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave19S() {
            this.bitField2_ &= -5;
            this.alipayCodeLeave19S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave1S() {
            this.bitField1_ &= -129;
            this.alipayCodeLeave1S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave1S5() {
            this.bitField1_ &= -257;
            this.alipayCodeLeave1S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave20S() {
            this.bitField2_ &= -9;
            this.alipayCodeLeave20S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave21S() {
            this.bitField2_ &= -17;
            this.alipayCodeLeave21S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave22S() {
            this.bitField2_ &= -33;
            this.alipayCodeLeave22S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave23S() {
            this.bitField2_ &= -65;
            this.alipayCodeLeave23S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave24S() {
            this.bitField2_ &= -129;
            this.alipayCodeLeave24S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave25S() {
            this.bitField2_ &= -257;
            this.alipayCodeLeave25S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave26S() {
            this.bitField2_ &= -513;
            this.alipayCodeLeave26S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave27S() {
            this.bitField2_ &= -1025;
            this.alipayCodeLeave27S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave28S() {
            this.bitField2_ &= -2049;
            this.alipayCodeLeave28S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave29S() {
            this.bitField2_ &= -4097;
            this.alipayCodeLeave29S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave2S() {
            this.bitField1_ &= -513;
            this.alipayCodeLeave2S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave2S5() {
            this.bitField1_ &= -1025;
            this.alipayCodeLeave2S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave30S() {
            this.bitField2_ &= -8193;
            this.alipayCodeLeave30S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave3S() {
            this.bitField1_ &= -2049;
            this.alipayCodeLeave3S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave3S5() {
            this.bitField1_ &= -4097;
            this.alipayCodeLeave3S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave4S() {
            this.bitField1_ &= -8193;
            this.alipayCodeLeave4S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave4S5() {
            this.bitField1_ &= -16385;
            this.alipayCodeLeave4S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave5S() {
            this.bitField1_ &= -32769;
            this.alipayCodeLeave5S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave5S5() {
            this.bitField1_ &= -65537;
            this.alipayCodeLeave5S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave6S() {
            this.bitField1_ &= -131073;
            this.alipayCodeLeave6S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave6S5() {
            this.bitField1_ &= -262145;
            this.alipayCodeLeave6S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave7S() {
            this.bitField1_ &= -524289;
            this.alipayCodeLeave7S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave7S5() {
            this.bitField1_ &= -1048577;
            this.alipayCodeLeave7S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave8S() {
            this.bitField1_ &= -2097153;
            this.alipayCodeLeave8S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave8S5() {
            this.bitField1_ &= -4194305;
            this.alipayCodeLeave8S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave9S() {
            this.bitField1_ &= -8388609;
            this.alipayCodeLeave9S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCodeLeave9S5() {
            this.bitField1_ &= -16777217;
            this.alipayCodeLeave9S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave10S() {
            this.bitField0_ &= -262145;
            this.alipayQRLeave10S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave11S() {
            this.bitField0_ &= -524289;
            this.alipayQRLeave11S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave12S() {
            this.bitField0_ &= -1048577;
            this.alipayQRLeave12S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave13S() {
            this.bitField0_ &= -2097153;
            this.alipayQRLeave13S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave14S() {
            this.bitField0_ &= -4194305;
            this.alipayQRLeave14S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave15S() {
            this.bitField0_ &= -8388609;
            this.alipayQRLeave15S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave16S() {
            this.bitField0_ &= -16777217;
            this.alipayQRLeave16S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave17S() {
            this.bitField0_ &= -33554433;
            this.alipayQRLeave17S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave18S() {
            this.bitField0_ &= -67108865;
            this.alipayQRLeave18S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave19S() {
            this.bitField0_ &= -134217729;
            this.alipayQRLeave19S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave1S() {
            this.bitField0_ &= -2;
            this.alipayQRLeave1S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave1S5() {
            this.bitField0_ &= -3;
            this.alipayQRLeave1S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave20S() {
            this.bitField0_ &= -268435457;
            this.alipayQRLeave20S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave21S() {
            this.bitField0_ &= -536870913;
            this.alipayQRLeave21S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave22S() {
            this.bitField0_ &= -1073741825;
            this.alipayQRLeave22S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave23S() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.alipayQRLeave23S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave24S() {
            this.bitField1_ &= -2;
            this.alipayQRLeave24S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave25S() {
            this.bitField1_ &= -3;
            this.alipayQRLeave25S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave26S() {
            this.bitField1_ &= -5;
            this.alipayQRLeave26S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave27S() {
            this.bitField1_ &= -9;
            this.alipayQRLeave27S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave28S() {
            this.bitField1_ &= -17;
            this.alipayQRLeave28S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave29S() {
            this.bitField1_ &= -33;
            this.alipayQRLeave29S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave2S() {
            this.bitField0_ &= -5;
            this.alipayQRLeave2S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave2S5() {
            this.bitField0_ &= -9;
            this.alipayQRLeave2S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave30S() {
            this.bitField1_ &= -65;
            this.alipayQRLeave30S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave3S() {
            this.bitField0_ &= -17;
            this.alipayQRLeave3S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave3S5() {
            this.bitField0_ &= -33;
            this.alipayQRLeave3S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave4S() {
            this.bitField0_ &= -65;
            this.alipayQRLeave4S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave4S5() {
            this.bitField0_ &= -129;
            this.alipayQRLeave4S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave5S() {
            this.bitField0_ &= -257;
            this.alipayQRLeave5S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave5S5() {
            this.bitField0_ &= -513;
            this.alipayQRLeave5S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave6S() {
            this.bitField0_ &= -1025;
            this.alipayQRLeave6S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave6S5() {
            this.bitField0_ &= -2049;
            this.alipayQRLeave6S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave7S() {
            this.bitField0_ &= -4097;
            this.alipayQRLeave7S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave7S5() {
            this.bitField0_ &= -8193;
            this.alipayQRLeave7S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave8S() {
            this.bitField0_ &= -16385;
            this.alipayQRLeave8S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave8S5() {
            this.bitField0_ &= -32769;
            this.alipayQRLeave8S5_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave9S() {
            this.bitField0_ &= -65537;
            this.alipayQRLeave9S_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRLeave9S5() {
            this.bitField0_ &= -131073;
            this.alipayQRLeave9S5_ = 0;
        }

        public static CincoAlipayEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CincoAlipayEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CincoAlipayEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<CincoAlipayEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave10S(int i) {
            this.bitField1_ |= 33554432;
            this.alipayCodeLeave10S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave11S(int i) {
            this.bitField1_ |= 67108864;
            this.alipayCodeLeave11S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave12S(int i) {
            this.bitField1_ |= 134217728;
            this.alipayCodeLeave12S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave13S(int i) {
            this.bitField1_ |= 268435456;
            this.alipayCodeLeave13S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave14S(int i) {
            this.bitField1_ |= 536870912;
            this.alipayCodeLeave14S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave15S(int i) {
            this.bitField1_ |= 1073741824;
            this.alipayCodeLeave15S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave16S(int i) {
            this.bitField1_ |= Integer.MIN_VALUE;
            this.alipayCodeLeave16S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave17S(int i) {
            this.bitField2_ |= 1;
            this.alipayCodeLeave17S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave18S(int i) {
            this.bitField2_ |= 2;
            this.alipayCodeLeave18S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave19S(int i) {
            this.bitField2_ |= 4;
            this.alipayCodeLeave19S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave1S(int i) {
            this.bitField1_ |= 128;
            this.alipayCodeLeave1S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave1S5(int i) {
            this.bitField1_ |= 256;
            this.alipayCodeLeave1S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave20S(int i) {
            this.bitField2_ |= 8;
            this.alipayCodeLeave20S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave21S(int i) {
            this.bitField2_ |= 16;
            this.alipayCodeLeave21S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave22S(int i) {
            this.bitField2_ |= 32;
            this.alipayCodeLeave22S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave23S(int i) {
            this.bitField2_ |= 64;
            this.alipayCodeLeave23S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave24S(int i) {
            this.bitField2_ |= 128;
            this.alipayCodeLeave24S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave25S(int i) {
            this.bitField2_ |= 256;
            this.alipayCodeLeave25S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave26S(int i) {
            this.bitField2_ |= 512;
            this.alipayCodeLeave26S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave27S(int i) {
            this.bitField2_ |= 1024;
            this.alipayCodeLeave27S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave28S(int i) {
            this.bitField2_ |= 2048;
            this.alipayCodeLeave28S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave29S(int i) {
            this.bitField2_ |= 4096;
            this.alipayCodeLeave29S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave2S(int i) {
            this.bitField1_ |= 512;
            this.alipayCodeLeave2S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave2S5(int i) {
            this.bitField1_ |= 1024;
            this.alipayCodeLeave2S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave30S(int i) {
            this.bitField2_ |= 8192;
            this.alipayCodeLeave30S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave3S(int i) {
            this.bitField1_ |= 2048;
            this.alipayCodeLeave3S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave3S5(int i) {
            this.bitField1_ |= 4096;
            this.alipayCodeLeave3S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave4S(int i) {
            this.bitField1_ |= 8192;
            this.alipayCodeLeave4S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave4S5(int i) {
            this.bitField1_ |= 16384;
            this.alipayCodeLeave4S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave5S(int i) {
            this.bitField1_ |= 32768;
            this.alipayCodeLeave5S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave5S5(int i) {
            this.bitField1_ |= 65536;
            this.alipayCodeLeave5S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave6S(int i) {
            this.bitField1_ |= 131072;
            this.alipayCodeLeave6S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave6S5(int i) {
            this.bitField1_ |= 262144;
            this.alipayCodeLeave6S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave7S(int i) {
            this.bitField1_ |= 524288;
            this.alipayCodeLeave7S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave7S5(int i) {
            this.bitField1_ |= EventRecurrence.TH;
            this.alipayCodeLeave7S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave8S(int i) {
            this.bitField1_ |= 2097152;
            this.alipayCodeLeave8S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave8S5(int i) {
            this.bitField1_ |= 4194304;
            this.alipayCodeLeave8S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave9S(int i) {
            this.bitField1_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.alipayCodeLeave9S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCodeLeave9S5(int i) {
            this.bitField1_ |= 16777216;
            this.alipayCodeLeave9S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave10S(int i) {
            this.bitField0_ |= 262144;
            this.alipayQRLeave10S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave11S(int i) {
            this.bitField0_ |= 524288;
            this.alipayQRLeave11S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave12S(int i) {
            this.bitField0_ |= EventRecurrence.TH;
            this.alipayQRLeave12S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave13S(int i) {
            this.bitField0_ |= 2097152;
            this.alipayQRLeave13S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave14S(int i) {
            this.bitField0_ |= 4194304;
            this.alipayQRLeave14S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave15S(int i) {
            this.bitField0_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.alipayQRLeave15S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave16S(int i) {
            this.bitField0_ |= 16777216;
            this.alipayQRLeave16S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave17S(int i) {
            this.bitField0_ |= 33554432;
            this.alipayQRLeave17S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave18S(int i) {
            this.bitField0_ |= 67108864;
            this.alipayQRLeave18S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave19S(int i) {
            this.bitField0_ |= 134217728;
            this.alipayQRLeave19S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave1S(int i) {
            this.bitField0_ |= 1;
            this.alipayQRLeave1S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave1S5(int i) {
            this.bitField0_ |= 2;
            this.alipayQRLeave1S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave20S(int i) {
            this.bitField0_ |= 268435456;
            this.alipayQRLeave20S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave21S(int i) {
            this.bitField0_ |= 536870912;
            this.alipayQRLeave21S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave22S(int i) {
            this.bitField0_ |= 1073741824;
            this.alipayQRLeave22S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave23S(int i) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.alipayQRLeave23S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave24S(int i) {
            this.bitField1_ |= 1;
            this.alipayQRLeave24S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave25S(int i) {
            this.bitField1_ |= 2;
            this.alipayQRLeave25S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave26S(int i) {
            this.bitField1_ |= 4;
            this.alipayQRLeave26S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave27S(int i) {
            this.bitField1_ |= 8;
            this.alipayQRLeave27S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave28S(int i) {
            this.bitField1_ |= 16;
            this.alipayQRLeave28S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave29S(int i) {
            this.bitField1_ |= 32;
            this.alipayQRLeave29S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave2S(int i) {
            this.bitField0_ |= 4;
            this.alipayQRLeave2S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave2S5(int i) {
            this.bitField0_ |= 8;
            this.alipayQRLeave2S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave30S(int i) {
            this.bitField1_ |= 64;
            this.alipayQRLeave30S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave3S(int i) {
            this.bitField0_ |= 16;
            this.alipayQRLeave3S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave3S5(int i) {
            this.bitField0_ |= 32;
            this.alipayQRLeave3S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave4S(int i) {
            this.bitField0_ |= 64;
            this.alipayQRLeave4S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave4S5(int i) {
            this.bitField0_ |= 128;
            this.alipayQRLeave4S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave5S(int i) {
            this.bitField0_ |= 256;
            this.alipayQRLeave5S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave5S5(int i) {
            this.bitField0_ |= 512;
            this.alipayQRLeave5S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave6S(int i) {
            this.bitField0_ |= 1024;
            this.alipayQRLeave6S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave6S5(int i) {
            this.bitField0_ |= 2048;
            this.alipayQRLeave6S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave7S(int i) {
            this.bitField0_ |= 4096;
            this.alipayQRLeave7S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave7S5(int i) {
            this.bitField0_ |= 8192;
            this.alipayQRLeave7S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave8S(int i) {
            this.bitField0_ |= 16384;
            this.alipayQRLeave8S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave8S5(int i) {
            this.bitField0_ |= 32768;
            this.alipayQRLeave8S5_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave9S(int i) {
            this.bitField0_ |= 65536;
            this.alipayQRLeave9S_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRLeave9S5(int i) {
            this.bitField0_ |= 131072;
            this.alipayQRLeave9S5_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CincoAlipayEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001N\u0000\u0003\u0001NN\u0000\u0000N\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dᔋ\u001c\u001eᔋ\u001d\u001fᔋ\u001e ᔋ\u001f!ᔋ \"ᔋ!#ᔋ\"$ᔋ#%ᔋ$&ᔋ%'ᔋ&(ᔋ')ᔋ(*ᔋ)+ᔋ*,ᔋ+-ᔋ,.ᔋ-/ᔋ.0ᔋ/1ᔋ02ᔋ13ᔋ24ᔋ35ᔋ46ᔋ57ᔋ68ᔋ79ᔋ8:ᔋ9;ᔋ:<ᔋ;=ᔋ<>ᔋ=?ᔋ>@ᔋ?Aᔋ@BᔋACᔋBDᔋCEᔋDFᔋEGᔋFHᔋGIᔋHJᔋIKᔋJLᔋKMᔋLNᔋM", new Object[]{"bitField0_", "bitField1_", "bitField2_", "alipayQRLeave1S_", "alipayQRLeave1S5_", "alipayQRLeave2S_", "alipayQRLeave2S5_", "alipayQRLeave3S_", "alipayQRLeave3S5_", "alipayQRLeave4S_", "alipayQRLeave4S5_", "alipayQRLeave5S_", "alipayQRLeave5S5_", "alipayQRLeave6S_", "alipayQRLeave6S5_", "alipayQRLeave7S_", "alipayQRLeave7S5_", "alipayQRLeave8S_", "alipayQRLeave8S5_", "alipayQRLeave9S_", "alipayQRLeave9S5_", "alipayQRLeave10S_", "alipayQRLeave11S_", "alipayQRLeave12S_", "alipayQRLeave13S_", "alipayQRLeave14S_", "alipayQRLeave15S_", "alipayQRLeave16S_", "alipayQRLeave17S_", "alipayQRLeave18S_", "alipayQRLeave19S_", "alipayQRLeave20S_", "alipayQRLeave21S_", "alipayQRLeave22S_", "alipayQRLeave23S_", "alipayQRLeave24S_", "alipayQRLeave25S_", "alipayQRLeave26S_", "alipayQRLeave27S_", "alipayQRLeave28S_", "alipayQRLeave29S_", "alipayQRLeave30S_", "alipayCodeLeave1S_", "alipayCodeLeave1S5_", "alipayCodeLeave2S_", "alipayCodeLeave2S5_", "alipayCodeLeave3S_", "alipayCodeLeave3S5_", "alipayCodeLeave4S_", "alipayCodeLeave4S5_", "alipayCodeLeave5S_", "alipayCodeLeave5S5_", "alipayCodeLeave6S_", "alipayCodeLeave6S5_", "alipayCodeLeave7S_", "alipayCodeLeave7S5_", "alipayCodeLeave8S_", "alipayCodeLeave8S5_", "alipayCodeLeave9S_", "alipayCodeLeave9S5_", "alipayCodeLeave10S_", "alipayCodeLeave11S_", "alipayCodeLeave12S_", "alipayCodeLeave13S_", "alipayCodeLeave14S_", "alipayCodeLeave15S_", "alipayCodeLeave16S_", "alipayCodeLeave17S_", "alipayCodeLeave18S_", "alipayCodeLeave19S_", "alipayCodeLeave20S_", "alipayCodeLeave21S_", "alipayCodeLeave22S_", "alipayCodeLeave23S_", "alipayCodeLeave24S_", "alipayCodeLeave25S_", "alipayCodeLeave26S_", "alipayCodeLeave27S_", "alipayCodeLeave28S_", "alipayCodeLeave29S_", "alipayCodeLeave30S_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<CincoAlipayEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (CincoAlipayEventMessage.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave10S() {
            return this.alipayCodeLeave10S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave11S() {
            return this.alipayCodeLeave11S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave12S() {
            return this.alipayCodeLeave12S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave13S() {
            return this.alipayCodeLeave13S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave14S() {
            return this.alipayCodeLeave14S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave15S() {
            return this.alipayCodeLeave15S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave16S() {
            return this.alipayCodeLeave16S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave17S() {
            return this.alipayCodeLeave17S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave18S() {
            return this.alipayCodeLeave18S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave19S() {
            return this.alipayCodeLeave19S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave1S() {
            return this.alipayCodeLeave1S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave1S5() {
            return this.alipayCodeLeave1S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave20S() {
            return this.alipayCodeLeave20S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave21S() {
            return this.alipayCodeLeave21S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave22S() {
            return this.alipayCodeLeave22S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave23S() {
            return this.alipayCodeLeave23S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave24S() {
            return this.alipayCodeLeave24S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave25S() {
            return this.alipayCodeLeave25S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave26S() {
            return this.alipayCodeLeave26S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave27S() {
            return this.alipayCodeLeave27S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave28S() {
            return this.alipayCodeLeave28S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave29S() {
            return this.alipayCodeLeave29S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave2S() {
            return this.alipayCodeLeave2S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave2S5() {
            return this.alipayCodeLeave2S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave30S() {
            return this.alipayCodeLeave30S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave3S() {
            return this.alipayCodeLeave3S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave3S5() {
            return this.alipayCodeLeave3S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave4S() {
            return this.alipayCodeLeave4S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave4S5() {
            return this.alipayCodeLeave4S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave5S() {
            return this.alipayCodeLeave5S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave5S5() {
            return this.alipayCodeLeave5S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave6S() {
            return this.alipayCodeLeave6S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave6S5() {
            return this.alipayCodeLeave6S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave7S() {
            return this.alipayCodeLeave7S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave7S5() {
            return this.alipayCodeLeave7S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave8S() {
            return this.alipayCodeLeave8S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave8S5() {
            return this.alipayCodeLeave8S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave9S() {
            return this.alipayCodeLeave9S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayCodeLeave9S5() {
            return this.alipayCodeLeave9S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave10S() {
            return this.alipayQRLeave10S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave11S() {
            return this.alipayQRLeave11S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave12S() {
            return this.alipayQRLeave12S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave13S() {
            return this.alipayQRLeave13S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave14S() {
            return this.alipayQRLeave14S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave15S() {
            return this.alipayQRLeave15S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave16S() {
            return this.alipayQRLeave16S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave17S() {
            return this.alipayQRLeave17S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave18S() {
            return this.alipayQRLeave18S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave19S() {
            return this.alipayQRLeave19S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave1S() {
            return this.alipayQRLeave1S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave1S5() {
            return this.alipayQRLeave1S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave20S() {
            return this.alipayQRLeave20S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave21S() {
            return this.alipayQRLeave21S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave22S() {
            return this.alipayQRLeave22S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave23S() {
            return this.alipayQRLeave23S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave24S() {
            return this.alipayQRLeave24S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave25S() {
            return this.alipayQRLeave25S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave26S() {
            return this.alipayQRLeave26S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave27S() {
            return this.alipayQRLeave27S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave28S() {
            return this.alipayQRLeave28S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave29S() {
            return this.alipayQRLeave29S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave2S() {
            return this.alipayQRLeave2S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave2S5() {
            return this.alipayQRLeave2S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave30S() {
            return this.alipayQRLeave30S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave3S() {
            return this.alipayQRLeave3S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave3S5() {
            return this.alipayQRLeave3S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave4S() {
            return this.alipayQRLeave4S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave4S5() {
            return this.alipayQRLeave4S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave5S() {
            return this.alipayQRLeave5S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave5S5() {
            return this.alipayQRLeave5S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave6S() {
            return this.alipayQRLeave6S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave6S5() {
            return this.alipayQRLeave6S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave7S() {
            return this.alipayQRLeave7S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave7S5() {
            return this.alipayQRLeave7S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave8S() {
            return this.alipayQRLeave8S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave8S5() {
            return this.alipayQRLeave8S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave9S() {
            return this.alipayQRLeave9S_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public int getAlipayQRLeave9S5() {
            return this.alipayQRLeave9S5_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave10S() {
            return (this.bitField1_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave11S() {
            return (this.bitField1_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave12S() {
            return (this.bitField1_ & 134217728) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave13S() {
            return (this.bitField1_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave14S() {
            return (this.bitField1_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave15S() {
            return (this.bitField1_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave16S() {
            return (this.bitField1_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave17S() {
            return (this.bitField2_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave18S() {
            return (this.bitField2_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave19S() {
            return (this.bitField2_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave1S() {
            return (this.bitField1_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave1S5() {
            return (this.bitField1_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave20S() {
            return (this.bitField2_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave21S() {
            return (this.bitField2_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave22S() {
            return (this.bitField2_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave23S() {
            return (this.bitField2_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave24S() {
            return (this.bitField2_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave25S() {
            return (this.bitField2_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave26S() {
            return (this.bitField2_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave27S() {
            return (this.bitField2_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave28S() {
            return (this.bitField2_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave29S() {
            return (this.bitField2_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave2S() {
            return (this.bitField1_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave2S5() {
            return (this.bitField1_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave30S() {
            return (this.bitField2_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave3S() {
            return (this.bitField1_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave3S5() {
            return (this.bitField1_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave4S() {
            return (this.bitField1_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave4S5() {
            return (this.bitField1_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave5S() {
            return (this.bitField1_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave5S5() {
            return (this.bitField1_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave6S() {
            return (this.bitField1_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave6S5() {
            return (this.bitField1_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave7S() {
            return (this.bitField1_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave7S5() {
            return (this.bitField1_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave8S() {
            return (this.bitField1_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave8S5() {
            return (this.bitField1_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave9S() {
            return (this.bitField1_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayCodeLeave9S5() {
            return (this.bitField1_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave10S() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave11S() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave12S() {
            return (this.bitField0_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave13S() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave14S() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave15S() {
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave16S() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave17S() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave18S() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave19S() {
            return (this.bitField0_ & 134217728) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave1S() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave1S5() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave20S() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave21S() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave22S() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave23S() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave24S() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave25S() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave26S() {
            return (this.bitField1_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave27S() {
            return (this.bitField1_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave28S() {
            return (this.bitField1_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave29S() {
            return (this.bitField1_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave2S() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave2S5() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave30S() {
            return (this.bitField1_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave3S() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave3S5() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave4S() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave4S5() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave5S() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave5S5() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave6S() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave6S5() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave7S() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave7S5() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave8S() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave8S5() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave9S() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.AlipayEvent.CincoAlipayEventMessageOrBuilder
        public boolean hasAlipayQRLeave9S5() {
            return (this.bitField0_ & 131072) != 0;
        }

        public static Builder newBuilder(CincoAlipayEventMessage cincoAlipayEventMessage) {
            return DEFAULT_INSTANCE.createBuilder(cincoAlipayEventMessage);
        }

        public static CincoAlipayEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CincoAlipayEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static CincoAlipayEventMessage parseFrom(ByteString byteString) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CincoAlipayEventMessage parseFrom(ByteString byteString, t tVar) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static CincoAlipayEventMessage parseFrom(byte[] bArr) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CincoAlipayEventMessage parseFrom(byte[] bArr, t tVar) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static CincoAlipayEventMessage parseFrom(InputStream inputStream) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CincoAlipayEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CincoAlipayEventMessage parseFrom(j jVar) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static CincoAlipayEventMessage parseFrom(j jVar, t tVar) {
            return (CincoAlipayEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface CincoAlipayEventMessageOrBuilder extends bsf {
        int getAlipayCodeLeave10S();

        int getAlipayCodeLeave11S();

        int getAlipayCodeLeave12S();

        int getAlipayCodeLeave13S();

        int getAlipayCodeLeave14S();

        int getAlipayCodeLeave15S();

        int getAlipayCodeLeave16S();

        int getAlipayCodeLeave17S();

        int getAlipayCodeLeave18S();

        int getAlipayCodeLeave19S();

        int getAlipayCodeLeave1S();

        int getAlipayCodeLeave1S5();

        int getAlipayCodeLeave20S();

        int getAlipayCodeLeave21S();

        int getAlipayCodeLeave22S();

        int getAlipayCodeLeave23S();

        int getAlipayCodeLeave24S();

        int getAlipayCodeLeave25S();

        int getAlipayCodeLeave26S();

        int getAlipayCodeLeave27S();

        int getAlipayCodeLeave28S();

        int getAlipayCodeLeave29S();

        int getAlipayCodeLeave2S();

        int getAlipayCodeLeave2S5();

        int getAlipayCodeLeave30S();

        int getAlipayCodeLeave3S();

        int getAlipayCodeLeave3S5();

        int getAlipayCodeLeave4S();

        int getAlipayCodeLeave4S5();

        int getAlipayCodeLeave5S();

        int getAlipayCodeLeave5S5();

        int getAlipayCodeLeave6S();

        int getAlipayCodeLeave6S5();

        int getAlipayCodeLeave7S();

        int getAlipayCodeLeave7S5();

        int getAlipayCodeLeave8S();

        int getAlipayCodeLeave8S5();

        int getAlipayCodeLeave9S();

        int getAlipayCodeLeave9S5();

        int getAlipayQRLeave10S();

        int getAlipayQRLeave11S();

        int getAlipayQRLeave12S();

        int getAlipayQRLeave13S();

        int getAlipayQRLeave14S();

        int getAlipayQRLeave15S();

        int getAlipayQRLeave16S();

        int getAlipayQRLeave17S();

        int getAlipayQRLeave18S();

        int getAlipayQRLeave19S();

        int getAlipayQRLeave1S();

        int getAlipayQRLeave1S5();

        int getAlipayQRLeave20S();

        int getAlipayQRLeave21S();

        int getAlipayQRLeave22S();

        int getAlipayQRLeave23S();

        int getAlipayQRLeave24S();

        int getAlipayQRLeave25S();

        int getAlipayQRLeave26S();

        int getAlipayQRLeave27S();

        int getAlipayQRLeave28S();

        int getAlipayQRLeave29S();

        int getAlipayQRLeave2S();

        int getAlipayQRLeave2S5();

        int getAlipayQRLeave30S();

        int getAlipayQRLeave3S();

        int getAlipayQRLeave3S5();

        int getAlipayQRLeave4S();

        int getAlipayQRLeave4S5();

        int getAlipayQRLeave5S();

        int getAlipayQRLeave5S5();

        int getAlipayQRLeave6S();

        int getAlipayQRLeave6S5();

        int getAlipayQRLeave7S();

        int getAlipayQRLeave7S5();

        int getAlipayQRLeave8S();

        int getAlipayQRLeave8S5();

        int getAlipayQRLeave9S();

        int getAlipayQRLeave9S5();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        boolean hasAlipayCodeLeave10S();

        boolean hasAlipayCodeLeave11S();

        boolean hasAlipayCodeLeave12S();

        boolean hasAlipayCodeLeave13S();

        boolean hasAlipayCodeLeave14S();

        boolean hasAlipayCodeLeave15S();

        boolean hasAlipayCodeLeave16S();

        boolean hasAlipayCodeLeave17S();

        boolean hasAlipayCodeLeave18S();

        boolean hasAlipayCodeLeave19S();

        boolean hasAlipayCodeLeave1S();

        boolean hasAlipayCodeLeave1S5();

        boolean hasAlipayCodeLeave20S();

        boolean hasAlipayCodeLeave21S();

        boolean hasAlipayCodeLeave22S();

        boolean hasAlipayCodeLeave23S();

        boolean hasAlipayCodeLeave24S();

        boolean hasAlipayCodeLeave25S();

        boolean hasAlipayCodeLeave26S();

        boolean hasAlipayCodeLeave27S();

        boolean hasAlipayCodeLeave28S();

        boolean hasAlipayCodeLeave29S();

        boolean hasAlipayCodeLeave2S();

        boolean hasAlipayCodeLeave2S5();

        boolean hasAlipayCodeLeave30S();

        boolean hasAlipayCodeLeave3S();

        boolean hasAlipayCodeLeave3S5();

        boolean hasAlipayCodeLeave4S();

        boolean hasAlipayCodeLeave4S5();

        boolean hasAlipayCodeLeave5S();

        boolean hasAlipayCodeLeave5S5();

        boolean hasAlipayCodeLeave6S();

        boolean hasAlipayCodeLeave6S5();

        boolean hasAlipayCodeLeave7S();

        boolean hasAlipayCodeLeave7S5();

        boolean hasAlipayCodeLeave8S();

        boolean hasAlipayCodeLeave8S5();

        boolean hasAlipayCodeLeave9S();

        boolean hasAlipayCodeLeave9S5();

        boolean hasAlipayQRLeave10S();

        boolean hasAlipayQRLeave11S();

        boolean hasAlipayQRLeave12S();

        boolean hasAlipayQRLeave13S();

        boolean hasAlipayQRLeave14S();

        boolean hasAlipayQRLeave15S();

        boolean hasAlipayQRLeave16S();

        boolean hasAlipayQRLeave17S();

        boolean hasAlipayQRLeave18S();

        boolean hasAlipayQRLeave19S();

        boolean hasAlipayQRLeave1S();

        boolean hasAlipayQRLeave1S5();

        boolean hasAlipayQRLeave20S();

        boolean hasAlipayQRLeave21S();

        boolean hasAlipayQRLeave22S();

        boolean hasAlipayQRLeave23S();

        boolean hasAlipayQRLeave24S();

        boolean hasAlipayQRLeave25S();

        boolean hasAlipayQRLeave26S();

        boolean hasAlipayQRLeave27S();

        boolean hasAlipayQRLeave28S();

        boolean hasAlipayQRLeave29S();

        boolean hasAlipayQRLeave2S();

        boolean hasAlipayQRLeave2S5();

        boolean hasAlipayQRLeave30S();

        boolean hasAlipayQRLeave3S();

        boolean hasAlipayQRLeave3S5();

        boolean hasAlipayQRLeave4S();

        boolean hasAlipayQRLeave4S5();

        boolean hasAlipayQRLeave5S();

        boolean hasAlipayQRLeave5S5();

        boolean hasAlipayQRLeave6S();

        boolean hasAlipayQRLeave6S5();

        boolean hasAlipayQRLeave7S();

        boolean hasAlipayQRLeave7S5();

        boolean hasAlipayQRLeave8S();

        boolean hasAlipayQRLeave8S5();

        boolean hasAlipayQRLeave9S();

        boolean hasAlipayQRLeave9S5();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private AlipayEvent() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
