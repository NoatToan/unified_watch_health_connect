package com.xiaomi.fitness.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.ksi;
import defpackage.qvi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001f\u001a\u00020 H\u0014J\u000e\u0010\u0014\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#J\u0018\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010&\u001a\u00020 2\b\u0010'\u001a\u0004\u0018\u00010#J\u0018\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010+J\u0006\u0010,\u001a\u00020 J\u0006\u0010-\u001a\u00020 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imgTitle", "Landroid/widget/ImageView;", "getImgTitle", "()Landroid/widget/ImageView;", "setImgTitle", "(Landroid/widget/ImageView;)V", "txtTitle", "Landroid/widget/TextView;", "getTxtTitle", "()Landroid/widget/TextView;", "setTxtTitle", "(Landroid/widget/TextView;)V", "imgGuide", "getImgGuide", "setImgGuide", "rightArrow", "getRightArrow", "setRightArrow", "tvStateDesc", "getTvStateDesc", "setTvStateDesc", "onFinishInflate", "", "titleRes", "title", "", "bindData", "imgResourceId", "setStateDesc", "state", "setGuideIcon", "drawableId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "hideGuideIcon", "showRightArrow", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataTitleSimpleView extends RelativeLayout {

    @Nullable
    private ImageView imgGuide;

    @Nullable
    private ImageView imgTitle;

    @Nullable
    private ImageView rightArrow;

    @Nullable
    private TextView tvStateDesc;

    @Nullable
    private TextView txtTitle;

    /* JADX INFO: renamed from: com.xiaomi.fitness.widget.view.DataTitleSimpleView$bindData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.widget.view.DataTitleSimpleView$bindData$1", f = "DataTitleSimpleView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $imgResourceId;
        final /* synthetic */ String $title;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$imgResourceId = i;
            this.$title = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataTitleSimpleView.this.new AnonymousClass1(this.$imgResourceId, this.$title, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ImageView imgTitle = DataTitleSimpleView.this.getImgTitle();
            Intrinsics.checkNotNull(imgTitle);
            imgTitle.setImageResource(this.$imgResourceId);
            TextView txtTitle = DataTitleSimpleView.this.getTxtTitle();
            Intrinsics.checkNotNull(txtTitle);
            txtTitle.setText(this.$title);
            ImageView imgGuide = DataTitleSimpleView.this.getImgGuide();
            if (imgGuide != null) {
                imgGuide.setContentDescription(this.$title);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.widget.view.DataTitleSimpleView$setStateDesc$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.widget.view.DataTitleSimpleView$setStateDesc$1", f = "DataTitleSimpleView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34301(String str, Continuation<? super C34301> continuation) {
            super(2, continuation);
            this.$state = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataTitleSimpleView.this.new C34301(this.$state, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TextView tvStateDesc = DataTitleSimpleView.this.getTvStateDesc();
            Intrinsics.checkNotNull(tvStateDesc);
            tvStateDesc.setText(this.$state);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @JvmOverloads
    public DataTitleSimpleView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    public final void bindData(int imgResourceId, @Nullable String title) {
        AnyExtKt.main$default(null, new AnonymousClass1(imgResourceId, title, null), 1, null);
    }

    @Nullable
    public final ImageView getImgGuide() {
        return this.imgGuide;
    }

    @Nullable
    public final ImageView getImgTitle() {
        return this.imgTitle;
    }

    @Nullable
    public final ImageView getRightArrow() {
        return this.rightArrow;
    }

    @Nullable
    public final TextView getTvStateDesc() {
        return this.tvStateDesc;
    }

    @Nullable
    public final TextView getTxtTitle() {
        return this.txtTitle;
    }

    public final void hideGuideIcon() {
        ImageView imageView = this.imgGuide;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.imgTitle = (ImageView) findViewById(ksi.f24265r);
        this.txtTitle = (TextView) findViewById(ksi.S);
        this.imgGuide = (ImageView) findViewById(ksi.v);
        this.tvStateDesc = (TextView) findViewById(ksi.P);
        this.rightArrow = (ImageView) findViewById(ksi.u);
    }

    public final void setGuideIcon(int drawableId, @Nullable View.OnClickListener listener) {
        ImageView imageView = this.imgGuide;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(0);
        ImageView imageView2 = this.imgGuide;
        Intrinsics.checkNotNull(imageView2);
        imageView2.setImageResource(drawableId);
        ImageView imageView3 = this.imgGuide;
        Intrinsics.checkNotNull(imageView3);
        imageView3.setOnClickListener(listener);
    }

    public final void setImgGuide(@Nullable ImageView imageView) {
        this.imgGuide = imageView;
    }

    public final void setImgTitle(@Nullable ImageView imageView) {
        this.imgTitle = imageView;
    }

    public final void setRightArrow(@Nullable ImageView imageView) {
        this.rightArrow = imageView;
    }

    public final void setStateDesc(@Nullable String state) {
        AnyExtKt.main$default(null, new C34301(state, null), 1, null);
    }

    public final void setTvStateDesc(@Nullable TextView textView) {
        this.tvStateDesc = textView;
    }

    public final void setTxtTitle(@Nullable TextView textView) {
        this.txtTitle = textView;
    }

    public final void showRightArrow() {
        ImageView imageView = this.rightArrow;
        if (imageView != null) {
            ViewExtKt.visible(imageView);
        }
    }

    @JvmOverloads
    public DataTitleSimpleView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setTxtTitle(int titleRes) {
        TextView textView = this.txtTitle;
        Intrinsics.checkNotNull(textView);
        textView.setText(titleRes);
    }

    public /* synthetic */ DataTitleSimpleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setTxtTitle(@Nullable String title) {
        TextView textView = this.txtTitle;
        Intrinsics.checkNotNull(textView);
        textView.setText(title);
    }

    @JvmOverloads
    public DataTitleSimpleView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(qvi.c, this);
    }
}
