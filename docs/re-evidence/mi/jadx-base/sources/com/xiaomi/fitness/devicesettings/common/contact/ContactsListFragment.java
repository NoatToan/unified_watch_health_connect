package com.xiaomi.fitness.devicesettings.common.contact;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.devicesettings.common.contact.ContactsListFragment;
import com.xiaomi.fitness.devicesettings.widget.SideBar;
import defpackage.eui;
import defpackage.fli;
import defpackage.gg6;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B\u0007¢\u0006\u0004\b(\u0010\fJ!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\b*\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListViewModel;", "Lgg6;", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "", "position", "", "smoothMoveToPosition", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "loadContactListFromPhone", "()V", "bindView", "(Lgg6;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter;", "contactsListAdapter", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter;", "", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "dataList", "Ljava/util/List;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "", "mShouldScroll", "Z", "mToPosition", "I", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ContactsListFragment extends BaseBindingFragment<ContactsListViewModel, gg6> {
    public static final long sHandleDelay = 300;
    public static final int sKeySearch = 100;

    @Nullable
    private ContactsListAdapter contactsListAdapter;

    @Nullable
    private LinearLayoutManager linearLayoutManager;
    private boolean mShouldScroll;
    private int mToPosition;

    @NotNull
    private List<ContactBean> dataList = new ArrayList();

    @NotNull
    private final Handler mHandler = new ContactsListFragment$mHandler$1(this, Looper.getMainLooper());

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ContactsListViewModel access$getMViewModel(ContactsListFragment contactsListFragment) {
        return (ContactsListViewModel) contactsListFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(ContactsListFragment this$0, gg6 this_bindView, String str) {
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
    public static final Unit bindView$lambda$4(final ContactsListFragment this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: vg4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ContactsListFragment.bindView$lambda$4$lambda$1(this.f36862a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: wg4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ContactsListFragment.bindView$lambda$4$lambda$3(this.f37933a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$1(ContactsListFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.loadContactListFromPhone();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$3(final ContactsListFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, it, fragmentActivityRequireActivity, null, null, null, new Function0() { // from class: ug4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContactsListFragment.bindView$lambda$4$lambda$3$lambda$2(this.f35730a);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$3$lambda$2(ContactsListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        PermissionsUtil.showSettingDialog$default(permissionsUtil, fragmentActivityRequireActivity, "android.permission.READ_CONTACTS", true, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadContactListFromPhone() {
        showLoading();
        ContactsListViewModel contactsListViewModel = (ContactsListViewModel) getMViewModel();
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        contactsListViewModel.loadList(mActivity, new Function1() { // from class: zg4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ContactsListFragment.loadContactListFromPhone$lambda$5(this.f41243a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContactListFromPhone$lambda$5(ContactsListFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        ContactsListAdapter contactsListAdapter = this$0.contactsListAdapter;
        if (contactsListAdapter != null) {
            contactsListAdapter.updateDataList(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void smoothMoveToPosition(RecyclerView mRecyclerView, int position) {
        if (mRecyclerView == null || isInvalid()) {
            return;
        }
        int childLayoutPosition = mRecyclerView.getChildLayoutPosition(mRecyclerView.getChildAt(0));
        int childLayoutPosition2 = mRecyclerView.getChildLayoutPosition(mRecyclerView.getChildAt(mRecyclerView.getChildCount() - 1));
        if (position < childLayoutPosition) {
            if (childLayoutPosition - position > 100) {
                mRecyclerView.scrollToPosition(position + 50);
            }
            mRecyclerView.smoothScrollToPosition(position);
        } else {
            if (position <= childLayoutPosition2) {
                int i = position - childLayoutPosition;
                if (i < 0 || i >= mRecyclerView.getChildCount()) {
                    return;
                }
                mRecyclerView.smoothScrollBy(0, mRecyclerView.getChildAt(i).getTop());
                return;
            }
            if (position - childLayoutPosition > 100) {
                mRecyclerView.scrollToPosition(position - 50);
            }
            mRecyclerView.smoothScrollToPosition(position);
            this.mToPosition = position;
            this.mShouldScroll = true;
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final gg6 gg6Var) {
        Intrinsics.checkNotNullParameter(gg6Var, "<this>");
        setTitle(wzi.Q2);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mActivity);
        this.linearLayoutManager = linearLayoutManager;
        gg6Var.C.setLayoutManager(linearLayoutManager);
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        ContactsListAdapter contactsListAdapter = new ContactsListAdapter(mActivity2, this.dataList, new ContactsListAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.devicesettings.common.contact.ContactsListFragment.bindView.1
            @Override // com.xiaomi.fitness.devicesettings.common.contact.ContactsListAdapter.OnItemClickListener
            public void onItemSelect(ContactBean contactBean) {
                Intrinsics.checkNotNullParameter(contactBean, "contactBean");
                ContactsListFragment.this.showLoading();
            }
        });
        this.contactsListAdapter = contactsListAdapter;
        gg6Var.C.setAdapter(contactsListAdapter);
        gg6Var.E.setTextView(gg6Var.A);
        gg6Var.C.addOnScrollListener(new RecyclerView.s() { // from class: com.xiaomi.fitness.devicesettings.common.contact.ContactsListFragment.bindView.2
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (ContactsListFragment.this.mShouldScroll && newState == 0) {
                    ContactsListFragment.this.mShouldScroll = false;
                    ContactsListFragment contactsListFragment = ContactsListFragment.this;
                    contactsListFragment.smoothMoveToPosition(gg6Var.C, contactsListFragment.mToPosition);
                }
            }
        });
        gg6Var.E.setOnTouchingLetterChangedListener(new SideBar.a() { // from class: xg4
            @Override // com.xiaomi.fitness.devicesettings.widget.SideBar.a
            public final void a(String str) {
                ContactsListFragment.bindView$lambda$0(this.f39089a, gg6Var, str);
            }
        });
        gg6Var.D.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.devicesettings.common.contact.ContactsListFragment.bindView.4
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                ContactsListFragment.this.mHandler.removeMessages(100);
                Message messageObtainMessage = ContactsListFragment.this.mHandler.obtainMessage(100, String.valueOf(s));
                Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                ContactsListFragment.this.mHandler.sendMessageDelayed(messageObtainMessage, 300L);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }
        });
        PermissionExtKt.permission(this, "android.permission.READ_CONTACTS", getString(wzi.ef), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: yg4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ContactsListFragment.bindView$lambda$4(this.f40148a, (PermissionBuilder) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.X;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(fli.e);
        getMBinding().B.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }
}
