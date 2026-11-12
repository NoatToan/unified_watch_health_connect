package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.b;
import com.google.protobuf.d0;
import com.google.protobuf.j;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import defpackage.bsf;
import defpackage.vkh;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
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
        private static volatile vkh<ComoNessSettingMessage> PARSER = null;
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
        private d0.g widgetSortList_ = GeneratedMessageLite.emptyIntList();

        public static final class Builder extends GeneratedMessageLite.a<ComoNessSettingMessage, Builder> implements ComoNessSettingMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllWidgetSortList(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).addAllWidgetSortList(iterable);
                return this;
            }

            public Builder addWidgetSortList(int i) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).addWidgetSortList(i);
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
            public int getWidgetSortList(int i) {
                return ((ComoNessSettingMessage) this.instance).getWidgetSortList(i);
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

            public Builder mergeNoDistrubModeState(NoDistrubModeState noDistrubModeState) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).mergeNoDistrubModeState(noDistrubModeState);
                return this;
            }

            public Builder mergeNotificationScreenOn(SwitchTimeSlot switchTimeSlot) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).mergeNotificationScreenOn(switchTimeSlot);
                return this;
            }

            public Builder mergeWatchFaceEditor(WatchFaceEditor watchFaceEditor) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).mergeWatchFaceEditor(watchFaceEditor);
                return this;
            }

            public Builder mergeWristScreenOn(SwitchTimeSlot switchTimeSlot) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).mergeWristScreenOn(switchTimeSlot);
                return this;
            }

            public Builder setAutoScreenBrightnessSwitch(boolean z) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setAutoScreenBrightnessSwitch(z);
                return this;
            }

            public Builder setAutoScreenOffTime(int i) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setAutoScreenOffTime(i);
                return this;
            }

            public Builder setBloodOxygenColor(float f) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setBloodOxygenColor(f);
                return this;
            }

            public Builder setDateDisplayFormat(int i) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setDateDisplayFormat(i);
                return this;
            }

            public Builder setLongPressKeyOpenApp(int i) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setLongPressKeyOpenApp(i);
                return this;
            }

            public Builder setNoDistrubModeState(NoDistrubModeState noDistrubModeState) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setNoDistrubModeState(noDistrubModeState);
                return this;
            }

            public Builder setNotificationScreenOn(SwitchTimeSlot switchTimeSlot) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setNotificationScreenOn(switchTimeSlot);
                return this;
            }

            public Builder setScreenBrightnessLevel(int i) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setScreenBrightnessLevel(i);
                return this;
            }

            public Builder setScreenLockSwitch(boolean z) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setScreenLockSwitch(z);
                return this;
            }

            public Builder setTimeDisplayFormat(int i) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setTimeDisplayFormat(i);
                return this;
            }

            public Builder setVibratingStrength(int i) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setVibratingStrength(i);
                return this;
            }

            public Builder setWatchFaceEditor(WatchFaceEditor watchFaceEditor) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setWatchFaceEditor(watchFaceEditor);
                return this;
            }

            public Builder setWidgetSortList(int i, int i2) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setWidgetSortList(i, i2);
                return this;
            }

            public Builder setWristScreenOn(SwitchTimeSlot switchTimeSlot) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setWristScreenOn(switchTimeSlot);
                return this;
            }

            private Builder() {
                super(ComoNessSettingMessage.DEFAULT_INSTANCE);
            }

            public Builder setNoDistrubModeState(NoDistrubModeState.Builder builder) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setNoDistrubModeState(builder.build());
                return this;
            }

            public Builder setNotificationScreenOn(SwitchTimeSlot.Builder builder) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setNotificationScreenOn(builder.build());
                return this;
            }

            public Builder setWatchFaceEditor(WatchFaceEditor.Builder builder) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setWatchFaceEditor(builder.build());
                return this;
            }

            public Builder setWristScreenOn(SwitchTimeSlot.Builder builder) {
                copyOnWrite();
                ((ComoNessSettingMessage) this.instance).setWristScreenOn(builder.build());
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
        public void addAllWidgetSortList(Iterable<? extends Integer> iterable) {
            ensureWidgetSortListIsMutable();
            b.addAll((Iterable) iterable, (List) this.widgetSortList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWidgetSortList(int i) {
            ensureWidgetSortListIsMutable();
            this.widgetSortList_.Q(i);
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
            d0.g gVar = this.widgetSortList_;
            if (gVar.c()) {
                return;
            }
            this.widgetSortList_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static ComoNessSettingMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNoDistrubModeState(NoDistrubModeState noDistrubModeState) {
            noDistrubModeState.getClass();
            NoDistrubModeState noDistrubModeState2 = this.noDistrubModeState_;
            if (noDistrubModeState2 == null || noDistrubModeState2 == NoDistrubModeState.getDefaultInstance()) {
                this.noDistrubModeState_ = noDistrubModeState;
            } else {
                this.noDistrubModeState_ = NoDistrubModeState.newBuilder(this.noDistrubModeState_).mergeFrom(noDistrubModeState).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNotificationScreenOn(SwitchTimeSlot switchTimeSlot) {
            switchTimeSlot.getClass();
            SwitchTimeSlot switchTimeSlot2 = this.notificationScreenOn_;
            if (switchTimeSlot2 == null || switchTimeSlot2 == SwitchTimeSlot.getDefaultInstance()) {
                this.notificationScreenOn_ = switchTimeSlot;
            } else {
                this.notificationScreenOn_ = SwitchTimeSlot.newBuilder(this.notificationScreenOn_).mergeFrom(switchTimeSlot).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWatchFaceEditor(WatchFaceEditor watchFaceEditor) {
            watchFaceEditor.getClass();
            WatchFaceEditor watchFaceEditor2 = this.watchFaceEditor_;
            if (watchFaceEditor2 == null || watchFaceEditor2 == WatchFaceEditor.getDefaultInstance()) {
                this.watchFaceEditor_ = watchFaceEditor;
            } else {
                this.watchFaceEditor_ = WatchFaceEditor.newBuilder(this.watchFaceEditor_).mergeFrom(watchFaceEditor).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWristScreenOn(SwitchTimeSlot switchTimeSlot) {
            switchTimeSlot.getClass();
            SwitchTimeSlot switchTimeSlot2 = this.wristScreenOn_;
            if (switchTimeSlot2 == null || switchTimeSlot2 == SwitchTimeSlot.getDefaultInstance()) {
                this.wristScreenOn_ = switchTimeSlot;
            } else {
                this.wristScreenOn_ = SwitchTimeSlot.newBuilder(this.wristScreenOn_).mergeFrom(switchTimeSlot).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ComoNessSettingMessage parseDelimitedFrom(InputStream inputStream) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ComoNessSettingMessage parseFrom(ByteBuffer byteBuffer) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<ComoNessSettingMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoScreenBrightnessSwitch(boolean z) {
            this.bitField0_ |= 1024;
            this.autoScreenBrightnessSwitch_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoScreenOffTime(int i) {
            this.bitField0_ |= 1;
            this.autoScreenOffTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBloodOxygenColor(float f) {
            this.bitField0_ |= 4096;
            this.bloodOxygenColor_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDateDisplayFormat(int i) {
            this.bitField0_ |= 64;
            this.dateDisplayFormat_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongPressKeyOpenApp(int i) {
            this.bitField0_ |= 128;
            this.longPressKeyOpenApp_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoDistrubModeState(NoDistrubModeState noDistrubModeState) {
            noDistrubModeState.getClass();
            this.noDistrubModeState_ = noDistrubModeState;
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotificationScreenOn(SwitchTimeSlot switchTimeSlot) {
            switchTimeSlot.getClass();
            this.notificationScreenOn_ = switchTimeSlot;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenBrightnessLevel(int i) {
            this.bitField0_ |= 512;
            this.screenBrightnessLevel_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenLockSwitch(boolean z) {
            this.bitField0_ |= 2;
            this.screenLockSwitch_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeDisplayFormat(int i) {
            this.bitField0_ |= 32;
            this.timeDisplayFormat_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVibratingStrength(int i) {
            this.bitField0_ |= 16;
            this.vibratingStrength_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchFaceEditor(WatchFaceEditor watchFaceEditor) {
            watchFaceEditor.getClass();
            this.watchFaceEditor_ = watchFaceEditor;
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidgetSortList(int i, int i2) {
            ensureWidgetSortListIsMutable();
            this.widgetSortList_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWristScreenOn(SwitchTimeSlot switchTimeSlot) {
            switchTimeSlot.getClass();
            this.wristScreenOn_ = switchTimeSlot;
            this.bitField0_ |= 8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ComoNessSettingMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u000b\u0001ᔋ\u0000\u0002ᔇ\u0001\u0003ᔉ\u0002\u0004ᔉ\u0003\u0005\u001d\u0006ᔋ\u0004\u0007ᔋ\u0005\bᔋ\u0006\tᔋ\u0007\nᔉ\b\u000bᔋ\t\fဇ\n\rᔉ\u000b\u000eခ\f", new Object[]{"bitField0_", "autoScreenOffTime_", "screenLockSwitch_", "notificationScreenOn_", "wristScreenOn_", "widgetSortList_", "vibratingStrength_", "timeDisplayFormat_", "dateDisplayFormat_", "longPressKeyOpenApp_", "noDistrubModeState_", "screenBrightnessLevel_", "autoScreenBrightnessSwitch_", "watchFaceEditor_", "bloodOxygenColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<ComoNessSettingMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (ComoNessSettingMessage.class) {
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
        public int getWidgetSortList(int i) {
            return this.widgetSortList_.getInt(i);
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

        public static Builder newBuilder(ComoNessSettingMessage comoNessSettingMessage) {
            return DEFAULT_INSTANCE.createBuilder(comoNessSettingMessage);
        }

        public static ComoNessSettingMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ComoNessSettingMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static ComoNessSettingMessage parseFrom(ByteString byteString) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ComoNessSettingMessage parseFrom(ByteString byteString, t tVar) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static ComoNessSettingMessage parseFrom(byte[] bArr) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ComoNessSettingMessage parseFrom(byte[] bArr, t tVar) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static ComoNessSettingMessage parseFrom(InputStream inputStream) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ComoNessSettingMessage parseFrom(InputStream inputStream, t tVar) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ComoNessSettingMessage parseFrom(j jVar) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ComoNessSettingMessage parseFrom(j jVar, t tVar) {
            return (ComoNessSettingMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface ComoNessSettingMessageOrBuilder extends bsf {
        boolean getAutoScreenBrightnessSwitch();

        int getAutoScreenOffTime();

        float getBloodOxygenColor();

        int getDateDisplayFormat();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getLongPressKeyOpenApp();

        NoDistrubModeState getNoDistrubModeState();

        SwitchTimeSlot getNotificationScreenOn();

        int getScreenBrightnessLevel();

        boolean getScreenLockSwitch();

        int getTimeDisplayFormat();

        int getVibratingStrength();

        WatchFaceEditor getWatchFaceEditor();

        int getWidgetSortList(int i);

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class NoDistrubModeState extends GeneratedMessageLite<NoDistrubModeState, Builder> implements NoDistrubModeStateOrBuilder {
        private static final NoDistrubModeState DEFAULT_INSTANCE;
        public static final int ENDHOUR_FIELD_NUMBER = 3;
        public static final int ENDMIN_FIELD_NUMBER = 5;
        private static volatile vkh<NoDistrubModeState> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<NoDistrubModeState, Builder> implements NoDistrubModeStateOrBuilder {
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

            public Builder setEndHour(int i) {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).setEndHour(i);
                return this;
            }

            public Builder setEndMin(int i) {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).setEndMin(i);
                return this;
            }

            public Builder setStartHour(int i) {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).setStartHour(i);
                return this;
            }

            public Builder setStartMin(int i) {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).setStartMin(i);
                return this;
            }

            public Builder setStateFlag(int i) {
                copyOnWrite();
                ((NoDistrubModeState) this.instance).setStateFlag(i);
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

        public static NoDistrubModeState parseDelimitedFrom(InputStream inputStream) {
            return (NoDistrubModeState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NoDistrubModeState parseFrom(ByteBuffer byteBuffer) {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<NoDistrubModeState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndHour(int i) {
            this.bitField0_ |= 4;
            this.endHour_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndMin(int i) {
            this.bitField0_ |= 16;
            this.endMin_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartHour(int i) {
            this.bitField0_ |= 2;
            this.startHour_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartMin(int i) {
            this.bitField0_ |= 8;
            this.startMin_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStateFlag(int i) {
            this.bitField0_ |= 1;
            this.stateFlag_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new NoDistrubModeState();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᔋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"bitField0_", "stateFlag_", "startHour_", "endHour_", "startMin_", "endMin_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<NoDistrubModeState> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (NoDistrubModeState.class) {
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

        public static Builder newBuilder(NoDistrubModeState noDistrubModeState) {
            return DEFAULT_INSTANCE.createBuilder(noDistrubModeState);
        }

        public static NoDistrubModeState parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (NoDistrubModeState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static NoDistrubModeState parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static NoDistrubModeState parseFrom(ByteString byteString) {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NoDistrubModeState parseFrom(ByteString byteString, t tVar) {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static NoDistrubModeState parseFrom(byte[] bArr) {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NoDistrubModeState parseFrom(byte[] bArr, t tVar) {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static NoDistrubModeState parseFrom(InputStream inputStream) {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NoDistrubModeState parseFrom(InputStream inputStream, t tVar) {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static NoDistrubModeState parseFrom(j jVar) {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static NoDistrubModeState parseFrom(j jVar, t tVar) {
            return (NoDistrubModeState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface NoDistrubModeStateOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class SwitchTimeSlot extends GeneratedMessageLite<SwitchTimeSlot, Builder> implements SwitchTimeSlotOrBuilder {
        private static final SwitchTimeSlot DEFAULT_INSTANCE;
        public static final int ENDHOUR_FIELD_NUMBER = 3;
        public static final int ENDMIN_FIELD_NUMBER = 5;
        private static volatile vkh<SwitchTimeSlot> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<SwitchTimeSlot, Builder> implements SwitchTimeSlotOrBuilder {
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

            public Builder setEndHour(int i) {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).setEndHour(i);
                return this;
            }

            public Builder setEndMin(int i) {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).setEndMin(i);
                return this;
            }

            public Builder setStartHour(int i) {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).setStartHour(i);
                return this;
            }

            public Builder setStartMin(int i) {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).setStartMin(i);
                return this;
            }

            public Builder setSwitchFlag(int i) {
                copyOnWrite();
                ((SwitchTimeSlot) this.instance).setSwitchFlag(i);
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

        public static SwitchTimeSlot parseDelimitedFrom(InputStream inputStream) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwitchTimeSlot parseFrom(ByteBuffer byteBuffer) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<SwitchTimeSlot> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndHour(int i) {
            this.bitField0_ |= 4;
            this.endHour_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndMin(int i) {
            this.bitField0_ |= 16;
            this.endMin_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartHour(int i) {
            this.bitField0_ |= 2;
            this.startHour_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartMin(int i) {
            this.bitField0_ |= 8;
            this.startMin_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwitchFlag(int i) {
            this.bitField0_ |= 1;
            this.switchFlag_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SwitchTimeSlot();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᔋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"bitField0_", "switchFlag_", "startHour_", "endHour_", "startMin_", "endMin_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<SwitchTimeSlot> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (SwitchTimeSlot.class) {
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

        public static Builder newBuilder(SwitchTimeSlot switchTimeSlot) {
            return DEFAULT_INSTANCE.createBuilder(switchTimeSlot);
        }

        public static SwitchTimeSlot parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SwitchTimeSlot parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static SwitchTimeSlot parseFrom(ByteString byteString) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SwitchTimeSlot parseFrom(ByteString byteString, t tVar) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static SwitchTimeSlot parseFrom(byte[] bArr) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SwitchTimeSlot parseFrom(byte[] bArr, t tVar) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static SwitchTimeSlot parseFrom(InputStream inputStream) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SwitchTimeSlot parseFrom(InputStream inputStream, t tVar) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static SwitchTimeSlot parseFrom(j jVar) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static SwitchTimeSlot parseFrom(j jVar, t tVar) {
            return (SwitchTimeSlot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface SwitchTimeSlotOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class WatchFaceEditor extends GeneratedMessageLite<WatchFaceEditor, Builder> implements WatchFaceEditorOrBuilder {
        private static final WatchFaceEditor DEFAULT_INSTANCE;
        private static volatile vkh<WatchFaceEditor> PARSER = null;
        public static final int WATCHFACEEDITIDS_FIELD_NUMBER = 2;
        public static final int WATCHFACEID_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private d0.g watchFaceEditIds_ = GeneratedMessageLite.emptyIntList();
        private int watchFaceId_;

        public static final class Builder extends GeneratedMessageLite.a<WatchFaceEditor, Builder> implements WatchFaceEditorOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllWatchFaceEditIds(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((WatchFaceEditor) this.instance).addAllWatchFaceEditIds(iterable);
                return this;
            }

            public Builder addWatchFaceEditIds(int i) {
                copyOnWrite();
                ((WatchFaceEditor) this.instance).addWatchFaceEditIds(i);
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
            public int getWatchFaceEditIds(int i) {
                return ((WatchFaceEditor) this.instance).getWatchFaceEditIds(i);
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

            public Builder setWatchFaceEditIds(int i, int i2) {
                copyOnWrite();
                ((WatchFaceEditor) this.instance).setWatchFaceEditIds(i, i2);
                return this;
            }

            public Builder setWatchFaceId(int i) {
                copyOnWrite();
                ((WatchFaceEditor) this.instance).setWatchFaceId(i);
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
        public void addAllWatchFaceEditIds(Iterable<? extends Integer> iterable) {
            ensureWatchFaceEditIdsIsMutable();
            b.addAll((Iterable) iterable, (List) this.watchFaceEditIds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWatchFaceEditIds(int i) {
            ensureWatchFaceEditIdsIsMutable();
            this.watchFaceEditIds_.Q(i);
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
            d0.g gVar = this.watchFaceEditIds_;
            if (gVar.c()) {
                return;
            }
            this.watchFaceEditIds_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static WatchFaceEditor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WatchFaceEditor parseDelimitedFrom(InputStream inputStream) {
            return (WatchFaceEditor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WatchFaceEditor parseFrom(ByteBuffer byteBuffer) {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<WatchFaceEditor> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchFaceEditIds(int i, int i2) {
            ensureWatchFaceEditIdsIsMutable();
            this.watchFaceEditIds_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchFaceId(int i) {
            this.bitField0_ |= 1;
            this.watchFaceId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new WatchFaceEditor();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔋ\u0000\u0002\u001d", new Object[]{"bitField0_", "watchFaceId_", "watchFaceEditIds_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<WatchFaceEditor> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (WatchFaceEditor.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.ComoSettingUpload.WatchFaceEditorOrBuilder
        public int getWatchFaceEditIds(int i) {
            return this.watchFaceEditIds_.getInt(i);
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

        public static Builder newBuilder(WatchFaceEditor watchFaceEditor) {
            return DEFAULT_INSTANCE.createBuilder(watchFaceEditor);
        }

        public static WatchFaceEditor parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (WatchFaceEditor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static WatchFaceEditor parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static WatchFaceEditor parseFrom(ByteString byteString) {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WatchFaceEditor parseFrom(ByteString byteString, t tVar) {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static WatchFaceEditor parseFrom(byte[] bArr) {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WatchFaceEditor parseFrom(byte[] bArr, t tVar) {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static WatchFaceEditor parseFrom(InputStream inputStream) {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WatchFaceEditor parseFrom(InputStream inputStream, t tVar) {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static WatchFaceEditor parseFrom(j jVar) {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static WatchFaceEditor parseFrom(j jVar, t tVar) {
            return (WatchFaceEditor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface WatchFaceEditorOrBuilder extends bsf {
        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getWatchFaceEditIds(int i);

        int getWatchFaceEditIdsCount();

        List<Integer> getWatchFaceEditIdsList();

        int getWatchFaceId();

        boolean hasWatchFaceId();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private ComoSettingUpload() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
