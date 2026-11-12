package com.xiaomi.xms.wearable.ui.appshop;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.iaa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/ThirdAppFragmentAdapter;", "Liaa;", "", "getCount", "()I", "position", "Landroidx/fragment/app/Fragment;", "getItem", "(I)Landroidx/fragment/app/Fragment;", "", "fragments", "Ljava/util/List;", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
public final class ThirdAppFragmentAdapter extends iaa {

    @NotNull
    private final List<Fragment> fragments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThirdAppFragmentAdapter(@NotNull FragmentManager fm, @NotNull List<? extends Fragment> fragments) {
        super(fm);
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        this.fragments = fragments;
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
}
