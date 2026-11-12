package com.huami.sleep.sleephome.dialog;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.sleep.R;
import com.huami.sleep.sleephome.vo.ShowActionItemInfo;
import com.huami.sleep.util.ViewUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0015J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001e\u0010\f\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rR\u001c\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R-\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/sleep/sleephome/dialog/SleepMoreActionDialogFragment;", "Lcom/huami/sleep/sleephome/dialog/BaseDialogFragment;", "", "hasPadding", "Landroid/view/View;", "initView", "", "onStart", "Ljava/util/ArrayList;", "Lcom/huami/sleep/sleephome/vo/ShowActionItemInfo;", "Lkotlin/collections/ArrayList;", "data", "setData", "Lcom/huami/sleep/sleephome/dialog/SleepDetailDialogAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "", "e", "Ljava/lang/String;", "getMTag", "()Ljava/lang/String;", "mTag", "f", "Lkotlin/Lazy;", "getDataList", "()Ljava/util/ArrayList;", "dataList", "Lcom/huami/sleep/sleephome/dialog/SleepDetailDialogAdapter;", "g", "getMAapter", "()Lcom/huami/sleep/sleephome/dialog/SleepDetailDialogAdapter;", "mAapter", "Landroidx/recyclerview/widget/RecyclerView;", "h", "Landroidx/recyclerview/widget/RecyclerView;", "listView", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepMoreActionDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "SleepDetatilDialogFragment";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataList = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAapter = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private RecyclerView listView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/sleep/sleephome/dialog/SleepMoreActionDialogFragment$Companion;", "", "Lcom/huami/sleep/sleephome/dialog/SleepMoreActionDialogFragment;", "newInstance", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepMoreActionDialogFragment newInstance() {
            return new SleepMoreActionDialogFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/ArrayList;", "Lcom/huami/sleep/sleephome/vo/ShowActionItemInfo;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ArrayList<ShowActionItemInfo>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<ShowActionItemInfo> invoke() {
            return new ArrayList<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/sleephome/dialog/SleepDetailDialogAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SleepDetailDialogAdapter> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepDetailDialogAdapter invoke() {
            return new SleepDetailDialogAdapter(SleepMoreActionDialogFragment.this.getDataList());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<ShowActionItemInfo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList<ShowActionItemInfo> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setData  " + this.a;
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final ArrayList<ShowActionItemInfo> getDataList() {
        return (ArrayList) this.dataList.getValue();
    }

    @NotNull
    public final SleepDetailDialogAdapter getMAapter() {
        return (SleepDetailDialogAdapter) this.mAapter.getValue();
    }

    @NotNull
    public final String getMTag() {
        return this.mTag;
    }

    @Override // com.huami.sleep.sleephome.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.sleep.sleephome.dialog.BaseDialogFragment
    @SuppressLint({"InflateParams"})
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.sleep_detail_titlebar_right_dialog_layout, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.listView);
        this.listView = recyclerView;
        Objects.requireNonNull(recyclerView);
        recyclerView.setAdapter(getMAapter());
        RecyclerView recyclerView2 = this.listView;
        Objects.requireNonNull(recyclerView2);
        recyclerView2.addItemDecoration(new SimpleDividerItemDecoration(getContext(), R.drawable.sleep_divider_gray));
        return viewInflate;
    }

    @Override // com.huami.sleep.sleephome.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = ViewUtils.getScreenWidth(getActivity()) - ((int) ViewUtils.dp2px(getContext(), 30.0f));
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    public final void setData(@NotNull ArrayList<ShowActionItemInfo> data) {
        HMLog.info(this.mTag, new c(data));
        ArrayList<ShowActionItemInfo> dataList = getDataList();
        dataList.clear();
        dataList.addAll(data);
        getMAapter().notifyDataSetChanged();
    }

    @NotNull
    public final SleepMoreActionDialogFragment setOnItemClickListener(@NotNull SleepDetailDialogAdapter.OnItemClickListener listener) {
        getMAapter().setOnItemClickListener(listener);
        return this;
    }
}
