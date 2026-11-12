package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.j;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import defpackage.bsf;
import defpackage.vkh;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class Kongming {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Kongming$1, reason: invalid class name */
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

    public static final class KongmingStatisticsMessage extends GeneratedMessageLite<KongmingStatisticsMessage, Builder> implements KongmingStatisticsMessageOrBuilder {
        public static final int ABNORMALREBOOTCOUNT_FIELD_NUMBER = 20;
        public static final int ALIPAYEVENT_FIELD_NUMBER = 19;
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final KongmingStatisticsMessage DEFAULT_INSTANCE;
        public static final int DIALEVENT_FIELD_NUMBER = 13;
        public static final int DIALID_FIELD_NUMBER = 4;
        public static final int EVENTBYDIAL_FIELD_NUMBER = 8;
        public static final int EVENTBYMENU_FIELD_NUMBER = 7;
        public static final int EVENTBYSHORTCUT_FIELD_NUMBER = 6;
        public static final int LCDEVENT_FIELD_NUMBER = 5;
        public static final int MOREEVENT_FIELD_NUMBER = 10;
        public static final int NOTIFYEVENT_FIELD_NUMBER = 12;
        private static volatile vkh<KongmingStatisticsMessage> PARSER = null;
        public static final int SHORTCUTLESS10S_FIELD_NUMBER = 17;
        public static final int SHORTCUTLESS3S_FIELD_NUMBER = 14;
        public static final int SHORTCUTLESS5S_FIELD_NUMBER = 15;
        public static final int SHORTCUTLESS8S_FIELD_NUMBER = 16;
        public static final int SHORTCUTLESSOTHER_FIELD_NUMBER = 18;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        public static final int SPORTEVENT_FIELD_NUMBER = 11;
        public static final int XIAOAIEVENT_FIELD_NUMBER = 9;
        private EventBase.AbnormalRebootCountMessage abnormalRebootCount_;
        private EventBase.AlipayEventMessage alipayEvent_;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private EventBase.DialEventMessage dialEvent_;
        private int dialId_;
        private EventBase.MenuEventMessage eventByDial_;
        private EventBase.MenuEventMessage eventByMenu_;
        private EventBase.MenuEventMessage eventByShortcut_;
        private EventBase.LcdEventMessage lcdEvent_;
        private byte memoizedIsInitialized = 2;
        private EventBase.MoreEventMessage moreEvent_;
        private EventBase.NotifyEventMessage notifyEvent_;
        private EventBase.ShortcutEventMessage shortcutLess10S_;
        private EventBase.ShortcutEventMessage shortcutLess3S_;
        private EventBase.ShortcutEventMessage shortcutLess5S_;
        private EventBase.ShortcutEventMessage shortcutLess8S_;
        private EventBase.ShortcutEventMessage shortcutLessOther_;
        private int silenceMode_;
        private EventBase.SportEventMessage sportEvent_;
        private EventBase.XiaoaiEventMessage xiaoaiEvent_;

        public static final class Builder extends GeneratedMessageLite.a<KongmingStatisticsMessage, Builder> implements KongmingStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAbnormalRebootCount() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearAbnormalRebootCount();
                return this;
            }

            public Builder clearAlipayEvent() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearAlipayEvent();
                return this;
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearDialEvent() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearDialEvent();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearEventByDial() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearEventByDial();
                return this;
            }

            public Builder clearEventByMenu() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearEventByMenu();
                return this;
            }

            public Builder clearEventByShortcut() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearEventByShortcut();
                return this;
            }

            public Builder clearLcdEvent() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearLcdEvent();
                return this;
            }

            public Builder clearMoreEvent() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearMoreEvent();
                return this;
            }

            public Builder clearNotifyEvent() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearNotifyEvent();
                return this;
            }

            public Builder clearShortcutLess10S() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearShortcutLess10S();
                return this;
            }

            public Builder clearShortcutLess3S() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearShortcutLess3S();
                return this;
            }

            public Builder clearShortcutLess5S() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearShortcutLess5S();
                return this;
            }

            public Builder clearShortcutLess8S() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearShortcutLess8S();
                return this;
            }

            public Builder clearShortcutLessOther() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearShortcutLessOther();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            public Builder clearSportEvent() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearSportEvent();
                return this;
            }

            public Builder clearXiaoaiEvent() {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).clearXiaoaiEvent();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.AbnormalRebootCountMessage getAbnormalRebootCount() {
                return ((KongmingStatisticsMessage) this.instance).getAbnormalRebootCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.AlipayEventMessage getAlipayEvent() {
                return ((KongmingStatisticsMessage) this.instance).getAlipayEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((KongmingStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((KongmingStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.DialEventMessage getDialEvent() {
                return ((KongmingStatisticsMessage) this.instance).getDialEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public int getDialId() {
                return ((KongmingStatisticsMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.MenuEventMessage getEventByDial() {
                return ((KongmingStatisticsMessage) this.instance).getEventByDial();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.MenuEventMessage getEventByMenu() {
                return ((KongmingStatisticsMessage) this.instance).getEventByMenu();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.MenuEventMessage getEventByShortcut() {
                return ((KongmingStatisticsMessage) this.instance).getEventByShortcut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.LcdEventMessage getLcdEvent() {
                return ((KongmingStatisticsMessage) this.instance).getLcdEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.MoreEventMessage getMoreEvent() {
                return ((KongmingStatisticsMessage) this.instance).getMoreEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.NotifyEventMessage getNotifyEvent() {
                return ((KongmingStatisticsMessage) this.instance).getNotifyEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.ShortcutEventMessage getShortcutLess10S() {
                return ((KongmingStatisticsMessage) this.instance).getShortcutLess10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.ShortcutEventMessage getShortcutLess3S() {
                return ((KongmingStatisticsMessage) this.instance).getShortcutLess3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.ShortcutEventMessage getShortcutLess5S() {
                return ((KongmingStatisticsMessage) this.instance).getShortcutLess5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.ShortcutEventMessage getShortcutLess8S() {
                return ((KongmingStatisticsMessage) this.instance).getShortcutLess8S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.ShortcutEventMessage getShortcutLessOther() {
                return ((KongmingStatisticsMessage) this.instance).getShortcutLessOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((KongmingStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.SportEventMessage getSportEvent() {
                return ((KongmingStatisticsMessage) this.instance).getSportEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public EventBase.XiaoaiEventMessage getXiaoaiEvent() {
                return ((KongmingStatisticsMessage) this.instance).getXiaoaiEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasAbnormalRebootCount() {
                return ((KongmingStatisticsMessage) this.instance).hasAbnormalRebootCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasAlipayEvent() {
                return ((KongmingStatisticsMessage) this.instance).hasAlipayEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((KongmingStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((KongmingStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasDialEvent() {
                return ((KongmingStatisticsMessage) this.instance).hasDialEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasDialId() {
                return ((KongmingStatisticsMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasEventByDial() {
                return ((KongmingStatisticsMessage) this.instance).hasEventByDial();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasEventByMenu() {
                return ((KongmingStatisticsMessage) this.instance).hasEventByMenu();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasEventByShortcut() {
                return ((KongmingStatisticsMessage) this.instance).hasEventByShortcut();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasLcdEvent() {
                return ((KongmingStatisticsMessage) this.instance).hasLcdEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasMoreEvent() {
                return ((KongmingStatisticsMessage) this.instance).hasMoreEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasNotifyEvent() {
                return ((KongmingStatisticsMessage) this.instance).hasNotifyEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasShortcutLess10S() {
                return ((KongmingStatisticsMessage) this.instance).hasShortcutLess10S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasShortcutLess3S() {
                return ((KongmingStatisticsMessage) this.instance).hasShortcutLess3S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasShortcutLess5S() {
                return ((KongmingStatisticsMessage) this.instance).hasShortcutLess5S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasShortcutLess8S() {
                return ((KongmingStatisticsMessage) this.instance).hasShortcutLess8S();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasShortcutLessOther() {
                return ((KongmingStatisticsMessage) this.instance).hasShortcutLessOther();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((KongmingStatisticsMessage) this.instance).hasSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasSportEvent() {
                return ((KongmingStatisticsMessage) this.instance).hasSportEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
            public boolean hasXiaoaiEvent() {
                return ((KongmingStatisticsMessage) this.instance).hasXiaoaiEvent();
            }

            public Builder mergeAbnormalRebootCount(EventBase.AbnormalRebootCountMessage abnormalRebootCountMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeAbnormalRebootCount(abnormalRebootCountMessage);
                return this;
            }

            public Builder mergeAlipayEvent(EventBase.AlipayEventMessage alipayEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeAlipayEvent(alipayEventMessage);
                return this;
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeBase(statisBaseMessage);
                return this;
            }

            public Builder mergeDialEvent(EventBase.DialEventMessage dialEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeDialEvent(dialEventMessage);
                return this;
            }

            public Builder mergeEventByDial(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeEventByDial(menuEventMessage);
                return this;
            }

            public Builder mergeEventByMenu(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeEventByMenu(menuEventMessage);
                return this;
            }

            public Builder mergeEventByShortcut(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeEventByShortcut(menuEventMessage);
                return this;
            }

            public Builder mergeLcdEvent(EventBase.LcdEventMessage lcdEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeLcdEvent(lcdEventMessage);
                return this;
            }

            public Builder mergeMoreEvent(EventBase.MoreEventMessage moreEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeMoreEvent(moreEventMessage);
                return this;
            }

            public Builder mergeNotifyEvent(EventBase.NotifyEventMessage notifyEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeNotifyEvent(notifyEventMessage);
                return this;
            }

            public Builder mergeShortcutLess10S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeShortcutLess10S(shortcutEventMessage);
                return this;
            }

            public Builder mergeShortcutLess3S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeShortcutLess3S(shortcutEventMessage);
                return this;
            }

            public Builder mergeShortcutLess5S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeShortcutLess5S(shortcutEventMessage);
                return this;
            }

            public Builder mergeShortcutLess8S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeShortcutLess8S(shortcutEventMessage);
                return this;
            }

            public Builder mergeShortcutLessOther(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeShortcutLessOther(shortcutEventMessage);
                return this;
            }

            public Builder mergeSportEvent(EventBase.SportEventMessage sportEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeSportEvent(sportEventMessage);
                return this;
            }

            public Builder mergeXiaoaiEvent(EventBase.XiaoaiEventMessage xiaoaiEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).mergeXiaoaiEvent(xiaoaiEventMessage);
                return this;
            }

            public Builder setAbnormalRebootCount(EventBase.AbnormalRebootCountMessage abnormalRebootCountMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setAbnormalRebootCount(abnormalRebootCountMessage);
                return this;
            }

            public Builder setAlipayEvent(EventBase.AlipayEventMessage alipayEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setAlipayEvent(alipayEventMessage);
                return this;
            }

            public Builder setBacklightLevel(int i) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setBacklightLevel(i);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setBase(statisBaseMessage);
                return this;
            }

            public Builder setDialEvent(EventBase.DialEventMessage dialEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setDialEvent(dialEventMessage);
                return this;
            }

            public Builder setDialId(int i) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setDialId(i);
                return this;
            }

            public Builder setEventByDial(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setEventByDial(menuEventMessage);
                return this;
            }

            public Builder setEventByMenu(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setEventByMenu(menuEventMessage);
                return this;
            }

            public Builder setEventByShortcut(EventBase.MenuEventMessage menuEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setEventByShortcut(menuEventMessage);
                return this;
            }

            public Builder setLcdEvent(EventBase.LcdEventMessage lcdEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setLcdEvent(lcdEventMessage);
                return this;
            }

            public Builder setMoreEvent(EventBase.MoreEventMessage moreEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setMoreEvent(moreEventMessage);
                return this;
            }

            public Builder setNotifyEvent(EventBase.NotifyEventMessage notifyEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setNotifyEvent(notifyEventMessage);
                return this;
            }

            public Builder setShortcutLess10S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setShortcutLess10S(shortcutEventMessage);
                return this;
            }

            public Builder setShortcutLess3S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setShortcutLess3S(shortcutEventMessage);
                return this;
            }

            public Builder setShortcutLess5S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setShortcutLess5S(shortcutEventMessage);
                return this;
            }

            public Builder setShortcutLess8S(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setShortcutLess8S(shortcutEventMessage);
                return this;
            }

            public Builder setShortcutLessOther(EventBase.ShortcutEventMessage shortcutEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setShortcutLessOther(shortcutEventMessage);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setSilenceMode(silenceMode);
                return this;
            }

            public Builder setSportEvent(EventBase.SportEventMessage sportEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setSportEvent(sportEventMessage);
                return this;
            }

            public Builder setXiaoaiEvent(EventBase.XiaoaiEventMessage xiaoaiEventMessage) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setXiaoaiEvent(xiaoaiEventMessage);
                return this;
            }

            private Builder() {
                super(KongmingStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setAbnormalRebootCount(EventBase.AbnormalRebootCountMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setAbnormalRebootCount(builder.build());
                return this;
            }

            public Builder setAlipayEvent(EventBase.AlipayEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setAlipayEvent(builder.build());
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setBase(builder.build());
                return this;
            }

            public Builder setDialEvent(EventBase.DialEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setDialEvent(builder.build());
                return this;
            }

            public Builder setEventByDial(EventBase.MenuEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setEventByDial(builder.build());
                return this;
            }

            public Builder setEventByMenu(EventBase.MenuEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setEventByMenu(builder.build());
                return this;
            }

            public Builder setEventByShortcut(EventBase.MenuEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setEventByShortcut(builder.build());
                return this;
            }

            public Builder setLcdEvent(EventBase.LcdEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setLcdEvent(builder.build());
                return this;
            }

            public Builder setMoreEvent(EventBase.MoreEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setMoreEvent(builder.build());
                return this;
            }

            public Builder setNotifyEvent(EventBase.NotifyEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setNotifyEvent(builder.build());
                return this;
            }

            public Builder setShortcutLess10S(EventBase.ShortcutEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setShortcutLess10S(builder.build());
                return this;
            }

            public Builder setShortcutLess3S(EventBase.ShortcutEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setShortcutLess3S(builder.build());
                return this;
            }

            public Builder setShortcutLess5S(EventBase.ShortcutEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setShortcutLess5S(builder.build());
                return this;
            }

            public Builder setShortcutLess8S(EventBase.ShortcutEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setShortcutLess8S(builder.build());
                return this;
            }

            public Builder setShortcutLessOther(EventBase.ShortcutEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setShortcutLessOther(builder.build());
                return this;
            }

            public Builder setSportEvent(EventBase.SportEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setSportEvent(builder.build());
                return this;
            }

            public Builder setXiaoaiEvent(EventBase.XiaoaiEventMessage.Builder builder) {
                copyOnWrite();
                ((KongmingStatisticsMessage) this.instance).setXiaoaiEvent(builder.build());
                return this;
            }
        }

        static {
            KongmingStatisticsMessage kongmingStatisticsMessage = new KongmingStatisticsMessage();
            DEFAULT_INSTANCE = kongmingStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(KongmingStatisticsMessage.class, kongmingStatisticsMessage);
        }

        private KongmingStatisticsMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAbnormalRebootCount() {
            this.abnormalRebootCount_ = null;
            this.bitField0_ &= -524289;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayEvent() {
            this.alipayEvent_ = null;
            this.bitField0_ &= -262145;
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

        public static KongmingStatisticsMessage getDefaultInstance() {
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
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAlipayEvent(EventBase.AlipayEventMessage alipayEventMessage) {
            alipayEventMessage.getClass();
            EventBase.AlipayEventMessage alipayEventMessage2 = this.alipayEvent_;
            if (alipayEventMessage2 == null || alipayEventMessage2 == EventBase.AlipayEventMessage.getDefaultInstance()) {
                this.alipayEvent_ = alipayEventMessage;
            } else {
                this.alipayEvent_ = EventBase.AlipayEventMessage.newBuilder(this.alipayEvent_).mergeFrom(alipayEventMessage).buildPartial();
            }
            this.bitField0_ |= 262144;
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

        public static KongmingStatisticsMessage parseDelimitedFrom(InputStream inputStream) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KongmingStatisticsMessage parseFrom(ByteBuffer byteBuffer) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<KongmingStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbnormalRebootCount(EventBase.AbnormalRebootCountMessage abnormalRebootCountMessage) {
            abnormalRebootCountMessage.getClass();
            this.abnormalRebootCount_ = abnormalRebootCountMessage;
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayEvent(EventBase.AlipayEventMessage alipayEventMessage) {
            alipayEventMessage.getClass();
            this.alipayEvent_ = alipayEventMessage;
            this.bitField0_ |= 262144;
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
        public void setSportEvent(EventBase.SportEventMessage sportEventMessage) {
            sportEventMessage.getClass();
            this.sportEvent_ = sportEventMessage;
            this.bitField0_ |= 1024;
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
                    return new KongmingStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0014\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔉ\u0004\u0006ᔉ\u0005\u0007ᔉ\u0006\bᔉ\u0007\tᔉ\b\nᔉ\t\u000bᔉ\n\fᔉ\u000b\rᔉ\f\u000eᔉ\r\u000fᔉ\u000e\u0010ᔉ\u000f\u0011ᔉ\u0010\u0012ᔉ\u0011\u0013ᔉ\u0012\u0014ᔉ\u0013", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "dialId_", "lcdEvent_", "eventByShortcut_", "eventByMenu_", "eventByDial_", "xiaoaiEvent_", "moreEvent_", "sportEvent_", "notifyEvent_", "dialEvent_", "shortcutLess3S_", "shortcutLess5S_", "shortcutLess8S_", "shortcutLess10S_", "shortcutLessOther_", "alipayEvent_", "abnormalRebootCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<KongmingStatisticsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (KongmingStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.AbnormalRebootCountMessage getAbnormalRebootCount() {
            EventBase.AbnormalRebootCountMessage abnormalRebootCountMessage = this.abnormalRebootCount_;
            return abnormalRebootCountMessage == null ? EventBase.AbnormalRebootCountMessage.getDefaultInstance() : abnormalRebootCountMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.AlipayEventMessage getAlipayEvent() {
            EventBase.AlipayEventMessage alipayEventMessage = this.alipayEvent_;
            return alipayEventMessage == null ? EventBase.AlipayEventMessage.getDefaultInstance() : alipayEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.DialEventMessage getDialEvent() {
            EventBase.DialEventMessage dialEventMessage = this.dialEvent_;
            return dialEventMessage == null ? EventBase.DialEventMessage.getDefaultInstance() : dialEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.MenuEventMessage getEventByDial() {
            EventBase.MenuEventMessage menuEventMessage = this.eventByDial_;
            return menuEventMessage == null ? EventBase.MenuEventMessage.getDefaultInstance() : menuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.MenuEventMessage getEventByMenu() {
            EventBase.MenuEventMessage menuEventMessage = this.eventByMenu_;
            return menuEventMessage == null ? EventBase.MenuEventMessage.getDefaultInstance() : menuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.MenuEventMessage getEventByShortcut() {
            EventBase.MenuEventMessage menuEventMessage = this.eventByShortcut_;
            return menuEventMessage == null ? EventBase.MenuEventMessage.getDefaultInstance() : menuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.LcdEventMessage getLcdEvent() {
            EventBase.LcdEventMessage lcdEventMessage = this.lcdEvent_;
            return lcdEventMessage == null ? EventBase.LcdEventMessage.getDefaultInstance() : lcdEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.MoreEventMessage getMoreEvent() {
            EventBase.MoreEventMessage moreEventMessage = this.moreEvent_;
            return moreEventMessage == null ? EventBase.MoreEventMessage.getDefaultInstance() : moreEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.NotifyEventMessage getNotifyEvent() {
            EventBase.NotifyEventMessage notifyEventMessage = this.notifyEvent_;
            return notifyEventMessage == null ? EventBase.NotifyEventMessage.getDefaultInstance() : notifyEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.ShortcutEventMessage getShortcutLess10S() {
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess10S_;
            return shortcutEventMessage == null ? EventBase.ShortcutEventMessage.getDefaultInstance() : shortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.ShortcutEventMessage getShortcutLess3S() {
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess3S_;
            return shortcutEventMessage == null ? EventBase.ShortcutEventMessage.getDefaultInstance() : shortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.ShortcutEventMessage getShortcutLess5S() {
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess5S_;
            return shortcutEventMessage == null ? EventBase.ShortcutEventMessage.getDefaultInstance() : shortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.ShortcutEventMessage getShortcutLess8S() {
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLess8S_;
            return shortcutEventMessage == null ? EventBase.ShortcutEventMessage.getDefaultInstance() : shortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.ShortcutEventMessage getShortcutLessOther() {
            EventBase.ShortcutEventMessage shortcutEventMessage = this.shortcutLessOther_;
            return shortcutEventMessage == null ? EventBase.ShortcutEventMessage.getDefaultInstance() : shortcutEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.SportEventMessage getSportEvent() {
            EventBase.SportEventMessage sportEventMessage = this.sportEvent_;
            return sportEventMessage == null ? EventBase.SportEventMessage.getDefaultInstance() : sportEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public EventBase.XiaoaiEventMessage getXiaoaiEvent() {
            EventBase.XiaoaiEventMessage xiaoaiEventMessage = this.xiaoaiEvent_;
            return xiaoaiEventMessage == null ? EventBase.XiaoaiEventMessage.getDefaultInstance() : xiaoaiEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasAbnormalRebootCount() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasAlipayEvent() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasDialEvent() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasEventByDial() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasEventByMenu() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasEventByShortcut() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasLcdEvent() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasMoreEvent() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasNotifyEvent() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasShortcutLess10S() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasShortcutLess3S() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasShortcutLess5S() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasShortcutLess8S() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasShortcutLessOther() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasSportEvent() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kongming.KongmingStatisticsMessageOrBuilder
        public boolean hasXiaoaiEvent() {
            return (this.bitField0_ & 256) != 0;
        }

        public static Builder newBuilder(KongmingStatisticsMessage kongmingStatisticsMessage) {
            return DEFAULT_INSTANCE.createBuilder(kongmingStatisticsMessage);
        }

        public static KongmingStatisticsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static KongmingStatisticsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static KongmingStatisticsMessage parseFrom(ByteString byteString) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static KongmingStatisticsMessage parseFrom(ByteString byteString, t tVar) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static KongmingStatisticsMessage parseFrom(byte[] bArr) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static KongmingStatisticsMessage parseFrom(byte[] bArr, t tVar) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static KongmingStatisticsMessage parseFrom(InputStream inputStream) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KongmingStatisticsMessage parseFrom(InputStream inputStream, t tVar) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static KongmingStatisticsMessage parseFrom(j jVar) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static KongmingStatisticsMessage parseFrom(j jVar, t tVar) {
            return (KongmingStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface KongmingStatisticsMessageOrBuilder extends bsf {
        EventBase.AbnormalRebootCountMessage getAbnormalRebootCount();

        EventBase.AlipayEventMessage getAlipayEvent();

        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        EventBase.DialEventMessage getDialEvent();

        int getDialId();

        EventBase.MenuEventMessage getEventByDial();

        EventBase.MenuEventMessage getEventByMenu();

        EventBase.MenuEventMessage getEventByShortcut();

        EventBase.LcdEventMessage getLcdEvent();

        EventBase.MoreEventMessage getMoreEvent();

        EventBase.NotifyEventMessage getNotifyEvent();

        EventBase.ShortcutEventMessage getShortcutLess10S();

        EventBase.ShortcutEventMessage getShortcutLess3S();

        EventBase.ShortcutEventMessage getShortcutLess5S();

        EventBase.ShortcutEventMessage getShortcutLess8S();

        EventBase.ShortcutEventMessage getShortcutLessOther();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        EventBase.SportEventMessage getSportEvent();

        EventBase.XiaoaiEventMessage getXiaoaiEvent();

        boolean hasAbnormalRebootCount();

        boolean hasAlipayEvent();

        boolean hasBacklightLevel();

        boolean hasBase();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Kongming() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
