package com.xiaomi.fitness.rn.share.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import defpackage.iaa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/rn/share/adapter/DeviceShareAdapter;", "Liaa;", "", "getCount", "()I", "position", "Landroidx/fragment/app/Fragment;", "getItem", "(I)Landroidx/fragment/app/Fragment;", "", "fragments", "Ljava/util/List;", "", "", "titles", "getTitles", "()Ljava/util/List;", "Landroidx/fragment/app/FragmentManager;", "fm", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;Ljava/util/List;Ljava/util/List;)V", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceShareAdapter extends iaa {

    @NotNull
    private final List<Fragment> fragments;

    @NotNull
    private final List<String> titles;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceShareAdapter(@NotNull FragmentManager fm, @NotNull Lifecycle lifecycle, @NotNull List<? extends Fragment> fragments, @NotNull List<String> titles) {
        super(fm);
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        Intrinsics.checkNotNullParameter(titles, "titles");
        this.fragments = fragments;
        this.titles = titles;
    }

    @Override // defpackage.eih
    public int getCount() {
        return this.fragments.size();
    }

    @Override // defpackage.iaa
    @NotNull
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @NotNull
    public final List<String> getTitles() {
        return this.titles;
    }
}
