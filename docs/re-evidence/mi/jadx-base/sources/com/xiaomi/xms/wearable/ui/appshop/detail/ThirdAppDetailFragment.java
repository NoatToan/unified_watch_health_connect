package com.xiaomi.xms.wearable.ui.appshop.detail;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.Observer;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.xms.wearable.ui.appshop.detail.ThirdAppDetailFragment;
import com.xiaomi.xms.wearable.ui.appshop.model.AppListItem;
import com.xiaomi.xms.wearable.ui.appshop.model.AppStatusInfo;
import com.xiaomi.xms.wearable.ui.appshop.model.WatchAppListData;
import com.xiaomi.xms.wearable.widget.ExpandableTextView;
import defpackage.mtr;
import defpackage.otr;
import defpackage.sk5;
import defpackage.wvi;
import defpackage.x1j;
import defpackage.zsr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B\u0007¢\u0006\u0004\b.\u0010$J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000f\u0010\u0015J!\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\r*\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\r*\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/detail/ThirdAppDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/xms/wearable/ui/appshop/detail/ThirdAppDetailViewModel;", "Lzsr;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppBean;", "item", "", "initAppInfo", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppBean;)V", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", "appStatusInfo", "onAppStatusChanged", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;)V", "", "text", "showToast", "(Ljava/lang/String;)V", "onProgressChanged", "onBtnStateChanged", "", "strRes", "(I)V", "titleRes", MiuiCursorConstants.CONTENT, "getInfoString", "(ILjava/lang/String;)Ljava/lang/String;", "getFileSize", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppBean;)Ljava/lang/String;", "getUpdateDate", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "Lotr;", "mBottomViewBinding", "Lotr;", "Lmtr;", "mProgressBinding", "Lmtr;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nThirdAppDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdAppDetailFragment.kt\ncom/xiaomi/xms/wearable/ui/appshop/detail/ThirdAppDetailFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n54#2,3:216\n24#2:219\n57#2,6:220\n63#2,2:227\n57#3:226\n1#4:229\n*S KotlinDebug\n*F\n+ 1 ThirdAppDetailFragment.kt\ncom/xiaomi/xms/wearable/ui/appshop/detail/ThirdAppDetailFragment\n*L\n47#1:216,3\n47#1:219\n47#1:220,6\n47#1:227,2\n47#1:226\n*E\n"})
public final class ThirdAppDetailFragment extends Hilt_ThirdAppDetailFragment<ThirdAppDetailViewModel, zsr> {

    @NotNull
    public static final String EXTRA_APP_INFO = "extra_app_info";

    @NotNull
    public static final String TAG = "ThirdAppDetailFragment";
    private otr mBottomViewBinding;

    @Nullable
    private mtr mProgressBinding;

