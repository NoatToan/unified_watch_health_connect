package com.xiaomi.fitness.device.manager.ui.tab;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabPagerAdapter;", "Landroidx/fragment/app/i;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "(I)Landroidx/fragment/app/Fragment;", "getCount", "()I", "", "object", "getItemPosition", "(Ljava/lang/Object;)I", "", "Lcom/xiaomi/fitness/device/manager/export/DeviceTabInfoProvider;", "providers", "Ljava/util/List;", "getProviders", "()Ljava/util/List;", "setProviders", "(Ljava/util/List;)V", "Landroidx/fragment/app/FragmentManager;", "manager", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceTabPagerAdapter extends i {

    @NotNull
    private List<? extends DeviceTabInfoProvider> providers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceTabPagerAdapter(@NotNull FragmentManager manager, @NotNull List<? extends DeviceTabInfoProvider> providers) {
        super(manager);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.providers = providers;
    }

    @Override // defpackage.eih
    public int getCount() {
        return this.providers.size();
    }

    @Override // androidx.fragment.app.i
    @NotNull
    public Fragment getItem(int position) {
        Object obj = this.providers.get(position);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        return (Fragment) obj;
    }

    @Override // defpackage.eih
    public int getItemPosition(@NotNull Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        int iIndexOf = this.providers.indexOf((DeviceTabInfoProvider) object);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -2;
    }

    @NotNull
    public final List<DeviceTabInfoProvider> getProviders() {
        return this.providers;
    }

    public final void setProviders(@NotNull List<? extends DeviceTabInfoProvider> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.providers = list;
    }
}
