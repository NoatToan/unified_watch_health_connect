package com.xiaomi.fitness.rn.share.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.CircleCropTransformation;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.share.ui.ReceiveUserInfoActivity;
import com.xiaomi.fitness.rn.share.viewmodel.ReceiveUserInfoViewModel;
import defpackage.avi;
import defpackage.coi;
import defpackage.w0j;
import defpackage.wvk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/rn/share/ui/ReceiveUserInfoActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/rn/share/viewmodel/ReceiveUserInfoViewModel;", "Lwvk;", "", "bindView", "(Lwvk;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "Companion", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nReceiveUserInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReceiveUserInfoActivity.kt\ncom/xiaomi/fitness/rn/share/ui/ReceiveUserInfoActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,79:1\n54#2,3:80\n24#2:83\n59#2,6:84\n*S KotlinDebug\n*F\n+ 1 ReceiveUserInfoActivity.kt\ncom/xiaomi/fitness/rn/share/ui/ReceiveUserInfoActivity\n*L\n47#1:80,3\n47#1:83\n47#1:84,6\n*E\n"})
public final class ReceiveUserInfoActivity extends BaseBindingActivity<ReceiveUserInfoViewModel, wvk> {

    @NotNull
    public static final String sAvatar = "sAvatar";

    @NotNull
    public static final String sNickName = "sNickName";
    public static final int sRequestCodeReceiveInfo = 10;

    @NotNull
    public static final String sUserId = "sUserId";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$4(final ReceiveUserInfoActivity this$0, String str, String str2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ReceiveUserInfoViewModel receiveUserInfoViewModel = (ReceiveUserInfoViewModel) this$0.getMViewModel();
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(str2);
        receiveUserInfoViewModel.share(str, str2, new Function1() { // from class: mhj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ReceiveUserInfoActivity.bindView$lambda$4$lambda$2(this.f26188a, ((Boolean) obj).booleanValue());
            }
        }, new Function2() { // from class: nhj
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReceiveUserInfoActivity.bindView$lambda$4$lambda$3(((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$2(ReceiveUserInfoActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            ToastUtil.INSTANCE.showToast(w0j.x);
            this$0.setResult(-1);
            this$0.finish();
        } else {
            ToastUtil.INSTANCE.showToast(w0j.common_hint_unkonwn_error);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$3(int i, String str) {
        int i2;
        if (i != -4001004) {
            i2 = (i == -12 || i == -11) ? w0j.v : w0j.common_hint_unkonwn_error;
        } else {
            i2 = w0j.w;
        }
        ToastUtil.INSTANCE.showToast(i2);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull wvk wvkVar) {
        Intrinsics.checkNotNullParameter(wvkVar, "<this>");
        setTitle(w0j.z);
        final String stringExtra = getIntent().getStringExtra("sDid");
        String stringExtra2 = getIntent().getStringExtra(sNickName);
        final String stringExtra3 = getIntent().getStringExtra(sUserId);
        String stringExtra4 = getIntent().getStringExtra(sAvatar);
        RNDeviceManager rNDeviceManagerExtKt = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE);
        Intrinsics.checkNotNull(stringExtra);
        RNDeviceModel rNDeviceModel = (RNDeviceModel) rNDeviceManagerExtKt.getDeviceModel(stringExtra);
        if (rNDeviceModel != null) {
            wvkVar.B.setText(getString(w0j.m, DeviceModelExtKt.getName(rNDeviceModel)));
        }
        ImageView avatarView = wvkVar.A;
        Intrinsics.checkNotNullExpressionValue(avatarView, "avatarView");
        ImageLoader imageLoader = Coil.imageLoader(avatarView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(avatarView.getContext()).data(stringExtra4).target(avatarView);
        builderTarget.placeholder(coi.e);
        builderTarget.error(coi.e);
        builderTarget.transformations(new CircleCropTransformation());
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        imageLoader.enqueue(builderTarget.build());
        wvkVar.C.setText(stringExtra2);
        wvkVar.D.setOnClickListener(new View.OnClickListener() { // from class: ohj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReceiveUserInfoActivity.bindView$lambda$4(this.f29181a, stringExtra, stringExtra3, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return avi.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }
}
