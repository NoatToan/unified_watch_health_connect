package com.huami.android.mipay.h5;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/huami/android/mipay/h5/PayH5Fragment;", "Landroid/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "<init>", "()V", "Companion", "mipay-h5_release"}, k = 1, mv = {1, 4, 0})
public final class PayH5Fragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String b = "KEY_RETURN_URL";
    private static final String c = "KEY_URL";
    private HashMap a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/android/mipay/h5/PayH5Fragment$Companion;", "", "", "payUrl", "returnUrl", "Landroid/app/Fragment;", "newInstance", "KEY_RETURN_URL", "Ljava/lang/String;", "KEY_URL", "<init>", "()V", "mipay-h5_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Fragment newInstance(@NotNull String payUrl, @NotNull String returnUrl) {
            Bundle bundle = new Bundle();
            bundle.putString("KEY_URL", payUrl);
            bundle.putString("KEY_RETURN_URL", returnUrl);
            PayH5Fragment payH5Fragment = new PayH5Fragment();
            payH5Fragment.setArguments(bundle);
            return payH5Fragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.a;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        View view = (View) this.a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.a.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        MipayH5.handle$mipay_h5_release(requestCode, resultCode, data);
    }

    @Override // android.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("KEY_URL") : null;
        if (string == null) {
            Intrinsics.throwNpe();
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("KEY_RETURN_URL") : null;
        if (string2 == null) {
            Intrinsics.throwNpe();
        }
        Intent intent = new Intent(getActivity(), (Class<?>) MipayH5Activity.class);
        intent.putExtra("KEY_RETURN_URL", string2);
        intent.putExtra("KEY_URL", string);
        startActivityForResult(intent, 1810);
    }

    @Override // android.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
