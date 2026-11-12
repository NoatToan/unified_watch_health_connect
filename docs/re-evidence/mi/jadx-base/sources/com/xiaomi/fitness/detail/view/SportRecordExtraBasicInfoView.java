package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.recycler.SportBasicInfoItemDecoration;
import com.xiaomi.fitness.detail.recycler.SportDetailAdapter;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.rz5;
import defpackage.sod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportRecordExtraBasicInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "initRecycler", "()V", "", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "dataList", "bindData", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter;", "mDetailAdapter", "Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter;", "", "Lrz5;", "mDetailList", "Ljava/util/List;", "Lsod;", "binding", "Lsod;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerSportInfo", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportRecordExtraBasicInfoView extends ConstraintLayout {

    @NotNull
    private final sod binding;
    private SportDetailAdapter mDetailAdapter;
    private List<rz5> mDetailList;

    @NotNull
    private RecyclerView recyclerSportInfo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRecordExtraBasicInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initRecycler() {
        this.mDetailList = new ArrayList();
        this.recyclerSportInfo.setLayoutManager(new GridLayoutManager(getContext(), 2));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        List<rz5> list = this.mDetailList;
        SportDetailAdapter sportDetailAdapter = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
            list = null;
        }
        SportDetailAdapter sportDetailAdapter2 = new SportDetailAdapter(context, list, ivi.B0, 2);
        this.mDetailAdapter = sportDetailAdapter2;
        sportDetailAdapter2.setItemPosition(1);
        this.recyclerSportInfo.addItemDecoration(new SportBasicInfoItemDecoration());
        RecyclerView recyclerView = this.recyclerSportInfo;
        SportDetailAdapter sportDetailAdapter3 = this.mDetailAdapter;
        if (sportDetailAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailAdapter");
        } else {
            sportDetailAdapter = sportDetailAdapter3;
        }
        recyclerView.setAdapter(sportDetailAdapter);
    }

    public final void bindData(@NotNull List<BasicItemInfo> dataList) {
        String string;
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        if (!dataList.isEmpty()) {
            List<rz5> list = this.mDetailList;
            SportDetailAdapter sportDetailAdapter = null;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
                list = null;
            }
            if (list.size() > 0) {
                List<rz5> list2 = this.mDetailList;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
                    list2 = null;
                }
                list2.clear();
            }
            for (BasicItemInfo basicItemInfo : dataList) {
                rz5 rz5Var = new rz5();
                String pluralTitle = basicItemInfo.getPluralTitle();
                if (pluralTitle == null || pluralTitle.length() == 0) {
                    string = getContext().getString(basicItemInfo.getTitle());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                } else {
                    string = basicItemInfo.getPluralTitle();
                }
                if (!TextUtils.isEmpty(basicItemInfo.getUnit())) {
                    string = getContext().getString(j1j.O3, string, basicItemInfo.getUnit());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                rz5Var.f33082b = string;
                rz5Var.d = basicItemInfo.getData();
                List<rz5> list3 = this.mDetailList;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
                    list3 = null;
                }
                list3.add(rz5Var);
            }
            SportDetailAdapter sportDetailAdapter2 = this.mDetailAdapter;
            if (sportDetailAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailAdapter");
            } else {
                sportDetailAdapter = sportDetailAdapter2;
            }
            sportDetailAdapter.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRecordExtraBasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportRecordExtraBasicInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRecordExtraBasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        sod sodVarA0 = sod.A0(LayoutInflater.from(context), this, true);
        this.binding = sodVarA0;
        this.recyclerSportInfo = sodVarA0.A;
        sodVarA0.B.bindData(hoi.k0, context.getString(j1j.v4));
        initRecycler();
    }
}
