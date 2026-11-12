package com.xiaomi.hm.health.ui.smartplay.btphone.contact;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.contacts.bean.PhoneContact;
import com.huami.contacts.uis.HMContactsActivity;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.widget.TipComponent;
import com.huami.sleep.sleephome.vo.ShowActionItemInfo;
import com.huami.tools.log.HMLog;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactFragment;
import com.xiaomi.hm.health.utils.TelephonyUtil;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactFragment;", "Landroidx/fragment/app/Fragment;", "", ShowActionItemInfo.EDIT, "", "z", "show", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onResume", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactViewModel;", "a", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactViewModel;", "viewModel", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactAdapter;", "b", "Lkotlin/Lazy;", "m", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactAdapter;", "adapter", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BtContactFragment extends Fragment {
    private static final int c = 10;

    @NotNull
    private static final String d = "BtContactFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private BtContactViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BtContactAdapter> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BtContactAdapter getA() {
            return new BtContactAdapter(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    private final void A(boolean show) {
        View view = getView();
        ((TipComponent) (view == null ? null : view.findViewById(R.id.permission_tips))).setVisibility(show ? 0 : 8);
        View view2 = getView();
        ((LinearLayout) (view2 == null ? null : view2.findViewById(R.id.layout_add))).setEnabled(!show);
        View view3 = getView();
        ((ImageView) (view3 == null ? null : view3.findViewById(R.id.iv_add))).setEnabled(!show);
        View view4 = getView();
        ((TextView) (view4 == null ? null : view4.findViewById(R.id.tv_add))).setEnabled(!show);
        View view5 = getView();
        ((LinearLayout) (view5 == null ? null : view5.findViewById(R.id.layout_edit))).setEnabled(!show);
        View view6 = getView();
        ((ImageView) (view6 == null ? null : view6.findViewById(R.id.iv_edit))).setEnabled(!show);
        View view7 = getView();
        ((TextView) (view7 != null ? view7.findViewById(R.id.tv_edit) : null)).setEnabled(!show);
    }

    private final BtContactAdapter m() {
        return (BtContactAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BtContactFragment btContactFragment, List list) {
        btContactFragment.m().update(list);
        btContactFragment.m().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(BtContactFragment btContactFragment, Boolean bool) {
        if (bool != null) {
            btContactFragment.A(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(BtContactFragment btContactFragment, Boolean bool) {
        View view = btContactFragment.getView();
        ((LinearLayout) (view == null ? null : view.findViewById(R.id.layout_add))).setEnabled(bool.booleanValue());
        View view2 = btContactFragment.getView();
        ((ImageView) (view2 == null ? null : view2.findViewById(R.id.iv_add))).setEnabled(bool.booleanValue());
        View view3 = btContactFragment.getView();
        ((TextView) (view3 != null ? view3.findViewById(R.id.tv_add) : null)).setEnabled(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(BtContactFragment btContactFragment, Boolean bool) {
        btContactFragment.z(bool.booleanValue());
        btContactFragment.m().setEditMode(bool.booleanValue());
        btContactFragment.m().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(BtContactFragment btContactFragment, View view) {
        FragmentKt.findNavController(btContactFragment).popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(BtContactFragment btContactFragment, View view) {
        BtContactViewModel btContactViewModel = btContactFragment.viewModel;
        Objects.requireNonNull(btContactViewModel);
        btContactViewModel.cancelEdit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(BtContactFragment btContactFragment, View view, int i) {
        BtContactViewModel btContactViewModel = btContactFragment.viewModel;
        Objects.requireNonNull(btContactViewModel);
        btContactViewModel.savePositionChange(btContactFragment.m().getPositionChangeEvents());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(BtContactFragment btContactFragment, View view) {
        BtContactViewModel btContactViewModel = btContactFragment.viewModel;
        Objects.requireNonNull(btContactViewModel);
        btContactViewModel.setEditMode(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(BtContactFragment btContactFragment, View view) {
        HMContactsActivity.Companion companion = HMContactsActivity.INSTANCE;
        BtContactViewModel btContactViewModel = btContactFragment.viewModel;
        Objects.requireNonNull(btContactViewModel);
        HMContactsActivity.Companion.launch$default(companion, btContactFragment, 10, btContactViewModel.getAllowSelectCount(), (String) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(final BtContactFragment btContactFragment, View view) {
        new RxPermissions(btContactFragment.requireActivity()).request("android.permission.READ_CONTACTS").subscribe(new Consumer() { // from class: y70
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BtContactFragment.x(this.a, (Boolean) obj);
            }
        }, new Consumer() { // from class: z70
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BtContactFragment.y((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(BtContactFragment btContactFragment, Boolean bool) {
        if (bool.booleanValue()) {
            TelephonyUtil.INSTANCE.preReadContacts(btContactFragment.requireContext(), d);
        }
        BtContactViewModel btContactViewModel = btContactFragment.viewModel;
        Objects.requireNonNull(btContactViewModel);
        btContactViewModel.onPermission(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Throwable th) {
        HMLog.warn$default(null, th, b.a, 1, null);
    }

    private final void z(boolean edit) {
        if (edit) {
            View view = getView();
            ((RainbowTitleBar) (view == null ? null : view.findViewById(R.id.tool_bar))).setVisibility(8);
            View view2 = getView();
            ((RainbowTitleBar) (view2 == null ? null : view2.findViewById(R.id.tool_bar_edit))).setVisibility(0);
        } else {
            View view3 = getView();
            ((RainbowTitleBar) (view3 == null ? null : view3.findViewById(R.id.tool_bar))).setVisibility(0);
            View view4 = getView();
            ((RainbowTitleBar) (view4 == null ? null : view4.findViewById(R.id.tool_bar_edit))).setVisibility(8);
        }
        View view5 = getView();
        ExtKt.setVisible$default(view5 == null ? null : view5.findViewById(R.id.cl_edit_controller), !edit, false, 2, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        BtContactViewModel btContactViewModel = this.viewModel;
        Objects.requireNonNull(btContactViewModel);
        btContactViewModel.getAllowAddData().observe(getViewLifecycleOwner(), new Observer() { // from class: e80
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtContactFragment.p(this.a, (Boolean) obj);
            }
        });
        BtContactViewModel btContactViewModel2 = this.viewModel;
        Objects.requireNonNull(btContactViewModel2);
        btContactViewModel2.getShowEditModeData().observe(getViewLifecycleOwner(), new Observer() { // from class: g80
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtContactFragment.q(this.a, (Boolean) obj);
            }
        });
        BtContactViewModel btContactViewModel3 = this.viewModel;
        Objects.requireNonNull(btContactViewModel3);
        btContactViewModel3.getItemData().observe(getViewLifecycleOwner(), new Observer() { // from class: h80
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtContactFragment.n(this.a, (List) obj);
            }
        });
        BtContactViewModel btContactViewModel4 = this.viewModel;
        Objects.requireNonNull(btContactViewModel4);
        btContactViewModel4.getShowPermissionAlertLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: f80
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BtContactFragment.o(this.a, (Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            List<PhoneContact> listFetchData = HMContactsActivity.INSTANCE.fetchData(data);
            BtContactViewModel btContactViewModel = this.viewModel;
            Objects.requireNonNull(btContactViewModel);
            btContactViewModel.addFriends(listFetchData);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.viewModel = (BtContactViewModel) new ViewModelProvider(this).get(BtContactViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bt_contact, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BtContactViewModel btContactViewModel = this.viewModel;
        Objects.requireNonNull(btContactViewModel);
        btContactViewModel.checkPermission();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ((RainbowTitleBar) (view2 == null ? null : view2.findViewById(R.id.tool_bar))).setNavigationOnClickListener(new View.OnClickListener() { // from class: x70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BtContactFragment.r(this.a, view3);
            }
        });
        View view3 = getView();
        ((RainbowTitleBar) (view3 == null ? null : view3.findViewById(R.id.tool_bar_edit))).setNavigationOnClickListener(new View.OnClickListener() { // from class: b80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                BtContactFragment.s(this.a, view4);
            }
        });
        View view4 = getView();
        ((RainbowTitleBar) (view4 == null ? null : view4.findViewById(R.id.tool_bar_edit))).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: i80
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view5, int i) {
                BtContactFragment.t(this.a, view5, i);
            }
        });
        View view5 = getView();
        ((RecyclerView) (view5 == null ? null : view5.findViewById(R.id.rv_contact))).setAdapter(m());
        View view6 = getView();
        ((LinearLayout) (view6 == null ? null : view6.findViewById(R.id.layout_edit))).setOnClickListener(new View.OnClickListener() { // from class: c80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                BtContactFragment.u(this.a, view7);
            }
        });
        View view7 = getView();
        ((LinearLayout) (view7 == null ? null : view7.findViewById(R.id.layout_add))).setOnClickListener(new View.OnClickListener() { // from class: d80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                BtContactFragment.v(this.a, view8);
            }
        });
        String quantityString = getResources().getQuantityString(R.plurals.bt_contact_max_count, 50, 50);
        View view8 = getView();
        ((TextView) (view8 == null ? null : view8.findViewById(R.id.tv_max_contact_count))).setText(quantityString);
        View view9 = getView();
        ((TipComponent) (view9 != null ? view9.findViewById(R.id.permission_tips) : null)).setActionGoto(new View.OnClickListener() { // from class: a80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view10) {
                BtContactFragment.w(this.a, view10);
            }
        });
        BtContactViewModel btContactViewModel = this.viewModel;
        Objects.requireNonNull(btContactViewModel);
        z(btContactViewModel.getShowEditMode());
    }
}
