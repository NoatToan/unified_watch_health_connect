package com.huami.training.ui.entrance;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.training.ext.ImageViewExKt;
import com.huami.training.ui.entrance.EntranceBannerPagerAdapter;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.vo.EntranceSubjectVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rR\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/training/ui/entrance/EntranceBannerPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "", "Lcom/huami/training/vo/EntranceSubjectVo;", "newData", "", "setNewData", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "object", "", "isViewFromObject", "", "getCount", "Landroid/view/ViewGroup;", "container", "position", "instantiateItem", "destroyItem", "getItem", "", "a", "Ljava/util/List;", "dataList", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "itemClickListener", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class EntranceBannerPagerAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<EntranceSubjectVo> dataList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function1<? super EntranceSubjectVo, Unit> itemClickListener;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(EntranceSubjectVo entranceSubjectVo, int i, EntranceBannerPagerAdapter entranceBannerPagerAdapter, View view) {
        if (entranceSubjectVo.getTrainingType() == null) {
            AnalyticsHelper.INSTANCE.countBannerHot(entranceSubjectVo.getId(), i, true);
        } else {
            AnalyticsHelper.INSTANCE.countBannerHot(String.valueOf(entranceSubjectVo.getTrainingId()), i, false);
        }
        Function1<EntranceSubjectVo, Unit> itemClickListener = entranceBannerPagerAdapter.getItemClickListener();
        if (itemClickListener == null) {
            return;
        }
        itemClickListener.invoke(entranceSubjectVo);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        container.removeView((View) object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: getCount */
    public int getPagerCount() {
        return this.dataList.size();
    }

    @NotNull
    public final EntranceSubjectVo getItem(int position) {
        return this.dataList.get(position);
    }

    @Nullable
    public final Function1<EntranceSubjectVo, Unit> getItemClickListener() {
        return this.itemClickListener;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, final int position) {
        final EntranceSubjectVo entranceSubjectVo = this.dataList.get(position);
        ImageView imageView = new ImageView(container.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageViewExKt.loadUrl(imageView, entranceSubjectVo.getImageUrl());
        imageView.setOnClickListener(new View.OnClickListener() { // from class: em1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EntranceBannerPagerAdapter.b(entranceSubjectVo, position, this, view);
            }
        });
        container.addView(imageView);
        return imageView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        return Intrinsics.areEqual(view, object);
    }

    public final void setItemClickListener(@Nullable Function1<? super EntranceSubjectVo, Unit> function1) {
        this.itemClickListener = function1;
    }

    public final void setNewData(@Nullable List<EntranceSubjectVo> newData) {
        this.dataList.clear();
        if (newData != null) {
            this.dataList.addAll(newData);
        }
        notifyDataSetChanged();
    }
}
