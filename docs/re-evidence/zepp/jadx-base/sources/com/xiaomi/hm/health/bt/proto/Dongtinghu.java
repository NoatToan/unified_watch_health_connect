package com.xiaomi.hm.health.bt.proto;

import com.autonavi.amap.mapcore.AMapEngineUtils;
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
public final class Dongtinghu {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Dongtinghu$1, reason: invalid class name */
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

    public static final class DongTingHuEventMessage extends GeneratedMessageLite<DongTingHuEventMessage, Builder> implements DongTingHuEventMessageOrBuilder {
        public static final int ALIPAYPAGE_FIELD_NUMBER = 5;
        public static final int APPREMINDNUM_FIELD_NUMBER = 30;
        public static final int BACKLIGHTPAGE_FIELD_NUMBER = 21;
        public static final int BEFORESPORTGPSPRESSPAGE_FIELD_NUMBER = 23;
        public static final int CALLREMINDNUM_FIELD_NUMBER = 31;
        public static final int CLOCKCLOSEPAGE_FIELD_NUMBER = 10;
        public static final int CLOCKPAGE_FIELD_NUMBER = 8;
        public static final int CLOCKSTARTPAGE_FIELD_NUMBER = 9;
        public static final int COMPASSPAGE_FIELD_NUMBER = 13;
        public static final int COUNTDOWNPAGE_FIELD_NUMBER = 12;
        public static final int CTRLMUSICPAGE_FIELD_NUMBER = 22;
        private static final DongTingHuEventMessage DEFAULT_INSTANCE;
        public static final int DIALID_FIELD_NUMBER = 37;
        public static final int DISCONNECTNUM_FIELD_NUMBER = 33;
        public static final int EDITDIALNUM_FIELD_NUMBER = 39;
        public static final int EVENTREMINDNUM_FIELD_NUMBER = 34;
        public static final int FINDPHONEFAILNUM_FIELD_NUMBER = 51;
        public static final int FINDPHONESUCCESSNUM_FIELD_NUMBER = 50;
        public static final int HEARTRATEPAGE_FIELD_NUMBER = 2;
        public static final int KEYPRESSCLOSEBACKLIGHTNUM_FIELD_NUMBER = 49;
        public static final int LOCKCLOSEPAGE_FIELD_NUMBER = 20;
        public static final int LOCKSTARTPAGE_FIELD_NUMBER = 19;
        public static final int LONGKEYRESTOREFACTORYNUM_FIELD_NUMBER = 54;
        public static final int MUSICPAGE_FIELD_NUMBER = 14;
        public static final int NEGATIVEALIPAYBARCODETIME_FIELD_NUMBER = 42;
        public static final int NEGATIVEALIPAYQRCODETIME_FIELD_NUMBER = 43;
        public static final int NEGATIVEHEARTRATETIME_FIELD_NUMBER = 48;
        public static final int NEGATIVEMUSICTIME_FIELD_NUMBER = 41;
        public static final int NEGATIVENFCCARDTIME_FIELD_NUMBER = 44;
        public static final int NEGATIVENUM_FIELD_NUMBER = 40;
        public static final int NEGATIVEPAITIME_FIELD_NUMBER = 46;
        public static final int NEGATIVESTATETIME_FIELD_NUMBER = 45;
        public static final int NEGATIVEWEATHERNUM_FIELD_NUMBER = 47;
        public static final int NFCCARDPAGE_FIELD_NUMBER = 6;
        public static final int NOTICENUM_FIELD_NUMBER = 29;
        public static final int PAIPAGE_FIELD_NUMBER = 3;
        private static volatile Parser<DongTingHuEventMessage> PARSER = null;
        public static final int REMINDCLOSENUM_FIELD_NUMBER = 36;
        public static final int REMINDLATERNUM_FIELD_NUMBER = 35;
        public static final int SETTINGCLOSENUM_FIELD_NUMBER = 52;
        public static final int SETTINGPAGE_FIELD_NUMBER = 16;
        public static final int SETTINGRESTOREFACTORYNUM_FIELD_NUMBER = 53;
        public static final int SETTINGWATCHFACEPAGE_FIELD_NUMBER = 38;
        public static final int SILENCEPAGE_FIELD_NUMBER = 17;
        public static final int SILENCESWITCHPAGE_FIELD_NUMBER = 18;
        public static final int SKIPGPSLOCATIONNUM_FIELD_NUMBER = 26;
        public static final int SPORTBREAKLINKNUM_FIELD_NUMBER = 27;
        public static final int SPORTGPSSUCCESSTIME_FIELD_NUMBER = 25;
        public static final int SPORTPAGE_FIELD_NUMBER = 4;
        public static final int SPORTRELINKNUM_FIELD_NUMBER = 28;
        public static final int SPORTREMINDNUM_FIELD_NUMBER = 32;
        public static final int STATUSPAGE_FIELD_NUMBER = 1;
        public static final int STOPWATCHPAGE_FIELD_NUMBER = 11;
        public static final int WAITGPSLOCATIONNUM_FIELD_NUMBER = 24;
        public static final int WEATHERPAGE_FIELD_NUMBER = 7;
        public static final int WORLDCLOCKPAGE_FIELD_NUMBER = 15;
        private int alipayPage_;
        private int appRemindNum_;
        private int backlightPage_;
        private int beforeSportGpsPressPage_;
        private int bitField0_;
        private int bitField1_;
        private int callRemindNum_;
        private int clockPage_;
        private int clockclosePage_;
        private int clockstartPage_;
        private int compassPage_;
        private int countdownPage_;
        private int ctrlmusicPage_;
        private int dialId_;
        private int disconnectNum_;
        private int editDialNum_;
        private int eventRemindNum_;
        private int findPhoneFailNum_;
        private int findPhoneSuccessNum_;
        private int heartratePage_;
        private int keyPressCloseBacklightNum_;
        private int lockclosePage_;
        private int lockstartPage_;
        private int longkeyRestoreFactoryNum_;
        private byte memoizedIsInitialized = 2;
        private int musicPage_;
        private int nFCcardPage_;
        private int negativeAliPayBarcodeTime_;
        private int negativeAliPayQrcodeTime_;
        private int negativeHeartrateTime_;
        private int negativeMusicTime_;
        private int negativeNfcCardTime_;
        private int negativeNum_;
        private int negativePaiTime_;
        private int negativeStateTime_;
        private int negativeWeatherNum_;
        private int noticeNum_;
        private int pAIPage_;
        private int remindCloseNum_;
        private int remindLaterNum_;
        private int settingCloseNum_;
        private int settingPage_;
        private int settingRestoreFactoryNum_;
        private int settingWatchfacePage_;
        private int silencePage_;
        private int silenceSwitchPage_;
        private int skipGpsLocationNum_;
        private int sportBreakLinkNum_;
        private int sportGpsSuccessTime_;
        private int sportPage_;
        private int sportReLinkNum_;
        private int sportRemindNum_;
        private int statusPage_;
        private int stopwatchPage_;
        private int waitGpsLocationNum_;
        private int weatherPage_;
        private int worldclockPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<DongTingHuEventMessage, Builder> implements DongTingHuEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlipayPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearAlipayPage();
                return this;
            }

