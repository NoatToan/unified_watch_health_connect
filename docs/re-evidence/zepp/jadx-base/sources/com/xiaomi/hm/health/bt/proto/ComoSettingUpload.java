package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class ComoSettingUpload {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.ComoSettingUpload$1, reason: invalid class name */
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

    public static final class ComoNessSettingMessage extends GeneratedMessageLite<ComoNessSettingMessage, Builder> implements ComoNessSettingMessageOrBuilder {
        public static final int AUTOSCREENBRIGHTNESSSWITCH_FIELD_NUMBER = 12;
        public static final int AUTOSCREENOFFTIME_FIELD_NUMBER = 1;
        public static final int BLOODOXYGENCOLOR_FIELD_NUMBER = 14;
        public static final int DATEDISPLAYFORMAT_FIELD_NUMBER = 8;
        private static final ComoNessSettingMessage DEFAULT_INSTANCE;
        public static final int LONGPRESSKEYOPENAPP_FIELD_NUMBER = 9;
        public static final int NODISTRUBMODESTATE_FIELD_NUMBER = 10;
        public static final int NOTIFICATIONSCREENON_FIELD_NUMBER = 3;
        private static volatile Parser<ComoNessSettingMessage> PARSER = null;
        public static final int SCREENBRIGHTNESSLEVEL_FIELD_NUMBER = 11;
        public static final int SCREENLOCKSWITCH_FIELD_NUMBER = 2;
        public static final int TIMEDISPLAYFORMAT_FIELD_NUMBER = 7;
        public static final int VIBRATINGSTRENGTH_FIELD_NUMBER = 6;
        public static final int WATCHFACEEDITOR_FIELD_NUMBER = 13;
        public static final int WIDGETSORTLIST_FIELD_NUMBER = 5;
        public static final int WRISTSCREENON_FIELD_NUMBER = 4;
        private boolean autoScreenBrightnessSwitch_;
        private int autoScreenOffTime_;
        private int bitField0_;
        private float bloodOxygenColor_;
        private int dateDisplayFormat_;
        private int longPressKeyOpenApp_;
        private NoDistrubModeState noDistrubModeState_;
        private SwitchTimeSlot notificationScreenOn_;
        private int screenBrightnessLevel_;
        private boolean screenLockSwitch_;
        private int timeDisplayFormat_;
        private int vibratingStrength_;
        private WatchFaceEditor watchFaceEditor_;
        private SwitchTimeSlot wristScreenOn_;
        private byte memoizedIsInitialized = 2;
        private Internal.IntList widgetSortList_ = GeneratedMessageLite.emptyIntList();

        public static final class Builder extends GeneratedMessageLite.Builder<ComoNessSettingMessage, Builder> implements ComoNessSettingMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllWidgetSortList(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).addAllWidgetSortList(values);
                return this;
            }

            public Builder addWidgetSortList(int value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).addWidgetSortList(value);
                return this;
            }

            public Builder clearAutoScreenBrightnessSwitch() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearAutoScreenBrightnessSwitch();
                return this;
            }

            public Builder clearAutoScreenOffTime() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearAutoScreenOffTime();
                return this;
            }

            public Builder clearBloodOxygenColor() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearBloodOxygenColor();
                return this;
            }

            public Builder clearDateDisplayFormat() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearDateDisplayFormat();
                return this;
            }

            public Builder clearLongPressKeyOpenApp() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearLongPressKeyOpenApp();
                return this;
            }

            public Builder clearNoDistrubModeState() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearNoDistrubModeState();
                return this;
            }

            public Builder clearNotificationScreenOn() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearNotificationScreenOn();
                return this;
            }

            public Builder clearScreenBrightnessLevel() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearScreenBrightnessLevel();
                return this;
            }

            public Builder clearScreenLockSwitch() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearScreenLockSwitch();
                return this;
            }

            public Builder clearTimeDisplayFormat() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearTimeDisplayFormat();
                return this;
            }

            public Builder clearVibratingStrength() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearVibratingStrength();
                return this;
            }

            public Builder clearWatchFaceEditor() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearWatchFaceEditor();
                return this;
            }

            public Builder clearWidgetSortList() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearWidgetSortList();
                return this;
            }

            public Builder clearWristScreenOn() {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).clearWristScreenOn();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean getAutoScreenBrightnessSwitch() {
                return ((ComoNessSettingMessage) this.instance).getAutoScreenBrightnessSwitch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public int getAutoScreenOffTime() {
                return ((ComoNessSettingMessage) this.instance).getAutoScreenOffTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public float getBloodOxygenColor() {
                return ((ComoNessSettingMessage) this.instance).getBloodOxygenColor();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public int getDateDisplayFormat() {
                return ((ComoNessSettingMessage) this.instance).getDateDisplayFormat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public int getLongPressKeyOpenApp() {
                return ((ComoNessSettingMessage) this.instance).getLongPressKeyOpenApp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public NoDistrubModeState getNoDistrubModeState() {
                return ((ComoNessSettingMessage) this.instance).getNoDistrubModeState();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public SwitchTimeSlot getNotificationScreenOn() {
                return ((ComoNessSettingMessage) this.instance).getNotificationScreenOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public int getScreenBrightnessLevel() {
                return ((ComoNessSettingMessage) this.instance).getScreenBrightnessLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean getScreenLockSwitch() {
                return ((ComoNessSettingMessage) this.instance).getScreenLockSwitch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public int getTimeDisplayFormat() {
                return ((ComoNessSettingMessage) this.instance).getTimeDisplayFormat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public int getVibratingStrength() {
                return ((ComoNessSettingMessage) this.instance).getVibratingStrength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public WatchFaceEditor getWatchFaceEditor() {
                return ((ComoNessSettingMessage) this.instance).getWatchFaceEditor();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public int getWidgetSortList(int index) {
                return ((ComoNessSettingMessage) this.instance).getWidgetSortList(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public int getWidgetSortListCount() {
                return ((ComoNessSettingMessage) this.instance).getWidgetSortListCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public List<Integer> getWidgetSortListList() {
                return Collections.unmodifiableList(((ComoNessSettingMessage) this.instance).getWidgetSortListList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public SwitchTimeSlot getWristScreenOn() {
                return ((ComoNessSettingMessage) this.instance).getWristScreenOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasAutoScreenBrightnessSwitch() {
                return ((ComoNessSettingMessage) this.instance).hasAutoScreenBrightnessSwitch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasAutoScreenOffTime() {
                return ((ComoNessSettingMessage) this.instance).hasAutoScreenOffTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasBloodOxygenColor() {
                return ((ComoNessSettingMessage) this.instance).hasBloodOxygenColor();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasDateDisplayFormat() {
                return ((ComoNessSettingMessage) this.instance).hasDateDisplayFormat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasLongPressKeyOpenApp() {
                return ((ComoNessSettingMessage) this.instance).hasLongPressKeyOpenApp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasNoDistrubModeState() {
                return ((ComoNessSettingMessage) this.instance).hasNoDistrubModeState();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasNotificationScreenOn() {
                return ((ComoNessSettingMessage) this.instance).hasNotificationScreenOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasScreenBrightnessLevel() {
                return ((ComoNessSettingMessage) this.instance).hasScreenBrightnessLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasScreenLockSwitch() {
                return ((ComoNessSettingMessage) this.instance).hasScreenLockSwitch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasTimeDisplayFormat() {
                return ((ComoNessSettingMessage) this.instance).hasTimeDisplayFormat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasVibratingStrength() {
                return ((ComoNessSettingMessage) this.instance).hasVibratingStrength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasWatchFaceEditor() {
                return ((ComoNessSettingMessage) this.instance).hasWatchFaceEditor();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
            public boolean hasWristScreenOn() {
                return ((ComoNessSettingMessage) this.instance).hasWristScreenOn();
            }

            public Builder mergeNoDistrubModeState(NoDistrubModeState value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).mergeNoDistrubModeState(value);
                return this;
            }

            public Builder mergeNotificationScreenOn(SwitchTimeSlot value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).mergeNotificationScreenOn(value);
                return this;
            }

            public Builder mergeWatchFaceEditor(WatchFaceEditor value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).mergeWatchFaceEditor(value);
                return this;
            }

            public Builder mergeWristScreenOn(SwitchTimeSlot value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).mergeWristScreenOn(value);
                return this;
            }

            public Builder setAutoScreenBrightnessSwitch(boolean value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setAutoScreenBrightnessSwitch(value);
                return this;
            }

            public Builder setAutoScreenOffTime(int value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setAutoScreenOffTime(value);
                return this;
            }

            public Builder setBloodOxygenColor(float value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setBloodOxygenColor(value);
                return this;
            }

            public Builder setDateDisplayFormat(int value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setDateDisplayFormat(value);
                return this;
            }

            public Builder setLongPressKeyOpenApp(int value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setLongPressKeyOpenApp(value);
                return this;
            }

            public Builder setNoDistrubModeState(NoDistrubModeState value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setNoDistrubModeState(value);
                return this;
            }

            public Builder setNotificationScreenOn(SwitchTimeSlot value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setNotificationScreenOn(value);
                return this;
            }

            public Builder setScreenBrightnessLevel(int value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setScreenBrightnessLevel(value);
                return this;
            }

            public Builder setScreenLockSwitch(boolean value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setScreenLockSwitch(value);
                return this;
            }

            public Builder setTimeDisplayFormat(int value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setTimeDisplayFormat(value);
                return this;
            }

            public Builder setVibratingStrength(int value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setVibratingStrength(value);
                return this;
            }

            public Builder setWatchFaceEditor(WatchFaceEditor value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setWatchFaceEditor(value);
                return this;
            }

            public Builder setWidgetSortList(int index, int value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setWidgetSortList(index, value);
                return this;
            }

            public Builder setWristScreenOn(SwitchTimeSlot value) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setWristScreenOn(value);
                return this;
            }

            private Builder() {
                super(ComoNessSettingMessage.DEFAULT_INSTANCE);
            }

            public Builder setNoDistrubModeState(NoDistrubModeState.Builder builderForValue) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setNoDistrubModeState(builderForValue.build());
                return this;
            }

            public Builder setNotificationScreenOn(SwitchTimeSlot.Builder builderForValue) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setNotificationScreenOn(builderForValue.build());
                return this;
            }

            public Builder setWatchFaceEditor(WatchFaceEditor.Builder builderForValue) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setWatchFaceEditor(builderForValue.build());
                return this;
            }

            public Builder setWristScreenOn(SwitchTimeSlot.Builder builderForValue) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setWristScreenOn(builderForValue.build());
                return this;
            }
        }

        static {
            ComoNessSettingMessage comoNessSettingMessage = new ComoNessSettingMessage();
            DEFAULT_INSTANCE = comoNessSettingMessage;
            GeneratedMessageLite.registerDefaultInstance(ComoNessSettingMessage.class, comoNessSettingMessage);
        }

        private ComoNessSettingMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllWidgetSortList(Iterable<? extends Integer> values) {
            ensureWidgetSortListIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.widgetSortList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWidgetSortList(int value) {
            ensureWidgetSortListIsMutable();
            this.widgetSortList_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoScreenBrightnessSwitch() {
            this.bitField0_ &= -1025;
            this.autoScreenBrightnessSwitch_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoScreenOffTime() {
            this.bitField0_ &= -2;
            this.autoScreenOffTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBloodOxygenColor() {
            this.bitField0_ &= -4097;
            this.bloodOxygenColor_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDateDisplayFormat() {
            this.bitField0_ &= -65;
            this.dateDisplayFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongPressKeyOpenApp() {
            this.bitField0_ &= -129;
            this.longPressKeyOpenApp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoDistrubModeState() {
            this.noDistrubModeState_ = null;
            this.bitField0_ &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotificationScreenOn() {
            this.notificationScreenOn_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenBrightnessLevel() {
            this.bitField0_ &= -513;
            this.screenBrightnessLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenLockSwitch() {
            this.bitField0_ &= -3;
            this.screenLockSwitch_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeDisplayFormat() {
            this.bitField0_ &= -33;
            this.timeDisplayFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVibratingStrength() {
            this.bitField0_ &= -17;
            this.vibratingStrength_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWatchFaceEditor() {
            this.watchFaceEditor_ = null;
            this.bitField0_ &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidgetSortList() {
            this.widgetSortList_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWristScreenOn() {
            this.wristScreenOn_ = null;
            this.bitField0_ &= -9;
        }

        private void ensureWidgetSortListIsMutable() {
            Internal.IntList intList = this.widgetSortList_;
            if (intList.isModifiable()) {
                return;
            }
            this.widgetSortList_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static ComoNessSettingMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNoDistrubModeState(NoDistrubModeState value) {
            value.getClass();
            NoDistrubModeState noDistrubModeState = this.noDistrubModeState_;
            if (noDistrubModeState == null || noDistrubModeState == NoDistrubModeState.getDefaultInstance()) {
                this.noDistrubModeState_ = value;
            } else {
                this.noDistrubModeState_ = NoDistrubModeState.newBuilder(this.noDistrubModeState_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotificationScreenOn(SwitchTimeSlot value) {
            value.getClass();
            SwitchTimeSlot switchTimeSlot = this.notificationScreenOn_;
            if (switchTimeSlot == null || switchTimeSlot == SwitchTimeSlot.getDefaultInstance()) {
                this.notificationScreenOn_ = value;
            } else {
                this.notificationScreenOn_ = SwitchTimeSlot.newBuilder(this.notificationScreenOn_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWatchFaceEditor(WatchFaceEditor value) {
            value.getClass();
            WatchFaceEditor watchFaceEditor = this.watchFaceEditor_;
            if (watchFaceEditor == null || watchFaceEditor == WatchFaceEditor.getDefaultInstance()) {
                this.watchFaceEditor_ = value;
            } else {
                this.watchFaceEditor_ = WatchFaceEditor.newBuilder(this.watchFaceEditor_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWristScreenOn(SwitchTimeSlot value) {
            value.getClass();
            SwitchTimeSlot switchTimeSlot = this.wristScreenOn_;
            if (switchTimeSlot == null || switchTimeSlot == SwitchTimeSlot.getDefaultInstance()) {
                this.wristScreenOn_ = value;
            } else {
                this.wristScreenOn_ = SwitchTimeSlot.newBuilder(this.wristScreenOn_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ComoNessSettingMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ComoNessSettingMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<ComoNessSettingMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoScreenBrightnessSwitch(boolean value) {
            this.bitField0_ |= 1024;
            this.autoScreenBrightnessSwitch_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoScreenOffTime(int value) {
            this.bitField0_ |= 1;
            this.autoScreenOffTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBloodOxygenColor(float value) {
            this.bitField0_ |= 4096;
            this.bloodOxygenColor_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDateDisplayFormat(int value) {
            this.bitField0_ |= 64;
            this.dateDisplayFormat_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongPressKeyOpenApp(int value) {
            this.bitField0_ |= 128;
            this.longPressKeyOpenApp_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoDistrubModeState(NoDistrubModeState value) {
            value.getClass();
            this.noDistrubModeState_ = value;
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationScreenOn(SwitchTimeSlot value) {
            value.getClass();
            this.notificationScreenOn_ = value;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenBrightnessLevel(int value) {
            this.bitField0_ |= 512;
            this.screenBrightnessLevel_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenLockSwitch(boolean value) {
            this.bitField0_ |= 2;
            this.screenLockSwitch_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeDisplayFormat(int value) {
            this.bitField0_ |= 32;
            this.timeDisplayFormat_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVibratingStrength(int value) {
            this.bitField0_ |= 16;
            this.vibratingStrength_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchFaceEditor(WatchFaceEditor value) {
            value.getClass();
            this.watchFaceEditor_ = value;
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidgetSortList(int index, int value) {
            ensureWidgetSortListIsMutable();
            this.widgetSortList_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWristScreenOn(SwitchTimeSlot value) {
            value.getClass();
            this.wristScreenOn_ = value;
            this.bitField0_ |= 8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new ComoNessSettingMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u000b\u0001ᔋ\u0000\u0002ᔇ\u0001\u0003ᔉ\u0002\u0004ᔉ\u0003\u0005\u001d\u0006ᔋ\u0004\u0007ᔋ\u0005\bᔋ\u0006\tᔋ\u0007\nᔉ\b\u000bᔋ\t\fဇ\n\rᔉ\u000b\u000eခ\f", new Object[]{"bitField0_", "autoScreenOffTime_", "screenLockSwitch_", "notificationScreenOn_", "wristScreenOn_", "widgetSortList_", "vibratingStrength_", "timeDisplayFormat_", "dateDisplayFormat_", "longPressKeyOpenApp_", "noDistrubModeState_", "screenBrightnessLevel_", "autoScreenBrightnessSwitch_", "watchFaceEditor_", "bloodOxygenColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ComoNessSettingMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ComoNessSettingMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean getAutoScreenBrightnessSwitch() {
            return this.autoScreenBrightnessSwitch_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public int getAutoScreenOffTime() {
            return this.autoScreenOffTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public float getBloodOxygenColor() {
            return this.bloodOxygenColor_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public int getDateDisplayFormat() {
            return this.dateDisplayFormat_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public int getLongPressKeyOpenApp() {
            return this.longPressKeyOpenApp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public NoDistrubModeState getNoDistrubModeState() {
            NoDistrubModeState noDistrubModeState = this.noDistrubModeState_;
            return noDistrubModeState == null ? NoDistrubModeState.getDefaultInstance() : noDistrubModeState;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public SwitchTimeSlot getNotificationScreenOn() {
            SwitchTimeSlot switchTimeSlot = this.notificationScreenOn_;
            return switchTimeSlot == null ? SwitchTimeSlot.getDefaultInstance() : switchTimeSlot;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public int getScreenBrightnessLevel() {
            return this.screenBrightnessLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean getScreenLockSwitch() {
            return this.screenLockSwitch_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public int getTimeDisplayFormat() {
            return this.timeDisplayFormat_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public int getVibratingStrength() {
            return this.vibratingStrength_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public WatchFaceEditor getWatchFaceEditor() {
            WatchFaceEditor watchFaceEditor = this.watchFaceEditor_;
            return watchFaceEditor == null ? WatchFaceEditor.getDefaultInstance() : watchFaceEditor;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public int getWidgetSortList(int index) {
            return this.widgetSortList_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public int getWidgetSortListCount() {
            return this.widgetSortList_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public List<Integer> getWidgetSortListList() {
            return this.widgetSortList_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public SwitchTimeSlot getWristScreenOn() {
            SwitchTimeSlot switchTimeSlot = this.wristScreenOn_;
            return switchTimeSlot == null ? SwitchTimeSlot.getDefaultInstance() : switchTimeSlot;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasAutoScreenBrightnessSwitch() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasAutoScreenOffTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasBloodOxygenColor() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasDateDisplayFormat() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasLongPressKeyOpenApp() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasNoDistrubModeState() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasNotificationScreenOn() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasScreenBrightnessLevel() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasScreenLockSwitch() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasTimeDisplayFormat() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasVibratingStrength() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasWatchFaceEditor() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.ComoNessSettingMessageOrBuilder
        public boolean hasWristScreenOn() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(ComoNessSettingMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static ComoNessSettingMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ComoNessSettingMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ComoNessSettingMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ComoNessSettingMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ComoNessSettingMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ComoNessSettingMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ComoNessSettingMessage parseFrom(InputStream input) throws IOException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ComoNessSettingMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ComoNessSettingMessage parseFrom(CodedInputStream input) throws IOException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ComoNessSettingMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface ComoNessSettingMessageOrBuilder extends MessageLiteOrBuilder {
        boolean getAutoScreenBrightnessSwitch();

        int getAutoScreenOffTime();

        float getBloodOxygenColor();

        int getDateDisplayFormat();

        int getLongPressKeyOpenApp();

        NoDistrubModeState getNoDistrubModeState();

        SwitchTimeSlot getNotificationScreenOn();

        int getScreenBrightnessLevel();

        boolean getScreenLockSwitch();

        int getTimeDisplayFormat();

        int getVibratingStrength();

        WatchFaceEditor getWatchFaceEditor();

        int getWidgetSortList(int index);

        int getWidgetSortListCount();

        List<Integer> getWidgetSortListList();

        SwitchTimeSlot getWristScreenOn();

        boolean hasAutoScreenBrightnessSwitch();

        boolean hasAutoScreenOffTime();

        boolean hasBloodOxygenColor();

        boolean hasDateDisplayFormat();

        boolean hasLongPressKeyOpenApp();

        boolean hasNoDistrubModeState();

        boolean hasNotificationScreenOn();

        boolean hasScreenBrightnessLevel();

        boolean hasScreenLockSwitch();

        boolean hasTimeDisplayFormat();

        boolean hasVibratingStrength();

        boolean hasWatchFaceEditor();

        boolean hasWristScreenOn();
    }

    public static final class NoDistrubModeState extends GeneratedMessageLite<NoDistrubModeState, Builder> implements NoDistrubModeStateOrBuilder {
        private static final NoDistrubModeState DEFAULT_INSTANCE;
        public static final int ENDHOUR_FIELD_NUMBER = 3;
        public static final int ENDMIN_FIELD_NUMBER = 5;
        private static volatile Parser<NoDistrubModeState> PARSER = null;
        public static final int STARTHOUR_FIELD_NUMBER = 2;
        public static final int STARTMIN_FIELD_NUMBER = 4;
        public static final int STATEFLAG_FIELD_NUMBER = 1;
        private int bitField0_;
        private int endHour_;
        private int endMin_;
        private byte memoizedIsInitialized = 2;
        private int startHour_;
        private int startMin_;
        private int stateFlag_;

        public static final class Builder extends GeneratedMessageLite.Builder<NoDistrubModeState, Builder> implements NoDistrubModeStateOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearEndHour() {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).clearEndHour();
                return this;
            }

            public Builder clearEndMin() {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).clearEndMin();
                return this;
            }

            public Builder clearStartHour() {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).clearStartHour();
                return this;
            }

            public Builder clearStartMin() {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).clearStartMin();
                return this;
            }

            public Builder clearStateFlag() {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).clearStateFlag();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
            public int getEndHour() {
                return ((NoDistrubModeState) this.instance).getEndHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
            public int getEndMin() {
                return ((NoDistrubModeState) this.instance).getEndMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
            public int getStartHour() {
                return ((NoDistrubModeState) this.instance).getStartHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
            public int getStartMin() {
                return ((NoDistrubModeState) this.instance).getStartMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
            public int getStateFlag() {
                return ((NoDistrubModeState) this.instance).getStateFlag();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
            public boolean hasEndHour() {
                return ((NoDistrubModeState) this.instance).hasEndHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
            public boolean hasEndMin() {
                return ((NoDistrubModeState) this.instance).hasEndMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
            public boolean hasStartHour() {
                return ((NoDistrubModeState) this.instance).hasStartHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
            public boolean hasStartMin() {
                return ((NoDistrubModeState) this.instance).hasStartMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
            public boolean hasStateFlag() {
                return ((NoDistrubModeState) this.instance).hasStateFlag();
            }

            public Builder setEndHour(int value) {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).setEndHour(value);
                return this;
            }

            public Builder setEndMin(int value) {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).setEndMin(value);
                return this;
            }

            public Builder setStartHour(int value) {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).setStartHour(value);
                return this;
            }

            public Builder setStartMin(int value) {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).setStartMin(value);
                return this;
            }

            public Builder setStateFlag(int value) {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).setStateFlag(value);
                return this;
            }

            private Builder() {
                super(NoDistrubModeState.DEFAULT_INSTANCE);
            }
        }

        static {
            NoDistrubModeState noDistrubModeState = new NoDistrubModeState();
            DEFAULT_INSTANCE = noDistrubModeState;
            GeneratedMessageLite.registerDefaultInstance(NoDistrubModeState.class, noDistrubModeState);
        }

        private NoDistrubModeState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndHour() {
            this.bitField0_ &= -5;
            this.endHour_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndMin() {
            this.bitField0_ &= -17;
            this.endMin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartHour() {
            this.bitField0_ &= -3;
            this.startHour_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartMin() {
            this.bitField0_ &= -9;
            this.startMin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStateFlag() {
            this.bitField0_ &= -2;
            this.stateFlag_ = 0;
        }

        public static NoDistrubModeState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NoDistrubModeState parseDelimitedFrom(InputStream input) throws IOException {
            return (NoDistrubModeState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static NoDistrubModeState parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<NoDistrubModeState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndHour(int value) {
            this.bitField0_ |= 4;
            this.endHour_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndMin(int value) {
            this.bitField0_ |= 16;
            this.endMin_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartHour(int value) {
            this.bitField0_ |= 2;
            this.startHour_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartMin(int value) {
            this.bitField0_ |= 8;
            this.startMin_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStateFlag(int value) {
            this.bitField0_ |= 1;
            this.stateFlag_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new NoDistrubModeState();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᔋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"bitField0_", "stateFlag_", "startHour_", "endHour_", "startMin_", "endMin_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NoDistrubModeState> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NoDistrubModeState.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
        public int getEndHour() {
            return this.endHour_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
        public int getEndMin() {
            return this.endMin_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
        public int getStartHour() {
            return this.startHour_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
        public int getStartMin() {
            return this.startMin_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
        public int getStateFlag() {
            return this.stateFlag_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
        public boolean hasEndHour() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
        public boolean hasEndMin() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
        public boolean hasStartHour() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
        public boolean hasStartMin() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.NoDistrubModeStateOrBuilder
        public boolean hasStateFlag() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NoDistrubModeState prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static NoDistrubModeState parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NoDistrubModeState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NoDistrubModeState parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NoDistrubModeState parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NoDistrubModeState parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NoDistrubModeState parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NoDistrubModeState parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NoDistrubModeState parseFrom(InputStream input) throws IOException {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NoDistrubModeState parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NoDistrubModeState parseFrom(CodedInputStream input) throws IOException {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NoDistrubModeState parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface NoDistrubModeStateOrBuilder extends MessageLiteOrBuilder {
        int getEndHour();

        int getEndMin();

        int getStartHour();

        int getStartMin();

        int getStateFlag();

        boolean hasEndHour();

        boolean hasEndMin();

        boolean hasStartHour();

        boolean hasStartMin();

        boolean hasStateFlag();
    }

    public static final class SwitchTimeSlot extends GeneratedMessageLite<SwitchTimeSlot, Builder> implements SwitchTimeSlotOrBuilder {
        private static final SwitchTimeSlot DEFAULT_INSTANCE;
        public static final int ENDHOUR_FIELD_NUMBER = 3;
        public static final int ENDMIN_FIELD_NUMBER = 5;
        private static volatile Parser<SwitchTimeSlot> PARSER = null;
        public static final int STARTHOUR_FIELD_NUMBER = 2;
        public static final int STARTMIN_FIELD_NUMBER = 4;
        public static final int SWITCHFLAG_FIELD_NUMBER = 1;
        private int bitField0_;
        private int endHour_;
        private int endMin_;
        private byte memoizedIsInitialized = 2;
        private int startHour_;
        private int startMin_;
        private int switchFlag_;

        public static final class Builder extends GeneratedMessageLite.Builder<SwitchTimeSlot, Builder> implements SwitchTimeSlotOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearEndHour() {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).clearEndHour();
                return this;
            }

            public Builder clearEndMin() {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).clearEndMin();
                return this;
            }

            public Builder clearStartHour() {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).clearStartHour();
                return this;
            }

            public Builder clearStartMin() {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).clearStartMin();
                return this;
            }

            public Builder clearSwitchFlag() {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).clearSwitchFlag();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
            public int getEndHour() {
                return ((SwitchTimeSlot) this.instance).getEndHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
            public int getEndMin() {
                return ((SwitchTimeSlot) this.instance).getEndMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
            public int getStartHour() {
                return ((SwitchTimeSlot) this.instance).getStartHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
            public int getStartMin() {
                return ((SwitchTimeSlot) this.instance).getStartMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
            public int getSwitchFlag() {
                return ((SwitchTimeSlot) this.instance).getSwitchFlag();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
            public boolean hasEndHour() {
                return ((SwitchTimeSlot) this.instance).hasEndHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
            public boolean hasEndMin() {
                return ((SwitchTimeSlot) this.instance).hasEndMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
            public boolean hasStartHour() {
                return ((SwitchTimeSlot) this.instance).hasStartHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
            public boolean hasStartMin() {
                return ((SwitchTimeSlot) this.instance).hasStartMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
            public boolean hasSwitchFlag() {
                return ((SwitchTimeSlot) this.instance).hasSwitchFlag();
            }

            public Builder setEndHour(int value) {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).setEndHour(value);
                return this;
            }

            public Builder setEndMin(int value) {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).setEndMin(value);
                return this;
            }

            public Builder setStartHour(int value) {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).setStartHour(value);
                return this;
            }

            public Builder setStartMin(int value) {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).setStartMin(value);
                return this;
            }

            public Builder setSwitchFlag(int value) {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).setSwitchFlag(value);
                return this;
            }

            private Builder() {
                super(SwitchTimeSlot.DEFAULT_INSTANCE);
            }
        }

        static {
            SwitchTimeSlot switchTimeSlot = new SwitchTimeSlot();
            DEFAULT_INSTANCE = switchTimeSlot;
            GeneratedMessageLite.registerDefaultInstance(SwitchTimeSlot.class, switchTimeSlot);
        }

        private SwitchTimeSlot() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndHour() {
            this.bitField0_ &= -5;
            this.endHour_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndMin() {
            this.bitField0_ &= -17;
            this.endMin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartHour() {
            this.bitField0_ &= -3;
            this.startHour_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartMin() {
            this.bitField0_ &= -9;
            this.startMin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwitchFlag() {
            this.bitField0_ &= -2;
            this.switchFlag_ = 0;
        }

        public static SwitchTimeSlot getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SwitchTimeSlot parseDelimitedFrom(InputStream input) throws IOException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static SwitchTimeSlot parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<SwitchTimeSlot> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndHour(int value) {
            this.bitField0_ |= 4;
            this.endHour_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndMin(int value) {
            this.bitField0_ |= 16;
            this.endMin_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartHour(int value) {
            this.bitField0_ |= 2;
            this.startHour_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartMin(int value) {
            this.bitField0_ |= 8;
            this.startMin_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwitchFlag(int value) {
            this.bitField0_ |= 1;
            this.switchFlag_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new SwitchTimeSlot();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᔋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"bitField0_", "switchFlag_", "startHour_", "endHour_", "startMin_", "endMin_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SwitchTimeSlot> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SwitchTimeSlot.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
        public int getEndHour() {
            return this.endHour_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
        public int getEndMin() {
            return this.endMin_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
        public int getStartHour() {
            return this.startHour_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
        public int getStartMin() {
            return this.startMin_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
        public int getSwitchFlag() {
            return this.switchFlag_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
        public boolean hasEndHour() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
        public boolean hasEndMin() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
        public boolean hasStartHour() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
        public boolean hasStartMin() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.SwitchTimeSlotOrBuilder
        public boolean hasSwitchFlag() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SwitchTimeSlot prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static SwitchTimeSlot parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SwitchTimeSlot parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SwitchTimeSlot parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SwitchTimeSlot parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SwitchTimeSlot parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SwitchTimeSlot parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SwitchTimeSlot parseFrom(InputStream input) throws IOException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SwitchTimeSlot parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SwitchTimeSlot parseFrom(CodedInputStream input) throws IOException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SwitchTimeSlot parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface SwitchTimeSlotOrBuilder extends MessageLiteOrBuilder {
        int getEndHour();

        int getEndMin();

        int getStartHour();

        int getStartMin();

        int getSwitchFlag();

        boolean hasEndHour();

        boolean hasEndMin();

        boolean hasStartHour();

        boolean hasStartMin();

        boolean hasSwitchFlag();
    }

    public static final class WatchFaceEditor extends GeneratedMessageLite<WatchFaceEditor, Builder> implements WatchFaceEditorOrBuilder {
        private static final WatchFaceEditor DEFAULT_INSTANCE;
        private static volatile Parser<WatchFaceEditor> PARSER = null;
        public static final int WATCHFACEEDITIDS_FIELD_NUMBER = 2;
        public static final int WATCHFACEID_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private Internal.IntList watchFaceEditIds_ = GeneratedMessageLite.emptyIntList();
        private int watchFaceId_;

        public static final class Builder extends GeneratedMessageLite.Builder<WatchFaceEditor, Builder> implements WatchFaceEditorOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllWatchFaceEditIds(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((WatchFaceEditor) this.instance).addAllWatchFaceEditIds(values);
                return this;
            }

            public Builder addWatchFaceEditIds(int value) {
                copyOnWrite();
                ((WatchFaceEditor) this.instance).addWatchFaceEditIds(value);
                return this;
            }

            public Builder clearWatchFaceEditIds() {
                copyOnWrite();
                ((WatchFaceEditor) this.instance).clearWatchFaceEditIds();
                return this;
            }

            public Builder clearWatchFaceId() {
                copyOnWrite();
                ((WatchFaceEditor) this.instance).clearWatchFaceId();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.WatchFaceEditorOrBuilder
            public int getWatchFaceEditIds(int index) {
                return ((WatchFaceEditor) this.instance).getWatchFaceEditIds(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.WatchFaceEditorOrBuilder
            public int getWatchFaceEditIdsCount() {
                return ((WatchFaceEditor) this.instance).getWatchFaceEditIdsCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.WatchFaceEditorOrBuilder
            public List<Integer> getWatchFaceEditIdsList() {
                return Collections.unmodifiableList(((WatchFaceEditor) this.instance).getWatchFaceEditIdsList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.WatchFaceEditorOrBuilder
            public int getWatchFaceId() {
                return ((WatchFaceEditor) this.instance).getWatchFaceId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.WatchFaceEditorOrBuilder
            public boolean hasWatchFaceId() {
                return ((WatchFaceEditor) this.instance).hasWatchFaceId();
            }

            public Builder setWatchFaceEditIds(int index, int value) {
                copyOnWrite();
                ((WatchFaceEditor) this.instance).setWatchFaceEditIds(index, value);
                return this;
            }

            public Builder setWatchFaceId(int value) {
                copyOnWrite();
                ((WatchFaceEditor) this.instance).setWatchFaceId(value);
                return this;
            }

            private Builder() {
                super(WatchFaceEditor.DEFAULT_INSTANCE);
            }
        }

        static {
            WatchFaceEditor watchFaceEditor = new WatchFaceEditor();
            DEFAULT_INSTANCE = watchFaceEditor;
            GeneratedMessageLite.registerDefaultInstance(WatchFaceEditor.class, watchFaceEditor);
        }

        private WatchFaceEditor() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllWatchFaceEditIds(Iterable<? extends Integer> values) {
            ensureWatchFaceEditIdsIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.watchFaceEditIds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWatchFaceEditIds(int value) {
            ensureWatchFaceEditIdsIsMutable();
            this.watchFaceEditIds_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWatchFaceEditIds() {
            this.watchFaceEditIds_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWatchFaceId() {
            this.bitField0_ &= -2;
            this.watchFaceId_ = 0;
        }

        private void ensureWatchFaceEditIdsIsMutable() {
            Internal.IntList intList = this.watchFaceEditIds_;
            if (intList.isModifiable()) {
                return;
            }
            this.watchFaceEditIds_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static WatchFaceEditor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WatchFaceEditor parseDelimitedFrom(InputStream input) throws IOException {
            return (WatchFaceEditor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static WatchFaceEditor parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<WatchFaceEditor> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchFaceEditIds(int index, int value) {
            ensureWatchFaceEditIdsIsMutable();
            this.watchFaceEditIds_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchFaceId(int value) {
            this.bitField0_ |= 1;
            this.watchFaceId_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new WatchFaceEditor();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔋ\u0000\u0002\u001d", new Object[]{"bitField0_", "watchFaceId_", "watchFaceEditIds_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WatchFaceEditor> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (WatchFaceEditor.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.WatchFaceEditorOrBuilder
        public int getWatchFaceEditIds(int index) {
            return this.watchFaceEditIds_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.WatchFaceEditorOrBuilder
        public int getWatchFaceEditIdsCount() {
            return this.watchFaceEditIds_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.WatchFaceEditorOrBuilder
        public List<Integer> getWatchFaceEditIdsList() {
            return this.watchFaceEditIds_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.WatchFaceEditorOrBuilder
        public int getWatchFaceId() {
            return this.watchFaceId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.WatchFaceEditorOrBuilder
        public boolean hasWatchFaceId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(WatchFaceEditor prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static WatchFaceEditor parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WatchFaceEditor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static WatchFaceEditor parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WatchFaceEditor parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static WatchFaceEditor parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WatchFaceEditor parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static WatchFaceEditor parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WatchFaceEditor parseFrom(InputStream input) throws IOException {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static WatchFaceEditor parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static WatchFaceEditor parseFrom(CodedInputStream input) throws IOException {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static WatchFaceEditor parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface WatchFaceEditorOrBuilder extends MessageLiteOrBuilder {
        int getWatchFaceEditIds(int index);

        int getWatchFaceEditIdsCount();

        List<Integer> getWatchFaceEditIdsList();

        int getWatchFaceId();

        boolean hasWatchFaceId();
    }

    private ComoSettingUpload() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
