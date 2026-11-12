package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.TransferInFragment;
import defpackage.sui;
import defpackage.vlg;
import defpackage.vqg;
import defpackage.w8q;
import defpackage.zl3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/RechargeActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/nfc/ui/IssuerViewModel;", "Lvlg;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "replaceFragment", "()V", "mExtras", "Landroid/os/Bundle;", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "mCardInfo", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RechargeActivity extends BaseBindingActivity<IssuerViewModel, vlg> {

    @Nullable
    private CardWrapper mCardInfo;

    @Nullable
    private Bundle mExtras;

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sui.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        this.mExtras = getIntent().getExtras();
        CardWrapper cardWrapperI = zl3.g().i();
        this.mCardInfo = cardWrapperI;
        if (cardWrapperI == null) {
            finish();
        } else {
            replaceFragment();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final void replaceFragment() {
        CardWrapper cardWrapper;
        CardWrapper cardWrapper2;
        Fragment issueRechargeFragment;
        Bundle bundle;
        CardWrapper cardWrapper3 = this.mCardInfo;
        Intrinsics.checkNotNull(cardWrapper3);
        if (cardWrapper3.isIssued()) {
            cardWrapper = this.mCardInfo;
            Intrinsics.checkNotNull(cardWrapper);
            if (TextUtils.equals(cardWrapper.mCardType, "LNT")) {
                bundle = this.mExtras;
                Intrinsics.checkNotNull(bundle);
                if (bundle.containsKey("cityId")) {
                    cardWrapper2 = this.mCardInfo;
                    Intrinsics.checkNotNull(cardWrapper2);
                    if (cardWrapper2.mHasIssue) {
                        issueRechargeFragment = new RechargeFragment();
                    } else {
                        issueRechargeFragment = new IssueRechargeFragment();
                    }
                } else {
                    issueRechargeFragment = new RechargeFragment();
                }
            } else {
                cardWrapper2 = this.mCardInfo;
                Intrinsics.checkNotNull(cardWrapper2);
                if (cardWrapper2.mHasIssue) {
                    issueRechargeFragment = new RechargeFragment();
                } else {
                    issueRechargeFragment = new IssueRechargeFragment();
                }
            }
        } else {
            CardWrapper cardWrapper4 = this.mCardInfo;
            Intrinsics.checkNotNull(cardWrapper4);
            if (!cardWrapper4.isCloudTransit()) {
                CardWrapper cardWrapper5 = this.mCardInfo;
                Intrinsics.checkNotNull(cardWrapper5);
                if (cardWrapper5.getTransferInOrder() == null) {
                    cardWrapper = this.mCardInfo;
                    Intrinsics.checkNotNull(cardWrapper);
                    if (TextUtils.equals(cardWrapper.mCardType, "LNT")) {
                        bundle = this.mExtras;
                        Intrinsics.checkNotNull(bundle);
                        if (bundle.containsKey("cityId")) {
                            issueRechargeFragment = new RechargeFragment();
                        } else {
                            cardWrapper2 = this.mCardInfo;
                            Intrinsics.checkNotNull(cardWrapper2);
                            if (cardWrapper2.mHasIssue) {
                                issueRechargeFragment = new RechargeFragment();
                            } else {
                                issueRechargeFragment = new IssueRechargeFragment();
                            }
                        }
                    } else {
                        cardWrapper2 = this.mCardInfo;
                        Intrinsics.checkNotNull(cardWrapper2);
                        if (cardWrapper2.mHasIssue) {
                            issueRechargeFragment = new RechargeFragment();
                        } else {
                            issueRechargeFragment = new IssueRechargeFragment();
                        }
                    }
                }
            }
            issueRechargeFragment = new TransferInFragment();
        }
        vqg.d(issueRechargeFragment.getClass().getSimpleName());
        issueRechargeFragment.setArguments(this.mExtras);
        w8q.b(this, issueRechargeFragment, false);
    }
}
