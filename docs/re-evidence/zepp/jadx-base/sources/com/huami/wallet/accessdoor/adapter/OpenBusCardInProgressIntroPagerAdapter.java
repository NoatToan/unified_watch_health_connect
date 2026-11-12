package com.huami.wallet.accessdoor.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.entity.IntroPagerData;
import com.huami.wallet.common.helper.ViewExtensionKt;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/wallet/accessdoor/adapter/OpenBusCardInProgressIntroPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "", "Lcom/huami/wallet/accessdoor/entity/IntroPagerData;", "dataList", "", "update", "", "getCount", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "object", "", "isViewFromObject", "Landroid/view/ViewGroup;", "container", "position", "instantiateItem", "destroyItem", "getItemPosition", "a", "Ljava/util/List;", "pagerDataList", "<init>", "(Ljava/util/List;)V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class OpenBusCardInProgressIntroPagerAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private List<? extends IntroPagerData> pagerDataList;

    public OpenBusCardInProgressIntroPagerAdapter(@Nullable List<? extends IntroPagerData> list) {
        this.pagerDataList = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        container.removeView((View) object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<? extends IntroPagerData> list = this.pagerDataList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NotNull Object object) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int position) {
        View viewInflate = LayoutInflater.from(container.getContext()).inflate(R.layout.wl_item_open_bus_card_intro, container, false);
        container.addView(viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.intro_image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.intro_text);
        IntroPagerData introPagerData = this.pagerDataList.get(position);
        textView.setText(introPagerData.introText);
        ViewExtensionKt.loadImage$default(imageView, introPagerData.introImageUrl, 0, 2, null);
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        return view == object;
    }

    public final void update(@NotNull List<? extends IntroPagerData> dataList) {
        this.pagerDataList = dataList;
        notifyDataSetChanged();
    }
}
