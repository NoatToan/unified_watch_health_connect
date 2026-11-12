package com.xiaomi.fitness.health.threetarget.adpter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.iaa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/adpter/ShareSportTargetTabAdapter;", "Liaa;", "", "getCount", "()I", "position", "Landroidx/fragment/app/Fragment;", "getItem", "(I)Landroidx/fragment/app/Fragment;", "", "fragmentList", "Ljava/util/List;", "getFragmentList", "()Ljava/util/List;", "setFragmentList", "(Ljava/util/List;)V", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ShareSportTargetTabAdapter extends iaa {

    @NotNull
    private List<? extends Fragment> fragmentList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSportTargetTabAdapter(@Nullable FragmentManager fragmentManager, @NotNull List<? extends Fragment> fragmentList) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentList, "fragmentList");
        Intrinsics.checkNotNull(fragmentManager);
        this.fragmentList = fragmentList;
    }

    @Override // defpackage.eih
    public int getCount() {
        return this.fragmentList.size();
    }

    @NotNull
    public final List<Fragment> getFragmentList() {
        return this.fragmentList;
    }

    @Override // defpackage.iaa
    @NotNull
    public Fragment getItem(int position) {
        return this.fragmentList.get(position);
    }

    public final void setFragmentList(@NotNull List<? extends Fragment> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.fragmentList = list;
    }
}
