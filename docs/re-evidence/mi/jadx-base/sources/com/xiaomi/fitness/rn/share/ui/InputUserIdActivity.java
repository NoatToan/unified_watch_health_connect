package com.xiaomi.fitness.rn.share.ui;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.size.Scale;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.rn.share.bean.UserBean;
import com.xiaomi.fitness.rn.share.ui.InputUserIdActivity;
import com.xiaomi.fitness.rn.share.viewmodel.InputUserIdViewModel;
import defpackage.avi;
import defpackage.uvk;
import defpackage.w0j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/rn/share/ui/InputUserIdActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/rn/share/viewmodel/InputUserIdViewModel;", "Luvk;", "", "bindView", "(Luvk;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nInputUserIdActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputUserIdActivity.kt\ncom/xiaomi/fitness/rn/share/ui/InputUserIdActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,87:1\n54#2,3:88\n24#2:91\n59#2,6:92\n65#3,16:98\n93#3,3:114\n*S KotlinDebug\n*F\n+ 1 InputUserIdActivity.kt\ncom/xiaomi/fitness/rn/share/ui/InputUserIdActivity\n*L\n44#1:88,3\n44#1:91\n44#1:92,6\n69#1:98,16\n69#1:114,3\n*E\n"})
public final class InputUserIdActivity extends BaseBindingActivity<InputUserIdViewModel, uvk> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$5(uvk this_bindView, final InputUserIdActivity this$0, final String str, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((InputUserIdViewModel) this$0.getMViewModel()).getUserProfile(this_bindView.A.getText().toString(), new Function1() { // from class: bbd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return InputUserIdActivity.bindView$lambda$5$lambda$3(this.f4014a, str, (UserBean) obj);
            }
        }, new Function0() { // from class: cbd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InputUserIdActivity.bindView$lambda$5$lambda$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$3(InputUserIdActivity this$0, String str, UserBean userInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        if (Intrinsics.areEqual(userInfo.getUserId(), AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId())) {
            ToastUtil.INSTANCE.showToast(w0j.u);
            return Unit.INSTANCE;
        }
        Intent intent = new Intent(this$0, (Class<?>) ReceiveUserInfoActivity.class);
        intent.putExtra("sDid", str);
        intent.putExtra(ReceiveUserInfoActivity.sUserId, userInfo.getUserId());
        intent.putExtra(ReceiveUserInfoActivity.sNickName, userInfo.getNickname());
        intent.putExtra(ReceiveUserInfoActivity.sAvatar, userInfo.getIcon());
        this$0.startActivityForResult(intent, 10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$4() {
        ToastUtil.INSTANCE.showToast(w0j.n);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final uvk uvkVar) {
        RNProduct productByModel;
        Intrinsics.checkNotNullParameter(uvkVar, "<this>");
        setTitle(w0j.z);
        final String stringExtra = getIntent().getStringExtra("sDid");
        RNDeviceManager rNDeviceManagerExtKt = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE);
        Intrinsics.checkNotNull(stringExtra);
        RNDeviceModel rNDeviceModel = (RNDeviceModel) rNDeviceManagerExtKt.getDeviceModel(stringExtra);
        if (rNDeviceModel != null) {
            try {
                productByModel = ProductExtKt.getInstance(RNProductManager.INSTANCE).getProductByModel(DeviceModelExtKt.getModel(rNDeviceModel));
            } catch (Exception e) {
                e.printStackTrace();
                productByModel = null;
            }
            if (productByModel != null) {
                uvkVar.B.setText(DeviceModelExtKt.getName(rNDeviceModel));
                ImageView picView = uvkVar.C;
                Intrinsics.checkNotNullExpressionValue(picView, "picView");
                String bigIcon = productByModel.getBigIcon();
                ImageLoader imageLoader = Coil.imageLoader(picView.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(picView.getContext()).data(bigIcon).target(picView);
                builderTarget.scale(Scale.FILL);
                imageLoader.enqueue(builderTarget.build());
            }
        }
        uvkVar.E.setOnClickListener(new View.OnClickListener() { // from class: abd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InputUserIdActivity.bindView$lambda$5(uvkVar, this, stringExtra, view);
            }
        });
        EditText inputView = uvkVar.A;
        Intrinsics.checkNotNullExpressionValue(inputView, "inputView");
        inputView.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.rn.share.ui.InputUserIdActivity$bindView$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                TextView textView = uvkVar.E;
                boolean z = false;
                if (s != null && s.length() == 0) {
                    z = true;
                }
                textView.setEnabled(!z);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return avi.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && resultCode == -1) {
            setResult(-1);
            finish();
        }
    }
}
