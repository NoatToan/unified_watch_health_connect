package com.mi.health.course.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.activity.CourseFeedActivity;
import com.mi.health.course.adapter.CourseFeedAdapter;
import com.mi.health.course.util.CoursePreference;
import com.mi.health.course.vm.CourseFeedVM;
import com.mi.health.course.vm.FeedData;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import defpackage.bli;
import defpackage.ew1;
import defpackage.gak;
import defpackage.sti;
import defpackage.wq4;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\nR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/mi/health/course/activity/CourseFeedActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/mi/health/course/vm/CourseFeedVM;", "Lwq4;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "Lcom/mi/health/course/adapter/CourseFeedAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/mi/health/course/adapter/CourseFeedAdapter;", "adapter", "", "startMills", "J", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CourseFeedActivity extends Hilt_CourseFeedActivity<CourseFeedVM, wq4> {

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: uq4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseFeedActivity.adapter_delegate$lambda$0(this.f36020a);
        }
    });
    private long startMills = System.currentTimeMillis();

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CourseFeedVM access$getMViewModel(CourseFeedActivity courseFeedActivity) {
        return (CourseFeedVM) courseFeedActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseFeedAdapter adapter_delegate$lambda$0(CourseFeedActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new CourseFeedAdapter(this$0, "audio_heart_control_list_page");
    }

    private final CourseFeedAdapter getAdapter() {
        return (CourseFeedAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$2(CourseFeedActivity this$0, FeedData feedData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        if (feedData.getData().g()) {
            if (feedData.getMorePage()) {
                MoreRecyclerView.setStatus$default(((wq4) this$0.getMBinding()).B, Status.DONE, false, 2, null);
            } else {
                PageState.DefaultImpls.showEmpty$default(this$0, 0, 0, 3, null);
            }
        } else if (feedData.getData().h()) {
            if (feedData.getMorePage()) {
                MoreRecyclerView.setStatus$default(((wq4) this$0.getMBinding()).B, Status.FAIL, false, 2, null);
            } else {
                this$0.showError();
            }
        } else if (feedData.getData().j()) {
            if (feedData.getMorePage()) {
                MoreRecyclerView.setStatus$default(((wq4) this$0.getMBinding()).B, Status.FAIL, false, 2, null);
            } else {
                this$0.showNoNetwork();
            }
        } else if (feedData.getData().k()) {
            if (!feedData.getMorePage()) {
                this$0.showContent();
            }
            MoreRecyclerView.setStatus$default(((wq4) this$0.getMBinding()).B, ((CourseFeedVM) this$0.getMViewModel()).getHasMore() ? Status.MORE : Status.DONE, false, 2, null);
            this$0.getAdapter().addData(feedData.getData().f11668a, !feedData.getMorePage());
        } else if (feedData.getData().i() && feedData.getMorePage()) {
            MoreRecyclerView.setStatus$default(((wq4) this$0.getMBinding()).B, Status.LOADING, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.course_feed;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.Hilt_CourseFeedActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String stringExtra;
        String stringExtra2;
        super.onCreate(savedInstanceState);
        CoursePreference.INSTANCE.setShowCourseInfoFragment(true);
        setTitleBackground(bli.course_white);
        Intent intent = getIntent();
        String str = "";
        if (intent == null || (stringExtra = intent.getStringExtra(CourseFeedActivityKt.KEY_FEED_TITLE)) == null) {
            stringExtra = "";
        }
        Intent intent2 = getIntent();
        if (intent2 != null && (stringExtra2 = intent2.getStringExtra(CourseFeedActivityKt.KEY_SPORT_TAG)) != null) {
            str = stringExtra2;
        }
        Intent intent3 = getIntent();
        int intExtra = intent3 != null ? intent3.getIntExtra("sport_type", 0) : 0;
        if (intExtra == 0) {
            finish();
            return;
        }
        setTitle(stringExtra);
        ((CourseFeedVM) getMViewModel()).initData(str, intExtra);
        boolean z = SystemProperties.INSTANCE.isFoldDisplay() && !SettingsPropertiesUtil.INSTANCE.isFolded(this);
        Logger.i(BaseBindingActivity.TAG, "isExpandedState=" + z);
        final int i = z ? 1 : 2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.mi.health.course.activity.CourseFeedActivity$onCreate$gridLayoutManager$1$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return i;
            }
        });
        ((wq4) getMBinding()).B.addItemDecoration(new gak(ExtUtilsKt.getDp(12)));
        ((wq4) getMBinding()).B.setAdapter(getAdapter());
        ((wq4) getMBinding()).B.setLayoutManager(gridLayoutManager);
        ((wq4) getMBinding()).B.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.mi.health.course.activity.CourseFeedActivity.onCreate.1
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                CourseFeedActivity.access$getMViewModel(CourseFeedActivity.this).reqList(true);
            }
        });
        ((CourseFeedVM) getMViewModel()).getLiveData().observe(this, new CourseFeedActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tq4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseFeedActivity.onCreate$lambda$2(this.f34937a, (FeedData) obj);
            }
        }));
        CourseFeedVM.reqList$default((CourseFeedVM) getMViewModel(), false, 1, null);
    }

    @Override // com.mi.health.course.activity.Hilt_CourseFeedActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CoursePreference.INSTANCE.setShowCourseInfoFragment(false);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.startMills = System.currentTimeMillis();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.startMills) / ((long) 1000);
        Logger.d(BaseBindingActivity.TAG, "onStop: audio_heart_control_list_page, " + jCurrentTimeMillis);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "audio_heart_control_list_page"), TuplesKt.to("duration_sec", Long.valueOf(jCurrentTimeMillis))));
    }
}
