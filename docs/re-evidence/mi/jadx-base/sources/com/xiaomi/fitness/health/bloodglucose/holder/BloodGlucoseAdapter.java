package com.xiaomi.fitness.health.bloodglucose.holder;

import com.xiaomi.fitness.baseui.dialog.PickerStringDialog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseAdapter;", "Lcom/xiaomi/fitness/baseui/dialog/PickerStringDialog$a;", "", "getCount", "()I", "index", "", "getValue", "(I)Ljava/lang/String;", "", "listValue", "", "setListValue", "(Ljava/util/List;)V", "", "mHeightList", "Ljava/util/List;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseAdapter implements PickerStringDialog.a {

    @Nullable
    private List<String> mHeightList;

    @Override // com.xiaomi.fitness.baseui.dialog.PickerStringDialog.a
    public int getCount() {
        List<String> list = this.mHeightList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerStringDialog.a
    @NotNull
    public String getValue(int index) {
        String str;
        List<String> list = this.mHeightList;
        return (list == null || (str = list.get(index)) == null) ? "" : str;
    }

    public final void setListValue(@NotNull List<String> listValue) {
        Intrinsics.checkNotNullParameter(listValue, "listValue");
        this.mHeightList = TypeIntrinsics.asMutableList(listValue);
    }
}
