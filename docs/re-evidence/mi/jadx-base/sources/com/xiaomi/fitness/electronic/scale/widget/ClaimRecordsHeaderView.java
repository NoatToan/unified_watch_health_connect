package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.electronic.scale.adapter.ClaimRecordWeekAdapter;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import defpackage.bri;
import defpackage.gui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0014\u0010\u0019\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\nR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/ClaimRecordsHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mRvWeekList", "Lcom/xiaomi/fitness/electronic/scale/widget/ClaimRecordsWeekRecyclerView;", "mMoreTv", "Landroid/widget/TextView;", "mWeekTv", "mClaimRecordWeekAdapter", "Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordWeekAdapter;", "initView", "", "initData", "mClaimRecords", "", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "updateData", "setCheckChangedListener", "checkedChangedListener", "Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordWeekAdapter$OnCheckedChangedListener;", "getCheckList", "setMoreVisible", "visibility", "setWeekVisible", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClaimRecordsHeaderView extends LinearLayout {

    @Nullable
    private ClaimRecordWeekAdapter mClaimRecordWeekAdapter;
    private TextView mMoreTv;
    private ClaimRecordsWeekRecyclerView mRvWeekList;
    private TextView mWeekTv;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClaimRecordsHeaderView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        View viewInflate = LayoutInflater.from(context).inflate(gui.f, this);
        this.mRvWeekList = (ClaimRecordsWeekRecyclerView) viewInflate.findViewById(bri.V6);
        this.mWeekTv = (TextView) viewInflate.findViewById(bri.V5);
        this.mMoreTv = (TextView) viewInflate.findViewById(bri.Y4);
    }

    @NotNull
    public final List<ClaimRecord> getCheckList() {
        ArrayList arrayList = new ArrayList();
        ClaimRecordWeekAdapter claimRecordWeekAdapter = this.mClaimRecordWeekAdapter;
        if (claimRecordWeekAdapter != null) {
            for (ClaimRecord claimRecord : claimRecordWeekAdapter.getClaimRecords()) {
                if (claimRecord.getIsChecked()) {
                    arrayList.add(claimRecord);
                }
            }
        }
        return arrayList;
    }

    public final void initData(@NotNull List<ClaimRecord> mClaimRecords) {
        Intrinsics.checkNotNullParameter(mClaimRecords, "mClaimRecords");
        ClaimRecordsWeekRecyclerView claimRecordsWeekRecyclerView = this.mRvWeekList;
        ClaimRecordsWeekRecyclerView claimRecordsWeekRecyclerView2 = null;
        if (claimRecordsWeekRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvWeekList");
            claimRecordsWeekRecyclerView = null;
        }
        claimRecordsWeekRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.mClaimRecordWeekAdapter = new ClaimRecordWeekAdapter(mClaimRecords);
        ClaimRecordsWeekRecyclerView claimRecordsWeekRecyclerView3 = this.mRvWeekList;
        if (claimRecordsWeekRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvWeekList");
        } else {
            claimRecordsWeekRecyclerView2 = claimRecordsWeekRecyclerView3;
        }
        claimRecordsWeekRecyclerView2.setAdapter(this.mClaimRecordWeekAdapter);
    }

    public final void setCheckChangedListener(@NotNull ClaimRecordWeekAdapter.OnCheckedChangedListener checkedChangedListener) {
        Intrinsics.checkNotNullParameter(checkedChangedListener, "checkedChangedListener");
        ClaimRecordWeekAdapter claimRecordWeekAdapter = this.mClaimRecordWeekAdapter;
        if (claimRecordWeekAdapter != null) {
            claimRecordWeekAdapter.setCheckChangedListener(checkedChangedListener);
        }
    }

    public final void setMoreVisible(int visibility) {
        TextView textView = this.mMoreTv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMoreTv");
            textView = null;
        }
        textView.setVisibility(visibility);
    }

    public final void setWeekVisible(int visibility) {
        TextView textView = this.mWeekTv;
        ClaimRecordsWeekRecyclerView claimRecordsWeekRecyclerView = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWeekTv");
            textView = null;
        }
        textView.setVisibility(visibility);
        ClaimRecordsWeekRecyclerView claimRecordsWeekRecyclerView2 = this.mRvWeekList;
        if (claimRecordsWeekRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRvWeekList");
        } else {
            claimRecordsWeekRecyclerView = claimRecordsWeekRecyclerView2;
        }
        claimRecordsWeekRecyclerView.setVisibility(visibility);
    }

    public final void updateData(@NotNull List<ClaimRecord> mClaimRecords) {
        Intrinsics.checkNotNullParameter(mClaimRecords, "mClaimRecords");
        ClaimRecordWeekAdapter claimRecordWeekAdapter = this.mClaimRecordWeekAdapter;
        if (claimRecordWeekAdapter != null) {
            claimRecordWeekAdapter.updateData(mClaimRecords);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClaimRecordsHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimRecordsHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet, i);
    }
}
