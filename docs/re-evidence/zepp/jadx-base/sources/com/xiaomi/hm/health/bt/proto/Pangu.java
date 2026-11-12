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
public final class Pangu {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Pangu$1, reason: invalid class name */
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

    public static final class PanguStatisticsMessage extends GeneratedMessageLite<PanguStatisticsMessage, Builder> implements PanguStatisticsMessageOrBuilder {
        public static final int ABNORMALREBOOTCOUNT_FIELD_NUMBER = 19;
        public static final int ALEXA_FIELD_NUMBER = 31;
        public static final int ALIPAY_FIELD_NUMBER = 28;
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        public static final int BLOODOXYGENCOLOR_FIELD_NUMBER = 20;
        public static final int BREATH_FIELD_NUMBER = 25;
        public static final int CYCLE_FIELD_NUMBER = 26;
        private static final PanguStatisticsMessage DEFAULT_INSTANCE;
        public static final int DIALEVENT_FIELD_NUMBER = 13;
        public static final int DIALID_FIELD_NUMBER = 4;
        public static final int EVENTBYDIAL_FIELD_NUMBER = 8;
        public static final int EVENTBYMENU_FIELD_NUMBER = 7;
        public static final int EVENTBYSHORTCUT_FIELD_NUMBER = 6;
        public static final int EVENTBYXIAOAI_FIELD_NUMBER = 21;
        public static final int HR_FIELD_NUMBER = 23;
        public static final int LCDEVENT_FIELD_NUMBER = 5;
        public static final int MOREEVENT_FIELD_NUMBER = 10;
        public static final int NFC_FIELD_NUMBER = 27;
        public static final int NOTIFYEVENT_FIELD_NUMBER = 12;
        private static volatile Parser<PanguStatisticsMessage> PARSER = null;
        public static final int SHORTCUTLESS10S_FIELD_NUMBER = 17;
        public static final int SHORTCUTLESS3S_FIELD_NUMBER = 14;
        public static final int SHORTCUTLESS5S_FIELD_NUMBER = 15;
        public static final int SHORTCUTLESS8S_FIELD_NUMBER = 16;
        public static final int SHORTCUTLESSOTHER_FIELD_NUMBER = 18;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        public static final int SPO2_FIELD_NUMBER = 22;
        public static final int SPORTEVENT_FIELD_NUMBER = 11;
        public static final int STRESS_FIELD_NUMBER = 24;
        public static final int UPGRATE_FIELD_NUMBER = 30;
        public static final int WEIXIN_FIELD_NUMBER = 29;
        public static final int XIAOAIEVENT_FIELD_NUMBER = 9;
        private EventBase.AbnormalRebootCountMessage abnormalRebootCount_;
        private EventBase.AlexaEventMessage alexa_;
        private EventBase.AlipayEventMessage alipay_;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private float bloodOxygenColor_;
        private EventBase.breathEventMessage breath_;
        private EventBase.cycleEventMessage cycle_;
        private EventBase.DialEventMessage dialEvent_;
        private int dialId_;
        private EventBase.MenuEventMessage eventByDial_;
        private EventBase.MenuEventMessage eventByMenu_;
        private EventBase.MenuEventMessage eventByShortcut_;
        private EventBase.MenuEventMessage eventByXiaoai_;
        private EventBase.fitDataMeasureEventMessage hr_;
        private EventBase.LcdEventMessage lcdEvent_;
        private byte memoizedIsInitialized = 2;
        private EventBase.MoreEventMessage moreEvent_;
        private EventBase.nfcEventMessage nfc_;
        private EventBase.NotifyEventMessage notifyEvent_;
        private EventBase.ShortcutEventMessage shortcutLess10S_;
        private EventBase.ShortcutEventMessage shortcutLess3S_;
        private EventBase.ShortcutEventMessage shortcutLess5S_;
        private EventBase.ShortcutEventMessage shortcutLess8S_;
        private EventBase.ShortcutEventMessage shortcutLessOther_;
        private int silenceMode_;
        private EventBase.fitDataMeasureEventMessage spo2_;
        private EventBase.SportEventMessage sportEvent_;
        private EventBase.fitDataMeasureEventMessage stress_;
        private EventBase.UpgrateEventMessage upgrate_;
        private EventBase.AlipayEventMessage weixin_;
        private EventBase.XiaoaiEventMessage xiaoaiEvent_;

        public static final class Builder extends GeneratedMessageLite.Builder<PanguStatisticsMessage, Builder> implements PanguStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAbnormalRebootCount() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearAbnormalRebootCount();
                return this;
            }

