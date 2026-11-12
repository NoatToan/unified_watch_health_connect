package com.xiaomi.fitness.medal.medaldetail;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mibi.sdk.component.Constants;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.medal.MedalHelper;
import com.xiaomi.fitness.medal.bean.MedalDetail;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailActivity;
import com.xiaomi.fitness.medal.share.MedalShareActivity;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import com.xiaomi.onetrack.OneTrack;
import defpackage.ecf;
import defpackage.j0j;
import defpackage.nji;
import defpackage.pui;
import defpackage.wbf;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\b\r*\u0001`\b\u0007\u0018\u0000 k2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001kB\u0007¢\u0006\u0004\bj\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J4\u0010\u001f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0006J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u0017J\u0017\u0010&\u001a\u00020\t2\u0006\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010,H\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0014¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0004H\u0014¢\u0006\u0004\b1\u0010\u0006J\u0017\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u00020,H\u0014¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b4\u0010/J\u000f\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010\u0006R(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010H\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010U\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010C\u001a\u0004\bV\u0010E\"\u0004\bW\u0010GR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\\R1\u0010^\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bc\u0010\\R\u0014\u0010d\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bd\u0010\\R\u0014\u0010e\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\be\u0010\\R\u0014\u0010g\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\u000bR\u0014\u0010i\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\u000b¨\u0006l"}, d2 = {"Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailViewModel;", "Lwbf;", "", "oneTrackBrowsingRecord", "()V", "checkNetwork", Constants.KEY_REQUEST_DATA, "", "calculateDisplayPosition", "()I", "", "Lecf$a$a;", "dataList", "position", "showViewPager", "(Ljava/util/List;I)V", "Landroidx/viewpager2/widget/ViewPager2$k;", "createPageTransformer", "()Landroidx/viewpager2/widget/ViewPager2$k;", "data", "refreshMedalDetailInfo", "(Lecf$a$a;)V", "displayProgressLayoutAndProgressText", "medalData", "Lkotlin/Function1;", "Landroid/app/ActivityOptions;", "Lkotlin/ParameterName;", "name", "activityOptions", "getChallengeButtonOnClickCallback", "(Lecf$a$a;)Lkotlin/jvm/functions/Function1;", "jumpToMineTabPage", "jumpToSportTabPage", "jumpToDeviceTabPage", "medal", "setNavigationButtonDisplay", "getProgressDisplayStatus", "(Lecf$a$a;)I", "", "typeStr", "oneTrackChallengeButtonClick", "(Lecf$a$a;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_STOP, "outState", "onSaveInstanceState", "onRestoreInstanceState", "onBackPressed", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "medalDetail", "Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "getMedalDetail", "()Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "setMedalDetail", "(Lcom/xiaomi/fitness/medal/bean/MedalDetail;)V", "medalType", "Ljava/lang/String;", "getMedalType", "()Ljava/lang/String;", "setMedalType", "(Ljava/lang/String;)V", "medalClass", "Ljava/lang/Integer;", "getMedalClass", "()Ljava/lang/Integer;", "setMedalClass", "(Ljava/lang/Integer;)V", "", "comesFromMedalHome", "Z", "getComesFromMedalHome", "()Z", "setComesFromMedalHome", "(Z)V", "oneTrackSource", "getOneTrackSource", "setOneTrackSource", "", "medalId", "Ljava/lang/Long;", "curtPos", "I", "categoryId", "onShareBtnClickCallback", "Lkotlin/jvm/functions/Function1;", "com/xiaomi/fitness/medal/medaldetail/MedalDetailActivity$onPageChangeCallback$1", "onPageChangeCallback", "Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailActivity$onPageChangeCallback$1;", "alreadyGot", "notGotButHasProgress", "progresslessMedal", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMedalDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalDetailActivity.kt\ncom/xiaomi/fitness/medal/medaldetail/MedalDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,608:1\n1#2:609\n1863#3,2:610\n*S KotlinDebug\n*F\n+ 1 MedalDetailActivity.kt\ncom/xiaomi/fitness/medal/medaldetail/MedalDetailActivity\n*L\n170#1:610,2\n*E\n"})
public final class MedalDetailActivity extends Hilt_MedalDetailActivity<MedalDetailViewModel, wbf> {

    @NotNull
    public static final String KEY_CURRENT_POSITION = "key_current_position";

    @NotNull
    public static final String KEY_FROM_MEDAL_HOME = "key_from_medal_home";

    @NotNull
    public static final String TAG = "MedalDetailActivity";
    private final int alreadyGot;
    public List<? extends ecf.a.C0923a> dataList;

    @Nullable
    private Integer medalClass;

    @Nullable
    private MedalDetail medalDetail;

    @Nullable
    private String medalType = "";
    private boolean comesFromMedalHome = true;

    @NotNull
    private String oneTrackSource = "";

    @Nullable
    private Long medalId = 0L;
    private int curtPos = -1;
    private int categoryId = -1;

    @NotNull
    private final Function1<ActivityOptions, Unit> onShareBtnClickCallback = new Function1() { // from class: gcf
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return MedalDetailActivity.onShareBtnClickCallback$lambda$5(this.f18832a, (ActivityOptions) obj);
        }
    };

    @NotNull
    private final MedalDetailActivity$onPageChangeCallback$1 onPageChangeCallback = new ViewPager2.i() { // from class: com.xiaomi.fitness.medal.medaldetail.MedalDetailActivity$onPageChangeCallback$1
        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            if (!this.this$0.getDataList().isEmpty()) {
                ecf.a.C0923a c0923a = this.this$0.getDataList().get(position);
                Logger.d(MedalDetailActivity.TAG, "onPageSelected medalDetail=" + c0923a);
                this.this$0.refreshMedalDetailInfo(c0923a);
            }
        }
    };
    private final int notGotButHasProgress = 1;
    private final int progresslessMedal = 2;

    private final int calculateDisplayPosition() {
        Iterator<T> it = getDataList().iterator();
        int i = -1;
        while (it.hasNext()) {
            if (((ecf.a.C0923a) it.next()).f) {
                i++;
            }
        }
        if (i == -1) {
            return 0;
        }
        if (i == getDataList().size() - 1) {
            return getDataList().size() - 1;
        }
        return this.categoryId == 8 ? i + 1 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkNetwork() {
        if (!NetworkUtils.isNetworkConnected(this)) {
            ConstraintLayout data = ((wbf) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            ViewExtKt.gone(data);
            RelativeLayout noNetwork = ((wbf) getMBinding()).N;
            Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
            ViewExtKt.visible(noNetwork);
            return;
        }
        ConstraintLayout data2 = ((wbf) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(data2, "data");
        ViewExtKt.visible(data2);
        RelativeLayout noNetwork2 = ((wbf) getMBinding()).N;
        Intrinsics.checkNotNullExpressionValue(noNetwork2, "noNetwork");
        ViewExtKt.gone(noNetwork2);
        requestData();
    }

    private final ViewPager2.k createPageTransformer() {
        return new ViewPager2.k() { // from class: hcf
            @Override // androidx.viewpager2.widget.ViewPager2.k
            public final void transformPage(View view, float f) {
                MedalDetailActivity.createPageTransformer$lambda$7(view, f);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPageTransformer$lambda$7(View page, float f) {
        Intrinsics.checkNotNullParameter(page, "page");
        float fAbs = 1 - (Math.abs(f) * 0.4f);
        page.setScaleY(fAbs);
        page.setScaleX(fAbs);
        float fCoerceIn = RangesKt___RangesKt.coerceIn((1.75f * fAbs) - 0.75f, 0.0f, 1.0f);
        Logger.d(TAG, "position:" + f + " scaleFactor=" + fAbs + " alpha=" + fCoerceIn);
        page.setAlpha(fCoerceIn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void displayProgressLayoutAndProgressText(ecf.a.C0923a data) {
        int progressDisplayStatus = getProgressDisplayStatus(data);
        ((wbf) getMBinding()).H.setText(MedalHelper.INSTANCE.constructCurrentProgressDisplayStr(data));
        if (!data.f16491k) {
            ConstraintLayout progressLayout = ((wbf) getMBinding()).S;
            Intrinsics.checkNotNullExpressionValue(progressLayout, "progressLayout");
            ViewExtKt.gone(progressLayout);
            return;
        }
        int i = data.s;
        if (i == 2) {
            if (data.f) {
                ConstraintLayout progressLayout2 = ((wbf) getMBinding()).S;
                Intrinsics.checkNotNullExpressionValue(progressLayout2, "progressLayout");
                ViewExtKt.gone(progressLayout2);
                return;
            } else if (data.u == 0) {
                ConstraintLayout progressLayout3 = ((wbf) getMBinding()).S;
                Intrinsics.checkNotNullExpressionValue(progressLayout3, "progressLayout");
                ViewExtKt.gone(progressLayout3);
                return;
            } else {
                ConstraintLayout progressLayout4 = ((wbf) getMBinding()).S;
                Intrinsics.checkNotNullExpressionValue(progressLayout4, "progressLayout");
                ViewExtKt.visible(progressLayout4);
                ((wbf) getMBinding()).Q.setProgress(data.n);
                return;
            }
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            if (Intrinsics.areEqual(data.m, "pace") || data.f16490b == 6 || progressDisplayStatus == this.alreadyGot) {
                ConstraintLayout progressLayout5 = ((wbf) getMBinding()).S;
                Intrinsics.checkNotNullExpressionValue(progressLayout5, "progressLayout");
                ViewExtKt.gone(progressLayout5);
                return;
            } else {
                if (progressDisplayStatus == this.notGotButHasProgress) {
                    ConstraintLayout progressLayout6 = ((wbf) getMBinding()).S;
                    Intrinsics.checkNotNullExpressionValue(progressLayout6, "progressLayout");
                    ViewExtKt.visible(progressLayout6);
                    ((wbf) getMBinding()).Q.setProgress(data.n);
                    return;
                }
                return;
            }
        }
        if (data.f16490b == 5) {
            if (data.n != 0) {
                ConstraintLayout progressLayout7 = ((wbf) getMBinding()).S;
                Intrinsics.checkNotNullExpressionValue(progressLayout7, "progressLayout");
                ViewExtKt.visible(progressLayout7);
                ((wbf) getMBinding()).Q.setProgress(MathKt__MathJVMKt.roundToInt((data.t / 6) * 100));
            } else {
                ConstraintLayout progressLayout8 = ((wbf) getMBinding()).S;
                Intrinsics.checkNotNullExpressionValue(progressLayout8, "progressLayout");
                ViewExtKt.gone(progressLayout8);
            }
        }
        if (data.f16490b == 6) {
            ConstraintLayout progressLayout9 = ((wbf) getMBinding()).S;
            Intrinsics.checkNotNullExpressionValue(progressLayout9, "progressLayout");
            ViewExtKt.gone(progressLayout9);
        }
    }

    private final Function1<ActivityOptions, Unit> getChallengeButtonOnClickCallback(final ecf.a.C0923a medalData) {
        return new Function1() { // from class: jcf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalDetailActivity.getChallengeButtonOnClickCallback$lambda$8(this.f22645a, medalData, (ActivityOptions) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getChallengeButtonOnClickCallback$lambda$8(MedalDetailActivity this$0, ecf.a.C0923a medalData, ActivityOptions activityOptions) {
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(medalData, "$medalData");
        Integer num3 = this$0.medalClass;
        String str = "workout_tab";
        if ((num3 != null && num3.intValue() == 1) || (((num = this$0.medalClass) != null && num.intValue() == 5) || ((num2 = this$0.medalClass) != null && num2.intValue() == 3))) {
            this$0.jumpToSportTabPage();
        } else {
            Integer num4 = this$0.medalClass;
            if ((num4 != null && num4.intValue() == 6) || Intrinsics.areEqual(medalData.m, MedalHelper.MEDAL_ID_CHARMING_NEWCOMER)) {
                this$0.jumpToMineTabPage();
                str = "profile_tab";
            } else if (Intrinsics.areEqual(medalData.m, MedalHelper.MEDAL_ID_FASHION_EXPERT) || Intrinsics.areEqual(medalData.m, MedalHelper.MEDAL_ID_GREEN_COMMUTE) || Intrinsics.areEqual(medalData.m, MedalHelper.MEDAL_ID_FREE_PASSAGE)) {
                this$0.jumpToDeviceTabPage();
                str = "device_tab";
            } else {
                this$0.jumpToSportTabPage();
            }
        }
        this$0.oneTrackChallengeButtonClick(medalData, str);
        return Unit.INSTANCE;
    }

    private final int getProgressDisplayStatus(ecf.a.C0923a medal) {
        if (medal.f) {
            return this.alreadyGot;
        }
        return medal.t != 0 ? this.notGotButHasProgress : this.progresslessMedal;
    }

    private final void jumpToDeviceTabPage() {
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
        MainExtKt.showMainActivity(this, null, bundle);
    }

    private final void jumpToMineTabPage() {
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_ME());
        MainExtKt.showMainActivity(this, null, bundle);
    }

    private final void jumpToSportTabPage() {
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_SPORT());
        MainExtKt.showMainActivity(this, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(MedalDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onShareBtnClickCallback$lambda$5(MedalDetailActivity this$0, ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ecf.a.C0923a c0923a = this$0.getDataList().get(((wbf) this$0.getMBinding()).D.getCurrentItem());
        this$0.curtPos = ((wbf) this$0.getMBinding()).D.getCurrentItem();
        Intent intent = new Intent();
        MedalShareActivity.Companion companion = MedalShareActivity.INSTANCE;
        String name = c0923a.l;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        String str = c0923a.f16492r;
        if (str == null) {
            str = "";
        }
        String icon = c0923a.c;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        long j = c0923a.g;
        int i = c0923a.f16490b;
        Long id = c0923a.o;
        Intrinsics.checkNotNullExpressionValue(id, "id");
        intent.putExtra(MedalShareActivity.KEY_SHARE_BUNDLE_TYPE, companion.getMedalShareBundle(name, str, icon, j, i, id.longValue()));
        intent.setClass(this$0, MedalShareActivity.class);
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }

    private final void oneTrackBrowsingRecord() {
        String str;
        Long l;
        List<ecf.a.C0923a> data;
        MedalDetail medalDetail = this.medalDetail;
        ecf.a.C0923a c0923a = (medalDetail == null || (data = medalDetail.getData()) == null) ? null : data.get(0);
        Object obj = "";
        if (c0923a == null || (str = c0923a.l) == null) {
            str = "";
        }
        Integer numValueOf = c0923a != null ? Integer.valueOf(c0923a.e) : null;
        if (c0923a != null && (l = c0923a.o) != null) {
            obj = l;
        }
        Logger.d(TAG, "oneTrackSource = " + this.oneTrackSource);
        MedalHelper.Companion companion = MedalHelper.INSTANCE;
        Integer num = this.medalClass;
        Intrinsics.checkNotNull(num);
        Logger.d(TAG, "type_str = " + companion.getTypeStrForMedalClass(num.intValue()));
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String model = wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null;
        Pair pair = TuplesKt.to("name", "medal_detail_page");
        Pair pair2 = TuplesKt.to("source", this.oneTrackSource);
        Pair pair3 = TuplesKt.to(OneTrack.Param.ASSET_NAME, str);
        Pair pair4 = TuplesKt.to("asset_id", obj);
        Pair pair5 = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, numValueOf);
        Integer num2 = this.medalClass;
        Intrinsics.checkNotNull(num2);
        Map<String, ? extends Object> mapMapOf = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to("type_str", companion.getTypeStrForMedalClass(num2.intValue())), TuplesKt.to("device_model", model), TuplesKt.to("tip", "56.16.1.1.22916"));
        Logger.d(TAG, "oneTrackMap=" + mapMapOf);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", mapMapOf);
    }

    private final void oneTrackChallengeButtonClick(ecf.a.C0923a medal, String typeStr) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Map<String, ? extends Object> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("name", "go_challenge_button"), TuplesKt.to("type_str", typeStr), TuplesKt.to(OneTrack.Param.ASSET_NAME, medal.l), TuplesKt.to("asset_id", medal.o), TuplesKt.to("device_model", wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null), TuplesKt.to("tip", "56.16.1.1.22917"));
        Logger.d(TAG, "oneTrackChallengeButtonClick oneTrackMap=" + mapMapOf);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", mapMapOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshMedalDetailInfo(ecf.a.C0923a data) {
        String strReplace$default;
        Logger.d(TAG, "refreshMedalDetailInfo data=" + data);
        TextView textView = ((wbf) getMBinding()).K;
        UIUtils uIUtils = UIUtils.INSTANCE;
        if (uIUtils.isTablet() && uIUtils.isLandscape(this)) {
            String detailName = data.f16492r;
            Intrinsics.checkNotNullExpressionValue(detailName, "detailName");
            strReplace$default = StringsKt__StringsJVMKt.replace$default(detailName, "\n", "", false, 4, (Object) null);
        } else {
            strReplace$default = data.f16492r;
        }
        textView.setText(strReplace$default);
        ((wbf) getMBinding()).I.setText(data.i);
        setNavigationButtonDisplay(data);
        displayProgressLayoutAndProgressText(data);
        Logger.d(TAG, "MedalDataProgressStatus =" + MedalHelper.INSTANCE.getMedalProgress(data));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        Long l = this.medalId;
        if (l != null) {
            long jLongValue = l.longValue();
            String str = this.medalType;
            if (str != null) {
                ((MedalDetailViewModel) getMViewModel()).getMedalDetailV2(jLongValue, str);
            }
        }
        ((MedalDetailViewModel) getMViewModel()).getMedalDetailLiveData().observe(this, new MedalDetailActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fcf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalDetailActivity.requestData$lambda$3(this.f17649a, (MedalDetail) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$3(MedalDetailActivity this$0, MedalDetail medalDetail) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.medalDetail = medalDetail;
        Logger.d(TAG, "medalDetailLiveData medalDetail=" + medalDetail);
        this$0.setDataList(medalDetail.getData());
        int iCalculateDisplayPosition = this$0.curtPos;
        if (iCalculateDisplayPosition == -1) {
            iCalculateDisplayPosition = this$0.calculateDisplayPosition();
        }
        this$0.showViewPager(medalDetail.getData(), iCalculateDisplayPosition);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setNavigationButtonDisplay(ecf.a.C0923a medal) {
        int progressDisplayStatus = getProgressDisplayStatus(medal);
        Function1<ActivityOptions, Unit> challengeButtonOnClickCallback = getChallengeButtonOnClickCallback(medal);
        int i = medal.s;
        if (i == 1) {
            TextView shareBtn = ((wbf) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(shareBtn, "shareBtn");
            ViewExtKt.visible(shareBtn);
            TextView challengeBtn = ((wbf) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(challengeBtn, "challengeBtn");
            ViewExtKt.gone(challengeBtn);
            LinearLayout shareAndChallenge = ((wbf) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(shareAndChallenge, "shareAndChallenge");
            ViewExtKt.gone(shareAndChallenge);
            MedalHelper.Companion companion = MedalHelper.INSTANCE;
            TextView shareBtn2 = ((wbf) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(shareBtn2, "shareBtn");
            companion.cardZoom(this, shareBtn2, this.onShareBtnClickCallback);
            return;
        }
        if (i == 2) {
            if (progressDisplayStatus == this.progresslessMedal) {
                TextView shareBtn3 = ((wbf) getMBinding()).U;
                Intrinsics.checkNotNullExpressionValue(shareBtn3, "shareBtn");
                ViewExtKt.gone(shareBtn3);
                LinearLayout shareAndChallenge2 = ((wbf) getMBinding()).T;
                Intrinsics.checkNotNullExpressionValue(shareAndChallenge2, "shareAndChallenge");
                ViewExtKt.gone(shareAndChallenge2);
                TextView challengeBtn2 = ((wbf) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(challengeBtn2, "challengeBtn");
                ViewExtKt.visible(challengeBtn2);
                ((wbf) getMBinding()).C.setText(j0j.l);
                MedalHelper.Companion companion2 = MedalHelper.INSTANCE;
                TextView challengeBtn3 = ((wbf) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(challengeBtn3, "challengeBtn");
                companion2.cardZoom(this, challengeBtn3, challengeButtonOnClickCallback);
                return;
            }
            if (progressDisplayStatus == this.notGotButHasProgress) {
                TextView shareBtn4 = ((wbf) getMBinding()).U;
                Intrinsics.checkNotNullExpressionValue(shareBtn4, "shareBtn");
                ViewExtKt.gone(shareBtn4);
                LinearLayout shareAndChallenge3 = ((wbf) getMBinding()).T;
                Intrinsics.checkNotNullExpressionValue(shareAndChallenge3, "shareAndChallenge");
                ViewExtKt.gone(shareAndChallenge3);
                TextView challengeBtn4 = ((wbf) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(challengeBtn4, "challengeBtn");
                ViewExtKt.visible(challengeBtn4);
                ((wbf) getMBinding()).C.setText(j0j.i);
                MedalHelper.Companion companion3 = MedalHelper.INSTANCE;
                TextView challengeBtn5 = ((wbf) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(challengeBtn5, "challengeBtn");
                companion3.cardZoom(this, challengeBtn5, challengeButtonOnClickCallback);
                return;
            }
            if (progressDisplayStatus == this.alreadyGot) {
                TextView challengeBtn6 = ((wbf) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(challengeBtn6, "challengeBtn");
                ViewExtKt.gone(challengeBtn6);
                LinearLayout shareAndChallenge4 = ((wbf) getMBinding()).T;
                Intrinsics.checkNotNullExpressionValue(shareAndChallenge4, "shareAndChallenge");
                ViewExtKt.gone(shareAndChallenge4);
                TextView shareBtn5 = ((wbf) getMBinding()).U;
                Intrinsics.checkNotNullExpressionValue(shareBtn5, "shareBtn");
                ViewExtKt.visible(shareBtn5);
                MedalHelper.Companion companion4 = MedalHelper.INSTANCE;
                TextView shareBtn6 = ((wbf) getMBinding()).U;
                Intrinsics.checkNotNullExpressionValue(shareBtn6, "shareBtn");
                companion4.cardZoom(this, shareBtn6, this.onShareBtnClickCallback);
                return;
            }
            return;
        }
        if (i == 3) {
            if (progressDisplayStatus == this.progresslessMedal) {
                TextView challengeBtn7 = ((wbf) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(challengeBtn7, "challengeBtn");
                ViewExtKt.visible(challengeBtn7);
                TextView shareBtn7 = ((wbf) getMBinding()).U;
                Intrinsics.checkNotNullExpressionValue(shareBtn7, "shareBtn");
                ViewExtKt.gone(shareBtn7);
                LinearLayout shareAndChallenge5 = ((wbf) getMBinding()).T;
                Intrinsics.checkNotNullExpressionValue(shareAndChallenge5, "shareAndChallenge");
                ViewExtKt.gone(shareAndChallenge5);
                ((wbf) getMBinding()).C.setText(j0j.m);
                MedalHelper.Companion companion5 = MedalHelper.INSTANCE;
                TextView challengeBtn8 = ((wbf) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(challengeBtn8, "challengeBtn");
                companion5.cardZoom(this, challengeBtn8, challengeButtonOnClickCallback);
                return;
            }
            if (progressDisplayStatus == this.notGotButHasProgress) {
                TextView challengeBtn9 = ((wbf) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(challengeBtn9, "challengeBtn");
                ViewExtKt.visible(challengeBtn9);
                TextView shareBtn8 = ((wbf) getMBinding()).U;
                Intrinsics.checkNotNullExpressionValue(shareBtn8, "shareBtn");
                ViewExtKt.gone(shareBtn8);
                LinearLayout shareAndChallenge6 = ((wbf) getMBinding()).T;
                Intrinsics.checkNotNullExpressionValue(shareAndChallenge6, "shareAndChallenge");
                ViewExtKt.gone(shareAndChallenge6);
                ((wbf) getMBinding()).C.setText(j0j.h);
                MedalHelper.Companion companion6 = MedalHelper.INSTANCE;
                TextView challengeBtn10 = ((wbf) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(challengeBtn10, "challengeBtn");
                companion6.cardZoom(this, challengeBtn10, challengeButtonOnClickCallback);
                return;
            }
            if (progressDisplayStatus == this.alreadyGot) {
                TextView shareBtn9 = ((wbf) getMBinding()).U;
                Intrinsics.checkNotNullExpressionValue(shareBtn9, "shareBtn");
                ViewExtKt.gone(shareBtn9);
                TextView challengeBtn11 = ((wbf) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(challengeBtn11, "challengeBtn");
                ViewExtKt.gone(challengeBtn11);
                LinearLayout shareAndChallenge7 = ((wbf) getMBinding()).T;
                Intrinsics.checkNotNullExpressionValue(shareAndChallenge7, "shareAndChallenge");
                ViewExtKt.visible(shareAndChallenge7);
                ((wbf) getMBinding()).F.setText(j0j.h);
                MedalHelper.Companion companion7 = MedalHelper.INSTANCE;
                TextView goAndChallengeSmall = ((wbf) getMBinding()).F;
                Intrinsics.checkNotNullExpressionValue(goAndChallengeSmall, "goAndChallengeSmall");
                companion7.cardZoom(this, goAndChallengeSmall, challengeButtonOnClickCallback);
                TextView goAndShareSmall = ((wbf) getMBinding()).G;
                Intrinsics.checkNotNullExpressionValue(goAndShareSmall, "goAndShareSmall");
                companion7.cardZoom(this, goAndShareSmall, this.onShareBtnClickCallback);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        if (progressDisplayStatus == this.progresslessMedal) {
            TextView shareBtn10 = ((wbf) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(shareBtn10, "shareBtn");
            ViewExtKt.gone(shareBtn10);
            LinearLayout shareAndChallenge8 = ((wbf) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(shareAndChallenge8, "shareAndChallenge");
            ViewExtKt.gone(shareAndChallenge8);
            TextView challengeBtn12 = ((wbf) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(challengeBtn12, "challengeBtn");
            ViewExtKt.visible(challengeBtn12);
            ((wbf) getMBinding()).C.setText(j0j.m);
            MedalHelper.Companion companion8 = MedalHelper.INSTANCE;
            TextView challengeBtn13 = ((wbf) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(challengeBtn13, "challengeBtn");
            companion8.cardZoom(this, challengeBtn13, challengeButtonOnClickCallback);
            return;
        }
        if (progressDisplayStatus == this.notGotButHasProgress) {
            TextView challengeBtn14 = ((wbf) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(challengeBtn14, "challengeBtn");
            ViewExtKt.visible(challengeBtn14);
            TextView shareBtn11 = ((wbf) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(shareBtn11, "shareBtn");
            ViewExtKt.gone(shareBtn11);
            LinearLayout shareAndChallenge9 = ((wbf) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(shareAndChallenge9, "shareAndChallenge");
            ViewExtKt.gone(shareAndChallenge9);
            ((wbf) getMBinding()).C.setText(j0j.h);
            MedalHelper.Companion companion9 = MedalHelper.INSTANCE;
            TextView challengeBtn15 = ((wbf) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(challengeBtn15, "challengeBtn");
            companion9.cardZoom(this, challengeBtn15, challengeButtonOnClickCallback);
            return;
        }
        if (progressDisplayStatus == this.alreadyGot) {
            TextView challengeBtn16 = ((wbf) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(challengeBtn16, "challengeBtn");
            ViewExtKt.gone(challengeBtn16);
            TextView shareBtn12 = ((wbf) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(shareBtn12, "shareBtn");
            ViewExtKt.gone(shareBtn12);
            LinearLayout shareAndChallenge10 = ((wbf) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(shareAndChallenge10, "shareAndChallenge");
            ViewExtKt.visible(shareAndChallenge10);
            ((wbf) getMBinding()).F.setText(j0j.h);
            MedalHelper.Companion companion10 = MedalHelper.INSTANCE;
            TextView goAndChallengeSmall2 = ((wbf) getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(goAndChallengeSmall2, "goAndChallengeSmall");
            companion10.cardZoom(this, goAndChallengeSmall2, challengeButtonOnClickCallback);
            TextView goAndShareSmall2 = ((wbf) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(goAndShareSmall2, "goAndShareSmall");
            companion10.cardZoom(this, goAndShareSmall2, this.onShareBtnClickCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showViewPager(List<? extends ecf.a.C0923a> dataList, int position) {
        LinearLayout buttonGroup = ((wbf) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(buttonGroup, "buttonGroup");
        ViewExtKt.visible(buttonGroup);
        MedalDetailHorizontalAdapter medalDetailHorizontalAdapter = new MedalDetailHorizontalAdapter(dataList);
        ViewPager2 viewPager2 = ((wbf) getMBinding()).D;
        viewPager2.setPageTransformer(createPageTransformer());
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(medalDetailHorizontalAdapter);
        viewPager2.h(this.onPageChangeCallback);
        viewPager2.k(position, false);
        ecf.a.C0923a c0923a = dataList.get(position);
        Logger.d("showViewPager name:" + c0923a.l + " condition:" + c0923a.i, new Object[0]);
        refreshMedalDetailInfo(c0923a);
    }

    public final boolean getComesFromMedalHome() {
        return this.comesFromMedalHome;
    }

    @NotNull
    public final List<ecf.a.C0923a> getDataList() {
        List list = this.dataList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataList");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return pui.f30801b;
    }

    @Nullable
    public final Integer getMedalClass() {
        return this.medalClass;
    }

    @Nullable
    public final MedalDetail getMedalDetail() {
        return this.medalDetail;
    }

    @Nullable
    public final String getMedalType() {
        return this.medalType;
    }

    @NotNull
    public final String getOneTrackSource() {
        return this.oneTrackSource;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        super.lambda$onCreate$0();
        if (!NetworkUtils.isNetworkConnected(this)) {
            jumpToMineTabPage();
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.medal.medaldetail.Hilt_MedalDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitleBackground(nji.f);
        getWindow().setStatusBarColor(getColor(nji.f));
        UIUtils uIUtils = UIUtils.INSTANCE;
        uIUtils.setNavigationBarColor(this, nji.e);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setLightStatusBar(window, false);
        setActionBarDisplayable(false);
        ((wbf) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: icf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalDetailActivity.onCreate$lambda$0(this.f20994a, view);
            }
        });
        Intent intent = getIntent();
        this.medalType = intent != null ? intent.getStringExtra("key_params_medal_type") : null;
        Intent intent2 = getIntent();
        this.medalId = intent2 != null ? Long.valueOf(intent2.getLongExtra("key_params_medal_id", 0L)) : null;
        this.medalClass = Integer.valueOf(getIntent().getIntExtra("key_params_medal_class", 0));
        boolean booleanExtra = getIntent().getBooleanExtra("key_from_medal_home", true);
        this.comesFromMedalHome = booleanExtra;
        this.oneTrackSource = booleanExtra ? "medal_home" : "pop_ups";
        int intExtra = getIntent().getIntExtra(MedalDetailActivityKt.KEY_PARAM_MEDAL_CATEGORY_ID, -1);
        this.categoryId = intExtra;
        Logger.d(TAG, "categoryId=" + intExtra);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, android.app.Activity
    public void onRestoreInstanceState(@NotNull Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.curtPos = getIntent().getIntExtra(KEY_CURRENT_POSITION, -1);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkNetwork();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_CURRENT_POSITION, this.curtPos);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        oneTrackBrowsingRecord();
    }

    public final void setComesFromMedalHome(boolean z) {
        this.comesFromMedalHome = z;
    }

    public final void setDataList(@NotNull List<? extends ecf.a.C0923a> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setMedalClass(@Nullable Integer num) {
        this.medalClass = num;
    }

    public final void setMedalDetail(@Nullable MedalDetail medalDetail) {
        this.medalDetail = medalDetail;
    }

    public final void setMedalType(@Nullable String str) {
        this.medalType = str;
    }

    public final void setOneTrackSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oneTrackSource = str;
    }
}
