package com.huami.sleepassistant.lib.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chenenyu.router.annotation.Route;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.sleepassistant.apilib.bean.Myself;
import com.huami.sleepassistant.apilib.koin.ScopesAndQualifersKt;
import com.huami.sleepassistant.apilib.vo.SleepAssistantItemVo;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.sleepassistant.lib.utils.SlRecorderEventHelper;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Route({RouterHelper.SLEEP_ASSISTANT_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/SleepAssistantActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initData", "initRecyclerView", "Lcom/huami/sleepassistant/lib/ui/SleepAssistantActivity$TimeStatus;", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/sleepassistant/lib/ui/SleepAssistantActivity$SleepAssistantAdapter;", "x", "Lcom/huami/sleepassistant/lib/ui/SleepAssistantActivity$SleepAssistantAdapter;", "adapter", "", "Lcom/huami/sleepassistant/apilib/vo/SleepAssistantItemVo;", "y", "Ljava/util/List;", "list", "Lcom/huami/sleepassistant/apilib/bean/Myself;", "z", "Lkotlin/Lazy;", "m", "()Lcom/huami/sleepassistant/apilib/bean/Myself;", "myself", "<init>", "()V", "SleepAssistantAdapter", "SleepAssistantViewHolder", "TimeStatus", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SleepAssistantActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private SleepAssistantAdapter adapter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private List<SleepAssistantItemVo> list;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy myself;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BF\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012+\b\u0002\u0010\u0018\u001a%\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R9\u0010\u0018\u001a%\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012j\u0004\u0018\u0001`\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/SleepAssistantActivity$SleepAssistantAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/huami/sleepassistant/apilib/vo/SleepAssistantItemVo;", "a", "Ljava/util/List;", "data", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lcom/huami/sleepassistant/lib/ui/OnSleepAssistantClickListener;", "b", "Lkotlin/jvm/functions/Function1;", "onClickListener", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class SleepAssistantAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private final List<SleepAssistantItemVo> data;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final Function1<Integer, Unit> onClickListener;

        /* JADX WARN: Multi-variable type inference failed */
        public SleepAssistantAdapter() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ SleepAssistantAdapter(List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : function1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<SleepAssistantItemVo> list = this.data;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
            SleepAssistantViewHolder sleepAssistantViewHolder = (SleepAssistantViewHolder) holder;
            sleepAssistantViewHolder.itemView.setTag(Integer.valueOf(position));
            sleepAssistantViewHolder.bind(this.data.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return new SleepAssistantViewHolder(parent, this.onClickListener);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SleepAssistantAdapter(@Nullable List<SleepAssistantItemVo> list, @Nullable Function1<? super Integer, Unit> function1) {
            this.data = list;
            this.onClickListener = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012+\b\u0002\u0010\u000e\u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R9\u0010\u000e\u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006j\u0004\u0018\u0001`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/SleepAssistantActivity$SleepAssistantViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/sleepassistant/apilib/vo/SleepAssistantItemVo;", "item", "", "bind", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "Lcom/huami/sleepassistant/lib/ui/OnSleepAssistantClickListener;", "a", "Lkotlin/jvm/functions/Function1;", "onTopicClickListener", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class SleepAssistantViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private final Function1<Integer, Unit> onTopicClickListener;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<View, Unit> {
            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull View view) {
                Function1 function1 = SleepAssistantViewHolder.this.onTopicClickListener;
                if (function1 == null) {
                    return;
                }
                Object tag = SleepAssistantViewHolder.this.itemView.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
                function1.invoke(Integer.valueOf(((Integer) tag).intValue()));
            }
        }

        public /* synthetic */ SleepAssistantViewHolder(ViewGroup viewGroup, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewGroup, (i & 2) != 0 ? null : function1);
        }

        public final void bind(@NotNull SleepAssistantItemVo item) {
            View view = this.itemView;
            try {
                ((ImageView) view.findViewById(R.id.item_background)).setBackgroundResource(item.getBackground().intValue());
                ((ImageView) view.findViewById(R.id.item_icon)).setBackgroundResource(item.getImage());
                ((TypefaceTextView) view.findViewById(R.id.item_title)).setText(item.getTitle());
                ((TypefaceTextView) view.findViewById(R.id.item_subtitle)).setText(item.getSubTitle());
                ViewExKt.smartClick$default(view, 0L, new a(), 1, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SleepAssistantViewHolder(@NotNull ViewGroup viewGroup, @Nullable Function1<? super Integer, Unit> function1) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sls_item_sleep_assistant, viewGroup, false));
            this.onTopicClickListener = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/SleepAssistantActivity$TimeStatus;", "", "<init>", "(Ljava/lang/String;I)V", "EARLY_MORNING", "MORNING", "NOON", "IN_THE_AFTERNOON", "GOOD_EVENING", "lib_release"}, k = 1, mv = {1, 5, 1})
    public enum TimeStatus {
        EARLY_MORNING,
        MORNING,
        NOON,
        IN_THE_AFTERNOON,
        GOOD_EVENING
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeStatus.values().length];
            iArr[TimeStatus.EARLY_MORNING.ordinal()] = 1;
            iArr[TimeStatus.MORNING.ordinal()] = 2;
            iArr[TimeStatus.NOON.ordinal()] = 3;
            iArr[TimeStatus.IN_THE_AFTERNOON.ordinal()] = 4;
            iArr[TimeStatus.GOOD_EVENING.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public a() {
            super(1);
        }

        public final void a(int i) {
            if (i == 0) {
                Navigator.INSTANCE.startMiMusicPlayer(SleepAssistantActivity.this);
            } else {
                Navigator.INSTANCE.startMiBreatheTraining(SleepAssistantActivity.this);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            SleepAssistantActivity.this.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepAssistantActivity() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.myself = LazyKt__LazyJVMKt.lazy(new Function0<Myself>() { // from class: com.huami.sleepassistant.lib.ui.SleepAssistantActivity$special$$inlined$injectInFt$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.sleepassistant.apilib.bean.Myself, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Myself invoke() {
                return ScopesAndQualifersKt.sleepAssistantScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(Myself.class), qualifier, objArr);
            }
        });
    }

    private final void initData() {
        int i = WhenMappings.$EnumSwitchMapping$0[l().ordinal()];
        if (i == 1) {
            ((TypefaceTextView) findViewById(R.id.sls_sleep_assistant_label)).setText(Intrinsics.stringPlus(getString(R.string.sls_good_early_morning), m().getNickname().invoke()));
        } else if (i == 2) {
            ((TypefaceTextView) findViewById(R.id.sls_sleep_assistant_label)).setText(Intrinsics.stringPlus(getString(R.string.sls_good_morning), m().getNickname().invoke()));
        } else if (i == 3) {
            ((TypefaceTextView) findViewById(R.id.sls_sleep_assistant_label)).setText(Intrinsics.stringPlus(getString(R.string.sls_good_noon), m().getNickname().invoke()));
        } else if (i == 4) {
            ((TypefaceTextView) findViewById(R.id.sls_sleep_assistant_label)).setText(Intrinsics.stringPlus(getString(R.string.sls_good_in_the_afternoon), m().getNickname().invoke()));
        } else if (i == 5) {
            ((TypefaceTextView) findViewById(R.id.sls_sleep_assistant_label)).setText(Intrinsics.stringPlus(getString(R.string.sls_good_evening), m().getNickname().invoke()));
        }
        ArrayList arrayList = new ArrayList();
        this.list = arrayList;
        arrayList.add(new SleepAssistantItemVo(getString(R.string.sls_sleep_title), getString(R.string.sls_sleep_subtitle), R.drawable.sls_sleep_item_icon, Integer.valueOf(R.drawable.sls_sleep_item_bg)));
        List<SleepAssistantItemVo> list = this.list;
        if (list == null) {
            return;
        }
        list.add(new SleepAssistantItemVo(getString(R.string.sls_breathe_training), getString(R.string.sls_breathe_subtitle), R.drawable.sls_breathing_item_icon, Integer.valueOf(R.drawable.sls_breathing_item_bg)));
    }

    private final void initRecyclerView() {
        this.adapter = new SleepAssistantAdapter(this.list, new a());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.sleep_assistant_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        SleepAssistantAdapter sleepAssistantAdapter = this.adapter;
        Objects.requireNonNull(sleepAssistantAdapter);
        recyclerView.setAdapter(sleepAssistantAdapter);
        recyclerView.setItemAnimator(null);
    }

    private final TimeStatus l() {
        int i = new GregorianCalendar().get(11);
        if (5 <= i && i <= 8) {
            return TimeStatus.EARLY_MORNING;
        }
        if (9 <= i && i <= 11) {
            return TimeStatus.MORNING;
        }
        if (12 <= i && i <= 13) {
            return TimeStatus.NOON;
        }
        return 14 <= i && i <= 18 ? TimeStatus.IN_THE_AFTERNOON : TimeStatus.GOOD_EVENING;
    }

    private final Myself m() {
        return (Myself) this.myself.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sls_activity_sleep_assistant);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, 0, true);
        setTitleBarVisible(false);
        ViewExKt.smartClick$default((ImageView) findViewById(R.id.back), 0L, new b(), 1, null);
        initData();
        initRecyclerView();
        SlRecorderEventHelper.BreatheTrainHelper.INSTANCE.inAssistant();
    }
}
