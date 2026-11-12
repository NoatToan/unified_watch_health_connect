package com.xiaomi.hm.health.ui.diagnosis;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.feedback.api.FeedbackParams;
import com.huami.feedback.api.FeedbackService;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.diagnosis.PhenomenaDialog;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\tH\u0014R&\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/ui/diagnosis/PhenomenaDialog;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "Lorg/koin/core/component/KoinComponent;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "initView", "", "hasPadding", "hasBackground", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "e", "Ljava/util/ArrayList;", "phenomena", "Lcom/huami/feedback/api/FeedbackService;", "f", "Lkotlin/Lazy;", "()Lcom/huami/feedback/api/FeedbackService;", "feedbackService", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PhenomenaDialog extends BaseDialogFragment implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_CONTENT = "content";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private ArrayList<String> phenomena = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy feedbackService;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/ui/diagnosis/PhenomenaDialog$Companion;", "", "Lcom/xiaomi/hm/health/ui/diagnosis/DiagnosisActivity;", "activity", "", "showDialog", "", "KEY_CONTENT", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void showDialog(@NotNull DiagnosisActivity activity) {
            new PhenomenaDialog().show(activity.getSupportFragmentManager(), "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhenomenaDialog() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.feedbackService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FeedbackService>() { // from class: com.xiaomi.hm.health.ui.diagnosis.PhenomenaDialog$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.feedback.api.FeedbackService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FeedbackService invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FeedbackService.class), qualifier, objArr);
            }
        });
    }

    private final FeedbackService e() {
        return (FeedbackService) this.feedbackService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(PhenomenaDialog phenomenaDialog, View view) {
        phenomenaDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(PhenomenaDialog phenomenaDialog, AdapterView adapterView, View view, int i, long j) {
        String str;
        if (i == 0) {
            str = "";
        } else {
            str = phenomenaDialog.getString(R.string.tag_notification) + "\n" + ((Object) phenomenaDialog.phenomena.get(i));
        }
        String str2 = str;
        Context context = phenomenaDialog.getContext();
        if (context != null) {
            phenomenaDialog.e().feedback(null, context, phenomenaDialog.getParentFragmentManager(), new FeedbackParams(str2, null, null, null, false, 30, null));
        }
        phenomenaDialog.dismiss();
    }

    @JvmStatic
    public static final void showDialog(@NotNull DiagnosisActivity diagnosisActivity) {
        INSTANCE.showDialog(diagnosisActivity);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_keep_alive_change_system, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_title)).setText(getString(R.string.title_feedback_dialog));
        viewInflate.findViewById(R.id.keep_alive_fragment_cancel).setOnClickListener(new View.OnClickListener() { // from class: iv5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhenomenaDialog.f(this.a, view);
            }
        });
        ListView listView = (ListView) viewInflate.findViewById(R.id.keep_alive_fragment_list);
        listView.setAdapter((ListAdapter) new BaseAdapter() { // from class: com.xiaomi.hm.health.ui.diagnosis.PhenomenaDialog.initView.2
            @Override // android.widget.Adapter
            public int getCount() {
                return PhenomenaDialog.this.phenomena.size();
            }

            @Override // android.widget.Adapter
            public long getItemId(int position) {
                return position;
            }

            @Override // android.widget.Adapter
            @SuppressLint({"ViewHolder"})
            @NotNull
            public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
                View viewInflate2 = LayoutInflater.from(PhenomenaDialog.this.getContext()).inflate(R.layout.item_notification_issue, parent, false);
                ((TextView) viewInflate2.findViewById(R.id.item_keep_alive_tv)).setText(getItem(position));
                if (position == 0) {
                    ((ImageView) viewInflate2.findViewById(R.id.item_keep_alive_arrow)).setImageResource(R.drawable.ic_select);
                }
                return viewInflate2;
            }

            @Override // android.widget.Adapter
            @NotNull
            public String getItem(int position) {
                return (String) PhenomenaDialog.this.phenomena.get(position);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: jv5
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                PhenomenaDialog.g(this.a, adapterView, view, i, j);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, SystemBarTintSupport.isSupport(getActivity()) ? R.style.DimPanelTint : R.style.DimPanel);
        this.phenomena = CollectionsKt__CollectionsKt.arrayListOf(getString(R.string.feedback_directly), getString(R.string.notify_after_unlock), getString(R.string.already_grant_notification_permission), getString(R.string.phone_without_name), getString(R.string.phone_end_all), getString(R.string.notify_multiple), getString(R.string.do_not_notify_only_some_apps), getString(R.string.all_apps_do_not_notify), getString(R.string.do_not_notify_app_calls));
    }
}
