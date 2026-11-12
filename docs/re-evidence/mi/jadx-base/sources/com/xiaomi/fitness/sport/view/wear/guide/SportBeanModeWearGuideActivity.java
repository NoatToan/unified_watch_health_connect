package com.xiaomi.fitness.sport.view.wear.guide;

import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.b;
import com.xiaomi.fitness.baseui.widget.CarouselIndicator;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport.view.wear.guide.SportBeanModeWearGuideActivity;
import com.xiaomi.fitness.sport.viewmodel.CommonSportVM;
import defpackage.aki;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.o8p;
import defpackage.x9n;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/view/wear/guide/SportBeanModeWearGuideActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/viewmodel/CommonSportVM;", "Lx9n;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "()V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportBeanModeWearGuideActivity extends Hilt_SportBeanModeWearGuideActivity<CommonSportVM, x9n> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static Function0<Unit> mStartSport = new Function0() { // from class: ian
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Unit.INSTANCE;
        }
    };

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/wear/guide/SportBeanModeWearGuideActivity$Companion;", "", "<init>", "()V", "mStartSport", "Lkotlin/Function0;", "", "getMStartSport", "()Lkotlin/jvm/functions/Function0;", "setMStartSport", "(Lkotlin/jvm/functions/Function0;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function0<Unit> getMStartSport() {
            return SportBeanModeWearGuideActivity.mStartSport;
        }

        public final void setMStartSport(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            SportBeanModeWearGuideActivity.mStartSport = function0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$0(SportBeanModeWearGuideActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        SportPreference.INSTANCE.setSHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE(!((x9n) this$0.getMBinding()).C.isChecked());
        mStartSport.invoke();
        this$0.finish();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.N;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.wear.guide.Hilt_SportBeanModeWearGuideActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UIUtils.INSTANCE.setNavigationBarColor(this, aki.g);
        setTitleBackground(aki.g);
        setTitle(c1j.j0);
        WearGuideCarouselAdapter wearGuideCarouselAdapter = new WearGuideCarouselAdapter();
        ViewPager2 viewPager2 = (ViewPager2) findViewById(xri.v8);
        final CarouselIndicator carouselIndicator = (CarouselIndicator) findViewById(xri.t8);
        carouselIndicator.setColor(aki.j, aki.f1136k);
        carouselIndicator.initIndicatorCount(4);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setClipChildren(false);
        viewPager2.setPageTransformer(new b(ExtUtilsKt.getDp(Float.valueOf(13.0f))));
        viewPager2.setAdapter(wearGuideCarouselAdapter);
        viewPager2.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.sport.view.wear.guide.SportBeanModeWearGuideActivity.onCreate.1
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                carouselIndicator.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }
        });
        String string = getString(c1j.j1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(c1j.Q1, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ((x9n) getMBinding()).G.setText(o8p.e(this, 12, new ForegroundColorSpan(getColor(aki.c)), string2, string));
        ViewExtKt.clickWithTrigger$default(((x9n) getMBinding()).A, 0L, new Function1() { // from class: jan
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SportBeanModeWearGuideActivity.onCreate$lambda$0(this.f22597a, (TextView) obj);
            }
        }, 1, null);
    }
}
