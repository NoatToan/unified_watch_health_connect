package com.xiaomi.hm.health.bodyfat.slimming.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.slimming.constants.SportTypeContants;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSportDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000e\u0018\u0000 !2\u00020\u0001:\u0001!B\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\u0004\b\u001f\u0010 J$\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/view/GridViewAdapter;", "Landroid/widget/BaseAdapter;", "", "position", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/ViewGroup;", "parent", "getView", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightSportDetail;", "getItem", "", "getItemId", "getCount", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Ljava/util/List;", "itemDataList", "c", LogUtil.I, "getSelectPosition", "()I", "setSelectPosition", "(I)V", "selectPosition", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class GridViewAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<LoseWeightSportDetail> itemDataList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int selectPosition = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/view/GridViewAdapter$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "interfaceTypeName", "getSportName", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String getSportName(@NotNull Context context, @Nullable String interfaceTypeName) {
            return (String) r.mapOf(TuplesKt.to("jianzou", context.getString(R.string.lose_weight_sport_sport_walking)), TuplesKt.to(SportTypeContants.MAN_PAO, context.getString(R.string.lose_weight_sport_jogging)), TuplesKt.to(SportTypeContants.TIAO_SHENG, context.getString(R.string.lose_weight_sport_sport_skipping)), TuplesKt.to(SportTypeContants.QI_CHE, context.getString(R.string.lose_weight_sport_ride)), TuplesKt.to(SportTypeContants.YOU_YANG_CAO, context.getString(R.string.lose_weight_sport_aerobics)), TuplesKt.to(SportTypeContants.YU_MAO_QIU, context.getString(R.string.lose_weight_sport_badminton)), TuplesKt.to(SportTypeContants.MEN_QIU, context.getString(R.string.lose_weight_sport_gate_ball)), TuplesKt.to(SportTypeContants.TAN_LI_QIU, context.getString(R.string.lose_weight_sport_bouncy_ball)), TuplesKt.to(SportTypeContants.PING_PANG_QIU, context.getString(R.string.lose_weight_sport_sport_table_tennis)), TuplesKt.to(SportTypeContants.ZU_QIU, context.getString(R.string.lose_weight_sport_sport_football)), TuplesKt.to(SportTypeContants.BI_QIU, context.getString(R.string.lose_weight_sport_squash)), TuplesKt.to(SportTypeContants.LAN_QIU, context.getString(R.string.lose_weight_sport_basketball)), TuplesKt.to(SportTypeContants.WANG_QIU, context.getString(R.string.lose_weight_sport_sport_tennis)), TuplesKt.to(SportTypeContants.PA_SHAN, context.getString(R.string.lose_weight_sport_climb)), TuplesKt.to(SportTypeContants.YOU_YONG, context.getString(R.string.lose_weight_sport_swimming)), TuplesKt.to(SportTypeContants.JI_JIAN, context.getString(R.string.lose_weight_sport_fencing)), TuplesKt.to(SportTypeContants.TAI_QUAN_DAO, context.getString(R.string.lose_weight_sport_taekwondo)), TuplesKt.to(SportTypeContants.GAO_ER_FU, context.getString(R.string.lose_weight_sport_golf))).get(interfaceTypeName);
        }
    }

    public GridViewAdapter(@NotNull Context context, @NotNull List<LoseWeightSportDetail> list) {
        this.context = context;
        this.itemDataList = list;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.itemDataList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return this.itemDataList.get(position).hashCode();
    }

    public final int getSelectPosition() {
        return this.selectPosition;
    }

    @Override // android.widget.Adapter
    @NotNull
    public View getView(int position, @Nullable View view, @Nullable ViewGroup parent) {
        View viewInflate = View.inflate(this.context, R.layout.item_lose_weight_sport, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_sport_type);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_sport_time);
        if (this.selectPosition == position) {
            viewInflate.setEnabled(true);
            textView2.setTextColor(-1);
            textView.setTextColor(-1);
        } else {
            viewInflate.setEnabled(false);
            textView2.setTextColor(ContextCompat.getColor(this.context, R.color.lose_weight_sport_time));
            textView.setTextColor(ContextCompat.getColor(this.context, R.color.lose_weight_sport_type));
        }
        LoseWeightSportDetail item = getItem(position);
        textView.setText(INSTANCE.getSportName(this.context, item.getInterfaceSportName()));
        textView2.setText(this.context.getResources().getQuantityString(R.plurals.lose_weight_sport_minute, item.getSportTime(), Integer.valueOf(item.getSportTime())));
        return viewInflate;
    }

    public final void setSelectPosition(int i) {
        this.selectPosition = i;
    }

    @Override // android.widget.Adapter
    @NotNull
    public LoseWeightSportDetail getItem(int position) {
        return this.itemDataList.get(position);
    }
}
