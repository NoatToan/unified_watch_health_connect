package com.huami.third.alipay.ui;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.third.alipay.AlipaySourceImpl;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\f\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/third/alipay/ui/AlipayVMFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Lcom/huami/third/alipay/AlipaySourceImpl;", "a", "Lkotlin/Lazy;", "()Lcom/huami/third/alipay/AlipaySourceImpl;", "weChatSource", "<init>", "()V", "alipay-ui_release"}, k = 1, mv = {1, 4, 1})
public final class AlipayVMFactory implements ViewModelProvider.Factory {

    @NotNull
    public static final AlipayVMFactory INSTANCE = new AlipayVMFactory();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Lazy weChatSource = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/third/alipay/AlipaySourceImpl;", "a", "()Lcom/huami/third/alipay/AlipaySourceImpl;"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<AlipaySourceImpl> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AlipaySourceImpl invoke() {
            return new AlipaySourceImpl();
        }
    }

    private AlipayVMFactory() {
    }

    private final AlipaySourceImpl a() {
        return (AlipaySourceImpl) weChatSource.getValue();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        return new AlipayViewModel(a());
    }
}
