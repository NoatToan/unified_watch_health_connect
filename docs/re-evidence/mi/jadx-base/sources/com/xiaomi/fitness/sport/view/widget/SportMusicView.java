package com.xiaomi.fitness.sport.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.health.connect.client.records.CervicalMucusRecord;
import coil.ImageLoader;
import coil.ImageLoaders;
import coil.request.ImageRequest;
import coil.transform.CircleCropTransformation;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_manager_export.listener.MusicData;
import defpackage.bde;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.tgi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/SportMusicView;", "Landroid/widget/LinearLayout;", "", "url", "", "startPlayListCoverAnimation", "(Ljava/lang/String;)V", "stopAnimation", "()V", "Lcom/xiaomi/fitness/sport/view/widget/SportMusicView$State;", "state", "Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;", "it", "bindData", "(Lcom/xiaomi/fitness/sport/view/widget/SportMusicView$State;Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;)V", CervicalMucusRecord.Appearance.CLEAR, "Lbde;", "binding", "Lbde;", "", "hasStartAnimation", "Z", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "State", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportMusicView extends LinearLayout {

    @NotNull
    public static final String TAG = "SportMusicView";

    @Nullable
    private bde binding;
    private boolean hasStartAnimation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/SportMusicView$State;", "", "<init>", "(Ljava/lang/String;I)V", "MUSIC_NO_SELECT", "MUSIC_SELECT_PLAYLIST", "MUSIC_SMART_SELECT", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum State {
        MUSIC_NO_SELECT,
        MUSIC_SELECT_PLAYLIST,
        MUSIC_SMART_SELECT;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.MUSIC_NO_SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.MUSIC_SELECT_PLAYLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.MUSIC_SMART_SELECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportMusicView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void startPlayListCoverAnimation(String url) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageLoader imageLoaderCreate = ImageLoaders.create(context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ImageRequest.Builder builderTransformations = new ImageRequest.Builder(context2).data(url).transformations(new CircleCropTransformation());
        bde bdeVar = this.binding;
        Intrinsics.checkNotNull(bdeVar);
        ImageView ivMusicUrl = bdeVar.C;
        Intrinsics.checkNotNullExpressionValue(ivMusicUrl, "ivMusicUrl");
        imageLoaderCreate.enqueue(builderTransformations.target(ivMusicUrl).build());
        if (this.hasStartAnimation) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), tgi.f34676a);
        animationLoadAnimation.setDuration(36000L);
        animationLoadAnimation.setRepeatCount(-1);
        animationLoadAnimation.setInterpolator(new LinearInterpolator());
        bde bdeVar2 = this.binding;
        Intrinsics.checkNotNull(bdeVar2);
        bdeVar2.E.startAnimation(animationLoadAnimation);
        this.hasStartAnimation = true;
    }

    private final void stopAnimation() {
        bde bdeVar = this.binding;
        Intrinsics.checkNotNull(bdeVar);
        bdeVar.E.clearAnimation();
        this.hasStartAnimation = false;
    }

    public final void bindData(@NotNull State state, @Nullable MusicData it) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(state, "state");
        Logger.i(TAG, "state:" + state + ",it:" + it);
        if (it != null && it.getId() == 101) {
            bde bdeVar = this.binding;
            Intrinsics.checkNotNull(bdeVar);
            bdeVar.C.setVisibility(0);
            startPlayListCoverAnimation(it.getUrl());
            bde bdeVar2 = this.binding;
            Intrinsics.checkNotNull(bdeVar2);
            bdeVar2.D.setImageResource(eoi.J);
            bde bdeVar3 = this.binding;
            Intrinsics.checkNotNull(bdeVar3);
            bdeVar3.F.setText(ResourceExtKt.getString(c1j.R));
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            stopAnimation();
            bde bdeVar4 = this.binding;
            if (bdeVar4 != null && (imageView = bdeVar4.C) != null) {
                ViewExtKt.invisible(imageView);
            }
            bde bdeVar5 = this.binding;
            Intrinsics.checkNotNull(bdeVar5);
            bdeVar5.D.setImageResource(eoi.n);
            bde bdeVar6 = this.binding;
            Intrinsics.checkNotNull(bdeVar6);
            bdeVar6.F.setText(ResourceExtKt.getString(c1j.J));
            return;
        }
        if (i == 2) {
            bde bdeVar7 = this.binding;
            Intrinsics.checkNotNull(bdeVar7);
            bdeVar7.C.setVisibility(0);
            Intrinsics.checkNotNull(it);
            startPlayListCoverAnimation(it.getUrl());
            bde bdeVar8 = this.binding;
            Intrinsics.checkNotNull(bdeVar8);
            bdeVar8.D.setImageResource(eoi.J);
            bde bdeVar9 = this.binding;
            Intrinsics.checkNotNull(bdeVar9);
            bdeVar9.F.setText(it.getName());
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        bde bdeVar10 = this.binding;
        Intrinsics.checkNotNull(bdeVar10);
        bdeVar10.C.setVisibility(0);
        Intrinsics.checkNotNull(it);
        startPlayListCoverAnimation(it.getUrl());
        bde bdeVar11 = this.binding;
        Intrinsics.checkNotNull(bdeVar11);
        bdeVar11.D.setImageResource(eoi.J);
        bde bdeVar12 = this.binding;
        Intrinsics.checkNotNull(bdeVar12);
        bdeVar12.F.setText(it.getName());
    }

    public final void clear() {
        stopAnimation();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportMusicView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportMusicView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportMusicView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.d(TAG, "SportMusicView init");
        bde bdeVarA0 = bde.A0(LayoutInflater.from(context), this, true);
        this.binding = bdeVarA0;
        Intrinsics.checkNotNull(bdeVarA0);
        bdeVarA0.B.setImageResource(eoi.A);
    }
}
