package com.xiaomi.fitness.sport.view.widget;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.ImageLoader;
import coil.ImageLoaders;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport.view.widget.RunningSportMusicView;
import com.xiaomi.fitness.sport_manager_export.listener.MusicData;
import defpackage.eoi;
import defpackage.ez5;
import defpackage.yae;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0002\"!B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/RunningSportMusicView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "setListener", "()V", "startAnimation", "stopAnimation", "Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;", "it", "bindData", "(Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/sport/view/widget/ButtonsClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnButtonsClickListener", "(Lcom/xiaomi/fitness/sport/view/widget/ButtonsClickListener;)V", "", "isPlaying", "updateMusicPlayState", "(Ljava/lang/Boolean;)V", "buttonListener", "Lcom/xiaomi/fitness/sport/view/widget/ButtonsClickListener;", "Lyae;", "binding", "Lyae;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "State", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RunningSportMusicView extends ConstraintLayout {

    @NotNull
    public static final String TAG = "RunningSportMusicView";

    @Nullable
    private yae binding;
    private ButtonsClickListener buttonListener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/RunningSportMusicView$State;", "", "<init>", "(Ljava/lang/String;I)V", "PLAYLIST", "PLAYING", "PAUSE", "PRE", "NEXT", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum State {
        PLAYLIST,
        PLAYING,
        PAUSE,
        PRE,
        NEXT;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RunningSportMusicView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setListener() {
        FitnessLogUtils.d(TAG, "setListener");
        yae yaeVar = this.binding;
        Intrinsics.checkNotNull(yaeVar);
        yaeVar.H.setOnClickListener(new View.OnClickListener() { // from class: b5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningSportMusicView.setListener$lambda$0(this.f3826a, view);
            }
        });
        yae yaeVar2 = this.binding;
        Intrinsics.checkNotNull(yaeVar2);
        yaeVar2.F.setOnClickListener(new View.OnClickListener() { // from class: c5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningSportMusicView.setListener$lambda$1(this.f4961a, view);
            }
        });
        yae yaeVar3 = this.binding;
        Intrinsics.checkNotNull(yaeVar3);
        yaeVar3.I.setOnClickListener(new View.OnClickListener() { // from class: d5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningSportMusicView.setListener$lambda$2(this.f15112a, view);
            }
        });
        yae yaeVar4 = this.binding;
        Intrinsics.checkNotNull(yaeVar4);
        yaeVar4.G.setOnClickListener(new View.OnClickListener() { // from class: e5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningSportMusicView.setListener$lambda$3(this.f16289a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(RunningSportMusicView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.buttonListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonListener");
        }
        ButtonsClickListener buttonsClickListener = this$0.buttonListener;
        if (buttonsClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonListener");
            buttonsClickListener = null;
        }
        buttonsClickListener.onPlayListButtonClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(RunningSportMusicView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.buttonListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonListener");
        }
        ButtonsClickListener buttonsClickListener = this$0.buttonListener;
        if (buttonsClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonListener");
            buttonsClickListener = null;
        }
        buttonsClickListener.onNextButtonClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(RunningSportMusicView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.buttonListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonListener");
        }
        ButtonsClickListener buttonsClickListener = this$0.buttonListener;
        if (buttonsClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonListener");
            buttonsClickListener = null;
        }
        buttonsClickListener.onPreButtonClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(RunningSportMusicView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.buttonListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonListener");
        }
        ButtonsClickListener buttonsClickListener = this$0.buttonListener;
        if (buttonsClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonListener");
            buttonsClickListener = null;
        }
        buttonsClickListener.onPauseOrPlayButtonClick();
    }

    private final void startAnimation() {
        yae yaeVar = this.binding;
        Intrinsics.checkNotNull(yaeVar);
        ImageView imageView = yaeVar.C;
        Object drawable = imageView != null ? imageView.getDrawable() : null;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    private final void stopAnimation() {
        yae yaeVar = this.binding;
        Intrinsics.checkNotNull(yaeVar);
        ImageView imageView = yaeVar.C;
        Object drawable = imageView != null ? imageView.getDrawable() : null;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
    }

    public final void bindData(@Nullable MusicData it) {
        FitnessLogUtils.i(TAG, "bindData:musicData:" + it);
        yae yaeVar = this.binding;
        Intrinsics.checkNotNull(yaeVar);
        TextView textView = yaeVar.E;
        Intrinsics.checkNotNull(it);
        textView.setText(it.getName());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageLoader imageLoaderCreate = ImageLoaders.create(context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ImageRequest.Builder builderTransformations = new ImageRequest.Builder(context2).data(it.getUrl()).transformations(new RoundedCornersTransformation(ez5.a(8)));
        yae yaeVar2 = this.binding;
        Intrinsics.checkNotNull(yaeVar2);
        ImageView sportMusicImg = yaeVar2.D;
        Intrinsics.checkNotNullExpressionValue(sportMusicImg, "sportMusicImg");
        imageLoaderCreate.enqueue(builderTransformations.target(sportMusicImg).build());
        startAnimation();
    }

    public final void onDestroy() {
        stopAnimation();
    }

    public final void setOnButtonsClickListener(@NotNull ButtonsClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        FitnessLogUtils.i(TAG, "setOnButtonsClickListener , listener:" + listener);
        this.buttonListener = listener;
    }

    public final void updateMusicPlayState(@Nullable Boolean isPlaying) {
        FitnessLogUtils.i(TAG, "updateMusicPlayState , isPlaying:" + isPlaying);
        yae yaeVar = this.binding;
        Intrinsics.checkNotNull(yaeVar);
        ImageView imageView = yaeVar.G;
        Intrinsics.checkNotNull(isPlaying);
        imageView.setImageResource(isPlaying.booleanValue() ? eoi.l : eoi.m);
        if (isPlaying.booleanValue()) {
            startAnimation();
        } else {
            stopAnimation();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RunningSportMusicView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RunningSportMusicView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RunningSportMusicView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = yae.A0(LayoutInflater.from(context), this, true);
        setListener();
    }
}
