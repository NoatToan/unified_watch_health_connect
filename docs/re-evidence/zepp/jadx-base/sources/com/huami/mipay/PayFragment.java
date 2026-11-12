package com.huami.mipay;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/huami/mipay/PayFragment;", "Landroid/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "<init>", "()V", "Companion", "mipay-wrapper_release"}, k = 1, mv = {1, 4, 0})
public final class PayFragment extends Fragment {

    @NotNull
    public static final String ARG_ORDER = "ARG_ORDER";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/mipay/PayFragment$Companion;", "", "", StatEvent.MINE_KINGKONG_C_ORDER_VALUE, "Landroid/app/Fragment;", "newInstance", PayFragment.ARG_ORDER, "Ljava/lang/String;", "<init>", "()V", "mipay-wrapper_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Fragment newInstance(@NotNull String order) {
            Bundle bundle = new Bundle();
            bundle.putString(PayFragment.ARG_ORDER, order);
            PayFragment payFragment = new PayFragment();
            payFragment.setArguments(bundle);
            return payFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Mipay.handle$mipay_wrapper_release(requestCode, resultCode, data);
    }

    @Override // android.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Object obj;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (obj = arguments.get(ARG_ORDER)) == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.mipay.wallet");
        intent.setData(Uri.parse("https://app.mipay.com/?id=mipay.ucashier&order=" + obj));
        startActivityForResult(intent, MipayKt.REQUEST_PAY);
    }
}
