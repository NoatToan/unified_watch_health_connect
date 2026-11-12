package com.huami.pai.ui.hrsetting;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.lib.R;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/pai/ui/hrsetting/HeartRateSettingFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "v", "onClick", "Lcom/huami/widget/typeface/TypefaceTextView;", "a", "Lcom/huami/widget/typeface/TypefaceTextView;", "mIconOpen", "b", "mWarningInfo2", "c", "Landroid/view/View;", "mParentContainer", "Lcom/huami/pai/ui/hrsetting/IHeartRateSetting;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/pai/ui/hrsetting/IHeartRateSetting;", "iHeartRateDevice", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateSettingFragment extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private TypefaceTextView mIconOpen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private TypefaceTextView mWarningInfo2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private View mParentContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy iHeartRateDevice = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/pai/ui/hrsetting/IHeartRateSetting;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<IHeartRateSetting> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IHeartRateSetting invoke() {
            return IHeartRateSettingFactory.DefaultImpls.getHrDevice$default((IHeartRateSettingFactory) ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(HeartRateSettingFragment.this)).get(Reflection.getOrCreateKotlinClass(IHeartRateSettingFactory.class), null, null), 0, 1, null);
        }
    }

    private final IHeartRateSetting b() {
        return (IHeartRateSetting) this.iHeartRateDevice.getValue();
    }

    private final void initData() {
        View view = this.mParentContainer;
        Objects.requireNonNull(view);
        Context context = getContext();
        ViewExKt.setVisible(view, context == null ? false : b().showHrSetting(context));
        TypefaceTextView typefaceTextView = this.mWarningInfo2;
        Objects.requireNonNull(typefaceTextView);
        typefaceTextView.setText(R.string.pai_warning_watch_info2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        LiveData<Boolean> heartRate;
        if (v.getId() != R.id.icon_hr_open || (heartRate = b().setHeartRate(getContext())) == 0) {
            return;
        }
        heartRate.observe(this, new Observer<T>() { // from class: com.huami.pai.ui.hrsetting.HeartRateSettingFragment$onClick$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                boolean zBooleanValue = ((Boolean) t).booleanValue();
                View view = this.a.mParentContainer;
                Objects.requireNonNull(view);
                ViewExKt.setVisible(view, !zBooleanValue);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_heartrate_setting, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mParentContainer = view.findViewById(R.id.pai_hr_warning);
        this.mWarningInfo2 = (TypefaceTextView) view.findViewById(R.id.pai_hr_warning_info_2);
        TypefaceTextView typefaceTextView = (TypefaceTextView) view.findViewById(R.id.icon_hr_open);
        this.mIconOpen = typefaceTextView;
        Objects.requireNonNull(typefaceTextView);
        typefaceTextView.setOnClickListener(this);
        initData();
    }
}
