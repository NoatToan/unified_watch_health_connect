package com.huami.android.mipay.h5;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.huami.components.title.BaseTitleActivity;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/android/mipay/h5/MipayH5Activity;", "Lcom/huami/components/title/BaseTitleActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Lcom/huami/android/mipay/h5/MipayH5Fragment;", "fragment", "Lcom/huami/android/mipay/h5/MipayH5Fragment;", "getFragment", "()Lcom/huami/android/mipay/h5/MipayH5Fragment;", "setFragment", "(Lcom/huami/android/mipay/h5/MipayH5Fragment;)V", "<init>", "()V", "Companion", "mipay-h5_release"}, k = 1, mv = {1, 4, 0})
public final class MipayH5Activity extends BaseTitleActivity {

    @NotNull
    public static final String KEY_RETURN_URL = "KEY_RETURN_URL";

    @NotNull
    public static final String KEY_URL = "KEY_URL";

    @NotNull
    public MipayH5Fragment fragment;
    private HashMap i;

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.i;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.i == null) {
            this.i = new HashMap();
        }
        View view = (View) this.i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.i.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @NotNull
    public final MipayH5Fragment getFragment() {
        return this.fragment;
    }

    @Override // com.huami.components.title.BaseTitleActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.fragment.onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // com.huami.components.title.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.fragment = MipayH5Fragment.INSTANCE.newInstance(getIntent().getStringExtra(KEY_URL), getIntent().getStringExtra(KEY_RETURN_URL));
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), this.fragment).commit();
        this.fragment.setOnTitleChangedListener(new OnTitleChangedListener() { // from class: com.huami.android.mipay.h5.MipayH5Activity.onCreate.1
            @Override // com.huami.android.mipay.h5.OnTitleChangedListener
            public void onChanged(@NotNull String title) {
                MipayH5Activity.this.setTitle(title);
            }
        });
        BaseTitleActivity.StyleOptions styleOptionsTitleBarWithBg = BaseTitleActivity.StyleOptions.titleBarWithBg();
        Resources resources = getResources();
        int i = R.color.pale_grey_two;
        applyStyleOptions(styleOptionsTitleBarWithBg.setTitleBarBgColor(resources.getColor(i)).setStatusBarColor(getResources().getColor(i)));
    }

    public final void setFragment(@NotNull MipayH5Fragment mipayH5Fragment) {
        this.fragment = mipayH5Fragment;
    }
}
