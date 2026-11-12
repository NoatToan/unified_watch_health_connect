package com.huami.moving.ui.view.card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.moving.R;
import com.huami.moving.ui.sport.detail.data.SportShowDataBean;
import com.huami.moving.ui.sport.detail.data.SportTypeItemBean;
import com.huami.moving.ui.sport.detail.manager.SportDataItemHandler;
import com.huami.moving.ui.sport.detail.manager.SportDataManager;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0000\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000389:B'\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b6\u00107J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR4\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010)\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010*R$\u0010/\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R4\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t002\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t008\u0006@BX\u0086.¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u0006;"}, d2 = {"Lcom/huami/moving/ui/view/card/CardInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "dataType", "", "b", "", "Lkotlin/Pair;", "", "a", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "record", "", "c", "Z", TdmillHmFragment.ARG_IS_METRIC, GoogleApiAvailabilityLight.a, "isSportEndPage", "", "e", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "<set-?>", "f", "isOutdoor", "()Z", "g", "Ljava/lang/String;", "getPostfix", "()Ljava/lang/String;", "postfix", "", "h", "[Ljava/lang/String;", "getMainContent", "()[Ljava/lang/String;", "mainContent", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/databases/model/Trackrecord;ZZ)V", "Companion", "ViewHolderCardInfo", "ViewHolderCardInfoEndPage", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class CardInfoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Trackrecord record;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isMetric;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isSportEndPage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private List<Pair<String, String>> data = new ArrayList();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isOutdoor = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String postfix;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String[] mainContent;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/moving/ui/view/card/CardInfoAdapter$Companion;", "", "", "distance", "", "sportType", "", TdmillHmFragment.ARG_IS_METRIC, "", "", "getFormatDisAndUnit", "(FIZ)[Ljava/lang/String;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String[] getFormatDisAndUnit(float distance, int sportType, boolean isMetric) {
            String[] strArr = {"", ""};
            float fConvertMeterToKmOrMile = RunDataConversion.convertMeterToKmOrMile(distance, isMetric);
            if (SportTypeIdentifier.isDisUnitSupportMeterOrYads(sportType)) {
                strArr[0] = DataFormatter.parseDis2MeterOrYardOrKmOrMile(distance, isMetric);
                if (isMetric) {
                    strArr[1] = String.valueOf(fConvertMeterToKmOrMile <= 10.0f ? R.string.unit_m : R.string.running_kilometer);
                } else {
                    strArr[1] = String.valueOf(fConvertMeterToKmOrMile <= 10.0f ? R.string.unit_yard : R.string.running_mile);
                }
            } else {
                strArr[0] = DataFormatter.parseRawKilometerToFormatKilometer(fConvertMeterToKmOrMile);
                strArr[1] = String.valueOf(isMetric ? R.string.running_kilometer : R.string.running_mile);
            }
            return strArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/huami/moving/ui/view/card/CardInfoAdapter$ViewHolderCardInfo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/Pair;", "", "item", "", "bindData", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "content", "b", "desc", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolderCardInfo extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final TextView content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView desc;

        public ViewHolderCardInfo(@NotNull View view) {
            super(view);
            this.content = (TextView) view.findViewById(R.id.over_view_item_content);
            this.desc = (TextView) view.findViewById(R.id.over_view_item_desc);
        }

        public final void bindData(@NotNull Pair<String, String> item) {
            this.content.setText(item.getSecond());
            this.desc.setText(item.getFirst());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/huami/moving/ui/view/card/CardInfoAdapter$ViewHolderCardInfoEndPage;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/Pair;", "", "item", "", "bindData", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "content", "b", "desc", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolderCardInfoEndPage extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final TextView content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView desc;

        public ViewHolderCardInfoEndPage(@NotNull View view) {
            super(view);
            this.content = (TextView) view.findViewById(R.id.over_view_item_content);
            this.desc = (TextView) view.findViewById(R.id.over_view_item_desc);
        }

        public final void bindData(@NotNull Pair<String, String> item) {
            this.content.setText(item.getSecond());
            this.desc.setText(item.getFirst());
        }
    }

    public CardInfoAdapter(@NotNull Context context, @NotNull Trackrecord trackrecord, boolean z, boolean z2) {
        this.context = context;
        this.record = trackrecord;
        this.isMetric = z;
        this.isSportEndPage = z2;
        Integer type = trackrecord.getType();
        Integer type2 = null;
        if (type != null) {
            type = SportTypeIdentifier.isSubSport(type.intValue()) ? type : null;
            if (type != null) {
                type2 = Integer.valueOf(type.intValue() - 1000);
            }
        }
        type2 = type2 == null ? trackrecord.getType() : type2;
        b(type2.intValue());
        this.data.addAll(a(type2.intValue()));
    }

    private final List<Pair<String, String>> a(int dataType) {
        List<SportShowDataBean> listManagerSportOverViewData = SportDataManager.INSTANCE.managerSportOverViewData(this.context);
        SportDataItemHandler sportDataItemHandler = new SportDataItemHandler(this.context, this.record, this.isMetric);
        if (listManagerSportOverViewData != null) {
            for (SportShowDataBean sportShowDataBean : listManagerSportOverViewData) {
                List<SportTypeItemBean> sportType = sportShowDataBean.getSportType();
                if (sportType != null) {
                    Iterator<T> it2 = sportType.iterator();
                    while (it2.hasNext()) {
                        if (((SportTypeItemBean) it2.next()).getSport_type() == dataType) {
                            this.mainContent = sportDataItemHandler.handleSportMainData(sportShowDataBean);
                            return sportDataItemHandler.handleSportSubData(sportShowDataBean);
                        }
                    }
                }
            }
        }
        this.mainContent = sportDataItemHandler.handleSportMainData(listManagerSportOverViewData.get(0));
        return sportDataItemHandler.handleSportSubData(listManagerSportOverViewData.get(0));
    }

    private final void b(int dataType) {
        int i = SportDeviceUtils.isWorkoutSportSource(this.record.getSource().intValue()) ? R.string.sports_type_work_out : R.string.sports_type_free_training;
        if (dataType == 2001) {
            this.isOutdoor = true;
            this.postfix = this.context.getString(R.string.sport_mix_type_triathlon);
            Unit unit = Unit.INSTANCE;
        }
        if (dataType == 2002) {
            this.isOutdoor = true;
            this.postfix = this.context.getString(R.string.sport_type_multi);
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        switch (dataType) {
            case 6:
                this.isOutdoor = true;
                this.postfix = this.context.getString(R.string.running_sports_type_walking);
                Unit unit3 = Unit.INSTANCE;
                break;
            case 7:
                this.isOutdoor = true;
                this.postfix = this.context.getString(R.string.running_sports_type_crosscountry);
                Unit unit4 = Unit.INSTANCE;
                break;
            case 8:
                this.isOutdoor = false;
                this.postfix = SportDeviceUtils.isCategoryForHaydn(this.record.getSource().intValue()) ? this.context.getString(R.string.sport_index_run) : this.context.getString(R.string.runnings_sport_type_treadmill);
                Unit unit5 = Unit.INSTANCE;
                break;
            case 9:
                this.isOutdoor = true;
                this.postfix = this.context.getString(R.string.sports_type_bike_ride);
                Unit unit6 = Unit.INSTANCE;
                break;
            case 10:
                this.isOutdoor = false;
                this.postfix = this.context.getString(R.string.sports_type_bike_indoor_ride);
                Unit unit7 = Unit.INSTANCE;
                break;
            case 11:
                this.isOutdoor = true;
                this.postfix = this.context.getString(R.string.sports_type_ski);
                Unit unit8 = Unit.INSTANCE;
                break;
            case 12:
                this.isOutdoor = false;
                this.postfix = this.context.getString(R.string.sports_type_elliptical_trainer);
                Unit unit9 = Unit.INSTANCE;
                break;
            case 13:
                this.isOutdoor = true;
                this.postfix = this.context.getString(R.string.sports_type_mountain_climb);
                Unit unit10 = Unit.INSTANCE;
                break;
            case 14:
                this.isOutdoor = false;
                this.postfix = this.context.getString(R.string.sports_type_swim_indoor);
                Unit unit11 = Unit.INSTANCE;
                break;
            case 15:
                this.isOutdoor = true;
                this.postfix = this.context.getString(R.string.sports_type_swim_outdoor);
                Unit unit12 = Unit.INSTANCE;
                break;
            case 16:
                this.isOutdoor = false;
                this.postfix = this.context.getString(i);
                Unit unit13 = Unit.INSTANCE;
                break;
            case 17:
                this.isOutdoor = false;
                this.postfix = this.context.getString(R.string.sport_type_tennis);
                Unit unit14 = Unit.INSTANCE;
                break;
            case 18:
                this.isOutdoor = true;
                this.postfix = this.context.getString(R.string.sport_type_football);
                Unit unit15 = Unit.INSTANCE;
                break;
            default:
                switch (dataType) {
                    case 21:
                        this.isOutdoor = false;
                        this.postfix = this.context.getString(R.string.sport_type_rope_skipping);
                        Unit unit16 = Unit.INSTANCE;
                        break;
                    case 22:
                        this.isOutdoor = true;
                        this.postfix = this.context.getString(R.string.sports_type_hiking);
                        Unit unit17 = Unit.INSTANCE;
                        break;
                    case 23:
                        this.isOutdoor = false;
                        this.postfix = this.context.getString(R.string.sport_type_rowing_machine);
                        Unit unit18 = Unit.INSTANCE;
                        break;
                    case 24:
                        this.isOutdoor = false;
                        this.postfix = this.context.getString(R.string.sport_type_indoor_fitness);
                        Unit unit19 = Unit.INSTANCE;
                        break;
                    case 25:
                        this.isOutdoor = false;
                        this.postfix = this.context.getString(R.string.runnings_sport_type_treadmill);
                        Unit unit20 = Unit.INSTANCE;
                        break;
                    case 26:
                        this.isOutdoor = true;
                        this.postfix = this.context.getString(R.string.runnings_sport_type_treadmill);
                        Unit unit21 = Unit.INSTANCE;
                        break;
                    default:
                        switch (dataType) {
                            case 40:
                                this.isOutdoor = false;
                                this.postfix = this.context.getString(R.string.sport_type_indoor_walk);
                                Unit unit22 = Unit.INSTANCE;
                                break;
                            case 41:
                                this.isOutdoor = false;
                                this.postfix = this.context.getString(R.string.sport_type_curling);
                                Unit unit23 = Unit.INSTANCE;
                                break;
                            case 42:
                                this.isOutdoor = true;
                                this.postfix = this.context.getString(R.string.sport_type_board_skiing);
                                Unit unit24 = Unit.INSTANCE;
                                break;
                            case 43:
                                this.isOutdoor = true;
                                this.postfix = this.context.getString(R.string.sport_type_alpine_skiing);
                                Unit unit25 = Unit.INSTANCE;
                                break;
                            case 44:
                                this.isOutdoor = true;
                                this.postfix = this.context.getString(R.string.sport_type_outdoor_skating);
                                Unit unit26 = Unit.INSTANCE;
                                break;
                            case 45:
                                this.isOutdoor = false;
                                this.postfix = this.context.getString(R.string.sport_type_indoor_skating);
                                Unit unit27 = Unit.INSTANCE;
                                break;
                            case 46:
                                this.isOutdoor = true;
                                this.postfix = this.context.getString(R.string.sport_type_cross_country_skiing);
                                Unit unit28 = Unit.INSTANCE;
                                break;
                            case 47:
                                this.isOutdoor = true;
                                this.postfix = this.context.getString(R.string.sport_type_mountain_riding);
                                Unit unit29 = Unit.INSTANCE;
                                break;
                            case 48:
                                this.isOutdoor = true;
                                this.postfix = this.context.getString(R.string.sport_type_bmx);
                                Unit unit30 = Unit.INSTANCE;
                                break;
                            case 49:
                                this.isOutdoor = false;
                                this.postfix = this.context.getString(R.string.sport_type_high_intensity_training);
                                Unit unit31 = Unit.INSTANCE;
                                break;
                            case 50:
                                this.isOutdoor = false;
                                this.postfix = this.context.getString(R.string.sport_type_core_training);
                                Unit unit32 = Unit.INSTANCE;
                                break;
                            case 51:
                                this.isOutdoor = false;
                                this.postfix = this.context.getString(R.string.sport_type_mixed_aerobic);
                                Unit unit33 = Unit.INSTANCE;
                                break;
                            case 52:
                                this.isOutdoor = false;
                                this.postfix = this.context.getString(R.string.sport_type_strength_training);
                                Unit unit34 = Unit.INSTANCE;
                                break;
                            case 53:
                                this.isOutdoor = false;
                                this.postfix = this.context.getString(R.string.sport_type_stretch_training);
                                Unit unit35 = Unit.INSTANCE;
                                break;
                            case 54:
                                this.isOutdoor = false;
                                this.postfix = this.context.getString(R.string.sport_type_climbing_training);
                                Unit unit36 = Unit.INSTANCE;
                                break;
                            case 55:
                                this.isOutdoor = false;
                                this.postfix = this.context.getString(R.string.sport_type_flexible_training);
                                Unit unit37 = Unit.INSTANCE;
                                break;
                            default:
                                switch (dataType) {
                                    case 57:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_step_training);
                                        Unit unit38 = Unit.INSTANCE;
                                        break;
                                    case 58:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_stepper);
                                        Unit unit39 = Unit.INSTANCE;
                                        break;
                                    case 59:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_gymnastics);
                                        Unit unit40 = Unit.INSTANCE;
                                        break;
                                    case 60:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_yoga);
                                        Unit unit41 = Unit.INSTANCE;
                                        break;
                                    case 61:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_pilates);
                                        Unit unit42 = Unit.INSTANCE;
                                        break;
                                    case 62:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_surfing);
                                        Unit unit43 = Unit.INSTANCE;
                                        break;
                                    case 63:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_hunting);
                                        Unit unit44 = Unit.INSTANCE;
                                        break;
                                    case 64:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_fishing);
                                        Unit unit45 = Unit.INSTANCE;
                                        break;
                                    case 65:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_sailing);
                                        Unit unit46 = Unit.INSTANCE;
                                        break;
                                    case 66:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_outdoor_boating);
                                        Unit unit47 = Unit.INSTANCE;
                                        break;
                                    case 67:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_skateboarding);
                                        Unit unit48 = Unit.INSTANCE;
                                        break;
                                    case 68:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_paddle_surfing);
                                        Unit unit49 = Unit.INSTANCE;
                                        break;
                                    case 69:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_roller_skating);
                                        Unit unit50 = Unit.INSTANCE;
                                        break;
                                    case 70:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_rock_climbing);
                                        Unit unit51 = Unit.INSTANCE;
                                        break;
                                    case 71:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_ballet_dance);
                                        Unit unit52 = Unit.INSTANCE;
                                        break;
                                    case 72:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_belly_dance);
                                        Unit unit53 = Unit.INSTANCE;
                                        break;
                                    case 73:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_square_dance);
                                        Unit unit54 = Unit.INSTANCE;
                                        break;
                                    case 74:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_street_dance);
                                        Unit unit55 = Unit.INSTANCE;
                                        break;
                                    case 75:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_social_dance);
                                        Unit unit56 = Unit.INSTANCE;
                                        break;
                                    case 76:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_dance);
                                        Unit unit57 = Unit.INSTANCE;
                                        break;
                                    case 77:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_zumba_dance);
                                        Unit unit58 = Unit.INSTANCE;
                                        break;
                                    case 78:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_cricket_ball);
                                        Unit unit59 = Unit.INSTANCE;
                                        break;
                                    case 79:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_baseball);
                                        Unit unit60 = Unit.INSTANCE;
                                        break;
                                    case 80:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_bowling);
                                        Unit unit61 = Unit.INSTANCE;
                                        break;
                                    case 81:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_squash_ball);
                                        Unit unit62 = Unit.INSTANCE;
                                        break;
                                    case 82:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_football_us);
                                        Unit unit63 = Unit.INSTANCE;
                                        break;
                                    case 83:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_golf);
                                        Unit unit64 = Unit.INSTANCE;
                                        break;
                                    case 84:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_golf_swing);
                                        Unit unit65 = Unit.INSTANCE;
                                        break;
                                    case 85:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_basketball);
                                        Unit unit66 = Unit.INSTANCE;
                                        break;
                                    case 86:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_softball);
                                        Unit unit67 = Unit.INSTANCE;
                                        break;
                                    case 87:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_gateball);
                                        Unit unit68 = Unit.INSTANCE;
                                        break;
                                    case 88:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_volleyball);
                                        Unit unit69 = Unit.INSTANCE;
                                        break;
                                    case 89:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_pingpong);
                                        Unit unit70 = Unit.INSTANCE;
                                        break;
                                    case 90:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_hockey_ball);
                                        Unit unit71 = Unit.INSTANCE;
                                        break;
                                    case 91:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_handball);
                                        Unit unit72 = Unit.INSTANCE;
                                        break;
                                    case 92:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_badminton);
                                        Unit unit73 = Unit.INSTANCE;
                                        break;
                                    case 93:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_archery);
                                        Unit unit74 = Unit.INSTANCE;
                                        break;
                                    case 94:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_equestian);
                                        Unit unit75 = Unit.INSTANCE;
                                        break;
                                    case 95:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_fencing);
                                        Unit unit76 = Unit.INSTANCE;
                                        break;
                                    case 96:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_karate);
                                        Unit unit77 = Unit.INSTANCE;
                                        break;
                                    case 97:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_boxing);
                                        Unit unit78 = Unit.INSTANCE;
                                        break;
                                    case 98:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_judo);
                                        Unit unit79 = Unit.INSTANCE;
                                        break;
                                    case 99:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_wrestling);
                                        Unit unit80 = Unit.INSTANCE;
                                        break;
                                    case 100:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_taichi);
                                        Unit unit81 = Unit.INSTANCE;
                                        break;
                                    case 101:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_muay_thai);
                                        Unit unit82 = Unit.INSTANCE;
                                        break;
                                    case 102:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_taekwondo);
                                        Unit unit83 = Unit.INSTANCE;
                                        break;
                                    case 103:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_martial_arts);
                                        Unit unit84 = Unit.INSTANCE;
                                        break;
                                    case 104:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_free_sparring);
                                        Unit unit85 = Unit.INSTANCE;
                                        break;
                                    case 105:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_cross_double_skiing);
                                        Unit unit86 = Unit.INSTANCE;
                                        break;
                                    case 106:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_kite_surfing);
                                        Unit unit87 = Unit.INSTANCE;
                                        break;
                                    case 107:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_outdoor_boating);
                                        Unit unit88 = Unit.INSTANCE;
                                        break;
                                    case 108:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_climbing_stairs);
                                        Unit unit89 = Unit.INSTANCE;
                                        break;
                                    case 109:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_aerobics);
                                        Unit unit90 = Unit.INSTANCE;
                                        break;
                                    case 110:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_orienteering);
                                        Unit unit91 = Unit.INSTANCE;
                                        break;
                                    case 111:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_group_calisthenics);
                                        Unit unit92 = Unit.INSTANCE;
                                        break;
                                    case 112:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_latin_dance);
                                        Unit unit93 = Unit.INSTANCE;
                                        break;
                                    case 113:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_jazz);
                                        Unit unit94 = Unit.INSTANCE;
                                        break;
                                    case 114:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_kickboxing);
                                        Unit unit95 = Unit.INSTANCE;
                                        break;
                                    case 115:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_hu_la_hoop);
                                        Unit unit96 = Unit.INSTANCE;
                                        break;
                                    case 116:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_frisbee);
                                        Unit unit97 = Unit.INSTANCE;
                                        break;
                                    case 117:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_darts);
                                        Unit unit98 = Unit.INSTANCE;
                                        break;
                                    case 118:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_fly_a_kite);
                                        Unit unit99 = Unit.INSTANCE;
                                        break;
                                    case 119:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_tug_of_war);
                                        Unit unit100 = Unit.INSTANCE;
                                        break;
                                    case 120:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_kick_shuttlecock);
                                        Unit unit101 = Unit.INSTANCE;
                                        break;
                                    case 121:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_beach_soccer);
                                        Unit unit102 = Unit.INSTANCE;
                                        break;
                                    case 122:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_beach_volleyball);
                                        Unit unit103 = Unit.INSTANCE;
                                        break;
                                    case 123:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_drifting);
                                        Unit unit104 = Unit.INSTANCE;
                                        break;
                                    case 124:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_motorboat);
                                        Unit unit105 = Unit.INSTANCE;
                                        break;
                                    case 125:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_snowmobile);
                                        Unit unit106 = Unit.INSTANCE;
                                        break;
                                    case 126:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_sled);
                                        Unit unit107 = Unit.INSTANCE;
                                        break;
                                    case 127:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_orienteering_skiing);
                                        Unit unit108 = Unit.INSTANCE;
                                        break;
                                    case 128:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_biathlon);
                                        Unit unit109 = Unit.INSTANCE;
                                        break;
                                    case 129:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_parkour);
                                        Unit unit110 = Unit.INSTANCE;
                                        break;
                                    case 130:
                                        this.isOutdoor = false;
                                        this.postfix = this.context.getString(R.string.sport_type_cross_training);
                                        Unit unit111 = Unit.INSTANCE;
                                        break;
                                    case 131:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_race_walking);
                                        Unit unit112 = Unit.INSTANCE;
                                        break;
                                    case 132:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_drive);
                                        Unit unit113 = Unit.INSTANCE;
                                        break;
                                    case 133:
                                        this.isOutdoor = true;
                                        this.postfix = this.context.getString(R.string.sport_type_paragliding);
                                        Unit unit114 = Unit.INSTANCE;
                                        break;
                                    default:
                                        switch (dataType) {
                                            case 136:
                                                this.isOutdoor = true;
                                                this.postfix = this.context.getString(R.string.sport_type_snow_mobile);
                                                Unit unit115 = Unit.INSTANCE;
                                                break;
                                            case 137:
                                                this.isOutdoor = true;
                                                this.postfix = this.context.getString(R.string.sport_type_off_road_motorcycle);
                                                Unit unit116 = Unit.INSTANCE;
                                                break;
                                            case 138:
                                                this.isOutdoor = true;
                                                this.postfix = this.context.getString(R.string.sport_type_dragon_boat);
                                                Unit unit117 = Unit.INSTANCE;
                                                break;
                                            case 139:
                                                this.isOutdoor = true;
                                                this.postfix = this.context.getString(R.string.sport_type_water_skiing);
                                                Unit unit118 = Unit.INSTANCE;
                                                break;
                                            case 140:
                                                this.isOutdoor = true;
                                                this.postfix = this.context.getString(R.string.sport_type_kayak);
                                                Unit unit119 = Unit.INSTANCE;
                                                break;
                                            case 141:
                                                this.isOutdoor = true;
                                                this.postfix = this.context.getString(R.string.sport_type_rowing);
                                                Unit unit120 = Unit.INSTANCE;
                                                break;
                                            case 142:
                                                this.isOutdoor = true;
                                                this.postfix = this.context.getString(R.string.sport_type_polo);
                                                Unit unit121 = Unit.INSTANCE;
                                                break;
                                            case 143:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_spinning_bike);
                                                Unit unit122 = Unit.INSTANCE;
                                                break;
                                            case 144:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_walking_machine);
                                                Unit unit123 = Unit.INSTANCE;
                                                break;
                                            case 145:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_wall_ball);
                                                Unit unit124 = Unit.INSTANCE;
                                                break;
                                            case 146:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_folk_dance);
                                                Unit unit125 = Unit.INSTANCE;
                                                break;
                                            case 147:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_jujitsu);
                                                Unit unit126 = Unit.INSTANCE;
                                                break;
                                            case 148:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_fencing_indoor);
                                                Unit unit127 = Unit.INSTANCE;
                                                break;
                                            case 149:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_horizontal_bar);
                                                Unit unit128 = Unit.INSTANCE;
                                                break;
                                            case 150:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_parallel_bars);
                                                Unit unit129 = Unit.INSTANCE;
                                                break;
                                            case 151:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_billiards);
                                                Unit unit130 = Unit.INSTANCE;
                                                break;
                                            case 152:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_fujiki);
                                                Unit unit131 = Unit.INSTANCE;
                                                break;
                                            case 153:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_dodge_ball);
                                                Unit unit132 = Unit.INSTANCE;
                                                break;
                                            case 154:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_water_polo);
                                                Unit unit133 = Unit.INSTANCE;
                                                break;
                                            case 155:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_fin_swimming);
                                                Unit unit134 = Unit.INSTANCE;
                                                break;
                                            case 156:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_synchronized_swimming);
                                                Unit unit135 = Unit.INSTANCE;
                                                break;
                                            case 157:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_snorkeling);
                                                Unit unit136 = Unit.INSTANCE;
                                                break;
                                            case 158:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_ice_hockey);
                                                Unit unit137 = Unit.INSTANCE;
                                                break;
                                            case 159:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_swing);
                                                Unit unit138 = Unit.INSTANCE;
                                                break;
                                            case 160:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_shuffleboard);
                                                Unit unit139 = Unit.INSTANCE;
                                                break;
                                            case 161:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_table_football);
                                                Unit unit140 = Unit.INSTANCE;
                                                break;
                                            case 162:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_shuttlecock);
                                                Unit unit141 = Unit.INSTANCE;
                                                break;
                                            case 163:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_somatosensory_game);
                                                Unit unit142 = Unit.INSTANCE;
                                                break;
                                            case 164:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_indoor_football);
                                                Unit unit143 = Unit.INSTANCE;
                                                break;
                                            case 165:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_hip_hop);
                                                Unit unit144 = Unit.INSTANCE;
                                                break;
                                            case 166:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_pole_dancing);
                                                Unit unit145 = Unit.INSTANCE;
                                                break;
                                            case 167:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_battle_rope);
                                                Unit unit146 = Unit.INSTANCE;
                                                break;
                                            case 168:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_break_dancing);
                                                Unit unit147 = Unit.INSTANCE;
                                                break;
                                            case 169:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_sandbag_ball);
                                                Unit unit148 = Unit.INSTANCE;
                                                break;
                                            case 170:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_ground_throw);
                                                Unit unit149 = Unit.INSTANCE;
                                                break;
                                            case 171:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_jai_li_ball);
                                                Unit unit150 = Unit.INSTANCE;
                                                break;
                                            case 172:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_indoor_surfing);
                                                Unit unit151 = Unit.INSTANCE;
                                                break;
                                            case DataTypeSource.SPORT_TYPE_CHESS /* 173 */:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_chess);
                                                Unit unit152 = Unit.INSTANCE;
                                                break;
                                            case DataTypeSource.SPORT_TYPE_CHECKERS /* 174 */:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_checkers);
                                                Unit unit153 = Unit.INSTANCE;
                                                break;
                                            case 175:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_go);
                                                Unit unit154 = Unit.INSTANCE;
                                                break;
                                            case DataTypeSource.SPORT_TYPE_BRIDGE /* 176 */:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_bridge);
                                                Unit unit155 = Unit.INSTANCE;
                                                break;
                                            case 177:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_board_games);
                                                Unit unit156 = Unit.INSTANCE;
                                                break;
                                            case DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING /* 178 */:
                                                this.isOutdoor = true;
                                                this.postfix = this.context.getString(R.string.sport_type_snowshoe_hiking);
                                                Unit unit157 = Unit.INSTANCE;
                                                break;
                                            case DataTypeSource.SPORT_TYPE_SHOOT /* 179 */:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_shoot);
                                                Unit unit158 = Unit.INSTANCE;
                                                break;
                                            case 180:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_skydiving);
                                                Unit unit159 = Unit.INSTANCE;
                                                break;
                                            case DataTypeSource.SPORT_TYPE_DOWNHILL /* 181 */:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_cross_training);
                                                Unit unit160 = Unit.INSTANCE;
                                                break;
                                            case DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING /* 182 */:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_bungee_jumping);
                                                Unit unit161 = Unit.INSTANCE;
                                                break;
                                            case 183:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_trampoline);
                                                Unit unit162 = Unit.INSTANCE;
                                                break;
                                            case DataTypeSource.SPORT_TYPE_BOULDERING /* 184 */:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_bouldering);
                                                Unit unit163 = Unit.INSTANCE;
                                                break;
                                            case DataTypeSource.SPORT_TYPE_MODERN_DANCE /* 185 */:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_modern_dance);
                                                Unit unit164 = Unit.INSTANCE;
                                                break;
                                            case DataTypeSource.SPORT_TYPE_DISCO /* 186 */:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_disco);
                                                Unit unit165 = Unit.INSTANCE;
                                                break;
                                            case DataTypeSource.SPORT_TYPE_TAP_DANCE /* 187 */:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_tap_dance);
                                                Unit unit166 = Unit.INSTANCE;
                                                break;
                                            case 188:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_floor_ball);
                                                Unit unit167 = Unit.INSTANCE;
                                                break;
                                            case 189:
                                                this.isOutdoor = false;
                                                this.postfix = this.context.getString(R.string.sport_type_e_sports);
                                                Unit unit168 = Unit.INSTANCE;
                                                break;
                                            case 190:
                                                this.isOutdoor = true;
                                                this.postfix = this.context.getString(R.string.sport_type_atv);
                                                Unit unit169 = Unit.INSTANCE;
                                                break;
                                            default:
                                                this.isOutdoor = true;
                                                this.postfix = this.context.getString(R.string.running_sports_type_running);
                                                Unit unit170 = Unit.INSTANCE;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    @NotNull
    public final List<Pair<String, String>> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.data.size();
    }

    @NotNull
    public final String[] getMainContent() {
        String[] strArr = this.mainContent;
        Objects.requireNonNull(strArr);
        return strArr;
    }

    @NotNull
    public final String getPostfix() {
        String str = this.postfix;
        Objects.requireNonNull(str);
        return str;
    }

    /* JADX INFO: renamed from: isOutdoor, reason: from getter */
    public final boolean getIsOutdoor() {
        return this.isOutdoor;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolderCardInfo) {
            ((ViewHolderCardInfo) holder).bindData(this.data.get(position));
        } else if (holder instanceof ViewHolderCardInfoEndPage) {
            ((ViewHolderCardInfoEndPage) holder).bindData(this.data.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return this.isSportEndPage ? new ViewHolderCardInfoEndPage(LayoutInflater.from(this.context).inflate(R.layout.item_sport_end_over_view, parent, false)) : new ViewHolderCardInfo(LayoutInflater.from(this.context).inflate(R.layout.item_over_view, parent, false));
    }

    public final void setData(@NotNull List<Pair<String, String>> list) {
        this.data = list;
    }
}
