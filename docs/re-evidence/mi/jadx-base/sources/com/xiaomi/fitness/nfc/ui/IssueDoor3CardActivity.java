package com.xiaomi.fitness.nfc.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.bean.result.ResultInfo;
import com.xiaomi.fitness.nfc.ui.IssueDoor3CardActivity;
import com.xiaomi.fitness.nfc.ui.issued.CardRenameFragment;
import com.xiaomi.fitness.nfc.utils.PageUtilsKt;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.ltg;
import defpackage.o0j;
import defpackage.o63;
import defpackage.rji;
import defpackage.sui;
import defpackage.uqo;
import defpackage.uxi;
import defpackage.vqg;
import defpackage.wm3;
import defpackage.wni;
import defpackage.xlg;
import defpackage.zl3;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002<=B\u0007¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0013\u0010\r\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0006J)\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\"\u0010.\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u0018\u00102\u001a\u000601R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u0007048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010!R\u0014\u0010:\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010!¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssueDoor3CardActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/nfc/ui/IssueDoor3CardViewModel;", "Lxlg;", "", "issue", "()V", "", "detail", "Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "buildFailResultInfo", "(Ljava/lang/String;)Lcom/xiaomi/fitness/nfc/bean/result/ResultInfo;", "gotoFull", "bindView", "(Lxlg;)V", LifecycleConstantKt.ON_DESTROY, "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "getCardWrapper", "()Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "setCardWrapper", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;)V", "issueProgress", "I", "getIssueProgress", "()I", "setIssueProgress", "(I)V", "", "delay", "J", "getDelay", "()J", "setDelay", "(J)V", "delayQuery", "getDelayQuery", "setDelayQuery", "delayIndecator", "getDelayIndecator", "setDelayIndecator", "Lcom/xiaomi/fitness/nfc/ui/IssueDoor3CardActivity$IssueHandler;", "mHandler", "Lcom/xiaomi/fitness/nfc/ui/IssueDoor3CardActivity$IssueHandler;", "Ljava/util/ArrayList;", "bannerList", "Ljava/util/ArrayList;", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "IssueHandler", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class IssueDoor3CardActivity extends BaseBindingActivity<IssueDoor3CardViewModel, xlg> {
    public static final int sCodeIndecator = 88;
    public static final int sCodeQuery = 77;
    public static final int sCodeUpdateIssueProgress = 66;
    public static final int sRequestCodeResult = 100;

    @Nullable
    private CardWrapper cardWrapper;
    private int issueProgress;
    private long delay = RepositoryManager.GAP_X_MINUTE;
    private long delayQuery = 5000;
    private long delayIndecator = 5000;

    @NotNull
    private final IssueHandler mHandler = new IssueHandler();

    @NotNull
    private ArrayList<String> bannerList = CollectionsKt__CollectionsKt.arrayListOf("0", "1", "2");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssueDoor3CardActivity$IssueHandler;", "Landroid/os/Handler;", "<init>", "(Lcom/xiaomi/fitness/nfc/ui/IssueDoor3CardActivity;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class IssueHandler extends Handler {
        public IssueHandler() {
            super(Looper.getMainLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleMessage$lambda$0(IssueDoor3CardActivity this$0, IssueHandler this$1, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (z) {
                this$0.gotoFull();
            } else if (this$0.getIssueProgress() >= 99) {
                vqg.d("goto rename");
                Bundle bundle = new Bundle();
                bundle.putBoolean(CardRenameFragment.INSTANCE.getSIsNeedShowSupperDialog(), true);
                PageUtilsKt.gotoPage(this$0, CardRenameFragment.class, bundle);
                this$0.finish();
            } else {
                vqg.d("queryStatus");
                this$1.sendEmptyMessageDelayed(77, this$0.getDelayQuery());
            }
            return Unit.INSTANCE;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i = msg.what;
            if (i == 66) {
                IssueDoor3CardActivity.this.setIssueProgress(IssueDoor3CardActivity.this.getIssueProgress() + 1);
                if (IssueDoor3CardActivity.this.getIssueProgress() > 99) {
                    IssueDoor3CardActivity.this.setIssueProgress(99);
                }
                IssueDoor3CardActivity.access$getMBinding(IssueDoor3CardActivity.this).D.setProgress(IssueDoor3CardActivity.this.getIssueProgress());
                AppCompatTextView appCompatTextView = IssueDoor3CardActivity.access$getMBinding(IssueDoor3CardActivity.this).C;
                IssueDoor3CardActivity issueDoor3CardActivity = IssueDoor3CardActivity.this;
                appCompatTextView.setText(issueDoor3CardActivity.getString(o0j.common_percent_join_str, Integer.valueOf(issueDoor3CardActivity.getIssueProgress())));
                sendEmptyMessageDelayed(66, IssueDoor3CardActivity.this.getDelay());
                return;
            }
            if (i == 77) {
                IssueDoor3CardViewModel issueDoor3CardViewModelAccess$getMViewModel = IssueDoor3CardActivity.access$getMViewModel(IssueDoor3CardActivity.this);
                CardWrapper cardWrapper = IssueDoor3CardActivity.this.getCardWrapper();
                Intrinsics.checkNotNull(cardWrapper);
                final IssueDoor3CardActivity issueDoor3CardActivity2 = IssueDoor3CardActivity.this;
                issueDoor3CardViewModelAccess$getMViewModel.queryStatus(cardWrapper, new Function1() { // from class: com.xiaomi.fitness.nfc.ui.k
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return IssueDoor3CardActivity.IssueHandler.handleMessage$lambda$0(issueDoor3CardActivity2, this, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            }
            if (i != 88) {
                return;
            }
            int currentItem = (IssueDoor3CardActivity.access$getMBinding(IssueDoor3CardActivity.this).F.getCurrentItem() + 1) % 3;
            IssueDoor3CardActivity.access$getMBinding(IssueDoor3CardActivity.this).F.L(currentItem, true);
            IssueDoor3CardActivity.access$getMBinding(IssueDoor3CardActivity.this).A.onCurrentIndexChange(currentItem);
            IssueDoor3CardActivity.this.mHandler.sendEmptyMessageDelayed(88, IssueDoor3CardActivity.this.getDelayIndecator());
        }
    }

    public static final /* synthetic */ xlg access$getMBinding(IssueDoor3CardActivity issueDoor3CardActivity) {
        return issueDoor3CardActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ IssueDoor3CardViewModel access$getMViewModel(IssueDoor3CardActivity issueDoor3CardActivity) {
        return (IssueDoor3CardViewModel) issueDoor3CardActivity.getMViewModel();
    }

    private final ResultInfo buildFailResultInfo(String detail) {
        ResultInfo.Builder contentColorRes = new ResultInfo.Builder(uqo.class.getName()).setTitle(getString(o0j.j3)).setResultIconRes(wni.f38163k).setContentStrRes(o0j.m1).setContentColorRes(rji.n);
        if (TextUtils.isEmpty(detail)) {
            detail = getString(o0j.t5);
        }
        return contentColorRes.setContentDetail(detail).setBtnResLayoutId(sui.J0).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gotoFull() {
        vqg.d("gotoFull validate issueProgress:" + this.issueProgress);
        this.mHandler.removeMessages(66);
        ((IssueDoor3CardViewModel) getMViewModel()).updateProgress2end(this.issueProgress, new Function1() { // from class: fid
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssueDoor3CardActivity.gotoFull$lambda$1(this.f17809a, ((Integer) obj).intValue());
            }
        }, new Function0() { // from class: gid
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IssueDoor3CardActivity.gotoFull$lambda$2(this.f19026a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoFull$lambda$1(IssueDoor3CardActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().D.setProgress(i);
        this$0.getMBinding().C.setText(this$0.getString(o0j.common_percent_join_str, Integer.valueOf(i)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoFull$lambda$2(IssueDoor3CardActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().D.setProgress(100);
        this$0.getMBinding().C.setText(this$0.getString(o0j.common_percent_join_str, 100));
        Intent intent = new Intent(this$0, (Class<?>) VerifySuperCardActivity.class);
        intent.putExtra(VerifySuperCardActivity.INSTANCE.getSIsNeed2Rename(), true);
        this$0.startActivity(intent);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void issue() {
        if (this.cardWrapper == null) {
            ToastUtil.showShortToast(o0j.b1);
            finish();
        } else {
            IssueDoor3CardViewModel issueDoor3CardViewModel = (IssueDoor3CardViewModel) getMViewModel();
            CardWrapper cardWrapper = this.cardWrapper;
            Intrinsics.checkNotNull(cardWrapper);
            issueDoor3CardViewModel.issue(cardWrapper, new Function2() { // from class: eid
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IssueDoor3CardActivity.issue$lambda$0(this.f16677a, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit issue$lambda$0(IssueDoor3CardActivity this$0, boolean z, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vqg.d("issue success:" + z);
        if (z) {
            ltg.c().s(0, 1);
            o63.b(new wm3());
            CardWrapper cardWrapper = this$0.cardWrapper;
            Intrinsics.checkNotNull(cardWrapper);
            if (!cardWrapper.isCloudDoor()) {
                this$0.setResult(-1);
                this$0.mHandler.sendEmptyMessage(77);
            } else if (zl3.g().i() == null) {
                this$0.setResult(-1);
                this$0.finish();
            } else {
                this$0.setResult(-1);
                Bundle bundle = new Bundle();
                bundle.putBoolean(CardRenameFragment.INSTANCE.getSIsNeedShowSupperDialog(), false);
                PageUtilsKt.gotoPage(this$0, CardRenameFragment.class, bundle);
                this$0.finish();
            }
        } else {
            ltg.c().s(0, 2);
            Intrinsics.checkNotNull(str);
            ResultInfo resultInfoBuildFailResultInfo = this$0.buildFailResultInfo(str);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(IssueResultFragment.RESULT_INFO, resultInfoBuildFailResultInfo);
            PageUtilsKt.gotoPageForResult(this$0, IssueResultFragment.class, bundle2, 100);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull xlg xlgVar) {
        Intrinsics.checkNotNullParameter(xlgVar, "<this>");
        setTitle(o0j.j3);
        getMBinding().E.setText(getResources().getQuantityString(uxi.c, 3, 3));
        this.mHandler.sendEmptyMessageDelayed(66, this.delay);
        this.mHandler.sendEmptyMessageDelayed(88, this.delayIndecator);
        this.cardWrapper = zl3.g().i();
        xlgVar.F.setOffscreenPageLimit(2);
        xlgVar.F.setAdapter(new IssueSuperBannerAdapter(this, this.bannerList));
        xlgVar.A.onPageChanged(this.bannerList.size(), 0, rji.f32614b, rji.j);
        issue();
    }

    @Nullable
    public final CardWrapper getCardWrapper() {
        return this.cardWrapper;
    }

    public final long getDelay() {
        return this.delay;
    }

    public final long getDelayIndecator() {
        return this.delayIndecator;
    }

    public final long getDelayQuery() {
        return this.delayQuery;
    }

    public final int getIssueProgress() {
        return this.issueProgress;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sui.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            finish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeMessages(66);
        this.mHandler.removeMessages(77);
        this.mHandler.removeMessages(88);
    }

    public final void setCardWrapper(@Nullable CardWrapper cardWrapper) {
        this.cardWrapper = cardWrapper;
    }

    public final void setDelay(long j) {
        this.delay = j;
    }

    public final void setDelayIndecator(long j) {
        this.delayIndecator = j;
    }

    public final void setDelayQuery(long j) {
        this.delayQuery = j;
    }

    public final void setIssueProgress(int i) {
        this.issueProgress = i;
    }
}
