package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import defpackage.hog;
import defpackage.o0j;
import defpackage.sui;
import defpackage.wni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CNV2HelpFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/AddCardNumberViewModel;", "Lhog;", "Landroid/os/Bundle;", "args", "", "setArguments", "(Landroid/os/Bundle;)V", "", "isNeedCardInfo", "()Z", "bindView", "(Lhog;)V", "isShowCNV2", "Z", "<init>", "()V", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CNV2HelpFragment extends BaseCardFragment<AddCardNumberViewModel, hog> {

    @NotNull
    public static final String sIsShowCNV2 = "sIsShowCNV2";
    private boolean isShowCNV2;

    public CNV2HelpFragment() {
        super(sui.I, 0, true);
        this.isShowCNV2 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull hog hogVar) {
        Intrinsics.checkNotNullParameter(hogVar, "<this>");
        if (this.isShowCNV2) {
            setTitle(o0j.l);
            ((hog) getMBinding()).B.setImageResource(wni.v);
            ((hog) getMBinding()).A.setText(o0j.m);
        } else {
            setTitle(o0j.A0);
            ((hog) getMBinding()).B.setImageResource(wni.g);
            ((hog) getMBinding()).A.setText(o0j.g7);
        }
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.isShowCNV2 = args.getBoolean(sIsShowCNV2);
        }
    }
}
