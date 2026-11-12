package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.VerifySuperCardActivity;
import com.xiaomi.fitness.nfc.ui.issued.CardRenameFragment;
import com.xiaomi.fitness.nfc.utils.PageUtilsKt;
import defpackage.jtk;
import defpackage.o0j;
import defpackage.o63;
import defpackage.s7r;
import defpackage.sui;
import defpackage.vqg;
import defpackage.wni;
import defpackage.zl3;
import defpackage.zlg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\u0007¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0006R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/VerifySuperCardActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/nfc/ui/VerifyViewModel;", "Lzlg;", "", "varify", "()V", "bindView", "(Lzlg;)V", LifecycleConstantKt.ON_DESTROY, "onBackPressed", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "getCardWrapper", "()Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "setCardWrapper", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;)V", "", "isNeed2Rename", "Z", "()Z", "setNeed2Rename", "(Z)V", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "mDataHandler", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "getMDataHandler", "()Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "setMDataHandler", "(Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class VerifySuperCardActivity extends BaseBindingActivity<VerifyViewModel, zlg> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String sIsNeed2Rename = "sIsNeed2Rename";

    @Nullable
    private CardWrapper cardWrapper;
    private boolean isNeed2Rename;

    @NotNull
    private DataHandlerWrapper mDataHandler = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.nfc.ui.VerifySuperCardActivity$mDataHandler$1
        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(String did, int type, s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            vqg.d("receiver nfc msg from device packet?.id:" + (packet != null ? Integer.valueOf(packet.f) : null));
            Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
            if (numValueOf == null || numValueOf.intValue() != 15) {
                return false;
            }
            AnyExtKt.main$default(null, new VerifySuperCardActivity$mDataHandler$1$handlePacket$1(this.this$0, null), 1, null);
            return true;
        }
    };

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/VerifySuperCardActivity$Companion;", "", "<init>", "()V", "sIsNeed2Rename", "", "getSIsNeed2Rename", "()Ljava/lang/String;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSIsNeed2Rename() {
            return VerifySuperCardActivity.sIsNeed2Rename;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(VerifySuperCardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().D.setVisibility(0);
        this$0.getMBinding().E.setVisibility(8);
        this$0.getMBinding().F.setVisibility(8);
        this$0.getMBinding().G.setText(o0j.q7);
        this$0.varify();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void varify() {
        setStartView(null);
        CardWrapper cardWrapper = this.cardWrapper;
        if (cardWrapper != null) {
            ((VerifyViewModel) getMViewModel()).varify(cardWrapper, new Function1() { // from class: uoq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return VerifySuperCardActivity.varify$lambda$3$lambda$2(this.f35975a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit varify$lambda$3$lambda$2(final VerifySuperCardActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o63.b(new jtk());
        this$0.getMBinding().D.setVisibility(8);
        if (z) {
            ToastUtil.showShortToast("成功");
            if (this$0.isNeed2Rename) {
                PageUtilsKt.gotoPage(this$0, CardRenameFragment.class, new Bundle());
            }
            this$0.setResult(-1);
            this$0.finish();
        } else {
            this$0.getMBinding().G.setText(this$0.getString(o0j.c3));
            this$0.getMBinding().B.setText(this$0.getString(o0j.K2));
            this$0.getMBinding().E.setVisibility(0);
            this$0.getMBinding().F.setVisibility(0);
            IActionBar.DefaultImpls.setStartView$default(this$0, 0, wni.y, this$0.getString(o0j.c), new View.OnClickListener() { // from class: voq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VerifySuperCardActivity.varify$lambda$3$lambda$2$lambda$1(this.f37092a, view);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void varify$lambda$3$lambda$2$lambda$1(VerifySuperCardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull zlg zlgVar) {
        Intrinsics.checkNotNullParameter(zlgVar, "<this>");
        setTitle(o0j.r7);
        hideBack();
        this.isNeed2Rename = getIntent().getBooleanExtra(sIsNeed2Rename, false);
        this.cardWrapper = zl3.g().i();
        zlgVar.C.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel());
        getMBinding().E.setOnClickListener(new View.OnClickListener() { // from class: woq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifySuperCardActivity.bindView$lambda$0(this.f38197a, view);
            }
        });
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(5, this.mDataHandler);
        varify();
    }

    @Nullable
    public final CardWrapper getCardWrapper() {
        return this.cardWrapper;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sui.e;
    }

    @NotNull
    public final DataHandlerWrapper getMDataHandler() {
        return this.mDataHandler;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX INFO: renamed from: isNeed2Rename, reason: from getter */
    public final boolean getIsNeed2Rename() {
        return this.isNeed2Rename;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(5, this.mDataHandler);
    }

    public final void setCardWrapper(@Nullable CardWrapper cardWrapper) {
        this.cardWrapper = cardWrapper;
    }

    public final void setMDataHandler(@NotNull DataHandlerWrapper dataHandlerWrapper) {
        Intrinsics.checkNotNullParameter(dataHandlerWrapper, "<set-?>");
        this.mDataHandler = dataHandlerWrapper;
    }

    public final void setNeed2Rename(boolean z) {
        this.isNeed2Rename = z;
    }
}
