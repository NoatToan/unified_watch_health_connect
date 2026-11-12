package com.xiaomi.fitness.detail.video.share.util;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import androidx.core.content.FileProvider;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.video.share.model.MomentsModel;
import com.xiaomi.fitness.detail.video.share.model.SportTracePointDataModel;
import com.xiaomi.fitness.detail.video.share.model.StyleItem;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity;
import com.xiaomi.fitness.share.amap.ext.SharePathViewAmapActivityExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.hoi;
import defpackage.j1j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f\u001a\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u001a$\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005\u001a\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0010*\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005\u001a\"\u0010\u001e\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005\u001aB\u0010 \u001a\u00020!2\u001a\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$0#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0#2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u001a<\u0010)\u001a\u00020!2\u001a\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$0#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0#2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020&H\u0002\u001a2\u0010-\u001a\u0004\u0018\u00010&2\u001a\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$0#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0#\u001a\"\u0010.\u001a\u00020\u00052\u001a\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$0#\u001a\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0$\u001a2\u00100\u001a\u00020!2\u001a\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$0#2\u0006\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\u000e\u001a\f\u00103\u001a\u00020\f*\u0004\u0018\u00010&\u001a\f\u00104\u001a\u00020\f*\u0004\u0018\u00010&\u001a\f\u00105\u001a\u00020\f*\u0004\u0018\u00010&\u001a4\u00106\u001a\u00020!2\b\u00107\u001a\u0004\u0018\u00010&2\u0006\u00108\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020%0#2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0#\u001a:\u0010=\u001a\u00020!2\u001a\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$0#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0#2\b\b\u0002\u0010>\u001a\u00020\f\u001a0\u0010?\u001a\u00020!2\u001a\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$0#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0#\u001a\f\u0010@\u001a\u0004\u0018\u00010\u0010*\u00020\u0011\u001a\u001c\u0010A\u001a\u0004\u0018\u00010\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010B\u001a\u00020\u0005\u001a\u0010\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020EH\u0002\u001a\u001e\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u0005\u001a\u001e\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u0005\u001a\u001c\u0010O\u001a\u0004\u0018\u00010\u0010*\u00020\u00112\u0006\u0010M\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u0005\u001a\n\u0010P\u001a\u00020\u0010*\u00020\u0010\u001a\u001e\u0010R\u001a\u00020!2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020T\u001a\u000e\u0010W\u001a\u00020!2\u0006\u00108\u001a\u00020X\u001a\u0016\u0010Y\u001a\u00020!2\u0006\u0010Z\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u001e\u0010[\u001a\u00020!2\u0006\u0010\\\u001a\u00020\u00012\u0006\u0010]\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013\u001a\"\u0010^\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u0011H\u0002\u001a\u000e\u0010b\u001a\u00020%2\u0006\u0010c\u001a\u00020\u0011\u001a\u000e\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u0011\u001a\u000e\u0010g\u001a\u00020\f2\u0006\u0010h\u001a\u00020e\u001a\u000e\u0010i\u001a\u00020\f2\u0006\u0010f\u001a\u00020\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006j"}, d2 = {SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "", "TAG", "convertSecondsToMinutesStr", "seconds", "", "getMomentsIndicatorResIdByType", "typeId", "buildStyleItemList", "", "Lcom/xiaomi/fitness/detail/video/share/model/StyleItem;", "isMapStyle", "", "mockMomentModel", "Lcom/xiaomi/fitness/detail/video/share/model/MomentsModel;", "getRoundCorneredSquareThumbnailBitmap", "Landroid/graphics/Bitmap;", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "width", "height", "CORNER_TOP_LEFT", "CORNER_TOP_RIGHT", "CORNER_BOTTOM_LEFT", "CORNER_BOTTOM_RIGHT", "CORNER_ALL", "toRoundCorner", "roundCornerRadius", "corners", "toRoundRectBitmap", "radius", "updateImageUrisToAdd", "", "mapLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;", "progressLiveData", "imagesToAdd", "updateFeelingsText", "feelingsText", "isEmptyMarkPoint", "dataModel", "getTracePointDataModelByProgressValue", "getAllPicCountInMap", "mockWonderfulModelMap", "addWonderfulMoment", "curtProgress", "momentModel", "isValidDataModel", "hasOnlyTextOrPic", "hasOnlyWonderfulMoments", "updateMarkersOnPreviewSection", "data", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/share/amap/SharePathVideoAmapActivity;", "curtProgressLiveData", "traceStyleResModeLiveData", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "updateSelectStatus", "selected", "unselectAllIndicators", "getBitmapFromUri", "getThumbnailBitmap", MediaStoreUtil.MediaInfo.SIZE, "getPowerOfTwoForSampleRatio", "ratio", "", "getBitmapThumbnailWithOriginalRatio", "bm", "newWidth", "newHeight", "calculateInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "decodeSampledBitmapFromUri", "cropSquareFromBitmap", "shortAnimationDuration", "fadeInFadeOut", "inView", "Landroid/view/View;", "outView0", "outView1", "shareVideo", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "shareVideoWithUri", "videoUri", "shareVideoByShareSheet", "title", "filePath", "convertUriAboveN", "intent", "Landroid/content/Intent;", "originalUri", "getRationOfHeightBasedOnWidthFromUri", SportRecordBundleKey.BUNDLE_PARAM_URI, "getFileSizeInMBInBytes", "", "imgUri", "isImgSizeValid", "fileSizeInBytes", "checkIfAnImgTypeIsSupported", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportTraceVideoShareUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportTraceVideoShareUtil.kt\ncom/xiaomi/fitness/detail/video/share/util/SportTraceVideoShareUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,723:1\n1863#2,2:724\n1#3:726\n*S KotlinDebug\n*F\n+ 1 SportTraceVideoShareUtil.kt\ncom/xiaomi/fitness/detail/video/share/util/SportTraceVideoShareUtilKt\n*L\n353#1:724,2\n*E\n"})
public final class SportTraceVideoShareUtilKt {
    public static final int CORNER_ALL = 15;
    public static final int CORNER_BOTTOM_LEFT = 4;
    public static final int CORNER_BOTTOM_RIGHT = 8;
    public static final int CORNER_TOP_LEFT = 1;
    public static final int CORNER_TOP_RIGHT = 2;

    @NotNull
    public static final String SPORT_TRACE_TAG = "SPORT_TRACE_TAG";

    @NotNull
    public static final String TAG = "SportTraceVideoShareUtil";
    private static int shortAnimationDuration = ApplicationExtKt.getApplication().getResources().getInteger(R.integer.config_shortAnimTime);

    public static final void addWonderfulMoment(@NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> mapLiveData, float f, @NotNull MomentsModel momentModel) {
        Intrinsics.checkNotNullParameter(mapLiveData, "mapLiveData");
        Intrinsics.checkNotNullParameter(momentModel, "momentModel");
        Map<Float, SportTracePointDataModel> value = mapLiveData.getValue();
        if (value == null) {
            value = new LinkedHashMap<>();
        }
        SportTracePointDataModel sportTracePointDataModel = value.get(Float.valueOf(f));
        if (sportTracePointDataModel == null) {
            sportTracePointDataModel = new SportTracePointDataModel(false, null, null, null, 15, null);
        }
        List<MomentsModel> momentsModelList = sportTracePointDataModel.getMomentsModelList();
        List<MomentsModel> list = momentsModelList;
        if (list == null || list.isEmpty()) {
            momentsModelList = new ArrayList<>();
        }
        ListExtKt.add(momentsModelList, momentModel);
        sportTracePointDataModel.setMomentsModelList(momentsModelList);
        value.put(Float.valueOf(f), sportTracePointDataModel);
        mapLiveData.setValue(value);
    }

    @NotNull
    public static final List<StyleItem> buildStyleItemList(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            StyleItem styleItem = new StyleItem(ResourceExtKt.getString(j1j.C1), "", hoi.I1, 0, "");
            StyleItem styleItem2 = new StyleItem(ResourceExtKt.getString(j1j.y1), SportTraceConstants.MAP_STYLE_RES_ID_BIAOZHUN, hoi.J1, 0, SportTraceConstants.MAP_STYLE_NAME_BIAOZHUN);
            StyleItem styleItem3 = new StyleItem(ResourceExtKt.getString(j1j.z1), SportTraceConstants.MAP_STYLE_RES_ID_BINGHAI, hoi.F1, 1, SportTraceConstants.MAP_STYLE_NAME_BINGHAI);
            StyleItem styleItem4 = new StyleItem(ResourceExtKt.getString(j1j.E1), SportTraceConstants.MAP_STYLE_RES_ID_YELAN, hoi.L1, 2, SportTraceConstants.MAP_STYLE_NAME_YELAN);
            StyleItem styleItem5 = new StyleItem(ResourceExtKt.getString(j1j.A1), SportTraceConstants.MAP_STYLE_RES_ID_MINGHUANG, hoi.G1, 3, SportTraceConstants.MAP_STYLE_NAME_MINGHUANG);
            StyleItem styleItem6 = new StyleItem(ResourceExtKt.getString(j1j.B1), "a5da16961586e01813ec1b9fb845ef55", hoi.H1, 4, SportTraceConstants.MAP_STYLE_NAME_MOHEI);
            StyleItem styleItem7 = new StyleItem(ResourceExtKt.getString(j1j.F1), SportTraceConstants.MAP_STYLE_RES_ID_YEUHUA, hoi.M1, 5, SportTraceConstants.MAP_STYLE_NAME_YUEHUA);
            StyleItem styleItem8 = new StyleItem(ResourceExtKt.getString(j1j.D1), SportTraceConstants.MAP_STYLE_RES_ID_WUAI, hoi.K1, 6, SportTraceConstants.MAP_STYLE_NAME_WUAI);
            arrayList.add(styleItem);
            arrayList.add(styleItem2);
            arrayList.add(styleItem3);
            arrayList.add(styleItem4);
            arrayList.add(styleItem5);
            arrayList.add(styleItem6);
            arrayList.add(styleItem7);
            arrayList.add(styleItem8);
        } else {
            StyleItem styleItem9 = new StyleItem(ResourceExtKt.getString(j1j.ra), "", hoi.j2, 0, "");
            StyleItem styleItem10 = new StyleItem(ResourceExtKt.getString(j1j.ta), "", hoi.l2, 1, "");
            StyleItem styleItem11 = new StyleItem(ResourceExtKt.getString(j1j.sa), "", hoi.k2, 2, "");
            StyleItem styleItem12 = new StyleItem(ResourceExtKt.getString(j1j.wa), "", hoi.o2, 3, "");
            StyleItem styleItem13 = new StyleItem(ResourceExtKt.getString(j1j.ua), "", hoi.m2, 4, "");
            StyleItem styleItem14 = new StyleItem(ResourceExtKt.getString(j1j.va), "", hoi.n2, 5, "");
            StyleItem styleItem15 = new StyleItem(ResourceExtKt.getString(j1j.xa), "", hoi.p2, 6, "");
            arrayList.add(styleItem9);
            arrayList.add(styleItem10);
            arrayList.add(styleItem11);
            arrayList.add(styleItem12);
            arrayList.add(styleItem13);
            arrayList.add(styleItem14);
            arrayList.add(styleItem15);
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    public static final int calculateInSampleSize(@NotNull BitmapFactory.Options options, int i, int i2) {
        Intrinsics.checkNotNullParameter(options, "options");
        Pair pair = TuplesKt.to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        int i3 = 1;
        if (iIntValue > i2 || iIntValue2 > i) {
            int i4 = iIntValue / 2;
            int i5 = iIntValue2 / 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 *= 2;
            }
        }
        return i3;
    }

    public static final boolean checkIfAnImgTypeIsSupported(@NotNull Uri imgUri) {
        Intrinsics.checkNotNullParameter(imgUri, "imgUri");
        Bitmap bitmapFromUri = getBitmapFromUri(imgUri);
        int width = bitmapFromUri != null ? bitmapFromUri.getWidth() : 0;
        int height = bitmapFromUri != null ? bitmapFromUri.getHeight() : 0;
        Logger.d(TAG, "checkIfAnImgTypeIsSupported bitmapWidth=" + width + " bitmapHeight=" + height);
        return width > 0 && height > 0;
    }

    @NotNull
    public static final String convertSecondsToMinutesStr(int i) {
        int i2 = i / 60;
        return i2 + "'" + (i - (i2 * 60)) + "''";
    }

    private static final Uri convertUriAboveN(Context context, Intent intent, Uri uri) {
        String path = uri.getPath();
        if (path == null || StringsKt__StringsKt.isBlank(path)) {
            return null;
        }
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", new File(path));
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
        }
        return uriForFile;
    }

    @NotNull
    public static final Bitmap cropSquareFromBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMin = Math.min(width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (width - iMin) / 2, (height - iMin) / 2, iMin, iMin);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Nullable
    public static final Bitmap decodeSampledBitmapFromUri(@NotNull Uri uri, int i, int i2) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        InputStream inputStreamOpenInputStream = ApplicationExtKt.getApplication().getContentResolver().openInputStream(uri);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
    }

    public static final void fadeInFadeOut(@NotNull View inView, @NotNull View outView0, @NotNull View outView1) {
        Intrinsics.checkNotNullParameter(inView, "inView");
        Intrinsics.checkNotNullParameter(outView0, "outView0");
        Intrinsics.checkNotNullParameter(outView1, "outView1");
        inView.setVisibility(0);
        outView0.setVisibility(8);
        outView1.setVisibility(8);
    }

    public static final int getAllPicCountInMap(@NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> mapLiveData) {
        Intrinsics.checkNotNullParameter(mapLiveData, "mapLiveData");
        Map<Float, SportTracePointDataModel> value = mapLiveData.getValue();
        if (value == null) {
            return 0;
        }
        Iterator<T> it = value.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            List<Uri> imgUriList = ((SportTracePointDataModel) it.next()).getImgUriList();
            size += imgUriList != null ? imgUriList.size() : 0;
        }
        return size;
    }

    @Nullable
    public static final Bitmap getBitmapFromUri(@NotNull Uri uri) {
        Bitmap bitmapDecodeBitmap;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        try {
            if (Build.VERSION.SDK_INT < 28) {
                bitmapDecodeBitmap = MediaStore.Images.Media.getBitmap(ApplicationExtKt.getApplication().getContentResolver(), uri);
            } else {
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(ApplicationExtKt.getApplication().getContentResolver(), uri);
                Intrinsics.checkNotNullExpressionValue(sourceCreateSource, "createSource(...)");
                bitmapDecodeBitmap = ImageDecoder.decodeBitmap(sourceCreateSource);
            }
            return bitmapDecodeBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public static final Bitmap getBitmapThumbnailWithOriginalRatio(@NotNull Bitmap bm, int i, int i2) {
        Intrinsics.checkNotNullParameter(bm, "bm");
        int width = bm.getWidth();
        int height = bm.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bm, 0, 0, width, height, matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static final long getFileSizeInMBInBytes(@NotNull Uri imgUri) {
        Intrinsics.checkNotNullParameter(imgUri, "imgUri");
        Cursor cursorQuery = ApplicationExtKt.getApplication().getContentResolver().query(imgUri, null, null, null);
        if (cursorQuery == null) {
            return 0L;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            int columnIndex = cursor2.getColumnIndex("_size");
            cursor2.moveToFirst();
            long j = cursor2.getLong(columnIndex);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cursor, null);
            return j;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor, th);
                throw th2;
            }
        }
    }

    public static final int getMomentsIndicatorResIdByType(int i) {
        if (i == 0) {
            return hoi.R;
        }
        if (i != 1) {
            return i != 2 ? hoi.R : hoi.S;
        }
        return hoi.Q;
    }

    private static final int getPowerOfTwoForSampleRatio(double d) {
        int iHighestOneBit = Integer.highestOneBit((int) Math.floor(d));
        if (iHighestOneBit == 0) {
            return 1;
        }
        return iHighestOneBit;
    }

    public static final float getRationOfHeightBasedOnWidthFromUri(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeStream(ApplicationExtKt.getApplication().getContentResolver().openInputStream(uri), null, options);
        } catch (Exception e) {
            Logger.i(TAG, "getRationOfHeightBasedOnWidthFromUri e=" + e);
        }
        int i = options.outWidth;
        if (i == 0) {
            return -1.0f;
        }
        return options.outHeight / i;
    }

    @Nullable
    public static final Bitmap getRoundCorneredSquareThumbnailBitmap(@NotNull Uri uri, @NotNull Context context, int i, int i2) {
        Bitmap bitmapCropSquareFromBitmap;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Bitmap thumbnailBitmap = Build.VERSION.SDK_INT < 29 ? getThumbnailBitmap(uri, context, i) : context.getContentResolver().loadThumbnail(uri, new Size(i, i2), null);
        if (thumbnailBitmap == null || (bitmapCropSquareFromBitmap = cropSquareFromBitmap(thumbnailBitmap)) == null) {
            return null;
        }
        return toRoundCorner(bitmapCropSquareFromBitmap, 8, 15);
    }

    @Nullable
    public static final Bitmap getThumbnailBitmap(@NotNull Uri uri, @NotNull Context context, int i) throws IOException {
        int i2;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        options.inPreferredConfig = config;
        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        int i3 = options.outWidth;
        if (i3 == -1 || (i2 = options.outHeight) == -1) {
            return null;
        }
        if (i2 > i3) {
            i3 = i2;
        }
        double d = i3 > i ? i3 / i : 1.0d;
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = getPowerOfTwoForSampleRatio(d);
        options2.inDither = true;
        options2.inPreferredConfig = config;
        InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options2);
        if (inputStreamOpenInputStream2 != null) {
            inputStreamOpenInputStream2.close();
        }
        return bitmapDecodeStream;
    }

    @Nullable
    public static final SportTracePointDataModel getTracePointDataModelByProgressValue(@NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> mapLiveData, @NotNull MutableLiveData<Float> progressLiveData) {
        Intrinsics.checkNotNullParameter(mapLiveData, "mapLiveData");
        Intrinsics.checkNotNullParameter(progressLiveData, "progressLiveData");
        Map<Float, SportTracePointDataModel> value = mapLiveData.getValue();
        Float value2 = progressLiveData.getValue();
        if (value != null) {
            return value.get(value2);
        }
        return null;
    }

    public static final boolean hasOnlyTextOrPic(@Nullable SportTracePointDataModel sportTracePointDataModel) {
        String feelings;
        if (sportTracePointDataModel == null) {
            return false;
        }
        List<Uri> imgUriList = sportTracePointDataModel.getImgUriList();
        boolean z = ((imgUriList == null || imgUriList.isEmpty()) && ((feelings = sportTracePointDataModel.getFeelings()) == null || StringsKt__StringsKt.isBlank(feelings))) ? false : true;
        List<MomentsModel> momentsModelList = sportTracePointDataModel.getMomentsModelList();
        return (momentsModelList == null || momentsModelList.isEmpty()) && z;
    }

    public static final boolean hasOnlyWonderfulMoments(@Nullable SportTracePointDataModel sportTracePointDataModel) {
        String feelings;
        if (sportTracePointDataModel == null) {
            return false;
        }
        List<Uri> imgUriList = sportTracePointDataModel.getImgUriList();
        boolean z = (imgUriList == null || imgUriList.isEmpty()) && ((feelings = sportTracePointDataModel.getFeelings()) == null || StringsKt__StringsKt.isBlank(feelings));
        List<MomentsModel> momentsModelList = sportTracePointDataModel.getMomentsModelList();
        return (momentsModelList == null || momentsModelList.isEmpty() || !z) ? false : true;
    }

    private static final boolean isEmptyMarkPoint(SportTracePointDataModel sportTracePointDataModel) {
        String feelings;
        List<MomentsModel> momentsModelList;
        List<Uri> imgUriList = sportTracePointDataModel.getImgUriList();
        return (imgUriList == null || imgUriList.isEmpty()) && ((feelings = sportTracePointDataModel.getFeelings()) == null || StringsKt__StringsKt.isBlank(feelings)) && ((momentsModelList = sportTracePointDataModel.getMomentsModelList()) == null || momentsModelList.isEmpty());
    }

    public static final boolean isImgSizeValid(long j) {
        return ((float) j) / 1048576.0f < 20.0f && j != 0;
    }

    public static final boolean isValidDataModel(@Nullable SportTracePointDataModel sportTracePointDataModel) {
        String feelings;
        List<MomentsModel> momentsModelList;
        boolean z = false;
        if (sportTracePointDataModel == null) {
            return false;
        }
        List<Uri> imgUriList = sportTracePointDataModel.getImgUriList();
        if ((imgUriList == null || imgUriList.isEmpty()) && (((feelings = sportTracePointDataModel.getFeelings()) == null || StringsKt__StringsKt.isBlank(feelings)) && ((momentsModelList = sportTracePointDataModel.getMomentsModelList()) == null || momentsModelList.isEmpty()))) {
            z = true;
        }
        return !z;
    }

    @NotNull
    public static final List<MomentsModel> mockMomentModel() {
        MomentsModel momentsModel = new MomentsModel(0, 150.0f);
        MomentsModel momentsModel2 = new MomentsModel(2, 20.0f);
        MomentsModel momentsModel3 = new MomentsModel(1, 500.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(momentsModel);
        arrayList.add(momentsModel2);
        arrayList.add(momentsModel3);
        return arrayList;
    }

    @NotNull
    public static final Map<Float, MomentsModel> mockWonderfulModelMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Float.valueOf(23.56f), new MomentsModel(0, 160.0f));
        linkedHashMap.put(Float.valueOf(60.7f), new MomentsModel(1, 160.0f));
        linkedHashMap.put(Float.valueOf(86.7f), new MomentsModel(2, 20.0f));
        return linkedHashMap;
    }

    public static final void shareVideo(@NotNull final BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent data = new Intent("android.intent.action.PICK").setData(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        activity.startForActivityResult(data, new Function2() { // from class: y4o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SportTraceVideoShareUtilKt.shareVideo$lambda$5(activity, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareVideo$lambda$5(BaseActivity activity, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Logger.d(TAG, "shareVideo pickVideoIntent receive intent=" + (intent == null ? AbstractJsonLexerKt.NULL : intent));
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            return Unit.INSTANCE;
        }
        shareVideoWithUri(data, activity);
        return Unit.INSTANCE;
    }

    public static final void shareVideoByShareSheet(@NotNull String title, @NotNull String filePath, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(context, "context");
        if (TextUtils.isEmpty(filePath)) {
            return;
        }
        File file = new File(filePath);
        if (file.exists()) {
            Intent intent = new Intent("android.intent.action.SEND");
            Uri uriFromFile = Uri.fromFile(file);
            Intrinsics.checkNotNull(uriFromFile);
            Uri uriConvertUriAboveN = convertUriAboveN(context, intent, uriFromFile);
            if (uriConvertUriAboveN == null) {
                ToastExtKt.toastShort(context, j1j.K);
            } else {
                shareVideoWithUri(uriConvertUriAboveN, context);
            }
        }
    }

    public static final void shareVideoWithUri(@NotNull Uri videoUri, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", videoUri);
        intent.setType("video/*");
        context.startActivity(intent);
    }

    @Nullable
    public static final Bitmap toRoundCorner(@NotNull Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f = i;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        int i3 = i2 ^ 15;
        if ((i3 & 1) != 0) {
            canvas.drawRect(0.0f, 0.0f, f, f, paint);
        }
        if ((i3 & 2) != 0) {
            float f2 = rectF.right;
            canvas.drawRect(f2 - f, 0.0f, f2, f, paint);
        }
        if ((i3 & 4) != 0) {
            float f3 = rectF.bottom;
            canvas.drawRect(0.0f, f3 - f, f, f3, paint);
        }
        if ((i3 & 8) != 0) {
            float f4 = rectF.right;
            float f5 = rectF.bottom;
            canvas.drawRect(f4 - f, f5 - f, f4, f5, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap.copy(config, false), rect, rect, paint);
        return bitmapCreateBitmap;
    }

    @NotNull
    public static final Bitmap toRoundRectBitmap(@NotNull Bitmap bitmap, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        RectF rectF = new RectF(0.0f, 0.0f, i2, i3);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Canvas canvas = new Canvas(bitmap.copy(config, true));
        paint.setXfermode(null);
        float f = i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Bitmap bitmapCopy = bitmap.copy(config, false);
        Intrinsics.checkNotNullExpressionValue(bitmapCopy, "copy(...)");
        canvas.drawBitmap(bitmapCopy, (Rect) null, rectF, paint);
        return bitmap;
    }

    public static final void unselectAllIndicators(@NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> mapLiveData, @NotNull MutableLiveData<Float> progressLiveData) {
        Map<Float, SportTracePointDataModel> value;
        Intrinsics.checkNotNullParameter(mapLiveData, "mapLiveData");
        Intrinsics.checkNotNullParameter(progressLiveData, "progressLiveData");
        if (progressLiveData.getValue() == null || (value = mapLiveData.getValue()) == null) {
            return;
        }
        Iterator<Float> it = value.keySet().iterator();
        while (it.hasNext()) {
            SportTracePointDataModel sportTracePointDataModel = value.get(Float.valueOf(it.next().floatValue()));
            if (sportTracePointDataModel != null) {
                sportTracePointDataModel.setSelected(false);
            }
        }
        mapLiveData.setValue(value);
    }

    public static final void updateFeelingsText(@NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> mapLiveData, @NotNull MutableLiveData<Float> progressLiveData, @Nullable String str) {
        Intrinsics.checkNotNullParameter(mapLiveData, "mapLiveData");
        Intrinsics.checkNotNullParameter(progressLiveData, "progressLiveData");
        Float value = progressLiveData.getValue();
        if (value != null) {
            Map<Float, SportTracePointDataModel> value2 = mapLiveData.getValue();
            if (value2 == null) {
                value2 = new LinkedHashMap<>();
            }
            SportTracePointDataModel sportTracePointDataModel = value2.get(value);
            if (sportTracePointDataModel == null) {
                sportTracePointDataModel = new SportTracePointDataModel(false, null, null, null, 15, null);
            }
            sportTracePointDataModel.setFeelings(str);
            if (isEmptyMarkPoint(sportTracePointDataModel)) {
                value2.remove(value);
            } else {
                value2.put(value, sportTracePointDataModel);
            }
            mapLiveData.setValue(value2);
        }
    }

    public static /* synthetic */ void updateFeelingsText$default(MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        updateFeelingsText(mutableLiveData, mutableLiveData2, str);
    }

    public static final void updateImageUrisToAdd(@NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> mapLiveData, @NotNull MutableLiveData<Float> progressLiveData, @Nullable List<? extends Uri> list) {
        List<? extends Uri> arrayList;
        Intrinsics.checkNotNullParameter(mapLiveData, "mapLiveData");
        Intrinsics.checkNotNullParameter(progressLiveData, "progressLiveData");
        Float value = progressLiveData.getValue();
        if (value != null) {
            Map<Float, SportTracePointDataModel> value2 = mapLiveData.getValue();
            if (value2 == null) {
                value2 = new LinkedHashMap<>();
            }
            if (progressLiveData.getValue() != null) {
                SportTracePointDataModel sportTracePointDataModel = value2.get(value);
                if (sportTracePointDataModel == null) {
                    sportTracePointDataModel = new SportTracePointDataModel(false, null, null, null, 15, null);
                }
                List<Uri> imgUriList = sportTracePointDataModel.getImgUriList();
                if (imgUriList == null || (arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) imgUriList)) == null) {
                    arrayList = new ArrayList<>();
                }
                Logger.d(TAG, "updateMutableMapLiveData imgList=" + arrayList + " before added");
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                }
                List<? extends Uri> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    arrayList.addAll(list2);
                }
                Logger.d(TAG, "updateMutableMapLiveData imgList=" + arrayList + " after added");
                sportTracePointDataModel.setImgUriList(arrayList);
                if (isEmptyMarkPoint(sportTracePointDataModel)) {
                    value2.remove(value);
                } else {
                    value2.put(value, sportTracePointDataModel);
                }
                mapLiveData.setValue(value2);
            }
        }
    }

    public static /* synthetic */ void updateImageUrisToAdd$default(MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        updateImageUrisToAdd(mutableLiveData, mutableLiveData2, list);
    }

    public static final void updateMarkersOnPreviewSection(@Nullable SportTracePointDataModel sportTracePointDataModel, @NotNull SharePathVideoAmapActivity activity, @NotNull MutableLiveData<Float> curtProgressLiveData, @NotNull MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(curtProgressLiveData, "curtProgressLiveData");
        Intrinsics.checkNotNullParameter(traceStyleResModeLiveData, "traceStyleResModeLiveData");
        SharePathViewAmapActivityExtKt.addPicMarker(activity, sportTracePointDataModel, curtProgressLiveData.getValue());
    }

    public static final void updateSelectStatus(@NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> mapLiveData, @NotNull MutableLiveData<Float> progressLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(mapLiveData, "mapLiveData");
        Intrinsics.checkNotNullParameter(progressLiveData, "progressLiveData");
        Float value = progressLiveData.getValue();
        if (value != null) {
            float fFloatValue = value.floatValue();
            Map<Float, SportTracePointDataModel> value2 = mapLiveData.getValue();
            if (value2 == null) {
                return;
            }
            Iterator<Float> it = value2.keySet().iterator();
            while (it.hasNext()) {
                float fFloatValue2 = it.next().floatValue();
                SportTracePointDataModel sportTracePointDataModel = value2.get(Float.valueOf(fFloatValue2));
                if (z) {
                    if (sportTracePointDataModel != null) {
                        sportTracePointDataModel.setSelected(fFloatValue2 == fFloatValue);
                    }
                } else if (sportTracePointDataModel != null) {
                    sportTracePointDataModel.setSelected(false);
                }
            }
            mapLiveData.setValue(value2);
        }
    }

    public static /* synthetic */ void updateSelectStatus$default(MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        updateSelectStatus(mutableLiveData, mutableLiveData2, z);
    }
}