            public Builder clearAlexa() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearAlexa();
                return this;
            }

            public Builder clearAlipay() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearAlipay();
                return this;
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearBloodOxygenColor() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearBloodOxygenColor();
                return this;
            }

            public Builder clearBreath() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearBreath();
                return this;
            }

            public Builder clearCycle() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearCycle();
                return this;
            }

            public Builder clearDialEvent() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearDialEvent();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearEventByDial() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearEventByDial();
                return this;
            }

            public Builder clearEventByMenu() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearEventByMenu();
                return this;
            }

            public Builder clearEventByShortcut() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearEventByShortcut();
                return this;
            }

            public Builder clearEventByXiaoai() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearEventByXiaoai();
                return this;
            }

            public Builder clearHr() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearHr();
                return this;
            }

            public Builder clearLcdEvent() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearLcdEvent();
                return this;
            }

            public Builder clearMoreEvent() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearMoreEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearNotifyEvent() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearNotifyEvent();
                return this;
            }

            public Builder clearShortcutLess10S() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearShortcutLess10S();
                return this;
            }

            public Builder clearShortcutLess3S() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearShortcutLess3S();
                return this;
            }

            public Builder clearShortcutLess5S() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearShortcutLess5S();
                return this;
            }

            public Builder clearShortcutLess8S() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearShortcutLess8S();
                return this;
            }

            public Builder clearShortcutLessOther() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearShortcutLessOther();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            public Builder clearSpo2() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearSpo2();
                return this;
            }

            public Builder clearSportEvent() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearSportEvent();
                return this;
            }

            public Builder clearStress() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearStress();
                return this;
            }

            public Builder clearUpgrate() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearUpgrate();
                return this;
            }

            public Builder clearWeixin() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearWeixin();
                return this;
            }

            public Builder clearXiaoaiEvent() {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).clearXiaoaiEvent();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.AbnormalRebootCountMessage getAbnormalRebootCount() {
                return ((PanguStatisticsMessage) this.instance).getAbnormalRebootCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.AlexaEventMessage getAlexa() {
                return ((PanguStatisticsMessage) this.instance).getAlexa();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.AlipayEventMessage getAlipay() {
                return ((PanguStatisticsMessage) this.instance).getAlipay();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((PanguStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((PanguStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public float getBloodOxygenColor() {
                return ((PanguStatisticsMessage) this.instance).getBloodOxygenColor();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.breathEventMessage getBreath() {
                return ((PanguStatisticsMessage) this.instance).getBreath();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.cycleEventMessage getCycle() {
                return ((PanguStatisticsMessage) this.instance).getCycle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.DialEventMessage getDialEvent() {
                return ((PanguStatisticsMessage) this.instance).getDialEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public int getDialId() {
                return ((PanguStatisticsMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.MenuEventMessage getEventByDial() {
                return ((PanguStatisticsMessage) this.instance).getEventByDial();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.MenuEventMessage getEventByMenu() {
                return ((PanguStatisticsMessage) this.instance).getEventByMenu();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.MenuEventMessage getEventByShortcut() {
                return ((PanguStatisticsMessage) this.instance).getEventByShortcut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.MenuEventMessage getEventByXiaoai() {
                return ((PanguStatisticsMessage) this.instance).getEventByXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.fitDataMeasureEventMessage getHr() {
                return ((PanguStatisticsMessage) this.instance).getHr();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.LcdEventMessage getLcdEvent() {
                return ((PanguStatisticsMessage) this.instance).getLcdEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.MoreEventMessage getMoreEvent() {
                return ((PanguStatisticsMessage) this.instance).getMoreEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.nfcEventMessage getNfc() {
                return ((PanguStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.NotifyEventMessage getNotifyEvent() {
                return ((PanguStatisticsMessage) this.instance).getNotifyEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.ShortcutEventMessage getShortcutLess10S() {
                return ((PanguStatisticsMessage) this.instance).getShortcutLess10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.ShortcutEventMessage getShortcutLess3S() {
                return ((PanguStatisticsMessage) this.instance).getShortcutLess3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.ShortcutEventMessage getShortcutLess5S() {
                return ((PanguStatisticsMessage) this.instance).getShortcutLess5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.ShortcutEventMessage getShortcutLess8S() {
                return ((PanguStatisticsMessage) this.instance).getShortcutLess8S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.ShortcutEventMessage getShortcutLessOther() {
                return ((PanguStatisticsMessage) this.instance).getShortcutLessOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((PanguStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.fitDataMeasureEventMessage getSpo2() {
                return ((PanguStatisticsMessage) this.instance).getSpo2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.SportEventMessage getSportEvent() {
                return ((PanguStatisticsMessage) this.instance).getSportEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.fitDataMeasureEventMessage getStress() {
                return ((PanguStatisticsMessage) this.instance).getStress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.UpgrateEventMessage getUpgrate() {
                return ((PanguStatisticsMessage) this.instance).getUpgrate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.AlipayEventMessage getWeixin() {
                return ((PanguStatisticsMessage) this.instance).getWeixin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public EventBase.XiaoaiEventMessage getXiaoaiEvent() {
                return ((PanguStatisticsMessage) this.instance).getXiaoaiEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasAbnormalRebootCount() {
                return ((PanguStatisticsMessage) this.instance).hasAbnormalRebootCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasAlexa() {
                return ((PanguStatisticsMessage) this.instance).hasAlexa();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasAlipay() {
                return ((PanguStatisticsMessage) this.instance).hasAlipay();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((PanguStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((PanguStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasBloodOxygenColor() {
                return ((PanguStatisticsMessage) this.instance).hasBloodOxygenColor();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasBreath() {
                return ((PanguStatisticsMessage) this.instance).hasBreath();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasCycle() {
                return ((PanguStatisticsMessage) this.instance).hasCycle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasDialEvent() {
                return ((PanguStatisticsMessage) this.instance).hasDialEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasDialId() {
                return ((PanguStatisticsMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasEventByDial() {
                return ((PanguStatisticsMessage) this.instance).hasEventByDial();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasEventByMenu() {
                return ((PanguStatisticsMessage) this.instance).hasEventByMenu();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasEventByShortcut() {
                return ((PanguStatisticsMessage) this.instance).hasEventByShortcut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasEventByXiaoai() {
                return ((PanguStatisticsMessage) this.instance).hasEventByXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasHr() {
                return ((PanguStatisticsMessage) this.instance).hasHr();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasLcdEvent() {
                return ((PanguStatisticsMessage) this.instance).hasLcdEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasMoreEvent() {
                return ((PanguStatisticsMessage) this.instance).hasMoreEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((PanguStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasNotifyEvent() {
                return ((PanguStatisticsMessage) this.instance).hasNotifyEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasShortcutLess10S() {
                return ((PanguStatisticsMessage) this.instance).hasShortcutLess10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasShortcutLess3S() {
                return ((PanguStatisticsMessage) this.instance).hasShortcutLess3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasShortcutLess5S() {
                return ((PanguStatisticsMessage) this.instance).hasShortcutLess5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasShortcutLess8S() {
                return ((PanguStatisticsMessage) this.instance).hasShortcutLess8S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasShortcutLessOther() {
                return ((PanguStatisticsMessage) this.instance).hasShortcutLessOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((PanguStatisticsMessage) this.instance).hasSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasSpo2() {
                return ((PanguStatisticsMessage) this.instance).hasSpo2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasSportEvent() {
                return ((PanguStatisticsMessage) this.instance).hasSportEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasStress() {
                return ((PanguStatisticsMessage) this.instance).hasStress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasUpgrate() {
                return ((PanguStatisticsMessage) this.instance).hasUpgrate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasWeixin() {
                return ((PanguStatisticsMessage) this.instance).hasWeixin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
            public boolean hasXiaoaiEvent() {
                return ((PanguStatisticsMessage) this.instance).hasXiaoaiEvent();
            }

            public Builder mergeAbnormalRebootCount(EventBase.AbnormalRebootCountMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeAbnormalRebootCount(value);
                return this;
            }

            public Builder mergeAlexa(EventBase.AlexaEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeAlexa(value);
                return this;
            }

            public Builder mergeAlipay(EventBase.AlipayEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeAlipay(value);
                return this;
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeBreath(EventBase.breathEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeBreath(value);
                return this;
            }

            public Builder mergeCycle(EventBase.cycleEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeCycle(value);
                return this;
            }

            public Builder mergeDialEvent(EventBase.DialEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeDialEvent(value);
                return this;
            }

            public Builder mergeEventByDial(EventBase.MenuEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeEventByDial(value);
                return this;
            }

            public Builder mergeEventByMenu(EventBase.MenuEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeEventByMenu(value);
                return this;
            }

            public Builder mergeEventByShortcut(EventBase.MenuEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeEventByShortcut(value);
                return this;
            }

            public Builder mergeEventByXiaoai(EventBase.MenuEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeEventByXiaoai(value);
                return this;
            }

            public Builder mergeHr(EventBase.fitDataMeasureEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeHr(value);
                return this;
            }

            public Builder mergeLcdEvent(EventBase.LcdEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeLcdEvent(value);
                return this;
            }

            public Builder mergeMoreEvent(EventBase.MoreEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeMoreEvent(value);
                return this;
            }

            public Builder mergeNfc(EventBase.nfcEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeNfc(value);
                return this;
            }

            public Builder mergeNotifyEvent(EventBase.NotifyEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeNotifyEvent(value);
                return this;
            }

            public Builder mergeShortcutLess10S(EventBase.ShortcutEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeShortcutLess10S(value);
                return this;
            }

            public Builder mergeShortcutLess3S(EventBase.ShortcutEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeShortcutLess3S(value);
                return this;
            }

            public Builder mergeShortcutLess5S(EventBase.ShortcutEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeShortcutLess5S(value);
                return this;
            }

            public Builder mergeShortcutLess8S(EventBase.ShortcutEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeShortcutLess8S(value);
                return this;
            }

            public Builder mergeShortcutLessOther(EventBase.ShortcutEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeShortcutLessOther(value);
                return this;
            }

            public Builder mergeSpo2(EventBase.fitDataMeasureEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeSpo2(value);
                return this;
            }

            public Builder mergeSportEvent(EventBase.SportEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeSportEvent(value);
                return this;
            }

            public Builder mergeStress(EventBase.fitDataMeasureEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeStress(value);
                return this;
            }

            public Builder mergeUpgrate(EventBase.UpgrateEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeUpgrate(value);
                return this;
            }

            public Builder mergeWeixin(EventBase.AlipayEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeWeixin(value);
                return this;
            }

            public Builder mergeXiaoaiEvent(EventBase.XiaoaiEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeXiaoaiEvent(value);
                return this;
            }

            public Builder setAbnormalRebootCount(EventBase.AbnormalRebootCountMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAbnormalRebootCount(value);
                return this;
            }

            public Builder setAlexa(EventBase.AlexaEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAlexa(value);
                return this;
            }

            public Builder setAlipay(EventBase.AlipayEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAlipay(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setBloodOxygenColor(float value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBloodOxygenColor(value);
                return this;
            }

            public Builder setBreath(EventBase.breathEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBreath(value);
                return this;
            }

            public Builder setCycle(EventBase.cycleEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setCycle(value);
                return this;
            }

            public Builder setDialEvent(EventBase.DialEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setDialEvent(value);
                return this;
            }

            public Builder setDialId(int value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setDialId(value);
                return this;
            }

            public Builder setEventByDial(EventBase.MenuEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByDial(value);
                return this;
            }

            public Builder setEventByMenu(EventBase.MenuEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByMenu(value);
                return this;
            }

            public Builder setEventByShortcut(EventBase.MenuEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByShortcut(value);
                return this;
            }

            public Builder setEventByXiaoai(EventBase.MenuEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByXiaoai(value);
                return this;
            }

            public Builder setHr(EventBase.fitDataMeasureEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setHr(value);
                return this;
            }

            public Builder setLcdEvent(EventBase.LcdEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setLcdEvent(value);
                return this;
            }

            public Builder setMoreEvent(EventBase.MoreEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setMoreEvent(value);
                return this;
            }

            public Builder setNfc(EventBase.nfcEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setNfc(value);
                return this;
            }

            public Builder setNotifyEvent(EventBase.NotifyEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setNotifyEvent(value);
                return this;
            }

            public Builder setShortcutLess10S(EventBase.ShortcutEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess10S(value);
                return this;
            }

            public Builder setShortcutLess3S(EventBase.ShortcutEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess3S(value);
                return this;
            }

            public Builder setShortcutLess5S(EventBase.ShortcutEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess5S(value);
                return this;
            }

            public Builder setShortcutLess8S(EventBase.ShortcutEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess8S(value);
                return this;
            }

            public Builder setShortcutLessOther(EventBase.ShortcutEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLessOther(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            public Builder setSpo2(EventBase.fitDataMeasureEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setSpo2(value);
                return this;
            }

            public Builder setSportEvent(EventBase.SportEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setSportEvent(value);
                return this;
            }

            public Builder setStress(EventBase.fitDataMeasureEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setStress(value);
                return this;
            }

            public Builder setUpgrate(EventBase.UpgrateEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setUpgrate(value);
                return this;
            }

            public Builder setWeixin(EventBase.AlipayEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setWeixin(value);
                return this;
            }

            public Builder setXiaoaiEvent(EventBase.XiaoaiEventMessage value) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setXiaoaiEvent(value);
                return this;
            }

            private Builder() {
                super(PanguStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setAbnormalRebootCount(EventBase.AbnormalRebootCountMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAbnormalRebootCount(builderForValue.build());
                return this;
            }

            public Builder setAlexa(EventBase.AlexaEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAlexa(builderForValue.build());
                return this;
            }

            public Builder setAlipay(EventBase.AlipayEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAlipay(builderForValue.build());
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setBreath(EventBase.breathEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBreath(builderForValue.build());
                return this;
            }

            public Builder setCycle(EventBase.cycleEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setCycle(builderForValue.build());
                return this;
            }

            public Builder setDialEvent(EventBase.DialEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setDialEvent(builderForValue.build());
                return this;
            }

            public Builder setEventByDial(EventBase.MenuEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByDial(builderForValue.build());
                return this;
            }

            public Builder setEventByMenu(EventBase.MenuEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByMenu(builderForValue.build());
                return this;
            }

            public Builder setEventByShortcut(EventBase.MenuEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByShortcut(builderForValue.build());
                return this;
            }

            public Builder setEventByXiaoai(EventBase.MenuEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByXiaoai(builderForValue.build());
                return this;
            }

            public Builder setHr(EventBase.fitDataMeasureEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setHr(builderForValue.build());
                return this;
            }

            public Builder setLcdEvent(EventBase.LcdEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setLcdEvent(builderForValue.build());
                return this;
            }

            public Builder setMoreEvent(EventBase.MoreEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setMoreEvent(builderForValue.build());
                return this;
            }

            public Builder setNfc(EventBase.nfcEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setNfc(builderForValue.build());
                return this;
            }

            public Builder setNotifyEvent(EventBase.NotifyEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setNotifyEvent(builderForValue.build());
                return this;
            }

            public Builder setShortcutLess10S(EventBase.ShortcutEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess10S(builderForValue.build());
                return this;
            }

            public Builder setShortcutLess3S(EventBase.ShortcutEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess3S(builderForValue.build());
                return this;
            }

            public Builder setShortcutLess5S(EventBase.ShortcutEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess5S(builderForValue.build());
                return this;
            }

            public Builder setShortcutLess8S(EventBase.ShortcutEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess8S(builderForValue.build());
                return this;
            }

            public Builder setShortcutLessOther(EventBase.ShortcutEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLessOther(builderForValue.build());
                return this;
            }

            public Builder setSpo2(EventBase.fitDataMeasureEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setSpo2(builderForValue.build());
                return this;
            }

            public Builder setSportEvent(EventBase.SportEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setSportEvent(builderForValue.build());
                return this;
            }

            public Builder setStress(EventBase.fitDataMeasureEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setStress(builderForValue.build());
                return this;
            }

            public Builder setUpgrate(EventBase.UpgrateEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setUpgrate(builderForValue.build());
                return this;
            }

            public Builder setWeixin(EventBase.AlipayEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setWeixin(builderForValue.build());
                return this;
            }

            public Builder setXiaoaiEvent(EventBase.XiaoaiEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setXiaoaiEvent(builderForValue.build());
                return this;
            }
        }

        static {
            PanguStatisticsMessage panguStatisticsMessage = new PanguStatisticsMessage();
            DEFAULT_INSTANCE = panguStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(PanguStatisticsMessage.class, panguStatisticsMessage);
        }

        private PanguStatisticsMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAbnormalRebootCount() {
            this.abnormalRebootCount_ = null;
            this.bitField0_ &= -262145;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlexa() {
            this.alexa_ = null;
            this.bitField0_ &= -1073741825;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipay() {
            this.alipay_ = null;
            this.bitField0_ &= -134217729;
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
        public void clearBloodOxygenColor() {
            this.bitField0_ &= -524289;
            this.bloodOxygenColor_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBreath() {
            this.breath_ = null;
            this.bitField0_ &= -16777217;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCycle() {
            this.cycle_ = null;
            this.bitField0_ &= -33554433;
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
        public void clearEventByXiaoai() {
            this.eventByXiaoai_ = null;
            this.bitField0_ &= -1048577;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHr() {
            this.hr_ = null;
            this.bitField0_ &= -4194305;
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
        public void clearNfc() {
            this.nfc_ = null;
            this.bitField0_ &= -67108865;
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
        public void clearSpo2() {
            this.spo2_ = null;
            this.bitField0_ &= -2097153;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportEvent() {
            this.sportEvent_ = null;
            this.bitField0_ &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStress() {
            this.stress_ = null;
            this.bitField0_ &= -8388609;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpgrate() {
            this.upgrate_ = null;
            this.bitField0_ &= -536870913;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeixin() {
            this.weixin_ = null;
            this.bitField0_ &= -268435457;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXiaoaiEvent() {
            this.xiaoaiEvent_ = null;
            this.bitField0_ &= -257;
        }

        public static PanguStatisticsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAbnormalRebootCount(EventBase.AbnormalRebootCountMessage value) {
            value.getClass();
            EventBase.AbnormalRebootCountMessage abnormalRebootCountMessage = this.abnormalRebootCount_;
            if (abnormalRebootCountMessage == null || abnormalRebootCountMessage == EventBase.AbnormalRebootCountMessage.getDefaultInstance()) {
                this.abnormalRebootCount_ = value;
            } else {
                this.abnormalRebootCount_ = EventBase.AbnormalRebootCountMessage.newBuilder(this.abnormalRebootCount_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAlexa(EventBase.AlexaEventMessage value) {
            value.getClass();
            EventBase.AlexaEventMessage alexaEventMessage = this.alexa_;
            if (alexaEventMessage == null || alexaEventMessage == EventBase.AlexaEventMessage.getDefaultInstance()) {
                this.alexa_ = value;
            } else {
                this.alexa_ = EventBase.AlexaEventMessage.newBuilder(this.alexa_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 1073741824;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAlipay(EventBase.AlipayEventMessage value) {
            value.getClass();
            EventBase.AlipayEventMessage alipayEventMessage = this.alipay_;
            if (alipayEventMessage == null || alipayEventMessage == EventBase.AlipayEventMessage.getDefaultInstance()) {
                this.alipay_ = value;
            } else {
                this.alipay_ = EventBase.AlipayEventMessage.newBuilder(this.alipay_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
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
        public void mergeBreath(EventBase.breathEventMessage value) {
            value.getClass();
            EventBase.breathEventMessage breatheventmessage = this.breath_;
            if (breatheventmessage == null || breatheventmessage == EventBase.breathEventMessage.getDefaultInstance()) {
                this.breath_ = value;
            } else {
                this.breath_ = EventBase.breathEventMessage.newBuilder(this.breath_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16777216;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCycle(EventBase.cycleEventMessage value) {
            value.getClass();
            EventBase.cycleEventMessage cycleeventmessage = this.cycle_;
            if (cycleeventmessage == null || cycleeventmessage == EventBase.cycleEventMessage.getDefaultInstance()) {
                this.cycle_ = value;
            } else {
                this.cycle_ = EventBase.cycleEventMessage.newBuilder(this.cycle_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 33554432;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialEvent(EventBase.DialEventMessage value) {
            value.getClass();
            EventBase.DialEventMessage dialEventMessage = this.dialEvent_;
            if (dialEventMessage == null || dialEventMessage == EventBase.DialEventMessage.getDefaultInstance()) {
                this.dialEvent_ = value;
            } else {
                this.dialEvent_ = EventBase.DialEventMessage.newBuilder(this.dialEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventByDial(EventBase.MenuEventMessage value) {
            value.getClass();
            EventBase.MenuEventMessage menuEventMessage = this.eventByDial_;
            if (menuEventMessage == null || menuEventMessage == EventBase.MenuEventMessage.getDefaultInstance()) {
                this.eventByDial_ = value;
            } else {
                this.eventByDial_ = EventBase.MenuEventMessage.newBuilder(this.eventByDial_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventByMenu(EventBase.MenuEventMessage value) {
            value.getClass();
            EventBase.MenuEventMessage menuEventMessage = this.eventByMenu_;
            if (menuEventMessage == null || menuEventMessage == EventBase.MenuEventMessage.getDefaultInstance()) {
                this.eventByMenu_ = value;
            } else {
                this.eventByMenu_ = EventBase.MenuEventMessage.newBuilder(this.eventByMenu_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventByShortcut(EventBase.MenuEventMessage value) {
            value.getClass();
            EventBase.MenuEventMessage menuEventMessage = this.eventByShortcut_;
            if (menuEventMessage == null || menuEventMessage == EventBase.MenuEventMessage.getDefaultInstance()) {
                this.eventByShortcut_ = value;
            } else {
                this.eventByShortcut_ = EventBase.MenuEventMessage.newBuilder(this.eventByShortcut_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventByXiaoai(EventBase.MenuEventMessage value) {
            value.getClass();
            EventBase.MenuEventMessage menuEventMessage = this.eventByXiaoai_;
            if (menuEventMessage == null || menuEventMessage == EventBase.MenuEventMessage.getDefaultInstance()) {
                this.eventByXiaoai_ = value;
            } else {
                this.eventByXiaoai_ = EventBase.MenuEventMessage.newBuilder(this.eventByXiaoai_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 1048576;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHr(EventBase.fitDataMeasureEventMessage value) {
            value.getClass();
            EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage = this.hr_;
            if (fitdatameasureeventmessage == null || fitdatameasureeventmessage == EventBase.fitDataMeasureEventMessage.getDefaultInstance()) {
                this.hr_ = value;
            } else {
                this.hr_ = EventBase.fitDataMeasureEventMessage.newBuilder(this.hr_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLcdEvent(EventBase.LcdEventMessage value) {
            value.getClass();
            EventBase.LcdEventMessage lcdEventMessage = this.lcdEvent_;
            if (lcdEventMessage == null || lcdEventMessage == EventBase.LcdEventMessage.getDefaultInstance()) {
                this.lcdEvent_ = value;
            } else {
                this.lcdEvent_ = EventBase.LcdEventMessage.newBuilder(this.lcdEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMoreEvent(EventBase.MoreEventMessage value) {
            value.getClass();
            EventBase.MoreEventMessage moreEventMessage = this.moreEvent_;
            if (moreEventMessage == null || moreEventMessage == EventBase.MoreEventMessage.getDefaultInstance()) {
                this.moreEvent_ = value;
            } else {
                this.moreEvent_ = EventBase.MoreEventMessage.newBuilder(this.moreEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNfc(EventBase.nfcEventMessage value) {
            value.getClass();
            EventBase.nfcEventMessage nfceventmessage = this.nfc_;
            if (nfceventmessage == null || nfceventmessage == EventBase.nfcEventMessage.getDefaultInstance()) {
                this.nfc_ = value;
            } else {
                this.nfc_ = EventBase.nfcEventMessage.newBuilder(this.nfc_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 67108864;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotifyEvent(EventBase.NotifyEventMessage value) {
            value.getClass();
            EventBase.NotifyEventMessage notifyEventMessage = this.notifyEvent_;
            if (notifyEventMessage == null || notifyEventMessage == EventBase.NotifyEventMessage.getDefaultInstance()) {
                this.notifyEvent_ = value;
            } else {
                this.notifyEvent_ = EventBase.NotifyEventMessage.newBuilder(this.notifyEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess10S(EventBase.ShortcutEventMessage value) {
            value.getClass();
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess10S_;
            if (shortcutEventMessage == null || shortcutEventMessage == EventBase.ShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess10S_ = value;
            } else {
                this.shortcutLess10S_ = EventBase.ShortcutEventMessage.newBuilder(this.shortcutLess10S_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess3S(EventBase.ShortcutEventMessage value) {
            value.getClass();
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess3S_;
            if (shortcutEventMessage == null || shortcutEventMessage == EventBase.ShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess3S_ = value;
            } else {
                this.shortcutLess3S_ = EventBase.ShortcutEventMessage.newBuilder(this.shortcutLess3S_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess5S(EventBase.ShortcutEventMessage value) {
            value.getClass();
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess5S_;
            if (shortcutEventMessage == null || shortcutEventMessage == EventBase.ShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess5S_ = value;
            } else {
                this.shortcutLess5S_ = EventBase.ShortcutEventMessage.newBuilder(this.shortcutLess5S_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess8S(EventBase.ShortcutEventMessage value) {
            value.getClass();
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess8S_;
            if (shortcutEventMessage == null || shortcutEventMessage == EventBase.ShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess8S_ = value;
            } else {
                this.shortcutLess8S_ = EventBase.ShortcutEventMessage.newBuilder(this.shortcutLess8S_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLessOther(EventBase.ShortcutEventMessage value) {
            value.getClass();
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLessOther_;
            if (shortcutEventMessage == null || shortcutEventMessage == EventBase.ShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLessOther_ = value;
            } else {
                this.shortcutLessOther_ = EventBase.ShortcutEventMessage.newBuilder(this.shortcutLessOther_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSpo2(EventBase.fitDataMeasureEventMessage value) {
            value.getClass();
            EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage = this.spo2_;
            if (fitdatameasureeventmessage == null || fitdatameasureeventmessage == EventBase.fitDataMeasureEventMessage.getDefaultInstance()) {
                this.spo2_ = value;
            } else {
                this.spo2_ = EventBase.fitDataMeasureEventMessage.newBuilder(this.spo2_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 2097152;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSportEvent(EventBase.SportEventMessage value) {
            value.getClass();
            EventBase.SportEventMessage sportEventMessage = this.sportEvent_;
            if (sportEventMessage == null || sportEventMessage == EventBase.SportEventMessage.getDefaultInstance()) {
                this.sportEvent_ = value;
            } else {
                this.sportEvent_ = EventBase.SportEventMessage.newBuilder(this.sportEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStress(EventBase.fitDataMeasureEventMessage value) {
            value.getClass();
            EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage = this.stress_;
            if (fitdatameasureeventmessage == null || fitdatameasureeventmessage == EventBase.fitDataMeasureEventMessage.getDefaultInstance()) {
                this.stress_ = value;
            } else {
                this.stress_ = EventBase.fitDataMeasureEventMessage.newBuilder(this.stress_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8388608;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUpgrate(EventBase.UpgrateEventMessage value) {
            value.getClass();
            EventBase.UpgrateEventMessage upgrateEventMessage = this.upgrate_;
            if (upgrateEventMessage == null || upgrateEventMessage == EventBase.UpgrateEventMessage.getDefaultInstance()) {
                this.upgrate_ = value;
            } else {
                this.upgrate_ = EventBase.UpgrateEventMessage.newBuilder(this.upgrate_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 536870912;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWeixin(EventBase.AlipayEventMessage value) {
            value.getClass();
            EventBase.AlipayEventMessage alipayEventMessage = this.weixin_;
            if (alipayEventMessage == null || alipayEventMessage == EventBase.AlipayEventMessage.getDefaultInstance()) {
                this.weixin_ = value;
            } else {
                this.weixin_ = EventBase.AlipayEventMessage.newBuilder(this.weixin_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 268435456;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeXiaoaiEvent(EventBase.XiaoaiEventMessage value) {
            value.getClass();
            EventBase.XiaoaiEventMessage xiaoaiEventMessage = this.xiaoaiEvent_;
            if (xiaoaiEventMessage == null || xiaoaiEventMessage == EventBase.XiaoaiEventMessage.getDefaultInstance()) {
                this.xiaoaiEvent_ = value;
            } else {
                this.xiaoaiEvent_ = EventBase.XiaoaiEventMessage.newBuilder(this.xiaoaiEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PanguStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PanguStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<PanguStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbnormalRebootCount(EventBase.AbnormalRebootCountMessage value) {
            value.getClass();
            this.abnormalRebootCount_ = value;
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlexa(EventBase.AlexaEventMessage value) {
            value.getClass();
            this.alexa_ = value;
            this.bitField0_ |= 1073741824;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipay(EventBase.AlipayEventMessage value) {
            value.getClass();
            this.alipay_ = value;
            this.bitField0_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
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
        public void setBloodOxygenColor(float value) {
            this.bitField0_ |= 524288;
            this.bloodOxygenColor_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreath(EventBase.breathEventMessage value) {
            value.getClass();
            this.breath_ = value;
            this.bitField0_ |= 16777216;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCycle(EventBase.cycleEventMessage value) {
            value.getClass();
            this.cycle_ = value;
            this.bitField0_ |= 33554432;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialEvent(EventBase.DialEventMessage value) {
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
        public void setEventByDial(EventBase.MenuEventMessage value) {
            value.getClass();
            this.eventByDial_ = value;
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventByMenu(EventBase.MenuEventMessage value) {
            value.getClass();
            this.eventByMenu_ = value;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventByShortcut(EventBase.MenuEventMessage value) {
            value.getClass();
            this.eventByShortcut_ = value;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventByXiaoai(EventBase.MenuEventMessage value) {
            value.getClass();
            this.eventByXiaoai_ = value;
            this.bitField0_ |= 1048576;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHr(EventBase.fitDataMeasureEventMessage value) {
            value.getClass();
            this.hr_ = value;
            this.bitField0_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdEvent(EventBase.LcdEventMessage value) {
            value.getClass();
            this.lcdEvent_ = value;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMoreEvent(EventBase.MoreEventMessage value) {
            value.getClass();
            this.moreEvent_ = value;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfc(EventBase.nfcEventMessage value) {
            value.getClass();
            this.nfc_ = value;
            this.bitField0_ |= 67108864;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyEvent(EventBase.NotifyEventMessage value) {
            value.getClass();
            this.notifyEvent_ = value;
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess10S(EventBase.ShortcutEventMessage value) {
            value.getClass();
            this.shortcutLess10S_ = value;
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess3S(EventBase.ShortcutEventMessage value) {
            value.getClass();
            this.shortcutLess3S_ = value;
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess5S(EventBase.ShortcutEventMessage value) {
            value.getClass();
            this.shortcutLess5S_ = value;
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess8S(EventBase.ShortcutEventMessage value) {
            value.getClass();
            this.shortcutLess8S_ = value;
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLessOther(EventBase.ShortcutEventMessage value) {
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
        public void setSpo2(EventBase.fitDataMeasureEventMessage value) {
            value.getClass();
            this.spo2_ = value;
            this.bitField0_ |= 2097152;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportEvent(EventBase.SportEventMessage value) {
            value.getClass();
            this.sportEvent_ = value;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStress(EventBase.fitDataMeasureEventMessage value) {
            value.getClass();
            this.stress_ = value;
            this.bitField0_ |= 8388608;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpgrate(EventBase.UpgrateEventMessage value) {
            value.getClass();
            this.upgrate_ = value;
            this.bitField0_ |= 536870912;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeixin(EventBase.AlipayEventMessage value) {
            value.getClass();
            this.weixin_ = value;
            this.bitField0_ |= 268435456;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXiaoaiEvent(EventBase.XiaoaiEventMessage value) {
            value.getClass();
            this.xiaoaiEvent_ = value;
            this.bitField0_ |= 256;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new PanguStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0000\u001f\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔉ\u0004\u0006ᔉ\u0005\u0007ᔉ\u0006\bᔉ\u0007\tᔉ\b\nᔉ\t\u000bᔉ\n\fᔉ\u000b\rᔉ\f\u000eᔉ\r\u000fᔉ\u000e\u0010ᔉ\u000f\u0011ᔉ\u0010\u0012ᔉ\u0011\u0013ᔉ\u0012\u0014ᔁ\u0013\u0015ᔉ\u0014\u0016ᔉ\u0015\u0017ᔉ\u0016\u0018ᔉ\u0017\u0019ᔉ\u0018\u001aᔉ\u0019\u001bᔉ\u001a\u001cᔉ\u001b\u001dᔉ\u001c\u001eᔉ\u001d\u001fᔉ\u001e", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "dialId_", "lcdEvent_", "eventByShortcut_", "eventByMenu_", "eventByDial_", "xiaoaiEvent_", "moreEvent_", "sportEvent_", "notifyEvent_", "dialEvent_", "shortcutLess3S_", "shortcutLess5S_", "shortcutLess8S_", "shortcutLess10S_", "shortcutLessOther_", "abnormalRebootCount_", "bloodOxygenColor_", "eventByXiaoai_", "spo2_", "hr_", "stress_", "breath_", "cycle_", "nfc_", "alipay_", "weixin_", "upgrate_", "alexa_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PanguStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PanguStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.AbnormalRebootCountMessage getAbnormalRebootCount() {
            EventBase.AbnormalRebootCountMessage abnormalRebootCountMessage = this.abnormalRebootCount_;
            return abnormalRebootCountMessage == null ? EventBase.AbnormalRebootCountMessage.getDefaultInstance() : abnormalRebootCountMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.AlexaEventMessage getAlexa() {
            EventBase.AlexaEventMessage alexaEventMessage = this.alexa_;
            return alexaEventMessage == null ? EventBase.AlexaEventMessage.getDefaultInstance() : alexaEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.AlipayEventMessage getAlipay() {
            EventBase.AlipayEventMessage alipayEventMessage = this.alipay_;
            return alipayEventMessage == null ? EventBase.AlipayEventMessage.getDefaultInstance() : alipayEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public float getBloodOxygenColor() {
            return this.bloodOxygenColor_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.breathEventMessage getBreath() {
            EventBase.breathEventMessage breatheventmessage = this.breath_;
            return breatheventmessage == null ? EventBase.breathEventMessage.getDefaultInstance() : breatheventmessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.cycleEventMessage getCycle() {
            EventBase.cycleEventMessage cycleeventmessage = this.cycle_;
            return cycleeventmessage == null ? EventBase.cycleEventMessage.getDefaultInstance() : cycleeventmessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.DialEventMessage getDialEvent() {
            EventBase.DialEventMessage dialEventMessage = this.dialEvent_;
            return dialEventMessage == null ? EventBase.DialEventMessage.getDefaultInstance() : dialEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.MenuEventMessage getEventByDial() {
            EventBase.MenuEventMessage menuEventMessage = this.eventByDial_;
            return menuEventMessage == null ? EventBase.MenuEventMessage.getDefaultInstance() : menuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.MenuEventMessage getEventByMenu() {
            EventBase.MenuEventMessage menuEventMessage = this.eventByMenu_;
            return menuEventMessage == null ? EventBase.MenuEventMessage.getDefaultInstance() : menuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.MenuEventMessage getEventByShortcut() {
            EventBase.MenuEventMessage menuEventMessage = this.eventByShortcut_;
            return menuEventMessage == null ? EventBase.MenuEventMessage.getDefaultInstance() : menuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.MenuEventMessage getEventByXiaoai() {
            EventBase.MenuEventMessage menuEventMessage = this.eventByXiaoai_;
            return menuEventMessage == null ? EventBase.MenuEventMessage.getDefaultInstance() : menuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.fitDataMeasureEventMessage getHr() {
            EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage = this.hr_;
            return fitdatameasureeventmessage == null ? EventBase.fitDataMeasureEventMessage.getDefaultInstance() : fitdatameasureeventmessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.LcdEventMessage getLcdEvent() {
            EventBase.LcdEventMessage lcdEventMessage = this.lcdEvent_;
            return lcdEventMessage == null ? EventBase.LcdEventMessage.getDefaultInstance() : lcdEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.MoreEventMessage getMoreEvent() {
            EventBase.MoreEventMessage moreEventMessage = this.moreEvent_;
            return moreEventMessage == null ? EventBase.MoreEventMessage.getDefaultInstance() : moreEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.nfcEventMessage getNfc() {
            EventBase.nfcEventMessage nfceventmessage = this.nfc_;
            return nfceventmessage == null ? EventBase.nfcEventMessage.getDefaultInstance() : nfceventmessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.NotifyEventMessage getNotifyEvent() {
            EventBase.NotifyEventMessage notifyEventMessage = this.notifyEvent_;
            return notifyEventMessage == null ? EventBase.NotifyEventMessage.getDefaultInstance() : notifyEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.ShortcutEventMessage getShortcutLess10S() {
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess10S_;
            return shortcutEventMessage == null ? EventBase.ShortcutEventMessage.getDefaultInstance() : shortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.ShortcutEventMessage getShortcutLess3S() {
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess3S_;
            return shortcutEventMessage == null ? EventBase.ShortcutEventMessage.getDefaultInstance() : shortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.ShortcutEventMessage getShortcutLess5S() {
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess5S_;
            return shortcutEventMessage == null ? EventBase.ShortcutEventMessage.getDefaultInstance() : shortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.ShortcutEventMessage getShortcutLess8S() {
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess8S_;
            return shortcutEventMessage == null ? EventBase.ShortcutEventMessage.getDefaultInstance() : shortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.ShortcutEventMessage getShortcutLessOther() {
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLessOther_;
            return shortcutEventMessage == null ? EventBase.ShortcutEventMessage.getDefaultInstance() : shortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.fitDataMeasureEventMessage getSpo2() {
            EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage = this.spo2_;
            return fitdatameasureeventmessage == null ? EventBase.fitDataMeasureEventMessage.getDefaultInstance() : fitdatameasureeventmessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.SportEventMessage getSportEvent() {
            EventBase.SportEventMessage sportEventMessage = this.sportEvent_;
            return sportEventMessage == null ? EventBase.SportEventMessage.getDefaultInstance() : sportEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.fitDataMeasureEventMessage getStress() {
            EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage = this.stress_;
            return fitdatameasureeventmessage == null ? EventBase.fitDataMeasureEventMessage.getDefaultInstance() : fitdatameasureeventmessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.UpgrateEventMessage getUpgrate() {
            EventBase.UpgrateEventMessage upgrateEventMessage = this.upgrate_;
            return upgrateEventMessage == null ? EventBase.UpgrateEventMessage.getDefaultInstance() : upgrateEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.AlipayEventMessage getWeixin() {
            EventBase.AlipayEventMessage alipayEventMessage = this.weixin_;
            return alipayEventMessage == null ? EventBase.AlipayEventMessage.getDefaultInstance() : alipayEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public EventBase.XiaoaiEventMessage getXiaoaiEvent() {
            EventBase.XiaoaiEventMessage xiaoaiEventMessage = this.xiaoaiEvent_;
            return xiaoaiEventMessage == null ? EventBase.XiaoaiEventMessage.getDefaultInstance() : xiaoaiEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasAbnormalRebootCount() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasAlexa() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasAlipay() {
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasBloodOxygenColor() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasBreath() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasCycle() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasDialEvent() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasEventByDial() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasEventByMenu() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasEventByShortcut() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasEventByXiaoai() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasHr() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasLcdEvent() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasMoreEvent() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasNotifyEvent() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasShortcutLess10S() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasShortcutLess3S() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasShortcutLess5S() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasShortcutLess8S() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasShortcutLessOther() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasSpo2() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasSportEvent() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasStress() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasUpgrate() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasWeixin() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Pangu.PanguStatisticsMessageOrBuilder
        public boolean hasXiaoaiEvent() {
            return (this.bitField0_ & 256) != 0;
        }

        public static Builder newBuilder(PanguStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static PanguStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PanguStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PanguStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PanguStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PanguStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PanguStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PanguStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PanguStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PanguStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PanguStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface PanguStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        EventBase.AbnormalRebootCountMessage getAbnormalRebootCount();

        EventBase.AlexaEventMessage getAlexa();

        EventBase.AlipayEventMessage getAlipay();

        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        float getBloodOxygenColor();

        EventBase.breathEventMessage getBreath();

        EventBase.cycleEventMessage getCycle();

        EventBase.DialEventMessage getDialEvent();

        int getDialId();

        EventBase.MenuEventMessage getEventByDial();

        EventBase.MenuEventMessage getEventByMenu();

        EventBase.MenuEventMessage getEventByShortcut();

        EventBase.MenuEventMessage getEventByXiaoai();

        EventBase.fitDataMeasureEventMessage getHr();

        EventBase.LcdEventMessage getLcdEvent();

        EventBase.MoreEventMessage getMoreEvent();

        EventBase.nfcEventMessage getNfc();

        EventBase.NotifyEventMessage getNotifyEvent();

        EventBase.ShortcutEventMessage getShortcutLess10S();

        EventBase.ShortcutEventMessage getShortcutLess3S();

        EventBase.ShortcutEventMessage getShortcutLess5S();

        EventBase.ShortcutEventMessage getShortcutLess8S();

        EventBase.ShortcutEventMessage getShortcutLessOther();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        EventBase.fitDataMeasureEventMessage getSpo2();

        EventBase.SportEventMessage getSportEvent();

        EventBase.fitDataMeasureEventMessage getStress();

        EventBase.UpgrateEventMessage getUpgrate();

        EventBase.AlipayEventMessage getWeixin();

        EventBase.XiaoaiEventMessage getXiaoaiEvent();

        boolean hasAbnormalRebootCount();

        boolean hasAlexa();

        boolean hasAlipay();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasBloodOxygenColor();

        boolean hasBreath();

        boolean hasCycle();

        boolean hasDialEvent();

        boolean hasDialId();

        boolean hasEventByDial();

        boolean hasEventByMenu();

        boolean hasEventByShortcut();

        boolean hasEventByXiaoai();

        boolean hasHr();

        boolean hasLcdEvent();

        boolean hasMoreEvent();

        boolean hasNfc();

        boolean hasNotifyEvent();

        boolean hasShortcutLess10S();

        boolean hasShortcutLess3S();

        boolean hasShortcutLess5S();

        boolean hasShortcutLess8S();

        boolean hasShortcutLessOther();

        boolean hasSilenceMode();

        boolean hasSpo2();

        boolean hasSportEvent();

        boolean hasStress();

        boolean hasUpgrate();

        boolean hasWeixin();

        boolean hasXiaoaiEvent();
    }

    private Pangu() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
