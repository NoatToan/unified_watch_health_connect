package com.xiaomi.fitness.sport_eco.ftp.ui;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpModel;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestHistoryActivity;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.nl0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0006R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestHistoryActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestHistoryViewModel;", "Lnl0;", "", "initData", "()V", "initListener", "observeViewModel", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initView", "Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestHistoryAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestHistoryAdapter;", "adapter", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FtpTestHistoryActivity extends Hilt_FtpTestHistoryActivity<FtpTestHistoryViewModel, nl0> {

    @NotNull
    private static final String TAG = "FtpTestHistoryActivity";

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bra
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpTestHistoryActivity.adapter_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final FtpTestHistoryAdapter adapter_delegate$lambda$0() {
        return new FtpTestHistoryAdapter();
    }

    private final FtpTestHistoryAdapter getAdapter() {
        return (FtpTestHistoryAdapter) this.adapter.getValue();
    }

    private final void initData() {
    }

    private final void initListener() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void observeViewModel() {
        MutableLiveData<List<FtpModel.FtpData>> ftpListDatas = ((FtpTestHistoryViewModel) getMViewModel()).getFtpListDatas();
        if (ftpListDatas != null) {
            ftpListDatas.observe(this, new FtpTestHistoryActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cra
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FtpTestHistoryActivity.observeViewModel$lambda$1(this.f14638a, (List) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeViewModel$lambda$1(FtpTestHistoryActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list.size() > 0) {
            this$0.getAdapter().setDatas(list);
            ((nl0) this$0.getMBinding()).A.setVisibility(0);
            ((nl0) this$0.getMBinding()).B.setVisibility(8);
            ((nl0) this$0.getMBinding()).C.setVisibility(8);
        } else {
            ((nl0) this$0.getMBinding()).A.setVisibility(8);
            ((nl0) this$0.getMBinding()).B.setVisibility(0);
            ((nl0) this$0.getMBinding()).C.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.f;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initView() {
        setTitle(getString(e1j.W1));
        ((nl0) getMBinding()).A.setLayoutManager(new LinearLayoutManager(this));
        ((nl0) getMBinding()).A.setAdapter(getAdapter());
        ((FtpTestHistoryViewModel) getMViewModel()).getFtpHistoryList();
    }

    @Override // com.xiaomi.fitness.sport_eco.ftp.ui.Hilt_FtpTestHistoryActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        initView();
        initListener();
        observeViewModel();
    }
}
