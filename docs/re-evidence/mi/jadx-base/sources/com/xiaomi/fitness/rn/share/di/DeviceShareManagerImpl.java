package com.xiaomi.fitness.rn.share.di;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.DeviceShareManager;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.rn.share.bean.DeviceShareMsgBean;
import com.xiaomi.fitness.rn.share.bean.ShareMsgDetailBean;
import com.xiaomi.fitness.rn.share.bean.ShareMsgListBean;
import com.xiaomi.fitness.rn.share.di.DeviceShareManagerImpl;
import com.xiaomi.fitness.rn.share.request.ShareRequest;
import com.xiaomi.fitness.rn.share.ui.DeviceShareActivity;
import com.xiaomi.fitness.rn.share.ui.DeviceShareDetailActivity;
import com.xiaomi.fitness.rn.share.ui.DeviceShareDialogActivity;
import com.xiaomi.fitness.rn.share.utils.UtilsKt;
import defpackage.avi;
import defpackage.tri;
import defpackage.vo6;
import defpackage.w0j;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/rn/share/di/DeviceShareManagerImpl;", "Lcom/xiaomi/fitness/rn/export/DeviceShareManager;", "<init>", "()V", "gotoDeviceShareListActivity", "", "context", "Landroid/content/Context;", "sonPage", "", "gotoDeviceShareDetailActivity", "did", "checkDeviceShareDialog", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "checkHealthDeviceAccessSwitch", "shareAccept", "", PkConstants.PARAM_INVITE_ID, "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceShareManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceShareManagerImpl.kt\ncom/xiaomi/fitness/rn/share/di/DeviceShareManagerImpl\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,106:1\n54#2,3:107\n24#2:110\n57#2,6:111\n63#2,2:118\n57#3:117\n*S KotlinDebug\n*F\n+ 1 DeviceShareManagerImpl.kt\ncom/xiaomi/fitness/rn/share/di/DeviceShareManagerImpl\n*L\n66#1:107,3\n66#1:110\n66#1:111,6\n66#1:118,2\n66#1:117\n*E\n"})
public final class DeviceShareManagerImpl implements DeviceShareManager {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkDeviceShareDialog$lambda$5(final WeakReference activityRef, ShareRequest shareRequest, final DeviceShareManagerImpl this$0, final ShareMsgListBean msgIdListBean) {
        Intrinsics.checkNotNullParameter(activityRef, "$activityRef");
        Intrinsics.checkNotNullParameter(shareRequest, "$shareRequest");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msgIdListBean, "msgIdListBean");
        vo6.c("msgIdListBean.msg_ids " + msgIdListBean.getMsg_ids().size());
        if ((!msgIdListBean.getMsg_ids().isEmpty()) && activityRef.get() != null) {
            long jLongValue = msgIdListBean.getMsg_ids().get(0).longValue();
            vo6.c("msgId " + jLongValue);
            shareRequest.getMsgDetail(jLongValue, new Function1() { // from class: zo6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceShareManagerImpl.checkDeviceShareDialog$lambda$5$lambda$3(activityRef, msgIdListBean, this$0, (ShareMsgDetailBean) obj);
                }
            }, new Function0() { // from class: ap6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkDeviceShareDialog$lambda$5$lambda$3(WeakReference activityRef, final ShareMsgListBean msgIdListBean, final DeviceShareManagerImpl this$0, final ShareMsgDetailBean msgBean) {
        String productName;
        String bigPreview;
        Intrinsics.checkNotNullParameter(activityRef, "$activityRef");
        Intrinsics.checkNotNullParameter(msgIdListBean, "$msgIdListBean");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msgBean, "msgBean");
        vo6.c("deviceShareMsgBean " + msgBean + ".deviceShareMsgBean");
        final FragmentActivity fragmentActivity = (FragmentActivity) activityRef.get();
        if (msgBean.getDeviceShareMsgBean() != null && fragmentActivity != null) {
            RNProduct productByModel = null;
            View viewInflate = LayoutInflater.from(fragmentActivity).inflate(avi.j, (ViewGroup) null);
            View element = viewInflate.findViewById(tri.e);
            try {
                RNProductManager productExtKt = ProductExtKt.getInstance(RNProductManager.INSTANCE);
                DeviceShareMsgBean deviceShareMsgBean = msgBean.getDeviceShareMsgBean();
                Intrinsics.checkNotNull(deviceShareMsgBean);
                productByModel = productExtKt.getProductByModel(deviceShareMsgBean.getModel());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (productByModel != null && (bigPreview = productByModel.getBigPreview()) != null) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                ImageView imageView = (ImageView) element;
                Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(bigPreview).target(imageView).build());
            }
            if (productByModel == null || (productName = productByModel.getProductName()) == null) {
                productName = "";
            }
            String string = ResourceExtKt.getString(w0j.q);
            int i = w0j.f37418r;
            DeviceShareMsgBean deviceShareMsgBean2 = msgBean.getDeviceShareMsgBean();
            Intrinsics.checkNotNull(deviceShareMsgBean2);
            String string2 = ResourceExtKt.getString(i, deviceShareMsgBean2.getSender_name(), productName);
            Intrinsics.checkNotNull(viewInflate);
            String string3 = ResourceExtKt.getString(msgIdListBean.getMsg_ids().size() == 1 ? w0j.e : w0j.t);
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            UtilsKt.showCustomerDialog(string, string2, viewInflate, string3, supportFragmentManager, ResourceExtKt.getString(w0j.f37416b), false, new Function1() { // from class: xo6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceShareManagerImpl.checkDeviceShareDialog$lambda$5$lambda$3$lambda$1(this.f39306a, msgIdListBean, msgBean, fragmentActivity, (DialogInterface) obj);
                }
            }, new Function1() { // from class: yo6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceShareManagerImpl.checkDeviceShareDialog$lambda$5$lambda$3$lambda$2((DialogInterface) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkDeviceShareDialog$lambda$5$lambda$3$lambda$1(DeviceShareManagerImpl this$0, ShareMsgListBean msgIdListBean, ShareMsgDetailBean msgBean, FragmentActivity fragmentActivity, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msgIdListBean, "$msgIdListBean");
        Intrinsics.checkNotNullParameter(msgBean, "$msgBean");
        boolean z = msgIdListBean.getMsg_ids().size() == 1;
        DeviceShareMsgBean deviceShareMsgBean = msgBean.getDeviceShareMsgBean();
        Intrinsics.checkNotNull(deviceShareMsgBean);
        this$0.checkHealthDeviceAccessSwitch(z, deviceShareMsgBean.getInvite_id(), fragmentActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkDeviceShareDialog$lambda$5$lambda$3$lambda$2(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    private final void checkHealthDeviceAccessSwitch(final boolean shareAccept, final String inviteId, final FragmentActivity activity) {
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getCommonConfig(new Function1() { // from class: dp6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareManagerImpl.checkHealthDeviceAccessSwitch$lambda$7(activity, shareAccept, inviteId, (String) obj);
            }
        }, new Function1() { // from class: ep6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareManagerImpl.checkHealthDeviceAccessSwitch$lambda$8((ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkHealthDeviceAccessSwitch$lambda$7(FragmentActivity activity, boolean z, String inviteId, String it) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(inviteId, "$inviteId");
        Intrinsics.checkNotNullParameter(it, "it");
        vo6.c("getCommonConfig onSuccess " + it);
        boolean z2 = TextUtils.isEmpty(it) || Intrinsics.areEqual(it, "0");
        RegionPreference.INSTANCE.setHEALTH_DEVICE_ACCESS_SWITCH(z2);
        DeviceShareDialogActivity.INSTANCE.launch(activity, z2, z, inviteId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkHealthDeviceAccessSwitch$lambda$8(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        vo6.a("getCommonConfig onFail " + it);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.rn.export.DeviceShareManager
    public void checkDeviceShareDialog(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final WeakReference weakReference = new WeakReference(activity);
        final ShareRequest shareRequest = new ShareRequest();
        shareRequest.loadShareMsgList(new Function1() { // from class: bp6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareManagerImpl.checkDeviceShareDialog$lambda$5(weakReference, shareRequest, this, (ShareMsgListBean) obj);
            }
        }, new Function0() { // from class: cp6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
    }

    @Override // com.xiaomi.fitness.rn.export.DeviceShareManager
    public void gotoDeviceShareDetailActivity(@NotNull Context context, @NotNull String did) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(did, "did");
        Intent intent = new Intent(context, (Class<?>) DeviceShareDetailActivity.class);
        intent.putExtra("sDid", did);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.rn.export.DeviceShareManager
    public void gotoDeviceShareListActivity(@NotNull Context context, @Nullable String sonPage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) DeviceShareActivity.class);
        if (sonPage == null) {
            sonPage = DeviceShareActivity.sPageShareList;
        }
        intent.putExtra(DeviceShareActivity.sSonPage, sonPage);
        context.startActivity(intent);
    }
}
