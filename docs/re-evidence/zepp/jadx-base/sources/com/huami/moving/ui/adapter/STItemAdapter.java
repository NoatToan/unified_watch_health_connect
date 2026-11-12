package com.huami.moving.ui.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import com.huami.moving.R;
import com.huami.moving.model.StrengthTrainingAction;
import com.huami.moving.ui.adapter.STItemAdapter;
import com.huami.moving.ui.sport.detail.segment.dialog.HMWeightUtils;
import com.huami.moving.ui.sport.detail.segment.dialog.SportSegmentSettingBaseFragment;
import com.huami.moving.ui.sport.detail.segment.dialog.SportSegmentSettingCountFragment;
import com.huami.moving.ui.sport.detail.segment.dialog.SportSegmentSettingWeightFragment;
import com.huami.moving.ui.sport.detail.segment.dialog.StrengthTrainEditOption;
import com.huami.moving.ui.sport.detail.segment.dialog.StrengthTrainEditParams;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.moving.utils.StrenthTrainingUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.IconToast;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003ABCB%\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b?\u0010@J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u0010\u001d¨\u0006D"}, d2 = {"Lcom/huami/moving/ui/adapter/STItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "modifyList", "setModifyList", "getCurrentList", "addItem", "deleteItem", "dismissNotify", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Ljava/util/List;", "list", "c", LogUtil.I, "deviceSource", "Lcom/huami/moving/ui/adapter/STItemAdapter$DeleteListener;", GoogleApiAvailabilityLight.a, "Lcom/huami/moving/ui/adapter/STItemAdapter$DeleteListener;", "getDeleteListener", "()Lcom/huami/moving/ui/adapter/STItemAdapter$DeleteListener;", "setDeleteListener", "(Lcom/huami/moving/ui/adapter/STItemAdapter$DeleteListener;)V", "deleteListener", "Lcom/huami/moving/ui/adapter/STItemAdapter$NameClickListener;", "e", "Lcom/huami/moving/ui/adapter/STItemAdapter$NameClickListener;", "getNameClickListener", "()Lcom/huami/moving/ui/adapter/STItemAdapter$NameClickListener;", "setNameClickListener", "(Lcom/huami/moving/ui/adapter/STItemAdapter$NameClickListener;)V", "nameClickListener", "Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingCountFragment;", "segmentCountFragment", "Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingCountFragment;", "getSegmentCountFragment", "()Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingCountFragment;", "setSegmentCountFragment", "(Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingCountFragment;)V", "Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingWeightFragment;", "segmentWeightFragment", "Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingWeightFragment;", "getSegmentWeightFragment", "()Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingWeightFragment;", "setSegmentWeightFragment", "(Lcom/huami/moving/ui/sport/detail/segment/dialog/SportSegmentSettingWeightFragment;)V", "f", "maxValue", "<init>", "(Landroid/content/Context;Ljava/util/List;I)V", "DeleteListener", "NameClickListener", "ViewHolder", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class STItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<SportSegmentData> list;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int deviceSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private DeleteListener deleteListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private NameClickListener nameClickListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int maxValue = 999;
    public SportSegmentSettingCountFragment segmentCountFragment;
    public SportSegmentSettingWeightFragment segmentWeightFragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/moving/ui/adapter/STItemAdapter$DeleteListener;", "", "", "doDelete", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface DeleteListener {
        void doDelete();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/adapter/STItemAdapter$NameClickListener;", "", "", "position", "", "doNameClick", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface NameClickListener {
        void doNameClick(int position);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/huami/moving/ui/adapter/STItemAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "segmentData", "", "position", "", "bindData", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "ivRemove", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "tvNameValue", "c", "tvCountValue", GoogleApiAvailabilityLight.a, "tvWeightValue", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/moving/ui/adapter/STItemAdapter;Landroid/view/View;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private ImageView ivRemove;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private TextView tvNameValue;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private TextView tvCountValue;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private TextView tvWeightValue;

        public ViewHolder(View view) {
            super(view);
            this.ivRemove = (ImageView) view.findViewById(R.id.iv_remove);
            this.tvNameValue = (TextView) view.findViewById(R.id.tv_name_value);
            this.tvCountValue = (TextView) view.findViewById(R.id.tv_count_value);
            this.tvWeightValue = (TextView) view.findViewById(R.id.tv_weight_value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(STItemAdapter sTItemAdapter, int i, View view) {
            NameClickListener nameClickListener;
            if (!SportDeviceUtils.isSupportSTUpgradeCategory(sTItemAdapter.deviceSource) || (nameClickListener = sTItemAdapter.getNameClickListener()) == null) {
                return;
            }
            nameClickListener.doNameClick(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(ViewHolder viewHolder, SportSegmentData sportSegmentData, int i, STItemAdapter sTItemAdapter, Context context, View view) {
            viewHolder.tvCountValue.setBackgroundResource(R.drawable.shape_rect_s4_corner_4);
            SportSegmentSettingBaseFragment.INSTANCE.show((FragmentActivity) context, sTItemAdapter.getSegmentCountFragment(), new StrengthTrainEditOption.Builder().maxCount(sTItemAdapter.maxValue).editParams(new StrengthTrainEditParams.Builder().currentCount(sportSegmentData.getCount()).currentIndex(sportSegmentData.getIndex()).currentPosition(i).build()).build());
            sTItemAdapter.dismissNotify(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(ViewHolder viewHolder, SportSegmentData sportSegmentData, int i, STItemAdapter sTItemAdapter, Context context, View view) {
            viewHolder.tvWeightValue.setBackgroundResource(R.drawable.shape_rect_s4_corner_4);
            int weight = sportSegmentData.getWeight();
            SportSegmentSettingBaseFragment.INSTANCE.show((FragmentActivity) context, sTItemAdapter.getSegmentWeightFragment(), new StrengthTrainEditOption.Builder().maxWeight(sTItemAdapter.maxValue).editParams(new StrengthTrainEditParams.Builder().currentWeight(weight).currentUnit(sportSegmentData.getUnit()).currentIndex(sportSegmentData.getIndex()).currentPosition(i).build()).build());
            sTItemAdapter.dismissNotify(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(STItemAdapter sTItemAdapter, int i, Context context, View view) {
            if (sTItemAdapter.list.size() <= 1) {
                IconToast.showError(context, context.getString(R.string.segment_action_delete_limit_exceeded));
                return;
            }
            sTItemAdapter.deleteItem(i);
            DeleteListener deleteListener = sTItemAdapter.getDeleteListener();
            if (deleteListener == null) {
                return;
            }
            deleteListener.doDelete();
        }

        public final void bindData(@NotNull final Context context, @NotNull final SportSegmentData segmentData, final int position) {
            String strValueOf;
            TextView textView = this.tvNameValue;
            if (SportDeviceUtils.isSupportSTUpgradeCategory(STItemAdapter.this.deviceSource)) {
                List<StrengthTrainingAction> listFindStrenthTrainingByType = StrenthTrainingUtils.INSTANCE.findStrenthTrainingByType(context, Integer.valueOf(segmentData.getStrengthTrainType()));
                strValueOf = listFindStrenthTrainingByType == null || listFindStrenthTrainingByType.isEmpty() ? "--" : listFindStrenthTrainingByType.get(0).getActionName();
            } else {
                strValueOf = String.valueOf(segmentData.getIndex());
            }
            textView.setText(strValueOf);
            this.tvCountValue.setText(String.valueOf(segmentData.getCount()));
            this.tvWeightValue.setText(HMWeightUtils.INSTANCE.getWeightAndUnit(context, segmentData.getWeight(), segmentData.getUnit(), segmentData.getStrengthTrainType()));
            TextView textView2 = this.tvNameValue;
            final STItemAdapter sTItemAdapter = STItemAdapter.this;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: gh6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    STItemAdapter.ViewHolder.e(sTItemAdapter, position, view);
                }
            });
            STItemAdapter.this.setSegmentCountFragment(new SportSegmentSettingCountFragment());
            this.tvCountValue.setBackground(null);
            TextView textView3 = this.tvCountValue;
            final STItemAdapter sTItemAdapter2 = STItemAdapter.this;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: fh6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    STItemAdapter.ViewHolder.f(this.a, segmentData, position, sTItemAdapter2, context, view);
                }
            });
            STItemAdapter.this.setSegmentWeightFragment(new SportSegmentSettingWeightFragment());
            this.tvWeightValue.setBackground(null);
            TextView textView4 = this.tvWeightValue;
            final STItemAdapter sTItemAdapter3 = STItemAdapter.this;
            textView4.setOnClickListener(new View.OnClickListener() { // from class: eh6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    STItemAdapter.ViewHolder.g(this.a, segmentData, position, sTItemAdapter3, context, view);
                }
            });
            ImageView imageView = this.ivRemove;
            final STItemAdapter sTItemAdapter4 = STItemAdapter.this;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: hh6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    STItemAdapter.ViewHolder.h(sTItemAdapter4, position, context, view);
                }
            });
        }
    }

    public STItemAdapter(@NotNull Context context, @NotNull List<SportSegmentData> list, int i) {
        this.context = context;
        this.list = list;
        this.deviceSource = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(STItemAdapter sTItemAdapter, int i, DialogInterface dialogInterface) {
        sTItemAdapter.notifyItemChanged(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(STItemAdapter sTItemAdapter, int i, DialogInterface dialogInterface) {
        sTItemAdapter.notifyItemChanged(i);
    }

    public final void addItem() {
        ArrayList arrayList = new ArrayList();
        SportSegmentData sportSegmentData = new SportSegmentData();
        arrayList.addAll(this.list);
        SportSegmentData sportSegmentData2 = (SportSegmentData) CollectionsKt.lastOrNull((List) arrayList);
        if (sportSegmentData2 != null) {
            sportSegmentData.setIndex(sportSegmentData2.getIndex() + 1);
            sportSegmentData.setType(sportSegmentData2.getType());
            arrayList.add(sportSegmentData);
        }
        this.list = arrayList;
        notifyItemInserted(arrayList.size() - 1);
        notifyItemRangeChanged(this.list.size() - 1, 1);
    }

    public final void deleteItem(int position) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.list);
        arrayList.remove(position);
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((SportSegmentData) obj).setIndex(i2);
            i = i2;
        }
        this.list = arrayList;
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, this.list.size() - position);
    }

    public final void dismissNotify(final int position) {
        getSegmentCountFragment().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dh6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                STItemAdapter.c(this.a, position, dialogInterface);
            }
        });
        getSegmentWeightFragment().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ch6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                STItemAdapter.d(this.a, position, dialogInterface);
            }
        });
    }

    @NotNull
    public final List<SportSegmentData> getCurrentList() {
        return this.list;
    }

    @Nullable
    public final DeleteListener getDeleteListener() {
        return this.deleteListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.list.size();
    }

    @Nullable
    public final NameClickListener getNameClickListener() {
        return this.nameClickListener;
    }

    @NotNull
    public final SportSegmentSettingCountFragment getSegmentCountFragment() {
        SportSegmentSettingCountFragment sportSegmentSettingCountFragment = this.segmentCountFragment;
        Objects.requireNonNull(sportSegmentSettingCountFragment);
        return sportSegmentSettingCountFragment;
    }

    @NotNull
    public final SportSegmentSettingWeightFragment getSegmentWeightFragment() {
        SportSegmentSettingWeightFragment sportSegmentSettingWeightFragment = this.segmentWeightFragment;
        Objects.requireNonNull(sportSegmentSettingWeightFragment);
        return sportSegmentSettingWeightFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).bindData(this.context, this.list.get(position), position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_strength_edit_value, parent, false));
    }

    public final void setDeleteListener(@Nullable DeleteListener deleteListener) {
        this.deleteListener = deleteListener;
    }

    public final void setModifyList(@NotNull List<SportSegmentData> modifyList) {
        this.list = modifyList;
    }

    public final void setNameClickListener(@Nullable NameClickListener nameClickListener) {
        this.nameClickListener = nameClickListener;
    }

    public final void setSegmentCountFragment(@NotNull SportSegmentSettingCountFragment sportSegmentSettingCountFragment) {
        this.segmentCountFragment = sportSegmentSettingCountFragment;
    }

    public final void setSegmentWeightFragment(@NotNull SportSegmentSettingWeightFragment sportSegmentSettingWeightFragment) {
        this.segmentWeightFragment = sportSegmentSettingWeightFragment;
    }
}
