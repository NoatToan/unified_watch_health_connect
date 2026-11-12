package com.xiaomi.fitness.share.amap;

import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.mi.health.utils.MapUtilsKt;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt;
import com.xiaomi.fitness.util.AMapPathUtils;
import defpackage.hoi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity$startMove$1$1", f = "SharePathVideoAmapActivity.kt", i = {}, l = {331}, m = "invokeSuspend", n = {}, s = {})
public final class SharePathVideoAmapActivity$startMove$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $colorInterval;
    final /* synthetic */ Location $curLocation;
    final /* synthetic */ boolean $isPre;
    final /* synthetic */ ArrayList<Location> $mUniformOriginalList;
    final /* synthetic */ int $realIndex;
    final /* synthetic */ int $value1;
    int label;
    final /* synthetic */ SharePathVideoAmapActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePathVideoAmapActivity$startMove$1$1(SharePathVideoAmapActivity sharePathVideoAmapActivity, Location location, boolean z, int i, int i2, ArrayList<Location> arrayList, int i3, Continuation<? super SharePathVideoAmapActivity$startMove$1$1> continuation) {
        super(2, continuation);
        this.this$0 = sharePathVideoAmapActivity;
        this.$curLocation = location;
        this.$isPre = z;
        this.$realIndex = i;
        this.$colorInterval = i2;
        this.$mUniformOriginalList = arrayList;
        this.$value1 = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SharePathVideoAmapActivity$startMove$1$1(this.this$0, this.$curLocation, this.$isPre, this.$realIndex, this.$colorInterval, this.$mUniformOriginalList, this.$value1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.getIsInterrupt()) {
                return Unit.INSTANCE;
            }
            if (this.this$0.getAMap().getCameraPosition().zoom >= 18.0f) {
                Marker curMarker = this.this$0.getCurMarker();
                if (curMarker != null) {
                    curMarker.remove();
                }
                SharePathVideoAmapActivity sharePathVideoAmapActivity = this.this$0;
                AMap aMap = sharePathVideoAmapActivity.getAMap();
                MarkerOptions markerOptionsIcon = new MarkerOptions().position(AMapPathUtils.INSTANCE.createLatLng(this.$curLocation)).icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(this.this$0.getResources(), hoi.n1)));
                Intrinsics.checkNotNullExpressionValue(markerOptionsIcon, "icon(...)");
                sharePathVideoAmapActivity.setCurMarker(MapUtilsKt.addMarkerWithZIndex(aMap, markerOptionsIcon));
            } else {
                this.this$0.getAMap().moveCamera(CameraUpdateFactory.newLatLng(AMapPathUtils.INSTANCE.createLatLng(this.$curLocation)));
                if (!this.$isPre) {
                    ImageView play = this.this$0.getBinding().F;
                    Intrinsics.checkNotNullExpressionValue(play, "play");
                    ViewExtKt.visible(play);
                }
            }
            if (!this.$isPre) {
                SharePathVideoAmapActivity sharePathVideoAmapActivity2 = this.this$0;
                Location location = this.$curLocation;
                int i2 = this.$realIndex;
                this.label = 1;
                if (SharePathViewAmapActivityExtKt.showMarker(sharePathVideoAmapActivity2, location, i2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        TraceStyleResModel value = SharePathVideoAmapActivity.access$getMViewModel(this.this$0).getTraceStyleResModeLiveData().getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        this.this$0.drawColorLine(this.$realIndex, this.$curLocation, this.$colorInterval, this.$mUniformOriginalList);
        if (this.$value1 == SharePathVideoAmapActivity.access$getMViewModel(this.this$0).getMUniformOriginalColorList().size()) {
            this.this$0.endTrace(this.$isPre, value);
            Marker curMarker2 = this.this$0.getCurMarker();
            if (curMarker2 != null) {
                curMarker2.remove();
            }
            ImageView play2 = this.this$0.getBinding().F;
            Intrinsics.checkNotNullExpressionValue(play2, "play");
            ViewExtKt.invisible(play2);
            this.this$0.getSwitchMusicPanelHolder().stopMusic();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SharePathVideoAmapActivity$startMove$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
