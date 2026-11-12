package defpackage;

import com.google.gson.Gson;
import com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseFragment;
import com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final class jap<VM extends ThirdAppListBaseViewModel<?>> {
    public static <VM extends ThirdAppListBaseViewModel<?>> void a(ThirdAppListBaseFragment<VM> thirdAppListBaseFragment, Gson gson) {
        thirdAppListBaseFragment.gson = gson;
    }
}