    private final String getFileSize(WatchAppListData.WatchAppBean watchAppBean) {
        String string = ApplicationExtKt.getApplication().getResources().getString(x1j.s, Float.valueOf(watchAppBean.size / 1024));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String getInfoString(int titleRes, String content) {
        Resources resources = requireContext().getResources();
        int i = x1j.g;
        Object[] objArr = new Object[2];
        objArr[0] = resources.getString(titleRes);
        if (content == null) {
            content = "";
        }
        objArr[1] = content;
        String string = resources.getString(i, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String getUpdateDate(WatchAppListData.WatchAppBean watchAppBean) {
        String updateTime = watchAppBean.updateTime;
        Intrinsics.checkNotNullExpressionValue(updateTime, "updateTime");
        return TimeDateUtil.getDateYYYYMMddLocalFormat(Long.parseLong(updateTime) * ((long) 1000));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAppInfo(WatchAppListData.WatchAppBean item) {
        setTitle(item.app_name);
        ImageView appIcon = ((zsr) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(appIcon, "appIcon");
        Coil.imageLoader(appIcon.getContext()).enqueue(new ImageRequest.Builder(appIcon.getContext()).data(item.icon).target(appIcon).build());
        ((zsr) getMBinding()).C.setText(item.app_name);
        ((zsr) getMBinding()).G.setVisibility(TextUtils.isEmpty(item.introduction) ? 8 : 0);
        ((zsr) getMBinding()).G.setExpandableText(getInfoString(x1j.l, item.introduction));
        ((zsr) getMBinding()).K.setVisibility(TextUtils.isEmpty(item.change_log) ? 8 : 0);
        ((zsr) getMBinding()).K.setExpandableText(getInfoString(x1j.x, item.change_log));
        ((zsr) getMBinding()).I.setExpandableText(getInfoString(x1j.f38583r, getFileSize(item)));
        ((zsr) getMBinding()).J.setVisibility(TextUtils.isEmpty(item.updateTime) ? 8 : 0);
        ((zsr) getMBinding()).J.setExpandableText(getInfoString(x1j.w, getUpdateDate(item)));
        ExpandableTextView expandableTextView = ((zsr) getMBinding()).E;
        int i = x1j.z;
        String str = item.developer_name;
        expandableTextView.setExpandableText(getInfoString(i, (str == null || StringsKt__StringsKt.isBlank(str)) ? getString(x1j.A) : item.developer_name));
        ExpandableTextView expandableTextView2 = ((zsr) getMBinding()).H;
        int i2 = x1j.C;
        String str2 = item.record_number;
        expandableTextView2.setExpandableText(getInfoString(i2, (str2 == null || StringsKt__StringsKt.isBlank(str2)) ? getString(x1j.B) : item.record_number));
    }

    private final void onAppStatusChanged(AppStatusInfo appStatusInfo) {
        String string;
        Logger.i(TAG, "onAppStatusChanged:" + appStatusInfo);
        int status = appStatusInfo.getStatus();
        if (status != 4) {
            if (status != 6) {
                if (status != 8) {
                    if (status != 9) {
                        if (status == 11) {
                            return;
                        }
                        if (status != 12) {
                            if (status == 15) {
                                showToast(x1j.u);
                                return;
                            }
                            if (status != 16) {
                                onBtnStateChanged(appStatusInfo);
                                return;
                            }
                            Logger.e(TAG, "onAppStatusChanged action failed:" + appStatusInfo);
                            showToast(x1j.common_hint_unkonwn_error);
                            return;
                        }
                    }
                }
            }
            if (appStatusInfo.getErrMsg() != null) {
                string = appStatusInfo.getErrMsg();
                Intrinsics.checkNotNull(string);
            } else {
                string = getString(x1j.common_hint_unkonwn_error);
                Intrinsics.checkNotNull(string);
            }
            showToast(string);
            return;
        }
        onProgressChanged(appStatusInfo);
    }

    private final void onBtnStateChanged(AppStatusInfo appStatusInfo) {
        AppCompatButton appCompatButton;
        View root;
        otr otrVar = this.mBottomViewBinding;
        otr otrVar2 = null;
        if (otrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
            otrVar = null;
        }
        otrVar.B.setVisibility(0);
        mtr mtrVar = this.mProgressBinding;
        if (mtrVar != null && (root = mtrVar.getRoot()) != null) {
            root.setVisibility(8);
        }
        int status = appStatusInfo.getStatus();
        if (status == 0) {
            otr otrVar3 = this.mBottomViewBinding;
            if (otrVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
                otrVar3 = null;
            }
            appCompatButton = otrVar3.A;
            otr otrVar4 = this.mBottomViewBinding;
            if (otrVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
            } else {
                otrVar2 = otrVar4;
            }
            otrVar2.C.setVisibility(8);
        } else if (status != 2) {
            otr otrVar5 = this.mBottomViewBinding;
            if (otrVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
                otrVar5 = null;
            }
            appCompatButton = otrVar5.C;
            otr otrVar6 = this.mBottomViewBinding;
            if (otrVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
            } else {
                otrVar2 = otrVar6;
            }
            otrVar2.A.setVisibility(8);
        } else {
            otr otrVar7 = this.mBottomViewBinding;
            if (otrVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
                otrVar7 = null;
            }
            appCompatButton = otrVar7.A;
            otr otrVar8 = this.mBottomViewBinding;
            if (otrVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
                otrVar8 = null;
            }
            otrVar8.C.setText(getString(x1j.t));
            otr otrVar9 = this.mBottomViewBinding;
            if (otrVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
            } else {
                otrVar2 = otrVar9;
            }
            otrVar2.C.setVisibility(0);
        }
        appCompatButton.setVisibility(0);
        appCompatButton.setEnabled(appStatusInfo.getStatusEnable());
        String statusText = appStatusInfo.getStatusText();
        if (statusText != null) {
            appCompatButton.setText(statusText);
        }
    }

    private final void onProgressChanged(final AppStatusInfo appStatusInfo) {
        otr otrVar = this.mBottomViewBinding;
        otr otrVar2 = null;
        if (otrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
            otrVar = null;
        }
        if (!otrVar.D.i()) {
            otr otrVar3 = this.mBottomViewBinding;
            if (otrVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
                otrVar3 = null;
            }
            otrVar3.D.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: t9p
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view) {
                    ThirdAppDetailFragment.onProgressChanged$lambda$5(this.f34480a, appStatusInfo, viewStub, view);
                }
            });
            otr otrVar4 = this.mBottomViewBinding;
            if (otrVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
                otrVar4 = null;
            }
            ViewStub viewStubH = otrVar4.D.h();
            if (viewStubH != null) {
                viewStubH.inflate();
            }
        }
        mtr mtrVar = this.mProgressBinding;
        if (mtrVar != null) {
            mtrVar.getRoot().setVisibility(0);
            otr otrVar5 = this.mBottomViewBinding;
            if (otrVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
            } else {
                otrVar2 = otrVar5;
            }
            otrVar2.B.setVisibility(8);
            mtrVar.C.setText(appStatusInfo.getStatusText());
            mtrVar.B.setText(mtrVar.getRoot().getContext().getResources().getString(x1j.p, Integer.valueOf(appStatusInfo.getStatusValue())));
            mtrVar.A.setProgress(appStatusInfo.getStatusValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onProgressChanged$lambda$5(ThirdAppDetailFragment this$0, AppStatusInfo appStatusInfo, ViewStub viewStub, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appStatusInfo, "$appStatusInfo");
        Logger.d(TAG, "on progressStub inflated");
        this$0.mProgressBinding = (mtr) sk5.c(view);
        this$0.onProgressChanged(appStatusInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(ThirdAppDetailFragment this$0, AppStatusInfo appStatusInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (appStatusInfo != null) {
            this$0.onAppStatusChanged(appStatusInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$3(ThirdAppDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((ThirdAppDetailViewModel) this$0.getMViewModel()).onActionBtnClicked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$4(ThirdAppDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((ThirdAppDetailViewModel) this$0.getMViewModel()).onActionBtnClicked(false);
    }

    private final void showToast(String text) {
        Logger.d(TAG, "showToast " + isVisible());
        if (isVisible()) {
            ToastUtil.showToast(text);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return wvi.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(x1j.q);
        AppListItem appListItemHandleArguments = ((ThirdAppDetailViewModel) getMViewModel()).handleArguments(getArguments());
        if (appListItemHandleArguments != null) {
            initAppInfo(appListItemHandleArguments.getBean());
        } else {
            ToastUtil.INSTANCE.showToast(x1j.common_hint_unkonwn_error);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((ThirdAppDetailViewModel) getMViewModel()).observerAppStatus(this, new Observer() { // from class: q9p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ThirdAppDetailFragment.setListener$lambda$2(this.f31265a, (AppStatusInfo) obj);
            }
        });
        otr otrVar = ((zsr) getMBinding()).D;
        this.mBottomViewBinding = otrVar;
        otr otrVar2 = null;
        if (otrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
            otrVar = null;
        }
        otrVar.A.setOnClickListener(new View.OnClickListener() { // from class: r9p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdAppDetailFragment.setListener$lambda$3(this.f32337a, view);
            }
        });
        otr otrVar3 = this.mBottomViewBinding;
        if (otrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomViewBinding");
        } else {
            otrVar2 = otrVar3;
        }
        otrVar2.C.setOnClickListener(new View.OnClickListener() { // from class: s9p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdAppDetailFragment.setListener$lambda$4(this.f33436a, view);
            }
        });
    }

    private final void showToast(int strRes) {
        Logger.d(TAG, "showToast " + isVisible());
        if (isVisible()) {
            ToastUtil.INSTANCE.showToast(strRes);
        }
    }
}
