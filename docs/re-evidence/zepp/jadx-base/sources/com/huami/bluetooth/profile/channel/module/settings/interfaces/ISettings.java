package com.huami.bluetooth.profile.channel.module.settings.interfaces;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsParserKt;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 #2\u00020\u0001:\u0001#J7\u0010\b\u001a\u00020\u00072\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJK\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&J4\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\"\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H\u0016R\u001c\u0010\"\u001a\u00020\u001d8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/ISettings;", "", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "setting", "", "writeSetting", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needDesc", "", "groupType", "querySettings", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "fieldList", "queryField", "(ZLcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", Constant.h, "parseSettings", "Ljava/nio/ByteBuffer;", "byteBuffer", "settings", "", "parse", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;", "getBleProvider", "()Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;", "setBleProvider", "(Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;)V", "bleProvider", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ISettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/ISettings$Companion;", "", "", "b", "Ljava/lang/String;", "TAG", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final String TAG = "ISettings";

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void parse(@NotNull ISettings iSettings, @NotNull ByteBuffer byteBuffer, @NotNull HashMap<SettingsGroupType, Settings> map) {
            Settings general;
            SettingsGroupType settingsGroupTypeFromValue = SettingsGroupType.INSTANCE.fromValue(byteBuffer.get());
            if (settingsGroupTypeFromValue == null) {
                Debug.fi("ISettings", "group type null");
                return;
            }
            switch (WhenMappings.$EnumSwitchMapping$0[settingsGroupTypeFromValue.ordinal()]) {
                case 1:
                    general = SettingsParserKt.parseGeneral(byteBuffer);
                    break;
                case 2:
                    general = SettingsParserKt.parseSport(byteBuffer);
                    break;
                case 3:
                    general = SettingsParserKt.parseHealth(byteBuffer);
                    break;
                case 4:
                    general = SettingsParserKt.parseDeviceInformation(byteBuffer);
                    break;
                case 5:
                    general = SettingsParserKt.parseConnection(byteBuffer);
                    break;
                case 6:
                    general = SettingsParserKt.parseDisplayAndBrightness(byteBuffer);
                    break;
                case 7:
                    general = SettingsParserKt.parseSoundAndVibrate(byteBuffer);
                    break;
                case 8:
                    general = SettingsParserKt.parseScreenLockAndPassword(byteBuffer);
                    break;
                case 9:
                    general = SettingsParserKt.parseWearingWay(byteBuffer);
                    break;
                case 10:
                    general = SettingsParserKt.parseOfflineVoice(byteBuffer);
                    break;
                case 11:
                    general = SettingsParserKt.parseLanguage(byteBuffer);
                    break;
                default:
                    general = null;
                    break;
            }
            if (general == null) {
                return;
            }
            general.checkValid();
            map.put(settingsGroupTypeFromValue, general);
        }

        public static /* synthetic */ Object queryField$default(ISettings iSettings, boolean z, SettingsGroupType settingsGroupType, ArrayList arrayList, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryField");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return iSettings.queryField(z, settingsGroupType, arrayList, continuation);
        }

        public static /* synthetic */ Object querySettings$default(ISettings iSettings, boolean z, SettingsGroupType[] settingsGroupTypeArr, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: querySettings");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return iSettings.querySettings(z, settingsGroupTypeArr, continuation);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingsGroupType.values().length];
            iArr[SettingsGroupType.GENERAL.ordinal()] = 1;
            iArr[SettingsGroupType.SPORT.ordinal()] = 2;
            iArr[SettingsGroupType.HEALTH.ordinal()] = 3;
            iArr[SettingsGroupType.DEVICE_INFORMATION.ordinal()] = 4;
            iArr[SettingsGroupType.CONNECTION.ordinal()] = 5;
            iArr[SettingsGroupType.DISPLAY.ordinal()] = 6;
            iArr[SettingsGroupType.SOUND_AND_VIBRATION.ordinal()] = 7;
            iArr[SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD.ordinal()] = 8;
            iArr[SettingsGroupType.WEARING.ordinal()] = 9;
            iArr[SettingsGroupType.OFFLINE_VOICE.ordinal()] = 10;
            iArr[SettingsGroupType.LANGUAGE.ordinal()] = 11;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    BleProvider getBleProvider();

    void parse(@NotNull ByteBuffer byteBuffer, @NotNull HashMap<SettingsGroupType, Settings> settings);

    @Nullable
    HashMap<SettingsGroupType, Settings> parseSettings(@Nullable byte[] cmd);

    @Nullable
    Object queryField(boolean z, @NotNull SettingsGroupType settingsGroupType, @NotNull ArrayList<Integer> arrayList, @NotNull Continuation<? super Settings> continuation);

    @Nullable
    Object querySettings(boolean z, @NotNull SettingsGroupType[] settingsGroupTypeArr, @NotNull Continuation<? super HashMap<SettingsGroupType, Settings>> continuation);

    void setBleProvider(@NotNull BleProvider bleProvider);

    @Nullable
    Object writeSetting(@NotNull HashMap<SettingsGroupType, Settings> map, @NotNull Continuation<? super Boolean> continuation);
}
