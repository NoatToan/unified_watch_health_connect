package com.xiaomi.hm.health.device.setting.dial;

import android.widget.ImageView;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JZ\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&R\u0016\u0010\u0015\u001a\u00020\u00128V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/dial/DialFetchApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Landroid/widget/ImageView;", "skin", "dial", "ivTransparent", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", "onFinish", "displayDial", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showCache", "", "getTag", "()Ljava/lang/String;", "tag", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DialFetchApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object displayDial$default(DialFetchApi dialFetchApi, HMDeviceSource hMDeviceSource, ImageView imageView, ImageView imageView2, ImageView imageView3, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: displayDial");
            }
            if ((i & 16) != 0) {
                function1 = null;
            }
            return dialFetchApi.displayDial(hMDeviceSource, imageView, imageView2, imageView3, function1, continuation);
        }

        @NotNull
        public static String getTag(@NotNull DialFetchApi dialFetchApi) {
            return "DialFetchApi";
        }
    }

    @Nullable
    Object displayDial(@NotNull HMDeviceSource hMDeviceSource, @NotNull ImageView imageView, @NotNull ImageView imageView2, @NotNull ImageView imageView3, @Nullable Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    String getTag();

    boolean showCache(@NotNull HMDeviceSource source, @NotNull ImageView skin, @NotNull ImageView dial, @NotNull ImageView ivTransparent);
}
