package com.huami.treadmill.ui.tdmillhome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.reflect.TypeToken;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.TdmillConfig;
import com.huami.treadmill.data.BoltRunnerData;
import com.huami.treadmill.data.Extra;
import com.huami.treadmill.data.StringGenderTuple;
import com.huami.treadmill.data.TdPromotionLine;
import com.huami.treadmill.proxy.ProxyBoltTrackRecord;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.linedetail.LineDetailActivity;
import com.huami.treadmill.ui.tdmillhome.TdHmAdapter;
import com.huami.treadmill.util.DataFormatter;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.xiaomi.hm.health.databases.model.AdEntity;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/treadmill/ui/tdmillhome/TdHmAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/treadmill/ui/tdmillhome/TdHmAdapter$TdHmLineVd;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/huami/treadmill/data/TdPromotionLine;", "value", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "<init>", "()V", "TdHmLineVd", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdHmAdapter extends RecyclerView.Adapter<TdHmLineVd> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<TdPromotionLine> data = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u001e\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR%\u0010\u0014\u001a\n \u000b*\u0004\u0018\u00010\u000f0\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0018\u001a\n \u000b*\u0004\u0018\u00010\u00150\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u001b\u001a\n \u000b*\u0004\u0018\u00010\u00150\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0017R%\u0010\u001c\u001a\n \u000b*\u0004\u0018\u00010\u00150\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0019\u0010\u0017R%\u0010\u001e\u001a\n \u000b*\u0004\u0018\u00010\u00150\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u001d\u0010\u0017¨\u0006#"}, d2 = {"Lcom/huami/treadmill/ui/tdmillhome/TdHmAdapter$TdHmLineVd;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "index", "Lcom/xiaomi/hm/health/databases/model/AdEntity;", "c", "Lcom/huami/treadmill/data/TdPromotionLine;", "line", "", "bindData", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/ImageView;", "b", "Lkotlin/Lazy;", "f", "()Landroid/widget/ImageView;", "icon", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title", GoogleApiAvailabilityLight.a, "e", "dis", BaseDeviceStatusActivity.KEY_AREA, "g", "number", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class TdHmLineVd extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Lazy icon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Lazy dis;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final Lazy area;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final Lazy number;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView getA() {
                return (TextView) this.a.findViewById(R.id.run_line_area);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView getA() {
                return (TextView) this.a.findViewById(R.id.run_line_dis);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<ImageView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ImageView getA() {
                return (ImageView) this.a.findViewById(R.id.run_line_icon);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView getA() {
                return (TextView) this.a.findViewById(R.id.run_line_man);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView getA() {
                return (TextView) this.a.findViewById(R.id.run_line_title);
            }
        }

        public TdHmLineVd(@NotNull View view) {
            super(view);
            this.context = view.getContext();
            this.icon = LazyKt__LazyJVMKt.lazy(new c(view));
            this.title = LazyKt__LazyJVMKt.lazy(new e(view));
            this.dis = LazyKt__LazyJVMKt.lazy(new b(view));
            this.area = LazyKt__LazyJVMKt.lazy(new a(view));
            this.number = LazyKt__LazyJVMKt.lazy(new d(view));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void b(TdHmLineVd tdHmLineVd, TdPromotionLine tdPromotionLine, int i, Ref.ObjectRef objectRef, View view) {
            String title;
            LineDetailActivity.Companion companion = LineDetailActivity.INSTANCE;
            Context context = tdHmLineVd.context;
            long runLineId = tdPromotionLine.getRunLineId();
            long runLineTime = tdPromotionLine.getRunLineTime();
            AdEntity adEntityC = tdHmLineVd.c(i);
            String str = "";
            if (adEntityC != null && (title = adEntityC.getTitle()) != null) {
                str = title;
            }
            String runLineIntroduction = tdPromotionLine.getRunLineIntroduction();
            Extra extra = (Extra) objectRef.element;
            companion.startMe(context, runLineId, runLineTime, "", str, runLineIntroduction, extra == null ? null : extra.getLocation(), tdPromotionLine.getRunLineDis(), tdPromotionLine.getRunLineMan());
        }

        private final AdEntity c(int index) {
            List<AdEntity> adRecommendExtra = ProxyBoltTrackRecord.INSTANCE.getInstance().getAdRecommendExtra();
            if (adRecommendExtra == null || !(!adRecommendExtra.isEmpty()) || index >= adRecommendExtra.size()) {
                return null;
            }
            return adRecommendExtra.get(index);
        }

        private final TextView d() {
            return (TextView) this.area.getValue();
        }

        private final TextView e() {
            return (TextView) this.dis.getValue();
        }

        private final ImageView f() {
            return (ImageView) this.icon.getValue();
        }

        private final TextView g() {
            return (TextView) this.number.getValue();
        }

        private final TextView getTitle() {
            return (TextView) this.title.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
        public final void bindData(@NotNull final TdPromotionLine line, final int index) {
            String str;
            Type type = new TypeToken<StringGenderTuple>() { // from class: com.huami.treadmill.ui.tdmillhome.TdHmAdapter$TdHmLineVd$bindData$typeTuple$1
            }.getType();
            Type type2 = new TypeToken<Extra>() { // from class: com.huami.treadmill.ui.tdmillhome.TdHmAdapter$TdHmLineVd$bindData$typeExtra$1
            }.getType();
            StringGenderTuple stringGenderTuple = (StringGenderTuple) HMHttpUtils.getGson().fromJson(line.getRunLineIcon(), type);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = HMHttpUtils.getGson().fromJson(line.getRunLineArea(), type2);
            BoltRunnerData runnerData = ProxyTreadmill.INSTANCE.getInstance().getRunnerData();
            if (runnerData != null && runnerData.getGender() == 1) {
                Glide.with(f()).load(stringGenderTuple == null ? null : stringGenderTuple.getMale()).apply(TdmillConfig.INSTANCE.getGldieSharedOptions()).into(f());
            } else {
                Glide.with(f()).load(stringGenderTuple == null ? null : stringGenderTuple.getFemale()).apply(TdmillConfig.INSTANCE.getGldieSharedOptions()).into(f());
            }
            TextView title = getTitle();
            AdEntity adEntityC = c(index);
            title.setText(adEntityC == null ? null : adEntityC.getTitle());
            TextView textViewE = e();
            if (RunnerData.getRunner().isMetric()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format(this.context.getString(R.string.tdmill_format_dis), Arrays.copyOf(new Object[]{Float.valueOf(new BigDecimal(String.valueOf(line.getRunLineDis())).setScale(2, 1).floatValue())}, 1));
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str = String.format(this.context.getString(R.string.tdmill_format_dis_mile), Arrays.copyOf(new Object[]{Float.valueOf(new BigDecimal(DataFormatter.INSTANCE.formatKMDisToMI(line.getRunLineDis())).setScale(2, 1).floatValue())}, 1));
            }
            textViewE.setText(str);
            TextView textViewD = d();
            Extra extra = (Extra) objectRef.element;
            textViewD.setText(extra != null ? extra.getLocation() : null);
            g().setText(this.context.getResources().getQuantityString(R.plurals.tdmill_run_man_upgrade, line.getRunLineMan(), Integer.valueOf(line.getRunLineMan())));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: fl7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TdHmAdapter.TdHmLineVd.b(this.a, line, index, objectRef, view);
                }
            });
        }
    }

    @NotNull
    public final List<TdPromotionLine> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.data.size();
    }

    public final void setData(@NotNull List<TdPromotionLine> list) {
        this.data.clear();
        this.data.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TdHmLineVd holder, int position) {
        holder.bindData(this.data.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TdHmLineVd onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new TdHmLineVd(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_run_line, parent, false));
    }
}
