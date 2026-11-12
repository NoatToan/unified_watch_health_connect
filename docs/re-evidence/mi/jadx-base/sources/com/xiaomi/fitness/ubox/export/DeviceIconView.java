package com.xiaomi.fitness.ubox.export;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import coil.Coil;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.ubox.export.DeviceIconView;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.y4j;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 62\u00020\u0001:\u00016B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010 \u001a\u00020!H\u0014J\u001e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010&J\u0018\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*J\u001a\u0010+\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010$2\b\u0010-\u001a\u0004\u0018\u00010$J\u000e\u0010.\u001a\u00020!2\u0006\u0010(\u001a\u00020$J\n\u0010/\u001a\u0004\u0018\u00010$H\u0002J\u0012\u00100\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\b\u00101\u001a\u00020$H\u0002J\n\u00102\u001a\u0004\u0018\u00010$H\u0002J\u0010\u00103\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0002J\u0010\u00104\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$J\u0012\u00105\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010*H\u0002R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00160\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/ubox/export/DeviceIconView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "type", "getType", "()I", "setType", "(I)V", "isCurrentDevice", "", "()Z", "setCurrentDevice", "(Z)V", "idImgResult", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "Landroid/graphics/drawable/Drawable;", "defaultImgResult", "downloadAllResult", "getDownloadAllResult", "()Landroidx/lifecycle/MutableLiveData;", "setDownloadAllResult", "(Landroidx/lifecycle/MutableLiveData;)V", "imgObserver", "Landroidx/lifecycle/Observer;", "onDetachedFromWindow", "", "loadUrl", "url", "", "isIdImg", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showModelAndSize", "model", MediaStoreUtil.MediaInfo.SIZE, "Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", "loadModelAndSize", "deviceUrl", "defaultUrl", "showKongMing", "getAbstractImgUrl", "getAbstractUrlBySize", "getKongMingUrl", "getCurrentDeviceImgUrl", "getUrlByModel", "showImg", "screenShapeType", "Companion", "ubox-guide-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceIconView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceIconView.kt\ncom/xiaomi/fitness/ubox/export/DeviceIconView\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,232:1\n489#2,11:233\n24#3:244\n54#3,3:245\n24#3:248\n57#3,6:249\n63#3,2:256\n57#4:255\n*S KotlinDebug\n*F\n+ 1 DeviceIconView.kt\ncom/xiaomi/fitness/ubox/export/DeviceIconView\n*L\n97#1:233,11\n114#1:244\n194#1:245,3\n194#1:248\n194#1:249,6\n194#1:256,2\n194#1:255\n*E\n"})
public final class DeviceIconView extends AppCompatImageView {

    @NotNull
    public static final String sBaseUrl = "https://cdn.web-global.fds.api.mi-img.com/hlth-common-resource/oobe/device/";

    @NotNull
    public static final String sTag = "DeviceIconView";
    public static final int sTypeBandRunWay = 3;
    public static final int sTypeBandSquare = 2;
    public static final int sTypeWatchCicle = 0;
    public static final int sTypeWatchSquare = 1;

    @NotNull
    private MutableLiveData<Pair<Boolean, Drawable>> defaultImgResult;

    @NotNull
    private MutableLiveData<Boolean> downloadAllResult;

    @NotNull
    private MutableLiveData<Pair<Boolean, Drawable>> idImgResult;

    @NotNull
    private Observer<Pair<Boolean, Drawable>> imgObserver;
    private boolean isCurrentDevice;
    private int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArrayList<String> sDefaultList = CollectionsKt__CollectionsKt.arrayListOf("watch.circle/%s_%s.png", "watch.square/%s_%s.png", "band.square/%s_%s.png", "band.circle/%s_%s.png");

    @NotNull
    private static final ArrayList<String> sTypeList = CollectionsKt__CollectionsKt.arrayListOf("watch_face_android", "message_android", "phone_call_android");

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/ubox/export/DeviceIconView$Companion;", "", "<init>", "()V", "sTag", "", "sTypeWatchCicle", "", "sTypeWatchSquare", "sTypeBandSquare", "sTypeBandRunWay", "sBaseUrl", "sDefaultList", "Ljava/util/ArrayList;", "getSDefaultList", "()Ljava/util/ArrayList;", "sTypeList", "getSTypeList", "ubox-guide-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ArrayList<String> getSDefaultList() {
            return DeviceIconView.sDefaultList;
        }

        @NotNull
        public final ArrayList<String> getSTypeList() {
            return DeviceIconView.sTypeList;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.ubox.export.DeviceIconView$loadModelAndSize$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.ubox.export.DeviceIconView$loadModelAndSize$1", f = "DeviceIconView.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $deviceUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceIconView.this.new AnonymousClass1(this.$deviceUrl, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceIconView deviceIconView = DeviceIconView.this;
                String str = this.$deviceUrl;
                this.label = 1;
                if (deviceIconView.loadUrl(str, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.ubox.export.DeviceIconView$loadModelAndSize$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.ubox.export.DeviceIconView$loadModelAndSize$2", f = "DeviceIconView.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $defaultUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$defaultUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceIconView.this.new AnonymousClass2(this.$defaultUrl, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceIconView deviceIconView = DeviceIconView.this;
                String str = this.$defaultUrl;
                this.label = 1;
                if (deviceIconView.loadUrl(str, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceIconView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final String getAbstractImgUrl() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return getAbstractUrlBySize(wearableDeviceModel.getProduct().getSize());
        }
        return null;
    }

    private final String getAbstractUrlBySize(Product.Size size) {
        int iScreenShapeType = screenShapeType(size);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = sBaseUrl + ((Object) sDefaultList.get(iScreenShapeType));
        Object[] objArr = new Object[2];
        objArr[0] = sTypeList.get(this.type);
        objArr[1] = LocaleUtil.isCN() ? "cn" : "en";
        String str2 = String.format(str, Arrays.copyOf(objArr, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        StringBuilder sb = new StringBuilder();
        sb.append("onAttachedToWindow default url:");
        sb.append(str2);
        return str2;
    }

    private final String getCurrentDeviceImgUrl() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return getUrlByModel(DeviceModelExtKt.getModel(wearableDeviceModel));
        }
        return null;
    }

    private final String getKongMingUrl() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = sBaseUrl + ((Object) sDefaultList.get(3));
        Object[] objArr = new Object[2];
        objArr[0] = sTypeList.get(this.type);
        objArr[1] = LocaleUtil.isCN() ? "cn" : "en";
        String str2 = String.format(str, Arrays.copyOf(objArr, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        StringBuilder sb = new StringBuilder();
        sb.append("getKongMingUrl default url:");
        sb.append(str2);
        return str2;
    }

    private final String getUrlByModel(String model) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = sBaseUrl + model + "/%s_%s.png";
        Object[] objArr = new Object[2];
        objArr[0] = sTypeList.get(this.type);
        objArr[1] = LocaleUtil.isCN() ? "cn" : "en";
        String str2 = String.format(str, Arrays.copyOf(objArr, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void imgObserver$lambda$0(DeviceIconView this$0, Pair it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Pair<Boolean, Drawable> value = this$0.idImgResult.getValue();
        Pair<Boolean, Drawable> value2 = this$0.defaultImgResult.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append("imgObserver idResult:");
        sb.append(value);
        sb.append(" defaultResult");
        sb.append(value2);
        if (value == null || value2 == null) {
            return;
        }
        if (value.getFirst().booleanValue()) {
            this$0.setImageDrawable(value.getSecond());
        } else if (value2.getFirst().booleanValue()) {
            this$0.setImageDrawable(value2.getSecond());
        }
        this$0.downloadAllResult.postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadUrl(final String str, final boolean z, Continuation<? super Unit> continuation) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageRequest.Builder builderData = new ImageRequest.Builder(context).data(str);
        builderData.listener(new ImageRequest.Listener(str, z, this, str, z, this) { // from class: com.xiaomi.fitness.ubox.export.DeviceIconView$loadUrl$lambda$3$$inlined$listener$default$1
            final /* synthetic */ boolean $isIdImg$inlined;
            final /* synthetic */ boolean $isIdImg$inlined$1;
            final /* synthetic */ String $url$inlined;
            final /* synthetic */ String $url$inlined$1;
            final /* synthetic */ DeviceIconView this$0;

            @Override // coil.request.ImageRequest.Listener
            public void onCancel(@NotNull ImageRequest request) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                String str2 = this.$url$inlined;
                boolean z2 = this.$isIdImg$inlined;
                StringBuilder sb = new StringBuilder();
                sb.append("loadUrl error url:");
                sb.append(str2);
                sb.append(" isIdImg:");
                sb.append(z2);
                if (this.$isIdImg$inlined) {
                    this.this$0.idImgResult.postValue(new Pair(Boolean.FALSE, null));
                } else {
                    this.this$0.defaultImgResult.postValue(new Pair(Boolean.FALSE, null));
                }
            }

            @Override // coil.request.ImageRequest.Listener
            public void onStart(@NotNull ImageRequest request) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
                String str2 = this.$url$inlined$1;
                boolean z2 = this.$isIdImg$inlined$1;
                StringBuilder sb = new StringBuilder();
                sb.append("loadUrl success url:");
                sb.append(str2);
                sb.append(" isIdImg:");
                sb.append(z2);
                if (this.$isIdImg$inlined$1) {
                    this.this$0.idImgResult.postValue(new Pair(Boolean.TRUE, result.getDrawable()));
                } else {
                    this.this$0.defaultImgResult.postValue(new Pair(Boolean.TRUE, result.getDrawable()));
                }
            }
        });
        ImageRequest imageRequestBuild = builderData.build();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Object objExecute = Coil.imageLoader(context2).execute(imageRequestBuild, continuation);
        return objExecute == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objExecute : Unit.INSTANCE;
    }

    private final int screenShapeType(Product.Size size) {
        int i;
        WearableDeviceModel wearableDeviceModel;
        if (this.isCurrentDevice && (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) != null && DeviceModelExtKt.isKongMing(wearableDeviceModel)) {
            return 3;
        }
        if (size == null) {
            return 0;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        int radius = size.getRadius();
        int width2 = size.getWidth();
        int height2 = size.getHeight();
        int radius2 = size.getRadius();
        StringBuilder sb = new StringBuilder();
        sb.append("screenShapeType id img width:");
        sb.append(width2);
        sb.append(" height:");
        sb.append(height2);
        sb.append(" radius:");
        sb.append(radius2);
        double d = width;
        if ((d * 1.0d) / ((double) height) >= 0.8d) {
            i = width == radius * 2 ? 0 : 1;
        } else {
            i = (((double) radius) * 1.0d) / d >= 0.5d ? 3 : 2;
        }
        int width3 = size.getWidth();
        int height3 = size.getHeight();
        int radius3 = size.getRadius();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("screenShapeType id img width:");
        sb2.append(width3);
        sb2.append(" height:");
        sb2.append(height3);
        sb2.append(" radius:");
        sb2.append(radius3);
        sb2.append(" type:");
        sb2.append(i);
        return i;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDownloadAllResult() {
        return this.downloadAllResult;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isCurrentDevice, reason: from getter */
    public final boolean getIsCurrentDevice() {
        return this.isCurrentDevice;
    }

    public final void loadModelAndSize(@Nullable String deviceUrl, @Nullable String defaultUrl) {
        StringBuilder sb = new StringBuilder();
        sb.append("id currentDeviceImgUrl:");
        sb.append(deviceUrl);
        if (deviceUrl != null) {
            ScopeExtKt.scopeNet$default(null, new AnonymousClass1(deviceUrl, null), 1, null);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id abstractImgUrl:");
        sb2.append(defaultUrl);
        if (defaultUrl != null) {
            ScopeExtKt.scopeNet$default(null, new AnonymousClass2(defaultUrl, null), 1, null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.idImgResult.removeObserver(this.imgObserver);
        this.defaultImgResult.removeObserver(this.imgObserver);
    }

    public final void setCurrentDevice(boolean z) {
        this.isCurrentDevice = z;
    }

    public final void setDownloadAllResult(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.downloadAllResult = mutableLiveData;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void showImg(@Nullable String url) {
        if (url != null) {
            Coil.imageLoader(getContext()).enqueue(new ImageRequest.Builder(getContext()).data(url).target(this).build());
        }
    }

    public final void showKongMing(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        loadModelAndSize(getUrlByModel(model), getKongMingUrl());
    }

    public final void showModelAndSize(@NotNull String model, @Nullable Product.Size size) {
        Intrinsics.checkNotNullParameter(model, "model");
        loadModelAndSize(getUrlByModel(model), getAbstractUrlBySize(size));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceIconView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceIconView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isCurrentDevice = true;
        this.idImgResult = new MutableLiveData<>();
        this.defaultImgResult = new MutableLiveData<>();
        this.downloadAllResult = new MutableLiveData<>();
        this.imgObserver = new Observer() { // from class: r56
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DeviceIconView.imgObserver$lambda$0(this.f32198a, (Pair) obj);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y4j.r0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.type = typedArrayObtainStyledAttributes.getInt(y4j.t0, 0);
        this.isCurrentDevice = typedArrayObtainStyledAttributes.getBoolean(y4j.s0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.isCurrentDevice) {
            loadModelAndSize(getCurrentDeviceImgUrl(), getAbstractImgUrl());
        }
        this.idImgResult.observeForever(this.imgObserver);
        this.defaultImgResult.observeForever(this.imgObserver);
    }

    public /* synthetic */ DeviceIconView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