            public Builder clearAppRemindNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearAppRemindNum();
                return this;
            }

            public Builder clearBacklightPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearBacklightPage();
                return this;
            }

            public Builder clearBeforeSportGpsPressPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearBeforeSportGpsPressPage();
                return this;
            }

            public Builder clearCallRemindNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearCallRemindNum();
                return this;
            }

            public Builder clearClockPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearClockPage();
                return this;
            }

            public Builder clearClockclosePage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearClockclosePage();
                return this;
            }

            public Builder clearClockstartPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearClockstartPage();
                return this;
            }

            public Builder clearCompassPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearCompassPage();
                return this;
            }

            public Builder clearCountdownPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearCountdownPage();
                return this;
            }

            public Builder clearCtrlmusicPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearCtrlmusicPage();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearDisconnectNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearDisconnectNum();
                return this;
            }

            public Builder clearEditDialNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearEditDialNum();
                return this;
            }

            public Builder clearEventRemindNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearEventRemindNum();
                return this;
            }

            public Builder clearFindPhoneFailNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearFindPhoneFailNum();
                return this;
            }

            public Builder clearFindPhoneSuccessNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearFindPhoneSuccessNum();
                return this;
            }

            public Builder clearHeartratePage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearHeartratePage();
                return this;
            }

            public Builder clearKeyPressCloseBacklightNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearKeyPressCloseBacklightNum();
                return this;
            }

            public Builder clearLockclosePage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearLockclosePage();
                return this;
            }

            public Builder clearLockstartPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearLockstartPage();
                return this;
            }

            public Builder clearLongkeyRestoreFactoryNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearLongkeyRestoreFactoryNum();
                return this;
            }

            public Builder clearMusicPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearMusicPage();
                return this;
            }

            public Builder clearNFCcardPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearNFCcardPage();
                return this;
            }

            public Builder clearNegativeAliPayBarcodeTime() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearNegativeAliPayBarcodeTime();
                return this;
            }

            public Builder clearNegativeAliPayQrcodeTime() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearNegativeAliPayQrcodeTime();
                return this;
            }

            public Builder clearNegativeHeartrateTime() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearNegativeHeartrateTime();
                return this;
            }

            public Builder clearNegativeMusicTime() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearNegativeMusicTime();
                return this;
            }

            public Builder clearNegativeNfcCardTime() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearNegativeNfcCardTime();
                return this;
            }

            public Builder clearNegativeNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearNegativeNum();
                return this;
            }

            public Builder clearNegativePaiTime() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearNegativePaiTime();
                return this;
            }

            public Builder clearNegativeStateTime() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearNegativeStateTime();
                return this;
            }

            public Builder clearNegativeWeatherNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearNegativeWeatherNum();
                return this;
            }

            public Builder clearNoticeNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearNoticeNum();
                return this;
            }

            public Builder clearPAIPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearPAIPage();
                return this;
            }

            public Builder clearRemindCloseNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearRemindCloseNum();
                return this;
            }

            public Builder clearRemindLaterNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearRemindLaterNum();
                return this;
            }

            public Builder clearSettingCloseNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSettingCloseNum();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSettingRestoreFactoryNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSettingRestoreFactoryNum();
                return this;
            }

            public Builder clearSettingWatchfacePage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSettingWatchfacePage();
                return this;
            }

            public Builder clearSilencePage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSilencePage();
                return this;
            }

            public Builder clearSilenceSwitchPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSilenceSwitchPage();
                return this;
            }

            public Builder clearSkipGpsLocationNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSkipGpsLocationNum();
                return this;
            }

            public Builder clearSportBreakLinkNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSportBreakLinkNum();
                return this;
            }

            public Builder clearSportGpsSuccessTime() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSportGpsSuccessTime();
                return this;
            }

            public Builder clearSportPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSportPage();
                return this;
            }

            public Builder clearSportReLinkNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSportReLinkNum();
                return this;
            }

            public Builder clearSportRemindNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearSportRemindNum();
                return this;
            }

            public Builder clearStatusPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearStatusPage();
                return this;
            }

            public Builder clearStopwatchPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearStopwatchPage();
                return this;
            }

            public Builder clearWaitGpsLocationNum() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearWaitGpsLocationNum();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            public Builder clearWorldclockPage() {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).clearWorldclockPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getAlipayPage() {
                return ((DongTingHuEventMessage) this.instance).getAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getAppRemindNum() {
                return ((DongTingHuEventMessage) this.instance).getAppRemindNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getBacklightPage() {
                return ((DongTingHuEventMessage) this.instance).getBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getBeforeSportGpsPressPage() {
                return ((DongTingHuEventMessage) this.instance).getBeforeSportGpsPressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getCallRemindNum() {
                return ((DongTingHuEventMessage) this.instance).getCallRemindNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getClockPage() {
                return ((DongTingHuEventMessage) this.instance).getClockPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getClockclosePage() {
                return ((DongTingHuEventMessage) this.instance).getClockclosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getClockstartPage() {
                return ((DongTingHuEventMessage) this.instance).getClockstartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getCompassPage() {
                return ((DongTingHuEventMessage) this.instance).getCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getCountdownPage() {
                return ((DongTingHuEventMessage) this.instance).getCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getCtrlmusicPage() {
                return ((DongTingHuEventMessage) this.instance).getCtrlmusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getDialId() {
                return ((DongTingHuEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getDisconnectNum() {
                return ((DongTingHuEventMessage) this.instance).getDisconnectNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getEditDialNum() {
                return ((DongTingHuEventMessage) this.instance).getEditDialNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getEventRemindNum() {
                return ((DongTingHuEventMessage) this.instance).getEventRemindNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getFindPhoneFailNum() {
                return ((DongTingHuEventMessage) this.instance).getFindPhoneFailNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getFindPhoneSuccessNum() {
                return ((DongTingHuEventMessage) this.instance).getFindPhoneSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getHeartratePage() {
                return ((DongTingHuEventMessage) this.instance).getHeartratePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getKeyPressCloseBacklightNum() {
                return ((DongTingHuEventMessage) this.instance).getKeyPressCloseBacklightNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getLockclosePage() {
                return ((DongTingHuEventMessage) this.instance).getLockclosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getLockstartPage() {
                return ((DongTingHuEventMessage) this.instance).getLockstartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getLongkeyRestoreFactoryNum() {
                return ((DongTingHuEventMessage) this.instance).getLongkeyRestoreFactoryNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getMusicPage() {
                return ((DongTingHuEventMessage) this.instance).getMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getNFCcardPage() {
                return ((DongTingHuEventMessage) this.instance).getNFCcardPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getNegativeAliPayBarcodeTime() {
                return ((DongTingHuEventMessage) this.instance).getNegativeAliPayBarcodeTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getNegativeAliPayQrcodeTime() {
                return ((DongTingHuEventMessage) this.instance).getNegativeAliPayQrcodeTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getNegativeHeartrateTime() {
                return ((DongTingHuEventMessage) this.instance).getNegativeHeartrateTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getNegativeMusicTime() {
                return ((DongTingHuEventMessage) this.instance).getNegativeMusicTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getNegativeNfcCardTime() {
                return ((DongTingHuEventMessage) this.instance).getNegativeNfcCardTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getNegativeNum() {
                return ((DongTingHuEventMessage) this.instance).getNegativeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getNegativePaiTime() {
                return ((DongTingHuEventMessage) this.instance).getNegativePaiTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getNegativeStateTime() {
                return ((DongTingHuEventMessage) this.instance).getNegativeStateTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getNegativeWeatherNum() {
                return ((DongTingHuEventMessage) this.instance).getNegativeWeatherNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getNoticeNum() {
                return ((DongTingHuEventMessage) this.instance).getNoticeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getPAIPage() {
                return ((DongTingHuEventMessage) this.instance).getPAIPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getRemindCloseNum() {
                return ((DongTingHuEventMessage) this.instance).getRemindCloseNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getRemindLaterNum() {
                return ((DongTingHuEventMessage) this.instance).getRemindLaterNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSettingCloseNum() {
                return ((DongTingHuEventMessage) this.instance).getSettingCloseNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSettingPage() {
                return ((DongTingHuEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSettingRestoreFactoryNum() {
                return ((DongTingHuEventMessage) this.instance).getSettingRestoreFactoryNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSettingWatchfacePage() {
                return ((DongTingHuEventMessage) this.instance).getSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSilencePage() {
                return ((DongTingHuEventMessage) this.instance).getSilencePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSilenceSwitchPage() {
                return ((DongTingHuEventMessage) this.instance).getSilenceSwitchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSkipGpsLocationNum() {
                return ((DongTingHuEventMessage) this.instance).getSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSportBreakLinkNum() {
                return ((DongTingHuEventMessage) this.instance).getSportBreakLinkNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSportGpsSuccessTime() {
                return ((DongTingHuEventMessage) this.instance).getSportGpsSuccessTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSportPage() {
                return ((DongTingHuEventMessage) this.instance).getSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSportReLinkNum() {
                return ((DongTingHuEventMessage) this.instance).getSportReLinkNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getSportRemindNum() {
                return ((DongTingHuEventMessage) this.instance).getSportRemindNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getStatusPage() {
                return ((DongTingHuEventMessage) this.instance).getStatusPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getStopwatchPage() {
                return ((DongTingHuEventMessage) this.instance).getStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getWaitGpsLocationNum() {
                return ((DongTingHuEventMessage) this.instance).getWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getWeatherPage() {
                return ((DongTingHuEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public int getWorldclockPage() {
                return ((DongTingHuEventMessage) this.instance).getWorldclockPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasAlipayPage() {
                return ((DongTingHuEventMessage) this.instance).hasAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasAppRemindNum() {
                return ((DongTingHuEventMessage) this.instance).hasAppRemindNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasBacklightPage() {
                return ((DongTingHuEventMessage) this.instance).hasBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasBeforeSportGpsPressPage() {
                return ((DongTingHuEventMessage) this.instance).hasBeforeSportGpsPressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasCallRemindNum() {
                return ((DongTingHuEventMessage) this.instance).hasCallRemindNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasClockPage() {
                return ((DongTingHuEventMessage) this.instance).hasClockPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasClockclosePage() {
                return ((DongTingHuEventMessage) this.instance).hasClockclosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasClockstartPage() {
                return ((DongTingHuEventMessage) this.instance).hasClockstartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasCompassPage() {
                return ((DongTingHuEventMessage) this.instance).hasCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasCountdownPage() {
                return ((DongTingHuEventMessage) this.instance).hasCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasCtrlmusicPage() {
                return ((DongTingHuEventMessage) this.instance).hasCtrlmusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasDialId() {
                return ((DongTingHuEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasDisconnectNum() {
                return ((DongTingHuEventMessage) this.instance).hasDisconnectNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasEditDialNum() {
                return ((DongTingHuEventMessage) this.instance).hasEditDialNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasEventRemindNum() {
                return ((DongTingHuEventMessage) this.instance).hasEventRemindNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasFindPhoneFailNum() {
                return ((DongTingHuEventMessage) this.instance).hasFindPhoneFailNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasFindPhoneSuccessNum() {
                return ((DongTingHuEventMessage) this.instance).hasFindPhoneSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasHeartratePage() {
                return ((DongTingHuEventMessage) this.instance).hasHeartratePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasKeyPressCloseBacklightNum() {
                return ((DongTingHuEventMessage) this.instance).hasKeyPressCloseBacklightNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasLockclosePage() {
                return ((DongTingHuEventMessage) this.instance).hasLockclosePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasLockstartPage() {
                return ((DongTingHuEventMessage) this.instance).hasLockstartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasLongkeyRestoreFactoryNum() {
                return ((DongTingHuEventMessage) this.instance).hasLongkeyRestoreFactoryNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasMusicPage() {
                return ((DongTingHuEventMessage) this.instance).hasMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasNFCcardPage() {
                return ((DongTingHuEventMessage) this.instance).hasNFCcardPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasNegativeAliPayBarcodeTime() {
                return ((DongTingHuEventMessage) this.instance).hasNegativeAliPayBarcodeTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasNegativeAliPayQrcodeTime() {
                return ((DongTingHuEventMessage) this.instance).hasNegativeAliPayQrcodeTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasNegativeHeartrateTime() {
                return ((DongTingHuEventMessage) this.instance).hasNegativeHeartrateTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasNegativeMusicTime() {
                return ((DongTingHuEventMessage) this.instance).hasNegativeMusicTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasNegativeNfcCardTime() {
                return ((DongTingHuEventMessage) this.instance).hasNegativeNfcCardTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasNegativeNum() {
                return ((DongTingHuEventMessage) this.instance).hasNegativeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasNegativePaiTime() {
                return ((DongTingHuEventMessage) this.instance).hasNegativePaiTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasNegativeStateTime() {
                return ((DongTingHuEventMessage) this.instance).hasNegativeStateTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasNegativeWeatherNum() {
                return ((DongTingHuEventMessage) this.instance).hasNegativeWeatherNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasNoticeNum() {
                return ((DongTingHuEventMessage) this.instance).hasNoticeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasPAIPage() {
                return ((DongTingHuEventMessage) this.instance).hasPAIPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasRemindCloseNum() {
                return ((DongTingHuEventMessage) this.instance).hasRemindCloseNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasRemindLaterNum() {
                return ((DongTingHuEventMessage) this.instance).hasRemindLaterNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSettingCloseNum() {
                return ((DongTingHuEventMessage) this.instance).hasSettingCloseNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((DongTingHuEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSettingRestoreFactoryNum() {
                return ((DongTingHuEventMessage) this.instance).hasSettingRestoreFactoryNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSettingWatchfacePage() {
                return ((DongTingHuEventMessage) this.instance).hasSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSilencePage() {
                return ((DongTingHuEventMessage) this.instance).hasSilencePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSilenceSwitchPage() {
                return ((DongTingHuEventMessage) this.instance).hasSilenceSwitchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSkipGpsLocationNum() {
                return ((DongTingHuEventMessage) this.instance).hasSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSportBreakLinkNum() {
                return ((DongTingHuEventMessage) this.instance).hasSportBreakLinkNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSportGpsSuccessTime() {
                return ((DongTingHuEventMessage) this.instance).hasSportGpsSuccessTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSportPage() {
                return ((DongTingHuEventMessage) this.instance).hasSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSportReLinkNum() {
                return ((DongTingHuEventMessage) this.instance).hasSportReLinkNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasSportRemindNum() {
                return ((DongTingHuEventMessage) this.instance).hasSportRemindNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasStatusPage() {
                return ((DongTingHuEventMessage) this.instance).hasStatusPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasStopwatchPage() {
                return ((DongTingHuEventMessage) this.instance).hasStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasWaitGpsLocationNum() {
                return ((DongTingHuEventMessage) this.instance).hasWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((DongTingHuEventMessage) this.instance).hasWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
            public boolean hasWorldclockPage() {
                return ((DongTingHuEventMessage) this.instance).hasWorldclockPage();
            }

            public Builder setAlipayPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setAlipayPage(value);
                return this;
            }

            public Builder setAppRemindNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setAppRemindNum(value);
                return this;
            }

            public Builder setBacklightPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setBacklightPage(value);
                return this;
            }

            public Builder setBeforeSportGpsPressPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setBeforeSportGpsPressPage(value);
                return this;
            }

            public Builder setCallRemindNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setCallRemindNum(value);
                return this;
            }

            public Builder setClockPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setClockPage(value);
                return this;
            }

            public Builder setClockclosePage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setClockclosePage(value);
                return this;
            }

            public Builder setClockstartPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setClockstartPage(value);
                return this;
            }

            public Builder setCompassPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setCompassPage(value);
                return this;
            }

            public Builder setCountdownPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setCountdownPage(value);
                return this;
            }

            public Builder setCtrlmusicPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setCtrlmusicPage(value);
                return this;
            }

            public Builder setDialId(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setDialId(value);
                return this;
            }

            public Builder setDisconnectNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setDisconnectNum(value);
                return this;
            }

            public Builder setEditDialNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setEditDialNum(value);
                return this;
            }

            public Builder setEventRemindNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setEventRemindNum(value);
                return this;
            }

            public Builder setFindPhoneFailNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setFindPhoneFailNum(value);
                return this;
            }

            public Builder setFindPhoneSuccessNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setFindPhoneSuccessNum(value);
                return this;
            }

            public Builder setHeartratePage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setHeartratePage(value);
                return this;
            }

            public Builder setKeyPressCloseBacklightNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setKeyPressCloseBacklightNum(value);
                return this;
            }

            public Builder setLockclosePage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setLockclosePage(value);
                return this;
            }

            public Builder setLockstartPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setLockstartPage(value);
                return this;
            }

            public Builder setLongkeyRestoreFactoryNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setLongkeyRestoreFactoryNum(value);
                return this;
            }

            public Builder setMusicPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setMusicPage(value);
                return this;
            }

            public Builder setNFCcardPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setNFCcardPage(value);
                return this;
            }

            public Builder setNegativeAliPayBarcodeTime(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setNegativeAliPayBarcodeTime(value);
                return this;
            }

            public Builder setNegativeAliPayQrcodeTime(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setNegativeAliPayQrcodeTime(value);
                return this;
            }

            public Builder setNegativeHeartrateTime(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setNegativeHeartrateTime(value);
                return this;
            }

            public Builder setNegativeMusicTime(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setNegativeMusicTime(value);
                return this;
            }

            public Builder setNegativeNfcCardTime(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setNegativeNfcCardTime(value);
                return this;
            }

            public Builder setNegativeNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setNegativeNum(value);
                return this;
            }

            public Builder setNegativePaiTime(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setNegativePaiTime(value);
                return this;
            }

            public Builder setNegativeStateTime(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setNegativeStateTime(value);
                return this;
            }

            public Builder setNegativeWeatherNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setNegativeWeatherNum(value);
                return this;
            }

            public Builder setNoticeNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setNoticeNum(value);
                return this;
            }

            public Builder setPAIPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setPAIPage(value);
                return this;
            }

            public Builder setRemindCloseNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setRemindCloseNum(value);
                return this;
            }

            public Builder setRemindLaterNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setRemindLaterNum(value);
                return this;
            }

            public Builder setSettingCloseNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSettingCloseNum(value);
                return this;
            }

            public Builder setSettingPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSettingPage(value);
                return this;
            }

            public Builder setSettingRestoreFactoryNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSettingRestoreFactoryNum(value);
                return this;
            }

            public Builder setSettingWatchfacePage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSettingWatchfacePage(value);
                return this;
            }

            public Builder setSilencePage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSilencePage(value);
                return this;
            }

            public Builder setSilenceSwitchPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSilenceSwitchPage(value);
                return this;
            }

            public Builder setSkipGpsLocationNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSkipGpsLocationNum(value);
                return this;
            }

            public Builder setSportBreakLinkNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSportBreakLinkNum(value);
                return this;
            }

            public Builder setSportGpsSuccessTime(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSportGpsSuccessTime(value);
                return this;
            }

            public Builder setSportPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSportPage(value);
                return this;
            }

            public Builder setSportReLinkNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSportReLinkNum(value);
                return this;
            }

            public Builder setSportRemindNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setSportRemindNum(value);
                return this;
            }

            public Builder setStatusPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setStatusPage(value);
                return this;
            }

            public Builder setStopwatchPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setStopwatchPage(value);
                return this;
            }

            public Builder setWaitGpsLocationNum(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setWaitGpsLocationNum(value);
                return this;
            }

            public Builder setWeatherPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setWeatherPage(value);
                return this;
            }

            public Builder setWorldclockPage(int value) {
                copyOnWrite();
                ((DongTingHuEventMessage) this.instance).setWorldclockPage(value);
                return this;
            }

            private Builder() {
                super(DongTingHuEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            DongTingHuEventMessage dongTingHuEventMessage = new DongTingHuEventMessage();
            DEFAULT_INSTANCE = dongTingHuEventMessage;
            GeneratedMessageLite.registerDefaultInstance(DongTingHuEventMessage.class, dongTingHuEventMessage);
        }

        private DongTingHuEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayPage() {
            this.bitField0_ &= -17;
            this.alipayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppRemindNum() {
            this.bitField0_ &= -536870913;
            this.appRemindNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBacklightPage() {
            this.bitField0_ &= -1048577;
            this.backlightPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBeforeSportGpsPressPage() {
            this.bitField0_ &= -4194305;
            this.beforeSportGpsPressPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallRemindNum() {
            this.bitField0_ &= -1073741825;
            this.callRemindNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClockPage() {
            this.bitField0_ &= -129;
            this.clockPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClockclosePage() {
            this.bitField0_ &= -513;
            this.clockclosePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClockstartPage() {
            this.bitField0_ &= -257;
            this.clockstartPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompassPage() {
            this.bitField0_ &= -4097;
            this.compassPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountdownPage() {
            this.bitField0_ &= -2049;
            this.countdownPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCtrlmusicPage() {
            this.bitField0_ &= -2097153;
            this.ctrlmusicPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialId() {
            this.bitField1_ &= -17;
            this.dialId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisconnectNum() {
            this.bitField1_ &= -2;
            this.disconnectNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditDialNum() {
            this.bitField1_ &= -65;
            this.editDialNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventRemindNum() {
            this.bitField1_ &= -3;
            this.eventRemindNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneFailNum() {
            this.bitField1_ &= -262145;
            this.findPhoneFailNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneSuccessNum() {
            this.bitField1_ &= -131073;
            this.findPhoneSuccessNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartratePage() {
            this.bitField0_ &= -3;
            this.heartratePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyPressCloseBacklightNum() {
            this.bitField1_ &= -65537;
            this.keyPressCloseBacklightNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLockclosePage() {
            this.bitField0_ &= -524289;
            this.lockclosePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLockstartPage() {
            this.bitField0_ &= -262145;
            this.lockstartPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongkeyRestoreFactoryNum() {
            this.bitField1_ &= -2097153;
            this.longkeyRestoreFactoryNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicPage() {
            this.bitField0_ &= -8193;
            this.musicPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNFCcardPage() {
            this.bitField0_ &= -33;
            this.nFCcardPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativeAliPayBarcodeTime() {
            this.bitField1_ &= -513;
            this.negativeAliPayBarcodeTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativeAliPayQrcodeTime() {
            this.bitField1_ &= -1025;
            this.negativeAliPayQrcodeTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativeHeartrateTime() {
            this.bitField1_ &= -32769;
            this.negativeHeartrateTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativeMusicTime() {
            this.bitField1_ &= -257;
            this.negativeMusicTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativeNfcCardTime() {
            this.bitField1_ &= -2049;
            this.negativeNfcCardTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativeNum() {
            this.bitField1_ &= -129;
            this.negativeNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativePaiTime() {
            this.bitField1_ &= -8193;
            this.negativePaiTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativeStateTime() {
            this.bitField1_ &= -4097;
            this.negativeStateTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativeWeatherNum() {
            this.bitField1_ &= -16385;
            this.negativeWeatherNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoticeNum() {
            this.bitField0_ &= -268435457;
            this.noticeNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPAIPage() {
            this.bitField0_ &= -5;
            this.pAIPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindCloseNum() {
            this.bitField1_ &= -9;
            this.remindCloseNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindLaterNum() {
            this.bitField1_ &= -5;
            this.remindLaterNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingCloseNum() {
            this.bitField1_ &= -524289;
            this.settingCloseNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingPage() {
            this.bitField0_ &= -32769;
            this.settingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingRestoreFactoryNum() {
            this.bitField1_ &= -1048577;
            this.settingRestoreFactoryNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingWatchfacePage() {
            this.bitField1_ &= -33;
            this.settingWatchfacePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilencePage() {
            this.bitField0_ &= -65537;
            this.silencePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceSwitchPage() {
            this.bitField0_ &= -131073;
            this.silenceSwitchPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkipGpsLocationNum() {
            this.bitField0_ &= -33554433;
            this.skipGpsLocationNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportBreakLinkNum() {
            this.bitField0_ &= -67108865;
            this.sportBreakLinkNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportGpsSuccessTime() {
            this.bitField0_ &= -16777217;
            this.sportGpsSuccessTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportPage() {
            this.bitField0_ &= -9;
            this.sportPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportReLinkNum() {
            this.bitField0_ &= -134217729;
            this.sportReLinkNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportRemindNum() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.sportRemindNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusPage() {
            this.bitField0_ &= -2;
            this.statusPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchPage() {
            this.bitField0_ &= -1025;
            this.stopwatchPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWaitGpsLocationNum() {
            this.bitField0_ &= -8388609;
            this.waitGpsLocationNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherPage() {
            this.bitField0_ &= -65;
            this.weatherPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWorldclockPage() {
            this.bitField0_ &= -16385;
            this.worldclockPage_ = 0;
        }

        public static DongTingHuEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DongTingHuEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DongTingHuEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<DongTingHuEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayPage(int value) {
            this.bitField0_ |= 16;
            this.alipayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppRemindNum(int value) {
            this.bitField0_ |= 536870912;
            this.appRemindNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBacklightPage(int value) {
            this.bitField0_ |= 1048576;
            this.backlightPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBeforeSportGpsPressPage(int value) {
            this.bitField0_ |= 4194304;
            this.beforeSportGpsPressPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallRemindNum(int value) {
            this.bitField0_ |= 1073741824;
            this.callRemindNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClockPage(int value) {
            this.bitField0_ |= 128;
            this.clockPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClockclosePage(int value) {
            this.bitField0_ |= 512;
            this.clockclosePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClockstartPage(int value) {
            this.bitField0_ |= 256;
            this.clockstartPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompassPage(int value) {
            this.bitField0_ |= 4096;
            this.compassPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownPage(int value) {
            this.bitField0_ |= 2048;
            this.countdownPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCtrlmusicPage(int value) {
            this.bitField0_ |= 2097152;
            this.ctrlmusicPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialId(int value) {
            this.bitField1_ |= 16;
            this.dialId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisconnectNum(int value) {
            this.bitField1_ |= 1;
            this.disconnectNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditDialNum(int value) {
            this.bitField1_ |= 64;
            this.editDialNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventRemindNum(int value) {
            this.bitField1_ |= 2;
            this.eventRemindNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneFailNum(int value) {
            this.bitField1_ |= 262144;
            this.findPhoneFailNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneSuccessNum(int value) {
            this.bitField1_ |= 131072;
            this.findPhoneSuccessNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartratePage(int value) {
            this.bitField0_ |= 2;
            this.heartratePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyPressCloseBacklightNum(int value) {
            this.bitField1_ |= 65536;
            this.keyPressCloseBacklightNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLockclosePage(int value) {
            this.bitField0_ |= 524288;
            this.lockclosePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLockstartPage(int value) {
            this.bitField0_ |= 262144;
            this.lockstartPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongkeyRestoreFactoryNum(int value) {
            this.bitField1_ |= 2097152;
            this.longkeyRestoreFactoryNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicPage(int value) {
            this.bitField0_ |= 8192;
            this.musicPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNFCcardPage(int value) {
            this.bitField0_ |= 32;
            this.nFCcardPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeAliPayBarcodeTime(int value) {
            this.bitField1_ |= 512;
            this.negativeAliPayBarcodeTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeAliPayQrcodeTime(int value) {
            this.bitField1_ |= 1024;
            this.negativeAliPayQrcodeTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeHeartrateTime(int value) {
            this.bitField1_ |= 32768;
            this.negativeHeartrateTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeMusicTime(int value) {
            this.bitField1_ |= 256;
            this.negativeMusicTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeNfcCardTime(int value) {
            this.bitField1_ |= 2048;
            this.negativeNfcCardTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeNum(int value) {
            this.bitField1_ |= 128;
            this.negativeNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativePaiTime(int value) {
            this.bitField1_ |= 8192;
            this.negativePaiTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeStateTime(int value) {
            this.bitField1_ |= 4096;
            this.negativeStateTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeWeatherNum(int value) {
            this.bitField1_ |= 16384;
            this.negativeWeatherNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoticeNum(int value) {
            this.bitField0_ |= 268435456;
            this.noticeNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPAIPage(int value) {
            this.bitField0_ |= 4;
            this.pAIPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindCloseNum(int value) {
            this.bitField1_ |= 8;
            this.remindCloseNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindLaterNum(int value) {
            this.bitField1_ |= 4;
            this.remindLaterNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingCloseNum(int value) {
            this.bitField1_ |= 524288;
            this.settingCloseNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingPage(int value) {
            this.bitField0_ |= 32768;
            this.settingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingRestoreFactoryNum(int value) {
            this.bitField1_ |= 1048576;
            this.settingRestoreFactoryNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingWatchfacePage(int value) {
            this.bitField1_ |= 32;
            this.settingWatchfacePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilencePage(int value) {
            this.bitField0_ |= 65536;
            this.silencePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceSwitchPage(int value) {
            this.bitField0_ |= 131072;
            this.silenceSwitchPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkipGpsLocationNum(int value) {
            this.bitField0_ |= 33554432;
            this.skipGpsLocationNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportBreakLinkNum(int value) {
            this.bitField0_ |= 67108864;
            this.sportBreakLinkNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGpsSuccessTime(int value) {
            this.bitField0_ |= 16777216;
            this.sportGpsSuccessTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage(int value) {
            this.bitField0_ |= 8;
            this.sportPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportReLinkNum(int value) {
            this.bitField0_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.sportReLinkNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportRemindNum(int value) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.sportRemindNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage(int value) {
            this.bitField0_ |= 1;
            this.statusPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchPage(int value) {
            this.bitField0_ |= 1024;
            this.stopwatchPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWaitGpsLocationNum(int value) {
            this.bitField0_ |= 8388608;
            this.waitGpsLocationNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherPage(int value) {
            this.bitField0_ |= 64;
            this.weatherPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWorldclockPage(int value) {
            this.bitField0_ |= 16384;
            this.worldclockPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new DongTingHuEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u00016\u0000\u0002\u000166\u0000\u00006\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dᔋ\u001c\u001eᔋ\u001d\u001fᔋ\u001e ᔋ\u001f!ᔋ \"ᔋ!#ᔋ\"$ᔋ#%ᔋ$&ᔋ%'ᔋ&(ᔋ')ᔋ(*ᔋ)+ᔋ*,ᔋ+-ᔋ,.ᔋ-/ᔋ.0ᔋ/1ᔋ02ᔋ13ᔋ24ᔋ35ᔋ46ᔋ5", new Object[]{"bitField0_", "bitField1_", "statusPage_", "heartratePage_", "pAIPage_", "sportPage_", "alipayPage_", "nFCcardPage_", "weatherPage_", "clockPage_", "clockstartPage_", "clockclosePage_", "stopwatchPage_", "countdownPage_", "compassPage_", "musicPage_", "worldclockPage_", "settingPage_", "silencePage_", "silenceSwitchPage_", "lockstartPage_", "lockclosePage_", "backlightPage_", "ctrlmusicPage_", "beforeSportGpsPressPage_", "waitGpsLocationNum_", "sportGpsSuccessTime_", "skipGpsLocationNum_", "sportBreakLinkNum_", "sportReLinkNum_", "noticeNum_", "appRemindNum_", "callRemindNum_", "sportRemindNum_", "disconnectNum_", "eventRemindNum_", "remindLaterNum_", "remindCloseNum_", "dialId_", "settingWatchfacePage_", "editDialNum_", "negativeNum_", "negativeMusicTime_", "negativeAliPayBarcodeTime_", "negativeAliPayQrcodeTime_", "negativeNfcCardTime_", "negativeStateTime_", "negativePaiTime_", "negativeWeatherNum_", "negativeHeartrateTime_", "keyPressCloseBacklightNum_", "findPhoneSuccessNum_", "findPhoneFailNum_", "settingCloseNum_", "settingRestoreFactoryNum_", "longkeyRestoreFactoryNum_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DongTingHuEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DongTingHuEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getAlipayPage() {
            return this.alipayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getAppRemindNum() {
            return this.appRemindNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getBacklightPage() {
            return this.backlightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getBeforeSportGpsPressPage() {
            return this.beforeSportGpsPressPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getCallRemindNum() {
            return this.callRemindNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getClockPage() {
            return this.clockPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getClockclosePage() {
            return this.clockclosePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getClockstartPage() {
            return this.clockstartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getCompassPage() {
            return this.compassPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getCountdownPage() {
            return this.countdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getCtrlmusicPage() {
            return this.ctrlmusicPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getDisconnectNum() {
            return this.disconnectNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getEditDialNum() {
            return this.editDialNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getEventRemindNum() {
            return this.eventRemindNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getFindPhoneFailNum() {
            return this.findPhoneFailNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getFindPhoneSuccessNum() {
            return this.findPhoneSuccessNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getHeartratePage() {
            return this.heartratePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getKeyPressCloseBacklightNum() {
            return this.keyPressCloseBacklightNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getLockclosePage() {
            return this.lockclosePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getLockstartPage() {
            return this.lockstartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getLongkeyRestoreFactoryNum() {
            return this.longkeyRestoreFactoryNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getMusicPage() {
            return this.musicPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getNFCcardPage() {
            return this.nFCcardPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getNegativeAliPayBarcodeTime() {
            return this.negativeAliPayBarcodeTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getNegativeAliPayQrcodeTime() {
            return this.negativeAliPayQrcodeTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getNegativeHeartrateTime() {
            return this.negativeHeartrateTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getNegativeMusicTime() {
            return this.negativeMusicTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getNegativeNfcCardTime() {
            return this.negativeNfcCardTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getNegativeNum() {
            return this.negativeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getNegativePaiTime() {
            return this.negativePaiTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getNegativeStateTime() {
            return this.negativeStateTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getNegativeWeatherNum() {
            return this.negativeWeatherNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getNoticeNum() {
            return this.noticeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getPAIPage() {
            return this.pAIPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getRemindCloseNum() {
            return this.remindCloseNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getRemindLaterNum() {
            return this.remindLaterNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSettingCloseNum() {
            return this.settingCloseNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSettingRestoreFactoryNum() {
            return this.settingRestoreFactoryNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSettingWatchfacePage() {
            return this.settingWatchfacePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSilencePage() {
            return this.silencePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSilenceSwitchPage() {
            return this.silenceSwitchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSkipGpsLocationNum() {
            return this.skipGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSportBreakLinkNum() {
            return this.sportBreakLinkNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSportGpsSuccessTime() {
            return this.sportGpsSuccessTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSportPage() {
            return this.sportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSportReLinkNum() {
            return this.sportReLinkNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getSportRemindNum() {
            return this.sportRemindNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getStatusPage() {
            return this.statusPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getStopwatchPage() {
            return this.stopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getWaitGpsLocationNum() {
            return this.waitGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public int getWorldclockPage() {
            return this.worldclockPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasAlipayPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasAppRemindNum() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasBacklightPage() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasBeforeSportGpsPressPage() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasCallRemindNum() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasClockPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasClockclosePage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasClockstartPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasCompassPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasCountdownPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasCtrlmusicPage() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField1_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasDisconnectNum() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasEditDialNum() {
            return (this.bitField1_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasEventRemindNum() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasFindPhoneFailNum() {
            return (this.bitField1_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasFindPhoneSuccessNum() {
            return (this.bitField1_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasHeartratePage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasKeyPressCloseBacklightNum() {
            return (this.bitField1_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasLockclosePage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasLockstartPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasLongkeyRestoreFactoryNum() {
            return (this.bitField1_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasMusicPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasNFCcardPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasNegativeAliPayBarcodeTime() {
            return (this.bitField1_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasNegativeAliPayQrcodeTime() {
            return (this.bitField1_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasNegativeHeartrateTime() {
            return (this.bitField1_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasNegativeMusicTime() {
            return (this.bitField1_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasNegativeNfcCardTime() {
            return (this.bitField1_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasNegativeNum() {
            return (this.bitField1_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasNegativePaiTime() {
            return (this.bitField1_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasNegativeStateTime() {
            return (this.bitField1_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasNegativeWeatherNum() {
            return (this.bitField1_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasNoticeNum() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasPAIPage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasRemindCloseNum() {
            return (this.bitField1_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasRemindLaterNum() {
            return (this.bitField1_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSettingCloseNum() {
            return (this.bitField1_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSettingRestoreFactoryNum() {
            return (this.bitField1_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSettingWatchfacePage() {
            return (this.bitField1_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSilencePage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSilenceSwitchPage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSkipGpsLocationNum() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSportBreakLinkNum() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSportGpsSuccessTime() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSportPage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSportReLinkNum() {
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasSportRemindNum() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasStatusPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasStopwatchPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasWaitGpsLocationNum() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuEventMessageOrBuilder
        public boolean hasWorldclockPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        public static Builder newBuilder(DongTingHuEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static DongTingHuEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DongTingHuEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DongTingHuEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DongTingHuEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DongTingHuEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DongTingHuEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DongTingHuEventMessage parseFrom(InputStream input) throws IOException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DongTingHuEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DongTingHuEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DongTingHuEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DongTingHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface DongTingHuEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlipayPage();

        int getAppRemindNum();

        int getBacklightPage();

        int getBeforeSportGpsPressPage();

        int getCallRemindNum();

        int getClockPage();

        int getClockclosePage();

        int getClockstartPage();

        int getCompassPage();

        int getCountdownPage();

        int getCtrlmusicPage();

        int getDialId();

        int getDisconnectNum();

        int getEditDialNum();

        int getEventRemindNum();

        int getFindPhoneFailNum();

        int getFindPhoneSuccessNum();

        int getHeartratePage();

        int getKeyPressCloseBacklightNum();

        int getLockclosePage();

        int getLockstartPage();

        int getLongkeyRestoreFactoryNum();

        int getMusicPage();

        int getNFCcardPage();

        int getNegativeAliPayBarcodeTime();

        int getNegativeAliPayQrcodeTime();

        int getNegativeHeartrateTime();

        int getNegativeMusicTime();

        int getNegativeNfcCardTime();

        int getNegativeNum();

        int getNegativePaiTime();

        int getNegativeStateTime();

        int getNegativeWeatherNum();

        int getNoticeNum();

        int getPAIPage();

        int getRemindCloseNum();

        int getRemindLaterNum();

        int getSettingCloseNum();

        int getSettingPage();

        int getSettingRestoreFactoryNum();

        int getSettingWatchfacePage();

        int getSilencePage();

        int getSilenceSwitchPage();

        int getSkipGpsLocationNum();

        int getSportBreakLinkNum();

        int getSportGpsSuccessTime();

        int getSportPage();

        int getSportReLinkNum();

        int getSportRemindNum();

        int getStatusPage();

        int getStopwatchPage();

        int getWaitGpsLocationNum();

        int getWeatherPage();

        int getWorldclockPage();

        boolean hasAlipayPage();

        boolean hasAppRemindNum();

        boolean hasBacklightPage();

        boolean hasBeforeSportGpsPressPage();

        boolean hasCallRemindNum();

        boolean hasClockPage();

        boolean hasClockclosePage();

        boolean hasClockstartPage();

        boolean hasCompassPage();

        boolean hasCountdownPage();

        boolean hasCtrlmusicPage();

        boolean hasDialId();

        boolean hasDisconnectNum();

        boolean hasEditDialNum();

        boolean hasEventRemindNum();

        boolean hasFindPhoneFailNum();

        boolean hasFindPhoneSuccessNum();

        boolean hasHeartratePage();

        boolean hasKeyPressCloseBacklightNum();

        boolean hasLockclosePage();

        boolean hasLockstartPage();

        boolean hasLongkeyRestoreFactoryNum();

        boolean hasMusicPage();

        boolean hasNFCcardPage();

        boolean hasNegativeAliPayBarcodeTime();

        boolean hasNegativeAliPayQrcodeTime();

        boolean hasNegativeHeartrateTime();

        boolean hasNegativeMusicTime();

        boolean hasNegativeNfcCardTime();

        boolean hasNegativeNum();

        boolean hasNegativePaiTime();

        boolean hasNegativeStateTime();

        boolean hasNegativeWeatherNum();

        boolean hasNoticeNum();

        boolean hasPAIPage();

        boolean hasRemindCloseNum();

        boolean hasRemindLaterNum();

        boolean hasSettingCloseNum();

        boolean hasSettingPage();

        boolean hasSettingRestoreFactoryNum();

        boolean hasSettingWatchfacePage();

        boolean hasSilencePage();

        boolean hasSilenceSwitchPage();

        boolean hasSkipGpsLocationNum();

        boolean hasSportBreakLinkNum();

        boolean hasSportGpsSuccessTime();

        boolean hasSportPage();

        boolean hasSportReLinkNum();

        boolean hasSportRemindNum();

        boolean hasStatusPage();

        boolean hasStopwatchPage();

        boolean hasWaitGpsLocationNum();

        boolean hasWeatherPage();

        boolean hasWorldclockPage();
    }

    public static final class DongTingHuStatisticsMessage extends GeneratedMessageLite<DongTingHuStatisticsMessage, Builder> implements DongTingHuStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final DongTingHuStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        public static final int NFC_FIELD_NUMBER = 5;
        private static volatile Parser<DongTingHuStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private DongTingHuEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.Builder<DongTingHuStatisticsMessage, Builder> implements DongTingHuStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((DongTingHuStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((DongTingHuStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
            public DongTingHuEventMessage getEvent() {
                return ((DongTingHuStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
            public Nfc.NfcMessage getNfc() {
                return ((DongTingHuStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((DongTingHuStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((DongTingHuStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((DongTingHuStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((DongTingHuStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((DongTingHuStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((DongTingHuStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeEvent(DongTingHuEventMessage value) {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).mergeEvent(value);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).mergeNfc(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setEvent(DongTingHuEventMessage value) {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).setEvent(value);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).setNfc(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            private Builder() {
                super(DongTingHuStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setEvent(DongTingHuEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).setEvent(builderForValue.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builderForValue) {
                copyOnWrite();
                ((DongTingHuStatisticsMessage) this.instance).setNfc(builderForValue.build());
                return this;
            }
        }

        static {
            DongTingHuStatisticsMessage dongTingHuStatisticsMessage = new DongTingHuStatisticsMessage();
            DEFAULT_INSTANCE = dongTingHuStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(DongTingHuStatisticsMessage.class, dongTingHuStatisticsMessage);
        }

        private DongTingHuStatisticsMessage() {
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
        public void clearEvent() {
            this.event_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNfc() {
            this.nfc_ = null;
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceMode() {
            this.bitField0_ &= -3;
            this.silenceMode_ = 0;
        }

        public static DongTingHuStatisticsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
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
        public void mergeEvent(DongTingHuEventMessage value) {
            value.getClass();
            DongTingHuEventMessage dongTingHuEventMessage = this.event_;
            if (dongTingHuEventMessage == null || dongTingHuEventMessage == DongTingHuEventMessage.getDefaultInstance()) {
                this.event_ = value;
            } else {
                this.event_ = DongTingHuEventMessage.newBuilder(this.event_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNfc(Nfc.NfcMessage value) {
            value.getClass();
            Nfc.NfcMessage nfcMessage = this.nfc_;
            if (nfcMessage == null || nfcMessage == Nfc.NfcMessage.getDefaultInstance()) {
                this.nfc_ = value;
            } else {
                this.nfc_ = Nfc.NfcMessage.newBuilder(this.nfc_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DongTingHuStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DongTingHuStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<DongTingHuStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setEvent(DongTingHuEventMessage value) {
            value.getClass();
            this.event_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfc(Nfc.NfcMessage value) {
            value.getClass();
            this.nfc_ = value;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
            this.silenceMode_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new DongTingHuStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_", "nfc_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DongTingHuStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DongTingHuStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
        public DongTingHuEventMessage getEvent() {
            DongTingHuEventMessage dongTingHuEventMessage = this.event_;
            return dongTingHuEventMessage == null ? DongTingHuEventMessage.getDefaultInstance() : dongTingHuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
        public Nfc.NfcMessage getNfc() {
            Nfc.NfcMessage nfcMessage = this.nfc_;
            return nfcMessage == null ? Nfc.NfcMessage.getDefaultInstance() : nfcMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Dongtinghu.DongTingHuStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(DongTingHuStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static DongTingHuStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DongTingHuStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DongTingHuStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DongTingHuStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DongTingHuStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DongTingHuStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DongTingHuStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DongTingHuStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DongTingHuStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DongTingHuStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DongTingHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface DongTingHuStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        DongTingHuEventMessage getEvent();

        Nfc.NfcMessage getNfc();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasNfc();

        boolean hasSilenceMode();
    }

    private Dongtinghu() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
