package com.xiaomi.hm.health.training.ui.activity;

import android.R;
import android.os.Bundle;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCoursePlayFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/activity/FeaturedCoursePlayActivity;", "Lcom/huami/view/basetitle/BaseFragmentActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class FeaturedCoursePlayActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "ARG_FEATURED_COURSE_ID";

    @NotNull
    private static final String b = FeaturedCoursePlayFragment.ARG_INITIAL_PLAY_VIDEO_ID;

    @NotNull
    private static final String c = FeaturedCoursePlayFragment.ARG_INITIAL_PLAY_VIDEO_URL;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/training/ui/activity/FeaturedCoursePlayActivity$Companion;", "", "", "EXTRA_FEATURED_COURSE_ID", "Ljava/lang/String;", "getEXTRA_FEATURED_COURSE_ID", "()Ljava/lang/String;", "EXTRA_INITIAL_PLAY_VIDEO_ID", "getEXTRA_INITIAL_PLAY_VIDEO_ID", "EXTRA_INITIAL_PLAY_VIDEO_URL", "getEXTRA_INITIAL_PLAY_VIDEO_URL", "<init>", "()V", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getEXTRA_FEATURED_COURSE_ID() {
            return FeaturedCoursePlayActivity.a;
        }

        @NotNull
        public final String getEXTRA_INITIAL_PLAY_VIDEO_ID() {
            return FeaturedCoursePlayActivity.b;
        }

        @NotNull
        public final String getEXTRA_INITIAL_PLAY_VIDEO_URL() {
            return FeaturedCoursePlayActivity.c;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FeaturedCoursePlayFragment featuredCoursePlayFragment = new FeaturedCoursePlayFragment();
        featuredCoursePlayFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(R.id.content, featuredCoursePlayFragment, "PlayFeaturedCourse").commit();
    }
}
