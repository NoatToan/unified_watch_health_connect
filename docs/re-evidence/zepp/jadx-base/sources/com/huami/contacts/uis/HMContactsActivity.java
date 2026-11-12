package com.huami.contacts.uis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.contacts.R;
import com.huami.contacts.bean.ContactDecorator;
import com.huami.contacts.bean.PhoneContact;
import com.huami.contacts.indexbar.IndexBar;
import com.huami.contacts.indexbar.IndexBean;
import com.huami.contacts.viewmodel.HMContactsViewModel;
import com.huami.contacts.viewmodel.ShareContactsDataPool;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.widget.toast.CustomToast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/contacts/uis/HMContactsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initData", "setResult", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Lcom/huami/contacts/viewmodel/HMContactsViewModel;", "a", "Lkotlin/Lazy;", "c", "()Lcom/huami/contacts/viewmodel/HMContactsViewModel;", "viewModel", "Lcom/huami/contacts/uis/PhoneContactsAdapter;", "b", "Lcom/huami/contacts/uis/PhoneContactsAdapter;", "allContactsAdapter", "", "Ljava/lang/String;", "overCountAlertToast", "<init>", "()V", "Companion", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final class HMContactsActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String e = "selected_contact";
    private static final String f = "limit_count";
    private static final String g = "over_count_alert";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PhoneContactsAdapter allContactsAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String overCountAlertToast;
    private HashMap d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J.\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007R\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/contacts/uis/HMContactsActivity$Companion;", "", "Landroid/app/Activity;", "activity", "", "requestCode", "limitCount", "", "overCountAlert", "", WebConstant.QueryParam.LAUNCH, "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/content/Intent;", "intent", "", "Lcom/huami/contacts/bean/PhoneContact;", "fetchData", "EXTRA_LIMIT_COUNT", "Ljava/lang/String;", "EXTRA_OVER_COUNT_ALERT", "EXTRA_SELECTED_CONTACT", "<init>", "()V", "contacts_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void launch$default(Companion companion, Activity activity, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i2 = ShareContactsDataPool.INSTANCE.getNO_LIMIT_COUNT();
            }
            if ((i3 & 8) != 0) {
                str = null;
            }
            companion.launch(activity, i, i2, str);
        }

        @JvmStatic
        @NotNull
        public final List<PhoneContact> fetchData(@Nullable Intent intent) {
            ArrayList parcelableArrayListExtra;
            return (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra(HMContactsActivity.e)) == null) ? CollectionsKt__CollectionsKt.emptyList() : parcelableArrayListExtra;
        }

        @JvmStatic
        public final void launch(@NotNull Activity activity, int requestCode, int limitCount, @Nullable String overCountAlert) {
            Intent intent = new Intent(activity, (Class<?>) HMContactsActivity.class);
            if (limitCount <= 0) {
                limitCount = ShareContactsDataPool.INSTANCE.getNO_LIMIT_COUNT();
            }
            intent.putExtra(HMContactsActivity.f, limitCount);
            intent.putExtra(HMContactsActivity.g, overCountAlert);
            activity.startActivityForResult(intent, requestCode);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void launch$default(Companion companion, Fragment fragment, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i2 = ShareContactsDataPool.INSTANCE.getNO_LIMIT_COUNT();
            }
            if ((i3 & 8) != 0) {
                str = null;
            }
            companion.launch(fragment, i, i2, str);
        }

        @JvmStatic
        public final void launch(@NotNull Fragment fragment, int requestCode, int limitCount, @Nullable String overCountAlert) {
            Intent intent = new Intent(fragment.requireContext(), (Class<?>) HMContactsActivity.class);
            if (limitCount <= 0) {
                ShareContactsDataPool.INSTANCE.getNO_LIMIT_COUNT();
            }
            intent.putExtra(HMContactsActivity.f, limitCount);
            intent.putExtra(HMContactsActivity.g, overCountAlert);
            fragment.startActivityForResult(intent, requestCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010%\n\u0002\u0010\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", "Lcom/huami/contacts/bean/ContactDecorator;", "kotlin.jvm.PlatformType", "contactsMap", "", "a", "(Ljava/util/Map;)V"}, k = 3, mv = {1, 4, 1})
    public static final class a<T> implements Observer<Map<Character, List<? extends ContactDecorator>>> {
        public a() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(Map<Character, List<ContactDecorator>> map) {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (Map.Entry<Character, List<ContactDecorator>> entry : map.entrySet()) {
                char cCharValue = entry.getKey().charValue();
                List<ContactDecorator> value = entry.getValue();
                linkedHashMap.put(Character.valueOf(cCharValue), Integer.valueOf(i));
                arrayList.add(new ItemBean(Character.valueOf(cCharValue), 1));
                i++;
                Iterator<T> it2 = value.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new ItemBean((ContactDecorator) it2.next(), 2));
                    i++;
                }
            }
            HMContactsActivity.this.allContactsAdapter.updateItems(arrayList);
            HMContactsActivity.this.allContactsAdapter.notifyDataSetChanged();
            ArrayList arrayList2 = new ArrayList();
            Iterator<Character> it3 = ShareContactsDataPool.INSTANCE.getGROUP_INDEX().iterator();
            while (it3.hasNext()) {
                char cCharValue2 = it3.next().charValue();
                Integer num = (Integer) linkedHashMap.get(Character.valueOf(cCharValue2));
                arrayList2.add(new IndexBean(String.valueOf(cCharValue2), num != null, num));
            }
            ((IndexBar) HMContactsActivity.this._$_findCachedViewById(R.id.index_bar)).setIndex(arrayList2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ContactSearchActivity.Companion companion = ContactSearchActivity.INSTANCE;
            HMContactsActivity hMContactsActivity = HMContactsActivity.this;
            companion.launch(hMContactsActivity, hMContactsActivity.overCountAlertToast);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HMContactsActivity.this.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", ViewHierarchyConstants.VIEW_KEY, "", "which", "", "onClick", "(Landroid/view/View;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d implements RainbowTitleBar.OnActionMenuClickListener {
        public d() {
        }

        @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
        public final void onClick(View view, int i) {
            HMContactsActivity.this.setResult();
            HMContactsActivity.this.finish();
        }
    }

    public HMContactsActivity() {
        super(R.layout.activity_hm_contacts);
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HMContactsViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.contacts.uis.HMContactsActivity$$special$$inlined$viewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.contacts.uis.HMContactsActivity$$special$$inlined$viewModels$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                return this.getDefaultViewModelProviderFactory();
            }
        });
        this.allContactsAdapter = new PhoneContactsAdapter(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMContactsViewModel c() {
        return (HMContactsViewModel) this.viewModel.getValue();
    }

    private final void d() {
        this.allContactsAdapter.setItemSelectListener(new ItemEventListener() { // from class: com.huami.contacts.uis.HMContactsActivity$setUpRecyclerView$1
            @Override // com.huami.contacts.uis.ItemEventListener
            public boolean allowAction(boolean select) {
                boolean zAllowSelect = this.a.c().allowSelect(select);
                if (!zAllowSelect) {
                    String str = this.a.overCountAlertToast;
                    if (!(str == null || str.length() == 0)) {
                        HMContactsActivity hMContactsActivity = this.a;
                        CustomToast.showShort(hMContactsActivity, hMContactsActivity.overCountAlertToast);
                    }
                }
                return zAllowSelect;
            }
        });
        ((RecyclerView) _$_findCachedViewById(R.id.all_contacts_rv)).setAdapter(this.allContactsAdapter);
        ((IndexBar) _$_findCachedViewById(R.id.index_bar)).setOnIndexChangedListener(new IndexBar.OnIndexChangedListener() { // from class: com.huami.contacts.uis.HMContactsActivity$setUpRecyclerView$2
            @Override // com.huami.contacts.indexbar.IndexBar.OnIndexChangedListener
            public void onIndexChanged(@NotNull IndexBean index) {
                if (!(index.getObj() instanceof Integer) || ((Number) index.getObj()).intValue() < 0) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.a._$_findCachedViewById(R.id.all_contacts_rv)).getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(((Number) index.getObj()).intValue(), 0);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final List<PhoneContact> fetchData(@Nullable Intent intent) {
        return INSTANCE.fetchData(intent);
    }

    private final void initData() {
        c().setSelectLimit(getIntent().getIntExtra(f, ShareContactsDataPool.INSTANCE.getNO_LIMIT_COUNT()));
        this.overCountAlertToast = getIntent().getStringExtra(g);
    }

    @JvmStatic
    public static final void launch(@NotNull Activity activity, int i, int i2, @Nullable String str) {
        INSTANCE.launch(activity, i, i2, str);
    }

    @JvmStatic
    public static final void launch(@NotNull Fragment fragment, int i, int i2, @Nullable String str) {
        INSTANCE.launch(fragment, i, i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setResult() {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra(e, c().getSelectedContact());
        setResult(-1, intent);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.d;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        View view = (View) this.d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.d.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        d();
        c().getContactsLiveData().observe(this, new a());
        ((ConstraintLayout) _$_findCachedViewById(R.id.input_layout)).setOnClickListener(new b());
        int i = R.id.title_bar;
        ((RainbowTitleBar) _$_findCachedViewById(i)).setNavigationOnClickListener(new c());
        ((RainbowTitleBar) _$_findCachedViewById(i)).setOnActionMenuClickListener(new d());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.allContactsAdapter.notifyDataSetChanged();
    }
}
