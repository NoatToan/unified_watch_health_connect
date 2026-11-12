package com.huami.account.utils;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.util.AppUtil;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B&\u0012\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00028\u00008F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00028\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huami/account/utils/SelfReference;", ExifInterface.GPS_DIRECTION_TRUE, "", "a", "Lkotlin/Lazy;", "getSelf", "()Ljava/lang/Object;", "self", "b", "Ljava/lang/Object;", AppUtil.DEFAULT_CHANNEL, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "initializer", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class SelfReference<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy self = LazyKt__LazyJVMKt.lazy(new a(this));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final T inner;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u0004\b\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<T> {
        public final /* synthetic */ SelfReference<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SelfReference<T> selfReference) {
            super(0);
            this.a = selfReference;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            T t = (T) ((SelfReference) this.a).inner;
            if (t != null) {
                return t;
            }
            throw new IllegalStateException();
        }
    }

    public SelfReference(@NotNull Function1<? super SelfReference<T>, ? extends T> function1) {
        this.inner = function1.invoke(this);
    }

    public final T getSelf() {
        return (T) this.self.getValue();
    }
}
