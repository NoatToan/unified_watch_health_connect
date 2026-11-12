package defpackage;

import com.google.android.gms.common.Scopes;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0000B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0000\u0010\u0007¨\u0006\n"}, d2 = {"La;", "", "Lx7t;", Scopes.PROFILE, "Lg4s;", "deviceInfo", "", "(Lx7t;Lg4s;)V", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0000a f450a = new C0000a(null);

    /* JADX INFO: renamed from: a$a, reason: collision with other inner class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"La$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class C0000a {
        public C0000a() {
        }

        public /* synthetic */ C0000a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void a(@NotNull x7t profile, @Nullable g4s deviceInfo) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Feature featureA = deviceInfo != null ? deviceInfo.A() : null;
        if (featureA == null) {
            return;
        }
        SettingsModule settingsModule = (SettingsModule) profile.i1(SettingsModule.class);
        if (settingsModule == null) {
            t5t.d("AGpsFeatureInit", "initAGpsFeature settingsModule null");
            return;
        }
        List<SettingsGroupType> currentGroups = settingsModule.getCurrentGroups();
        if (currentGroups != null) {
            SettingsGroupType settingsGroupType = SettingsGroupType.DEVICE_INFORMATION;
            if (currentGroups.contains(settingsGroupType)) {
                Settings settingsQueryFieldsSync = settingsModule.queryFieldsSync(false, settingsGroupType, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(c7.F)));
                c7 c7Var = settingsQueryFieldsSync instanceof c7 ? (c7) settingsQueryFieldsSync : null;
                if (c7Var == null) {
                    t5t.d("AGpsFeatureInit", "initAGpsFeature query null");
                    return;
                }
                b bVar = new b(c7Var.n());
                t5t.d("AGpsFeatureInit", "epo: " + bVar.a() + ", glonassAlmanac: " + bVar.b() + ",sonyLLE: " + bVar.c());
                if (bVar.a()) {
                    featureA.setSw(37);
                }
                if (bVar.b()) {
                    featureA.setSw(8);
                }
                if (bVar.c()) {
                    featureA.setSw(22);
                }
            }
        }
    }
}
