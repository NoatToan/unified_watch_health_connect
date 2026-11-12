package com.huami.sleepassistant.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.ext.ImageViewExKt;
import com.huami.sleepassistant.lib.vo.ViewStatus;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bB\u0010CB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bB\u0010FB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020\u000f¢\u0006\u0004\bB\u0010HB)\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020\u000f\u0012\u0006\u0010I\u001a\u00020\u000f¢\u0006\u0004\bB\u0010JJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u0007J-\u0010\u001b\u001a\u00020\u00052%\u0010\u001a\u001a!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0016j\u0002`\u0019J-\u0010\u001e\u001a\u00020\u00052%\u0010\u001d\u001a!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0016j\u0002`\u001cJ-\u0010!\u001a\u00020\u00052%\u0010 \u001a!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0016j\u0002`\u001fJ\u0012\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010*R\u0018\u00107\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010*R\u0016\u0010:\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010.R9\u0010?\u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0016j\u0004\u0018\u0001`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R9\u0010\u001d\u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0016j\u0004\u0018\u0001`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R9\u0010 \u001a%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0016j\u0004\u0018\u0001`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010>¨\u0006K"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/MyDownLoadAndPlayView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "Lcom/huami/sleepassistant/lib/vo/ViewStatus;", "status", "setStatus", "", "subTitle", "setSubTitle", "url", "setMediaImage", "", "progress", "setProgress", "content", "setTextContent", "updateDownLoadProgress", "getStatus", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lcom/huami/sleepassistant/lib/widget/OnDownLoadClickListener;", "mDownLoadClickListener", "setOnDownLoadClickListener", "Lcom/huami/sleepassistant/lib/widget/OnPlayListener;", "mOnPlayListener", "setOnPlayListener", "Lcom/huami/sleepassistant/lib/widget/OnPauseListener;", "mOnPauseListener", "setOnPauseListener", "Landroid/view/View;", "v", "onClick", "Lcom/huami/sleepassistant/lib/widget/CustomRoundProgressBar;", "Lcom/huami/sleepassistant/lib/widget/CustomRoundProgressBar;", "imRoundProgressBar", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "tvMusicTimeOut", "Lcom/huami/sleepassistant/lib/widget/ScheduleView;", GoogleApiAvailabilityLight.a, "Lcom/huami/sleepassistant/lib/widget/ScheduleView;", "tvMusicPlay", "e", "tvPlayViewBg", "f", "tvDownLoadView", "g", "Lcom/huami/sleepassistant/lib/vo/ViewStatus;", "mCurrentStatus", "h", "mLoadImage", "i", "Lkotlin/jvm/functions/Function1;", "mOnDownLoadClickListener", z.j, hl.k, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MyDownLoadAndPlayView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private CustomRoundProgressBar imRoundProgressBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private TextView tvTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ImageView tvMusicTimeOut;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ScheduleView tvMusicPlay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private TextView tvPlayViewBg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private TextView tvDownLoadView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private ViewStatus mCurrentStatus;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private ImageView mLoadImage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function1<? super ViewStatus, Unit> mOnDownLoadClickListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Function1<? super ViewStatus, Unit> mOnPlayListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Function1<? super ViewStatus, Unit> mOnPauseListener;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewStatus.values().length];
            iArr[ViewStatus.DOWN_LOAD_FAILS.ordinal()] = 1;
            iArr[ViewStatus.PAUSE.ordinal()] = 2;
            iArr[ViewStatus.PLAY.ordinal()] = 3;
            iArr[ViewStatus.DOWN_LOADING.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MyDownLoadAndPlayView(@NotNull Context context) {
        super(context);
        this.mCurrentStatus = ViewStatus.DOWN_LOAD_FAILS;
        a(context);
    }

    private final void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.sls_custom_down_and_play, (ViewGroup) this, true);
        this.imRoundProgressBar = (CustomRoundProgressBar) findViewById(R.id.sls_item_custom_progress_bar);
        this.tvTitle = (TextView) findViewById(R.id.sls_tv_subtitle);
        this.tvMusicTimeOut = (ImageView) findViewById(R.id.sls_play_music_time_out);
        this.tvMusicPlay = (ScheduleView) findViewById(R.id.sls_play_music_play);
        this.tvPlayViewBg = (TextView) findViewById(R.id.sls_down_and_play_bg);
        this.tvDownLoadView = (TextView) findViewById(R.id.sls_down_load_views);
        this.mLoadImage = (ImageView) findViewById(R.id.load_image);
        TextView textView = this.tvDownLoadView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        this.mCurrentStatus = ViewStatus.DOWN_LOAD_FAILS;
    }

    private final void setStatus(ViewStatus status) {
        this.mCurrentStatus = status;
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            ImageView imageView = this.tvMusicTimeOut;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            ScheduleView scheduleView = this.tvMusicPlay;
            if (scheduleView != null) {
                scheduleView.setVisibility(4);
            }
            TextView textView = this.tvPlayViewBg;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        if (i == 2) {
            ImageView imageView2 = this.tvMusicTimeOut;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ScheduleView scheduleView2 = this.tvMusicPlay;
            if (scheduleView2 != null) {
                scheduleView2.setVisibility(4);
            }
            TextView textView2 = this.tvPlayViewBg;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(4);
            return;
        }
        if (i == 3) {
            ImageView imageView3 = this.tvMusicTimeOut;
            if (imageView3 != null) {
                imageView3.setVisibility(4);
            }
            ScheduleView scheduleView3 = this.tvMusicPlay;
            if (scheduleView3 != null) {
                scheduleView3.setVisibility(0);
            }
            TextView textView3 = this.tvPlayViewBg;
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(4);
            return;
        }
        if (i != 4) {
            return;
        }
        ImageView imageView4 = this.tvMusicTimeOut;
        if (imageView4 != null) {
            imageView4.setVisibility(4);
        }
        ScheduleView scheduleView4 = this.tvMusicPlay;
        if (scheduleView4 != null) {
            scheduleView4.setVisibility(4);
        }
        TextView textView4 = this.tvPlayViewBg;
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(4);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    /* JADX INFO: renamed from: getStatus, reason: from getter */
    public final ViewStatus getMCurrentStatus() {
        return this.mCurrentStatus;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        Function1<? super ViewStatus, Unit> function1;
        int i = WhenMappings.$EnumSwitchMapping$0[this.mCurrentStatus.ordinal()];
        if (i == 1) {
            Function1<? super ViewStatus, Unit> function2 = this.mOnDownLoadClickListener;
            if (function2 == null) {
                return;
            }
            function2.invoke(ViewStatus.DOWN_LOADING);
            return;
        }
        if (i != 2) {
            if (i == 3 && (function1 = this.mOnPauseListener) != null) {
                function1.invoke(ViewStatus.PAUSE);
                return;
            }
            return;
        }
        Function1<? super ViewStatus, Unit> function3 = this.mOnPlayListener;
        if (function3 == null) {
            return;
        }
        function3.invoke(ViewStatus.PLAY);
    }

    public final void setMediaImage(@NotNull String url) {
        ImageView imageView = this.mLoadImage;
        if (imageView == null) {
            return;
        }
        ImageViewExKt.loadWithMusicGlideCircle(imageView, url);
    }

    public final void setOnDownLoadClickListener(@NotNull Function1<? super ViewStatus, Unit> mDownLoadClickListener) {
        this.mOnDownLoadClickListener = mDownLoadClickListener;
    }

    public final void setOnPauseListener(@NotNull Function1<? super ViewStatus, Unit> mOnPauseListener) {
        this.mOnPauseListener = mOnPauseListener;
    }

    public final void setOnPlayListener(@NotNull Function1<? super ViewStatus, Unit> mOnPlayListener) {
        this.mOnPlayListener = mOnPlayListener;
    }

    public final void setProgress(int progress) {
        CustomRoundProgressBar customRoundProgressBar = this.imRoundProgressBar;
        if (customRoundProgressBar == null) {
            return;
        }
        customRoundProgressBar.setProgress(progress);
    }

    public final void setSubTitle(@NotNull String subTitle) {
        TextView textView = this.tvTitle;
        if (textView == null) {
            return;
        }
        textView.setText(subTitle);
    }

    public final void setTextContent(@NotNull String content) {
        TextView textView = this.tvTitle;
        if (textView == null) {
            return;
        }
        textView.setText(content);
    }

    public final void updateDownLoadProgress(int progress) {
        setStatus(ViewStatus.DOWN_LOADING);
        CustomRoundProgressBar customRoundProgressBar = this.imRoundProgressBar;
        if (customRoundProgressBar != null) {
            customRoundProgressBar.setProgress(progress);
        }
        if (progress >= 100) {
            setStatus(ViewStatus.PLAY);
            CustomRoundProgressBar customRoundProgressBar2 = this.imRoundProgressBar;
            if (customRoundProgressBar2 == null) {
                return;
            }
            customRoundProgressBar2.setProgress(0);
        }
    }

    public MyDownLoadAndPlayView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurrentStatus = ViewStatus.DOWN_LOAD_FAILS;
        a(context);
    }

    public MyDownLoadAndPlayView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentStatus = ViewStatus.DOWN_LOAD_FAILS;
        a(context);
    }

    @RequiresApi(21)
    public MyDownLoadAndPlayView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mCurrentStatus = ViewStatus.DOWN_LOAD_FAILS;
        a(context);
    }
}
