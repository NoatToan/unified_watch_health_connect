package com.xiaomi.fitness.electronic.scale;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.electronic.scale.UserManageActivity;
import com.xiaomi.fitness.electronic.scale.adapter.UserAdapter;
import com.xiaomi.fitness.electronic.scale.callback.OnHandleUserCallback;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.model.UserManageViewModel;
import com.xiaomi.fitness.electronic.scale.util.UserHelper;
import com.xiaomi.fitness.electronic.scale.widget.NoScrollRecyclerView;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import defpackage.av1;
import defpackage.av6;
import defpackage.eji;
import defpackage.gui;
import defpackage.ld8;
import defpackage.lni;
import defpackage.pk0;
import defpackage.qal;
import defpackage.uno;
import defpackage.wc0;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b/\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u0007J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001b\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0013R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/UserManageActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/model/UserManageViewModel;", "Lpk0;", "Lcom/xiaomi/fitness/electronic/scale/callback/OnHandleUserCallback;", "", "initView", "()V", "", "drawableId", "setEndView", "(I)V", "changeDeleteMode", "initData", "preLoad", "refreshListData", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", SceneRecogBroadcastReceiver.FROM_USER, "showDeUserDialog", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserAddEvent;", "event", "refreshData", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserAddEvent;)V", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserModifyEvent;", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserModifyEvent;)V", "onDel", "onEdit", "", "did$delegate", "Lkotlin/Lazy;", "getDid", "()Ljava/lang/String;", "did", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserAdapter;", "mUserAdapter", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserAdapter;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class UserManageActivity extends Hilt_UserManageActivity<UserManageViewModel, pk0> implements OnHandleUserCallback {

    /* JADX INFO: renamed from: did$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy did = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hhq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserManageActivity.did_delegate$lambda$0(this.f20081a);
        }
    });
    private UserAdapter mUserAdapter;

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.UserManageActivity$showDeUserDialog$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/electronic/scale/UserManageActivity$showDeUserDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends av6 {
        final /* synthetic */ VirtualAccount $user;

        public AnonymousClass1(VirtualAccount virtualAccount) {
            this.$user = virtualAccount;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(UserManageActivity this$0, ProxyResponse it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            qal.c("deleteVirtualAccount() response:" + it.getCode() + it.getMessage());
            if (it.getCode() == 0) {
                ToastUtil.showShortToast(this$0.getResources().getString(zzi.V3));
                ld8.c().l(new ScaleEventBusIds.OnUserDeleteEvent());
                this$0.refreshListData();
            } else {
                ToastUtil.showShortToast(it.getMessage());
            }
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which == -2) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            } else {
                if (which != -1) {
                    return;
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                UserManageViewModel userManageViewModelAccess$getMViewModel = UserManageActivity.access$getMViewModel(UserManageActivity.this);
                String strValueOf = String.valueOf(this.$user.getAccountId());
                final UserManageActivity userManageActivity = UserManageActivity.this;
                userManageViewModelAccess$getMViewModel.deleteVirtualAccount(strValueOf, new Function1() { // from class: ihq
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return UserManageActivity.AnonymousClass1.onDialogClick$lambda$0(userManageActivity, (ProxyResponse) obj);
                    }
                });
                UserManageActivity.access$getMViewModel(UserManageActivity.this).delUserToDevice(String.valueOf(this.$user.getAccountId()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ UserManageViewModel access$getMViewModel(UserManageActivity userManageActivity) {
        return (UserManageViewModel) userManageActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void changeDeleteMode() {
        ((UserManageViewModel) getMViewModel()).setDeleteMode(!((UserManageViewModel) getMViewModel()).getIsDeleteMode());
        if (((UserManageViewModel) getMViewModel()).getIsDeleteMode()) {
            setEndView(lni.u);
        } else {
            setEndView(lni.t);
        }
        UserAdapter userAdapter = this.mUserAdapter;
        UserAdapter userAdapter2 = null;
        if (userAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserAdapter");
            userAdapter = null;
        }
        Iterator<VirtualAccount> it = userAdapter.getUsers().iterator();
        while (it.hasNext()) {
            it.next().setDel(((UserManageViewModel) getMViewModel()).getIsDeleteMode());
        }
        UserAdapter userAdapter3 = this.mUserAdapter;
        if (userAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserAdapter");
        } else {
            userAdapter2 = userAdapter3;
        }
        userAdapter2.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String did_delegate$lambda$0(UserManageActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String stringExtra = this$0.getIntent().getStringExtra("did");
        Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
        return stringExtra;
    }

    private final String getDid() {
        return (String) this.did.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        ((pk0) getMBinding()).E.setLayoutManager(new LinearLayoutManager(this));
        this.mUserAdapter = new UserAdapter(new ArrayList(), this);
        NoScrollRecyclerView noScrollRecyclerView = ((pk0) getMBinding()).E;
        UserAdapter userAdapter = this.mUserAdapter;
        if (userAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUserAdapter");
            userAdapter = null;
        }
        noScrollRecyclerView.setAdapter(userAdapter);
        ((pk0) getMBinding()).A.setClickListener(new View.OnClickListener() { // from class: ehq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserManageActivity.initData$lambda$2(this.f16657a, view);
            }
        });
        preLoad();
        refreshListData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initData$lambda$2(UserManageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((UserManageViewModel) this$0.getMViewModel()).getAddedNum() >= ((UserManageViewModel) this$0.getMViewModel()).getMaxAddNum()) {
            ToastUtil.showShortToast(this$0.getResources().getString(zzi.W3));
        } else {
            UserAddActivity.INSTANCE.start(this$0, new VirtualAccount(null, null, ((UserManageViewModel) this$0.getMViewModel()).getUserId(), 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524283, null), 1, this$0.getDid(), (FileUtils.S_IRWXU & 16) != 0 ? 0.0f : 0.0f, (FileUtils.S_IRWXU & 32) != 0 ? 1 : 0, (FileUtils.S_IRWXU & 64) != 0 ? false : false, (FileUtils.S_IRWXU & 128) != 0 ? null : null, (FileUtils.S_IRWXU & 256) != 0 ? false : false);
        }
    }

    private final void initView() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.D));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            miuiActionBar2.setBackgroundDrawable(ResourceExtKt.getResourceDrawable(this, eji.s));
        }
        setEndView(lni.t);
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        initData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void preLoad() {
        List<VirtualAccount> virtualUserFromSp = UserHelper.INSTANCE.getVirtualUserFromSp(getDid());
        qal.c("preLoad getVirtualAccount()" + virtualUserFromSp.size());
        if (!virtualUserFromSp.isEmpty()) {
            ((UserManageViewModel) getMViewModel()).setAddedNum(virtualUserFromSp.size());
            ((pk0) getMBinding()).B.setUserManageNum(virtualUserFromSp.size() + "/" + ((UserManageViewModel) getMViewModel()).getMaxAddNum());
            UserAdapter userAdapter = this.mUserAdapter;
            UserAdapter userAdapter2 = null;
            if (userAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUserAdapter");
                userAdapter = null;
            }
            userAdapter.setUsers(virtualUserFromSp);
            UserAdapter userAdapter3 = this.mUserAdapter;
            if (userAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUserAdapter");
            } else {
                userAdapter2 = userAdapter3;
            }
            userAdapter2.notifyDataSetChanged();
            setEndView(lni.t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshListData() {
        ((UserManageViewModel) getMViewModel()).getVirtualAccount(((UserManageViewModel) getMViewModel()).getUserId(), getDid(), new Function1() { // from class: fhq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserManageActivity.refreshListData$lambda$5(this.f17795a, (ProxyResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit refreshListData$lambda$5(UserManageActivity this$0, ProxyResponse it) {
        List<VirtualAccount> list;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getCode() == 0 && (list = (List) it.getResult()) != null) {
            qal.c("getVirtualAccount()" + list.size());
            if (!list.isEmpty()) {
                ((UserManageViewModel) this$0.getMViewModel()).setAddedNum(list.size());
                ((pk0) this$0.getMBinding()).B.setUserManageNum(list.size() + "/" + ((UserManageViewModel) this$0.getMViewModel()).getMaxAddNum());
                UserAdapter userAdapter = this$0.mUserAdapter;
                UserAdapter userAdapter2 = null;
                if (userAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUserAdapter");
                    userAdapter = null;
                }
                userAdapter.setUsers(list);
                UserAdapter userAdapter3 = this$0.mUserAdapter;
                if (userAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUserAdapter");
                } else {
                    userAdapter2 = userAdapter3;
                }
                userAdapter2.notifyDataSetChanged();
                this$0.setEndView(lni.t);
            } else {
                this$0.finish();
            }
        }
        return Unit.INSTANCE;
    }

    private final void setEndView(int drawableId) {
        IActionBar.DefaultImpls.setEndView$default(this, 0, drawableId, null, new View.OnClickListener() { // from class: ghq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserManageActivity.setEndView$lambda$1(this.f19011a, view);
            }
        }, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEndView$lambda$1(UserManageActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.changeDeleteMode();
    }

    private final void showDeUserDialog(VirtualAccount user) {
        CommonDialog commonDialogCreate = new CommonDialog.c("user_add").setDialogTitle(zzi.O0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(zzi.I0, user.getName()))).setPositiveText(zzi.H0).setNegativeText(zzi.O4).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new AnonymousClass1(user));
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.t;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.f3479a;
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_UserManageActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        initView();
        if (ld8.c().j(this)) {
            return;
        }
        ld8.c().p(this);
    }

    @Override // com.xiaomi.fitness.electronic.scale.callback.OnHandleUserCallback
    public void onDel(@NotNull VirtualAccount user) {
        Intrinsics.checkNotNullParameter(user, "user");
        showDeUserDialog(user);
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_UserManageActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (ld8.c().j(this)) {
            ld8.c().r(this);
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.callback.OnHandleUserCallback
    public void onEdit(@NotNull VirtualAccount user) {
        Intrinsics.checkNotNullParameter(user, "user");
        UserAddActivity.INSTANCE.start(this, user, 2, getDid(), (FileUtils.S_IRWXU & 16) != 0 ? 0.0f : 0.0f, (FileUtils.S_IRWXU & 32) != 0 ? 1 : 0, (FileUtils.S_IRWXU & 64) != 0 ? false : false, (FileUtils.S_IRWXU & 128) != 0 ? null : null, (FileUtils.S_IRWXU & 256) != 0 ? false : false);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void refreshData(@NotNull ScaleEventBusIds.OnUserAddEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        refreshListData();
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void refreshData(@NotNull ScaleEventBusIds.OnUserModifyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        refreshListData();
    }
}
