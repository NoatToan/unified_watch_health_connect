package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lck;", "Lsi;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/v2/SettingsLanguageV2;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ck implements si<SettingsLanguageV2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f5413a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lck$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public IPrimaryData a(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return si.a.a(this, byteBuffer, z, i);
    }

    @Nullable
    public SettingsLanguageV2 a(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        SettingsLanguageV2 settingsLanguageV2 = new SettingsLanguageV2();
        settingsLanguageV2.setGroupVersion(groupVersion);
        boolean zL = z2.l(byteBuffer);
        int iW = z2.w(byteBuffer);
        for (int i = 0; i < iW; i++) {
            byte b2 = byteBuffer.get();
            SettingsLanguageV2.Companion companion = SettingsLanguageV2.INSTANCE;
            if (b2 == companion.a()) {
                EnumData enumDataA = fs.a(byteBuffer, "language", zL);
                if (enumDataA == null) {
                    return null;
                }
                settingsLanguageV2.setLanguage(enumDataA);
            } else if (b2 == companion.b()) {
                BooleanData booleanDataA = fs.a(byteBuffer, "languageFollowMobilePhoneSwitch");
                if (booleanDataA == null) {
                    return null;
                }
                settingsLanguageV2.setLanguageFollowMobilePhoneSwitch(Boolean.valueOf(booleanDataA.getValue()));
            } else {
                IPrimaryData iPrimaryDataA = a(byteBuffer, zL, b2);
                t5t.d("LanguageV2Parser", "[WARNING] parseLanguageV2 unknown key: " + ((int) b2) + ", position: " + byteBuffer.position() + ", parsed: " + iPrimaryDataA);
                if (iPrimaryDataA == null) {
                    return null;
                }
            }
        }
        return settingsLanguageV2;
    }
}
