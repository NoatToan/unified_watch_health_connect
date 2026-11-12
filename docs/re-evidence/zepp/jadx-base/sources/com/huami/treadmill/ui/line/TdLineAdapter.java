package com.huami.treadmill.ui.line;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
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
import com.huami.treadmill.data.TdLine;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.line.TdLineAdapter;
import com.huami.treadmill.ui.linedetail.LineDetailActivity;
import com.huami.treadmill.util.DataFormatter;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/huami/treadmill/ui/line/TdLineAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/huami/treadmill/data/TdLine;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "<init>", "()V", "Companion", "TdLineVd", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdLineAdapter extends PagedListAdapter<TdLine, RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DiffUtil.ItemCallback<TdLine> a = new DiffUtil.ItemCallback<TdLine>() { // from class: com.huami.treadmill.ui.line.TdLineAdapter$Companion$POST_COMPARATOR$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(@NotNull TdLine oldItem, @NotNull TdLine newItem) {
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@NotNull TdLine oldItem, @NotNull TdLine newItem) {
            return oldItem.getRunLineId() == newItem.getRunLineId();
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/treadmill/ui/line/TdLineAdapter$Companion;", "", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/huami/treadmill/data/TdLine;", "POST_COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getPOST_COMPARATOR", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DiffUtil.ItemCallback<TdLine> getPOST_COMPARATOR() {
            return TdLineAdapter.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR%\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0015\u001a\n \u0007*\u0004\u0018\u00010\u00110\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0017\u001a\n \u0007*\u0004\u0018\u00010\u00110\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0016\u0010\u0014R%\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00110\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0012\u0010\u0014R%\u0010\u001a\u001a\n \u0007*\u0004\u0018\u00010\u00110\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/huami/treadmill/ui/line/TdLineAdapter$TdLineVd;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/treadmill/data/TdLine;", "line", "", "bindData", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/ImageView;", "b", "Lkotlin/Lazy;", "e", "()Landroid/widget/ImageView;", "icon", "Landroid/widget/TextView;", "c", "getTitle", "()Landroid/widget/TextView;", "title", GoogleApiAvailabilityLight.a, "dis", BaseDeviceStatusActivity.KEY_AREA, "f", "number", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class TdLineVd extends RecyclerView.ViewHolder {

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
            public final TextView invoke() {
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
            public final TextView invoke() {
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
            public final ImageView invoke() {
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
            public final TextView invoke() {
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
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.run_line_title);
            }
        }

        public TdLineVd(@NotNull View view) {
            super(view);
            this.context = view.getContext();
            this.icon = LazyKt__LazyJVMKt.lazy(new c(view));
            this.title = LazyKt__LazyJVMKt.lazy(new e(view));
            this.dis = LazyKt__LazyJVMKt.lazy(new b(view));
            this.area = LazyKt__LazyJVMKt.lazy(new a(view));
            this.number = LazyKt__LazyJVMKt.lazy(new d(view));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:16:0x002c  */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void b(Ref.ObjectRef objectRef, TdLineVd tdLineVd, TdLine tdLine, Ref.ObjectRef objectRef2, View view) {
            String female;
            BoltRunnerData runnerData = ProxyTreadmill.INSTANCE.getInstance().getRunnerData();
            boolean z = false;
            if (runnerData != null && runnerData.getGender() == 1) {
                z = true;
            }
            if (z) {
                StringGenderTuple stringGenderTuple = (StringGenderTuple) objectRef.element;
                if (stringGenderTuple == null) {
                    female = null;
                } else {
                    female = stringGenderTuple.getMale();
                }
            } else {
                StringGenderTuple stringGenderTuple2 = (StringGenderTuple) objectRef.element;
                if (stringGenderTuple2 == null) {
                    female = null;
                } else {
                    female = stringGenderTuple2.getFemale();
                }
            }
            String str = female;
            LineDetailActivity.Companion companion = LineDetailActivity.INSTANCE;
            Context context = tdLineVd.context;
            long runLineId = tdLine.getRunLineId();
            long runLineTime = tdLine.getRunLineTime();
            String runLineTitle = tdLine.getRunLineTitle();
            String runLineIntroduction = tdLine.getRunLineIntroduction();
            Extra extra = (Extra) objectRef2.element;
            companion.startMe(context, runLineId, runLineTime, str, runLineTitle, runLineIntroduction, extra != null ? extra.getLocation() : null, tdLine.getRunLineDis(), tdLine.getRunLineMan());
        }

        private final TextView c() {
            return (TextView) this.area.getValue();
        }

        private final TextView d() {
            return (TextView) this.dis.getValue();
        }

        private final ImageView e() {
            return (ImageView) this.icon.getValue();
        }

        private final TextView f() {
            return (TextView) this.number.getValue();
        }

        private final TextView getTitle() {
            return (TextView) this.title.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
        public final void bindData(@NotNull final TdLine line) {
            String str;
            Type type = new TypeToken<StringGenderTuple>() { // from class: com.huami.treadmill.ui.line.TdLineAdapter$TdLineVd$bindData$typeTuple$1
            }.getType();
            Type type2 = new TypeToken<Extra>() { // from class: com.huami.treadmill.ui.line.TdLineAdapter$TdLineVd$bindData$typeExtra$1
            }.getType();
            StringGenderTuple stringGenderTuple = (StringGenderTuple) HMHttpUtils.getGson().fromJson(line.getRunLineIcon(), type);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = HMHttpUtils.getGson().fromJson(line.getRunLineDetailIcon(), type);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = HMHttpUtils.getGson().fromJson(line.getRunLineArea(), type2);
            BoltRunnerData runnerData = ProxyTreadmill.INSTANCE.getInstance().getRunnerData();
            if (runnerData != null && runnerData.getGender() == 1) {
                Glide.with(e()).load(stringGenderTuple == null ? null : stringGenderTuple.getMale()).apply(TdmillConfig.INSTANCE.getRoundOptions(this.context)).into(e());
            } else {
                Glide.with(e()).load(stringGenderTuple == null ? null : stringGenderTuple.getFemale()).apply(TdmillConfig.INSTANCE.getRoundOptions(this.context)).into(e());
            }
            getTitle().setText(line.getRunLineTitle());
            TextView textViewD = d();
            if (RunnerData.getRunner().isMetric()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format(this.context.getString(R.string.tdmill_format_dis), Arrays.copyOf(new Object[]{Float.valueOf(new BigDecimal(String.valueOf(line.getRunLineDis())).setScale(2, 1).floatValue())}, 1));
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str = String.format(this.context.getString(R.string.tdmill_format_dis_mile), Arrays.copyOf(new Object[]{Float.valueOf(new BigDecimal(DataFormatter.INSTANCE.formatKMDisToMI(line.getRunLineDis())).setScale(2, 1).floatValue())}, 1));
            }
            textViewD.setText(str);
            TextView textViewC = c();
            Extra extra = (Extra) objectRef2.element;
            textViewC.setText(extra != null ? extra.getLocation() : null);
            f().setText(this.context.getResources().getQuantityString(R.plurals.tdmill_run_man_upgrade, line.getRunLineMan(), Integer.valueOf(line.getRunLineMan())));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: gl7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TdLineAdapter.TdLineVd.b(objectRef, this, line, objectRef2, view);
                }
            });
        }
    }

    public TdLineAdapter() {
        super(a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        TdLine item;
        if (!(holder instanceof TdLineVd) || (item = getItem(position)) == null) {
            return;
        }
        ((TdLineVd) holder).bindData(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new TdLineVd(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_td_line, parent, false));
    }
}
