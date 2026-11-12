package com.huami.sky.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.SkyLayoutPlayViewBinding;
import com.huami.sky.ui.utils.ExtFuncKt;
import com.huami.sky.ui.view.SkyPlayView;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.CustomToast;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/huami/sky/ui/view/SkyPlayView;", "Landroid/widget/FrameLayout;", "", "isVisible", "", "setLoadingAnimationVisible", "", "time", "startWithTime", "", "playState", "updateViewByPlayState", "Lcom/huami/sky/ui/databinding/SkyLayoutPlayViewBinding;", "a", "Lcom/huami/sky/ui/databinding/SkyLayoutPlayViewBinding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "PlayState", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayView extends FrameLayout {
    public static final int ERROR = 3;
    public static final int LOADING = 0;
    public static final int PlAY = 1;
    public static final int STOP = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SkyLayoutPlayViewBinding binding;

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/huami/sky/ui/view/SkyPlayView$PlayState;", "", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public @interface PlayState {
    }

    @JvmOverloads
    public SkyPlayView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SkyPlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SkyPlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setLoadingAnimationVisible(boolean isVisible) {
        if (isVisible) {
            this.binding.loading.setVisibility(0);
            this.binding.loading.post(new Runnable() { // from class: oy6
                @Override // java.lang.Runnable
                public final void run() {
                    SkyPlayView.m3387setLoadingAnimationVisible$lambda3(this.a);
                }
            });
        } else {
            this.binding.loading.setVisibility(8);
            this.binding.loading.post(new Runnable() { // from class: py6
                @Override // java.lang.Runnable
                public final void run() {
                    SkyPlayView.m3388setLoadingAnimationVisible$lambda4(this.a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setLoadingAnimationVisible$lambda-3, reason: not valid java name */
    public static final void m3387setLoadingAnimationVisible$lambda3(SkyPlayView skyPlayView) {
        skyPlayView.binding.loading.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setLoadingAnimationVisible$lambda-4, reason: not valid java name */
    public static final void m3388setLoadingAnimationVisible$lambda4(SkyPlayView skyPlayView) {
        skyPlayView.binding.loading.cancelAnimation();
    }

    public final void startWithTime(long time) {
        this.binding.countTimeProgressView.setCountTime(time);
        this.binding.countTimeProgressView.startCountTimeAnimation();
    }

    public final void updateViewByPlayState(@PlayState int playState) {
        if (playState == 0) {
            this.binding.play.setVisibility(8);
            setLoadingAnimationVisible(true);
            return;
        }
        if (playState == 1) {
            SkyLayoutPlayViewBinding skyLayoutPlayViewBinding = this.binding;
            skyLayoutPlayViewBinding.play.setVisibility(0);
            skyLayoutPlayViewBinding.play.setImageResource(R.drawable.ic_sky_preference_pause);
            setLoadingAnimationVisible(false);
            skyLayoutPlayViewBinding.countTimeProgressView.setVisibility(0);
            return;
        }
        if (playState == 2 || playState == 3) {
            SkyLayoutPlayViewBinding skyLayoutPlayViewBinding2 = this.binding;
            skyLayoutPlayViewBinding2.play.setVisibility(0);
            skyLayoutPlayViewBinding2.play.setImageResource(R.drawable.ic_sky_preference_play);
            setLoadingAnimationVisible(false);
            skyLayoutPlayViewBinding2.countTimeProgressView.setVisibility(8);
            skyLayoutPlayViewBinding2.countTimeProgressView.cancelCountTimeAnimation();
            if (playState == 3) {
                CustomToast.showShort(getContext().getApplicationContext(), R.string.sky_play_network_disconnect);
            }
        }
    }

    @JvmOverloads
    public SkyPlayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SkyLayoutPlayViewBinding skyLayoutPlayViewBindingInflate = SkyLayoutPlayViewBinding.inflate(LayoutInflater.from(context), this);
        this.binding = skyLayoutPlayViewBindingInflate;
        skyLayoutPlayViewBindingInflate.countTimeProgressView.setBorderBottomColor(ExtFuncKt.addAlpha(ContextCompat.getColor(context, R.color.s46), 0.2d));
        updateViewByPlayState(2);
    }
}
