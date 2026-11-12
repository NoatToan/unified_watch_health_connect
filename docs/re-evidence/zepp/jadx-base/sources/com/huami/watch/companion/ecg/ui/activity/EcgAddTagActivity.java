package com.huami.watch.companion.ecg.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.arch.AddEcgTagViewModel;
import com.huami.watch.companion.ecg.model.TagSection;
import com.huami.watch.companion.ecg.ui.activity.EcgAddTagActivity;
import com.huami.watch.companion.ecg.ui.adapter.EcgTagAdapter;
import com.huami.watch.companion.ecg.ui.helper.LoadingDialogHelper;
import com.huami.watch.companion.ecg.util.EcgTagEnum;
import com.loc.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR%\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/huami/watch/companion/ecg/ui/activity/EcgAddTagActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initView", GoogleApiAvailabilityLight.b, "r", "v", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/watch/companion/ecg/arch/AddEcgTagViewModel;", "a", "Lkotlin/Lazy;", "m", "()Lcom/huami/watch/companion/ecg/arch/AddEcgTagViewModel;", "mViewModel", "Landroid/view/View;", "kotlin.jvm.PlatformType", "b", hl.k, "()Landroid/view/View;", "mCustomTagView", "Lcom/huami/watch/companion/ecg/ui/adapter/EcgTagAdapter;", "c", z.j, "()Lcom/huami/watch/companion/ecg/ui/adapter/EcgTagAdapter;", "mAdapter", "", GoogleApiAvailabilityLight.a, "i", "()J", "ecgId", "Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "e", "l", "()Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "mDialogHelper", "<init>", "()V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgAddTagActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "ecgId";
    private static final int g = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mCustomTagView = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy ecgId = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialogHelper = LazyKt__LazyJVMKt.lazy(new d());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/activity/EcgAddTagActivity$Companion;", "", "Landroidx/fragment/app/Fragment;", "fragment", "", "ecgId", "", "start", "", "ARG_ECG_ID", "Ljava/lang/String;", "", "TAG_COLUMN", LogUtil.I, "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Fragment fragment, long ecgId) {
            Intent intent = new Intent(fragment.getContext(), (Class<?>) EcgAddTagActivity.class);
            intent.putExtra("ecgId", ecgId);
            fragment.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Long> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final Long getA() {
            return Long.valueOf(EcgAddTagActivity.this.getIntent().getLongExtra("ecgId", 0L));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/adapter/EcgTagAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<EcgTagAdapter> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgTagAdapter getA() {
            return new EcgTagAdapter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<View> {
        public c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            return View.inflate(EcgAddTagActivity.this, R.layout.view_ecg_tag_footer, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<LoadingDialogHelper> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper getA() {
            return new LoadingDialogHelper(EcgAddTagActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/arch/AddEcgTagViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<AddEcgTagViewModel> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AddEcgTagViewModel getA() {
            return (AddEcgTagViewModel) new ViewModelProvider(EcgAddTagActivity.this).get(AddEcgTagViewModel.class);
        }
    }

    private final long i() {
        return ((Number) this.ecgId.getValue()).longValue();
    }

    private final void initView() {
        int i = R.id.actionbar;
        ((RainbowTitleBar) findViewById(i)).setNavigationOnClickListener(new View.OnClickListener() { // from class: wf1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgAddTagActivity.p(this.a, view);
            }
        });
        ((RainbowTitleBar) findViewById(i)).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: bg1
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i2) {
                EcgAddTagActivity.q(this.a, view, i2);
            }
        });
    }

    private final EcgTagAdapter j() {
        return (EcgTagAdapter) this.mAdapter.getValue();
    }

    private final View k() {
        return (View) this.mCustomTagView.getValue();
    }

    private final LoadingDialogHelper l() {
        return (LoadingDialogHelper) this.mDialogHelper.getValue();
    }

    private final AddEcgTagViewModel m() {
        return (AddEcgTagViewModel) this.mViewModel.getValue();
    }

    private final void n() {
        int i = R.id.tag_list;
        ((RecyclerView) findViewById(i)).setLayoutManager(new GridLayoutManager(this, 3));
        ((RecyclerView) findViewById(i)).setAdapter(j());
        j().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: ag1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                EcgAddTagActivity.o(this.a, baseQuickAdapter, view, i2);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TagSection(true, getString(R.string.ecg_tag_type_scene)));
        List<EcgTagEnum> sceneTagList = EcgTagEnum.INSTANCE.getSceneTagList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sceneTagList, 10));
        Iterator<T> it2 = sceneTagList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new TagSection((EcgTagEnum) it2.next()));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new TagSection(true, getString(R.string.ecg_tag_type_body)));
        List<EcgTagEnum> bodyTagList = EcgTagEnum.INSTANCE.getBodyTagList();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(bodyTagList, 10));
        Iterator<T> it3 = bodyTagList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new TagSection((EcgTagEnum) it3.next()));
        }
        arrayList.addAll(arrayList3);
        arrayList.add(new TagSection(true, getString(R.string.ecg_tag_type_emotion)));
        List<EcgTagEnum> emotionTagList = EcgTagEnum.INSTANCE.getEmotionTagList();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(emotionTagList, 10));
        Iterator<T> it4 = emotionTagList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new TagSection((EcgTagEnum) it4.next()));
        }
        arrayList.addAll(arrayList4);
        j().setNewData(arrayList);
        j().setFooterView(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(EcgAddTagActivity ecgAddTagActivity, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TagSection tagSection = (TagSection) ecgAddTagActivity.j().getItem(i);
        if (tagSection == null || tagSection.isHeader) {
            return;
        }
        ecgAddTagActivity.m().addTag((EcgTagEnum) tagSection.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(EcgAddTagActivity ecgAddTagActivity, View view) {
        ecgAddTagActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(EcgAddTagActivity ecgAddTagActivity, View view, int i) {
        if (i == 0) {
            ecgAddTagActivity.v();
        }
    }

    private final void r() {
        m().getCustomTagLiveData().observe(this, new Observer() { // from class: yf1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgAddTagActivity.u(this.a, (String) obj);
            }
        });
        m().getStringTagLiveData().observe(this, new Observer() { // from class: zf1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgAddTagActivity.s(this.a, (Set) obj);
            }
        });
        m().getSaveStatusLiveData().observe(this, new Observer() { // from class: xf1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgAddTagActivity.t(this.a, (Result) obj);
            }
        });
        m().setEcgTag(i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(EcgAddTagActivity ecgAddTagActivity, Set set) {
        if (set == null) {
            return;
        }
        ecgAddTagActivity.j().setTags(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(EcgAddTagActivity ecgAddTagActivity, Result result) {
        ecgAddTagActivity.l().showOrError(result, ecgAddTagActivity.getString(R.string.ecg_tag_saving), "", ecgAddTagActivity.getString(R.string.ecg_tag_save_error));
        if (result != null && result.isSuccess()) {
            ecgAddTagActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(EcgAddTagActivity ecgAddTagActivity, String str) {
        if (str == null) {
            return;
        }
        View viewK = ecgAddTagActivity.k();
        int i = R.id.custom_tag;
        ((EditText) viewK.findViewById(i)).setText(str);
        ((EditText) ecgAddTagActivity.k().findViewById(i)).setSelection(str.length());
    }

    private final void v() {
        AddEcgTagViewModel addEcgTagViewModelM = m();
        String string = ((EditText) k().findViewById(R.id.custom_tag)).getText().toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
        addEcgTagViewModelM.saveTag(StringsKt__StringsKt.trim(string).toString());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecg_add_tag);
        initView();
        n();
        r();
    }
}
