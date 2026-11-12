package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lis;", "", "", "toString", "", "hashCode", "other", "", "equals", "protocolVersion", "I", PluginDeviceInfo.FDESC, "()I", "setProtocolVersion", "(I)V", "", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupList", "Ljava/util/List;", PluginDeviceInfo.FMODEL, "()Ljava/util/List;", "setGroupList", "(Ljava/util/List;)V", FitnessReportKey.groupCount, "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f22031b;

    @Nullable
    public List<? extends SettingsGroupType> c;

    public is() {
        this(0, null, null, 7, null);
    }

    @Nullable
    public final List<SettingsGroupType> a() {
        return this.c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF22030a() {
        return this.f22030a;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof is)) {
            return false;
        }
        is isVar = (is) other;
        return this.f22030a == isVar.f22030a && Intrinsics.areEqual(this.f22031b, isVar.f22031b) && Intrinsics.areEqual(this.c, isVar.c);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f22030a) * 31;
        Integer num = this.f22031b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<? extends SettingsGroupType> list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SettingsVersion [protocolVersion: " + this.f22030a + ", groupCount: " + this.f22031b + ", groupList: " + this.c;
    }

    public is(int i, @Nullable Integer num, @Nullable List<? extends SettingsGroupType> list) {
        this.f22030a = i;
        this.f22031b = num;
        this.c = list;
    }

    public /* synthetic */ is(int i, Integer num, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : list);
    }
}
