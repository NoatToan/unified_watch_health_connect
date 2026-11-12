package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J7\u0010\b\u001a\u00020\u00072\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJK\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\rJ?\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0012J2\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lyi;", "", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "setting", "", PluginDeviceInfo.FMODEL, "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needDesc", "", "groupType", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "fieldList", "(ZLcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cmd", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface yi {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static void a(@NotNull yi yiVar, @NotNull ByteBuffer byteBuffer, @NotNull HashMap<SettingsGroupType, Settings> settings) {
            Settings settingsD;
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
            Intrinsics.checkNotNullParameter(settings, "settings");
            SettingsGroupType settingsGroupTypeA = SettingsGroupType.INSTANCE.a(byteBuffer.get());
            if (settingsGroupTypeA == null) {
                t5t.d("ISettings", "group type null");
                return;
            }
            switch (b.f40198a[settingsGroupTypeA.ordinal()]) {
                case 1:
                    settingsD = fs.d(byteBuffer);
                    break;
                case 2:
                    settingsD = fs.j(byteBuffer);
                    break;
                case 3:
                    settingsD = fs.e(byteBuffer);
                    break;
                case 4:
                    settingsD = fs.b(byteBuffer);
                    break;
                case 5:
                    settingsD = fs.a(byteBuffer);
                    break;
                case 6:
                    settingsD = fs.c(byteBuffer);
                    break;
                case 7:
                    settingsD = fs.i(byteBuffer);
                    break;
                case 8:
                    settingsD = fs.h(byteBuffer);
                    break;
                case 9:
                    settingsD = fs.k(byteBuffer);
                    break;
                case 10:
                    settingsD = fs.g(byteBuffer);
                    break;
                case 11:
                    settingsD = fs.f(byteBuffer);
                    break;
                default:
                    settingsD = null;
                    break;
            }
            if (settingsD != null) {
                settingsD.checkValid();
                settings.put(settingsGroupTypeA, settingsD);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40198a;

        static {
            int[] iArr = new int[SettingsGroupType.values().length];
            try {
                iArr[SettingsGroupType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingsGroupType.SPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SettingsGroupType.HEALTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SettingsGroupType.DEVICE_INFORMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SettingsGroupType.CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SettingsGroupType.DISPLAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SettingsGroupType.SOUND_AND_VIBRATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SettingsGroupType.WEARING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SettingsGroupType.OFFLINE_VOICE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SettingsGroupType.LANGUAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f40198a = iArr;
        }
    }

    @Nullable
    Object a(@NotNull HashMap<SettingsGroupType, Settings> map, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object a(boolean z, @NotNull SettingsGroupType settingsGroupType, @NotNull ArrayList<Integer> arrayList, @NotNull Continuation<? super Settings> continuation);

    @Nullable
    Object a(boolean z, @NotNull SettingsGroupType[] settingsGroupTypeArr, @NotNull Continuation<? super HashMap<SettingsGroupType, Settings>> continuation);

    @Nullable
    HashMap<SettingsGroupType, Settings> a(@Nullable byte[] cmd);
}
