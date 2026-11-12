package com.huami.sky.ui.intro.preference;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.button.MaterialButton;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.ActivitySkyPreferenceBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.intro.preference.SkyMusicPreferenceBaseActivity;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bR\u001d\u0010\u0015\u001a\u00020\u00108F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R/\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/sky/ui/intro/preference/SkyMusicPreferenceBaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "e", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "initViews", "initObservers", "finish", "showOtherLayout", "", "isVisible", "setLoadingVisible", "isEnable", "setSaveEnableStyle", "Lcom/huami/sky/ui/databinding/ActivitySkyPreferenceBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "getViewBinding", "()Lcom/huami/sky/ui/databinding/ActivitySkyPreferenceBinding;", "viewBinding", "", "<set-?>", "b", "Lkotlin/properties/ReadWriteProperty;", GoogleApiAvailabilityLight.a, "()Ljava/lang/Integer;", "g", "(Ljava/lang/Integer;)V", "scrollVisiblePosition", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class SkyMusicPreferenceBaseActivity extends AppCompatActivity {
    public static final /* synthetic */ KProperty<Object>[] c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkyMusicPreferenceBaseActivity.class), "viewBinding", "getViewBinding()Lcom/huami/sky/ui/databinding/ActivitySkyPreferenceBinding;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkyMusicPreferenceBaseActivity.class), "scrollVisiblePosition", "getScrollVisiblePosition()Ljava/lang/Integer;"))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = ActivityViewBindingsKt.viewBinding(new SkyMusicPreferenceBaseActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivitySkyPreferenceBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty scrollVisiblePosition;

    public SkyMusicPreferenceBaseActivity() {
        Delegates delegates = Delegates.INSTANCE;
        final int i = 0;
        this.scrollVisiblePosition = new ObservableProperty<Integer>(i) { // from class: com.huami.sky.ui.intro.preference.SkyMusicPreferenceBaseActivity$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Integer oldValue, Integer newValue) {
                Integer num = newValue;
                Integer num2 = oldValue;
                if (num2 != null && num2.intValue() == 0 && num != null && num.intValue() == 1) {
                    this.getViewBinding().titleBar.setTitle(R.string.sky_more_preference);
                } else if (num2 != null && num2.intValue() == 1 && num != null && num.intValue() == 0) {
                    this.getViewBinding().titleBar.setTitle("");
                }
            }
        };
    }

    private final Integer d() {
        return (Integer) this.scrollVisiblePosition.getValue(this, c[1]);
    }

    private final void e() {
        ActivitySkyPreferenceBinding viewBinding = getViewBinding();
        viewBinding.titleBar.setTitleTextColor(SkyExtKt.toColorInt(R.color.s46, this));
        viewBinding.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: kx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyMusicPreferenceBaseActivity.f(this.a, view);
            }
        });
        viewBinding.listSelectView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huami.sky.ui.intro.preference.SkyMusicPreferenceBaseActivity$initCommonViews$1$2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                this.a.g(linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()) : null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SkyMusicPreferenceBaseActivity skyMusicPreferenceBaseActivity, View view) {
        skyMusicPreferenceBaseActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Integer num) {
        this.scrollVisiblePosition.setValue(this, c[1], num);
    }

    @Override // android.app.Activity
    public void finish() {
        MusicPreferenceAdapter musicAdapter = getViewBinding().listSelectView.getMusicAdapter();
        if (musicAdapter != null) {
            musicAdapter.stopAndReleasePlay();
        }
        super.finish();
    }

    @NotNull
    public final ActivitySkyPreferenceBinding getViewBinding() {
        return (ActivitySkyPreferenceBinding) this.viewBinding.getValue(this, c[0]);
    }

    public abstract void initObservers();

    public abstract void initViews();

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SkyExtKt.setLayoutFullScreen(getWindow());
        setContentView(getViewBinding().getRoot());
        e();
        initViews();
        initObservers();
    }

    public final void setLoadingVisible(boolean isVisible) {
        if (isVisible) {
            getViewBinding().loading.setVisibility(0);
            getViewBinding().loading.playAnimation();
        } else {
            getViewBinding().loading.cancelAnimation();
            getViewBinding().loading.setVisibility(8);
        }
    }

    public final void setSaveEnableStyle(boolean isEnable) {
        MaterialButton materialButton = getViewBinding().save;
        materialButton.setEnabled(isEnable);
        if (isEnable) {
            SkyExtKt.setTextColorRes(materialButton, R.color.s5, Double.valueOf(0.9d));
            SkyExtKt.setBackgroundTint(materialButton, R.color.s46, Double.valueOf(0.3d));
        } else {
            int i = R.color.s46;
            SkyExtKt.setTextColorRes(materialButton, i, Double.valueOf(0.27d));
            SkyExtKt.setBackgroundTint(materialButton, i, Double.valueOf(0.09d));
        }
        SkyExtKt.setTextColorRes(getViewBinding().save, R.color.s46, isEnable ? null : Double.valueOf(0.6d));
    }

    public final void showOtherLayout() {
        getViewBinding().titleBar.setVisibility(0);
        getViewBinding().save.setVisibility(0);
        getViewBinding().skip.setVisibility(0);
    }
}
