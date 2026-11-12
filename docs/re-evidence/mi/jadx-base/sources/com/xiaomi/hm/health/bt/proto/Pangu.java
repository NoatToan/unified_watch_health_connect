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
        private static volatile vkh<PanguStatisticsMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<PanguStatisticsMessage, Builder> implements PanguStatisticsMessageOrBuilder {
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

            public Builder mergeAbnormalRebootCount(EventBase.AbnormalRebootCountMessage abnormalRebootCountMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeAbnormalRebootCount(abnormalRebootCountMessage);
                return this;
            }

            public Builder mergeAlexa(EventBase.AlexaEventMessage alexaEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeAlexa(alexaEventMessage);
                return this;
            }

            public Builder mergeAlipay(EventBase.AlipayEventMessage alipayEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeAlipay(alipayEventMessage);
                return this;
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeBase(statisBaseMessage);
                return this;
            }

            public Builder mergeBreath(EventBase.breathEventMessage breatheventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeBreath(breatheventmessage);
                return this;
            }

            public Builder mergeCycle(EventBase.cycleEventMessage cycleeventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeCycle(cycleeventmessage);
                return this;
            }

            public Builder mergeDialEvent(EventBase.DialEventMessage dialEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeDialEvent(dialEventMessage);
                return this;
            }

            public Builder mergeEventByDial(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeEventByDial(menuEventMessage);
                return this;
            }

            public Builder mergeEventByMenu(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeEventByMenu(menuEventMessage);
                return this;
            }

            public Builder mergeEventByShortcut(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeEventByShortcut(menuEventMessage);
                return this;
            }

            public Builder mergeEventByXiaoai(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeEventByXiaoai(menuEventMessage);
                return this;
            }

            public Builder mergeHr(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeHr(fitdatameasureeventmessage);
                return this;
            }

            public Builder mergeLcdEvent(EventBase.LcdEventMessage lcdEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeLcdEvent(lcdEventMessage);
                return this;
            }

            public Builder mergeMoreEvent(EventBase.MoreEventMessage moreEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeMoreEvent(moreEventMessage);
                return this;
            }

            public Builder mergeNfc(EventBase.nfcEventMessage nfceventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeNfc(nfceventmessage);
                return this;
            }

            public Builder mergeNotifyEvent(EventBase.NotifyEventMessage notifyEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeNotifyEvent(notifyEventMessage);
                return this;
            }

            public Builder mergeShortcutLess10S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeShortcutLess10S(shortcutEventMessage);
                return this;
            }

            public Builder mergeShortcutLess3S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeShortcutLess3S(shortcutEventMessage);
                return this;
            }

            public Builder mergeShortcutLess5S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeShortcutLess5S(shortcutEventMessage);
                return this;
            }

            public Builder mergeShortcutLess8S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeShortcutLess8S(shortcutEventMessage);
                return this;
            }

            public Builder mergeShortcutLessOther(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeShortcutLessOther(shortcutEventMessage);
                return this;
            }

            public Builder mergeSpo2(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeSpo2(fitdatameasureeventmessage);
                return this;
            }

            public Builder mergeSportEvent(EventBase.SportEventMessage sportEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeSportEvent(sportEventMessage);
                return this;
            }

            public Builder mergeStress(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeStress(fitdatameasureeventmessage);
                return this;
            }

            public Builder mergeUpgrate(EventBase.UpgrateEventMessage upgrateEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeUpgrate(upgrateEventMessage);
                return this;
            }

            public Builder mergeWeixin(EventBase.AlipayEventMessage alipayEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeWeixin(alipayEventMessage);
                return this;
            }

            public Builder mergeXiaoaiEvent(EventBase.XiaoaiEventMessage xiaoaiEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).mergeXiaoaiEvent(xiaoaiEventMessage);
                return this;
            }

            public Builder setAbnormalRebootCount(EventBase.AbnormalRebootCountMessage abnormalRebootCountMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAbnormalRebootCount(abnormalRebootCountMessage);
                return this;
            }

            public Builder setAlexa(EventBase.AlexaEventMessage alexaEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAlexa(alexaEventMessage);
                return this;
            }

            public Builder setAlipay(EventBase.AlipayEventMessage alipayEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAlipay(alipayEventMessage);
                return this;
            }

            public Builder setBacklightLevel(int i) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBacklightLevel(i);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBase(statisBaseMessage);
                return this;
            }

            public Builder setBloodOxygenColor(float f) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBloodOxygenColor(f);
                return this;
            }

            public Builder setBreath(EventBase.breathEventMessage breatheventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBreath(breatheventmessage);
                return this;
            }

            public Builder setCycle(EventBase.cycleEventMessage cycleeventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setCycle(cycleeventmessage);
                return this;
            }

            public Builder setDialEvent(EventBase.DialEventMessage dialEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setDialEvent(dialEventMessage);
                return this;
            }

            public Builder setDialId(int i) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setDialId(i);
                return this;
            }

            public Builder setEventByDial(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByDial(menuEventMessage);
                return this;
            }

            public Builder setEventByMenu(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByMenu(menuEventMessage);
                return this;
            }

            public Builder setEventByShortcut(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByShortcut(menuEventMessage);
                return this;
            }

            public Builder setEventByXiaoai(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByXiaoai(menuEventMessage);
                return this;
            }

            public Builder setHr(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setHr(fitdatameasureeventmessage);
                return this;
            }

            public Builder setLcdEvent(EventBase.LcdEventMessage lcdEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setLcdEvent(lcdEventMessage);
                return this;
            }

            public Builder setMoreEvent(EventBase.MoreEventMessage moreEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setMoreEvent(moreEventMessage);
                return this;
            }

            public Builder setNfc(EventBase.nfcEventMessage nfceventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setNfc(nfceventmessage);
                return this;
            }

            public Builder setNotifyEvent(EventBase.NotifyEventMessage notifyEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setNotifyEvent(notifyEventMessage);
                return this;
            }

            public Builder setShortcutLess10S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess10S(shortcutEventMessage);
                return this;
            }

            public Builder setShortcutLess3S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess3S(shortcutEventMessage);
                return this;
            }

            public Builder setShortcutLess5S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess5S(shortcutEventMessage);
                return this;
            }

            public Builder setShortcutLess8S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess8S(shortcutEventMessage);
                return this;
            }

            public Builder setShortcutLessOther(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLessOther(shortcutEventMessage);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setSilenceMode(silenceMode);
                return this;
            }

            public Builder setSpo2(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setSpo2(fitdatameasureeventmessage);
                return this;
            }

            public Builder setSportEvent(EventBase.SportEventMessage sportEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setSportEvent(sportEventMessage);
                return this;
            }

            public Builder setStress(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setStress(fitdatameasureeventmessage);
                return this;
            }

            public Builder setUpgrate(EventBase.UpgrateEventMessage upgrateEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setUpgrate(upgrateEventMessage);
                return this;
            }

            public Builder setWeixin(EventBase.AlipayEventMessage alipayEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setWeixin(alipayEventMessage);
                return this;
            }

            public Builder setXiaoaiEvent(EventBase.XiaoaiEventMessage xiaoaiEventMessage) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setXiaoaiEvent(xiaoaiEventMessage);
                return this;
            }

            private Builder() {
                super(PanguStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setAbnormalRebootCount(EventBase.AbnormalRebootCountMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAbnormalRebootCount(builder.build());
                return this;
            }

            public Builder setAlexa(EventBase.AlexaEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAlexa(builder.build());
                return this;
            }

            public Builder setAlipay(EventBase.AlipayEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setAlipay(builder.build());
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBase(builder.build());
                return this;
            }

            public Builder setBreath(EventBase.breathEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setBreath(builder.build());
                return this;
            }

            public Builder setCycle(EventBase.cycleEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setCycle(builder.build());
                return this;
            }

            public Builder setDialEvent(EventBase.DialEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setDialEvent(builder.build());
                return this;
            }

            public Builder setEventByDial(EventBase.MenuEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByDial(builder.build());
                return this;
            }

            public Builder setEventByMenu(EventBase.MenuEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByMenu(builder.build());
                return this;
            }

            public Builder setEventByShortcut(EventBase.MenuEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByShortcut(builder.build());
                return this;
            }

            public Builder setEventByXiaoai(EventBase.MenuEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setEventByXiaoai(builder.build());
                return this;
            }

            public Builder setHr(EventBase.fitDataMeasureEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setHr(builder.build());
                return this;
            }

            public Builder setLcdEvent(EventBase.LcdEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setLcdEvent(builder.build());
                return this;
            }

            public Builder setMoreEvent(EventBase.MoreEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setMoreEvent(builder.build());
                return this;
            }

            public Builder setNfc(EventBase.nfcEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setNfc(builder.build());
                return this;
            }

            public Builder setNotifyEvent(EventBase.NotifyEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setNotifyEvent(builder.build());
                return this;
            }

            public Builder setShortcutLess10S(EventBase.ShortcutEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess10S(builder.build());
                return this;
            }

            public Builder setShortcutLess3S(EventBase.ShortcutEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess3S(builder.build());
                return this;
            }

            public Builder setShortcutLess5S(EventBase.ShortcutEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess5S(builder.build());
                return this;
            }

            public Builder setShortcutLess8S(EventBase.ShortcutEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLess8S(builder.build());
                return this;
            }

            public Builder setShortcutLessOther(EventBase.ShortcutEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setShortcutLessOther(builder.build());
                return this;
            }

            public Builder setSpo2(EventBase.fitDataMeasureEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setSpo2(builder.build());
                return this;
            }

            public Builder setSportEvent(EventBase.SportEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setSportEvent(builder.build());
                return this;
            }

            public Builder setStress(EventBase.fitDataMeasureEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setStress(builder.build());
                return this;
            }

            public Builder setUpgrate(EventBase.UpgrateEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setUpgrate(builder.build());
                return this;
            }

            public Builder setWeixin(EventBase.AlipayEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setWeixin(builder.build());
                return this;
            }

            public Builder setXiaoaiEvent(EventBase.XiaoaiEventMessage.Builder builder) {
                copyOnWrite();
                ((PanguStatisticsMessage) this.instance).setXiaoaiEvent(builder.build());
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
        public void mergeAbnormalRebootCount(EventBase.AbnormalRebootCountMessage abnormalRebootCountMessage) {
            abnormalRebootCountMessage.getClass();
            EventBase.AbnormalRebootCountMessage abnormalRebootCountMessage2 = this.abnormalRebootCount_;
            if (abnormalRebootCountMessage2 == null || abnormalRebootCountMessage2 == EventBase.AbnormalRebootCountMessage.getDefaultInstance()) {
                this.abnormalRebootCount_ = abnormalRebootCountMessage;
            } else {
                this.abnormalRebootCount_ = EventBase.AbnormalRebootCountMessage.newBuilder(this.abnormalRebootCount_).mergeFrom(abnormalRebootCountMessage).buildPartial();
            }
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAlexa(EventBase.AlexaEventMessage alexaEventMessage) {
            alexaEventMessage.getClass();
            EventBase.AlexaEventMessage alexaEventMessage2 = this.alexa_;
            if (alexaEventMessage2 == null || alexaEventMessage2 == EventBase.AlexaEventMessage.getDefaultInstance()) {
                this.alexa_ = alexaEventMessage;
            } else {
                this.alexa_ = EventBase.AlexaEventMessage.newBuilder(this.alexa_).mergeFrom(alexaEventMessage).buildPartial();
            }
            this.bitField0_ |= 1073741824;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAlipay(EventBase.AlipayEventMessage alipayEventMessage) {
            alipayEventMessage.getClass();
            EventBase.AlipayEventMessage alipayEventMessage2 = this.alipay_;
            if (alipayEventMessage2 == null || alipayEventMessage2 == EventBase.AlipayEventMessage.getDefaultInstance()) {
                this.alipay_ = alipayEventMessage;
            } else {
                this.alipay_ = EventBase.AlipayEventMessage.newBuilder(this.alipay_).mergeFrom(alipayEventMessage).buildPartial();
            }
            this.bitField0_ |= 134217728;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
            statisBaseMessage.getClass();
            StatisBase.StatisBaseMessage statisBaseMessage2 = this.base_;
            if (statisBaseMessage2 == null || statisBaseMessage2 == StatisBase.StatisBaseMessage.getDefaultInstance()) {
                this.base_ = statisBaseMessage;
            } else {
                this.base_ = StatisBase.StatisBaseMessage.newBuilder(this.base_).mergeFrom(statisBaseMessage).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBreath(EventBase.breathEventMessage breatheventmessage) {
            breatheventmessage.getClass();
            EventBase.breathEventMessage breatheventmessage2 = this.breath_;
            if (breatheventmessage2 == null || breatheventmessage2 == EventBase.breathEventMessage.getDefaultInstance()) {
                this.breath_ = breatheventmessage;
            } else {
                this.breath_ = EventBase.breathEventMessage.newBuilder(this.breath_).mergeFrom(breatheventmessage).buildPartial();
            }
            this.bitField0_ |= 16777216;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCycle(EventBase.cycleEventMessage cycleeventmessage) {
            cycleeventmessage.getClass();
            EventBase.cycleEventMessage cycleeventmessage2 = this.cycle_;
            if (cycleeventmessage2 == null || cycleeventmessage2 == EventBase.cycleEventMessage.getDefaultInstance()) {
                this.cycle_ = cycleeventmessage;
            } else {
                this.cycle_ = EventBase.cycleEventMessage.newBuilder(this.cycle_).mergeFrom(cycleeventmessage).buildPartial();
            }
            this.bitField0_ |= 33554432;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialEvent(EventBase.DialEventMessage dialEventMessage) {
            dialEventMessage.getClass();
            EventBase.DialEventMessage dialEventMessage2 = this.dialEvent_;
            if (dialEventMessage2 == null || dialEventMessage2 == EventBase.DialEventMessage.getDefaultInstance()) {
                this.dialEvent_ = dialEventMessage;
            } else {
                this.dialEvent_ = EventBase.DialEventMessage.newBuilder(this.dialEvent_).mergeFrom(dialEventMessage).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventByDial(EventBase.MenuEventMessage menuEventMessage) {
            menuEventMessage.getClass();
            EventBase.MenuEventMessage menuEventMessage2 = this.eventByDial_;
            if (menuEventMessage2 == null || menuEventMessage2 == EventBase.MenuEventMessage.getDefaultInstance()) {
                this.eventByDial_ = menuEventMessage;
            } else {
                this.eventByDial_ = EventBase.MenuEventMessage.newBuilder(this.eventByDial_).mergeFrom(menuEventMessage).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventByMenu(EventBase.MenuEventMessage menuEventMessage) {
            menuEventMessage.getClass();
            EventBase.MenuEventMessage menuEventMessage2 = this.eventByMenu_;
            if (menuEventMessage2 == null || menuEventMessage2 == EventBase.MenuEventMessage.getDefaultInstance()) {
                this.eventByMenu_ = menuEventMessage;
            } else {
                this.eventByMenu_ = EventBase.MenuEventMessage.newBuilder(this.eventByMenu_).mergeFrom(menuEventMessage).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventByShortcut(EventBase.MenuEventMessage menuEventMessage) {
            menuEventMessage.getClass();
            EventBase.MenuEventMessage menuEventMessage2 = this.eventByShortcut_;
            if (menuEventMessage2 == null || menuEventMessage2 == EventBase.MenuEventMessage.getDefaultInstance()) {
                this.eventByShortcut_ = menuEventMessage;
            } else {
                this.eventByShortcut_ = EventBase.MenuEventMessage.newBuilder(this.eventByShortcut_).mergeFrom(menuEventMessage).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEventByXiaoai(EventBase.MenuEventMessage menuEventMessage) {
            menuEventMessage.getClass();
            EventBase.MenuEventMessage menuEventMessage2 = this.eventByXiaoai_;
            if (menuEventMessage2 == null || menuEventMessage2 == EventBase.MenuEventMessage.getDefaultInstance()) {
                this.eventByXiaoai_ = menuEventMessage;
            } else {
                this.eventByXiaoai_ = EventBase.MenuEventMessage.newBuilder(this.eventByXiaoai_).mergeFrom(menuEventMessage).buildPartial();
            }
            this.bitField0_ |= EventRecurrence.TH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHr(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
            fitdatameasureeventmessage.getClass();
            EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage2 = this.hr_;
            if (fitdatameasureeventmessage2 == null || fitdatameasureeventmessage2 == EventBase.fitDataMeasureEventMessage.getDefaultInstance()) {
                this.hr_ = fitdatameasureeventmessage;
            } else {
                this.hr_ = EventBase.fitDataMeasureEventMessage.newBuilder(this.hr_).mergeFrom(fitdatameasureeventmessage).buildPartial();
            }
            this.bitField0_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLcdEvent(EventBase.LcdEventMessage lcdEventMessage) {
            lcdEventMessage.getClass();
            EventBase.LcdEventMessage lcdEventMessage2 = this.lcdEvent_;
            if (lcdEventMessage2 == null || lcdEventMessage2 == EventBase.LcdEventMessage.getDefaultInstance()) {
                this.lcdEvent_ = lcdEventMessage;
            } else {
                this.lcdEvent_ = EventBase.LcdEventMessage.newBuilder(this.lcdEvent_).mergeFrom(lcdEventMessage).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMoreEvent(EventBase.MoreEventMessage moreEventMessage) {
            moreEventMessage.getClass();
            EventBase.MoreEventMessage moreEventMessage2 = this.moreEvent_;
            if (moreEventMessage2 == null || moreEventMessage2 == EventBase.MoreEventMessage.getDefaultInstance()) {
                this.moreEvent_ = moreEventMessage;
            } else {
                this.moreEvent_ = EventBase.MoreEventMessage.newBuilder(this.moreEvent_).mergeFrom(moreEventMessage).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNfc(EventBase.nfcEventMessage nfceventmessage) {
            nfceventmessage.getClass();
            EventBase.nfcEventMessage nfceventmessage2 = this.nfc_;
            if (nfceventmessage2 == null || nfceventmessage2 == EventBase.nfcEventMessage.getDefaultInstance()) {
                this.nfc_ = nfceventmessage;
            } else {
                this.nfc_ = EventBase.nfcEventMessage.newBuilder(this.nfc_).mergeFrom(nfceventmessage).buildPartial();
            }
            this.bitField0_ |= 67108864;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotifyEvent(EventBase.NotifyEventMessage notifyEventMessage) {
            notifyEventMessage.getClass();
            EventBase.NotifyEventMessage notifyEventMessage2 = this.notifyEvent_;
            if (notifyEventMessage2 == null || notifyEventMessage2 == EventBase.NotifyEventMessage.getDefaultInstance()) {
                this.notifyEvent_ = notifyEventMessage;
            } else {
                this.notifyEvent_ = EventBase.NotifyEventMessage.newBuilder(this.notifyEvent_).mergeFrom(notifyEventMessage).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess10S(EventBase.ShortcutEventMessage shortcutEventMessage) {
            shortcutEventMessage.getClass();
            EventBase.ShortcutEventMessage shortcutEventMessage2 = this.shortcutLess10S_;
            if (shortcutEventMessage2 == null || shortcutEventMessage2 == EventBase.ShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess10S_ = shortcutEventMessage;
            } else {
                this.shortcutLess10S_ = EventBase.ShortcutEventMessage.newBuilder(this.shortcutLess10S_).mergeFrom(shortcutEventMessage).buildPartial();
            }
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess3S(EventBase.ShortcutEventMessage shortcutEventMessage) {
            shortcutEventMessage.getClass();
            EventBase.ShortcutEventMessage shortcutEventMessage2 = this.shortcutLess3S_;
            if (shortcutEventMessage2 == null || shortcutEventMessage2 == EventBase.ShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess3S_ = shortcutEventMessage;
            } else {
                this.shortcutLess3S_ = EventBase.ShortcutEventMessage.newBuilder(this.shortcutLess3S_).mergeFrom(shortcutEventMessage).buildPartial();
            }
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess5S(EventBase.ShortcutEventMessage shortcutEventMessage) {
            shortcutEventMessage.getClass();
            EventBase.ShortcutEventMessage shortcutEventMessage2 = this.shortcutLess5S_;
            if (shortcutEventMessage2 == null || shortcutEventMessage2 == EventBase.ShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess5S_ = shortcutEventMessage;
            } else {
                this.shortcutLess5S_ = EventBase.ShortcutEventMessage.newBuilder(this.shortcutLess5S_).mergeFrom(shortcutEventMessage).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLess8S(EventBase.ShortcutEventMessage shortcutEventMessage) {
            shortcutEventMessage.getClass();
            EventBase.ShortcutEventMessage shortcutEventMessage2 = this.shortcutLess8S_;
            if (shortcutEventMessage2 == null || shortcutEventMessage2 == EventBase.ShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLess8S_ = shortcutEventMessage;
            } else {
                this.shortcutLess8S_ = EventBase.ShortcutEventMessage.newBuilder(this.shortcutLess8S_).mergeFrom(shortcutEventMessage).buildPartial();
            }
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeShortcutLessOther(EventBase.ShortcutEventMessage shortcutEventMessage) {
            shortcutEventMessage.getClass();
            EventBase.ShortcutEventMessage shortcutEventMessage2 = this.shortcutLessOther_;
            if (shortcutEventMessage2 == null || shortcutEventMessage2 == EventBase.ShortcutEventMessage.getDefaultInstance()) {
                this.shortcutLessOther_ = shortcutEventMessage;
            } else {
                this.shortcutLessOther_ = EventBase.ShortcutEventMessage.newBuilder(this.shortcutLessOther_).mergeFrom(shortcutEventMessage).buildPartial();
            }
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSpo2(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
            fitdatameasureeventmessage.getClass();
            EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage2 = this.spo2_;
            if (fitdatameasureeventmessage2 == null || fitdatameasureeventmessage2 == EventBase.fitDataMeasureEventMessage.getDefaultInstance()) {
                this.spo2_ = fitdatameasureeventmessage;
            } else {
                this.spo2_ = EventBase.fitDataMeasureEventMessage.newBuilder(this.spo2_).mergeFrom(fitdatameasureeventmessage).buildPartial();
            }
            this.bitField0_ |= 2097152;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSportEvent(EventBase.SportEventMessage sportEventMessage) {
            sportEventMessage.getClass();
            EventBase.SportEventMessage sportEventMessage2 = this.sportEvent_;
            if (sportEventMessage2 == null || sportEventMessage2 == EventBase.SportEventMessage.getDefaultInstance()) {
                this.sportEvent_ = sportEventMessage;
            } else {
                this.sportEvent_ = EventBase.SportEventMessage.newBuilder(this.sportEvent_).mergeFrom(sportEventMessage).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStress(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
            fitdatameasureeventmessage.getClass();
            EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage2 = this.stress_;
            if (fitdatameasureeventmessage2 == null || fitdatameasureeventmessage2 == EventBase.fitDataMeasureEventMessage.getDefaultInstance()) {
                this.stress_ = fitdatameasureeventmessage;
            } else {
                this.stress_ = EventBase.fitDataMeasureEventMessage.newBuilder(this.stress_).mergeFrom(fitdatameasureeventmessage).buildPartial();
            }
            this.bitField0_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUpgrate(EventBase.UpgrateEventMessage upgrateEventMessage) {
            upgrateEventMessage.getClass();
            EventBase.UpgrateEventMessage upgrateEventMessage2 = this.upgrate_;
            if (upgrateEventMessage2 == null || upgrateEventMessage2 == EventBase.UpgrateEventMessage.getDefaultInstance()) {
                this.upgrate_ = upgrateEventMessage;
            } else {
                this.upgrate_ = EventBase.UpgrateEventMessage.newBuilder(this.upgrate_).mergeFrom(upgrateEventMessage).buildPartial();
            }
            this.bitField0_ |= 536870912;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWeixin(EventBase.AlipayEventMessage alipayEventMessage) {
            alipayEventMessage.getClass();
            EventBase.AlipayEventMessage alipayEventMessage2 = this.weixin_;
            if (alipayEventMessage2 == null || alipayEventMessage2 == EventBase.AlipayEventMessage.getDefaultInstance()) {
                this.weixin_ = alipayEventMessage;
            } else {
                this.weixin_ = EventBase.AlipayEventMessage.newBuilder(this.weixin_).mergeFrom(alipayEventMessage).buildPartial();
            }
            this.bitField0_ |= 268435456;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeXiaoaiEvent(EventBase.XiaoaiEventMessage xiaoaiEventMessage) {
            xiaoaiEventMessage.getClass();
            EventBase.XiaoaiEventMessage xiaoaiEventMessage2 = this.xiaoaiEvent_;
            if (xiaoaiEventMessage2 == null || xiaoaiEventMessage2 == EventBase.XiaoaiEventMessage.getDefaultInstance()) {
                this.xiaoaiEvent_ = xiaoaiEventMessage;
            } else {
                this.xiaoaiEvent_ = EventBase.XiaoaiEventMessage.newBuilder(this.xiaoaiEvent_).mergeFrom(xiaoaiEventMessage).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PanguStatisticsMessage parseDelimitedFrom(InputStream inputStream) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PanguStatisticsMessage parseFrom(ByteBuffer byteBuffer) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<PanguStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbnormalRebootCount(EventBase.AbnormalRebootCountMessage abnormalRebootCountMessage) {
            abnormalRebootCountMessage.getClass();
            this.abnormalRebootCount_ = abnormalRebootCountMessage;
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlexa(EventBase.AlexaEventMessage alexaEventMessage) {
            alexaEventMessage.getClass();
            this.alexa_ = alexaEventMessage;
            this.bitField0_ |= 1073741824;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipay(EventBase.AlipayEventMessage alipayEventMessage) {
            alipayEventMessage.getClass();
            this.alipay_ = alipayEventMessage;
            this.bitField0_ |= 134217728;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBacklightLevel(int i) {
            this.bitField0_ |= 4;
            this.backlightLevel_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
            statisBaseMessage.getClass();
            this.base_ = statisBaseMessage;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBloodOxygenColor(float f) {
            this.bitField0_ |= 524288;
            this.bloodOxygenColor_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBreath(EventBase.breathEventMessage breatheventmessage) {
            breatheventmessage.getClass();
            this.breath_ = breatheventmessage;
            this.bitField0_ |= 16777216;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCycle(EventBase.cycleEventMessage cycleeventmessage) {
            cycleeventmessage.getClass();
            this.cycle_ = cycleeventmessage;
            this.bitField0_ |= 33554432;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialEvent(EventBase.DialEventMessage dialEventMessage) {
            dialEventMessage.getClass();
            this.dialEvent_ = dialEventMessage;
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialId(int i) {
            this.bitField0_ |= 8;
            this.dialId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventByDial(EventBase.MenuEventMessage menuEventMessage) {
            menuEventMessage.getClass();
            this.eventByDial_ = menuEventMessage;
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventByMenu(EventBase.MenuEventMessage menuEventMessage) {
            menuEventMessage.getClass();
            this.eventByMenu_ = menuEventMessage;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventByShortcut(EventBase.MenuEventMessage menuEventMessage) {
            menuEventMessage.getClass();
            this.eventByShortcut_ = menuEventMessage;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventByXiaoai(EventBase.MenuEventMessage menuEventMessage) {
            menuEventMessage.getClass();
            this.eventByXiaoai_ = menuEventMessage;
            this.bitField0_ |= EventRecurrence.TH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHr(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
            fitdatameasureeventmessage.getClass();
            this.hr_ = fitdatameasureeventmessage;
            this.bitField0_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdEvent(EventBase.LcdEventMessage lcdEventMessage) {
            lcdEventMessage.getClass();
            this.lcdEvent_ = lcdEventMessage;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMoreEvent(EventBase.MoreEventMessage moreEventMessage) {
            moreEventMessage.getClass();
            this.moreEvent_ = moreEventMessage;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfc(EventBase.nfcEventMessage nfceventmessage) {
            nfceventmessage.getClass();
            this.nfc_ = nfceventmessage;
            this.bitField0_ |= 67108864;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyEvent(EventBase.NotifyEventMessage notifyEventMessage) {
            notifyEventMessage.getClass();
            this.notifyEvent_ = notifyEventMessage;
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess10S(EventBase.ShortcutEventMessage shortcutEventMessage) {
            shortcutEventMessage.getClass();
            this.shortcutLess10S_ = shortcutEventMessage;
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess3S(EventBase.ShortcutEventMessage shortcutEventMessage) {
            shortcutEventMessage.getClass();
            this.shortcutLess3S_ = shortcutEventMessage;
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess5S(EventBase.ShortcutEventMessage shortcutEventMessage) {
            shortcutEventMessage.getClass();
            this.shortcutLess5S_ = shortcutEventMessage;
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLess8S(EventBase.ShortcutEventMessage shortcutEventMessage) {
            shortcutEventMessage.getClass();
            this.shortcutLess8S_ = shortcutEventMessage;
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShortcutLessOther(EventBase.ShortcutEventMessage shortcutEventMessage) {
            shortcutEventMessage.getClass();
            this.shortcutLessOther_ = shortcutEventMessage;
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
            this.silenceMode_ = silenceMode.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpo2(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
            fitdatameasureeventmessage.getClass();
            this.spo2_ = fitdatameasureeventmessage;
            this.bitField0_ |= 2097152;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportEvent(EventBase.SportEventMessage sportEventMessage) {
            sportEventMessage.getClass();
            this.sportEvent_ = sportEventMessage;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStress(EventBase.fitDataMeasureEventMessage fitdatameasureeventmessage) {
            fitdatameasureeventmessage.getClass();
            this.stress_ = fitdatameasureeventmessage;
            this.bitField0_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpgrate(EventBase.UpgrateEventMessage upgrateEventMessage) {
            upgrateEventMessage.getClass();
            this.upgrate_ = upgrateEventMessage;
            this.bitField0_ |= 536870912;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeixin(EventBase.AlipayEventMessage alipayEventMessage) {
            alipayEventMessage.getClass();
            this.weixin_ = alipayEventMessage;
            this.bitField0_ |= 268435456;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXiaoaiEvent(EventBase.XiaoaiEventMessage xiaoaiEventMessage) {
            xiaoaiEventMessage.getClass();
            this.xiaoaiEvent_ = xiaoaiEventMessage;
            this.bitField0_ |= 256;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new PanguStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0000\u001f\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔉ\u0004\u0006ᔉ\u0005\u0007ᔉ\u0006\bᔉ\u0007\tᔉ\b\nᔉ\t\u000bᔉ\n\fᔉ\u000b\rᔉ\f\u000eᔉ\r\u000fᔉ\u000e\u0010ᔉ\u000f\u0011ᔉ\u0010\u0012ᔉ\u0011\u0013ᔉ\u0012\u0014ᔁ\u0013\u0015ᔉ\u0014\u0016ᔉ\u0015\u0017ᔉ\u0016\u0018ᔉ\u0017\u0019ᔉ\u0018\u001aᔉ\u0019\u001bᔉ\u001a\u001cᔉ\u001b\u001dᔉ\u001c\u001eᔉ\u001d\u001fᔉ\u001e", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "dialId_", "lcdEvent_", "eventByShortcut_", "eventByMenu_", "eventByDial_", "xiaoaiEvent_", "moreEvent_", "sportEvent_", "notifyEvent_", "dialEvent_", "shortcutLess3S_", "shortcutLess5S_", "shortcutLess8S_", "shortcutLess10S_", "shortcutLessOther_", "abnormalRebootCount_", "bloodOxygenColor_", "eventByXiaoai_", "spo2_", "hr_", "stress_", "breath_", "cycle_", "nfc_", "alipay_", "weixin_", "upgrate_", "alexa_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<PanguStatisticsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (PanguStatisticsMessage.class) {
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
            return (this.bitField0_ & 134217728) != 0;
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
            return (this.bitField0_ & EventRecurrence.TH) != 0;
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
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
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

        public static Builder newBuilder(PanguStatisticsMessage panguStatisticsMessage) {
            return DEFAULT_INSTANCE.createBuilder(panguStatisticsMessage);
        }

        public static PanguStatisticsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PanguStatisticsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static PanguStatisticsMessage parseFrom(ByteString byteString) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PanguStatisticsMessage parseFrom(ByteString byteString, t tVar) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static PanguStatisticsMessage parseFrom(byte[] bArr) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PanguStatisticsMessage parseFrom(byte[] bArr, t tVar) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static PanguStatisticsMessage parseFrom(InputStream inputStream) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PanguStatisticsMessage parseFrom(InputStream inputStream, t tVar) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static PanguStatisticsMessage parseFrom(j jVar) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PanguStatisticsMessage parseFrom(j jVar, t tVar) {
            return (PanguStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface PanguStatisticsMessageOrBuilder extends bsf {
        EventBase.AbnormalRebootCountMessage getAbnormalRebootCount();

        EventBase.AlexaEventMessage getAlexa();

        EventBase.AlipayEventMessage getAlipay();

        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        float getBloodOxygenColor();

        EventBase.breathEventMessage getBreath();

        EventBase.cycleEventMessage getCycle();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Pangu() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
