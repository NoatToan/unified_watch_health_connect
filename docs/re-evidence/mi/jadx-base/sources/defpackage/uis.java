package defpackage;

import android.os.Bundle;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.mvp.IView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface uis extends IView {
    void a();

    void a(Bundle bundle);

    void a(ArrayList<RechargeType> arrayList);

    void a(boolean z);

    void c(int i, String str, Bundle bundle);

    void j(Recharge recharge);
}
