package com.huami.third.xiaomi.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.third.xiaomi.ui.databinding.ThirdPartyActivityBindXiaomiBinding;
import com.huami.thirdparty.support.statusbar.StatusBarHelper;
import com.huami.thirdparty.support.viewbinding.CreateMethod;
import com.huami.thirdparty.support.viewbinding.ReflectionActivityViewBindings;
import com.huami.thirdparty.support.viewbinding.ViewBindingProperty;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/third/xiaomi/ui/MiBindActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "Lcom/huami/third/xiaomi/ui/databinding/ThirdPartyActivityBindXiaomiBinding;", "a", "Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "c", "()Lcom/huami/third/xiaomi/ui/databinding/ThirdPartyActivityBindXiaomiBinding;", "binding", "<init>", "()V", "xiaomi-ui_release"}, k = 1, mv = {1, 4, 1})
public final class MiBindActivity extends AppCompatActivity {
    public static final /* synthetic */ KProperty[] c = {Reflection.property1(new PropertyReference1Impl(MiBindActivity.class, "binding", "getBinding()Lcom/huami/third/xiaomi/ui/databinding/ThirdPartyActivityBindXiaomiBinding;", 0))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ViewBindingProperty binding;
    private HashMap b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "com/huami/third/xiaomi/ui/MiBindActivity$onCreate$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MiBindActivity.this.finish();
        }
    }

    public MiBindActivity() {
        super(R.layout.third_party_activity_bind_xiaomi);
        this.binding = ReflectionActivityViewBindings.inflateViewBindingActivity(this, ThirdPartyActivityBindXiaomiBinding.class, CreateMethod.BIND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ThirdPartyActivityBindXiaomiBinding c() {
        return (ThirdPartyActivityBindXiaomiBinding) this.binding.getValue(this, c[0]);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.b;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        View view = (View) this.b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.b.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"StringFormatInvalid"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        StatusBarHelper.trySetStatusBar(this, true);
        RainbowTitleBar rainbowTitleBar = c().toolbar;
        rainbowTitleBar.setTitle(getString(R.string.author_lvmi, new Object[]{getString(R.string.mi_account)}));
        rainbowTitleBar.setNavigationOnClickListener(new a());
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, MiBindFragment.class, (Bundle) null).commit();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }
}
