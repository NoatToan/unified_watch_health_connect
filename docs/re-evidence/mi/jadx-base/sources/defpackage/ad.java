package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.entity.CardInfo;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u001f\u0010\u0005\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\f¨\u0006\u000f"}, d2 = {"Lad;", "", "Lh4;", CardInfo.KEY_OWNER, "", PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", RnReportConst.ApiReport.PARAM_MODULE, "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "", "version", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;)Ljava/lang/Integer;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ad f888a = new ad();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final HashMap<Integer, HashMap<SettingsGroupType, Integer>> f889b = new HashMap<>();

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num) {
            super(0);
            this.t = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("module null: ");
            sb.append(this.t == null);
            return sb.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HashMap<SettingsGroupType, Integer> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HashMap<SettingsGroupType, Integer> map) {
            super(0);
            this.t = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("versionMap null: ");
            sb.append(this.t == null);
            return sb.toString();
        }
    }

    public final void a(@NotNull h4 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        SettingsModule settingsModule = (SettingsModule) f4.c.a(owner).a(SettingsModule.class);
        Integer numValueOf = settingsModule != null ? Integer.valueOf(settingsModule.hashCode()) : null;
        le.c("GroupVersionCache", new a(numValueOf));
        if (numValueOf != null) {
            f889b.remove(numValueOf);
        }
    }

    public final void a(@NotNull SettingsModule module, @NotNull SettingsGroupType groupType, int version) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        int iHashCode = module.hashCode();
        HashMap<Integer, HashMap<SettingsGroupType, Integer>> map = f889b;
        if (map.get(Integer.valueOf(iHashCode)) == null) {
            map.put(Integer.valueOf(iHashCode), new HashMap<>());
        }
        HashMap<SettingsGroupType, Integer> map2 = map.get(Integer.valueOf(iHashCode));
        if (map2 != null) {
            map2.put(groupType, Integer.valueOf(version));
        }
    }

    @Nullable
    public final Integer a(@NotNull SettingsModule module, @NotNull SettingsGroupType groupType) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        HashMap<SettingsGroupType, Integer> map = f889b.get(Integer.valueOf(module.hashCode()));
        le.c("GroupVersionCache", new b(map));
        if (map != null) {
            return map.get(groupType);
        }
        return null;
    }
}
