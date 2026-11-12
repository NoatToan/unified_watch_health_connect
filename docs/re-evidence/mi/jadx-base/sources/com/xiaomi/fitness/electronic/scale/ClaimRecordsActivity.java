package com.xiaomi.fitness.electronic.scale;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.electronic.scale.ClaimRecordsActivity;
import com.xiaomi.fitness.electronic.scale.adapter.ClaimRecordMoreAdapter;
import com.xiaomi.fitness.electronic.scale.adapter.ClaimRecordWeekAdapter;
import com.xiaomi.fitness.electronic.scale.adapter.UserPhotoAdapter;
import com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl;
import com.xiaomi.fitness.electronic.scale.data.AddUserIcon;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import com.xiaomi.fitness.electronic.scale.data.DeleteByDidAndCreateTimeBean;
import com.xiaomi.fitness.electronic.scale.data.Icon;
import com.xiaomi.fitness.electronic.scale.data.UserPhotoIcon;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.electronic.scale.widget.ClaimRecordsHeaderView;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.av1;
import defpackage.av6;
import defpackage.bg4;
import defpackage.bri;
import defpackage.c9h;
import defpackage.eji;
import defpackage.f4b;
import defpackage.gui;
import defpackage.ld8;
import defpackage.lj0;
import defpackage.lni;
import defpackage.o4h;
import defpackage.qal;
import defpackage.qw7;
import defpackage.rrr;
import defpackage.u7r;
import defpackage.uno;
import defpackage.wc0;
import defpackage.ww7;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ~2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001~B\u0007¢\u0006\u0004\b}\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00052\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010\u0007J\u000f\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010\u0007J\u001d\u0010(\u001a\u00020\u00052\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0002¢\u0006\u0004\b(\u0010%J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u0010\u0007J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b,\u0010-J1\u0010/\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100J'\u00101\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u0010\u000fJ9\u00104\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0018\u00103\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\"\u0012\u0004\u0012\u00020\u000502H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0005H\u0002¢\u0006\u0004\b6\u0010\u0007J\u000f\u00107\u001a\u00020\u0005H\u0002¢\u0006\u0004\b7\u0010\u0007J\u0019\u0010:\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u000108H\u0014¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b>\u0010\u0014J)\u0010C\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\b2\b\u0010B\u001a\u0004\u0018\u00010AH\u0014¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0005H\u0014¢\u0006\u0004\bE\u0010\u0007J\u0017\u0010H\u001a\u00020\u00052\u0006\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00052\u0006\u0010G\u001a\u00020JH\u0007¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u00052\u0006\u0010G\u001a\u00020MH\u0007¢\u0006\u0004\bN\u0010OR\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001a0\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR(\u0010V\u001a\b\u0012\u0002\b\u0003\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020`0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010QR\u0016\u0010b\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010p\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010S\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR(\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010Q\u001a\u0004\bw\u0010*\"\u0004\bx\u0010%R\u0014\u0010z\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010rR\u0014\u0010|\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010r¨\u0006\u007f"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/ClaimRecordsActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/ClaimRecordsViewModel;", "Llj0;", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter$OnItemClickListener;", "", "initView", "()V", "", "userType", "", "virtualId", "Lcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;", "icon", "saveClaimRecordsToTargetAccount", "(IJLcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;)V", "showSaveWeightDialog", "", "did", "getAllVirtualAccount", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "virtualAccount", "addVirtualAccountIcon", "(Ljava/lang/String;Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "(Ljava/lang/String;Lcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;)V", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "claimRecord", "deleteRecord", "(Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;J)V", "record", "", "hasZK", "(Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;)Z", "", "mClaimRecords", "updateWeekData", "(Ljava/util/List;)V", "initWeekView", "initData", "showMoreData", "getCheckList", "()Ljava/util/List;", "checkClaimBtn", "handleVirtualAccountIncompleteCase", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "account", "checkLatestWeight", "(IJLcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;Lcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;)V", "showEnsureClaimDialog", "Lkotlin/Function1;", "callBack", "queryByUidAndDid", "(ILcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;Lkotlin/jvm/functions/Function1;)V", "updateUserDialog", "loadMiUser", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onClick", "(Lcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;)V", "onAddUser", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBodyCompositionSDKMeasureEvent;", "event", "onBodyCompositionSDKMeasure", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBodyCompositionSDKMeasureEvent;)V", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserAddEvent;", "onUserAddEvent", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserAddEvent;)V", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserModifyEvent;", "onUserModifyEvent", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserModifyEvent;)V", "listToRemove", "Ljava/util/List;", "mUnit", "I", "mDialogFlag", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "selectUserDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getSelectUserDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setSelectUserDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter;", "userAdapter", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter;", "", "Lcom/xiaomi/fitness/electronic/scale/data/Icon;", "userIcons", "showNoBodyFatErrorDialog", "Z", "Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordMoreAdapter;", "claimRecordMoreAdapter", "Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordMoreAdapter;", "userNickName", "Ljava/lang/String;", "did$delegate", "Lkotlin/Lazy;", "getDid", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/electronic/scale/widget/ClaimRecordsHeaderView;", "claimRecordsHeaderView", "Lcom/xiaomi/fitness/electronic/scale/widget/ClaimRecordsHeaderView;", MediaStoreUtil.MediaInfo.SIZE, "getSize", "()I", "setSize", "(I)V", "Lcom/xiaomi/fitness/electronic/scale/data/DeleteByDidAndCreateTimeBean;", "delList", "getDelList", "setDelList", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nClaimRecordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClaimRecordsActivity.kt\ncom/xiaomi/fitness/electronic/scale/ClaimRecordsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,740:1\n1#2:741\n*E\n"})
public final class ClaimRecordsActivity extends Hilt_ClaimRecordsActivity<ClaimRecordsViewModel, lj0> implements UserPhotoAdapter.OnItemClickListener {

    @NotNull
    public static final String DEVICE_DID = "DEVICE_DID";

    @NotNull
    public static final String TAG = "ClaimRecordsActivity";
    private ClaimRecordMoreAdapter claimRecordMoreAdapter;
    private ClaimRecordsHeaderView claimRecordsHeaderView;
    private List<ClaimRecord> listToRemove;

    @Nullable
    private CommonDialog<?> selectUserDialog;
    private boolean showNoBodyFatErrorDialog;
    private int size;

    @Nullable
    private UserPhotoAdapter userAdapter;
    private int mUnit = 1;
    private int mDialogFlag = -1;

    @NotNull
    private final List<Icon> userIcons = new ArrayList();

    @NotNull
    private volatile String userNickName = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();

    /* JADX INFO: renamed from: did$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy did = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wy3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ClaimRecordsActivity.did_delegate$lambda$0(this.f38472a);
        }
    });

    @NotNull
    private List<DeleteByDidAndCreateTimeBean> delList = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ lj0 access$getMBinding(ClaimRecordsActivity claimRecordsActivity) {
        return (lj0) claimRecordsActivity.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addVirtualAccountIcon(String did, VirtualAccount virtualAccount) {
        String strValueOf = String.valueOf(virtualAccount.getUid());
        String strValueOf2 = String.valueOf(virtualAccount.getAccountId());
        String icon = virtualAccount.getIcon();
        String name = virtualAccount.getName();
        int sex = virtualAccount.getSex();
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String dateToString = weightInfoUtil.getDateToString(virtualAccount.getBirth(), "yyyy-MM-dd");
        Intrinsics.checkNotNull(dateToString);
        this.userIcons.add(0, new UserPhotoIcon(did, strValueOf, strValueOf2, 0, icon, name, 0, sex, weightInfoUtil.getAge(dateToString), virtualAccount.getHeight(), null, true, 0L, false, virtualAccount));
        UserPhotoAdapter userPhotoAdapter = this.userAdapter;
        if (userPhotoAdapter != null) {
            userPhotoAdapter.updateData(this.userIcons);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void checkClaimBtn() {
        List<ClaimRecord> checkList = getCheckList();
        if (checkList == null || checkList.isEmpty()) {
            ((lj0) getMBinding()).A.setAlpha(0.6f);
        } else {
            ((lj0) getMBinding()).A.setAlpha(1.0f);
        }
    }

    private final void checkLatestWeight(int userType, long virtualId, VirtualAccount account, UserPhotoIcon icon) {
        for (ClaimRecord claimRecord : getCheckList()) {
            if (account != null) {
                qal.c("checkLatestWeight, weightTarget: " + account.getWeightTarget());
                if (Math.abs(claimRecord.getWeight() - account.getWeightTarget()) > 2.0f) {
                    showEnsureClaimDialog(userType, virtualId, icon);
                    return;
                }
            } else {
                MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
                qal.c("checkLatestWeight, mi weightTarget: " + companion.getInstance().getWeight());
                if (Math.abs(claimRecord.getWeight() - companion.getInstance().getWeight()) > 2.0f) {
                    showEnsureClaimDialog(userType, virtualId, icon);
                    return;
                }
            }
        }
        saveClaimRecordsToTargetAccount(userType, virtualId, icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void deleteRecord(ClaimRecord claimRecord, long virtualId) throws JSONException {
        if (!claimRecord.getIsCloud()) {
            ((ClaimRecordsViewModel) getMViewModel()).deleteClaimedRecordInDb(String.valueOf(getDid()), claimRecord.getCreateTime(), new Function0() { // from class: oy3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClaimRecordsActivity.deleteRecord$lambda$6(this.f29801a);
                }
            });
            return;
        }
        ListExtKt.add(this.delList, new DeleteByDidAndCreateTimeBean(String.valueOf(getDid()), claimRecord.getCreateTime()));
        Logger.i(TAG, "add real user success");
        int i = this.size + 1;
        this.size = i;
        if (i == getCheckList().size()) {
            ((ClaimRecordsViewModel) getMViewModel()).deleteByDidAndCreateTime(this.delList, new ClaimRecordsViewModel.OnDeleteByDidAndCreateTimeListener() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsActivity.deleteRecord.1
                @Override // com.xiaomi.fitness.electronic.scale.ClaimRecordsViewModel.OnDeleteByDidAndCreateTimeListener
                public void onError() {
                    ClaimRecordsActivity.this.hideLoading();
                    ClaimRecordsActivity.this.setSize(0);
                    ClaimRecordsActivity.this.setDelList(new ArrayList());
                    ToastUtil.showShortToast(zzi.u0);
                }

                @Override // com.xiaomi.fitness.electronic.scale.ClaimRecordsViewModel.OnDeleteByDidAndCreateTimeListener
                public void onSuccess() throws JSONException {
                    ClaimRecordsActivity.this.hideLoading();
                    ClaimRecordsActivity.this.setSize(0);
                    ClaimRecordsActivity.this.setDelList(new ArrayList());
                    ClaimRecordsActivity.this.initView();
                    ClaimRecordsActivity.access$getMBinding(ClaimRecordsActivity.this).A.setAlpha(0.6f);
                    CommonDialog<?> selectUserDialog = ClaimRecordsActivity.this.getSelectUserDialog();
                    if (selectUserDialog != null) {
                        selectUserDialog.dismiss();
                    }
                    ToastUtil.showShortToast(zzi.v0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit deleteRecord$lambda$6(ClaimRecordsActivity this$0) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.initView();
        ((lj0) this$0.getMBinding()).A.setAlpha(0.6f);
        CommonDialog<?> commonDialog = this$0.selectUserDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        ToastUtil.showShortToast(zzi.v0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String did_delegate$lambda$0(ClaimRecordsActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getStringExtra("DEVICE_DID");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getAllVirtualAccount(final String did) throws JSONException {
        ((ClaimRecordsViewModel) getMViewModel()).getAllVirtualAccount(did, new ElectronicScaleBaseViewModel.OnVirtualAccountListener() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsActivity.getAllVirtualAccount.1
            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onFailed() {
            }

            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onFinishVirtualAccount() {
                String str = did;
                String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
                MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
                ClaimRecordsActivity.this.addVirtualAccountIcon(did, new UserPhotoIcon(str, userId, "0", 0, companion.getInstance().getAvatarAddress(), ClaimRecordsActivity.this.userNickName, 0, companion.getInstance().getSex(), companion.getInstance().getAge(), (int) companion.getInstance().getHeight(), null, false, 0L, false, null, 28672, null));
            }

            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onNoVirtualAccount() {
                Logger.i(ClaimRecordsActivity.TAG, "handleWeight getAllVirtualAccount onNoVirtualAccount");
            }

            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onVirtualAccount(VirtualAccount account) {
                Intrinsics.checkNotNullParameter(account, "account");
                ClaimRecordsActivity.this.addVirtualAccountIcon(did, account);
            }
        });
    }

    private final List<ClaimRecord> getCheckList() {
        ArrayList arrayList = new ArrayList();
        ClaimRecordsHeaderView claimRecordsHeaderView = this.claimRecordsHeaderView;
        ClaimRecordMoreAdapter claimRecordMoreAdapter = null;
        if (claimRecordsHeaderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordsHeaderView");
            claimRecordsHeaderView = null;
        }
        arrayList.addAll(claimRecordsHeaderView.getCheckList());
        ClaimRecordMoreAdapter claimRecordMoreAdapter2 = this.claimRecordMoreAdapter;
        if (claimRecordMoreAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordMoreAdapter");
        } else {
            claimRecordMoreAdapter = claimRecordMoreAdapter2;
        }
        arrayList.addAll(claimRecordMoreAdapter.getCheckList());
        return arrayList;
    }

    private final String getDid() {
        return (String) this.did.getValue();
    }

    private final void handleVirtualAccountIncompleteCase(final VirtualAccount virtualAccount) {
        WeightActivity.Companion companion = WeightActivity.INSTANCE;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        companion.showUpdateVirtualAccountDialog(this, supportFragmentManager, new Function0() { // from class: jy3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClaimRecordsActivity.handleVirtualAccountIncompleteCase$lambda$12(this.f23232a, virtualAccount);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleVirtualAccountIncompleteCase$lambda$12(ClaimRecordsActivity this$0, VirtualAccount virtualAccount) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(virtualAccount, "$virtualAccount");
        List<ClaimRecord> checkList = this$0.getCheckList();
        List<ClaimRecord> list = checkList;
        if (list == null || list.isEmpty()) {
            return Unit.INSTANCE;
        }
        if (!NetUtil.INSTANCE.getNetWorkAvailable(this$0)) {
            ToastUtil.INSTANCE.showToast(zzi.common_hint_network_unavailable);
            return Unit.INSTANCE;
        }
        UserAddActivity.Companion companion = UserAddActivity.INSTANCE;
        String did = this$0.getDid();
        Intrinsics.checkNotNull(did);
        companion.start(this$0, virtualAccount, 2, did, checkList, this$0.mUnit, true);
        CommonDialog<?> commonDialog = this$0.selectUserDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        this$0.listToRemove = checkList;
        return Unit.INSTANCE;
    }

    private final boolean hasZK(ClaimRecord record) {
        return (record.getLfz12() == 0 || record.getLfz13() == 0 || record.getLfz14() == 0 || record.getLfz23() == 0 || record.getLfz24() == 0 || record.getLfz34() == 0 || record.getHfz12() == 0 || record.getHfz13() == 0 || record.getHfz14() == 0 || record.getHfz23() == 0 || record.getHfz24() == 0 || record.getHfz34() == 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() throws JSONException {
        String did = getDid();
        if (did != null) {
            ((ClaimRecordsViewModel) getMViewModel()).initVirtualAccount(did);
        }
        ((lj0) getMBinding()).E.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = ((lj0) getMBinding()).E;
        ClaimRecordMoreAdapter claimRecordMoreAdapter = this.claimRecordMoreAdapter;
        ClaimRecordMoreAdapter claimRecordMoreAdapter2 = null;
        if (claimRecordMoreAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordMoreAdapter");
            claimRecordMoreAdapter = null;
        }
        recyclerView.setAdapter(claimRecordMoreAdapter);
        ClaimRecordMoreAdapter claimRecordMoreAdapter3 = this.claimRecordMoreAdapter;
        if (claimRecordMoreAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordMoreAdapter");
        } else {
            claimRecordMoreAdapter2 = claimRecordMoreAdapter3;
        }
        claimRecordMoreAdapter2.getLoadMoreModule().setOnLoadMoreListener(new c9h() { // from class: py3
            @Override // defpackage.c9h
            public final void onLoadMore() {
                ClaimRecordsActivity.initData$lambda$8(this.f30891a);
            }
        });
        ((ClaimRecordsViewModel) getMViewModel()).getMClaimRecords().observe(this, new ClaimRecordsActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qy3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsActivity.initData$lambda$9(this.f31951a, (List) obj);
            }
        }));
        ((ClaimRecordsViewModel) getMViewModel()).getMWeekClaimRecords().observe(this, new ClaimRecordsActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ry3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsActivity.initData$lambda$10(this.f33052a, (List) obj);
            }
        }));
        ((ClaimRecordsViewModel) getMViewModel()).getMMoreClaimRecords().observe(this, new ClaimRecordsActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sy3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsActivity.initData$lambda$11(this.f34095a, (List) obj);
            }
        }));
        ((ClaimRecordsViewModel) getMViewModel()).getClaimedRecords(String.valueOf(getDid()));
        ClaimRecordsViewModel claimRecordsViewModel = (ClaimRecordsViewModel) getMViewModel();
        String did2 = getDid();
        Intrinsics.checkNotNull(did2);
        claimRecordsViewModel.getWeightUnit(did2, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsActivity.initData.6
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did3, int type, int code) {
                Logger.e(MainActivity.TAG, "getWeightUnit onOnError  did : " + did3 + " , type : " + type + " , code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            @SuppressLint({"SetTextI18n"})
            public void onSuccess(String did3, int type, EcoSyncResult result) {
                u7r packet;
                ww7 ww7VarT;
                qw7 qw7VarO;
                Integer numValueOf = null;
                Logger.i(MainActivity.TAG, "getWeightUnit success  did : " + did3 + " , type : " + type + " , packet : " + (result != null ? result.getPacket() : null));
                ClaimRecordsActivity claimRecordsActivity = ClaimRecordsActivity.this;
                if (result != null && (packet = result.getPacket()) != null && (ww7VarT = packet.t()) != null && (qw7VarO = ww7VarT.o()) != null) {
                    numValueOf = Integer.valueOf(qw7VarO.c);
                }
                Intrinsics.checkNotNull(numValueOf);
                claimRecordsActivity.mUnit = numValueOf.intValue();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$10(ClaimRecordsActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        ClaimRecordsHeaderView claimRecordsHeaderView = null;
        if (!list.isEmpty()) {
            qal.c("getClaimedRecords2 it " + list.size());
            this$0.updateWeekData(list);
            ClaimRecordsHeaderView claimRecordsHeaderView2 = this$0.claimRecordsHeaderView;
            if (claimRecordsHeaderView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("claimRecordsHeaderView");
            } else {
                claimRecordsHeaderView = claimRecordsHeaderView2;
            }
            claimRecordsHeaderView.setWeekVisible(0);
        } else {
            ClaimRecordsHeaderView claimRecordsHeaderView3 = this$0.claimRecordsHeaderView;
            if (claimRecordsHeaderView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("claimRecordsHeaderView");
            } else {
                claimRecordsHeaderView = claimRecordsHeaderView3;
            }
            claimRecordsHeaderView.setWeekVisible(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$11(ClaimRecordsActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        ClaimRecordsHeaderView claimRecordsHeaderView = null;
        if (!list.isEmpty()) {
            this$0.showMoreData(list);
            qal.c("getClaimedRecords3 it " + list.size());
            ClaimRecordsHeaderView claimRecordsHeaderView2 = this$0.claimRecordsHeaderView;
            if (claimRecordsHeaderView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("claimRecordsHeaderView");
            } else {
                claimRecordsHeaderView = claimRecordsHeaderView2;
            }
            claimRecordsHeaderView.setMoreVisible(0);
        } else {
            ClaimRecordsHeaderView claimRecordsHeaderView3 = this$0.claimRecordsHeaderView;
            if (claimRecordsHeaderView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("claimRecordsHeaderView");
            } else {
                claimRecordsHeaderView = claimRecordsHeaderView3;
            }
            claimRecordsHeaderView.setMoreVisible(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initData$lambda$8(ClaimRecordsActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((ClaimRecordsViewModel) this$0.getMViewModel()).loadMoreData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$9(ClaimRecordsActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        qal.c("getClaimedRecords1 it " + list.size());
        Intrinsics.checkNotNull(list);
        if (!list.isEmpty()) {
            ((lj0) this$0.getMBinding()).B.setVisibility(0);
            ((lj0) this$0.getMBinding()).C.setVisibility(8);
            ((lj0) this$0.getMBinding()).A.setEnabled(true);
            ((ClaimRecordsViewModel) this$0.getMViewModel()).getWeekData(list);
            ((ClaimRecordsViewModel) this$0.getMViewModel()).getMoreData(list);
        } else {
            ((lj0) this$0.getMBinding()).C.setVisibility(0);
            ((lj0) this$0.getMBinding()).B.setVisibility(8);
            ((lj0) this$0.getMBinding()).A.setEnabled(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initView() throws JSONException {
        ClaimRecordMoreAdapter claimRecordMoreAdapter;
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setBackgroundDrawable(new ColorDrawable(ResourceExtKt.getResourceColor(this, eji.s)));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            miuiActionBar2.setTitle(getString(zzi.u));
        }
        wc0 miuiActionBar3 = getMiuiActionBar();
        if (miuiActionBar3 != null) {
            miuiActionBar3.setSubtitle(getString(zzi.t));
        }
        ((lj0) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: uy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                ClaimRecordsActivity.initView$lambda$2(this.f36268a, view);
            }
        });
        initWeekView();
        initData();
        View viewInflate = LayoutInflater.from(this).inflate(gui.B, (ViewGroup) null);
        ClaimRecordMoreAdapter claimRecordMoreAdapter2 = this.claimRecordMoreAdapter;
        if (claimRecordMoreAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordMoreAdapter");
            claimRecordMoreAdapter = null;
        } else {
            claimRecordMoreAdapter = claimRecordMoreAdapter2;
        }
        Intrinsics.checkNotNull(viewInflate);
        BaseQuickAdapter.addFooterView$default(claimRecordMoreAdapter, viewInflate, 0, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(ClaimRecordsActivity this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<ClaimRecord> checkList = this$0.getCheckList();
        if (checkList == null || checkList.isEmpty()) {
            return;
        }
        if (!NetUtil.INSTANCE.getNetWorkAvailable(this$0)) {
            ToastUtil.INSTANCE.showToast(zzi.common_hint_network_unavailable);
            return;
        }
        this$0.showSaveWeightDialog();
        String did = this$0.getDid();
        if (did != null) {
            this$0.getAllVirtualAccount(did);
        }
    }

    private final void initWeekView() {
        ClaimRecordMoreAdapter claimRecordMoreAdapter;
        ClaimRecordsHeaderView claimRecordsHeaderView;
        ClaimRecordsHeaderView claimRecordsHeaderView2 = new ClaimRecordsHeaderView(this);
        this.claimRecordsHeaderView = claimRecordsHeaderView2;
        claimRecordsHeaderView2.initData(new ArrayList());
        ClaimRecordsHeaderView claimRecordsHeaderView3 = this.claimRecordsHeaderView;
        ClaimRecordMoreAdapter claimRecordMoreAdapter2 = null;
        if (claimRecordsHeaderView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordsHeaderView");
            claimRecordsHeaderView3 = null;
        }
        claimRecordsHeaderView3.setCheckChangedListener(new ClaimRecordWeekAdapter.OnCheckedChangedListener() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsActivity.initWeekView.1
            @Override // com.xiaomi.fitness.electronic.scale.adapter.ClaimRecordWeekAdapter.OnCheckedChangedListener
            public void onCheckChanged(boolean isChecked) {
                ClaimRecordsActivity.this.checkClaimBtn();
            }
        });
        ClaimRecordMoreAdapter claimRecordMoreAdapter3 = new ClaimRecordMoreAdapter();
        this.claimRecordMoreAdapter = claimRecordMoreAdapter3;
        claimRecordMoreAdapter3.setHeaderWithEmptyEnable(true);
        ClaimRecordMoreAdapter claimRecordMoreAdapter4 = this.claimRecordMoreAdapter;
        if (claimRecordMoreAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordMoreAdapter");
            claimRecordMoreAdapter = null;
        } else {
            claimRecordMoreAdapter = claimRecordMoreAdapter4;
        }
        ClaimRecordsHeaderView claimRecordsHeaderView4 = this.claimRecordsHeaderView;
        if (claimRecordsHeaderView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordsHeaderView");
            claimRecordsHeaderView = null;
        } else {
            claimRecordsHeaderView = claimRecordsHeaderView4;
        }
        BaseQuickAdapter.addHeaderView$default(claimRecordMoreAdapter, claimRecordsHeaderView, 0, 0, 6, null);
        ClaimRecordMoreAdapter claimRecordMoreAdapter5 = this.claimRecordMoreAdapter;
        if (claimRecordMoreAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordMoreAdapter");
        } else {
            claimRecordMoreAdapter2 = claimRecordMoreAdapter5;
        }
        claimRecordMoreAdapter2.setCheckChangedListener(new ClaimRecordMoreAdapter.OnCheckedChangedListener() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsActivity.initWeekView.2
            @Override // com.xiaomi.fitness.electronic.scale.adapter.ClaimRecordMoreAdapter.OnCheckedChangedListener
            public void onCheckChanged(boolean isChecked) {
                ClaimRecordsActivity.this.checkClaimBtn();
            }
        });
    }

    private final void loadMiUser() {
        o4h<rrr.a> o4hVarB = rrr.b(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        final Function1 function1 = new Function1() { // from class: xy3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsActivity.loadMiUser$lambda$14(this.f39576a, (rrr.a) obj);
            }
        };
        bg4<? super rrr.a> bg4Var = new bg4() { // from class: ky3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ClaimRecordsActivity.loadMiUser$lambda$15(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ly3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsActivity.loadMiUser$lambda$16(this.f25544a, (Throwable) obj);
            }
        };
        o4hVarB.O(bg4Var, new bg4() { // from class: my3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                ClaimRecordsActivity.loadMiUser$lambda$17(function2, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMiUser$lambda$14(ClaimRecordsActivity this$0, rrr.a aVar) {
        String userId;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (aVar == null || (userId = aVar.f32838b) == null) {
            userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        }
        this$0.userNickName = userId;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadMiUser$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMiUser$lambda$16(ClaimRecordsActivity this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.userNickName = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        Logger.e(WeightActivity.TAG, "getProfileError : " + th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadMiUser$lambda$17(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    private final void queryByUidAndDid(int userType, VirtualAccount virtualAccount, final Function1<? super List<VirtualAccount>, Unit> callBack) {
        VirtualAccountHelper.INSTANCE.queryByUidAndDidAndUserType(userType, virtualAccount, new Function1() { // from class: ny3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsActivity.queryByUidAndDid$lambda$13(callBack, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryByUidAndDid$lambda$13(Function1 callBack, List list) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(list, "list");
        callBack.invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void saveClaimRecordsToTargetAccount(int userType, final long virtualId, UserPhotoIcon icon) {
        String nickName;
        final long j = virtualId;
        String str = TAG;
        Logger.i(TAG, "claimRecordGet, userType: " + userType + ", virtualId: " + j);
        List<ClaimRecord> checkList = getCheckList();
        List<ClaimRecord> list = checkList;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!NetUtil.INSTANCE.getNetWorkAvailable(this)) {
            ToastUtil.INSTANCE.showToast(zzi.common_hint_network_unavailable);
            return;
        }
        showLoading(zzi.e, false);
        this.size = 0;
        this.delList = new ArrayList();
        for (final ClaimRecord claimRecord : checkList) {
            Logger.i(str, "claimRecordGet claimRecord : " + f4b.c(claimRecord));
            Logger.i(str, "claimRecordGet sex : " + icon.getSex());
            Logger.i(str, "claimRecordGet age : " + icon.getAge());
            Logger.i(str, "claimRecordGet height : " + icon.getHeight());
            Logger.i(str, "claimRecordGet height : " + icon.getHeight());
            if (hasZK(claimRecord)) {
                int[] iArr = {claimRecord.getLfz12(), claimRecord.getLfz13(), claimRecord.getLfz14(), claimRecord.getLfz23(), claimRecord.getLfz24(), claimRecord.getLfz34(), claimRecord.getHfz12(), claimRecord.getHfz13(), claimRecord.getHfz14(), claimRecord.getHfz23(), claimRecord.getHfz24(), claimRecord.getHfz34()};
                ClaimRecordsViewModel claimRecordsViewModel = (ClaimRecordsViewModel) getMViewModel();
                String strValueOf = String.valueOf(getDid());
                String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
                String url = icon.getUrl();
                if (icon.getNickName() == null || (nickName = icon.getNickName()) == null) {
                    nickName = "";
                }
                claimRecordsViewModel.addBodyCompositionWeightRecord(strValueOf, "yunmai.scales.ms3001", userType, userId, virtualId, url, nickName, claimRecord.getHeartRate(), icon.getSex(), icon.getAge(), icon.getHeight(), claimRecord.getWeight(), iArr, claimRecord.getCreateTime(), true, null, new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsActivity.saveClaimRecordsToTargetAccount.2
                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
                    public void onSuccess() throws JSONException {
                        ClaimRecordsActivity.this.deleteRecord(claimRecord, j);
                    }
                });
            } else {
                ((ClaimRecordsViewModel) getMViewModel()).addVirtualAccountWeightRecord(String.valueOf(getDid()), "yunmai.scales.ms3001", "", virtualId, "", claimRecord.getWeight(), userType, claimRecord.getCreateTime(), null, null, new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsActivity.saveClaimRecordsToTargetAccount.3
                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
                    public void onSuccess() throws JSONException {
                        ClaimRecordsActivity.this.deleteRecord(claimRecord, virtualId);
                    }
                });
            }
            j = virtualId;
            str = str;
        }
    }

    private final void showEnsureClaimDialog(final int userType, final long virtualId, final UserPhotoIcon icon) {
        CommonDialog commonDialogCreate = new CommonDialog.c("show_ensure_claim_dialog").setDialogTitle(zzi.s0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(zzi.t0, icon.getNickName()))).setPositiveText(zzi.c).setNegativeText(zzi.f41831b).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsActivity.showEnsureClaimDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) throws JSONException {
                if (which != -3) {
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        ClaimRecordsActivity.this.showSaveWeightDialog();
                        ClaimRecordsActivity.this.updateUserDialog();
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                ClaimRecordsActivity.this.saveClaimRecordsToTargetAccount(userType, virtualId, icon);
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void showMoreData(List<ClaimRecord> mClaimRecords) {
        if (isFinishing()) {
            return;
        }
        ClaimRecordMoreAdapter claimRecordMoreAdapter = this.claimRecordMoreAdapter;
        ClaimRecordMoreAdapter claimRecordMoreAdapter2 = null;
        if (claimRecordMoreAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordMoreAdapter");
            claimRecordMoreAdapter = null;
        }
        claimRecordMoreAdapter.setList(mClaimRecords);
        ClaimRecordMoreAdapter claimRecordMoreAdapter3 = this.claimRecordMoreAdapter;
        if (claimRecordMoreAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordMoreAdapter");
            claimRecordMoreAdapter3 = null;
        }
        claimRecordMoreAdapter3.getLoadMoreModule().loadMoreComplete();
        ClaimRecordMoreAdapter claimRecordMoreAdapter4 = this.claimRecordMoreAdapter;
        if (claimRecordMoreAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordMoreAdapter");
        } else {
            claimRecordMoreAdapter2 = claimRecordMoreAdapter4;
        }
        claimRecordMoreAdapter2.getLoadMoreModule().loadMoreEnd(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSaveWeightDialog() {
        this.mDialogFlag = 3;
        CommonDialog<?> commonDialog = this.selectUserDialog;
        if (commonDialog != null) {
            Intrinsics.checkNotNull(commonDialog);
            if (commonDialog.isShowing()) {
                return;
            }
        }
        this.userIcons.clear();
        this.userIcons.add(new AddUserIcon("", lni.A, getString(zzi.F)));
        UserPhotoAdapter userPhotoAdapter = new UserPhotoAdapter(this.userIcons);
        this.userAdapter = userPhotoAdapter;
        Intrinsics.checkNotNull(userPhotoAdapter);
        userPhotoAdapter.setOnItemClickListener(this);
        View viewInflate = LayoutInflater.from(this).inflate(gui.v0, (ViewGroup) null);
        miuix.recyclerview.widget.RecyclerView recyclerView = (miuix.recyclerview.widget.RecyclerView) viewInflate.findViewById(bri.O0);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setAdapter(this.userAdapter);
        this.selectUserDialog = new CommonDialog.c(WeightActivity.SAVE_WEIGHT).setDialogTitle(zzi.u5).setCustomView(viewInflate).setCanceledOnBackPressed(true).setCanceledOnTouchOutside(true).create();
        Logger.i(TAG, "handleWeight shouldPop commonDialog");
        CommonDialog<?> commonDialog2 = this.selectUserDialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.showIfNeed(getSupportFragmentManager());
        viewInflate.postDelayed(new Runnable() { // from class: vy3
            @Override // java.lang.Runnable
            public final void run() {
                ClaimRecordsActivity.showSaveWeightDialog$lambda$5(this.f37354a);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSaveWeightDialog$lambda$5(ClaimRecordsActivity this$0) {
        Dialog dialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog<?> commonDialog = this$0.selectUserDialog;
        if (commonDialog == null || (dialog = commonDialog.getDialog()) == null) {
            return;
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ty3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ClaimRecordsActivity.showSaveWeightDialog$lambda$5$lambda$4(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSaveWeightDialog$lambda$5$lambda$4(DialogInterface dialogInterface) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUserDialog() throws JSONException {
        this.userIcons.clear();
        this.userIcons.add(new AddUserIcon("", lni.A, getString(zzi.F)));
        String did = getDid();
        Intrinsics.checkNotNull(did);
        getAllVirtualAccount(did);
    }

    private final void updateWeekData(List<ClaimRecord> mClaimRecords) {
        ClaimRecordsHeaderView claimRecordsHeaderView = this.claimRecordsHeaderView;
        if (claimRecordsHeaderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("claimRecordsHeaderView");
            claimRecordsHeaderView = null;
        }
        claimRecordsHeaderView.updateData(mClaimRecords);
    }

    @NotNull
    public final List<DeleteByDidAndCreateTimeBean> getDelList() {
        return this.delList;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.e;
    }

    @Nullable
    public final CommonDialog<?> getSelectUserDialog() {
        return this.selectUserDialog;
    }

    public final int getSize() {
        return this.size;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == 100) {
            ClaimRecordsViewModel claimRecordsViewModel = (ClaimRecordsViewModel) getMViewModel();
            List<ClaimRecord> list = this.listToRemove;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listToRemove");
                list = null;
            }
            claimRecordsViewModel.removeClaimedRecords(list);
            CommonDialog<?> commonDialog = this.selectUserDialog;
            if (commonDialog != null) {
                commonDialog.dismiss();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.electronic.scale.adapter.UserPhotoAdapter.OnItemClickListener
    public void onAddUser(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (((ClaimRecordsViewModel) getMViewModel()).getVirtualUserCount() >= ((ClaimRecordsViewModel) getMViewModel()).getVirtualUserMax()) {
            ToastUtil.showShortToast(getResources().getString(zzi.W3));
            return;
        }
        List<ClaimRecord> checkList = getCheckList();
        List<ClaimRecord> list = checkList;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!NetUtil.INSTANCE.getNetWorkAvailable(this)) {
            ToastUtil.INSTANCE.showToast(zzi.common_hint_network_unavailable);
            return;
        }
        VirtualAccount virtualAccount = new VirtualAccount(null, null, Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524283, null);
        UserAddActivity.Companion companion = UserAddActivity.INSTANCE;
        String did2 = getDid();
        Intrinsics.checkNotNull(did2);
        companion.start(this, virtualAccount, 0, did2, checkList, (64 & 32) != 0 ? 1 : this.mUnit, (64 & 64) != 0 ? false : false);
        CommonDialog<?> commonDialog = this.selectUserDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        this.listToRemove = checkList;
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onBodyCompositionSDKMeasure(@NotNull ScaleEventBusIds.OnBodyCompositionSDKMeasureEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.showNoBodyFatErrorDialog = !event.getIsSuccess();
    }

    @Override // com.xiaomi.fitness.electronic.scale.adapter.UserPhotoAdapter.OnItemClickListener
    public void onClick(@NotNull UserPhotoIcon icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        long j = Long.parseLong(icon.getVirtualId());
        if (!icon.getIsVirtual()) {
            checkLatestWeight(1, j, null, icon);
            return;
        }
        VirtualAccount virtualAccount = icon.getVirtualAccount();
        if (virtualAccount != null && virtualAccount.isIncomplete()) {
            virtualAccount.setSex(-1);
            handleVirtualAccountIncompleteCase(virtualAccount);
            return;
        }
        Intrinsics.checkNotNull(virtualAccount);
        checkLatestWeight(2, j, virtualAccount, icon);
        CommonDialog<?> commonDialog = this.selectUserDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_ClaimRecordsActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws JSONException {
        super.onCreate(savedInstanceState);
        ld8.c().p(this);
        initView();
        loadMiUser();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_ClaimRecordsActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String did = getDid();
        Intrinsics.checkNotNull(did);
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) ecoDeviceManagerExtKt.getDeviceModel(did);
        if (ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected()) {
            EightDeviceSyncImpl eightDeviceSyncImpl = new EightDeviceSyncImpl();
            String did2 = getDid();
            Intrinsics.checkNotNull(did2);
            eightDeviceSyncImpl.syncVirtualUser(did2);
        }
        ld8.c().r(this);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onUserAddEvent(@NotNull ScaleEventBusIds.OnUserAddEvent event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        updateUserDialog();
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onUserModifyEvent(@NotNull ScaleEventBusIds.OnUserModifyEvent event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        updateUserDialog();
    }

    public final void setDelList(@NotNull List<DeleteByDidAndCreateTimeBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.delList = list;
    }

    public final void setSelectUserDialog(@Nullable CommonDialog<?> commonDialog) {
        this.selectUserDialog = commonDialog;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addVirtualAccountIcon(String did, UserPhotoIcon icon) {
        this.userIcons.add(0, icon);
        UserPhotoAdapter userPhotoAdapter = this.userAdapter;
        if (userPhotoAdapter != null) {
            userPhotoAdapter.updateData(this.userIcons);
        }
    }
}
