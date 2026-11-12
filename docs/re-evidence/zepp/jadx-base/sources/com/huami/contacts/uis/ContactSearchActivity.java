package com.huami.contacts.uis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.contacts.R;
import com.huami.contacts.bean.ContactDecorator;
import com.huami.contacts.viewmodel.ContactSearchViewModel;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.widget.toast.CustomToast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R!\u0010\f\u001a\u00060\u0007R\u00020\u00008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/contacts/uis/ContactSearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onPause", "Lcom/huami/contacts/uis/ContactSearchActivity$ViewController;", "a", "Lkotlin/Lazy;", "c", "()Lcom/huami/contacts/uis/ContactSearchActivity$ViewController;", "searchViewControl", "Lcom/huami/contacts/viewmodel/ContactSearchViewModel;", "b", GoogleApiAvailabilityLight.a, "()Lcom/huami/contacts/viewmodel/ContactSearchViewModel;", "viewModel", "Lcom/huami/contacts/uis/PhoneContactsAdapter;", "Lcom/huami/contacts/uis/PhoneContactsAdapter;", "searchContactsAdapter", "", "Ljava/lang/String;", "overCountAlertToast", "<init>", "()V", "Companion", "ViewController", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final class ContactSearchActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String f = "over_count_alert";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy searchViewControl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final PhoneContactsAdapter searchContactsAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String overCountAlertToast;
    private HashMap e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/contacts/uis/ContactSearchActivity$Companion;", "", "Landroid/app/Activity;", "activity", "", "overCountAlert", "", WebConstant.QueryParam.LAUNCH, "EXTRA_OVER_COUNT_ALERT", "Ljava/lang/String;", "<init>", "()V", "contacts_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void launch$default(Companion companion, Activity activity, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            companion.launch(activity, str);
        }

        @JvmStatic
        public final void launch(@NotNull Activity activity, @Nullable String overCountAlert) {
            Intent intent = new Intent(activity, (Class<?>) ContactSearchActivity.class);
            intent.putExtra(ContactSearchActivity.f, overCountAlert);
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/huami/contacts/uis/ContactSearchActivity$ViewController;", "", "", "a", "setUp", "showInput", "showSearchResult", "showEmptyResult", "quiteSearch", "hideKeyboard", "<init>", "(Lcom/huami/contacts/uis/ContactSearchActivity;)V", "contacts_release"}, k = 1, mv = {1, 4, 1})
    public final class ViewController {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((EditText) ContactSearchActivity.this._$_findCachedViewById(R.id.input_et)).setText("");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewController.this.quiteSearch();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewController.this.quiteSearch();
            }
        }

        public ViewController() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a() {
            ((RecyclerView) ContactSearchActivity.this._$_findCachedViewById(R.id.search_result_rv)).setVisibility(8);
            ((ConstraintLayout) ContactSearchActivity.this._$_findCachedViewById(R.id.search_none_layout)).setVisibility(8);
        }

        public final void hideKeyboard() {
            InputMethodManager inputMethodManager = (InputMethodManager) ContactSearchActivity.this.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(ContactSearchActivity.this.getWindow().getDecorView().getWindowToken(), 0);
            }
        }

        public final void quiteSearch() {
            hideKeyboard();
            ContactSearchActivity.this.finish();
        }

        public final void setUp() {
            ((AppCompatImageView) ContactSearchActivity.this._$_findCachedViewById(R.id.cancel_iv)).setOnClickListener(new a());
            ((AppCompatTextView) ContactSearchActivity.this._$_findCachedViewById(R.id.cancel_tv)).setOnClickListener(new b());
            ((EditText) ContactSearchActivity.this._$_findCachedViewById(R.id.input_et)).addTextChangedListener(new TextWatcher() { // from class: com.huami.contacts.uis.ContactSearchActivity$ViewController$setUp$$inlined$addTextChangedListener$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable s) {
                    String strValueOf = String.valueOf(s);
                    ContactSearchActivity.this.d().search(strValueOf);
                    if (strValueOf.length() == 0) {
                        this.a.a();
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
                }
            });
            ((RainbowTitleBar) ContactSearchActivity.this._$_findCachedViewById(R.id.title_bar)).setNavigationOnClickListener(new c());
            showInput();
        }

        public final void showEmptyResult() {
            ((ConstraintLayout) ContactSearchActivity.this._$_findCachedViewById(R.id.search_none_layout)).setVisibility(0);
        }

        public final void showInput() {
            ((AppCompatTextView) ContactSearchActivity.this._$_findCachedViewById(R.id.cancel_tv)).setVisibility(0);
            ((AppCompatImageView) ContactSearchActivity.this._$_findCachedViewById(R.id.cancel_iv)).setVisibility(0);
            ((EditText) ContactSearchActivity.this._$_findCachedViewById(R.id.input_et)).requestFocus();
            a();
        }

        public final void showSearchResult() {
            ((RecyclerView) ContactSearchActivity.this._$_findCachedViewById(R.id.search_result_rv)).setVisibility(0);
            ((ConstraintLayout) ContactSearchActivity.this._$_findCachedViewById(R.id.search_none_layout)).setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/huami/contacts/bean/ContactDecorator;", "kotlin.jvm.PlatformType", "results", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 4, 1})
    public static final class a<T> implements Observer<List<? extends ContactDecorator>> {
        public a() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(List<ContactDecorator> list) {
            if (list == null || list.isEmpty()) {
                ContactSearchActivity.this.c().showEmptyResult();
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new ItemBean((ContactDecorator) it2.next(), 2));
            }
            ContactSearchActivity.this.searchContactsAdapter.updateItems(arrayList);
            ContactSearchActivity.this.searchContactsAdapter.notifyDataSetChanged();
            ContactSearchActivity.this.c().showSearchResult();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/contacts/uis/ContactSearchActivity$ViewController;", "Lcom/huami/contacts/uis/ContactSearchActivity;", "a", "()Lcom/huami/contacts/uis/ContactSearchActivity$ViewController;"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<ViewController> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewController getA() {
            return ContactSearchActivity.this.new ViewController();
        }
    }

    public ContactSearchActivity() {
        super(R.layout.activity_search);
        this.searchViewControl = LazyKt__LazyJVMKt.lazy(new b());
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ContactSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.contacts.uis.ContactSearchActivity$$special$$inlined$viewModels$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.contacts.uis.ContactSearchActivity$$special$$inlined$viewModels$1
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
        this.searchContactsAdapter = new PhoneContactsAdapter(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewController c() {
        return (ViewController) this.searchViewControl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactSearchViewModel d() {
        return (ContactSearchViewModel) this.viewModel.getValue();
    }

    @JvmStatic
    public static final void launch(@NotNull Activity activity, @Nullable String str) {
        INSTANCE.launch(activity, str);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.e;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        View view = (View) this.e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.e.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.overCountAlertToast = getIntent().getStringExtra(f);
        c().setUp();
        ((RecyclerView) _$_findCachedViewById(R.id.search_result_rv)).setAdapter(this.searchContactsAdapter);
        d().getSearchResultLiveData().observe(this, new a());
        this.searchContactsAdapter.setItemSelectListener(new ItemEventListener() { // from class: com.huami.contacts.uis.ContactSearchActivity.onCreate.2
            @Override // com.huami.contacts.uis.ItemEventListener
            public boolean allowAction(boolean select) {
                boolean zAllowSelect = ContactSearchActivity.this.d().allowSelect(select);
                if (!zAllowSelect) {
                    String str = ContactSearchActivity.this.overCountAlertToast;
                    if (!(str == null || str.length() == 0)) {
                        ContactSearchActivity contactSearchActivity = ContactSearchActivity.this;
                        CustomToast.showShort(contactSearchActivity, contactSearchActivity.overCountAlertToast);
                    }
                }
                return zAllowSelect;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
