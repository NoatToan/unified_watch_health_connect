package com.xiaomi.fitness.nfc.ui.issued;

import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import defpackage.jog;
import defpackage.o0j;
import defpackage.sui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CodeHelpFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/ActiviteCardViewModel;", "Ljog;", "", "isNeedCardInfo", "()Z", "", "bindView", "(Ljog;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CodeHelpFragment extends BaseCardFragment<ActiviteCardViewModel, jog> {
    public CodeHelpFragment() {
        super(sui.J, 0, true);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull jog jogVar) {
        Intrinsics.checkNotNullParameter(jogVar, "<this>");
        setTitle(o0j.k7);
        jogVar.A.setText(o0j.C0);
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }
}
