package com.xiaomi.fitness.devicesettings.common.contact;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyInfoFragment;
import com.xiaomi.fitness.devicesettings.common.contact.ContactsListActivity;
import com.xiaomi.fitness.devicesettings.widget.SideBar;
import defpackage.eui;
import defpackage.fli;
import defpackage.gg6;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000e*\u0001$\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00010B\u0007¢\u0006\u0004\b/\u0010\fJ!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\b*\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListViewModel;", "Lgg6;", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "", "position", "", "smoothMoveToPosition", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "loadContactListFromPhone", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "bindView", "(Lgg6;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter;", "contactsListAdapter", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter;", "", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "dataList", "Ljava/util/List;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "com/xiaomi/fitness/devicesettings/common/contact/ContactsListActivity$smoothScroller$2$1", "smoothScroller$delegate", "Lkotlin/Lazy;", "getSmoothScroller", "()Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListActivity$smoothScroller$2$1;", "smoothScroller", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ContactsListActivity extends BaseBindingActivity<ContactsListViewModel, gg6> {

    @NotNull
    public static final String CONTACT_LIST_TITLE = "contact_list_title";
    public static final long sHandleDelay = 300;
    public static final int sKeySearch = 100;

    @Nullable
    private ContactsListAdapter contactsListAdapter;

    @Nullable
    private LinearLayoutManager linearLayoutManager;

    @NotNull
    private List<ContactBean> dataList = new ArrayList();

    @NotNull
    private final Handler mHandler = new ContactsListActivity$mHandler$1(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: smoothScroller$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy smoothScroller = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pg4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ContactsListActivity.smoothScroller_delegate$lambda$5(this.f30363a);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ContactsListViewModel access$getMViewModel(ContactsListActivity contactsListActivity) {
        return (ContactsListViewModel) contactsListActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(ContactsListActivity this$0, gg6 this_bindView, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ContactsListAdapter contactsListAdapter = this$0.contactsListAdapter;
        Intrinsics.checkNotNull(contactsListAdapter);
        int positionForSection = contactsListAdapter.getPositionForSection(str.charAt(0));
        if (positionForSection != -1) {
            this$0.smoothMoveToPosition(this_bindView.C, positionForSection);
        } else {
            this$0.smoothMoveToPosition(this_bindView.C, positionForSection + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(final ContactsListActivity this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: ng4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ContactsListActivity.bindView$lambda$4$lambda$1(this.f27900a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: og4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ContactsListActivity.bindView$lambda$4$lambda$3(this.f29130a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$1(ContactsListActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.loadContactListFromPhone();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$3(final ContactsListActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), it, this$0, null, null, null, new Function0() { // from class: mg4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContactsListActivity.bindView$lambda$4$lambda$3$lambda$2(this.f26129a);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$3$lambda$2(ContactsListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionsUtil.showSettingDialog$default(PermissionsUtil.INSTANCE, this$0, "android.permission.READ_CONTACTS", true, null, 8, null);
        return Unit.INSTANCE;
    }

    private final ContactsListActivity$smoothScroller$2$1 getSmoothScroller() {
        return (ContactsListActivity$smoothScroller$2$1) this.smoothScroller.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadContactListFromPhone() {
        showLoading();
        ((ContactsListViewModel) getMViewModel()).loadList(this, new Function1() { // from class: lg4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ContactsListActivity.loadContactListFromPhone$lambda$6(this.f25029a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContactListFromPhone$lambda$6(ContactsListActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialogForce();
        ContactsListAdapter contactsListAdapter = this$0.contactsListAdapter;
        if (contactsListAdapter != null) {
            contactsListAdapter.updateDataList(it);
        }
        return Unit.INSTANCE;
    }

    private final void smoothMoveToPosition(RecyclerView mRecyclerView, int position) {
        if (mRecyclerView == null || isFinishing() || isDestroyed()) {
            return;
        }
        int childLayoutPosition = mRecyclerView.getChildLayoutPosition(mRecyclerView.getChildAt(0));
        int childLayoutPosition2 = mRecyclerView.getChildLayoutPosition(mRecyclerView.getChildAt(mRecyclerView.getChildCount() - 1));
        if (position < childLayoutPosition) {
            if (childLayoutPosition - position > 100) {
                mRecyclerView.scrollToPosition(position + 50);
            }
            getSmoothScroller().setTargetPosition(position);
            RecyclerView.o layoutManager = mRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.startSmoothScroll(getSmoothScroller());
                return;
            }
            return;
        }
        if (position <= childLayoutPosition2) {
            getSmoothScroller().setTargetPosition(position);
            RecyclerView.o layoutManager2 = mRecyclerView.getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.startSmoothScroll(getSmoothScroller());
                return;
            }
            return;
        }
        if (position - childLayoutPosition > 100) {
            mRecyclerView.scrollToPosition(position - 50);
        }
        getSmoothScroller().setTargetPosition(position);
        RecyclerView.o layoutManager3 = mRecyclerView.getLayoutManager();
        if (layoutManager3 != null) {
            layoutManager3.startSmoothScroll(getSmoothScroller());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.fitness.devicesettings.common.contact.ContactsListActivity$smoothScroller$2$1] */
    public static final ContactsListActivity$smoothScroller$2$1 smoothScroller_delegate$lambda$5(final ContactsListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new n(this$0) { // from class: com.xiaomi.fitness.devicesettings.common.contact.ContactsListActivity$smoothScroller$2$1
            {
                super(this$0);
            }

            @Override // androidx.recyclerview.widget.n
            public int getVerticalSnapPreference() {
                return -1;
            }
        };
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final gg6 gg6Var) {
        Intrinsics.checkNotNullParameter(gg6Var, "<this>");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.linearLayoutManager = linearLayoutManager;
        gg6Var.C.setLayoutManager(linearLayoutManager);
        ContactsListAdapter contactsListAdapter = new ContactsListAdapter(this, this.dataList, new ContactsListAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.devicesettings.common.contact.ContactsListActivity.bindView.1
            @Override // com.xiaomi.fitness.devicesettings.common.contact.ContactsListAdapter.OnItemClickListener
            public void onItemSelect(ContactBean contactBean) {
                Intrinsics.checkNotNullParameter(contactBean, "contactBean");
                Intent intent = new Intent();
                intent.putExtra(EmergencyInfoFragment.EMERGENCY_INFO_REMARK_EXTRA, contactBean.getName());
                intent.putExtra(EmergencyInfoFragment.EMERGENCY_INFO_NUMBER_EXTRA, contactBean.getPhone());
                ContactsListActivity.this.setResult(-1, intent);
                ContactsListActivity.this.finish();
            }
        });
        this.contactsListAdapter = contactsListAdapter;
        gg6Var.C.setAdapter(contactsListAdapter);
        gg6Var.E.setTextView(gg6Var.A);
        gg6Var.E.setOnTouchingLetterChangedListener(new SideBar.a() { // from class: qg4
            @Override // com.xiaomi.fitness.devicesettings.widget.SideBar.a
            public final void a(String str) {
                ContactsListActivity.bindView$lambda$0(this.f31494a, gg6Var, str);
            }
        });
        gg6Var.D.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.devicesettings.common.contact.ContactsListActivity.bindView.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                ContactsListActivity.this.mHandler.removeMessages(100);
                Message messageObtainMessage = ContactsListActivity.this.mHandler.obtainMessage(100, String.valueOf(s));
                Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                ContactsListActivity.this.mHandler.sendMessageDelayed(messageObtainMessage, 300L);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }
        });
        PermissionExtKt.permission(this, "android.permission.READ_CONTACTS", getString(wzi.ef), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: rg4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ContactsListActivity.bindView$lambda$4(this.f32513a, (PermissionBuilder) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.X;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(fli.e);
        getMBinding().B.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(CONTACT_LIST_TITLE);
        if (stringExtra != null) {
            setTitle(stringExtra);
        } else {
            setTitle(wzi.Q2);
        }
    }
}
