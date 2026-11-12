package com.huami.message.ui.base.drawable;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.message.ui.base.drawable.DrawableUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bRF\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/message/ui/base/drawable/DrawableUtil;", "", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "mTextView", "Lcom/huami/message/ui/base/drawable/DrawableUtil$OnDrawableListener;", "b", "Lcom/huami/message/ui/base/drawable/DrawableUtil$OnDrawableListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "Landroid/view/MotionEvent;", "event", "", "c", "Lkotlin/jvm/functions/Function2;", "touchListener", "<init>", "(Landroid/widget/TextView;Lcom/huami/message/ui/base/drawable/DrawableUtil$OnDrawableListener;)V", "OnDrawableListener", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class DrawableUtil {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TextView mTextView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final OnDrawableListener listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function2<View, MotionEvent, Boolean> touchListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/message/ui/base/drawable/DrawableUtil$OnDrawableListener;", "", "", "onClick", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
    public interface OnDrawableListener {
        void onClick();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<View, MotionEvent, Boolean> {

        /* JADX INFO: renamed from: com.huami.message.ui.base.drawable.DrawableUtil$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.message.ui.base.drawable.DrawableUtil$touchListener$1$1$1", f = "DrawableUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0474a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            private /* synthetic */ Object b;
            public final /* synthetic */ DrawableUtil c;
            public final /* synthetic */ View d;

            /* JADX INFO: renamed from: com.huami.message.ui.base.drawable.DrawableUtil$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.message.ui.base.drawable.DrawableUtil$touchListener$1$1$1$1", f = "DrawableUtil.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0475a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ View b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0475a(View view, Continuation<? super C0475a> continuation) {
                    super(2, continuation);
                    this.b = view;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0475a(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0475a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.a = 1;
                        if (DelayKt.delay(300L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.b.setClickable(true);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0474a(DrawableUtil drawableUtil, View view, Continuation<? super C0474a> continuation) {
                super(2, continuation);
                this.c = drawableUtil;
                this.d = view;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0474a c0474a = new C0474a(this.c, this.d, continuation);
                c0474a.b = obj;
                return c0474a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0474a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                this.c.listener.onClick();
                e.f(coroutineScope, null, null, new C0475a(this.d, null), 3, null);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(2);
        }

        public final boolean a(@NotNull View view, @NotNull MotionEvent motionEvent) {
            Drawable drawable;
            if (motionEvent.getAction() != 1 || DrawableUtil.this.listener == null || (drawable = DrawableUtil.this.mTextView.getCompoundDrawables()[2]) == null || motionEvent.getRawX() < DrawableUtil.this.mTextView.getRight() - drawable.getBounds().width()) {
                return false;
            }
            DrawableUtil drawableUtil = DrawableUtil.this;
            view.setClickable(false);
            e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new C0474a(drawableUtil, view, null), 2, null);
            return true;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(View view, MotionEvent motionEvent) {
            return Boolean.valueOf(a(view, motionEvent));
        }
    }

    public DrawableUtil(@NotNull TextView textView, @NotNull OnDrawableListener onDrawableListener) {
        this.mTextView = textView;
        this.listener = onDrawableListener;
        final a aVar = new a();
        this.touchListener = aVar;
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: cd1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DrawableUtil.b(aVar, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Function2 function2, View view, MotionEvent motionEvent) {
        return ((Boolean) function2.invoke(view, motionEvent)).booleanValue();
    }
}
